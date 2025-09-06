package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcl;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzcb {
    @GuardedBy("this")
    private final Map zza;
    @GuardedBy("this")
    private final List zzb;
    private final Context zzc;

    zzcb(Context context0) {
        this.zza = new HashMap();
        this.zzb = new ArrayList();
        this.zzc = context0;
    }

    final void zzb(String s) {
        synchronized(this) {
            if(this.zza.containsKey(s)) {
                return;
            }
            SharedPreferences sharedPreferences0 = Objects.equals(s, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(s, 0);
            zzca zzca0 = new zzca(this, s);
            this.zza.put(s, zzca0);
            sharedPreferences0.registerOnSharedPreferenceChangeListener(zzca0);
        }
    }

    public final void zzc() {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzkm)).booleanValue()) {
            return;
        }
        Map map0 = zzs.zzw(((String)zzbe.zzc().zza(zzbcl.zzkr)));
        for(Object object0: map0.keySet()) {
            this.zzb(((String)object0));
        }
        this.zzd(new zzbz(map0));
    }

    final void zzd(zzbz zzbz0) {
        synchronized(this) {
            this.zzb.add(zzbz0);
        }
    }
}

