package androidx.lifecycle;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.k;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

public final class PausingDispatcherKt {
    @k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final Object a(@l Lifecycle lifecycle0, @l o o0, @l d d0) {
        return PausingDispatcherKt.g(lifecycle0, State.c, o0, d0);
    }

    @k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final Object b(@l LifecycleOwner lifecycleOwner0, @l o o0, @l d d0) {
        return PausingDispatcherKt.a(lifecycleOwner0.getLifecycle(), o0, d0);
    }

    @k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final Object c(@l Lifecycle lifecycle0, @l o o0, @l d d0) {
        return PausingDispatcherKt.g(lifecycle0, State.e, o0, d0);
    }

    @k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final Object d(@l LifecycleOwner lifecycleOwner0, @l o o0, @l d d0) {
        return PausingDispatcherKt.c(lifecycleOwner0.getLifecycle(), o0, d0);
    }

    @k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final Object e(@l Lifecycle lifecycle0, @l o o0, @l d d0) {
        return PausingDispatcherKt.g(lifecycle0, State.d, o0, d0);
    }

    @k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final Object f(@l LifecycleOwner lifecycleOwner0, @l o o0, @l d d0) {
        return PausingDispatcherKt.e(lifecycleOwner0.getLifecycle(), o0, d0);
    }

    @k(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final Object g(@l Lifecycle lifecycle0, @l State lifecycle$State0, @l o o0, @l d d0) {
        return i.h(h0.e().u1(), new o(lifecycle0, lifecycle$State0, o0, null) {
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
                d d1 = new androidx.lifecycle.PausingDispatcherKt.whenStateAtLeast.2(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.lifecycle.PausingDispatcherKt.whenStateAtLeast.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                LifecycleController lifecycleController1;
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        I0 i00 = (I0)((O)this.l).getCoroutineContext().get(I0.B8);
                        if(i00 == null) {
                            throw new IllegalStateException("when[State] methods should have a parent job");
                        }
                        PausingDispatcher pausingDispatcher0 = new PausingDispatcher();
                        LifecycleController lifecycleController0 = new LifecycleController(this.m, this.n, pausingDispatcher0.b, i00);
                        try {
                            this.l = lifecycleController0;
                            this.k = 1;
                            object0 = i.h(pausingDispatcher0, this.o, this);
                        }
                        catch(Throwable throwable0) {
                            lifecycleController1 = lifecycleController0;
                            lifecycleController1.b();
                            throw throwable0;
                        }
                        if(object0 == object1) {
                            return object1;
                        }
                        lifecycleController1 = lifecycleController0;
                        break;
                    }
                    case 1: {
                        lifecycleController1 = (LifecycleController)this.l;
                        try {
                            f0.n(object0);
                            break;
                        }
                        catch(Throwable throwable0) {
                        }
                        lifecycleController1.b();
                        throw throwable0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                lifecycleController1.b();
                return object0;
            }
        }, d0);
    }
}

