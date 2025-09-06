package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface c {
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final int U0 = 0;
        public static final int V0 = 1;
        public static final int W0 = 2;
        public static final int X0 = 3;

    }

    public interface b {
        void onConsentInfoUpdateFailure(@RecentlyNonNull e arg1);
    }

    public interface com.google.android.ump.c.c {
        void onConsentInfoUpdateSuccess();
    }

    public static enum d {
        @RecentlyNonNull
        UNKNOWN,
        @RecentlyNonNull
        NOT_REQUIRED,
        @RecentlyNonNull
        REQUIRED;

    }

    boolean canRequestAds();

    int getConsentStatus();

    @RecentlyNonNull
    d getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(@RecentlyNonNull Activity arg1, @RecentlyNonNull com.google.android.ump.d arg2, @RecentlyNonNull com.google.android.ump.c.c arg3, @RecentlyNonNull b arg4);

    void reset();
}

