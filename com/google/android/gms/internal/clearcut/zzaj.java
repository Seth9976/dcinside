package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

final class zzaj extends zzae {
    zzaj(zzao zzao0, String s, Boolean boolean0) {
        super(zzao0, s, boolean0, null);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzae
    protected final Object zza(SharedPreferences sharedPreferences0) {
        return this.zzb(sharedPreferences0);
    }

    private final Boolean zzb(SharedPreferences sharedPreferences0) {
        try {
            return Boolean.valueOf(sharedPreferences0.getBoolean(this.zzds, false));
        }
        catch(ClassCastException classCastException0) {
            String s = String.valueOf(this.zzds);
            Log.e("PhenotypeFlag", (s.length() == 0 ? new String("Invalid boolean value in SharedPreferences for ") : "Invalid boolean value in SharedPreferences for " + s), classCastException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzae
    protected final Object zzb(String s) {
        if(zzy.zzcr.matcher(s).matches()) {
            return true;
        }
        if(zzy.zzcs.matcher(s).matches()) {
            return false;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + this.zzds + ": " + s);
        return null;
    }
}

