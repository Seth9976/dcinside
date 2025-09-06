package androidx.core.graphics;

import android.graphics.Matrix;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/core/graphics/MatrixKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class MatrixKt {
    @l
    public static final Matrix a(float f, float f1, float f2) {
        Matrix matrix0 = new Matrix();
        matrix0.setRotate(f, f1, f2);
        return matrix0;
    }

    public static Matrix b(float f, float f1, float f2, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        return MatrixKt.a(f, f1, f2);
    }

    @l
    public static final Matrix c(float f, float f1) {
        Matrix matrix0 = new Matrix();
        matrix0.setScale(f, f1);
        return matrix0;
    }

    public static Matrix d(float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 1.0f;
        }
        return MatrixKt.c(f, f1);
    }

    @l
    public static final Matrix e(@l Matrix matrix0, @l Matrix matrix1) {
        Matrix matrix2 = new Matrix(matrix0);
        matrix2.preConcat(matrix1);
        return matrix2;
    }

    @l
    public static final Matrix f(float f, float f1) {
        Matrix matrix0 = new Matrix();
        matrix0.setTranslate(f, f1);
        return matrix0;
    }

    public static Matrix g(float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        return MatrixKt.f(f, f1);
    }

    @l
    public static final float[] h(@l Matrix matrix0) {
        float[] arr_f = new float[9];
        matrix0.getValues(arr_f);
        return arr_f;
    }
}

