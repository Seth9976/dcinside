package com.pgl.ssdk;

import android.content.Context;
import android.graphics.Point;
import android.provider.Settings.System;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class c0 {
    public static int a;
    public static int b;
    public static int c;
    private static int d;
    private static int e;
    private static int f;

    static {
    }

    private static void a(Context context0) {
        if(context0 == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
            c0.d = (int)displayMetrics0.density;
            c0.c = displayMetrics0.densityDpi;
        }
        catch(Throwable unused_ex) {
        }
    }

    private static void b(Context context0) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
            c0.e = (int)displayMetrics0.xdpi;
            c0.f = (int)displayMetrics0.ydpi;
        }
        catch(Throwable unused_ex) {
        }
    }

    private static void c(Context context0) {
        try {
            Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
            Point point0 = new Point();
            display0.getRealSize(point0);
            c0.a = point0.x;
            c0.b = point0.y;
        }
        catch(Throwable unused_ex) {
        }
    }

    public static String d(Context context0) {
        int v = -1;
        if(context0 != null) {
            try {
                v = Settings.System.getInt(context0.getContentResolver(), "screen_brightness", -1);
            }
            catch(Throwable unused_ex) {
            }
        }
        return String.valueOf(v);
    }

    public static String e(Context context0) {
        try {
            c0.c(context0);
            c0.a(context0);
            c0.b(context0);
        }
        catch(Throwable unused_ex) {
        }
        return c0.c + "[<!>]" + c0.a + "," + c0.b + "[<!>]";
    }
}

