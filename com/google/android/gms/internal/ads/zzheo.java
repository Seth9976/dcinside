package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class zzheo {
    static HashSet zza(int v) {
        return new HashSet(zzheo.zzd(v));
    }

    public static LinkedHashMap zzb(int v) {
        return new LinkedHashMap(zzheo.zzd(v));
    }

    public static List zzc(int v) {
        return v == 0 ? Collections.emptyList() : new ArrayList(v);
    }

    private static int zzd(int v) {
        if(v < 3) {
            return v + 1;
        }
        return v >= 0x40000000 ? 0x7FFFFFFF : ((int)(((float)v) / 0.75f + 1.0f));
    }
}

