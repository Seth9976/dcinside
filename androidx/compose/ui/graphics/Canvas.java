package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public interface Canvas {
    public static final class DefaultImpls {
        public static void a(Canvas canvas0, Path path0, int v, int v1, Object object0) {
            c0.m(canvas0, path0, v, v1, object0);
        }

        public static void b(Canvas canvas0, float f, float f1, float f2, float f3, int v, int v1, Object object0) {
            c0.n(canvas0, f, f1, f2, f3, v, v1, object0);
        }

        @Deprecated
        public static void c(@l Canvas canvas0, @l Rect rect0, int v) {
            L.p(rect0, "rect");
            c0.a(canvas0, rect0, v);
        }

        public static void d(Canvas canvas0, Rect rect0, int v, int v1, Object object0) {
            c0.o(canvas0, rect0, v, v1, object0);
        }

        @Deprecated
        public static void e(@l Canvas canvas0, @l Rect rect0, float f, float f1, boolean z, @l Paint paint0) {
            L.p(rect0, "rect");
            L.p(paint0, "paint");
            c0.b(canvas0, rect0, f, f1, z, paint0);
        }

        @Deprecated
        public static void f(@l Canvas canvas0, @l Rect rect0, float f, float f1, boolean z, @l Paint paint0) {
            L.p(rect0, "rect");
            L.p(paint0, "paint");
            c0.c(canvas0, rect0, f, f1, z, paint0);
        }

        public static void g(Canvas canvas0, ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, Paint paint0, int v4, Object object0) {
            c0.p(canvas0, imageBitmap0, v, v1, v2, v3, paint0, v4, object0);
        }

        @Deprecated
        public static void h(@l Canvas canvas0, @l Rect rect0, @l Paint paint0) {
            L.p(rect0, "rect");
            L.p(paint0, "paint");
            c0.d(canvas0, rect0, paint0);
        }

        @Deprecated
        public static void i(@l Canvas canvas0, @l Rect rect0, @l Paint paint0) {
            L.p(rect0, "rect");
            L.p(paint0, "paint");
            c0.e(canvas0, rect0, paint0);
        }

        public static void j(Canvas canvas0, float f, float f1, int v, Object object0) {
            c0.q(canvas0, f, f1, v, object0);
        }

        @Deprecated
        public static void k(@l Canvas canvas0, float f, float f1) {
            c0.f(canvas0, f, f1);
        }
    }

    void A(float arg1);

    void B(float arg1, float arg2);

    void C(@l float[] arg1);

    void D(@l Path arg1, @l Paint arg2);

    void E(long arg1, float arg2, @l Paint arg3);

    void F(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, @l Paint arg7);

    void a(float arg1, float arg2, float arg3, float arg4, int arg5);

    void c(float arg1, float arg2);

    void e(@l Path arg1, int arg2);

    void f();

    void g(int arg1, @l List arg2, @l Paint arg3);

    void h(@l ImageBitmap arg1, long arg2, long arg3, long arg4, long arg5, @l Paint arg6);

    void i(int arg1, @l float[] arg2, @l Paint arg3);

    void j(@l Vertices arg1, int arg2, @l Paint arg3);

    void k(@l Rect arg1, float arg2, float arg3, boolean arg4, @l Paint arg5);

    void l(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, boolean arg7, @l Paint arg8);

    void m(@l Rect arg1, @l Paint arg2);

    void n();

    void o(@l Rect arg1, @l Paint arg2);

    void p(@l Rect arg1, int arg2);

    void q(@l Rect arg1, @l Paint arg2);

    void r(float arg1, float arg2);

    void s(float arg1, float arg2, float arg3, float arg4, @l Paint arg5);

    void t(float arg1, float arg2, float arg3, float arg4, @l Paint arg5);

    void u(@l ImageBitmap arg1, long arg2, @l Paint arg3);

    void v();

    void w();

    void x(@l Rect arg1, float arg2, float arg3, boolean arg4, @l Paint arg5);

    void y(long arg1, long arg2, @l Paint arg3);

    void z(float arg1, float arg2);
}

