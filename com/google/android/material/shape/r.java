package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

public class r {
    static class b extends j {
        private final e c;

        public b(e r$e0) {
            this.c = r$e0;
        }

        @Override  // com.google.android.material.shape.r$j
        public void a(Matrix matrix0, @NonNull com.google.android.material.shadow.b b0, int v, @NonNull Canvas canvas0) {
            float f = this.c.m();
            float f1 = this.c.n();
            b0.a(canvas0, matrix0, new RectF(this.c.k(), this.c.o(), this.c.l(), this.c.j()), v, f, f1);
        }
    }

    static class c extends j {
        private final g c;
        private final g d;
        private final float e;
        private final float f;

        public c(g r$g0, g r$g1, float f, float f1) {
            this.c = r$g0;
            this.d = r$g1;
            this.e = f;
            this.f = f1;
        }

        @Override  // com.google.android.material.shape.r$j
        public void a(Matrix matrix0, com.google.android.material.shadow.b b0, int v, Canvas canvas0) {
            float f = this.e();
            if(f > 0.0f) {
                return;
            }
            double f1 = Math.hypot(this.c.b - this.e, this.c.c - this.f);
            double f2 = Math.hypot(this.d.b - this.c.b, this.d.c - this.c.c);
            float f3 = (float)Math.min(v, Math.min(f1, f2));
            double f4 = Math.tan(Math.toRadians(-f / 2.0f)) * ((double)f3);
            if(f1 > f4) {
                RectF rectF0 = new RectF(0.0f, 0.0f, ((float)(f1 - f4)), 0.0f);
                this.a.set(matrix0);
                this.a.preTranslate(this.e, this.f);
                float f5 = this.d();
                this.a.preRotate(f5);
                b0.b(canvas0, this.a, rectF0, v);
            }
            RectF rectF1 = new RectF(0.0f, 0.0f, 2.0f * f3, 2.0f * f3);
            this.a.set(matrix0);
            this.a.preTranslate(this.c.b, this.c.c);
            float f6 = this.d();
            this.a.preRotate(f6);
            this.a.preTranslate(((float)(-f4 - ((double)f3))), -2.0f * f3);
            b0.c(canvas0, this.a, rectF1, ((int)f3), 450.0f, f, new float[]{((float)(((double)f3) + f4)), 2.0f * f3});
            if(f2 > f4) {
                RectF rectF2 = new RectF(0.0f, 0.0f, ((float)(f2 - f4)), 0.0f);
                this.a.set(matrix0);
                this.a.preTranslate(this.c.b, this.c.c);
                float f7 = this.c();
                this.a.preRotate(f7);
                this.a.preTranslate(((float)f4), 0.0f);
                b0.b(canvas0, this.a, rectF2, v);
            }
        }

        float c() {
            return (float)Math.toDegrees(Math.atan((this.d.c - this.c.c) / (this.d.b - this.c.b)));
        }

        float d() {
            return (float)Math.toDegrees(Math.atan((this.c.c - this.f) / (this.c.b - this.e)));
        }

        float e() {
            float f = (this.c() - this.d() + 360.0f) % 360.0f;
            return f <= 180.0f ? f : f - 360.0f;
        }
    }

    static class d extends j {
        private final g c;
        private final float d;
        private final float e;

        public d(g r$g0, float f, float f1) {
            this.c = r$g0;
            this.d = f;
            this.e = f1;
        }

        @Override  // com.google.android.material.shape.r$j
        public void a(Matrix matrix0, @NonNull com.google.android.material.shadow.b b0, int v, @NonNull Canvas canvas0) {
            RectF rectF0 = new RectF(0.0f, 0.0f, ((float)Math.hypot(this.c.c - this.e, this.c.b - this.d)), 0.0f);
            this.a.set(matrix0);
            this.a.preTranslate(this.d, this.e);
            float f = this.c();
            this.a.preRotate(f);
            b0.b(canvas0, this.a, rectF0, v);
        }

        float c() {
            return (float)Math.toDegrees(Math.atan((this.c.c - this.e) / (this.c.b - this.d)));
        }
    }

    public static class e extends h {
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;
        private static final RectF h;

        static {
            e.h = new RectF();
        }

        public e(float f, float f1, float f2, float f3) {
            this.q(f);
            this.u(f1);
            this.r(f2);
            this.p(f3);
        }

