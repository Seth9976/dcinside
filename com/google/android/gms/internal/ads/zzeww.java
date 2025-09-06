package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;
import o3.h;

public abstract class zzeww implements zzeld {
    protected final zzcgx zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzexm zzd;
    private final zzezf zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfhk zzh;
    private final zzfch zzi;
    @h
    private t0 zzj;

    protected zzeww(Context context0, Executor executor0, zzcgx zzcgx0, zzezf zzezf0, zzexm zzexm0, zzfch zzfch0, VersionInfoParcel versionInfoParcel0) {
        this.zzb = context0;
        this.zzc = executor0;
        this.zza = zzcgx0;
        this.zze = zzezf0;
        this.zzd = zzexm0;
        this.zzi = zzfch0;
        this.zzf = versionInfoParcel0;
        this.zzg = new FrameLayout(context0);
        this.zzh = zzcgx0.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        return this.zzj != null && !this.zzj.isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzeld
    public final boolean zzb(zzm zzm0, String s, zzelb zzelb0, zzelc zzelc0) throws RemoteException {
        zzfhh zzfhh1;
        synchronized(this) {
            if(!zzm0.zzb()) {
                boolean z = ((Boolean)zzbej.zzd.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue();
                if(this.zzf.clientJarVersion < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzlb)))) || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
            }
            if(s == null) {
                zzo.zzg("Ad unit ID should not be null for app open ad.");
                zzewq zzewq0 = () -> {
                    zze zze0 = zzfdk.zzd(6, null, null);
                    this.zzd.zzdz(zze0);
                };
                this.zzc.execute(zzewq0);
                return false;
            }
            if(this.zzj != null) {
                return false;
            }
            if(((Boolean)zzbee.zzc.zze()).booleanValue()) {
                zzcnw zzcnw0 = (zzcnw)this.zze.zzd();
                if(zzcnw0 == null) {
                    zzfhh1 = null;
                }
                else {
                    zzfhh zzfhh0 = zzcnw0.zzh();
                    zzfhh0.zzi(7);
                    zzfhh0.zzb(zzm0.zzp);
                    zzfhh0.zzf(zzm0.zzm);
                    zzfhh1 = zzfhh0;
                }
            }
            else {
                zzfhh1 = null;
            }
            zzfdg.zza(this.zzb, zzm0.zzf);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzm0.zzf) {
                this.zza.zzl().zzo(true);
            }
            Bundle bundle0 = zzdrg.zza(new Pair[]{new Pair("api-call", zzm0.zzz), new Pair("dynamite-enter", zzv.zzC().currentTimeMillis())});
            this.zzi.zzt(s);
            zzs zzs0 = zzs.zzb();
            this.zzi.zzs(zzs0);
            this.zzi.zzH(zzm0);
            this.zzi.zzA(bundle0);
            zzfcj zzfcj0 = this.zzi.zzJ();
            int v1 = zzfhg.zzf(zzfcj0);
            zzfgw zzfgw0 = zzfgv.zzb(this.zzb, v1, 7, zzm0);
            zzewu zzewu0 = new zzewu(null);
            zzewu0.zza = zzfcj0;
            zzezg zzezg0 = new zzezg(zzewu0, null);
            zzewr zzewr0 = (zzezd zzezd0) -> synchronized(this) {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzia)).booleanValue()) {
                    zzcoj zzcoj0 = new zzcoj(this.zzg);
                    zzcva zzcva0 = new zzcva();
                    zzcva0.zzf(this.zzb);
                    zzcva0.zzk(((zzewu)zzezd0).zza);
                    zzcvc zzcvc0 = zzcva0.zzl();
                    zzdbk zzdbk0 = new zzdbk();
                    zzdbk0.zzc(this.zzd, this.zzc);
                    zzdbk0.zzl(this.zzd, this.zzc);
                    return this.zze(zzcoj0, zzcvc0, zzdbk0.zzn());
                }
                zzexm zzexm0 = zzexm.zzi(this.zzd);
                zzdbk zzdbk1 = new zzdbk();
                zzdbk1.zzb(zzexm0, this.zzc);
                zzdbk1.zzg(zzexm0, this.zzc);
                zzdbk1.zzh(zzexm0, this.zzc);
                zzdbk1.zzi(zzexm0, this.zzc);
                zzdbk1.zzc(zzexm0, this.zzc);
                zzdbk1.zzl(zzexm0, this.zzc);
                zzdbk1.zzm(zzexm0);
                zzcoj zzcoj1 = new zzcoj(this.zzg);
                zzcva zzcva1 = new zzcva();
                zzcva1.zzf(this.zzb);
                zzcva1.zzk(((zzewu)zzezd0).zza);
                return this.zze(zzcoj1, zzcva1.zzl(), zzdbk1.zzn());
            };
            t0 t00 = this.zze.zzc(zzezg0, zzewr0, null);
            this.zzj = t00;
            zzgch.zzr(t00, new zzewt(this, zzelc0, zzfhh1, zzfgw0, zzewu0), this.zzc);
            return true;
        }
    }

    protected abstract zzcuy zze(zzcoj arg1, zzcvc arg2, zzdbm arg3);

    static void zzj(zzeww zzeww0, t0 t00) {
        zzeww0.zzj = null;
    }

    // 检测为 Lambda 实现
    final void zzk() [...]

    public final void zzl(zzy zzy0) {
        this.zzi.zzu(zzy0);
    }

    // 检测为 Lambda 实现
    private final zzcuy zzm(zzezd zzezd0) [...]
}

