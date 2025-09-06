package androidx.compose.ui.layout;

import A3.a;
import A3.o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import y4.l;

@s0({"SMAP\nTestModifierUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestModifierUpdater.kt\nandroidx/compose/ui/layout/TestModifierUpdaterKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,58:1\n251#2,10:59\n*S KotlinDebug\n*F\n+ 1 TestModifierUpdater.kt\nandroidx/compose/ui/layout/TestModifierUpdaterKt\n*L\n50#1:59,10\n*E\n"})
public final class TestModifierUpdaterKt {
    @Composable
    @k(level = m.b, message = "It is a test API, do not use it in the real applications")
    public static final void a(@l Function1 function10, @y4.m Composer composer0, int v) {
        L.p(function10, "onAttached");
        Composer composer1 = composer0.G(-1673066036);
        if((((v & 14) == 0 ? (composer1.Y(function10) ? 4 : 2) | v : v) & 11) != 2 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(-1673066036, v, -1, "androidx.compose.ui.layout.TestModifierUpdaterLayout (TestModifierUpdater.kt:45)");
            }
            androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1 testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$10 = androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.a;
            a a0 = LayoutNode.P.a();
            composer1.V(0x7076B8D0);
            if(!(composer1.H() instanceof Applier)) {
                ComposablesKt.n();
            }
            composer1.K();
            if(composer1.E()) {
                composer1.k(new a(a0) {
                    final a e;

                    {
                        this.e = a0;
                        super(0);
                    }

                    @Override  // A3.a
                    @l
                    public final Object invoke() {
                        return this.e.invoke();
                    }
                });
            }
            else {
                composer1.f();
            }
            Composer composer2 = Updater.b(composer1);
            Updater.j(composer2, testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$10, ComposeUiNode.p0.d());
            Updater.g(composer2, new Function1(function10) {
                final Function1 e;

                {
                    this.e = function10;
                    super(1);
                }

                public final void a(@l LayoutNode layoutNode0) {
                    L.p(layoutNode0, "$this$init");
                    TestModifierUpdater testModifierUpdater0 = new TestModifierUpdater(layoutNode0);
                    this.e.invoke(testModifierUpdater0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((LayoutNode)object0));
                    return S0.a;
                }
            });
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
            scopeUpdateScope0.a(new o(function10, v) {
                final Function1 e;
                final int f;

                {
                    this.e = function10;
                    this.f = v;
                    super(2);
                }

                public final void a(@y4.m Composer composer0, int v) {
                    TestModifierUpdaterKt.a(this.e, composer0, (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1 implements MeasurePolicy {
            public static final androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1 a;

            static {
                androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.a = new androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1();
            }

            androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1() {
                super();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @l
            public final MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                L.p(measureScope0, "$this$MeasurePolicy");
                L.p(list0, "<anonymous parameter 0>");
                return MeasureScope.-CC.p(measureScope0, Constraints.p(v), Constraints.o(v), null, androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.measure.1.e, 4, null);

                final class androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.measure.1 extends N implements Function1 {
                    public static final androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.measure.1 e;

                    static {
                        androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.measure.1.e = new androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.measure.1();
                    }

                    androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.measurePolicy.1.measure.1() {
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
        }

    }
}

