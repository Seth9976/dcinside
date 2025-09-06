package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class ViewUtilsApi21 extends ViewUtilsApi19 {
    @RequiresApi(29)
    static class Api29Impl {
        @DoNotInline
        static void a(View view0, Matrix matrix0) {
            view0.setAnimationMatrix(matrix0);
        }

        @DoNotInline
        static void b(View view0, Matrix matrix0) {
            view0.transformMatrixToGlobal(matrix0);
        }

        @DoNotInline
        static void c(View view0, Matrix matrix0) {
            view0.transformMatrixToLocal(matrix0);
        }
    }

    private static boolean i = true;
    private static boolean j = true;
    private static boolean k = true;

    static {
    }

    @Override  // androidx.transition.ViewUtilsApi19
    @SuppressLint({"NewApi"})
    public void e(@NonNull View view0, @Nullable Matrix matrix0) {
        if(ViewUtilsApi21.i) {
            try {
                Api29Impl.a(view0, matrix0);
            }
            catch(NoSuchMethodError unused_ex) {
                ViewUtilsApi21.i = false;
            }
        }
    }

    @Override  // androidx.transition.ViewUtilsApi19
    @SuppressLint({"NewApi"})
    public void i(@NonNull View view0, @NonNull Matrix matrix0) {
        if(ViewUtilsApi21.j) {
            try {
                Api29Impl.b(view0, matrix0);
            }
            catch(NoSuchMethodError unused_ex) {
                ViewUtilsApi21.j = false;
            }
        }
    }

    @Override  // androidx.transition.ViewUtilsApi19
    @SuppressLint({"NewApi"})
    public void j(@NonNull View view0, @NonNull Matrix matrix0) {
        if(ViewUtilsApi21.k) {
            try {
                Api29Impl.c(view0, matrix0);
            }
            catch(NoSuchMethodError unused_ex) {
                ViewUtilsApi21.k = false;
            }
        }
    }
}

