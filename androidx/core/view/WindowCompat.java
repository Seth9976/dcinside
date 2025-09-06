package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import androidx.annotation.IdRes;
import androidx.annotation.RequiresApi;

public final class WindowCompat {
    static class Api16Impl {
        static void a(Window window0, boolean z) {
            View view0 = window0.getDecorView();
            int v = view0.getSystemUiVisibility();
            view0.setSystemUiVisibility((z ? v & 0xFFFFF8FF : v | 0x700));
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        static Object a(Window window0, int v) {
            return window0.requireViewById(v);
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        static void a(Window window0, boolean z) {
            View view0 = window0.getDecorView();
            int v = view0.getSystemUiVisibility();
            view0.setSystemUiVisibility((z ? v & 0xFFFFFEFF : v | 0x100));
            window0.setDecorFitsSystemWindows(z);
        }
    }

    @RequiresApi(35)
    static class Api35Impl {
        static void a(Window window0, boolean z) {
            window0.setDecorFitsSystemWindows(z);
        }
    }

    public static final int a = 8;
    public static final int b = 9;
    public static final int c = 10;

    public static WindowInsetsControllerCompat a(Window window0, View view0) {
        return new WindowInsetsControllerCompat(window0, view0);
    }

    public static View b(Window window0, @IdRes int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            return (View)Api28Impl.a(window0, v);
        }
        View view0 = window0.findViewById(v);
        if(view0 == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this Window");
        }
        return view0;
    }

    public static void c(Window window0, boolean z) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 35) {
            Api35Impl.a(window0, z);
            return;
        }
        if(v >= 30) {
            Api30Impl.a(window0, z);
            return;
        }
        Api16Impl.a(window0, z);
    }
}

