package androidx.compose.foundation.gestures;

import A3.o;
import A3.p;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import y4.l;
import y4.m;

final class DefaultTransformableState implements TransformableState {
    @l
    private final p a;
    @l
    private final TransformScope b;
    @l
    private final MutatorMutex c;
    @l
    private final MutableState d;

    public DefaultTransformableState(@l p p0) {
        L.p(p0, "onTransformation");
        super();
        this.a = p0;
        this.b = new TransformScope() {
            @Override  // androidx.compose.foundation.gestures.TransformScope
            public void a(float f, long v, float f1) {
                this.a.f().invoke(f, Offset.d(v), f1);
            }
        };
        this.c = new MutatorMutex();
        this.d = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
    }

    @Override  // androidx.compose.foundation.gestures.TransformableState
    @m
    public Object a(@l MutatePriority mutatePriority0, @l o o0, @l d d0) {
        Object object0 = P.g(new o(mutatePriority0, o0, null) {
            int k;
            final DefaultTransformableState l;
            final MutatePriority m;
            final o n;

            {
                this.l = defaultTransformableState0;
                this.m = mutatePriority0;
                this.n = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.foundation.gestures.DefaultTransformableState.transform.2(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.gestures.DefaultTransformableState.transform.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        androidx.compose.foundation.gestures.DefaultTransformableState.transform.2.1 defaultTransformableState$transform$2$10 = new o(this.n, null) {
                            int k;
                            private Object l;
                            final DefaultTransformableState m;
                            final o n;

                            {
                                this.m = defaultTransformableState0;
                                this.n = o0;
                                super(2, d0);
                            }

                            @m
                            public final Object a(@l TransformScope transformScope0, @m d d0) {
                                return ((androidx.compose.foundation.gestures.DefaultTransformableState.transform.2.1)this.create(transformScope0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.compose.foundation.gestures.DefaultTransformableState.transform.2.1(this.m, this.n, d0);
                                d1.l = object0;
                                return d1;
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.a(((TransformScope)object0), ((d)object1));
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = b.l();
                                switch(this.k) {
                                    case 0: {
                                        f0.n(object0);
                                        TransformScope transformScope0 = (TransformScope)this.l;
                                        this.m.d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                                        try {
                                            this.k = 1;
                                            if(this.n.invoke(transformScope0, this) == object1) {
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
                        return this.l.c.f(this.l.b, this.m, defaultTransformableState$transform$2$10, this) == object1 ? object1 : S0.a;
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

    @Override  // androidx.compose.foundation.gestures.TransformableState
    public boolean b() {
        return ((Boolean)this.d.getValue()).booleanValue();
    }

    @l
    public final p f() {
        return this.a;
    }
}

