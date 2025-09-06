package com.google.android.gms.internal.ads;

public final class zzatn extends zzgxr implements zzgzd {
    private static final zzatn zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgyd zzd;
    private zzgwj zze;
    private int zzf;
    private int zzg;

    static {
        zzatn zzatn0 = new zzatn();
        zzatn.zza = zzatn0;
        zzgxr.zzbZ(zzatn.class, zzatn0);
    }

    private zzatn() {
        this.zzd = zzgxr.zzbK();
        this.zze = zzgwj.zzb;
        this.zzf = 1;
        this.zzg = 1;
    }

    public static zzatm zza() {
        return (zzatm)zzatn.zza.zzaZ();
    }

    static void zzc(zzatn zzatn0, zzgwj zzgwj0) {
        zzgyd zzgyd0 = zzatn0.zzd;
        if(!zzgyd0.zzc()) {
            zzatn0.zzd = zzgxr.zzbL(zzgyd0);
        }
        zzatn0.zzd.add(zzgwj0);
    }

    static void zzd(zzatn zzatn0, zzgwj zzgwj0) {
        zzatn0.zzc |= 1;
        zzatn0.zze = zzgwj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzatn.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001C\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", zzath.zza, "zzg", zzatd.zza});
            }
            case 3: {
                return new zzatn();
            }
            case 4: {
                return new zzatm(null);
            }
            case 5: {
                return zzatn.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzatn.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzatn.class;
                    synchronized(class0) {
                        zzgzk0 = zzatn.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzatn.zza);
                            zzatn.zzb = zzgzk0;
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

    static void zzf(zzatn zzatn0, int v) {
        zzatn0.zzg = v - 1;
        zzatn0.zzc |= 4;
    }

    static void zzg(zzatn zzatn0, int v) {
        zzatn0.zzf = 4;
        zzatn0.zzc |= 2;
    }
}

