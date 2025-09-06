package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class zzd {
    private SharedPreferences zza;
    private SharedPreferences.Editor zzb;
    private final Context zzc;
    private final Object zzd;

    zzd(Context context0) {
        this.zzd = new Object();
        this.zzc = context0;
    }

    public final int zza() {
        this.zzk();
        synchronized(this.zzd) {
        }
        return this.zza.getInt("aav", -1);
    }

    public final int zzb() {
        this.zzk();
        synchronized(this.zzd) {
        }
        return this.zza.getInt("vc", -1);
    }

    @Nullable
    public final String zzc(String s) {
        this.zzk();
        synchronized(this.zzd) {
            String s1 = this.zza.getString(s, null);
            this.zzb.remove(s).commit();
            return s1;
        }
    }

    @Nullable
    public final String zzd() {
        this.zzk();
        synchronized(this.zzd) {
        }
        return this.zza.getString("dm", null);
    }

    @Nullable
    public final String zze() {
        this.zzk();
        synchronized(this.zzd) {
        }
        return this.zza.getString("pn", null);
    }

    public final Map zzf() {
        this.zzk();
        synchronized(this.zzd) {
            Map map0 = this.zza.getAll();
            Map map1 = new HashMap();
            for(Object object1: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(map$Entry0.getValue() instanceof String && !Objects.equals(map$Entry0.getKey(), "pn") && !Objects.equals(map$Entry0.getKey(), "vc") && !Objects.equals(map$Entry0.getKey(), "dm") && !Objects.equals(map$Entry0.getKey(), "aav")) {
                    map1.put(((String)map$Entry0.getKey()), ((String)map$Entry0.getValue()));
                }
            }
            return map1;
        }
    }

    public final void zzg() {
        this.zzk();
        synchronized(this.zzd) {
            this.zzb.clear().commit();
        }
    }

    public final void zzh(String s, String s1) {
        this.zzk();
        synchronized(this.zzd) {
            this.zzb.putString(s, s1).commit();
        }
    }

    public final void zzi(String s, int v, String s1, int v1) {
        this.zzk();
        synchronized(this.zzd) {
            this.zzb.putString("pn", s).putInt("vc", v).putString("dm", s1).putInt("aav", v1).commit();
        }
    }

    public final boolean zzj(String s) {
        this.zzk();
        synchronized(this.zzd) {
        }
        return this.zza.contains(s);
    }

    private final void zzk() {
        synchronized(this.zzd) {
            if(this.zza != null) {
                return;
            }
            SharedPreferences sharedPreferences0 = this.zzc.getSharedPreferences("query_info_shared_prefs", 0);
            this.zza = sharedPreferences0;
            this.zzb = sharedPreferences0.edit();
        }
    }
}

