package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public final class zzfyd {
    public static ArrayList zza(int v) {
        zzfwk.zza(v, "initialArraySize");
        return new ArrayList(v);
    }

    public static List zzb(List list0, zzfuc zzfuc0) {
        return list0 instanceof RandomAccess ? new zzfya(list0, zzfuc0) : new zzfyc(list0, zzfuc0);
    }
}

