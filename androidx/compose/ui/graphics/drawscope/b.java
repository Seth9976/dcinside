package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class b {
    static {
    }

    public static void A(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        DrawStyle drawStyle1 = (v2 & 8) == 0 ? drawStyle0 : Fill.a;
        drawScope0.s0(imageBitmap0, ((v2 & 2) == 0 ? v : 0L), ((v2 & 4) == 0 ? f : 1.0f), drawStyle1, ((v2 & 16) == 0 ? colorFilter0 : null), ((v2 & 0x20) == 0 ? v1 : 3));
    }

    public static void B(DrawScope drawScope0, Brush brush0, long v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope0.D1(brush0, v, v1, ((v4 & 8) == 0 ? f : 0.0f), ((v4 & 16) == 0 ? v2 : 0), ((v4 & 0x20) == 0 ? pathEffect0 : null), ((v4 & 0x40) == 0 ? f1 : 1.0f), ((v4 & 0x80) == 0 ? colorFilter0 : null), ((v4 & 0x100) == 0 ? v3 : 3));
    }

    public static void C(DrawScope drawScope0, long v, long v1, long v2, float f, int v3, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v4, int v5, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope0.v0(v, v1, v2, ((v5 & 8) == 0 ? f : 0.0f), ((v5 & 16) == 0 ? v3 : 0), ((v5 & 0x20) == 0 ? pathEffect0 : null), ((v5 & 0x40) == 0 ? f1 : 1.0f), ((v5 & 0x80) == 0 ? colorFilter0 : null), ((v5 & 0x100) == 0 ? v4 : 3));
    }

    public static void D(DrawScope drawScope0, Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long v4 = (v3 & 2) == 0 ? v : 0L;
        long v5 = (v3 & 4) == 0 ? v1 : b.d(drawScope0, drawScope0.b(), v4);
        DrawStyle drawStyle1 = (v3 & 16) == 0 ? drawStyle0 : Fill.a;
        drawScope0.x1(brush0, v4, v5, ((v3 & 8) == 0 ? f : 1.0f), drawStyle1, ((v3 & 0x20) == 0 ? colorFilter0 : null), ((v3 & 0x40) == 0 ? v2 : 3));
    }

    public static void E(DrawScope drawScope0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long v5 = (v4 & 2) == 0 ? v1 : 0L;
        long v6 = (v4 & 4) == 0 ? v2 : b.d(drawScope0, drawScope0.b(), v5);
        DrawStyle drawStyle1 = (v4 & 16) == 0 ? drawStyle0 : Fill.a;
        drawScope0.C0(v, v5, v6, ((v4 & 8) == 0 ? f : 1.0f), drawStyle1, ((v4 & 0x20) == 0 ? colorFilter0 : null), ((v4 & 0x40) == 0 ? v3 : 3));
    }

    public static void F(DrawScope drawScope0, Path path0, Brush brush0, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if((v1 & 8) != 0) {
            drawStyle0 = Fill.a;
        }
        if((v1 & 16) != 0) {
            colorFilter0 = null;
        }
        if((v1 & 0x20) != 0) {
            v = 3;
        }
        drawScope0.l0(path0, brush0, ((v1 & 4) == 0 ? f : 1.0f), drawStyle0, colorFilter0, v);
    }

    public static void G(DrawScope drawScope0, Path path0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        DrawStyle drawStyle1 = (v2 & 8) == 0 ? drawStyle0 : Fill.a;
        drawScope0.x0(path0, v, ((v2 & 4) == 0 ? f : 1.0f), drawStyle1, ((v2 & 16) == 0 ? colorFilter0 : null), ((v2 & 0x20) == 0 ? v1 : 3));
    }

    public static void H(DrawScope drawScope0, List list0, int v, long v1, float f, int v2, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v3, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope0.B1(list0, v, v1, ((v4 & 8) == 0 ? f : 0.0f), ((v4 & 16) == 0 ? v2 : 0), ((v4 & 0x20) == 0 ? pathEffect0 : null), ((v4 & 0x40) == 0 ? f1 : 1.0f), ((v4 & 0x80) == 0 ? colorFilter0 : null), ((v4 & 0x100) == 0 ? v3 : 3));
    }

    public static void I(DrawScope drawScope0, List list0, int v, Brush brush0, float f, int v1, PathEffect pathEffect0, float f1, ColorFilter colorFilter0, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        drawScope0.h0(list0, v, brush0, ((v3 & 8) == 0 ? f : 0.0f), ((v3 & 16) == 0 ? v1 : 0), ((v3 & 0x20) == 0 ? pathEffect0 : null), ((v3 & 0x40) == 0 ? f1 : 1.0f), ((v3 & 0x80) == 0 ? colorFilter0 : null), ((v3 & 0x100) == 0 ? v2 : 3));
    }

    public static void J(DrawScope drawScope0, Brush brush0, long v, long v1, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long v4 = (v3 & 2) == 0 ? v : 0L;
        long v5 = (v3 & 4) == 0 ? v1 : b.d(drawScope0, drawScope0.b(), v4);
        DrawStyle drawStyle1 = (v3 & 16) == 0 ? drawStyle0 : Fill.a;
        drawScope0.u0(brush0, v4, v5, ((v3 & 8) == 0 ? f : 1.0f), drawStyle1, ((v3 & 0x20) == 0 ? colorFilter0 : null), ((v3 & 0x40) == 0 ? v2 : 3));
    }

    public static void K(DrawScope drawScope0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long v5 = (v4 & 2) == 0 ? v1 : 0L;
        long v6 = (v4 & 4) == 0 ? v2 : b.d(drawScope0, drawScope0.b(), v5);
        DrawStyle drawStyle1 = (v4 & 16) == 0 ? drawStyle0 : Fill.a;
        drawScope0.p1(v, v5, v6, ((v4 & 8) == 0 ? f : 1.0f), drawStyle1, ((v4 & 0x20) == 0 ? colorFilter0 : null), ((v4 & 0x40) == 0 ? v3 : 3));
    }

    public static void L(DrawScope drawScope0, Brush brush0, long v, long v1, long v2, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long v5 = (v4 & 2) == 0 ? v : 0L;
        long v6 = (v4 & 4) == 0 ? v1 : b.d(drawScope0, drawScope0.b(), v5);
        DrawStyle drawStyle1 = (v4 & 0x20) == 0 ? drawStyle0 : Fill.a;
        drawScope0.v1(brush0, v5, v6, ((v4 & 8) == 0 ? v2 : 0L), ((v4 & 16) == 0 ? f : 1.0f), drawStyle1, ((v4 & 0x40) == 0 ? colorFilter0 : null), ((v4 & 0x80) == 0 ? v3 : 3));
    }

    public static void M(DrawScope drawScope0, long v, long v1, long v2, long v3, DrawStyle drawStyle0, float f, ColorFilter colorFilter0, int v4, int v5, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long v6 = (v5 & 2) == 0 ? v1 : 0L;
        long v7 = (v5 & 4) == 0 ? v2 : b.d(drawScope0, drawScope0.b(), v6);
        DrawStyle drawStyle1 = (v5 & 16) == 0 ? drawStyle0 : Fill.a;
        drawScope0.f1(v, v6, v7, ((v5 & 8) == 0 ? v3 : 0L), drawStyle1, ((v5 & 0x20) == 0 ? f : 1.0f), ((v5 & 0x40) == 0 ? colorFilter0 : null), ((v5 & 0x80) == 0 ? v4 : 3));
    }

    public static void a(DrawScope drawScope0, @l ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v4, int v5) {
        L.p(imageBitmap0, "image");
        L.p(drawStyle0, "style");
        b.z(drawScope0, imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4, 0, 0x200, null);
    }

    public static long b(DrawScope drawScope0) {
        return SizeKt.b(drawScope0.J0().b());
    }

    public static long c(DrawScope drawScope0) {
        return drawScope0.J0().b();
    }

    public static long d(DrawScope drawScope0, long v, long v1) {
        return SizeKt.a(Size.t(v) - Offset.p(v1), Size.m(v) - Offset.r(v1));
    }

    public static void u(DrawScope drawScope0, Brush brush0, float f, float f1, boolean z, long v, long v1, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long v4 = (v3 & 16) == 0 ? v : 0L;
        long v5 = (v3 & 0x20) == 0 ? v1 : b.d(drawScope0, drawScope0.b(), v4);
        DrawStyle drawStyle1 = (v3 & 0x80) == 0 ? drawStyle0 : Fill.a;
        drawScope0.w0(brush0, f, f1, z, v4, v5, ((v3 & 0x40) == 0 ? f2 : 1.0f), drawStyle1, ((v3 & 0x100) == 0 ? colorFilter0 : null), ((v3 & 0x200) == 0 ? v2 : 3));
    }

    public static void v(DrawScope drawScope0, long v, float f, float f1, boolean z, long v1, long v2, float f2, DrawStyle drawStyle0, ColorFilter colorFilter0, int v3, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long v5 = (v4 & 16) == 0 ? v1 : 0L;
        long v6 = (v4 & 0x20) == 0 ? v2 : b.d(drawScope0, drawScope0.b(), v5);
        DrawStyle drawStyle1 = (v4 & 0x80) == 0 ? drawStyle0 : Fill.a;
        drawScope0.E0(v, f, f1, z, v5, v6, ((v4 & 0x40) == 0 ? f2 : 1.0f), drawStyle1, ((v4 & 0x100) == 0 ? colorFilter0 : null), ((v4 & 0x200) == 0 ? v3 : 3));
    }

    public static void w(DrawScope drawScope0, Brush brush0, float f, long v, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        float f2 = (v2 & 2) == 0 ? f : Size.q(drawScope0.b()) / 2.0f;
        long v3 = (v2 & 4) == 0 ? v : drawScope0.I();
        DrawStyle drawStyle1 = (v2 & 16) == 0 ? drawStyle0 : Fill.a;
        drawScope0.H1(brush0, f2, v3, ((v2 & 8) == 0 ? f1 : 1.0f), drawStyle1, ((v2 & 0x20) == 0 ? colorFilter0 : null), ((v2 & 0x40) == 0 ? v1 : 3));
    }

    public static void x(DrawScope drawScope0, long v, float f, long v1, float f1, DrawStyle drawStyle0, ColorFilter colorFilter0, int v2, int v3, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        float f2 = (v3 & 2) == 0 ? f : Size.q(drawScope0.b()) / 2.0f;
        long v4 = (v3 & 4) == 0 ? v1 : drawScope0.I();
        DrawStyle drawStyle1 = (v3 & 16) == 0 ? drawStyle0 : Fill.a;
        drawScope0.B0(v, f2, v4, ((v3 & 8) == 0 ? f1 : 1.0f), drawStyle1, ((v3 & 0x20) == 0 ? colorFilter0 : null), ((v3 & 0x40) == 0 ? v2 : 3));
    }

    public static void y(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4, int v5, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long v6 = (v5 & 4) == 0 ? v1 : IntSizeKt.a(imageBitmap0.getWidth(), imageBitmap0.getHeight());
        DrawStyle drawStyle1 = (v5 & 0x40) == 0 ? drawStyle0 : Fill.a;
        drawScope0.k1(imageBitmap0, ((v5 & 2) == 0 ? v : 0L), v6, ((v5 & 8) == 0 ? v2 : 0L), ((v5 & 16) == 0 ? v3 : v6), ((v5 & 0x20) == 0 ? f : 1.0f), drawStyle1, ((v5 & 0x80) == 0 ? colorFilter0 : null), ((v5 & 0x100) == 0 ? v4 : 3));
    }

    public static void z(DrawScope drawScope0, ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v4, int v5, int v6, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long v7 = (v6 & 4) == 0 ? v1 : IntSizeKt.a(imageBitmap0.getWidth(), imageBitmap0.getHeight());
        DrawStyle drawStyle1 = (v6 & 0x40) == 0 ? drawStyle0 : Fill.a;
        drawScope0.I1(imageBitmap0, ((v6 & 2) == 0 ? v : 0L), v7, ((v6 & 8) == 0 ? v2 : 0L), ((v6 & 16) == 0 ? v3 : v7), ((v6 & 0x20) == 0 ? f : 1.0f), drawStyle1, ((v6 & 0x80) == 0 ? colorFilter0 : null), ((v6 & 0x100) == 0 ? v4 : 3), ((v6 & 0x200) == 0 ? v5 : 1));
    }
}

