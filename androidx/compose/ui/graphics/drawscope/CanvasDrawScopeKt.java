package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class CanvasDrawScopeKt {
    @l
    private static final Density a;

    static {
        CanvasDrawScopeKt.a = DensityKt.a(1.0f, 1.0f);
    }

    private static final DrawTransform c(DrawContext drawContext0) {
        return new DrawTransform() {
            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public long I() {
                return SizeKt.b(this.b());
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void a(float f, float f1, float f2, float f3, int v) {
                drawContext0.a().a(f, f1, f2, f3, v);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public long b() {
                return drawContext0.b();
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void c(float f, float f1) {
                drawContext0.a().c(f, f1);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void d(@l float[] arr_f) {
                L.p(arr_f, "matrix");
                drawContext0.a().C(arr_f);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void e(@l Path path0, int v) {
                L.p(path0, "path");
                drawContext0.a().e(path0, v);
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void f(float f, float f1, long v) {
                Canvas canvas0 = drawContext0.a();
                canvas0.c(Offset.p(v), Offset.r(v));
                canvas0.r(f, f1);
                canvas0.c(-Offset.p(v), -Offset.r(v));
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void g(float f, long v) {
                Canvas canvas0 = drawContext0.a();
                canvas0.c(Offset.p(v), Offset.r(v));
                canvas0.A(f);
                canvas0.c(-Offset.p(v), -Offset.r(v));
            }

            @Override  // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void h(float f, float f1, float f2, float f3) {
                Canvas canvas0 = drawContext0.a();
                DrawContext drawContext0 = drawContext0;
                long v = SizeKt.a(Size.t(this.b()) - (f2 + f), Size.m(this.b()) - (f3 + f1));
                if(Size.t(v) < 0.0f || Size.m(v) < 0.0f) {
                    throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
                }
                drawContext0.c(v);
                canvas0.c(f, f1);
            }
        };
    }
}

