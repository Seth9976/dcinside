package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.common.util.concurrent.t0;

final class zzeey implements zzdgc {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final t0 zzc;
    private final zzfbo zzd;
    private final zzcex zze;
    private final zzfcj zzf;
    private final zzbjs zzg;
    private final boolean zzh;
    private final zzebv zzi;
    private final zzdrw zzj;

    zzeey(Context context0, VersionInfoParcel versionInfoParcel0, t0 t00, zzfbo zzfbo0, zzcex zzcex0, zzfcj zzfcj0, boolean z, zzbjs zzbjs0, zzebv zzebv0, zzdrw zzdrw0) {
        this.zza = context0;
        this.zzb = versionInfoParcel0;
        this.zzc = t00;
        this.zzd = zzfbo0;
        this.zze = zzcex0;
        this.zzf = zzfcj0;
        this.zzg = zzbjs0;
        this.zzh = z;
        this.zzi = zzebv0;
        this.zzj = zzdrw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, Context context0, zzcwg zzcwg0) {
        zzder zzder0 = (zzder)zzgch.zzq(this.zzc);
        this.zze.zzaq(true);
        zzl zzl0 = new zzl((this.zzh ? this.zzg.zze(false) : false), zzs.zzJ(this.zza), (this.zzh ? this.zzg.zzd() : false), (this.zzh ? this.zzg.zza() : 0.0f), -1, z, this.zzd.zzO, false);
        if(zzcwg0 != null) {
            zzcwg0.zzf();
        }
        zzdfr zzdfr0 = zzder0.zzh();
        zzebv zzebv0 = this.zzd.zzb() ? this.zzi : null;
        String s = this.zze.zzr();
        zzn.zza(context0, new AdOverlayInfoParcel(null, zzdfr0, null, this.zze, this.zzd.zzQ, this.zzb, this.zzd.zzB, zzl0, this.zzd.zzs.zzb, this.zzd.zzs.zza, this.zzf.zzf, zzcwg0, zzebv0, s), true, this.zzj);
    }
}

