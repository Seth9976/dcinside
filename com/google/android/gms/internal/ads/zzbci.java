package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

final class zzbci implements zzbfa {
    final SharedPreferences zza;

    zzbci(zzbcj zzbcj0, SharedPreferences sharedPreferences0) {
        this.zza = sharedPreferences0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final Boolean zza(String s, boolean z) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(s, z));
        }
        catch(ClassCastException unused_ex) {
            return Boolean.valueOf(this.zza.getString(s, String.valueOf(z)));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final Double zzb(String s, double f) {
        try {
            return (double)this.zza.getFloat(s, ((float)f));
        }
        catch(ClassCastException unused_ex) {
            return Double.valueOf(this.zza.getString(s, String.valueOf(f)));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final Long zzc(String s, long v) {
        try {
            return this.zza.getLong(s, v);
        }
        catch(ClassCastException unused_ex) {
            return (long)this.zza.getInt(s, ((int)v));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final String zzd(String s, String s1) {
        return this.zza.getString(s, s1);
    }
}

