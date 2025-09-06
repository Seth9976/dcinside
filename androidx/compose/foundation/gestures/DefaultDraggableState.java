package androidx.compose.foundation.gestures;

import A3.o;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
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

final class DefaultDraggableState implements DraggableState {
    @l
    private final Function1 a;
    @l
    private final DragScope b;
    @l
    private final MutatorMutex c;

    public DefaultDraggableState(@l Function1 function10) {
        L.p(function10, "onDelta");
        super();
        this.a = function10;
        this.b = new DragScope() {
            @Override  // androidx.compose.foundation.gestures.DragScope
            public void a(float f) {
                this.a.e().invoke(f);
            }
        };
        this.c = new MutatorMutex();
    }

    @Override  // androidx.compose.foundation.gestures.DraggableState
    public void b(float f) {
        this.a.invoke(f);
    }

    @Override  // androidx.compose.foundation.gestures.DraggableState
    @m
    public Object c(@l MutatePriority mutatePriority0, @l o o0, @l d d0) {
        Object object0 = P.g(new o(mutatePriority0, o0, null) {
            int k;
            final DefaultDraggableState l;
            final MutatePriority m;
            final o n;

            {
                this.l = defaultDraggableState0;
                this.m = mutatePriority0;
                this.n = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.foundation.gestures.DefaultDraggableState.drag.2(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.gestures.DefaultDraggableState.drag.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.l.c.f(this.l.b, this.m, this.n, this) == object1 ? object1 : S0.a;
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

    @l
    public final Function1 e() {
        return this.a;
    }
}

