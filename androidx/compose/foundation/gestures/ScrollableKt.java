package androidx.compose.foundation.gestures;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,579:1\n135#2:580\n25#3:581\n36#3:588\n25#3:595\n36#3:602\n50#3:609\n49#3:610\n1114#4,6:582\n1114#4,6:589\n1114#4,6:596\n1114#4,6:603\n1114#4,6:611\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n*L\n146#1:580\n252#1:581\n263#1:588\n266#1:595\n275#1:602\n276#1:609\n276#1:610\n252#1:582,6\n263#1:589,6\n266#1:596,6\n275#1:603,6\n276#1:611,6\n*E\n"})
public final class ScrollableKt {
    @l
    private static final ScrollScope a = null;
    @l
    private static final ProvidableModifierLocal b = null;
    private static final float c = 1.0f;
    @l
    private static final MotionDurationScale d;

    static {
        ScrollableKt.a = new ScrollableKt.NoOpScrollScope.1();
        ScrollableKt.b = ModifierLocalKt.a(ScrollableKt.ModifierLocalScrollableContainer.1.e);
        ScrollableKt.d = new ScrollableKt.DefaultScrollMotionDurationScale.1();
    }

    private static final Object e(AwaitPointerEventScope awaitPointerEventScope0, d d0) {
        androidx.compose.foundation.gestures.ScrollableKt.awaitScrollEvent.1 scrollableKt$awaitScrollEvent$10;
        if(d0 instanceof androidx.compose.foundation.gestures.ScrollableKt.awaitScrollEvent.1) {
            scrollableKt$awaitScrollEvent$10 = (androidx.compose.foundation.gestures.ScrollableKt.awaitScrollEvent.1)d0;
            int v = scrollableKt$awaitScrollEvent$10.m;
            if((v & 0x80000000) == 0) {
                scrollableKt$awaitScrollEvent$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.m |= 0x80000000;
                        return ScrollableKt.e(null, this);
                    }
                };
            }
            else {
                scrollableKt$awaitScrollEvent$10.m = v ^ 0x80000000;
            }
        }
        else {
            scrollableKt$awaitScrollEvent$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                int m;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.m |= 0x80000000;
                    return ScrollableKt.e(null, this);
                }
            };
        }
        Object object0 = scrollableKt$awaitScrollEvent$10.l;
        Object object1 = b.l();
        switch(scrollableKt$awaitScrollEvent$10.m) {
            case 0: {
                f0.n(object0);
                goto label_19;
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)scrollableKt$awaitScrollEvent$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(PointerEventType.k(((PointerEvent)object0).i(), 6)) {
                return (PointerEvent)object0;
            }
        label_19:
            scrollableKt$awaitScrollEvent$10.k = awaitPointerEventScope0;
            scrollableKt$awaitScrollEvent$10.m = 1;
            object0 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope0, null, scrollableKt$awaitScrollEvent$10, 1, null);
        }
        while(object0 != object1);
        return object1;
    }

    @l
    public static final MotionDurationScale f() {
        return ScrollableKt.d;
    }

    @l
    public static final ProvidableModifierLocal g() {
        return ScrollableKt.b;
    }

    private static final Modifier h(Modifier modifier0, State state0, ScrollConfig scrollConfig0) {
        return SuspendingPointerInputFilterKt.d(modifier0, state0, scrollConfig0, new o(scrollConfig0, state0, null) {
            int k;
            private Object l;
            final ScrollConfig m;
            final State n;

            {
                this.m = scrollConfig0;
                this.n = state0;
                super(2, d0);
            }

            @m
            public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                return ((androidx.compose.foundation.gestures.ScrollableKt.mouseWheelScroll.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.ScrollableKt.mouseWheelScroll.1(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((PointerInputScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        PointerInputScope pointerInputScope0 = (PointerInputScope)this.l;
                        androidx.compose.foundation.gestures.ScrollableKt.mouseWheelScroll.1.1 scrollableKt$mouseWheelScroll$1$10 = new o(this.n, null) {
                            int l;
                            private Object m;
                            final ScrollConfig n;
                            final State o;

                            {
                                this.n = scrollConfig0;
                                this.o = state0;
                                super(2, d0);
                            }

                            @m
                            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                                return ((androidx.compose.foundation.gestures.ScrollableKt.mouseWheelScroll.1.1)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.compose.foundation.gestures.ScrollableKt.mouseWheelScroll.1.1(this.n, this.o, d0);
                                d1.m = object0;
                                return d1;
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.a(((AwaitPointerEventScope)object0), ((d)object1));
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                AwaitPointerEventScope awaitPointerEventScope0;
                                Object object1 = b.l();
                                switch(this.l) {
                                    case 0: {
                                        f0.n(object0);
                                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                                        goto label_26;
                                    }
                                    case 1: {
                                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                                        f0.n(object0);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                do {
                                    List list0 = ((PointerEvent)object0).e();
                                    int v = list0.size();
                                    int v2 = 0;
                                    while(v2 < v) {
                                        if(((PointerInputChange)list0.get(v2)).A()) {
                                            goto label_26;
                                        }
                                        ++v2;
                                    }
                                    long v3 = awaitPointerEventScope0.a();
                                    long v4 = this.n.a(awaitPointerEventScope0, ((PointerEvent)object0), v3);
                                    ScrollingLogic scrollingLogic0 = (ScrollingLogic)this.o.getValue();
                                    if(scrollingLogic0.h().b(scrollingLogic0.m(scrollingLogic0.s(v4))) != 0.0f) {
                                        List list1 = ((PointerEvent)object0).e();
                                        int v5 = list1.size();
                                        for(int v1 = 0; v1 < v5; ++v1) {
                                            ((PointerInputChange)list1.get(v1)).a();
                                        }
                                    }
                                label_26:
                                    this.m = awaitPointerEventScope0;
                                    this.l = 1;
                                    object0 = ScrollableKt.e(awaitPointerEventScope0, this);
                                }
                                while(object0 != object1);
                                return object1;
                            }
                        };
                        this.k = 1;
                        return pointerInputScope0.R0(scrollableKt$mouseWheelScroll$1$10, this) == object1 ? object1 : S0.a;
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
        });
    }

    @Composable
    private static final Modifier i(Modifier modifier0, MutableInteractionSource mutableInteractionSource0, Orientation orientation0, boolean z, ScrollableState scrollableState0, FlingBehavior flingBehavior0, OverscrollEffect overscrollEffect0, boolean z1, Composer composer0, int v) {
        composer0.V(-2012025036);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-2012025036, v, -1, "androidx.compose.foundation.gestures.pointerScrollable (Scrollable.kt:241)");
        }
        composer0.V(0x98DF73D7);
        FlingBehavior flingBehavior1 = flingBehavior0 == null ? ScrollableDefaults.a.a(composer0, 6) : flingBehavior0;
        composer0.g0();
        composer0.V(0xE2A708A4);
        MutableState mutableState0 = composer0.W();
        Companion composer$Companion0 = Composer.a;
        if(mutableState0 == composer$Companion0.a()) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(new NestedScrollDispatcher(), null, 2, null);
            composer0.O(mutableState0);
        }
        composer0.g0();
        State state0 = SnapshotStateKt.t(new ScrollingLogic(orientation0, z, mutableState0, scrollableState0, flingBehavior1, overscrollEffect0), composer0, 0);
        composer0.V(0x44FAF204);
        boolean z2 = composer0.t(Boolean.valueOf(z1));
        NestedScrollConnection nestedScrollConnection0 = composer0.W();
        if(z2 || nestedScrollConnection0 == composer$Companion0.a()) {
            nestedScrollConnection0 = ScrollableKt.n(state0, z1);
            composer0.O(nestedScrollConnection0);
        }
        composer0.g0();
        composer0.V(0xE2A708A4);
        ScrollDraggableState scrollDraggableState0 = composer0.W();
        if(scrollDraggableState0 == composer$Companion0.a()) {
            scrollDraggableState0 = new ScrollDraggableState(state0);
            composer0.O(scrollDraggableState0);
        }
        composer0.g0();
        ScrollConfig scrollConfig0 = AndroidScrollable_androidKt.a(composer0, 0);
        androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.1 scrollableKt$pointerScrollable$10 = androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.1.e;
        composer0.V(0x44FAF204);
        boolean z3 = composer0.t(state0);
        androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.2.1 scrollableKt$pointerScrollable$2$10 = composer0.W();
        if(z3 || scrollableKt$pointerScrollable$2$10 == composer$Companion0.a()) {
            scrollableKt$pointerScrollable$2$10 = new a(state0) {
                final State e;

                {
                    this.e = state0;
                    super(0);
                }

                @l
                public final Boolean b() {
                    return Boolean.valueOf(((ScrollingLogic)this.e.getValue()).o());
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
            composer0.O(scrollableKt$pointerScrollable$2$10);
        }
        composer0.g0();
        composer0.V(0x1E7B2B64);
        boolean z4 = composer0.t(mutableState0);
        boolean z5 = composer0.t(state0);
        androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.3.1 scrollableKt$pointerScrollable$3$10 = composer0.W();
        if(z4 || z5 || scrollableKt$pointerScrollable$3$10 == composer$Companion0.a()) {
            scrollableKt$pointerScrollable$3$10 = new p(mutableState0, state0, null) {
                int k;
                long l;
                final MutableState m;
                final State n;

                {
                    this.m = mutableState0;
                    this.n = state0;
                    super(3, d0);
                }

                @m
                public final Object a(@l O o0, long v, @m d d0) {
                    androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.3.1 scrollableKt$pointerScrollable$3$10 = new androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.3.1(this.m, this.n, d0);
                    scrollableKt$pointerScrollable$3$10.l = v;
                    return scrollableKt$pointerScrollable$3$10.invokeSuspend(S0.a);
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    return this.a(((O)object0), ((Velocity)object1).v(), ((d)object2));
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    long v = this.l;
                    k.f(((NestedScrollDispatcher)this.m.getValue()).f(), null, null, new o(v, null) {
                        int k;
                        final State l;
                        final long m;

                        {
                            this.l = state0;
                            this.m = v;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.3.1.1(this.l, this.m, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.3.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    ScrollingLogic scrollingLogic0 = (ScrollingLogic)this.l.getValue();
                                    this.k = 1;
                                    return scrollingLogic0.j(this.m, this) == object1 ? object1 : S0.a;
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
                    return S0.a;
                }
            };
            composer0.O(scrollableKt$pointerScrollable$3$10);
        }
        composer0.g0();
        Modifier modifier1 = NestedScrollModifierKt.a(ScrollableKt.h(DraggableKt.l(modifier0, scrollDraggableState0, scrollableKt$pointerScrollable$10, orientation0, z1, mutableInteractionSource0, scrollableKt$pointerScrollable$2$10, null, scrollableKt$pointerScrollable$3$10, false, 0x40, null), state0, scrollConfig0), nestedScrollConnection0, ((NestedScrollDispatcher)mutableState0.getValue()));
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return modifier1;

        final class androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.1 extends N implements Function1 {
            public static final androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.1 e;

            static {
                androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.1.e = new androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.1();
            }

            androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable.1() {
                super(1);
            }

            @l
            public final Boolean a(@l PointerInputChange pointerInputChange0) {
                L.p(pointerInputChange0, "down");
                return Boolean.valueOf(!PointerType.i(pointerInputChange0.y(), 2));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((PointerInputChange)object0));
            }
        }

    }

    @ExperimentalFoundationApi
    @l
    public static final Modifier j(@l Modifier modifier0, @l ScrollableState scrollableState0, @l Orientation orientation0, @m OverscrollEffect overscrollEffect0, boolean z, boolean z1, @m FlingBehavior flingBehavior0, @m MutableInteractionSource mutableInteractionSource0) {
        L.p(modifier0, "<this>");
        L.p(scrollableState0, "state");
        L.p(orientation0, "orientation");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(orientation0, scrollableState0, z1, mutableInteractionSource0, flingBehavior0, overscrollEffect0, z) {
            final Orientation e;
            final ScrollableState f;
            final boolean g;
            final MutableInteractionSource h;
            final FlingBehavior i;
            final OverscrollEffect j;
            final boolean k;

            {
                this.e = orientation0;
                this.f = scrollableState0;
                this.g = z;
                this.h = mutableInteractionSource0;
                this.i = flingBehavior0;
                this.j = overscrollEffect0;
                this.k = z1;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0xDA758AF1);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xDA758AF1, v, -1, "androidx.compose.foundation.gestures.scrollable.<anonymous> (Scrollable.kt:155)");
                }
                composer0.V(0x2E20B340);
                composer0.V(0xE2A708A4);
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.W();
                if(compositionScopedCoroutineScopeCanceller0 == Composer.a.a()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(i.a, composer0));
                    composer0.O(compositionScopedCoroutineScopeCanceller1);
                    compositionScopedCoroutineScopeCanceller0 = compositionScopedCoroutineScopeCanceller1;
                }
                composer0.g0();
                O o0 = compositionScopedCoroutineScopeCanceller0.b();
                composer0.g0();
                Object[] arr_object = {o0, this.e, this.f, Boolean.valueOf(this.g)};
                Orientation orientation0 = this.e;
                ScrollableState scrollableState0 = this.f;
                boolean z = this.g;
                composer0.V(0xDE219177);
                boolean z1 = false;
                for(int v1 = 0; v1 < 4; ++v1) {
                    z1 |= composer0.t(arr_object[v1]);
                }
                ContentInViewModifier contentInViewModifier0 = composer0.W();
                if(z1 || contentInViewModifier0 == Composer.a.a()) {
                    contentInViewModifier0 = new ContentInViewModifier(o0, orientation0, scrollableState0, z);
                    composer0.O(contentInViewModifier0);
                }
                composer0.g0();
                androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.m0;
                Modifier modifier1 = ScrollableKt.i(FocusableKt.a(modifier$Companion0).r0(contentInViewModifier0.F()), this.h, this.e, this.g, this.f, this.i, this.j, this.k, composer0, 0);
                if(this.k) {
                    modifier$Companion0 = ModifierLocalScrollableContainerProvider.a;
                }
                Modifier modifier2 = modifier1.r0(modifier$Companion0);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier2;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n*L\n1#1,170:1\n147#2,9:171\n*E\n"})
        public final class androidx.compose.foundation.gestures.ScrollableKt.scrollable..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Orientation e;
            final ScrollableState f;
            final OverscrollEffect g;
            final boolean h;
            final boolean i;
            final FlingBehavior j;
            final MutableInteractionSource k;

            public androidx.compose.foundation.gestures.ScrollableKt.scrollable..inlined.debugInspectorInfo.1(Orientation orientation0, ScrollableState scrollableState0, OverscrollEffect overscrollEffect0, boolean z, boolean z1, FlingBehavior flingBehavior0, MutableInteractionSource mutableInteractionSource0) {
                this.e = orientation0;
                this.f = scrollableState0;
                this.g = overscrollEffect0;
                this.h = z;
                this.i = z1;
                this.j = flingBehavior0;
                this.k = mutableInteractionSource0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("scrollable");
                inspectorInfo0.b().c("orientation", this.e);
                inspectorInfo0.b().c("state", this.f);
                inspectorInfo0.b().c("overscrollEffect", this.g);
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.h));
                inspectorInfo0.b().c("reverseDirection", Boolean.valueOf(this.i));
                inspectorInfo0.b().c("flingBehavior", this.j);
                inspectorInfo0.b().c("interactionSource", this.k);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier k(@l Modifier modifier0, @l ScrollableState scrollableState0, @l Orientation orientation0, boolean z, boolean z1, @m FlingBehavior flingBehavior0, @m MutableInteractionSource mutableInteractionSource0) {
        L.p(modifier0, "<this>");
        L.p(scrollableState0, "state");
        L.p(orientation0, "orientation");
        return ScrollableKt.j(modifier0, scrollableState0, orientation0, null, z, z1, flingBehavior0, mutableInteractionSource0);
    }

    public static Modifier l(Modifier modifier0, ScrollableState scrollableState0, Orientation orientation0, OverscrollEffect overscrollEffect0, boolean z, boolean z1, FlingBehavior flingBehavior0, MutableInteractionSource mutableInteractionSource0, int v, Object object0) {
        boolean z2 = (v & 8) == 0 ? z : true;
        boolean z3 = (v & 16) == 0 ? z1 : false;
        FlingBehavior flingBehavior1 = (v & 0x20) == 0 ? flingBehavior0 : null;
        return (v & 0x40) == 0 ? ScrollableKt.j(modifier0, scrollableState0, orientation0, overscrollEffect0, z2, z3, flingBehavior1, mutableInteractionSource0) : ScrollableKt.j(modifier0, scrollableState0, orientation0, overscrollEffect0, z2, z3, flingBehavior1, null);
    }

    public static Modifier m(Modifier modifier0, ScrollableState scrollableState0, Orientation orientation0, boolean z, boolean z1, FlingBehavior flingBehavior0, MutableInteractionSource mutableInteractionSource0, int v, Object object0) {
        boolean z2 = (v & 4) == 0 ? z : true;
        boolean z3 = (v & 8) == 0 ? z1 : false;
        FlingBehavior flingBehavior1 = (v & 16) == 0 ? flingBehavior0 : null;
        return (v & 0x20) == 0 ? ScrollableKt.k(modifier0, scrollableState0, orientation0, z2, z3, flingBehavior1, mutableInteractionSource0) : ScrollableKt.k(modifier0, scrollableState0, orientation0, z2, z3, flingBehavior1, null);
    }

    private static final NestedScrollConnection n(State state0, boolean z) {
        return new NestedScrollConnection() {
            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            @m
            public Object a(long v, long v1, @l d d0) {
                long v3;
                androidx.compose.foundation.gestures.ScrollableKt.scrollableNestedScrollConnection.1 scrollableKt$scrollableNestedScrollConnection$10;
                androidx.compose.foundation.gestures.ScrollableKt.scrollableNestedScrollConnection.1.onPostFling.1 scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10;
                if(d0 instanceof androidx.compose.foundation.gestures.ScrollableKt.scrollableNestedScrollConnection.1.onPostFling.1) {
                    scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10 = (androidx.compose.foundation.gestures.ScrollableKt.scrollableNestedScrollConnection.1.onPostFling.1)d0;
                    int v2 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10.o;
                    if((v2 & 0x80000000) == 0) {
                        scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                            Object k;
                            long l;
                            Object m;
                            int o;

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                this.m = object0;
                                this.o |= 0x80000000;
                                return d0.a(0L, 0L, this);
                            }
                        };
                    }
                    else {
                        scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10.o = v2 ^ 0x80000000;
                    }
                }
                else {
                    scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                        Object k;
                        long l;
                        Object m;
                        int o;

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            this.m = object0;
                            this.o |= 0x80000000;
                            return d0.a(0L, 0L, this);
                        }
                    };
                }
                Object object0 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10.m;
                Object object1 = b.l();
                switch(scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10.o) {
                    case 0: {
                        f0.n(object0);
                        if(z) {
                            ScrollingLogic scrollingLogic0 = (ScrollingLogic)state0.getValue();
                            scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10.k = this;
                            scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10.l = v1;
                            scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10.o = 1;
                            object0 = scrollingLogic0.b(v1, scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10);
                            if(object0 == object1) {
                                return object1;
                            }
                            scrollableKt$scrollableNestedScrollConnection$10 = this;
                            v3 = Velocity.p(v1, ((Velocity)object0).v());
                        }
                        else {
                            v3 = 0L;
                            scrollableKt$scrollableNestedScrollConnection$10 = this;
                        }
                        break;
                    }
                    case 1: {
                        v1 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10.l;
                        scrollableKt$scrollableNestedScrollConnection$10 = (androidx.compose.foundation.gestures.ScrollableKt.scrollableNestedScrollConnection.1)scrollableKt$scrollableNestedScrollConnection$1$onPostFling$10.k;
                        f0.n(object0);
                        v3 = Velocity.p(v1, ((Velocity)object0).v());
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                Velocity velocity0 = Velocity.b(v3);
                ((ScrollingLogic)scrollableKt$scrollableNestedScrollConnection$10.a.getValue()).l(false);
                return velocity0;
            }

            // 去混淆评级： 低(40)
            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public long b(long v, long v1, int v2) {
                return z ? ((ScrollingLogic)state0.getValue()).k(v1) : 0L;
            }

            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public Object d(long v, d d0) {
                return androidx.compose.ui.input.nestedscroll.a.c(this, v, d0);
            }

            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public long i(long v, int v1) {
                if(NestedScrollSource.g(v1, 2)) {
                    ((ScrollingLogic)state0.getValue()).l(true);
                }
                return 0L;
            }
        };
    }
}

