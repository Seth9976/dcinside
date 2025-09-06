package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONException;
import org.json.JSONObject;

public class zzbsi {
    private final zzcex zza;
    private final String zzb;

    public zzbsi(zzcex zzcex0, String s) {
        this.zza = zzcex0;
        this.zzb = s;
    }

    public final void zzg(int v, int v1, int v2, int v3) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("x", v).put("y", v1).put("width", v2).put("height", v3);
            this.zza.zze("onDefaultPositionReceived", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Error occurred while dispatching default position.", jSONException0);
        }
    }

    public final void zzh(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("message", s).put("action", this.zzb);
            zzcex zzcex0 = this.zza;
            if(zzcex0 != null) {
                zzcex0.zze("onError", jSONObject0);
            }
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Error occurred while dispatching error event.", jSONException0);
        }
    }

    public final void zzi(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("js", s);
            this.zza.zze("onReadyEventReceived", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Error occurred while dispatching ready Event.", jSONException0);
        }
    }

    public final void zzj(int v, int v1, int v2, int v3, float f, int v4) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("width", v).put("height", v1).put("maxSizeWidth", v2).put("maxSizeHeight", v3).put("density", ((double)f)).put("rotation", v4);
            this.zza.zze("onScreenInfoChanged", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Error occurred while obtaining screen information.", jSONException0);
        }
    }

    public final void zzk(int v, int v1, int v2, int v3) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("x", v).put("y", v1).put("width", v2).put("height", v3);
            this.zza.zze("onSizeChanged", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Error occurred while dispatching size change.", jSONException0);
        }
    }

    public final void zzl(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("state", s);
            this.zza.zze("onStateChanged", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Error occurred while dispatching state change.", jSONException0);
        }
    }
}

