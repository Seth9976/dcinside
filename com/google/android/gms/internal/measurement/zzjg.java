package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzjg {
    static final class zza {
        private final Object zza;
        private final int zzb;

        zza(Object object0, int v) {
            this.zza = object0;
            this.zzb = v;
        }

        @Override
        public final boolean equals(Object object0) {
            return object0 instanceof zza ? this.zza == ((zza)object0).zza && this.zzb == ((zza)object0).zzb : false;
        }

        @Override
        public final int hashCode() {
            return System.identityHashCode(this.zza) * 0xFFFF + this.zzb;
        }
    }

    static final zzjg zza = null;
    private static volatile boolean zzb = false;
    private static volatile zzjg zzc;
    private final Map zzd;

    static {
        zzjg.zza = new zzjg(true);
    }

    zzjg() {
        this.zzd = new HashMap();
    }

    private zzjg(boolean z) {
        this.zzd = Collections.emptyMap();
    }

    public static zzjg zza() {
        zzjg zzjg0 = zzjg.zzc;
        if(zzjg0 != null) {
            return zzjg0;
        }
        synchronized(zzjg.class) {
            zzjg zzjg1 = zzjg.zzc;
            if(zzjg1 != null) {
                return zzjg1;
            }
            zzjg zzjg2 = zzjr.zza(zzjg.class);
            zzjg.zzc = zzjg2;
            return zzjg2;
        }
    }

    public final zzf zza(zzlc zzlc0, int v) {
        zza zzjg$zza0 = new zza(zzlc0, v);
        return (zzf)this.zzd.get(zzjg$zza0);
    }
}

