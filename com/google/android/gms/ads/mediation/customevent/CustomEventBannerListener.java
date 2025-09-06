package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import androidx.annotation.NonNull;

@Deprecated
public interface CustomEventBannerListener extends CustomEventListener {
    void onAdLoaded(@NonNull View arg1);
}

