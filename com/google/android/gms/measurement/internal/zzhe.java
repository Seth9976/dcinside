package com.google.android.gms.measurement.internal;

import J1.e;
import android.content.SharedPreferences.Editor;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzhe {
    @e
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzha zze;

    private zzhe(zzha zzha0, String s, long v) {
        this.zze = zzha0;
        super();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkArgument(v > 0L);
        this.zza = s + ":start";
        this.zzb = s + ":count";
        this.zzc = s + ":value";
        this.zzd = v;
    }

    zzhe(zzha zzha0, String s, long v, zzhg zzhg0) {
        this(zzha0, s, v);
    }

    @WorkerThread
    public final Pair zza() {
        long v1;
        this.zze.zzt();
        this.zze.zzt();
        long v = this.zzb();
        if(v == 0L) {
            this.zzc();
            v1 = 0L;
        }
        else {
            v1 = Math.abs(v - this.zze.zzb().currentTimeMillis());
        }
        long v2 = this.zzd;
        if(v1 < v2) {
            return null;
        }
        if(v1 > v2 << 1) {
            this.zzc();
            return null;
        }
        String s = this.zze.zzg().getString(this.zzc, null);
        long v3 = this.zze.zzg().getLong(this.zzb, 0L);
        this.zzc();
        return s == null || v3 <= 0L ? zzha.zza : new Pair(s, v3);
    }

    @WorkerThread
    public final void zza(String s, long v) {
        this.zze.zzt();
        if(this.zzb() == 0L) {
            this.zzc();
        }
        if(s == null) {
            s = "";
        }
        long v1 = this.zze.zzg().getLong(this.zzb, 0L);
        if(v1 <= 0L) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zze.zzg().edit();
            sharedPreferences$Editor0.putString(this.zzc, s);
            sharedPreferences$Editor0.putLong(this.zzb, 1L);
            sharedPreferences$Editor0.apply();
            return;
        }
        boolean z = (this.zze.zzq().zzv().nextLong() & 0x7FFFFFFFFFFFFFFFL) < 0x7FFFFFFFFFFFFFFFL / (v1 + 1L);
        SharedPreferences.Editor sharedPreferences$Editor1 = this.zze.zzg().edit();
        if(z) {
            sharedPreferences$Editor1.putString(this.zzc, s);
        }
        sharedPreferences$Editor1.putLong(this.zzb, v1 + 1L);
        sharedPreferences$Editor1.apply();
    }

    @WorkerThread
    private final long zzb() {
        return this.zze.zzg().getLong(this.zza, 0L);
    }

    @WorkerThread
    private final void zzc() {
        this.zze.zzt();
        long v = this.zze.zzb().currentTimeMillis();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zze.zzg().edit();
        sharedPreferences$Editor0.remove(this.zzb);
        sharedPreferences$Editor0.remove(this.zzc);
        sharedPreferences$Editor0.putLong(this.zza, v);
        sharedPreferences$Editor0.apply();
    }
}

