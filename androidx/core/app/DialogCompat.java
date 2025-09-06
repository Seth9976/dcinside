package androidx.core.app;

import android.app.Dialog;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.RequiresApi;

public class DialogCompat {
    @RequiresApi(28)
    static class Api28Impl {
        static Object a(Dialog dialog0, int v) {
            return dialog0.requireViewById(v);
        }
    }

    public static View a(Dialog dialog0, int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            return (View)Api28Impl.a(dialog0, v);
        }
        View view0 = dialog0.findViewById(v);
        if(view0 == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
        }
        return view0;
    }
}

