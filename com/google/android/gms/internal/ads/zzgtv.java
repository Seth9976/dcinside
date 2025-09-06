package com.google.android.gms.internal.ads;

public final class zzgtv extends zzgxr implements zzgzd {
    private static final zzgtv zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgub zze;
    private zzgwj zzf;

    static {
        zzgtv zzgtv0 = new zzgtv();
        zzgtv.zza = zzgtv0;
        zzgxr.zzbZ(zzgtv.class, zzgtv0);
    }

    private zzgtv() {
        this.zzf = zzgwj.zzb;
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzgtt zzb() {
        return (zzgtt)zzgtv.zza.zzaZ();
    }

    public static zzgtv zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgtv)zzgxr.zzbr(zzgtv.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgtv.zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgtv();
            }
            case 4: {
                return new zzgtt(null);
            }
            case 5: {
                return zzgtv.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgtv.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgtv.class;
                    synchronized(class0) {
                        zzgzk0 = zzgtv.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgtv.zza);
                            zzgtv.zzb = zzgzk0;
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

    public final zzgub zzf() {
        return this.zze == null ? zzgub.zzd() : this.zze;
    }

    public final zzgwj zzg() {
        return this.zzf;
    }

    static void zzi(zzgtv zzgtv0, zzgub zzgub0) {
        zzgub0.getClass();
        zzgtv0.zze = zzgub0;
        zzgtv0.zzc |= 1;
    }
}

