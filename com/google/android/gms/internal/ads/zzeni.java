package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeni implements zzetr {
    @VisibleForTesting
    final zzbzm zza;
    @VisibleForTesting
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgcs zzd;
    private final Context zze;

    zzeni(Context context0, zzbzm zzbzm0, ScheduledExecutorService scheduledExecutorService0, zzgcs zzgcs0) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzdb)).booleanValue()) {
            this.zzb = AppSet.getClient(context0);
        }
        this.zze = context0;
        this.zza = zzbzm0;
        this.zzc = scheduledExecutorService0;
        this.zzd = zzgcs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 11;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzcX)).booleanValue() && !((Boolean)zzbe.zzc().zza(zzbcl.zzdc)).booleanValue()) {
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzcY)).booleanValue()) {
                return zzgch.zzm(zzfrj.zza(this.zzb.getAppSetIdInfo(), null), new zzenf(), zzbzw.zzg);
            }
            Task task0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzdb)).booleanValue() ? zzfdn.zza(this.zze) : this.zzb.getAppSetIdInfo();
            if(task0 == null) {
                return zzgch.zzh(new zzenj(null, -1));
            }
            t0 t00 = zzgch.zzn(zzfrj.zza(task0, null), new zzeng(), zzbzw.zzg);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzcZ)).booleanValue()) {
                t00 = zzgch.zzo(t00, ((long)(((Long)zzbe.zzc().zza(zzbcl.zzda)))), TimeUnit.MILLISECONDS, this.zzc);
            }
            zzenh zzenh0 = new zzenh(this);
            return zzgch.zze(t00, Exception.class, zzenh0, this.zzd);
        }
        return zzgch.zzh(new zzenj(null, -1));
    }
}

