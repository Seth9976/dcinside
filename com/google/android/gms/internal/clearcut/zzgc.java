package com.google.android.gms.internal.clearcut;

public final class zzgc extends zzd implements zzdq {
    public static final class zza extends zzc implements zzdq {
        private zza() {
            super(zzgc.zzsg);
        }

        zza(zzgd zzgd0) {
        }
    }

    private static volatile zzdz zzbg;
    private byte zzsf;
    private static final zzgc zzsg;

    static {
        zzgc zzgc0 = new zzgc();
        zzgc.zzsg = zzgc0;
        zzcg.zza(zzgc.class, zzgc0);
    }

    private zzgc() {
        this.zzsf = 2;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcg
    protected final Object zza(int v, Object object0, Object object1) {
        int v1 = 1;
        switch(zzgd.zzba[v - 1]) {
            case 1: {
                return new zzgc();
            }
            case 2: {
                return new zza(null);
            }
            case 3: {
                return zzcg.zza(zzgc.zzsg, "\u0003\u0000", null);
            }
            case 4: {
                return zzgc.zzsg;
            }
            case 5: {
                zzdz zzdz0 = zzgc.zzbg;
                if(zzdz0 == null) {
                    synchronized(zzgc.class) {
                        zzdz0 = zzgc.zzbg;
                        if(zzdz0 == null) {
                            zzdz0 = new zzb(zzgc.zzsg);
                            zzgc.zzbg = zzdz0;
                        }
                    }
                }
                return zzdz0;
            }
            case 6: {
                return this.zzsf;
            }
            case 7: {
                if(object0 == null) {
                    v1 = 0;
                }
                this.zzsf = (byte)v1;
                return null;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }

    public static zzgc zzer() {
        return zzgc.zzsg;
    }
}

