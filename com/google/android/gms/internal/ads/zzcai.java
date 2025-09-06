package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class zzcai {
    private final zzcab zza;
    private final AtomicInteger zzb;

    public zzcai() {
        zzcab zzcab0 = new zzcab();
        this.zza = zzcab0;
        this.zzb = new AtomicInteger(0);
        zzgch.zzr(zzcab0, new zzcag(this), zzbzw.zzg);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable throwable0, String s) {
        this.zza.zzd(throwable0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
            zzv.zzp().zzv(throwable0, s);
        }
    }

    @Deprecated
    public final void zzi(Object object0) {
        this.zza.zzc(object0);
    }

    @Deprecated
    public final void zzj(zzcaf zzcaf0, zzcad zzcad0) {
        zzcah zzcah0 = new zzcah(this, zzcaf0, zzcad0);
        zzgch.zzr(this.zza, zzcah0, zzbzw.zzg);
    }
}

