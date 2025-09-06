package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.Executor;

public final class zzehz implements zzedc {
    private final Context zza;
    private final Executor zzb;
    private final zzdof zzc;

    public zzehz(Context context0, Executor executor0, zzdof zzdof0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzdof0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final Object zza(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq, zzegu {
        zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, zzecz0.zza);
        zzdoc zzdoc0 = new zzdoc(new zzehv(zzecz0));
        zzdob zzdob0 = this.zzc.zze(zzcrp0, zzdoc0);
        zzdob0.zzd().zzo(new zzcma(((zzfdh)zzecz0.zzb)), this.zzb);
        zzcxa zzcxa0 = zzdob0.zze();
        zzcvr zzcvr0 = zzdob0.zzb();
        zzehy zzehy0 = new zzehy(this, zzdob0.zza(), zzcvr0, zzcxa0, zzdob0.zzg());
        ((zzeet)zzecz0.zzc).zzc(zzehy0);
        return zzdob0.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq {
        if(!((zzfdh)zzecz0.zzb).zzC()) {
            zzehx zzehx0 = new zzehx(this, zzfca0, zzfbo0, zzecz0);
            ((zzeet)zzecz0.zzc).zzd(zzehx0);
            ((zzfdh)zzecz0.zzb).zzh(this.zza, zzfca0.zza.zza.zzd, null, ((zzbwh)zzecz0.zzc), zzfbo0.zzv.toString());
            return;
        }
        zzehz.zze(zzfca0, zzfbo0, zzecz0);
    }

    static void zzd(zzehz zzehz0, zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) {
        zzehz.zze(zzfca0, zzfbo0, zzecz0);
    }

    private static final void zze(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) {
        try {
            ((zzfdh)zzecz0.zzb).zzk(zzfca0.zza.zza.zzd, zzfbo0.zzv.toString());
        }
        catch(Exception exception0) {
            zzo.zzk(("Fail to load ad from adapter " + zzecz0.zza), exception0);
        }
    }
}

