package com.google.android.gms.measurement.internal;

import J1.e;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import h4.d.a;
import h4.d;

final class zzha extends zzjd {
    static final Pair zza;
    private long zzaa;
    public zzhe zzb;
    public final zzhb zzc;
    public final zzhb zzd;
    public final zzhd zze;
    public final zzhb zzf;
    public final zzgz zzg;
    public final zzhd zzh;
    public final zzhc zzi;
    public final zzgz zzj;
    public final zzhb zzk;
    public final zzhb zzl;
    public boolean zzm;
    public zzgz zzn;
    public zzgz zzo;
    public zzhb zzp;
    public final zzhd zzq;
    public final zzhd zzr;
    public final zzhb zzs;
    public final zzhc zzt;
    private SharedPreferences zzv;
    private Object zzw;
    private SharedPreferences zzx;
    private String zzy;
    private boolean zzz;

    static {
        zzha.zza = new Pair("", 0L);
    }

    zzha(zzhy zzhy0) {
        super(zzhy0);
        this.zzw = new Object();
        this.zzf = new zzhb(this, "session_timeout", 1800000L);
        this.zzg = new zzgz(this, "start_new_session", true);
        this.zzk = new zzhb(this, "last_pause_time", 0L);
        this.zzl = new zzhb(this, "session_id", 0L);
        this.zzh = new zzhd(this, "non_personalized_ads", null);
        this.zzi = new zzhc(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = new zzgz(this, "allow_remote_dynamite", false);
        this.zzc = new zzhb(this, "first_open_time", 0L);
        this.zzd = new zzhb(this, "app_install_time", 0L);
        this.zze = new zzhd(this, "app_instance_id", null);
        this.zzn = new zzgz(this, "app_backgrounded", false);
        this.zzo = new zzgz(this, "deep_link_retrieval_complete", false);
        this.zzp = new zzhb(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new zzhd(this, "firebase_feature_rollouts", null);
        this.zzr = new zzhd(this, "deferred_attribution_cache", null);
        this.zzs = new zzhb(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new zzhc(this, "default_event_parameters", null);
    }

    @WorkerThread
    final Pair zza(String s) {
        this.zzt();
        if(!this.zzo().zza(zza.zza)) {
            return new Pair("", Boolean.FALSE);
        }
        long v = this.zzb().elapsedRealtime();
        if(this.zzy != null && v < this.zzaa) {
            return new Pair(this.zzy, Boolean.valueOf(this.zzz));
        }
        this.zzaa = v + this.zze().zzd(s);
        try {
            Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(this.zza());
            this.zzy = "";
            String s1 = advertisingIdClient$Info0.getId();
            if(s1 != null) {
                this.zzy = s1;
            }
            this.zzz = advertisingIdClient$Info0.isLimitAdTrackingEnabled();
            return new Pair(this.zzy, Boolean.valueOf(this.zzz));
        }
        catch(Exception exception0) {
        }
        this.zzj().zzc().zza("Unable to get advertising id", exception0);
        this.zzy = "";
        return new Pair("", Boolean.valueOf(this.zzz));
    }

    final void zza(SparseArray sparseArray0) {
        if(sparseArray0 == null) {
            this.zzi.zza(null);
            return;
        }
        int[] arr_v = new int[sparseArray0.size()];
        long[] arr_v1 = new long[sparseArray0.size()];
        for(int v = 0; v < sparseArray0.size(); ++v) {
            arr_v[v] = sparseArray0.keyAt(v);
            arr_v1[v] = (long)(((Long)sparseArray0.valueAt(v)));
        }
        Bundle bundle0 = new Bundle();
        bundle0.putIntArray("uriSources", arr_v);
        bundle0.putLongArray("uriTimestamps", arr_v1);
        this.zzi.zza(bundle0);
    }

    @WorkerThread
    final void zza(Boolean boolean0) {
        this.zzt();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg().edit();
        if(boolean0 == null) {
            sharedPreferences$Editor0.remove("measurement_enabled");
        }
        else {
            sharedPreferences$Editor0.putBoolean("measurement_enabled", boolean0.booleanValue());
        }
        sharedPreferences$Editor0.apply();
    }

    @WorkerThread
    final void zza(boolean z) {
        this.zzt();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg().edit();
        sharedPreferences$Editor0.putBoolean("use_service", z);
        sharedPreferences$Editor0.apply();
    }

    @WorkerThread
    final boolean zza(int v) {
        return zzje.zza(v, this.zzg().getInt("consent_source", 100));
    }

    final boolean zza(long v) {
        return v - this.zzf.zza() > this.zzk.zza();
    }

    @WorkerThread
    final boolean zza(zzax zzax0) {
        this.zzt();
        if(zzje.zza(zzax0.zza(), this.zzn().zza())) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg().edit();
            sharedPreferences$Editor0.putString("dma_consent_settings", zzax0.zzf());
            sharedPreferences$Editor0.apply();
            return true;
        }
        return false;
    }

    @WorkerThread
    final boolean zza(zzje zzje0) {
        this.zzt();
        int v = zzje0.zza();
        if(this.zza(v)) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg().edit();
            sharedPreferences$Editor0.putString("consent_settings", zzje0.zzf());
            sharedPreferences$Editor0.putInt("consent_source", v);
            sharedPreferences$Editor0.apply();
            return true;
        }
        return false;
    }

    @WorkerThread
    protected final boolean zza(zznm zznm0) {
        this.zzt();
        String s = this.zzg().getString("stored_tcf_param", "");
        String s1 = zznm0.zzc();
        if(!s1.equals(s)) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg().edit();
            sharedPreferences$Editor0.putString("stored_tcf_param", s1);
            sharedPreferences$Editor0.apply();
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjd
    @WorkerThread
    @a({@d({"this.preferences"}), @d({"this.monitoringSample"})})
    protected final void zzaa() {
        SharedPreferences sharedPreferences0 = this.zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = sharedPreferences0;
        boolean z = sharedPreferences0.getBoolean("has_been_opened", false);
        this.zzm = z;
        if(!z) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzv.edit();
            sharedPreferences$Editor0.putBoolean("has_been_opened", true);
            sharedPreferences$Editor0.apply();
        }
        this.zzb = new zzhe(this, "health_monitor", Math.max(0L, ((long)(((Long)zzbh.zzc.zza(null))))), null);
    }

    @WorkerThread
    final boolean zzab() {
        return this.zzv == null ? false : this.zzv.contains("deferred_analytics_collection");
    }

    @WorkerThread
    final void zzb(Boolean boolean0) {
        this.zzt();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg().edit();
        if(boolean0 == null) {
            sharedPreferences$Editor0.remove("measurement_enabled_from_api");
        }
        else {
            sharedPreferences$Editor0.putBoolean("measurement_enabled_from_api", boolean0.booleanValue());
        }
        sharedPreferences$Editor0.apply();
    }

    @WorkerThread
    final void zzb(String s) {
        this.zzt();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg().edit();
        sharedPreferences$Editor0.putString("admob_app_id", s);
        sharedPreferences$Editor0.apply();
    }

    @WorkerThread
    final void zzb(boolean z) {
        this.zzt();
        this.zzj().zzp().zza("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg().edit();
        sharedPreferences$Editor0.putBoolean("deferred_analytics_collection", z);
        sharedPreferences$Editor0.apply();
    }

    @WorkerThread
    protected final SharedPreferences zzc() {
        this.zzt();
        this.zzac();
        if(this.zzx == null) {
            synchronized(this.zzw) {
                if(this.zzx == null) {
                    this.zzj().zzp().zza("Default prefs file", "com.dcinside.app.android_preferences");
                    this.zzx = this.zza().getSharedPreferences("com.dcinside.app.android_preferences", 0);
                }
            }
        }
        return this.zzx;
    }

    @WorkerThread
    final void zzc(String s) {
        this.zzt();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg().edit();
        sharedPreferences$Editor0.putString("gmp_app_id", s);
        sharedPreferences$Editor0.apply();
    }

    @e
    @WorkerThread
    protected final SharedPreferences zzg() {
        this.zzt();
        this.zzac();
        Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjd
    protected final boolean zzh() {
        return true;
    }

    final SparseArray zzm() {
        Bundle bundle0 = this.zzi.zza();
        if(bundle0 == null) {
            return new SparseArray();
        }
        int[] arr_v = bundle0.getIntArray("uriSources");
        long[] arr_v1 = bundle0.getLongArray("uriTimestamps");
        if(arr_v != null && arr_v1 != null) {
            if(arr_v.length != arr_v1.length) {
                this.zzj().zzg().zza("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray0 = new SparseArray();
            for(int v = 0; v < arr_v.length; ++v) {
                sparseArray0.put(arr_v[v], ((long)arr_v1[v]));
            }
            return sparseArray0;
        }
        return new SparseArray();
    }

    @WorkerThread
    final zzax zzn() {
        this.zzt();
        return zzax.zza(this.zzg().getString("dma_consent_settings", null));
    }

    @WorkerThread
    final zzje zzo() {
        this.zzt();
        return zzje.zza(this.zzg().getString("consent_settings", "G1"), this.zzg().getInt("consent_source", 100));
    }

    @WorkerThread
    final Boolean zzp() {
        this.zzt();
        return this.zzg().contains("use_service") ? Boolean.valueOf(this.zzg().getBoolean("use_service", false)) : null;
    }

    @WorkerThread
    final Boolean zzu() {
        this.zzt();
        return this.zzg().contains("measurement_enabled_from_api") ? Boolean.valueOf(this.zzg().getBoolean("measurement_enabled_from_api", true)) : null;
    }

    @WorkerThread
    final Boolean zzv() {
        this.zzt();
        return this.zzg().contains("measurement_enabled") ? Boolean.valueOf(this.zzg().getBoolean("measurement_enabled", true)) : null;
    }

    @WorkerThread
    protected final String zzw() {
        this.zzt();
        String s = this.zzg().getString("previous_os_version", null);
        this.zzf().zzac();
        String s1 = Build.VERSION.RELEASE;
        if(!TextUtils.isEmpty(s1) && !s1.equals(s)) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg().edit();
            sharedPreferences$Editor0.putString("previous_os_version", s1);
            sharedPreferences$Editor0.apply();
        }
        return s;
    }

    @WorkerThread
    final String zzx() {
        this.zzt();
        return this.zzg().getString("admob_app_id", null);
    }

    @WorkerThread
    final String zzy() {
        this.zzt();
        return this.zzg().getString("gmp_app_id", null);
    }

    @WorkerThread
    final void zzz() {
        this.zzt();
        Boolean boolean0 = this.zzv();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzg().edit();
        sharedPreferences$Editor0.clear();
        sharedPreferences$Editor0.apply();
        if(boolean0 != null) {
            this.zza(boolean0);
        }
    }
}

