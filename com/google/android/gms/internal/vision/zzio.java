package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzio {
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

    private static volatile boolean zza = false;
    private static boolean zzb = true;
    private static volatile zzio zzc;
    private static volatile zzio zzd;
    private static final zzio zze;
    private final Map zzf;

    static {
        zzio.zze = new zzio(true);
    }

    zzio() {
        this.zzf = new HashMap();
    }

    private zzio(boolean z) {
        this.zzf = Collections.emptyMap();
    }

    public static zzio zza() {
        return new zzio();
    }

    public final zze zza(zzkk zzkk0, int v) {
        zza zzio$zza0 = new zza(zzkk0, v);
        return (zze)this.zzf.get(zzio$zza0);
    }

    public final void zza(zze zzjb$zze0) {
        zza zzio$zza0 = new zza(zzjb$zze0.zza, zzjb$zze0.zzd.zzb);
        this.zzf.put(zzio$zza0, zzjb$zze0);
    }

    public static zzio zzb() {
        zzio zzio0 = zzio.zzc;
        if(zzio0 == null) {
            synchronized(zzio.class) {
                zzio0 = zzio.zzc;
                if(zzio0 == null) {
                    zzio0 = zzio.zze;
                    zzio.zzc = zzio0;
                }
            }
        }
        return zzio0;
    }

    public static zzio zzc() {
        zzio zzio0 = zzio.zzd;
        if(zzio0 != null) {
            return zzio0;
        }
        synchronized(zzio.class) {
            zzio zzio1 = zzio.zzd;
            if(zzio1 != null) {
                return zzio1;
            }
            zzio zzio2 = zziz.zza(zzio.class);
            zzio.zzd = zzio2;
            return zzio2;
        }
    }
}

