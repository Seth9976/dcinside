package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SoftwareKeyboardControllerCompat {
    @RequiresApi(20)
    static class Impl20 extends Impl {
        private final View a;

        Impl20(View view0) {
            this.a = view0;
        }

        @Override  // androidx.core.view.SoftwareKeyboardControllerCompat$Impl
        void a() {
            View view0 = this.a;
            if(view0 != null) {
                ((InputMethodManager)view0.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
            }
        }

        @Override  // androidx.core.view.SoftwareKeyboardControllerCompat$Impl
        void b() {
            View view0 = this.a;
            if(view0 == null) {
                return;
            }
            if(view0.isInEditMode() || view0.onCheckIsTextEditor()) {
                view0.requestFocus();
            }
            else {
                view0 = view0.getRootView().findFocus();
            }
            if(view0 == null) {
                view0 = this.a.getRootView().findViewById(0x1020002);
            }
            if(view0 != null && view0.hasWindowFocus()) {
                view0.post(() -> ((InputMethodManager)view0.getContext().getSystemService("input_method")).showSoftInput(view0, 0));
            }
        }

        // 检测为 Lambda 实现
        private static void d(View view0) [...]
    }

    @RequiresApi(30)
    static class Impl30 extends Impl20 {
        private View b;
        private WindowInsetsController c;

        Impl30(View view0) {
            super(view0);
            this.b = view0;
        }

        Impl30(WindowInsetsController windowInsetsController0) {
            super(null);
            this.c = windowInsetsController0;
        }

        @Override  // androidx.core.view.SoftwareKeyboardControllerCompat$Impl20
        void a() {
            WindowInsetsController windowInsetsController0 = this.c;
            if(windowInsetsController0 == null) {
                windowInsetsController0 = this.b == null ? null : this.b.getWindowInsetsController();
            }
            if(windowInsetsController0 != null) {
                AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
                E e0 = (WindowInsetsController windowInsetsController0, int v) -> atomicBoolean0.set((v & 8) != 0);
                windowInsetsController0.addOnControllableInsetsChangedListener(e0);
                if(!atomicBoolean0.get()) {
                    View view0 = this.b;
                    if(view0 != null) {
                        ((InputMethodManager)view0.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.b.getWindowToken(), 0);
                    }
                }
                windowInsetsController0.removeOnControllableInsetsChangedListener(e0);
                windowInsetsController0.hide(z.a());
                return;
            }
            super.a();
        }

        @Override  // androidx.core.view.SoftwareKeyboardControllerCompat$Impl20
        void b() {
            View view0 = this.b;
            if(view0 != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager)view0.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController0 = this.c;
            if(windowInsetsController0 == null) {
                windowInsetsController0 = this.b == null ? null : this.b.getWindowInsetsController();
            }
            if(windowInsetsController0 != null) {
                windowInsetsController0.show(z.a());
            }
            super.b();
        }

        // 检测为 Lambda 实现
        private static void f(AtomicBoolean atomicBoolean0, WindowInsetsController windowInsetsController0, int v) [...]
    }

    static class Impl {
        void a() {
        }

        void b() {
        }
    }

    private final Impl a;

    public SoftwareKeyboardControllerCompat(View view0) {
        if(Build.VERSION.SDK_INT >= 30) {
            this.a = new Impl30(view0);
            return;
        }
        this.a = new Impl20(view0);
    }

    @RequiresApi(30)
    @Deprecated
    SoftwareKeyboardControllerCompat(WindowInsetsController windowInsetsController0) {
        this.a = new Impl30(windowInsetsController0);
    }

    public void a() {
        this.a.a();
    }

    public void b() {
        this.a.b();
    }
}

