package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

final class zzcir implements zzeyd {
    private final Context zza;
    private final zzs zzb;
    private final String zzc;
    private final zzcih zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;
    private final zzhfa zzj;

    zzcir(zzcih zzcih0, Context context0, String s, zzs zzs0, zzcjm zzcjm0) {
        this.zzd = zzcih0;
        this.zza = context0;
        this.zzb = zzs0;
        this.zzc = s;
        zzher zzher0 = zzhes.zza(context0);
        this.zze = zzher0;
        zzher zzher1 = zzhes.zza(zzs0);
        this.zzf = zzher1;
        zzhfa zzhfa0 = zzheq.zzc(new zzeko(zzcih0.zzM));
        this.zzg = zzhfa0;
        zzhfa zzhfa1 = zzheq.zzc(zzekt.zza());
        this.zzh = zzhfa1;
        zzhfa zzhfa2 = zzheq.zzc(zzdat.zza());
        this.zzi = zzhfa2;
        this.zzj = zzheq.zzc(new zzeyb(zzher0, zzcih0.zzc, zzher1, zzcih0.zzS, zzhfa0, zzhfa1, zzfcl.zza(), zzhfa2));
    }

    @Override  // com.google.android.gms.internal.ads.zzeyd
    public final zzejt zza() {
        Object object0 = this.zzj.zzb();
        Object object1 = this.zzg.zzb();
        VersionInfoParcel versionInfoParcel0 = zzchs.zzc(this.zzd.zza);
        Object object2 = this.zzd.zzM.zzb();
        return new zzejt(this.zza, this.zzb, this.zzc, ((zzeya)object0), ((zzekn)object1), versionInfoParcel0, ((zzdrw)object2));
    }
}

