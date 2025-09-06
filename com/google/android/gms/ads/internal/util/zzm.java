package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;

public final class zzm implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final zzs zza;
    public final Context zzb;
    public final String zzc;

    public zzm(zzs zzs0, Context context0, String s) {
        this.zza = zzs0;
        this.zzb = context0;
        this.zzc = s;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        this.zza.zzg(this.zzb, this.zzc, sharedPreferences0, s);
    }
}

