package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzezr implements zzeld {
    private final Context zza;
    private final Executor zzb;
    private final zzcgx zzc;
    private final zzekn zzd;
    private final zzfar zze;
    @Nullable
    private zzbdg zzf;
    private final zzfhk zzg;
    private final zzfch zzh;
    private t0 zzi;

    public zzezr(Context context0, Executor executor0, zzcgx zzcgx0, zzekn zzekn0, zzfar zzfar0, zzfch zzfch0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzcgx0;
        this.zzd = zzekn0;
        this.zzh = zzfch0;
        this.zze = zzfar0;
        this.zzg = zzcgx0.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        return this.zzi != null && !this.zzi.isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzeld
    public final boolean zzb(zzm zzm0, String s, zzelb zzelb0, zzelc zzelc0) {
        zzfhh zzfhh1;
        zzdfu zzdfu0;
        if(s == null) {
            zzo.zzg("Ad unit ID should not be null for interstitial ad.");
            zzezl zzezl0 = () -> {
                zze zze0 = zzfdk.zzd(6, null, null);
                this.zzd.zzdz(zze0);
            };
            this.zzb.execute(zzezl0);
            return false;
        }
        if(this.zza()) {
            return false;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzm0.zzf) {
            this.zzc.zzl().zzo(true);
        }
        Bundle bundle0 = zzdrg.zza(new Pair[]{new Pair("api-call", zzm0.zzz), new Pair("dynamite-enter", zzv.zzC().currentTimeMillis())});
        this.zzh.zzt(s);
        this.zzh.zzs(((zzezk)zzelb0).zza);
        this.zzh.zzH(zzm0);
        this.zzh.zzA(bundle0);
        zzfcj zzfcj0 = this.zzh.zzJ();
        int v = zzfhg.zzf(zzfcj0);
        zzfgw zzfgw0 = zzfgv.zzb(this.zza, v, 4, zzm0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzib)).booleanValue()) {
            zzdft zzdft0 = this.zzc.zzg();
            zzcva zzcva0 = new zzcva();
            zzcva0.zzf(this.zza);
            zzcva0.zzk(zzfcj0);
            zzdft0.zze(zzcva0.zzl());
            zzdbk zzdbk0 = new zzdbk();
            zzdbk0.zzj(this.zzd, this.zzb);
            zzdbk0.zzk(this.zzd, this.zzb);
            zzdft0.zzd(zzdbk0.zzn());
            zzdft0.zzc(new zzeiw(this.zzf));
            zzdfu0 = zzdft0.zzf();
        }
        else {
            zzdbk zzdbk1 = new zzdbk();
            zzfar zzfar0 = this.zze;
            if(zzfar0 != null) {
                zzdbk1.zze(zzfar0, this.zzb);
                zzdbk1.zzf(this.zze, this.zzb);
                zzdbk1.zzb(this.zze, this.zzb);
            }
            zzdft zzdft1 = this.zzc.zzg();
            zzcva zzcva1 = new zzcva();
            zzcva1.zzf(this.zza);
            zzcva1.zzk(zzfcj0);
            zzdft1.zze(zzcva1.zzl());
            zzdbk1.zzj(this.zzd, this.zzb);
            zzdbk1.zze(this.zzd, this.zzb);
            zzdbk1.zzf(this.zzd, this.zzb);
            zzdbk1.zzb(this.zzd, this.zzb);
            zzdbk1.zza(this.zzd, this.zzb);
            zzdbk1.zzl(this.zzd, this.zzb);
            zzdbk1.zzk(this.zzd, this.zzb);
            zzdbk1.zzi(this.zzd, this.zzb);
            zzdbk1.zzc(this.zzd, this.zzb);
            zzdft1.zzd(zzdbk1.zzn());
            zzdft1.zzc(new zzeiw(this.zzf));
            zzdfu0 = zzdft1.zzf();
        }
        if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
            zzfhh zzfhh0 = zzdfu0.zzf();
            zzfhh0.zzi(4);
            zzfhh0.zzb(zzm0.zzp);
            zzfhh0.zzf(zzm0.zzm);
            zzfhh1 = zzfhh0;
        }
        else {
            zzfhh1 = null;
        }
        zzcsd zzcsd0 = zzdfu0.zza();
        t0 t00 = zzcsd0.zzh(zzcsd0.zzi());
        this.zzi = t00;
        zzgch.zzr(t00, new zzezq(this, zzelc0, zzfhh1, zzfgw0, zzdfu0), this.zzb);
        return true;
    }

    static void zzg(zzezr zzezr0, t0 t00) {
        zzezr0.zzi = null;
    }

    // 检测为 Lambda 实现
    final void zzh() [...]

    public final void zzi(zzbdg zzbdg0) {
        this.zzf = zzbdg0;
    }
}

