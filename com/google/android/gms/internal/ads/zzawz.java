package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzawz extends zzaxr {
    private static volatile Long zzh;
    private static final Object zzi;

    static {
        zzawz.zzi = new Object();
    }

    public zzawz(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1) {
        super(zzawd0, "bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", zzasc0, v, 22);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if(zzawz.zzh == null) {
            Object object0 = zzawz.zzi;
            synchronized(object0) {
                if(zzawz.zzh == null) {
                    zzawz.zzh = (Long)this.zze.invoke(null, null);
                }
            }
        }
        synchronized(this.zzd) {
            this.zzd.zzy(((long)zzawz.zzh));
        }
    }
}

