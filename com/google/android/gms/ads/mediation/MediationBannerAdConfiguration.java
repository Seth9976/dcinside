package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import o3.j;

@j
public class MediationBannerAdConfiguration extends MediationAdConfiguration {
    private final AdSize zza;

    public MediationBannerAdConfiguration(@NonNull Context context0, @NonNull String s, @NonNull Bundle bundle0, @NonNull Bundle bundle1, boolean z, @Nullable Location location0, int v, int v1, @NonNull String s1, @NonNull AdSize adSize0, @NonNull String s2) {
        super(context0, s, bundle0, bundle1, z, location0, v, v1, s1, s2);
        this.zza = adSize0;
    }

    @NonNull
    public AdSize getAdSize() {
        return this.zza;
    }
}

