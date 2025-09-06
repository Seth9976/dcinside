package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzl;
import com.google.common.util.concurrent.t0;

final class zzedj implements zzdgc {
    private final VersionInfoParcel zza;
    private final t0 zzb;
    private final zzfbo zzc;
    private final zzcex zzd;
    private final zzfcj zze;
    private final zzbjs zzf;
    private final boolean zzg;
    private final zzebv zzh;
    private final zzdrw zzi;

    zzedj(VersionInfoParcel versionInfoParcel0, t0 t00, zzfbo zzfbo0, zzcex zzcex0, zzfcj zzfcj0, boolean z, zzbjs zzbjs0, zzebv zzebv0, zzdrw zzdrw0) {
        this.zza = versionInfoParcel0;
        this.zzb = t00;
        this.zzc = zzfbo0;
        this.zzd = zzcex0;
        this.zze = zzfcj0;
        this.zzg = z;
        this.zzf = zzbjs0;
        this.zzh = zzebv0;
        this.zzi = zzdrw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, Context context0, zzcwg zzcwg0) {
        int v2;
        zzcnx zzcnx0 = (zzcnx)zzgch.zzq(this.zzb);
        this.zzd.zzaq(true);
        zzl zzl0 = new zzl((this.zzg ? this.zzf.zze(true) : true), true, (this.zzg ? this.zzf.zzd() : false), (this.zzg ? this.zzf.zza() : 0.0f), -1, z, this.zzc.zzO, false);
        if(zzcwg0 != null) {
            zzcwg0.zzf();
        }
        zzdfr zzdfr0 = zzcnx0.zzg();
        zzcex zzcex0 = this.zzd;
        int v = this.zzc.zzQ;
        if(v == -1) {
            zzy zzy0 = this.zze.zzj;
            if(zzy0 == null) {
                zzo.zze("Error setting app open orientation; no targeting orientation available.");
                v2 = this.zzc.zzQ;
            }
            else {
                int v1 = zzy0.zza;
                if(v1 == 1) {
                    v2 = 7;
                }
                else if(v1 == 2) {
                    v2 = 6;
                }
                else {
                    zzo.zze("Error setting app open orientation; no targeting orientation available.");
                    v2 = this.zzc.zzQ;
                }
            }
        }
        else {
            v2 = v;
        }
        zzebv zzebv0 = this.zzc.zzb() ? this.zzh : null;
        String s = this.zzd.zzr();
        zzn.zza(context0, new AdOverlayInfoParcel(null, zzdfr0, null, zzcex0, v2, this.zza, this.zzc.zzB, zzl0, this.zzc.zzs.zzb, this.zzc.zzs.zza, this.zze.zzf, zzcwg0, zzebv0, s), true, this.zzi);
    }
}

