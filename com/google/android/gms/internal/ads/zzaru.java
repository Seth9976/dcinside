package com.google.android.gms.internal.ads;

public final class zzaru extends zzgxr implements zzgzd {
    private static final zzaru zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;

    static {
        zzaru zzaru0 = new zzaru();
        zzaru.zza = zzaru0;
        zzgxr.zzbZ(zzaru.class, zzaru0);
    }

    private zzaru() {
        this.zzd = "";
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzaru.zza, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzaru();
            }
            case 4: {
                return new zzart(null);
            }
            case 5: {
                return zzaru.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzaru.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzaru.class;
                    synchronized(class0) {
                        zzgzk0 = zzaru.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzaru.zza);
                            zzaru.zzb = zzgzk0;
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

