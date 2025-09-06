package com.google.android.gms.internal.measurement;

import android.util.Log;
import o3.h;

final class zzhq extends zzhj {
    zzhq(zzhr zzhr0, String s, Boolean boolean0, boolean z) {
        super(zzhr0, s, boolean0, true, null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhj
    @h
    final Object zza(Object object0) {
        if(object0 instanceof Boolean) {
            return (Boolean)object0;
        }
        if(object0 instanceof String) {
            if(zzgi.zzc.matcher(((String)object0)).matches()) {
                return true;
            }
            if(zzgi.zzd.matcher(((String)object0)).matches()) {
                return false;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.zzb() + ": " + object0);
        return null;
    }
}

