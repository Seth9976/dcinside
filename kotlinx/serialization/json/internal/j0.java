package kotlinx.serialization.json.internal;

import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class j0 {
    @l
    private static final String[] a;
    @l
    private static final byte[] b;

    static {
        String[] arr_s = new String[93];
        for(int v1 = 0; v1 < 0x20; ++v1) {
            arr_s[v1] = "\\u" + j0.g(v1 >> 12) + j0.g(v1 >> 8) + j0.g(v1 >> 4) + j0.g(v1);
        }
        arr_s[34] = "\\\"";
        arr_s[92] = "\\\\";
        arr_s[9] = "\\t";
        arr_s[8] = "\\b";
        arr_s[10] = "\\n";
        arr_s[13] = "\\r";
        arr_s[12] = "\\f";
        j0.a = arr_s;
        byte[] arr_b = new byte[93];
        for(int v = 0; v < 0x20; ++v) {
            arr_b[v] = 1;
        }
        arr_b[34] = 34;
        arr_b[92] = 92;
        arr_b[9] = 0x74;
        arr_b[8] = 98;
        arr_b[10] = 110;
        arr_b[13] = 0x72;
        arr_b[12] = 102;
        j0.b = arr_b;
    }

    @l
    public static final byte[] a() [...] // 潜在的解密器

    public static void b() {
    }

    @l
    public static final String[] c() {
        return j0.a;
    }

    @b0
    public static void d() {
    }

    public static final void e(@l StringBuilder stringBuilder0, @l String s) {
        L.p(stringBuilder0, "<this>");
        L.p(s, "value");
        stringBuilder0.append('\"');
        int v = s.length();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = s.charAt(v1);
            String[] arr_s = j0.a;
            if(v3 < arr_s.length && arr_s[v3] != null) {
                stringBuilder0.append(s, v2, v1);
                stringBuilder0.append(arr_s[v3]);
                v2 = v1 + 1;
            }
        }
        if(v2 == 0) {
            stringBuilder0.append(s);
        }
        else {
            stringBuilder0.append(s, v2, s.length());
        }
        stringBuilder0.append('\"');
    }

    @m
    public static final Boolean f(@l String s) {
        L.p(s, "<this>");
        if(v.O1(s, "true", true)) {
            return true;
        }
        return v.O1(s, "false", true) ? false : null;
    }

    private static final char g(int v) {
        return (v & 15) >= 10 ? ((char)((v & 15) + 87)) : ((char)((v & 15) + 0x30));
    }
}

