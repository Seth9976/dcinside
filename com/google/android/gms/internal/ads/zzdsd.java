package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;

public final class zzdsd implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final zzdsf zza;
    public final String zzb;

    public zzdsd(zzdsf zzdsf0, String s) {
        this.zza = zzdsf0;
        this.zzb = s;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        this.zza.zzd(this.zzb, sharedPreferences0, s);
    }
}

