package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;

public final class zzfz {
    private static final Object zza;
    private final String zzb;
    private final zzfx zzc;
    private final Object zzd;
    private final Object zze;
    @GuardedBy("overrideLock")
    private volatile Object zzf;
    @GuardedBy("cachingLock")
    private volatile Object zzg;

    static {
        zzfz.zza = new Object();
    }

    private zzfz(String s, Object object0, Object object1, zzfx zzfx0) {
        this.zze = new Object();
        this.zzf = null;
        this.zzg = null;
        this.zzb = s;
        this.zzd = object0;
        this.zzc = zzfx0;
    }

    zzfz(String s, Object object0, Object object1, zzfx zzfx0, zzgc zzgc0) {
        this(s, object0, object1, zzfx0);
    }

    public final Object zza(Object object0) {
        Object object4;
        synchronized(this.zze) {
        }
        if(object0 != null) {
            return object0;
        }
        if(zzga.zza == null) {
            return this.zzd;
        }
        synchronized(zzfz.zza) {
            if(zzab.zza()) {
                return this.zzg == null ? this.zzd : this.zzg;
            }
        }
        try {
            for(Object object3: zzbh.zzdm) {
                zzfz zzfz0 = (zzfz)object3;
                if(zzab.zza()) {
                    throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                }
                try {
                    object4 = null;
                    zzfx zzfx0 = zzfz0.zzc;
                    if(zzfx0 != null) {
                        object4 = zzfx0.zza();
                    }
                }
                catch(IllegalStateException unused_ex) {
                }
                synchronized(zzfz.zza) {
                    zzfz0.zzg = object4;
                }
            }
        }
        catch(SecurityException unused_ex) {
        }
        zzfx zzfx1 = this.zzc;
        if(zzfx1 == null) {
            return this.zzd;
        }
        try {
            return zzfx1.zza();
        }
        catch(SecurityException unused_ex) {
            return this.zzd;
        }
        catch(IllegalStateException unused_ex) {
            return this.zzd;
        }
    }

    public final String zza() {
        return this.zzb;
    }
}

