package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAndroidMatrixConversions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMatrixConversions.android.kt\nandroidx/compose/ui/graphics/AndroidMatrixConversions_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,112:1\n39#2:113\n39#2:114\n39#2:115\n39#2:116\n39#2:117\n39#2:118\n39#2:119\n*S KotlinDebug\n*F\n+ 1 AndroidMatrixConversions.android.kt\nandroidx/compose/ui/graphics/AndroidMatrixConversions_androidKt\n*L\n58#1:113\n59#1:114\n60#1:115\n61#1:116\n62#1:117\n63#1:118\n64#1:119\n*E\n"})
public final class AndroidMatrixConversions_androidKt {
    public static final void a(@l Matrix matrix0, @l float[] arr_f) {
        L.p(matrix0, "$this$setFrom");
        L.p(arr_f, "matrix");
        if(arr_f[2] != 0.0f || arr_f[6] != 0.0f || arr_f[10] != 1.0f || arr_f[14] != 0.0f || arr_f[8] != 0.0f || arr_f[9] != 0.0f || arr_f[11] != 0.0f) {
            throw new IllegalArgumentException("Android does not support arbitrary transforms");
        }
        float f = arr_f[0];
        float f1 = arr_f[1];
        float f2 = arr_f[3];
        float f3 = arr_f[4];
        float f4 = arr_f[5];
        float f5 = arr_f[7];
        float f6 = arr_f[12];
        float f7 = arr_f[13];
        float f8 = arr_f[15];
        arr_f[0] = f;
        arr_f[1] = f3;
        arr_f[2] = f6;
        arr_f[3] = f1;
        arr_f[4] = f4;
        arr_f[5] = f7;
        arr_f[6] = f2;
        arr_f[7] = f5;
        arr_f[8] = f8;
        matrix0.setValues(arr_f);
        arr_f[0] = f;
        arr_f[1] = f1;
        arr_f[2] = 0.0f;
        arr_f[3] = f2;
        arr_f[4] = f3;
        arr_f[5] = f4;
        arr_f[6] = 0.0f;
        arr_f[7] = f5;
        arr_f[8] = 0.0f;
    }

    public static final void b(@l float[] arr_f, @l Matrix matrix0) {
        L.p(arr_f, "$this$setFrom");
        L.p(matrix0, "matrix");
        matrix0.getValues(arr_f);
        float f = arr_f[0];
        float f1 = arr_f[1];
        float f2 = arr_f[2];
        float f3 = arr_f[3];
        float f4 = arr_f[4];
        float f5 = arr_f[5];
        float f6 = arr_f[6];
        float f7 = arr_f[7];
        float f8 = arr_f[8];
        arr_f[0] = f;
        arr_f[1] = f3;
        arr_f[2] = 0.0f;
        arr_f[3] = f6;
        arr_f[4] = f1;
        arr_f[5] = f4;
        arr_f[6] = 0.0f;
        arr_f[7] = f7;
        arr_f[8] = 0.0f;
        arr_f[9] = 0.0f;
        arr_f[10] = 1.0f;
        arr_f[11] = 0.0f;
        arr_f[12] = f2;
        arr_f[13] = f5;
        arr_f[14] = 0.0f;
        arr_f[15] = f8;
    }
}

