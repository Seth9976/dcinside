package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzv;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcnd implements zzbnz {
    private final Context zza;
    private final zzayg zzb;
    private final PowerManager zzc;

    public zzcnd(Context context0, zzayg zzayg0) {
        this.zza = context0;
        this.zzb = zzayg0;
        this.zzc = (PowerManager)context0.getSystemService("power");
    }

    public final JSONObject zza(zzcng zzcng0) throws JSONException {
        JSONObject jSONObject1;
        JSONArray jSONArray0 = new JSONArray();
        JSONObject jSONObject0 = new JSONObject();
        zzayj zzayj0 = zzcng0.zzf;
        if(zzayj0 == null) {
            jSONObject1 = new JSONObject();
        }
        else if(this.zzb.zzd() != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcng0.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcng0.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", zzv.zzs().zze()).put("appVolume", ((double)zzv.zzs().zza())).put("deviceVolume", ((double)zzab.zzb(this.zza.getApplicationContext())));
            Rect rect0 = new Rect();
            Display display0 = ((WindowManager)this.zza.getSystemService("window")).getDefaultDisplay();
            rect0.right = display0.getWidth();
            rect0.bottom = display0.getHeight();
            DisplayMetrics displayMetrics0 = this.zza.getResources().getDisplayMetrics();
            jSONObject2.put("windowVisibility", zzayj0.zzb).put("isAttachedToWindow", zzayj0.zza).put("viewBox", new JSONObject().put("top", zzayj0.zzc.top).put("bottom", zzayj0.zzc.bottom).put("left", zzayj0.zzc.left).put("right", zzayj0.zzc.right)).put("adBox", new JSONObject().put("top", zzayj0.zzd.top).put("bottom", zzayj0.zzd.bottom).put("left", zzayj0.zzd.left).put("right", zzayj0.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzayj0.zze.top).put("bottom", zzayj0.zze.bottom).put("left", zzayj0.zze.left).put("right", zzayj0.zze.right)).put("globalVisibleBoxVisible", zzayj0.zzf).put("localVisibleBox", new JSONObject().put("top", zzayj0.zzg.top).put("bottom", zzayj0.zzg.bottom).put("left", zzayj0.zzg.left).put("right", zzayj0.zzg.right)).put("localVisibleBoxVisible", zzayj0.zzh).put("hitBox", new JSONObject().put("top", zzayj0.zzi.top).put("bottom", zzayj0.zzi.bottom).put("left", zzayj0.zzi.left).put("right", zzayj0.zzi.right)).put("screenDensity", ((double)displayMetrics0.density));
            jSONObject2.put("isVisible", zzcng0.zza);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzby)).booleanValue()) {
                JSONArray jSONArray1 = new JSONArray();
                List list0 = zzayj0.zzk;
                if(list0 != null) {
                    for(Object object0: list0) {
                        jSONArray1.put(new JSONObject().put("top", ((Rect)object0).top).put("bottom", ((Rect)object0).bottom).put("left", ((Rect)object0).left).put("right", ((Rect)object0).right));
                    }
                }
                jSONObject2.put("scrollableContainerBoxes", jSONArray1);
            }
            if(!TextUtils.isEmpty(zzcng0.zze)) {
                jSONObject2.put("doneReasonCode", "u");
            }
            jSONObject1 = jSONObject2;
        }
        else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray0.put(jSONObject1);
        jSONObject0.put("units", jSONArray0);
        return jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbnz
    public final JSONObject zzb(Object object0) throws JSONException {
        return this.zza(((zzcng)object0));
    }
}

