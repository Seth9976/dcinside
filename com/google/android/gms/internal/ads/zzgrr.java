package com.google.android.gms.internal.ads;

public final class zzgrr extends zzgxr implements zzgzd {
    private static final zzgrr zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;

    static {
        zzgrr zzgrr0 = new zzgrr();
        zzgrr.zza = zzgrr0;
        zzgxr.zzbZ(zzgrr.class, zzgrr0);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    public static zzgrp zzc() {
        return (zzgrp)zzgrr.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgrr.zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002\u000B", new Object[]{"zzd", "zzc"});
            }
            case 3: {
                return new zzgrr();
            }
            case 4: {
                return new zzgrp(null);
            }
            case 5: {
                return zzgrr.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgrr.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgrr.class;
                    synchronized(class0) {
                        zzgzk0 = zzgrr.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgrr.zza);
                            zzgrr.zzb = zzgzk0;
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

    public static zzgrr zzf(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgrr)zzgxr.zzbr(zzgrr.zza, zzgwj0, zzgxb0);
    }
}

