package androidx.lifecycle;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public abstract class LifecycleCoroutineScope implements O {
    @l
    public abstract Lifecycle a();

    @k(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    @l
    public final I0 c(@l o o0) {
        L.p(o0, "block");
        return kotlinx.coroutines.k.f(this, null, null, new o(o0, null) {
            int k;
            final LifecycleCoroutineScope l;
            final o m;

            {
                this.l = lifecycleCoroutineScope0;
                this.m = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.lifecycle.LifecycleCoroutineScope.launchWhenCreated.1(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.lifecycle.LifecycleCoroutineScope.launchWhenCreated.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        Lifecycle lifecycle0 = this.l.a();
                        this.k = 1;
                        return PausingDispatcherKt.a(lifecycle0, this.m, this) == object1 ? object1 : S0.a;
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
    }

    @k(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    @l
    public final I0 d(@l o o0) {
        L.p(o0, "block");
        return kotlinx.coroutines.k.f(this, null, null, new o(o0, null) {
            int k;
            final LifecycleCoroutineScope l;
            final o m;

            {
                this.l = lifecycleCoroutineScope0;
                this.m = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.lifecycle.LifecycleCoroutineScope.launchWhenResumed.1(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.lifecycle.LifecycleCoroutineScope.launchWhenResumed.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        Lifecycle lifecycle0 = this.l.a();
                        this.k = 1;
                        return PausingDispatcherKt.c(lifecycle0, this.m, this) == object1 ? object1 : S0.a;
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
    }

    @k(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    @l
    public final I0 e(@l o o0) {
        L.p(o0, "block");
        return kotlinx.coroutines.k.f(this, null, null, new o(o0, null) {
            int k;
            final LifecycleCoroutineScope l;
            final o m;

            {
                this.l = lifecycleCoroutineScope0;
                this.m = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.lifecycle.LifecycleCoroutineScope.launchWhenStarted.1(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.lifecycle.LifecycleCoroutineScope.launchWhenStarted.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        Lifecycle lifecycle0 = this.l.a();
                        this.k = 1;
                        return PausingDispatcherKt.e(lifecycle0, this.m, this) == object1 ? object1 : S0.a;
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
    }
}