        @Override  // com.google.android.material.shape.r$h
        public void a(@NonNull Matrix matrix0, @NonNull Path path0) {
            matrix0.invert(this.a);
            path0.transform(this.a);
            e.h.set(this.k(), this.o(), this.l(), this.j());
            path0.arcTo(e.h, this.m(), this.n(), false);
            path0.transform(matrix0);
        }

        private float j() {
            return this.e;
        }

        private float k() {
            return this.b;
        }

        private float l() {
            return this.d;
        }

        private float m() {
            return this.f;
        }

        private float n() {
            return this.g;
        }

        private float o() {
            return this.c;
        }

        private void p(float f) {
            this.e = f;
        }

        private void q(float f) {
            this.b = f;
        }

        private void r(float f) {
            this.d = f;
        }

        private void s(float f) {
            this.f = f;
        }

        private void t(float f) {
            this.g = f;
        }

        private void u(float f) {
            this.c = f;
        }
    }

    public static class f extends h {
        private float b;
        private float c;
        private float d;
        private float e;
        private float f;
        private float g;

        public f(float f, float f1, float f2, float f3, float f4, float f5) {
            this.h(f);
            this.j(f1);
            this.i(f2);
            this.k(f3);
            this.l(f4);
            this.m(f5);
        }

        @Override  // com.google.android.material.shape.r$h
        public void a(@NonNull Matrix matrix0, @NonNull Path path0) {
            matrix0.invert(this.a);
            path0.transform(this.a);
            path0.cubicTo(this.b, this.c, this.d, this.e, this.f, this.g);
            path0.transform(matrix0);
        }

        private float b() {
            return this.b;
        }

        private float c() {
            return this.d;
        }

        private float d() {
            return this.c;
        }

        private float e() {
            return this.c;
        }

        private float f() {
            return this.f;
        }

        private float g() {
            return this.g;
        }

        private void h(float f) {
            this.b = f;
        }

        private void i(float f) {
            this.d = f;
        }

        private void j(float f) {
            this.c = f;
        }

        private void k(float f) {
            this.e = f;
        }

        private void l(float f) {
            this.f = f;
        }

        private void m(float f) {
            this.g = f;
        }
    }

    public static class g extends h {
        private float b;
        private float c;

        @Override  // com.google.android.material.shape.r$h
        public void a(@NonNull Matrix matrix0, @NonNull Path path0) {
            matrix0.invert(this.a);
            path0.transform(this.a);
            path0.lineTo(this.b, this.c);
            path0.transform(matrix0);
        }
    }

    public static abstract class h {
        protected final Matrix a;

        public h() {
            this.a = new Matrix();
        }

        public abstract void a(Matrix arg1, Path arg2);
    }

    public static class i extends h {
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;

        @Override  // com.google.android.material.shape.r$h
        public void a(@NonNull Matrix matrix0, @NonNull Path path0) {
            matrix0.invert(this.a);
            path0.transform(this.a);
            path0.quadTo(this.f(), this.g(), this.h(), this.i());
            path0.transform(matrix0);
        }

        private float f() {
            return this.b;
        }

        private float g() {
            return this.c;
        }

        private float h() {
            return this.d;
        }

        private float i() {
            return this.e;
        }

        private void j(float f) {
            this.b = f;
        }

        private void k(float f) {
            this.c = f;
        }

        private void l(float f) {
            this.d = f;
        }

        private void m(float f) {
            this.e = f;
        }
    }

    static abstract class j {
        final Matrix a;
        static final Matrix b;

        static {
            j.b = new Matrix();
        }

        j() {
            this.a = new Matrix();
        }

        public abstract void a(Matrix arg1, com.google.android.material.shadow.b arg2, int arg3, Canvas arg4);

        public final void b(com.google.android.material.shadow.b b0, int v, Canvas canvas0) {
            this.a(j.b, b0, v, canvas0);
        }
    }

    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    private final List g;
    private final List h;
    private boolean i;
    private static final float j = 270.0f;
    protected static final float k = 180.0f;

    public r() {
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.q(0.0f, 0.0f);
    }

    public r(float f, float f1) {
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.q(f, f1);
    }

    public void a(float f, float f1, float f2, float f3, float f4, float f5) {
        e r$e0 = new e(f, f1, f2, f3);
        r$e0.s(f4);
        r$e0.t(f5);
        this.g.add(r$e0);
        b r$b0 = new b(r$e0);
        float f6 = f4 + f5;
        if(f5 < 0.0f) {
            f4 = (f4 + 180.0f) % 360.0f;
        }
        this.c(r$b0, f4, (f5 < 0.0f ? (f6 + 180.0f) % 360.0f : f6));
        this.u((f + f2) * 0.5f + (f2 - f) / 2.0f * ((float)Math.cos(Math.toRadians(f6))));
        this.v((f1 + f3) * 0.5f + (f3 - f1) / 2.0f * ((float)Math.sin(Math.toRadians(f6))));
    }

