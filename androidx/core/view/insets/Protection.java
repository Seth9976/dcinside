package androidx.core.view.insets;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.FloatRange;
import androidx.core.graphics.Insets;

public abstract class Protection {
    static class Attributes {
        interface Callback {
            void a(Drawable arg1);

            void b(int arg1);

            void c(boolean arg1);

            void d(Insets arg1);

            void e(float arg1);

            void f(int arg1);

            void g(float arg1);

            void h(float arg1);
        }

        private int a;
        private int b;
        private Insets c;
        private boolean d;
        private Drawable e;
        private float f;
        private float g;
        private float h;
        private Callback i;
        private static final int j = -1;

        Attributes() {
            this.a = -1;
            this.b = -1;
            this.c = Insets.e;
            this.d = false;
            this.e = null;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 1.0f;
        }

        private void A(int v) {
            if(this.a != v) {
                this.a = v;
                Callback protection$Attributes$Callback0 = this.i;
                if(protection$Attributes$Callback0 != null) {
                    protection$Attributes$Callback0.f(v);
                }
            }
        }

        float k() {
            return this.h;
        }

        Drawable l() {
            return this.e;
        }

        int m() {
            return this.b;
        }

        Insets n() {
            return this.c;
        }

        float o() {
            return this.f;
        }

        float p() {
            return this.g;
        }

        int q() {
            return this.a;
        }

        boolean r() {
            return this.d;
        }

        private void s(float f) {
            if(this.h != f) {
                this.h = f;
                Callback protection$Attributes$Callback0 = this.i;
                if(protection$Attributes$Callback0 != null) {
                    protection$Attributes$Callback0.e(f);
                }
            }
        }

        void t(Callback protection$Attributes$Callback0) {
            if(this.i != null && protection$Attributes$Callback0 != null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            this.i = protection$Attributes$Callback0;
        }

        private void u(Drawable drawable0) {
            this.e = drawable0;
            Callback protection$Attributes$Callback0 = this.i;
            if(protection$Attributes$Callback0 != null) {
                protection$Attributes$Callback0.a(drawable0);
            }
        }

        private void v(int v) {
            if(this.b != v) {
                this.b = v;
                Callback protection$Attributes$Callback0 = this.i;
                if(protection$Attributes$Callback0 != null) {
                    protection$Attributes$Callback0.b(v);
                }
            }
        }

        private void w(Insets insets0) {
            if(!this.c.equals(insets0)) {
                this.c = insets0;
                Callback protection$Attributes$Callback0 = this.i;
                if(protection$Attributes$Callback0 != null) {
                    protection$Attributes$Callback0.d(insets0);
                }
            }
        }

        private void x(float f) {
            if(this.f != f) {
                this.f = f;
                Callback protection$Attributes$Callback0 = this.i;
                if(protection$Attributes$Callback0 != null) {
                    protection$Attributes$Callback0.g(f);
                }
            }
        }

        private void y(float f) {
            if(this.g != f) {
                this.g = f;
                Callback protection$Attributes$Callback0 = this.i;
                if(protection$Attributes$Callback0 != null) {
                    protection$Attributes$Callback0.h(f);
                }
            }
        }

        private void z(boolean z) {
            if(this.d != z) {
                this.d = z;
                Callback protection$Attributes$Callback0 = this.i;
                if(protection$Attributes$Callback0 != null) {
                    protection$Attributes$Callback0.c(z);
                }
            }
        }
    }

    private final int a;
    private final Attributes b;
    private Insets c;
    private Insets d;
    private float e;
    private float f;
    private float g;
    private float h;
    private Object i;
    private ValueAnimator j;
    private ValueAnimator k;
    private static final Interpolator l = null;
    private static final Interpolator m = null;
    private static final Interpolator n = null;
    private static final Interpolator o = null;
    private static final long p = 333L;
    private static final long q = 0xA6L;

