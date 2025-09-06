package com.google.android.gms.internal.measurement;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class zzkd extends Enum {
    public static final enum zzkd zza;
    public static final enum zzkd zzb;
    public static final enum zzkd zzc;
    public static final enum zzkd zzd;
    public static final enum zzkd zze;
    public static final enum zzkd zzf;
    public static final enum zzkd zzg;
    public static final enum zzkd zzh;
    public static final enum zzkd zzi;
    public static final enum zzkd zzj;
    private static final zzkd[] zzk;
    private final Class zzl;

    static {
        zzkd.zza = new zzkd("VOID", 0, Void.class, Void.class, null);
        Class class0 = Integer.TYPE;
        zzkd.zzb = new zzkd("INT", 1, class0, Integer.class, 0);
        zzkd.zzc = new zzkd("LONG", 2, Long.TYPE, Long.class, 0L);
        zzkd.zzd = new zzkd("FLOAT", 3, Float.TYPE, Float.class, 0.0f);
        zzkd.zze = new zzkd("DOUBLE", 4, Double.TYPE, Double.class, 0.0);
        zzkd.zzf = new zzkd("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzkd.zzg = new zzkd("STRING", 6, String.class, String.class, "");
        zzkd.zzh = new zzkd("BYTE_STRING", 7, zzik.class, zzik.class, zzik.zza);
        zzkd.zzi = new zzkd("ENUM", 8, class0, Integer.class, null);
        zzkd.zzj = new zzkd("MESSAGE", 9, Object.class, Object.class, null);
        zzkd.zzk = new zzkd[]{zzkd.zza, zzkd.zzb, zzkd.zzc, zzkd.zzd, zzkd.zze, zzkd.zzf, zzkd.zzg, zzkd.zzh, zzkd.zzi, zzkd.zzj};
    }

    private zzkd(String s, int v, Class class0, Class class1, Object object0) {
        super(s, v);
        this.zzl = class1;
    }

    public static zzkd[] values() {
        return (zzkd[])zzkd.zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}

