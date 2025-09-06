package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response.Builder;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.m0;
import okio.n;
import okio.o0;
import okio.q0;
import okio.z;
import y4.l;
import y4.m;

@s0({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
public final class Http1ExchangeCodec implements ExchangeCodec {
    abstract class AbstractSource implements o0 {
        private boolean closed;
        @l
        private final z timeout;

        public AbstractSource() {
            this.timeout = new z(http1ExchangeCodec0.source.timeout());
        }

        protected final boolean getClosed() {
            return this.closed;
        }

        @l
        protected final z getTimeout() {
            return this.timeout;
        }

        @Override  // okio.o0
        public long read(@l okio.l l0, long v) {
            L.p(l0, "sink");
            try {
                return Http1ExchangeCodec.this.source.read(l0, v);
            }
            catch(IOException iOException0) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                this.responseBodyComplete();
                throw iOException0;
            }
        }

        public final void responseBodyComplete() {
            switch(Http1ExchangeCodec.this.state) {
                case 5: {
                    Http1ExchangeCodec.this.detachTimeout(this.timeout);
                    Http1ExchangeCodec.this.state = 6;
                    return;
                }
                case 6: {
                    return;
                }
                default: {
                    throw new IllegalStateException("state: " + Http1ExchangeCodec.this.state);
                }
            }
        }

        protected final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override  // okio.o0
        @l
        public q0 timeout() {
            return this.timeout;
        }
    }

    @s0({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    final class ChunkedSink implements m0 {
        private boolean closed;
        @l
        private final z timeout;

        public ChunkedSink() {
            this.timeout = new z(http1ExchangeCodec0.sink.timeout());
        }

        @Override  // okio.m0
        public void close() {
            synchronized(this) {
                if(this.closed) {
                    return;
                }
                this.closed = true;
                Http1ExchangeCodec.this.sink.D2("0\r\n\r\n");
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 3;
            }
        }

        @Override  // okio.m0
        public void flush() {
            synchronized(this) {
                if(this.closed) {
                    return;
                }
                Http1ExchangeCodec.this.sink.flush();
            }
        }

        @Override  // okio.m0
        @l
        public q0 timeout() {
            return this.timeout;
        }

        @Override  // okio.m0
        public void write(@l okio.l l0, long v) {
            L.p(l0, "source");
            if(this.closed) {
                throw new IllegalStateException("closed");
            }
            if(v == 0L) {
                return;
            }
            Http1ExchangeCodec.this.sink.A1(v);
            Http1ExchangeCodec.this.sink.D2("\r\n");
            Http1ExchangeCodec.this.sink.write(l0, v);
            Http1ExchangeCodec.this.sink.D2("\r\n");
        }
    }

    @s0({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        @l
        private final HttpUrl url;

        public ChunkedSource(@l HttpUrl httpUrl0) {
            L.p(httpUrl0, "url");
            Http1ExchangeCodec.this = http1ExchangeCodec0;
            super();
            this.url = httpUrl0;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        @Override  // okio.o0
        public void close() {
            if(this.getClosed()) {
                return;
            }
            if(this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                this.responseBodyComplete();
            }
            this.setClosed(true);
        }

        @Override  // okhttp3.internal.http1.Http1ExchangeCodec$AbstractSource
        public long read(@l okio.l l0, long v) {
            L.p(l0, "sink");
            if(v < 0L) {
                throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
            }
            if(this.getClosed()) {
                throw new IllegalStateException("closed");
            }
            if(!this.hasMoreChunks) {
                return -1L;
            }
            if(this.bytesRemainingInChunk == 0L || this.bytesRemainingInChunk == -1L) {
                this.readChunkSize();
                if(!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long v1 = super.read(l0, Math.min(v, this.bytesRemainingInChunk));
            if(v1 != -1L) {
                this.bytesRemainingInChunk -= v1;
                return v1;
            }
            Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
            ProtocolException protocolException0 = new ProtocolException("unexpected end of stream");
            this.responseBodyComplete();
            throw protocolException0;
        }

        private final void readChunkSize() {
            if(this.bytesRemainingInChunk != -1L) {
                Http1ExchangeCodec.this.source.M2();
            }
            try {
                this.bytesRemainingInChunk = Http1ExchangeCodec.this.source.T1();
                String s = v.G5(Http1ExchangeCodec.this.source.M2()).toString();
                if(this.bytesRemainingInChunk < 0L || s.length() > 0 && !v.v2(s, ";", false, 2, null)) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + s + '\"');
                }
            }
            catch(NumberFormatException numberFormatException0) {
                throw new ProtocolException(numberFormatException0.getMessage());
            }
            if(this.bytesRemainingInChunk == 0L) {
                this.hasMoreChunks = false;
                Headers headers0 = Http1ExchangeCodec.this.headersReader.readHeaders();
                Http1ExchangeCodec.this.trailers = headers0;
                OkHttpClient okHttpClient0 = Http1ExchangeCodec.this.client;
                L.m(okHttpClient0);
                Headers headers1 = Http1ExchangeCodec.this.trailers;
                L.m(headers1);
                HttpHeaders.receiveHeaders(okHttpClient0.cookieJar(), this.url, headers1);
                this.responseBodyComplete();
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @s0({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long v) {
            this.bytesRemaining = v;
            if(v == 0L) {
                this.responseBodyComplete();
            }
        }

        @Override  // okio.o0
        public void close() {
            if(this.getClosed()) {
                return;
            }
            if(this.bytesRemaining != 0L && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                this.responseBodyComplete();
            }
            this.setClosed(true);
        }

        @Override  // okhttp3.internal.http1.Http1ExchangeCodec$AbstractSource
        public long read(@l okio.l l0, long v) {
            L.p(l0, "sink");
            if(v < 0L) {
                throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
            }
            if(this.getClosed()) {
                throw new IllegalStateException("closed");
            }
            long v1 = this.bytesRemaining;
            if(v1 == 0L) {
                return -1L;
            }
            long v2 = super.read(l0, Math.min(v1, v));
            if(v2 != -1L) {
                long v3 = this.bytesRemaining - v2;
                this.bytesRemaining = v3;
                if(v3 == 0L) {
                    this.responseBodyComplete();
                }
                return v2;
            }
            Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
            ProtocolException protocolException0 = new ProtocolException("unexpected end of stream");
            this.responseBodyComplete();
            throw protocolException0;
        }
    }

    @s0({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    final class KnownLengthSink implements m0 {
        private boolean closed;
        @l
        private final z timeout;

        public KnownLengthSink() {
            this.timeout = new z(http1ExchangeCodec0.sink.timeout());
        }

        @Override  // okio.m0
        public void close() {
            if(this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override  // okio.m0
        public void flush() {
            if(this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override  // okio.m0
        @l
        public q0 timeout() {
            return this.timeout;
        }

        @Override  // okio.m0
        public void write(@l okio.l l0, long v) {
            L.p(l0, "source");
            if(this.closed) {
                throw new IllegalStateException("closed");
            }
            Util.checkOffsetAndCount(l0.size(), 0L, v);
            Http1ExchangeCodec.this.sink.write(l0, v);
        }
    }

    @s0({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        @Override  // okio.o0
        public void close() {
            if(this.getClosed()) {
                return;
            }
            if(!this.inputExhausted) {
                this.responseBodyComplete();
            }
            this.setClosed(true);
        }

        @Override  // okhttp3.internal.http1.Http1ExchangeCodec$AbstractSource
        public long read(@l okio.l l0, long v) {
            L.p(l0, "sink");
            if(v < 0L) {
                throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
            }
            if(this.getClosed()) {
                throw new IllegalStateException("closed");
            }
            if(this.inputExhausted) {
                return -1L;
            }
            long v1 = super.read(l0, v);
            if(v1 == -1L) {
                this.inputExhausted = true;
                this.responseBodyComplete();
                return -1L;
            }
            return v1;
        }
    }

    @l
    public static final Companion Companion = null;
    private static final long NO_CHUNK_YET = -1L;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    @m
    private final OkHttpClient client;
    @l
    private final RealConnection connection;
    @l
    private final HeadersReader headersReader;
    @l
    private final okio.m sink;
    @l
    private final n source;
    private int state;
    @m
    private Headers trailers;

    static {
        Http1ExchangeCodec.Companion = new Companion(null);
    }

    public Http1ExchangeCodec(@m OkHttpClient okHttpClient0, @l RealConnection realConnection0, @l n n0, @l okio.m m0) {
        L.p(realConnection0, "connection");
        L.p(n0, "source");
        L.p(m0, "sink");
        super();
        this.client = okHttpClient0;
        this.connection = realConnection0;
        this.source = n0;
        this.sink = m0;
        this.headersReader = new HeadersReader(n0);
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.getConnection().cancel();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @l
    public m0 createRequestBody(@l Request request0, long v) {
        L.p(request0, "request");
        boolean z = request0.body() == null;
        if(this.isChunked(request0)) {
            return this.newChunkedSink();
        }
        if(v == -1L) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        return this.newKnownLengthSink();
    }

    private final void detachTimeout(z z0) {
        q0 q00 = z0.a();
        z0.b(q0.NONE);
        q00.clearDeadline();
        q00.clearTimeout();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @l
    public RealConnection getConnection() {
        return this.connection;
    }

    private final boolean isChunked(Request request0) {
        return v.O1("chunked", request0.header("Transfer-Encoding"), true);
    }

    private final boolean isChunked(Response response0) {
        return v.O1("chunked", Response.header$default(response0, "Transfer-Encoding", null, 2, null), true);
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    private final m0 newChunkedSink() {
        if(this.state != 1) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 2;
        return new ChunkedSink(this);
    }

    private final o0 newChunkedSource(HttpUrl httpUrl0) {
        if(this.state != 4) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        return new ChunkedSource(this, httpUrl0);
    }

    private final o0 newFixedLengthSource(long v) {
        if(this.state != 4) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        return new FixedLengthSource(this, v);
    }

    private final m0 newKnownLengthSink() {
        if(this.state != 1) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 2;
        return new KnownLengthSink(this);
    }

    private final o0 newUnknownLengthSource() {
        if(this.state != 4) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.state = 5;
        this.getConnection().noNewExchanges$okhttp();
        return new UnknownLengthSource(this);
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @l
    public o0 openResponseBodySource(@l Response response0) {
        L.p(response0, "response");
        if(!HttpHeaders.promisesBody(response0)) {
            return this.newFixedLengthSource(0L);
        }
        if(this.isChunked(response0)) {
            return this.newChunkedSource(response0.request().url());
        }
        long v = Util.headersContentLength(response0);
        return v == -1L ? this.newUnknownLengthSource() : this.newFixedLengthSource(v);
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @m
    public Builder readResponseHeaders(boolean z) {
        if(this.state != 1 && (this.state != 2 && this.state != 3)) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            String s = this.headersReader.readLine();
            StatusLine statusLine0 = StatusLine.Companion.parse(s);
            Builder response$Builder0 = new Builder().protocol(statusLine0.protocol).code(statusLine0.code).message(statusLine0.message).headers(this.headersReader.readHeaders());
            if(z && statusLine0.code == 100) {
                return null;
            }
            int v = statusLine0.code;
            if(v == 100) {
                this.state = 3;
                return response$Builder0;
            }
            if(102 <= v && v < 200) {
                this.state = 3;
                return response$Builder0;
            }
            this.state = 4;
            return response$Builder0;
        }
        catch(EOFException eOFException0) {
        }
        throw new IOException("unexpected end of stream on " + this.getConnection().route().address().url().redact(), eOFException0);
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@l Response response0) {
        L.p(response0, "response");
        if(!HttpHeaders.promisesBody(response0)) {
            return 0L;
        }
        return this.isChunked(response0) ? -1L : Util.headersContentLength(response0);
    }

    public final void skipConnectBody(@l Response response0) {
        L.p(response0, "response");
        long v = Util.headersContentLength(response0);
        if(v == -1L) {
            return;
        }
        o0 o00 = this.newFixedLengthSource(v);
        Util.skipAll(o00, 0x7FFFFFFF, TimeUnit.MILLISECONDS);
        o00.close();
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    @l
    public Headers trailers() {
        if(this.state != 6) {
            throw new IllegalStateException("too early; can\'t read the trailers yet");
        }
        return this.trailers == null ? Util.EMPTY_HEADERS : this.trailers;
    }

    public final void writeRequest(@l Headers headers0, @l String s) {
        L.p(headers0, "headers");
        L.p(s, "requestLine");
        if(this.state != 0) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.sink.D2(s).D2("\r\n");
        int v = headers0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s1 = headers0.name(v1);
            this.sink.D2(s1).D2(": ").D2(headers0.value(v1)).D2("\r\n");
        }
        this.sink.D2("\r\n");
        this.state = 1;
    }

    @Override  // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@l Request request0) {
        L.p(request0, "request");
        Proxy.Type proxy$Type0 = this.getConnection().route().proxy().type();
        L.o(proxy$Type0, "connection.route().proxy.type()");
        this.writeRequest(request0.headers(), RequestLine.INSTANCE.get(request0, proxy$Type0));
    }
}

