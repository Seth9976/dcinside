package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import jeb.synthetic.FIN;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.j;
import okio.m0;
import okio.n;
import okio.o0;
import okio.q0;
import y4.l;
import y4.m;

@s0({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n615#3,4:699\n615#3,4:703\n563#3:707\n563#3:708\n615#3,4:709\n563#3:713\n557#3:714\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n*L\n176#1:690,4\n255#1:694,4\n263#1:698\n274#1:699,4\n281#1:703,4\n295#1:707\n305#1:708\n491#1:709,4\n637#1:713\n657#1:714\n*E\n"})
public final class Http2Stream {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @s0({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n615#2,4:689\n615#2,4:693\n615#2,4:697\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n*L\n528#1:689,4\n573#1:693,4\n589#1:697,4\n*E\n"})
    public final class FramingSink implements m0 {
        private boolean closed;
        private boolean finished;
        @l
        private final okio.l sendBuffer;
        @m
        private Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new okio.l();
        }

        public FramingSink(boolean z, int v, w w0) {
            if((v & 1) != 0) {
                z = false;
            }
            this(z);
        }

        @Override  // okio.m0
        public void close() throws IOException {
            boolean z;
            Http2Stream http2Stream0 = Http2Stream.this;
            if(Util.assertionsEnabled && Thread.holdsLock(http2Stream0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-12402 MUST NOT hold lock on " + http2Stream0);
            }
            Http2Stream http2Stream1 = Http2Stream.this;
            synchronized(http2Stream1) {
                if(this.closed) {
                    return;
                }
                z = http2Stream1.getErrorCode$okhttp() == null;
            }
            if(!Http2Stream.this.getSink$okhttp().finished) {
                boolean z1 = this.sendBuffer.size() > 0L;
                if(this.trailers != null) {
                    while(this.sendBuffer.size() > 0L) {
                        this.emitFrame(false);
                    }
                    Headers headers0 = this.trailers;
                    L.m(headers0);
                    Http2Stream.this.getConnection().writeHeaders$okhttp(Http2Stream.this.getId(), z, Util.toHeaderList(headers0));
                }
                else if(z1) {
                    while(this.sendBuffer.size() > 0L) {
                        this.emitFrame(true);
                    }
                }
                else if(z) {
                    Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                }
            }
            synchronized(Http2Stream.this) {
                this.closed = true;
            }
            Http2Stream.this.getConnection().flush();
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        private final void emitFrame(boolean z) throws IOException {
            long v2;
            Http2Stream http2Stream0 = Http2Stream.this;
            synchronized(http2Stream0) {
                http2Stream0.getWriteTimeout$okhttp().enter();
                try {
                    while(http2Stream0.getWriteBytesTotal() >= http2Stream0.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream0.getErrorCode$okhttp() == null) {
                        http2Stream0.waitForIo$okhttp();
                    }
                }
                finally {
                    http2Stream0.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                }
                http2Stream0.checkOutNotClosed$okhttp();
                v2 = Math.min(http2Stream0.getWriteBytesMaximum() - http2Stream0.getWriteBytesTotal(), this.sendBuffer.size());
                http2Stream0.setWriteBytesTotal$okhttp(http2Stream0.getWriteBytesTotal() + v2);
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z && v2 == this.sendBuffer.size(), this.sendBuffer, v2);
            }
            finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        @Override  // okio.m0
        public void flush() throws IOException {
            Http2Stream http2Stream0 = Http2Stream.this;
            if(Util.assertionsEnabled && Thread.holdsLock(http2Stream0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-12432 MUST NOT hold lock on " + http2Stream0);
            }
            synchronized(Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed$okhttp();
            }
            while(this.sendBuffer.size() > 0L) {
                this.emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        @m
        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(@m Headers headers0) {
            this.trailers = headers0;
        }

        @Override  // okio.m0
        @l
        public q0 timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override  // okio.m0
        public void write(@l okio.l l0, long v) throws IOException {
            L.p(l0, "source");
            Http2Stream http2Stream0 = Http2Stream.this;
            if(Util.assertionsEnabled && Thread.holdsLock(http2Stream0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-12398 MUST NOT hold lock on " + http2Stream0);
            }
            this.sendBuffer.write(l0, v);
            while(this.sendBuffer.size() >= 0x4000L) {
                this.emitFrame(false);
            }
        }
    }

    @s0({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n563#3:699\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n*L\n407#1:690,4\n418#1:694,4\n458#1:698\n480#1:699\n*E\n"})
    public final class FramingSource implements o0 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        @l
        private final okio.l readBuffer;
        @l
        private final okio.l receiveBuffer;
        @m
        private Headers trailers;

        public FramingSource(long v, boolean z) {
            this.maxByteCount = v;
            this.finished = z;
            this.receiveBuffer = new okio.l();
            this.readBuffer = new okio.l();
        }

        @Override  // okio.o0
        public void close() throws IOException {
            long v1;
            synchronized(Http2Stream.this) {
                this.closed = true;
                v1 = this.readBuffer.size();
                this.readBuffer.c();
                L.n(Http2Stream.this, "null cannot be cast to non-null type java.lang.Object");
                Http2Stream.this.notifyAll();
            }
            if(v1 > 0L) {
                this.updateConnectionFlowControl(v1);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        @l
        public final okio.l getReadBuffer() {
            return this.readBuffer;
        }

        @l
        public final okio.l getReceiveBuffer() {
            return this.receiveBuffer;
        }

        @m
        public final Headers getTrailers() {
            return this.trailers;
        }

        // This method was un-flattened
        @Override  // okio.o0
        public long read(@l okio.l l0, long v) throws IOException {
            long v2;
            IOException iOException1;
            int v1;
            Http2Stream http2Stream0;
            L.p(l0, "sink");
            if(v < 0L) {
                throw new IllegalArgumentException(("byteCount < 0: " + v).toString());
            }
            while(true) {
                http2Stream0 = Http2Stream.this;
                __monitor_enter(http2Stream0);
                v1 = FIN.finallyOpen$NT();
                http2Stream0.getReadTimeout$okhttp().enter();
                try {
                    if(http2Stream0.getErrorCode$okhttp() == null || this.finished) {
                        iOException1 = null;
                    }
                    else {
                        IOException iOException0 = http2Stream0.getErrorException$okhttp();
                        if(iOException0 == null) {
                            ErrorCode errorCode0 = http2Stream0.getErrorCode$okhttp();
                            L.m(errorCode0);
                            iOException1 = new StreamResetException(errorCode0);
                        }
                        else {
                            iOException1 = iOException0;
                        }
                    }
                    if(this.closed) {
                        throw new IOException("stream closed");
                    }
                    if(this.readBuffer.size() > 0L) {
                        goto label_26;
                    }
                    if(this.finished || iOException1 != null) {
                        v2 = -1L;
                        break;
                    }
                    http2Stream0.waitForIo$okhttp();
                }
                catch(Throwable throwable0) {
                    goto label_34;
                }
                http2Stream0.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                FIN.finallyExec$NT(v1);
                continue;
                try {
                label_26:
                    v2 = this.readBuffer.read(l0, Math.min(v, this.readBuffer.size()));
                    http2Stream0.setReadBytesTotal$okhttp(http2Stream0.getReadBytesTotal() + v2);
                    long v3 = http2Stream0.getReadBytesTotal() - http2Stream0.getReadBytesAcknowledged();
                    if(iOException1 == null && v3 >= ((long)(http2Stream0.getConnection().getOkHttpSettings().getInitialWindowSize() / 2))) {
                        http2Stream0.getConnection().writeWindowUpdateLater$okhttp(http2Stream0.getId(), v3);
                        http2Stream0.setReadBytesAcknowledged$okhttp(http2Stream0.getReadBytesTotal());
                    }
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_34:
                http2Stream0.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                FIN.finallyExec$NT(v1);
                throw throwable0;
            }
            http2Stream0.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
            FIN.finallyCodeBegin$NT(v1);
            __monitor_exit(http2Stream0);
            FIN.finallyCodeEnd$NT(v1);
            if(v2 != -1L) {
                return v2;
            }
            if(iOException1 != null) {
                throw iOException1;
            }
            return -1L;
        }

        public final void receive$okhttp(@l n n0, long v) throws IOException {
            boolean z1;
            L.p(n0, "source");
            Http2Stream http2Stream0 = Http2Stream.this;
            if(Util.assertionsEnabled && Thread.holdsLock(http2Stream0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-12360 MUST NOT hold lock on " + http2Stream0);
            }
            long v1 = v;
            while(v1 > 0L) {
                synchronized(Http2Stream.this) {
                    boolean z = this.finished;
                    z1 = false;
                }
                if(this.readBuffer.size() + v1 > this.maxByteCount) {
                    n0.skip(v1);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if(z) {
                    n0.skip(v1);
                    return;
                }
                long v3 = n0.read(this.receiveBuffer, v1);
                if(v3 == -1L) {
                    throw new EOFException();
                }
                v1 -= v3;
                Http2Stream http2Stream1 = Http2Stream.this;
                synchronized(http2Stream1) {
                    if(this.closed) {
                        this.receiveBuffer.c();
                    }
                    else {
                        if(this.readBuffer.size() == 0L) {
                            z1 = true;
                        }
                        this.readBuffer.K2(this.receiveBuffer);
                        if(z1) {
                            L.n(http2Stream1, "null cannot be cast to non-null type java.lang.Object");
                            http2Stream1.notifyAll();
                        }
                    }
                }
            }
            this.updateConnectionFlowControl(v);
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(@m Headers headers0) {
            this.trailers = headers0;
        }

        @Override  // okio.o0
        @l
        public q0 timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }

        private final void updateConnectionFlowControl(long v) {
            Http2Stream http2Stream0 = Http2Stream.this;
            if(Util.assertionsEnabled && Thread.holdsLock(http2Stream0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-12472 MUST NOT hold lock on " + http2Stream0);
            }
            Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(v);
        }
    }

    public final class StreamTimeout extends j {
        public final void exitAndThrowIfTimedOut() throws IOException {
            if(this.exit()) {
                throw this.newTimeoutException(null);
            }
        }

        @Override  // okio.j
        @l
        protected IOException newTimeoutException(@m IOException iOException0) {
            IOException iOException1 = new SocketTimeoutException("timeout");
            if(iOException0 != null) {
                iOException1.initCause(iOException0);
            }
            return iOException1;
        }

        @Override  // okio.j
        protected void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    @l
    public static final Companion Companion = null;
    public static final long EMIT_BUFFER_SIZE = 0x4000L;
    @l
    private final Http2Connection connection;
    @m
    private ErrorCode errorCode;
    @m
    private IOException errorException;
    private boolean hasResponseHeaders;
    @l
    private final ArrayDeque headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    @l
    private final StreamTimeout readTimeout;
    @l
    private final FramingSink sink;
    @l
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    @l
    private final StreamTimeout writeTimeout;

    static {
        Http2Stream.Companion = new Companion(null);
    }

    public Http2Stream(int v, @l Http2Connection http2Connection0, boolean z, boolean z1, @m Headers headers0) {
        L.p(http2Connection0, "connection");
        super();
        this.id = v;
        this.connection = http2Connection0;
        this.writeBytesMaximum = (long)http2Connection0.getPeerSettings().getInitialWindowSize();
        ArrayDeque arrayDeque0 = new ArrayDeque();
        this.headersQueue = arrayDeque0;
        this.source = new FramingSource(this, ((long)http2Connection0.getOkHttpSettings().getInitialWindowSize()), z1);
        this.sink = new FramingSink(this, z);
        this.readTimeout = new StreamTimeout(this);
        this.writeTimeout = new StreamTimeout(this);
        if(headers0 != null) {
            if(this.isLocallyInitiated()) {
                throw new IllegalStateException("locally-initiated streams shouldn\'t have headers yet");
            }
            arrayDeque0.add(headers0);
            return;
        }
        if(!this.isLocallyInitiated()) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final void addBytesToWriteWindow(long v) {
        this.writeBytesMaximum += v;
        if(v > 0L) {
            L.n(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12456 MUST NOT hold lock on " + this);
        }
        synchronized(this) {
            boolean z = this.isOpen();
        }
        if(!this.source.getFinished$okhttp() && this.source.getClosed$okhttp() && (this.sink.getFinished() || this.sink.getClosed())) {
            this.close(ErrorCode.CANCEL, null);
            return;
        }
        if(!z) {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if(this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if(this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if(this.errorCode != null) {
            IOException iOException0 = this.errorException;
            if(iOException0 == null) {
                ErrorCode errorCode0 = this.errorCode;
                L.m(errorCode0);
                iOException0 = new StreamResetException(errorCode0);
            }
            throw iOException0;
        }
    }

    public final void close(@l ErrorCode errorCode0, @m IOException iOException0) throws IOException {
        L.p(errorCode0, "rstStatusCode");
        if(!this.closeInternal(errorCode0, iOException0)) {
            return;
        }
        this.connection.writeSynReset$okhttp(this.id, errorCode0);
    }

    private final boolean closeInternal(ErrorCode errorCode0, IOException iOException0) {
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12360 MUST NOT hold lock on " + this);
        }
        synchronized(this) {
            if(this.errorCode != null) {
                return false;
            }
            this.errorCode = errorCode0;
            this.errorException = iOException0;
            L.n(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
            if(this.source.getFinished$okhttp() && this.sink.getFinished()) {
                return false;
            }
        }
        this.connection.removeStream$okhttp(this.id);
        return true;
    }

    public final void closeLater(@l ErrorCode errorCode0) {
        L.p(errorCode0, "errorCode");
        if(!this.closeInternal(errorCode0, null)) {
            return;
        }
        this.connection.writeSynResetLater$okhttp(this.id, errorCode0);
    }

    public final void enqueueTrailers(@l Headers headers0) {
        L.p(headers0, "trailers");
        synchronized(this) {
            if(!this.sink.getFinished()) {
                if(headers0.size() == 0) {
                    throw new IllegalArgumentException("trailers.size() == 0");
                }
                this.sink.setTrailers(headers0);
                return;
            }
        }
        throw new IllegalStateException("already finished");
    }

    @l
    public final Http2Connection getConnection() {
        return this.connection;
    }

    @m
    public final ErrorCode getErrorCode$okhttp() {
        synchronized(this) {
        }
        return this.errorCode;
    }

    @m
    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @l
    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    @l
    public final m0 getSink() {
        synchronized(this) {
            if(!this.hasResponseHeaders && !this.isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
            return this.sink;
        }
    }

    @l
    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    @l
    public final o0 getSource() {
        return this.source;
    }

    @l
    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @l
    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient$okhttp() == ((this.id & 1) == 1);
    }

    public final boolean isOpen() {
        synchronized(this) {
            if(this.errorCode != null) {
                return false;
            }
            return (this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) && (this.sink.getFinished() || this.sink.getClosed()) && this.hasResponseHeaders ? false : true;
        }
    }

    @l
    public final q0 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(@l n n0, int v) throws IOException {
        L.p(n0, "source");
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12349 MUST NOT hold lock on " + this);
        }
        this.source.receive$okhttp(n0, ((long)v));
    }

    public final void receiveHeaders(@l Headers headers0, boolean z) {
        L.p(headers0, "headers");
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12456 MUST NOT hold lock on " + this);
        }
        synchronized(this) {
            if(!this.hasResponseHeaders || !z) {
                this.hasResponseHeaders = true;
                this.headersQueue.add(headers0);
            }
            else {
                this.source.setTrailers(headers0);
            }
            if(z) {
                this.source.setFinished$okhttp(true);
            }
            boolean z1 = this.isOpen();
            L.n(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
        }
        if(!z1) {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void receiveRstStream(@l ErrorCode errorCode0) {
        synchronized(this) {
            L.p(errorCode0, "errorCode");
            if(this.errorCode == null) {
                this.errorCode = errorCode0;
                L.n(this, "null cannot be cast to non-null type java.lang.Object");
                this.notifyAll();
            }
        }
    }

    public final void setErrorCode$okhttp(@m ErrorCode errorCode0) {
        this.errorCode = errorCode0;
    }

    public final void setErrorException$okhttp(@m IOException iOException0) {
        this.errorException = iOException0;
    }

    public final void setReadBytesAcknowledged$okhttp(long v) {
        this.readBytesAcknowledged = v;
    }

    public final void setReadBytesTotal$okhttp(long v) {
        this.readBytesTotal = v;
    }

    public final void setWriteBytesMaximum$okhttp(long v) {
        this.writeBytesMaximum = v;
    }

    public final void setWriteBytesTotal$okhttp(long v) {
        this.writeBytesTotal = v;
    }

    @l
    public final Headers takeHeaders() throws IOException {
        IOException iOException0;
        synchronized(this) {
            this.readTimeout.enter();
            try {
                while(this.headersQueue.isEmpty() && this.errorCode == null) {
                    this.waitForIo$okhttp();
                }
            }
            finally {
                this.readTimeout.exitAndThrowIfTimedOut();
            }
            if(!this.headersQueue.isEmpty()) {
                Object object0 = this.headersQueue.removeFirst();
                L.o(object0, "headersQueue.removeFirst()");
                return (Headers)object0;
            }
            iOException0 = this.errorException;
            if(iOException0 == null) {
                ErrorCode errorCode0 = this.errorCode;
                L.m(errorCode0);
                iOException0 = new StreamResetException(errorCode0);
            }
        }
        throw iOException0;
    }

    @l
    public final Headers trailers() throws IOException {
        synchronized(this) {
            if(this.source.getFinished$okhttp() && this.source.getReceiveBuffer().j3() && this.source.getReadBuffer().j3()) {
                Headers headers0 = this.source.getTrailers();
                if(headers0 == null) {
                    headers0 = Util.EMPTY_HEADERS;
                }
                return headers0;
            }
            if(this.errorCode != null) {
                IOException iOException0 = this.errorException;
                if(iOException0 == null) {
                    ErrorCode errorCode0 = this.errorCode;
                    L.m(errorCode0);
                    iOException0 = new StreamResetException(errorCode0);
                }
                throw iOException0;
            }
        }
        throw new IllegalStateException("too early; can\'t read the trailers yet");
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            L.n(this, "null cannot be cast to non-null type java.lang.Object");
            this.wait();
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(@l List list0, boolean z, boolean z1) throws IOException {
        boolean z2;
        L.p(list0, "responseHeaders");
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12508 MUST NOT hold lock on " + this);
        }
        synchronized(this) {
            z2 = true;
            this.hasResponseHeaders = true;
            if(z) {
                this.sink.setFinished(true);
            }
        }
        if(!z1) {
            synchronized(this.connection) {
                if(this.connection.getWriteBytesTotal() < this.connection.getWriteBytesMaximum()) {
                    z2 = false;
                }
            }
            z1 = z2;
        }
        this.connection.writeHeaders$okhttp(this.id, z, list0);
        if(z1) {
            this.connection.flush();
        }
    }

    @l
    public final q0 writeTimeout() {
        return this.writeTimeout;
    }
}

