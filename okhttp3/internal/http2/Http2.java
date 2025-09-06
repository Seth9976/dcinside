package okhttp3.internal.http2;

import kotlin.jvm.internal.L;
import kotlin.text.v;
import okhttp3.internal.Util;
import okio.o;
import y4.l;
import z3.f;

public final class Http2 {
    @l
    private static final String[] BINARY = null;
    @l
    @f
    public static final o CONNECTION_PREFACE = null;
    @l
    private static final String[] FLAGS = null;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 0x20;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 0x20;
    @l
    private static final String[] FRAME_NAMES = null;
    public static final int INITIAL_MAX_FRAME_SIZE = 0x4000;
    @l
    public static final Http2 INSTANCE = null;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
        Http2.INSTANCE = new Http2();
        Http2.CONNECTION_PREFACE = o.d.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        Http2.FRAME_NAMES = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        Http2.FLAGS = new String[0x40];
        String[] arr_s = new String[0x100];
        for(int v1 = 0; v1 < 0x100; ++v1) {
            String s = Integer.toBinaryString(v1);
            L.o(s, "toBinaryString(it)");
            arr_s[v1] = v.k2(Util.format("%8s", new Object[]{s}), ' ', '0', false, 4, null);
        }
        Http2.BINARY = arr_s;
        Http2.FLAGS[0] = "";
        Http2.FLAGS[1] = "END_STREAM";
        Http2.FLAGS[8] = "PADDED";
        Http2.FLAGS[9] = Http2.FLAGS[1] + "|PADDED";
        Http2.FLAGS[4] = "END_HEADERS";
        Http2.FLAGS[0x20] = "PRIORITY";
        Http2.FLAGS[36] = "END_HEADERS|PRIORITY";
        for(int v2 = 0; v2 < 3; ++v2) {
            int v3 = new int[]{4, 0x20, 36}[v2];
            Http2.FLAGS[1 | v3] = Http2.FLAGS[1] + '|' + Http2.FLAGS[v3];
            Http2.FLAGS[1 | v3 | 8] = Http2.FLAGS[1] + '|' + Http2.FLAGS[v3] + "|PADDED";
        }
        for(int v = 0; v < Http2.FLAGS.length; ++v) {
            String[] arr_s1 = Http2.FLAGS;
            if(arr_s1[v] == null) {
                arr_s1[v] = Http2.BINARY[v];
            }
        }
    }

    @l
    public final String formatFlags(int v, int v1) {
        String s;
        if(v1 == 0) {
            return "";
        }
        switch(v) {
            case 4: 
            case 6: {
                return v1 == 1 ? "ACK" : Http2.BINARY[v1];
            }
            case 2: 
            case 3: 
            case 7: 
            case 8: {
                return Http2.BINARY[v1];
            }
            default: {
                String[] arr_s = Http2.FLAGS;
                if(v1 < arr_s.length) {
                    s = arr_s[v1];
                    L.m(s);
                }
                else {
                    s = Http2.BINARY[v1];
                }
                if(v == 5 && (v1 & 4) != 0) {
                    return v.l2(s, "HEADERS", "PUSH_PROMISE", false, 4, null);
                }
                return v != 0 || (v1 & 0x20) == 0 ? s : v.l2(s, "PRIORITY", "COMPRESSED", false, 4, null);
            }
        }
    }

    @l
    public final String formattedType$okhttp(int v) {
        return v >= Http2.FRAME_NAMES.length ? Util.format("0x%02x", new Object[]{v}) : Http2.FRAME_NAMES[v];
    }

    @l
    public final String frameLog(boolean z, int v, int v1, int v2, int v3) {
        String s = this.formattedType$okhttp(v2);
        String s1 = this.formatFlags(v2, v3);
        return z ? Util.format("%s 0x%08x %5d %-13s %s", new Object[]{"<<", v, v1, s, s1}) : Util.format("%s 0x%08x %5d %-13s %s", new Object[]{">>", v, v1, s, s1});
    }
}

