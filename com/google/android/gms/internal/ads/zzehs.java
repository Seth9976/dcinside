package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.common.util.concurrent.t0;

final class zzehs implements zzdgc {
    private final Context zza;
    private final zzdow zzb;
    private final zzfcj zzc;
    private final VersionInfoParcel zzd;
    private final zzfbo zze;
    private final t0 zzf;
    private final zzcex zzg;
    private final zzbjs zzh;
    private final boolean zzi;
    private final zzebv zzj;
    private final zzdrq zzk;
    private final zzdrw zzl;

    zzehs(Context context0, zzdow zzdow0, zzfcj zzfcj0, VersionInfoParcel versionInfoParcel0, zzfbo zzfbo0, t0 t00, zzcex zzcex0, zzbjs zzbjs0, boolean z, zzebv zzebv0, zzdrq zzdrq0, zzdrw zzdrw0) {
        this.zza = context0;
        this.zzb = zzdow0;
        this.zzc = zzfcj0;
        this.zzd = versionInfoParcel0;
        this.zze = zzfbo0;
        this.zzf = t00;
        this.zzg = zzcex0;
        this.zzh = zzbjs0;
        this.zzi = z;
        this.zzj = zzebv0;
        this.zzk = zzdrq0;
        this.zzl = zzdrw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, Context context0, zzcwg zzcwg0) {
        zzcex zzcex0;
        zzebv zzebv0;
        zzdob zzdob0 = (zzdob)zzgch.zzq(this.zzf);
        try {
            zzfbo zzfbo0 = this.zze;
            zzebv0 = null;
            if(!this.zzg.zzaG()) {
                zzcex0 = this.zzg;
            }
            else if(!((Boolean)zzbe.zzc().zza(zzbcl.zzaX)).booleanValue()) {
                zzcex0 = this.zzg;
            }
            else {
                zzcex zzcex1 = this.zzb.zza(this.zzc.zze, null, null);
                zzbkh.zzb(zzcex1, zzdob0.zzg());
                zzdpa zzdpa0 = new zzdpa();
                View view0 = zzcex1.zzF();
                zzdpa0.zza(this.zza, view0);
                zzdob0.zzl().zzi(zzcex1, true, (this.zzi ? this.zzh : null), this.zzk.zza());
                zzcex1.zzN().zzC(new zzehq(zzdpa0, zzcex1));
                zzcex1.zzN().zzJ(new zzehr(zzcex1));
                zzcex1.zzae(zzfbo0.zzs.zzb, zzfbo0.zzs.zza, null);
                zzcex0 = zzcex1;
            }
        }
        catch(zzcfj zzcfj0) {
            zzo.zzh("", zzcfj0);
            return;
        }
        zzcex0.zzaq(true);
        zzl zzl0 = new zzl((this.zzi ? this.zzh.zze(false) : false), zzs.zzJ(this.zza), (this.zzi ? this.zzh.zzd() : false), (this.zzi ? this.zzh.zza() : 0.0f), -1, z, this.zze.zzO, this.zze.zzP);
        if(zzcwg0 != null) {
            zzcwg0.zzf();
        }
        zzdfr zzdfr0 = zzdob0.zzh();
        VersionInfoParcel versionInfoParcel0 = this.zzd;
        int v = this.zze.zzQ;
        String s = this.zze.zzB;
        String s1 = this.zze.zzs.zzb;
        String s2 = this.zze.zzs.zza;
        zzfcj zzfcj0 = this.zzc;
        if(this.zze.zzb()) {
            zzebv0 = this.zzj;
        }
        String s3 = zzcex0.zzr();
        zzn.zza(context0, new AdOverlayInfoParcel(null, zzdfr0, null, zzcex0, v, versionInfoParcel0, s, zzl0, s1, s2, zzfcj0.zzf, zzcwg0, zzebv0, s3), true, this.zzl);
    }
}

