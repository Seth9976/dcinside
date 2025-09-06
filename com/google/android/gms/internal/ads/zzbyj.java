package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

public abstract class zzbyj {
    @GuardedBy("ScionComponent.class")
    @VisibleForTesting
    static zzbyj zza;

    abstract zzbxv zza();

    abstract zzbxz zzb();

    abstract zzbyn zzc();

    public static zzbyj zzd(Context context0) {
        synchronized(zzbyj.class) {
            zzbyj zzbyj0 = zzbyj.zza;
            if(zzbyj0 != null) {
                return zzbyj0;
            }
            Context context1 = context0.getApplicationContext();
            zzbcl.zza(context1);
            zzg zzg0 = zzv.zzp().zzi();
            zzg0.zzp(context1);
            zzbyb zzbyb0 = new zzbyb(null);
            zzbyb0.zzb(context1);
            zzbyb0.zzc(zzv.zzC());
            zzbyb0.zza(zzg0);
            zzbyb0.zzd(zzv.zzo());
            zzbyj zzbyj1 = zzbyb0.zze();
            zzbyj.zza = zzbyj1;
            zzbyj1.zza().zza();
            zzbyn zzbyn0 = zzbyj.zza.zzc();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzaE)).booleanValue()) {
                Map map0 = zzs.zzw(((String)zzbe.zzc().zza(zzbcl.zzaF)));
                for(Object object0: map0.keySet()) {
                    zzbyn0.zzc(((String)object0));
                }
                zzbyn0.zzd(new zzbyl(zzbyn0, map0));
            }
            return zzbyj.zza;
        }
    }
}

