package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpn;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzhc {
    private final String zza;
    private final Bundle zzb;
    private Bundle zzc;
    private final zzha zzd;

    public zzhc(zzha zzha0, String s, Bundle bundle0) {
        this.zzd = zzha0;
        super();
        Preconditions.checkNotEmpty(s);
        this.zza = s;
        if(zzha0.zze().zza(zzbh.zzdk)) {
            this.zzb = new Bundle();
            return;
        }
        this.zzb = new Bundle();
    }

    // This method was un-flattened
    @WorkerThread
    public final Bundle zza() {
        if(this.zzc == null) {
            String s = this.zzd.zzg().getString(this.zza, null);
            if(s != null) {
                try {
                    Bundle bundle0 = new Bundle();
                    JSONArray jSONArray0 = new JSONArray(s);
                    for(int v = 0; true; ++v) {
                        if(v >= jSONArray0.length()) {
                            this.zzc = bundle0;
                            break;
                        }
                        try {
                            JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                            String s1 = jSONObject0.getString("n");
                            String s2 = jSONObject0.getString("t");
                            switch(s2) {
                                case "d": {
                                    bundle0.putDouble(s1, Double.parseDouble(jSONObject0.getString("v")));
                                    break;
                                }
                                case "ia": {
                                    if(zzpn.zza() && this.zzd.zze().zza(zzbh.zzci)) {
                                        JSONArray jSONArray1 = new JSONArray(jSONObject0.getString("v"));
                                        int v1 = jSONArray1.length();
                                        int[] arr_v = new int[v1];
                                        for(int v2 = 0; v2 < v1; ++v2) {
                                            arr_v[v2] = jSONArray1.optInt(v2);
                                        }
                                        bundle0.putIntArray(s1, arr_v);
                                    }
                                    break;
                                }
                                case "l": {
                                    bundle0.putLong(s1, Long.parseLong(jSONObject0.getString("v")));
                                    break;
                                }
                                case "la": {
                                    if(zzpn.zza() && this.zzd.zze().zza(zzbh.zzci)) {
                                        JSONArray jSONArray2 = new JSONArray(jSONObject0.getString("v"));
                                        int v3 = jSONArray2.length();
                                        long[] arr_v1 = new long[v3];
                                        for(int v4 = 0; v4 < v3; ++v4) {
                                            arr_v1[v4] = jSONArray2.optLong(v4);
                                        }
                                        bundle0.putLongArray(s1, arr_v1);
                                    }
                                    break;
                                }
                                case "s": {
                                    bundle0.putString(s1, jSONObject0.getString("v"));
                                    break;
                                }
                                default: {
                                    this.zzd.zzj().zzg().zza("Unrecognized persisted bundle type. Type", s2);
                                }
                            }
                        }
                        catch(JSONException | NumberFormatException unused_ex) {
                            this.zzd.zzj().zzg().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                }
                catch(JSONException unused_ex) {
                    this.zzd.zzj().zzg().zza("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if(this.zzc == null) {
                this.zzc = this.zzb;
            }
        }
        return this.zzd.zze().zza(zzbh.zzdk) ? new Bundle(((Bundle)Preconditions.checkNotNull(this.zzc))) : ((Bundle)Preconditions.checkNotNull(this.zzc));
    }

    @WorkerThread
    public final void zza(Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        else if(this.zzd.zze().zza(zzbh.zzdk)) {
            bundle0 = new Bundle(bundle0);
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzd.zzg().edit();
        if(bundle0.size() == 0) {
            sharedPreferences$Editor0.remove(this.zza);
        }
        else {
            String s = this.zzb(bundle0);
            sharedPreferences$Editor0.putString(this.zza, s);
        }
        sharedPreferences$Editor0.apply();
        this.zzc = bundle0;
    }

    private final String zzb(Bundle bundle0) {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: bundle0.keySet()) {
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            if(object1 != null) {
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("n", s);
                    if(!zzpn.zza() || !this.zzd.zze().zza(zzbh.zzci)) {
                        jSONObject0.put("v", String.valueOf(object1));
                        if(object1 instanceof String) {
                            jSONObject0.put("t", "s");
                        }
                        else {
                            if(object1 instanceof Long) {
                                jSONObject0.put("t", "l");
                                jSONArray0.put(jSONObject0);
                            }
                            else if(object1 instanceof Double) {
                                jSONObject0.put("t", "d");
                                jSONArray0.put(jSONObject0);
                            }
                            else {
                                this.zzd.zzj().zzg().zza("Cannot serialize bundle value to SharedPreferences. Type", object1.getClass());
                            }
                            continue;
                        }
                    }
                    else {
                        if(!(object1 instanceof String)) {
                            if(!(object1 instanceof Long)) {
                                if(!(object1 instanceof int[])) {
                                    if(object1 instanceof long[]) {
                                        jSONObject0.put("v", Arrays.toString(((long[])object1)));
                                        jSONObject0.put("t", "la");
                                        jSONArray0.put(jSONObject0);
                                    }
                                    else if(object1 instanceof Double) {
                                        jSONObject0.put("v", String.valueOf(object1));
                                        jSONObject0.put("t", "d");
                                        jSONArray0.put(jSONObject0);
                                    }
                                    else {
                                        this.zzd.zzj().zzg().zza("Cannot serialize bundle value to SharedPreferences. Type", object1.getClass());
                                    }
                                    continue;
                                }
                                jSONObject0.put("v", Arrays.toString(((int[])object1)));
                                jSONObject0.put("t", "ia");
                                jSONArray0.put(jSONObject0);
                                continue;
                            }
                            jSONObject0.put("v", String.valueOf(object1));
                            jSONObject0.put("t", "l");
                            jSONArray0.put(jSONObject0);
                            continue;
                        }
                        jSONObject0.put("v", String.valueOf(object1));
                        jSONObject0.put("t", "s");
                        jSONArray0.put(jSONObject0);
                        continue;
                    }
                    jSONArray0.put(jSONObject0);
                    continue;
                }
                catch(JSONException jSONException0) {
                }
                this.zzd.zzj().zzg().zza("Cannot serialize bundle value to SharedPreferences", jSONException0);
            }
        }
        return jSONArray0.toString();
    }
}

