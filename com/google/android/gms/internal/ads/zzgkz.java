package com.google.android.gms.internal.ads;

import j..util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzgkz {
    private static final Logger zza;
    private static final zzgkz zzb;
    private final ConcurrentMap zzc;
    private final ConcurrentMap zzd;

    static {
        zzgkz.zza = Logger.getLogger("com.google.android.gms.internal.ads.zzgkz");
        zzgkz.zzb = new zzgkz();
    }

    public zzgkz() {
        this.zzc = new ConcurrentHashMap();
        this.zzd = new ConcurrentHashMap();
    }

    public final zzgdy zza(String s, Class class0) throws GeneralSecurityException {
        zzgdy zzgdy0 = this.zzg(s);
        if(!zzgdy0.zzb().equals(class0)) {
            throw new GeneralSecurityException("Primitive type " + class0.getName() + " not supported by key manager of type " + zzgdy0.getClass() + ", which only supports: " + zzgdy0.zzb().toString());
        }
        return zzgdy0;
    }

    public final zzgdy zzb(String s) throws GeneralSecurityException {
        return this.zzg(s);
    }

    public static zzgkz zzc() {
        return zzgkz.zzb;
    }

    public final void zzd(zzgdy zzgdy0, boolean z) throws GeneralSecurityException {
        synchronized(this) {
            this.zzf(zzgdy0, 1, true);
        }
    }

    public final boolean zze(String s) {
        return ((Boolean)this.zzd.get(s)).booleanValue();
    }

    public final void zzf(zzgdy zzgdy0, int v, boolean z) throws GeneralSecurityException {
        synchronized(this) {
            if(zzgks.zza(v)) {
                this.zzh(zzgdy0, false, true);
                return;
            }
        }
        throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
    }

    private final zzgdy zzg(String s) throws GeneralSecurityException {
        synchronized(this) {
            if(this.zzc.containsKey(s)) {
                return (zzgdy)this.zzc.get(s);
            }
        }
        throw new GeneralSecurityException("No key manager found for key type " + s);
    }

    private final void zzh(zzgdy zzgdy0, boolean z, boolean z1) throws GeneralSecurityException {
        synchronized(this) {
            String s = ((zzgli)zzgdy0).zza;
            if(this.zzd.containsKey(s) && !((Boolean)this.zzd.get(s)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + s);
            }
            zzgdy zzgdy1 = (zzgdy)this.zzc.get(s);
            if(zzgdy1 != null && !zzgdy1.getClass().equals(zzgdy0.getClass())) {
                zzgkz.zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + s);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", s, zzgdy1.getClass().getName(), zzgdy0.getClass().getName()));
            }
            this.zzc.putIfAbsent(s, zzgdy0);
            this.zzd.put(s, Boolean.TRUE);
        }
    }
}

