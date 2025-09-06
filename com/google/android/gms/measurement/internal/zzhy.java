package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.internal.measurement.zzhj;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzpn;
import j..util.Objects;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import w4.d;
import w4.e;

public class zzhy implements zzjc {
    @VisibleForTesting
    final long zza;
    private Boolean zzaa;
    private long zzab;
    private volatile Boolean zzac;
    @VisibleForTesting
    private Boolean zzad;
    @VisibleForTesting
    private Boolean zzae;
    private volatile boolean zzaf;
    private int zzag;
    private int zzah;
    private AtomicInteger zzai;
    private static volatile zzhy zzb;
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzab zzh;
    private final zzag zzi;
    private final zzha zzj;
    private final zzgo zzk;
    private final zzhv zzl;
    private final zznb zzm;
    private final zzos zzn;
    private final zzgh zzo;
    private final Clock zzp;
    private final zzlj zzq;
    private final zzjq zzr;
    private final zzb zzs;
    private final zzle zzt;
    private final String zzu;
    private zzgf zzv;
    private zzls zzw;
    private zzaz zzx;
    private zzgg zzy;
    private boolean zzz;

    private zzhy(zzjo zzjo0) {
        int v = 0;
        this.zzz = false;
        this.zzai = new AtomicInteger(0);
        Preconditions.checkNotNull(zzjo0);
        zzab zzab0 = new zzab(zzjo0.zza);
        this.zzh = zzab0;
        zzga.zza = zzab0;
        Context context0 = zzjo0.zza;
        this.zzc = context0;
        this.zzd = zzjo0.zzb;
        this.zze = zzjo0.zzc;
        this.zzf = zzjo0.zzd;
        this.zzg = zzjo0.zzh;
        this.zzac = zzjo0.zze;
        this.zzu = zzjo0.zzj;
        this.zzaf = true;
        zzdw zzdw0 = zzjo0.zzg;
        if(zzdw0 != null) {
            Bundle bundle0 = zzdw0.zzg;
            if(bundle0 != null) {
                Object object0 = bundle0.get("measurementEnabled");
                if(object0 instanceof Boolean) {
                    this.zzad = (Boolean)object0;
                }
                Object object1 = zzdw0.zzg.get("measurementDeactivated");
                if(object1 instanceof Boolean) {
                    this.zzae = (Boolean)object1;
                }
            }
        }
        zzhj.zzb(context0);
        Clock clock0 = DefaultClock.getInstance();
        this.zzp = clock0;
        Long long0 = zzjo0.zzi;
        this.zza = long0 == null ? clock0.currentTimeMillis() : ((long)long0);
        this.zzi = new zzag(this);
        zzha zzha0 = new zzha(this);
        zzha0.zzad();
        this.zzj = zzha0;
        zzgo zzgo0 = new zzgo(this);
        zzgo0.zzad();
        this.zzk = zzgo0;
        zzos zzos0 = new zzos(this);
        zzos0.zzad();
        this.zzn = zzos0;
        this.zzo = new zzgh(new zzjn(zzjo0, this));
        this.zzs = new zzb(this);
        zzlj zzlj0 = new zzlj(this);
        zzlj0.zzv();
        this.zzq = zzlj0;
        zzjq zzjq0 = new zzjq(this);
        zzjq0.zzv();
        this.zzr = zzjq0;
        zznb zznb0 = new zznb(this);
        zznb0.zzv();
        this.zzm = zznb0;
        zzle zzle0 = new zzle(this);
        zzle0.zzad();
        this.zzt = zzle0;
        zzhv zzhv0 = new zzhv(this);
        zzhv0.zzad();
        this.zzl = zzhv0;
        if(zzjo0.zzg != null && zzjo0.zzg.zzb != 0L) {
            v = 1;
        }
        if(context0.getApplicationContext() instanceof Application) {
            this.zzp().zzb(((boolean)(v ^ 1)));
        }
        else {
            this.zzj().zzu().zza("Application context is not an Application");
        }
        zzhv0.zzb(new zzid(this, zzjo0));
    }

