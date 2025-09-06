package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

public final class zzenu implements zzetq {
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final boolean zzj;
    public final boolean zzk;

    public zzenu(int v, boolean z, boolean z1, int v1, int v2, int v3, int v4, int v5, float f, boolean z2, boolean z3) {
        this.zza = v;
        this.zzb = z;
        this.zzc = z1;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = v3;
        this.zzg = v4;
        this.zzh = v5;
        this.zzi = f;
        this.zzj = z2;
        this.zzk = z3;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkQ)).booleanValue()) {
            bundle0.putInt("muv_min", this.zze);
            bundle0.putInt("muv_max", this.zzf);
        }
        bundle0.putFloat("android_app_volume", this.zzi);
        bundle0.putBoolean("android_app_muted", this.zzj);
        if(!this.zzk) {
            bundle0.putInt("am", this.zza);
            bundle0.putBoolean("ma", this.zzb);
            bundle0.putBoolean("sp", this.zzc);
            bundle0.putInt("muv", this.zzd);
            bundle0.putInt("rm", this.zzg);
            bundle0.putInt("riv", this.zzh);
        }
    }
}

