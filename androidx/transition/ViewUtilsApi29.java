package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
class ViewUtilsApi29 extends ViewUtilsApi23 {
    @Override  // androidx.transition.ViewUtilsApi19
    public float c(@NonNull View view0) {
        return view0.getTransitionAlpha();
    }

    @Override  // androidx.transition.ViewUtilsApi21
    public void e(@NonNull View view0, @Nullable Matrix matrix0) {
        view0.setAnimationMatrix(matrix0);
    }

    @Override  // androidx.transition.ViewUtilsApi22
    public void f(@NonNull View view0, int v, int v1, int v2, int v3) {
        view0.setLeftTopRightBottom(v, v1, v2, v3);
    }

    @Override  // androidx.transition.ViewUtilsApi19
    public void g(@NonNull View view0, float f) {
        view0.setTransitionAlpha(f);
    }

    @Override  // androidx.transition.ViewUtilsApi23
    public void h(@NonNull View view0, int v) {
        view0.setTransitionVisibility(v);
    }

    @Override  // androidx.transition.ViewUtilsApi21
    public void i(@NonNull View view0, @NonNull Matrix matrix0) {
        view0.transformMatrixToGlobal(matrix0);
    }

    @Override  // androidx.transition.ViewUtilsApi21
    public void j(@NonNull View view0, @NonNull Matrix matrix0) {
        view0.transformMatrixToLocal(matrix0);
    }
}

