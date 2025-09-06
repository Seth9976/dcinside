package com.google.android.gms.ads.rewarded;

import androidx.annotation.NonNull;

public interface RewardItem {
    @NonNull
    public static final RewardItem DEFAULT_REWARD;

    static {
        RewardItem.DEFAULT_REWARD = new zza();
    }

    int getAmount();

    @NonNull
    String getType();
}

