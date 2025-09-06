package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.WindowInsetsAnimation.Callback;
import android.view.WindowInsetsAnimation;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.R.id;
import androidx.core.graphics.Insets;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import j..util.DesugarCollections;
import j..util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class WindowInsetsAnimationCompat {
    public static final class BoundsCompat {
        private final Insets a;
        private final Insets b;

        @RequiresApi(30)
        private BoundsCompat(WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
            this.a = Impl30.k(windowInsetsAnimation$Bounds0);
            this.b = Impl30.j(windowInsetsAnimation$Bounds0);
        }

        public BoundsCompat(Insets insets0, Insets insets1) {
            this.a = insets0;
            this.b = insets1;
        }

        public Insets a() {
            return this.a;
        }

        public Insets b() {
            return this.b;
        }

        public BoundsCompat c(Insets insets0) {
            return new BoundsCompat(WindowInsetsCompat.z(this.a, insets0.a, insets0.b, insets0.c, insets0.d), WindowInsetsCompat.z(this.b, insets0.a, insets0.b, insets0.c, insets0.d));
        }

        @RequiresApi(30)
        public WindowInsetsAnimation.Bounds d() {
            return Impl30.i(this);
        }

        @RequiresApi(30)
        public static BoundsCompat e(WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
            return new BoundsCompat(windowInsetsAnimation$Bounds0);
        }

        @Override
        public String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }
    }

    public static abstract class Callback {
        @RestrictTo({Scope.b})
        @Retention(RetentionPolicy.SOURCE)
        public @interface DispatchMode {
        }

        WindowInsetsCompat a;
        private final int b;
        public static final int c = 0;
        public static final int d = 1;

        public Callback(int v) {
            this.b = v;
        }

        public final int b() {
            return this.b;
        }

        public void c(WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
        }

        public void d(WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
        }

        public abstract WindowInsetsCompat e(WindowInsetsCompat arg1, List arg2);

        public BoundsCompat f(WindowInsetsAnimationCompat windowInsetsAnimationCompat0, BoundsCompat windowInsetsAnimationCompat$BoundsCompat0) {
            return windowInsetsAnimationCompat$BoundsCompat0;
        }
    }

    @RequiresApi(21)
    static class Impl21 extends Impl {
        @RequiresApi(21)
        static class Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {
            final Callback a;
            private WindowInsetsCompat b;
            private static final int c = 0xA0;
            private static final int d = 0xFA;

            Impl21OnApplyWindowInsetsListener(View view0, Callback windowInsetsAnimationCompat$Callback0) {
                this.a = windowInsetsAnimationCompat$Callback0;
                WindowInsetsCompat windowInsetsCompat0 = ViewCompat.t0(view0);
                this.b = windowInsetsCompat0 == null ? null : new Builder(windowInsetsCompat0).a();
            }

            @Override  // android.view.View$OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
                if(!view0.isLaidOut()) {
                    this.b = WindowInsetsCompat.M(windowInsets0, view0);
                    return Impl21.q(view0, windowInsets0);
                }
                WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.M(windowInsets0, view0);
                if(this.b == null) {
                    this.b = ViewCompat.t0(view0);
                }
                if(this.b == null) {
                    this.b = windowInsetsCompat0;
                    return Impl21.q(view0, windowInsets0);
                }
                Callback windowInsetsAnimationCompat$Callback0 = Impl21.r(view0);
                if(windowInsetsAnimationCompat$Callback0 != null && Objects.equals(windowInsetsAnimationCompat$Callback0.a, windowInsetsCompat0)) {
                    return Impl21.q(view0, windowInsets0);
                }
                int[] arr_v = new int[1];
                int[] arr_v1 = new int[1];
                Impl21.i(windowInsetsCompat0, this.b, arr_v, arr_v1);
                int v = arr_v[0];
                int v1 = arr_v1[0];
                int v2 = v | v1;
                if(v2 == 0) {
                    this.b = windowInsetsCompat0;
                    return Impl21.q(view0, windowInsets0);
                }
                WindowInsetsCompat windowInsetsCompat1 = this.b;
                WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = new WindowInsetsAnimationCompat(v2, Impl21.k(v, v1), ((8 & v2) == 0 ? 0xFAL : 0xA0L));
                windowInsetsAnimationCompat0.i(0.0f);
                ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(windowInsetsAnimationCompat0.b());
                BoundsCompat windowInsetsAnimationCompat$BoundsCompat0 = Impl21.j(windowInsetsCompat0, windowInsetsCompat1, v2);
                Impl21.n(view0, windowInsetsAnimationCompat0, windowInsetsCompat0, false);
                valueAnimator0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    final Impl21OnApplyWindowInsetsListener f;

                    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                        float f = valueAnimator0.getAnimatedFraction();
                        windowInsetsAnimationCompat0.i(f);
                        float f1 = windowInsetsAnimationCompat0.d();
                        WindowInsetsCompat windowInsetsCompat0 = Impl21.s(windowInsetsCompat0, windowInsetsCompat1, f1, v2);
                        List list0 = Collections.singletonList(windowInsetsAnimationCompat0);
                        Impl21.o(view0, windowInsetsCompat0, list0);
                    }
                });
                valueAnimator0.addListener(new AnimatorListenerAdapter() {
                    final Impl21OnApplyWindowInsetsListener c;

                    @Override  // android.animation.AnimatorListenerAdapter
                    public void onAnimationEnd(Animator animator0) {
                        windowInsetsAnimationCompat0.i(1.0f);
                        Impl21.m(view0, windowInsetsAnimationCompat0);
                    }
                });
                OneShotPreDrawListener.a(view0, new Runnable() {
                    final Impl21OnApplyWindowInsetsListener e;

                    @Override
                    public void run() {
                        Impl21.p(view0, windowInsetsAnimationCompat0, windowInsetsAnimationCompat$BoundsCompat0);
                        valueAnimator0.start();
                    }
                });
                this.b = windowInsetsCompat0;
                return Impl21.q(view0, windowInsets0);
            }
        }

        private static final Interpolator f;
        private static final Interpolator g;
        private static final Interpolator h;
        private static final Interpolator i;

        static {
            Impl21.f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
            Impl21.g = new FastOutLinearInInterpolator();
            Impl21.h = new DecelerateInterpolator(1.5f);
            Impl21.i = new AccelerateInterpolator(1.5f);
        }

        Impl21(int v, Interpolator interpolator0, long v1) {
            super(v, interpolator0, v1);
        }

        @SuppressLint({"WrongConstant"})
        static void i(WindowInsetsCompat windowInsetsCompat0, WindowInsetsCompat windowInsetsCompat1, int[] arr_v, int[] arr_v1) {
            for(int v = 1; v <= 0x200; v <<= 1) {
                Insets insets0 = windowInsetsCompat0.f(v);
                Insets insets1 = windowInsetsCompat1.f(v);
                int v1 = insets0.a > insets1.a || insets0.b > insets1.b || insets0.c > insets1.c || insets0.d > insets1.d ? 1 : 0;
                if(v1 != (insets0.a < insets1.a || insets0.b < insets1.b || insets0.c < insets1.c || insets0.d < insets1.d ? 1 : 0)) {
                    if(v1 == 0) {
                        arr_v1[0] |= v;
                    }
                    else {
                        arr_v[0] |= v;
                    }
                }
            }
        }

        static BoundsCompat j(WindowInsetsCompat windowInsetsCompat0, WindowInsetsCompat windowInsetsCompat1, int v) {
            Insets insets0 = windowInsetsCompat0.f(v);
            Insets insets1 = windowInsetsCompat1.f(v);
            return new BoundsCompat(Insets.d(Math.min(insets0.a, insets1.a), Math.min(insets0.b, insets1.b), Math.min(insets0.c, insets1.c), Math.min(insets0.d, insets1.d)), Insets.d(Math.max(insets0.a, insets1.a), Math.max(insets0.b, insets1.b), Math.max(insets0.c, insets1.c), Math.max(insets0.d, insets1.d)));
        }

        static Interpolator k(int v, int v1) {
            if((8 & v) != 0) {
                return Impl21.f;
            }
            if((8 & v1) != 0) {
                return Impl21.g;
            }
            if((v & 0x207) != 0) {
                return Impl21.h;
            }
            return (0x207 & v1) == 0 ? null : Impl21.i;
        }

        private static View.OnApplyWindowInsetsListener l(View view0, Callback windowInsetsAnimationCompat$Callback0) {
            return new Impl21OnApplyWindowInsetsListener(view0, windowInsetsAnimationCompat$Callback0);
        }

        static void m(View view0, WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
            Callback windowInsetsAnimationCompat$Callback0 = Impl21.r(view0);
            if(windowInsetsAnimationCompat$Callback0 != null) {
                windowInsetsAnimationCompat$Callback0.c(windowInsetsAnimationCompat0);
                if(windowInsetsAnimationCompat$Callback0.b() == 0) {
                    return;
                }
            }
            if(view0 instanceof ViewGroup) {
                for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                    Impl21.m(((ViewGroup)view0).getChildAt(v), windowInsetsAnimationCompat0);
                }
            }
        }

        static void n(View view0, WindowInsetsAnimationCompat windowInsetsAnimationCompat0, WindowInsetsCompat windowInsetsCompat0, boolean z) {
            Callback windowInsetsAnimationCompat$Callback0 = Impl21.r(view0);
            if(windowInsetsAnimationCompat$Callback0 != null) {
                windowInsetsAnimationCompat$Callback0.a = windowInsetsCompat0;
                if(!z) {
                    windowInsetsAnimationCompat$Callback0.d(windowInsetsAnimationCompat0);
                    z = windowInsetsAnimationCompat$Callback0.b() == 0;
                }
            }
            if(view0 instanceof ViewGroup) {
                for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                    Impl21.n(((ViewGroup)view0).getChildAt(v), windowInsetsAnimationCompat0, windowInsetsCompat0, z);
                }
            }
        }

        static void o(View view0, WindowInsetsCompat windowInsetsCompat0, List list0) {
            Callback windowInsetsAnimationCompat$Callback0 = Impl21.r(view0);
            if(windowInsetsAnimationCompat$Callback0 != null) {
                windowInsetsCompat0 = windowInsetsAnimationCompat$Callback0.e(windowInsetsCompat0, list0);
                if(windowInsetsAnimationCompat$Callback0.b() == 0) {
                    return;
                }
            }
            if(view0 instanceof ViewGroup) {
                for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                    Impl21.o(((ViewGroup)view0).getChildAt(v), windowInsetsCompat0, list0);
                }
            }
        }

        static void p(View view0, WindowInsetsAnimationCompat windowInsetsAnimationCompat0, BoundsCompat windowInsetsAnimationCompat$BoundsCompat0) {
            Callback windowInsetsAnimationCompat$Callback0 = Impl21.r(view0);
            if(windowInsetsAnimationCompat$Callback0 != null) {
                windowInsetsAnimationCompat$Callback0.f(windowInsetsAnimationCompat0, windowInsetsAnimationCompat$BoundsCompat0);
                if(windowInsetsAnimationCompat$Callback0.b() == 0) {
                    return;
                }
            }
            if(view0 instanceof ViewGroup) {
                for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                    Impl21.p(((ViewGroup)view0).getChildAt(v), windowInsetsAnimationCompat0, windowInsetsAnimationCompat$BoundsCompat0);
                }
            }
        }

        static WindowInsets q(View view0, WindowInsets windowInsets0) {
            return view0.getTag(id.tag_on_apply_window_listener) == null ? view0.onApplyWindowInsets(windowInsets0) : windowInsets0;
        }

        static Callback r(View view0) {
            Object object0 = view0.getTag(id.tag_window_insets_animation_callback);
            return object0 instanceof Impl21OnApplyWindowInsetsListener ? ((Impl21OnApplyWindowInsetsListener)object0).a : null;
        }

        @SuppressLint({"WrongConstant"})
        static WindowInsetsCompat s(WindowInsetsCompat windowInsetsCompat0, WindowInsetsCompat windowInsetsCompat1, float f, int v) {
            Builder windowInsetsCompat$Builder0 = new Builder(windowInsetsCompat0);
            for(int v1 = 1; v1 <= 0x200; v1 <<= 1) {
                if((v & v1) == 0) {
                    windowInsetsCompat$Builder0.c(v1, windowInsetsCompat0.f(v1));
                }
                else {
                    Insets insets0 = windowInsetsCompat0.f(v1);
                    Insets insets1 = windowInsetsCompat1.f(v1);
                    windowInsetsCompat$Builder0.c(v1, WindowInsetsCompat.z(insets0, ((int)(((double)(((float)(insets0.a - insets1.a)) * (1.0f - f))) + 0.5)), ((int)(((double)(((float)(insets0.b - insets1.b)) * (1.0f - f))) + 0.5)), ((int)(((double)(((float)(insets0.c - insets1.c)) * (1.0f - f))) + 0.5)), ((int)(((double)(((float)(insets0.d - insets1.d)) * (1.0f - f))) + 0.5))));
                }
            }
            return windowInsetsCompat$Builder0.a();
        }

        static void t(View view0, Callback windowInsetsAnimationCompat$Callback0) {
            View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0 = windowInsetsAnimationCompat$Callback0 == null ? null : Impl21.l(view0, windowInsetsAnimationCompat$Callback0);
            view0.setTag(id.tag_window_insets_animation_callback, view$OnApplyWindowInsetsListener0);
            if(view0.getTag(id.tag_compat_insets_dispatch) == null && view0.getTag(id.tag_on_apply_window_listener) == null) {
                view0.setOnApplyWindowInsetsListener(view$OnApplyWindowInsetsListener0);
            }
        }
    }

    @RequiresApi(30)
    static class Impl30 extends Impl {
        @RequiresApi(30)
        static class ProxyCallback extends WindowInsetsAnimation.Callback {
            private final Callback a;
            private List b;
            private ArrayList c;
            private final HashMap d;

            ProxyCallback(Callback windowInsetsAnimationCompat$Callback0) {
                super(windowInsetsAnimationCompat$Callback0.b());
                this.d = new HashMap();
                this.a = windowInsetsAnimationCompat$Callback0;
            }

            private WindowInsetsAnimationCompat a(WindowInsetsAnimation windowInsetsAnimation0) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = (WindowInsetsAnimationCompat)this.d.get(windowInsetsAnimation0);
                if(windowInsetsAnimationCompat0 == null) {
                    windowInsetsAnimationCompat0 = WindowInsetsAnimationCompat.j(windowInsetsAnimation0);
                    this.d.put(windowInsetsAnimation0, windowInsetsAnimationCompat0);
                }
                return windowInsetsAnimationCompat0;
            }

            @Override  // android.view.WindowInsetsAnimation$Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation0) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = this.a(windowInsetsAnimation0);
                this.a.c(windowInsetsAnimationCompat0);
                this.d.remove(windowInsetsAnimation0);
            }

            @Override  // android.view.WindowInsetsAnimation$Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation0) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = this.a(windowInsetsAnimation0);
                this.a.d(windowInsetsAnimationCompat0);
            }

            @Override  // android.view.WindowInsetsAnimation$Callback
            public WindowInsets onProgress(WindowInsets windowInsets0, List list0) {
                ArrayList arrayList0 = this.c;
                if(arrayList0 == null) {
                    ArrayList arrayList1 = new ArrayList(list0.size());
                    this.c = arrayList1;
                    this.b = DesugarCollections.unmodifiableList(arrayList1);
                }
                else {
                    arrayList0.clear();
                }
                for(int v = list0.size() - 1; v >= 0; --v) {
                    WindowInsetsAnimation windowInsetsAnimation0 = e0.a(list0.get(v));
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = this.a(windowInsetsAnimation0);
                    windowInsetsAnimationCompat0.i(windowInsetsAnimation0.getFraction());
                    this.c.add(windowInsetsAnimationCompat0);
                }
                WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.L(windowInsets0);
                return this.a.e(windowInsetsCompat0, this.b).K();
            }

            @Override  // android.view.WindowInsetsAnimation$Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation0, WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = this.a(windowInsetsAnimation0);
                BoundsCompat windowInsetsAnimationCompat$BoundsCompat0 = BoundsCompat.e(windowInsetsAnimation$Bounds0);
                return this.a.f(windowInsetsAnimationCompat0, windowInsetsAnimationCompat$BoundsCompat0).d();
            }
        }

        private final WindowInsetsAnimation f;

        Impl30(int v, Interpolator interpolator0, long v1) {
            this(S.a(v, interpolator0, v1));
        }

        Impl30(WindowInsetsAnimation windowInsetsAnimation0) {
            super(0, null, 0L);
            this.f = windowInsetsAnimation0;
        }

        @Override  // androidx.core.view.WindowInsetsAnimationCompat$Impl
        public float a() {
            return this.f.getAlpha();
        }

        @Override  // androidx.core.view.WindowInsetsAnimationCompat$Impl
        public long b() {
            return this.f.getDurationMillis();
        }

        @Override  // androidx.core.view.WindowInsetsAnimationCompat$Impl
        public float c() {
            return this.f.getFraction();
        }

        @Override  // androidx.core.view.WindowInsetsAnimationCompat$Impl
        public float d() {
            return this.f.getInterpolatedFraction();
        }

        @Override  // androidx.core.view.WindowInsetsAnimationCompat$Impl
        public Interpolator e() {
            return this.f.getInterpolator();
        }

        @Override  // androidx.core.view.WindowInsetsAnimationCompat$Impl
        public int f() {
            return this.f.getTypeMask();
        }

        @Override  // androidx.core.view.WindowInsetsAnimationCompat$Impl
        public void g(float f) {
            this.f.setAlpha(f);
        }

        @Override  // androidx.core.view.WindowInsetsAnimationCompat$Impl
        public void h(float f) {
            this.f.setFraction(f);
        }

        public static WindowInsetsAnimation.Bounds i(BoundsCompat windowInsetsAnimationCompat$BoundsCompat0) {
            return T.a(windowInsetsAnimationCompat$BoundsCompat0.a().h(), windowInsetsAnimationCompat$BoundsCompat0.b().h());
        }

        public static Insets j(WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
            return Insets.g(windowInsetsAnimation$Bounds0.getUpperBound());
        }

        public static Insets k(WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
            return Insets.g(windowInsetsAnimation$Bounds0.getLowerBound());
        }

        public static void l(View view0, Callback windowInsetsAnimationCompat$Callback0) {
            view0.setWindowInsetsAnimationCallback((windowInsetsAnimationCompat$Callback0 == null ? null : new ProxyCallback(windowInsetsAnimationCompat$Callback0)));
        }
    }

    static class Impl {
        private final int a;
        private float b;
        private final Interpolator c;
        private final long d;
        private float e;

        Impl(int v, Interpolator interpolator0, long v1) {
            this.e = 1.0f;
            this.a = v;
            this.c = interpolator0;
            this.d = v1;
        }

        public float a() {
            return this.e;
        }

        public long b() {
            return this.d;
        }

        public float c() {
            return this.b;
        }

        public float d() {
            return this.c == null ? this.b : this.c.getInterpolation(this.b);
        }

        public Interpolator e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        public void g(float f) {
            this.e = f;
        }

        public void h(float f) {
            this.b = f;
        }
    }

    private Impl a;
    private static final boolean b = false;
    private static final String c = "WindowInsetsAnimCompat";

    public WindowInsetsAnimationCompat(int v, Interpolator interpolator0, long v1) {
        if(Build.VERSION.SDK_INT >= 30) {
            this.a = new Impl30(v, interpolator0, v1);
            return;
        }
        this.a = new Impl21(v, interpolator0, v1);
    }

    @RequiresApi(30)
    private WindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation0) {
        this(0, null, 0L);
        if(Build.VERSION.SDK_INT >= 30) {
            this.a = new Impl30(windowInsetsAnimation0);
        }
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float a() {
        return this.a.a();
    }

    public long b() {
        return this.a.b();
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float c() {
        return this.a.c();
    }

    public float d() {
        return this.a.d();
    }

    public Interpolator e() {
        return this.a.e();
    }

    public int f() {
        return this.a.f();
    }

    public void g(@FloatRange(from = 0.0, to = 1.0) float f) {
        this.a.g(f);
    }

    static void h(View view0, Callback windowInsetsAnimationCompat$Callback0) {
        if(Build.VERSION.SDK_INT >= 30) {
            Impl30.l(view0, windowInsetsAnimationCompat$Callback0);
            return;
        }
        Impl21.t(view0, windowInsetsAnimationCompat$Callback0);
    }

    public void i(@FloatRange(from = 0.0, to = 1.0) float f) {
        this.a.h(f);
    }

    @RequiresApi(30)
    static WindowInsetsAnimationCompat j(WindowInsetsAnimation windowInsetsAnimation0) {
        return new WindowInsetsAnimationCompat(windowInsetsAnimation0);
    }
}

