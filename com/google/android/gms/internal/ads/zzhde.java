package com.google.android.gms.internal.ads;

public final class zzhde extends zzgxr implements zzgzd {
    private static final zzhde zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;
    private long zze;
    private boolean zzf;
    private int zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzhde zzhde0 = new zzhde();
        zzhde.zza = zzhde0;
        zzgxr.zzbZ(zzhde.class, zzhde0);
    }

    private zzhde() {
        this.zzd = "";
        this.zzh = "";
        this.zzi = "";
    }

    public static zzhdd zzc() {
        return (zzhdd)zzhde.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhde.zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzhdf.zza, "zzh", "zzi", "zzj", "zzk"});
            }
            case 3: {
                return new zzhde();
            }
            case 4: {
                return new zzhdd(null);
            }
            case 5: {
                return zzhde.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhde.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhde.class;
                    synchronized(class0) {
                        zzgzk0 = zzhde.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhde.zza);
                            zzhde.zzb = zzgzk0;
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

    static void zzf(zzhde zzhde0, String s) {
        zzhde0.zzc |= 1;
        zzhde0.zzd = s;
    }

    static void zzg(zzhde zzhde0, long v) {
        zzhde0.zzc |= 2;
        zzhde0.zze = v;
    }

    static void zzh(zzhde zzhde0, boolean z) {
        zzhde0.zzc |= 4;
        zzhde0.zzf = z;
    }
}

