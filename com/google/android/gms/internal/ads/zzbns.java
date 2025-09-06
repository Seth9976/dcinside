package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.FIN;
import o3.j;

@j
public final class zzbns {
    private final Object zza;
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    @Nullable
    private final zzfhk zze;
    private final zzbd zzf;
    private final zzbd zzg;
    @Nullable
    private zzbnr zzh;
    private int zzi;

    public zzbns(Context context0, VersionInfoParcel versionInfoParcel0, String s, zzbd zzbd0, zzbd zzbd1, @Nullable zzfhk zzfhk0) {
        this.zza = new Object();
        this.zzi = 1;
        this.zzc = s;
        this.zzb = context0.getApplicationContext();
        this.zzd = versionInfoParcel0;
        this.zze = zzfhk0;
        this.zzf = zzbd0;
        this.zzg = zzbd1;
    }

    public final zzbnm zzb(@Nullable zzava zzava0) {
        zze.zza("getEngine: Trying to acquire lock");
        synchronized(this.zza) {
            zze.zza("getEngine: Lock acquired");
            zze.zza("refreshIfDestroyed: Trying to acquire lock");
            synchronized(this.zza) {
                zze.zza("refreshIfDestroyed: Lock acquired");
                zzbnr zzbnr0 = this.zzh;
                if(zzbnr0 != null && this.zzi == 0) {
                    zzbnr0.zzj((zzbmn zzbmn0) -> if(zzbmn0.zzi()) {
                        this.zzi = 1;
                    }, new zzbnb());
                }
            }
            zze.zza("refreshIfDestroyed: Lock released");
            if(this.zzh != null && this.zzh.zze() != -1) {
                int v2 = this.zzi;
                if(v2 == 0) {
                    zze.zza("getEngine (NO_UPDATE): Lock released");
                    return this.zzh.zza();
                }
                if(v2 == 1) {
                    this.zzi = 2;
                    this.zzd(null);
                    zze.zza("getEngine (PENDING_UPDATE): Lock released");
                    return this.zzh.zza();
                }
                zze.zza("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            this.zzh = this.zzd(null);
            zze.zza("getEngine (NULL or REJECTED): Lock released");
            return this.zzh.zza();
        }
    }

    protected final zzbnr zzd(@Nullable zzava zzava0) {
        zzfgw zzfgw0 = zzfgv.zza(this.zzb, 6);
        zzfgw0.zzi();
        zzbnr zzbnr0 = new zzbnr(this.zzg);
        zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        zzbnc zzbnc0 = () -> {
            zzbmv zzbmv0;
            long v = zzv.zzC().currentTimeMillis();
            ArrayList arrayList0 = new ArrayList();
            try {
                zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
                zzbmv0 = new zzbmv(this.zzb, this.zzd, null, null);
                zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            }
            catch(Throwable throwable0) {
                zzo.zzh("Error creating webview.", throwable0);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
                    zzbnr0.zzh(throwable0, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                    return;
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzhD)).booleanValue()) {
                    zzv.zzp().zzv(throwable0, "SdkJavascriptFactory.loadJavascriptEngine");
                    zzbnr0.zzg();
                    return;
                }
                zzv.zzp().zzw(throwable0, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnr0.zzg();
                return;
            }
            zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbmv0.zzk(new zzbmy(this, arrayList0, v, zzbnr0, zzbmv0));
            zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbmv0.zzq("/jsLoaded", new zzbnd(this, v, zzbnr0, zzbmv0));
            zzby zzby0 = new zzby();
            zzbne zzbne0 = new zzbne(this, null, zzbmv0, zzby0);
            zzby0.zzb(zzbne0);
            zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbmv0.zzq("/requestReload", zzbne0);
            zze.zza(("loadJavascriptEngine > javascriptPath: " + this.zzc));
            if(this.zzc.endsWith(".js")) {
                zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbmv0.zzh(this.zzc);
                zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            }
            else if(this.zzc.startsWith("<html>")) {
                zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbmv0.zzf(this.zzc);
                zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            }
            else {
                zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbmv0.zzg(this.zzc);
                zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            zzbng zzbng0 = new zzbng(this, zzbnr0, zzbmv0, arrayList0, v);
            long v1 = (long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzc)))));
            zzs.zza.postDelayed(zzbng0, v1);
        };
        zzbzw.zzf.execute(zzbnc0);
        zze.zza("loadNewJavascriptEngine: Promise created");
        zzbnr0.zzj(new zzbnh(this, zzbnr0, zzfgw0), new zzbni(this, zzbnr0, zzfgw0));
        return zzbnr0;
    }

    // 检测为 Lambda 实现
    final void zzi(zzava zzava0, zzbnr zzbnr0) [...]

    final void zzj(zzbnr zzbnr0, zzbmn zzbmn0, ArrayList arrayList0, long v) {
        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        Object object0 = this.zza;
        __monitor_enter(object0);
        int v1 = FIN.finallyOpen$NT();
        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
        switch(zzbnr0.zze()) {
            case -1: 
            case 1: {
                zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                FIN.finallyExec$NT(v1);
                return;
            }
            default: {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
                    zzbnr0.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                }
                else {
                    zzbnr0.zzg();
                }
                Objects.requireNonNull(zzbmn0);
                zzbmx zzbmx0 = new zzbmx(zzbmn0);
                zzbzw.zzf.execute(zzbmx0);
                zze.zza(("Could not receive /jsLoaded in " + zzbe.zzc().zza(zzbcl.zzb) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbnr0.zze() + ". Update status(onEngLoadedTimeout) is " + this.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + arrayList0.get(0) + " ms. Total latency(onEngLoadedTimeout) is " + (zzv.zzC().currentTimeMillis() - v) + " ms. Rejecting."));
                FIN.finallyCodeBegin$NT(v1);
                __monitor_exit(object0);
                FIN.finallyCodeEnd$NT(v1);
                zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
            }
        }
    }

    // 检测为 Lambda 实现
    final void zzk(zzbmn zzbmn0) [...]
}

