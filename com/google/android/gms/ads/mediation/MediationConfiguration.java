package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdFormat;

public class MediationConfiguration {
    @NonNull
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
    private final AdFormat zza;
    private final Bundle zzb;

    public MediationConfiguration(@NonNull AdFormat adFormat0, @NonNull Bundle bundle0) {
        this.zza = adFormat0;
        this.zzb = bundle0;
    }

    @NonNull
    public AdFormat getFormat() {
        return this.zza;
    }

    @NonNull
    public Bundle getServerParameters() {
        return this.zzb;
    }
}

