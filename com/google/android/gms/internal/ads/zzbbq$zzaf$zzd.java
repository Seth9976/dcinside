package com.google.android.gms.internal.ads;

public enum zzbbq.zzaf.zzd implements zzgxv {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);

    public static final int zzg = 0;
    public static final int zzh = 1;
    public static final int zzi = 2;
    public static final int zzj = 3;
    public static final int zzk = 4;
    public static final int zzl = 5;
    private static final zzgxw zzm;
    private final int zzo;

    static {
        zzbbq.zzaf.zzd.zzm = new zzgxw() {
            public zzbbq.zzaf.zzd zza(int v) {
                return zzbbq.zzaf.zzd.zzb(v);
            }

            public zzgxv zzb(int v) {
                return this.zza(v);
            }
        };
    }

    private zzbbq.zzaf.zzd(int v1) {
        this.zzo = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgxv
    public final int zza() {
        return this.zzo;
    }

    public static zzbbq.zzaf.zzd zzb(int v) {
        switch(v) {
            case 0: {
                return zzbbq.zzaf.zzd.zza;
            }
            case 1: {
                return zzbbq.zzaf.zzd.zzb;
            }
            case 2: {
                return zzbbq.zzaf.zzd.zzc;
            }
            case 3: {
                return zzbbq.zzaf.zzd.zzd;
            }
            case 4: {
                return zzbbq.zzaf.zzd.zze;
            }
            case 5: {
                return zzbbq.zzaf.zzd.zzf;
            }
            default: {
                return null;
            }
        }
    }

    public static zzbbq.zzaf.zzd zzc(String s) {
        return (zzbbq.zzaf.zzd)Enum.valueOf(zzbbq.zzaf.zzd.class, s);
    }

    public static zzgxw zzd() {
        return zzbbq.zzaf.zzd.zzm;
    }

    public static zzgxx zze() {
        return zzbbq.zzaf.zzd.zza.zza;
    }

    private static zzbbq.zzaf.zzd[] zzf() [...] // Inlined contents
}

