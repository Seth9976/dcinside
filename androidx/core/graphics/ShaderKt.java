package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.jvm.functions.Function1;
import y4.l;

public final class ShaderKt {
    public static final void a(@l Shader shader0, @l Function1 function10) {
        Matrix matrix0 = new Matrix();
        shader0.getLocalMatrix(matrix0);
        function10.invoke(matrix0);
        shader0.setLocalMatrix(matrix0);
    }
}

