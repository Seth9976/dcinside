package androidx.lifecycle;

import A3.a;
import kotlin.S0;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.U0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@s0({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,206:1\n154#1,8:207\n154#1,8:215\n154#1,8:223\n154#1,8:231\n43#1,5:239\n154#1,8:244\n43#1,5:252\n154#1,8:257\n154#1,8:265\n154#1,8:273\n154#1,8:281\n314#2,11:289\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:207,8\n58#1:215,8\n71#1:223,8\n84#1:231,8\n98#1:239,5\n98#1:244,8\n98#1:252,5\n98#1:257,8\n111#1:265,8\n124#1:273,8\n137#1:281,8\n177#1:289,11\n*E\n"})
public final class WithLifecycleStateKt {
    @b0
    @m
    public static final Object a(@l Lifecycle lifecycle0, @l State lifecycle$State0, boolean z, @l K k0, @l a a0, @l d d0) {
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.observer.1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10 = new LifecycleEventObserver() {
            @Override  // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
                Object object0;
                L.p(lifecycleOwner0, "source");
                L.p(lifecycle$Event0, "event");
                if(lifecycle$Event0 == Event.Companion.d(lifecycle$State0)) {
                    lifecycle0.d(this);
                    o o0 = p0;
                    try {
                        object0 = e0.b(a0.invoke());
                    }
                    catch(Throwable throwable0) {
                        object0 = e0.b(f0.a(throwable0));
                    }
                    o0.resumeWith(object0);
                    return;
                }
                if(lifecycle$Event0 == Event.ON_DESTROY) {
                    lifecycle0.d(this);
                    Object object1 = e0.b(f0.a(new LifecycleDestroyedException()));
                    p0.resumeWith(object1);
                }
            }
        };
        if(z) {
            androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$10 = new Runnable() {
                @Override
                public final void run() {
                    lifecycle0.a(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10);
                }
            };
            k0.b1(i.a, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$10);
        }
        else {
            lifecycle0.a(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10);
        }
        p0.K(new Function1(k0, lifecycle0, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10) {
            final K e;
            final Lifecycle f;
            final androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.observer.1 g;

            {
                this.e = k0;
                this.f = lifecycle0;
                this.g = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                i i0 = i.a;
                if(this.e.i1(i0)) {
                    androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.2.1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$10 = new Runnable() {
                        @Override
                        public final void run() {
                            this.g.d(this.b);
                        }
                    };
                    this.e.b1(i0, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$10);
                    return;
                }
                this.f.d(this.g);
            }
        });
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    @m
    public static final Object b(@l Lifecycle lifecycle0, @l a a0, @l d d0) {
        State lifecycle$State0 = State.c;
        U0 u00 = h0.e().u1();
        if(!u00.i1(d0.getContext())) {
            if(lifecycle0.b() == State.a) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.b().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, false, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0) : a0.invoke();
        }
        return WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, true, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0);
    }

    @m
    public static final Object c(@l LifecycleOwner lifecycleOwner0, @l a a0, @l d d0) {
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        State lifecycle$State0 = State.c;
        U0 u00 = h0.e().u1();
        if(!u00.i1(d0.getContext())) {
            if(lifecycle0.b() == State.a) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.b().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, false, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0) : a0.invoke();
        }
        return WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, true, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0);
    }

    private static final Object d(Lifecycle lifecycle0, a a0, d d0) {
        h0.e().u1();
        throw null;
    }

    private static final Object e(LifecycleOwner lifecycleOwner0, a a0, d d0) {
        lifecycleOwner0.getLifecycle();
        h0.e().u1();
        throw null;
    }

    @m
    public static final Object f(@l Lifecycle lifecycle0, @l a a0, @l d d0) {
        State lifecycle$State0 = State.e;
        U0 u00 = h0.e().u1();
        if(!u00.i1(d0.getContext())) {
            if(lifecycle0.b() == State.a) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.b().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, false, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0) : a0.invoke();
        }
        return WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, true, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0);
    }

    @m
    public static final Object g(@l LifecycleOwner lifecycleOwner0, @l a a0, @l d d0) {
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        State lifecycle$State0 = State.e;
        U0 u00 = h0.e().u1();
        if(!u00.i1(d0.getContext())) {
            if(lifecycle0.b() == State.a) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.b().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, false, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0) : a0.invoke();
        }
        return WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, true, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0);
    }

    private static final Object h(Lifecycle lifecycle0, a a0, d d0) {
        h0.e().u1();
        throw null;
    }

    private static final Object i(LifecycleOwner lifecycleOwner0, a a0, d d0) {
        lifecycleOwner0.getLifecycle();
        h0.e().u1();
        throw null;
    }

    @m
    public static final Object j(@l Lifecycle lifecycle0, @l a a0, @l d d0) {
        State lifecycle$State0 = State.d;
        U0 u00 = h0.e().u1();
        if(!u00.i1(d0.getContext())) {
            if(lifecycle0.b() == State.a) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.b().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, false, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0) : a0.invoke();
        }
        return WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, true, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0);
    }

    @m
    public static final Object k(@l LifecycleOwner lifecycleOwner0, @l a a0, @l d d0) {
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        State lifecycle$State0 = State.d;
        U0 u00 = h0.e().u1();
        if(!u00.i1(d0.getContext())) {
            if(lifecycle0.b() == State.a) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.b().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, false, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0) : a0.invoke();
        }
        return WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, true, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0);
    }

    private static final Object l(Lifecycle lifecycle0, a a0, d d0) {
        h0.e().u1();
        throw null;
    }

    private static final Object m(LifecycleOwner lifecycleOwner0, a a0, d d0) {
        lifecycleOwner0.getLifecycle();
        h0.e().u1();
        throw null;
    }

    @m
    public static final Object n(@l Lifecycle lifecycle0, @l State lifecycle$State0, @l a a0, @l d d0) {
        if(lifecycle$State0.compareTo(State.c) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + lifecycle$State0).toString());
        }
        U0 u00 = h0.e().u1();
        if(!u00.i1(d0.getContext())) {
            if(lifecycle0.b() == State.a) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.b().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, false, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0) : a0.invoke();
        }
        return WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, true, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0);
    }

    @m
    public static final Object o(@l LifecycleOwner lifecycleOwner0, @l State lifecycle$State0, @l a a0, @l d d0) {
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        if(lifecycle$State0.compareTo(State.c) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + lifecycle$State0).toString());
        }
        U0 u00 = h0.e().u1();
        if(!u00.i1(d0.getContext())) {
            if(lifecycle0.b() == State.a) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.b().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, false, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0) : a0.invoke();
        }
        return WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, true, u00, new androidx.lifecycle.WithLifecycleStateKt.withStateAtLeastUnchecked.2(a0), d0);
    }

    private static final Object p(Lifecycle lifecycle0, State lifecycle$State0, a a0, d d0) {
        if(lifecycle$State0.compareTo(State.c) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + lifecycle$State0).toString());
        }
        h0.e().u1();
        throw null;
    }

    private static final Object q(LifecycleOwner lifecycleOwner0, State lifecycle$State0, a a0, d d0) {
        lifecycleOwner0.getLifecycle();
        if(lifecycle$State0.compareTo(State.c) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + lifecycle$State0).toString());
        }
        h0.e().u1();
        throw null;
    }

    @b0
    @m
    public static final Object r(@l Lifecycle lifecycle0, @l State lifecycle$State0, @l a a0, @l d d0) {
        U0 u00 = h0.e().u1();
        if(!u00.i1(d0.getContext())) {
            if(lifecycle0.b() == State.a) {
                throw new LifecycleDestroyedException();
            }
            return lifecycle0.b().compareTo(lifecycle$State0) < 0 ? WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, false, u00, new a(a0) {
                final a e;

                {
                    this.e = a0;
                    super(0);
                }

                @Override  // A3.a
                public final Object invoke() {
                    return this.e.invoke();
                }
            }, d0) : a0.invoke();
        }
        return WithLifecycleStateKt.a(lifecycle0, lifecycle$State0, true, u00, new a(a0) {
            final a e;

            {
                this.e = a0;
                super(0);
            }

            @Override  // A3.a
            public final Object invoke() {
                return this.e.invoke();
            }
        }, d0);
    }

    @b0
    private static final Object s(Lifecycle lifecycle0, State lifecycle$State0, a a0, d d0) {
        h0.e().u1();
        throw null;
    }
}

