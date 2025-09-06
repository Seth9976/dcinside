package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import jeb.synthetic.FIN;

final class zzbnd implements zzbjp {
    final long zza;
    final zzbnr zzb;
    final zzbmn zzc;
    final zzbns zzd;

    zzbnd(zzbns zzbns0, long v, zzbnr zzbnr0, zzbmn zzbmn0) {
        this.zza = v;
        this.zzb = zzbnr0;
        this.zzc = zzbmn0;
        this.zzd = zzbns0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzbnt zzbnt0 = (zzbnt)object0;
        zze.zza(("onGmsg /jsLoaded. JsLoaded latency is " + (zzv.zzC().currentTimeMillis() - this.zza) + " ms."));
        zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        Object object1 = this.zzd.zza;
        __monitor_enter(object1);
        int v = FIN.finallyOpen$NT();
        zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
        switch(this.zzb.zze()) {
            case -1: 
            case 1: {
                zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                this.zzd.zzi = 0;
                this.zzc.zzq("/log", zzbjo.zzg);
                this.zzc.zzq("/result", zzbjo.zzo);
                this.zzb.zzi(this.zzc);
                this.zzd.zzh = this.zzb;
                zze.zza("Successfully loaded JS Engine.");
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(object1);
                FIN.finallyCodeEnd$NT(v);
                zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
            }
        }
    }
}

