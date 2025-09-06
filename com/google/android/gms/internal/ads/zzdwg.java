package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class zzdwg {
    private final zzgcs zza;
    private final zzgcs zzb;
    private final zzdxo zzc;
    private final zzhel zzd;

    public zzdwg(zzgcs zzgcs0, zzgcs zzgcs1, zzdxo zzdxo0, zzhel zzhel0) {
        this.zza = zzgcs0;
        this.zzb = zzgcs1;
        this.zzc = zzdxo0;
        this.zzd = zzhel0;
    }

    // 检测为 Lambda 实现
    final zzdyi zza(zzbvk zzbvk0) throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zzb(zzbvk zzbvk0, int v, zzdyh zzdyh0) throws Exception [...]

    public final t0 zzc(zzbvk zzbvk0) {
        t0 t00;
        if(zzs.zzD(zzbvk0.zzd)) {
            t00 = zzgch.zzg(new zzdyh(1));
        }
        else {
            zzdwd zzdwd0 = () -> ((zzdyi)this.zzc.zza(zzbvk0).get(((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzfy)))))), TimeUnit.SECONDS));
            t0 t01 = this.zza.zzb(zzdwd0);
            zzdwe zzdwe0 = new zzdwe();
            t00 = zzgch.zzf(t01, ExecutionException.class, zzdwe0, this.zzb);
        }
        zzdwf zzdwf0 = (zzdyh zzdyh0) -> {
            if(zzbvk0 != null) {
                Bundle bundle0 = zzbvk0.zzm;
                if(bundle0 != null) {
                    bundle0.putBoolean("ls", true);
                }
            }
            return zzgch.zzn(((zzdzl)this.zzd.zzb()).zzc(zzbvk0, Binder.getCallingUid()), new zzdwc(zzbvk0), this.zzb);
        };
        return zzgch.zzf(t00, zzdyh.class, zzdwf0, this.zzb);
    }
}

