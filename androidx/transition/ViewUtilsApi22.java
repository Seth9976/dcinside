package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(22)
class ViewUtilsApi22 extends ViewUtilsApi21 {
    @RequiresApi(29)
    static class Api29Impl {
        @DoNotInline
        static void a(View view0, int v, int v1, int v2, int v3) {
            view0.setLeftTopRightBottom(v, v1, v2, v3);
        }
    }

    private static boolean l = true;

    static {
    }

    @Override  // androidx.transition.ViewUtilsApi19
    @SuppressLint({"NewApi"})
    public void f(@NonNull View view0, int v, int v1, int v2, int v3) {
        if(ViewUtilsApi22.l) {
            try {
                Api29Impl.a(view0, v, v1, v2, v3);
            }
            catch(NoSuchMethodError unused_ex) {
                ViewUtilsApi22.l = false;
            }
        }
    }
}

