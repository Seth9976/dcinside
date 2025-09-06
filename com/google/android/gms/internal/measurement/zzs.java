package com.google.android.gms.internal.measurement;

public enum zzs {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    private zzs(int v1) {
    }

    public static zzs zza(int v) {
        switch(v) {
            case 2: {
                return zzs.zzd;
            }
            case 3: {
                return zzs.zza;
            }
            case 5: {
                return zzs.zze;
            }
            case 6: {
                return zzs.zzb;
            }
            default: {
                return zzs.zzc;
            }
        }
    }
}

