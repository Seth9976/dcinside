package com.google.android.gms.internal.ads;

public final class zzary extends zzgxr implements zzgzd {
    private static final zzary zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private boolean zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        zzary zzary0 = new zzary();
        zzary.zza = zzary0;
        zzgxr.zzbZ(zzary.class, zzary0);
    }

    private zzary() {
        this.zze = 5000;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzary zzc() {
        return zzary.zza;
    }

    public final boolean zzd() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzary.zza, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzary();
            }
            case 4: {
                return new zzarw(null);
            }
            case 5: {
                return zzary.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzary.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzary.class;
                    synchronized(class0) {
                        zzgzk0 = zzary.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzary.zza);
                            zzary.zzb = zzgzk0;
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

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zzf;
    }

    public final boolean zzh() {
        return this.zzh;
    }
}

