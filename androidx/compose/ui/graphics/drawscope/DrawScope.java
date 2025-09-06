package androidx.compose.ui.graphics.drawscope;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.a;
import java.util.List;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;

@DrawScopeMarker
public interface DrawScope extends Density {
    public static final class Companion {
        static final Companion a;
        private static final int b;
        private static final int c;

        static {
            Companion.a = new Companion();
            Companion.b = 3;
            Companion.c = 1;
        }

        public final int a() [...] // 潜在的解密器

        public final int b() [...] // 潜在的解密器
    }

    public static final class DefaultImpls {
        @Stable
        @Deprecated
        public static float A(@l DrawScope drawScope0, int v) {
            return a.e(drawScope0, v);
        }

        @Stable
        @Deprecated
        public static long B(@l DrawScope drawScope0, long v) {
            return a.f(drawScope0, v);
        }

        @Stable
        @Deprecated
        public static float C(@l DrawScope drawScope0, long v) {
            return a.g(drawScope0, v);
        }

        @Stable
        @Deprecated
        public static float D(@l DrawScope drawScope0, float f) {
            return a.h(drawScope0, f);
        }

        @Stable
        @Deprecated
        @l
        public static Rect E(@l DrawScope drawScope0, @l DpRect dpRect0) {
            L.p(dpRect0, "$receiver");
            return a.i(drawScope0, dpRect0);
        }

        @Stable
        @Deprecated
        public static long F(@l DrawScope drawScope0, long v) {
            return a.j(drawScope0, v);
        }

        @Stable
        @Deprecated
        public static long G(@l DrawScope drawScope0, float f) {
            return a.k(drawScope0, f);
        }

        @Stable
        @Deprecated
        public static long H(@l DrawScope drawScope0, float f) {
            return a.l(drawScope0, f);
        }

        @Stable
        @Deprecated
        public static long I(@l DrawScope drawScope0, int v) {
            return a.m(drawScope0, v);
        }

        public static void a(DrawScope drawScope0, Brush brush0, float f, float f1, boolean z, long v, long v1, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            b.u(drawScope0, brush0, f, f1, z, v, v1, f2, drawStyle0, colorFilter0, v2, v3, object0);
        }

        public static void b(DrawScope drawScope0, long v, float f, float f1, boolean z, long v1, long v2, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            b.v(drawScope0, v, f, f1, z, v1, v2, f2, drawStyle0, colorFilter0, v3, v4, object0);
        }

        public static void c(DrawScope drawScope0, Brush brush0, float f, long v, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
            b.w(drawScope0, brush0, f, v, f1, drawStyle0, colorFilter0, v1, v2, object0);
        }

        public static void d(DrawScope drawScope0, long v, float f, long v1, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            b.x(drawScope0, v, f, v1, f1, drawStyle0, colorFilter0, v2, v3, object0);
        }

        public static void e(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4, int v5, Object object0) {
            b.y(drawScope0, imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4, v5, object0);
        }

        @Deprecated
        public static void f(@l DrawScope drawScope0, @l ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v4, int v5) {
            L.p(imageBitmap0, "image");
            L.p(drawStyle0, "style");
            b.a(drawScope0, imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4, v5);
        }

        public static void g(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4, int v5, int v6, Object object0) {
            b.z(drawScope0, imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4, v5, v6, object0);
        }

        public static void h(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
            b.A(drawScope0, imageBitmap0, v, f, drawStyle0, colorFilter0, v1, v2, object0);
        }

        public static void i(DrawScope drawScope0, Brush brush0, long v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            b.B(drawScope0, brush0, v, v1, f, v2, pathEffect0, f1, colorFilter0, v3, v4, object0);
        }

        public static void j(DrawScope drawScope0, long v, long v1, long v2, float f, int v3, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v4, int v5, Object object0) {
            b.C(drawScope0, v, v1, v2, f, v3, pathEffect0, f1, colorFilter0, v4, v5, object0);
        }

        public static void k(DrawScope drawScope0, Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            b.D(drawScope0, brush0, v, v1, f, drawStyle0, colorFilter0, v2, v3, object0);
        }

        public static void l(DrawScope drawScope0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            b.E(drawScope0, v, v1, v2, f, drawStyle0, colorFilter0, v3, v4, object0);
        }

        public static void m(DrawScope drawScope0, Path path0, Brush brush0, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v, int v1, Object object0) {
            b.F(drawScope0, path0, brush0, f, drawStyle0, colorFilter0, v, v1, object0);
        }

        public static void n(DrawScope drawScope0, Path path0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
            b.G(drawScope0, path0, v, f, drawStyle0, colorFilter0, v1, v2, object0);
        }

        public static void o(DrawScope drawScope0, List list0, int v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            b.H(drawScope0, list0, v, v1, f, v2, pathEffect0, f1, colorFilter0, v3, v4, object0);
        }

