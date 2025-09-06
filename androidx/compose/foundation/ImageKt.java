package androidx.compose.foundation;

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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.S0;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import y4.l;

@s0({"SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,269:1\n36#2:270\n36#2:277\n456#2,14:297\n1114#3,6:271\n1114#3,6:278\n74#4:284\n75#4,11:286\n88#4:311\n76#5:285\n*S KotlinDebug\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n*L\n154#1:270\n246#1:277\n256#1:297,14\n154#1:271,6\n246#1:278,6\n256#1:284\n256#1:286,11\n256#1:311\n256#1:285\n*E\n"})
public final class ImageKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @k(level = m.c, message = "Consider usage of the Image composable that consumes an optional FilterQuality parameter", replaceWith = @c0(expression = "Image(bitmap, contentDescription, modifier, alignment, contentScale, alpha, colorFilter, DefaultFilterQuality)", imports = {"androidx.compose.foundation", "androidx.compose.ui.graphics.DefaultAlpha", "androidx.compose.ui.Alignment", "androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality", "androidx.compose.ui.layout.ContentScale.Fit"}))
    public static final void a(ImageBitmap imageBitmap0, String s, Modifier modifier0, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, Composer composer0, int v, int v1) {
        L.p(imageBitmap0, "bitmap");
        composer0.V(0x817219FF);
        Modifier modifier1 = (v1 & 4) == 0 ? modifier0 : Modifier.m0;
        Alignment alignment1 = (v1 & 8) == 0 ? alignment0 : Alignment.a.i();
        ContentScale contentScale1 = (v1 & 16) == 0 ? contentScale0 : ContentScale.a.i();
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x817219FF, v, -1, "androidx.compose.foundation.Image (Image.kt:87)");
        }
        ImageKt.d(imageBitmap0, s, modifier1, alignment1, contentScale1, ((v1 & 0x20) == 0 ? f : 1.0f), ((v1 & 0x40) == 0 ? colorFilter0 : null), 1, composer0, v & 0x70 | 8 | v & 0x380 | v & 0x1C00 | 0xE000 & v | 0x70000 & v | v & 0x380000, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@l Painter painter0, @y4.m String s, @y4.m Modifier modifier0, @y4.m Alignment alignment0, @y4.m ContentScale contentScale0, float f, @y4.m ColorFilter colorFilter0, @y4.m Composer composer0, int v, int v1) {
        Modifier modifier2;
        L.p(painter0, "painter");
        Composer composer1 = composer0.G(0x441D0E20);
        Modifier modifier1 = (v1 & 4) == 0 ? modifier0 : Modifier.m0;
        Alignment alignment1 = (v1 & 8) == 0 ? alignment0 : Alignment.a.i();
        ContentScale contentScale1 = (v1 & 16) == 0 ? contentScale0 : ContentScale.a.i();
        float f1 = (v1 & 0x20) == 0 ? f : 1.0f;
        ColorFilter colorFilter1 = (v1 & 0x40) == 0 ? colorFilter0 : null;
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x441D0E20, v, -1, "androidx.compose.foundation.Image (Image.kt:235)");
        }
        composer1.V(0xCF50B5F5);
        if(s == null) {
            modifier2 = Modifier.m0;
        }
        else {
            Companion modifier$Companion0 = Modifier.m0;
            composer1.V(0x44FAF204);
            boolean z = composer1.t(s);
            androidx.compose.foundation.ImageKt.Image.semantics.1.1 imageKt$Image$semantics$1$10 = composer1.W();
            if(z || imageKt$Image$semantics$1$10 == Composer.a.a()) {
                imageKt$Image$semantics$1$10 = new Function1(s) {
                    final String e;

                    {
                        this.e = s;
                        super(1);
                    }

                    public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                        L.p(semanticsPropertyReceiver0, "$this$semantics");
                        SemanticsPropertiesKt.G0(semanticsPropertyReceiver0, this.e);
                        SemanticsPropertiesKt.R0(semanticsPropertyReceiver0, 5);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((SemanticsPropertyReceiver)object0));
                        return S0.a;
                    }
                };
                composer1.O(imageKt$Image$semantics$1$10);
            }
            composer1.g0();
            modifier2 = SemanticsModifierKt.c(modifier$Companion0, false, imageKt$Image$semantics$1$10, 1, null);
        }
        composer1.g0();
        Modifier modifier3 = PainterModifierKt.b(ClipKt.b(modifier1.r0(modifier2)), painter0, false, alignment1, contentScale1, f1, colorFilter1, 2, null);
        androidx.compose.foundation.ImageKt.Image.2 imageKt$Image$20 = androidx.compose.foundation.ImageKt.Image.2.a;
        composer1.V(-1323940314);
        Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
        ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.p0;
        a a0 = composeUiNode$Companion0.a();
        p p0 = LayoutKt.f(modifier3);
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
        Updater.j(composer2, imageKt$Image$20, composeUiNode$Companion0.d());
        Updater.j(composer2, density0, composeUiNode$Companion0.b());
        Updater.j(composer2, layoutDirection0, composeUiNode$Companion0.c());
        Updater.j(composer2, viewConfiguration0, composeUiNode$Companion0.f());
        p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
        composer1.V(2058660585);
        composer1.g0();
        composer1.g();
        composer1.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(painter0, s, modifier1, alignment1, contentScale1, f1, colorFilter1, v, v1) {
                final Painter e;
                final String f;
                final Modifier g;
                final Alignment h;
                final ContentScale i;
                final float j;
                final ColorFilter k;
                final int l;
                final int m;

                {
                    this.e = painter0;
                    this.f = s;
                    this.g = modifier0;
                    this.h = alignment0;
                    this.i = contentScale0;
                    this.j = f;
                    this.k = colorFilter0;
                    this.l = v;
                    this.m = v1;
                    super(2);
                }

                public final void a(@y4.m Composer composer0, int v) {
                    ImageKt.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, composer0, (this.l | 1) & -920350135 | ((0x24924924 & (this.l | 1)) >> 1 | 306783378 & (this.l | 1)) | (306783378 & (this.l | 1)) << 1 & (0x24924924 & (this.l | 1)), this.m);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.foundation.ImageKt.Image.2 implements MeasurePolicy {
            public static final androidx.compose.foundation.ImageKt.Image.2 a;

            static {
                androidx.compose.foundation.ImageKt.Image.2.a = new androidx.compose.foundation.ImageKt.Image.2();
            }

            androidx.compose.foundation.ImageKt.Image.2() {
                super();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @l
            public final MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                L.p(measureScope0, "$this$Layout");
                L.p(list0, "<anonymous parameter 0>");
                return MeasureScope.-CC.p(measureScope0, Constraints.r(v), Constraints.q(v), null, androidx.compose.foundation.ImageKt.Image.2.measure.1.e, 4, null);

                final class androidx.compose.foundation.ImageKt.Image.2.measure.1 extends N implements Function1 {
                    public static final androidx.compose.foundation.ImageKt.Image.2.measure.1 e;

                    static {
                        androidx.compose.foundation.ImageKt.Image.2.measure.1.e = new androidx.compose.foundation.ImageKt.Image.2.measure.1();
                    }

                    androidx.compose.foundation.ImageKt.Image.2.measure.1() {
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                }

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

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void c(@l ImageVector imageVector0, @y4.m String s, @y4.m Modifier modifier0, @y4.m Alignment alignment0, @y4.m ContentScale contentScale0, float f, @y4.m ColorFilter colorFilter0, @y4.m Composer composer0, int v, int v1) {
        L.p(imageVector0, "imageVector");
        composer0.V(0x5F1F9C13);
        Modifier modifier1 = (v1 & 4) == 0 ? modifier0 : Modifier.m0;
        Alignment alignment1 = (v1 & 8) == 0 ? alignment0 : Alignment.a.i();
        ContentScale contentScale1 = (v1 & 16) == 0 ? contentScale0 : ContentScale.a.i();
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x5F1F9C13, v, -1, "androidx.compose.foundation.Image (Image.kt:189)");
        }
        ImageKt.b(VectorPainterKt.c(imageVector0, composer0, v & 14), s, modifier1, alignment1, contentScale1, ((v1 & 0x20) == 0 ? f : 1.0f), ((v1 & 0x40) == 0 ? colorFilter0 : null), composer0, VectorPainter.n | v & 0x70 | v & 0x380 | v & 0x1C00 | 0xE000 & v | 0x70000 & v | v & 0x380000, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void d(@l ImageBitmap imageBitmap0, @y4.m String s, @y4.m Modifier modifier0, @y4.m Alignment alignment0, @y4.m ContentScale contentScale0, float f, @y4.m ColorFilter colorFilter0, int v, @y4.m Composer composer0, int v1, int v2) {
        L.p(imageBitmap0, "bitmap");
        composer0.V(0xACC6C084);
        Modifier modifier1 = (v2 & 4) == 0 ? modifier0 : Modifier.m0;
        Alignment alignment1 = (v2 & 8) == 0 ? alignment0 : Alignment.a.i();
        ContentScale contentScale1 = (v2 & 16) == 0 ? contentScale0 : ContentScale.a.i();
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xACC6C084, v1, -1, "androidx.compose.foundation.Image (Image.kt:143)");
        }
        composer0.V(0x44FAF204);
        boolean z = composer0.t(imageBitmap0);
        BitmapPainter bitmapPainter0 = composer0.W();
        if(z || bitmapPainter0 == Composer.a.a()) {
            bitmapPainter0 = BitmapPainterKt.b(imageBitmap0, 0L, 0L, ((v2 & 0x80) == 0 ? v : 1), 6, null);
            composer0.O(bitmapPainter0);
        }
        composer0.g0();
        ImageKt.b(bitmapPainter0, s, modifier1, alignment1, contentScale1, ((v2 & 0x20) == 0 ? f : 1.0f), ((v2 & 0x40) == 0 ? colorFilter0 : null), composer0, v1 & 0x70 | 8 | v1 & 0x380 | v1 & 0x1C00 | 0xE000 & v1 | 0x70000 & v1 | 0x380000 & v1, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
    }
}

