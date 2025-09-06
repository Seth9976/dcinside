package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

public class q {
    static class a {
        static final q a;

        static {
            a.a = new q();
        }
    }

    @RestrictTo({Scope.b})
    public interface b {
        void a(r arg1, Matrix arg2, int arg3);

        void b(r arg1, Matrix arg2, int arg3);
    }

    static final class c {
        @NonNull
        public final p a;
        @NonNull
        public final Path b;
        @NonNull
        public final RectF c;
        @Nullable
        public final b d;
        public final float e;

        c(@NonNull p p0, float f, RectF rectF0, @Nullable b q$b0, Path path0) {
            this.d = q$b0;
            this.a = p0;
            this.e = f;
            this.c = rectF0;
            this.b = path0;
        }
    }

    private final r[] a;
    private final Matrix[] b;
    private final Matrix[] c;
    private final PointF d;
    private final Path e;
    private final Path f;
    private final r g;
    private final float[] h;
    private final float[] i;
    private final Path j;
    private final Path k;
    private boolean l;

    public q() {
        this.a = new r[4];
        this.b = new Matrix[4];
        this.c = new Matrix[4];
        this.d = new PointF();
        this.e = new Path();
        this.f = new Path();
        this.g = new r();
        this.h = new float[2];
        this.i = new float[2];
        this.j = new Path();
        this.k = new Path();
        this.l = true;
        for(int v = 0; v < 4; ++v) {
            this.a[v] = new r();
            this.b[v] = new Matrix();
            this.c[v] = new Matrix();
        }
    }

    private float a(int v) [...] // Inlined contents

    private void b(@NonNull c q$c0, int v) {
        this.h[0] = this.a[v].l();
        this.h[1] = this.a[v].m();
        this.b[v].mapPoints(this.h);
        if(v == 0) {
            q$c0.b.moveTo(this.h[0], this.h[1]);
        }
        else {
            q$c0.b.lineTo(this.h[0], this.h[1]);
        }
        this.a[v].d(this.b[v], q$c0.b);
        b q$b0 = q$c0.d;
        if(q$b0 != null) {
            q$b0.a(this.a[v], this.b[v], v);
        }
    }

    private void c(@NonNull c q$c0, int v) {
        int v1 = (v + 1) % 4;
        this.h[0] = this.a[v].j();
        this.h[1] = this.a[v].k();
        this.b[v].mapPoints(this.h);
        this.i[0] = this.a[v1].l();
        this.i[1] = this.a[v1].m();
        this.b[v1].mapPoints(this.i);
        float f = Math.max(((float)Math.hypot(this.h[0] - this.i[0], this.h[1] - this.i[1])) - 0.001f, 0.0f);
        float f1 = this.i(q$c0.c, v);
        this.g.q(0.0f, 0.0f);
        h h0 = this.j(v, q$c0.a);
        h0.b(f, f1, q$c0.e, this.g);
        this.j.reset();
        this.g.d(this.c[v], this.j);
        if(!this.l || !h0.a() && !this.l(this.j, v) && !this.l(this.j, v1)) {
            this.g.d(this.c[v], q$c0.b);
        }
        else {
            this.j.op(this.j, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.l();
            this.h[1] = this.g.m();
            this.c[v].mapPoints(this.h);
            this.e.moveTo(this.h[0], this.h[1]);
            this.g.d(this.c[v], this.e);
        }
        b q$b0 = q$c0.d;
        if(q$b0 != null) {
            q$b0.b(this.g, this.c[v], v);
        }
    }

    public void d(p p0, float f, RectF rectF0, @NonNull Path path0) {
        this.e(p0, f, rectF0, null, path0);
    }

    @RestrictTo({Scope.b})
    public void e(p p0, float f, RectF rectF0, b q$b0, @NonNull Path path0) {
        path0.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF0, Path.Direction.CW);
        c q$c0 = new c(p0, f, rectF0, q$b0, path0);
        for(int v1 = 0; v1 < 4; ++v1) {
            this.m(q$c0, v1);
            this.o(v1);
        }
        for(int v = 0; v < 4; ++v) {
            this.b(q$c0, v);
            this.c(q$c0, v);
        }
        path0.close();
        this.e.close();
        if(!this.e.isEmpty()) {
            path0.op(this.e, Path.Op.UNION);
        }
    }

    private void f(int v, @NonNull RectF rectF0, @NonNull PointF pointF0) {
        switch(v) {
            case 1: {
                pointF0.set(rectF0.right, rectF0.bottom);
                return;
            }
            case 2: {
                pointF0.set(rectF0.left, rectF0.bottom);
                return;
            }
            case 3: {
                pointF0.set(rectF0.left, rectF0.top);
                return;
            }
            default: {
                pointF0.set(rectF0.right, rectF0.top);
            }
        }
    }

    private e g(int v, @NonNull p p0) {
        switch(v) {
            case 1: {
                return p0.l();
            }
            case 2: {
                return p0.j();
            }
            case 3: {
                return p0.r();
            }
            default: {
                return p0.t();
            }
        }
    }

    private f h(int v, @NonNull p p0) {
        switch(v) {
            case 1: {
                return p0.k();
            }
            case 2: {
                return p0.i();
            }
            case 3: {
                return p0.q();
            }
            default: {
                return p0.s();
            }
        }
    }

    private float i(@NonNull RectF rectF0, int v) {
        r r0 = this.a[v];
        this.h[0] = r0.c;
        this.h[1] = r0.d;
        this.b[v].mapPoints(this.h);
        return v == 1 || v == 3 ? Math.abs(rectF0.centerX() - this.h[0]) : Math.abs(rectF0.centerY() - this.h[1]);
    }

    private h j(int v, @NonNull p p0) {
        switch(v) {
            case 1: {
                return p0.h();
            }
            case 2: {
                return p0.n();
            }
            case 3: {
                return p0.p();
            }
            default: {
                return p0.o();
            }
        }
    }

    @NonNull
    @RestrictTo({Scope.b})
    @UiThread
    public static q k() {
        return a.a;
    }

    @RequiresApi(19)
    private boolean l(Path path0, int v) {
        this.k.reset();
        this.a[v].d(this.b[v], this.k);
        RectF rectF0 = new RectF();
        path0.computeBounds(rectF0, true);
        this.k.computeBounds(rectF0, true);
        path0.op(this.k, Path.Op.INTERSECT);
        path0.computeBounds(rectF0, true);
        return !rectF0.isEmpty() || rectF0.width() > 1.0f && rectF0.height() > 1.0f;
    }

    private void m(@NonNull c q$c0, int v) {
        e e0 = this.g(v, q$c0.a);
        this.h(v, q$c0.a).c(this.a[v], 90.0f, q$c0.e, q$c0.c, e0);
        this.b[v].reset();
        this.f(v, q$c0.c, this.d);
        this.b[v].setTranslate(this.d.x, this.d.y);
        this.b[v].preRotate(((float)((v + 1) % 4 * 90)));
    }

    void n(boolean z) {
        this.l = z;
    }

    private void o(int v) {
        this.h[0] = this.a[v].j();
        this.h[1] = this.a[v].k();
        this.b[v].mapPoints(this.h);
        this.c[v].reset();
        this.c[v].setTranslate(this.h[0], this.h[1]);
        this.c[v].preRotate(((float)((v + 1) % 4 * 90)));
    }
}

