package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

final class zzbne implements zzbjp {
    final zzbmn zza;
    final zzby zzb;
    final zzbns zzc;

    zzbne(zzbns zzbns0, zzava zzava0, zzbmn zzbmn0, zzby zzby0) {
        this.zza = zzbmn0;
        this.zzb = zzby0;
        this.zzc = zzbns0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzbnt zzbnt0 = (zzbnt)object0;
        zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized(this.zzc.zza) {
            zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
            zzo.zzi("JS Engine is requesting an update");
            if(this.zzc.zzi == 0) {
                zzo.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", ((zzbjp)this.zzb.zza()));
        }
        zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}

