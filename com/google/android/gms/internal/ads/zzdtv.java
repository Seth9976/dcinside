package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzdtv implements Runnable {
    public final zzdua zza;
    public final String zzb;
    public final zzblr zzc;
    public final zzfdh zzd;
    public final List zze;

    public zzdtv(zzdua zzdua0, String s, zzblr zzblr0, zzfdh zzfdh0, List list0) {
        this.zza = zzdua0;
        this.zzb = s;
        this.zzc = zzblr0;
        this.zzd = zzfdh0;
        this.zze = list0;
    }

    @Override
    public final void run() {
        this.zza.zzn(this.zzb, this.zzc, this.zzd, this.zze);
    }
}

