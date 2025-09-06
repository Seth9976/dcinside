package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.FIN;
import o3.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzduv implements zzdug, zzdvw {
    private final zzdvg zza;
    private final zzdvx zzb;
    private final zzduh zzc;
    private final zzduq zzd;
    private final zzduf zze;
    private final zzdvs zzf;
    private final zzdvc zzg;
    private final zzdvc zzh;
    private final String zzi;
    private final Context zzj;
    @h
    private final String zzk;
    private final Map zzl;
    private final Map zzm;
    private final Map zzn;
    private String zzo;
    private JSONObject zzp;
    private long zzq;
    private zzdur zzr;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private zzduu zzv;
    private long zzw;
    private String zzx;

    zzduv(zzdvg zzdvg0, zzdvx zzdvx0, zzduh zzduh0, Context context0, VersionInfoParcel versionInfoParcel0, zzduq zzduq0, zzdvs zzdvs0, zzdvc zzdvc0, zzdvc zzdvc1, @h String s) {
        this.zzl = new HashMap();
        this.zzm = new HashMap();
        this.zzn = new HashMap();
        this.zzo = "{}";
        this.zzq = 0x7FFFFFFFFFFFFFFFL;
        this.zzr = zzdur.zza;
        this.zzv = zzduu.zza;
        this.zzw = 0L;
        this.zzx = "";
        this.zza = zzdvg0;
        this.zzb = zzdvx0;
        this.zzc = zzduh0;
        this.zze = new zzduf(context0);
        this.zzi = versionInfoParcel0.afmaVersion;
        this.zzk = s;
        this.zzd = zzduq0;
        this.zzf = zzdvs0;
        this.zzg = zzdvc0;
        this.zzh = zzdvc1;
        this.zzj = context0;
        zzv.zzt().zzg(this);
    }

    private final void zzA(String s) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(TextUtils.isEmpty(s)) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            this.zzx(jSONObject0.optBoolean("isTestMode", false), false);
            String s1 = jSONObject0.optString("gesture", "NONE");
            this.zzw(((zzdur)Enum.valueOf(zzdur.class, s1)), false);
            this.zzo = jSONObject0.optString("networkExtras", "{}");
            this.zzq = jSONObject0.optLong("networkExtrasExpirationSecs", 0x7FFFFFFFFFFFFFFFL);
            FIN.finallyExec$NT(v);
        }
        catch(JSONException unused_ex) {
            FIN.finallyExec$NT(v);
        }
    }

    public final zzdur zza() {
        return this.zzr;
    }

    public final t0 zzb(String s) {
        synchronized(this) {
            t0 t00 = new zzcab();
            if(this.zzm.containsKey(s)) {
                ((zzcab)t00).zzc(((zzduj)this.zzm.get(s)));
            }
            else {
                if(!this.zzn.containsKey(s)) {
                    ArrayList arrayList0 = new ArrayList();
                    this.zzn.put(s, arrayList0);
                }
                ((List)this.zzn.get(s)).add(t00);
            }
            return t00;
        }
    }

    public final String zzc() {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && this.zzq()) {
                if(this.zzq < zzv.zzC().currentTimeMillis() / 1000L) {
                    this.zzo = "{}";
                    this.zzq = 0x7FFFFFFFFFFFFFFFL;
                    return "";
                }
                if(!this.zzo.equals("{}")) {
                    return this.zzo;
                }
            }
            return "";
        }
    }

    public final String zzd() {
        JSONObject jSONObject0;
        synchronized(this) {
            jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("isTestMode", this.zzs);
                jSONObject0.put("gesture", this.zzr);
                if(this.zzq > zzv.zzC().currentTimeMillis() / 1000L) {
                    jSONObject0.put("networkExtras", this.zzo);
                    jSONObject0.put("networkExtrasExpirationSecs", this.zzq);
                }
            }
            catch(JSONException unused_ex) {
            }
        }
        return jSONObject0.toString();
    }

    public final JSONObject zze() {
        synchronized(this) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("platform", "ANDROID");
                if(!TextUtils.isEmpty(this.zzk)) {
                    jSONObject0.put("sdkVersion", "afma-sdk-a-v" + this.zzk);
                }
                jSONObject0.put("internalSdkVersion", this.zzi);
                jSONObject0.put("osVersion", Build.VERSION.RELEASE);
                jSONObject0.put("adapters", this.zzd.zza());
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzjn)).booleanValue()) {
                    String s = zzv.zzp().zzn();
                    if(!TextUtils.isEmpty(s)) {
                        jSONObject0.put("plugin", s);
                    }
                }
                if(this.zzq < zzv.zzC().currentTimeMillis() / 1000L) {
                    this.zzo = "{}";
                }
                jSONObject0.put("networkExtras", this.zzo);
                jSONObject0.put("adSlots", this.zzt());
                jSONObject0.put("appInfo", this.zze.zza());
                String s1 = zzv.zzp().zzi().zzg().zzc();
                if(!TextUtils.isEmpty(s1)) {
                    jSONObject0.put("cld", new JSONObject(s1));
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzjd)).booleanValue()) {
                    JSONObject jSONObject1 = this.zzp;
                    if(jSONObject1 != null) {
                        zzo.zze(("Server data: " + jSONObject1.toString()));
                        jSONObject0.put("serverData", this.zzp);
                    }
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
                    jSONObject0.put("openAction", this.zzv);
                    jSONObject0.put("gesture", this.zzr);
                }
                jSONObject0.put("isGamRegisteredTestDevice", zzv.zzt().zzl());
                jSONObject0.put("isSimulator", zzf.zzr());
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzjp)).booleanValue()) {
                    jSONObject0.put("uiStorage", new JSONObject(this.zzx));
                }
                if(!TextUtils.isEmpty(((CharSequence)zzbe.zzc().zza(zzbcl.zzjr)))) {
                    jSONObject0.put("gmaDisk", this.zzh.zza());
                }
                if(!TextUtils.isEmpty(((CharSequence)zzbe.zzc().zza(zzbcl.zzjq)))) {
                    jSONObject0.put("userDisk", this.zzg.zza());
                }
            }
            catch(JSONException jSONException0) {
                zzv.zzp().zzv(jSONException0, "Inspector.toJson");
                zzo.zzk("Ad inspector encountered an error", jSONException0);
            }
            return jSONObject0;
        }
    }

    public final void zzf(String s, zzduj zzduj0) {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && this.zzq()) {
                if(this.zzt >= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zziP))))) {
                    zzo.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                    return;
                }
                if(!this.zzl.containsKey(s)) {
                    ArrayList arrayList0 = new ArrayList();
                    this.zzl.put(s, arrayList0);
                }
                ++this.zzt;
                ((List)this.zzl.get(s)).add(zzduj0);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
                    String s1 = zzduj0.zzc();
                    this.zzm.put(s1, zzduj0);
                    if(this.zzn.containsKey(s1)) {
                        List list0 = (List)this.zzn.get(s1);
                        for(Object object0: list0) {
                            ((zzcab)object0).zzc(zzduj0);
                        }
                        list0.clear();
                    }
                }
            }
        }
    }

    public final void zzg() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zziN)).booleanValue()) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjc)).booleanValue() && zzv.zzp().zzi().zzM()) {
                this.zzu();
                return;
            }
            String s = zzv.zzp().zzi().zzk();
            if(!TextUtils.isEmpty(s)) {
                try {
                    if(new JSONObject(s).optBoolean("isTestMode", false)) {
                        this.zzu();
                    }
                }
                catch(JSONException unused_ex) {
                }
            }
        }
    }

    public final void zzh(zzdl zzdl0, zzduu zzduu0) {
        synchronized(this) {
            if(!this.zzq()) {
                try {
                    zzdl0.zze(zzfdk.zzd(18, null, null));
                }
                catch(RemoteException unused_ex) {
                    zzo.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                    return;
                }
                return;
            }
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zziN)).booleanValue()) {
                try {
                    zzdl0.zze(zzfdk.zzd(1, null, null));
                }
                catch(RemoteException unused_ex) {
                    zzo.zzj("Ad inspector had an internal error.");
                }
                return;
            }
            this.zzv = zzduu0;
            zzbkj zzbkj0 = new zzbkj(this);
            zzbkc zzbkc0 = new zzbkc(this.zzf);
            zzbjq zzbjq0 = new zzbjq(this);
            this.zza.zzj(zzdl0, zzbkj0, zzbkc0, zzbjq0);
        }
    }

    public final void zzi(String s, long v) {
        synchronized(this) {
            this.zzo = s;
            this.zzq = v;
            this.zzv();
        }
    }

    public final void zzj(String s) {
        synchronized(this) {
            this.zzx = s;
            zzv.zzp().zzi().zzC(this.zzx);
        }
    }

    public final void zzk(long v) {
        synchronized(this) {
            this.zzw += v;
        }
    }

    public final void zzl(boolean z) {
        if(this.zzu) {
            if(z) {
            label_5:
                if(!this.zzs) {
                    this.zzz();
                    return;
                }
            }
        }
        else if(z) {
            this.zzu();
            goto label_5;
        }
        if(!this.zzq()) {
            this.zzy();
        }
    }

    public final void zzm(zzdur zzdur0) {
        this.zzw(zzdur0, true);
    }

    public final void zzn(JSONObject jSONObject0) {
        synchronized(this) {
            this.zzp = jSONObject0;
        }
    }

    public final void zzo(boolean z) {
        if(!this.zzu && z) {
            this.zzu();
        }
        this.zzx(z, true);
    }

    public final boolean zzp() {
        return this.zzp != null;
    }

    public final boolean zzq() {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
                return !this.zzs && !zzv.zzt().zzl() ? false : true;
            }
            return this.zzs;
        }
    }

    public final boolean zzr() {
        synchronized(this) {
        }
        return this.zzs;
    }

    public final boolean zzs() {
        return this.zzw < ((long)(((Long)zzbe.zzc().zza(zzbcl.zzji))));
    }

    private final JSONObject zzt() throws JSONException {
        synchronized(this) {
            JSONObject jSONObject0 = new JSONObject();
            for(Object object0: this.zzl.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                JSONArray jSONArray0 = new JSONArray();
                for(Object object1: ((List)map$Entry0.getValue())) {
                    zzduj zzduj0 = (zzduj)object1;
                    if(zzduj0.zzg()) {
                        jSONArray0.put(zzduj0.zzd());
                    }
                }
                if(jSONArray0.length() > 0) {
                    jSONObject0.put(((String)map$Entry0.getKey()), jSONArray0);
                }
            }
            return jSONObject0;
        }
    }

    private final void zzu() {
        this.zzu = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        zzbcc zzbcc0 = zzbcl.zzjq;
        if(!TextUtils.isEmpty(((CharSequence)zzbe.zzc().zza(zzbcc0)))) {
            SharedPreferences sharedPreferences0 = PreferenceManager.getDefaultSharedPreferences(this.zzj);
            List list0 = Arrays.asList(((String)zzbe.zzc().zza(zzbcc0)).split(","));
            this.zzg.zzb(sharedPreferences0, list0);
        }
        zzbcc zzbcc1 = zzbcl.zzjr;
        if(!TextUtils.isEmpty(((CharSequence)zzbe.zzc().zza(zzbcc1)))) {
            SharedPreferences sharedPreferences1 = this.zzj.getSharedPreferences("admob", 0);
            List list1 = Arrays.asList(((String)zzbe.zzc().zza(zzbcc1)).split(","));
            this.zzh.zzb(sharedPreferences1, list1);
        }
        this.zzA(zzv.zzp().zzi().zzk());
        this.zzx = zzv.zzp().zzi().zzl();
    }

    private final void zzv() {
        zzv.zzp().zzi().zzB(this.zzd());
    }

    private final void zzw(zzdur zzdur0, boolean z) {
        synchronized(this) {
            if(this.zzr != zzdur0) {
                if(this.zzq()) {
                    this.zzy();
                }
                this.zzr = zzdur0;
                if(this.zzq()) {
                    this.zzz();
                }
                if(z) {
                    this.zzv();
                }
            }
        }
    }

    private final void zzx(boolean z, boolean z1) {
        synchronized(this) {
            if(this.zzs != z) {
                this.zzs = z;
                if(z && (!((Boolean)zzbe.zzc().zza(zzbcl.zzjc)).booleanValue() || !zzv.zzt().zzl())) {
                    this.zzz();
                }
                else if(!this.zzq()) {
                    this.zzy();
                }
                if(z1) {
                    this.zzv();
                }
            }
        }
    }

    private final void zzy() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(this.zzr.ordinal()) {
            case 1: {
                this.zzb.zzb();
                FIN.finallyExec$NT(v);
                return;
            }
            case 2: {
                this.zzc.zzb();
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
            }
        }
    }

    private final void zzz() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(this.zzr.ordinal()) {
            case 1: {
                this.zzb.zzc();
                FIN.finallyExec$NT(v);
                return;
            }
            case 2: {
                this.zzc.zzc();
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
            }
        }
    }
}

