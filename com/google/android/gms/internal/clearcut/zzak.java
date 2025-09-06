package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

final class zzak extends zzae {
    zzak(zzao zzao0, String s, String s1) {
        super(zzao0, s, s1, null);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzae
    protected final Object zza(SharedPreferences sharedPreferences0) {
        return this.zzc(sharedPreferences0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzae
    protected final Object zzb(String s) {
        return s;
    }

    private final String zzc(SharedPreferences sharedPreferences0) {
        try {
            return sharedPreferences0.getString(this.zzds, null);
        }
        catch(ClassCastException classCastException0) {
            String s = String.valueOf(this.zzds);
            Log.e("PhenotypeFlag", (s.length() == 0 ? new String("Invalid string value in SharedPreferences for ") : "Invalid string value in SharedPreferences for " + s), classCastException0);
            return null;
        }
    }
}

