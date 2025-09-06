package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzazj;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbec;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzj implements zzg {
    private String zzA;
    private int zzB;
    private int zzC;
    private long zzD;
    private final Object zza;
    private boolean zzb;
    private final List zzc;
    private t0 zzd;
    @Nullable
    private zzazj zze;
    @Nullable
    private SharedPreferences zzf;
    @Nullable
    private SharedPreferences.Editor zzg;
    private boolean zzh;
    @Nullable
    private String zzi;
    @Nullable
    private String zzj;
    private boolean zzk;
    private String zzl;
    private int zzm;
    private zzbzg zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private int zzr;
    private Set zzs;
    private JSONObject zzt;
    private boolean zzu;
    private boolean zzv;
    private String zzw;
    private String zzx;
    private boolean zzy;
    private String zzz;

    public zzj() {
        this.zza = new Object();
        this.zzc = new ArrayList();
        this.zze = null;
        this.zzh = true;
        this.zzk = true;
        this.zzl = "-1";
        this.zzm = -1;
        this.zzn = new zzbzg("", 0L);
        this.zzo = 0L;
        this.zzp = 0L;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = Collections.emptySet();
        this.zzt = new JSONObject();
        this.zzu = true;
        this.zzv = true;
        this.zzw = null;
        this.zzx = "";
        this.zzy = false;
        this.zzz = "";
        this.zzA = "{}";
        this.zzB = -1;
        this.zzC = -1;
        this.zzD = 0L;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(int v) {
        this.zzR();
        synchronized(this.zza) {
            this.zzm = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                if(v == -1) {
                    sharedPreferences$Editor0.remove("gad_has_consent_for_cookies");
                }
                else {
                    sharedPreferences$Editor0.putInt("gad_has_consent_for_cookies", v);
                }
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(String s) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zziN)).booleanValue()) {
            return;
        }
        this.zzR();
        synchronized(this.zza) {
            if(this.zzx.equals(s)) {
                return;
            }
            this.zzx = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("inspector_info", s);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String s) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzjp)).booleanValue()) {
            return;
        }
        this.zzR();
        synchronized(this.zza) {
            if(this.zzA.equals(s)) {
                return;
            }
            this.zzA = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("inspector_ui_storage", s);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(boolean z) {
        this.zzR();
        synchronized(this.zza) {
            if(z == this.zzk) {
                return;
            }
            this.zzk = z;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("gad_idless", z);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(boolean z) {
        this.zzR();
        synchronized(this.zza) {
            long v1 = System.currentTimeMillis();
            long v2 = (long)(((Long)zzbe.zzc().zza(zzbcl.zzkp)));
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("is_topics_ad_personalization_allowed", z);
                this.zzg.putLong("topics_consent_expiry_time_ms", v1 + v2);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(String s, String s1, boolean z) {
        this.zzR();
        synchronized(this.zza) {
            JSONArray jSONArray0 = this.zzt.optJSONArray(s);
            if(jSONArray0 == null) {
                jSONArray0 = new JSONArray();
            }
            int v1 = jSONArray0.length();
            for(int v2 = 0; v2 < jSONArray0.length(); ++v2) {
                JSONObject jSONObject0 = jSONArray0.optJSONObject(v2);
                if(jSONObject0 == null) {
                    return;
                }
                if(s1.equals(jSONObject0.optString("template_id"))) {
                    if(z && jSONObject0.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    v1 = v2;
                    break;
                }
            }
            try {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("template_id", s1);
                jSONObject1.put("uses_media_view", z);
                jSONObject1.put("timestamp_ms", zzv.zzC().currentTimeMillis());
                jSONArray0.put(v1, jSONObject1);
                this.zzt.put(s, jSONArray0);
            }
            catch(JSONException jSONException0) {
                zzo.zzk("Could not update native advanced settings", jSONException0);
            }
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("native_advanced_settings", this.zzt.toString());
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(int v) {
        this.zzR();
        synchronized(this.zza) {
            if(this.zzq == v) {
                return;
            }
            this.zzq = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putInt("request_in_session_count", v);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(int v) {
        this.zzR();
        synchronized(this.zza) {
            if(this.zzC == v) {
                return;
            }
            this.zzC = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putInt("sd_app_measure_npa", v);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(long v) {
        this.zzR();
        synchronized(this.zza) {
            if(this.zzD == v) {
                return;
            }
            this.zzD = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putLong("sd_app_measure_npa_ts", v);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(@NonNull String s) {
        this.zzR();
        synchronized(this.zza) {
            this.zzl = s;
            if(this.zzg != null) {
                if(s.equals("-1")) {
                    this.zzg.remove("IABTCF_TCString");
                }
                else {
                    this.zzg.putString("IABTCF_TCString", s);
                }
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzK() {
        this.zzR();
        synchronized(this.zza) {
        }
        return this.zzu;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzL() {
        this.zzR();
        synchronized(this.zza) {
        }
        return this.zzv;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() {
        this.zzR();
        synchronized(this.zza) {
        }
        return this.zzy;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzaH)).booleanValue()) {
            return false;
        }
        this.zzR();
        return this.zzk;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        this.zzR();
        synchronized(this.zza) {
            SharedPreferences sharedPreferences0 = this.zzf;
            boolean z = false;
            if(sharedPreferences0 == null) {
                return false;
            }
            if(sharedPreferences0.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                return false;
            }
            if(this.zzf.getBoolean("is_topics_ad_personalization_allowed", false) && !this.zzk) {
                z = true;
            }
            return z;
        }
    }

    // 检测为 Lambda 实现
    @Nullable
    public final zzazj zzP() [...]

    // 检测为 Lambda 实现
    final void zzQ(Context context0, String s) [...]

    private final void zzR() {
        if(this.zzd != null && !this.zzd.isDone()) {
            try {
                this.zzd.get(1L, TimeUnit.SECONDS);
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                zzo.zzk("Interrupted while waiting for preferences loaded.", interruptedException0);
            }
            catch(CancellationException | ExecutionException | TimeoutException cancellationException0) {
                zzo.zzh("Fail to initialize AdSharedPreferenceManager.", cancellationException0);
            }
        }
    }

    private final void zzS() {
        zzh zzh0 = () -> {
            if(!this.zzb) {
                return null;
            }
            if(this.zzK() && this.zzL()) {
                return null;
            }
            if(!((Boolean)zzbec.zzb.zze()).booleanValue()) {
                return null;
            }
            synchronized(this.zza) {
                if(Looper.getMainLooper() == null) {
                    return null;
                }
                if(this.zze == null) {
                    this.zze = new zzazj();
                }
                this.zze.zzd();
                zzo.zzi("start fetching content...");
                return this.zze;
            }
        };
        zzbzw.zza.execute(zzh0);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        this.zzR();
        synchronized(this.zza) {
        }
        return this.zzr;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        this.zzR();
        return this.zzm;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        this.zzR();
        synchronized(this.zza) {
        }
        return this.zzq;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        this.zzR();
        synchronized(this.zza) {
        }
        return this.zzo;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        this.zzR();
        synchronized(this.zza) {
        }
        return this.zzp;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        this.zzR();
        synchronized(this.zza) {
        }
        return this.zzD;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final zzbzg zzg() {
        this.zzR();
        synchronized(this.zza) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzlz)).booleanValue() && this.zzn.zzj()) {
                for(Object object1: this.zzc) {
                    ((Runnable)object1).run();
                }
            }
            return this.zzn;
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final zzbzg zzh() {
        synchronized(this.zza) {
        }
        return this.zzn;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzi() {
        this.zzR();
        synchronized(this.zza) {
        }
        return this.zzz;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        this.zzR();
        synchronized(this.zza) {
        }
        return this.zzw;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        this.zzR();
        synchronized(this.zza) {
        }
        return this.zzx;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        this.zzR();
        synchronized(this.zza) {
        }
        return this.zzA;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    @Nullable
    public final String zzm() {
        this.zzR();
        return this.zzl;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzn() {
        this.zzR();
        synchronized(this.zza) {
        }
        return this.zzt;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzo(Runnable runnable0) {
        this.zzc.add(runnable0);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzp(Context context0) {
        synchronized(this.zza) {
            if(this.zzf != null) {
                return;
            }
        }
        zzi zzi0 = () -> {
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("admob", 0);
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            try {
                synchronized(this.zza) {
                    this.zzf = sharedPreferences0;
                    this.zzg = sharedPreferences$Editor0;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    this.zzh = this.zzf.getBoolean("use_https", this.zzh);
                    this.zzu = this.zzf.getBoolean("content_url_opted_out", this.zzu);
                    this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
                    this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
                    this.zzv = this.zzf.getBoolean("content_vertical_opted_out", this.zzv);
                    this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
                    this.zzr = this.zzf.getInt("version_code", this.zzr);
                    this.zzn = !((Boolean)zzbed.zzg.zze()).booleanValue() || !zzbe.zzc().zze() ? new zzbzg(this.zzf.getString("app_settings_json", this.zzn.zzc()), this.zzf.getLong("app_settings_last_update_ms", this.zzn.zza())) : new zzbzg("", 0L);
                    this.zzo = this.zzf.getLong("app_last_background_time_ms", this.zzo);
                    this.zzq = this.zzf.getInt("request_in_session_count", this.zzq);
                    this.zzp = this.zzf.getLong("first_ad_req_time_ms", this.zzp);
                    this.zzs = this.zzf.getStringSet("never_pool_slots", this.zzs);
                    this.zzw = this.zzf.getString("display_cutout", this.zzw);
                    this.zzB = this.zzf.getInt("app_measurement_npa", this.zzB);
                    this.zzC = this.zzf.getInt("sd_app_measure_npa", this.zzC);
                    this.zzD = this.zzf.getLong("sd_app_measure_npa_ts", this.zzD);
                    this.zzx = this.zzf.getString("inspector_info", this.zzx);
                    this.zzy = this.zzf.getBoolean("linked_device", this.zzy);
                    this.zzz = this.zzf.getString("linked_ad_unit", this.zzz);
                    this.zzA = this.zzf.getString("inspector_ui_storage", this.zzA);
                    this.zzl = this.zzf.getString("IABTCF_TCString", this.zzl);
                    this.zzm = this.zzf.getInt("gad_has_consent_for_cookies", this.zzm);
                    try {
                        this.zzt = new JSONObject(this.zzf.getString("native_advanced_settings", "{}"));
                    }
                    catch(JSONException jSONException0) {
                        zzo.zzk("Could not convert native advanced settings to json object", jSONException0);
                    }
                    this.zzS();
                }
            }
            catch(Throwable throwable0) {
                zzv.zzp().zzw(throwable0, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
                zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", throwable0);
            }
        };
        this.zzd = zzbzw.zza.zza(zzi0);
        this.zzb = true;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzq() {
        this.zzR();
        synchronized(this.zza) {
            this.zzt = new JSONObject();
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.remove("native_advanced_settings");
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(long v) {
        this.zzR();
        synchronized(this.zza) {
            if(this.zzo == v) {
                return;
            }
            this.zzo = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putLong("app_last_background_time_ms", v);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzs(String s) {
        this.zzR();
        synchronized(this.zza) {
            long v1 = zzv.zzC().currentTimeMillis();
            if(s != null && !s.equals(this.zzn.zzc())) {
                this.zzn = new zzbzg(s, v1);
                SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
                if(sharedPreferences$Editor0 != null) {
                    sharedPreferences$Editor0.putString("app_settings_json", s);
                    this.zzg.putLong("app_settings_last_update_ms", v1);
                    this.zzg.apply();
                }
                this.zzS();
                for(Object object1: this.zzc) {
                    ((Runnable)object1).run();
                }
                return;
            }
            this.zzn.zzg(v1);
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(int v) {
        this.zzR();
        synchronized(this.zza) {
            if(this.zzr == v) {
                return;
            }
            this.zzr = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putInt("version_code", v);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(boolean z) {
        this.zzR();
        synchronized(this.zza) {
            if(this.zzu == z) {
                return;
            }
            this.zzu = z;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("content_url_opted_out", z);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(boolean z) {
        this.zzR();
        synchronized(this.zza) {
            if(this.zzv == z) {
                return;
            }
            this.zzv = z;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("content_vertical_opted_out", z);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String s) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
            return;
        }
        this.zzR();
        synchronized(this.zza) {
            if(this.zzz.equals(s)) {
                return;
            }
            this.zzz = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("linked_ad_unit", s);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
            return;
        }
        this.zzR();
        synchronized(this.zza) {
            if(this.zzy == z) {
                return;
            }
            this.zzy = z;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("linked_device", z);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String s) {
        this.zzR();
        synchronized(this.zza) {
            if(TextUtils.equals(this.zzw, s)) {
                return;
            }
            this.zzw = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("display_cutout", s);
                this.zzg.apply();
            }
            this.zzS();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(long v) {
        this.zzR();
        synchronized(this.zza) {
            if(this.zzp == v) {
                return;
            }
            this.zzp = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putLong("first_ad_req_time_ms", v);
                this.zzg.apply();
            }
            this.zzS();
        }
    }
}

