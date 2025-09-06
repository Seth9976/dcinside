package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.rewarded.RewardItem;

public interface MediationRewardedAdCallback extends MediationAdCallback {
    void onAdFailedToShow(@NonNull AdError arg1);

    @Deprecated
    void onAdFailedToShow(@NonNull String arg1);

    void onUserEarnedReward(@NonNull RewardItem arg1);

    void onVideoComplete();

    void onVideoStart();
}

