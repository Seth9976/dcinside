package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.WindowInsetsAnimationController;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;

public final class WindowInsetsAnimationControllerCompat {
    @RequiresApi(30)
    static class Impl30 extends Impl {
        private final WindowInsetsAnimationController a;

        Impl30(WindowInsetsAnimationController windowInsetsAnimationController0) {
            this.a = windowInsetsAnimationController0;
        }

        @Override  // androidx.core.view.WindowInsetsAnimationControllerCompat$Impl
        void a(boolean z) {
            this.a.finish(z);
        }

        @Override  // androidx.core.view.WindowInsetsAnimationControllerCompat$Impl
        public float b() {
            return this.a.getCurrentAlpha();
        }

        @Override  // androidx.core.view.WindowInsetsAnimationControllerCompat$Impl
        public float c() {
            return this.a.getCurrentFraction();
        }

        @Override  // androidx.core.view.WindowInsetsAnimationControllerCompat$Impl
        public Insets d() {
            return Insets.g(this.a.getCurrentInsets());
        }

        @Override  // androidx.core.view.WindowInsetsAnimationControllerCompat$Impl
        public Insets e() {
            return Insets.g(this.a.getHiddenStateInsets());
        }

        @Override  // androidx.core.view.WindowInsetsAnimationControllerCompat$Impl
        public Insets f() {
            return Insets.g(this.a.getShownStateInsets());
        }

        @Override  // androidx.core.view.WindowInsetsAnimationControllerCompat$Impl
        @SuppressLint({"WrongConstant"})
        public int g() {
            return this.a.getTypes();
        }

        @Override  // androidx.core.view.WindowInsetsAnimationControllerCompat$Impl
        boolean h() {
            return this.a.isCancelled();
        }

        @Override  // androidx.core.view.WindowInsetsAnimationControllerCompat$Impl
        boolean i() {
            return this.a.isFinished();
        }

        @Override  // androidx.core.view.WindowInsetsAnimationControllerCompat$Impl
        public void j(Insets insets0, float f, float f1) {
            android.graphics.Insets insets1 = insets0 == null ? null : insets0.h();
            this.a.setInsetsAndAlpha(insets1, f, f1);
        }
    }

    static class Impl {
        void a(boolean z) {
        }

        public float b() {
            return 0.0f;
        }

        @FloatRange(from = 0.0, to = 1.0)
        public float c() {
            return 0.0f;
        }

        public Insets d() {
            return Insets.e;
        }

        public Insets e() {
            return Insets.e;
        }

        public Insets f() {
            return Insets.e;
        }

        public int g() {
            return 0;
        }

        boolean h() {
            return true;
        }

        boolean i() {
            return false;
        }

        public void j(Insets insets0, @FloatRange(from = 0.0, to = 1.0) float f, @FloatRange(from = 0.0, to = 1.0) float f1) {
        }
    }

    private final Impl a;

    @RequiresApi(30)
    WindowInsetsAnimationControllerCompat(WindowInsetsAnimationController windowInsetsAnimationController0) {
        this.a = new Impl30(windowInsetsAnimationController0);
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public float b() {
        return this.a.b();
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float c() {
        return this.a.c();
    }

    public Insets d() {
        return this.a.d();
    }

    public Insets e() {
        return this.a.e();
    }

    public Insets f() {
        return this.a.f();
    }

    public int g() {
        return this.a.g();
    }

    public boolean h() {
        return this.a.h();
    }

    public boolean i() {
        return this.a.i();
    }

    // 去混淆评级： 低(20)
    public boolean j() {
        return !this.i() && !this.h();
    }

    public void k(Insets insets0, @FloatRange(from = 0.0, to = 1.0) float f, @FloatRange(from = 0.0, to = 1.0) float f1) {
        this.a.j(insets0, f, f1);
    }
}

