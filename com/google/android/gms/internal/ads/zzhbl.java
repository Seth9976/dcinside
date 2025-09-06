package com.google.android.gms.internal.ads;

public final class zzhbl extends zzgxr implements zzgzd {
    private static final zzhbl zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf;
    private zzgyd zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private zzgyd zzu;
    private boolean zzv;
    private long zzw;
    private zzgxz zzx;
    private boolean zzy;
    private zzgxz zzz;

    static {
        zzhbl zzhbl0 = new zzhbl();
        zzhbl.zza = zzhbl0;
        zzgxr.zzbZ(zzhbl.class, zzhbl0);
    }

    private zzhbl() {
        this.zzf = "";
        this.zzg = zzgxr.zzbK();
        this.zzl = "";
        this.zzu = zzgxr.zzbK();
        this.zzx = zzgxr.zzbG();
        this.zzz = zzgxr.zzbG();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhbl.zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001A\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000Bင\t\fင\n\rဇ\u000B\u000E\u001B\u000Fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000E\u0013ࠬ", new Object[]{"zzc", "zzd", zzhbk.zza, "zze", "zzf", "zzg", "zzh", zzhbi.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzhbh.class, "zzv", "zzw", "zzx", zzhay.zza(), "zzy", "zzz", zzhbj.zza});
            }
            case 3: {
                return new zzhbl();
            }
            case 4: {
                return new zzhbe(null);
            }
            case 5: {
                return zzhbl.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhbl.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhbl.class;
                    synchronized(class0) {
                        zzgzk0 = zzhbl.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhbl.zza);
                            zzhbl.zzb = zzgzk0;
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

