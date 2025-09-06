package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import okio.n;
import y4.l;
import y4.m;
import z3.i;
import z3.j;

@s0({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
public final class Response implements Closeable {
    @s0({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
    public static class Builder {
        @m
        private ResponseBody body;
        @m
        private Response cacheResponse;
        private int code;
        @m
        private Exchange exchange;
        @m
        private Handshake handshake;
        @l
        private okhttp3.Headers.Builder headers;
        @m
        private String message;
        @m
        private Response networkResponse;
        @m
        private Response priorResponse;
        @m
        private Protocol protocol;
        private long receivedResponseAtMillis;
        @m
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new okhttp3.Headers.Builder();
        }

        public Builder(@l Response response0) {
            L.p(response0, "response");
            super();
            this.code = -1;
            this.request = response0.request();
            this.protocol = response0.protocol();
            this.code = response0.code();
            this.message = response0.message();
            this.handshake = response0.handshake();
            this.headers = response0.headers().newBuilder();
            this.body = response0.body();
            this.networkResponse = response0.networkResponse();
            this.cacheResponse = response0.cacheResponse();
            this.priorResponse = response0.priorResponse();
            this.sentRequestAtMillis = response0.sentRequestAtMillis();
            this.receivedResponseAtMillis = response0.receivedResponseAtMillis();
            this.exchange = response0.exchange();
        }

        @l
        public Builder addHeader(@l String s, @l String s1) {
            L.p(s, "name");
            L.p(s1, "value");
            this.headers.add(s, s1);
            return this;
        }

        @l
        public Builder body(@m ResponseBody responseBody0) {
            this.body = responseBody0;
            return this;
        }

        @l
        public Response build() {
            int v = this.code;
            if(v < 0) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            Request request0 = this.request;
            if(request0 == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol0 = this.protocol;
            if(protocol0 == null) {
                throw new IllegalStateException("protocol == null");
            }
            String s = this.message;
            if(s == null) {
                throw new IllegalStateException("message == null");
            }
            return new Response(request0, protocol0, s, v, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
        }

        @l
        public Builder cacheResponse(@m Response response0) {
            this.checkSupportResponse("cacheResponse", response0);
            this.cacheResponse = response0;
            return this;
        }

        private final void checkPriorResponse(Response response0) {
            if(response0 != null && response0.body() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void checkSupportResponse(String s, Response response0) {
            if(response0 != null) {
                if(response0.body() != null) {
                    throw new IllegalArgumentException((s + ".body != null").toString());
                }
                if(response0.networkResponse() != null) {
                    throw new IllegalArgumentException((s + ".networkResponse != null").toString());
                }
                if(response0.cacheResponse() != null) {
                    throw new IllegalArgumentException((s + ".cacheResponse != null").toString());
                }
                if(response0.priorResponse() != null) {
                    throw new IllegalArgumentException((s + ".priorResponse != null").toString());
                }
            }
        }

        @l
        public Builder code(int v) {
            this.code = v;
            return this;
        }

        @m
        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        @m
        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        @m
        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        @m
        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        @l
        public final okhttp3.Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @m
        public final String getMessage$okhttp() {
            return this.message;
        }

        @m
        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        @m
        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        @m
        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        @m
        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        @l
        public Builder handshake(@m Handshake handshake0) {
            this.handshake = handshake0;
            return this;
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

        public final void initExchange$okhttp(@l Exchange exchange0) {
            L.p(exchange0, "deferredTrailers");
            this.exchange = exchange0;
        }

        @l
        public Builder message(@l String s) {
            L.p(s, "message");
            this.message = s;
            return this;
        }

        @l
        public Builder networkResponse(@m Response response0) {
            this.checkSupportResponse("networkResponse", response0);
            this.networkResponse = response0;
            return this;
        }

        @l
        public Builder priorResponse(@m Response response0) {
            this.checkPriorResponse(response0);
            this.priorResponse = response0;
            return this;
        }

        @l
        public Builder protocol(@l Protocol protocol0) {
            L.p(protocol0, "protocol");
            this.protocol = protocol0;
            return this;
        }

        @l
        public Builder receivedResponseAtMillis(long v) {
            this.receivedResponseAtMillis = v;
            return this;
        }

        @l
        public Builder removeHeader(@l String s) {
            L.p(s, "name");
            this.headers.removeAll(s);
            return this;
        }

        @l
        public Builder request(@l Request request0) {
            L.p(request0, "request");
            this.request = request0;
            return this;
        }

        @l
        public Builder sentRequestAtMillis(long v) {
            this.sentRequestAtMillis = v;
            return this;
        }

        public final void setBody$okhttp(@m ResponseBody responseBody0) {
            this.body = responseBody0;
        }

        public final void setCacheResponse$okhttp(@m Response response0) {
            this.cacheResponse = response0;
        }

        public final void setCode$okhttp(int v) {
            this.code = v;
        }

        public final void setExchange$okhttp(@m Exchange exchange0) {
            this.exchange = exchange0;
        }

        public final void setHandshake$okhttp(@m Handshake handshake0) {
            this.handshake = handshake0;
        }

        public final void setHeaders$okhttp(@l okhttp3.Headers.Builder headers$Builder0) {
            L.p(headers$Builder0, "<set-?>");
            this.headers = headers$Builder0;
        }

        public final void setMessage$okhttp(@m String s) {
            this.message = s;
        }

        public final void setNetworkResponse$okhttp(@m Response response0) {
            this.networkResponse = response0;
        }

        public final void setPriorResponse$okhttp(@m Response response0) {
            this.priorResponse = response0;
        }

        public final void setProtocol$okhttp(@m Protocol protocol0) {
            this.protocol = protocol0;
        }

        public final void setReceivedResponseAtMillis$okhttp(long v) {
            this.receivedResponseAtMillis = v;
        }

        public final void setRequest$okhttp(@m Request request0) {
            this.request = request0;
        }

        public final void setSentRequestAtMillis$okhttp(long v) {
            this.sentRequestAtMillis = v;
        }
    }

    @m
    private final ResponseBody body;
    @m
    private final Response cacheResponse;
    private final int code;
    @m
    private final Exchange exchange;
    @m
    private final Handshake handshake;
    @l
    private final Headers headers;
    @m
    private CacheControl lazyCacheControl;
    @l
    private final String message;
    @m
    private final Response networkResponse;
    @m
    private final Response priorResponse;
    @l
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    @l
    private final Request request;
    private final long sentRequestAtMillis;

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "body", imports = {}))
    @m
    @i(name = "-deprecated_body")
    public final ResponseBody -deprecated_body() {
        return this.body;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "cacheControl", imports = {}))
    @l
    @i(name = "-deprecated_cacheControl")
    public final CacheControl -deprecated_cacheControl() {
        return this.cacheControl();
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "cacheResponse", imports = {}))
    @m
    @i(name = "-deprecated_cacheResponse")
    public final Response -deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "code", imports = {}))
    @i(name = "-deprecated_code")
    public final int -deprecated_code() {
        return this.code;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "handshake", imports = {}))
    @m
    @i(name = "-deprecated_handshake")
    public final Handshake -deprecated_handshake() {
        return this.handshake;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "headers", imports = {}))
    @l
    @i(name = "-deprecated_headers")
    public final Headers -deprecated_headers() {
        return this.headers;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "message", imports = {}))
    @l
    @i(name = "-deprecated_message")
    public final String -deprecated_message() {
        return this.message;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "networkResponse", imports = {}))
    @m
    @i(name = "-deprecated_networkResponse")
    public final Response -deprecated_networkResponse() {
        return this.networkResponse;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "priorResponse", imports = {}))
    @m
    @i(name = "-deprecated_priorResponse")
    public final Response -deprecated_priorResponse() {
        return this.priorResponse;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "protocol", imports = {}))
    @l
    @i(name = "-deprecated_protocol")
    public final Protocol -deprecated_protocol() {
        return this.protocol;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "receivedResponseAtMillis", imports = {}))
    @i(name = "-deprecated_receivedResponseAtMillis")
    public final long -deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "request", imports = {}))
    @l
    @i(name = "-deprecated_request")
    public final Request -deprecated_request() {
        return this.request;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "sentRequestAtMillis", imports = {}))
    @i(name = "-deprecated_sentRequestAtMillis")
    public final long -deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public Response(@l Request request0, @l Protocol protocol0, @l String s, int v, @m Handshake handshake0, @l Headers headers0, @m ResponseBody responseBody0, @m Response response0, @m Response response1, @m Response response2, long v1, long v2, @m Exchange exchange0) {
        L.p(request0, "request");
        L.p(protocol0, "protocol");
        L.p(s, "message");
        L.p(headers0, "headers");
        super();
        this.request = request0;
        this.protocol = protocol0;
        this.message = s;
        this.code = v;
        this.handshake = handshake0;
        this.headers = headers0;
        this.body = responseBody0;
        this.networkResponse = response0;
        this.cacheResponse = response1;
        this.priorResponse = response2;
        this.sentRequestAtMillis = v1;
        this.receivedResponseAtMillis = v2;
        this.exchange = exchange0;
    }

    @m
    @i(name = "body")
    public final ResponseBody body() {
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

    @m
    @i(name = "cacheResponse")
    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    @l
    public final List challenges() {
        Headers headers0 = this.headers;
        switch(this.code) {
            case 401: {
                return HttpHeaders.parseChallenges(headers0, "WWW-Authenticate");
            }
            case 407: {
                return HttpHeaders.parseChallenges(headers0, "Proxy-Authenticate");
            }
            default: {
                return u.H();
            }
        }
    }

    @Override
    public void close() {
        ResponseBody responseBody0 = this.body;
        if(responseBody0 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody0.close();
    }

    @i(name = "code")
    public final int code() {
        return this.code;
    }

    @m
    @i(name = "exchange")
    public final Exchange exchange() {
        return this.exchange;
    }

    @m
    @i(name = "handshake")
    public final Handshake handshake() {
        return this.handshake;
    }

    @m
    @j
    public final String header(@l String s) {
        L.p(s, "name");
        return Response.header$default(this, s, null, 2, null);
    }

    @m
    @j
    public final String header(@l String s, @m String s1) {
        L.p(s, "name");
        String s2 = this.headers.get(s);
        return s2 == null ? s1 : s2;
    }

    public static String header$default(Response response0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        return response0.header(s, s1);
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

    public final boolean isRedirect() {
        return this.code == 307 || this.code == 308 || (this.code == 300 || this.code == 301 || this.code == 302 || this.code == 303);
    }

    public final boolean isSuccessful() {
        return 200 <= this.code && this.code < 300;
    }

    @l
    @i(name = "message")
    public final String message() {
        return this.message;
    }

    @m
    @i(name = "networkResponse")
    public final Response networkResponse() {
        return this.networkResponse;
    }

    @l
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @l
    public final ResponseBody peekBody(long v) throws IOException {
        L.m(this.body);
        n n0 = this.body.source().peek();
        okio.l l0 = new okio.l();
        n0.request(v);
        l0.J1(n0, Math.min(v, n0.E().size()));
        MediaType mediaType0 = this.body.contentType();
        return ResponseBody.Companion.create(l0, mediaType0, l0.size());
    }

    @m
    @i(name = "priorResponse")
    public final Response priorResponse() {
        return this.priorResponse;
    }

    @l
    @i(name = "protocol")
    public final Protocol protocol() {
        return this.protocol;
    }

    @i(name = "receivedResponseAtMillis")
    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @l
    @i(name = "request")
    public final Request request() {
        return this.request;
    }

    @i(name = "sentRequestAtMillis")
    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @Override
    @l
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    @l
    public final Headers trailers() throws IOException {
        Exchange exchange0 = this.exchange;
        if(exchange0 == null) {
            throw new IllegalStateException("trailers not available");
        }
        return exchange0.trailers();
    }
}

