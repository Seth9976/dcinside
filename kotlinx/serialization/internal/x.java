package kotlinx.serialization.internal;

import java.util.Locale;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;

public final class X {
    @l
    public static final X a = null;
    @l
    private static final String b = "0123456789ABCDEF";

    static {
        X.a = new X();
    }

    private final int a(char c) {
        if(0x30 <= c && c < 58) {
            return c - 0x30;
        }
        if(65 <= c && c < 71) {
            return c - 55;
        }
        return 97 > c || c >= 103 ? -1 : c - 87;
    }

    @l
    public final byte[] b(@l String s) {
        L.p(s, "s");
        int v = s.length();
        if(v % 2 != 0) {
            throw new IllegalArgumentException("HexBinary string must be even length");
        }
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v; v1 += 2) {
            int v2 = this.a(s.charAt(v1));
            int v3 = this.a(s.charAt(v1 + 1));
            if(v2 == -1 || v3 == -1) {
                throw new IllegalArgumentException(("Invalid hex chars: " + s.charAt(v1) + s.charAt(v1 + 1)).toString());
            }
            arr_b[v1 / 2] = (byte)((v2 << 4) + v3);
        }
        return arr_b;
    }

    @l
    public final String c(@l byte[] arr_b, boolean z) {
        L.p(arr_b, "data");
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length * 2);
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            stringBuilder0.append("0123456789ABCDEF".charAt(v1 >> 4 & 15));
            stringBuilder0.append("0123456789ABCDEF".charAt(v1 & 15));
        }
        if(z) {
            String s = stringBuilder0.toString();
            L.o(s, "r.toString()");
            String s1 = s.toLowerCase(Locale.ROOT);
            L.o(s1, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return s1;
        }
        String s2 = stringBuilder0.toString();
        L.o(s2, "r.toString()");
        return s2;
    }

    public static String d(X x0, byte[] arr_b, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return x0.c(arr_b, z);
    }

    @l
    public final String e(int v) {
        byte[] arr_b = new byte[4];
        for(int v1 = 0; v1 < 4; ++v1) {
            arr_b[v1] = (byte)(v >> 24 - v1 * 8);
        }
        String s = v.X5(this.c(arr_b, true), new char[]{'0'});
        if(s.length() <= 0) {
            s = null;
        }
        return s == null ? "0" : s;
    }
}

