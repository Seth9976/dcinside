package androidx.compose.foundation.text;

import A3.o;
import A3.p;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.graphics.drawscope.c;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,82:1\n154#2:83\n88#3:84\n71#3:85\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n*L\n35#1:83\n36#1:84\n36#1:85\n*E\n"})
public final class AndroidCursorHandle_androidKt {
    private static final float a = 1.414214f;
    private static final float b;
    private static final float c;

    static {
        AndroidCursorHandle_androidKt.b = 25.0f;
        AndroidCursorHandle_androidKt.c = 20.710678f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(long v, @l Modifier modifier0, @m o o0, @m Composer composer0, int v1) {
        L.p(modifier0, "modifier");
        Composer composer1 = composer0.G(0xFFB0DE35);
        int v2 = (v1 & 14) == 0 ? (composer1.A(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.Y(o0) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xFFB0DE35, v2, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:38)");
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.b(composer1, -1458480226, true, new o(o0, modifier0, v2) {
                final o e;
                final Modifier f;
                final int g;

                {
                    this.e = o0;
                    this.f = modifier0;
                    this.g = v;
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
                        ComposerKt.w0(-1458480226, v, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:46)");
                    }
                    if(this.e == null) {
                        composer0.V(0x4C08C7B9);
                        AndroidCursorHandle_androidKt.b(this.f, composer0, this.g >> 3 & 14);
                    }
                    else {
                        composer0.V(0x4C08C7FF);
                        this.e.invoke(composer0, ((int)(this.g >> 6 & 14)));
                    }
                    composer0.g0();
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
            AndroidSelectionHandles_androidKt.b(v, HandleReferencePoint.c, composableLambda0, composer1, v2 & 14 | 0x1B0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(v, modifier0, o0, v1) {
                final long e;
                final Modifier f;
                final o g;
                final int h;

                {
                    this.e = v;
                    this.f = modifier0;
                    this.g = o0;
                    this.h = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AndroidCursorHandle_androidKt.a(this.e, this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
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
    public static final void b(@l Modifier modifier0, @m Composer composer0, int v) {
        L.p(modifier0, "modifier");
        Composer composer1 = composer0.G(694251107);
        if((((v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v) & 11) != 2 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(694251107, v, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:57)");
            }
            SpacerKt.a(AndroidCursorHandle_androidKt.c(SizeKt.E(modifier0, AndroidCursorHandle_androidKt.c, AndroidCursorHandle_androidKt.b)), composer1, 0);
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
                    AndroidCursorHandle_androidKt.b(this.e, composer0, (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
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
    public static final Modifier c(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.j(modifier0, null, androidx.compose.foundation.text.AndroidCursorHandle_androidKt.drawCursorHandle.1.e, 1, null);

        @s0({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,82:1\n76#2:83\n36#3:84\n1114#4,6:85\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n*L\n64#1:83\n66#1:84\n66#1:85,6\n*E\n"})
        final class androidx.compose.foundation.text.AndroidCursorHandle_androidKt.drawCursorHandle.1 extends N implements p {
            public static final androidx.compose.foundation.text.AndroidCursorHandle_androidKt.drawCursorHandle.1 e;

            static {
                androidx.compose.foundation.text.AndroidCursorHandle_androidKt.drawCursorHandle.1.e = new androidx.compose.foundation.text.AndroidCursorHandle_androidKt.drawCursorHandle.1();
            }

            androidx.compose.foundation.text.AndroidCursorHandle_androidKt.drawCursorHandle.1() {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x813A1807);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x813A1807, v, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:62)");
                }
                long v1 = ((TextSelectionColors)composer0.L(TextSelectionColorsKt.c())).b();
                Companion modifier$Companion0 = Modifier.m0;
                Color color0 = Color.n(v1);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(color0);
                androidx.compose.foundation.text.AndroidCursorHandle_androidKt.drawCursorHandle.1.1.1 androidCursorHandle_androidKt$drawCursorHandle$1$1$10 = composer0.W();
                if(z || androidCursorHandle_androidKt$drawCursorHandle$1$1$10 == Composer.a.a()) {
                    androidCursorHandle_androidKt$drawCursorHandle$1$1$10 = new Function1() {
                        final long e;

                        {
                            this.e = v;
                            super(1);
                        }

                        @l
                        public final DrawResult a(@l CacheDrawScope cacheDrawScope0) {
                            L.p(cacheDrawScope0, "$this$drawWithCache");
                            float f = Size.t(cacheDrawScope0.b());
                            return cacheDrawScope0.g(new Function1(AndroidSelectionHandles_androidKt.e(cacheDrawScope0, f / 2.0f), androidx.compose.ui.graphics.ColorFilter.Companion.d(ColorFilter.b, this.e, 0, 2, null)) {
                                final float e;
                                final ImageBitmap f;
                                final ColorFilter g;

                                {
                                    this.e = f;
                                    this.f = imageBitmap0;
                                    this.g = colorFilter0;
                                    super(1);
                                }

                                public final void a(@l ContentDrawScope contentDrawScope0) {
                                    L.p(contentDrawScope0, "$this$onDrawWithContent");
                                    contentDrawScope0.Q0();
                                    DrawContext drawContext0 = contentDrawScope0.J0();
                                    long v = drawContext0.b();
                                    drawContext0.a().f();
                                    DrawTransform drawTransform0 = drawContext0.d();
                                    c.g(drawTransform0, this.e, 0.0f, 2, null);
                                    drawTransform0.g(45.0f, 0L);
                                    b.A(contentDrawScope0, this.f, 0L, 0.0f, null, this.g, 0, 46, null);
                                    drawContext0.a().v();
                                    drawContext0.c(v);
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((ContentDrawScope)object0));
                                    return S0.a;
                                }
                            });
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((CacheDrawScope)object0));
                        }
                    };
                    composer0.O(androidCursorHandle_androidKt$drawCursorHandle$1$1$10);
                }
                composer0.g0();
                Modifier modifier1 = modifier0.r0(DrawModifierKt.b(modifier$Companion0, androidCursorHandle_androidKt$drawCursorHandle$1$1$10));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }

    }

    public static final float d() {
        return AndroidCursorHandle_androidKt.b;
    }

    public static final float e() {
        return AndroidCursorHandle_androidKt.c;
    }
}

