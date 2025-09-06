package com.futuremind.recyclerviewfastscroll;

import android.graphics.drawable.Drawable;
import android.view.View;

public class c {
    public static float a(float f, float f1, float f2) {
        return Math.min(Math.max(f, f2), f1);
    }

    public static float b(View view0) {
        int[] arr_v = {((int)view0.getX()), 0};
        ((View)view0.getParent()).getLocationInWindow(arr_v);
        return (float)arr_v[0];
    }

    public static float c(View view0) {
        int[] arr_v = {0, ((int)view0.getY())};
        ((View)view0.getParent()).getLocationInWindow(arr_v);
        return (float)arr_v[1];
    }

    public static void d(View view0, Drawable drawable0) {
        view0.setBackground(drawable0);
    }
}

