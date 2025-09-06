package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Vertices;
import androidx.compose.ui.graphics.c0;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class EmptyCanvas implements Canvas {
    @Override  // androidx.compose.ui.graphics.Canvas
    public void A(float f) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void B(float f, float f1) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void C(@l float[] arr_f) {
        L.p(arr_f, "matrix");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void D(@l Path path0, @l Paint paint0) {
        L.p(path0, "path");
        L.p(paint0, "paint");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void E(long v, float f, @l Paint paint0) {
        L.p(paint0, "paint");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void F(float f, float f1, float f2, float f3, float f4, float f5, @l Paint paint0) {
        L.p(paint0, "paint");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void a(float f, float f1, float f2, float f3, int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void c(float f, float f1) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void e(@l Path path0, int v) {
        L.p(path0, "path");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void f() {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void g(int v, @l List list0, @l Paint paint0) {
        L.p(list0, "points");
        L.p(paint0, "paint");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void h(@l ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, @l Paint paint0) {
        L.p(imageBitmap0, "image");
        L.p(paint0, "paint");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void i(int v, @l float[] arr_f, @l Paint paint0) {
        L.p(arr_f, "points");
        L.p(paint0, "paint");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void j(@l Vertices vertices0, int v, @l Paint paint0) {
        L.p(vertices0, "vertices");
        L.p(paint0, "paint");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void k(Rect rect0, float f, float f1, boolean z, Paint paint0) {
        c0.b(this, rect0, f, f1, z, paint0);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void l(float f, float f1, float f2, float f3, float f4, float f5, boolean z, @l Paint paint0) {
        L.p(paint0, "paint");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void m(@l Rect rect0, @l Paint paint0) {
        L.p(rect0, "bounds");
        L.p(paint0, "paint");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void n() {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void o(Rect rect0, Paint paint0) {
        c0.d(this, rect0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void p(Rect rect0, int v) {
        c0.a(this, rect0, v);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void q(Rect rect0, Paint paint0) {
        c0.e(this, rect0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void r(float f, float f1) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void s(float f, float f1, float f2, float f3, @l Paint paint0) {
        L.p(paint0, "paint");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void t(float f, float f1, float f2, float f3, @l Paint paint0) {
        L.p(paint0, "paint");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void u(@l ImageBitmap imageBitmap0, long v, @l Paint paint0) {
        L.p(imageBitmap0, "image");
        L.p(paint0, "paint");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void v() {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void w() {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void x(Rect rect0, float f, float f1, boolean z, Paint paint0) {
        c0.c(this, rect0, f, f1, z, paint0);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void y(long v, long v1, @l Paint paint0) {
        L.p(paint0, "paint");
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void z(float f, float f1) {
        c0.f(this, f, f1);
    }
}

