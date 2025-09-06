package androidx.compose.ui.layout;

import A3.a;
import A3.o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
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
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,774:1\n25#2:775\n251#2,10:785\n36#2:795\n1114#3,6:776\n1114#3,6:796\n76#4:782\n76#4:783\n76#4:784\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n*L\n76#1:775\n114#1:785,10\n132#1:795\n76#1:776,6\n132#1:796,6\n111#1:782\n112#1:783\n113#1:784\n*E\n"})
public final class SubcomposeLayoutKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@m Modifier modifier0, @l o o0, @m Composer composer0, int v, int v1) {
        int v2;
        L.p(o0, "measurePolicy");
        Composer composer1 = composer0.G(0xB29CB430);
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
                ComposerKt.w0(0xB29CB430, v2, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:70)");
            }
            composer1.V(0xE2A708A4);
            SubcomposeLayoutState subcomposeLayoutState0 = composer1.W();
            if(subcomposeLayoutState0 == Composer.a.a()) {
                subcomposeLayoutState0 = new SubcomposeLayoutState();
                composer1.O(subcomposeLayoutState0);
            }
            composer1.g0();
            SubcomposeLayoutKt.b(subcomposeLayoutState0, modifier0, o0, composer1, v2 << 3 & 0x70 | 8 | v2 << 3 & 0x380, 0);
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
                    SubcomposeLayoutKt.a(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
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
    @UiComposable
    public static final void b(@l SubcomposeLayoutState subcomposeLayoutState0, @m Modifier modifier0, @l o o0, @m Composer composer0, int v, int v1) {
        L.p(subcomposeLayoutState0, "state");
        L.p(o0, "measurePolicy");
        Composer composer1 = composer0.G(0xE17BA7B9);
        if((v1 & 2) != 0) {
            modifier0 = Modifier.m0;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xE17BA7B9, v, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:103)");
        }
        CompositionContext compositionContext0 = ComposablesKt.u(composer1, 0);
        Modifier modifier1 = ComposedModifierKt.k(composer1, modifier0);
        Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
        ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
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
        Updater.j(composer2, subcomposeLayoutState0, subcomposeLayoutState0.h());
        Updater.j(composer2, compositionContext0, subcomposeLayoutState0.f());
        Updater.j(composer2, o0, subcomposeLayoutState0.g());
        Updater.j(composer2, density0, ComposeUiNode.p0.b());
        Updater.j(composer2, layoutDirection0, ComposeUiNode.p0.c());
        Updater.j(composer2, viewConfiguration0, ComposeUiNode.p0.f());
        Updater.j(composer2, modifier1, ComposeUiNode.p0.e());
        composer1.g();
        composer1.g0();
        composer1.V(0xDBC4F6B6);
        if(!composer1.c()) {
            EffectsKt.k(new a(subcomposeLayoutState0) {
                final SubcomposeLayoutState e;

                {
                    this.e = subcomposeLayoutState0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    this.e.e();
                }
            }, composer1, 0);
        }
        composer1.g0();
        State state0 = SnapshotStateKt.t(subcomposeLayoutState0, composer1, 8);
        S0 s00 = S0.a;
        composer1.V(0x44FAF204);
        boolean z = composer1.t(state0);
        androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout.5.1 subcomposeLayoutKt$SubcomposeLayout$5$10 = composer1.W();
        if(z || subcomposeLayoutKt$SubcomposeLayout$5$10 == Composer.a.a()) {
            subcomposeLayoutKt$SubcomposeLayout$5$10 = new Function1(state0) {
                final State e;

                {
                    this.e = state0;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            ((SubcomposeLayoutState)this.a.getValue()).d();
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            };
            composer1.O(subcomposeLayoutKt$SubcomposeLayout$5$10);
        }
        composer1.g0();
        EffectsKt.c(s00, subcomposeLayoutKt$SubcomposeLayout$5$10, composer1, 6);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(subcomposeLayoutState0, modifier0, o0, v, v1) {
                final SubcomposeLayoutState e;
                final Modifier f;
                final o g;
                final int h;
                final int i;

                {
                    this.e = subcomposeLayoutState0;
                    this.f = modifier0;
                    this.g = o0;
                    this.h = v;
                    this.i = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    SubcomposeLayoutKt.b(this.e, this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
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
    public static final SubcomposeSlotReusePolicy c(int v) {
        return new FixedCountSubcomposeSlotReusePolicy(v);
    }
}

