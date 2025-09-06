package com.google.android.gms.internal.ads;

public final class zzhbp extends zzgxr implements zzgzd {
    private static final zzhbp zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;

    static {
        zzhbp zzhbp0 = new zzhbp();
        zzhbp.zza = zzhbp0;
        zzgxr.zzbZ(zzhbp.class, zzhbp0);
    }

    private zzhbp() {
        this.zzd = "";
    }

    public static zzhbo zzc() {
        return (zzhbo)zzhbp.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhbp.zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
            }
            case 3: {
                return new zzhbp();
            }
            case 4: {
                return new zzhbo(null);
            }
            case 5: {
                return zzhbp.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhbp.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhbp.class;
                    synchronized(class0) {
                        zzgzk0 = zzhbp.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhbp.zza);
                            zzhbp.zzb = zzgzk0;
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

    static void zzf(zzhbp zzhbp0, String s) {
        zzhbp0.zzc |= 1;
        zzhbp0.zzd = s;
    }
}

