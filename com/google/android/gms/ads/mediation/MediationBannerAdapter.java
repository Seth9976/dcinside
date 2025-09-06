package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;

@Deprecated
public interface MediationBannerAdapter extends MediationAdapter {
    @NonNull
    View getBannerView();

    void requestBannerAd(@NonNull Context arg1, @NonNull MediationBannerListener arg2, @NonNull Bundle arg3, @NonNull AdSize arg4, @NonNull MediationAdRequest arg5, @Nullable Bundle arg6);
}

