package androidx.core.splashscreen;

import android.window.SplashScreenView;
import j..time.Instant;
import j..time.TimeConversions;

public final class l {
    public static Instant a(SplashScreenView splashScreenView0) {
        return TimeConversions.convert(splashScreenView0.getIconAnimationStart());
    }
}

