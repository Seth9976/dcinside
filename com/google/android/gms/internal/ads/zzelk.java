package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzelk implements zzeld {
    private final zzfch zza;
    private final zzcgx zzb;
    private final Context zzc;
    private final zzela zzd;
    private final zzfhk zze;
    @Nullable
    private zzcro zzf;

    public zzelk(zzcgx zzcgx0, Context context0, zzela zzela0, zzfch zzfch0) {
        this.zzb = zzcgx0;
        this.zzc = context0;
        this.zzd = zzela0;
        this.zza = zzfch0;
        this.zze = zzcgx0.zzz();
        zzfch0.zzv(zzela0.zzd());
    }

    @Override  // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        return this.zzf != null && this.zzf.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzeld
    public final boolean zzb(zzm zzm0, String s, zzelb zzelb0, zzelc zzelc0) throws RemoteException {
        zzfhh zzfhh1;
        if(zzs.zzI(this.zzc) && zzm0.zzs == null) {
            zzo.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzC().execute(() -> {
                zze zze0 = zzfdk.zzd(4, null, null);
                this.zzd.zza().zzdz(zze0);
            });
            return false;
        }
        if(s == null) {
            zzo.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzC().execute(() -> {
                zze zze0 = zzfdk.zzd(6, null, null);
                this.zzd.zza().zzdz(zze0);
            });
            return false;
        }
        zzfdg.zza(this.zzc, zzm0.zzf);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzm0.zzf) {
            this.zzb.zzl().zzo(true);
        }
        Long long0 = zzv.zzC().currentTimeMillis();
        Bundle bundle0 = zzdrg.zza(new Pair[]{new Pair("api-call", long0), new Pair("dynamite-enter", long0)});
        this.zza.zzH(zzm0);
        this.zza.zzA(bundle0);
        this.zza.zzC(((zzele)zzelb0).zza);
        zzfcj zzfcj0 = this.zza.zzJ();
        int v = zzfhg.zzf(zzfcj0);
        zzfgw zzfgw0 = zzfgv.zzb(this.zzc, v, 8, zzm0);
        zzcm zzcm0 = zzfcj0.zzn;
        if(zzcm0 != null) {
            this.zzd.zzd().zzm(zzcm0);
        }
        zzdgp zzdgp0 = this.zzb.zzh();
        zzcva zzcva0 = new zzcva();
        zzcva0.zzf(this.zzc);
        zzcva0.zzk(zzfcj0);
        zzdgp0.zzf(zzcva0.zzl());
        zzdbk zzdbk0 = new zzdbk();
        Executor executor0 = this.zzb.zzC();
        zzdbk0.zzk(this.zzd.zzd(), executor0);
        zzdgp0.zze(zzdbk0.zzn());
        zzdgp0.zzd(this.zzd.zzc());
        zzdgp0.zzc(new zzcoj(null));
        zzdgq zzdgq0 = zzdgp0.zzg();
        if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
            zzfhh zzfhh0 = zzdgq0.zzf();
            zzfhh0.zzi(8);
            zzfhh0.zzb(zzm0.zzp);
            zzfhh0.zzf(zzm0.zzm);
            zzfhh1 = zzfhh0;
        }
        else {
            zzfhh1 = null;
        }
        this.zzb.zzy().zzc(1);
        zzgcs zzgcs0 = zzffh.zzc();
        ScheduledExecutorService scheduledExecutorService0 = this.zzb.zzD();
        zzcsd zzcsd0 = zzdgq0.zza();
        zzcro zzcro0 = new zzcro(zzgcs0, scheduledExecutorService0, zzcsd0.zzh(zzcsd0.zzi()));
        this.zzf = zzcro0;
        zzcro0.zze(new zzelj(this, zzelc0, zzfhh1, zzfgw0, zzdgq0));
        return true;
    }

    // 检测为 Lambda 实现
    final void zzf() [...]

    // 检测为 Lambda 实现
    final void zzg() [...]
}

