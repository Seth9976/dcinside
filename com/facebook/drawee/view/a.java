package com.facebook.drawee.view;

import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class com.facebook.drawee.view.a {
    public static class com.facebook.drawee.view.a.a {
        public int a;
        public int b;

    }

    private static boolean a(int v) {
        return v == -2 || v == 0;
    }

    public static void b(com.facebook.drawee.view.a.a a$a0, float f, @h ViewGroup.LayoutParams viewGroup$LayoutParams0, int v, int v1) {
        if(f > 0.0f && viewGroup$LayoutParams0 != null) {
            if(com.facebook.drawee.view.a.a(viewGroup$LayoutParams0.height)) {
                a$a0.b = View.MeasureSpec.makeMeasureSpec(View.resolveSize(((int)(((float)(View.MeasureSpec.getSize(a$a0.a) - v)) / f + ((float)v1))), a$a0.b), 0x40000000);
                return;
            }
            if(com.facebook.drawee.view.a.a(viewGroup$LayoutParams0.width)) {
                a$a0.a = View.MeasureSpec.makeMeasureSpec(View.resolveSize(((int)(((float)(View.MeasureSpec.getSize(a$a0.b) - v1)) * f + ((float)v))), a$a0.a), 0x40000000);
            }
        }
    }
}

