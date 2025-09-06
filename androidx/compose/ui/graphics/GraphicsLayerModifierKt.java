package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

public final class GraphicsLayerModifierKt {
    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "block");
        return modifier0.r0(new BlockGraphicsLayerElement(function10));
    }

    // 去混淆评级： 低(20)
    @Stable
    @k(level = m.c, message = "Replace with graphicsLayer that consumes shadow color parameters", replaceWith = @c0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    public static final Modifier b(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0) {
        L.p(modifier0, "$this$graphicsLayer");
        L.p(shape0, "shape");
        return GraphicsLayerModifierKt.d(modifier0, f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, renderEffect0, 0xFF00000000000000L, 0xFF00000000000000L, 0);
    }

    public static Modifier c(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, int v1, Object object0) {
        float f10 = 1.0f;
        float f11 = (v1 & 1) == 0 ? f : 1.0f;
        float f12 = (v1 & 2) == 0 ? f1 : 1.0f;
        if((v1 & 4) == 0) {
            f10 = f2;
        }
        float f13 = 0.0f;
        float f14 = (v1 & 8) == 0 ? f3 : 0.0f;
        float f15 = (v1 & 16) == 0 ? f4 : 0.0f;
        float f16 = (v1 & 0x20) == 0 ? f5 : 0.0f;
        float f17 = (v1 & 0x40) == 0 ? f6 : 0.0f;
        float f18 = (v1 & 0x80) == 0 ? f7 : 0.0f;
        if((v1 & 0x100) == 0) {
            f13 = f8;
        }
        float f19 = (v1 & 0x200) == 0 ? f9 : 8.0f;
        long v2 = (v1 & 0x400) == 0 ? v : 0x3F0000003F000000L;
        Shape shape1 = (v1 & 0x800) == 0 ? shape0 : RectangleShapeKt.a();
        boolean z1 = (v1 & 0x1000) == 0 ? z : false;
        return (v1 & 0x2000) == 0 ? GraphicsLayerModifierKt.b(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v2, shape1, z1, renderEffect0) : GraphicsLayerModifierKt.b(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v2, shape1, z1, null);
    }

    @Stable
    @l
    public static final Modifier d(@l Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, @l Shape shape0, boolean z, @y4.m RenderEffect renderEffect0, long v1, long v2, int v3) {
        L.p(modifier0, "$this$graphicsLayer");
        L.p(shape0, "shape");
        return modifier0.r0(new GraphicsLayerModifierNodeElement(f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, renderEffect0, v1, v2, v3, null));
    }

    public static Modifier e(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, long v1, long v2, int v3, int v4, Object object0) {
        float f10 = 1.0f;
        float f11 = (v4 & 1) == 0 ? f : 1.0f;
        float f12 = (v4 & 2) == 0 ? f1 : 1.0f;
        if((v4 & 4) == 0) {
            f10 = f2;
        }
        float f13 = 0.0f;
        float f14 = (v4 & 8) == 0 ? f3 : 0.0f;
        float f15 = (v4 & 16) == 0 ? f4 : 0.0f;
        float f16 = (v4 & 0x20) == 0 ? f5 : 0.0f;
        float f17 = (v4 & 0x40) == 0 ? f6 : 0.0f;
        float f18 = (v4 & 0x80) == 0 ? f7 : 0.0f;
        if((v4 & 0x100) == 0) {
            f13 = f8;
        }
        float f19 = (v4 & 0x200) == 0 ? f9 : 8.0f;
        long v5 = (v4 & 0x400) == 0 ? v : 0x3F0000003F000000L;
        Shape shape1 = (v4 & 0x800) == 0 ? shape0 : RectangleShapeKt.a();
        boolean z1 = (v4 & 0x1000) == 0 ? z : false;
        RenderEffect renderEffect1 = (v4 & 0x2000) == 0 ? renderEffect0 : null;
        long v6 = (v4 & 0x4000) == 0 ? v1 : 0xFF00000000000000L;
        long v7 = (v4 & 0x8000) == 0 ? v2 : 0xFF00000000000000L;
        return (v4 & 0x10000) == 0 ? GraphicsLayerModifierKt.d(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v5, shape1, z1, renderEffect1, v6, v7, v3) : GraphicsLayerModifierKt.d(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v5, shape1, z1, renderEffect1, v6, v7, 0);
    }

    @Stable
    @k(level = m.c, message = "Replace with graphicsLayer that consumes a compositing strategy", replaceWith = @c0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor, CompositingStrategy.Auto)", imports = {"androidx.compose.ui.graphics"}))
    public static final Modifier f(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, long v1, long v2) {
        L.p(modifier0, "$this$graphicsLayer");
        L.p(shape0, "shape");
        return GraphicsLayerModifierKt.d(modifier0, f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, renderEffect0, v1, v2, 0);
    }

    public static Modifier g(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, long v1, long v2, int v3, Object object0) {
        float f10 = 1.0f;
        float f11 = (v3 & 1) == 0 ? f : 1.0f;
        float f12 = (v3 & 2) == 0 ? f1 : 1.0f;
        if((v3 & 4) == 0) {
            f10 = f2;
        }
        float f13 = 0.0f;
        float f14 = (v3 & 8) == 0 ? f3 : 0.0f;
        float f15 = (v3 & 16) == 0 ? f4 : 0.0f;
        float f16 = (v3 & 0x20) == 0 ? f5 : 0.0f;
        float f17 = (v3 & 0x40) == 0 ? f6 : 0.0f;
        float f18 = (v3 & 0x80) == 0 ? f7 : 0.0f;
        if((v3 & 0x100) == 0) {
            f13 = f8;
        }
        float f19 = (v3 & 0x200) == 0 ? f9 : 8.0f;
        long v4 = (v3 & 0x400) == 0 ? v : 0x3F0000003F000000L;
        Shape shape1 = (v3 & 0x800) == 0 ? shape0 : RectangleShapeKt.a();
        boolean z1 = (v3 & 0x1000) == 0 ? z : false;
        RenderEffect renderEffect1 = (v3 & 0x2000) == 0 ? renderEffect0 : null;
        long v5 = (v3 & 0x4000) == 0 ? v1 : 0xFF00000000000000L;
        return (v3 & 0x8000) == 0 ? GraphicsLayerModifierKt.f(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v4, shape1, z1, renderEffect1, v5, v2) : GraphicsLayerModifierKt.f(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v4, shape1, z1, renderEffect1, v5, 0xFF00000000000000L);
    }

    @Stable
    @k(level = m.c, message = "Replace with graphicsLayer that consumes an optional RenderEffect parameter and shadow color parameters", replaceWith = @c0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    public static final Modifier h(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z) {
        L.p(modifier0, "$this$graphicsLayer");
        L.p(shape0, "shape");
        return GraphicsLayerModifierKt.e(modifier0, f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, null, 0L, 0L, 0, 0x1C000, null);
    }

    public static Modifier i(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, int v1, Object object0) {
        float f10 = 1.0f;
        float f11 = (v1 & 1) == 0 ? f : 1.0f;
        float f12 = (v1 & 2) == 0 ? f1 : 1.0f;
        if((v1 & 4) == 0) {
            f10 = f2;
        }
        float f13 = 0.0f;
        float f14 = (v1 & 8) == 0 ? f3 : 0.0f;
        float f15 = (v1 & 16) == 0 ? f4 : 0.0f;
        float f16 = (v1 & 0x20) == 0 ? f5 : 0.0f;
        float f17 = (v1 & 0x40) == 0 ? f6 : 0.0f;
        float f18 = (v1 & 0x80) == 0 ? f7 : 0.0f;
        if((v1 & 0x100) == 0) {
            f13 = f8;
        }
        float f19 = (v1 & 0x200) == 0 ? f9 : 8.0f;
        long v2 = (v1 & 0x400) == 0 ? v : 0x3F0000003F000000L;
        Shape shape1 = (v1 & 0x800) == 0 ? shape0 : RectangleShapeKt.a();
        return (v1 & 0x1000) == 0 ? GraphicsLayerModifierKt.h(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v2, shape1, z) : GraphicsLayerModifierKt.h(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v2, shape1, false);
    }

    @Stable
    @l
    public static final Modifier j(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return modifier0;
    }
}

