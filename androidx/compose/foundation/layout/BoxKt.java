package androidx.compose.foundation.layout;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.S0;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.f;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,287:1\n75#2:288\n76#2,11:290\n89#2:317\n75#2:326\n76#2,11:328\n89#2:355\n76#3:289\n76#3:327\n460#4,16:301\n50#4:318\n49#4:319\n460#4,16:339\n1057#5,6:320\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n72#1:288\n72#1:290,11\n72#1:317\n201#1:326\n201#1:328,11\n201#1:355\n72#1:289\n201#1:327\n72#1:301,16\n87#1:318\n87#1:319\n201#1:339,16\n87#1:320,6\n*E\n"})
public final class BoxKt {
    @l
    private static final MeasurePolicy a;
    @l
    private static final MeasurePolicy b;

    static {
        BoxKt.a = BoxKt.e(Alignment.a.C(), false);
        BoxKt.b = BoxKt.EmptyBoxMeasurePolicy.1.a;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@l Modifier modifier0, @m Composer composer0, int v) {
        L.p(modifier0, "modifier");
        Composer composer1 = composer0.G(-211209833);
        int v1 = (v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(-211209833, v1, -1, "androidx.compose.foundation.layout.Box (Box.kt:199)");
            }
            MeasurePolicy measurePolicy0 = BoxKt.b;
            composer1.V(-1323940314);
            Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
            Companion composeUiNode$Companion0 = ComposeUiNode.p0;
            a a0 = composeUiNode$Companion0.a();
            p p0 = LayoutKt.f(modifier0);
            if(!(composer1.H() instanceof Applier)) {
                ComposablesKt.n();
            }
            composer1.h();
            if(composer1.E()) {
                composer1.k(a0);
            }
            else {
                composer1.f();
            }
            composer1.b0();
            Composer composer2 = Updater.b(composer1);
            Updater.j(composer2, measurePolicy0, composeUiNode$Companion0.d());
            Updater.j(composer2, density0, composeUiNode$Companion0.b());
            Updater.j(composer2, layoutDirection0, composeUiNode$Companion0.c());
            Updater.j(composer2, viewConfiguration0, composeUiNode$Companion0.f());
            composer1.y();
            p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
            composer1.V(2058660585);
            composer1.g0();
            composer1.g();
            composer1.g0();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier0, v) {
                final Modifier e;
                final int f;

                {
                    this.e = modifier0;
                    this.f = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    BoxKt.a(this.e, composer0, this.f | 1);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void b(@m Modifier modifier0, @m Alignment alignment0, boolean z, @l p p0, @m Composer composer0, int v, int v1) {
        L.p(p0, "content");
        composer0.V(0x2BB5B5D7);
        if((v1 & 1) != 0) {
            modifier0 = Modifier.m0;
        }
        if((v1 & 2) != 0) {
            alignment0 = Alignment.a.C();
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        MeasurePolicy measurePolicy0 = BoxKt.k(alignment0, z, composer0, v >> 3 & 0x7E);
        composer0.V(-1323940314);
        Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
        ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.L(CompositionLocalsKt.w());
        Companion composeUiNode$Companion0 = ComposeUiNode.p0;
        a a0 = composeUiNode$Companion0.a();
        p p1 = LayoutKt.f(modifier0);
        if(!(composer0.H() instanceof Applier)) {
            ComposablesKt.n();
        }
        composer0.h();
        if(composer0.E()) {
            composer0.k(a0);
        }
        else {
            composer0.f();
        }
        composer0.b0();
        Composer composer1 = Updater.b(composer0);
        Updater.j(composer1, measurePolicy0, composeUiNode$Companion0.d());
        Updater.j(composer1, density0, composeUiNode$Companion0.b());
        Updater.j(composer1, layoutDirection0, composeUiNode$Companion0.c());
        Updater.j(composer1, viewConfiguration0, composeUiNode$Companion0.f());
        composer0.y();
        p1.invoke(SkippableUpdater.a(SkippableUpdater.b(composer0)), composer0, 0);
        composer0.V(2058660585);
        p0.invoke(BoxScopeInstance.a, composer0, ((int)(v >> 6 & 0x70 | 6)));
        composer0.g0();
        composer0.g();
        composer0.g0();
        composer0.g0();
    }

    @l
    public static final MeasurePolicy e(@l Alignment alignment0, boolean z) {
        L.p(alignment0, "alignment");
        return new MeasurePolicy() {
            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @l
            public final MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                int v5;
                L.p(measureScope0, "$this$MeasurePolicy");
                L.p(list0, "measurables");
                if(list0.isEmpty()) {
                    return MeasureScope.-CC.p(measureScope0, Constraints.r(v), Constraints.q(v), null, androidx.compose.foundation.layout.BoxKt.boxMeasurePolicy.1.measure.1.e, 4, null);
                }
                long v1 = z ? v : Constraints.e(v, 0, 0, 0, 0, 10, null);
                if(list0.size() == 1) {
                    Object object0 = list0.get(0);
                    if(!BoxKt.i(((Measurable)object0))) {
                        Placeable placeable0 = ((Measurable)object0).r1(v1);
                        int v3 = Constraints.r(v);
                        int v4 = Math.max(Constraints.q(v), placeable0.K1());
                        v5 = Math.max(v3, placeable0.N1());
                        return MeasureScope.-CC.p(measureScope0, v5, v4, null, new Function1(((Measurable)object0), measureScope0, v5, v4, alignment0) {
                            final Placeable e;
                            final Measurable f;
                            final MeasureScope g;
                            final int h;
                            final int i;
                            final Alignment j;

                            {
                                this.e = placeable0;
                                this.f = measurable0;
                                this.g = measureScope0;
                                this.h = v;
                                this.i = v1;
                                this.j = alignment0;
                                super(1);
                            }

                            public final void a(@l PlacementScope placeable$PlacementScope0) {
                                L.p(placeable$PlacementScope0, "$this$layout");
                                LayoutDirection layoutDirection0 = this.g.getLayoutDirection();
                                BoxKt.j(placeable$PlacementScope0, this.e, this.f, layoutDirection0, this.h, this.i, this.j);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((PlacementScope)object0));
                                return S0.a;
                            }
                        }, 4, null);
                    }
                    v5 = Constraints.r(v);
                    int v6 = Constraints.q(v);
                    int v7 = Constraints.r(v);
                    int v8 = Constraints.q(v);
                    return MeasureScope.-CC.p(measureScope0, v5, v6, null, new Function1(((Measurable)object0), measureScope0, v5, v6, alignment0) {
                        final Placeable e;
                        final Measurable f;
                        final MeasureScope g;
                        final int h;
                        final int i;
                        final Alignment j;

                        {
                            this.e = placeable0;
                            this.f = measurable0;
                            this.g = measureScope0;
                            this.h = v;
                            this.i = v1;
                            this.j = alignment0;
                            super(1);
                        }

                        public final void a(@l PlacementScope placeable$PlacementScope0) {
                            L.p(placeable$PlacementScope0, "$this$layout");
                            LayoutDirection layoutDirection0 = this.g.getLayoutDirection();
                            BoxKt.j(placeable$PlacementScope0, this.e, this.f, layoutDirection0, this.h, this.i, this.j);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((PlacementScope)object0));
                            return S0.a;
                        }
                    }, 4, null);
                }
                Placeable[] arr_placeable = new Placeable[list0.size()];
                f l0$f0 = new f();
                l0$f0.a = Constraints.r(v);
                f l0$f1 = new f();
                l0$f1.a = Constraints.q(v);
                int v9 = list0.size();
                boolean z = false;
                for(int v10 = 0; v10 < v9; ++v10) {
                    Measurable measurable0 = (Measurable)list0.get(v10);
                    if(BoxKt.i(measurable0)) {
                        z = true;
                    }
                    else {
                        Placeable placeable1 = measurable0.r1(v1);
                        arr_placeable[v10] = placeable1;
                        l0$f0.a = Math.max(l0$f0.a, placeable1.N1());
                        l0$f1.a = Math.max(l0$f1.a, placeable1.K1());
                    }
                }
                if(z) {
                    long v11 = ConstraintsKt.a((l0$f0.a == 0x7FFFFFFF ? 0 : l0$f0.a), l0$f0.a, (l0$f1.a == 0x7FFFFFFF ? 0 : l0$f1.a), l0$f1.a);
                    int v12 = list0.size();
                    for(int v2 = 0; v2 < v12; ++v2) {
                        Measurable measurable1 = (Measurable)list0.get(v2);
                        if(BoxKt.i(measurable1)) {
                            arr_placeable[v2] = measurable1.r1(v11);
                        }
                    }
                }
                return MeasureScope.-CC.p(measureScope0, l0$f0.a, l0$f1.a, null, new Function1(list0, measureScope0, l0$f0, l0$f1, alignment0) {
                    final Placeable[] e;
                    final List f;
                    final MeasureScope g;
                    final f h;
                    final f i;
                    final Alignment j;

                    {
                        this.e = arr_placeable;
                        this.f = list0;
                        this.g = measureScope0;
                        this.h = l0$f0;
                        this.i = l0$f1;
                        this.j = alignment0;
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                        Placeable[] arr_placeable = this.e;
                        List list0 = this.f;
                        MeasureScope measureScope0 = this.g;
                        f l0$f0 = this.h;
                        f l0$f1 = this.i;
                        Alignment alignment0 = this.j;
                        int v1 = 0;
                        for(int v = 0; v1 < arr_placeable.length; ++v) {
                            Placeable placeable0 = arr_placeable[v1];
                            L.n(placeable0, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                            BoxKt.j(placeable$PlacementScope0, placeable0, ((Measurable)list0.get(v)), measureScope0.getLayoutDirection(), l0$f0.a, l0$f1.a, alignment0);
                            ++v1;
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                }, 4, null);

                final class androidx.compose.foundation.layout.BoxKt.boxMeasurePolicy.1.measure.1 extends N implements Function1 {
                    public static final androidx.compose.foundation.layout.BoxKt.boxMeasurePolicy.1.measure.1 e;

                    static {
                        androidx.compose.foundation.layout.BoxKt.boxMeasurePolicy.1.measure.1.e = new androidx.compose.foundation.layout.BoxKt.boxMeasurePolicy.1.measure.1();
                    }

                    androidx.compose.foundation.layout.BoxKt.boxMeasurePolicy.1.measure.1() {
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                }

            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int b(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return e.c(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int c(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return e.d(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int d(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return e.a(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int e(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return e.b(this, intrinsicMeasureScope0, list0, v);
            }
        };
    }

    private static final BoxChildData f(Measurable measurable0) {
        Object object0 = measurable0.c();
        return object0 instanceof BoxChildData ? ((BoxChildData)object0) : null;
    }

    @l
    public static final MeasurePolicy g() {
        return BoxKt.a;
    }

    @l
    public static final MeasurePolicy h() {
        return BoxKt.b;
    }

    private static final boolean i(Measurable measurable0) {
        BoxChildData boxChildData0 = BoxKt.f(measurable0);
        return boxChildData0 == null ? false : boxChildData0.l();
    }

    private static final void j(PlacementScope placeable$PlacementScope0, Placeable placeable0, Measurable measurable0, LayoutDirection layoutDirection0, int v, int v1, Alignment alignment0) {
        Alignment alignment2;
        BoxChildData boxChildData0 = BoxKt.f(measurable0);
        if(boxChildData0 == null) {
            alignment2 = alignment0;
        }
        else {
            Alignment alignment1 = boxChildData0.j();
            alignment2 = alignment1 == null ? alignment0 : alignment1;
        }
        PlacementScope.r(placeable$PlacementScope0, placeable0, alignment2.a(IntSizeKt.a(placeable0.N1(), placeable0.K1()), IntSizeKt.a(v, v1), layoutDirection0), 0.0f, 2, null);
    }

    @Composable
    @b0
    @l
    public static final MeasurePolicy k(@l Alignment alignment0, boolean z, @m Composer composer0, int v) {
        MeasurePolicy measurePolicy0;
        L.p(alignment0, "alignment");
        composer0.V(56522820);
        if(ComposerKt.g0()) {
            ComposerKt.w0(56522820, v, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:80)");
        }
        if(!L.g(alignment0, Alignment.a.C()) || z) {
            composer0.V(0x1E7B2B64);
            boolean z1 = composer0.t(alignment0);
            boolean z2 = composer0.t(Boolean.valueOf(z));
            MeasurePolicy measurePolicy1 = composer0.W();
            if(z2 || z1 || measurePolicy1 == Composer.a.a()) {
                measurePolicy1 = BoxKt.e(alignment0, z);
                composer0.O(measurePolicy1);
            }
            composer0.g0();
            measurePolicy0 = measurePolicy1;
        }
        else {
            measurePolicy0 = BoxKt.a;
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return measurePolicy0;
    }
}

