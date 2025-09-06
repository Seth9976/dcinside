package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.common.util.concurrent.t0;
import java.util.List;

public final class zzcuw {
    private final zzfgn zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhel zzg;
    private final String zzh;
    private final zzetu zzi;
    private final zzg zzj;
    private final zzfcj zzk;
    private final int zzl;
    private final zzdbe zzm;

    zzcuw(zzfgn zzfgn0, VersionInfoParcel versionInfoParcel0, ApplicationInfo applicationInfo0, String s, List list0, @Nullable PackageInfo packageInfo0, zzhel zzhel0, zzg zzg0, String s1, zzetu zzetu0, zzfcj zzfcj0, zzdbe zzdbe0, int v) {
        this.zza = zzfgn0;
        this.zzb = versionInfoParcel0;
        this.zzc = applicationInfo0;
        this.zzd = s;
        this.zze = list0;
        this.zzf = packageInfo0;
        this.zzg = zzhel0;
        this.zzh = s1;
        this.zzi = zzetu0;
        this.zzj = zzg0;
        this.zzk = zzfcj0;
        this.zzm = zzdbe0;
        this.zzl = v;
    }

    // 检测为 Lambda 实现
    final zzbvk zza(t0 t00, Bundle bundle0) throws Exception [...]

    public final t0 zzb(Bundle bundle0) {
        this.zzm.zza();
        zzcuv zzcuv0 = new zzcuv(new Bundle(), new Bundle());
        return this.zzl == 2 ? zzffx.zzc(this.zzi.zza(zzcuv0, bundle0, true), zzfgh.zza, this.zza).zza() : zzffx.zzc(this.zzi.zza(zzcuv0, bundle0, false), zzfgh.zza, this.zza).zza();
    }

    public final t0 zzc() {
        Bundle bundle0 = new Bundle();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            Bundle bundle1 = this.zzk.zzs;
            if(bundle1 != null) {
                bundle0.putAll(bundle1);
            }
            bundle0.putBoolean("ls", false);
        }
        t0 t00 = this.zzb(bundle0);
        t0[] arr_t0 = {t00, ((t0)this.zzg.zzb())};
        return this.zza.zza(zzfgh.zzb, arr_t0).zza(() -> {
            zzcuv zzcuv0 = (zzcuv)t00.get();
            Object object0 = ((t0)this.zzg.zzb()).get();
            boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzgQ)).booleanValue() && this.zzj.zzN();
            boolean z1 = this.zzk.zzb();
            return new zzbvk(zzcuv0.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, ((String)object0), this.zzh, null, null, z, z1, bundle0, zzcuv0.zzb);
        }).zza();
    }
}

