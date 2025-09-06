package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(29)
final class CalculateMatrixToWindowApi29 implements CalculateMatrixToWindow {
    @l
    private final Matrix a;
    @l
    private final int[] b;

    public CalculateMatrixToWindowApi29() {
        this.a = new Matrix();
        this.b = new int[2];
    }

    @Override  // androidx.compose.ui.platform.CalculateMatrixToWindow
    @DoNotInline
    public void a(@l View view0, @l float[] arr_f) {
        L.p(view0, "view");
        L.p(arr_f, "matrix");
        this.a.reset();
        view0.transformMatrixToGlobal(this.a);
        for(ViewParent viewParent0 = view0.getParent(); viewParent0 instanceof View; viewParent0 = view0.getParent()) {
            view0 = (View)viewParent0;
        }
        view0.getLocationOnScreen(this.b);
        int v = this.b[0];
        int v1 = this.b[1];
        view0.getLocationInWindow(this.b);
        this.a.postTranslate(((float)(this.b[0] - v)), ((float)(this.b[1] - v1)));
        AndroidMatrixConversions_androidKt.b(arr_f, this.a);
    }
}

