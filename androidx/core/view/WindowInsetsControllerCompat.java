package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController.OnControllableInsetsChangedListener;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;

public final class WindowInsetsControllerCompat {
    @RequiresApi(20)
    static class Impl20 extends Impl {
        protected final Window b;
        private final SoftwareKeyboardControllerCompat c;

        Impl20(Window window0, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat0) {
            this.b = window0;
            this.c = softwareKeyboardControllerCompat0;
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        void a(OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        void b(int v, long v1, Interpolator interpolator0, CancellationSignal cancellationSignal0, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat0) {
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        int c() {
            Object object0 = this.b.getDecorView().getTag(356039078);
            return object0 == null ? 1 : ((int)(((Integer)object0)));
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        void d(int v) {
            for(int v1 = 1; v1 <= 0x200; v1 <<= 1) {
                if((v & v1) != 0) {
                    this.l(v1);
                }
            }
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        void g(OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        void j(int v) {
            this.b.getDecorView().setTag(356039078, v);
            switch(v) {
                case 0: {
                    this.p(0x1800);
                    return;
                }
                case 1: {
                    this.p(0x1000);
                    this.m(0x800);
                    return;
                }
                case 2: {
                    this.p(0x800);
                    this.m(0x1000);
                }
            }
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        void k(int v) {
            for(int v1 = 1; v1 <= 0x200; v1 <<= 1) {
                if((v & v1) != 0) {
                    this.o(v1);
                }
            }
        }

        private void l(int v) {
            switch(v) {
                case 1: {
                    this.m(4);
                    return;
                }
                case 2: {
                    this.m(2);
                    return;
                }
                case 8: {
                    this.c.a();
                }
            }
        }

        protected void m(int v) {
            View view0 = this.b.getDecorView();
            view0.setSystemUiVisibility(v | view0.getSystemUiVisibility());
        }

        protected void n(int v) {
            this.b.addFlags(v);
        }

        private void o(int v) {
            switch(v) {
                case 1: {
                    this.p(4);
                    this.q(0x400);
                    return;
                }
                case 2: {
                    this.p(2);
                    return;
                }
                case 8: {
                    this.c.b();
                }
            }
        }

        protected void p(int v) {
            View view0 = this.b.getDecorView();
            view0.setSystemUiVisibility(~v & view0.getSystemUiVisibility());
        }

        protected void q(int v) {
            this.b.clearFlags(v);
        }
    }

    @RequiresApi(23)
    static class Impl23 extends Impl20 {
        Impl23(Window window0, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat0) {
            super(window0, softwareKeyboardControllerCompat0);
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        public boolean f() {
            return (this.b.getDecorView().getSystemUiVisibility() & 0x2000) != 0;
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        public void i(boolean z) {
            if(z) {
                this.q(0x4000000);
                this.n(0x80000000);
                this.m(0x2000);
                return;
            }
            this.p(0x2000);
        }
    }

    @RequiresApi(26)
    static class Impl26 extends Impl23 {
        Impl26(Window window0, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat0) {
            super(window0, softwareKeyboardControllerCompat0);
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        public boolean e() {
            return (this.b.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        public void h(boolean z) {
            if(z) {
                this.q(0x8000000);
                this.n(0x80000000);
                this.m(16);
                return;
            }
            this.p(16);
        }
    }

    @RequiresApi(30)
    static class Impl30 extends Impl {
        final WindowInsetsControllerCompat b;
        final WindowInsetsController c;
        final SoftwareKeyboardControllerCompat d;
        private final SimpleArrayMap e;
        protected Window f;

        Impl30(Window window0, WindowInsetsControllerCompat windowInsetsControllerCompat0, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat0) {
            this(window0.getInsetsController(), windowInsetsControllerCompat0, softwareKeyboardControllerCompat0);
            this.f = window0;
        }

        Impl30(WindowInsetsController windowInsetsController0, WindowInsetsControllerCompat windowInsetsControllerCompat0, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat0) {
            this.e = new SimpleArrayMap();
            this.c = windowInsetsController0;
            this.b = windowInsetsControllerCompat0;
            this.d = softwareKeyboardControllerCompat0;
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        void a(OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
            if(this.e.containsKey(windowInsetsControllerCompat$OnControllableInsetsChangedListener0)) {
                return;
            }
            R0 r00 = (WindowInsetsController windowInsetsController0, int v) -> if(this.c == windowInsetsController0) {
                windowInsetsControllerCompat$OnControllableInsetsChangedListener0.a(this.b, v);
            };
            this.e.put(windowInsetsControllerCompat$OnControllableInsetsChangedListener0, r00);
            this.c.addOnControllableInsetsChangedListener(r00);
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        void b(int v, long v1, Interpolator interpolator0, CancellationSignal cancellationSignal0, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat0) {
            androidx.core.view.WindowInsetsControllerCompat.Impl30.1 windowInsetsControllerCompat$Impl30$10 = new WindowInsetsAnimationControlListener() {
                private WindowInsetsAnimationControllerCompat a;
                final Impl30 c;

                {
                    WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat0 = windowInsetsAnimationControlListenerCompat0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.a = null;
                }

                @Override  // android.view.WindowInsetsAnimationControlListener
                public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController0) {
                    windowInsetsAnimationControlListenerCompat0.a((windowInsetsAnimationController0 == null ? null : this.a));
                }

                @Override  // android.view.WindowInsetsAnimationControlListener
                public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController0) {
                    windowInsetsAnimationControlListenerCompat0.c(this.a);
                }

                @Override  // android.view.WindowInsetsAnimationControlListener
                public void onReady(WindowInsetsAnimationController windowInsetsAnimationController0, int v) {
                    WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat0 = new WindowInsetsAnimationControllerCompat(windowInsetsAnimationController0);
                    this.a = windowInsetsAnimationControllerCompat0;
                    windowInsetsAnimationControlListenerCompat0.b(windowInsetsAnimationControllerCompat0, v);
                }
            };
            this.c.controlWindowInsetsAnimation(v, v1, interpolator0, cancellationSignal0, windowInsetsControllerCompat$Impl30$10);
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        @SuppressLint({"WrongConstant"})
        int c() {
            Window window0 = this.f;
            if(window0 != null) {
                Object object0 = window0.getDecorView().getTag(356039078);
                return object0 == null ? 1 : ((int)(((Integer)object0)));
            }
            return this.c.getSystemBarsBehavior();
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        void d(int v) {
            if((v & 8) != 0) {
                this.d.a();
            }
            this.c.hide(v & -9);
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        public boolean e() {
            this.c.setSystemBarsAppearance(0, 0);
            return (this.c.getSystemBarsAppearance() & 16) != 0;
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        public boolean f() {
            this.c.setSystemBarsAppearance(0, 0);
            return (this.c.getSystemBarsAppearance() & 8) != 0;
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        void g(OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
            WindowInsetsController.OnControllableInsetsChangedListener windowInsetsController$OnControllableInsetsChangedListener0 = P0.a(this.e.remove(windowInsetsControllerCompat$OnControllableInsetsChangedListener0));
            if(windowInsetsController$OnControllableInsetsChangedListener0 != null) {
                this.c.removeOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListener0);
            }
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        public void h(boolean z) {
            if(z) {
                if(this.f != null) {
                    this.n(16);
                }
                this.c.setSystemBarsAppearance(16, 16);
                return;
            }
            if(this.f != null) {
                this.o(16);
            }
            this.c.setSystemBarsAppearance(0, 16);
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        public void i(boolean z) {
            if(z) {
                if(this.f != null) {
                    this.n(0x2000);
                }
                this.c.setSystemBarsAppearance(8, 8);
                return;
            }
            if(this.f != null) {
                this.o(0x2000);
            }
            this.c.setSystemBarsAppearance(0, 8);
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        void j(int v) {
            Window window0 = this.f;
            if(window0 != null) {
                window0.getDecorView().setTag(356039078, v);
                switch(v) {
                    case 0: {
                        this.o(0x1800);
                        return;
                    }
                    case 1: {
                        this.o(0x1000);
                        this.n(0x800);
                        return;
                    }
                    case 2: {
                        this.o(0x800);
                        this.n(0x1000);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            this.c.setSystemBarsBehavior(v);
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl
        void k(int v) {
            if((v & 8) != 0) {
                this.d.b();
            }
            this.c.show(v & -9);
        }

        // 检测为 Lambda 实现
        private void m(OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0, WindowInsetsController windowInsetsController0, int v) [...]

        protected void n(int v) {
            View view0 = this.f.getDecorView();
            view0.setSystemUiVisibility(v | view0.getSystemUiVisibility());
        }

        protected void o(int v) {
            View view0 = this.f.getDecorView();
            view0.setSystemUiVisibility(~v & view0.getSystemUiVisibility());
        }
    }

    @RequiresApi(0x1F)
    static class Impl31 extends Impl30 {
        Impl31(Window window0, WindowInsetsControllerCompat windowInsetsControllerCompat0, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat0) {
            super(window0, windowInsetsControllerCompat0, softwareKeyboardControllerCompat0);
        }

        Impl31(WindowInsetsController windowInsetsController0, WindowInsetsControllerCompat windowInsetsControllerCompat0, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat0) {
            super(windowInsetsController0, windowInsetsControllerCompat0, softwareKeyboardControllerCompat0);
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl30
        @SuppressLint({"WrongConstant"})
        int c() {
            return this.c.getSystemBarsBehavior();
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl30
        void j(int v) {
            this.c.setSystemBarsBehavior(v);
        }
    }

    @RequiresApi(35)
    static class Impl35 extends Impl31 {
        Impl35(Window window0, WindowInsetsControllerCompat windowInsetsControllerCompat0, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat0) {
            super(window0, windowInsetsControllerCompat0, softwareKeyboardControllerCompat0);
        }

        Impl35(WindowInsetsController windowInsetsController0, WindowInsetsControllerCompat windowInsetsControllerCompat0, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat0) {
            super(windowInsetsController0, windowInsetsControllerCompat0, softwareKeyboardControllerCompat0);
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl30
        public boolean e() {
            return (this.c.getSystemBarsAppearance() & 16) != 0;
        }

        @Override  // androidx.core.view.WindowInsetsControllerCompat$Impl30
        public boolean f() {
            return (this.c.getSystemBarsAppearance() & 8) != 0;
        }
    }

    static class Impl {
        static final int a = 356039078;

        void a(OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
        }

        void b(int v, long v1, Interpolator interpolator0, CancellationSignal cancellationSignal0, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat0) {
        }

        int c() {
            return 1;
        }

        void d(int v) {
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        void g(OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
        }

        public void h(boolean z) {
        }

        public void i(boolean z) {
        }

        void j(int v) {
        }

        void k(int v) {
        }
    }

    public interface OnControllableInsetsChangedListener {
        void a(WindowInsetsControllerCompat arg1, int arg2);
    }

    private final Impl a;
    @Deprecated
    public static final int b = 0;
    public static final int c = 1;
    @Deprecated
    public static final int d = 1;
    public static final int e = 2;

    public WindowInsetsControllerCompat(Window window0, View view0) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat0 = new SoftwareKeyboardControllerCompat(view0);
        int v = Build.VERSION.SDK_INT;
        if(v >= 35) {
            this.a = new Impl35(window0, this, softwareKeyboardControllerCompat0);
            return;
        }
        if(v >= 30) {
            this.a = new Impl30(window0, this, softwareKeyboardControllerCompat0);
            return;
        }
        if(v >= 26) {
            this.a = new Impl26(window0, softwareKeyboardControllerCompat0);
            return;
        }
        if(v >= 23) {
            this.a = new Impl23(window0, softwareKeyboardControllerCompat0);
            return;
        }
        this.a = new Impl20(window0, softwareKeyboardControllerCompat0);
    }

    @RequiresApi(30)
    @Deprecated
    private WindowInsetsControllerCompat(WindowInsetsController windowInsetsController0) {
        if(Build.VERSION.SDK_INT >= 35) {
            this.a = new Impl35(windowInsetsController0, this, new SoftwareKeyboardControllerCompat(windowInsetsController0));
            return;
        }
        this.a = new Impl30(windowInsetsController0, this, new SoftwareKeyboardControllerCompat(windowInsetsController0));
    }

    public void a(OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
        this.a.a(windowInsetsControllerCompat$OnControllableInsetsChangedListener0);
    }

    public void b(int v, long v1, Interpolator interpolator0, CancellationSignal cancellationSignal0, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat0) {
        this.a.b(v, v1, interpolator0, cancellationSignal0, windowInsetsAnimationControlListenerCompat0);
    }

    @SuppressLint({"WrongConstant"})
    public int c() {
        return this.a.c();
    }

    public void d(int v) {
        this.a.d(v);
    }

    public boolean e() {
        return this.a.e();
    }

    public boolean f() {
        return this.a.f();
    }

    public void g(OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
        this.a.g(windowInsetsControllerCompat$OnControllableInsetsChangedListener0);
    }

    public void h(boolean z) {
        this.a.h(z);
    }

    public void i(boolean z) {
        this.a.i(z);
    }

    public void j(int v) {
        this.a.j(v);
    }

    public void k(int v) {
        this.a.k(v);
    }

    @RequiresApi(30)
    @Deprecated
    public static WindowInsetsControllerCompat l(WindowInsetsController windowInsetsController0) {
        return new WindowInsetsControllerCompat(windowInsetsController0);
    }
}

