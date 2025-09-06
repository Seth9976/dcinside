package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response.Builder;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.m0;
import okio.o0;
import y4.l;
import y4.m;

public final class Http2ExchangeCodec implements ExchangeCodec {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final List http2HeadersList(@l Request request0) {
            L.p(request0, "request");
            Headers headers0 = request0.headers();
            List list0 = new ArrayList(headers0.size() + 4);
            ((ArrayList)list0).add(new Header(Header.TARGET_METHOD, request0.method()));
            String s = RequestLine.INSTANCE.requestPath(request0.url());
            ((ArrayList)list0).add(new Header(Header.TARGET_PATH, s));
            String s1 = request0.header("Host");
            if(s1 != null) {
                ((ArrayList)list0).add(new Header(Header.TARGET_AUTHORITY, s1));
            }
            ((ArrayList)list0).add(new Header(Header.TARGET_SCHEME, request0.url().scheme()));
            int v = headers0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                String s2 = headers0.name(v1);
                Locale locale0 = Locale.US;
                L.o(locale0, "US");
                String s3 = s2.toLowerCase(locale0);
                L.o(s3, "this as java.lang.String).toLowerCase(locale)");
                if(!Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(s3) || L.g(s3, "te") && L.g(headers0.value(v1), "trailers")) {
                    ((ArrayList)list0).add(new Header(s3, headers0.value(v1)));
                }
            }
            return list0;
        }

        @l
        public final Builder readHttp2HeadersList(@l Headers headers0, @l Protocol protocol0) {
            L.p(headers0, "headerBlock");
            L.p(protocol0, "protocol");
            okhttp3.Headers.Builder headers$Builder0 = new okhttp3.Headers.Builder();
            int v = headers0.size();
            StatusLine statusLine0 = null;
            for(int v1 = 0; v1 < v; ++v1) {
                String s = headers0.name(v1);
                String s1 = headers0.value(v1);
                if(L.g(s, ":status")) {
                    statusLine0 = StatusLine.Companion.parse("HTTP/1.1 " + s1);
                }
                else if(!Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(s)) {
                    headers$Builder0.addLenient$okhttp(s, s1);
                }
            }
            if(statusLine0 == null) {
                throw new ProtocolException("Expected \':status\' header not present");
            }
            return new Builder().protocol(protocol0).code(statusLine0.code).message(statusLine0.message).headers(headers$Builder0.build());
        }
    }

    @l
    private static final String CONNECTION = "connection";
    @l
    public static final Companion Companion = null;
    @l
    private static final String ENCODING = "encoding";
    @l
    private static final String HOST = "host";
    @l
    private static final List HTTP_2_SKIPPED_REQUEST_HEADERS = null;
    @l
    private static final List HTTP_2_SKIPPED_RESPONSE_HEADERS = null;
    @l
    private static final String KEEP_ALIVE = "keep-alive";
    @l
    private static final String PROXY_CONNECTION = "proxy-connection";
    @l
    private static final String TE = "te";
    @l
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    @l
    private static final String UPGRADE = "upgrade";
    private volatile boolean canceled;
    @l
    private final RealInterceptorChain chain;
    @l
    private final RealConnection connection;
    @l
    private final Http2Connection http2Connection;
    @l
    private final Protocol protocol;
    @m
    private volatile Http2Stream stream;

    static {
        Http2ExchangeCodec.Companion = new Companion(null);
        Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
        Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    }

    public Http2ExchangeCodec(@l OkHttpClient okHttpClient0, @l RealConnection realConnection0, @l RealInterceptorChain realInterceptorChain0, @l Http2Connection http2Connection0) {
        L.p(okHttpClient0, "client");
        L.p(realConnection0, "connection");
        L.p(realInterceptorChain0, "chain");
        L.p(http2Connection0, "http2Connection");
        super();
        this.connection = realConnection0;
        this.chain = realInterceptorChain0;
        this.http2Connection = http2Connection0;
        this.protocol = okHttpClient0.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE) ? Protocol.H2_PRIOR_KNOWLEDGE : Protocol.HTTP_2;
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.canceled = true;
        Http2Stream http2Stream0 = this.stream;
        if(http2Stream0 != null) {
            http2Stream0.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @l
    public m0 createRequestBody(@l Request request0, long v) {
        L.p(request0, "request");
        Http2Stream http2Stream0 = this.stream;
        L.m(http2Stream0);
        return http2Stream0.getSink();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        Http2Stream http2Stream0 = this.stream;
        L.m(http2Stream0);
        http2Stream0.getSink().close();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.http2Connection.flush();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @l
    public RealConnection getConnection() {
        return this.connection;
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @l
    public o0 openResponseBodySource(@l Response response0) {
        L.p(response0, "response");
        Http2Stream http2Stream0 = this.stream;
        L.m(http2Stream0);
        return http2Stream0.getSource$okhttp();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @m
    public Builder readResponseHeaders(boolean z) {
        Http2Stream http2Stream0 = this.stream;
        if(http2Stream0 == null) {
            throw new IOException("stream wasn\'t created");
        }
        Headers headers0 = http2Stream0.takeHeaders();
        Builder response$Builder0 = Http2ExchangeCodec.Companion.readHttp2HeadersList(headers0, this.protocol);
        return !z || response$Builder0.getCode$okhttp() != 100 ? response$Builder0 : null;
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@l Response response0) {
        L.p(response0, "response");
        return HttpHeaders.promisesBody(response0) ? Util.headersContentLength(response0) : 0L;
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @l
    public Headers trailers() {
        Http2Stream http2Stream0 = this.stream;
        L.m(http2Stream0);
        return http2Stream0.trailers();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@l Request request0) {
        L.p(request0, "request");
        if(this.stream != null) {
            return;
        }
        List list0 = Http2ExchangeCodec.Companion.http2HeadersList(request0);
        this.stream = this.http2Connection.newStream(list0, request0.body() != null);
        if(!this.canceled) {
            Http2Stream http2Stream0 = this.stream;
            L.m(http2Stream0);
            TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
            http2Stream0.readTimeout().timeout(((long)this.chain.getReadTimeoutMillis$okhttp()), timeUnit0);
            Http2Stream http2Stream1 = this.stream;
            L.m(http2Stream1);
            http2Stream1.writeTimeout().timeout(((long)this.chain.getWriteTimeoutMillis$okhttp()), timeUnit0);
            return;
        }
        Http2Stream http2Stream2 = this.stream;
        L.m(http2Stream2);
        http2Stream2.closeLater(ErrorCode.CANCEL);
        throw new IOException("Canceled");
    }
}

