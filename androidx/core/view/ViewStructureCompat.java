package androidx.core.view;

import android.os.Build.VERSION;
import android.view.ViewStructure;
import androidx.annotation.RequiresApi;

public class ViewStructureCompat {
    @RequiresApi(23)
    static class Api23Impl {
        static void a(ViewStructure viewStructure0, String s) {
            viewStructure0.setClassName(s);
        }

        static void b(ViewStructure viewStructure0, CharSequence charSequence0) {
            viewStructure0.setContentDescription(charSequence0);
        }

        static void c(ViewStructure viewStructure0, int v, int v1, int v2, int v3, int v4, int v5) {
            viewStructure0.setDimens(v, v1, v2, v3, v4, v5);
        }

        static void d(ViewStructure viewStructure0, CharSequence charSequence0) {
            viewStructure0.setText(charSequence0);
        }
    }

    private final Object a;

    private ViewStructureCompat(ViewStructure viewStructure0) {
        this.a = viewStructure0;
    }

    public void a(String s) {
        if(Build.VERSION.SDK_INT >= 23) {
            Api23Impl.a(((ViewStructure)this.a), s);
        }
    }

    public void b(CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 23) {
            Api23Impl.b(O.a(this.a), charSequence0);
        }
    }

    public void c(int v, int v1, int v2, int v3, int v4, int v5) {
        if(Build.VERSION.SDK_INT >= 23) {
            Api23Impl.c(((ViewStructure)this.a), v, v1, v2, v3, v4, v5);
        }
    }

    public void d(CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 23) {
            Api23Impl.d(O.a(this.a), charSequence0);
        }
    }

    @RequiresApi(23)
    public ViewStructure e() {
        return O.a(this.a);
    }

    @RequiresApi(23)
    public static ViewStructureCompat f(ViewStructure viewStructure0) {
        return new ViewStructureCompat(viewStructure0);
    }
}

