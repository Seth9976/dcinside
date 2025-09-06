package okhttp3;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.V;
import kotlin.c0;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.text.v;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import y4.l;
import y4.m;
import z3.i;
import z3.j;

@s0({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1864#2,3:299\n*S KotlinDebug\n*F\n+ 1 Request.kt\nokhttp3/Request\n*L\n119#1:299,3\n*E\n"})
public final class Request {
    @s0({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
    public static class Builder {
        @m
        private RequestBody body;
        @l
        private okhttp3.Headers.Builder headers;
        @l
        private String method;
        @l
        private Map tags;
        @m
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new okhttp3.Headers.Builder();
        }

        public Builder(@l Request request0) {
            L.p(request0, "request");
            super();
            this.tags = new LinkedHashMap();
            this.url = request0.url();
            this.method = request0.method();
            this.body = request0.body();
            Map map0 = request0.getTags$okhttp().isEmpty() ? new LinkedHashMap() : Y.J0(request0.getTags$okhttp());
            this.tags = map0;
            this.headers = request0.headers().newBuilder();
        }

        @l
        public Builder addHeader(@l String s, @l String s1) {
            L.p(s, "name");
            L.p(s1, "value");
            this.headers.add(s, s1);
            return this;
        }

        @l
        public Request build() {
            HttpUrl httpUrl0 = this.url;
            if(httpUrl0 == null) {
                throw new IllegalStateException("url == null");
            }
            return new Request(httpUrl0, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
        }

        @l
        public Builder cacheControl(@l CacheControl cacheControl0) {
            L.p(cacheControl0, "cacheControl");
            String s = cacheControl0.toString();
            return s.length() == 0 ? this.removeHeader("Cache-Control") : this.header("Cache-Control", s);
        }

        @l
        @j
        public final Builder delete() {
            return Builder.delete$default(this, null, 1, null);
        }

        @l
        @j
        public Builder delete(@m RequestBody requestBody0) {
            return this.method("DELETE", requestBody0);
        }

        public static Builder delete$default(Builder request$Builder0, RequestBody requestBody0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if((v & 1) != 0) {
                requestBody0 = Util.EMPTY_REQUEST;
            }
            return request$Builder0.delete(requestBody0);
        }

        @l
        public Builder get() {
            return this.method("GET", null);
        }

        @m
        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        @l
        public final okhttp3.Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @l
        public final String getMethod$okhttp() {
            return this.method;
        }

        @l
        public final Map getTags$okhttp() {
            return this.tags;
        }

        @m
        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        @l
        public Builder head() {
            return this.method("HEAD", null);
        }

        @l
        public Builder header(@l String s, @l String s1) {
            L.p(s, "name");
            L.p(s1, "value");
            this.headers.set(s, s1);
            return this;
        }

        @l
        public Builder headers(@l Headers headers0) {
            L.p(headers0, "headers");
            this.headers = headers0.newBuilder();
            return this;
        }

        @l
        public Builder method(@l String s, @m RequestBody requestBody0) {
            L.p(s, "method");
            if(s.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if(requestBody0 == null) {
                if(HttpMethod.requiresRequestBody(s)) {
                    throw new IllegalArgumentException(("method " + s + " must have a request body.").toString());
                }
            }
            else if(!HttpMethod.permitsRequestBody(s)) {
                throw new IllegalArgumentException(("method " + s + " must not have a request body.").toString());
            }
            this.method = s;
            this.body = requestBody0;
            return this;
        }

        @l
        public Builder patch(@l RequestBody requestBody0) {
            L.p(requestBody0, "body");
            return this.method("PATCH", requestBody0);
        }

        @l
        public Builder post(@l RequestBody requestBody0) {
            L.p(requestBody0, "body");
            return this.method("POST", requestBody0);
        }

        @l
        public Builder put(@l RequestBody requestBody0) {
            L.p(requestBody0, "body");
            return this.method("PUT", requestBody0);
        }

        @l
        public Builder removeHeader(@l String s) {
            L.p(s, "name");
            this.headers.removeAll(s);
            return this;
        }

        public final void setBody$okhttp(@m RequestBody requestBody0) {
            this.body = requestBody0;
        }

        public final void setHeaders$okhttp(@l okhttp3.Headers.Builder headers$Builder0) {
            L.p(headers$Builder0, "<set-?>");
            this.headers = headers$Builder0;
        }

        public final void setMethod$okhttp(@l String s) {
            L.p(s, "<set-?>");
            this.method = s;
        }

        public final void setTags$okhttp(@l Map map0) {
            L.p(map0, "<set-?>");
            this.tags = map0;
        }

        public final void setUrl$okhttp(@m HttpUrl httpUrl0) {
            this.url = httpUrl0;
        }

        @l
        public Builder tag(@l Class class0, @m Object object0) {
            L.p(class0, "type");
            if(object0 == null) {
                this.tags.remove(class0);
                return this;
            }
            if(this.tags.isEmpty()) {
                this.tags = new LinkedHashMap();
            }
            Map map0 = this.tags;
            Object object1 = class0.cast(object0);
            L.m(object1);
            map0.put(class0, object1);
            return this;
        }

        @l
        public Builder tag(@m Object object0) {
            return this.tag(Object.class, object0);
        }

        @l
        public Builder url(@l String s) {
            L.p(s, "url");
            if(v.t2(s, "ws:", true)) {
                String s1 = s.substring(3);
                L.o(s1, "this as java.lang.String).substring(startIndex)");
                return this.url(HttpUrl.Companion.get("http:" + s1));
            }
            if(v.t2(s, "wss:", true)) {
                String s2 = s.substring(4);
                L.o(s2, "this as java.lang.String).substring(startIndex)");
                s = "https:" + s2;
            }
            return this.url(HttpUrl.Companion.get(s));
        }

        @l
        public Builder url(@l URL uRL0) {
            L.p(uRL0, "url");
            String s = uRL0.toString();
            L.o(s, "url.toString()");
            return this.url(HttpUrl.Companion.get(s));
        }

        @l
        public Builder url(@l HttpUrl httpUrl0) {
            L.p(httpUrl0, "url");
            this.url = httpUrl0;
            return this;
        }
    }

    @m
    private final RequestBody body;
    @l
    private final Headers headers;
    @m
    private CacheControl lazyCacheControl;
    @l
    private final String method;
    @l
    private final Map tags;
    @l
    private final HttpUrl url;

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "body", imports = {}))
    @m
    @i(name = "-deprecated_body")
    public final RequestBody -deprecated_body() {
        return this.body;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "cacheControl", imports = {}))
    @l
    @i(name = "-deprecated_cacheControl")
    public final CacheControl -deprecated_cacheControl() {
        return this.cacheControl();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "headers", imports = {}))
    @l
    @i(name = "-deprecated_headers")
    public final Headers -deprecated_headers() {
        return this.headers;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "method", imports = {}))
    @l
    @i(name = "-deprecated_method")
    public final String -deprecated_method() {
        return this.method;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "url", imports = {}))
    @l
    @i(name = "-deprecated_url")
    public final HttpUrl -deprecated_url() {
        return this.url;
    }

    public Request(@l HttpUrl httpUrl0, @l String s, @l Headers headers0, @m RequestBody requestBody0, @l Map map0) {
        L.p(httpUrl0, "url");
        L.p(s, "method");
        L.p(headers0, "headers");
        L.p(map0, "tags");
        super();
        this.url = httpUrl0;
        this.method = s;
        this.headers = headers0;
        this.body = requestBody0;
        this.tags = map0;
    }

    @m
    @i(name = "body")
    public final RequestBody body() {
        return this.body;
    }

    @l
    @i(name = "cacheControl")
    public final CacheControl cacheControl() {
        CacheControl cacheControl0 = this.lazyCacheControl;
        if(cacheControl0 == null) {
            cacheControl0 = CacheControl.Companion.parse(this.headers);
            this.lazyCacheControl = cacheControl0;
        }
        return cacheControl0;
    }

    @l
    public final Map getTags$okhttp() {
        return this.tags;
    }

    @m
    public final String header(@l String s) {
        L.p(s, "name");
        return this.headers.get(s);
    }

    @l
    public final List headers(@l String s) {
        L.p(s, "name");
        return this.headers.values(s);
    }

    @l
    @i(name = "headers")
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    @l
    @i(name = "method")
    public final String method() {
        return this.method;
    }

    @l
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @m
    public final Object tag() {
        return this.tag(Object.class);
    }

    @m
    public final Object tag(@l Class class0) {
        L.p(class0, "type");
        return class0.cast(this.tags.get(class0));
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Request{method=");
        stringBuilder0.append(this.method);
        stringBuilder0.append(", url=");
        stringBuilder0.append(this.url);
        if(this.headers.size() != 0) {
            stringBuilder0.append(", headers=[");
            int v = 0;
            for(Object object0: this.headers) {
                if(v < 0) {
                    u.Z();
                }
                String s = (String)((V)object0).a();
                String s1 = (String)((V)object0).b();
                if(v > 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(s);
                stringBuilder0.append(':');
                stringBuilder0.append(s1);
                ++v;
            }
            stringBuilder0.append(']');
        }
        if(!this.tags.isEmpty()) {
            stringBuilder0.append(", tags=");
            stringBuilder0.append(this.tags);
        }
        stringBuilder0.append('}');
        String s2 = stringBuilder0.toString();
        L.o(s2, "StringBuilder().apply(builderAction).toString()");
        return s2;
    }

    @l
    @i(name = "url")
    public final HttpUrl url() {
        return this.url;
    }
}

