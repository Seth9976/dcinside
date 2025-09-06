package com.dcinside.app.barcode;

import android.graphics.Rect;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.vision.barcode.Barcode;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;
import z3.n;

public final class g {
    @l
    public static final g a = null;
    private static final float b = 0.65f;
    private static final float c = 0.03f;
    @m
    private static Rect d;
    private static int e;
    private static int f;
    @m
    private static Size g;

    static {
        g.a = new g();
    }

    @n
    public static final boolean a(@l Barcode barcode0) {
        L.p(barcode0, "barcode");
        if(g.d != null && g.g != null) {
            Rect rect0 = barcode0.getBoundingBox();
            int v = rect0.left;
            int v1 = rect0.top;
            int v2 = rect0.right;
            int v3 = rect0.bottom;
            Size size0 = g.g;
            L.m(size0);
            int v4 = size0.getWidth();
            Size size1 = g.g;
            L.m(size1);
            int v5 = size1.getHeight();
            Rect rect1 = new Rect(v * g.e / v4, v1 * g.f / v5, v2 * g.e / v4, v3 * g.f / v5);
            Rect rect2 = g.d;
            L.m(rect2);
            return rect2.contains(rect1);
        }
        return false;
    }

    @m
    @n
    public static final Rect b(int v, int v1) {
        int v2 = (int)(((float)Math.min(v, v1)) * 0.65f);
        int v3 = (int)(((float)v2) * 0.03f);
        Rect rect0 = new Rect((v - v2) / 2 - v3, (v1 - v2) / 2 - v3, (v + v2) / 2 + v3, (v2 + v1) / 2 + v3);
        g.d = rect0;
        g.e = v;
        g.f = v1;
        return rect0;
    }

    @l
    @n
    public static final Rect c(int v, int v1) {
        int v2 = (int)(((float)s.B(v, v1)) * 0.65f);
        return new Rect((v - v2) / 2, (v1 - v2) / 2, (v + v2) / 2, (v1 + v2) / 2);
    }

    @n
    public static final void d(@m Size size0) {
        g.g = size0;
    }
}

