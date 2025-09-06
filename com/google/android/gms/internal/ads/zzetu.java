package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class zzetu {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfhh zzd;
    private final zzdrw zze;
    private long zzf;
    @GuardedBy("this")
    private int zzg;

    public zzetu(Context context0, Executor executor0, Set set0, zzfhh zzfhh0, zzdrw zzdrw0) {
        this.zzf = 0L;
        this.zzg = 0;
        this.zza = context0;
        this.zzc = executor0;
        this.zzb = set0;
        this.zzd = zzfhh0;
        this.zze = zzdrw0;
    }

    public final t0 zza(Object object0, @Nullable Bundle bundle0, boolean z) {
        zzfgw zzfgw0 = zzfgv.zza(this.zza, 8);
        zzfgw0.zzi();
        ArrayList arrayList0 = new ArrayList(this.zzb.size());
        List list0 = new ArrayList();
        zzbcc zzbcc0 = zzbcl.zzlC;
        if(!((String)zzbe.zzc().zza(zzbcc0)).isEmpty()) {
            list0 = Arrays.asList(((String)zzbe.zzc().zza(zzbcc0)).split(","));
        }
        this.zzf = zzv.zzC().elapsedRealtime();
        Bundle bundle1 = new Bundle();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && bundle0 != null) {
            long v = zzv.zzC().currentTimeMillis();
            if(object0 instanceof zzcuv) {
                bundle0.putLong("client-signals-start", v);
            }
            else {
                bundle0.putLong("gms-signals-start", v);
            }
        }
        for(Object object1: this.zzb) {
            zzetr zzetr0 = (zzetr)object1;
            if(!list0.contains(String.valueOf(zzetr0.zza()))) {
                long v1 = zzv.zzC().elapsedRealtime();
                t0 t00 = zzetr0.zzb();
                t00.addListener(() -> {
                    long v1 = zzv.zzC().elapsedRealtime() - v1;
                    if(((Boolean)zzben.zza.zze()).booleanValue()) {
                        zze.zza(("Signal runtime (ms) : " + zzfve.zzc(zzetr0.getClass().getCanonicalName()) + " = " + v1));
                    }
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzco)).booleanValue()) {
                        synchronized(this) {
                            bundle1.putLong("sig" + zzetr0.zza(), v1);
                        }
                    }
                    if(!((Boolean)zzbe.zzc().zza(zzbcl.zzci)).booleanValue()) {
                        return;
                    }
                    zzdrv zzdrv0 = this.zze.zza();
                    zzdrv0.zzb("action", "lat_ms");
                    zzdrv0.zzb("lat_grp", "sig_lat_grp");
                    zzdrv0.zzb("lat_id", String.valueOf(zzetr0.zza()));
                    zzdrv0.zzb("clat_ms", String.valueOf(v1));
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzcj)).booleanValue()) {
                        synchronized(this) {
                            ++this.zzg;
                            zzdrv0.zzb("seq_num", zzv.zzp().zzh().zzd());
                            synchronized(this) {
                                if(this.zzg == this.zzb.size() && this.zzf != 0L) {
                                    this.zzg = 0;
                                    String s = String.valueOf(zzv.zzC().elapsedRealtime() - this.zzf);
                                    if(zzetr0.zza() <= 39 || zzetr0.zza() >= 52) {
                                        zzdrv0.zzb("lat_clsg", s);
                                    }
                                    else {
                                        zzdrv0.zzb("lat_gmssg", s);
                                    }
                                }
                            }
                        }
                    }
                    zzdrv0.zzh();
                }, zzbzw.zzg);
                arrayList0.add(t00);
            }
        }
        t0 t01 = zzgch.zzb(arrayList0).zza(new zzett(arrayList0, object0, z, bundle0, bundle1), this.zzc);
        if(zzfhk.zza()) {
            zzfhg.zza(t01, this.zzd, zzfgw0);
        }
        return t01;
    }

    // 检测为 Lambda 实现
    public final void zzb(long v, zzetr zzetr0, Bundle bundle0) [...]
}

