package com.google.android.gms.internal.vision;

import android.net.Uri;
import o3.h;

public final class zzbo {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    @h
    final zzcw zzi;

    public zzbo(Uri uri0) {
        this(null, uri0, "", "", false, false, false, false, null);
    }

    private zzbo(String s, Uri uri0, String s1, String s2, boolean z, boolean z1, boolean z2, boolean z3, @h zzcw zzcw0) {
        this.zza = s;
        this.zzb = uri0;
        this.zzc = s1;
        this.zzd = s2;
        this.zze = z;
        this.zzf = z1;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = zzcw0;
    }

    public final zzbi zza(String s, Object object0, zzbp zzbp0) {
        return zzbi.zza(this, s, object0, zzbp0, true);
    }

    public final zzbo zza(String s) {
        if(this.zze) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new zzbo(this.zza, this.zzb, s, this.zzd, false, this.zzf, this.zzg, this.zzh, this.zzi);
    }
}

