package a1;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public final class a {
    public static final class a1.a.a {
        private a1.a.a() {
        }

        public a1.a.a(w w0) {
        }

        @n
        public final boolean a(int v, int v1, int v2) {
            if(v != -1 && v1 != -1) {
                return v > v1 ? v2 < v && v2 > v1 : v2 < v || v2 > v1;
            }
            return true;
        }
    }

    @l
    public static final a1.a.a a = null;
    private static final int b = 11;
    private static final int c = 100;

    static {
        a.a = new a1.a.a(null);
    }

    public final void a(@l int[] arr_v) {
        L.p(arr_v, "frameDurationMs");
        for(int v = 0; v < arr_v.length; ++v) {
            if(arr_v[v] < 11) {
                arr_v[v] = 100;
            }
        }
    }

    public final int b(@m int[] arr_v, int v) {
        int v1 = Arrays.binarySearch(arr_v, v);
        return v1 >= 0 ? v1 : -v1 - 2;
    }

    @l
    public final int[] c(@l int[] arr_v) {
        L.p(arr_v, "frameDurationsMs");
        int[] arr_v1 = new int[arr_v.length];
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            arr_v1[v] = v1;
            v1 += arr_v[v];
        }
        return arr_v1;
    }

    @SuppressLint({"NewApi"})
    public final int d(@l Bitmap bitmap0) {
        L.p(bitmap0, "bitmap");
        return bitmap0.getAllocationByteCount();
    }

    public final int e(@l int[] arr_v) {
        L.p(arr_v, "frameDurationMs");
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += arr_v[v];
        }
        return v1;
    }

    @n
    public static final boolean f(int v, int v1, int v2) {
        return a.a.a(v, v1, v2);
    }
}

