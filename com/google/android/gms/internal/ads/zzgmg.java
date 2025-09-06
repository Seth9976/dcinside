package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class zzgmg {
    private static final zzgmg zza;
    private final Map zzb;

    static {
        zzgmg.zza = new zzgmg();
    }

    zzgmg() {
        this.zzb = new HashMap();
    }

    public final zzgek zza(String s) throws GeneralSecurityException {
        synchronized(this) {
            if(this.zzb.containsKey("AES128_GCM")) {
                return (zzgek)this.zzb.get("AES128_GCM");
            }
        }
        throw new GeneralSecurityException("Name AES128_GCM does not exist");
    }

    public static zzgmg zzb() {
        return zzgmg.zza;
    }

    public final void zzc(String s, zzgek zzgek0) throws GeneralSecurityException {
        synchronized(this) {
            if(this.zzb.containsKey(s)) {
                if(!((zzgek)this.zzb.get(s)).equals(zzgek0)) {
                    throw new GeneralSecurityException("Parameters object with name " + s + " already exists (" + this.zzb.get(s) + "), cannot insert " + zzgek0);
                }
                return;
            }
            this.zzb.put(s, zzgek0);
        }
    }

    public final void zzd(Map map0) throws GeneralSecurityException {
        synchronized(this) {
            for(Object object0: map0.entrySet()) {
                this.zzc(((String)((Map.Entry)object0).getKey()), ((zzgek)((Map.Entry)object0).getValue()));
            }
        }
    }
}

