package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;

public final class zzgy implements zzhh {
    private final SimpleArrayMap zza;

    zzgy(SimpleArrayMap simpleArrayMap0) {
        this.zza = simpleArrayMap0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhh
    public final String zza(Uri uri0, String s, String s1, String s2) {
        SimpleArrayMap simpleArrayMap1;
        if(uri0 != null) {
            s = uri0.toString();
            goto label_4;
        }
        else if(s == null) {
            simpleArrayMap1 = null;
        }
        else {
        label_4:
            SimpleArrayMap simpleArrayMap0 = this.zza;
            simpleArrayMap1 = simpleArrayMap0 == null ? null : ((SimpleArrayMap)simpleArrayMap0.get(s));
        }
        if(simpleArrayMap1 == null) {
            return null;
        }
        if(s1 != null) {
            s2 = s1 + s2;
        }
        return (String)simpleArrayMap1.get(s2);
    }
}

