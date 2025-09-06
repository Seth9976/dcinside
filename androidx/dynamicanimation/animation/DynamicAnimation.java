package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

public abstract class DynamicAnimation implements AnimationFrameCallback {
    static class MassState {
        float a;
        float b;

    }

    public interface OnAnimationEndListener {
        void a(DynamicAnimation arg1, boolean arg2, float arg3, float arg4);
    }

    public interface OnAnimationUpdateListener {
        void h(DynamicAnimation arg1, float arg2, float arg3);
    }

    public static abstract class ViewProperty extends FloatPropertyCompat {
        private ViewProperty(String s) {
            super(s);
        }

        ViewProperty(String s, androidx.dynamicanimation.animation.DynamicAnimation.1 dynamicAnimation$10) {
            this(s);
        }
    }

    public static final float A = 1.0f;
    public static final float B = 0.1f;
    public static final float C = 0.003906f;
    public static final float D = 0.002f;
    private static final float E = 3.402823E+38f;
    private static final float F = 0.75f;
    float a;
    float b;
    boolean c;
    final Object d;
    final FloatPropertyCompat e;
    boolean f;
    float g;
    float h;
    private long i;
    private float j;
    private final ArrayList k;
    private final ArrayList l;
    public static final ViewProperty m;
    public static final ViewProperty n;
    public static final ViewProperty o;
    public static final ViewProperty p;
    public static final ViewProperty q;
    public static final ViewProperty r;
    public static final ViewProperty s;
    public static final ViewProperty t;
    public static final ViewProperty u;
    public static final ViewProperty v;
    public static final ViewProperty w;
    public static final ViewProperty x;
    public static final ViewProperty y;
    public static final ViewProperty z;

    static {
        DynamicAnimation.m = new ViewProperty("translationX") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return view0.getTranslationX();
            }

