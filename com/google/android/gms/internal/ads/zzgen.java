package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.logging.Logger;
import o3.h;

public final class zzgen {
    public static final int zza;

    static {
        Logger.getLogger("com.google.android.gms.internal.ads.zzgen");
        new ConcurrentHashMap();
        HashSet hashSet0 = new HashSet();
        hashSet0.add(zzgdn.class);
        hashSet0.add(zzgdt.class);
        hashSet0.add(zzgep.class);
        hashSet0.add(zzgdv.class);
        hashSet0.add(zzgdu.class);
        hashSet0.add(zzgej.class);
        hashSet0.add(zzgpy.class);
        hashSet0.add(zzgel.class);
        hashSet0.add(zzgem.class);
        DesugarCollections.unmodifiableSet(hashSet0);
    }

    @h
    public static Class zza(Class class0) {
        try {
            return zzgmh.zza().zzb(class0);
        }
        catch(GeneralSecurityException unused_ex) {
            return null;
        }
    }

    public static Object zzb(zzgsl zzgsl0, Class class0) throws GeneralSecurityException {
        return zzgkz.zzc().zza(zzgsl0.zzg(), class0).zzc(zzgsl0.zzf());
    }
}

