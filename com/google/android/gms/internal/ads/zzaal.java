package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

public final class zzaal {
    private final zzaak zza;
    private final zzaap zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private float zzj;
    private zzcx zzk;

    public zzaal(Context context0, zzaak zzaak0, long v) {
        this.zza = zzaak0;
        this.zzb = new zzaap(context0);
        this.zzd = 0;
        this.zze = 0x8000000000000001L;
        this.zzg = 0x8000000000000001L;
        this.zzh = 0x8000000000000001L;
        this.zzj = 1.0f;
        this.zzk = zzcx.zza;
    }

    public final int zza(long v, long v1, long v2, long v3, boolean z, zzaaj zzaaj0) throws zzib {
        zzaaj.zzg(zzaaj0);
        if(this.zze == 0x8000000000000001L) {
            this.zze = v1;
        }
        if(this.zzg != v) {
            this.zzb.zzd(v);
            this.zzg = v;
        }
        boolean z1 = this.zzc;
        long v4 = (long)(((double)(v - v1)) / ((double)this.zzj));
        if(z1) {
            v4 -= zzei.zzs(this.zzk.zzb()) - v2;
        }
        zzaaj0.zza = v4;
        long v5 = zzaaj0.zza;
        boolean z2 = false;
        if(this.zzh == 0x8000000000000001L || this.zzi) {
            switch(this.zzd) {
                case 0: {
                    if(this.zzc) {
                        return 0;
                    }
                    break;
                }
                case 1: {
                    return 0;
                }
                case 2: {
                    if(v1 >= v3) {
                        return 0;
                    }
                    break;
                }
                case 3: {
                    long v6 = zzei.zzs(this.zzk.zzb()) - this.zzf;
                    if(this.zzc && v5 < -30000L && v6 > 100000L) {
                        return 0;
                    }
                    break;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        }
        if(this.zzc && v1 != this.zze) {
            long v7 = this.zzk.zzc();
            zzaaj0.zzb = this.zzb.zza(zzaaj0.zza * 1000L + v7);
            zzaaj0.zza = (zzaaj0.zzb - v7) / 1000L;
            if(this.zzh != 0x8000000000000001L && !this.zzi) {
                z2 = true;
            }
            if(zzaaj0.zza < -500000L && !z && ((zzzp)this.zza).zzaT(v1, z2)) {
                return 4;
            }
            if(zzaaj0.zza < -30000L && !z) {
                return z2 ? 3 : 2;
            }
            return zzaaj0.zza <= 50000L ? 1 : 5;
        }
        return 5;
    }

    public final void zzb() {
        if(this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zzh = 0x8000000000000001L;
    }

    public final void zzd() {
        this.zzq(0);
    }

    public final void zze(boolean z) {
        this.zzd = z;
    }

    public final void zzf() {
        this.zzq(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = zzei.zzs(this.zzk.zzb());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = 0x8000000000000001L;
        this.zzb.zzh();
    }

    public final void zzi() {
        this.zzb.zzf();
        this.zzg = 0x8000000000000001L;
        this.zze = 0x8000000000000001L;
        this.zzq(1);
        this.zzh = 0x8000000000000001L;
    }

    public final void zzj(int v) {
        this.zzb.zzj(v);
    }

    public final void zzk(zzcx zzcx0) {
        this.zzk = zzcx0;
    }

    public final void zzl(float f) {
        this.zzb.zzc(f);
    }

    public final void zzm(@Nullable Surface surface0) {
        this.zzb.zzi(surface0);
        this.zzq(1);
    }

    public final void zzn(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        zzcw.zzd(f > 0.0f);
        if(f == this.zzj) {
            return;
        }
        this.zzj = f;
        this.zzb.zze(f);
    }

    public final boolean zzo(boolean z) {
        if(z && this.zzd == 3) {
            this.zzh = 0x8000000000000001L;
        }
        else {
            if(this.zzh == 0x8000000000000001L) {
                return false;
            }
            if(this.zzk.zzb() >= this.zzh) {
                this.zzh = 0x8000000000000001L;
                return false;
            }
        }
        return true;
    }

    public final boolean zzp() {
        int v = this.zzd;
        this.zzd = 3;
        this.zzf = zzei.zzs(this.zzk.zzb());
        return v != 3;
    }

    private final void zzq(int v) {
        this.zzd = Math.min(this.zzd, v);
    }
}

