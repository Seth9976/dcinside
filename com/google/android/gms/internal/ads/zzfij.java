package com.google.android.gms.internal.ads;

public final class zzfij extends zzgxr implements zzgzd {
    private static final zzfij zza;
    private static volatile zzgzk zzb;
    private zzgyd zzc;

    static {
        zzfij zzfij0 = new zzfij();
        zzfij.zza = zzfij0;
        zzgxr.zzbZ(zzfij.class, zzfij0);
    }

    private zzfij() {
        this.zzc = zzgxr.zzbK();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzfij.zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zzc", zzfig.class});
            }
            case 3: {
                return new zzfij();
            }
            case 4: {
                return new zzfih(null);
            }
            case 5: {
                return zzfij.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzfij.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzfij.class;
                    synchronized(class0) {
                        zzgzk0 = zzfij.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzfij.zza);
                            zzfij.zzb = zzgzk0;
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

