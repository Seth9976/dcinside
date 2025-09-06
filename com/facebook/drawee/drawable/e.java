package com.facebook.drawee.drawable;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class e {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private int a;
    private boolean b;
    @m
    private ColorFilter c;
    private int d;
    private int e;
    @l
    public static final a f = null;
    private static final int g = -1;

    static {
        e.f = new a(null);
    }

    public e() {
        this.a = -1;
        this.d = -1;
        this.e = -1;
    }

    @SuppressLint({"Range"})
    public final void a(@m Drawable drawable0) {
        if(drawable0 == null) {
            return;
        }
        int v = this.a;
        if(v != -1) {
            drawable0.setAlpha(v);
        }
        if(this.b) {
            drawable0.setColorFilter(this.c);
        }
        int v1 = this.d;
        boolean z = false;
        if(v1 != -1) {
            drawable0.setDither(v1 != 0);
        }
        int v2 = this.e;
        if(v2 != -1) {
            if(v2 != 0) {
                z = true;
            }
            drawable0.setFilterBitmap(z);
        }
    }

    public final void b(int v) {
        this.a = v;
    }

    public final void c(@m ColorFilter colorFilter0) {
        this.c = colorFilter0;
        this.b = colorFilter0 != null;
    }

    public final void d(boolean z) {
        this.d = z;
    }

    public final void e(boolean z) {
        this.e = z;
    }
}

