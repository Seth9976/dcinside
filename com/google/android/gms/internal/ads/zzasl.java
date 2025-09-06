package com.google.android.gms.internal.ads;

public final class zzasl extends zzgxr implements zzgzd {
    private static final zzasl zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;

    static {
        zzasl zzasl0 = new zzasl();
        zzasl.zza = zzasl0;
        zzgxr.zzbZ(zzasl.class, zzasl0);
    }

    private zzasl() {
        this.zzd = -1L;
        this.zze = 1000;
        this.zzf = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzasl.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", zzate.zza, "zzf", zzate.zza});
            }
            case 3: {
                return new zzasl();
            }
            case 4: {
                return new zzask(null);
            }
            case 5: {
                return zzasl.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzasl.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzasl.class;
                    synchronized(class0) {
                        zzgzk0 = zzasl.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzasl.zza);
                            zzasl.zzb = zzgzk0;
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

