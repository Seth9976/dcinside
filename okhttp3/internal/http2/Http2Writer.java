package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import okhttp3.internal.Util;
import okio.m;
import y4.l;

@s0({"SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"})
public final class Http2Writer implements Closeable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion;
    private final boolean client;
    private boolean closed;
    @l
    private final okio.l hpackBuffer;
    @l
    private final Writer hpackWriter;
    private static final Logger logger;
    private int maxFrameSize;
    @l
    private final m sink;

    static {
        Http2Writer.Companion = new Companion(null);
        Http2Writer.logger = Logger.getLogger("okhttp3.internal.http2.Http2");
    }

    public Http2Writer(@l m m0, boolean z) {
        L.p(m0, "sink");
        super();
        this.sink = m0;
        this.client = z;
        okio.l l0 = new okio.l();
        this.hpackBuffer = l0;
        this.maxFrameSize = 0x4000;
        this.hpackWriter = new Writer(0, false, l0, 3, null);
    }

    public final void applyAndAckSettings(@l Settings settings0) throws IOException {
        synchronized(this) {
            L.p(settings0, "peerSettings");
            if(!this.closed) {
                this.maxFrameSize = settings0.getMaxFrameSize(this.maxFrameSize);
                if(settings0.getHeaderTableSize() != -1) {
                    int v1 = settings0.getHeaderTableSize();
                    this.hpackWriter.resizeHeaderTable(v1);
                }
                this.frameHeader(0, 0, 4, 1);
                this.sink.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    @Override
    public void close() throws IOException {
        synchronized(this) {
            this.closed = true;
            this.sink.close();
        }
    }

    public final void connectionPreface() throws IOException {
        synchronized(this) {
            if(!this.closed) {
                if(!this.client) {
                    return;
                }
                Logger logger0 = Http2Writer.logger;
                if(logger0.isLoggable(Level.FINE)) {
                    logger0.fine(">> CONNECTION 505249202a20485454502f322e300d0a0d0a534d0d0a0d0a");
                }
                this.sink.M1(Http2.CONNECTION_PREFACE);
                this.sink.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void data(boolean z, int v, @y4.m okio.l l0, int v1) throws IOException {
        synchronized(this) {
            if(!this.closed) {
                this.dataFrame(v, ((int)z), l0, v1);
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void dataFrame(int v, int v1, @y4.m okio.l l0, int v2) throws IOException {
        this.frameHeader(v, v2, 0, v1);
        if(v2 > 0) {
            L.m(l0);
            this.sink.write(l0, ((long)v2));
        }
    }

    public final void flush() throws IOException {
        synchronized(this) {
            if(!this.closed) {
                this.sink.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void frameHeader(int v, int v1, int v2, int v3) throws IOException {
        Logger logger0 = Http2Writer.logger;
        if(logger0.isLoggable(Level.FINE)) {
            logger0.fine(Http2.INSTANCE.frameLog(false, v, v1, v2, v3));
        }
        if(v1 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + v1).toString());
        }
        if((0x80000000 & v) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + v).toString());
        }
        Util.writeMedium(this.sink, v1);
        this.sink.writeByte(v2 & 0xFF);
        this.sink.writeByte(v3 & 0xFF);
        this.sink.writeInt(v & 0x7FFFFFFF);
    }

    @l
    public final Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final void goAway(int v, @l ErrorCode errorCode0, @l byte[] arr_b) throws IOException {
        synchronized(this) {
            L.p(errorCode0, "errorCode");
            L.p(arr_b, "debugData");
            if(!this.closed) {
                if(errorCode0.getHttpCode() == -1) {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                this.frameHeader(0, arr_b.length + 8, 7, 0);
                this.sink.writeInt(v);
                this.sink.writeInt(errorCode0.getHttpCode());
                if(arr_b.length != 0) {
                    this.sink.write(arr_b);
                }
                this.sink.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void headers(boolean z, int v, @l List list0) throws IOException {
        synchronized(this) {
            L.p(list0, "headerBlock");
            if(!this.closed) {
                this.hpackWriter.writeHeaders(list0);
                long v2 = this.hpackBuffer.size();
                long v3 = Math.min(this.maxFrameSize, v2);
                int v4 = Long.compare(v2, v3);
                int v5 = v4 == 0 ? 4 : 0;
                if(z) {
                    v5 |= 1;
                }
                this.frameHeader(v, ((int)v3), 1, v5);
                this.sink.write(this.hpackBuffer, v3);
                if(v4 > 0) {
                    this.writeContinuationFrames(v, v2 - v3);
                }
                return;
            }
        }
        throw new IOException("closed");
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final void ping(boolean z, int v, int v1) throws IOException {
        synchronized(this) {
            if(!this.closed) {
                this.frameHeader(0, 8, 6, ((int)z));
                this.sink.writeInt(v);
                this.sink.writeInt(v1);
                this.sink.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void pushPromise(int v, int v1, @l List list0) throws IOException {
        synchronized(this) {
            L.p(list0, "requestHeaders");
            if(!this.closed) {
                this.hpackWriter.writeHeaders(list0);
                long v3 = this.hpackBuffer.size();
                int v4 = (int)Math.min(((long)this.maxFrameSize) - 4L, v3);
                int v5 = Long.compare(v3, v4);
                this.frameHeader(v, v4 + 4, 5, (v5 == 0 ? 4 : 0));
                this.sink.writeInt(v1 & 0x7FFFFFFF);
                this.sink.write(this.hpackBuffer, ((long)v4));
                if(v5 > 0) {
                    this.writeContinuationFrames(v, v3 - ((long)v4));
                }
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void rstStream(int v, @l ErrorCode errorCode0) throws IOException {
        synchronized(this) {
            L.p(errorCode0, "errorCode");
            if(!this.closed) {
                if(errorCode0.getHttpCode() == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                this.frameHeader(v, 4, 3, 0);
                this.sink.writeInt(errorCode0.getHttpCode());
                this.sink.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void settings(@l Settings settings0) throws IOException {
        int v2;
        synchronized(this) {
            L.p(settings0, "settings");
            if(!this.closed) {
                this.frameHeader(0, settings0.size() * 6, 4, 0);
                for(int v1 = 0; v1 < 10; ++v1) {
                    if(settings0.isSet(v1)) {
                        switch(v1) {
                            case 4: {
                                v2 = 3;
                                break;
                            }
                            case 7: {
                                v2 = 4;
                                break;
                            }
                            default: {
                                v2 = v1;
                            }
                        }
                        this.sink.writeShort(v2);
                        int v3 = settings0.get(v1);
                        this.sink.writeInt(v3);
                    }
                }
                this.sink.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void windowUpdate(int v, long v1) throws IOException {
        synchronized(this) {
            if(!this.closed) {
                if(v1 == 0L || v1 > 0x7FFFFFFFL) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + v1).toString());
                }
                this.frameHeader(v, 4, 8, 0);
                this.sink.writeInt(((int)v1));
                this.sink.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    private final void writeContinuationFrames(int v, long v1) throws IOException {
        while(v1 > 0L) {
            long v2 = Math.min(this.maxFrameSize, v1);
            v1 -= v2;
            this.frameHeader(v, ((int)v2), 9, (v1 == 0L ? 4 : 0));
            this.sink.write(this.hpackBuffer, v2);
        }
    }
}

