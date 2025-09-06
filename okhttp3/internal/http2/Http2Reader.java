package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.j;
import kotlin.ranges.s;
import okhttp3.internal.Util;
import okio.n;
import okio.o0;
import okio.o;
import okio.q0;
import y4.l;

public final class Http2Reader implements Closeable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int v, int v1, int v2) throws IOException {
            if((v1 & 8) != 0) {
                --v;
            }
            if(v2 > v) {
                throw new IOException("PROTOCOL_ERROR padding " + v2 + " > remaining length " + v);
            }
            return v - v2;
        }
    }

    public static final class ContinuationSource implements o0 {
        private int flags;
        private int left;
        private int length;
        private int padding;
        @l
        private final n source;
        private int streamId;

        public ContinuationSource(@l n n0) {
            L.p(n0, "source");
            super();
            this.source = n0;
        }

        @Override  // okio.o0
        public void close() throws IOException {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override  // okio.o0
        public long read(@l okio.l l0, long v) throws IOException {
            L.p(l0, "sink");
            int v1;
            while((v1 = this.left) == 0) {
                this.source.skip(((long)this.padding));
                this.padding = 0;
                if((this.flags & 4) != 0) {
                    return -1L;
                }
                this.readContinuationHeader();
            }
            long v2 = this.source.read(l0, Math.min(v, v1));
            if(v2 == -1L) {
                return -1L;
            }
            this.left -= (int)v2;
            return v2;
        }

        private final void readContinuationHeader() throws IOException {
            int v = this.streamId;
            int v1 = Util.readMedium(this.source);
            this.left = v1;
            this.length = v1;
            int v2 = Util.and(this.source.readByte(), ((byte)0xFF));
            this.flags = Util.and(this.source.readByte(), ((byte)0xFF));
            Companion http2Reader$Companion0 = Http2Reader.Companion;
            if(http2Reader$Companion0.getLogger().isLoggable(Level.FINE)) {
                http2Reader$Companion0.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, v2, this.flags));
            }
            int v3 = this.source.readInt();
            this.streamId = v3 & 0x7FFFFFFF;
            if(v2 != 9) {
                throw new IOException(v2 + " != TYPE_CONTINUATION");
            }
            if((v3 & 0x7FFFFFFF) != v) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        public final void setFlags(int v) {
            this.flags = v;
        }

        public final void setLeft(int v) {
            this.left = v;
        }

        public final void setLength(int v) {
            this.length = v;
        }

        public final void setPadding(int v) {
            this.padding = v;
        }

        public final void setStreamId(int v) {
            this.streamId = v;
        }

        @Override  // okio.o0
        @l
        public q0 timeout() {
            return this.source.timeout();
        }
    }

    public interface Handler {
        void ackSettings();

        void alternateService(int arg1, @l String arg2, @l o arg3, @l String arg4, int arg5, long arg6);

        void data(boolean arg1, int arg2, @l n arg3, int arg4) throws IOException;

        void goAway(int arg1, @l ErrorCode arg2, @l o arg3);

        void headers(boolean arg1, int arg2, int arg3, @l List arg4);

        void ping(boolean arg1, int arg2, int arg3);

        void priority(int arg1, int arg2, int arg3, boolean arg4);

        void pushPromise(int arg1, int arg2, @l List arg3) throws IOException;

        void rstStream(int arg1, @l ErrorCode arg2);

        void settings(boolean arg1, @l Settings arg2);

        void windowUpdate(int arg1, long arg2);
    }

    @l
    public static final Companion Companion;
    private final boolean client;
    @l
    private final ContinuationSource continuation;
    @l
    private final Reader hpackReader;
    @l
    private static final Logger logger;
    @l
    private final n source;

    static {
        Http2Reader.Companion = new Companion(null);
        Logger logger0 = Logger.getLogger("okhttp3.internal.http2.Http2");
        L.o(logger0, "getLogger(Http2::class.java.name)");
        Http2Reader.logger = logger0;
    }

    public Http2Reader(@l n n0, boolean z) {
        L.p(n0, "source");
        super();
        this.source = n0;
        this.client = z;
        ContinuationSource http2Reader$ContinuationSource0 = new ContinuationSource(n0);
        this.continuation = http2Reader$ContinuationSource0;
        this.hpackReader = new Reader(http2Reader$ContinuationSource0, 0x1000, 0, 4, null);
    }

    @Override
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z, @l Handler http2Reader$Handler0) throws IOException {
        L.p(http2Reader$Handler0, "handler");
        try {
            this.source.X2(9L);
        }
        catch(EOFException unused_ex) {
            return false;
        }
        int v = Util.readMedium(this.source);
        if(v <= 0x4000) {
            int v1 = Util.and(this.source.readByte(), ((byte)0xFF));
            int v2 = Util.and(this.source.readByte(), ((byte)0xFF));
            int v3 = this.source.readInt();
            Logger logger0 = Http2Reader.logger;
            if(logger0.isLoggable(Level.FINE)) {
                logger0.fine(Http2.INSTANCE.frameLog(true, v3 & 0x7FFFFFFF, v, v1, v2));
            }
            if(z && v1 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(v1));
            }
            switch(v1) {
                case 0: {
                    this.readData(http2Reader$Handler0, v, v2, v3 & 0x7FFFFFFF);
                    return true;
                }
                case 1: {
                    this.readHeaders(http2Reader$Handler0, v, v2, v3 & 0x7FFFFFFF);
                    return true;
                }
                case 2: {
                    this.readPriority(http2Reader$Handler0, v, v2, v3 & 0x7FFFFFFF);
                    return true;
                }
                case 3: {
                    this.readRstStream(http2Reader$Handler0, v, v2, v3 & 0x7FFFFFFF);
                    return true;
                }
                case 4: {
                    this.readSettings(http2Reader$Handler0, v, v2, v3 & 0x7FFFFFFF);
                    return true;
                }
                case 5: {
                    this.readPushPromise(http2Reader$Handler0, v, v2, v3 & 0x7FFFFFFF);
                    return true;
                }
                case 6: {
                    this.readPing(http2Reader$Handler0, v, v2, v3 & 0x7FFFFFFF);
                    return true;
                }
                case 7: {
                    this.readGoAway(http2Reader$Handler0, v, v2, v3 & 0x7FFFFFFF);
                    return true;
                }
                case 8: {
                    this.readWindowUpdate(http2Reader$Handler0, v, v2, v3 & 0x7FFFFFFF);
                    return true;
                }
                default: {
                    this.source.skip(((long)v));
                    return true;
                }
            }
        }
        throw new IOException("FRAME_SIZE_ERROR: " + v);
    }

    public final void readConnectionPreface(@l Handler http2Reader$Handler0) throws IOException {
        L.p(http2Reader$Handler0, "handler");
        if(this.client) {
            if(!this.nextFrame(true, http2Reader$Handler0)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        o o0 = Http2.CONNECTION_PREFACE;
        long v = (long)o0.h0();
        o o1 = this.source.F0(v);
        Logger logger0 = Http2Reader.logger;
        if(logger0.isLoggable(Level.FINE)) {
            logger0.fine(Util.format(("<< CONNECTION " + o1.z()), new Object[0]));
        }
        if(!L.g(o0, o1)) {
            throw new IOException("Expected a connection header but was " + o1.t0());
        }
    }

    private final void readData(Handler http2Reader$Handler0, int v, int v1, int v2) throws IOException {
        int v3 = 0;
        if(v2 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        if((v1 & 0x20) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if((v1 & 8) != 0) {
            v3 = Util.and(this.source.readByte(), ((byte)0xFF));
        }
        int v4 = Http2Reader.Companion.lengthWithoutPadding(v, v1, v3);
        http2Reader$Handler0.data((v1 & 1) != 0, v2, this.source, v4);
        this.source.skip(((long)v3));
    }

    private final void readGoAway(Handler http2Reader$Handler0, int v, int v1, int v2) throws IOException {
        if(v < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + v);
        }
        if(v2 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int v3 = this.source.readInt();
        int v4 = this.source.readInt();
        ErrorCode errorCode0 = ErrorCode.Companion.fromHttp2(v4);
        if(errorCode0 == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + v4);
        }
        http2Reader$Handler0.goAway(v3, errorCode0, (v - 8 <= 0 ? o.f : this.source.F0(((long)(v - 8)))));
    }

    private final List readHeaderBlock(int v, int v1, int v2, int v3) throws IOException {
        this.continuation.setLeft(v);
        int v4 = this.continuation.getLeft();
        this.continuation.setLength(v4);
        this.continuation.setPadding(v1);
        this.continuation.setFlags(v2);
        this.continuation.setStreamId(v3);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler http2Reader$Handler0, int v, int v1, int v2) throws IOException {
        int v3 = 0;
        if(v2 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        if((v1 & 8) != 0) {
            v3 = Util.and(this.source.readByte(), ((byte)0xFF));
        }
        if((v1 & 0x20) != 0) {
            this.readPriority(http2Reader$Handler0, v2);
            v -= 5;
        }
        http2Reader$Handler0.headers((v1 & 1) != 0, v2, -1, this.readHeaderBlock(Http2Reader.Companion.lengthWithoutPadding(v, v1, v3), v3, v1, v2));
    }

    private final void readPing(Handler http2Reader$Handler0, int v, int v1, int v2) throws IOException {
        if(v != 8) {
            throw new IOException("TYPE_PING length != 8: " + v);
        }
        if(v2 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        http2Reader$Handler0.ping((v1 & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void readPriority(Handler http2Reader$Handler0, int v) throws IOException {
        int v1 = this.source.readInt();
        http2Reader$Handler0.priority(v, v1 & 0x7FFFFFFF, Util.and(this.source.readByte(), ((byte)0xFF)) + 1, (0x80000000 & v1) != 0);
    }

    private final void readPriority(Handler http2Reader$Handler0, int v, int v1, int v2) throws IOException {
        if(v != 5) {
            throw new IOException("TYPE_PRIORITY length: " + v + " != 5");
        }
        if(v2 == 0) {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        this.readPriority(http2Reader$Handler0, v2);
    }

    private final void readPushPromise(Handler http2Reader$Handler0, int v, int v1, int v2) throws IOException {
        if(v2 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int v3 = (v1 & 8) == 0 ? 0 : Util.and(this.source.readByte(), ((byte)0xFF));
        http2Reader$Handler0.pushPromise(v2, this.source.readInt() & 0x7FFFFFFF, this.readHeaderBlock(Http2Reader.Companion.lengthWithoutPadding(v - 4, v1, v3), v3, v1, v2));
    }

    private final void readRstStream(Handler http2Reader$Handler0, int v, int v1, int v2) throws IOException {
        if(v != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + v + " != 4");
        }
        if(v2 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int v3 = this.source.readInt();
        ErrorCode errorCode0 = ErrorCode.Companion.fromHttp2(v3);
        if(errorCode0 == null) {
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + v3);
        }
        http2Reader$Handler0.rstStream(v2, errorCode0);
    }

    private final void readSettings(Handler http2Reader$Handler0, int v, int v1, int v2) throws IOException {
        if(v2 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if((v1 & 1) != 0) {
            if(v != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            http2Reader$Handler0.ackSettings();
            return;
        }
        if(v % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + v);
        }
        Settings settings0 = new Settings();
        j j0 = s.B1(s.W1(0, v), 6);
        int v3 = j0.g();
        int v4 = j0.h();
        int v5 = j0.i();
        if(v5 > 0 && v3 <= v4 || v5 < 0 && v4 <= v3) {
            while(true) {
                int v6 = Util.and(this.source.readShort(), ((short)0xFFFF));
                int v7 = this.source.readInt();
                if(v6 != 2) {
                    switch(v6) {
                        case 3: {
                            v6 = 4;
                            break;
                        }
                        case 4: {
                            if(v7 < 0) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                            }
                            v6 = 7;
                            break;
                        }
                        default: {
                            if(v6 == 5 && (v7 < 0x4000 || v7 > 0xFFFFFF)) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + v7);
                            }
                        }
                    }
                }
                else if(v7 != 0 && v7 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings0.set(v6, v7);
                if(v3 == v4) {
                    break;
                }
                v3 += v5;
            }
        }
        http2Reader$Handler0.settings(false, settings0);
    }

    private final void readWindowUpdate(Handler http2Reader$Handler0, int v, int v1, int v2) throws IOException {
        if(v != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + v);
        }
        long v3 = Util.and(this.source.readInt(), 0x7FFFFFFFL);
        if(v3 == 0L) {
            throw new IOException("windowSizeIncrement was 0");
        }
        http2Reader$Handler0.windowUpdate(v2, v3);
    }
}

