package com.google.android.gms.internal.vision;

public enum zzha implements zzje {
    UNKNOWN_FORMAT(0),
    CONTACT_INFO(1),
    EMAIL(2),
    ISBN(3),
    PHONE(4),
    PRODUCT(5),
    SMS(6),
    TEXT(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12),
    BOARDING_PASS(13);

    private static final zzjh zzo;
    private final int zzp;

    static {
        zzha.zzo = (int v) -> switch(v) {
            case 0: {
                return zzha.zza;
            }
            case 1: {
                return zzha.zzb;
            }
            case 2: {
                return zzha.zzc;
            }
            case 3: {
                return zzha.zzd;
            }
            case 4: {
                return zzha.zze;
            }
            case 5: {
                return zzha.zzf;
            }
            case 6: {
                return zzha.zzg;
            }
            case 7: {
                return zzha.zzh;
            }
            case 8: {
                return zzha.zzi;
            }
            case 9: {
                return zzha.zzj;
            }
            case 10: {
                return zzha.zzk;
            }
            case 11: {
                return zzha.zzl;
            }
            case 12: {
                return zzha.zzm;
            }
            case 13: {
                return zzha.zzn;
            }
            default: {
                return null;
            }
        };
    }

    private zzha(int v1) {
        this.zzp = v1;
    }

    // 去混淆评级： 低(40)
    @Override
    public final String toString() {
        return "<com.google.android.gms.internal.vision.zzha" + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzp + " name=" + this.name() + '>';
    }

    // 检测为 Lambda 实现
    public static zzha zza(int v) [...]

    @Override  // com.google.android.gms.internal.vision.zzje
    public final int zza() {
        return this.zzp;
    }

    public static zzjg zzb() {
        return zzhc.zza;
    }
}

