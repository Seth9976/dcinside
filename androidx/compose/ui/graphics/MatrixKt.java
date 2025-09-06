package androidx.compose.ui.graphics;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,440:1\n39#2:441\n39#2:442\n39#2:443\n39#2:444\n39#2:445\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n423#1:441\n424#1:442\n425#1:443\n426#1:444\n434#1:445\n*E\n"})
public final class MatrixKt {
    private static final float b(float[] arr_f, int v, float[] arr_f1, int v1) {
        return arr_f[v * 4] * arr_f1[v1] + arr_f[v * 4 + 1] * arr_f1[v1 + 4] + arr_f[v * 4 + 2] * arr_f1[v1 + 8] + arr_f[v * 4 + 3] * arr_f1[v1 + 12];
    }

    public static final boolean c(@l float[] arr_f) {
        L.p(arr_f, "$this$isIdentity");
        int v = 0;
        while(v < 4) {
            int v1 = 0;
            while(v1 < 4) {
                if(arr_f[v * 4 + v1] == (v == v1 ? 1.0f : 0.0f)) {
                    ++v1;
                    continue;
                }
                return false;
            }
            ++v;
        }
        return true;
    }
}

