package okhttp3.internal.ws;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okio.l.a;
import okio.o;
import y4.l;
import y4.m;

@s0({"SMAP\nWebSocketProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketProtocol.kt\nokhttp3/internal/ws/WebSocketProtocol\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
public final class WebSocketProtocol {
    @l
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 0x80;
    public static final int B0_FLAG_RSV1 = 0x40;
    public static final int B0_FLAG_RSV2 = 0x20;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 0x80;
    public static final int B1_MASK_LENGTH = 0x7F;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 0x7BL;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    @l
    public static final WebSocketProtocol INSTANCE = null;
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 0x7DL;
    public static final int PAYLOAD_LONG = 0x7F;
    public static final int PAYLOAD_SHORT = 0x7E;
    public static final long PAYLOAD_SHORT_MAX = 0xFFFFL;

    static {
        WebSocketProtocol.INSTANCE = new WebSocketProtocol();
    }

    @l
    public final String acceptHeader(@l String s) {
        L.p(s, "key");
        return o.d.l(s + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").e0().d();
    }

    @m
    public final String closeCodeExceptionMessage(int v) {
        if(v >= 1000 && v < 5000) {
            return (1004 > v || v >= 1007) && (0x3F7 > v || v >= 3000) ? null : "Code " + v + " is reserved and may not be used.";
        }
        return "Code must be in range [1000,5000): " + v;
    }

    public final void toggleMask(@l a l$a0, @l byte[] arr_b) {
        L.p(l$a0, "cursor");
        L.p(arr_b, "key");
        do {
            byte[] arr_b1 = l$a0.e;
            int v1 = l$a0.f;
            int v2 = l$a0.g;
            if(arr_b1 != null) {
                for(int v = 0; v1 < v2; v = v3 + 1) {
                    int v3 = v % arr_b.length;
                    arr_b1[v1] = (byte)(arr_b1[v1] ^ arr_b[v3]);
                    ++v1;
                }
            }
        }
        while(l$a0.c() != -1);
    }

    public final void validateCloseCode(int v) {
        String s = this.closeCodeExceptionMessage(v);
        if(s == null) {
            return;
        }
        L.m(s);
        throw new IllegalArgumentException(s.toString());
    }
}

