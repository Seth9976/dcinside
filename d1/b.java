package d1;

import android.graphics.Bitmap;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import x0.a;
import y4.l;
import z3.n;

public final class b {
    @l
    public static final b a = null;
    @l
    private static final String b = "IterativeBoxBlurFilter";

    static {
        b.a = new b();
    }

    private final int a(int v, int v1, int v2) {
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    @n
    public static final void b(@l Bitmap bitmap0, int v, int v1) {
        L.p(bitmap0, "bitmap");
        com.facebook.common.internal.n.d(Boolean.valueOf(bitmap0.isMutable()));
        com.facebook.common.internal.n.d(Boolean.valueOf(((float)bitmap0.getHeight()) <= 2048.0f));
        com.facebook.common.internal.n.d(Boolean.valueOf(((float)bitmap0.getWidth()) <= 2048.0f));
        com.facebook.common.internal.n.d(Boolean.valueOf(v1 > 0 && v1 <= 25));
        com.facebook.common.internal.n.d(Boolean.valueOf(v > 0));
        try {
            b.a.c(bitmap0, v, v1);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            String s = String.format(null, "OOM: %d iterations on %dx%d with %d radius", Arrays.copyOf(new Object[]{v, bitmap0.getWidth(), bitmap0.getHeight(), v1}, 4));
            L.o(s, "format(...)");
            a.u("IterativeBoxBlurFilter", s);
            throw outOfMemoryError0;
        }
    }

    private final void c(Bitmap bitmap0, int v, int v1) {
        int v2 = bitmap0.getWidth();
        int v3 = bitmap0.getHeight();
        int[] arr_v = new int[v2 * v3];
        bitmap0.getPixels(arr_v, 0, v2, 0, 0, v2, v3);
        int v4 = v1 + 1;
        int v5 = v4 + v1;
        int[] arr_v1 = new int[v5 * 0x100];
        for(int v6 = 1; v6 < 0x100; ++v6) {
            for(int v7 = 0; v7 < v5; ++v7) {
                arr_v1[v4] = v6;
                ++v4;
            }
        }
        int[] arr_v2 = new int[Math.max(v2, v3)];
        for(int v8 = 0; v8 < v; ++v8) {
            for(int v9 = 0; v9 < v3; ++v9) {
                this.d(arr_v, arr_v2, v2, v9, v5, arr_v1);
                System.arraycopy(arr_v2, 0, arr_v, v9 * v2, v2);
            }
            for(int v10 = 0; v10 < v2; ++v10) {
                this.e(arr_v, arr_v2, v2, v3, v10, v5, arr_v1);
                int v11 = v10;
                for(int v12 = 0; v12 < v3; ++v12) {
                    arr_v[v11] = arr_v2[v12];
                    v11 += v2;
                }
            }
        }
        bitmap0.setPixels(arr_v, 0, v2, 0, 0, v2, v3);
    }

    private final void d(int[] arr_v, int[] arr_v1, int v, int v1, int v2, int[] arr_v2) {
        int v3 = v * v1;
        int v4 = (v1 + 1) * v - 1;
        int v5 = -(v2 >> 1);
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        while(v5 < v + (v2 >> 1)) {
            int v10 = arr_v[this.a(v3 + v5, v3, v4)];
            v6 += v10 >> 16 & 0xFF;
            v7 += v10 >> 8 & 0xFF;
            v8 += v10 & 0xFF;
            v9 += v10 >>> 24;
            if(v5 >= v2 >> 1) {
                arr_v1[v5 - (v2 >> 1)] = arr_v2[v9] << 24 | arr_v2[v6] << 16 | arr_v2[v7] << 8 | arr_v2[v8];
                int v11 = arr_v[this.a(v5 - (v2 - 1) + v3, v3, v4)];
                v6 -= v11 >> 16 & 0xFF;
                v7 -= v11 >> 8 & 0xFF;
                v8 -= v11 & 0xFF;
                v9 -= v11 >>> 24;
            }
            ++v5;
        }
    }

    private final void e(int[] arr_v, int[] arr_v1, int v, int v1, int v2, int v3, int[] arr_v2) {
        int v4 = (v1 - 1) * v + v2;
        int v5 = (v3 >> 1) * v;
        int v6 = v2 - v5;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        int v10 = 0;
        int v11 = 0;
        while(v6 <= v4 + v5) {
            int v12 = arr_v[this.a(v6, v2, v4)];
            v7 += v12 >> 16 & 0xFF;
            v8 += v12 >> 8 & 0xFF;
            v9 += v12 & 0xFF;
            v10 += v12 >>> 24;
            if(v6 - v5 >= v2) {
                arr_v1[v11] = arr_v2[v10] << 24 | arr_v2[v7] << 16 | arr_v2[v8] << 8 | arr_v2[v9];
                ++v11;
                int v13 = arr_v[this.a(v6 - (v3 - 1) * v, v2, v4)];
                v7 -= v13 >> 16 & 0xFF;
                v8 -= v13 >> 8 & 0xFF;
                v9 -= v13 & 0xFF;
                v10 -= v13 >>> 24;
            }
            v6 += v;
        }
    }
}

