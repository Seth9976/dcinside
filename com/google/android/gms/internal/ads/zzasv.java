package com.google.android.gms.internal.ads;

public final class zzasv extends zzgxr implements zzgzd {
    private long zzA;
    private long zzB;
    private static final zzasv zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private long zzo;
    private long zzp;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        zzasv zzasv0 = new zzasv();
        zzasv.zza = zzasv0;
        zzgxr.zzbZ(zzasv.class, zzasv0);
    }

    private zzasv() {
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = -1L;
        this.zzj = 1000;
        this.zzk = -1L;
        this.zzl = -1L;
        this.zzm = -1L;
        this.zzn = 1000;
        this.zzo = -1L;
        this.zzp = -1L;
        this.zzu = -1L;
        this.zzv = -1L;
        this.zzy = -1L;
        this.zzz = -1L;
        this.zzA = -1L;
        this.zzB = -1L;
    }

    public static zzasu zza() {
        return (zzasu)zzasv.zza.zzaZ();
    }

    static void zzc(zzasv zzasv0) {
        zzasv0.zzc &= -9;
        zzasv0.zzg = -1L;
    }

    static void zzd(zzasv zzasv0, long v) {
        zzasv0.zzc |= 8;
        zzasv0.zzg = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzasv.zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000B᠌\n\fဂ\u000B\rဂ\f\u000Eဂ\r\u000Fဂ\u000E\u0010ဂ\u000F\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzate.zza, "zzk", "zzl", "zzm", "zzn", zzate.zza, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
            }
            case 3: {
                return new zzasv();
            }
            case 4: {
                return new zzasu(null);
            }
            case 5: {
                return zzasv.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzasv.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzasv.class;
                    synchronized(class0) {
                        zzgzk0 = zzasv.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzasv.zza);
                            zzasv.zzb = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
            default: {
                throw null;
            }
        }
    }

    static void zzf(zzasv zzasv0, long v) {
        zzasv0.zzc |= 0x20;
        zzasv0.zzi = v;
    }

    static void zzg(zzasv zzasv0, long v) {
        zzasv0.zzc |= 0x1000;
        zzasv0.zzp = v;
    }

    static void zzh(zzasv zzasv0, long v) {
        zzasv0.zzc |= 0x200;
        zzasv0.zzm = v;
    }

    static void zzi(zzasv zzasv0, long v) {
        zzasv0.zzc |= 0x800;
        zzasv0.zzo = v;
    }

    static void zzj(zzasv zzasv0, long v) {
        zzasv0.zzc |= 4;
        zzasv0.zzf = v;
    }

    static void zzk(zzasv zzasv0, long v) {
        zzasv0.zzc |= 16;
        zzasv0.zzh = v;
    }

    static void zzl(zzasv zzasv0, long v) {
        zzasv0.zzc |= 0x80;
        zzasv0.zzk = v;
    }

    static void zzm(zzasv zzasv0, long v) {
        zzasv0.zzc |= 0x20000;
        zzasv0.zzy = v;
    }

    static void zzn(zzasv zzasv0, long v) {
        zzasv0.zzc |= 1;
        zzasv0.zzd = v;
    }

    static void zzo(zzasv zzasv0, long v) {
        zzasv0.zzc |= 0x40000;
        zzasv0.zzz = v;
    }

    static void zzp(zzasv zzasv0, long v) {
        zzasv0.zzc |= 2;
        zzasv0.zze = v;
    }

    static void zzq(zzasv zzasv0, long v) {
        zzasv0.zzc |= 0x100;
        zzasv0.zzl = v;
    }

    static void zzr(zzasv zzasv0, long v) {
        zzasv0.zzc |= 0x8000;
        zzasv0.zzw = v;
    }

    static void zzs(zzasv zzasv0, long v) {
        zzasv0.zzc |= 0x10000;
        zzasv0.zzx = v;
    }

    static void zzt(zzasv zzasv0, long v) {
        zzasv0.zzc |= 0x2000;
        zzasv0.zzu = v;
    }

    static void zzu(zzasv zzasv0, long v) {
        zzasv0.zzc |= 0x4000;
        zzasv0.zzv = v;
    }

    static void zzv(zzasv zzasv0, int v) {
        zzasv0.zzn = v - 1;
        zzasv0.zzc |= 0x400;
    }

    static void zzw(zzasv zzasv0, int v) {
        zzasv0.zzj = v - 1;
        zzasv0.zzc |= 0x40;
    }
}

