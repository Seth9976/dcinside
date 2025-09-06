package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response.Builder;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import y4.l;
import y4.m;

public final class CacheStrategy {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final boolean isCacheable(@l Response response0, @l Request request0) {
            L.p(response0, "response");
            L.p(request0, "request");
            switch(response0.code()) {
                case 302: 
                case 307: {
                    return Response.header$default(response0, "Expires", null, 2, null) != null || response0.cacheControl().maxAgeSeconds() != -1 || response0.cacheControl().isPublic() || response0.cacheControl().isPrivate() ? !response0.cacheControl().noStore() && !request0.cacheControl().noStore() : false;
                }
                case 200: 
                case 203: 
                case 204: 
                case 300: 
                case 301: 
                case 308: 
                case 404: 
                case 405: 
                case 410: 
                case 414: 
                case 501: {
                    return !response0.cacheControl().noStore() && !request0.cacheControl().noStore();
                }
                default: {
                    return false;
                }
            }
        }
    }

    public static final class Factory {
        private int ageSeconds;
        @m
        private final Response cacheResponse;
        @m
        private String etag;
        @m
        private Date expires;
        @m
        private Date lastModified;
        @m
        private String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;
        @l
        private final Request request;
        private long sentRequestMillis;
        @m
        private Date servedDate;
        @m
        private String servedDateString;

        public Factory(long v, @l Request request0, @m Response response0) {
            L.p(request0, "request");
            super();
            this.nowMillis = v;
            this.request = request0;
            this.cacheResponse = response0;
            this.ageSeconds = -1;
            if(response0 != null) {
                this.sentRequestMillis = response0.sentRequestAtMillis();
                this.receivedResponseMillis = response0.receivedResponseAtMillis();
                Headers headers0 = response0.headers();
                int v1 = headers0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    String s = headers0.name(v2);
                    String s1 = headers0.value(v2);
                    if(v.O1(s, "Date", true)) {
                        this.servedDate = DatesKt.toHttpDateOrNull(s1);
                        this.servedDateString = s1;
                    }
                    else if(v.O1(s, "Expires", true)) {
                        this.expires = DatesKt.toHttpDateOrNull(s1);
                    }
                    else if(v.O1(s, "Last-Modified", true)) {
                        this.lastModified = DatesKt.toHttpDateOrNull(s1);
                        this.lastModifiedString = s1;
                    }
                    else if(v.O1(s, "ETag", true)) {
                        this.etag = s1;
                    }
                    else if(v.O1(s, "Age", true)) {
                        this.ageSeconds = Util.toNonNegativeInt(s1, -1);
                    }
                }
            }
        }

        private final long cacheResponseAge() {
            long v = this.servedDate == null ? 0L : Math.max(0L, this.receivedResponseMillis - this.servedDate.getTime());
            int v1 = this.ageSeconds;
            if(v1 != -1) {
                v = Math.max(v, TimeUnit.SECONDS.toMillis(((long)v1)));
            }
            return v + (this.receivedResponseMillis - this.sentRequestMillis) + (this.nowMillis - this.receivedResponseMillis);
        }

        @l
        public final CacheStrategy compute() {
            CacheStrategy cacheStrategy0 = this.computeCandidate();
            return cacheStrategy0.getNetworkRequest() == null || !this.request.cacheControl().onlyIfCached() ? cacheStrategy0 : new CacheStrategy(null, null);
        }

        private final CacheStrategy computeCandidate() {
            String s1;
            if(this.cacheResponse == null) {
                return new CacheStrategy(this.request, null);
            }
            if(this.request.isHttps() && this.cacheResponse.handshake() == null) {
                return new CacheStrategy(this.request, null);
            }
            if(!CacheStrategy.Companion.isCacheable(this.cacheResponse, this.request)) {
                return new CacheStrategy(this.request, null);
            }
            CacheControl cacheControl0 = this.request.cacheControl();
            if(!cacheControl0.noCache() && !this.hasConditions(this.request)) {
                CacheControl cacheControl1 = this.cacheResponse.cacheControl();
                long v = this.cacheResponseAge();
                long v1 = this.computeFreshnessLifetime();
                if(cacheControl0.maxAgeSeconds() != -1) {
                    v1 = Math.min(v1, TimeUnit.SECONDS.toMillis(((long)cacheControl0.maxAgeSeconds())));
                }
                long v2 = 0L;
                long v3 = cacheControl0.minFreshSeconds() == -1 ? 0L : TimeUnit.SECONDS.toMillis(((long)cacheControl0.minFreshSeconds()));
                if(!cacheControl1.mustRevalidate() && cacheControl0.maxStaleSeconds() != -1) {
                    v2 = TimeUnit.SECONDS.toMillis(((long)cacheControl0.maxStaleSeconds()));
                }
                if(!cacheControl1.noCache()) {
                    long v4 = v3 + v;
                    if(v4 < v2 + v1) {
                        Builder response$Builder0 = this.cacheResponse.newBuilder();
                        if(v4 >= v1) {
                            response$Builder0.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if(v > 86400000L && this.isFreshnessLifetimeHeuristic()) {
                            response$Builder0.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new CacheStrategy(null, response$Builder0.build());
                    }
                }
                String s = this.etag;
                if(s == null) {
                    if(this.lastModified != null) {
                        s = this.lastModifiedString;
                    }
                    else if(this.servedDate != null) {
                        s = this.servedDateString;
                    }
                    else {
                        return new CacheStrategy(this.request, null);
                    }
                    s1 = "If-Modified-Since";
                }
                else {
                    s1 = "If-None-Match";
                }
                okhttp3.Headers.Builder headers$Builder0 = this.request.headers().newBuilder();
                L.m(s);
                headers$Builder0.addLenient$okhttp(s1, s);
                return new CacheStrategy(this.request.newBuilder().headers(headers$Builder0.build()).build(), this.cacheResponse);
            }
            return new CacheStrategy(this.request, null);
        }

        private final long computeFreshnessLifetime() {
            L.m(this.cacheResponse);
            CacheControl cacheControl0 = this.cacheResponse.cacheControl();
            if(cacheControl0.maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(((long)cacheControl0.maxAgeSeconds()));
            }
            Date date0 = this.expires;
            if(date0 != null) {
                long v = this.servedDate == null ? this.receivedResponseMillis : this.servedDate.getTime();
                long v1 = date0.getTime() - v;
                return v1 <= 0L ? 0L : v1;
            }
            if(this.lastModified != null && this.cacheResponse.request().url().query() == null) {
                long v2 = this.servedDate == null ? this.sentRequestMillis : this.servedDate.getTime();
                Date date1 = this.lastModified;
                L.m(date1);
                long v3 = v2 - date1.getTime();
                return v3 <= 0L ? 0L : v3 / 10L;
            }
            return 0L;
        }

        @l
        public final Request getRequest$okhttp() {
            return this.request;
        }

        private final boolean hasConditions(Request request0) {
            return request0.header("If-Modified-Since") != null || request0.header("If-None-Match") != null;
        }

        private final boolean isFreshnessLifetimeHeuristic() {
            L.m(this.cacheResponse);
            return this.cacheResponse.cacheControl().maxAgeSeconds() == -1 && this.expires == null;
        }
    }

    @l
    public static final Companion Companion;
    @m
    private final Response cacheResponse;
    @m
    private final Request networkRequest;

    static {
        CacheStrategy.Companion = new Companion(null);
    }

    public CacheStrategy(@m Request request0, @m Response response0) {
        this.networkRequest = request0;
        this.cacheResponse = response0;
    }

    @m
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    @m
    public final Request getNetworkRequest() {
        return this.networkRequest;
    }
}

