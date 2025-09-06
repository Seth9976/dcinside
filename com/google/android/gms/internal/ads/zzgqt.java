package com.google.android.gms.internal.ads;

public final class zzgqt extends zzgxr implements zzgzd {
    private static final zzgqt zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgqw zzd;
    private int zze;

    static {
        zzgqt zzgqt0 = new zzgqt();
        zzgqt.zza = zzgqt0;
        zzgxr.zzbZ(zzgqt.class, zzgqt0);
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgqr zzb() {
        return (zzgqr)zzgqt.zza.zzaZ();
    }

    public static zzgqt zzd() {
        return zzgqt.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgqt.zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000B", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzgqt();
            }
            case 4: {
                return new zzgqr(null);
            }
            case 5: {
                return zzgqt.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgqt.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgqt.class;
                    synchronized(class0) {
                        zzgzk0 = zzgqt.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgqt.zza);
                            zzgqt.zzb = zzgzk0;
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

    public final zzgqw zzf() {
        return this.zzd == null ? zzgqw.zzd() : this.zzd;
    }

    static void zzh(zzgqt zzgqt0, zzgqw zzgqw0) {
        zzgqw0.getClass();
        zzgqt0.zzd = zzgqw0;
        zzgqt0.zzc |= 1;
    }
}

