package com.google.android.gms.internal.vision;

public enum zzgz implements zzje {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);

    private static final zzjh zzq;
    private final int zzr;

    static {
        zzgz.zzq = (int v) -> switch(v) {
            case 0: {
                return zzgz.zza;
            }
            case 1: {
                return zzgz.zzb;
            }
            case 2: {
                return zzgz.zzc;
            }
            case 3: {
                return zzgz.zzd;
            }
            case 4: {
                return zzgz.zze;
            }
            case 5: {
                return zzgz.zzf;
            }
            case 6: {
                return zzgz.zzg;
            }
            case 7: {
                return zzgz.zzh;
            }
            case 8: {
                return zzgz.zzi;
            }
            case 9: {
                return zzgz.zzj;
            }
            case 10: {
                return zzgz.zzk;
            }
            case 11: {
                return zzgz.zzl;
            }
            case 12: {
                return zzgz.zzm;
            }
            case 13: {
                return zzgz.zzn;
            }
            case 14: {
                return zzgz.zzo;
            }
            case 16: {
                return zzgz.zzp;
            }
            default: {
                return null;
            }
        };
    }

    private zzgz(int v1) {
        this.zzr = v1;
    }

    // 去混淆评级： 低(40)
    @Override
    public final String toString() {
        return "<com.google.android.gms.internal.vision.zzgz" + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzr + " name=" + this.name() + '>';
    }

    // 检测为 Lambda 实现
    public static zzgz zza(int v) [...]

    @Override  // com.google.android.gms.internal.vision.zzje
    public final int zza() {
        return this.zzr;
    }

    public static zzjg zzb() {
        return zzhb.zza;
    }
}

