package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbs;
import java.util.concurrent.Executor;

public final class zzefs implements zzedc {
    private final Context zza;
    private final zzdgq zzb;
    private final Executor zzc;

    public zzefs(Context context0, zzdgq zzdgq0, Executor executor0) {
        this.zza = context0;
        this.zzb = zzdgq0;
        this.zzc = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final Object zza(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq, zzegu {
        zzdif zzdif0;
        zzbpp zzbpp0 = ((zzfdh)zzecz0.zzb).zzD();
        zzbpq zzbpq0 = ((zzfdh)zzecz0.zzb).zzE();
        zzbpt zzbpt0 = ((zzfdh)zzecz0.zzb).zzd();
        if(zzbpt0 != null && zzefs.zzc(zzfca0, 6)) {
            zzdif0 = zzdif.zzt(zzbpt0);
        }
        else {
            if(zzbpp0 != null && zzefs.zzc(zzfca0, 6)) {
                zzdif0 = zzdif.zzai(zzbpp0);
                goto label_17;
            }
            if(zzbpp0 != null && zzefs.zzc(zzfca0, 2)) {
                zzdif0 = zzdif.zzag(zzbpp0);
                goto label_17;
            }
            if(zzbpq0 != null && zzefs.zzc(zzfca0, 6)) {
                zzdif0 = zzdif.zzaj(zzbpq0);
            }
            else if(zzbpq0 != null && zzefs.zzc(zzfca0, 1)) {
                zzdif0 = zzdif.zzah(zzbpq0);
            }
            else {
                throw new zzegu(1, "No native ad mappers");
            }
        }
    label_17:
        if(zzdif0 != null) {
            String s = Integer.toString(zzdif0.zzc());
            if(zzfca0.zza.zza.zzg.contains(s)) {
                zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, zzecz0.zza);
                zzdir zzdir0 = new zzdir(zzdif0);
                zzdkk zzdkk0 = new zzdkk(zzbpq0, zzbpp0, zzbpt0);
                zzdih zzdih0 = this.zzb.zze(zzcrp0, zzdir0, zzdkk0);
                zzeik zzeik0 = zzdih0.zzk();
                ((zzees)zzecz0.zzc).zzc(zzeik0);
                zzdih0.zzd().zzo(new zzcma(((zzfdh)zzecz0.zzb)), this.zzc);
                return zzdih0.zza();
            }
        }
        throw new zzegu(1, "No corresponding native ad listener");
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq {
        String s = zzbs.zzm(zzfbo0.zzs);
        ((zzfdh)zzecz0.zzb).zzp(this.zza, zzfca0.zza.zza.zzd, zzfbo0.zzv.toString(), s, ((zzbpk)zzecz0.zzc), zzfca0.zza.zza.zzi, zzfca0.zza.zza.zzg);
    }

    private static final boolean zzc(zzfca zzfca0, int v) {
        return zzfca0.zza.zza.zzg.contains(Integer.toString(v));
    }
}

