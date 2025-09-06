package com.google.android.gms.internal.ads;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class zzgyi extends Enum {
    public static final enum zzgyi zza;
    public static final enum zzgyi zzb;
    public static final enum zzgyi zzc;
    public static final enum zzgyi zzd;
    public static final enum zzgyi zze;
    public static final enum zzgyi zzf;
    public static final enum zzgyi zzg;
    public static final enum zzgyi zzh;
    public static final enum zzgyi zzi;
    public static final enum zzgyi zzj;
    private static final zzgyi[] zzk;
    private final Class zzl;

    static {
        zzgyi.zza = new zzgyi("VOID", 0, Void.class, Void.class, null);
        Class class0 = Integer.TYPE;
        zzgyi.zzb = new zzgyi("INT", 1, class0, Integer.class, 0);
        zzgyi.zzc = new zzgyi("LONG", 2, Long.TYPE, Long.class, 0L);
        zzgyi.zzd = new zzgyi("FLOAT", 3, Float.TYPE, Float.class, 0.0f);
        zzgyi.zze = new zzgyi("DOUBLE", 4, Double.TYPE, Double.class, 0.0);
        zzgyi.zzf = new zzgyi("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzgyi.zzg = new zzgyi("STRING", 6, String.class, String.class, "");
        zzgyi.zzh = new zzgyi("BYTE_STRING", 7, zzgwj.class, zzgwj.class, zzgwj.zzb);
        zzgyi.zzi = new zzgyi("ENUM", 8, class0, Integer.class, null);
        zzgyi.zzj = new zzgyi("MESSAGE", 9, Object.class, Object.class, null);
        zzgyi.zzk = new zzgyi[]{zzgyi.zza, zzgyi.zzb, zzgyi.zzc, zzgyi.zzd, zzgyi.zze, zzgyi.zzf, zzgyi.zzg, zzgyi.zzh, zzgyi.zzi, zzgyi.zzj};
    }

    private zzgyi(String s, int v, Class class0, Class class1, Object object0) {
        super(s, v);
        this.zzl = class1;
    }

    public static zzgyi[] values() {
        return (zzgyi[])zzgyi.zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}

