package androidx.lifecycle;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.U0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.c;
import y4.l;
import y4.m;

public final class RepeatOnLifecycleKt {
    @m
    public static final Object a(@l Lifecycle lifecycle0, @l State lifecycle$State0, @l o o0, @l d d0) {
        if(lifecycle$State0 == State.b) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if(lifecycle0.b() == State.a) {
            return S0.a;
        }
        Object object0 = P.g(new o(lifecycle0, lifecycle$State0, o0, null) {
            int k;
            private Object l;
            final Lifecycle m;
            final State n;
            final o o;

            {
                this.m = lifecycle0;
                this.n = lifecycle$State0;
                this.o = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        U0 u00 = h0.e().u1();
                        androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1 repeatOnLifecycleKt$repeatOnLifecycle$3$10 = new o(this.n, o0, this.o, null) {
                            Object k;
                            Object l;
                            Object m;
                            Object n;
                            Object o;
                            Object p;
                            int q;
                            final Lifecycle r;
                            final State s;
                            final O t;
                            final o u;

                            {
                                this.r = lifecycle0;
                                this.s = lifecycle$State0;
                                this.t = o0;
                                this.u = o1;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1(this.r, this.s, this.t, this.u, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                h l0$h3;
                                h l0$h2;
                                Object object1 = b.l();
                                switch(this.q) {
                                    case 0: {
                                        f0.n(object0);
                                        if(this.r.b() == State.a) {
                                            return S0.a;
                                        }
                                        h l0$h0 = new h();
                                        h l0$h1 = new h();
                                        try {
                                            this.k = l0$h0;
                                            this.l = l0$h1;
                                            this.m = this.s;
                                            this.n = this.r;
                                            this.o = this.t;
                                            this.p = this.u;
                                            this.q = 1;
                                            p p0 = new p(b.e(this), 1);
                                            p0.c0();
                                            Event lifecycle$Event0 = Event.Companion.d(this.s);
                                            Event lifecycle$Event1 = Event.Companion.a(this.s);
                                            a a0 = c.b(false, 1, null);
                                            androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$10 = new LifecycleEventObserver() {
                                                @Override  // androidx.lifecycle.LifecycleEventObserver
                                                public final void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
                                                    L.p(lifecycleOwner0, "<anonymous parameter 0>");
                                                    L.p(lifecycle$Event0, "event");
                                                    if(lifecycle$Event0 == l0$h0) {
                                                        androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$10 = new o(this.g, null) {
                                                            Object k;
                                                            Object l;
                                                            int m;
                                                            final a n;
                                                            final o o;

                                                            {
                                                                this.n = a0;
                                                                this.o = o0;
                                                                super(2, d0);
                                                            }

                                                            @Override  // kotlin.coroutines.jvm.internal.a
                                                            @l
                                                            public final d create(@m Object object0, @l d d0) {
                                                                return new androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.1(this.n, this.o, d0);
                                                            }

                                                            @Override  // A3.o
                                                            public Object invoke(Object object0, Object object1) {
                                                                return this.invoke(((O)object0), ((d)object1));
                                                            }

                                                            @m
                                                            public final Object invoke(@l O o0, @m d d0) {
                                                                return ((androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                                            }

                                                            @Override  // kotlin.coroutines.jvm.internal.a
                                                            @m
                                                            public final Object invokeSuspend(@l Object object0) {
                                                                Throwable throwable1;
                                                                a a2;
                                                                o o0;
                                                                a a0;
                                                                Object object1 = b.l();
                                                                switch(this.m) {
                                                                    case 0: {
                                                                        f0.n(object0);
                                                                        a0 = this.n;
                                                                        o0 = this.o;
                                                                        this.k = a0;
                                                                        this.l = o0;
                                                                        this.m = 1;
                                                                        if(a0.h(null, this) == object1) {
                                                                            return object1;
                                                                        }
                                                                        goto label_15;
                                                                    }
                                                                    case 1: {
                                                                        o0 = (o)this.l;
                                                                        a a1 = (a)this.k;
                                                                        f0.n(object0);
                                                                        a0 = a1;
                                                                        try {
                                                                        label_15:
                                                                            androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.1.1.1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$10 = new o(null) {
                                                                                int k;
                                                                                private Object l;
                                                                                final o m;

                                                                                {
                                                                                    this.m = o0;
                                                                                    super(2, d0);
                                                                                }

                                                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                                                @l
                                                                                public final d create(@m Object object0, @l d d0) {
                                                                                    d d1 = new androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.1.1.1(this.m, d0);
                                                                                    d1.l = object0;
                                                                                    return d1;
                                                                                }

                                                                                @Override  // A3.o
                                                                                public Object invoke(Object object0, Object object1) {
                                                                                    return this.invoke(((O)object0), ((d)object1));
                                                                                }

                                                                                @m
                                                                                public final Object invoke(@l O o0, @m d d0) {
                                                                                    return ((androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle.3.1.1.1.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                                                                }

                                                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                                                @m
                                                                                public final Object invokeSuspend(@l Object object0) {
                                                                                    Object object1 = b.l();
                                                                                    switch(this.k) {
                                                                                        case 0: {
                                                                                            f0.n(object0);
                                                                                            this.k = 1;
                                                                                            return this.m.invoke(((O)this.l), this) == object1 ? object1 : S0.a;
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
                                                                            };
                                                                            this.k = a0;
                                                                            this.l = null;
                                                                            this.m = 2;
                                                                            if(P.g(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$10, this) == object1) {
                                                                                return object1;
                                                                            }
                                                                        }
                                                                        catch(Throwable throwable0) {
                                                                            a2 = a0;
                                                                            throwable1 = throwable0;
                                                                            a2.i(null);
                                                                            throw throwable1;
                                                                        }
                                                                        a2 = a0;
                                                                        break;
                                                                    }
                                                                    case 2: {
                                                                        a2 = (a)this.k;
                                                                        try {
                                                                            f0.n(object0);
                                                                            break;
                                                                        }
                                                                        catch(Throwable throwable1) {
                                                                        }
                                                                        a2.i(null);
                                                                        throw throwable1;
                                                                    }
                                                                    default: {
                                                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                                    }
                                                                }
                                                                a2.i(null);
                                                                return S0.a;
                                                            }
                                                        };
                                                        this.t.a = k.f(lifecycle$Event1, null, null, repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$10, 3, null);
                                                        return;
                                                    }
                                                    if(lifecycle$Event0 == p0) {
                                                        I0 i00 = (I0)this.t.a;
                                                        if(i00 != null) {
                                                            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
                                                        }
                                                        this.t.a = null;
                                                    }
                                                    if(lifecycle$Event0 == Event.ON_DESTROY) {
                                                        a0.resumeWith(S0.a);
                                                    }
                                                }
                                            };
                                            l0$h1.a = repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$10;
                                            L.n(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$10, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                                            this.r.a(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$10);
                                            Object object2 = p0.x();
                                            if(object2 == b.l()) {
                                                kotlin.coroutines.jvm.internal.h.c(this);
                                            }
                                        }
                                        catch(Throwable throwable0) {
                                            l0$h2 = l0$h0;
                                            l0$h3 = l0$h1;
                                            goto label_46;
                                        }
                                        if(object2 == object1) {
                                            return object1;
                                        }
                                        l0$h2 = l0$h0;
                                        l0$h3 = l0$h1;
                                        break;
                                    }
                                    case 1: {
                                        o o0 = (o)this.p;
                                        O o1 = (O)this.o;
                                        Lifecycle lifecycle0 = (Lifecycle)this.n;
                                        State lifecycle$State0 = (State)this.m;
                                        l0$h3 = (h)this.l;
                                        l0$h2 = (h)this.k;
                                        try {
                                            f0.n(object0);
                                            break;
                                        }
                                        catch(Throwable throwable0) {
                                        }
                                    label_46:
                                        I0 i00 = (I0)l0$h2.a;
                                        if(i00 != null) {
                                            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
                                        }
                                        LifecycleEventObserver lifecycleEventObserver0 = (LifecycleEventObserver)l0$h3.a;
                                        if(lifecycleEventObserver0 != null) {
                                            this.r.d(lifecycleEventObserver0);
                                        }
                                        throw throwable0;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                I0 i01 = (I0)l0$h2.a;
                                if(i01 != null) {
                                    kotlinx.coroutines.I0.a.b(i01, null, 1, null);
                                }
                                LifecycleEventObserver lifecycleEventObserver1 = (LifecycleEventObserver)l0$h3.a;
                                if(lifecycleEventObserver1 != null) {
                                    this.r.d(lifecycleEventObserver1);
                                }
                                return S0.a;
                            }
                        };
                        this.k = 1;
                        return i.h(u00, repeatOnLifecycleKt$repeatOnLifecycle$3$10, this) == object1 ? object1 : S0.a;
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
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @m
    public static final Object b(@l LifecycleOwner lifecycleOwner0, @l State lifecycle$State0, @l o o0, @l d d0) {
        Object object0 = RepeatOnLifecycleKt.a(lifecycleOwner0.getLifecycle(), lifecycle$State0, o0, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

