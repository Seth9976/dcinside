package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfmg {
    static float zza;
    private static WindowManager zzb;
    private static final String[] zzc;

    static {
        zzfmg.zzc = new String[]{"x", "y", "width", "height"};
        zzfmg.zza = Resources.getSystem().getDisplayMetrics().density;
    }

    public static JSONObject zza(int v, int v1, int v2, int v3) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("x", ((double)(((float)v) / zzfmg.zza)));
            jSONObject0.put("y", ((double)(((float)v1) / zzfmg.zza)));
            jSONObject0.put("width", ((double)(((float)v2) / zzfmg.zza)));
            jSONObject0.put("height", ((double)(((float)v3) / zzfmg.zza)));
        }
        catch(JSONException jSONException0) {
            zzfmh.zza("Error with creating viewStateObject", jSONException0);
        }
        return jSONObject0;
    }

    public static void zzb(JSONObject jSONObject0, String s) {
        try {
            jSONObject0.put("adSessionId", s);
        }
        catch(JSONException jSONException0) {
            zzfmh.zza("Error with setting ad session id", jSONException0);
        }
    }

    public static void zzc(JSONObject jSONObject0, JSONObject jSONObject1) {
        try {
            JSONArray jSONArray0 = jSONObject0.optJSONArray("childViews");
            if(jSONArray0 == null) {
                jSONArray0 = new JSONArray();
                jSONObject0.put("childViews", jSONArray0);
            }
            jSONArray0.put(jSONObject1);
            return;
        }
        catch(JSONException jSONException0) {
        }
        jSONException0.printStackTrace();
    }

    public static void zzd(Context context0) {
        if(context0 != null) {
            zzfmg.zza = context0.getResources().getDisplayMetrics().density;
            zzfmg.zzb = (WindowManager)context0.getSystemService("window");
        }
    }

    public static void zze(JSONObject jSONObject0, String s, Object object0) {
        try {
            jSONObject0.put(s, object0);
        }
        catch(NullPointerException | JSONException nullPointerException0) {
            zzfmh.zza(("JSONException during JSONObject.put for name [" + s + "]"), nullPointerException0);
        }
    }

    public static void zzf(JSONObject jSONObject0) {
        float f2;
        float f1;
        if(zzfmg.zzb == null) {
            f1 = 0.0f;
            f2 = 0.0f;
        }
        else {
            Point point0 = new Point(0, 0);
            zzfmg.zzb.getDefaultDisplay().getRealSize(point0);
            float f = zzfmg.zza;
            f1 = ((float)point0.x) / f;
            f2 = ((float)point0.y) / f;
        }
        try {
            jSONObject0.put("width", ((double)f1));
            jSONObject0.put("height", ((double)f2));
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
    }

    public static boolean zzg(@NonNull JSONObject jSONObject0, @Nullable JSONObject jSONObject1) {
        if(jSONObject0 == null && jSONObject1 == null) {
            return true;
        }
        if(jSONObject0 != null && jSONObject1 != null) {
            String[] arr_s = zzfmg.zzc;
            for(int v = 0; v < 4; ++v) {
                String s = arr_s[v];
                if(jSONObject0.optDouble(s) != jSONObject1.optDouble(s)) {
                    return false;
                }
            }
            if(jSONObject0.optString("adSessionId", "").equals(jSONObject1.optString("adSessionId", "")) && Boolean.valueOf(jSONObject0.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject1.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject0.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject1.optBoolean("hasWindowFocus")))) {
                JSONArray jSONArray0 = jSONObject0.optJSONArray("isFriendlyObstructionFor");
                JSONArray jSONArray1 = jSONObject1.optJSONArray("isFriendlyObstructionFor");
                if(jSONArray0 == null && jSONArray1 == null) {
                label_20:
                    JSONArray jSONArray2 = jSONObject0.optJSONArray("childViews");
                    JSONArray jSONArray3 = jSONObject1.optJSONArray("childViews");
                    if(jSONArray2 == null && jSONArray3 == null) {
                        return true;
                    }
                    if(zzfmg.zzh(jSONArray2, jSONArray3)) {
                        for(int v2 = 0; v2 < jSONArray2.length(); ++v2) {
                            if(!zzfmg.zzg(jSONArray2.optJSONObject(v2), jSONArray3.optJSONObject(v2))) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                else if(zzfmg.zzh(jSONArray0, jSONArray1)) {
                    int v1 = 0;
                    while(true) {
                        if(v1 >= jSONArray0.length()) {
                            goto label_20;
                        }
                        if(!jSONArray0.optString(v1, "").equals(jSONArray1.optString(v1, ""))) {
                            break;
                        }
                        ++v1;
                    }
                }
            }
        }
        return false;
    }

    private static boolean zzh(JSONArray jSONArray0, JSONArray jSONArray1) {
        return jSONArray0 != null || jSONArray1 != null ? jSONArray0 != null && jSONArray1 != null && jSONArray0.length() == jSONArray1.length() : true;
    }
}

