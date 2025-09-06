package androidx.compose.animation;

import androidx.compose.ui.graphics.Color.Companion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class ColorVectorConverterKt {
    @l
    private static final Function1 a;
    @l
    private static final float[] b;
    @l
    private static final float[] c;

    static {
        ColorVectorConverterKt.a = ColorVectorConverterKt.ColorToVector.1.e;
        ColorVectorConverterKt.b = new float[]{0.804057f, 0.026893f, 0.045865f, 0.318839f, 0.931961f, 0.262998f, -0.114194f, 0.051054f, 0.839998f};
        ColorVectorConverterKt.c = new float[]{1.248501f, -0.032857f, -0.057883f, -0.483319f, 1.104451f, -0.319407f, 0.199104f, -0.071593f, 1.202023f};
    }

    @l
    public static final Function1 d(@l Companion color$Companion0) {
        L.p(color$Companion0, "<this>");
        return ColorVectorConverterKt.a;
    }

    private static final float e(int v, float f, float f1, float f2, float[] arr_f) {
        return f * arr_f[v] + f1 * arr_f[v + 3] + f2 * arr_f[v + 6];
    }
}

