package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import y4.l;

public interface ImageBitmap {
    public static final class Companion {
        static final Companion a;

        static {
            Companion.a = new Companion();
        }
    }

    public static final class DefaultImpls {
        public static void a(ImageBitmap imageBitmap0, int[] arr_v, int v, int v1, int v2, int v3, int v4, int v5, int v6, Object object0) {
            g0.a(imageBitmap0, arr_v, v, v1, v2, v3, v4, v5, v6, object0);
        }
    }

    @l
    public static final Companion a;

    static {
        ImageBitmap.a = Companion.a;
    }

    void a(@l int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    void b();

    boolean c();

    int d();

    @l
    ColorSpace e();

    int getHeight();

    int getWidth();
}

