package com.facebook.imagepipeline.transcoder;

import X0.b;
import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.common.h;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;
import z3.n;

public final class a {
    @l
    public static final a a = null;
    public static final int b = 1;
    private static final float c = 0.333333f;

    static {
        a.a = new a();
    }

    @VisibleForTesting
    @n
    public static final float a(@l h h0, @m g g0, @l com.facebook.imagepipeline.image.l l0) {
        boolean z;
        L.p(h0, "rotationOptions");
        L.p(l0, "encodedImage");
        if(!com.facebook.imagepipeline.image.l.L(l0)) {
            throw new IllegalStateException("Check failed.");
        }
        if(g0 != null && g0.b > 0 && g0.a > 0 && l0.getWidth() != 0 && l0.getHeight() != 0) {
            switch(a.a.d(h0, l0)) {
                case 90: 
                case 270: {
                    z = true;
                    break;
                }
                default: {
                    z = false;
                }
            }
            int v = z ? l0.getHeight() : l0.getWidth();
            int v1 = z ? l0.getWidth() : l0.getHeight();
            float f = ((float)g0.a) / ((float)v);
            float f1 = ((float)g0.b) / ((float)v1);
            float f2 = s.t(f, f1);
            x0.a.i0("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", new Object[]{g0.a, g0.b, v, v1, f, f1, f2});
            return f2;
        }
        return 1.0f;
    }

    @n
    public static final int b(@l h h0, @m g g0, @l com.facebook.imagepipeline.image.l l0, int v) {
        L.p(h0, "rotationOptions");
        L.p(l0, "encodedImage");
        if(!com.facebook.imagepipeline.image.l.L(l0)) {
            return 1;
        }
        float f = a.a(h0, g0, l0);
        int v1 = l0.n() == b.b ? a.f(f) : a.e(f);
        int v2 = Math.max(l0.getHeight(), l0.getWidth());
        float f1 = g0 == null ? ((float)v) : g0.c;
        while(((float)(v2 / v1)) > f1) {
            if(l0.n() == b.b) {
                v1 *= 2;
            }
            else {
                ++v1;
            }
        }
        return v1;
    }

    @n
    public static final int c(@l com.facebook.imagepipeline.image.l l0, int v, int v1) {
        L.p(l0, "encodedImage");
        int v2 = l0.q();
        int v3 = l0.getWidth();
        int v4 = l0.getHeight();
        while(v3 * v4 * v / v2 / v2 > v1) {
            v2 *= 2;
        }
        return v2;
    }

    private final int d(h h0, com.facebook.imagepipeline.image.l l0) {
        if(!h0.k()) {
            return 0;
        }
        int v = l0.k3();
        if(v != 0 && v != 90 && v != 180 && v != 270) {
            throw new IllegalStateException("Check failed.");
        }
        return v;
    }

    @VisibleForTesting
    @n
    public static final int e(float f) {
        if(f > 0.666667f) {
            return 1;
        }
        int v;
        for(v = 2; 1.0 / ((double)v) + 1.0 / (Math.pow(v, 2.0) - ((double)v)) * 0.333333 > ((double)f); ++v) {
        }
        return v - 1;
    }

    @VisibleForTesting
    @n
    public static final int f(float f) {
        if(f > 0.666667f) {
            return 1;
        }
        int v;
        for(v = 2; true; v *= 2) {
            double f1 = 1.0 / ((double)(v * 2));
            if(f1 + 0.333333 * f1 <= ((double)f)) {
                break;
            }
        }
        return v;
    }

    @VisibleForTesting
    @n
    public static final int g(int v) {
        int v1;
        for(v1 = 1; v1 < v; v1 *= 2) {
        }
        return v1;
    }
}

