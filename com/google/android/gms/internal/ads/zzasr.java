package com.google.android.gms.internal.ads;

public final class zzasr extends zzgxr implements zzgzd {
    private static final zzasr zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private long zze;

    static {
        zzasr zzasr0 = new zzasr();
        zzasr.zza = zzasr0;
        zzgxr.zzbZ(zzasr.class, zzasr0);
    }

    private zzasr() {
        this.zze = -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzasr.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", zzasg.zza, "zze"});
            }
            case 3: {
                return new zzasr();
            }
            case 4: {
                return new zzasq(null);
            }
            case 5: {
                return zzasr.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzasr.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzasr.class;
                    synchronized(class0) {
                        zzgzk0 = zzasr.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzasr.zza);
                            zzasr.zzb = zzgzk0;
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

