package androidx.compose.foundation.gestures;

import A3.o;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import y4.l;
import y4.m;

final class DefaultScrollableState implements ScrollableState {
    @l
    private final Function1 a;
    @l
    private final ScrollScope b;
    @l
    private final MutatorMutex c;
    @l
    private final MutableState d;

    public DefaultScrollableState(@l Function1 function10) {
        L.p(function10, "onDelta");
        super();
        this.a = function10;
        this.b = new ScrollScope() {
            @Override  // androidx.compose.foundation.gestures.ScrollScope
            public float a(float f) {
                return ((Number)this.a.i().invoke(f)).floatValue();
            }
        };
        this.c = new MutatorMutex();
        this.d = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean a() {
        return true;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float b(float f) {
        return ((Number)this.a.invoke(f)).floatValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean c() {
        return ((Boolean)this.d.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @m
    public Object d(@l MutatePriority mutatePriority0, @l o o0, @l d d0) {
        Object object0 = P.g(new o(mutatePriority0, o0, null) {
            int k;
            final DefaultScrollableState l;
            final MutatePriority m;
            final o n;

            {
                this.l = defaultScrollableState0;
                this.m = mutatePriority0;
                this.n = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.foundation.gestures.DefaultScrollableState.scroll.2(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.gestures.DefaultScrollableState.scroll.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        androidx.compose.foundation.gestures.DefaultScrollableState.scroll.2.1 defaultScrollableState$scroll$2$10 = new o(this.n, null) {
                            int k;
                            private Object l;
                            final DefaultScrollableState m;
                            final o n;

                            {
                                this.m = defaultScrollableState0;
                                this.n = o0;
                                super(2, d0);
                            }

                            @m
                            public final Object a(@l ScrollScope scrollScope0, @m d d0) {
                                return ((androidx.compose.foundation.gestures.DefaultScrollableState.scroll.2.1)this.create(scrollScope0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.compose.foundation.gestures.DefaultScrollableState.scroll.2.1(this.m, this.n, d0);
                                d1.l = object0;
                                return d1;
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.a(((ScrollScope)object0), ((d)object1));
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = b.l();
                                switch(this.k) {
                                    case 0: {
                                        f0.n(object0);
                                        ScrollScope scrollScope0 = (ScrollScope)this.l;
                                        this.m.d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                                        try {
                                            this.k = 1;
                                            if(this.n.invoke(scrollScope0, this) == object1) {
                                                return object1;
                                            label_9:
                                                f0.n(object0);
                                            }
                                            break;
                                        }
                                        catch(Throwable throwable0) {
                                            this.m.d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                                            throw throwable0;
                                        }
                                    }
                                    case 1: {
                                        goto label_9;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                this.m.d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                                return S0.a;
                            }
                        };
                        this.k = 1;
                        return this.l.c.f(this.l.b, this.m, defaultScrollableState$scroll$2$10, this) == object1 ? object1 : S0.a;
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

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean e() {
        return true;
    }

    @l
    public final Function1 i() {
        return this.a;
    }
}

