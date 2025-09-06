package androidx.compose.foundation.layout;

import A3.a;
import A3.o;
import A3.p;
import A3.q;
import A3.r;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.S0;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,724:1\n75#2:725\n76#2,11:727\n89#2:754\n75#2:755\n76#2,11:757\n89#2:784\n76#3:726\n76#3:756\n460#4,16:738\n460#4,16:768\n36#4:785\n36#4:792\n36#4:799\n67#4,3:806\n66#4:809\n36#4:816\n67#4,3:823\n66#4:826\n1057#5,6:786\n1057#5,6:793\n1057#5,6:800\n1057#5,6:810\n1057#5,6:817\n1057#5,6:827\n49#6,6:833\n49#6,6:840\n1#7:839\n1182#8:846\n1161#8,2:847\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n66#1:725\n66#1:727,11\n66#1:754\n116#1:755\n116#1:757,11\n116#1:784\n66#1:726\n116#1:756\n66#1:738,16\n116#1:768,16\n126#1:785\n137#1:792\n165#1:799\n168#1:806,3\n168#1:809\n188#1:816\n191#1:823,3\n191#1:826\n126#1:786,6\n137#1:793,6\n165#1:800,6\n168#1:810,6\n188#1:817,6\n191#1:827,6\n427#1:833,6\n542#1:840,6\n580#1:846\n580#1:847,2\n*E\n"})
public final class FlowLayoutKt {
    @l
    private static final q a;
    @l
    private static final q b;

    static {
        FlowLayoutKt.a = FlowLayoutKt.crossAxisRowArrangement.1.e;
        FlowLayoutKt.b = FlowLayoutKt.crossAxisColumnArrangement.1.e;
    }

