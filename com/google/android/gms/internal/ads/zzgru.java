package com.google.android.gms.internal.ads;

public final class zzgru extends zzgxr implements zzgzd {
    private static final zzgru zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgwj zzd;

    static {
        zzgru zzgru0 = new zzgru();
        zzgru.zza = zzgru0;
        zzgxr.zzbZ(zzgru.class, zzgru0);
    }

    private zzgru() {
        this.zzd = zzgwj.zzb;
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzgrs zzb() {
        return (zzgrs)zzgru.zza.zzaZ();
    }

    public static zzgru zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgru)zzgxr.zzbr(zzgru.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgru.zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002\n", new Object[]{"zzc", "zzd"});
            }
            case 3: {
                return new zzgru();
            }
            case 4: {
                return new zzgrs(null);
            }
            case 5: {
                return zzgru.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgru.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgru.class;
                    synchronized(class0) {
                        zzgzk0 = zzgru.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgru.zza);
                            zzgru.zzb = zzgzk0;
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

    public final zzgwj zzf() {
        return this.zzd;
    }

    public static zzgzk zzg() {
        return zzgru.zza.zzbN();
    }
}

