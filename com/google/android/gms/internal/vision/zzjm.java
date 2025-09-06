package com.google.android.gms.internal.vision;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class zzjm extends Enum {
    public static final enum zzjm zza;
    public static final enum zzjm zzb;
    public static final enum zzjm zzc;
    public static final enum zzjm zzd;
    public static final enum zzjm zze;
    public static final enum zzjm zzf;
    public static final enum zzjm zzg;
    public static final enum zzjm zzh;
    public static final enum zzjm zzi;
    public static final enum zzjm zzj;
    private final Class zzk;
    private final Class zzl;
    private final Object zzm;
    private static final zzjm[] zzn;

    static {
        zzjm.zza = new zzjm("VOID", 0, Void.class, Void.class, null);
        Class class0 = Integer.TYPE;
        zzjm.zzb = new zzjm("INT", 1, class0, Integer.class, 0);
        zzjm.zzc = new zzjm("LONG", 2, Long.TYPE, Long.class, 0L);
        zzjm.zzd = new zzjm("FLOAT", 3, Float.TYPE, Float.class, 0.0f);
        zzjm.zze = new zzjm("DOUBLE", 4, Double.TYPE, Double.class, 0.0);
        zzjm.zzf = new zzjm("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzjm.zzg = new zzjm("STRING", 6, String.class, String.class, "");
        zzjm.zzh = new zzjm("BYTE_STRING", 7, zzht.class, zzht.class, zzht.zza);
        zzjm.zzi = new zzjm("ENUM", 8, class0, Integer.class, null);
        zzjm.zzj = new zzjm("MESSAGE", 9, Object.class, Object.class, null);
        zzjm.zzn = new zzjm[]{zzjm.zza, zzjm.zzb, zzjm.zzc, zzjm.zzd, zzjm.zze, zzjm.zzf, zzjm.zzg, zzjm.zzh, zzjm.zzi, zzjm.zzj};
    }

    private zzjm(String s, int v, Class class0, Class class1, Object object0) {
        super(s, v);
        this.zzk = class0;
        this.zzl = class1;
        this.zzm = object0;
    }

    public static zzjm[] values() {
        return (zzjm[])zzjm.zzn.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}

