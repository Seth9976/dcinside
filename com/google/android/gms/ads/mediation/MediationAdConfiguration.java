package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o3.j;

@j
public class MediationAdConfiguration {
    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    private final String zza;
    private final Bundle zzb;
    private final Bundle zzc;
    private final Context zzd;
    private final boolean zze;
    private final int zzf;
    private final int zzg;
    @Nullable
    private final String zzh;
    private final String zzi;

    public MediationAdConfiguration(@NonNull Context context0, @NonNull String s, @NonNull Bundle bundle0, @NonNull Bundle bundle1, boolean z, @Nullable Location location0, int v, int v1, @Nullable String s1, @NonNull String s2) {
        this.zza = s;
        this.zzb = bundle0;
        this.zzc = bundle1;
        this.zzd = context0;
        this.zze = z;
        this.zzf = v;
        this.zzg = v1;
        this.zzh = s1;
        this.zzi = s2;
    }

    @NonNull
    public String getBidResponse() {
        return this.zza;
    }

    @NonNull
    public Context getContext() {
        return this.zzd;
    }

    @Nullable
    public String getMaxAdContentRating() {
        return this.zzh;
    }

    @NonNull
    public Bundle getMediationExtras() {
        return this.zzc;
    }

    @NonNull
    public Bundle getServerParameters() {
        return this.zzb;
    }

    @NonNull
    public String getWatermark() {
        return this.zzi;
    }

    public boolean isTestRequest() {
        return this.zze;
    }

    public int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    public int taggedForUnderAgeTreatment() {
        return this.zzg;
    }
}

