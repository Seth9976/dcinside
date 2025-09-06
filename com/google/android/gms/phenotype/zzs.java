package com.google.android.gms.phenotype;

import android.content.SharedPreferences;
import android.util.Log;

final class zzs extends PhenotypeFlag {
    zzs(Factory phenotypeFlag$Factory0, String s, String s1) {
        super(phenotypeFlag$Factory0, s, s1, null);
    }

    @Override  // com.google.android.gms.phenotype.PhenotypeFlag
    public final Object zza(SharedPreferences sharedPreferences0) {
        return this.zzb(sharedPreferences0);
    }

    @Override  // com.google.android.gms.phenotype.PhenotypeFlag
    public final Object zza(String s) {
        return s;
    }

    private final String zzb(SharedPreferences sharedPreferences0) {
        try {
            return sharedPreferences0.getString(this.zzap, null);
        }
        catch(ClassCastException classCastException0) {
            String s = String.valueOf(this.zzap);
            Log.e("PhenotypeFlag", (s.length() == 0 ? new String("Invalid string value in SharedPreferences for ") : "Invalid string value in SharedPreferences for " + s), classCastException0);
            return null;
        }
    }
}

