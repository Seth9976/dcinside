package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzbyn {
    @GuardedBy("this")
    private final Map zza;
    @GuardedBy("this")
    private final List zzb;
    private final Context zzc;
    private final zzbxz zzd;

    zzbyn(Context context0, zzbxz zzbxz0) {
        this.zza = new HashMap();
        this.zzb = new ArrayList();
        this.zzc = context0;
        this.zzd = zzbxz0;
    }

    final void zzb(Map map0, SharedPreferences sharedPreferences0, String s, String s1) {
        if(map0.containsKey(s) && ((Set)map0.get(s)).contains(s1)) {
            this.zzd.zzd();
        }
    }

    final void zzc(String s) {
        synchronized(this) {
            if(this.zza.containsKey(s)) {
                return;
            }
            SharedPreferences sharedPreferences0 = Objects.equals(s, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(s, 0);
            zzbym zzbym0 = new zzbym(this, s);
            this.zza.put(s, zzbym0);
            sharedPreferences0.registerOnSharedPreferenceChangeListener(zzbym0);
        }
    }

    final void zzd(zzbyl zzbyl0) {
        synchronized(this) {
            this.zzb.add(zzbyl0);
        }
    }
}

