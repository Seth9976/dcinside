package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;

final class zzbym implements SharedPreferences.OnSharedPreferenceChangeListener {
    final zzbyn zza;
    private final String zzb;

    public zzbym(zzbyn zzbyn0, String s) {
        this.zza = zzbyn0;
        super();
        this.zzb = s;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        synchronized(this.zza) {
            for(Object object0: this.zza.zzb) {
                ((zzbyl)object0).zza.zzb(((zzbyl)object0).zzb, sharedPreferences0, this.zzb, s);
            }
        }
    }
}

