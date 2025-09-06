package com.google.android.gms.internal.ads;

public final class zzfht extends zzgxr implements zzgzd {
    private static final zzfht zza;
    private static volatile zzgzk zzb;
    private zzgyd zzc;

    static {
        zzfht zzfht0 = new zzfht();
        zzfht.zza = zzfht0;
        zzgxr.zzbZ(zzfht.class, zzfht0);
    }

    private zzfht() {
        this.zzc = zzgxr.zzbK();
    }

    public final int zza() {
        return this.zzc.size();
    }

    public static zzfhp zzb() {
        return (zzfhp)zzfht.zza.zzaZ();
    }

    static void zzd(zzfht zzfht0, zzfhr zzfhr0) {
        zzfhr0.getClass();
        zzgyd zzgyd0 = zzfht0.zzc;
        if(!zzgyd0.zzc()) {
            zzfht0.zzc = zzgxr.zzbL(zzgyd0);
        }
        zzfht0.zzc.add(zzfhr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzfht.zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zzc", zzfhr.class});
            }
            case 3: {
                return new zzfht();
            }
            case 4: {
                return new zzfhp(null);
            }
            case 5: {
                return zzfht.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzfht.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzfht.class;
                    synchronized(class0) {
                        zzgzk0 = zzfht.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzfht.zza);
                            zzfht.zzb = zzgzk0;
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

    static void zzf(zzfht zzfht0) {
        zzfht0.zzc = zzgxr.zzbK();
    }
}

