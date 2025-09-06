package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzegx implements zzgbo {
    private final zzfgn zza;
    private final zzcvv zzb;
    private final zzfiv zzc;
    private final zzfja zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcrc zzg;
    private final zzegq zzh;
    private final zzedb zzi;
    private final Context zzj;
    private final zzfhh zzk;
    private final zzega zzl;
    private final zzdrq zzm;

    zzegx(Context context0, zzfgn zzfgn0, zzegq zzegq0, zzcvv zzcvv0, zzfiv zzfiv0, zzfja zzfja0, zzcrc zzcrc0, Executor executor0, ScheduledExecutorService scheduledExecutorService0, zzedb zzedb0, zzfhh zzfhh0, zzega zzega0, zzdrq zzdrq0) {
        this.zzj = context0;
        this.zza = zzfgn0;
        this.zzh = zzegq0;
        this.zzb = zzcvv0;
        this.zzc = zzfiv0;
        this.zzd = zzfja0;
        this.zzg = zzcrc0;
        this.zze = executor0;
        this.zzf = scheduledExecutorService0;
        this.zzi = zzedb0;
        this.zzk = zzfhh0;
        this.zzl = zzega0;
        this.zzm = zzdrq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) throws Exception {
        Iterator iterator0;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            zzbvk zzbvk0 = ((zzfca)object0).zzb.zzd;
            if(zzbvk0 != null) {
                Bundle bundle0 = zzbvk0.zzm;
                if(bundle0 != null) {
                    this.zzm.zza().putAll(bundle0);
                }
            }
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzcl)).booleanValue()) {
            long v = zzv.zzC().currentTimeMillis();
            this.zzm.zza().putLong("rendering-start", v);
        }
        String s = zzegx.zzc(((zzfca)object0));
        this.zzi.zzi(((zzfca)object0).zzb.zzb);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzih)).booleanValue()) {
            int v1 = ((zzfca)object0).zzb.zzb.zzf;
            if(v1 != 0 && (v1 < 200 || v1 >= 300)) {
                return zzgch.zzg(new zzegu(3, s));
            }
        }
        zzfbr zzfbr0 = ((zzfca)object0).zzb.zzb;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            String s1 = zzfbr0.zzq;
            if(TextUtils.isEmpty(s1)) {
                iterator0 = ((zzfca)object0).zzb.zza.iterator();
                goto label_24;
            }
            else {
                this.zzi.zzh(s1, ((zzfca)object0).zzb.zza);
            }
        }
        else {
            iterator0 = ((zzfca)object0).zzb.zza.iterator();
        label_24:
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                zzfbo zzfbo0 = (zzfbo)object1;
                this.zzi.zzd(zzfbo0);
                for(Object object2: zzfbo0.zza) {
                    zzecw zzecw0 = this.zzg.zza(zzfbo0.zzb, ((String)object2));
                    if(zzecw0 != null && zzecw0.zzb(((zzfca)object0), zzfbo0)) {
                        continue label_24;
                    }
                    if(false) {
                        break;
                    }
                }
                zze zze0 = zzfdk.zzd(1, null, null);
                this.zzi.zzf(zzfbo0, 0L, zze0);
            }
        }
        zzcmo zzcmo0 = new zzcmo(((zzfca)object0), this.zzd, this.zzc);
        this.zzb.zzo(zzcmo0, this.zze);
        if(((zzfca)object0).zzb.zzb.zzr > 1) {
            return this.zzl.zzb(((zzfca)object0));
        }
        zzfft zzfft0 = zzffx.zzc(zzgch.zzg(new zzegu(3, zzegx.zzc(((zzfca)object0)))), zzfgh.zzn, this.zza).zza();
        this.zzh.zzl();
        int v2 = 0;
        for(Object object3: ((zzfca)object0).zzb.zza) {
            zzfbo zzfbo1 = (zzfbo)object3;
            for(Object object4: zzfbo1.zza) {
                String s2 = (String)object4;
                zzecw zzecw1 = this.zzg.zza(zzfbo1.zzb, s2);
                if(zzecw1 != null && zzecw1.zzb(((zzfca)object0), zzfbo1)) {
                    zzfgd zzfgd0 = this.zza.zzb(zzfgh.zzo, zzfft0).zzh("render-config-" + v2 + "-" + s2);
                    zzegv zzegv0 = (Throwable throwable0) -> {
                        zzfgw zzfgw0 = zzfgv.zza(this.zzj, 12);
                        zzfgw0.zzd(zzfbo1.zzE);
                        zzfgw0.zzi();
                        t0 t00 = zzgch.zzo(zzecw1.zza(((zzfca)object0), zzfbo1), ((long)zzfbo1.zzR), TimeUnit.MILLISECONDS, this.zzf);
                        this.zzh.zzf(((zzfca)object0), zzfbo1, t00, this.zzc);
                        zzfhg.zza(t00, this.zzk, zzfgw0);
                        return t00;
                    };
                    zzfft0 = zzfgd0.zzc(Throwable.class, zzegv0).zza();
                    break;
                }
                if(false) {
                    break;
                }
            }
            ++v2;
        }
        Objects.requireNonNull(this.zzh);
        zzfft0.addListener(new zzegw(this.zzh), this.zze);
        return zzfft0;
    }

    // 检测为 Lambda 实现
    final t0 zzb(zzfbo zzfbo0, zzfca zzfca0, zzecw zzecw0, Throwable throwable0) throws Exception [...]

    static String zzc(zzfca zzfca0) {
        String s = "No fill.";
        String s1 = ((Boolean)zzbe.zzc().zza(zzbcl.zzfw)).booleanValue() ? "No fill." : "No ad config.";
        int v = zzfca0.zzb.zzb.zzf;
        if(v == 0) {
            s = s1;
        }
        else if(v < 200 || v >= 300) {
            s = v < 300 || v >= 400 ? "Received error HTTP response code: " + v : "No location header to follow redirect or too many redirects.";
        }
        else if(((Boolean)zzbe.zzc().zza(zzbcl.zzfv)).booleanValue()) {
            s = s1;
        }
        zzfbq zzfbq0 = zzfca0.zzb.zzb.zzj;
        return zzfbq0 == null ? s : zzfbq0.zza();
    }
}

