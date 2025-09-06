package com.google.android.gms.internal.ads;

import h4.e;
import java.io.IOException;

abstract class zzajt {
    private final zzajm zza;
    private zzadt zzb;
    private zzacq zzc;
    private zzajo zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private zzajq zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;

    public zzajt() {
        this.zza = new zzajm();
        this.zzj = new zzajq();
    }

    protected abstract long zza(zzdy arg1);

    protected void zzb(boolean z) {
        int v;
        if(z) {
            this.zzj = new zzajq();
            this.zzf = 0L;
            v = 0;
        }
        else {
            v = 1;
        }
        this.zzh = v;
        this.zze = -1L;
        this.zzg = 0L;
    }

    @e(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzdy arg1, long arg2, zzajq arg3) throws IOException;

    final int zze(zzaco zzaco0, zzadj zzadj0) throws IOException {
        zzcw.zzb(this.zzb);
        switch(this.zzh) {
            case 0: {
                while(true) {
                    if(!this.zza.zze(zzaco0)) {
                        this.zzh = 3;
                        return -1;
                    }
                    this.zzk = zzaco0.zzf() - this.zzf;
                    if(!this.zzc(this.zza.zza(), this.zzf, this.zzj)) {
                        break;
                    }
                    this.zzf = zzaco0.zzf();
                }
                zzab zzab0 = this.zzj.zza;
                this.zzi = zzab0.zzE;
                if(!this.zzm) {
                    this.zzb.zzm(zzab0);
                    this.zzm = true;
                }
                zzajo zzajo0 = this.zzj.zzb;
                if(zzajo0 != null) {
                    this.zzd = zzajo0;
                }
                else if(zzaco0.zzd() == -1L) {
                    this.zzd = new zzajr(null);
                }
                else {
                    zzajn zzajn0 = this.zza.zzb();
                    boolean z = (zzajn0.zza & 4) != 0;
                    this.zzd = new zzaji(this, this.zzf, zzaco0.zzd(), ((long)(zzajn0.zzd + zzajn0.zze)), zzajn0.zzb, z);
                }
                this.zzh = 2;
                this.zza.zzd();
                return 0;
            }
            case 1: {
                zzaco0.zzk(((int)this.zzf));
                this.zzh = 2;
                return 0;
            }
            case 2: {
                long v = this.zzd.zzd(zzaco0);
                if(v >= 0L) {
                    zzadj0.zza = v;
                    return 1;
                }
                if(v < -1L) {
                    this.zzi(-(v + 2L));
                }
                if(!this.zzl) {
                    zzadm zzadm0 = this.zzd.zze();
                    zzcw.zzb(zzadm0);
                    this.zzc.zzO(zzadm0);
                    this.zzl = true;
                }
                if(this.zzk <= 0L && !this.zza.zze(zzaco0)) {
                    this.zzh = 3;
                    return -1;
                }
                this.zzk = 0L;
                zzdy zzdy0 = this.zza.zza();
                long v1 = this.zza(zzdy0);
                if(v1 >= 0L) {
                    long v2 = this.zzg;
                    if(v2 + v1 >= this.zze) {
                        long v3 = this.zzf(v2);
                        this.zzb.zzr(zzdy0, zzdy0.zze());
                        this.zzb.zzt(v3, 1, zzdy0.zze(), 0, null);
                        this.zze = -1L;
                    }
                }
                this.zzg += v1;
                return 0;
            }
            default: {
                return -1;
            }
        }
    }

    protected final long zzf(long v) {
        return v * 1000000L / ((long)this.zzi);
    }

    protected final long zzg(long v) {
        return ((long)this.zzi) * v / 1000000L;
    }

    final void zzh(zzacq zzacq0, zzadt zzadt0) {
        this.zzc = zzacq0;
        this.zzb = zzadt0;
        this.zzb(true);
    }

    protected void zzi(long v) {
        this.zzg = v;
    }

    final void zzj(long v, long v1) {
        this.zza.zzc();
        if(v == 0L) {
            this.zzb(!this.zzl);
            return;
        }
        if(this.zzh != 0) {
            long v2 = this.zzg(v1);
            this.zze = v2;
            this.zzd.zzg(v2);
            this.zzh = 2;
        }
    }
}

