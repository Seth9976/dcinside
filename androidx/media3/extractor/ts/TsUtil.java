package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class TsUtil {
    public static int a(byte[] arr_b, int v, int v1) {
        while(v < v1 && arr_b[v] != 71) {
            ++v;
        }
        return v;
    }

    public static boolean b(byte[] arr_b, int v, int v1, int v2) {
        int v3 = 0;
        for(int v4 = -4; v4 <= 4; ++v4) {
            int v5 = v4 * 0xBC + v2;
            if(v5 < v || v5 >= v1 || arr_b[v5] != 71) {
                v3 = 0;
            }
            else {
                ++v3;
                if(v3 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long c(ParsableByteArray parsableByteArray0, int v, int v1) {
        parsableByteArray0.Y(v);
        if(parsableByteArray0.a() < 5) {
            return 0x8000000000000001L;
        }
        int v2 = parsableByteArray0.s();
        if((0x800000 & v2) != 0) {
            return 0x8000000000000001L;
        }
        if((0x1FFF00 & v2) >> 8 != v1) {
            return 0x8000000000000001L;
        }
        if((v2 & 0x20) != 0 && parsableByteArray0.L() >= 7 && parsableByteArray0.a() >= 7 && (parsableByteArray0.L() & 16) == 16) {
            byte[] arr_b = new byte[6];
            parsableByteArray0.n(arr_b, 0, 6);
            return TsUtil.d(arr_b);
        }
        return 0x8000000000000001L;
    }

    private static long d(byte[] arr_b) {
        return (((long)arr_b[0]) & 0xFFL) << 25 | (((long)arr_b[1]) & 0xFFL) << 17 | (((long)arr_b[2]) & 0xFFL) << 9 | (((long)arr_b[3]) & 0xFFL) << 1 | (0xFFL & ((long)arr_b[4])) >> 7;
    }
}

