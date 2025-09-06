package androidx.work;

import kotlin.jvm.internal.L;
import y4.l;

public final class Data_Kt {
    @l
    private static final String a;

    // 去混淆评级： 低(20)
    static {
        L.o("WM-Data", "tagWithPrefix(\"Data\")");
        Data_Kt.a = "WM-Data";
    }

    // 去混淆评级： 低(20)
    public static final String g() [...] // 潜在的解密器

    private static final Boolean[] h(boolean[] arr_z) {
        Boolean[] arr_boolean = new Boolean[arr_z.length];
        for(int v = 0; v < arr_z.length; ++v) {
            arr_boolean[v] = Boolean.valueOf(arr_z[v]);
        }
        return arr_boolean;
    }

    private static final Byte[] i(byte[] arr_b) {
        Byte[] arr_byte = new Byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_byte[v] = (byte)arr_b[v];
        }
        return arr_byte;
    }

    private static final Double[] j(double[] arr_f) {
        Double[] arr_double = new Double[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            arr_double[v] = (double)arr_f[v];
        }
        return arr_double;
    }

    private static final Float[] k(float[] arr_f) {
        Float[] arr_float = new Float[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            arr_float[v] = (float)arr_f[v];
        }
        return arr_float;
    }

    private static final Integer[] l(int[] arr_v) {
        Integer[] arr_integer = new Integer[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_integer[v] = (int)arr_v[v];
        }
        return arr_integer;
    }

    private static final Long[] m(long[] arr_v) {
        Long[] arr_long = new Long[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_long[v] = (long)arr_v[v];
        }
        return arr_long;
    }
}

