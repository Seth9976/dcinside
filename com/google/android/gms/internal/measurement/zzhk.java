package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

public final class zzhk {
    @GuardedBy("PhenotypeConstants.class")
    private static final ArrayMap zza;

    static {
        zzhk.zza = new ArrayMap();
    }

    public static Uri zza(String s) {
        synchronized(zzhk.class) {
            ArrayMap arrayMap0 = zzhk.zza;
            Uri uri0 = (Uri)arrayMap0.get(s);
            if(uri0 == null) {
                uri0 = Uri.parse(("content://com.google.android.gms.phenotype/" + Uri.encode(s)));
                arrayMap0.put(s, uri0);
            }
            return uri0;
        }
    }

    public static String zza(Context context0, String s) {
        if(s.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + s);
        }
        return s + "#" + "" + "com.dcinside.app.android";
    }

    // 去混淆评级： 低(40)
    public static boolean zza(String s, String s1) {
        return (s.equals("eng") || s.equals("userdebug")) && (s1.contains("dev-keys") || s1.contains("test-keys"));
    }
}

