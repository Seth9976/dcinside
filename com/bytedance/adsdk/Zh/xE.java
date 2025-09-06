package com.bytedance.adsdk.Zh;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

class xE implements Interpolator {
    private final float[] PjT;
    private final float[] Zh;

    xE(float f, float f1, float f2, float f3) {
        this(xE.PjT(f, f1, f2, f3));
    }

    xE(Path path0) {
        PathMeasure pathMeasure0 = new PathMeasure(path0, false);
        float f = pathMeasure0.getLength();
        int v = ((int)(f / 0.002f)) + 1;
        this.PjT = new float[v];
        this.Zh = new float[v];
        float[] arr_f = new float[2];
        for(int v1 = 0; v1 < v; ++v1) {
            pathMeasure0.getPosTan(((float)v1) * f / ((float)(((int)(f / 0.002f)))), arr_f, null);
            this.PjT[v1] = arr_f[0];
            this.Zh[v1] = arr_f[1];
        }
    }

    private static Path PjT(float f, float f1, float f2, float f3) {
        Path path0 = new Path();
        path0.moveTo(0.0f, 0.0f);
        path0.cubicTo(f, f1, f2, f3, 1.0f, 1.0f);
        return path0;
    }

    @Override  // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if(f <= 0.0f) {
            return 0.0f;
        }
        if(f >= 1.0f) {
            return 1.0f;
        }
        int v = this.PjT.length - 1;
        int v1 = 0;
        while(v - v1 > 1) {
            int v2 = (v1 + v) / 2;
            if(f < this.PjT[v2]) {
                v = v2;
            }
            else {
                v1 = v2;
            }
        }
        float f1 = this.PjT[v];
        float f2 = this.PjT[v1];
        float f3 = f1 - f2;
        if(f3 == 0.0f) {
            return this.Zh[v1];
        }
        float f4 = this.Zh[v1];
        return f4 + (f - f2) / f3 * (this.Zh[v] - f4);
    }
}

