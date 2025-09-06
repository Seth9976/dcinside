package androidx.media3.common.util;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UnstableApi
public final class CodecSpecificDataUtil {
    private static final byte[] a = null;
    private static final String[] b = null;
    private static final int c = 1;
    private static final int d = 0x20;
    private static final int e = 15;
    private static final int f;

    static {
        CodecSpecificDataUtil.a = new byte[]{0, 0, 0, 1};
        CodecSpecificDataUtil.b = new String[]{"", "A", "B", "C"};
    }

    public static String a(int v, int v1, int v2) {
        return String.format("avc1.%02X%02X%02X", v, v1, v2);
    }

    // 去混淆评级： 低(20)
    public static List b(boolean z) {
        return z ? Collections.singletonList(new byte[]{1}) : Collections.singletonList(new byte[]{0});
    }

    public static String c(int v, boolean z, int v1, int v2, int[] arr_v, int v3) {
        StringBuilder stringBuilder0 = new StringBuilder(Util.S("hvc1.%s%d.%X.%c%d", new Object[]{CodecSpecificDataUtil.b[v], v1, v2, Character.valueOf(((char)(z ? 72 : 76))), v3}));
        int v4;
        for(v4 = arr_v.length; v4 > 0 && arr_v[v4 - 1] == 0; --v4) {
        }
        for(int v5 = 0; v5 < v4; ++v5) {
            stringBuilder0.append(String.format(".%02X", ((int)arr_v[v5])));
        }
        return stringBuilder0.toString();
    }

    public static byte[] d(byte[] arr_b, int v, int v1) {
        byte[] arr_b1 = new byte[CodecSpecificDataUtil.a.length + v1];
        System.arraycopy(CodecSpecificDataUtil.a, 0, arr_b1, 0, CodecSpecificDataUtil.a.length);
        System.arraycopy(arr_b, v, arr_b1, CodecSpecificDataUtil.a.length, v1);
        return arr_b1;
    }

    private static int e(byte[] arr_b, int v) {
        int v1 = arr_b.length - CodecSpecificDataUtil.a.length;
        while(v <= v1) {
            if(CodecSpecificDataUtil.g(arr_b, v)) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public static Pair f(byte[] arr_b) {
        boolean z;
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(arr_b);
        int v = 0;
        int v1;
        for(v1 = 0; true; ++v1) {
            z = false;
            if(v1 + 3 >= arr_b.length) {
                break;
            }
            if(parsableByteArray0.O() == 1 && (arr_b[v1 + 3] & 0xF0) == 0x20) {
                z = true;
                break;
            }
            parsableByteArray0.Y(parsableByteArray0.f() - 2);
        }
        Assertions.b(z, "Invalid input: VOL not found.");
        ParsableBitArray parsableBitArray0 = new ParsableBitArray(arr_b);
        parsableBitArray0.s((v1 + 4) * 8);
        parsableBitArray0.s(1);
        parsableBitArray0.s(8);
        if(parsableBitArray0.g()) {
            parsableBitArray0.s(4);
            parsableBitArray0.s(3);
        }
        if(parsableBitArray0.h(4) == 15) {
            parsableBitArray0.s(8);
            parsableBitArray0.s(8);
        }
        if(parsableBitArray0.g()) {
            parsableBitArray0.s(2);
            parsableBitArray0.s(1);
            if(parsableBitArray0.g()) {
                parsableBitArray0.s(0x4F);
            }
        }
        Assertions.b(parsableBitArray0.h(2) == 0, "Only supports rectangular video object layer shape.");
        Assertions.a(parsableBitArray0.g());
        int v2 = parsableBitArray0.h(16);
        Assertions.a(parsableBitArray0.g());
        if(parsableBitArray0.g()) {
            Assertions.a(v2 > 0);
            for(int v3 = v2 - 1; v3 > 0; v3 >>= 1) {
                ++v;
            }
            parsableBitArray0.s(v);
        }
        Assertions.a(parsableBitArray0.g());
        int v4 = parsableBitArray0.h(13);
        Assertions.a(parsableBitArray0.g());
        int v5 = parsableBitArray0.h(13);
        Assertions.a(parsableBitArray0.g());
        parsableBitArray0.s(1);
        return Pair.create(v4, v5);
    }

    private static boolean g(byte[] arr_b, int v) {
        if(arr_b.length - v <= CodecSpecificDataUtil.a.length) {
            return false;
        }
        for(int v1 = 0; true; ++v1) {
            byte[] arr_b1 = CodecSpecificDataUtil.a;
            if(v1 >= arr_b1.length) {
                break;
            }
            if(arr_b[v + v1] != arr_b1[v1]) {
                return false;
            }
        }
        return true;
    }

    public static Pair h(byte[] arr_b) {
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(arr_b);
        parsableByteArray0.Y(9);
        int v = parsableByteArray0.L();
        parsableByteArray0.Y(20);
        return Pair.create(parsableByteArray0.P(), v);
    }

    public static boolean i(List list0) {
        return list0.size() == 1 && ((byte[])list0.get(0)).length == 1 && ((byte[])list0.get(0))[0] == 1;
    }

    @Nullable
    public static byte[][] j(byte[] arr_b) {
        if(!CodecSpecificDataUtil.g(arr_b, 0)) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        do {
            arrayList0.add(v);
            v = CodecSpecificDataUtil.e(arr_b, v + CodecSpecificDataUtil.a.length);
        }
        while(v != -1);
        byte[][] arr2_b = new byte[arrayList0.size()][];
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            int v2 = (int)(((Integer)arrayList0.get(v1)));
            int v3 = (v1 >= arrayList0.size() - 1 ? arr_b.length : ((int)(((Integer)arrayList0.get(v1 + 1))))) - v2;
            byte[] arr_b1 = new byte[v3];
            System.arraycopy(arr_b, v2, arr_b1, 0, v3);
            arr2_b[v1] = arr_b1;
        }
        return arr2_b;
    }
}

