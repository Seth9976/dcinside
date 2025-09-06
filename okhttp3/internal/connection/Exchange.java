package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket.Streams;
import okio.Z;
import okio.m0;
import okio.o0;
import okio.x;
import okio.y;
import y4.l;
import y4.m;

public final class Exchange {
    @s0({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$RequestBodySink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    final class RequestBodySink extends x {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;

        public RequestBodySink(@l m0 m00, long v) {
            L.p(m00, "delegate");
            Exchange.this = exchange0;
            super(m00);
            this.contentLength = v;
        }

        @Override  // okio.x
        public void close() throws IOException {
            if(this.closed) {
                return;
            }
            this.closed = true;
            if(this.contentLength != -1L && this.bytesReceived != this.contentLength) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                this.complete(null);
            }
            catch(IOException iOException0) {
                throw this.complete(iOException0);
            }
        }

        private final IOException complete(IOException iOException0) {
            if(this.completed) {
                return iOException0;
            }
            this.completed = true;
            return Exchange.this.bodyComplete(this.bytesReceived, false, true, iOException0);
        }

        @Override  // okio.x
        public void flush() throws IOException {
            try {
                super.flush();
            }
            catch(IOException iOException0) {
                throw this.complete(iOException0);
            }
        }

        @Override  // okio.x
        public void write(@l okio.l l0, long v) throws IOException {
            L.p(l0, "source");
            if(!this.closed) {
                if(this.contentLength != -1L && this.bytesReceived + v > this.contentLength) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + v));
                }
                try {
                    super.write(l0, v);
                    this.bytesReceived += v;
                    return;
                }
                catch(IOException iOException0) {
                    throw this.complete(iOException0);
                }
            }
            throw new IllegalStateException("closed");
        }
    }

    @s0({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$ResponseBodySource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    public final class ResponseBodySource extends y {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;

        public ResponseBodySource(@l o0 o00, long v) {
            L.p(o00, "delegate");
            Exchange.this = exchange0;
            super(o00);
            this.contentLength = v;
            this.invokeStartEvent = true;
            if(v == 0L) {
                this.complete(null);
            }
        }

        @Override  // okio.y
        public void close() throws IOException {
            if(this.closed) {
                return;
            }
            try {
                this.closed = true;
                super.close();
                this.complete(null);
            }
            catch(IOException iOException0) {
                throw this.complete(iOException0);
            }
        }

        public final IOException complete(IOException iOException0) {
            if(this.completed) {
                return iOException0;
            }
            this.completed = true;
            if(iOException0 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                Exchange.this.getEventListener$okhttp().responseBodyStart(Exchange.this.getCall$okhttp());
            }
            return Exchange.this.bodyComplete(this.bytesReceived, true, false, iOException0);
        }

        @Override  // okio.y
        public long read(@l okio.l l0, long v) throws IOException {
            L.p(l0, "sink");
            if(this.closed) {
                throw new IllegalStateException("closed");
            }
            try {
                long v1 = this.delegate().read(l0, v);
                if(this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    Exchange.this.getEventListener$okhttp().responseBodyStart(Exchange.this.getCall$okhttp());
                }
                if(v1 == -1L) {
                    this.complete(null);
                    return -1L;
                }
                long v2 = this.bytesReceived + v1;
                long v3 = this.contentLength;
                if(v3 != -1L && v2 > v3) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + v2);
                }
                this.bytesReceived = v2;
                if(v2 == v3) {
                    this.complete(null);
                }
                return v1;
            }
            catch(IOException iOException0) {
            }
            throw this.complete(iOException0);
        }
    }

    @l
    private final RealCall call;
    @l
    private final ExchangeCodec codec;
    @l
    private final RealConnection connection;
    @l
    private final EventListener eventListener;
    @l
    private final ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    public Exchange(@l RealCall realCall0, @l EventListener eventListener0, @l ExchangeFinder exchangeFinder0, @l ExchangeCodec exchangeCodec0) {
        L.p(realCall0, "call");
        L.p(eventListener0, "eventListener");
        L.p(exchangeFinder0, "finder");
        L.p(exchangeCodec0, "codec");
        super();
        this.call = realCall0;
        this.eventListener = eventListener0;
        this.finder = exchangeFinder0;
        this.codec = exchangeCodec0;
        this.connection = exchangeCodec0.getConnection();
    }

    public final IOException bodyComplete(long v, boolean z, boolean z1, IOException iOException0) {
        if(iOException0 != null) {
            this.trackFailure(iOException0);
        }
        if(z1) {
            if(iOException0 == null) {
                this.eventListener.requestBodyEnd(this.call, v);
            }
            else {
                this.eventListener.requestFailed(this.call, iOException0);
            }
        }
        if(z) {
            if(iOException0 != null) {
                this.eventListener.responseFailed(this.call, iOException0);
                return this.call.messageDone$okhttp(this, z1, true, iOException0);
            }
            this.eventListener.responseBodyEnd(this.call, v);
        }
        return this.call.messageDone$okhttp(this, z1, z, iOException0);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    @l
    public final m0 createRequestBody(@l Request request0, boolean z) throws IOException {
        L.p(request0, "request");
        this.isDuplex = z;
        RequestBody requestBody0 = request0.body();
        L.m(requestBody0);
        long v = requestBody0.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request0, v), v);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        }
        catch(IOException iOException0) {
            this.eventListener.requestFailed(this.call, iOException0);
            this.trackFailure(iOException0);
            throw iOException0;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        }
        catch(IOException iOException0) {
            this.eventListener.requestFailed(this.call, iOException0);
            this.trackFailure(iOException0);
            throw iOException0;
        }
    }

    @l
    public final RealCall getCall$okhttp() {
        return this.call;
    }

    @l
    public final RealConnection getConnection$okhttp() {
        return this.connection;
    }

    @l
    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    @l
    public final ExchangeFinder getFinder$okhttp() {
        return this.finder;
    }

    public final boolean getHasFailure$okhttp() {
        return this.hasFailure;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !L.g(this.finder.getAddress$okhttp().url().host(), this.connection.route().address().url().host());
    }

    public final boolean isDuplex$okhttp() {
        return this.isDuplex;
    }

    @l
    public final Streams newWebSocketStreams() throws SocketException {
        this.call.timeoutEarlyExit();
        return this.codec.getConnection().newWebSocketStreams$okhttp(this);
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getConnection().noNewExchanges$okhttp();
    }

    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, null);
    }

    @l
    public final ResponseBody openResponseBody(@l Response response0) throws IOException {
        L.p(response0, "response");
        try {
            String s = Response.header$default(response0, "Content-Type", null, 2, null);
            long v = this.codec.reportedContentLength(response0);
            return new RealResponseBody(s, v, Z.e(new ResponseBodySource(this, this.codec.openResponseBodySource(response0), v)));
        }
        catch(IOException iOException0) {
            this.eventListener.responseFailed(this.call, iOException0);
            this.trackFailure(iOException0);
            throw iOException0;
        }
    }

    @m
    public final Builder readResponseHeaders(boolean z) throws IOException {
        try {
            Builder response$Builder0 = this.codec.readResponseHeaders(z);
            if(response$Builder0 != null) {
                response$Builder0.initExchange$okhttp(this);
                return response$Builder0;
            }
            return null;
        }
        catch(IOException iOException0) {
            this.eventListener.responseFailed(this.call, iOException0);
            this.trackFailure(iOException0);
            throw iOException0;
        }
    }

    public final void responseHeadersEnd(@l Response response0) {
        L.p(response0, "response");
        this.eventListener.responseHeadersEnd(this.call, response0);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    private final void trackFailure(IOException iOException0) {
        this.hasFailure = true;
        this.finder.trackFailure(iOException0);
        this.codec.getConnection().trackFailure$okhttp(this.call, iOException0);
    }

    @l
    public final Headers trailers() throws IOException {
        return this.codec.trailers();
    }

    public final void webSocketUpgradeFailed() {
        this.bodyComplete(-1L, true, true, null);
    }

    public final void writeRequestHeaders(@l Request request0) throws IOException {
        L.p(request0, "request");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request0);
            this.eventListener.requestHeadersEnd(this.call, request0);
        }
        catch(IOException iOException0) {
            this.eventListener.requestFailed(this.call, iOException0);
            this.trackFailure(iOException0);
            throw iOException0;
        }
    }
}

