package com.google.android.gms.internal.ads;

public enum zzbbq.zzaw.zzb implements zzgxv {
    VIDEO_ERROR_CODE_UNSPECIFIED(0),
    OPENGL_RENDERING_FAILED(1),
    CACHE_LOAD_FAILED(2),
    ANDROID_TARGET_API_TOO_LOW(3);

    public static final int zze = 0;
    public static final int zzf = 1;
    public static final int zzg = 2;
    public static final int zzh = 3;
    private static final zzgxw zzi;
    private final int zzk;

    static {
        zzbbq.zzaw.zzb.zzi = new zzgxw() {
            public zzbbq.zzaw.zzb zza(int v) {
                return zzbbq.zzaw.zzb.zzb(v);
            }

            public zzgxv zzb(int v) {
                return this.zza(v);
            }
        };
    }

    private zzbbq.zzaw.zzb(int v1) {
        this.zzk = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgxv
    public final int zza() {
        return this.zzk;
    }

    public static zzbbq.zzaw.zzb zzb(int v) {
        switch(v) {
            case 0: {
                return zzbbq.zzaw.zzb.zza;
            }
            case 1: {
                return zzbbq.zzaw.zzb.zzb;
            }
            case 2: {
                return zzbbq.zzaw.zzb.zzc;
            }
            case 3: {
                return zzbbq.zzaw.zzb.zzd;
            }
            default: {
                return null;
            }
        }
    }

    public static zzbbq.zzaw.zzb zzc(String s) {
        return (zzbbq.zzaw.zzb)Enum.valueOf(zzbbq.zzaw.zzb.class, s);
    }

    public static zzgxw zzd() {
        return zzbbq.zzaw.zzb.zzi;
    }

    public static zzgxx zze() {
        return zzbbq.zzaw.zzb.zza.zza;
    }

    private static zzbbq.zzaw.zzb[] zzf() [...] // Inlined contents
}

