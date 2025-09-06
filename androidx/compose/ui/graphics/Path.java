package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.jvm.internal.L;
import y4.l;

public interface Path {
    public static final class Companion {
        static final Companion a;

        static {
            Companion.a = new Companion();
        }

        @l
        public final Path a(int v, @l Path path0, @l Path path1) {
            L.p(path0, "path1");
            L.p(path1, "path2");
            Path path2 = AndroidPath_androidKt.a();
            if(!path2.t(path0, path1, v)) {
                throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
            }
            return path2;
        }
    }

    public static final class DefaultImpls {
        public static void a(Path path0, Path path1, long v, int v1, Object object0) {
            h0.c(path0, path1, v, v1, object0);
        }

        @Deprecated
        public static void b(@l Path path0, @l Rect rect0, float f, float f1, boolean z) {
            L.p(rect0, "rect");
            h0.a(path0, rect0, f, f1, z);
        }
    }

    @l
    public static final Companion a;

    static {
        Path.a = Companion.a;
    }

    void a(@l Rect arg1, float arg2, float arg3, boolean arg4);

    void b(float arg1, float arg2);

    void c(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6);

    void close();

    void d(float arg1, float arg2, float arg3, float arg4);

    void e(@l Rect arg1);

    void f(long arg1);

    void g(@l Rect arg1, float arg2, float arg3);

    @l
    Rect getBounds();

    int h();

    void i(float arg1, float arg2);

    boolean isEmpty();

    void j(@l RoundRect arg1);

    void k(@l Rect arg1, float arg2, float arg3, boolean arg4);

    void l(@l Path arg1, long arg2);

    void m(float arg1, float arg2);

    boolean n();

    void o(float arg1, float arg2, float arg3, float arg4);

    void p(int arg1);

    void q(@l Rect arg1, float arg2, float arg3);

    void r(@l Rect arg1);

    void reset();

    void s(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6);

    boolean t(@l Path arg1, @l Path arg2, int arg3);

    void u(float arg1, float arg2);
}

