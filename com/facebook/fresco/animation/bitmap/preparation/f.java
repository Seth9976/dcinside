package com.facebook.fresco.animation.bitmap.preparation;

import I0.e;
import androidx.annotation.UiThread;
import com.facebook.fresco.animation.backend.d;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.i;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.j;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.k;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nFrameLoaderStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameLoaderStrategy.kt\ncom/facebook/fresco/animation/bitmap/preparation/FrameLoaderStrategy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
public final class f implements a {
    @l
    private final d a;
    @l
    private final e b;
    @l
    private final k c;
    private final boolean d;
    @l
    private final String e;
    private final int f;
    private final int g;
    @m
    private j h;
    private final int i;
    private int j;
    @l
    private final com.facebook.fresco.animation.bitmap.preparation.f.a k;

    public f(@m String s, @l d d0, @l e e0, @l k k0, boolean z) {
        public static final class com.facebook.fresco.animation.bitmap.preparation.f.a implements i {
            private final int a;
            final f b;

            com.facebook.fresco.animation.bitmap.preparation.f.a(f f0) {
                this.b = f0;
                super();
                this.a = f0.i;
            }

            @Override  // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.i
            public void a(int v) {
                if(v != this.b.j) {
                    int v1 = s.I(v, 1, this.b.i);
                    this.b.j = v1;
                    j j0 = this.b.l();
                    if(j0 != null) {
                        j0.b(this.b.j);
                    }
                }
            }

            @Override  // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.i
            public int b() {
                return this.b.j;
            }

            @Override  // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.i
            public int c() {
                return this.a;
            }
        }

        L.p(d0, "animationInformation");
        L.p(e0, "bitmapFrameRenderer");
        L.p(k0, "frameLoaderFactory");
        super();
        this.a = d0;
        this.b = e0;
        this.c = k0;
        this.d = z;
        if(s == null) {
            s = String.valueOf(this.hashCode());
        }
        this.e = s;
        this.f = d0.m();
        this.g = d0.h();
        int v = this.k(d0);
        this.i = v;
        this.j = v;
        this.k = new com.facebook.fresco.animation.bitmap.preparation.f.a(this);
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.a
    @UiThread
    public void a(int v, int v1, @m A3.a a0) {
        if(v > 0 && v1 > 0 && this.f > 0 && this.g > 0) {
            g g0 = this.j(v, v1);
            j j0 = this.l();
            if(j0 != null) {
                int v2 = g0.b();
                int v3 = g0.b();
                if(a0 == null) {
                    a0 = () -> S0.a;
                }
                j0.a(v2, v3, a0);
            }
        }
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.a
    @UiThread
    @m
    public com.facebook.common.references.a b(int v, int v1, int v2) {
        g g0 = this.j(v1, v2);
        j j0 = this.l();
        com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.l l0 = j0 == null ? null : j0.d(v, g0.b(), g0.a());
        if(l0 != null) {
            com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.e.a.h(this.k, l0);
        }
        return l0 == null ? null : l0.a();
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.a
    public void c() {
        j j0 = this.l();
        if(j0 != null) {
            k.d.b(this.e, j0);
        }
        this.h = null;
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.a
    public void d(@l b b0, @l I0.d d0, @l com.facebook.fresco.animation.backend.a a0, int v, @m A3.a a1) {
        com.facebook.fresco.animation.bitmap.preparation.a.a.e(this, b0, d0, a0, v, a1);
    }

    private final g j(int v, int v1) {
        if(!this.d) {
            return new g(this.f, this.g);
        }
        int v2 = this.f;
        int v3 = this.g;
        if(v < v2 || v1 < v3) {
            double f = ((double)v2) / ((double)v3);
            if(v1 > v) {
                v3 = s.B(v1, v3);
                return new g(((int)(((double)v3) * f)), v3);
            }
            v2 = s.B(v, v2);
            v3 = (int)(((double)v2) / f);
        }
        return new g(v2, v3);
    }

    private final int k(d d0) {
        return (int)s.v(TimeUnit.SECONDS.toMillis(1L) / ((long)(d0.c() / d0.b())), 1L);
    }

    private final j l() {
        if(this.h == null) {
            this.h = this.c.b(this.e, this.b, this.a);
        }
        return this.h;
    }

    // 检测为 Lambda 实现
    private static final S0 m() [...]

    @Override  // com.facebook.fresco.animation.bitmap.preparation.a
    public void onStop() {
        j j0 = this.l();
        if(j0 != null) {
            j0.onStop();
        }
        this.c();
    }
}

