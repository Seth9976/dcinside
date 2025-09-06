package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Path;
import y4.l;

@DrawScopeMarker
public interface DrawTransform {
    public static final class DefaultImpls {
        public static void a(DrawTransform drawTransform0, Path path0, int v, int v1, Object object0) {
            c.c(drawTransform0, path0, v, v1, object0);
        }

        public static void b(DrawTransform drawTransform0, float f, float f1, float f2, float f3, int v, int v1, Object object0) {
            c.d(drawTransform0, f, f1, f2, f3, v, v1, object0);
        }

        @Deprecated
        public static long c(@l DrawTransform drawTransform0) {
            return c.a(drawTransform0);
        }

        public static void d(DrawTransform drawTransform0, float f, long v, int v1, Object object0) {
            c.e(drawTransform0, f, v, v1, object0);
        }

        public static void e(DrawTransform drawTransform0, float f, float f1, long v, int v1, Object object0) {
            c.f(drawTransform0, f, f1, v, v1, object0);
        }

        public static void f(DrawTransform drawTransform0, float f, float f1, int v, Object object0) {
            c.g(drawTransform0, f, f1, v, object0);
        }
    }

    long I();

    void a(float arg1, float arg2, float arg3, float arg4, int arg5);

    long b();

    void c(float arg1, float arg2);

    void d(@l float[] arg1);

    void e(@l Path arg1, int arg2);

    void f(float arg1, float arg2, long arg3);

    void g(float arg1, long arg2);

    void h(float arg1, float arg2, float arg3, float arg4);
}

