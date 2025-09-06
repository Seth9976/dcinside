package com.facebook.fresco.animation.drawable;

import B0.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.e;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public class b extends Drawable implements a, Animatable {
    public static final class com.facebook.fresco.animation.drawable.b.a {
        private com.facebook.fresco.animation.drawable.b.a() {
        }

        public com.facebook.fresco.animation.drawable.b.a(w w0) {
        }

        private final M0.b b(com.facebook.fresco.animation.backend.a a0) {
            return a0 == null ? null : new M0.a(a0);
        }
    }

    public interface com.facebook.fresco.animation.drawable.b.b {
        void a(@l b arg1, @l M0.b arg2, int arg3, boolean arg4, boolean arg5, long arg6, long arg7, long arg8, long arg9, long arg10, long arg11, long arg12);
    }

    @m
    private com.facebook.fresco.animation.backend.a a;
    @m
    private M0.b b;
    private volatile boolean c;
    private long d;
    private long e;
    private long f;
    private int g;
    private long h;
    private long i;
    private int j;
    private long k;
    private long l;
    private int m;
    @l
    private volatile f n;
    @m
    private volatile com.facebook.fresco.animation.drawable.b.b o;
    @l
    private final com.facebook.fresco.animation.backend.a.a p;
    @m
    private e q;
    @l
    private final Runnable r;
    @l
    public static final com.facebook.fresco.animation.drawable.b.a s = null;
    @l
    private static final Class t = null;
    @l
    private static final f u = null;
    private static final int v = 8;
    private static final int w;

    static {
        b.s = new com.facebook.fresco.animation.drawable.b.a(null);
        b.t = b.class;
        b.u = new g();
    }

    @j
    public b() {
        this(null, 1, null);
    }

    @j
    public b(@m com.facebook.fresco.animation.backend.a a0) {
        public static final class c implements Runnable {
            final b a;

            c(b b0) {
                this.a = b0;
                super();
            }

            @Override
            public void run() {
                this.a.unscheduleSelf(this);
                this.a.invalidateSelf();
            }
        }

        this.a = a0;
        this.k = 8L;
        this.n = b.u;
        com.facebook.fresco.animation.drawable.a a1 = () -> {
            L.p(this, "this$0");
            this.n.a();
        };
        this.p = a1;
        this.r = new c(this);
        this.b = b.s.b(this.a);
        com.facebook.fresco.animation.backend.a a2 = this.a;
        if(a2 != null) {
            a2.i(a1);
        }
    }

    public b(com.facebook.fresco.animation.backend.a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = null;
        }
        this(a0);
    }

    @Override  // B0.a
    public void c() {
        com.facebook.fresco.animation.backend.a a0 = this.a;
        if(a0 != null) {
            a0.clear();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@l Canvas canvas0) {
        long v8;
        long v7;
        long v6;
        L.p(canvas0, "canvas");
        if(this.a != null && this.b != null) {
            long v = this.p();
            long v1 = this.c ? v - this.d + this.l : ((long)Math.max(this.e, 0.0));
            M0.b b0 = this.b;
            L.m(b0);
            int v2 = b0.f(v1, this.e);
            switch(v2) {
                case -1: {
                    com.facebook.fresco.animation.backend.a a0 = this.a;
                    L.m(a0);
                    v2 = a0.b() - 1;
                    this.n.f(this);
                    this.c = false;
                    break;
                }
                case 0: {
                    if(this.g != -1 && v >= this.f) {
                        this.n.e(this);
                    }
                }
            }
            com.facebook.fresco.animation.backend.a a1 = this.a;
            L.m(a1);
            boolean z = a1.n(this, canvas0, v2);
            if(z) {
                this.n.c(this, v2);
                this.g = v2;
            }
            if(!z) {
                this.q();
            }
            long v3 = this.p();
            long v4 = -1L;
            if(this.c) {
                M0.b b1 = this.b;
                L.m(b1);
                long v5 = b1.e(v3 - this.d);
                if(v5 == -1L) {
                    this.n.f(this);
                    this.c = false;
                }
                else {
                    v4 = this.k + v5;
                    this.s(v4);
                }
                v6 = v5;
                v7 = v4;
            }
            else {
                v6 = -1L;
                v7 = -1L;
            }
            com.facebook.fresco.animation.drawable.b.b b$b0 = this.o;
            if(b$b0 != null) {
                M0.b b2 = this.b;
                if(b2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                b$b0.a(this, b2, v2, z, this.c, this.d, v1, this.e, v, v3, v6, v7);
            }
            v8 = v1;
            this.e = v8;
        }
    }

    // 检测为 Lambda 实现
    private static final void f(b b0) [...]

    @m
    public final com.facebook.fresco.animation.backend.a g() {
        return this.a;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        com.facebook.fresco.animation.backend.a a0 = this.a;
        return a0 == null ? super.getIntrinsicHeight() : a0.e();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        com.facebook.fresco.animation.backend.a a0 = this.a;
        return a0 == null ? super.getIntrinsicWidth() : a0.d();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final long h() {
        return (long)this.m;
    }

    public final int i() {
        com.facebook.fresco.animation.backend.a a0 = this.a;
        if(a0 == null) {
            return 0;
        }
        L.m(a0);
        return a0.b();
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.c;
    }

    public final int j(int v) {
        com.facebook.fresco.animation.backend.a a0 = this.a;
        if(a0 == null) {
            return 0;
        }
        L.m(a0);
        return a0.k(v);
    }

    public final int k() {
        com.facebook.fresco.animation.backend.a a0 = this.a;
        if(a0 == null) {
            return 0;
        }
        L.m(a0);
        return a0.a();
    }

    public final long l() {
        com.facebook.fresco.animation.backend.a a0 = this.a;
        if(a0 == null) {
            return 0L;
        }
        M0.b b0 = this.b;
        if(b0 != null) {
            L.m(b0);
            return b0.c();
        }
        L.m(a0);
        int v = a0.b();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            com.facebook.fresco.animation.backend.a a1 = this.a;
            L.m(a1);
            v2 += a1.k(v1);
        }
        return (long)v2;
    }

    public final long m() {
        return this.d;
    }

    public final boolean n() {
        return this.b != null && this.b.g();
    }

    public final void o(int v) {
        if(this.a != null) {
            M0.b b0 = this.b;
            if(b0 != null) {
                L.m(b0);
                this.e = b0.d(v);
                this.j = v;
                this.h = 0L;
                this.i = 0L;
                long v1 = this.p() - this.e;
                this.d = v1;
                this.f = v1;
                this.invalidateSelf();
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(@l Rect rect0) {
        L.p(rect0, "bounds");
        super.onBoundsChange(rect0);
        com.facebook.fresco.animation.backend.a a0 = this.a;
        if(a0 != null) {
            a0.f(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int v) {
        if(this.c) {
            return false;
        }
        if(this.e != ((long)v)) {
            this.e = (long)v;
            this.invalidateSelf();
            return true;
        }
        return false;
    }

    private final long p() {
        return SystemClock.uptimeMillis();
    }

    private final void q() {
        ++this.m;
        if(x0.a.R(2)) {
            x0.a.V(b.t, "Dropped a frame. Count: %s", this.m);
        }
    }

    public final void r() {
        com.facebook.fresco.animation.backend.a a0 = this.a;
        if(a0 != null) {
            a0.j();
        }
    }

    private final void s(long v) {
        long v1 = this.d + v;
        this.f = v1;
        this.scheduleSelf(this.r, v1);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        if(this.q == null) {
            this.q = new e();
        }
        e e0 = this.q;
        L.m(e0);
        e0.b(v);
        com.facebook.fresco.animation.backend.a a0 = this.a;
        if(a0 != null) {
            a0.l(v);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@m ColorFilter colorFilter0) {
        if(this.q == null) {
            this.q = new e();
        }
        e e0 = this.q;
        L.m(e0);
        e0.c(colorFilter0);
        com.facebook.fresco.animation.backend.a a0 = this.a;
        if(a0 != null) {
            a0.g(colorFilter0);
        }
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        if(!this.c) {
            com.facebook.fresco.animation.backend.a a0 = this.a;
            if(a0 != null) {
                L.m(a0);
                if(a0.b() > 1) {
                    this.c = true;
                    long v = this.p();
                    long v1 = v - this.h;
                    this.d = v1;
                    this.f = v1;
                    this.e = v - this.i;
                    this.g = this.j;
                    this.invalidateSelf();
                    this.n.b(this);
                }
            }
        }
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        if(!this.c) {
            return;
        }
        long v = this.p();
        this.h = v - this.d;
        this.i = v - this.e;
        this.j = this.g;
        this.c = false;
        this.d = 0L;
        this.f = 0L;
        this.e = -1L;
        this.g = -1;
        this.unscheduleSelf(this.r);
        this.n.f(this);
    }

    public final void t(@m com.facebook.fresco.animation.backend.a a0) {
        com.facebook.fresco.animation.backend.a a1 = this.a;
        if(a1 != null) {
            L.m(a1);
            a1.i(null);
        }
        this.a = a0;
        if(a0 != null) {
            com.facebook.fresco.animation.backend.a a2 = this.a;
            L.m(a2);
            this.b = new M0.a(a2);
            com.facebook.fresco.animation.backend.a a3 = this.a;
            L.m(a3);
            a3.i(this.p);
            com.facebook.fresco.animation.backend.a a4 = this.a;
            L.m(a4);
            a4.f(this.getBounds());
            e e0 = this.q;
            if(e0 != null) {
                e0.a(this);
            }
        }
        this.b = b.s.b(this.a);
        this.stop();
    }

    public final void u(@m f f0) {
        if(f0 == null) {
            f0 = b.u;
        }
        this.n = f0;
    }

    public final void v(@m com.facebook.fresco.animation.drawable.b.b b$b0) {
        this.o = b$b0;
    }

    public final void w(long v) {
        this.k = v;
    }

    public final void x(long v) {
        this.l = v;
    }
}

