package X2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.PathInterpolator;

public final class a {
    private static b[] a(b[] arr_b) {
        int v3;
        int v = arr_b.length - 1;
        b[] arr_b1 = new b[v];
        if(v == 1) {
            b b0 = arr_b[0];
            arr_b1[0] = new b((b0.a * 2.0f + arr_b[1].a) / 3.0f, (b0.b * 2.0f + arr_b[1].b) / 3.0f);
            return arr_b1;
        }
        float[] arr_f = new float[v];
        for(int v2 = 1; true; ++v2) {
            v3 = arr_b.length - 2;
            if(v2 >= v3) {
                break;
            }
            arr_f[v2] = arr_b[v2].a * 4.0f + arr_b[v2 + 1].a * 2.0f;
        }
        arr_f[0] = arr_b[0].a + arr_b[1].a * 2.0f;
        arr_f[v3] = (arr_b[v3].a * 8.0f + arr_b[v].a) / 2.0f;
        float[] arr_f1 = a.c(arr_f);
        for(int v4 = 1; v4 < v3; ++v4) {
            arr_f[v4] = arr_b[v4].b * 4.0f + arr_b[v4 + 1].b * 2.0f;
        }
        arr_f[0] = arr_b[0].b + arr_b[1].b * 2.0f;
        arr_f[v3] = (arr_b[v3].b * 8.0f + arr_b[v].b) / 2.0f;
        float[] arr_f2 = a.c(arr_f);
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b1[v1] = new b(arr_f1[v1], arr_f2[v1]);
        }
        return arr_b1;
    }

    public static int[] b(b[] arr_b) {
        if(arr_b == null) {
            throw new NullPointerException("Knots cannot be null");
        }
        if(arr_b.length - 1 < 1) {
            throw new IllegalArgumentException("Atleast two points are required");
        }
        return a.d(arr_b);
    }

    private static float[] c(float[] arr_f) {
        float[] arr_f1 = new float[arr_f.length];
        float[] arr_f2 = new float[arr_f.length];
        arr_f1[0] = arr_f[0] / 1.0f;
        float f = 1.0f;
        for(int v1 = 1; v1 < arr_f.length; ++v1) {
            arr_f2[v1] = 1.0f / f;
            f = (v1 >= arr_f.length - 1 ? 3.5f : 4.0f) - 1.0f / f;
            arr_f1[v1] = (arr_f[v1] - arr_f1[v1 - 1]) / f;
        }
        for(int v = 1; v < arr_f.length; ++v) {
            int v2 = arr_f.length - v;
            arr_f1[v2 - 1] -= arr_f2[v2] * arr_f1[v2];
        }
        return arr_f1;
    }

    private static int[] d(b[] arr_b) {
        b[] arr_b1 = a.a(arr_b);
        Path path0 = new Path();
        path0.moveTo(0.0f, 0.0f);
        path0.lineTo(arr_b[0].a / 255.0f, arr_b[0].b / 255.0f);
        path0.moveTo(arr_b[0].a / 255.0f, arr_b[0].b / 255.0f);
        for(int v = 1; v < arr_b.length; ++v) {
            b b0 = arr_b1[v - 1];
            float f = b0.a / 255.0f;
            float f1 = b0.b / 255.0f;
            b b1 = arr_b[v];
            path0.quadTo(f, f1, b1.a / 255.0f, b1.b / 255.0f);
            b b2 = arr_b[v];
            path0.moveTo(b2.a / 255.0f, b2.b / 255.0f);
        }
        path0.lineTo(1.0f, 1.0f);
        path0.moveTo(1.0f, 1.0f);
        float[] arr_f = new float[0x100];
        for(int v1 = 0; v1 < 0x100; ++v1) {
            arr_f[v1] = new PathInterpolator(path0).getInterpolation(((float)v1) / 255.0f) * 255.0f;
        }
        arr_f[0] = arr_b[0].b;
        arr_f[0xFF] = arr_b[arr_b.length - 1].b;
        return a.f(arr_f);
    }

    private static int[] e(b[] arr_b) {
        b[] arr_b1 = a.a(arr_b);
        Path path0 = new Path();
        path0.moveTo(0.0f, 0.0f);
        path0.lineTo(arr_b[0].a, arr_b[0].b);
        path0.moveTo(arr_b[0].a, arr_b[0].b);
        for(int v1 = 1; v1 < arr_b.length; ++v1) {
            b b0 = arr_b1[v1 - 1];
            float f = b0.a;
            float f1 = b0.b;
            b b1 = arr_b[v1];
            path0.quadTo(f, f1, b1.a, b1.b);
            b b2 = arr_b[v1];
            path0.moveTo(b2.a, b2.b);
        }
        path0.lineTo(255.0f, 255.0f);
        path0.moveTo(255.0f, 255.0f);
        float[] arr_f = new float[0x100];
        PathMeasure pathMeasure0 = new PathMeasure(path0, false);
        for(int v2 = 0; v2 < 0x100; ++v2) {
            arr_f[v2] = -1.0f;
        }
        float[] arr_f1 = {0.0f, 0.0f};
        int v3 = 0;
        do {
            float f2 = pathMeasure0.getLength();
            for(float f3 = 0.0f; f3 <= f2; f3 += 0.08f) {
                pathMeasure0.getPosTan(f3, arr_f1, null);
                if(((int)arr_f1[0]) > v3 && v3 < 0x100) {
                    arr_f[v3] = arr_f1[1];
                    ++v3;
                }
                if(v3 > 0xFF) {
                    break;
                }
            }
        }
        while(pathMeasure0.nextContour());
        arr_f[0] = arr_b[0].b;
        for(int v = 0; v < 0x100; ++v) {
            if(arr_f[v] == -1.0f) {
                arr_f[v] = arr_f[v - 1];
            }
        }
        arr_f[0xFF] = arr_b[arr_b.length - 1].b;
        return a.f(arr_f);
    }

    private static int[] f(float[] arr_f) {
        int[] arr_v = new int[0x100];
        for(int v = 0; v < 0x100; ++v) {
            float f = arr_f[v];
            if(f > 255.0f) {
                arr_v[v] = 0xFF;
            }
            else if(f < 0.0f) {
                arr_v[v] = 0;
            }
            else {
                arr_v[v] = Math.round(f);
            }
        }
        return arr_v;
    }
}

