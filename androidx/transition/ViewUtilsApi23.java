package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class ViewUtilsApi23 extends ViewUtilsApi22 {
    @RequiresApi(29)
    static class Api29Impl {
        @DoNotInline
        static void a(View view0, int v) {
            view0.setTransitionVisibility(v);
        }
    }

    private static boolean m = true;

    static {
    }

    @Override  // androidx.transition.ViewUtilsApi19
    @SuppressLint({"NewApi"})
    public void h(@NonNull View view0, int v) {
        if(Build.VERSION.SDK_INT == 28) {
            super.h(view0, v);
            return;
        }
        if(ViewUtilsApi23.m) {
            try {
                Api29Impl.a(view0, v);
            }
            catch(NoSuchMethodError unused_ex) {
                ViewUtilsApi23.m = false;
            }
        }
    }
}

