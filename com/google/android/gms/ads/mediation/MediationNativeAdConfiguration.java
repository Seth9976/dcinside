package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbfl;
import o3.j;

@j
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    @Nullable
    private final zzbfl zza;

    public MediationNativeAdConfiguration(Context context0, String s, Bundle bundle0, Bundle bundle1, boolean z, @Nullable Location location0, int v, int v1, @Nullable String s1, String s2, @Nullable zzbfl zzbfl0) {
        super(context0, s, bundle0, bundle1, z, location0, v, v1, s1, s2);
        this.zza = zzbfl0;
    }

    @NonNull
    public NativeAdOptions getNativeAdOptions() {
        return zzbfl.zza(this.zza);
    }
}

