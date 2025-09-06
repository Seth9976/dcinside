package androidx.compose.foundation;

import A3.a;
import A3.o;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,417:1\n76#2:418\n102#2,2:419\n76#2:421\n102#2,2:422\n76#2:424\n102#2,2:425\n76#2:427\n102#2,2:428\n76#2:430\n102#2,2:431\n76#2:433\n214#3,8:434\n261#3,8:442\n115#3,9:450\n269#3,3:459\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifier\n*L\n191#1:418\n191#1:419,2\n192#1:421\n192#1:422,2\n193#1:424\n193#1:425,2\n194#1:427\n194#1:428,2\n195#1:430\n195#1:431,2\n199#1:433\n235#1:434,8\n235#1:442,8\n245#1:450,9\n235#1:459,3\n*E\n"})
final class MarqueeModifier implements Element, DrawModifier, FocusEventModifier, LayoutModifier {
    private final int a;
    private final int b;
    private final int c;
    private final float d;
    @l
    private final Density e;
    @l
    private final MutableState f;
    @l
    private final MutableState g;
    @l
    private final MutableState h;
    @l
    private final MutableState i;
    @l
    private final MutableState j;
    @l
    private final Animatable k;
    private final float l;
    @l
    private final State m;

    private MarqueeModifier(int v, int v1, int v2, float f, Density density0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = f;
        this.e = density0;
        this.f = SnapshotStateKt__SnapshotStateKt.g(0, null, 2, null);
        this.g = SnapshotStateKt__SnapshotStateKt.g(0, null, 2, null);
        this.h = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.i = SnapshotStateKt__SnapshotStateKt.g(BasicMarqueeKt.j(), null, 2, null);
        this.j = SnapshotStateKt__SnapshotStateKt.g(MarqueeAnimationMode.c(0), null, 2, null);
        this.k = AnimatableKt.b(0.0f, 0.0f, 2, null);
        this.l = Math.signum(f);
        this.m = SnapshotStateKt.c(new a() {
            final MarqueeModifier e;

            {
                this.e = marqueeModifier0;
                super(0);
            }

            @l
            public final Integer b() {
                return this.e.y().a(this.e.e, this.e.w(), this.e.t());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    public MarqueeModifier(int v, int v1, int v2, float f, Density density0, w w0) {
        this(v, v1, v2, f, density0);
    }

    @m
    public final Object A(@l d d0) {
        if(this.a <= 0) {
            return S0.a;
        }
        androidx.compose.foundation.MarqueeModifier.runAnimation.2 marqueeModifier$runAnimation$20 = new o(null) {
            int k;
            final MarqueeModifier l;

            {
                this.l = marqueeModifier0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.foundation.MarqueeModifier.runAnimation.2(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.MarqueeModifier.runAnimation.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        i i0 = SnapshotStateKt.v(new a() {
                            final MarqueeModifier e;

                            {
                                this.e = marqueeModifier0;
                                super(0);
                            }

                            @m
                            public final Float b() {
                                if(this.e.w() <= this.e.t()) {
                                    return null;
                                }
                                return !MarqueeAnimationMode.f(this.e.s(), 1) || this.e.x() ? ((float)(this.e.w() + this.e.z())) : null;
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                return this.b();
                            }
                        });
                        androidx.compose.foundation.MarqueeModifier.runAnimation.2.2 marqueeModifier$runAnimation$2$20 = new o(null) {
                            Object k;
                            int l;
                            Object m;
                            final MarqueeModifier n;

                            {
                                this.n = marqueeModifier0;
                                super(2, d0);
                            }

                            @m
                            public final Object a(@m Float float0, @m d d0) {
                                return ((androidx.compose.foundation.MarqueeModifier.runAnimation.2.2)this.create(float0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.compose.foundation.MarqueeModifier.runAnimation.2.2(this.n, d0);
                                d1.m = object0;
                                return d1;
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.a(((Float)object0), ((d)object1));
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Throwable throwable0;
                                AnimationSpec animationSpec1;
                                Float float0;
                                Object object1 = b.l();
                                switch(this.l) {
                                    case 0: {
                                        f0.n(object0);
                                        Float float1 = (Float)this.m;
                                        if(float1 == null) {
                                            return S0.a;
                                        }
                                        animationSpec1 = BasicMarqueeKt.e(this.n.a, ((float)float1), this.n.c, this.n.b, this.n.d, this.n.e);
                                        this.m = float1;
                                        this.k = animationSpec1;
                                        this.l = 1;
                                        if(this.n.k.B(kotlin.coroutines.jvm.internal.b.e(0.0f), this) == object1) {
                                            return object1;
                                        }
                                        float0 = float1;
                                        try {
                                        label_26:
                                            this.m = null;
                                            this.k = null;
                                            this.l = 2;
                                            if(Animatable.i(this.n.k, float0, animationSpec1, null, null, this, 12, null) == object1) {
                                                return object1;
                                            }
                                            break;
                                        }
                                        catch(Throwable throwable0) {
                                        label_32:
                                            this.m = throwable0;
                                            this.k = null;
                                            this.l = 4;
                                            if(this.n.k.B(kotlin.coroutines.jvm.internal.b.e(0.0f), this) == object1) {
                                                return object1;
                                            }
                                        }
                                        throw throwable0;
                                    }
                                    case 1: {
                                        AnimationSpec animationSpec0 = (AnimationSpec)this.k;
                                        float0 = (Float)this.m;
                                        f0.n(object0);
                                        animationSpec1 = animationSpec0;
                                        goto label_26;
                                    }
                                    case 2: {
                                        try {
                                            f0.n(object0);
                                            break;
                                        }
                                        catch(Throwable throwable0) {
                                            goto label_32;
                                        }
                                    }
                                    case 3: {
                                        f0.n(object0);
                                        return S0.a;
                                    }
                                    case 4: {
                                        throwable0 = (Throwable)this.m;
                                        f0.n(object0);
                                        throw throwable0;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                this.l = 3;
                                return this.n.k.B(kotlin.coroutines.jvm.internal.b.e(0.0f), this) == object1 ? object1 : S0.a;
                            }
                        };
                        this.k = 1;
                        return k.A(i0, marqueeModifier$runAnimation$2$20, this) == object1 ? object1 : S0.a;
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
        Object object0 = kotlinx.coroutines.i.h(FixedMotionDurationScale.a, marqueeModifier$runAnimation$20, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    public final void C(int v) {
        MarqueeAnimationMode marqueeAnimationMode0 = MarqueeAnimationMode.c(v);
        this.j.setValue(marqueeAnimationMode0);
    }

    private final void D(int v) {
        this.g.setValue(v);
    }

    private final void F(int v) {
        this.f.setValue(v);
    }

    private final void G(boolean z) {
        this.h.setValue(Boolean.valueOf(z));
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return androidx.compose.ui.b.b(this, function10);
    }

    public final void I(@l MarqueeSpacing marqueeSpacing0) {
        L.p(marqueeSpacing0, "<set-?>");
        this.i.setValue(marqueeSpacing0);
    }

    @Override  // androidx.compose.ui.focus.FocusEventModifier
    public void K(@l FocusState focusState0) {
        L.p(focusState0, "focusState");
        this.G(focusState0.c());
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return androidx.compose.ui.b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return androidx.compose.ui.b.d(this, object0, o0);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int c(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.d(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int e(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.b(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int f(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.a(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int g(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return c.c(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        Placeable placeable0 = measurable0.r1(Constraints.e(v, 0, 0x7FFFFFFF, 0, 0, 13, null));
        this.D(ConstraintsKt.g(v, placeable0.N1()));
        this.F(placeable0.N1());
        return MeasureScope.-CC.p(measureScope0, this.t(), placeable0.K1(), null, new Function1(this) {
            final Placeable e;
            final MarqueeModifier f;

            {
                this.e = placeable0;
                this.f = marqueeModifier0;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                int v = kotlin.math.b.L0(-((Number)this.f.k.u()).floatValue() * this.f.l);
                PlacementScope.D(placeable$PlacementScope0, this.e, v, 0, 0.0f, null, 12, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return androidx.compose.ui.a.a(this, modifier0);
    }

    public final int s() {
        return ((MarqueeAnimationMode)this.j.getValue()).i();
    }

    private final int t() {
        return ((Number)this.g.getValue()).intValue();
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return androidx.compose.ui.b.a(this, function10);
    }

    @Override  // androidx.compose.ui.draw.DrawModifier
    public void v(@l ContentDrawScope contentDrawScope0) {
        boolean z1;
        L.p(contentDrawScope0, "<this>");
        float f = ((Number)this.k.u()).floatValue() * this.l;
        boolean z = false;
        if(this.l != 1.0f) {
            z1 = ((Number)this.k.u()).floatValue() < ((float)this.t());
        }
        else if(((Number)this.k.u()).floatValue() < ((float)this.w())) {
            z1 = true;
        }
        else {
            z1 = false;
        }
        if(this.l != 1.0f) {
            if(((Number)this.k.u()).floatValue() > ((float)this.z())) {
                z = true;
            }
        }
        else if(((Number)this.k.u()).floatValue() > ((float)(this.w() + this.z() - this.t()))) {
            z = true;
        }
        int v = this.l == 1.0f ? this.w() + this.z() : -this.w() - this.z();
        float f1 = f + ((float)this.t());
        float f2 = Size.m(contentDrawScope0.b());
        DrawContext drawContext0 = contentDrawScope0.J0();
        long v1 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().a(f, 0.0f, f1, f2, 1);
        if(z1) {
            contentDrawScope0.Q0();
        }
        if(z) {
            contentDrawScope0.J0().d().c(((float)v), 0.0f);
            contentDrawScope0.Q0();
            contentDrawScope0.J0().d().c(-((float)v), -0.0f);
        }
        drawContext0.a().v();
        drawContext0.c(v1);
    }

    private final int w() {
        return ((Number)this.f.getValue()).intValue();
    }

    private final boolean x() {
        return ((Boolean)this.h.getValue()).booleanValue();
    }

    @l
    public final MarqueeSpacing y() {
        return (MarqueeSpacing)this.i.getValue();
    }

    private final int z() {
        return ((Number)this.m.getValue()).intValue();
    }
}

