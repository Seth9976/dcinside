package com.google.android.gms.internal.ads;

import java.util.Map;
import o3.a;

public final class zzfyk {
    @a
    static Object zza(Map map0, @a Object object0) {
        map0.getClass();
        try {
            return map0.get(object0);
        }
        catch(ClassCastException | NullPointerException unused_ex) {
            return null;
        }
    }

    static boolean zzb(Map map0, @a Object object0) {
        if(map0 == object0) {
            return true;
        }
        return object0 instanceof Map ? map0.entrySet().equals(((Map)object0).entrySet()) : false;
    }
}

