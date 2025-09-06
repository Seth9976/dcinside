package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

public class AdError {
    @NonNull
    public static final String UNDEFINED_DOMAIN = "undefined";
    private final int zza;
    @NonNull
    private final String zzb;
    @NonNull
    private final String zzc;
    @Nullable
    private final AdError zzd;

    public AdError(int v, @NonNull String s, @NonNull String s1) {
        this(v, s, s1, null);
    }

    public AdError(int v, @NonNull String s, @NonNull String s1, @Nullable AdError adError0) {
        this.zza = v;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = adError0;
    }

    @Nullable
    public AdError getCause() {
        return this.zzd;
    }

    public int getCode() {
        return this.zza;
    }

    @NonNull
    public String getDomain() {
        return this.zzc;
    }

    @NonNull
    public String getMessage() {
        return this.zzb;
    }

    @Override
    @NonNull
    public String toString() {
        try {
            return this.zzb().toString(2);
        }
        catch(JSONException unused_ex) {
            return "Error forming toString output.";
        }
    }

    @NonNull
    public final zze zza() {
        AdError adError0 = this.zzd;
        if(adError0 == null) {
            return new zze(this.zza, this.zzb, this.zzc, null, null);
        }
        zze zze0 = new zze(adError0.zza, adError0.zzb, adError0.zzc, null, null);
        return new zze(this.zza, this.zzb, this.zzc, zze0, null);
    }

    @NonNull
    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("Code", this.zza);
        jSONObject0.put("Message", this.zzb);
        jSONObject0.put("Domain", this.zzc);
        AdError adError0 = this.zzd;
        if(adError0 == null) {
            jSONObject0.put("Cause", "null");
            return jSONObject0;
        }
        jSONObject0.put("Cause", adError0.zzb());
        return jSONObject0;
    }
}

