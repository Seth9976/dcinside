package androidx.compose.foundation.text.selection;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSimpleLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,53:1\n74#2:54\n75#2,11:56\n88#2:81\n76#3:55\n456#4,14:67\n*S KotlinDebug\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt\n*L\n33#1:54\n33#1:56,11\n33#1:81\n33#1:55\n33#1:67,14\n*E\n"})
public final class SimpleLayoutKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@m Modifier modifier0, @l o o0, @m Composer composer0, int v, int v1) {
        int v2;
        L.p(o0, "content");
        Composer composer1 = composer0.G(0x8284C1D0);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.Y(o0) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.c()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.m0;
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x8284C1D0, v2, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout.1 simpleLayoutKt$SimpleLayout$10 = androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout.1.a;
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
            Composer composer2 = Updater.b(composer1);
            Updater.j(composer2, simpleLayoutKt$SimpleLayout$10, composeUiNode$Companion0.d());
            Updater.j(composer2, density0, composeUiNode$Companion0.b());
            Updater.j(composer2, layoutDirection0, composeUiNode$Companion0.c());
            Updater.j(composer2, viewConfiguration0, composeUiNode$Companion0.f());
            p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
            composer1.V(2058660585);
            o0.invoke(composer1, ((int)(((v2 >> 3 & 14 | v2 << 3 & 0x70) << 9 & 0x1C00 | 6) >> 9 & 14)));
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
            scopeUpdateScope0.a(new o(modifier0, o0, v, v1) {
                final Modifier e;
                final o f;
                final int g;
                final int h;

                {
                    this.e = modifier0;
                    this.f = o0;
                    this.g = v;
                    this.h = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    SimpleLayoutKt.a(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        @s0({"SMAP\nSimpleLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt$SimpleLayout$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,53:1\n151#2,3:54\n33#2,4:57\n154#2,2:61\n38#2:63\n156#2:64\n33#2,4:68\n38#2:74\n33#2,4:79\n38#2:85\n59#3,3:65\n62#3,2:72\n64#3:75\n59#3,3:76\n62#3,2:83\n64#3:86\n*S KotlinDebug\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt$SimpleLayout$1\n*L\n34#1:54,3\n34#1:57,4\n34#1:61,2\n34#1:63\n34#1:64\n38#1:68,4\n38#1:74\n42#1:79,4\n42#1:85\n38#1:65,3\n38#1:72,2\n38#1:75\n42#1:76,3\n42#1:83,2\n42#1:86\n*E\n"})
        final class androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout.1 implements MeasurePolicy {
            public static final androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout.1 a;

            static {
                androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout.1.a = new androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout.1();
            }

            androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout.1() {
                super();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @l
            public final MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                L.p(measureScope0, "$this$Layout");
                L.p(list0, "measurables");
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v1 = list0.size();
                Integer integer0 = 0;
                for(int v3 = 0; v3 < v1; ++v3) {
                    arrayList0.add(((Measurable)list0.get(v3)).r1(v));
                }
                int v4 = arrayList0.size();
                Integer integer1 = 0;
                for(int v5 = 0; v5 < v4; ++v5) {
                    integer1 = Math.max(integer1.intValue(), ((Placeable)arrayList0.get(v5)).N1());
                }
                int v6 = integer1.intValue();
                int v7 = arrayList0.size();
                for(int v2 = 0; v2 < v7; ++v2) {
                    integer0 = Math.max(integer0.intValue(), ((Placeable)arrayList0.get(v2)).K1());
                }
                return MeasureScope.-CC.p(measureScope0, v6, integer0.intValue(), null, new Function1() {
                    final List e;

                    {
                        this.e = list0;
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                        List list0 = this.e;
                        int v = list0.size();
                        for(int v1 = 0; v1 < v; ++v1) {
                            PlacementScope.p(placeable$PlacementScope0, ((Placeable)list0.get(v1)), 0, 0, 0.0f, 4, null);
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

