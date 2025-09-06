package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.e;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import kotlin.ranges.s;
import kotlinx.coroutines.I0.a;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.k;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@RequiresApi(30)
@s0({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,708:1\n314#2,11:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n*L\n197#1:709,11\n*E\n"})
final class WindowInsetsNestedScrollConnection implements WindowInsetsAnimationControlListener, NestedScrollConnection {
    @l
    private final AndroidWindowInsets a;
    @l
    private final View b;
    @l
    private final SideCalculator c;
    @l
    private final Density d;
    @m
    private WindowInsetsAnimationController e;
    private boolean f;
    @l
    private final CancellationSignal g;
    private float h;
    @m
    private I0 i;
    @m
    private o j;

    public WindowInsetsNestedScrollConnection(@l AndroidWindowInsets androidWindowInsets0, @l View view0, @l SideCalculator sideCalculator0, @l Density density0) {
        L.p(androidWindowInsets0, "windowInsets");
        L.p(view0, "view");
        L.p(sideCalculator0, "sideCalculator");
        L.p(density0, "density");
        super();
        this.a = androidWindowInsets0;
        this.b = view0;
        this.c = sideCalculator0;
        this.d = density0;
        this.g = new CancellationSignal();
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m
    public Object a(long v, long v1, @l d d0) {
        return this.p(v1, this.c.a(Velocity.l(v1), Velocity.n(v1)), true, d0);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long b(long v, long v1, int v2) {
        float f = Offset.p(v1);
        float f1 = Offset.r(v1);
        return this.w(v1, this.c.a(f, f1));
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m
    public Object d(long v, @l d d0) {
        return this.p(v, this.c.b(Velocity.l(v), Velocity.n(v)), false, d0);
    }

    public static final Object f(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection0, d d0) {
        return windowInsetsNestedScrollConnection0.q(d0);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long i(long v, int v1) {
        float f = Offset.p(v);
        float f1 = Offset.r(v);
        return this.w(v, this.c.b(f, f1));
    }

    private final void m(float f) {
        WindowInsetsAnimationController windowInsetsAnimationController0 = this.e;
        if(windowInsetsAnimationController0 != null) {
            Insets insets0 = windowInsetsAnimationController0.getCurrentInsets();
            L.o(insets0, "it.currentInsets");
            int v = b.L0(f);
            windowInsetsAnimationController0.setInsetsAndAlpha(this.c.e(insets0, v), 1.0f, 0.0f);
        }
    }

    private final void n() {
        if(this.e != null && this.e.isReady()) {
            WindowInsetsAnimationController windowInsetsAnimationController0 = this.e;
            if(windowInsetsAnimationController0 != null) {
                windowInsetsAnimationController0.finish(this.a.g());
            }
        }
        this.e = null;
        o o0 = this.j;
        if(o0 != null) {
            o0.B(null, androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded.1.e);
        }
        this.j = null;
        I0 i00 = this.i;
        if(i00 != null) {
            a.b(i00, null, 1, null);
        }
        this.i = null;
        this.h = 0.0f;
        this.f = false;

        final class androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded.1 extends N implements Function1 {
            public static final androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded.1 e;

            static {
                androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded.1.e = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded.1();
            }

            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@l Throwable throwable0) {
                L.p(throwable0, "it");
            }
        }

    }

    public final void o() {
        o o0 = this.j;
        if(o0 != null) {
            o0.B(null, androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.dispose.1.e);
        }
        I0 i00 = this.i;
        if(i00 != null) {
            a.b(i00, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController0 = this.e;
        if(windowInsetsAnimationController0 != null) {
            windowInsetsAnimationController0.finish(!L.g(windowInsetsAnimationController0.getCurrentInsets(), windowInsetsAnimationController0.getHiddenStateInsets()));
        }

        final class androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.dispose.1 extends N implements Function1 {
            public static final androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.dispose.1 e;

            static {
                androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.dispose.1.e = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.dispose.1();
            }

            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.dispose.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@l Throwable throwable0) {
                L.p(throwable0, "it");
            }
        }

    }

    @Override  // android.view.WindowInsetsAnimationControlListener
    public void onCancelled(@m WindowInsetsAnimationController windowInsetsAnimationController0) {
        this.n();
    }

    @Override  // android.view.WindowInsetsAnimationControlListener
    public void onFinished(@l WindowInsetsAnimationController windowInsetsAnimationController0) {
        L.p(windowInsetsAnimationController0, "controller");
        this.n();
    }

    @Override  // android.view.WindowInsetsAnimationControlListener
    public void onReady(@l WindowInsetsAnimationController windowInsetsAnimationController0, int v) {
        L.p(windowInsetsAnimationController0, "controller");
        this.e = windowInsetsAnimationController0;
        this.f = false;
        o o0 = this.j;
        if(o0 != null) {
            o0.B(windowInsetsAnimationController0, androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1.e);
        }
        this.j = null;

        final class androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1 extends N implements Function1 {
            public static final androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1 e;

            static {
                androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1.e = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1();
            }

            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@l Throwable throwable0) {
                L.p(throwable0, "it");
            }
        }

    }

    private final Object p(long v, float f, boolean z, d d0) {
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2;
        long v4;
        androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.1 windowInsetsNestedScrollConnection$fling$10;
        if(d0 instanceof androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.1) {
            windowInsetsNestedScrollConnection$fling$10 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.1)d0;
            int v1 = windowInsetsNestedScrollConnection$fling$10.q;
            if((v1 & 0x80000000) == 0) {
                windowInsetsNestedScrollConnection$fling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    long m;
                    float n;
                    Object o;
                    int q;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.o = object0;
                        this.q |= 0x80000000;
                        return d0.p(0L, 0.0f, false, this);
                    }
                };
            }
            else {
                windowInsetsNestedScrollConnection$fling$10.q = v1 ^ 0x80000000;
            }
        }
        else {
            windowInsetsNestedScrollConnection$fling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                long m;
                float n;
                Object o;
                int q;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.o = object0;
                    this.q |= 0x80000000;
                    return d0.p(0L, 0.0f, false, this);
                }
            };
        }
        Object object0 = windowInsetsNestedScrollConnection$fling$10.o;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(windowInsetsNestedScrollConnection$fling$10.q) {
            case 0: {
                f0.n(object0);
                I0 i00 = this.i;
                if(i00 != null) {
                    a.b(i00, null, 1, null);
                }
                this.i = null;
                this.h = 0.0f;
                if(f == 0.0f && !z || this.e == null && this.a.g() == z) {
                    return Velocity.b(0L);
                }
                windowInsetsNestedScrollConnection$fling$10.k = this;
                windowInsetsNestedScrollConnection$fling$10.m = v;
                windowInsetsNestedScrollConnection$fling$10.n = f;
                windowInsetsNestedScrollConnection$fling$10.q = 1;
                Object object2 = this.q(windowInsetsNestedScrollConnection$fling$10);
                if(object2 == object1) {
                    return object1;
                }
                v4 = v;
                object0 = object2;
                windowInsetsNestedScrollConnection2 = this;
                break;
            }
            case 1: {
                f = windowInsetsNestedScrollConnection$fling$10.n;
                v4 = windowInsetsNestedScrollConnection$fling$10.m;
                windowInsetsNestedScrollConnection2 = (WindowInsetsNestedScrollConnection)windowInsetsNestedScrollConnection$fling$10.k;
                f0.n(object0);
                break;
            }
            case 2: {
                long v2 = windowInsetsNestedScrollConnection$fling$10.m;
                e l0$e0 = (e)windowInsetsNestedScrollConnection$fling$10.l;
                WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection0 = (WindowInsetsNestedScrollConnection)windowInsetsNestedScrollConnection$fling$10.k;
                f0.n(object0);
                return Velocity.b(windowInsetsNestedScrollConnection0.c.g(v2, l0$e0.a));
            }
            case 3: {
                long v3 = windowInsetsNestedScrollConnection$fling$10.m;
                WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection1 = (WindowInsetsNestedScrollConnection)windowInsetsNestedScrollConnection$fling$10.k;
                f0.n(object0);
                return Velocity.b(windowInsetsNestedScrollConnection1.c.g(v3, 0.0f));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((WindowInsetsAnimationController)object0) == null) {
            return Velocity.b(0L);
        }
        Insets insets0 = ((WindowInsetsAnimationController)object0).getHiddenStateInsets();
        L.o(insets0, "animationController.hiddenStateInsets");
        int v5 = windowInsetsNestedScrollConnection2.c.f(insets0);
        Insets insets1 = ((WindowInsetsAnimationController)object0).getShownStateInsets();
        L.o(insets1, "animationController.shownStateInsets");
        int v6 = windowInsetsNestedScrollConnection2.c.f(insets1);
        Insets insets2 = ((WindowInsetsAnimationController)object0).getCurrentInsets();
        L.o(insets2, "animationController.currentInsets");
        int v7 = windowInsetsNestedScrollConnection2.c.f(insets2);
        if(f <= 0.0f && v7 == v5 || f >= 0.0f && v7 == v6) {
            ((WindowInsetsAnimationController)object0).finish(v7 == v6);
            windowInsetsNestedScrollConnection2.e = null;
            return Velocity.b(0L);
        }
        SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec0 = new SplineBasedFloatDecayAnimationSpec(windowInsetsNestedScrollConnection2.d);
        float f1 = ((float)v7) + splineBasedFloatDecayAnimationSpec0.f(f);
        boolean z1 = (f1 - ((float)v5)) / ((float)(v6 - v5)) > 0.5f;
        if(f1 <= ((float)v6) && f1 >= ((float)v5)) {
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.3 windowInsetsNestedScrollConnection$fling$30 = new A3.o(v7, (z1 ? v6 : v5), f, ((WindowInsetsAnimationController)object0), z1, null) {
                int k;
                private Object l;
                final WindowInsetsNestedScrollConnection m;
                final int n;
                final int o;
                final float p;
                final WindowInsetsAnimationController q;
                final boolean r;

                {
                    this.m = windowInsetsNestedScrollConnection0;
                    this.n = v;
                    this.o = v1;
                    this.p = f;
                    this.q = windowInsetsAnimationController0;
                    this.r = z;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    d d1 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.3(this.m, this.n, this.o, this.p, this.q, this.r, d0);
                    d1.l = object0;
                    return d1;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.3)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    I0 i00 = k.f(((O)this.l), null, null, new A3.o(this.o, this.p, this.q, this.r, this.m, null) {
                        int k;
                        final int l;
                        final int m;
                        final float n;
                        final WindowInsetsAnimationController o;
                        final boolean p;
                        final WindowInsetsNestedScrollConnection q;

                        {
                            this.l = v;
                            this.m = v1;
                            this.n = f;
                            this.o = windowInsetsAnimationController0;
                            this.p = z;
                            this.q = windowInsetsNestedScrollConnection0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.3.1(this.l, this.m, this.n, this.o, this.p, this.q, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.3.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = kotlin.coroutines.intrinsics.b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    Animatable animatable0 = AnimatableKt.b(this.l, 0.0f, 2, null);
                                    androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.3.1.1 windowInsetsNestedScrollConnection$fling$3$1$10 = new Function1() {
                                        final WindowInsetsNestedScrollConnection e;

                                        {
                                            this.e = windowInsetsNestedScrollConnection0;
                                            super(1);
                                        }

                                        public final void a(@l Animatable animatable0) {
                                            L.p(animatable0, "$this$animateTo");
                                            float f = ((Number)animatable0.u()).floatValue();
                                            this.e.m(f);
                                        }

                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            this.a(((Animatable)object0));
                                            return S0.a;
                                        }
                                    };
                                    this.k = 1;
                                    if(Animatable.i(animatable0, kotlin.coroutines.jvm.internal.b.e(this.m), null, kotlin.coroutines.jvm.internal.b.e(this.n), windowInsetsNestedScrollConnection$fling$3$1$10, this, 2, null) == object1) {
                                        return object1;
                                    }
                                    break;
                                }
                                case 1: {
                                    f0.n(object0);
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                            this.o.finish(this.p);
                            this.q.e = null;
                            return S0.a;
                        }
                    }, 3, null);
                    this.m.i = i00;
                    return S0.a;
                }
            };
            windowInsetsNestedScrollConnection$fling$10.k = windowInsetsNestedScrollConnection2;
            windowInsetsNestedScrollConnection$fling$10.m = v4;
            windowInsetsNestedScrollConnection$fling$10.q = 3;
            return P.g(windowInsetsNestedScrollConnection$fling$30, windowInsetsNestedScrollConnection$fling$10) == object1 ? object1 : Velocity.b(windowInsetsNestedScrollConnection2.c.g(v4, 0.0f));
        }
        e l0$e1 = new e();
        androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.2 windowInsetsNestedScrollConnection$fling$20 = new A3.o(v7, f, splineBasedFloatDecayAnimationSpec0, v5, v6, l0$e1, ((WindowInsetsAnimationController)object0), z1, null) {
            int k;
            private Object l;
            final WindowInsetsNestedScrollConnection m;
            final int n;
            final float o;
            final SplineBasedFloatDecayAnimationSpec p;
            final int q;
            final int r;
            final e s;
            final WindowInsetsAnimationController t;
            final boolean u;

            {
                this.m = windowInsetsNestedScrollConnection0;
                this.n = v;
                this.o = f;
                this.p = splineBasedFloatDecayAnimationSpec0;
                this.q = v1;
                this.r = v2;
                this.s = l0$e0;
                this.t = windowInsetsAnimationController0;
                this.u = z;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.2(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        I0 i00 = k.f(((O)this.l), null, null, new A3.o(this.o, this.p, this.q, this.r, this.m, this.s, this.t, this.u, null) {
                            int k;
                            final int l;
                            final float m;
                            final SplineBasedFloatDecayAnimationSpec n;
                            final int o;
                            final int p;
                            final WindowInsetsNestedScrollConnection q;
                            final e r;
                            final WindowInsetsAnimationController s;
                            final boolean t;

                            {
                                this.l = v;
                                this.m = f;
                                this.n = splineBasedFloatDecayAnimationSpec0;
                                this.o = v1;
                                this.p = v2;
                                this.q = windowInsetsNestedScrollConnection0;
                                this.r = l0$e0;
                                this.s = windowInsetsAnimationController0;
                                this.t = z;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.2.1(this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = kotlin.coroutines.intrinsics.b.l();
                                switch(this.k) {
                                    case 0: {
                                        f0.n(object0);
                                        androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.2.1.1 windowInsetsNestedScrollConnection$fling$2$1$10 = new A3.o(this.p, this.q, this.r, this.s, this.t) {
                                            final int e;
                                            final int f;
                                            final WindowInsetsNestedScrollConnection g;
                                            final e h;
                                            final WindowInsetsAnimationController i;
                                            final boolean j;

                                            {
                                                this.e = v;
                                                this.f = v1;
                                                this.g = windowInsetsNestedScrollConnection0;
                                                this.h = l0$e0;
                                                this.i = windowInsetsAnimationController0;
                                                this.j = z;
                                                super(2);
                                            }

                                            public final void a(float f, float f1) {
                                                if(f <= ((float)this.f) && ((float)this.e) <= f) {
                                                    this.g.m(f);
                                                    return;
                                                }
                                                this.h.a = f1;
                                                this.i.finish(this.j);
                                                this.g.e = null;
                                                I0 i00 = this.g.i;
                                                if(i00 != null) {
                                                    a.b(i00, null, 1, null);
                                                }
                                            }

                                            @Override  // A3.o
                                            public Object invoke(Object object0, Object object1) {
                                                this.a(((Number)object0).floatValue(), ((Number)object1).floatValue());
                                                return S0.a;
                                            }
                                        };
                                        this.k = 1;
                                        return SuspendAnimationKt.i(this.l, this.m, this.n, windowInsetsNestedScrollConnection$fling$2$1$10, this) == object1 ? object1 : S0.a;
                                    }
                                    case 1: {
                                        f0.n(object0);
                                        return S0.a;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                            }
                        }, 3, null);
                        this.m.i = i00;
                        I0 i01 = this.m.i;
                        if(i01 != null) {
                            this.k = 1;
                            if(i01.c1(this) == object1) {
                                return object1;
                            }
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                this.m.i = null;
                return S0.a;
            }
        };
        windowInsetsNestedScrollConnection$fling$10.k = windowInsetsNestedScrollConnection2;
        windowInsetsNestedScrollConnection$fling$10.l = l0$e1;
        windowInsetsNestedScrollConnection$fling$10.m = v4;
        windowInsetsNestedScrollConnection$fling$10.q = 2;
        return P.g(windowInsetsNestedScrollConnection$fling$20, windowInsetsNestedScrollConnection$fling$10) == object1 ? object1 : Velocity.b(windowInsetsNestedScrollConnection2.c.g(v4, l0$e1.a));
    }

    private final Object q(d d0) {
        WindowInsetsAnimationController windowInsetsAnimationController0 = this.e;
        if(windowInsetsAnimationController0 == null) {
            p p0 = new p(kotlin.coroutines.intrinsics.b.e(d0), 1);
            p0.c0();
            this.j = p0;
            this.v();
            windowInsetsAnimationController0 = p0.x();
            if(windowInsetsAnimationController0 == kotlin.coroutines.intrinsics.b.l()) {
                h.c(d0);
            }
        }
        return windowInsetsAnimationController0;
    }

    @l
    public final Density r() {
        return this.d;
    }

    @l
    public final SideCalculator s() {
        return this.c;
    }

    @l
    public final View t() {
        return this.b;
    }

    @l
    public final AndroidWindowInsets u() {
        return this.a;
    }

    private final void v() {
        if(!this.f) {
            this.f = true;
            WindowInsetsController windowInsetsController0 = this.b.getWindowInsetsController();
            if(windowInsetsController0 != null) {
                windowInsetsController0.controlWindowInsetsAnimation(this.a.f(), -1L, null, this.g, this);
            }
        }
    }

    private final long w(long v, float f) {
        I0 i00 = this.i;
        boolean z = true;
        if(i00 != null) {
            a.b(i00, null, 1, null);
            this.i = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController0 = this.e;
        if(f != 0.0f) {
            boolean z1 = this.a.g();
            int v1 = Float.compare(f, 0.0f);
            if(v1 <= 0) {
                z = false;
            }
            if(z1 != z || windowInsetsAnimationController0 != null) {
                if(windowInsetsAnimationController0 == null) {
                    this.h = 0.0f;
                    this.v();
                    return this.c.c(v);
                }
                Insets insets0 = windowInsetsAnimationController0.getHiddenStateInsets();
                L.o(insets0, "animationController.hiddenStateInsets");
                int v2 = this.c.f(insets0);
                Insets insets1 = windowInsetsAnimationController0.getShownStateInsets();
                L.o(insets1, "animationController.shownStateInsets");
                int v3 = this.c.f(insets1);
                Insets insets2 = windowInsetsAnimationController0.getCurrentInsets();
                L.o(insets2, "animationController.currentInsets");
                int v4 = this.c.f(insets2);
                if(v4 == (v1 <= 0 ? v2 : v3)) {
                    this.h = 0.0f;
                    return 0L;
                }
                float f1 = ((float)v4) + f + this.h;
                int v5 = s.I(b.L0(f1), v2, v3);
                this.h = f1 - ((float)b.L0(f1));
                if(v5 != v4) {
                    windowInsetsAnimationController0.setInsetsAndAlpha(this.c.e(insets2, v5), 1.0f, 0.0f);
                }
                return this.c.c(v);
            }
        }
        return 0L;
    }
}

