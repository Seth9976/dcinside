package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.Executor;

public final class zzehd implements zzedc {
    private final Context zza;
    private final Executor zzb;
    private final zzdof zzc;

    public zzehd(Context context0, Executor executor0, zzdof zzdof0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzdof0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final Object zza(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq, zzegu {
        zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, zzecz0.zza);
        zzdoc zzdoc0 = new zzdoc(new zzehc(zzecz0));
        zzdob zzdob0 = this.zzc.zze(zzcrp0, zzdoc0);
        zzdob0.zzd().zzo(new zzcma(((zzfdh)zzecz0.zzb)), this.zzb);
        zzehj zzehj0 = zzdob0.zzn();
        ((zzees)zzecz0.zzc).zzc(zzehj0);
        return zzdob0.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq {
        try {
            zzfcj zzfcj0 = zzfca0.zza.zza;
            if(zzfcj0.zzo.zza == 3) {
                ((zzfdh)zzecz0.zzb).zzr(this.zza, zzfcj0.zzd, zzfbo0.zzv.toString(), ((zzbpk)zzecz0.zzc));
                return;
            }
            ((zzfdh)zzecz0.zzb).zzq(this.zza, zzfcj0.zzd, zzfbo0.zzv.toString(), ((zzbpk)zzecz0.zzc));
            return;
        }
        catch(Exception exception0) {
        }
        zzo.zzk(("Fail to load ad from adapter " + zzecz0.zza), exception0);
    }
}

