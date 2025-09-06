package com.google.android.gms.internal.vision;

import android.net.Uri;
import java.util.Map;
import o3.h;

public final class zzbe {
    private final Map zza;

    zzbe(Map map0) {
        this.zza = map0;
    }

    @h
    public final String zza(@h Uri uri0, @h String s, @h String s1, String s2) {
        if(uri0 != null) {
            s = uri0.toString();
        }
        else if(s != null) {
        }
        else {
            return null;
        }
        Map map0 = (Map)this.zza.get(s);
        if(map0 == null) {
            return null;
        }
        if(s1 != null) {
            String s3 = String.valueOf(s2);
            if(s3.length() != 0) {
                return (String)map0.get(s1 + s3);
            }
            s2 = new String(s1);
        }
        return (String)map0.get(s2);
    }
}

