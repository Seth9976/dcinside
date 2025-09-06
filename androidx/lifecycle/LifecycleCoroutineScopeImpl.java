package androidx.lifecycle;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    @l
    private final Lifecycle a;
    @l
    private final g b;

    public LifecycleCoroutineScopeImpl(@l Lifecycle lifecycle0, @l g g0) {
        L.p(lifecycle0, "lifecycle");
        L.p(g0, "coroutineContext");
        super();
        this.a = lifecycle0;
        this.b = g0;
        if(this.a().b() == State.a) {
            O0.i(this.getCoroutineContext(), null, 1, null);
        }
    }

    @Override  // androidx.lifecycle.LifecycleCoroutineScope
    @l
    public Lifecycle a() {
        return this.a;
    }

    public final void f() {
        k.f(this, h0.e().u1(), null, new o(null) {
            int k;
            private Object l;
            final LifecycleCoroutineScopeImpl m;

            {
                this.m = lifecycleCoroutineScopeImpl0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.lifecycle.LifecycleCoroutineScopeImpl.register.1(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.lifecycle.LifecycleCoroutineScopeImpl.register.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                O o0 = (O)this.l;
                if(this.m.a().b().compareTo(State.b) >= 0) {
                    this.m.a().a(this.m);
                    return S0.a;
                }
                O0.i(o0.getCoroutineContext(), null, 1, null);
                return S0.a;
            }
        }, 2, null);
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return this.b;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
        L.p(lifecycleOwner0, "source");
        L.p(lifecycle$Event0, "event");
        if(this.a().b().compareTo(State.a) <= 0) {
            this.a().d(this);
            O0.i(this.getCoroutineContext(), null, 1, null);
        }
    }
}

