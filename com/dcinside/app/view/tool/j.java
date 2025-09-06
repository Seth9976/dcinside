package com.dcinside.app.view.tool;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

public final class j {
    private View a;

    public static int[] a(View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        return new int[]{viewGroup$LayoutParams0.width, viewGroup$LayoutParams0.height};
    }

    public int b() {
        return j.c(this.a);
    }

    public static int c(View view0) {
        return view0.getLayoutParams().height;
    }

    public int d() {
        return j.e(this.a);
    }

    public static int e(View view0) {
        return view0.getLayoutParams().width;
    }

    public static void f(View view0, int v, int v1) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        viewGroup$LayoutParams0.width = v;
        viewGroup$LayoutParams0.height = v1;
        view0.requestLayout();
    }

    public void g(int v) {
        j.h(this.a, v);
    }

    public static void h(View view0, int v) {
        view0.getLayoutParams().height = v;
        view0.requestLayout();
    }

    public void i(int v) {
        j.j(this.a, v);
    }

    public static void j(View view0, int v) {
        view0.getLayoutParams().width = v;
        view0.requestLayout();
    }

    public static j k(View view0) {
        j j0 = new j();
        j0.a = view0;
        return j0;
    }
}

