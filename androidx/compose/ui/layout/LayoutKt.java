package androidx.compose.ui.layout;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.S0;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import y4.l;
import y4.m;

@s0({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,316:1\n74#1:354\n75#1,11:356\n88#1:381\n76#2:317\n76#2:318\n76#2:319\n76#2:334\n76#2:335\n76#2:336\n76#2:355\n76#2:382\n76#2:383\n76#2:384\n456#3,14:320\n286#3,10:337\n36#3:347\n456#3,14:367\n365#3,11:385\n1114#4,6:348\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n167#1:354\n167#1:356,11\n167#1:381\n74#1:317\n75#1:318\n76#1:319\n120#1:334\n121#1:335\n122#1:336\n167#1:355\n210#1:382\n211#1:383\n212#1:384\n77#1:320,14\n124#1:337,10\n170#1:347\n167#1:367,14\n214#1:385,11\n170#1:348,6\n*E\n"})
public final class LayoutKt {
    @Composable
    @UiComposable
    public static final void a(@l o o0, @m Modifier modifier0, @l MeasurePolicy measurePolicy0, @m Composer composer0, int v, int v1) {
        L.p(o0, "content");
        L.p(measurePolicy0, "measurePolicy");
        composer0.V(-1323940314);
        if((v1 & 2) != 0) {
            modifier0 = Modifier.m0;
        }
        Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
        ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.L(CompositionLocalsKt.w());
        Companion composeUiNode$Companion0 = ComposeUiNode.p0;
        a a0 = composeUiNode$Companion0.a();
        p p0 = LayoutKt.f(modifier0);
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
        Composer composer1 = Updater.b(composer0);
        Updater.j(composer1, measurePolicy0, composeUiNode$Companion0.d());
        Updater.j(composer1, density0, composeUiNode$Companion0.b());
        Updater.j(composer1, layoutDirection0, composeUiNode$Companion0.c());
        Updater.j(composer1, viewConfiguration0, composeUiNode$Companion0.f());
        p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer0)), composer0, 0);
        composer0.V(2058660585);
        o0.invoke(composer0, ((int)((v << 9 & 0x1C00 | 6) >> 9 & 14)));
        composer0.g0();
        composer0.g();
        composer0.g0();
    }

    @Composable
    @UiComposable
    public static final void b(@m Modifier modifier0, @l MeasurePolicy measurePolicy0, @m Composer composer0, int v, int v1) {
        L.p(measurePolicy0, "measurePolicy");
        composer0.V(0x207BAF9A);
        if((v1 & 1) != 0) {
            modifier0 = Modifier.m0;
        }
        Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
        ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.L(CompositionLocalsKt.w());
        Modifier modifier1 = ComposedModifierKt.k(composer0, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.p0;
        a a0 = composeUiNode$Companion0.a();
        composer0.V(1405779621);
        if(!(composer0.H() instanceof Applier)) {
            ComposablesKt.n();
        }
        composer0.h();
        if(composer0.E()) {
            composer0.k(new a(a0) {
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
            composer0.f();
        }
        Composer composer1 = Updater.b(composer0);
        Updater.j(composer1, measurePolicy0, composeUiNode$Companion0.d());
        Updater.j(composer1, density0, composeUiNode$Companion0.b());
        Updater.j(composer1, layoutDirection0, composeUiNode$Companion0.c());
        Updater.j(composer1, viewConfiguration0, composeUiNode$Companion0.f());
        Updater.j(composer1, modifier1, composeUiNode$Companion0.e());
        composer0.g();
        composer0.g0();
        composer0.g0();
    }

    @Composable
    @UiComposable
    public static final void c(@l List list0, @m Modifier modifier0, @l MultiContentMeasurePolicy multiContentMeasurePolicy0, @m Composer composer0, int v, int v1) {
        L.p(list0, "contents");
        L.p(multiContentMeasurePolicy0, "measurePolicy");
        composer0.V(0x5365E06C);
        if((v1 & 2) != 0) {
            modifier0 = Modifier.m0;
        }
        o o0 = LayoutKt.e(list0);
        composer0.V(0x44FAF204);
        boolean z = composer0.t(multiContentMeasurePolicy0);
        MeasurePolicy measurePolicy0 = composer0.W();
        if(z || measurePolicy0 == Composer.a.a()) {
            measurePolicy0 = MultiContentMeasurePolicyKt.a(multiContentMeasurePolicy0);
            composer0.O(measurePolicy0);
        }
        composer0.g0();
        composer0.V(-1323940314);
        Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
        ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.L(CompositionLocalsKt.w());
        Companion composeUiNode$Companion0 = ComposeUiNode.p0;
        a a0 = composeUiNode$Companion0.a();
        p p0 = LayoutKt.f(modifier0);
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
        Composer composer1 = Updater.b(composer0);
        Updater.j(composer1, measurePolicy0, composeUiNode$Companion0.d());
        Updater.j(composer1, density0, composeUiNode$Companion0.b());
        Updater.j(composer1, layoutDirection0, composeUiNode$Companion0.c());
        Updater.j(composer1, viewConfiguration0, composeUiNode$Companion0.f());
        p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer0)), composer0, 0);
        composer0.V(2058660585);
        o0.invoke(composer0, 0);
        composer0.g0();
        composer0.g();
        composer0.g0();
        composer0.g0();
    }

    @Composable
    @UiComposable
    @k(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    public static final void d(@m Modifier modifier0, @l o o0, @l MeasurePolicy measurePolicy0, @m Composer composer0, int v, int v1) {
        int v2;
        L.p(o0, "content");
        L.p(measurePolicy0, "measurePolicy");
        Composer composer1 = composer0.G(1949933075);
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
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.t(measurePolicy0) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.c()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.m0;
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(1949933075, v2, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:203)");
            }
            Modifier modifier1 = ComposedModifierKt.k(composer1, modifier0);
            Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
            a a0 = LayoutNode.P.a();
            composer1.V(0xD6BD0031);
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
            Updater.j(composer2, modifier1, ComposeUiNode.p0.e());
            Updater.j(composer2, measurePolicy0, ComposeUiNode.p0.d());
            Updater.j(composer2, density0, ComposeUiNode.p0.b());
            Updater.j(composer2, layoutDirection0, ComposeUiNode.p0.c());
            Updater.j(composer2, viewConfiguration0, ComposeUiNode.p0.f());
            Updater.g(composer2, androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.1.1.e);
            o0.invoke(composer1, ((int)((v2 << 3 & 0x380 | 6) >> 6 & 14)));
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
            scopeUpdateScope0.a(new o(modifier0, o0, measurePolicy0, v, v1) {
                final Modifier e;
                final o f;
                final MeasurePolicy g;
                final int h;
                final int i;

                {
                    this.e = modifier0;
                    this.f = o0;
                    this.g = measurePolicy0;
                    this.h = v;
                    this.i = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LayoutKt.d(this.e, this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.1.1 extends N implements Function1 {
            public static final androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.1.1 e;

            static {
                androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.1.1.e = new androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.1.1();
            }

            androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.1.1() {
                super(1);
            }

            public final void a(@l LayoutNode layoutNode0) {
                L.p(layoutNode0, "$this$init");
                layoutNode0.G1(true);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LayoutNode)object0));
                return S0.a;
            }
        }

    }

    @b0
    @l
    public static final o e(@l List list0) {
        L.p(list0, "contents");
        return ComposableLambdaKt.c(0x8B8DA549, true, new o(list0) {
            final List e;

            {
                this.e = list0;
                super(2);
            }

            @Composable
            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            public final void a(@m Composer composer0, int v) {
                if((v & 11) == 2 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x8B8DA549, v, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:176)");
                }
                List list0 = this.e;
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    o o0 = (o)list0.get(v2);
                    a a0 = ComposeUiNode.p0.g();
                    composer0.V(0xD6BD0031);
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
                    Updater.b(composer0);
                    o0.invoke(composer0, 0);
                    composer0.g();
                    composer0.g0();
                }
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((Composer)object0), ((Number)object1).intValue());
                return S0.a;
            }
        });
    }

    @b0
    @l
    public static final p f(@l Modifier modifier0) {
        L.p(modifier0, "modifier");
        return ComposableLambdaKt.c(0xA173A20C, true, new p(modifier0) {
            final Modifier e;

            {
                this.e = modifier0;
                super(3);
            }

            @Composable
            public final void a(@l Composer composer0, @m Composer composer1, int v) {
                L.p(composer0, "$this$null");
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xA173A20C, v, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:189)");
                }
                Modifier modifier0 = ComposedModifierKt.k(composer1, this.e);
                composer0.V(509942095);
                Updater.j(Updater.b(composer0), modifier0, ComposeUiNode.p0.e());
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((SkippableUpdater)object0).h(), ((Composer)object1), ((Number)object2).intValue());
                return S0.a;
            }
        });
    }
}

