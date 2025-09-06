package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzfd {
    static final class zza extends zzd {
        zza(Unsafe unsafe0) {
            super(unsafe0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(long v, byte b) {
            Memory.pokeByte(((int)v), b);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(Object object0, long v, double f) {
            this.zza(object0, v, Double.doubleToLongBits(f));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(Object object0, long v, float f) {
            this.zza(object0, v, Float.floatToIntBits(f));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(Object object0, long v, boolean z) {
            zzfd.zzc(object0, v, z);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(byte[] arr_b, long v, long v1, long v2) {
            Memory.pokeByteArray(((int)v1), arr_b, ((int)v), ((int)v2));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zze(Object object0, long v, byte b) {
            zzfd.zzb(object0, v, b);
        }

        // 去混淆评级： 低(30)
        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final boolean zzl(Object object0, long v) {
            return zzfd.zzs(object0, v);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final float zzm(Object object0, long v) {
            return Float.intBitsToFloat(this.zzj(object0, v));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final double zzn(Object object0, long v) {
            return Double.longBitsToDouble(this.zzk(object0, v));
        }

        // 去混淆评级： 低(30)
        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final byte zzx(Object object0, long v) {
            return zzfd.zzq(object0, v);
        }
    }

    static final class zzb extends zzd {
        zzb(Unsafe unsafe0) {
            super(unsafe0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(long v, byte b) {
            Memory.pokeByte(v, b);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(Object object0, long v, double f) {
            this.zza(object0, v, Double.doubleToLongBits(f));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(Object object0, long v, float f) {
            this.zza(object0, v, Float.floatToIntBits(f));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(Object object0, long v, boolean z) {
            zzfd.zzc(object0, v, z);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(byte[] arr_b, long v, long v1, long v2) {
            Memory.pokeByteArray(v1, arr_b, ((int)v), ((int)v2));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zze(Object object0, long v, byte b) {
            zzfd.zzb(object0, v, b);
        }

        // 去混淆评级： 低(30)
        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final boolean zzl(Object object0, long v) {
            return zzfd.zzs(object0, v);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final float zzm(Object object0, long v) {
            return Float.intBitsToFloat(this.zzj(object0, v));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final double zzn(Object object0, long v) {
            return Double.longBitsToDouble(this.zzk(object0, v));
        }

        // 去混淆评级： 低(30)
        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final byte zzx(Object object0, long v) {
            return zzfd.zzq(object0, v);
        }
    }

    static final class zzc extends zzd {
        zzc(Unsafe unsafe0) {
            super(unsafe0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(long v, byte b) {
            this.zzqa.putByte(v, b);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(Object object0, long v, double f) {
            this.zzqa.putDouble(object0, v, f);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(Object object0, long v, float f) {
            this.zzqa.putFloat(object0, v, f);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(Object object0, long v, boolean z) {
            this.zzqa.putBoolean(object0, v, z);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zza(byte[] arr_b, long v, long v1, long v2) {
            this.zzqa.copyMemory(arr_b, v + 16L, null, v1, v2);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final void zze(Object object0, long v, byte b) {
            this.zzqa.putByte(object0, v, b);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final boolean zzl(Object object0, long v) {
            return this.zzqa.getBoolean(object0, v);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final float zzm(Object object0, long v) {
            return this.zzqa.getFloat(object0, v);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final double zzn(Object object0, long v) {
            return this.zzqa.getDouble(object0, v);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzfd$zzd
        public final byte zzx(Object object0, long v) {
            return this.zzqa.getByte(object0, v);
        }
    }

    static abstract class zzd {
        Unsafe zzqa;

        zzd(Unsafe unsafe0) {
            this.zzqa = unsafe0;
        }

        public final long zza(Field field0) {
            return this.zzqa.objectFieldOffset(field0);
        }

        public abstract void zza(long arg1, byte arg2);

        public abstract void zza(Object arg1, long arg2, double arg3);

        public abstract void zza(Object arg1, long arg2, float arg3);

        public final void zza(Object object0, long v, int v1) {
            this.zzqa.putInt(object0, v, v1);
        }

        public final void zza(Object object0, long v, long v1) {
            this.zzqa.putLong(object0, v, v1);
        }

        public abstract void zza(Object arg1, long arg2, boolean arg3);

        public abstract void zza(byte[] arg1, long arg2, long arg3, long arg4);

        public abstract void zze(Object arg1, long arg2, byte arg3);

        public final int zzj(Object object0, long v) {
            return this.zzqa.getInt(object0, v);
        }

        public final long zzk(Object object0, long v) {
            return this.zzqa.getLong(object0, v);
        }

        public abstract boolean zzl(Object arg1, long arg2);

        public abstract float zzm(Object arg1, long arg2);

        public abstract double zzn(Object arg1, long arg2);

        public abstract byte zzx(Object arg1, long arg2);
    }

    private static final Logger logger;
    private static final Class zzfb;
    private static final boolean zzfy;
    private static final Unsafe zzmh;
    private static final boolean zzpg;
    private static final boolean zzph;
    private static final zzd zzpi;
    private static final boolean zzpj;
    private static final long zzpk;
    private static final long zzpl;
    private static final long zzpm;
    private static final long zzpn;
    private static final long zzpo;
    private static final long zzpp;
    private static final long zzpq;
    private static final long zzpr;
    private static final long zzps;
    private static final long zzpt;
    private static final long zzpu;
    private static final long zzpv;
    private static final long zzpw;
    private static final long zzpx;
    private static final long zzpy;
    private static final boolean zzpz;

    static {
        zzfd.logger = Logger.getLogger("com.google.android.gms.internal.clearcut.zzfd");
        Unsafe unsafe0 = zzfd.zzef();
        zzfd.zzmh = unsafe0;
        zzfd.zzfb = zzaw.zzy();
        zzfd.zzpg = zzfd.zzi(Long.TYPE);
        zzfd.zzph = zzfd.zzi(Integer.TYPE);
        Field field0 = null;
        zzd zzfd$zzd0 = unsafe0 == null ? null : new zzc(unsafe0);
        zzfd.zzpi = zzfd$zzd0;
        zzfd.zzpj = zzfd.zzeh();
        zzfd.zzfy = zzfd.zzeg();
        zzfd.zzpk = (long)zzfd.zzg(byte[].class);
        zzfd.zzpl = (long)zzfd.zzg(boolean[].class);
        zzfd.zzpm = (long)zzfd.zzh(boolean[].class);
        zzfd.zzpn = (long)zzfd.zzg(int[].class);
        zzfd.zzpo = (long)zzfd.zzh(int[].class);
        zzfd.zzpp = (long)zzfd.zzg(long[].class);
        zzfd.zzpq = (long)zzfd.zzh(long[].class);
        zzfd.zzpr = (long)zzfd.zzg(float[].class);
        zzfd.zzps = (long)zzfd.zzh(float[].class);
        zzfd.zzpt = (long)zzfd.zzg(double[].class);
        zzfd.zzpu = (long)zzfd.zzh(double[].class);
        zzfd.zzpv = (long)zzfd.zzg(Object[].class);
        zzfd.zzpw = (long)zzfd.zzh(Object[].class);
        zzfd.zzpx = zzfd.zzb(zzfd.zzei());
        Field field1 = zzfd.zzb(String.class, "value");
        if(field1 != null && field1.getType() == char[].class) {
            field0 = field1;
        }
        zzfd.zzpy = zzfd.zzb(field0);
        zzfd.zzpz = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static byte zza(byte[] arr_b, long v) {
        return zzfd.zzpi.zzx(arr_b, zzfd.zzpk + v);
    }

    static long zza(Field field0) {
        return zzfd.zzpi.zza(field0);
    }

    static void zza(long v, byte b) {
        zzfd.zzpi.zza(v, b);
    }

    private static void zza(Object object0, long v, byte b) {
        int v1 = (~((int)v) & 3) << 3;
        zzfd.zza(object0, -4L & v, (0xFF & b) << v1 | zzfd.zzj(object0, -4L & v) & ~(0xFF << v1));
    }

    static void zza(Object object0, long v, double f) {
        zzfd.zzpi.zza(object0, v, f);
    }

    static void zza(Object object0, long v, float f) {
        zzfd.zzpi.zza(object0, v, f);
    }

    static void zza(Object object0, long v, int v1) {
        zzfd.zzpi.zza(object0, v, v1);
    }

    static void zza(Object object0, long v, long v1) {
        zzfd.zzpi.zza(object0, v, v1);
    }

    static void zza(Object object0, long v, Object object1) {
        zzfd.zzpi.zzqa.putObject(object0, v, object1);
    }

    static void zza(Object object0, long v, boolean z) {
        zzfd.zzpi.zza(object0, v, z);
    }

    static void zza(byte[] arr_b, long v, byte b) {
        zzfd.zzpi.zze(arr_b, zzfd.zzpk + v, b);
    }

    static void zza(byte[] arr_b, long v, long v1, long v2) {
        zzfd.zzpi.zza(arr_b, v, v1, v2);
    }

    static boolean zzah() [...] // 潜在的解密器

    private static long zzb(Field field0) {
        if(field0 != null) {
            return zzfd.zzpi == null ? -1L : zzfd.zzpi.zza(field0);
        }
        return -1L;
    }

    static long zzb(ByteBuffer byteBuffer0) {
        return zzfd.zzpi.zzk(byteBuffer0, zzfd.zzpx);
    }

    private static Field zzb(Class class0, String s) {
        try {
            Field field0 = class0.getDeclaredField(s);
            field0.setAccessible(true);
            return field0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static void zzb(Object object0, long v, byte b) {
        int v1 = (((int)v) & 3) << 3;
        zzfd.zza(object0, -4L & v, (0xFF & b) << v1 | zzfd.zzj(object0, -4L & v) & ~(0xFF << v1));
    }

    private static void zzb(Object object0, long v, boolean z) {
        zzfd.zza(object0, v, ((byte)z));
    }

    static void zzc(Object object0, long v, byte b) {
        zzfd.zza(object0, v, b);
    }

    private static void zzc(Object object0, long v, boolean z) {
        zzfd.zzb(object0, v, ((byte)z));
    }

    static void zzd(Object object0, long v, boolean z) {
        zzfd.zzb(object0, v, z);
    }

    static boolean zzed() [...] // 潜在的解密器

    static boolean zzee() [...] // 潜在的解密器

    static Unsafe zzef() {
        try {
            return (Unsafe)AccessController.doPrivileged(new zzfe());
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static boolean zzeg() {
        Class class0 = Class.class;
        Class class1 = Object.class;
        Unsafe unsafe0 = zzfd.zzmh;
        if(unsafe0 == null) {
            return false;
        }
        try {
            Class class2 = unsafe0.getClass();
            class2.getMethod("objectFieldOffset", Field.class);
            class2.getMethod("arrayBaseOffset", class0);
            class2.getMethod("arrayIndexScale", class0);
            Class class3 = Long.TYPE;
            class2.getMethod("getInt", class1, class3);
            class2.getMethod("putInt", class1, class3, Integer.TYPE);
            class2.getMethod("getLong", class1, class3);
            class2.getMethod("putLong", class1, class3, class3);
            class2.getMethod("getObject", class1, class3);
            class2.getMethod("putObject", class1, class3, class1);
            class2.getMethod("getByte", class1, class3);
            class2.getMethod("putByte", class1, class3, Byte.TYPE);
            class2.getMethod("getBoolean", class1, class3);
            class2.getMethod("putBoolean", class1, class3, Boolean.TYPE);
            class2.getMethod("getFloat", class1, class3);
            class2.getMethod("putFloat", class1, class3, Float.TYPE);
            class2.getMethod("getDouble", class1, class3);
            class2.getMethod("putDouble", class1, class3, Double.TYPE);
            return true;
        }
        catch(Throwable throwable0) {
            zzfd.logger.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", "platform method missing - proto runtime falling back to safer methods: " + throwable0);
            return false;
        }
    }

    private static boolean zzeh() {
        Class class0 = Object.class;
        Unsafe unsafe0 = zzfd.zzmh;
        if(unsafe0 == null) {
            return false;
        }
        try {
            Class class1 = unsafe0.getClass();
            class1.getMethod("objectFieldOffset", Field.class);
            Class class2 = Long.TYPE;
            class1.getMethod("getLong", class0, class2);
            if(zzfd.zzei() == null) {
                return false;
            }
            class1.getMethod("getByte", class2);
            class1.getMethod("putByte", class2, Byte.TYPE);
            class1.getMethod("getInt", class2);
            class1.getMethod("putInt", class2, Integer.TYPE);
            class1.getMethod("getLong", class2);
            class1.getMethod("putLong", class2, class2);
            class1.getMethod("copyMemory", class2, class2, class2);
            class1.getMethod("copyMemory", class0, class2, class0, class2, class2);
            return true;
        }
        catch(Throwable throwable0) {
            zzfd.logger.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", "platform method missing - proto runtime falling back to safer methods: " + throwable0);
            return false;
        }
    }

    private static Field zzei() {
        Field field0 = zzfd.zzb(Buffer.class, "address");
        return field0 == null || field0.getType() != Long.TYPE ? null : field0;
    }

    static long zzej() [...] // 潜在的解密器

    private static int zzg(Class class0) {
        return zzfd.zzpi.zzqa.arrayBaseOffset(class0);
    }

    private static int zzh(Class class0) {
        return zzfd.zzpi.zzqa.arrayIndexScale(class0);
    }

    // 去混淆评级： 低(30)
    private static boolean zzi(Class class0) {
        return false;
    }

    static int zzj(Object object0, long v) {
        return zzfd.zzpi.zzj(object0, v);
    }

    static long zzk(Object object0, long v) {
        return zzfd.zzpi.zzk(object0, v);
    }

    static boolean zzl(Object object0, long v) {
        return zzfd.zzpi.zzl(object0, v);
    }

    static float zzm(Object object0, long v) {
        return zzfd.zzpi.zzm(object0, v);
    }

    static double zzn(Object object0, long v) {
        return zzfd.zzpi.zzn(object0, v);
    }

    static Object zzo(Object object0, long v) {
        return zzfd.zzpi.zzqa.getObject(object0, v);
    }

    private static byte zzp(Object object0, long v) {
        return (byte)(zzfd.zzj(object0, -4L & v) >>> ((int)((~v & 3L) << 3)));
    }

    private static byte zzq(Object object0, long v) {
        return (byte)(zzfd.zzj(object0, -4L & v) >>> ((int)((v & 3L) << 3)));
    }

    private static boolean zzr(Object object0, long v) {
        return zzfd.zzp(object0, v) != 0;
    }

    private static boolean zzs(Object object0, long v) {
        return zzfd.zzq(object0, v) != 0;
    }

    static byte zzt(Object object0, long v) {
        return zzfd.zzp(object0, v);
    }

    static boolean zzv(Object object0, long v) {
        return zzfd.zzr(object0, v);
    }
}

