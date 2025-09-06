package com.google.android.gms.internal.vision;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public class zzml extends Enum {
    public static final enum zzml zza;
    public static final enum zzml zzb;
    public static final enum zzml zzc;
    public static final enum zzml zzd;
    public static final enum zzml zze;
    public static final enum zzml zzf;
    public static final enum zzml zzg;
    public static final enum zzml zzh;
    public static final enum zzml zzi;
    public static final enum zzml zzj;
    public static final enum zzml zzk;
    public static final enum zzml zzl;
    public static final enum zzml zzm;
    public static final enum zzml zzn;
    public static final enum zzml zzo;
    public static final enum zzml zzp;
    public static final enum zzml zzq;
    public static final enum zzml zzr;
    private final zzmo zzs;
    private final int zzt;
    private static final zzml[] zzu;

    static {
        zzml.zza = new zzml("DOUBLE", 0, zzmo.zzd, 1);
        zzml.zzb = new zzml("FLOAT", 1, zzmo.zzc, 5);
        zzml.zzc = new zzml("INT64", 2, zzmo.zzb, 0);
        zzml.zzd = new zzml("UINT64", 3, zzmo.zzb, 0);
        zzml.zze = new zzml("INT32", 4, zzmo.zza, 0);
        zzml.zzf = new zzml("FIXED64", 5, zzmo.zzb, 1);
        zzml.zzg = new zzml("FIXED32", 6, zzmo.zza, 5);
        zzml.zzh = new zzml("BOOL", 7, zzmo.zze, 0);
        com.google.android.gms.internal.vision.zzml.zzmk zzmk0 = new zzml("STRING", zzmo.zzf) {
        };
        zzml.zzi = zzmk0;
        com.google.android.gms.internal.vision.zzml.zzmn zzmn0 = new zzml("GROUP", zzmo.zzi) {
        };
        zzml.zzj = zzmn0;
        com.google.android.gms.internal.vision.zzml.zzmm zzmm0 = new zzml("MESSAGE", zzmo.zzi) {
        };
        zzml.zzk = zzmm0;
        com.google.android.gms.internal.vision.zzml.zzmp zzmp0 = new zzml("BYTES", zzmo.zzg) {
        };
        zzml.zzl = zzmp0;
        zzml.zzm = new zzml("UINT32", 12, zzmo.zza, 0);
        zzml.zzn = new zzml("ENUM", 13, zzmo.zzh, 0);
        zzml.zzo = new zzml("SFIXED32", 14, zzmo.zza, 5);
        zzml.zzp = new zzml("SFIXED64", 15, zzmo.zzb, 1);
        zzml.zzq = new zzml("SINT32", 16, zzmo.zza, 0);
        zzml.zzr = new zzml("SINT64", 17, zzmo.zzb, 0);
        zzml.zzu = new zzml[]{zzml.zza, zzml.zzb, zzml.zzc, zzml.zzd, zzml.zze, zzml.zzf, zzml.zzg, zzml.zzh, zzmk0, zzmn0, zzmm0, zzmp0, zzml.zzm, zzml.zzn, zzml.zzo, zzml.zzp, zzml.zzq, zzml.zzr};
    }

    private zzml(String s, int v, zzmo zzmo0, int v1) {
        super(s, v);
        this.zzs = zzmo0;
        this.zzt = v1;
    }

    zzml(String s, int v, zzmo zzmo0, int v1, zzmi zzmi0) {
        this(s, v, zzmo0, v1);
    }

    public static zzml[] values() {
        return (zzml[])zzml.zzu.clone();
    }

    public final zzmo zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}

