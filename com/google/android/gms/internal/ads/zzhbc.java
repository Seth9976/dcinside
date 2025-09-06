package com.google.android.gms.internal.ads;

public final class zzhbc extends zzgxr implements zzgzd {
    private static final zzhbc zza;
    private static volatile zzgzk zzb;
    private zzgyd zzc;

    static {
        zzhbc zzhbc0 = new zzhbc();
        zzhbc.zza = zzhbc0;
        zzgxr.zzbZ(zzhbc.class, zzhbc0);
    }

    private zzhbc() {
        this.zzc = zzgxr.zzbK();
    }

    public static zzhbb zzc() {
        return (zzhbb)zzhbc.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhbc.zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zzc", zzhba.class});
            }
            case 3: {
                return new zzhbc();
            }
            case 4: {
                return new zzhbb(null);
            }
            case 5: {
                return zzhbc.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhbc.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhbc.class;
                    synchronized(class0) {
                        zzgzk0 = zzhbc.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhbc.zza);
                            zzhbc.zzb = zzgzk0;
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

    static void zzf(zzhbc zzhbc0, zzhba zzhba0) {
        zzhba0.getClass();
        zzgyd zzgyd0 = zzhbc0.zzc;
        if(!zzgyd0.zzc()) {
            zzhbc0.zzc = zzgxr.zzbL(zzgyd0);
        }
        zzhbc0.zzc.add(zzhba0);
    }
}

