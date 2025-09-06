package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import kotlin.jvm.internal.L;
import y4.l;

final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    @l
    private final int[] a;
    @l
    private final float[] b;

    public CalculateMatrixToWindowApi21() {
        this.a = new int[2];
        this.b = Matrix.c(null, 1, null);
    }

    @Override  // androidx.compose.ui.platform.CalculateMatrixToWindow
    public void a(@l View view0, @l float[] arr_f) {
        L.p(view0, "view");
        L.p(arr_f, "matrix");
        Matrix.m(arr_f);
        this.d(view0, arr_f);
    }

    private final void b(float[] arr_f, android.graphics.Matrix matrix0) {
        AndroidMatrixConversions_androidKt.b(this.b, matrix0);
        AndroidComposeView_androidKt.h(arr_f, this.b);
    }

    private final void c(float[] arr_f, float f, float f1) {
        Matrix.m(this.b);
        Matrix.x(this.b, f, f1, 0.0f, 4, null);
        AndroidComposeView_androidKt.h(arr_f, this.b);
    }

    private final void d(View view0, float[] arr_f) {
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof View) {
            this.d(((View)viewParent0), arr_f);
            this.c(arr_f, -((float)view0.getScrollX()), -((float)view0.getScrollY()));
            this.c(arr_f, ((float)view0.getLeft()), ((float)view0.getTop()));
        }
        else {
            view0.getLocationInWindow(this.a);
            this.c(arr_f, -((float)view0.getScrollX()), -((float)view0.getScrollY()));
            this.c(arr_f, ((float)this.a[0]), ((float)this.a[1]));
        }
        android.graphics.Matrix matrix0 = view0.getMatrix();
        if(!matrix0.isIdentity()) {
            L.o(matrix0, "viewMatrix");
            this.b(arr_f, matrix0);
        }
    }
}

