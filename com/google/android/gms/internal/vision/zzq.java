package com.google.android.gms.internal.vision;

import android.content.Context;
import android.util.Log;

public final class zzq {
    public static boolean zza(Context context0, String s, String s1) {
        String s2 = zzdg.zza(s1);
        if(!"face".equals(s) && !"ica".equals(s) && !"ocr".equals(s) && !"barcode".equals(s)) {
            Log.e("NativeLibraryLoader", String.format("Unrecognized engine: %s", s));
            return false;
        }
        int v = s2.lastIndexOf(".so");
        if(v == s2.length() - 3) {
            s2 = s2.substring(0, v);
        }
        if(s2.indexOf("lib") == 0) {
            s2 = s2.substring(3);
        }
        boolean z = zzr.zza(s, s2);
        if(!z) {
            Log.d("NativeLibraryLoader", String.format("%s engine not loaded with %s.", s, s2));
        }
        return z;
    }
}

