package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzab;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import o3.h;

public abstract class zzcgx implements zzckx {
    @h
    private static zzcgx zza;

    public abstract zzfjj zzA();

    public abstract zzgcs zzB();

    public abstract Executor zzC();

    public abstract ScheduledExecutorService zzD();

    public abstract zzbzb zzE();

    @Override  // com.google.android.gms.internal.ads.zzckx
    public final zzbzb zzF() {
        return this.zzE();
    }

    private static zzcgx zzG(Context context0, @h zzbpe zzbpe0, int v, boolean z, int v1, zzcid zzcid0) {
        synchronized(zzcgx.class) {
            zzcgx zzcgx0 = zzcgx.zza;
            if(zzcgx0 != null) {
                return zzcgx0;
            }
            long v3 = zzv.zzC().currentTimeMillis();
            zzbcl.zza(context0);
            if(((Boolean)zzbed.zze.zze()).booleanValue()) {
                zzbbv.zzd(context0);
            }
            zzfdf zzfdf0 = zzfdf.zzd(context0);
            VersionInfoParcel versionInfoParcel0 = zzfdf0.zzc(244410000, false, v1);
            zzfdf0.zzf(zzbpe0);
            zzcis zzcis0 = new zzcis(null);
            zzcgy zzcgy0 = new zzcgy();
            zzcgy0.zzf(versionInfoParcel0);
            zzcgy0.zze(context0);
            zzcgy0.zzd(v3);
            zzcis0.zzb(new zzcha(zzcgy0, null));
            zzcis0.zzc(new zzcjn(zzcid0));
            zzcgx zzcgx1 = zzcis0.zza();
            zzv.zzp().zzu(context0, versionInfoParcel0);
            zzv.zzc().zzi(context0);
            zzv.zzq().zzm(context0);
            zzv.zzq().zzl(context0);
            zzd.zza(context0);
            zzv.zzb().zzd(context0);
            zzv.zzw().zzb(context0);
            zzcgx1.zza().zzc();
            zzbyj.zzd(context0);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzgb)).booleanValue() && !((Boolean)zzbe.zzc().zza(zzbcl.zzaI)).booleanValue()) {
                new zzeax(context0, versionInfoParcel0, new zzbbj(new zzbbp(context0)), new zzeac(new zzdzy(context0), zzcgx1.zzB())).zzb(zzv.zzp().zzi().zzN());
            }
            zzcgx.zza = zzcgx1;
            return zzcgx1;
        }
    }

    public abstract zzcb zza();

    public static zzcgx zzb(Context context0, @h zzbpe zzbpe0, int v) {
        return zzcgx.zzG(context0, zzbpe0, 244410000, false, v, new zzcid());
    }

    public abstract zzcjy zzc();

    public abstract zzcnz zzd();

    public abstract zzcpp zze();

    public abstract zzcyl zzf();

    public abstract zzdft zzg();

    public abstract zzdgp zzh();

    public abstract zzdoe zzi();

    public abstract zzdrw zzj();

    public abstract zzdtg zzk();

    public abstract zzduv zzl();

    public abstract zzdvs zzm();

    public abstract zzebv zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv zzo();

    public abstract zzab zzp();

    public abstract zzau zzq();

    @Override  // com.google.android.gms.internal.ads.zzckx
    public final zzeuu zzr(zzbvk zzbvk0, int v) {
        return this.zzs(new zzevx(zzbvk0, v));
    }

    protected abstract zzeuu zzs(zzevx arg1);

    public abstract zzewo zzt();

    public abstract zzeyc zzu();

    public abstract zzezt zzv();

    public abstract zzfbh zzw();

    public abstract zzfcy zzx();

    public abstract zzfdi zzy();

    public abstract zzfhk zzz();
}

