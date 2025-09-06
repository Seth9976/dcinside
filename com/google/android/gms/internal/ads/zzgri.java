package com.google.android.gms.internal.ads;

public final class zzgri extends zzgxr implements zzgzd {
    private static final zzgri zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgwj zzd;

    static {
        zzgri zzgri0 = new zzgri();
        zzgri.zza = zzgri0;
        zzgxr.zzbZ(zzgri.class, zzgri0);
    }

    private zzgri() {
        this.zzd = zzgwj.zzb;
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzgrg zzb() {
        return (zzgrg)zzgri.zza.zzaZ();
    }

    public static zzgri zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgri)zzgxr.zzbr(zzgri.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgri.zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000B\u0003\n", new Object[]{"zzc", "zzd"});
            }
            case 3: {
                return new zzgri();
            }
            case 4: {
                return new zzgrg(null);
            }
            case 5: {
                return zzgri.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgri.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgri.class;
                    synchronized(class0) {
                        zzgzk0 = zzgri.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgri.zza);
                            zzgri.zzb = zzgzk0;
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
        return zzgri.zza.zzbN();
    }
}

