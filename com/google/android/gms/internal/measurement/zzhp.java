package com.google.android.gms.internal.measurement;

import android.util.Log;
import o3.h;

final class zzhp extends zzhj {
    zzhp(zzhr zzhr0, String s, Double double0, boolean z) {
        super(zzhr0, s, double0, true, null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhj
    @h
    final Object zza(Object object0) {
        return this.zzb(object0);
    }

    @h
    private final Double zzb(Object object0) {
        if(object0 instanceof Double) {
            return (Double)object0;
        }
        if(object0 instanceof Float) {
            return ((Float)object0).doubleValue();
        }
        if(object0 instanceof String) {
            try {
                return Double.parseDouble(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + super.zzb() + ": " + object0);
        return null;
    }
}

