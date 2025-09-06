package com.kakao.adfit.m;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.view.Display;
import kotlin.jvm.internal.L;

public final class l {
    public static final l a;

    static {
        l.a = new l();
    }

    public static final float a(Context context0, float f) {
        L.p(context0, "context");
        return f * context0.getResources().getDisplayMetrics().density;
    }

    public static final int a(Context context0, int v) {
        L.p(context0, "context");
        return (int)(l.a(context0, ((float)v)) + 0.5f);
    }

    public static final int a(Display display0) {
        L.p(display0, "display");
        return display0.getRotation();
    }

    public static final Point a(Display display0, Point point0) {
        L.p(display0, "display");
        L.p(point0, "size");
        display0.getSize(point0);
        return point0;
    }

    public static Point a(Display display0, Point point0, int v, Object object0) {
        if((v & 2) != 0) {
            point0 = new Point();
        }
        return l.a(display0, point0);
    }

    public static final Display a(Context context0) {
        L.p(context0, "context");
        Object object0 = context0.getSystemService("display");
        L.n(object0, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display display0 = ((DisplayManager)object0).getDisplay(0);
        L.o(display0, "displayManager.getDisplay(DEFAULT_DISPLAY)");
        return display0;
    }

    public static final float b(Context context0, float f) {
        L.p(context0, "context");
        return f / context0.getResources().getDisplayMetrics().density;
    }

    public static final int b(Context context0, int v) {
        L.p(context0, "context");
        return (int)(l.b(context0, ((float)v)) + 0.5f);
    }

    public static final Point b(Display display0) {
        L.p(display0, "display");
        return l.b(display0, null, 2, null);
    }

    public static final Point b(Display display0, Point point0) {
        L.p(display0, "display");
        L.p(point0, "size");
        display0.getRealSize(point0);
        return point0;
    }

    public static Point b(Display display0, Point point0, int v, Object object0) {
        if((v & 2) != 0) {
            point0 = new Point();
        }
        return l.b(display0, point0);
    }
}

