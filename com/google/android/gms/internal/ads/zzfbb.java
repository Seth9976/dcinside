package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzfbb implements zzeld {
    private final Context zza;
    private final Executor zzb;
    private final zzcgx zzc;
    private final zzfar zzd;
    private final zzezf zze;
    private final zzfcb zzf;
    private final zzfhk zzg;
    private final zzfch zzh;
    private t0 zzi;

    public zzfbb(Context context0, Executor executor0, zzcgx zzcgx0, zzezf zzezf0, zzfar zzfar0, zzfch zzfch0, zzfcb zzfcb0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzcgx0;
        this.zze = zzezf0;
        this.zzd = zzfar0;
        this.zzh = zzfch0;
        this.zzf = zzfcb0;
        this.zzg = zzcgx0.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzeld
    public final boolean zzb(zzm zzm0, String s, zzelb zzelb0, zzelc zzelc0) throws RemoteException {
        zzfhh zzfhh1;
        zzbwd zzbwd0 = new zzbwd(zzm0, s);
        zzfat zzfat0 = (zzfat)zzelb0;
        if(zzbwd0.zzb == null) {
            zzo.zzg("Ad unit ID should not be null for rewarded video ad.");
            zzfau zzfau0 = () -> {
                zze zze0 = zzfdk.zzd(6, null, null);
                this.zzd.zzdz(zze0);
            };
            this.zzb.execute(zzfau0);
            return false;
        }
        if(this.zzi == null || this.zzi.isDone()) {
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                zzezf zzezf0 = this.zze;
                if(zzezf0.zzd() == null) {
                    zzfhh1 = null;
                }
                else {
                    zzfhh zzfhh0 = ((zzdof)zzezf0.zzd()).zzh();
                    zzfhh0.zzi(5);
                    zzfhh0.zzb(zzbwd0.zza.zzp);
                    zzfhh0.zzf(zzbwd0.zza.zzm);
                    zzfhh1 = zzfhh0;
                }
            }
            else {
                zzfhh1 = null;
            }
            zzfdg.zza(this.zza, zzbwd0.zza.zzf);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzbwd0.zza.zzf) {
                this.zzc.zzl().zzo(true);
            }
            Bundle bundle0 = zzdrg.zza(new Pair[]{new Pair("api-call", zzbwd0.zza.zzz), new Pair("dynamite-enter", zzv.zzC().currentTimeMillis())});
            this.zzh.zzt(zzbwd0.zzb);
            zzs zzs0 = zzs.zzd();
            this.zzh.zzs(zzs0);
            this.zzh.zzH(zzbwd0.zza);
            this.zzh.zzA(bundle0);
            zzfcj zzfcj0 = this.zzh.zzJ();
            int v = zzfhg.zzf(zzfcj0);
            zzfgw zzfgw0 = zzfgv.zzb(this.zza, v, 5, zzbwd0.zza);
            zzfaz zzfaz0 = new zzfaz(null);
            zzfaz0.zza = zzfcj0;
            zzezg zzezg0 = new zzezg(zzfaz0, null);
            zzfav zzfav0 = (zzezd zzezd0) -> {
                zzdoe zzdoe0 = this.zzc.zzi();
                zzcva zzcva0 = new zzcva();
                zzcva0.zzf(this.zza);
                zzcva0.zzk(((zzfaz)zzezd0).zza);
                zzcva0.zzj(this.zzf);
                zzdoe0.zzd(zzcva0.zzl());
                zzdoe0.zzc(new zzdbk().zzn());
                return zzdoe0;
            };
            t0 t00 = this.zze.zzc(zzezg0, zzfav0, null);
            this.zzi = t00;
            zzgch.zzr(t00, new zzfay(this, zzelc0, zzfhh1, zzfgw0, zzfaz0), this.zzb);
            return true;
        }
        return false;
    }

    // 检测为 Lambda 实现
    final void zzi() [...]

    final void zzj(int v) {
        this.zzh.zzp().zza(v);
    }

    // 检测为 Lambda 实现
    private final zzdoe zzk(zzezd zzezd0) [...]
}

