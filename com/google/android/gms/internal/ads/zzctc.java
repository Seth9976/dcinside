package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import j..util.concurrent.ConcurrentHashMap;

public final class zzctc {
    private final Object zza;
    private final ConcurrentHashMap zzb;
    private final ConcurrentHashMap zzc;
    private final ConcurrentHashMap zzd;

    @VisibleForTesting
    public zzctc() {
        this.zza = new Object();
        this.zzb = new ConcurrentHashMap();
        this.zzc = new ConcurrentHashMap();
        this.zzd = new ConcurrentHashMap();
    }

    public final int zza(String s) {
        Integer integer0 = (Integer)this.zzb.get(s);
        return integer0 == null ? 0 : ((int)integer0);
    }

    public final long zzb(String s) {
        Long long0 = (Long)this.zzd.get(s);
        return long0 == null ? -1L : ((long)long0);
    }

    public final void zzc(String s) {
        synchronized(this.zza) {
            Integer integer0 = (Integer)this.zzb.get(s);
            this.zzb.put(s, (integer0 == null ? 1 : ((int)(((int)integer0) + 1))));
        }
    }

    public final void zzd(String s, String s1, long v) {
        Long long0 = (Long)this.zzc.get(s1);
        if(long0 == null) {
            return;
        }
        this.zzc.remove(s1);
        this.zzd.put(s, ((long)(v - ((long)long0))));
    }

    public final void zze(String s, long v) {
        this.zzc.put(s, v);
    }
}

