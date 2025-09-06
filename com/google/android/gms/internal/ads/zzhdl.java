package com.google.android.gms.internal.ads;

public final class zzhdl extends zzgxr implements zzgzd {
    private static final zzhdl zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private String zze;

    static {
        zzhdl zzhdl0 = new zzhdl();
        zzhdl.zza = zzhdl0;
        zzgxr.zzbZ(zzhdl.class, zzhdl0);
    }

    private zzhdl() {
        this.zze = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhdl.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", zzhdk.zza, "zze"});
            }
            case 3: {
                return new zzhdl();
            }
            case 4: {
                return new zzhdj(null);
            }
            case 5: {
                return zzhdl.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhdl.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhdl.class;
                    synchronized(class0) {
                        zzgzk0 = zzhdl.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhdl.zza);
                            zzhdl.zzb = zzgzk0;
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

