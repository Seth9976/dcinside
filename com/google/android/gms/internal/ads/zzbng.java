package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.FIN;

final class zzbng implements Runnable {
    final zzbnr zza;
    final zzbmn zzb;
    final ArrayList zzc;
    final long zzd;
    final zzbns zze;

    zzbng(zzbns zzbns0, zzbnr zzbnr0, zzbmn zzbmn0, ArrayList arrayList0, long v) {
        this.zza = zzbnr0;
        this.zzb = zzbmn0;
        this.zzc = arrayList0;
        this.zzd = v;
        this.zze = zzbns0;
        super();
    }

    @Override
    public final void run() {
        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        Object object0 = this.zze.zza;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
        switch(this.zza.zze()) {
            case -1: 
            case 1: {
                zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
                    TimeoutException timeoutException0 = new TimeoutException("Unable to fully load JS engine.");
                    this.zza.zzh(timeoutException0, "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                }
                else {
                    this.zza.zzg();
                }
                Objects.requireNonNull(this.zzb);
                zzbnf zzbnf0 = new zzbnf(this.zzb);
                zzbzw.zzf.execute(zzbnf0);
                zze.zza(("Could not finish the full JS engine loading in " + zzbe.zzc().zza(zzbcl.zzc) + " ms. JS engine session reference status(fullLoadTimeout) is " + this.zza.zze() + ". Update status(fullLoadTimeout) is " + this.zze.zzi + (this.zzc.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + this.zzc.get(0)) + " ms. Total latency(fullLoadTimeout) is " + (zzv.zzC().currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting."));
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(object0);
                FIN.finallyCodeEnd$NT(v);
                zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
            }
        }
    }
}

