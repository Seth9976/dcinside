package androidx.compose.foundation.layout;

import A3.a;
import A3.p;
import A3.r;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,250:1\n75#2:251\n76#2,11:253\n89#2:280\n76#3:252\n460#4,16:264\n50#4:281\n49#4:282\n1057#5,6:283\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n79#1:251\n79#1:253,11\n79#1:280\n79#1:252\n79#1:264,16\n105#1:281\n105#1:282\n105#1:283,6\n*E\n"})
public final class ColumnKt {
    @l
    private static final MeasurePolicy a;

    static {
        float f = Arrangement.a.r().a();
        CrossAxisAlignment crossAxisAlignment0 = CrossAxisAlignment.a.i(Alignment.a.u());
        ColumnKt.a = RowColumnImplKt.r(LayoutOrientation.b, ColumnKt.DefaultColumnMeasurePolicy.1.e, f, SizeMode.a, crossAxisAlignment0);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@m Modifier modifier0, @m Vertical arrangement$Vertical0, @m Horizontal alignment$Horizontal0, @l p p0, @m Composer composer0, int v, int v1) {
        L.p(p0, "content");
        composer0.V(0xE32F0E82);
        if((v1 & 1) != 0) {
            modifier0 = Modifier.m0;
        }
        if((v1 & 2) != 0) {
            arrangement$Vertical0 = Arrangement.a.r();
        }
        if((v1 & 4) != 0) {
            alignment$Horizontal0 = Alignment.a.u();
        }
        MeasurePolicy measurePolicy0 = ColumnKt.b(arrangement$Vertical0, alignment$Horizontal0, composer0, v >> 3 & 0x7E);
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
        p0.invoke(ColumnScopeInstance.a, composer0, ((int)(v >> 6 & 0x70 | 6)));
        composer0.g0();
        composer0.g();
        composer0.g0();
        composer0.g0();
    }

    @Composable
    @b0
    @l
    public static final MeasurePolicy b(@l Vertical arrangement$Vertical0, @l Horizontal alignment$Horizontal0, @m Composer composer0, int v) {
        MeasurePolicy measurePolicy0;
        L.p(arrangement$Vertical0, "verticalArrangement");
        L.p(alignment$Horizontal0, "horizontalAlignment");
        composer0.V(0x40F63170);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x40F63170, v, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:98)");
        }
        if(!L.g(arrangement$Vertical0, Arrangement.a.r()) || !L.g(alignment$Horizontal0, Alignment.a.u())) {
            composer0.V(0x1E7B2B64);
            boolean z = composer0.t(arrangement$Vertical0);
            boolean z1 = composer0.t(alignment$Horizontal0);
            MeasurePolicy measurePolicy1 = composer0.W();
            if(z || z1 || measurePolicy1 == Composer.a.a()) {
                float f = arrangement$Vertical0.a();
                CrossAxisAlignment crossAxisAlignment0 = CrossAxisAlignment.a.i(alignment$Horizontal0);
                androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy.1.1 columnKt$columnMeasurePolicy$1$10 = new r(arrangement$Vertical0) {
                    final Vertical e;

                    {
                        this.e = arrangement$Vertical0;
                        super(5);
                    }

                    @Override  // A3.r
                    public Object K0(Object object0, Object object1, Object object2, Object object3, Object object4) {
                        this.a(((Number)object0).intValue(), ((int[])object1), ((LayoutDirection)object2), ((Density)object3), ((int[])object4));
                        return S0.a;
                    }

                    public final void a(int v, @l int[] arr_v, @l LayoutDirection layoutDirection0, @l Density density0, @l int[] arr_v1) {
                        L.p(arr_v, "size");
                        L.p(layoutDirection0, "<anonymous parameter 2>");
                        L.p(density0, "density");
                        L.p(arr_v1, "outPosition");
                        this.e.c(density0, v, arr_v, arr_v1);
                    }
                };
                measurePolicy1 = RowColumnImplKt.r(LayoutOrientation.b, columnKt$columnMeasurePolicy$1$10, f, SizeMode.a, crossAxisAlignment0);
                composer0.O(measurePolicy1);
            }
            composer0.g0();
            measurePolicy0 = measurePolicy1;
        }
        else {
            measurePolicy0 = ColumnKt.a;
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return measurePolicy0;
    }

    @l
    public static final MeasurePolicy c() {
        return ColumnKt.a;
    }

    @b0
    public static void d() {
    }
}

