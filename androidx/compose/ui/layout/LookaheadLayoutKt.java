package androidx.compose.ui.layout;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLookaheadLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,200:1\n76#2:201\n76#2:202\n76#2:203\n25#3:204\n365#3,11:211\n1114#4,6:205\n*S KotlinDebug\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutKt\n*L\n74#1:201\n75#1:202\n76#1:203\n78#1:204\n79#1:211,11\n78#1:205,6\n*E\n"})
public final class LookaheadLayoutKt {
    @Composable
    @ExperimentalComposeUiApi
    @UiComposable
    public static final void a(@l p p0, @m Modifier modifier0, @l MeasurePolicy measurePolicy0, @m Composer composer0, int v, int v1) {
        int v2;
        L.p(p0, "content");
        L.p(measurePolicy0, "measurePolicy");
        Composer composer1 = composer0.G(1697006219);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.Y(p0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.t(measurePolicy0) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.c()) {
            if((v1 & 2) != 0) {
                modifier0 = Modifier.m0;
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(1697006219, v2, -1, "androidx.compose.ui.layout.LookaheadLayout (LookaheadLayout.kt:67)");
            }
            Modifier modifier1 = ComposedModifierKt.k(composer1, modifier0);
            Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
            composer1.V(0xE2A708A4);
            LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl0 = composer1.W();
            if(lookaheadLayoutScopeImpl0 == Composer.a.a()) {
                lookaheadLayoutScopeImpl0 = new LookaheadLayoutScopeImpl();
                composer1.O(lookaheadLayoutScopeImpl0);
            }
            composer1.g0();
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
            Updater.j(composer2, lookaheadLayoutScopeImpl0, androidx.compose.ui.layout.LookaheadLayoutKt.LookaheadLayout.1.1.e);
            Updater.g(composer2, androidx.compose.ui.layout.LookaheadLayoutKt.LookaheadLayout.1.2.e);
            p0.invoke(lookaheadLayoutScopeImpl0, composer1, ((int)(v2 << 3 & 0x70 | 8)));
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
            scopeUpdateScope0.a(new o(p0, modifier0, measurePolicy0, v, v1) {
                final p e;
                final Modifier f;
                final MeasurePolicy g;
                final int h;
                final int i;

                {
                    this.e = p0;
                    this.f = modifier0;
                    this.g = measurePolicy0;
                    this.h = v;
                    this.i = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LookaheadLayoutKt.a(this.e, this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.ui.layout.LookaheadLayoutKt.LookaheadLayout.1.1 extends N implements o {
            public static final androidx.compose.ui.layout.LookaheadLayoutKt.LookaheadLayout.1.1 e;

            static {
                androidx.compose.ui.layout.LookaheadLayoutKt.LookaheadLayout.1.1.e = new androidx.compose.ui.layout.LookaheadLayoutKt.LookaheadLayout.1.1();
            }

            androidx.compose.ui.layout.LookaheadLayoutKt.LookaheadLayout.1.1() {
                super(2);
            }

            public final void a(@l LayoutNode layoutNode0, @l LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl0) {
                L.p(layoutNode0, "$this$set");
                L.p(lookaheadLayoutScopeImpl0, "scope");
                lookaheadLayoutScopeImpl0.d(layoutNode0.e0());
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((LayoutNode)object0), ((LookaheadLayoutScopeImpl)object1));
                return S0.a;
            }
        }


        final class androidx.compose.ui.layout.LookaheadLayoutKt.LookaheadLayout.1.2 extends N implements Function1 {
            public static final androidx.compose.ui.layout.LookaheadLayoutKt.LookaheadLayout.1.2 e;

            static {
                androidx.compose.ui.layout.LookaheadLayoutKt.LookaheadLayout.1.2.e = new androidx.compose.ui.layout.LookaheadLayoutKt.LookaheadLayout.1.2();
            }

            androidx.compose.ui.layout.LookaheadLayoutKt.LookaheadLayout.1.2() {
                super(1);
            }

            public final void a(@l LayoutNode layoutNode0) {
                L.p(layoutNode0, "$this$init");
                layoutNode0.L1(true);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LayoutNode)object0));
                return S0.a;
            }
        }

    }
}

