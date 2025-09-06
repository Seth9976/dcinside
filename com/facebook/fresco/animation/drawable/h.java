package com.facebook.fresco.animation.drawable;

import B0.a;
import M0.b;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.e;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nKAnimatedDrawable2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnimatedDrawable2.kt\ncom/facebook/fresco/animation/drawable/KAnimatedDrawable2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
public class h extends Drawable implements a, Animatable {
    public interface com.facebook.fresco.animation.drawable.h.a {
        void a(@l h arg1, @l b arg2, int arg3, boolean arg4, boolean arg5, long arg6, long arg7, long arg8, long arg9, long arg10, long arg11, long arg12);
    }

    @l
    private com.facebook.fresco.animation.backend.a a;
    @l
    private final d b;
    @l
    private f c;
    @m
    private com.facebook.fresco.animation.drawable.h.a d;
    @l
    private final e e;
    private volatile boolean f;
    @l
    private final com.facebook.fresco.animation.drawable.h.b g;

    public h(@l com.facebook.fresco.animation.backend.a a0) {
        public static final class com.facebook.fresco.animation.drawable.h.b implements Runnable {
            final h a;

            com.facebook.fresco.animation.drawable.h.b(h h0) {
                this.a = h0;
                super();
            }

            @Override
            public void run() {
                this.a.unscheduleSelf(this);
                this.a.invalidateSelf();
            }
        }

        L.p(a0, "animationBackend");
        super();
        this.a = a0;
        this.b = new d(new M0.a(this.a));
        this.c = new g();
        e e0 = new e();
        e0.a(this);
        this.e = e0;
        this.g = new com.facebook.fresco.animation.drawable.h.b(this);
    }

    public final int a() {
        return this.a.b();
    }

    @Override  // B0.a
    public void c() {
        this.a.clear();
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        int v = this.b.a();
        if(v == -1) {
            v = this.a.b() - 1;
            this.b.n(false);
            this.c.f(this);
        }
        else if(v == 0 && this.b.o()) {
            this.c.e(this);
        }
        if(this.a.n(this, canvas0, v)) {
            this.c.c(this, v);
            this.b.m(v);
        }
        else {
            this.b.j();
        }
        long v1 = this.b.h();
        if(v1 != -1L) {
            this.scheduleSelf(this.g, v1);
            return;
        }
        this.c.f(this);
        this.b.n(false);
    }

    public final int f() {
        return this.a.a();
    }

    public final int g() {
        return this.a.c();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.e();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.d();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(@m com.facebook.fresco.animation.backend.a a0) {
        if(a0 == null) {
            return;
        }
        this.stop();
        a0.f(this.getBounds());
        this.e.a(this);
        this.a = a0;
    }

    public final void i(@m f f0) {
        if(f0 == null) {
            f0 = this.c;
        }
        this.c = f0;
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.b.e();
    }

    public final void j(@m com.facebook.fresco.animation.drawable.h.a h$a0) {
        this.d = h$a0;
    }

    public final void k(long v) {
        this.b.k(v);
    }

    public final void l(long v) {
        this.b.l(v);
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(@l Rect rect0) {
        L.p(rect0, "bounds");
        this.a.f(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.e.b(v);
        this.a.l(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@m ColorFilter colorFilter0) {
        this.e.c(colorFilter0);
        this.a.g(colorFilter0);
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        if(this.a.b() <= 0) {
            return;
        }
        this.b.p();
        this.c.b(this);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        this.b.q();
        this.c.f(this);
        this.unscheduleSelf(this.g);
    }
}

