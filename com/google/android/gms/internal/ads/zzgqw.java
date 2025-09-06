package com.google.android.gms.internal.ads;

public final class zzgqw extends zzgxr implements zzgzd {
    private static final zzgqw zza;
    private static volatile zzgzk zzb;
    private int zzc;

    static {
        zzgqw zzgqw0 = new zzgqw();
        zzgqw.zza = zzgqw0;
        zzgxr.zzbZ(zzgqw.class, zzgqw0);
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzgqu zzb() {
        return (zzgqu)zzgqw.zza.zzaZ();
    }

    public static zzgqw zzd() {
        return zzgqw.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgqw.zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"zzc"});
            }
            case 3: {
                return new zzgqw();
            }
            case 4: {
                return new zzgqu(null);
            }
            case 5: {
                return zzgqw.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgqw.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgqw.class;
                    synchronized(class0) {
                        zzgzk0 = zzgqw.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgqw.zza);
                            zzgqw.zzb = zzgzk0;
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
}

