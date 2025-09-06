package com.google.android.gms.internal.measurement;

public enum zzga implements zzjy {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);

    private final int zzh;

    private zzga(int v1) {
        this.zzh = v1;
    }

    // 去混淆评级： 低(40)
    @Override
    public final String toString() {
        return "<com.google.android.gms.internal.measurement.zzga" + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + this.name() + '>';
    }

    public static zzga zza(int v) {
        switch(v) {
            case 0: {
                return zzga.zza;
            }
            case 1: {
                return zzga.zzb;
            }
            case 2: {
                return zzga.zzc;
            }
            case 3: {
                return zzga.zzd;
            }
            case 4: {
                return zzga.zze;
            }
            case 5: {
                return zzga.zzf;
            }
            default: {
                return null;
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzjy
    public final int zza() {
        return this.zzh;
    }

    public static zzjx zzb() {
        return zzfz.zza;
    }
}

