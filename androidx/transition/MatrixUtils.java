package androidx.transition;

import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.RectF;

class MatrixUtils {
    static final Matrix a;

    static {
        MatrixUtils.a = new Matrix() {
            void a() {
                throw new IllegalStateException("Matrix can not be modified");
            }

            @Override  // android.graphics.Matrix
            public boolean postConcat(Matrix matrix0) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean postRotate(float f) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean postRotate(float f, float f1, float f2) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean postScale(float f, float f1) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean postScale(float f, float f1, float f2, float f3) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean postSkew(float f, float f1) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean postSkew(float f, float f1, float f2, float f3) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean postTranslate(float f, float f1) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean preConcat(Matrix matrix0) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean preRotate(float f) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean preRotate(float f, float f1, float f2) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean preScale(float f, float f1) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean preScale(float f, float f1, float f2, float f3) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean preSkew(float f, float f1) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean preSkew(float f, float f1, float f2, float f3) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean preTranslate(float f, float f1) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public void reset() {
                this.a();
            }

            @Override  // android.graphics.Matrix
            public void set(Matrix matrix0) {
                this.a();
            }

            @Override  // android.graphics.Matrix
            public boolean setConcat(Matrix matrix0, Matrix matrix1) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean setPolyToPoly(float[] arr_f, int v, float[] arr_f1, int v1, int v2) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public boolean setRectToRect(RectF rectF0, RectF rectF1, Matrix.ScaleToFit matrix$ScaleToFit0) {
                this.a();
                return false;
            }

            @Override  // android.graphics.Matrix
            public void setRotate(float f) {
                this.a();
            }

            @Override  // android.graphics.Matrix
            public void setRotate(float f, float f1, float f2) {
                this.a();
            }

            @Override  // android.graphics.Matrix
            public void setScale(float f, float f1) {
                this.a();
            }

            @Override  // android.graphics.Matrix
            public void setScale(float f, float f1, float f2, float f3) {
                this.a();
            }

            @Override  // android.graphics.Matrix
            public void setSinCos(float f, float f1) {
                this.a();
            }

            @Override  // android.graphics.Matrix
            public void setSinCos(float f, float f1, float f2, float f3) {
                this.a();
            }

            @Override  // android.graphics.Matrix
            public void setSkew(float f, float f1) {
                this.a();
            }

            @Override  // android.graphics.Matrix
            public void setSkew(float f, float f1, float f2, float f3) {
                this.a();
            }

            @Override  // android.graphics.Matrix
            public void setTranslate(float f, float f1) {
                this.a();
            }

            @Override  // android.graphics.Matrix
            public void setValues(float[] arr_f) {
                this.a();
            }
        };
    }
}

