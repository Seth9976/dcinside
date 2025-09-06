package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class zzgs {
    @NonNull
    public String zza;
    @NonNull
    public String zzb;
    @NonNull
    public Bundle zzc;
    private long zzd;

    public zzgs(@NonNull String s, @NonNull String s1, @Nullable Bundle bundle0, long v) {
        this.zza = s;
        this.zzb = s1;
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        this.zzc = bundle0;
        this.zzd = v;
    }

    @Override
    public final String toString() {
        return "origin=" + this.zzb + ",name=" + this.zza + ",params=" + this.zzc;
    }

    public static zzgs zza(zzbf zzbf0) {
        Bundle bundle0 = zzbf0.zzb.zzb();
        return new zzgs(zzbf0.zza, zzbf0.zzc, bundle0, zzbf0.zzd);
    }

    public final zzbf zza() {
        return new zzbf(this.zza, new zzbe(new Bundle(this.zzc)), this.zzb, this.zzd);
    }
}

