package com.google.android.gms.internal.ads;

public final class zzfig extends zzgxr implements zzgzd {
    private static final zzfig zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;
    private int zze;
    private String zzf;

    static {
        zzfig zzfig0 = new zzfig();
        zzfig.zza = zzfig0;
        zzgxr.zzbZ(zzfig.class, zzfig0);
    }

    private zzfig() {
        this.zzd = "";
        this.zzf = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzfig.zza, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzfig();
            }
            case 4: {
                return new zzfie(null);
            }
            case 5: {
                return zzfig.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzfig.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzfig.class;
                    synchronized(class0) {
                        zzgzk0 = zzfig.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzfig.zza);
                            zzfig.zzb = zzgzk0;
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

