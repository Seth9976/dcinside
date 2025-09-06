package androidx.core.splashscreen;

import android.window.SplashScreen.OnExitAnimationListener;
import android.window.SplashScreenView;

public final class i implements SplashScreen.OnExitAnimationListener {
    public final Impl31 a;
    public final OnExitAnimationListener b;

    public i(Impl31 splashScreen$Impl310, OnExitAnimationListener splashScreen$OnExitAnimationListener0) {
        this.a = splashScreen$Impl310;
        this.b = splashScreen$OnExitAnimationListener0;
    }

    @Override  // android.window.SplashScreen$OnExitAnimationListener
    public final void onSplashScreenExit(SplashScreenView splashScreenView0) {
        Impl31.G(this.a, this.b, splashScreenView0);
    }
}

