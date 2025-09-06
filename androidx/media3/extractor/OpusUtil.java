package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public class OpusUtil {
    public static final int a = 48000;
    public static final int b = 0xF906;
    private static final int c = 0xF00;
    private static final int d = 3;

    public static List a(byte[] arr_b) {
        long v = OpusUtil.k(OpusUtil.f(arr_b));
        List list0 = new ArrayList(3);
        list0.add(arr_b);
        list0.add(OpusUtil.b(v));
        list0.add(new byte[]{0, -76, -60, 4, 0, 0, 0, 0});
        return list0;
    }

    private static byte[] b(long v) [...] // 潜在的解密器

    public static int c(byte[] arr_b) {
        return arr_b[9] & 0xFF;
    }

    private static long d(byte b, byte b1) {
        int v = 2;
        if((b & 3) == 0) {
            v = 1;
        }
        else if((b & 3) != 1 && (b & 3) != 2) {
            v = b1 & 0x3F;
        }
        int v1 = (b & 0xFF) >> 3;
        if(v1 >= 16) {
            return ((long)v) * ((long)(2500 << (v1 & 3)));
        }
        if(v1 >= 12) {
            return ((long)v) * ((long)(10000 << (v1 & 1)));
        }
        return (v1 & 3) == 3 ? ((long)v) * 60000L : ((long)v) * ((long)(10000 << (v1 & 3)));
    }

    public static long e(byte[] arr_b) {
        int v = 0;
        int v1 = arr_b[0];
        if(arr_b.length > 1) {
            v = arr_b[1];
        }
        return OpusUtil.d(((byte)v1), ((byte)v));
    }

    public static int f(byte[] arr_b) {
        return arr_b[10] & 0xFF | (arr_b[11] & 0xFF) << 8;
    }

    public static boolean g(long v, long v1) {
        return v - v1 <= 80000L;
    }

    public static int h(ByteBuffer byteBuffer0) {
        int v = OpusUtil.i(byteBuffer0);
        int v1 = byteBuffer0.get(v + 26) + 27 + v;
        int v2 = byteBuffer0.get(v1);
        return byteBuffer0.limit() - v1 <= 1 ? ((int)(OpusUtil.d(((byte)v2), ((byte)0)) * 48000L / 1000000L)) : ((int)(OpusUtil.d(((byte)v2), byteBuffer0.get(v1 + 1)) * 48000L / 1000000L));
    }

    public static int i(ByteBuffer byteBuffer0) {
        if((byteBuffer0.get(5) & 2) == 0) {
            return 0;
        }
        int v1 = byteBuffer0.get(26);
        int v2 = 28;
        int v4 = 28;
        for(int v3 = 0; v3 < v1; ++v3) {
            v4 += byteBuffer0.get(v3 + 27);
        }
        int v5 = byteBuffer0.get(v4 + 26);
        for(int v = 0; v < v5; ++v) {
            v2 += byteBuffer0.get(v4 + 27 + v);
        }
        return v4 + v2;
    }

    public static int j(ByteBuffer byteBuffer0) {
        int v = 0;
        int v1 = byteBuffer0.get(0);
        if(byteBuffer0.limit() > 1) {
            v = byteBuffer0.get(1);
        }
        return (int)(OpusUtil.d(((byte)v1), ((byte)v)) * 48000L / 1000000L);
    }

    private static long k(long v) [...] // Inlined contents
}

