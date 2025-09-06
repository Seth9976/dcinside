package com.google.android.gms.internal.ads;

public final class zzgqh extends zzgxr implements zzgzd {
    private static final zzgqh zza;
    private static volatile zzgzk zzb;
    private int zzc;

    static {
        zzgqh zzgqh0 = new zzgqh();
        zzgqh.zza = zzgqh0;
        zzgxr.zzbZ(zzgqh.class, zzgqh0);
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzgqf zzb() {
        return (zzgqf)zzgqh.zza.zzaZ();
    }

    public static zzgqh zzd() {
        return zzgqh.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgqh.zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"zzc"});
            }
            case 3: {
                return new zzgqh();
            }
            case 4: {
                return new zzgqf(null);
            }
            case 5: {
                return zzgqh.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgqh.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgqh.class;
                    synchronized(class0) {
                        zzgzk0 = zzgqh.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgqh.zza);
                            zzgqh.zzb = zzgzk0;
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

