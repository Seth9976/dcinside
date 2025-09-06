package androidx.compose.foundation;

import A3.o;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nCanvas.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Canvas.kt\nandroidx/compose/foundation/CanvasKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,65:1\n36#2:66\n1114#3,6:67\n*S KotlinDebug\n*F\n+ 1 Canvas.kt\nandroidx/compose/foundation/CanvasKt\n*L\n65#1:66\n65#1:67,6\n*E\n"})
public final class CanvasKt {
    @ExperimentalFoundationApi
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@l Modifier modifier0, @l String s, @l Function1 function10, @m Composer composer0, int v) {
        L.p(modifier0, "modifier");
        L.p(s, "contentDescription");
        L.p(function10, "onDraw");
        Composer composer1 = composer0.G(0xBAB206DD);
        int v1 = (v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.t(s) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.Y(function10) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xBAB206DD, v1, -1, "androidx.compose.foundation.Canvas (Canvas.kt:63)");
            }
            Modifier modifier1 = DrawModifierKt.a(modifier0, function10);
            composer1.V(0x44FAF204);
            boolean z = composer1.t(s);
            androidx.compose.foundation.CanvasKt.Canvas.2.1 canvasKt$Canvas$2$10 = composer1.W();
            if(z || canvasKt$Canvas$2$10 == Composer.a.a()) {
                canvasKt$Canvas$2$10 = new Function1(s) {
                    final String e;

                    {
                        this.e = s;
                        super(1);
                    }

                    public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                        L.p(semanticsPropertyReceiver0, "$this$semantics");
                        SemanticsPropertiesKt.G0(semanticsPropertyReceiver0, this.e);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((SemanticsPropertyReceiver)object0));
                        return S0.a;
                    }
                };
                composer1.O(canvasKt$Canvas$2$10);
            }
            composer1.g0();
            SpacerKt.a(SemanticsModifierKt.c(modifier1, false, canvasKt$Canvas$2$10, 1, null), composer1, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier0, s, function10, v) {
                final Modifier e;
                final String f;
                final Function1 g;
                final int h;

                {
                    this.e = modifier0;
                    this.f = s;
                    this.g = function10;
                    this.h = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    CanvasKt.a(this.e, this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
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
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@l Modifier modifier0, @l Function1 function10, @m Composer composer0, int v) {
        L.p(modifier0, "modifier");
        L.p(function10, "onDraw");
        Composer composer1 = composer0.G(0xC8660B92);
        int v1 = (v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.Y(function10) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xC8660B92, v, -1, "androidx.compose.foundation.Canvas (Canvas.kt:41)");
            }
            SpacerKt.a(DrawModifierKt.a(modifier0, function10), composer1, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier0, function10, v) {
                final Modifier e;
                final Function1 f;
                final int g;

                {
                    this.e = modifier0;
                    this.f = function10;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    CanvasKt.b(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }
}

