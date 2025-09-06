package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;

public final class zzcfg implements zzfvf {
    public final Context zza;
    public final zzcgr zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final zzava zzf;
    public final zzbds zzg;
    public final VersionInfoParcel zzh;
    public final zzn zzi;
    public final zza zzj;
    public final zzbbj zzk;
    public final zzfbo zzl;
    public final zzfbr zzm;
    public final zzfcn zzn;
    public final zzebv zzo;

    public zzcfg(Context context0, zzcgr zzcgr0, String s, boolean z, boolean z1, zzava zzava0, zzbds zzbds0, VersionInfoParcel versionInfoParcel0, zzbda zzbda0, zzn zzn0, zza zza0, zzbbj zzbbj0, zzfbo zzfbo0, zzfbr zzfbr0, zzfcn zzfcn0, zzebv zzebv0) {
        this.zza = context0;
        this.zzb = zzcgr0;
        this.zzc = s;
        this.zzd = z;
        this.zze = z1;
        this.zzf = zzava0;
        this.zzg = zzbds0;
        this.zzh = versionInfoParcel0;
        this.zzi = zzn0;
        this.zzj = zza0;
        this.zzk = zzbbj0;
        this.zzl = zzfbo0;
        this.zzm = zzfbr0;
        this.zzn = zzfcn0;
        this.zzo = zzebv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfvf
    public final Object zza() {
        try {
            TrafficStats.setThreadStatsTag(0x108);
            zzcfp zzcfp0 = new zzcfp(new zzcfw(new zzcgq(this.zza), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, null, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn));
            zzcfp0.setWebViewClient(zzv.zzr().zzc(zzcfp0, this.zzk, this.zze, this.zzo));
            zzcfp0.setWebChromeClient(new zzcew(zzcfp0));
            return zzcfp0;
        }
        finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}

