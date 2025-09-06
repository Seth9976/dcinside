package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzhb {
    private final String zza;
    private final long zzb;
    private boolean zzc;
    private long zzd;
    private final zzha zze;

    public zzhb(zzha zzha0, String s, long v) {
        this.zze = zzha0;
        super();
        Preconditions.checkNotEmpty(s);
        this.zza = s;
        this.zzb = v;
    }

    @WorkerThread
    public final long zza() {
        if(!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getLong(this.zza, this.zzb);
        }
        return this.zzd;
    }

    @WorkerThread
    public final void zza(long v) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zze.zzg().edit();
        sharedPreferences$Editor0.putLong(this.zza, v);
        sharedPreferences$Editor0.apply();
        this.zzd = v;
    }
}

