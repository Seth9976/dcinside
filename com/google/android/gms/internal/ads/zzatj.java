package com.google.android.gms.internal.ads;

public final class zzatj extends zzgxr implements zzgzd {
    private static final zzatj zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd;
    private String zze;
    private zzgwj zzf;

    static {
        zzatj zzatj0 = new zzatj();
        zzatj.zza = zzatj0;
        zzgxr.zzbZ(zzatj.class, zzatj0);
    }

    private zzatj() {
        this.zze = "";
        this.zzf = zzgwj.zzb;
    }

    public final long zza() {
        return this.zzd;
    }

    public static zzatj zzc() {
        return zzatj.zza;
    }

    public final zzgwj zzd() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzatj.zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzatj();
            }
            case 4: {
                return new zzati(null);
            }
            case 5: {
                return zzatj.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzatj.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzatj.class;
                    synchronized(class0) {
                        zzgzk0 = zzatj.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzatj.zza);
                            zzatj.zzb = zzgzk0;
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

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return (this.zzc & 1) != 0;
    }
}

