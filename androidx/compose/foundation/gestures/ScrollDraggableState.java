package androidx.compose.foundation.gestures;

import A3.o;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.State;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollDraggableState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,579:1\n1#2:580\n*E\n"})
final class ScrollDraggableState implements DragScope, DraggableState {
    @l
    private final State a;
    @l
    private ScrollScope b;

    public ScrollDraggableState(@l State state0) {
        L.p(state0, "scrollLogic");
        super();
        this.a = state0;
        this.b = ScrollableKt.a;
    }

    @Override  // androidx.compose.foundation.gestures.DragScope
    public void a(float f) {
        ScrollingLogic scrollingLogic0 = (ScrollingLogic)this.a.getValue();
        scrollingLogic0.a(this.b, scrollingLogic0.t(f), 1);
    }

    @Override  // androidx.compose.foundation.gestures.DraggableState
    public void b(float f) {
        ScrollingLogic scrollingLogic0 = (ScrollingLogic)this.a.getValue();
        scrollingLogic0.k(scrollingLogic0.t(f));
    }

    @Override  // androidx.compose.foundation.gestures.DraggableState
    @m
    public Object c(@l MutatePriority mutatePriority0, @l o o0, @l d d0) {
        Object object0 = ((ScrollingLogic)this.a.getValue()).h().d(mutatePriority0, new o(o0, null) {
            int k;
            private Object l;
            final ScrollDraggableState m;
            final o n;

            {
                this.m = scrollDraggableState0;
                this.n = o0;
                super(2, d0);
            }

            @m
            public final Object a(@l ScrollScope scrollScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.ScrollDraggableState.drag.2)this.create(scrollScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.ScrollDraggableState.drag.2(this.m, this.n, d0);
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
                        this.m.f(((ScrollScope)this.l));
                        this.k = 1;
                        return this.n.invoke(this.m, this) == object1 ? object1 : S0.a;
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
    public final ScrollScope d() {
        return this.b;
    }

    @l
    public final State e() {
        return this.a;
    }

    public final void f(@l ScrollScope scrollScope0) {
        L.p(scrollScope0, "<set-?>");
        this.b = scrollScope0;
    }
}

