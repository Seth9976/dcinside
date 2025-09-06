package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzejm extends zzbrf {
    private final String zza;
    private final zzbrd zzb;
    private final zzcab zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzejm(String s, zzbrd zzbrd0, zzcab zzcab0, long v) {
        JSONObject jSONObject0 = new JSONObject();
        this.zzd = jSONObject0;
        this.zzf = false;
        this.zzc = zzcab0;
        this.zza = s;
        this.zzb = zzbrd0;
        this.zze = v;
        try {
            jSONObject0.put("adapter_version", zzbrd0.zzf().toString());
            jSONObject0.put("sdk_version", zzbrd0.zzg().toString());
            jSONObject0.put("name", s);
        }
        catch(JSONException | NullPointerException | RemoteException unused_ex) {
        }
    }

    public static void zzb(String s, zzcab zzcab0) {
        synchronized(zzejm.class) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("name", s);
                jSONObject0.put("signal_error", "Adapter failed to instantiate");
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzbI)).booleanValue()) {
                    jSONObject0.put("signal_error_code", 1);
                }
                zzcab0.zzc(jSONObject0);
            }
            catch(JSONException unused_ex) {
            }
        }
    }

    public final void zzc() {
        synchronized(this) {
            this.zzh("Signal collection timeout.", 3);
        }
    }

    public final void zzd() {
        synchronized(this) {
            if(this.zzf) {
                return;
            }
            try {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzbI)).booleanValue()) {
                    this.zzd.put("signal_error_code", 0);
                }
            }
            catch(JSONException unused_ex) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbrg
    public final void zze(String s) throws RemoteException {
        __monitor_enter(this);
        if(this.zzf) {
            __monitor_exit(this);
            return;
        }
        if(s == null) {
            try {
                this.zzf("Adapter returned null signals");
            }
            catch(Throwable throwable0) {
                __monitor_exit(this);
                throw throwable0;
            }
            __monitor_exit(this);
            return;
        }
        try {
            try {
                this.zzd.put("signals", s);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzbJ)).booleanValue()) {
                    long v = zzv.zzC().elapsedRealtime();
                    this.zzd.put("latency", v - this.zze);
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzbI)).booleanValue()) {
                    this.zzd.put("signal_error_code", 0);
                }
            }
            catch(JSONException unused_ex) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        }
        catch(Throwable throwable0) {
            __monitor_exit(this);
            throw throwable0;
        }
        __monitor_exit(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrg
    public final void zzf(String s) throws RemoteException {
        synchronized(this) {
            this.zzh(s, 2);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbrg
    public final void zzg(zze zze0) throws RemoteException {
        synchronized(this) {
            this.zzh(zze0.zzb, 2);
        }
    }

    private final void zzh(String s, int v) {
        synchronized(this) {
            if(this.zzf) {
                return;
            }
            try {
                this.zzd.put("signal_error", s);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzbJ)).booleanValue()) {
                    long v2 = zzv.zzC().elapsedRealtime();
                    this.zzd.put("latency", v2 - this.zze);
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzbI)).booleanValue()) {
                    this.zzd.put("signal_error_code", v);
                }
            }
            catch(JSONException unused_ex) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        }
    }
}

