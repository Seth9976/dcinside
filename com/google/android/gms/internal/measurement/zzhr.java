package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.base.t;
import o3.h;

public final class zzhr {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    @h
    final t zzh;
    private final boolean zzi;

    public zzhr(Uri uri0) {
        this(null, uri0, "", "", false, false, false, false, null);
    }

    private zzhr(String s, Uri uri0, String s1, String s2, boolean z, boolean z1, boolean z2, boolean z3, @h t t0) {
        this.zza = s;
        this.zzb = uri0;
        this.zzc = s1;
        this.zzd = s2;
        this.zze = z;
        this.zzf = z1;
        this.zzi = z2;
        this.zzg = z3;
        this.zzh = t0;
    }

    public final zzhj zza(String s, double f) {
        return zzhj.zza(this, s, -3.0, true);
    }

    public final zzhj zza(String s, long v) {
        return zzhj.zza(this, s, v, true);
    }

    public final zzhj zza(String s, String s1) {
        return zzhj.zza(this, s, s1, true);
    }

    public final zzhj zza(String s, boolean z) {
        return zzhj.zza(this, s, Boolean.valueOf(z), true);
    }

    public final zzhr zza() {
        return new zzhr(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, true, this.zzg, this.zzh);
    }

    public final zzhr zzb() {
        if(!this.zzc.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        if(this.zzh != null) {
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        return new zzhr(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzi, this.zzg, null);
    }
}

