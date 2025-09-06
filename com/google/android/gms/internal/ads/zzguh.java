package com.google.android.gms.internal.ads;

public final class zzguh extends zzgxr implements zzgzd {
    private static final zzguh zza;
    private static volatile zzgzk zzb;
    private int zzc;

    static {
        zzguh zzguh0 = new zzguh();
        zzguh.zza = zzguh0;
        zzgxr.zzbZ(zzguh.class, zzguh0);
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzguh zzc() {
        return zzguh.zza;
    }

    public static zzguh zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzguh)zzgxr.zzbr(zzguh.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzguh.zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"zzc"});
            }
            case 3: {
                return new zzguh();
            }
            case 4: {
                return new zzguf(null);
            }
            case 5: {
                return zzguh.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzguh.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzguh.class;
                    synchronized(class0) {
                        zzgzk0 = zzguh.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzguh.zza);
                            zzguh.zzb = zzgzk0;
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

