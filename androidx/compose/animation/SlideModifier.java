package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.J;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

final class SlideModifier extends LayoutModifierWithPassThroughIntrinsics {
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
    private final State b;
    @l
    private final State c;
    @l
    private final Function1 d;

    public SlideModifier(@l DeferredAnimation transition$DeferredAnimation0, @l State state0, @l State state1) {
        L.p(transition$DeferredAnimation0, "lazyAnimation");
        L.p(state0, "slideIn");
        L.p(state1, "slideOut");
        super();
        this.a = transition$DeferredAnimation0;
        this.b = state0;
        this.c = state1;
        this.d = new Function1() {
            final SlideModifier e;

            {
                this.e = slideModifier0;
                super(1);
            }

            @l
            public final FiniteAnimationSpec a(@l Segment transition$Segment0) {
                FiniteAnimationSpec finiteAnimationSpec0;
                L.p(transition$Segment0, "$this$null");
                EnterExitState enterExitState0 = EnterExitState.b;
                if(transition$Segment0.a(EnterExitState.a, enterExitState0)) {
                    Slide slide0 = (Slide)this.e.b().getValue();
                    if(slide0 != null) {
                        finiteAnimationSpec0 = slide0.e();
                        return finiteAnimationSpec0 == null ? EnterExitTransitionKt.d : finiteAnimationSpec0;
                    }
                    return EnterExitTransitionKt.d;
                }
                if(transition$Segment0.a(enterExitState0, EnterExitState.c)) {
                    Slide slide1 = (Slide)this.e.d().getValue();
                    if(slide1 != null) {
                        finiteAnimationSpec0 = slide1.e();
                        if(finiteAnimationSpec0 != null) {
                            return finiteAnimationSpec0;
                        }
                    }
                    return EnterExitTransitionKt.d;
                }
                return EnterExitTransitionKt.d;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Segment)object0));
            }
        };
    }

    @l
    public final DeferredAnimation a() {
        return this.a;
    }

    @l
    public final State b() {
        return this.b;
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
        return MeasureScope.-CC.p(measureScope0, placeable0.N1(), placeable0.K1(), null, new Function1(placeable0, IntSizeKt.a(placeable0.N1(), placeable0.K1())) {
            final SlideModifier e;
            final Placeable f;
            final long g;

            {
                this.e = slideModifier0;
                this.f = placeable0;
                this.g = v;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                long v = ((IntOffset)this.e.a().a(this.e.i(), new Function1(this.g) {
                    final SlideModifier e;
                    final long f;

                    {
                        this.e = slideModifier0;
                        this.f = v;
                        super(1);
                    }

                    public final long a(@l EnterExitState enterExitState0) {
                        L.p(enterExitState0, "it");
                        return this.e.j(enterExitState0, this.f);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return IntOffset.b(this.a(((EnterExitState)object0)));
                    }
                }).getValue()).w();
                PlacementScope.F(placeable$PlacementScope0, this.f, v, 0.0f, null, 6, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null);
    }

    @l
    public final Function1 i() {
        return this.d;
    }

    public final long j(@l EnterExitState enterExitState0, long v) {
        long v2;
        long v1;
        L.p(enterExitState0, "targetState");
        Slide slide0 = (Slide)this.b.getValue();
        if(slide0 == null) {
            v1 = 0L;
        }
        else {
            Function1 function10 = slide0.f();
            v1 = function10 == null ? 0L : ((IntOffset)function10.invoke(IntSize.b(v))).w();
        }
        Slide slide1 = (Slide)this.c.getValue();
        if(slide1 == null) {
            v2 = 0L;
        }
        else {
            Function1 function11 = slide1.f();
            v2 = function11 == null ? 0L : ((IntOffset)function11.invoke(IntSize.b(v))).w();
        }
        switch(enterExitState0) {
            case 1: {
                return 0L;
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
}