            public void e(View view0, float f) {
                view0.setTranslationX(f);
            }
        };
        DynamicAnimation.n = new ViewProperty("translationY") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return view0.getTranslationY();
            }

            public void e(View view0, float f) {
                view0.setTranslationY(f);
            }
        };
        DynamicAnimation.o = new ViewProperty("translationZ") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return ViewCompat.F0(view0);
            }

            public void e(View view0, float f) {
                ViewCompat.I2(view0, f);
            }
        };
        DynamicAnimation.p = new ViewProperty("scaleX") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return view0.getScaleX();
            }

            public void e(View view0, float f) {
                view0.setScaleX(f);
            }
        };
        DynamicAnimation.q = new ViewProperty("scaleY") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return view0.getScaleY();
            }

            public void e(View view0, float f) {
                view0.setScaleY(f);
            }
        };
        DynamicAnimation.r = new ViewProperty("rotation") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return view0.getRotation();
            }

            public void e(View view0, float f) {
                view0.setRotation(f);
            }
        };
        DynamicAnimation.s = new ViewProperty("rotationX") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return view0.getRotationX();
            }

            public void e(View view0, float f) {
                view0.setRotationX(f);
            }
        };
        DynamicAnimation.t = new ViewProperty("rotationY") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return view0.getRotationY();
            }

            public void e(View view0, float f) {
                view0.setRotationY(f);
            }
        };
        DynamicAnimation.u = new ViewProperty("x") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return view0.getX();
            }

            public void e(View view0, float f) {
                view0.setX(f);
            }
        };
        DynamicAnimation.v = new ViewProperty("y") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return view0.getY();
            }

            public void e(View view0, float f) {
                view0.setY(f);
            }
        };
        DynamicAnimation.w = new ViewProperty("z") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return ViewCompat.K0(view0);
            }

            public void e(View view0, float f) {
                ViewCompat.M2(view0, f);
            }
        };
        DynamicAnimation.x = new ViewProperty("alpha") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return view0.getAlpha();
            }

            public void e(View view0, float f) {
                view0.setAlpha(f);
            }
        };
        DynamicAnimation.y = new ViewProperty("scrollX") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return (float)view0.getScrollX();
            }

            public void e(View view0, float f) {
                view0.setScrollX(((int)f));
            }
        };
        DynamicAnimation.z = new ViewProperty("scrollY") {
            {
                super(s, null);
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return this.d(((View)object0));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                this.e(((View)object0), f);
            }

            public float d(View view0) {
                return (float)view0.getScrollY();
            }

            public void e(View view0, float f) {
                view0.setScrollY(((int)f));
            }
        };
    }

    DynamicAnimation(FloatValueHolder floatValueHolder0) {
        this.a = 0.0f;
        this.b = 3.402823E+38f;
        this.c = false;
        this.f = false;
        this.g = 3.402823E+38f;
        this.h = -2139095040.0f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new FloatPropertyCompat("FloatValueHolder") {
            final DynamicAnimation c;

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return floatValueHolder0.a();
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                floatValueHolder0.b(f);
            }
        };
        this.j = 1.0f;
    }

    DynamicAnimation(Object object0, FloatPropertyCompat floatPropertyCompat0) {
        this.a = 0.0f;
        this.b = 3.402823E+38f;
        this.c = false;
        this.f = false;
        this.g = 3.402823E+38f;
        this.h = -2139095040.0f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = object0;
        this.e = floatPropertyCompat0;
        if(floatPropertyCompat0 != DynamicAnimation.r && floatPropertyCompat0 != DynamicAnimation.s && floatPropertyCompat0 != DynamicAnimation.t) {
            if(floatPropertyCompat0 == DynamicAnimation.x) {
                this.j = 0.003906f;
                return;
            }
            if(floatPropertyCompat0 != DynamicAnimation.p && floatPropertyCompat0 != DynamicAnimation.q) {
                this.j = 1.0f;
                return;
            }
            this.j = 0.003906f;
            return;
        }
        this.j = 0.1f;
    }

    @Override  // androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback
    @RestrictTo({Scope.a})
    public boolean a(long v) {
        long v1 = this.i;
        if(v1 == 0L) {
            this.i = v;
            this.s(this.b);
            return false;
        }
        this.i = v;
        boolean z = this.y(v - v1);
        float f = Math.max(Math.min(this.b, this.g), this.h);
        this.b = f;
        this.s(f);
        if(z) {
            this.e(false);
        }
        return z;
    }

    public DynamicAnimation b(OnAnimationEndListener dynamicAnimation$OnAnimationEndListener0) {
        if(!this.k.contains(dynamicAnimation$OnAnimationEndListener0)) {
            this.k.add(dynamicAnimation$OnAnimationEndListener0);
        }
        return this;
    }

    public DynamicAnimation c(OnAnimationUpdateListener dynamicAnimation$OnAnimationUpdateListener0) {
        if(this.k()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if(!this.l.contains(dynamicAnimation$OnAnimationUpdateListener0)) {
            this.l.add(dynamicAnimation$OnAnimationUpdateListener0);
        }
        return this;
    }

    public void d() {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if(this.f) {
            this.e(true);
        }
    }

    private void e(boolean z) {
        this.f = false;
        AnimationHandler.e().h(this);
        this.i = 0L;
        this.c = false;
        for(int v = 0; v < this.k.size(); ++v) {
            if(this.k.get(v) != null) {
                ((OnAnimationEndListener)this.k.get(v)).a(this, z, this.b, this.a);
            }
        }
        DynamicAnimation.n(this.k);
    }

    abstract float f(float arg1, float arg2);

    public float g() {
        return this.j;
    }

    private float h() {
        return this.e.b(this.d);
    }

    float i() {
        return this.j * 0.75f;
    }

    abstract boolean j(float arg1, float arg2);

    public boolean k() {
        return this.f;
    }

    public void l(OnAnimationEndListener dynamicAnimation$OnAnimationEndListener0) {
        DynamicAnimation.m(this.k, dynamicAnimation$OnAnimationEndListener0);
    }

    private static void m(ArrayList arrayList0, Object object0) {
        int v = arrayList0.indexOf(object0);
        if(v >= 0) {
            arrayList0.set(v, null);
        }
    }

    private static void n(ArrayList arrayList0) {
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            if(arrayList0.get(v) == null) {
                arrayList0.remove(v);
            }
        }
    }

    public void o(OnAnimationUpdateListener dynamicAnimation$OnAnimationUpdateListener0) {
        DynamicAnimation.m(this.l, dynamicAnimation$OnAnimationUpdateListener0);
    }

    public DynamicAnimation p(float f) {
        this.g = f;
        return this;
    }

    public DynamicAnimation q(float f) {
        this.h = f;
        return this;
    }

    public DynamicAnimation r(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.j = f;
        this.v(f * 0.75f);
        return this;
    }

    void s(float f) {
        this.e.c(this.d, f);
        for(int v = 0; v < this.l.size(); ++v) {
            if(this.l.get(v) != null) {
                ((OnAnimationUpdateListener)this.l.get(v)).h(this, this.b, this.a);
            }
        }
        DynamicAnimation.n(this.l);
    }

    public DynamicAnimation t(float f) {
        this.b = f;
        this.c = true;
        return this;
    }

    public DynamicAnimation u(float f) {
        this.a = f;
        return this;
    }

    abstract void v(float arg1);

    public void w() {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if(!this.f) {
            this.x();
        }
    }

    private void x() {
        if(!this.f) {
            this.f = true;
            if(!this.c) {
                this.b = this.h();
            }
            if(this.b > this.g || this.b < this.h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            AnimationHandler.e().a(this, 0L);
        }
    }

    abstract boolean y(long arg1);
}

