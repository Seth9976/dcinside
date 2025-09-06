package com.google.android.gms.internal.measurement;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public class zzms extends Enum {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class zzmu extends zzms {
        private zzmu(String s, int v, zzmz zzmz0, int v1) {
            super(s, 9, zzmz0, 3, null);
        }

        zzmu(String s, int v, zzmz zzmz0, int v1, zzmy zzmy0) {
            this(s, 9, zzmz0, 3);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class zzmv extends zzms {
        private zzmv(String s, int v, zzmz zzmz0, int v1) {
            super(s, 8, zzmz0, 2, null);
        }

        zzmv(String s, int v, zzmz zzmz0, int v1, zzmy zzmy0) {
            this(s, 8, zzmz0, 2);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class zzmw extends zzms {
        private zzmw(String s, int v, zzmz zzmz0, int v1) {
            super(s, 11, zzmz0, 2, null);
        }

        zzmw(String s, int v, zzmz zzmz0, int v1, zzmy zzmy0) {
            this(s, 11, zzmz0, 2);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class zzmx extends zzms {
        private zzmx(String s, int v, zzmz zzmz0, int v1) {
            super(s, 10, zzmz0, 2, null);
        }

        zzmx(String s, int v, zzmz zzmz0, int v1, zzmy zzmy0) {
            this(s, 10, zzmz0, 2);
        }
    }

    public static final enum zzms zza;
    public static final enum zzms zzb;
    public static final enum zzms zzc;
    public static final enum zzms zzd;
    public static final enum zzms zze;
    public static final enum zzms zzf;
    public static final enum zzms zzg;
    public static final enum zzms zzh;
    public static final enum zzms zzi;
    public static final enum zzms zzj;
    public static final enum zzms zzk;
    public static final enum zzms zzl;
    public static final enum zzms zzm;
    public static final enum zzms zzn;
    public static final enum zzms zzo;
    public static final enum zzms zzp;
    public static final enum zzms zzq;
    public static final enum zzms zzr;
    private static final zzms[] zzs;
    private final zzmz zzt;
    private final int zzu;

    static {
        zzms.zza = new zzms("DOUBLE", 0, zzmz.zzd, 1);
        zzms.zzb = new zzms("FLOAT", 1, zzmz.zzc, 5);
        zzms.zzc = new zzms("INT64", 2, zzmz.zzb, 0);
        zzms.zzd = new zzms("UINT64", 3, zzmz.zzb, 0);
        zzms.zze = new zzms("INT32", 4, zzmz.zza, 0);
        zzms.zzf = new zzms("FIXED64", 5, zzmz.zzb, 1);
        zzms.zzg = new zzms("FIXED32", 6, zzmz.zza, 5);
        zzms.zzh = new zzms("BOOL", 7, zzmz.zze, 0);
        zzmv zzmv0 = new zzmv("STRING", 8, zzmz.zzf, 2, null);
        zzms.zzi = zzmv0;
        zzmu zzmu0 = new zzmu("GROUP", 9, zzmz.zzi, 3, null);
        zzms.zzj = zzmu0;
        zzmx zzmx0 = new zzmx("MESSAGE", 10, zzmz.zzi, 2, null);
        zzms.zzk = zzmx0;
        zzmw zzmw0 = new zzmw("BYTES", 11, zzmz.zzg, 2, null);
        zzms.zzl = zzmw0;
        zzms.zzm = new zzms("UINT32", 12, zzmz.zza, 0);
        zzms.zzn = new zzms("ENUM", 13, zzmz.zzh, 0);
        zzms.zzo = new zzms("SFIXED32", 14, zzmz.zza, 5);
        zzms.zzp = new zzms("SFIXED64", 15, zzmz.zzb, 1);
        zzms.zzq = new zzms("SINT32", 16, zzmz.zza, 0);
        zzms.zzr = new zzms("SINT64", 17, zzmz.zzb, 0);
        zzms.zzs = new zzms[]{zzms.zza, zzms.zzb, zzms.zzc, zzms.zzd, zzms.zze, zzms.zzf, zzms.zzg, zzms.zzh, zzmv0, zzmu0, zzmx0, zzmw0, zzms.zzm, zzms.zzn, zzms.zzo, zzms.zzp, zzms.zzq, zzms.zzr};
    }

    private zzms(String s, int v, zzmz zzmz0, int v1) {
        super(s, v);
        this.zzt = zzmz0;
        this.zzu = v1;
    }

    zzms(String s, int v, zzmz zzmz0, int v1, zzmy zzmy0) {
        this(s, v, zzmz0, v1);
    }

    public static zzms[] values() {
        return (zzms[])zzms.zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzmz zzb() {
        return this.zzt;
    }
}

