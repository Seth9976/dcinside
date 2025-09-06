package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import java.math.RoundingMode;

public final class zzef {
    @GuardedBy("this")
    private long zza;
    @GuardedBy("this")
    private long zzb;
    @GuardedBy("this")
    private long zzc;
    private final ThreadLocal zzd;

    public zzef(long v) {
        this.zzd = new ThreadLocal();
        this.zzi(0L);
    }

    public final long zza(long v) {
        synchronized(this) {
            if(v == 0x8000000000000001L) {
                return 0x8000000000000001L;
            }
            if(!this.zzj()) {
                long v2 = this.zza;
                if(v2 == 0x7FFFFFFFFFFFFFFEL) {
                    Long long0 = (Long)this.zzd.get();
                    if(long0 == null) {
                        throw null;
                    }
                    v2 = (long)long0;
                }
                this.zzb = v2 - v;
                this.notifyAll();
            }
            this.zzc = v;
            return v + this.zzb;
        }
    }

    public final long zzb(long v) {
        synchronized(this) {
            if(v == 0x8000000000000001L) {
                return 0x8000000000000001L;
            }
            long v2 = this.zzc;
            if(v2 != 0x8000000000000001L) {
                zzef.zzh(v2);
            }
            return this.zza(zzef.zzg(v));
        }
    }

    public final long zzc(long v) {
        synchronized(this) {
            if(v == 0x8000000000000001L) {
                return 0x8000000000000001L;
            }
            long v2 = this.zzc;
            if(v2 != 0x8000000000000001L) {
                long v3 = zzef.zzh(v2);
                long v4 = v3 / 0x200000000L * 0x200000000L + v;
                if(v4 >= v3) {
                    v = v4;
                }
            }
            return this.zza(zzef.zzg(v));
        }
    }

    public final long zzd() {
        synchronized(this) {
            long v = this.zza;
            if(v != 0x7FFFFFFFFFFFFFFFL && v != 0x7FFFFFFFFFFFFFFEL) {
                return v;
            }
        }
        return 0x8000000000000001L;
    }

    public final long zze() {
        synchronized(this) {
            long v1 = this.zzc;
            return v1 == 0x8000000000000001L ? this.zzd() : v1 + this.zzb;
        }
    }

    public final long zzf() {
        synchronized(this) {
        }
        return this.zzb;
    }

    public static long zzg(long v) {
        return zzei.zzu(v, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long zzh(long v) {
        return zzei.zzu(v, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final void zzi(long v) {
        synchronized(this) {
            this.zza = v;
            this.zzb = v == 0x7FFFFFFFFFFFFFFFL ? 0L : 0x8000000000000001L;
            this.zzc = 0x8000000000000001L;
        }
    }

    public final boolean zzj() {
        synchronized(this) {
        }
        return Long.compare(this.zzb, 0x8000000000000001L) != 0;
    }
}

