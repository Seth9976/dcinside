package com.google.android.gms.internal.vision;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

final class zzbm extends zzbi {
    private final zzbp zza;

    zzbm(zzbo zzbo0, String s, Object object0, boolean z, zzbp zzbp0) {
        this.zza = zzbp0;
        super(zzbo0, s, object0, true, null);
    }

    @Override  // com.google.android.gms.internal.vision.zzbi
    final Object zza(Object object0) {
        if(object0 instanceof String) {
            try {
                byte[] arr_b = Base64.decode(((String)object0), 3);
                return this.zza.zza(arr_b);
            }
            catch(IOException | IllegalArgumentException unused_ex) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid byte[] value for " + super.zzb() + ": " + object0);
        return null;
    }
}

