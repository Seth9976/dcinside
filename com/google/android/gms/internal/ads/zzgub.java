package com.google.android.gms.internal.ads;

public final class zzgub extends zzgxr implements zzgzd {
    private static final zzgub zza;
    private static volatile zzgzk zzb;
    private int zzc;

    static {
        zzgub zzgub0 = new zzgub();
        zzgub.zza = zzgub0;
        zzgxr.zzbZ(zzgub.class, zzgub0);
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzgtz zzb() {
        return (zzgtz)zzgub.zza.zzaZ();
    }

    public static zzgub zzd() {
        return zzgub.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgub.zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"zzc"});
            }
            case 3: {
                return new zzgub();
            }
            case 4: {
                return new zzgtz(null);
            }
            case 5: {
                return zzgub.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgub.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgub.class;
                    synchronized(class0) {
                        zzgzk0 = zzgub.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgub.zza);
                            zzgub.zzb = zzgzk0;
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

