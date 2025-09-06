package com.google.android.gms.internal.vision;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;

final class zzbt implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final zzbq zza;

    zzbt(zzbq zzbq0) {
        this.zza = zzbq0;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        this.zza.zza(sharedPreferences0, s);
    }
}