    static {
        Protection.l = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        Protection.m = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        Protection.n = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        Protection.o = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public Protection(int v) {
        this.b = new Attributes();
        this.c = Insets.e;
        this.d = Insets.e;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = null;
        this.j = null;
        this.k = null;
        if(v != 1 && v != 2 && v != 4 && v != 8) {
            throw new IllegalArgumentException("Unexpected side: " + v);
        }
        this.a = v;
    }

    private void A() {
        this.b.s(this.e * this.f);
    }

    private void B() {
        float f = this.h * this.g;
        switch(this.a) {
            case 1: {
                this.b.x(-(1.0f - f) * ((float)this.b.a));
                return;
            }
            case 2: {
                this.b.y(-(1.0f - f) * ((float)this.b.b));
                return;
            }
            case 4: {
                this.b.x((1.0f - f) * ((float)this.b.a));
                return;
            }
            case 8: {
                this.b.y((1.0f - f) * ((float)this.b.b));
            }
        }
    }

    Insets C() {
        int v;
        Insets insets0 = Insets.e;
        boolean z = true;
        switch(this.a) {
            case 1: {
                v = this.c.a;
                this.b.A(this.n(this.d.a));
                if(this.q()) {
                    insets0 = Insets.d(this.n(v), 0, 0, 0);
                }
                break;
            }
            case 2: {
                v = this.c.b;
                this.b.v(this.n(this.d.b));
                if(this.q()) {
                    insets0 = Insets.d(0, this.n(v), 0, 0);
                }
                break;
            }
            case 4: {
                v = this.c.c;
                this.b.A(this.n(this.d.c));
                if(this.q()) {
                    insets0 = Insets.d(0, 0, this.n(v), 0);
                }
                break;
            }
            case 8: {
                v = this.c.d;
                this.b.v(this.n(this.d.d));
                if(this.q()) {
                    insets0 = Insets.d(0, 0, 0, this.n(v));
                }
                break;
            }
            default: {
                v = 0;
            }
        }
        if(v <= 0) {
            z = false;
        }
        this.z(z);
        float f = 0.0f;
        this.x((v <= 0 ? 0.0f : 1.0f));
        if(v > 0) {
            f = 1.0f;
        }
        this.y(f);
        return insets0;
    }

    public void c(float f) {
        this.e();
        float f1 = this.f;
        if(f == f1) {
            return;
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{f1, f});
        this.j = valueAnimator0;
        if(this.f < f) {
            valueAnimator0.setDuration(333L);
            this.j.setInterpolator(Protection.n);
        }
        else {
            valueAnimator0.setDuration(0xA6L);
            this.j.setInterpolator(Protection.o);
        }
        this.j.addUpdateListener((ValueAnimator valueAnimator0) -> this.s(((float)(((Float)valueAnimator0.getAnimatedValue())))));
        this.j.start();
    }

    public void d(float f) {
        this.f();
        float f1 = this.h;
        if(f == f1) {
            return;
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{f1, f});
        this.k = valueAnimator0;
        if(this.h < f) {
            valueAnimator0.setDuration(333L);
            this.k.setInterpolator(Protection.l);
        }
        else {
            valueAnimator0.setDuration(0xA6L);
            this.k.setInterpolator(Protection.m);
        }
        this.k.addUpdateListener((ValueAnimator valueAnimator0) -> this.s(((float)(((Float)valueAnimator0.getAnimatedValue())))));
        this.k.start();
    }

    private void e() {
        ValueAnimator valueAnimator0 = this.j;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
            this.j = null;
        }
    }

    private void f() {
        ValueAnimator valueAnimator0 = this.k;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
            this.k = null;
        }
    }

    void g(int v) {
    }

    Insets h(Insets insets0, Insets insets1, Insets insets2) {
        this.c = insets0;
        this.d = insets1;
        this.b.w(insets2);
        return this.C();
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float i() {
        return this.f;
    }

    Attributes j() {
        return this.b;
    }

    Object k() {
        return this.i;
    }

    public float l() {
        return this.h;
    }

    public int m() {
        return this.a;
    }

    int n(int v) {
        return v;
    }

    // 检测为 Lambda 实现
    private void o(ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    private void p(ValueAnimator valueAnimator0) [...]

    boolean q() {
        return false;
    }

    public void r(@FloatRange(from = 0.0, to = 1.0) float f) {
        if(f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Alpha must in a range of [0, 1]. Got: " + f);
        }
        this.e();
        this.s(f);
    }

    private void s(float f) {
        this.f = f;
        this.A();
    }

    void t(Object object0) {
        this.i = object0;
    }

    void u(Drawable drawable0) {
        this.b.u(drawable0);
    }

    public void v(@FloatRange(from = 0.0, to = 1.0) float f) {
        if(f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Inset amount must in a range of [0, 1]. Got: " + f);
        }
        this.f();
        this.w(f);
    }

    private void w(float f) {
        this.h = f;
        this.B();
    }

    void x(@FloatRange(from = 0.0, to = 1.0) float f) {
        this.e = f;
        this.A();
    }

    void y(@FloatRange(from = 0.0, to = 1.0) float f) {
        this.g = f;
        this.B();
    }

    void z(boolean z) {
        this.b.z(z);
    }
}

