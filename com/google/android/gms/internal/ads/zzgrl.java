package com.google.android.gms.internal.ads;

public final class zzgrl extends zzgxr implements zzgzd {
    private static final zzgrl zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;

    static {
        zzgrl zzgrl0 = new zzgrl();
        zzgrl.zza = zzgrl0;
        zzgxr.zzbZ(zzgrl.class, zzgrl0);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    public static zzgrj zzc() {
        return (zzgrj)zzgrl.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgrl.zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000B\u0003\u000B", new Object[]{"zzc", "zzd"});
            }
            case 3: {
                return new zzgrl();
            }
            case 4: {
                return new zzgrj(null);
            }
            case 5: {
                return zzgrl.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgrl.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgrl.class;
                    synchronized(class0) {
                        zzgzk0 = zzgrl.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgrl.zza);
                            zzgrl.zzb = zzgzk0;
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

    public static zzgrl zzf(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgrl)zzgxr.zzbr(zzgrl.zza, zzgwj0, zzgxb0);
    }
}

