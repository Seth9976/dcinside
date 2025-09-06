package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ShaderKt {
    @l
    public static final Shader a(@l ImageBitmap imageBitmap0, int v, int v1) {
        L.p(imageBitmap0, "image");
        return AndroidShader_androidKt.a(imageBitmap0, v, v1);
    }

    public static Shader b(ImageBitmap imageBitmap0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        return ShaderKt.a(imageBitmap0, v, v1);
    }

    @l
    public static final Shader c(long v, long v1, @l List list0, @m List list1, int v2) {
        L.p(list0, "colors");
        return AndroidShader_androidKt.b(v, v1, list0, list1, v2);
    }

    public static Shader d(long v, long v1, List list0, List list1, int v2, int v3, Object object0) {
        if((v3 & 8) != 0) {
            list1 = null;
        }
        if((v3 & 16) != 0) {
            v2 = 0;
        }
        return ShaderKt.c(v, v1, list0, list1, v2);
    }

    @l
    public static final Shader e(long v, float f, @l List list0, @m List list1, int v1) {
        L.p(list0, "colors");
        return AndroidShader_androidKt.c(v, f, list0, list1, v1);
    }

    public static Shader f(long v, float f, List list0, List list1, int v1, int v2, Object object0) {
        if((v2 & 8) != 0) {
            list1 = null;
        }
        if((v2 & 16) != 0) {
            v1 = 0;
        }
        return ShaderKt.e(v, f, list0, list1, v1);
    }

    @l
    public static final Shader g(long v, @l List list0, @m List list1) {
        L.p(list0, "colors");
        return AndroidShader_androidKt.d(v, list0, list1);
    }

    public static Shader h(long v, List list0, List list1, int v1, Object object0) {
        if((v1 & 4) != 0) {
            list1 = null;
        }
        return ShaderKt.g(v, list0, list1);
    }
}

