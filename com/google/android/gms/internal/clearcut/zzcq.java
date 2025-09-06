package com.google.android.gms.internal.clearcut;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class zzcq extends Enum {
    public static final enum zzcq zzkx;
    public static final enum zzcq zzky;
    public static final enum zzcq zzkz;
    public static final enum zzcq zzla;
    public static final enum zzcq zzlb;
    public static final enum zzcq zzlc;
    public static final enum zzcq zzld;
    public static final enum zzcq zzle;
    public static final enum zzcq zzlf;
    public static final enum zzcq zzlg;
    private final Class zzlh;
    private final Class zzli;
    private final Object zzlj;
    private static final zzcq[] zzlk;

    static {
        zzcq.zzkx = new zzcq("VOID", 0, Void.class, Void.class, null);
        Class class0 = Integer.TYPE;
        zzcq.zzky = new zzcq("INT", 1, class0, Integer.class, 0);
        zzcq.zzkz = new zzcq("LONG", 2, Long.TYPE, Long.class, 0L);
        zzcq.zzla = new zzcq("FLOAT", 3, Float.TYPE, Float.class, 0.0f);
        zzcq.zzlb = new zzcq("DOUBLE", 4, Double.TYPE, Double.class, 0.0);
        zzcq.zzlc = new zzcq("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzcq.zzld = new zzcq("STRING", 6, String.class, String.class, "");
        zzcq.zzle = new zzcq("BYTE_STRING", 7, zzbb.class, zzbb.class, zzbb.zzfi);
        zzcq.zzlf = new zzcq("ENUM", 8, class0, Integer.class, null);
        zzcq.zzlg = new zzcq("MESSAGE", 9, Object.class, Object.class, null);
        zzcq.zzlk = new zzcq[]{zzcq.zzkx, zzcq.zzky, zzcq.zzkz, zzcq.zzla, zzcq.zzlb, zzcq.zzlc, zzcq.zzld, zzcq.zzle, zzcq.zzlf, zzcq.zzlg};
    }

    private zzcq(String s, int v, Class class0, Class class1, Object object0) {
        super(s, v);
        this.zzlh = class0;
        this.zzli = class1;
        this.zzlj = object0;
    }

    public static zzcq[] values() {
        return (zzcq[])zzcq.zzlk.clone();
    }

    public final Class zzbq() {
        return this.zzli;
    }
}

