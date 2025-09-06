package androidx.compose.foundation.text.selection;

import A3.o;
import A3.p;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n558#2,17:332\n50#3:349\n49#3:350\n1114#4,6:351\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n*L\n194#1:332,17\n232#1:349\n232#1:350\n232#1:351,6\n*E\n"})
public final class AndroidSelectionHandles_androidKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@l Modifier modifier0, boolean z, @l ResolvedTextDirection resolvedTextDirection0, boolean z1, @m Composer composer0, int v) {
        L.p(modifier0, "modifier");
        L.p(resolvedTextDirection0, "direction");
        Composer composer1 = composer0.G(0x2DBC596);
        int v1 = (v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.v(z) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.t(resolvedTextDirection0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.v(z1) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x2DBC596, v, -1, "androidx.compose.foundation.text.selection.DefaultSelectionHandle (AndroidSelectionHandles.android.kt:95)");
            }
            SpacerKt.a(AndroidSelectionHandles_androidKt.f(SizeKt.E(modifier0, 25.0f, 25.0f), z, resolvedTextDirection0, z1), composer1, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier0, z, resolvedTextDirection0, z1, v) {
                final Modifier e;
                final boolean f;
                final ResolvedTextDirection g;
                final boolean h;
                final int i;

                {
                    this.e = modifier0;
                    this.f = z;
                    this.g = resolvedTextDirection0;
                    this.h = z1;
                    this.i = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AndroidSelectionHandles_androidKt.a(this.e, this.f, this.g, this.h, composer0, (this.i | 1) & -920350135 | ((0x24924924 & (this.i | 1)) >> 1 | 306783378 & (this.i | 1)) | (306783378 & (this.i | 1)) << 1 & (0x24924924 & (this.i | 1)));
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
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void b(long v, @l HandleReferencePoint handleReferencePoint0, @l o o0, @m Composer composer0, int v1) {
        L.p(handleReferencePoint0, "handleReferencePoint");
        L.p(o0, "content");
        Composer composer1 = composer0.G(-1409050158);
        int v2 = (v1 & 14) == 0 ? (composer1.A(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.t(handleReferencePoint0) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.Y(o0) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(-1409050158, v2, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:224)");
            }
            long v3 = IntOffsetKt.a(b.L0(Offset.p(v)), b.L0(Offset.r(v)));
            IntOffset intOffset0 = IntOffset.b(v3);
            composer1.V(0x1E7B2B64);
            boolean z = composer1.t(handleReferencePoint0);
            boolean z1 = composer1.t(intOffset0);
            HandlePositionProvider handlePositionProvider0 = composer1.W();
            if(z1 || z || handlePositionProvider0 == Composer.a.a()) {
                handlePositionProvider0 = new HandlePositionProvider(handleReferencePoint0, v3, null);
                composer1.O(handlePositionProvider0);
            }
            composer1.g0();
            AndroidPopup_androidKt.a(handlePositionProvider0, null, new PopupProperties(false, false, false, null, true, false, 15, null), o0, composer1, v2 << 3 & 0x1C00 | 0x180, 2);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(v, handleReferencePoint0, o0, v1) {
                final long e;
                final HandleReferencePoint f;
                final o g;
                final int h;

                {
                    this.e = v;
                    this.f = handleReferencePoint0;
                    this.g = o0;
                    this.h = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AndroidSelectionHandles_androidKt.b(this.e, this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
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
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(long v, boolean z, @l ResolvedTextDirection resolvedTextDirection0, boolean z1, @l Modifier modifier0, @m o o0, @m Composer composer0, int v1) {
        L.p(resolvedTextDirection0, "direction");
        L.p(modifier0, "modifier");
        Composer composer1 = composer0.G(0xDB441326);
        int v2 = (v1 & 14) == 0 ? (composer1.A(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.v(z) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.t(resolvedTextDirection0) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.v(z1) ? 0x800 : 0x400);
        }
        if((0xE000 & v1) == 0) {
            v2 |= (composer1.t(modifier0) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v1) == 0) {
            v2 |= (composer1.Y(o0) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xDB441326, v2, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:53)");
            }
            AndroidSelectionHandles_androidKt.b(v, (AndroidSelectionHandles_androidKt.h(z, resolvedTextDirection0, z1) ? HandleReferencePoint.b : HandleReferencePoint.a), ComposableLambdaKt.b(composer1, 0x2BA2F39D, true, new o(o0, modifier0, z, v, v2, resolvedTextDirection0, z1) {
                final o e;
                final Modifier f;
                final boolean g;
                final long h;
                final int i;
                final ResolvedTextDirection j;
                final boolean k;

                {
                    this.e = o0;
                    this.f = modifier0;
                    this.g = z;
                    this.h = v;
                    this.i = v1;
                    this.j = resolvedTextDirection0;
                    this.k = z1;
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
                        ComposerKt.w0(0x2BA2F39D, v, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:69)");
                    }
                    if(this.e == null) {
                        composer0.V(0x1708AA0E);
                        Modifier modifier0 = this.f;
                        Offset offset0 = Offset.d(this.h);
                        boolean z = this.g;
                        long v1 = this.h;
                        composer0.V(0x1E7B2B64);
                        boolean z1 = composer0.t(Boolean.valueOf(this.g));
                        boolean z2 = composer0.t(offset0);
                        androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandle.1.1.1 androidSelectionHandles_androidKt$SelectionHandle$1$1$10 = composer0.W();
                        if(z1 || z2 || androidSelectionHandles_androidKt$SelectionHandle$1$1$10 == Composer.a.a()) {
                            androidSelectionHandles_androidKt$SelectionHandle$1$1$10 = new Function1(v1) {
                                final boolean e;
                                final long f;

                                {
                                    this.e = z;
                                    this.f = v;
                                    super(1);
                                }

                                public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                                    L.p(semanticsPropertyReceiver0, "$this$semantics");
                                    semanticsPropertyReceiver0.a(SelectionHandlesKt.d(), new SelectionHandleInfo((this.e ? Handle.b : Handle.c), this.f, null));
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((SemanticsPropertyReceiver)object0));
                                    return S0.a;
                                }
                            };
                            composer0.O(androidSelectionHandles_androidKt$SelectionHandle$1$1$10);
                        }
                        composer0.g0();
                        AndroidSelectionHandles_androidKt.a(SemanticsModifierKt.c(modifier0, false, androidSelectionHandles_androidKt$SelectionHandle$1$1$10, 1, null), this.g, this.j, this.k, composer0, this.i & 0x1FF0);
                    }
                    else {
                        composer0.V(0x1708ACB1);
                        this.e.invoke(composer0, ((int)(this.i >> 15 & 14)));
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
            }), composer1, v2 & 14 | 0x180);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(v, z, resolvedTextDirection0, z1, modifier0, o0, v1) {
                final long e;
                final boolean f;
                final ResolvedTextDirection g;
                final boolean h;
                final Modifier i;
                final o j;
                final int k;

                {
                    this.e = v;
                    this.f = z;
                    this.g = resolvedTextDirection0;
                    this.h = z1;
                    this.i = modifier0;
                    this.j = o0;
                    this.k = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AndroidSelectionHandles_androidKt.c(this.e, this.f, this.g, this.h, this.i, this.j, composer0, (this.k | 1) & -920350135 | ((0x24924924 & (this.k | 1)) >> 1 | 306783378 & (this.k | 1)) | (306783378 & (this.k | 1)) << 1 & (0x24924924 & (this.k | 1)));
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
    public static final ImageBitmap e(@l CacheDrawScope cacheDrawScope0, float f) {
        L.p(cacheDrawScope0, "<this>");
        int v = ((int)(((float)Math.ceil(f)))) * 2;
        HandleImageCache handleImageCache0 = HandleImageCache.a;
        ImageBitmap imageBitmap0 = handleImageCache0.c();
        Canvas canvas0 = handleImageCache0.a();
        CanvasDrawScope canvasDrawScope0 = handleImageCache0.b();
        if(imageBitmap0 == null || canvas0 == null || v > imageBitmap0.getWidth() || v > imageBitmap0.getHeight()) {
            imageBitmap0 = ImageBitmapKt.b(v, v, 1, false, null, 24, null);
            handleImageCache0.f(imageBitmap0);
            canvas0 = CanvasKt.a(imageBitmap0);
            handleImageCache0.d(canvas0);
        }
        if(canvasDrawScope0 == null) {
            canvasDrawScope0 = new CanvasDrawScope();
            handleImageCache0.e(canvasDrawScope0);
        }
        LayoutDirection layoutDirection0 = cacheDrawScope0.getLayoutDirection();
        long v1 = androidx.compose.ui.geometry.SizeKt.a(imageBitmap0.getWidth(), imageBitmap0.getHeight());
        DrawParams canvasDrawScope$DrawParams0 = canvasDrawScope0.B();
        DrawParams canvasDrawScope$DrawParams1 = canvasDrawScope0.B();
        canvasDrawScope$DrawParams1.l(cacheDrawScope0);
        canvasDrawScope$DrawParams1.m(layoutDirection0);
        canvasDrawScope$DrawParams1.k(canvas0);
        canvasDrawScope$DrawParams1.n(v1);
        canvas0.f();
        androidx.compose.ui.graphics.drawscope.b.K(canvasDrawScope0, 0xFF00000000000000L, 0L, canvasDrawScope0.b(), 0.0f, null, null, 0, 58, null);
        androidx.compose.ui.graphics.drawscope.b.K(canvasDrawScope0, 0xFF00000000000000L, 0L, androidx.compose.ui.geometry.SizeKt.a(f, f), 0.0f, null, null, 0, 120, null);
        androidx.compose.ui.graphics.drawscope.b.x(canvasDrawScope0, 0xFF00000000000000L, f, OffsetKt.a(f, f), 0.0f, null, null, 0, 120, null);
        canvas0.v();
        DrawParams canvasDrawScope$DrawParams2 = canvasDrawScope0.B();
        canvasDrawScope$DrawParams2.l(canvasDrawScope$DrawParams0.a());
        canvasDrawScope$DrawParams2.m(canvasDrawScope$DrawParams0.b());
        canvasDrawScope$DrawParams2.k(canvasDrawScope$DrawParams0.c());
        canvasDrawScope$DrawParams2.n(canvasDrawScope$DrawParams0.d());
        return imageBitmap0;
    }

    @l
    public static final Modifier f(@l Modifier modifier0, boolean z, @l ResolvedTextDirection resolvedTextDirection0, boolean z1) {
        L.p(modifier0, "<this>");
        L.p(resolvedTextDirection0, "direction");
        return ComposedModifierKt.j(modifier0, null, new p(z, resolvedTextDirection0, z1) {
            final boolean e;
            final ResolvedTextDirection f;
            final boolean g;

            {
                this.e = z;
                this.f = resolvedTextDirection0;
                this.g = z1;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0xA4497F38);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xA4497F38, v, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:112)");
                }
                long v2 = ((TextSelectionColors)composer0.L(TextSelectionColorsKt.c())).b();
                Companion modifier$Companion0 = Modifier.m0;
                Object[] arr_object = {Color.n(v2), Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g)};
                boolean z = this.e;
                ResolvedTextDirection resolvedTextDirection0 = this.f;
                boolean z1 = this.g;
                composer0.V(0xDE219177);
                boolean z2 = false;
                for(int v1 = 0; v1 < 4; ++v1) {
                    z2 |= composer0.t(arr_object[v1]);
                }
                androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.drawSelectionHandle.1.1.1 androidSelectionHandles_androidKt$drawSelectionHandle$1$1$10 = composer0.W();
                if(z2 || androidSelectionHandles_androidKt$drawSelectionHandle$1$1$10 == Composer.a.a()) {
                    androidSelectionHandles_androidKt$drawSelectionHandle$1$1$10 = new Function1(z, resolvedTextDirection0, z1) {
                        final long e;
                        final boolean f;
                        final ResolvedTextDirection g;
                        final boolean h;

                        {
                            this.e = v;
                            this.f = z;
                            this.g = resolvedTextDirection0;
                            this.h = z1;
                            super(1);
                        }

                        @l
                        public final DrawResult a(@l CacheDrawScope cacheDrawScope0) {
                            L.p(cacheDrawScope0, "$this$drawWithCache");
                            ImageBitmap imageBitmap0 = AndroidSelectionHandles_androidKt.e(cacheDrawScope0, Size.t(cacheDrawScope0.b()) / 2.0f);
                            ColorFilter colorFilter0 = androidx.compose.ui.graphics.ColorFilter.Companion.d(ColorFilter.b, this.e, 0, 2, null);
                            return cacheDrawScope0.g(new Function1(this.g, this.h, imageBitmap0, colorFilter0) {
                                final boolean e;
                                final ResolvedTextDirection f;
                                final boolean g;
                                final ImageBitmap h;
                                final ColorFilter i;

                                {
                                    this.e = z;
                                    this.f = resolvedTextDirection0;
                                    this.g = z1;
                                    this.h = imageBitmap0;
                                    this.i = colorFilter0;
                                    super(1);
                                }

                                public final void a(@l ContentDrawScope contentDrawScope0) {
                                    L.p(contentDrawScope0, "$this$onDrawWithContent");
                                    contentDrawScope0.Q0();
                                    if(AndroidSelectionHandles_androidKt.h(this.e, this.f, this.g)) {
                                        long v = contentDrawScope0.I();
                                        DrawContext drawContext0 = contentDrawScope0.J0();
                                        long v1 = drawContext0.b();
                                        drawContext0.a().f();
                                        drawContext0.d().f(-1.0f, 1.0f, v);
                                        androidx.compose.ui.graphics.drawscope.b.A(contentDrawScope0, this.h, 0L, 0.0f, null, this.i, 0, 46, null);
                                        drawContext0.a().v();
                                        drawContext0.c(v1);
                                        return;
                                    }
                                    androidx.compose.ui.graphics.drawscope.b.A(contentDrawScope0, this.h, 0L, 0.0f, null, this.i, 0, 46, null);
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
                    composer0.O(androidSelectionHandles_androidKt$drawSelectionHandle$1$1$10);
                }
                composer0.g0();
                Modifier modifier1 = modifier0.r0(DrawModifierKt.b(modifier$Companion0, androidSelectionHandles_androidKt$drawSelectionHandle$1$1$10));
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
        }, 1, null);
    }

    public static final boolean g(@l ResolvedTextDirection resolvedTextDirection0, boolean z) {
        L.p(resolvedTextDirection0, "direction");
        return resolvedTextDirection0 == ResolvedTextDirection.a && !z || resolvedTextDirection0 == ResolvedTextDirection.b && z;
    }

    // 去混淆评级： 低(30)
    private static final boolean h(boolean z, ResolvedTextDirection resolvedTextDirection0, boolean z1) {
        return z ? AndroidSelectionHandles_androidKt.g(resolvedTextDirection0, z1) : !AndroidSelectionHandles_androidKt.g(resolvedTextDirection0, z1);
    }
}

