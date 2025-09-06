package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import java.util.Set;

final class zzca implements SharedPreferences.OnSharedPreferenceChangeListener {
    final zzcb zza;
    private final String zzb;

    public zzca(zzcb zzcb0, String s) {
        this.zza = zzcb0;
        super();
        this.zzb = s;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        synchronized(this.zza) {
            for(Object object0: this.zza.zzb) {
                Map map0 = ((zzbz)object0).zza;
                if(map0.containsKey(this.zzb) && ((Set)map0.get(this.zzb)).contains(s)) {
                    zzv.zzp().zzi().zzE(false);
                }
            }
        }
    }
}

