package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzhao {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhan zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    static {
        boolean z4;
        boolean z3;
        boolean z = false;
        Class class0 = Class.class;
        Unsafe unsafe0 = zzhao.zzi();
        zzhao.zzc = unsafe0;
        zzhao.zzd = Memory.class;
        Class class1 = Long.TYPE;
        boolean z1 = zzhao.zzy(class1);
        zzhao.zze = z1;
        boolean z2 = zzhao.zzy(Integer.TYPE);
        zzhan zzhan0 = null;
        if(unsafe0 != null) {
            if(z1) {
                zzhan0 = new zzham(unsafe0);
            }
            else if(z2) {
                zzhan0 = new zzhal(unsafe0);
            }
        }
        zzhao.zzf = zzhan0;
        Class class2 = Field.class;
        Class class3 = Object.class;
        if(zzhan0 == null) {
        label_31:
            z3 = false;
        }
        else {
            try {
                Class class4 = zzhan0.zza.getClass();
                class4.getMethod("objectFieldOffset", class2);
                class4.getMethod("getLong", class3, class1);
                if(zzhao.zzE() == null) {
                    goto label_31;
                }
                else {
                    goto label_29;
                }
            }
            catch(Throwable throwable0) {
                zzhao.zzj(throwable0);
                z3 = false;
            }
            goto label_34;
        label_29:
            z3 = true;
        }
    label_34:
        zzhao.zzg = z3;
        zzhan zzhan1 = zzhao.zzf;
        if(zzhan1 == null) {
            z4 = false;
        }
        else {
            try {
                Class class5 = zzhan1.zza.getClass();
                class5.getMethod("objectFieldOffset", class2);
                class5.getMethod("arrayBaseOffset", class0);
                class5.getMethod("arrayIndexScale", class0);
                Class class6 = Long.TYPE;
                class5.getMethod("getInt", class3, class6);
                class5.getMethod("putInt", class3, class6, Integer.TYPE);
                class5.getMethod("getLong", class3, class6);
                class5.getMethod("putLong", class3, class6, class6);
                class5.getMethod("getObject", class3, class6);
                class5.getMethod("putObject", class3, class6, class3);
                z4 = true;
            }
            catch(Throwable throwable1) {
                zzhao.zzj(throwable1);
                z4 = false;
            }
        }
        zzhao.zzh = z4;
        zzhao.zza = (long)zzhao.zzC(byte[].class);
        zzhao.zzC(boolean[].class);
        zzhao.zzD(boolean[].class);
        zzhao.zzC(int[].class);
        zzhao.zzD(int[].class);
        zzhao.zzC(long[].class);
        zzhao.zzD(long[].class);
        zzhao.zzC(float[].class);
        zzhao.zzD(float[].class);
        zzhao.zzC(double[].class);
        zzhao.zzD(double[].class);
        zzhao.zzC(Object[].class);
        zzhao.zzD(Object[].class);
        Field field0 = zzhao.zzE();
        long v = -1L;
        if(field0 != null) {
            zzhan zzhan2 = zzhao.zzf;
            if(zzhan2 != null) {
                v = zzhan2.zza.objectFieldOffset(field0);
            }
        }
        zzhao.zzi = v;
        if(ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        }
        zzhao.zzb = z;
    }

    static boolean zzA() [...] // 潜在的解密器

    static boolean zzB() {
        return zzhao.zzg;
    }

    // 去混淆评级： 低(20)
    private static int zzC(Class class0) {
        return zzhao.zzh ? zzhao.zzf.zza.arrayBaseOffset(class0) : -1;
    }

    // 去混淆评级： 低(20)
    private static int zzD(Class class0) {
        return zzhao.zzh ? zzhao.zzf.zza.arrayIndexScale(class0) : -1;
    }

    private static Field zzE() {
        Class class0 = Buffer.class;
        Field field0 = zzhao.zzF(class0, "effectiveDirectAddress");
        if(field0 == null) {
            Field field1 = zzhao.zzF(class0, "address");
            return field1 == null || field1.getType() != Long.TYPE ? null : field1;
        }
        return field0;
    }

    private static Field zzF(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static void zzG(Object object0, long v, byte b) {
        int v1 = zzhao.zzf.zza.getInt(object0, -4L & v);
        int v2 = (~((int)v) & 3) << 3;
        zzhao.zzf.zza.putInt(object0, -4L & v, (0xFF & b) << v2 | v1 & ~(0xFF << v2));
    }

    private static void zzH(Object object0, long v, byte b) {
        int v1 = zzhao.zzf.zza.getInt(object0, -4L & v);
        int v2 = (((int)v) & 3) << 3;
        zzhao.zzf.zza.putInt(object0, -4L & v, (0xFF & b) << v2 | v1 & ~(0xFF << v2));
    }

    static byte zza(long v) {
        return zzhao.zzf.zza(v);
    }

    static double zzb(Object object0, long v) {
        return zzhao.zzf.zzb(object0, v);
    }

    static float zzc(Object object0, long v) {
        return zzhao.zzf.zzc(object0, v);
    }

    static int zzd(Object object0, long v) {
        return zzhao.zzf.zza.getInt(object0, v);
    }

    static long zze(ByteBuffer byteBuffer0) {
        return zzhao.zzf.zza.getLong(byteBuffer0, zzhao.zzi);
    }

    static long zzf(Object object0, long v) {
        return zzhao.zzf.zza.getLong(object0, v);
    }

    static Object zzg(Class class0) {
        try {
            return zzhao.zzc.allocateInstance(class0);
        }
        catch(InstantiationException instantiationException0) {
            throw new IllegalStateException(instantiationException0);
        }
    }

    static Object zzh(Object object0, long v) {
        return zzhao.zzf.zza.getObject(object0, v);
    }

    static Unsafe zzi() {
        try {
            return (Unsafe)AccessController.doPrivileged(new zzhak());
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static void zzj(Throwable throwable0) {
        Logger.getLogger("com.google.android.gms.internal.ads.zzhao").logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + throwable0.toString());
    }

    static void zzk(Object object0, long v, boolean z) {
        zzhao.zzG(object0, v, ((byte)z));
    }

    static void zzl(Object object0, long v, boolean z) {
        zzhao.zzH(object0, v, ((byte)z));
    }

    static void zzo(long v, byte[] arr_b, long v1, long v2) {
        zzhao.zzf.zzd(v, arr_b, v1, v2);
    }

    static void zzp(Object object0, long v, boolean z) {
        zzhao.zzf.zze(object0, v, z);
    }

    static void zzq(byte[] arr_b, long v, byte b) {
        zzhao.zzf.zzf(arr_b, zzhao.zza + v, b);
    }

    static void zzr(Object object0, long v, double f) {
        zzhao.zzf.zzg(object0, v, f);
    }

    static void zzs(Object object0, long v, float f) {
        zzhao.zzf.zzh(object0, v, f);
    }

    static void zzt(Object object0, long v, int v1) {
        zzhao.zzf.zza.putInt(object0, v, v1);
    }

    static void zzu(Object object0, long v, long v1) {
        zzhao.zzf.zza.putLong(object0, v, v1);
    }

    static void zzv(Object object0, long v, Object object1) {
        zzhao.zzf.zza.putObject(object0, v, object1);
    }

    static boolean zzw(Object object0, long v) {
        return ((byte)(zzhao.zzf.zza.getInt(object0, -4L & v) >>> ((int)((~v & 3L) << 3)) & 0xFF)) != 0;
    }

    static boolean zzx(Object object0, long v) {
        return ((byte)(zzhao.zzf.zza.getInt(object0, -4L & v) >>> ((int)((v & 3L) << 3)) & 0xFF)) != 0;
    }

    static boolean zzy(Class class0) {
        try {
            Class class1 = Boolean.TYPE;
            zzhao.zzd.getMethod("peekLong", class0, class1);
            zzhao.zzd.getMethod("pokeLong", class0, Long.TYPE, class1);
            Class class2 = Integer.TYPE;
            zzhao.zzd.getMethod("pokeInt", class0, class2, class1);
            zzhao.zzd.getMethod("peekInt", class0, class1);
            zzhao.zzd.getMethod("pokeByte", class0, Byte.TYPE);
            zzhao.zzd.getMethod("peekByte", class0);
            zzhao.zzd.getMethod("pokeByteArray", class0, byte[].class, class2, class2);
            zzhao.zzd.getMethod("peekByteArray", class0, byte[].class, class2, class2);
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    static boolean zzz(Object object0, long v) {
        return zzhao.zzf.zzi(object0, v);
    }
}

