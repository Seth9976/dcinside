package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;

public final class zzjy implements SharedPreferences.OnSharedPreferenceChangeListener {
    private zzjq zza;

    public zzjy(zzjq zzjq0) {
        this.zza = zzjq0;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        this.zza.zza(sharedPreferences0, s);
    }
}

