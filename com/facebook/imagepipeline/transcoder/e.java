package com.facebook.imagepipeline.transcoder;

import android.graphics.Matrix;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.i;
import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.common.h;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

@s0({"SMAP\nJpegTranscoderUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JpegTranscoderUtils.kt\ncom/facebook/imagepipeline/transcoder/JpegTranscoderUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
public final class e {
    @l
    public static final e a = null;
    private static final int b = 360;
    public static final int c = 0;
    public static final int d = 100;
    public static final int e = 1;
    public static final int f = 16;
    public static final int g = 8;
    @l
    @f
    public static final i h = null;
    public static final int i = 85;

    static {
        e.a = new e();
        i i0 = i.b(new Integer[]{2, 7, 4, 5});
        L.o(i0, "of(...)");
        e.h = i0;
    }

    @VisibleForTesting
    @n
    public static final int a(int v) {
        return Math.max(1, 8 / v);
    }

    @VisibleForTesting
    @n
    public static final float b(@m g g0, int v, int v1) {
        if(g0 == null) {
            return 1.0f;
        }
        float f = Math.max(((float)g0.a) / ((float)v), ((float)g0.b) / ((float)v1));
        float f1 = g0.c;
        if(((float)v) * f > f1) {
            f = f1 / ((float)v);
        }
        return ((float)v1) * f > f1 ? f1 / ((float)v1) : f;
    }

    private final int c(com.facebook.imagepipeline.image.l l0) {
        switch(l0.k3()) {
            case 90: 
            case 180: 
            case 270: {
                return l0.k3();
            }
            default: {
                return 0;
            }
        }
    }

    @VisibleForTesting
    public static void d() {
    }

    @n
    public static final int e(@l h h0, @l com.facebook.imagepipeline.image.l l0) {
        L.p(h0, "rotationOptions");
        L.p(l0, "encodedImage");
        int v = l0.A0();
        i i0 = e.h;
        int v1 = i0.indexOf(v);
        if(v1 < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        Object object0 = i0.get((v1 + (h0.k() ? 0 : h0.i()) / 90) % i0.size());
        L.o(object0, "get(...)");
        return ((Number)object0).intValue();
    }

    @n
    public static final int f(@l h h0, @l com.facebook.imagepipeline.image.l l0) {
        L.p(h0, "rotationOptions");
        L.p(l0, "encodedImage");
        if(!h0.j()) {
            return 0;
        }
        int v = e.a.c(l0);
        return h0.k() ? v : (v + h0.i()) % 360;
    }

    @n
    public static final int g(@l h h0, @m g g0, @l com.facebook.imagepipeline.image.l l0, boolean z) {
        int v2;
        L.p(h0, "rotationOptions");
        L.p(l0, "encodedImage");
        if(!z) {
            return 8;
        }
        if(g0 == null) {
            return 8;
        }
        int v = e.f(h0, l0);
        Integer integer0 = l0.A0();
        boolean z1 = false;
        int v1 = e.h.contains(integer0) ? e.e(h0, l0) : 0;
        if(v != 90 && v != 270 && (v1 != 5 && v1 != 7)) {
            v2 = l0.getWidth();
        }
        else {
            z1 = true;
            v2 = l0.getHeight();
        }
        int v3 = e.l(e.b(g0, v2, (z1 ? l0.getWidth() : l0.getHeight())), g0.d);
        if(v3 > 8) {
            return 8;
        }
        return v3 < 1 ? 1 : v3;
    }

    @m
    @n
    public static final Matrix h(@l com.facebook.imagepipeline.image.l l0, @l h h0) {
        L.p(l0, "encodedImage");
        L.p(h0, "rotationOptions");
        Integer integer0 = l0.A0();
        if(e.h.contains(integer0)) {
            int v = e.e(h0, l0);
            return e.a.i(v);
        }
        int v1 = e.f(h0, l0);
        if(v1 != 0) {
            Matrix matrix0 = new Matrix();
            matrix0.setRotate(((float)v1));
            return matrix0;
        }
        return null;
    }

    private final Matrix i(int v) {
        Matrix matrix0 = new Matrix();
        switch(v) {
            case 2: {
                matrix0.setScale(-1.0f, 1.0f);
                return matrix0;
            }
            case 4: {
                matrix0.setRotate(180.0f);
                matrix0.postScale(-1.0f, 1.0f);
                return matrix0;
            }
            case 5: {
                matrix0.setRotate(90.0f);
                matrix0.postScale(-1.0f, 1.0f);
                return matrix0;
            }
            case 7: {
                matrix0.setRotate(-90.0f);
                matrix0.postScale(-1.0f, 1.0f);
                return matrix0;
            }
            default: {
                return null;
            }
        }
    }

    @n
    public static final boolean j(int v) {
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @n
    public static final boolean k(int v) {
        return v >= 0 && v <= 270 && v % 90 == 0;
    }

    @VisibleForTesting
    @n
    public static final int l(float f, float f1) {
        return (int)(f1 + f * 8.0f);
    }
}