    @ExperimentalLayoutApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@m Modifier modifier0, @m Vertical arrangement$Vertical0, @m Horizontal alignment$Horizontal0, int v, @l p p0, @m Composer composer0, int v1, int v2) {
        int v4;
        Horizontal alignment$Horizontal1;
        Modifier modifier1;
        Vertical arrangement$Vertical1;
        int v3;
        L.p(p0, "content");
        Composer composer1 = composer0.G(-310290901);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            arrangement$Vertical1 = arrangement$Vertical0;
        }
        else if((v1 & 0x70) == 0) {
            arrangement$Vertical1 = arrangement$Vertical0;
            v3 |= (composer1.t(arrangement$Vertical1) ? 0x20 : 16);
        }
        else {
            arrangement$Vertical1 = arrangement$Vertical0;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.t(alignment$Horizontal0) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.z(v) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((0xE000 & v1) == 0) {
            v3 |= (composer1.t(p0) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v3) != 9362 || !composer1.c()) {
            modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.m0;
            Vertical arrangement$Vertical2 = (v2 & 2) == 0 ? arrangement$Vertical1 : Arrangement.a.r();
            Horizontal alignment$Horizontal2 = (v2 & 4) == 0 ? alignment$Horizontal0 : Alignment.a.u();
            int v5 = (v2 & 8) == 0 ? v : 0x7FFFFFFF;
            if(ComposerKt.g0()) {
                ComposerKt.w0(-310290901, v3, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:103)");
            }
            MeasurePolicy measurePolicy0 = FlowLayoutKt.g(arrangement$Vertical2, alignment$Horizontal2, v5, composer1, v3 >> 3 & 0x3FE, 0);
            composer1.V(-1323940314);
            Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
            Companion composeUiNode$Companion0 = ComposeUiNode.p0;
            a a0 = composeUiNode$Companion0.a();
            p p1 = LayoutKt.f(modifier1);
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
            p1.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
            composer1.V(2058660585);
            p0.invoke(ColumnScopeInstance.a, composer1, ((int)(v3 >> 9 & 0x70 | 6)));
            composer1.g0();
            composer1.g();
            composer1.g0();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            arrangement$Vertical1 = arrangement$Vertical2;
            alignment$Horizontal1 = alignment$Horizontal2;
            v4 = v5;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            alignment$Horizontal1 = alignment$Horizontal0;
            v4 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier1, arrangement$Vertical1, alignment$Horizontal1, v4, p0, v1, v2) {
                final Modifier e;
                final Vertical f;
                final Horizontal g;
                final int h;
                final p i;
                final int j;
                final int k;

                {
                    this.e = modifier0;
                    this.f = arrangement$Vertical0;
                    this.g = alignment$Horizontal0;
                    this.h = v;
                    this.i = p0;
                    this.j = v1;
                    this.k = v2;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    FlowLayoutKt.a(this.e, this.f, this.g, this.h, this.i, composer0, this.j | 1, this.k);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @ExperimentalLayoutApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void b(@m Modifier modifier0, @m androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0, @m androidx.compose.ui.Alignment.Vertical alignment$Vertical0, int v, @l p p0, @m Composer composer0, int v1, int v2) {
        int v4;
        androidx.compose.ui.Alignment.Vertical alignment$Vertical1;
        Modifier modifier1;
        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal1;
        int v3;
        L.p(p0, "content");
        Composer composer1 = composer0.G(1098475987);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            arrangement$Horizontal1 = arrangement$Horizontal0;
        }
        else if((v1 & 0x70) == 0) {
            arrangement$Horizontal1 = arrangement$Horizontal0;
            v3 |= (composer1.t(arrangement$Horizontal1) ? 0x20 : 16);
        }
        else {
            arrangement$Horizontal1 = arrangement$Horizontal0;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.t(alignment$Vertical0) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.z(v) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((0xE000 & v1) == 0) {
            v3 |= (composer1.t(p0) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v3) != 9362 || !composer1.c()) {
            modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.m0;
            androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal2 = (v2 & 2) == 0 ? arrangement$Horizontal1 : Arrangement.a.p();
            androidx.compose.ui.Alignment.Vertical alignment$Vertical2 = (v2 & 4) == 0 ? alignment$Vertical0 : Alignment.a.w();
            int v5 = (v2 & 8) == 0 ? v : 0x7FFFFFFF;
            if(ComposerKt.g0()) {
                ComposerKt.w0(1098475987, v3, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:53)");
            }
            MeasurePolicy measurePolicy0 = FlowLayoutKt.t(arrangement$Horizontal2, alignment$Vertical2, v5, composer1, v3 >> 3 & 0x3FE, 0);
            composer1.V(-1323940314);
            Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
            Companion composeUiNode$Companion0 = ComposeUiNode.p0;
            a a0 = composeUiNode$Companion0.a();
            p p1 = LayoutKt.f(modifier1);
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
            p1.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
            composer1.V(2058660585);
            p0.invoke(RowScopeInstance.a, composer1, ((int)(v3 >> 9 & 0x70 | 6)));
            composer1.g0();
            composer1.g();
            composer1.g0();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            arrangement$Horizontal1 = arrangement$Horizontal2;
            alignment$Vertical1 = alignment$Vertical2;
            v4 = v5;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            alignment$Vertical1 = alignment$Vertical0;
            v4 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier1, arrangement$Horizontal1, alignment$Vertical1, v4, p0, v1, v2) {
                final Modifier e;
                final androidx.compose.foundation.layout.Arrangement.Horizontal f;
                final androidx.compose.ui.Alignment.Vertical g;
                final int h;
                final p i;
                final int j;
                final int k;

                {
                    this.e = modifier0;
                    this.f = arrangement$Horizontal0;
                    this.g = alignment$Vertical0;
                    this.h = v;
                    this.i = p0;
                    this.j = v1;
                    this.k = v2;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    FlowLayoutKt.b(this.e, this.f, this.g, this.h, this.i, composer0, this.j | 1, this.k);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @l
    public static final FlowResult f(@l MeasureScope measureScope0, @l RowColumnMeasurementHelper rowColumnMeasurementHelper0, @l LayoutOrientation layoutOrientation0, @l OrientationIndependentConstraints orientationIndependentConstraints0, int v) {
        L.p(measureScope0, "<this>");
        L.p(rowColumnMeasurementHelper0, "measureHelper");
        L.p(layoutOrientation0, "orientation");
        L.p(orientationIndependentConstraints0, "constraints");
        MutableVector mutableVector0 = new MutableVector(new RowColumnMeasureHelperResult[16], 0);
        int v1 = orientationIndependentConstraints0.i();
        int v2 = orientationIndependentConstraints0.j();
        List list0 = rowColumnMeasurementHelper0.g();
        Placeable[] arr_placeable = rowColumnMeasurementHelper0.i();
        int v3 = (int)(((float)Math.ceil(measureScope0.y1(rowColumnMeasurementHelper0.c()))));
        OrientationIndependentConstraints orientationIndependentConstraints1 = new OrientationIndependentConstraints(v2, v1, 0, orientationIndependentConstraints0.g());
        Measurable measurable0 = (Measurable)u.W2(list0, 0);
        Integer integer0 = measurable0 == null ? null : FlowLayoutKt.r(measurable0, orientationIndependentConstraints1, layoutOrientation0, new Function1(arr_placeable) {
            final Placeable[] e;

            {
                this.e = arr_placeable;
                super(1);
            }

            public final void a(@m Placeable placeable0) {
                this.e[0] = placeable0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Placeable)object0));
                return S0.a;
            }
        });
        Integer[] arr_integer = new Integer[list0.size()];
        int v4 = list0.size();
        int v5 = v1;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        while(v6 < v4) {
            L.m(integer0);
            int v10 = (int)integer0;
            int v11 = v7 + v10;
            v5 -= v10;
            Measurable measurable1 = (Measurable)u.W2(list0, v6 + 1);
            Integer integer1 = measurable1 == null ? null : ((int)(FlowLayoutKt.r(measurable1, orientationIndependentConstraints1, layoutOrientation0, new Function1(arr_placeable, v6) {
                final Placeable[] e;
                final int f;

                {
                    this.e = arr_placeable;
                    this.f = v;
                    super(1);
                }

                public final void a(@m Placeable placeable0) {
                    this.e[this.f + 1] = placeable0;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((Placeable)object0));
                    return S0.a;
                }
            }) + v3));
            if(v6 + 1 >= list0.size() || v6 + 1 - v8 >= v || v5 - (integer1 == null ? 0 : ((int)integer1)) < 0) {
                arr_integer[v9] = (int)(v6 + 1);
                ++v9;
                integer1 = integer1 == null ? null : ((int)(((int)integer1) - v3));
                v2 = Math.max(v2, v11);
                v8 = v6 + 1;
                v5 = v1;
                v7 = 0;
            }
            else {
                v7 = v11;
            }
            ++v6;
            integer0 = integer1;
        }
        long v12 = OrientationIndependentConstraints.f(orientationIndependentConstraints1, v2, 0, 0, 0, 14, null).n(layoutOrientation0);
        Integer integer2 = (Integer)kotlin.collections.l.Pe(arr_integer, 0);
        int v13 = v2;
        int v14 = 0;
        int v15 = 0;
        int v16 = 0;
        while(integer2 != null) {
            RowColumnMeasureHelperResult rowColumnMeasureHelperResult0 = rowColumnMeasurementHelper0.l(measureScope0, v12, v14, ((int)integer2));
            v15 += rowColumnMeasureHelperResult0.b();
            v13 = Math.max(v13, rowColumnMeasureHelperResult0.e());
            mutableVector0.b(rowColumnMeasureHelperResult0);
            v14 = (int)integer2;
            ++v16;
            integer2 = (Integer)kotlin.collections.l.Pe(arr_integer, v16);
        }
        return new FlowResult(Math.max(v13, orientationIndependentConstraints0.j()), Math.max(v15, orientationIndependentConstraints0.h()), mutableVector0);
    }

    @Composable
    private static final MeasurePolicy g(Vertical arrangement$Vertical0, Horizontal alignment$Horizontal0, int v, Composer composer0, int v1, int v2) {
        composer0.V(-2013098357);
        if((v2 & 1) != 0) {
            arrangement$Vertical0 = Arrangement.a.r();
        }
        if((v2 & 2) != 0) {
            alignment$Horizontal0 = Alignment.a.u();
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(-2013098357, v1, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:181)");
        }
        r r0 = FlowLayoutKt.m(arrangement$Vertical0, composer0, v1 & 14);
        composer0.V(0x44FAF204);
        boolean z = composer0.t(alignment$Horizontal0);
        CrossAxisAlignment crossAxisAlignment0 = composer0.W();
        if(z || crossAxisAlignment0 == Composer.a.a()) {
            crossAxisAlignment0 = CrossAxisAlignment.a.i(alignment$Horizontal0);
            composer0.O(crossAxisAlignment0);
        }
        composer0.g0();
        composer0.V(0x607FB4C4);
        boolean z1 = composer0.t(arrangement$Vertical0);
        boolean z2 = composer0.t(alignment$Horizontal0);
        boolean z3 = composer0.t(v);
        MeasurePolicy measurePolicy0 = composer0.W();
        if((z2 | z1 | z3) != 0 || measurePolicy0 == Composer.a.a()) {
            float f = arrangement$Vertical0.a();
            measurePolicy0 = FlowLayoutKt.j(LayoutOrientation.b, r0, f, SizeMode.a, crossAxisAlignment0, FlowLayoutKt.b, v);
            composer0.O(measurePolicy0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return measurePolicy0;
    }

    public static final int h(@l Measurable measurable0, @l LayoutOrientation layoutOrientation0, int v) {
        L.p(measurable0, "<this>");
        L.p(layoutOrientation0, "orientation");
        return layoutOrientation0 == LayoutOrientation.a ? measurable0.D0(v) : measurable0.S0(v);
    }

    public static final int i(@l Placeable placeable0, @l LayoutOrientation layoutOrientation0) {
        L.p(placeable0, "<this>");
        L.p(layoutOrientation0, "orientation");
        return layoutOrientation0 == LayoutOrientation.a ? placeable0.K1() : placeable0.N1();
    }

    private static final MeasurePolicy j(LayoutOrientation layoutOrientation0, r r0, float f, SizeMode sizeMode0, CrossAxisAlignment crossAxisAlignment0, q q0, int v) {
        return new MeasurePolicy() {
            @l
            private final p a;
            @l
            private final p b;
            @l
            private final p c;
            @l
            private final p d;

            {
                LayoutOrientation layoutOrientation0 = layoutOrientation0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                r r0 = r0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                float f = f;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                SizeMode sizeMode0 = sizeMode0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                CrossAxisAlignment crossAxisAlignment0 = crossAxisAlignment0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                int v = v;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                q q0 = q0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                LayoutOrientation layoutOrientation1 = LayoutOrientation.a;
                androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxMainAxisIntrinsicItemSize.1 flowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$10 = layoutOrientation0 == layoutOrientation1 ? androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxMainAxisIntrinsicItemSize.1.e : androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxMainAxisIntrinsicItemSize.2.e;
                this.a = flowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$10;
                androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxCrossAxisIntrinsicItemSize.1 flowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$10 = layoutOrientation0 == layoutOrientation1 ? androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxCrossAxisIntrinsicItemSize.1.e : androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxCrossAxisIntrinsicItemSize.2.e;
                this.b = flowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$10;
                androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minCrossAxisIntrinsicItemSize.1 flowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$10 = layoutOrientation0 == layoutOrientation1 ? androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minCrossAxisIntrinsicItemSize.1.e : androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minCrossAxisIntrinsicItemSize.2.e;
                this.c = flowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$10;
                androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minMainAxisIntrinsicItemSize.1 flowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$10 = layoutOrientation0 == layoutOrientation1 ? androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minMainAxisIntrinsicItemSize.1.e : androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minMainAxisIntrinsicItemSize.2.e;
                this.d = flowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$10;

                final class androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxCrossAxisIntrinsicItemSize.1 extends N implements p {
                    public static final androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxCrossAxisIntrinsicItemSize.1 e;

                    static {
                        androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxCrossAxisIntrinsicItemSize.1.e = new androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxCrossAxisIntrinsicItemSize.1();
                    }

                    androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxCrossAxisIntrinsicItemSize.1() {
                        super(3);
                    }

                    @l
                    public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0, int v, int v1) {
                        L.p(intrinsicMeasurable0, "$this$null");
                        return intrinsicMeasurable0.g(v1);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.a(((IntrinsicMeasurable)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
                    }
                }


                final class androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxCrossAxisIntrinsicItemSize.2 extends N implements p {
                    public static final androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxCrossAxisIntrinsicItemSize.2 e;

                    static {
                        androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxCrossAxisIntrinsicItemSize.2.e = new androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxCrossAxisIntrinsicItemSize.2();
                    }

                    androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxCrossAxisIntrinsicItemSize.2() {
                        super(3);
                    }

                    @l
                    public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0, int v, int v1) {
                        L.p(intrinsicMeasurable0, "$this$null");
                        return intrinsicMeasurable0.h1(v1);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.a(((IntrinsicMeasurable)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
                    }
                }


                final class androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxMainAxisIntrinsicItemSize.1 extends N implements p {
                    public static final androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxMainAxisIntrinsicItemSize.1 e;

                    static {
                        androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxMainAxisIntrinsicItemSize.1.e = new androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxMainAxisIntrinsicItemSize.1();
                    }

                    androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxMainAxisIntrinsicItemSize.1() {
                        super(3);
                    }

                    @l
                    public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0, int v, int v1) {
                        L.p(intrinsicMeasurable0, "$this$null");
                        return intrinsicMeasurable0.h1(v1);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.a(((IntrinsicMeasurable)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
                    }
                }


                final class androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxMainAxisIntrinsicItemSize.2 extends N implements p {
                    public static final androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxMainAxisIntrinsicItemSize.2 e;

                    static {
                        androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxMainAxisIntrinsicItemSize.2.e = new androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxMainAxisIntrinsicItemSize.2();
                    }

                    androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.maxMainAxisIntrinsicItemSize.2() {
                        super(3);
                    }

                    @l
                    public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0, int v, int v1) {
                        L.p(intrinsicMeasurable0, "$this$null");
                        return intrinsicMeasurable0.g(v1);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.a(((IntrinsicMeasurable)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
                    }
                }


                final class androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minCrossAxisIntrinsicItemSize.1 extends N implements p {
                    public static final androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minCrossAxisIntrinsicItemSize.1 e;

                    static {
                        androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minCrossAxisIntrinsicItemSize.1.e = new androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minCrossAxisIntrinsicItemSize.1();
                    }

                    androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minCrossAxisIntrinsicItemSize.1() {
                        super(3);
                    }

                    @l
                    public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0, int v, int v1) {
                        L.p(intrinsicMeasurable0, "$this$null");
                        return intrinsicMeasurable0.D0(v1);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.a(((IntrinsicMeasurable)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
                    }
                }


                final class androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minCrossAxisIntrinsicItemSize.2 extends N implements p {
                    public static final androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minCrossAxisIntrinsicItemSize.2 e;

                    static {
                        androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minCrossAxisIntrinsicItemSize.2.e = new androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minCrossAxisIntrinsicItemSize.2();
                    }

                    androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minCrossAxisIntrinsicItemSize.2() {
                        super(3);
                    }

                    @l
                    public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0, int v, int v1) {
                        L.p(intrinsicMeasurable0, "$this$null");
                        return intrinsicMeasurable0.S0(v1);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.a(((IntrinsicMeasurable)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
                    }
                }


                final class androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minMainAxisIntrinsicItemSize.1 extends N implements p {
                    public static final androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minMainAxisIntrinsicItemSize.1 e;

                    static {
                        androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minMainAxisIntrinsicItemSize.1.e = new androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minMainAxisIntrinsicItemSize.1();
                    }

                    androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minMainAxisIntrinsicItemSize.1() {
                        super(3);
                    }

                    @l
                    public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0, int v, int v1) {
                        L.p(intrinsicMeasurable0, "$this$null");
                        return intrinsicMeasurable0.S0(v1);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.a(((IntrinsicMeasurable)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
                    }
                }


                final class androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minMainAxisIntrinsicItemSize.2 extends N implements p {
                    public static final androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minMainAxisIntrinsicItemSize.2 e;

                    static {
                        androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minMainAxisIntrinsicItemSize.2.e = new androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minMainAxisIntrinsicItemSize.2();
                    }

                    androidx.compose.foundation.layout.FlowLayoutKt.flowMeasurePolicy.1.minMainAxisIntrinsicItemSize.2() {
                        super(3);
                    }

                    @l
                    public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0, int v, int v1) {
                        L.p(intrinsicMeasurable0, "$this$null");
                        return intrinsicMeasurable0.D0(v1);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.a(((IntrinsicMeasurable)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
                    }
                }

            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @l
            public MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                L.p(measureScope0, "$this$measure");
                L.p(list0, "measurables");
                RowColumnMeasurementHelper rowColumnMeasurementHelper0 = new RowColumnMeasurementHelper(layoutOrientation0, r0, f, sizeMode0, crossAxisAlignment0, list0, new Placeable[list0.size()], null);
                OrientationIndependentConstraints orientationIndependentConstraints0 = new OrientationIndependentConstraints(v, layoutOrientation0, null);
                FlowResult flowResult0 = FlowLayoutKt.f(measureScope0, rowColumnMeasurementHelper0, layoutOrientation0, orientationIndependentConstraints0, v);
                int v1 = flowResult0.a();
                MutableVector mutableVector0 = flowResult0.b();
                int v2 = mutableVector0.J();
                int[] arr_v = new int[v2];
                for(int v3 = 0; v3 < v2; ++v3) {
                    arr_v[v3] = ((RowColumnMeasureHelperResult)mutableVector0.F()[v3]).b();
                }
                int[] arr_v1 = new int[v2];
                q0.T0(v1, arr_v, measureScope0, arr_v1);
                return layoutOrientation0 == LayoutOrientation.a ? MeasureScope.-CC.p(measureScope0, ConstraintsKt.g(v, flowResult0.c()), ConstraintsKt.f(v, flowResult0.a()), null, new Function1(rowColumnMeasurementHelper0, arr_v1, measureScope0) {
                    final FlowResult e;
                    final RowColumnMeasurementHelper f;
                    final int[] g;
                    final MeasureScope h;

                    {
                        this.e = flowResult0;
                        this.f = rowColumnMeasurementHelper0;
                        this.g = arr_v;
                        this.h = measureScope0;
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                        MutableVector mutableVector0 = this.e.b();
                        RowColumnMeasurementHelper rowColumnMeasurementHelper0 = this.f;
                        int[] arr_v = this.g;
                        MeasureScope measureScope0 = this.h;
                        int v = mutableVector0.J();
                        if(v > 0) {
                            Object[] arr_object = mutableVector0.F();
                            int v1 = 0;
                            while(true) {
                                rowColumnMeasurementHelper0.m(placeable$PlacementScope0, ((RowColumnMeasureHelperResult)arr_object[v1]), arr_v[v1], measureScope0.getLayoutDirection());
                                ++v1;
                                if(v1 >= v) {
                                    break;
                                }
                            }
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                }, 4, null) : MeasureScope.-CC.p(measureScope0, ConstraintsKt.g(v, flowResult0.a()), ConstraintsKt.f(v, flowResult0.c()), null, new Function1(rowColumnMeasurementHelper0, arr_v1, measureScope0) {
                    final FlowResult e;
                    final RowColumnMeasurementHelper f;
                    final int[] g;
                    final MeasureScope h;

                    {
                        this.e = flowResult0;
                        this.f = rowColumnMeasurementHelper0;
                        this.g = arr_v;
                        this.h = measureScope0;
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                        MutableVector mutableVector0 = this.e.b();
                        RowColumnMeasurementHelper rowColumnMeasurementHelper0 = this.f;
                        int[] arr_v = this.g;
                        MeasureScope measureScope0 = this.h;
                        int v = mutableVector0.J();
                        if(v > 0) {
                            Object[] arr_object = mutableVector0.F();
                            int v1 = 0;
                            while(true) {
                                rowColumnMeasurementHelper0.m(placeable$PlacementScope0, ((RowColumnMeasureHelperResult)arr_object[v1]), arr_v[v1], measureScope0.getLayoutDirection());
                                ++v1;
                                if(v1 >= v) {
                                    break;
                                }
                            }
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                }, 4, null);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int b(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                return layoutOrientation0 == LayoutOrientation.a ? this.j(list0, v, intrinsicMeasureScope0.b1(f)) : this.l(list0, v, intrinsicMeasureScope0.b1(f));
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int c(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                return layoutOrientation0 == LayoutOrientation.a ? this.l(list0, v, intrinsicMeasureScope0.b1(f)) : this.j(list0, v, intrinsicMeasureScope0.b1(f));
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int d(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                return layoutOrientation0 == LayoutOrientation.a ? this.j(list0, v, intrinsicMeasureScope0.b1(f)) : this.k(list0, v, intrinsicMeasureScope0.b1(f));
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int e(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                return layoutOrientation0 == LayoutOrientation.a ? this.k(list0, v, intrinsicMeasureScope0.b1(f)) : this.j(list0, v, intrinsicMeasureScope0.b1(f));
            }

            @l
            public final p f() {
                return this.b;
            }

            @l
            public final p g() {
                return this.a;
            }

            @l
            public final p h() {
                return this.c;
            }

            @l
            public final p i() {
                return this.d;
            }

            public final int j(@l List list0, int v, int v1) {
                L.p(list0, "measurables");
                return FlowLayoutKt.k(list0, this.d, this.c, v, v1, v);
            }

            public final int k(@l List list0, int v, int v1) {
                L.p(list0, "measurables");
                return FlowLayoutKt.q(list0, this.a, v, v1, v);
            }

            public final int l(@l List list0, int v, int v1) {
                L.p(list0, "measurables");
                return FlowLayoutKt.s(list0, this.d, this.c, v, v1, v);
            }
        };
    }

    private static final int k(List list0, p p0, p p1, int v, int v1, int v2) {
        if(list0.isEmpty()) {
            return 0;
        }
        Object object0 = u.W2(list0, 0);
        int v3 = ((IntrinsicMeasurable)object0) == null ? 0 : ((Number)p1.invoke(((IntrinsicMeasurable)object0), 0, v)).intValue();
        int v4 = ((IntrinsicMeasurable)object0) == null ? 0 : ((Number)p0.invoke(((IntrinsicMeasurable)object0), 0, v3)).intValue();
        int v5 = list0.size();
        int v6 = v;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        int v10 = 0;
        while(v7 < v5) {
            IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v7);
            L.m(object0);
            v6 -= v4;
            int v11 = Math.max(v9, v3);
            ++v7;
            Object object1 = u.W2(list0, v7);
            IntrinsicMeasurable intrinsicMeasurable1 = (IntrinsicMeasurable)object1;
            int v12 = intrinsicMeasurable1 == null ? 0 : ((Number)p1.invoke(intrinsicMeasurable1, v7, v)).intValue();
            int v13 = intrinsicMeasurable1 == null ? 0 : ((Number)p0.invoke(intrinsicMeasurable1, v7, v12)).intValue() + v1;
            if(v6 < 0 || v7 == list0.size() || v7 - v10 == v2 || v6 - v13 < 0) {
                v8 += v11;
                v13 -= v1;
                v6 = v;
                v10 = v7;
                v11 = 0;
            }
            v9 = v11;
            object0 = object1;
            v4 = v13;
            v3 = v12;
        }
        return v8;
    }

    private static final int l(List list0, int[] arr_v, int[] arr_v1, int v, int v1, int v2) {
        return FlowLayoutKt.k(list0, new p(arr_v) {
            final int[] e;

            {
                this.e = arr_v;
                super(3);
            }

            @l
            public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0, int v, int v1) {
                L.p(intrinsicMeasurable0, "$this$intrinsicCrossAxisSize");
                return (int)this.e[v];
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((IntrinsicMeasurable)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
            }
        }, new p(arr_v1) {
            final int[] e;

            {
                this.e = arr_v;
                super(3);
            }

            @l
            public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0, int v, int v1) {
                L.p(intrinsicMeasurable0, "$this$intrinsicCrossAxisSize");
                return (int)this.e[v];
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((IntrinsicMeasurable)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
            }
        }, v, v1, v2);
    }

    @Composable
    private static final r m(Vertical arrangement$Vertical0, Composer composer0, int v) {
        composer0.V(0x9E173D6F);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x9E173D6F, v, -1, "androidx.compose.foundation.layout.mainAxisColumnArrangement (FlowLayout.kt:134)");
        }
        composer0.V(0x44FAF204);
        boolean z = composer0.t(arrangement$Vertical0);
        androidx.compose.foundation.layout.FlowLayoutKt.mainAxisColumnArrangement.1.1 flowLayoutKt$mainAxisColumnArrangement$1$10 = composer0.W();
        if(z || flowLayoutKt$mainAxisColumnArrangement$1$10 == Composer.a.a()) {
            flowLayoutKt$mainAxisColumnArrangement$1$10 = new r(arrangement$Vertical0) {
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
            composer0.O(flowLayoutKt$mainAxisColumnArrangement$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return flowLayoutKt$mainAxisColumnArrangement$1$10;
    }

    public static final int n(@l Measurable measurable0, @l LayoutOrientation layoutOrientation0, int v) {
        L.p(measurable0, "<this>");
        L.p(layoutOrientation0, "orientation");
        return layoutOrientation0 == LayoutOrientation.a ? measurable0.S0(v) : measurable0.D0(v);
    }

    @Composable
    private static final r o(androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0, Composer composer0, int v) {
        composer0.V(746410833);
        if(ComposerKt.g0()) {
            ComposerKt.w0(746410833, v, -1, "androidx.compose.foundation.layout.mainAxisRowArrangement (FlowLayout.kt:123)");
        }
        composer0.V(0x44FAF204);
        boolean z = composer0.t(arrangement$Horizontal0);
        androidx.compose.foundation.layout.FlowLayoutKt.mainAxisRowArrangement.1.1 flowLayoutKt$mainAxisRowArrangement$1$10 = composer0.W();
        if(z || flowLayoutKt$mainAxisRowArrangement$1$10 == Composer.a.a()) {
            flowLayoutKt$mainAxisRowArrangement$1$10 = new r(arrangement$Horizontal0) {
                final androidx.compose.foundation.layout.Arrangement.Horizontal e;

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
            composer0.O(flowLayoutKt$mainAxisRowArrangement$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return flowLayoutKt$mainAxisRowArrangement$1$10;
    }

    public static final int p(@l Placeable placeable0, @l LayoutOrientation layoutOrientation0) {
        L.p(placeable0, "<this>");
        L.p(layoutOrientation0, "orientation");
        return layoutOrientation0 == LayoutOrientation.a ? placeable0.N1() : placeable0.K1();
    }

    private static final int q(List list0, p p0, int v, int v1, int v2) {
        int v3 = list0.size();
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        for(int v4 = 0; v4 < v3; ++v4) {
            int v8 = ((Number)p0.invoke(((IntrinsicMeasurable)list0.get(v4)), v4, v)).intValue() + v1;
            if(v4 + 1 - v6 == v2 || v4 + 1 == list0.size()) {
                v5 = Math.max(v5, v7 + v8);
                v6 = v4;
                v7 = 0;
            }
            else {
                v7 += v8;
            }
        }
        return v5;
    }

    private static final int r(Measurable measurable0, OrientationIndependentConstraints orientationIndependentConstraints0, LayoutOrientation layoutOrientation0, Function1 function10) {
        if(RowColumnImplKt.m(RowColumnImplKt.l(measurable0)) == 0.0f) {
            Placeable placeable0 = measurable0.r1(OrientationIndependentConstraints.f(orientationIndependentConstraints0, 0, 0, 0, 0, 14, null).n(layoutOrientation0));
            function10.invoke(placeable0);
            return FlowLayoutKt.p(placeable0, layoutOrientation0);
        }
        return FlowLayoutKt.n(measurable0, layoutOrientation0, 0x7FFFFFFF);
    }

    private static final int s(List list0, p p0, p p1, int v, int v1, int v2) {
        int v3 = list0.size();
        int[] arr_v = new int[v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            arr_v[v4] = 0;
        }
        int v5 = list0.size();
        int[] arr_v1 = new int[v5];
        for(int v6 = 0; v6 < v5; ++v6) {
            arr_v1[v6] = 0;
        }
        int v7 = list0.size();
        for(int v8 = 0; v8 < v7; ++v8) {
            IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v8);
            int v9 = ((Number)p0.invoke(intrinsicMeasurable0, v8, v)).intValue();
            arr_v[v8] = v9;
            arr_v1[v8] = ((Number)p1.invoke(intrinsicMeasurable0, v8, v9)).intValue();
        }
        int v10 = kotlin.collections.l.bw(arr_v);
        if(v5 == 0) {
            throw new NoSuchElementException();
        }
        int v11 = arr_v1[0];
        T t0 = new kotlin.ranges.l(1, kotlin.collections.l.ue(arr_v1)).j();
        while(t0.hasNext()) {
            int v12 = arr_v1[t0.b()];
            if(v11 < v12) {
                v11 = v12;
            }
        }
        if(v3 != 0) {
            int v13 = arr_v[0];
            T t1 = new kotlin.ranges.l(1, kotlin.collections.l.ue(arr_v)).j();
            while(t1.hasNext()) {
                int v14 = arr_v[t1.b()];
                if(v13 < v14) {
                    v13 = v14;
                }
            }
            int v15 = v13;
            int v16 = v11;
            int v17 = v10;
            while(true) {
                if(v15 >= v10 || v16 == v) {
                    return v17;
                }
                v17 = (v15 + v10) / 2;
                v16 = FlowLayoutKt.l(list0, arr_v, arr_v1, v17, v1, v2);
                if(v16 == v) {
                    return v17;
                }
                if(v16 > v) {
                    v15 = v17 + 1;
                }
                else {
                    v10 = v17 - 1;
                }
            }
        }
        throw new NoSuchElementException();
    }

    @Composable
    private static final MeasurePolicy t(androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0, androidx.compose.ui.Alignment.Vertical alignment$Vertical0, int v, Composer composer0, int v1, int v2) {
        composer0.V(0x582BA447);
        if((v2 & 1) != 0) {
            arrangement$Horizontal0 = Arrangement.a.h();
        }
        if((v2 & 2) != 0) {
            alignment$Vertical0 = Alignment.a.w();
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x582BA447, v1, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:158)");
        }
        r r0 = FlowLayoutKt.o(arrangement$Horizontal0, composer0, v1 & 14);
        composer0.V(0x44FAF204);
        boolean z = composer0.t(alignment$Vertical0);
        CrossAxisAlignment crossAxisAlignment0 = composer0.W();
        if(z || crossAxisAlignment0 == Composer.a.a()) {
            crossAxisAlignment0 = CrossAxisAlignment.a.j(alignment$Vertical0);
            composer0.O(crossAxisAlignment0);
        }
        composer0.g0();
        composer0.V(0x607FB4C4);
        boolean z1 = composer0.t(arrangement$Horizontal0);
        boolean z2 = composer0.t(alignment$Vertical0);
        boolean z3 = composer0.t(v);
        MeasurePolicy measurePolicy0 = composer0.W();
        if((z2 | z1 | z3) != 0 || measurePolicy0 == Composer.a.a()) {
            float f = arrangement$Horizontal0.a();
            measurePolicy0 = FlowLayoutKt.j(LayoutOrientation.a, r0, f, SizeMode.a, crossAxisAlignment0, FlowLayoutKt.a, v);
            composer0.O(measurePolicy0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return measurePolicy0;
    }
}

