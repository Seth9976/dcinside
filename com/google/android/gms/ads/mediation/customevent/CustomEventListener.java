package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

@Deprecated
public interface CustomEventListener {
    void onAdClicked();

    void onAdClosed();

    @Deprecated
    void onAdFailedToLoad(int arg1);

    void onAdFailedToLoad(@NonNull AdError arg1);

    void onAdLeftApplication();

    void onAdOpened();
}

