package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzhd {
    private final String zza;
    private boolean zzb;
    private String zzc;
    private final zzha zzd;

    public zzhd(zzha zzha0, String s, String s1) {
        this.zzd = zzha0;
        super();
        Preconditions.checkNotEmpty(s);
        this.zza = s;
    }

    @WorkerThread
    public final String zza() {
        if(!this.zzb) {
            this.zzb = true;
            this.zzc = this.zzd.zzg().getString(this.zza, null);
        }
        return this.zzc;
    }

    @WorkerThread
    public final void zza(String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzd.zzg().edit();
        sharedPreferences$Editor0.putString(this.zza, s);
        sharedPreferences$Editor0.apply();
        this.zzc = s;
    }
}

