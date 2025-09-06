package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzduj implements zzcvw, zzcxl, zzcyq {
    private final zzduv zza;
    private final String zzb;
    private final String zzc;
    private int zzd;
    private zzdui zze;
    private zzcvm zzf;
    private zze zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    zzduj(zzduv zzduv0, zzfcj zzfcj0, String s) {
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zza = zzduv0;
        this.zzc = s;
        this.zzb = zzfcj0.zzf;
        this.zzd = 0;
        this.zze = zzdui.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzcxl
    public final void zza(zzcqz zzcqz0) {
        if(this.zza.zzq()) {
            this.zzf = zzcqz0.zzm();
            this.zze = zzdui.zzb;
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject1;
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("state", this.zze);
        jSONObject0.put("format", zzfbo.zza(this.zzd));
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
            jSONObject0.put("isOutOfContext", this.zzm);
            if(this.zzm) {
                jSONObject0.put("shown", this.zzn);
            }
        }
        zzcvm zzcvm0 = this.zzf;
        if(zzcvm0 == null) {
            zze zze0 = this.zzg;
            JSONObject jSONObject2 = null;
            if(zze0 != null) {
                IBinder iBinder0 = zze0.zze;
                if(iBinder0 != null) {
                    jSONObject2 = this.zzi(((zzcvm)iBinder0));
                    if(((zzcvm)iBinder0).zzj().isEmpty()) {
                        JSONArray jSONArray0 = new JSONArray();
                        jSONArray0.put(zzduj.zzh(this.zzg));
                        jSONObject2.put("errors", jSONArray0);
                    }
                }
            }
            jSONObject1 = jSONObject2;
        }
        else {
            jSONObject1 = this.zzi(zzcvm0);
        }
        jSONObject0.put("responseInfo", jSONObject1);
        return jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvk0) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzjl)).booleanValue() && this.zza.zzq()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfca0) {
        int v = 0;
        if(this.zza.zzq()) {
            if(!zzfca0.zzb.zza.isEmpty()) {
                this.zzd = ((zzfbo)zzfca0.zzb.zza.get(0)).zzb;
            }
            if(!TextUtils.isEmpty(zzfca0.zzb.zzb.zzl)) {
                this.zzh = zzfca0.zzb.zzb.zzl;
            }
            if(!TextUtils.isEmpty(zzfca0.zzb.zzb.zzm)) {
                this.zzi = zzfca0.zzb.zzb.zzm;
            }
            if(zzfca0.zzb.zzb.zzp.length() > 0) {
                this.zzl = zzfca0.zzb.zzb.zzp;
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjh)).booleanValue()) {
                if(!this.zza.zzs()) {
                    this.zzo = true;
                    return;
                }
                if(!TextUtils.isEmpty(zzfca0.zzb.zzb.zzn)) {
                    this.zzj = zzfca0.zzb.zzb.zzn;
                }
                if(zzfca0.zzb.zzb.zzo.length() > 0) {
                    this.zzk = zzfca0.zzb.zzb.zzo;
                }
                zzduv zzduv0 = this.zza;
                JSONObject jSONObject0 = this.zzk;
                if(jSONObject0 != null) {
                    v = jSONObject0.toString().length();
                }
                if(!TextUtils.isEmpty(this.zzj)) {
                    v += this.zzj.length();
                }
                zzduv0.zzk(((long)v));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(zze zze0) {
        if(this.zza.zzq()) {
            this.zze = zzdui.zzc;
            this.zzg = zze0;
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        return this.zze != zzdui.zza;
    }

    private static JSONObject zzh(zze zze0) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("errorDomain", zze0.zzc);
        jSONObject0.put("errorCode", zze0.zza);
        jSONObject0.put("errorDescription", zze0.zzb);
        jSONObject0.put("underlyingError", (zze0.zzd == null ? null : zzduj.zzh(zze0.zzd)));
        return jSONObject0;
    }

    private final JSONObject zzi(zzcvm zzcvm0) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("winningAdapterClassName", zzcvm0.zzg());
        jSONObject0.put("responseSecsSinceEpoch", zzcvm0.zzc());
        jSONObject0.put("responseId", zzcvm0.zzi());
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzje)).booleanValue()) {
            String s = zzcvm0.zzd();
            if(!TextUtils.isEmpty(s)) {
                zzo.zze(("Bidding data: " + s));
                jSONObject0.put("biddingData", new JSONObject(s));
            }
        }
        if(!TextUtils.isEmpty(this.zzh)) {
            jSONObject0.put("adRequestUrl", this.zzh);
        }
        if(!TextUtils.isEmpty(this.zzi)) {
            jSONObject0.put("postBody", this.zzi);
        }
        if(!TextUtils.isEmpty(this.zzj)) {
            jSONObject0.put("adResponseBody", this.zzj);
        }
        JSONObject jSONObject1 = this.zzk;
        if(jSONObject1 != null) {
            jSONObject0.put("adResponseHeaders", jSONObject1);
        }
        JSONObject jSONObject2 = this.zzl;
        if(jSONObject2 != null) {
            jSONObject0.put("transactionExtras", jSONObject2);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjh)).booleanValue()) {
            jSONObject0.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: zzcvm0.zzj()) {
            zzw zzw0 = (zzw)object0;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("adapterClassName", zzw0.zza);
            jSONObject3.put("latencyMillis", zzw0.zzb);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjf)).booleanValue()) {
                jSONObject3.put("credentials", zzbc.zzb().zzi(zzw0.zzd));
            }
            jSONObject3.put("error", (zzw0.zzc == null ? null : zzduj.zzh(zzw0.zzc)));
            jSONArray0.put(jSONObject3);
        }
        jSONObject0.put("adNetworks", jSONArray0);
        return jSONObject0;
    }
}

