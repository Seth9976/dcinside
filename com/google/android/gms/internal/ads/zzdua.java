package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdua {
    private boolean zza;
    private boolean zzb;
    @GuardedBy("this")
    private boolean zzc;
    private final long zzd;
    private final zzcab zze;
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdpm zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsh zzl;
    private final VersionInfoParcel zzm;
    private final Map zzn;
    private final zzdcr zzo;
    private final zzfhk zzp;
    private boolean zzq;

    public zzdua(Executor executor0, Context context0, WeakReference weakReference0, Executor executor1, zzdpm zzdpm0, ScheduledExecutorService scheduledExecutorService0, zzdsh zzdsh0, VersionInfoParcel versionInfoParcel0, zzdcr zzdcr0, zzfhk zzfhk0) {
        this.zza = false;
        this.zzb = false;
        this.zzc = false;
        this.zze = new zzcab();
        this.zzn = new ConcurrentHashMap();
        this.zzq = true;
        this.zzh = zzdpm0;
        this.zzf = context0;
        this.zzg = weakReference0;
        this.zzi = executor1;
        this.zzk = scheduledExecutorService0;
        this.zzj = executor0;
        this.zzl = zzdsh0;
        this.zzm = versionInfoParcel0;
        this.zzo = zzdcr0;
        this.zzp = zzfhk0;
        this.zzd = zzv.zzC().elapsedRealtime();
        this.zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    final Object zzf(zzfgw zzfgw0) throws Exception {
        this.zze.zzc(Boolean.TRUE);
        zzfgw0.zzg(true);
        zzfha zzfha0 = zzfgw0.zzm();
        this.zzp.zzb(zzfha0);
        return null;
    }

    public final List zzg() {
        List list0 = new ArrayList();
        for(Object object0: this.zzn.keySet()) {
            zzbln zzbln0 = (zzbln)this.zzn.get(((String)object0));
            list0.add(new zzbln(((String)object0), zzbln0.zzb, zzbln0.zzc, zzbln0.zzd));
        }
        return list0;
    }

    static void zzi(zzdua zzdua0, boolean z) {
        zzdua0.zzc = true;
    }

    static void zzj(zzdua zzdua0, String s) {
        ArrayList arrayList1;
        JSONObject jSONObject1;
        zzdtz zzdtz0;
        String s1;
        zzfgw zzfgw0 = zzfgv.zza(zzdua0.zzf, 5);
        zzfgw0.zzi();
        try {
            ArrayList arrayList0 = new ArrayList();
            JSONObject jSONObject0 = new JSONObject(s).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator iterator0 = jSONObject0.keys();
            while(true) {
            label_5:
                if(!iterator0.hasNext()) {
                    zzgch.zza(arrayList0).zza(new zzdtr(zzdua0, zzfgw0), zzdua0.zzi);
                    return;
                }
                Object object0 = iterator0.next();
                s1 = (String)object0;
                zzfgw zzfgw1 = zzfgv.zza(zzdua0.zzf, 5);
                zzfgw1.zzi();
                zzfgw1.zzd(s1);
                Object object1 = new Object();
                zzcab zzcab0 = new zzcab();
                t0 t00 = zzgch.zzo(zzcab0, ((long)(((Long)zzbe.zzc().zza(zzbcl.zzbW)))), TimeUnit.SECONDS, zzdua0.zzk);
                zzdua0.zzl.zzc(s1);
                zzdua0.zzo.zzc(s1);
                long v = zzv.zzC().elapsedRealtime();
                t00.addListener(() -> synchronized(object1) {
                    if(!zzcab0.isDone()) {
                        zzdua0.zzv(s1, false, "Timeout.", ((int)(zzv.zzC().elapsedRealtime() - v)));
                        zzdua0.zzl.zzb(s1, "timeout");
                        zzdua0.zzo.zzb(s1, "timeout");
                        zzfgw1.zzc("Timeout");
                        zzfgw1.zzg(false);
                        zzfha zzfha0 = zzfgw1.zzm();
                        zzdua0.zzp.zzb(zzfha0);
                        zzcab0.zzc(Boolean.FALSE);
                    }
                }, zzdua0.zzi);
                arrayList0.add(t00);
                zzdtz0 = new zzdtz(zzdua0, object1, s1, v, zzfgw1, zzcab0);
                jSONObject1 = jSONObject0.optJSONObject(s1);
                arrayList1 = new ArrayList();
                if(jSONObject1 != null) {
                    break;
                }
                goto label_41;
            }
        }
        catch(JSONException jSONException0) {
            goto label_56;
        }
        try {
            JSONArray jSONArray0 = jSONObject1.getJSONArray("data");
            int v1 = 0;
            while(true) {
                if(v1 >= jSONArray0.length()) {
                    goto label_41;
                }
                JSONObject jSONObject2 = jSONArray0.getJSONObject(v1);
                String s2 = jSONObject2.optString("format", "");
                JSONObject jSONObject3 = jSONObject2.optJSONObject("data");
                Bundle bundle0 = new Bundle();
                if(jSONObject3 != null) {
                    Iterator iterator1 = jSONObject3.keys();
                    while(iterator1.hasNext()) {
                        Object object2 = iterator1.next();
                        bundle0.putString(((String)object2), jSONObject3.optString(((String)object2), ""));
                    }
                }
                arrayList1.add(new zzblx(s2, bundle0));
                ++v1;
            }
        }
        catch(JSONException unused_ex) {
            try {
            label_41:
                zzdua0.zzv(s1, false, "", 0);
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    zzdtv zzdtv0 = () -> {
                        try {
                            if(Objects.equals(s1, "com.google.ads.mediation.admob.AdMobAdapter")) {
                                zzdtz0.zzf();
                                return;
                            }
                            Context context0 = (Context)zzdua0.zzg.get();
                            if(context0 == null) {
                                context0 = zzdua0.zzf;
                            }
                            zzdua0.zzh.zzc(s1, jSONObject4).zzi(context0, zzdtz0, arrayList1);
                            return;
                        }
                        catch(zzfcq unused_ex) {
                        }
                        catch(RemoteException remoteException0) {
                            throw new zzfvl(remoteException0);
                        }
                        try {
                            zzdtz0.zze("Failed to initialize adapter. " + s1 + " does not implement the initialize() method.");
                        }
                        catch(RemoteException remoteException1) {
                            zzo.zzh("", remoteException1);
                        }
                    };
                    zzdua0.zzj.execute(zzdtv0);
                }
                catch(zzfcq unused_ex) {
                    try {
                        String s3 = "Failed to create Adapter.";
                        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmP)).booleanValue()) {
                            s3 = "Failed to create Adapter. " + zzfcq0.getMessage();
                        }
                        zzdtz0.zze(s3);
                        goto label_5;
                    }
                    catch(RemoteException remoteException0) {
                    }
                    zzo.zzh("", remoteException0);
                }
                goto label_5;
            }
            catch(JSONException jSONException0) {
            }
        }
    label_56:
        zze.zzb("Malformed CLD response", jSONException0);
        zzdua0.zzo.zza("MalformedJson");
        zzdua0.zzl.zza("MalformedJson");
        zzdua0.zze.zzd(jSONException0);
        zzv.zzp().zzw(jSONException0, "AdapterInitializer.updateAdapterStatus");
        zzfgw0.zzh(jSONException0);
        zzfgw0.zzg(false);
        zzfha zzfha0 = zzfgw0.zzm();
        zzdua0.zzp.zzb(zzfha0);
    }

    public final void zzl() {
        this.zzq = false;
    }

    // 检测为 Lambda 实现
    final void zzm() [...]

    // 检测为 Lambda 实现
    final void zzn(String s, zzblr zzblr0, zzfdh zzfdh0, List list0) [...]

    // 检测为 Lambda 实现
    final void zzo(zzcab zzcab0) [...]

    // 检测为 Lambda 实现
    final void zzp() [...]

    // 检测为 Lambda 实现
    final void zzq(Object object0, zzcab zzcab0, String s, long v, zzfgw zzfgw0) [...]

    public final void zzr() {
        if(!((Boolean)zzber.zza.zze()).booleanValue() && this.zzm.clientJarVersion >= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzbV)))) && this.zzq) {
            if(!this.zza) {
                synchronized(this) {
                    if(this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    zzdtw zzdtw0 = () -> {
                        this.zzl.zze();
                        this.zzo.zze();
                        this.zzb = true;
                    };
                    this.zze.addListener(zzdtw0, this.zzi);
                    this.zza = true;
                    t0 t00 = this.zzu();
                    zzdtp zzdtp0 = () -> synchronized(this) {
                        if(this.zzc) {
                            return;
                        }
                        this.zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", ((int)(zzv.zzC().elapsedRealtime() - this.zzd)));
                        this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                        this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                        this.zze.zzd(new Exception());
                    };
                    long v1 = (long)(((Long)zzbe.zzc().zza(zzbcl.zzbX)));
                    this.zzk.schedule(zzdtp0, v1, TimeUnit.SECONDS);
                    zzgch.zzr(t00, new zzdty(this), this.zzi);
                }
            }
        }
        else if(!this.zza) {
            this.zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.zze.zzc(Boolean.FALSE);
            this.zza = true;
            this.zzb = true;
        }
    }

    public final void zzs(zzblu zzblu0) {
        zzdtt zzdtt0 = new zzdtt(this, zzblu0);
        this.zze.addListener(zzdtt0, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }

    private final t0 zzu() {
        synchronized(this) {
            String s = zzv.zzp().zzi().zzg().zzc();
            if(!TextUtils.isEmpty(s)) {
                return zzgch.zzh(s);
            }
            t0 t01 = new zzcab();
            zzv.zzp().zzi().zzo(() -> {
                zzdtu zzdtu0 = new zzdtu(this, ((zzcab)t01));
                this.zzi.execute(zzdtu0);
            });
            return t01;
        }
    }

    private final void zzv(String s, boolean z, String s1, int v) {
        zzbln zzbln0 = new zzbln(s, z, v, s1);
        this.zzn.put(s, zzbln0);
    }
}