    private void b(float f) {
        if(this.h() == f) {
            return;
        }
        float f1 = (f - this.h() + 360.0f) % 360.0f;
        if(f1 > 180.0f) {
            return;
        }
        e r$e0 = new e(this.j(), this.k(), this.j(), this.k());
        r$e0.s(this.h());
        r$e0.t(f1);
        b r$b0 = new b(r$e0);
        this.h.add(r$b0);
        this.s(f);
    }

    private void c(j r$j0, float f, float f1) {
        this.b(f);
        this.h.add(r$j0);
        this.s(f1);
    }

    public void d(Matrix matrix0, Path path0) {
        int v = this.g.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((h)this.g.get(v1)).a(matrix0, path0);
        }
    }

    boolean e() {
        return this.i;
    }

    @NonNull
    j f(Matrix matrix0) {
        class a extends j {
            final List c;
            final Matrix d;
            final r e;

            a(List list0, Matrix matrix0) {
                this.c = list0;
                this.d = matrix0;
                super();
            }

            @Override  // com.google.android.material.shape.r$j
            public void a(Matrix matrix0, com.google.android.material.shadow.b b0, int v, Canvas canvas0) {
                for(Object object0: this.c) {
                    ((j)object0).a(this.d, b0, v, canvas0);
                }
            }
        }

        this.b(this.i());
        Matrix matrix1 = new Matrix(matrix0);
        return new a(this, new ArrayList(this.h), matrix1);
    }

    @RequiresApi(21)
    public void g(float f, float f1, float f2, float f3, float f4, float f5) {
        f r$f0 = new f(f, f1, f2, f3, f4, f5);
        this.g.add(r$f0);
        this.i = true;
        this.u(f4);
        this.v(f5);
    }

    private float h() {
        return this.e;
    }

    private float i() {
        return this.f;
    }

    float j() {
        return this.c;
    }

    float k() {
        return this.d;
    }

    float l() {
        return this.a;
    }

    float m() {
        return this.b;
    }

    public void n(float f, float f1) {
        g r$g0 = new g();
        r$g0.b = f;
        r$g0.c = f1;
        this.g.add(r$g0);
        d r$d0 = new d(r$g0, this.j(), this.k());
        this.c(r$d0, r$d0.c() + 270.0f, r$d0.c() + 270.0f);
        this.u(f);
        this.v(f1);
    }

    public void o(float f, float f1, float f2, float f3) {
        if(Math.abs(f - this.j()) < 0.001f && Math.abs(f1 - this.k()) < 0.001f || Math.abs(f - f2) < 0.001f && Math.abs(f1 - f3) < 0.001f) {
            this.n(f2, f3);
            return;
        }
        g r$g0 = new g();
        r$g0.b = f;
        r$g0.c = f1;
        this.g.add(r$g0);
        g r$g1 = new g();
        r$g1.b = f2;
        r$g1.c = f3;
        this.g.add(r$g1);
        c r$c0 = new c(r$g0, r$g1, this.j(), this.k());
        if(r$c0.e() > 0.0f) {
            this.n(f, f1);
            this.n(f2, f3);
            return;
        }
        this.c(r$c0, r$c0.d() + 270.0f, r$c0.c() + 270.0f);
        this.u(f2);
        this.v(f3);
    }

    @RequiresApi(21)
    public void p(float f, float f1, float f2, float f3) {
        i r$i0 = new i();
        r$i0.j(f);
        r$i0.k(f1);
        r$i0.l(f2);
        r$i0.m(f3);
        this.g.add(r$i0);
        this.i = true;
        this.u(f2);
        this.v(f3);
    }

    public void q(float f, float f1) {
        this.r(f, f1, 270.0f, 0.0f);
    }

    public void r(float f, float f1, float f2, float f3) {
        this.w(f);
        this.x(f1);
        this.u(f);
        this.v(f1);
        this.s(f2);
        this.t((f2 + f3) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }

    private void s(float f) {
        this.e = f;
    }

    private void t(float f) {
        this.f = f;
    }

    private void u(float f) {
        this.c = f;
    }

    private void v(float f) {
        this.d = f;
    }

    private void w(float f) {
        this.a = f;
    }

    private void x(float f) {
        this.b = f;
    }
}

