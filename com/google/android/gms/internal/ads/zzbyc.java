package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

final class zzbyc extends zzbyj {
    private final Clock zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;
    private final zzhfa zzj;

    zzbyc(Context context0, Clock clock0, zzg zzg0, zzbyi zzbyi0, zzbyd zzbyd0) {
        this.zzb = clock0;
        zzher zzher0 = zzhes.zza(context0);
        this.zzc = zzher0;
        zzher zzher1 = zzhes.zza(zzg0);
        this.zzd = zzher1;
        this.zze = zzheq.zzc(new zzbxw(zzher0, zzher1));
        zzher zzher2 = zzhes.zza(clock0);
        this.zzf = zzher2;
        zzher zzher3 = zzhes.zza(zzbyi0);
        this.zzg = zzher3;
        zzhfa zzhfa0 = zzheq.zzc(new zzbxy(zzher2, zzher1, zzher3));
        this.zzh = zzhfa0;
        zzbya zzbya0 = new zzbya(zzher2, zzhfa0);
        this.zzi = zzbya0;
        this.zzj = zzheq.zzc(new zzbyo(zzher0, zzbya0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbyj
    final zzbxv zza() {
        return (zzbxv)this.zze.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbyj
    final zzbxz zzb() {
        zzbxx zzbxx0 = (zzbxx)this.zzh.zzb();
        return new zzbxz(this.zzb, zzbxx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyj
    final zzbyn zzc() {
        return (zzbyn)this.zzj.zzb();
    }
}

