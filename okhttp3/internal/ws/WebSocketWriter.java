package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okio.l.a;
import okio.o;
import y4.l;
import y4.m;

@s0({"SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nokhttp3/internal/ws/WebSocketWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    @m
    private final a maskCursor;
    @m
    private final byte[] maskKey;
    @l
    private final okio.l messageBuffer;
    @m
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    @l
    private final Random random;
    @l
    private final okio.m sink;
    @l
    private final okio.l sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, @l okio.m m0, @l Random random0, boolean z1, boolean z2, long v) {
        L.p(m0, "sink");
        L.p(random0, "random");
        super();
        this.isClient = z;
        this.sink = m0;
        this.random = random0;
        this.perMessageDeflate = z1;
        this.noContextTakeover = z2;
        this.minimumDeflateSize = v;
        this.messageBuffer = new okio.l();
        this.sinkBuffer = m0.E();
        a l$a0 = null;
        this.maskKey = z ? new byte[4] : null;
        if(z) {
            l$a0 = new a();
        }
        this.maskCursor = l$a0;
    }

    @Override
    public void close() {
        MessageDeflater messageDeflater0 = this.messageDeflater;
        if(messageDeflater0 != null) {
            messageDeflater0.close();
        }
    }

    @l
    public final Random getRandom() {
        return this.random;
    }

    @l
    public final okio.m getSink() {
        return this.sink;
    }

    public final void writeClose(int v, @m o o0) throws IOException {
        o o1 = o.f;
        if(v != 0 || o0 != null) {
            if(v != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(v);
            }
            okio.l l0 = new okio.l();
            l0.A2(v);
            if(o0 != null) {
                l0.t1(o0);
            }
            o1 = l0.B1();
        }
        try {
            this.writeControlFrame(8, o1);
            this.writerClosed = true;
        }
        catch(Throwable throwable0) {
            this.writerClosed = true;
            throw throwable0;
        }
    }

    private final void writeControlFrame(int v, o o0) throws IOException {
        if(this.writerClosed) {
            throw new IOException("closed");
        }
        int v1 = o0.h0();
        if(((long)v1) > 0x7DL) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.e2(v | 0x80);
        if(this.isClient) {
            this.sinkBuffer.e2(v1 | 0x80);
            L.m(this.maskKey);
            this.random.nextBytes(this.maskKey);
            this.sinkBuffer.Q1(this.maskKey);
            if(v1 > 0) {
                this.sinkBuffer.t1(o0);
                L.m(this.maskCursor);
                this.sinkBuffer.h0(this.maskCursor);
                this.maskCursor.f(this.sinkBuffer.size());
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        else {
            this.sinkBuffer.e2(v1);
            this.sinkBuffer.t1(o0);
        }
        this.sink.flush();
    }

    public final void writeMessageFrame(int v, @l o o0) throws IOException {
        L.p(o0, "data");
        if(this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.t1(o0);
        int v1 = v | 0x80;
        if(this.perMessageDeflate && ((long)o0.h0()) >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater0 = this.messageDeflater;
            if(messageDeflater0 == null) {
                messageDeflater0 = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater0;
            }
            messageDeflater0.deflate(this.messageBuffer);
            v1 = v | 0xC0;
        }
        long v2 = this.messageBuffer.size();
        this.sinkBuffer.e2(v1);
        int v3 = this.isClient ? 0x80 : 0;
        if(v2 <= 0x7DL) {
            this.sinkBuffer.e2(v3 | ((int)v2));
        }
        else if(v2 <= 0xFFFFL) {
            this.sinkBuffer.e2(v3 | 0x7E);
            this.sinkBuffer.A2(((int)v2));
        }
        else {
            this.sinkBuffer.e2(v3 | 0x7F);
            this.sinkBuffer.p2(v2);
        }
        if(this.isClient) {
            L.m(this.maskKey);
            this.random.nextBytes(this.maskKey);
            this.sinkBuffer.Q1(this.maskKey);
            if(v2 > 0L) {
                L.m(this.maskCursor);
                this.messageBuffer.h0(this.maskCursor);
                this.maskCursor.f(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, v2);
        this.sink.X1();
    }

    public final void writePing(@l o o0) throws IOException {
        L.p(o0, "payload");
        this.writeControlFrame(9, o0);
    }

    public final void writePong(@l o o0) throws IOException {
        L.p(o0, "payload");
        this.writeControlFrame(10, o0);
    }
}

