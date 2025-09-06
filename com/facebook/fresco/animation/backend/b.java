package com.facebook.fresco.animation.backend;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class b implements a {
    public static final class com.facebook.fresco.animation.backend.b.a {
        private com.facebook.fresco.animation.backend.b.a() {
        }

        public com.facebook.fresco.animation.backend.b.a(w w0) {
        }
    }

    @m
    private a c;
    @IntRange(from = -1L, to = 0xFFL)
    private int d;
    @m
    private ColorFilter e;
    @m
    private Rect f;
    @l
    public static final com.facebook.fresco.animation.backend.b.a g = null;
    private static final int h = -1;

    static {
        b.g = new com.facebook.fresco.animation.backend.b.a(null);
    }

    public b(@m a a0) {
        this.c = a0;
        this.d = -1;
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int a() {
        a a0 = this.c;
        if(a0 == null) {
            return 0;
        }
        L.m(a0);
        return a0.a();
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int b() {
        a a0 = this.c;
        if(a0 == null) {
            return 0;
        }
        L.m(a0);
        return a0.b();
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int c() {
        a a0 = this.c;
        if(a0 == null) {
            return 0;
        }
        L.m(a0);
        return a0.c();
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public void clear() {
        a a0 = this.c;
        if(a0 != null) {
            a0.clear();
        }
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public int d() {
        a a0 = this.c;
        if(a0 == null) {
            return -1;
        }
        L.m(a0);
        return a0.d();
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public int e() {
        a a0 = this.c;
        if(a0 == null) {
            return -1;
        }
        L.m(a0);
        return a0.e();
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public void f(@l Rect rect0) {
        L.p(rect0, "bounds");
        a a0 = this.c;
        if(a0 != null) {
            a0.f(rect0);
        }
        this.f = rect0;
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public void g(@m ColorFilter colorFilter0) {
        a a0 = this.c;
        if(a0 != null) {
            a0.g(colorFilter0);
        }
        this.e = colorFilter0;
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int h() {
        a a0 = this.c;
        if(a0 == null) {
            return 0;
        }
        L.m(a0);
        return a0.h();
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public void i(@m com.facebook.fresco.animation.backend.a.a a$a0) {
        a a0 = this.c;
        if(a0 != null) {
            a0.i(a$a0);
        }
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public void j() {
        a a0 = this.c;
        if(a0 != null) {
            a0.j();
        }
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int k(int v) {
        a a0 = this.c;
        if(a0 == null) {
            return 0;
        }
        L.m(a0);
        return a0.k(v);
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public void l(@IntRange(from = 0L, to = 0xFFL) int v) {
        a a0 = this.c;
        if(a0 != null) {
            a0.l(v);
        }
        this.d = v;
    }

    @Override  // com.facebook.fresco.animation.backend.d
    public int m() {
        a a0 = this.c;
        if(a0 == null) {
            return 0;
        }
        L.m(a0);
        return a0.m();
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public boolean n(@l Drawable drawable0, @l Canvas canvas0, int v) {
        L.p(drawable0, "parent");
        L.p(canvas0, "canvas");
        return this.c != null && this.c.n(drawable0, canvas0, v);
    }

    @SuppressLint({"Range"})
    private final void o(a a0) {
        Rect rect0 = this.f;
        if(rect0 != null) {
            a0.f(rect0);
        }
        int v = this.d;
        if(v >= 0 && v <= 0xFF) {
            a0.l(v);
        }
        ColorFilter colorFilter0 = this.e;
        if(colorFilter0 != null) {
            a0.g(colorFilter0);
        }
    }

    @m
    public final a p() {
        return this.c;
    }

    public final void q(@m a a0) {
        this.c = a0;
        if(a0 != null) {
            L.m(a0);
            this.o(a0);
        }
    }

    @Override  // com.facebook.fresco.animation.backend.a
    public int z() {
        a a0 = this.c;
        if(a0 == null) {
            return 0;
        }
        L.m(a0);
        return a0.z();
    }
}