        public static void p(DrawScope drawScope0, List list0, int v, Brush brush0, float f, int v1, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            b.I(drawScope0, list0, v, brush0, f, v1, pathEffect0, f1, colorFilter0, v2, v3, object0);
        }

        public static void q(DrawScope drawScope0, Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
            b.J(drawScope0, brush0, v, v1, f, drawStyle0, colorFilter0, v2, v3, object0);
        }

        public static void r(DrawScope drawScope0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            b.K(drawScope0, v, v1, v2, f, drawStyle0, colorFilter0, v3, v4, object0);
        }

        public static void s(DrawScope drawScope0, Brush brush0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
            b.L(drawScope0, brush0, v, v1, v2, f, drawStyle0, colorFilter0, v3, v4, object0);
        }

        public static void t(DrawScope drawScope0, long v, long v1, long v2, long v3, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v4, int v5, Object object0) {
            b.M(drawScope0, v, v1, v2, v3, drawStyle0, f, colorFilter0, v4, v5, object0);
        }

        @Deprecated
        public static long u(@l DrawScope drawScope0) {
            return b.b(drawScope0);
        }

        @Deprecated
        public static long v(@l DrawScope drawScope0) {
            return b.c(drawScope0);
        }

        @Stable
        @Deprecated
        public static int w(@l DrawScope drawScope0, long v) {
            return a.a(drawScope0, v);
        }

        @Stable
        @Deprecated
        public static int x(@l DrawScope drawScope0, float f) {
            return a.b(drawScope0, f);
        }

        @Stable
        @Deprecated
        public static float y(@l DrawScope drawScope0, long v) {
            return a.c(drawScope0, v);
        }

        @Stable
        @Deprecated
        public static float z(@l DrawScope drawScope0, float f) {
            return a.d(drawScope0, f);
        }
    }

    @l
    public static final Companion o0;

    static {
        DrawScope.o0 = Companion.a;
    }

    void B0(long arg1, float arg2, long arg3, float arg4, @l DrawStyle arg5, @m ColorFilter arg6, int arg7);

    void B1(@l List arg1, int arg2, long arg3, float arg4, int arg5, @m PathEffect arg6, float arg7, @m ColorFilter arg8, int arg9);

    void C0(long arg1, long arg2, long arg3, float arg4, @l DrawStyle arg5, @m ColorFilter arg6, int arg7);

    void D1(@l Brush arg1, long arg2, long arg3, float arg4, int arg5, @m PathEffect arg6, float arg7, @m ColorFilter arg8, int arg9);

    void E0(long arg1, float arg2, float arg3, boolean arg4, long arg5, long arg6, float arg7, @l DrawStyle arg8, @m ColorFilter arg9, int arg10);

    void H1(@l Brush arg1, float arg2, long arg3, float arg4, @l DrawStyle arg5, @m ColorFilter arg6, int arg7);

    long I();

    void I1(@l ImageBitmap arg1, long arg2, long arg3, long arg4, long arg5, float arg6, @l DrawStyle arg7, @m ColorFilter arg8, int arg9, int arg10);

    @l
    DrawContext J0();

    long b();

    void f1(long arg1, long arg2, long arg3, long arg4, @l DrawStyle arg5, float arg6, @m ColorFilter arg7, int arg8);

    @l
    LayoutDirection getLayoutDirection();

    void h0(@l List arg1, int arg2, @l Brush arg3, float arg4, int arg5, @m PathEffect arg6, float arg7, @m ColorFilter arg8, int arg9);

    @k(level = kotlin.m.c, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @c0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    void k1(ImageBitmap arg1, long arg2, long arg3, long arg4, long arg5, float arg6, DrawStyle arg7, ColorFilter arg8, int arg9);

    void l0(@l Path arg1, @l Brush arg2, float arg3, @l DrawStyle arg4, @m ColorFilter arg5, int arg6);

    void p1(long arg1, long arg2, long arg3, float arg4, @l DrawStyle arg5, @m ColorFilter arg6, int arg7);

    void s0(@l ImageBitmap arg1, long arg2, float arg3, @l DrawStyle arg4, @m ColorFilter arg5, int arg6);

    void u0(@l Brush arg1, long arg2, long arg3, float arg4, @l DrawStyle arg5, @m ColorFilter arg6, int arg7);

    void v0(long arg1, long arg2, long arg3, float arg4, int arg5, @m PathEffect arg6, float arg7, @m ColorFilter arg8, int arg9);

    void v1(@l Brush arg1, long arg2, long arg3, long arg4, float arg5, @l DrawStyle arg6, @m ColorFilter arg7, int arg8);

    void w0(@l Brush arg1, float arg2, float arg3, boolean arg4, long arg5, long arg6, float arg7, @l DrawStyle arg8, @m ColorFilter arg9, int arg10);

    void x0(@l Path arg1, long arg2, float arg3, @l DrawStyle arg4, @m ColorFilter arg5, int arg6);

    void x1(@l Brush arg1, long arg2, long arg3, float arg4, @l DrawStyle arg5, @m ColorFilter arg6, int arg7);
}

