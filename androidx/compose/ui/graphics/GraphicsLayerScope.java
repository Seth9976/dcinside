package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.a;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface GraphicsLayerScope extends Density {
    public static final class DefaultImpls {
        @Deprecated
        public static long a(@l GraphicsLayerScope graphicsLayerScope0) {
            return f0.a(graphicsLayerScope0);
        }

        public static void b() {
        }

        @Deprecated
        public static int c(@l GraphicsLayerScope graphicsLayerScope0) {
            return f0.b(graphicsLayerScope0);
        }

        @Deprecated
        @m
        public static RenderEffect d(@l GraphicsLayerScope graphicsLayerScope0) {
            return f0.l(graphicsLayerScope0);
        }

        @Deprecated
        public static long e(@l GraphicsLayerScope graphicsLayerScope0) {
            return f0.d(graphicsLayerScope0);
        }

        @Deprecated
        public static long f(@l GraphicsLayerScope graphicsLayerScope0) {
            return f0.e(graphicsLayerScope0);
        }

        @Stable
        @Deprecated
        public static int g(@l GraphicsLayerScope graphicsLayerScope0, long v) {
            return a.a(graphicsLayerScope0, v);
        }

        @Stable
        @Deprecated
        public static int h(@l GraphicsLayerScope graphicsLayerScope0, float f) {
            return a.b(graphicsLayerScope0, f);
        }

        @Deprecated
        public static void i(@l GraphicsLayerScope graphicsLayerScope0, long v) {
        }

        @Deprecated
        public static void j(@l GraphicsLayerScope graphicsLayerScope0, int v) {
        }

        @Deprecated
        public static void k(@l GraphicsLayerScope graphicsLayerScope0, @m RenderEffect renderEffect0) {
        }

        @Deprecated
        public static void l(@l GraphicsLayerScope graphicsLayerScope0, long v) {
        }

        @Stable
        @Deprecated
        public static float m(@l GraphicsLayerScope graphicsLayerScope0, long v) {
            return a.c(graphicsLayerScope0, v);
        }

        @Stable
        @Deprecated
        public static float n(@l GraphicsLayerScope graphicsLayerScope0, float f) {
            return a.d(graphicsLayerScope0, f);
        }

        @Stable
        @Deprecated
        public static float o(@l GraphicsLayerScope graphicsLayerScope0, int v) {
            return a.e(graphicsLayerScope0, v);
        }

        @Stable
        @Deprecated
        public static long p(@l GraphicsLayerScope graphicsLayerScope0, long v) {
            return a.f(graphicsLayerScope0, v);
        }

        @Stable
        @Deprecated
        public static float q(@l GraphicsLayerScope graphicsLayerScope0, long v) {
            return a.g(graphicsLayerScope0, v);
        }

        @Stable
        @Deprecated
        public static float r(@l GraphicsLayerScope graphicsLayerScope0, float f) {
            return a.h(graphicsLayerScope0, f);
        }

        @Stable
        @Deprecated
        @l
        public static Rect s(@l GraphicsLayerScope graphicsLayerScope0, @l DpRect dpRect0) {
            L.p(dpRect0, "$receiver");
            return a.i(graphicsLayerScope0, dpRect0);
        }

        @Stable
        @Deprecated
        public static long t(@l GraphicsLayerScope graphicsLayerScope0, long v) {
            return a.j(graphicsLayerScope0, v);
        }

        @Stable
        @Deprecated
        public static long u(@l GraphicsLayerScope graphicsLayerScope0, float f) {
            return a.k(graphicsLayerScope0, f);
        }

        @Stable
        @Deprecated
        public static long v(@l GraphicsLayerScope graphicsLayerScope0, float f) {
            return a.l(graphicsLayerScope0, f);
        }

        @Stable
        @Deprecated
        public static long w(@l GraphicsLayerScope graphicsLayerScope0, int v) {
            return a.m(graphicsLayerScope0, v);
        }
    }

    void A(float arg1);

    float F();

    @l
    Shape F0();

    float G();

    void I0(@l Shape arg1);

    float N();

    float O();

    float P0();

    void R(float arg1);

    void T(@m RenderEffect arg1);

    float V();

    long V0();

    void W(float arg1);

    float Y();

    void Z0(long arg1);

    void a0(float arg1);

    long a1();

    long b();

    float b0();

    void c1(long arg1);

    boolean d();

    float i();

    void j(float arg1);

    @m
    RenderEffect l();

    void n(float arg1);

    long n0();

    void o0(boolean arg1);

    void p0(long arg1);

    void q(int arg1);

    void q0(float arg1);

    float t();

    void w(float arg1);

    void x(float arg1);

    void y(float arg1);

    int z();
}

