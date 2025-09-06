package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

public final class zzguw {
    public static final zzguw zza;
    public static final zzguw zzb;
    private final zzguu zzc;

    static {
        zzguw.zza = new zzguw(new zzgux());
        zzguw.zzb = new zzguw(new zzgvb());
        new zzguw(new zzgvd());
        new zzguw(new zzgvc());
        new zzguw(new zzguy());
        new zzguw(new zzgva());
        new zzguw(new zzguz());
    }

    public zzguw(zzgve zzgve0) {
        zzgut zzgut0 = zzgkt.zzb() ? new zzgut(zzgve0, null) : new zzgur(zzgve0, null);
        this.zzc = zzgut0;
    }

    public final Object zza(String s) throws GeneralSecurityException {
        return this.zzc.zza(s);
    }

    public static List zzb(String[] arr_s) {
        List list0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            Provider provider0 = Security.getProvider(arr_s[v]);
            if(provider0 != null) {
                list0.add(provider0);
            }
        }
        return list0;
    }
}

