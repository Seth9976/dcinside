package androidx.core.splashscreen;

import android.window.SplashScreenView;
import j..time.Duration;
import j..time.TimeConversions;

public final class m {
    public static Duration a(SplashScreenView splashScreenView0) {
        return TimeConversions.convert(splashScreenView0.getIconAnimationDuration());
    }
}

