package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzdmg {
    private final Executor zza;
    private final zzcnr zzb;
    private final zzddm zzc;
    private final zzcmk zzd;

    zzdmg(Executor executor0, zzcnr zzcnr0, zzddm zzddm0, zzcmk zzcmk0) {
        this.zza = executor0;
        this.zzc = zzddm0;
        this.zzb = zzcnr0;
        this.zzd = zzcmk0;
    }

    public final void zza(zzcex zzcex0) {
        if(zzcex0 == null) {
            return;
        }
        View view0 = zzcex0.zzF();
        this.zzc.zza(view0);
        zzdmc zzdmc0 = new zzdmc(zzcex0);
        this.zzc.zzo(zzdmc0, this.zza);
        zzdmd zzdmd0 = new zzdmd(zzcex0);
        this.zzc.zzo(zzdmd0, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcex0);
        zzcgp zzcgp0 = zzcex0.zzN();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjY)).booleanValue() && zzcgp0 != null) {
            zzcgp0.zzL(this.zzd);
            zzcgp0.zzM(this.zzd, null, null);
        }
        zzcex0.zzag("/trackActiveViewUnit", (zzcex zzcex0, Map map0) -> this.zzb.zzb());
        zzcex0.zzag("/untrackActiveViewUnit", (zzcex zzcex0, Map map0) -> this.zzb.zza());
    }

    // 检测为 Lambda 实现
    final void zzb(zzcex zzcex0, Map map0) [...]

    // 检测为 Lambda 实现
    final void zzc(zzcex zzcex0, Map map0) [...]
}

