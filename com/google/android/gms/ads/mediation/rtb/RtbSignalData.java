package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

public class RtbSignalData {
    private final Context zza;
    private final List zzb;
    private final Bundle zzc;
    @Nullable
    private final AdSize zzd;

    public RtbSignalData(@NonNull Context context0, @NonNull List list0, @NonNull Bundle bundle0, @Nullable AdSize adSize0) {
        this.zza = context0;
        this.zzb = list0;
        this.zzc = bundle0;
        this.zzd = adSize0;
    }

    @Nullable
    public AdSize getAdSize() {
        return this.zzd;
    }

    @Nullable
    @Deprecated
    public MediationConfiguration getConfiguration() {
        return this.zzb == null || this.zzb.size() <= 0 ? null : ((MediationConfiguration)this.zzb.get(0));
    }

    @NonNull
    public List getConfigurations() {
        return this.zzb;
    }

    @NonNull
    public Context getContext() {
        return this.zza;
    }

    @NonNull
    public Bundle getNetworkExtras() {
        return this.zzc;
    }
}

