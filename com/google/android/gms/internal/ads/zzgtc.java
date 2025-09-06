package com.google.android.gms.internal.ads;

public final class zzgtc extends zzgxr implements zzgzd {
    private static final zzgtc zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgyd zzd;

    static {
        zzgtc zzgtc0 = new zzgtc();
        zzgtc.zza = zzgtc0;
        zzgxr.zzbZ(zzgtc.class, zzgtc0);
    }

    private zzgtc() {
        this.zzd = zzgxr.zzbK();
    }

    public static zzgsy zza() {
        return (zzgsy)zzgtc.zza.zzaZ();
    }

    static void zzc(zzgtc zzgtc0, zzgta zzgta0) {
        zzgta0.getClass();
        zzgyd zzgyd0 = zzgtc0.zzd;
        if(!zzgyd0.zzc()) {
            zzgtc0.zzd = zzgxr.zzbL(zzgyd0);
        }
        zzgtc0.zzd.add(zzgta0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgtc.zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000B\u0002\u001B", new Object[]{"zzc", "zzd", zzgta.class});
            }
            case 3: {
                return new zzgtc();
            }
            case 4: {
                return new zzgsy(null);
            }
            case 5: {
                return zzgtc.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgtc.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgtc.class;
                    synchronized(class0) {
                        zzgzk0 = zzgtc.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgtc.zza);
                            zzgtc.zzb = zzgzk0;
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

