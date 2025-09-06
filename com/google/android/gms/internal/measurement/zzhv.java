package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;

public final class zzhv implements SharedPreferences.OnSharedPreferenceChangeListener {
    private zzhw zza;

    public zzhv(zzhw zzhw0) {
        this.zza = zzhw0;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        this.zza.zza(sharedPreferences0, s);
    }
}

