package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.J;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/ExpandShrinkModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1180:1\n1#2:1181\n79#3:1182\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/ExpandShrinkModifier\n*L\n1152#1:1182\n*E\n"})
final class ExpandShrinkModifier extends LayoutModifierWithPassThroughIntrinsics {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[EnterExitState.values().length];
            try {
                arr_v[EnterExitState.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EnterExitState.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EnterExitState.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private final DeferredAnimation a;
    @l
    private final DeferredAnimation b;
    @l
    private final State c;
    @l
    private final State d;
    @l
    private final State e;
    @m
    private Alignment f;
    @l
    private final Function1 g;

    public ExpandShrinkModifier(@l DeferredAnimation transition$DeferredAnimation0, @l DeferredAnimation transition$DeferredAnimation1, @l State state0, @l State state1, @l State state2) {
        L.p(transition$DeferredAnimation0, "sizeAnimation");
        L.p(transition$DeferredAnimation1, "offsetAnimation");
        L.p(state0, "expand");
        L.p(state1, "shrink");
        L.p(state2, "alignment");
        super();
        this.a = transition$DeferredAnimation0;
        this.b = transition$DeferredAnimation1;
        this.c = state0;
        this.d = state1;
        this.e = state2;
        this.g = new Function1() {
            final ExpandShrinkModifier e;

            {
                this.e = expandShrinkModifier0;
                super(1);
            }

            @l
            public final FiniteAnimationSpec a(@l Segment transition$Segment0) {
                L.p(transition$Segment0, "$this$null");
                EnterExitState enterExitState0 = EnterExitState.b;
                FiniteAnimationSpec finiteAnimationSpec0 = null;
                if(transition$Segment0.a(EnterExitState.a, enterExitState0)) {
                    ChangeSize changeSize0 = (ChangeSize)this.e.d().getValue();
                    if(changeSize0 != null) {
                        finiteAnimationSpec0 = changeSize0.h();
                    }
                }
                else if(transition$Segment0.a(enterExitState0, EnterExitState.c)) {
                    ChangeSize changeSize1 = (ChangeSize)this.e.j().getValue();
                    if(changeSize1 != null) {
                        finiteAnimationSpec0 = changeSize1.h();
                    }
                }
                else {
                    finiteAnimationSpec0 = EnterExitTransitionKt.e;
                }
                return finiteAnimationSpec0 == null ? EnterExitTransitionKt.e : finiteAnimationSpec0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Segment)object0));
            }
        };
    }

    @l
    public final State a() {
        return this.e;
    }

    @m
    public final Alignment b() {
        return this.f;
    }

    @l
    public final State d() {
        return this.c;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        Placeable placeable0 = measurable0.r1(v);
        long v1 = IntSizeKt.a(placeable0.N1(), placeable0.K1());
        androidx.compose.animation.ExpandShrinkModifier.measure.currentSize.1 expandShrinkModifier$measure$currentSize$10 = new Function1(v1) {
            final ExpandShrinkModifier e;
            final long f;

            {
                this.e = expandShrinkModifier0;
                this.f = v;
                super(1);
            }

            public final long a(@l EnterExitState enterExitState0) {
                L.p(enterExitState0, "it");
                return this.e.p(enterExitState0, this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return IntSize.b(this.a(((EnterExitState)object0)));
            }
        };
        long v2 = ((IntSize)this.a.a(this.g, expandShrinkModifier$measure$currentSize$10).getValue()).q();
        androidx.compose.animation.ExpandShrinkModifier.measure.offsetDelta.2 expandShrinkModifier$measure$offsetDelta$20 = new Function1(v1) {
            final ExpandShrinkModifier e;
            final long f;

            {
                this.e = expandShrinkModifier0;
                this.f = v;
                super(1);
            }

            public final long a(@l EnterExitState enterExitState0) {
                L.p(enterExitState0, "it");
                return this.e.q(enterExitState0, this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return IntOffset.b(this.a(((EnterExitState)object0)));
            }
        };
        long v3 = ((IntOffset)this.b.a(androidx.compose.animation.ExpandShrinkModifier.measure.offsetDelta.1.e, expandShrinkModifier$measure$offsetDelta$20).getValue()).w();
        Alignment alignment0 = this.f;
        return alignment0 == null ? MeasureScope.-CC.p(measureScope0, ((int)(v2 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)), null, new Function1(0L, v3) {
            final Placeable e;
            final long f;
            final long g;

            {
                this.e = placeable0;
                this.f = v;
                this.g = v1;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                PlacementScope.p(placeable$PlacementScope0, this.e, ((int)(this.f >> 0x20)) + ((int)(this.g >> 0x20)), ((int)(this.f & 0xFFFFFFFFL)) + ((int)(this.g & 0xFFFFFFFFL)), 0.0f, 4, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null) : MeasureScope.-CC.p(measureScope0, ((int)(v2 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)), null, new Function1(alignment0.a(v1, v2, LayoutDirection.a), v3) {
            final Placeable e;
            final long f;
            final long g;

            {
                this.e = placeable0;
                this.f = v;
                this.g = v1;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                PlacementScope.p(placeable$PlacementScope0, this.e, ((int)(this.f >> 0x20)) + ((int)(this.g >> 0x20)), ((int)(this.f & 0xFFFFFFFFL)) + ((int)(this.g & 0xFFFFFFFFL)), 0.0f, 4, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null);

        final class androidx.compose.animation.ExpandShrinkModifier.measure.offsetDelta.1 extends N implements Function1 {
            public static final androidx.compose.animation.ExpandShrinkModifier.measure.offsetDelta.1 e;

            static {
                androidx.compose.animation.ExpandShrinkModifier.measure.offsetDelta.1.e = new androidx.compose.animation.ExpandShrinkModifier.measure.offsetDelta.1();
            }

            androidx.compose.animation.ExpandShrinkModifier.measure.offsetDelta.1() {
                super(1);
            }

            @l
            public final FiniteAnimationSpec a(@l Segment transition$Segment0) {
                L.p(transition$Segment0, "$this$animate");
                return EnterExitTransitionKt.d;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Segment)object0));
            }
        }

    }

    @l
    public final DeferredAnimation i() {
        return this.b;
    }

    @l
    public final State j() {
        return this.d;
    }

    @l
    public final DeferredAnimation l() {
        return this.a;
    }

    @l
    public final Function1 m() {
        return this.g;
    }

    public final void n(@m Alignment alignment0) {
        this.f = alignment0;
    }

    public final long p(@l EnterExitState enterExitState0, long v) {
        L.p(enterExitState0, "targetState");
        ChangeSize changeSize0 = (ChangeSize)this.c.getValue();
        long v1 = changeSize0 == null ? v : ((IntSize)changeSize0.j().invoke(IntSize.b(v))).q();
        ChangeSize changeSize1 = (ChangeSize)this.d.getValue();
        long v2 = changeSize1 == null ? v : ((IntSize)changeSize1.j().invoke(IntSize.b(v))).q();
        switch(enterExitState0) {
            case 1: {
                return v;
            }
            case 2: {
                return v1;
            }
            case 3: {
                return v2;
            }
            default: {
                throw new J();
            }
        }
    }

    public final long q(@l EnterExitState enterExitState0, long v) {
        L.p(enterExitState0, "targetState");
        if(this.f == null) {
            return 0L;
        }
        if(this.e.getValue() == null) {
            return 0L;
        }
        if(L.g(this.f, this.e.getValue())) {
            return 0L;
        }
        switch(enterExitState0) {
            case 1: {
                return 0L;
            }
            case 2: {
                return 0L;
            }
            case 3: {
                ChangeSize changeSize0 = (ChangeSize)this.d.getValue();
                if(changeSize0 != null) {
                    long v1 = ((IntSize)changeSize0.j().invoke(IntSize.b(v))).q();
                    Object object0 = this.e.getValue();
                    L.m(object0);
                    long v2 = ((Alignment)object0).a(v, v1, LayoutDirection.a);
                    Alignment alignment0 = this.f;
                    L.m(alignment0);
                    long v3 = alignment0.a(v, v1, LayoutDirection.a);
                    return IntOffsetKt.a(((int)(v2 >> 0x20)) - ((int)(v3 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)) - ((int)(v3 & 0xFFFFFFFFL)));
                }
                return 0L;
            }
            default: {
                throw new J();
            }
        }
    }
}

