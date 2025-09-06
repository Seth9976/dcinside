package com.google.android.gms.internal.ads;

public final class zzhdw extends zzgxr implements zzgzd {
    private static final zzhdw zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private int zzf;
    private zzgyd zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private double zzk;
    private zzgyd zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;

    static {
        zzhdw zzhdw0 = new zzhdw();
        zzhdw.zza = zzhdw0;
        zzgxr.zzbZ(zzhdw.class, zzhdw0);
    }

    private zzhdw() {
        this.zzd = "";
        this.zze = "";
        this.zzf = 4;
        this.zzg = zzgxr.zzbK();
        this.zzh = "";
        this.zzi = "";
        this.zzl = zzgxr.zzbK();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhdw.zza, "\u0001\u000E\u0000\u0001\u0001\u000E\u000E\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001A\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001B\tဈ\u0001\n᠌\u0007\u000Bဇ\b\fဇ\t\rဇ\n\u000Eဇ\u000B", new Object[]{"zzc", "zzd", "zzf", zzhdv.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzhdu.class, "zze", "zzm", zzhds.zza, "zzn", "zzo", "zzp", "zzu"});
            }
            case 3: {
                return new zzhdw();
            }
            case 4: {
                return new zzhdr(null);
            }
            case 5: {
                return zzhdw.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhdw.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhdw.class;
                    synchronized(class0) {
                        zzgzk0 = zzhdw.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhdw.zza);
                            zzhdw.zzb = zzgzk0;
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

