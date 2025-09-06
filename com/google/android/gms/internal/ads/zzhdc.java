package com.google.android.gms.internal.ads;

public final class zzhdc extends zzgxr implements zzgzd {
    private static final zzhdc zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private String zze;
    private zzhcd zzf;
    private zzhch zzg;
    private int zzh;
    private zzgxz zzi;
    private String zzj;
    private int zzk;
    private zzgyd zzl;
    private byte zzm;

    static {
        zzhdc zzhdc0 = new zzhdc();
        zzhdc.zza = zzhdc0;
        zzgxr.zzbZ(zzhdc.class, zzhdc0);
    }

    private zzhdc() {
        this.zzm = 2;
        this.zze = "";
        this.zzi = zzgxr.zzbG();
        this.zzj = "";
        this.zzl = zzgxr.zzbK();
    }

    public final int zzc() {
        return this.zzl.size();
    }

    public static zzhdb zzd() {
        return (zzhdb)zzhdc.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        byte b = 1;
        switch(zzgxq0.ordinal()) {
            case 0: {
                return this.zzm;
            }
            case 1: {
                if(object0 == null) {
                    b = 0;
                }
                this.zzm = b;
                return null;
            }
            case 2: {
                return zzgxr.zzbQ(zzhdc.zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001A", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzhcz.zza, "zzl"});
            }
            case 3: {
                return new zzhdc();
            }
            case 4: {
                return new zzhdb(null);
            }
            case 5: {
                return zzhdc.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhdc.zzb;
                if(zzgzk0 == null) {
                    synchronized(zzhdc.class) {
                        zzgzk0 = zzhdc.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhdc.zza);
                            zzhdc.zzb = zzgzk0;
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

    public final String zzg() [...] // 潜在的解密器

    static void zzh(zzhdc zzhdc0, String s) {
        s.getClass();
        zzgyd zzgyd0 = zzhdc0.zzl;
        if(!zzgyd0.zzc()) {
            zzhdc0.zzl = zzgxr.zzbL(zzgyd0);
        }
        zzhdc0.zzl.add(s);
    }

    static void zzi(zzhdc zzhdc0, int v) {
        zzhdc0.zzc |= 1;
        zzhdc0.zzd = v;
    }

    static void zzj(zzhdc zzhdc0, zzhcd zzhcd0) {
        zzhcd0.getClass();
        zzhdc0.zzf = zzhcd0;
        zzhdc0.zzc |= 4;
    }

    static void zzk(zzhdc zzhdc0, String s) {
        s.getClass();
        zzhdc0.zzc |= 2;
        zzhdc0.zze = s;
    }

    static void zzl(zzhdc zzhdc0, int v) {
        zzhdc0.zzk = v - 1;
        zzhdc0.zzc |= 0x40;
    }
}

