package com.google.android.gms.internal.ads;

@Deprecated
public final class zzgss extends zzgxr implements zzgzd {
    private static final zzgss zza;
    private static volatile zzgzk zzb;
    private String zzc;
    private String zzd;
    private int zze;
    private boolean zzf;
    private String zzg;

    static {
        zzgss zzgss0 = new zzgss();
        zzgss.zza = zzgss0;
        zzgxr.zzbZ(zzgss.class, zzgss0);
    }

    private zzgss() {
        this.zzc = "";
        this.zzd = "";
        this.zzg = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        int v = zzgxq0.ordinal();
        switch(v) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgss.zza, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000B\u0004\u0007\u0005Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgss();
            }
            case 4: {
                return new zzgsq(null);
            }
            case 5: {
                return zzgss.zza;
            }
            default: {
                if(v != 6) {
                    throw null;
                }
                zzgzk zzgzk0 = zzgss.zzb;
                if(zzgzk0 == null) {
                    synchronized(zzgss.class) {
                        zzgzk0 = zzgss.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgss.zza);
                            zzgss.zzb = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
        }
    }
}

