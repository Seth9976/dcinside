package androidx.lifecycle;

import A3.o;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.G.a;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

public final class FlowExtKt {
    @l
    public static final i a(@l i i0, @l Lifecycle lifecycle0, @l State lifecycle$State0) {
        L.p(i0, "<this>");
        L.p(lifecycle0, "lifecycle");
        L.p(lifecycle$State0, "minActiveState");
        return k.s(new o(lifecycle0, lifecycle$State0, i0, null) {
            int k;
            private Object l;
            final Lifecycle m;
            final State n;
            final i o;

            {
                this.m = lifecycle0;
                this.n = lifecycle$State0;
                this.o = i0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.lifecycle.FlowExtKt.flowWithLifecycle.1(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l D d0, @m d d1) {
                return ((androidx.lifecycle.FlowExtKt.flowWithLifecycle.1)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                D d1;
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.l;
                        androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1 flowExtKt$flowWithLifecycle$1$10 = new o(d0, null) {
                            int k;
                            final i l;
                            final D m;

                            {
                                this.l = i0;
                                this.m = d0;
                                super(2, d1);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1(this.l, this.m, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = b.l();
                                switch(this.k) {
                                    case 0: {
                                        f0.n(object0);
                                        androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1 flowExtKt$flowWithLifecycle$1$1$10 = new j() {
                                            @Override  // kotlinx.coroutines.flow.j
                                            @m
                                            public final Object emit(Object object0, @l d d0) {
                                                Object object1 = this.a.I(object0, d0);
                                                return object1 == b.l() ? object1 : S0.a;
                                            }
                                        };
                                        this.k = 1;
                                        return this.l.collect(flowExtKt$flowWithLifecycle$1$1$10, this) == object1 ? object1 : S0.a;
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
                        this.l = d0;
                        this.k = 1;
                        if(RepeatOnLifecycleKt.a(this.m, this.n, flowExtKt$flowWithLifecycle$1$10, this) == object1) {
                            return object1;
                        }
                        d1 = d0;
                        break;
                    }
                    case 1: {
                        d1 = (D)this.l;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                a.a(d1, null, 1, null);
                return S0.a;
            }
        });
    }

    public static i b(i i0, Lifecycle lifecycle0, State lifecycle$State0, int v, Object object0) {
        if((v & 2) != 0) {
            lifecycle$State0 = State.d;
        }
        return FlowExtKt.a(i0, lifecycle0, lifecycle$State0);
    }
}

