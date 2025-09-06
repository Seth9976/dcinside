package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;

@Deprecated
public interface CustomEventBanner extends CustomEvent {
    void requestBannerAd(@NonNull Context arg1, @NonNull CustomEventBannerListener arg2, @Nullable String arg3, @NonNull AdSize arg4, @NonNull MediationAdRequest arg5, @Nullable Bundle arg6);
}

