package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.Util;
import okio.l.a;
import okio.n;
import okio.o;
import y4.l;
import y4.m;

@s0({"SMAP\nWebSocketReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketReader.kt\nokhttp3/internal/ws/WebSocketReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
public final class WebSocketReader implements Closeable {
    public interface FrameCallback {
        void onReadClose(int arg1, @l String arg2);

        void onReadMessage(@l String arg1) throws IOException;

        void onReadMessage(@l o arg1) throws IOException;

        void onReadPing(@l o arg1);

        void onReadPong(@l o arg1);
    }

    private boolean closed;
    @l
    private final okio.l controlFrameBuffer;
    @l
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    @m
    private final a maskCursor;
    @m
    private final byte[] maskKey;
    @l
    private final okio.l messageFrameBuffer;
    @m
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    @l
    private final n source;

    public WebSocketReader(boolean z, @l n n0, @l FrameCallback webSocketReader$FrameCallback0, boolean z1, boolean z2) {
        L.p(n0, "source");
        L.p(webSocketReader$FrameCallback0, "frameCallback");
        super();
        this.isClient = z;
        this.source = n0;
        this.frameCallback = webSocketReader$FrameCallback0;
        this.perMessageDeflate = z1;
        this.noContextTakeover = z2;
        this.controlFrameBuffer = new okio.l();
        this.messageFrameBuffer = new okio.l();
        a l$a0 = null;
        this.maskKey = z ? null : new byte[4];
        if(!z) {
            l$a0 = new a();
        }
        this.maskCursor = l$a0;
    }

    @Override
    public void close() throws IOException {
        MessageInflater messageInflater0 = this.messageInflater;
        if(messageInflater0 != null) {
            messageInflater0.close();
        }
    }

    @l
    public final n getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        this.readHeader();
        if(this.isControlFrame) {
            this.readControlFrame();
            return;
        }
        this.readMessageFrame();
    }

    private final void readControlFrame() throws IOException {
        int v2;
        long v = this.frameLength;
        if(v > 0L) {
            this.source.l2(this.controlFrameBuffer, v);
            if(!this.isClient) {
                L.m(this.maskCursor);
                this.controlFrameBuffer.h0(this.maskCursor);
                this.maskCursor.f(0L);
                L.m(this.maskKey);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch(this.opcode) {
            case 8: {
                long v1 = this.controlFrameBuffer.size();
                if(v1 == 1L) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if(v1 == 0L) {
                    v2 = 1005;
                }
                else {
                    v2 = this.controlFrameBuffer.readShort();
                    String s = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(v2);
                    if(s != null) {
                        throw new ProtocolException(s);
                    }
                }
                this.frameCallback.onReadClose(v2, "");
                this.closed = true;
                return;
            }
            case 9: {
                o o0 = this.controlFrameBuffer.B1();
                this.frameCallback.onReadPing(o0);
                return;
            }
            case 10: {
                o o1 = this.controlFrameBuffer.B1();
                this.frameCallback.onReadPong(o1);
                return;
            }
            default: {
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.opcode));
            }
        }
    }

    private final void readHeader() throws IOException, ProtocolException {
        int v2;
        boolean z4;
        if(this.closed) {
            throw new IOException("closed");
        }
        long v = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            v2 = Util.and(this.source.readByte(), ((byte)0xFF));
        }
        finally {
            this.source.timeout().timeout(v, TimeUnit.NANOSECONDS);
        }
        this.opcode = v2 & 15;
        boolean z = false;
        boolean z1 = (v2 & 0x80) != 0;
        this.isFinalFrame = z1;
        boolean z2 = (v2 & 8) != 0;
        this.isControlFrame = z2;
        if(z2 && !z1) {
            throw new ProtocolException("Control frames must be final.");
        }
        boolean z3 = (v2 & 0x40) != 0;
        if((v2 & 15) == 1 || (v2 & 15) == 2) {
            if(z3) {
                if(!this.perMessageDeflate) {
                    throw new ProtocolException("Unexpected rsv1 flag");
                }
                z4 = true;
            }
            else {
                z4 = false;
            }
            this.readingCompressedMessage = z4;
        }
        else if(z3) {
            throw new ProtocolException("Unexpected rsv1 flag");
        }
        if((v2 & 0x20) != 0) {
            throw new ProtocolException("Unexpected rsv2 flag");
        }
        if((v2 & 16) != 0) {
            throw new ProtocolException("Unexpected rsv3 flag");
        }
        int v3 = Util.and(this.source.readByte(), ((byte)0xFF));
        if((v3 & 0x80) != 0) {
            z = true;
        }
        if(z == this.isClient) {
            throw new ProtocolException((this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked."));
        }
        this.frameLength = (long)(v3 & 0x7F);
        if(((long)(v3 & 0x7F)) == 0x7EL) {
            this.frameLength = (long)Util.and(this.source.readShort(), ((short)0xFFFF));
        }
        else if(((long)(v3 & 0x7F)) == 0x7FL) {
            long v4 = this.source.readLong();
            this.frameLength = v4;
            if(v4 < 0L) {
                throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
            }
        }
        if(this.isControlFrame && this.frameLength > 0x7DL) {
            throw new ProtocolException("Control frame must be less than 125B.");
        }
        if(z) {
            L.m(this.maskKey);
            this.source.readFully(this.maskKey);
        }
    }

    private final void readMessage() throws IOException {
        while(!this.closed) {
            long v = this.frameLength;
            if(v > 0L) {
                this.source.l2(this.messageFrameBuffer, v);
                if(!this.isClient) {
                    L.m(this.maskCursor);
                    this.messageFrameBuffer.h0(this.maskCursor);
                    this.maskCursor.f(this.messageFrameBuffer.size() - this.frameLength);
                    L.m(this.maskKey);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if(!this.isFinalFrame) {
                this.readUntilNonControlFrame();
                if(this.opcode != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.opcode));
                }
                continue;
            }
            return;
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws IOException {
        int v = this.opcode;
        if(v != 1 && v != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(v));
        }
        this.readMessage();
        if(this.readingCompressedMessage) {
            MessageInflater messageInflater0 = this.messageInflater;
            if(messageInflater0 == null) {
                messageInflater0 = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater0;
            }
            messageInflater0.inflate(this.messageFrameBuffer);
        }
        if(v == 1) {
            this.frameCallback.onReadMessage("");
            return;
        }
        o o0 = this.messageFrameBuffer.B1();
        this.frameCallback.onReadMessage(o0);
    }

    private final void readUntilNonControlFrame() throws IOException {
        while(!this.closed) {
            this.readHeader();
            if(!this.isControlFrame) {
                break;
            }
            this.readControlFrame();
        }
    }
}

