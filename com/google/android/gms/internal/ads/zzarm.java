package com.google.android.gms.internal.ads;

public final class zzarm extends zzgxr implements zzgzd {
    private static final zzarm zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private String zzk;
    private long zzl;
    private String zzm;
    private String zzn;
    private zzgyd zzo;
    private int zzp;

    static {
        zzarm zzarm0 = new zzarm();
        zzarm.zza = zzarm0;
        zzgxr.zzbZ(zzarm.class, zzarm0);
    }

    private zzarm() {
        this.zzd = "";
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzk = "";
        this.zzm = "";
        this.zzn = "";
        this.zzo = zzgxr.zzbK();
    }

    public static zzari zza() {
        return (zzari)zzarm.zza.zzaZ();
    }

    static void zzc(zzarm zzarm0, String s) {
        s.getClass();
        zzarm0.zzc |= 1;
        zzarm0.zzd = s;
    }

    static void zzd(zzarm zzarm0, String s) {
        zzarm0.zzc |= 16;
        zzarm0.zzh = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzarm.zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000Bဈ\n\f\u001B\r᠌\u000B", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzark.class, "zzp", zzarl.zza});
            }
            case 3: {
                return new zzarm();
            }
            case 4: {
                return new zzari(null);
            }
            case 5: {
                return zzarm.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzarm.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzarm.class;
                    synchronized(class0) {
                        zzgzk0 = zzarm.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzarm.zza);
                            zzarm.zzb = zzgzk0;
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

    static void zzf(zzarm zzarm0, String s) {
        zzarm0.zzc |= 0x400;
        zzarm0.zzn = s;
    }

    static void zzg(zzarm zzarm0, String s) {
        s.getClass();
        zzarm0.zzc |= 8;
        zzarm0.zzg = s;
    }

    static void zzh(zzarm zzarm0, long v) {
        zzarm0.zzc |= 2;
        zzarm0.zze = v;
    }

    static void zzi(zzarm zzarm0, String s) {
        s.getClass();
        zzarm0.zzc |= 4;
        zzarm0.zzf = s;
    }

    static void zzj(zzarm zzarm0, int v) {
        zzarm0.zzp = v - 1;
        zzarm0.zzc |= 0x800;
    }
}