    public static zzhy zza(Context context0, zzdw zzdw0, Long long0) {
        if(zzdw0 != null && (zzdw0.zze == null || zzdw0.zzf == null)) {
            zzdw0 = new zzdw(zzdw0.zza, zzdw0.zzb, zzdw0.zzc, zzdw0.zzd, null, null, zzdw0.zzg, null);
        }
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(context0.getApplicationContext());
        if(zzhy.zzb == null) {
            synchronized(zzhy.class) {
                if(zzhy.zzb == null) {
                    zzhy.zzb = new zzhy(new zzjo(context0, zzdw0, long0));
                }
            }
        }
        else if(zzdw0 != null && (zzdw0.zzg != null && zzdw0.zzg.containsKey("dataCollectionDefaultEnabled"))) {
            Preconditions.checkNotNull(zzhy.zzb);
            zzhy.zzb.zza(zzdw0.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzhy.zzb);
        return zzhy.zzb;
    }

    private static void zza(zzh zzh0) {
        if(zzh0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if(!zzh0.zzy()) {
            throw new IllegalStateException("Component not initialized: " + zzh0.getClass());
        }
    }

    static void zza(zzhy zzhy0, zzjo zzjo0) {
        zzhy0.zzl().zzt();
        zzaz zzaz0 = new zzaz(zzhy0);
        zzaz0.zzad();
        zzhy0.zzx = zzaz0;
        zzgg zzgg0 = new zzgg(zzhy0, zzjo0.zzf);
        zzgg0.zzv();
        zzhy0.zzy = zzgg0;
        zzgf zzgf0 = new zzgf(zzhy0);
        zzgf0.zzv();
        zzhy0.zzv = zzgf0;
        zzls zzls0 = new zzls(zzhy0);
        zzls0.zzv();
        zzhy0.zzw = zzls0;
        zzhy0.zzn.zzae();
        zzhy0.zzj.zzae();
        zzhy0.zzy.zzw();
        zzhy0.zzj().zzo().zza("App measurement initialized, version", 106000L);
        zzhy0.zzj().zzo().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s = zzgg0.zzad();
        if(TextUtils.isEmpty(zzhy0.zzd)) {
            if(zzhy0.zzt().zzd(s, zzhy0.zzi.zzu())) {
                zzhy0.zzj().zzo().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            }
            else {
                zzhy0.zzj().zzo().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + s);
            }
        }
        zzhy0.zzj().zzc().zza("Debug-level message logging enabled");
        if(zzhy0.zzag != zzhy0.zzai.get()) {
            zzhy0.zzj().zzg().zza("Not all components initialized", zzhy0.zzag, zzhy0.zzai.get());
        }
        zzhy0.zzz = true;
    }

    private static void zza(zzja zzja0) {
        if(zzja0 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void zza(zzjd zzjd0) {
        if(zzjd0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if(!zzjd0.zzaf()) {
            throw new IllegalStateException("Component not initialized: " + zzjd0.getClass());
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    @d
    public final Context zza() {
        return this.zzc;
    }

    @WorkerThread
    protected final void zza(zzdw zzdw0) {
        zzje zzje1;
        this.zzl().zzt();
        if(zzpn.zza() && this.zzi.zza(zzbh.zzci) && this.zzt().zzw()) {
            zzos zzos0 = this.zzt();
            zzos0.zzt();
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            zzp zzp0 = new zzp(zzos0.zzu);
            ContextCompat.registerReceiver(zzos0.zza(), zzp0, intentFilter0, 2);
            zzos0.zzj().zzc().zza("Registered app receiver");
        }
        zzje zzje0 = this.zzn().zzo();
        int v = zzje0.zza();
        zzjh zzjh0 = this.zzi.zzc("google_analytics_default_allow_ad_storage", false);
        zzjh zzjh1 = this.zzi.zzc("google_analytics_default_allow_analytics_storage", false);
        zzjh zzjh2 = zzjh.zza;
        if((zzjh0 != zzjh2 || zzjh1 != zzjh2) && this.zzn().zza(-10)) {
            zzje1 = zzje.zza(zzjh0, zzjh1, -10);
        }
        else if(!TextUtils.isEmpty(this.zzh().zzae()) && (v == 0 || v == 30 || (v == 10 || v == 30) || v == 40)) {
            this.zzp().zza(new zzje(null, null, -10), this.zza, false);
            zzje1 = null;
        }
        else if(!TextUtils.isEmpty(this.zzh().zzae()) || zzdw0 == null || zzdw0.zzg == null || !this.zzn().zza(30)) {
            zzje1 = null;
        }
        else {
            zzje1 = zzje.zza(zzdw0.zzg, 30);
            if(!zzje1.zzi()) {
                zzje1 = null;
            }
        }
        if(zzje1 != null) {
            this.zzp().zza(zzje1, this.zza, true);
            zzje0 = zzje1;
        }
        this.zzp().zza(zzje0);
        int v1 = this.zzn().zzn().zza();
        zzjh zzjh3 = this.zzi.zzc("google_analytics_default_allow_ad_personalization_signals", true);
        if(zzjh3 != zzjh2) {
            this.zzj().zzp().zza("Default ad personalization consent from Manifest", zzjh3);
        }
        zzjh zzjh4 = this.zzi.zzc("google_analytics_default_allow_ad_user_data", true);
        if(zzjh4 != zzjh2 && zzje.zza(-10, v1)) {
            this.zzp().zza(zzax.zza(zzjh4, -10), true);
        }
        else if(TextUtils.isEmpty(this.zzh().zzae()) || v1 != 0 && v1 != 30) {
            if(TextUtils.isEmpty(this.zzh().zzae()) && zzdw0 != null && zzdw0.zzg != null && zzje.zza(30, v1)) {
                zzax zzax0 = zzax.zza(zzdw0.zzg, 30);
                if(zzax0.zzg()) {
                    this.zzp().zza(zzax0, true);
                }
            }
            if(TextUtils.isEmpty(this.zzh().zzae()) && zzdw0 != null && zzdw0.zzg != null && this.zzn().zzh.zza() == null) {
                Boolean boolean0 = zzax.zza(zzdw0.zzg);
                if(boolean0 != null) {
                    this.zzp().zza(zzdw0.zze, "allow_personalized_ads", boolean0.toString(), false);
                }
            }
        }
        else {
            this.zzp().zza(new zzax(null, -10), true);
        }
        Boolean boolean1 = this.zzi.zze("google_analytics_tcf_data_enabled");
        if((boolean1 == null ? true : boolean1.booleanValue())) {
            this.zzj().zzc().zza("TCF client enabled.");
            this.zzp().zzat();
            this.zzp().zzar();
        }
        if(this.zzn().zzc.zza() == 0L) {
            this.zzj().zzp().zza("Persisting first open", this.zza);
            this.zzn().zzc.zza(this.zza);
        }
        this.zzp().zza.zzb();
        if(this.zzaf()) {
            if(!TextUtils.isEmpty(this.zzh().zzae()) || !TextUtils.isEmpty(this.zzh().zzac())) {
                this.zzt();
                if(zzos.zza(this.zzh().zzae(), this.zzn().zzy(), this.zzh().zzac(), this.zzn().zzx())) {
                    this.zzj().zzo().zza("Rechecking which service to use due to a GMP App Id change");
                    this.zzn().zzz();
                    this.zzi().zzaa();
                    this.zzw.zzaf();
                    this.zzw.zzae();
                    this.zzn().zzc.zza(this.zza);
                    this.zzn().zze.zza(null);
                }
                this.zzn().zzc(this.zzh().zzae());
                this.zzn().zzb(this.zzh().zzac());
            }
            if(!this.zzn().zzo().zza(zza.zzb)) {
                this.zzn().zze.zza(null);
            }
            this.zzp().zzc(this.zzn().zze.zza());
            if(!this.zzt().zzx() && !TextUtils.isEmpty(this.zzn().zzq.zza())) {
                this.zzj().zzu().zza("Remote config removed with active feature rollouts");
                this.zzn().zzq.zza(null);
            }
            if(!TextUtils.isEmpty(this.zzh().zzae()) || !TextUtils.isEmpty(this.zzh().zzac())) {
                boolean z = this.zzac();
                if(!this.zzn().zzab() && !this.zzi.zzx()) {
                    this.zzn().zzb(!z);
                }
                if(z) {
                    this.zzp().zzan();
                }
                this.zzs().zza.zza();
                this.zzr().zza(new AtomicReference());
                this.zzr().zza(this.zzn().zzt.zza());
            }
        }
        else if(this.zzac()) {
            if(!this.zzt().zze("android.permission.INTERNET")) {
                this.zzj().zzg().zza("App is missing INTERNET permission");
            }
            if(!this.zzt().zze("android.permission.ACCESS_NETWORK_STATE")) {
                this.zzj().zzg().zza("App is missing ACCESS_NETWORK_STATE permission");
            }
            if(!Wrappers.packageManager(this.zzc).isCallerInstantApp() && !this.zzi.zzy()) {
                if(!zzos.zza(this.zzc)) {
                    this.zzj().zzg().zza("AppMeasurementReceiver not registered/enabled");
                }
                if(!zzos.zza(this.zzc, false)) {
                    this.zzj().zzg().zza("AppMeasurementService not registered/enabled");
                }
            }
            this.zzj().zzg().zza("Uploading is not possible. App measurement disabled");
        }
        if(zzpn.zza() && this.zzi.zza(zzbh.zzci) && this.zzt().zzw()) {
            zzjq zzjq0 = this.zzp();
            Objects.requireNonNull(zzjq0);
            new Thread(new zzib(zzjq0)).start();
        }
        this.zzn().zzj.zza(true);
    }

    // 检测为 Lambda 实现
    final void zza(String s, int v, Throwable throwable0, byte[] arr_b, Map map0) [...]

    @WorkerThread
    final void zza(boolean z) {
        this.zzac = Boolean.valueOf(z);
    }

    final void zzaa() {
        ++this.zzag;
    }

    @WorkerThread
    public final boolean zzab() {
        return this.zzac != null && this.zzac.booleanValue();
    }

    @WorkerThread
    public final boolean zzac() {
        return this.zzc() == 0;
    }

    @WorkerThread
    public final boolean zzad() {
        this.zzl().zzt();
        return this.zzaf;
    }

    @d
    public final boolean zzae() {
        return TextUtils.isEmpty(this.zzd);
    }

    @WorkerThread
    protected final boolean zzaf() {
        if(!this.zzz) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        this.zzl().zzt();
        if(this.zzaa == null || this.zzab == 0L || this.zzaa != null && !this.zzaa.booleanValue() && Math.abs(this.zzp.elapsedRealtime() - this.zzab) > 1000L) {
            this.zzab = this.zzp.elapsedRealtime();
            boolean z = true;
            Boolean boolean0 = Boolean.valueOf(this.zzt().zze("android.permission.INTERNET") && this.zzt().zze("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzc).isCallerInstantApp() || this.zzi.zzy() || zzos.zza(this.zzc) && zzos.zza(this.zzc, false)));
            this.zzaa = boolean0;
            if(boolean0.booleanValue()) {
                if(!this.zzt().zza(this.zzh().zzae(), this.zzh().zzac()) && TextUtils.isEmpty(this.zzh().zzac())) {
                    z = false;
                }
                this.zzaa = Boolean.valueOf(z);
            }
        }
        return this.zzaa.booleanValue();
    }

    @d
    public final boolean zzag() {
        return this.zzg;
    }

    @WorkerThread
    public final boolean zzah() {
        this.zzl().zzt();
        zzhy.zza(this.zzai());
        String s = this.zzh().zzad();
        boolean z = false;
        if(!this.zzi.zzv()) {
            this.zzj().zzp().zza("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        Pair pair0 = this.zzn().zza(s);
        if(!((Boolean)pair0.second).booleanValue() && !TextUtils.isEmpty(((CharSequence)pair0.first))) {
            if(!this.zzai().zzc()) {
                this.zzj().zzu().zza("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            zzls zzls0 = this.zzr();
            zzls0.zzt();
            zzls0.zzu();
            if(!zzls0.zzap() || zzls0.zzq().zzg() >= 234200) {
                zzaj zzaj0 = this.zzp().zzab();
                Bundle bundle0 = zzaj0 == null ? null : zzaj0.zza;
                int v = 1;
                if(bundle0 == null) {
                    int v1 = this.zzah;
                    this.zzah = v1 + 1;
                    if(v1 < 10) {
                        z = true;
                    }
                    this.zzj().zzc().zza("Failed to retrieve DMA consent from the service, " + (z ? "Retrying." : "Skipping.") + " retryCount", this.zzah);
                    return z;
                }
                zzje zzje0 = zzje.zza(bundle0, 100);
                stringBuilder0.append("&gcs=");
                stringBuilder0.append(zzje0.zze());
                zzax zzax0 = zzax.zza(bundle0, 100);
                stringBuilder0.append("&dma=");
                stringBuilder0.append((zzax0.zzd() == Boolean.FALSE ? 0 : 1));
                if(!TextUtils.isEmpty(zzax0.zze())) {
                    stringBuilder0.append("&dma_cps=");
                    stringBuilder0.append(zzax0.zze());
                }
                if(zzax.zza(bundle0) == Boolean.TRUE) {
                    v = 0;
                }
                stringBuilder0.append("&npa=");
                stringBuilder0.append(v);
                this.zzj().zzp().zza("Consent query parameters to Bow", stringBuilder0);
            }
            zzos zzos0 = this.zzt();
            this.zzh();
            URL uRL0 = zzos0.zza(106000L, s, ((String)pair0.first), this.zzn().zzp.zza() - 1L, stringBuilder0.toString());
            if(uRL0 != null) {
                zzle zzle0 = this.zzai();
                zzia zzia0 = (String s, int v, Throwable throwable0, byte[] arr_b, Map map0) -> {
                    if((v == 200 || v == 204 || v == 304) && throwable0 == null) {
                        this.zzn().zzo.zza(true);
                        if(arr_b != null && arr_b.length != 0) {
                            try {
                                JSONObject jSONObject0 = new JSONObject(new String(arr_b));
                                String s1 = jSONObject0.optString("deeplink", "");
                                if(TextUtils.isEmpty(s1)) {
                                    this.zzj().zzc().zza("Deferred Deep Link is empty.");
                                    return;
                                }
                                String s2 = jSONObject0.optString("gclid", "");
                                String s3 = jSONObject0.optString("gbraid", "");
                                String s4 = jSONObject0.optString("gad_source", "");
                                double f = jSONObject0.optDouble("timestamp", 0.0);
                                Bundle bundle0 = new Bundle();
                                if(zzov.zza() && this.zzi.zza(zzbh.zzct)) {
                                    if(!this.zzt().zzi(s1)) {
                                        this.zzj().zzu().zza("Deferred Deep Link validation failed. gclid, gbraid, deep link", s2, s3, s1);
                                        return;
                                    }
                                    if(!TextUtils.isEmpty(s3)) {
                                        bundle0.putString("gbraid", s3);
                                    }
                                    if(!TextUtils.isEmpty(s4)) {
                                        bundle0.putString("gad_source", s4);
                                    }
                                }
                                else if(!this.zzt().zzi(s1)) {
                                    this.zzj().zzu().zza("Deferred Deep Link validation failed. gclid, deep link", s2, s1);
                                    return;
                                }
                                if(zzov.zza()) {
                                    this.zzi.zza(zzbh.zzct);
                                }
                                bundle0.putString("gclid", s2);
                                bundle0.putString("_cis", "ddp");
                                this.zzr.zzc("auto", "_cmp", bundle0);
                                zzos zzos0 = this.zzt();
                                if(!TextUtils.isEmpty(s1) && zzos0.zza(s1, f)) {
                                    Intent intent0 = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    zzos0.zza().sendBroadcast(intent0);
                                }
                                return;
                            }
                            catch(JSONException jSONException0) {
                            }
                            this.zzj().zzg().zza("Failed to parse the Deferred Deep Link response. exception", jSONException0);
                            return;
                        }
                        this.zzj().zzc().zza("Deferred Deep Link response empty.");
                        return;
                    }
                    this.zzj().zzu().zza("Network Request for Deferred Deep Link failed. response, exception", v, throwable0);
                };
                zzle0.zzt();
                zzle0.zzac();
                Preconditions.checkNotNull(uRL0);
                Preconditions.checkNotNull(zzia0);
                zzle0.zzl().zza(new zzlg(zzle0, s, uRL0, null, null, zzia0));
            }
            return false;
        }
        this.zzj().zzp().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        return false;
    }

    @d
    private final zzle zzai() {
        zzhy.zza(this.zzt);
        return this.zzt;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    @d
    public final Clock zzb() {
        return this.zzp;
    }

    @WorkerThread
    public final void zzb(boolean z) {
        this.zzl().zzt();
        this.zzaf = z;
    }

    @WorkerThread
    public final int zzc() {
        this.zzl().zzt();
        if(this.zzi.zzx()) {
            return 1;
        }
        if(this.zzae != null && this.zzae.booleanValue()) {
            return 2;
        }
        if(!this.zzad()) {
            return 8;
        }
        Boolean boolean0 = this.zzn().zzv();
        if(boolean0 != null) {
            return boolean0.booleanValue() ? 0 : 3;
        }
        Boolean boolean1 = this.zzi.zze("firebase_analytics_collection_enabled");
        if(boolean1 != null) {
            return boolean1.booleanValue() ? 0 : 4;
        }
        Boolean boolean2 = this.zzad;
        if(boolean2 != null) {
            return boolean2.booleanValue() ? 0 : 5;
        }
        return this.zzac != null && !this.zzac.booleanValue() ? 7 : 0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzab zzd() {
        return this.zzh;
    }

    @d
    public final zzb zze() {
        zzb zzb0 = this.zzs;
        if(zzb0 == null) {
            throw new IllegalStateException("Component not created");
        }
        return zzb0;
    }

    @d
    public final zzag zzf() {
        return this.zzi;
    }

    @d
    public final zzaz zzg() {
        zzhy.zza(this.zzx);
        return this.zzx;
    }

    @d
    public final zzgg zzh() {
        zzhy.zza(this.zzy);
        return this.zzy;
    }

    @d
    public final zzgf zzi() {
        zzhy.zza(this.zzv);
        return this.zzv;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzgo zzj() {
        zzhy.zza(this.zzk);
        return this.zzk;
    }

    @d
    public final zzgh zzk() {
        return this.zzo;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjc
    @d
    public final zzhv zzl() {
        zzhy.zza(this.zzl);
        return this.zzl;
    }

    public final zzgo zzm() {
        return this.zzk == null || !this.zzk.zzaf() ? null : this.zzk;
    }

    @d
    public final zzha zzn() {
        zzhy.zza(this.zzj);
        return this.zzj;
    }

    @e
    final zzhv zzo() {
        return this.zzl;
    }

    @d
    public final zzjq zzp() {
        zzhy.zza(this.zzr);
        return this.zzr;
    }

    @d
    public final zzlj zzq() {
        zzhy.zza(this.zzq);
        return this.zzq;
    }

    @d
    public final zzls zzr() {
        zzhy.zza(this.zzw);
        return this.zzw;
    }

    @d
    public final zznb zzs() {
        zzhy.zza(this.zzm);
        return this.zzm;
    }

    @d
    public final zzos zzt() {
        zzhy.zza(this.zzn);
        return this.zzn;
    }

    @d
    public final String zzu() {
        return this.zzd;
    }

    @d
    public final String zzv() {
        return this.zze;
    }

    @d
    public final String zzw() {
        return this.zzf;
    }

    @d
    public final String zzx() {
        return this.zzu;
    }

    final void zzy() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void zzz() {
        this.zzai.incrementAndGet();
    }
}

