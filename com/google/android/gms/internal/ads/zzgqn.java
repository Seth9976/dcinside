package com.google.android.gms.internal.ads;

public final class zzgqn extends zzgxr implements zzgzd {
    private static final zzgqn zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgqt zzd;
    private zzgse zze;

    static {
        zzgqn zzgqn0 = new zzgqn();
        zzgqn.zza = zzgqn0;
        zzgxr.zzbZ(zzgqn.class, zzgqn0);
    }

    public static zzgql zza() {
        return (zzgql)zzgqn.zza.zzaZ();
    }

    public static zzgqn zzc(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgqn)zzgxr.zzbr(zzgqn.zza, zzgwj0, zzgxb0);
    }

    public final zzgqt zzd() {
        return this.zzd == null ? zzgqt.zzd() : this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgqn.zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzgqn();
            }
            case 4: {
                return new zzgql(null);
            }
            case 5: {
                return zzgqn.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgqn.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgqn.class;
                    synchronized(class0) {
                        zzgzk0 = zzgqn.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgqn.zza);
                            zzgqn.zzb = zzgzk0;
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

    public final zzgse zzf() {
        return this.zze == null ? zzgse.zzf() : this.zze;
    }

    static void zzg(zzgqn zzgqn0, zzgqt zzgqt0) {
        zzgqt0.getClass();
        zzgqn0.zzd = zzgqt0;
        zzgqn0.zzc |= 1;
    }

    static void zzh(zzgqn zzgqn0, zzgse zzgse0) {
        zzgse0.getClass();
        zzgqn0.zze = zzgse0;
        zzgqn0.zzc |= 2;
    }
}

