package com.google.android.gms.internal.ads;

public final class zzgro extends zzgxr implements zzgzd {
    private static final zzgro zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgwj zzd;

    static {
        zzgro zzgro0 = new zzgro();
        zzgro.zza = zzgro0;
        zzgxr.zzbZ(zzgro.class, zzgro0);
    }

    private zzgro() {
        this.zzd = zzgwj.zzb;
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzgrm zzb() {
        return (zzgrm)zzgro.zza.zzaZ();
    }

    public static zzgro zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgro)zzgxr.zzbr(zzgro.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgro.zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000B\u0003\n", new Object[]{"zzc", "zzd"});
            }
            case 3: {
                return new zzgro();
            }
            case 4: {
                return new zzgrm(null);
            }
            case 5: {
                return zzgro.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgro.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgro.class;
                    synchronized(class0) {
                        zzgzk0 = zzgro.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgro.zza);
                            zzgro.zzb = zzgzk0;
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

    public final zzgwj zzf() {
        return this.zzd;
    }

    public static zzgzk zzg() {
        return zzgro.zza.zzbN();
    }
}

