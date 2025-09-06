package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzgz {
    private final String zza;
    private final boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private final zzha zze;

    public zzgz(zzha zzha0, String s, boolean z) {
        this.zze = zzha0;
        super();
        Preconditions.checkNotEmpty(s);
        this.zza = s;
        this.zzb = z;
    }

    @WorkerThread
    public final void zza(boolean z) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zze.zzg().edit();
        sharedPreferences$Editor0.putBoolean(this.zza, z);
        sharedPreferences$Editor0.apply();
        this.zzd = z;
    }

    @WorkerThread
    public final boolean zza() {
        if(!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getBoolean(this.zza, this.zzb);
        }
        return this.zzd;
    }
}

