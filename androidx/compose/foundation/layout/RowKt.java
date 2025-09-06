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
import androidx.compose.ui.Alignment.Vertical;
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

@s0({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,272:1\n75#2:273\n76#2,11:275\n89#2:302\n76#3:274\n460#4,16:286\n50#4:303\n49#4:304\n1057#5,6:305\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n80#1:273\n80#1:275,11\n80#1:302\n80#1:274\n80#1:286,16\n109#1:303\n109#1:304\n109#1:305,6\n*E\n"})
public final class RowKt {
    @l
    private static final MeasurePolicy a;

    static {
        float f = Arrangement.a.p().a();
        CrossAxisAlignment crossAxisAlignment0 = CrossAxisAlignment.a.j(Alignment.a.w());
        RowKt.a = RowColumnImplKt.r(LayoutOrientation.a, RowKt.DefaultRowMeasurePolicy.1.e, f, SizeMode.a, crossAxisAlignment0);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@m Modifier modifier0, @m Horizontal arrangement$Horizontal0, @m Vertical alignment$Vertical0, @l p p0, @m Composer composer0, int v, int v1) {
        L.p(p0, "content");
        composer0.V(693286680);
        if((v1 & 1) != 0) {
            modifier0 = Modifier.m0;
        }
        if((v1 & 2) != 0) {
            arrangement$Horizontal0 = Arrangement.a.p();
        }
        if((v1 & 4) != 0) {
            alignment$Vertical0 = Alignment.a.w();
        }
        MeasurePolicy measurePolicy0 = RowKt.d(arrangement$Horizontal0, alignment$Vertical0, composer0, v >> 3 & 0x7E);
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
        p0.invoke(RowScopeInstance.a, composer0, ((int)(v >> 6 & 0x70 | 6)));
        composer0.g0();
        composer0.g();
        composer0.g0();
        composer0.g0();
    }

    @l
    public static final MeasurePolicy b() {
        return RowKt.a;
    }

    @b0
    public static void c() {
    }

    @Composable
    @b0
    @l
    public static final MeasurePolicy d(@l Horizontal arrangement$Horizontal0, @l Vertical alignment$Vertical0, @m Composer composer0, int v) {
        MeasurePolicy measurePolicy0;
        L.p(arrangement$Horizontal0, "horizontalArrangement");
        L.p(alignment$Vertical0, "verticalAlignment");
        composer0.V(0xCE1011B2);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xCE1011B2, v, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:102)");
        }
        if(!L.g(arrangement$Horizontal0, Arrangement.a.p()) || !L.g(alignment$Vertical0, Alignment.a.w())) {
            composer0.V(0x1E7B2B64);
            boolean z = composer0.t(arrangement$Horizontal0);
            boolean z1 = composer0.t(alignment$Vertical0);
            MeasurePolicy measurePolicy1 = composer0.W();
            if(z || z1 || measurePolicy1 == Composer.a.a()) {
                float f = arrangement$Horizontal0.a();
                CrossAxisAlignment crossAxisAlignment0 = CrossAxisAlignment.a.j(alignment$Vertical0);
                androidx.compose.foundation.layout.RowKt.rowMeasurePolicy.1.1 rowKt$rowMeasurePolicy$1$10 = new r(arrangement$Horizontal0) {
                    final Horizontal e;

                    {
                        this.e = arrangement$Horizontal0;
                        super(5);
                    }

                    @Override  // A3.r
                    public Object K0(Object object0, Object object1, Object object2, Object object3, Object object4) {
                        this.a(((Number)object0).intValue(), ((int[])object1), ((LayoutDirection)object2), ((Density)object3), ((int[])object4));
                        return S0.a;
                    }

                    public final void a(int v, @l int[] arr_v, @l LayoutDirection layoutDirection0, @l Density density0, @l int[] arr_v1) {
                        L.p(arr_v, "size");
                        L.p(layoutDirection0, "layoutDirection");
                        L.p(density0, "density");
                        L.p(arr_v1, "outPosition");
                        this.e.b(density0, v, arr_v, layoutDirection0, arr_v1);
                    }
                };
                measurePolicy1 = RowColumnImplKt.r(LayoutOrientation.a, rowKt$rowMeasurePolicy$1$10, f, SizeMode.a, crossAxisAlignment0);
                composer0.O(measurePolicy1);
            }
            composer0.g0();
            measurePolicy0 = measurePolicy1;
        }
        else {
            measurePolicy0 = RowKt.a;
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return measurePolicy0;
    }
}

