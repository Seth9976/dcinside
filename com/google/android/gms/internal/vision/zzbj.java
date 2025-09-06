package com.google.android.gms.internal.vision;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

public final class zzbj {
    @GuardedBy("PhenotypeConstants.class")
    private static final ArrayMap zza;

    static {
        zzbj.zza = new ArrayMap();
    }

    public static Uri zza(String s) {
        synchronized(zzbj.class) {
            ArrayMap arrayMap0 = zzbj.zza;
            Uri uri0 = (Uri)arrayMap0.get(s);
            if(uri0 == null) {
                String s1 = Uri.encode(s);
                uri0 = Uri.parse((s1.length() == 0 ? new String("content://com.google.android.gms.phenotype/") : "content://com.google.android.gms.phenotype/" + s1));
                arrayMap0.put(s, uri0);
            }
            return uri0;
        }
    }
}

