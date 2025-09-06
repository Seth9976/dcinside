package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class zzalr {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzalr(String s, int v, String s1, Set set0) {
        this.zzb = v;
        this.zza = s;
        this.zzc = s1;
        this.zzd = set0;
    }

    public static zzalr zza(String s, int v) {
        String s2;
        String s1 = s.trim();
        zzcw.zzd(!s1.isEmpty());
        int v2 = s1.indexOf(" ");
        if(v2 == -1) {
            s2 = "";
        }
        else {
            String s3 = s1.substring(v2).trim();
            s1 = s1.substring(0, v2);
            s2 = s3;
        }
        String[] arr_s = s1.split("\\.", -1);
        String s4 = arr_s[0];
        HashSet hashSet0 = new HashSet();
        for(int v1 = 1; v1 < arr_s.length; ++v1) {
            hashSet0.add(arr_s[v1]);
        }
        return new zzalr(s4, v, s2, hashSet0);
    }

    public static zzalr zzb() {
        return new zzalr("", 0, "", Collections.emptySet());
    }
}

