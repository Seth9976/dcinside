package androidx.core.splashscreen;

public final class b implements Runnable {
    public final SplashScreenViewProvider a;
    public final OnExitAnimationListener b;

    public b(SplashScreenViewProvider splashScreenViewProvider0, OnExitAnimationListener splashScreen$OnExitAnimationListener0) {
        this.a = splashScreenViewProvider0;
        this.b = splashScreen$OnExitAnimationListener0;
    }

    @Override
    public final void run() {
        Impl.f(this.a, this.b);
    }
}

