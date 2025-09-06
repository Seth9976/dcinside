package com.google.android.gms.internal.vision;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzma {
    static final class zza extends zzd {
        zza(Unsafe unsafe0) {
            super(unsafe0);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final byte zza(Object object0, long v) {
            return zzma.zza ? zzma.zzk(object0, v) : zzma.zzl(object0, v);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final void zza(Object object0, long v, byte b) {
            if(zzma.zza) {
                zzma.zzc(object0, v, b);
                return;
            }
            zzma.zzd(object0, v, b);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final void zza(Object object0, long v, double f) {
            this.zza(object0, v, Double.doubleToLongBits(f));
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final void zza(Object object0, long v, float f) {
            this.zza(object0, v, Float.floatToIntBits(f));
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final void zza(Object object0, long v, boolean z) {
            if(zzma.zza) {
                zzma.zzd(object0, v, z);
                return;
            }
            zzma.zze(object0, v, z);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final boolean zzb(Object object0, long v) {
            return zzma.zza ? zzma.zzm(object0, v) : zzma.zzn(object0, v);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final float zzc(Object object0, long v) {
            return Float.intBitsToFloat(this.zze(object0, v));
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final double zzd(Object object0, long v) {
            return Double.longBitsToDouble(this.zzf(object0, v));
        }
    }

    static final class zzb extends zzd {
        zzb(Unsafe unsafe0) {
            super(unsafe0);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final byte zza(Object object0, long v) {
            return this.zza.getByte(object0, v);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final void zza(Object object0, long v, byte b) {
            this.zza.putByte(object0, v, b);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final void zza(Object object0, long v, double f) {
            this.zza.putDouble(object0, v, f);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final void zza(Object object0, long v, float f) {
            this.zza.putFloat(object0, v, f);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final void zza(Object object0, long v, boolean z) {
            this.zza.putBoolean(object0, v, z);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final boolean zzb(Object object0, long v) {
            return this.zza.getBoolean(object0, v);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final float zzc(Object object0, long v) {
            return this.zza.getFloat(object0, v);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final double zzd(Object object0, long v) {
            return this.zza.getDouble(object0, v);
        }
    }

    static final class zzc extends zzd {
        zzc(Unsafe unsafe0) {
            super(unsafe0);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final byte zza(Object object0, long v) {
            return zzma.zza ? zzma.zzk(object0, v) : zzma.zzl(object0, v);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final void zza(Object object0, long v, byte b) {
            if(zzma.zza) {
                zzma.zzc(object0, v, b);
                return;
            }
            zzma.zzd(object0, v, b);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final void zza(Object object0, long v, double f) {
            this.zza(object0, v, Double.doubleToLongBits(f));
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final void zza(Object object0, long v, float f) {
            this.zza(object0, v, Float.floatToIntBits(f));
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final void zza(Object object0, long v, boolean z) {
            if(zzma.zza) {
                zzma.zzd(object0, v, z);
                return;
            }
            zzma.zze(object0, v, z);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final boolean zzb(Object object0, long v) {
            return zzma.zza ? zzma.zzm(object0, v) : zzma.zzn(object0, v);
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final float zzc(Object object0, long v) {
            return Float.intBitsToFloat(this.zze(object0, v));
        }

        @Override  // com.google.android.gms.internal.vision.zzma$zzd
        public final double zzd(Object object0, long v) {
            return Double.longBitsToDouble(this.zzf(object0, v));
        }
    }

    static abstract class zzd {
        Unsafe zza;

        zzd(Unsafe unsafe0) {
            this.zza = unsafe0;
        }

        public abstract byte zza(Object arg1, long arg2);

        public abstract void zza(Object arg1, long arg2, byte arg3);

        public abstract void zza(Object arg1, long arg2, double arg3);

        public abstract void zza(Object arg1, long arg2, float arg3);

        public final void zza(Object object0, long v, int v1) {
            this.zza.putInt(object0, v, v1);
        }

        public final void zza(Object object0, long v, long v1) {
            this.zza.putLong(object0, v, v1);
        }

        public abstract void zza(Object arg1, long arg2, boolean arg3);

        public abstract boolean zzb(Object arg1, long arg2);

        public abstract float zzc(Object arg1, long arg2);

        public abstract double zzd(Object arg1, long arg2);

        public final int zze(Object object0, long v) {
            return this.zza.getInt(object0, v);
        }

        public final long zzf(Object object0, long v) {
            return this.zza.getLong(object0, v);
        }
    }

    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzd zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final int zzw;

    static {
        Unsafe unsafe0 = zzma.zzc();
        zzma.zzb = unsafe0;
        zzma.zzc = zzhi.zzb();
        zzma.zzd = zzma.zzd(Long.TYPE);
        zzma.zze = zzma.zzd(Integer.TYPE);
        zzd zzma$zzd0 = null;
        if(unsafe0 != null) {
            zzma$zzd0 = new zzb(unsafe0);
        }
        zzma.zzf = zzma$zzd0;
        zzma.zzg = zzma.zze();
        zzma.zzh = zzma.zzd();
        long v = (long)zzma.zzb(byte[].class);
        zzma.zzi = v;
        zzma.zzj = (long)zzma.zzb(boolean[].class);
        zzma.zzk = (long)zzma.zzc(boolean[].class);
        zzma.zzl = (long)zzma.zzb(int[].class);
        zzma.zzm = (long)zzma.zzc(int[].class);
        zzma.zzn = (long)zzma.zzb(long[].class);
        zzma.zzo = (long)zzma.zzc(long[].class);
        zzma.zzp = (long)zzma.zzb(float[].class);
        zzma.zzq = (long)zzma.zzc(float[].class);
        zzma.zzr = (long)zzma.zzb(double[].class);
        zzma.zzs = (long)zzma.zzc(double[].class);
        zzma.zzt = (long)zzma.zzb(Object[].class);
        zzma.zzu = (long)zzma.zzc(Object[].class);
        Field field0 = zzma.zzf();
        zzma.zzv = field0 == null || zzma$zzd0 == null ? -1L : zzma$zzd0.zza.objectFieldOffset(field0);
        zzma.zzw = (int)(v & 7L);
        zzma.zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static byte zza(byte[] arr_b, long v) {
        return zzma.zzf.zza(arr_b, zzma.zzi + v);
    }

    static int zza(Object object0, long v) {
        return zzma.zzf.zze(object0, v);
    }

    static Object zza(Class class0) {
        try {
            return zzma.zzb.allocateInstance(class0);
        }
        catch(InstantiationException instantiationException0) {
            throw new IllegalStateException(instantiationException0);
        }
    }

    private static Field zza(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static void zza(Object object0, long v, double f) {
        zzma.zzf.zza(object0, v, f);
    }

    static void zza(Object object0, long v, float f) {
        zzma.zzf.zza(object0, v, f);
    }

    static void zza(Object object0, long v, int v1) {
        zzma.zzf.zza(object0, v, v1);
    }

    static void zza(Object object0, long v, long v1) {
        zzma.zzf.zza(object0, v, v1);
    }

    static void zza(Object object0, long v, Object object1) {
        zzma.zzf.zza.putObject(object0, v, object1);
    }

    static void zza(Object object0, long v, boolean z) {
        zzma.zzf.zza(object0, v, z);
    }

    static void zza(byte[] arr_b, long v, byte b) {
        zzma.zzf.zza(arr_b, zzma.zzi + v, b);
    }

    static boolean zza() [...] // 潜在的解密器

    private static int zzb(Class class0) {
        return zzma.zzf.zza.arrayBaseOffset(class0);
    }

    static long zzb(Object object0, long v) {
        return zzma.zzf.zzf(object0, v);
    }

    static boolean zzb() [...] // 潜在的解密器

    private static int zzc(Class class0) {
        return zzma.zzf.zza.arrayIndexScale(class0);
    }

    static Unsafe zzc() {
        try {
            return (Unsafe)AccessController.doPrivileged(new zzmc());
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static void zzc(Object object0, long v, byte b) {
        int v1 = (~((int)v) & 3) << 3;
        zzma.zza(object0, -4L & v, (0xFF & b) << v1 | zzma.zza(object0, -4L & v) & ~(0xFF << v1));
    }

    static boolean zzc(Object object0, long v) {
        return zzma.zzf.zzb(object0, v);
    }

    static float zzd(Object object0, long v) {
        return zzma.zzf.zzc(object0, v);
    }

    private static void zzd(Object object0, long v, byte b) {
        int v1 = (((int)v) & 3) << 3;
        zzma.zza(object0, -4L & v, (0xFF & b) << v1 | zzma.zza(object0, -4L & v) & ~(0xFF << v1));
    }

    private static void zzd(Object object0, long v, boolean z) {
        zzma.zzc(object0, v, ((byte)z));
    }

    private static boolean zzd() {
        Class class0 = Class.class;
        Class class1 = Object.class;
        Unsafe unsafe0 = zzma.zzb;
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
            Logger.getLogger("com.google.android.gms.internal.vision.zzma").logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", "platform method missing - proto runtime falling back to safer methods: " + throwable0);
            return false;
        }
    }

    // 去混淆评级： 低(30)
    private static boolean zzd(Class class0) {
        return false;
    }

    static double zze(Object object0, long v) {
        return zzma.zzf.zzd(object0, v);
    }

    private static void zze(Object object0, long v, boolean z) {
        zzma.zzd(object0, v, ((byte)z));
    }

    private static boolean zze() {
        Class class0 = Object.class;
        Unsafe unsafe0 = zzma.zzb;
        if(unsafe0 == null) {
            return false;
        }
        try {
            Class class1 = unsafe0.getClass();
            class1.getMethod("objectFieldOffset", Field.class);
            Class class2 = Long.TYPE;
            class1.getMethod("getLong", class0, class2);
            if(zzma.zzf() == null) {
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
            Logger.getLogger("com.google.android.gms.internal.vision.zzma").logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", "platform method missing - proto runtime falling back to safer methods: " + throwable0);
            return false;
        }
    }

    static Object zzf(Object object0, long v) {
        return zzma.zzf.zza.getObject(object0, v);
    }

    private static Field zzf() {
        Field field0 = zzma.zza(Buffer.class, "address");
        return field0 == null || field0.getType() != Long.TYPE ? null : field0;
    }

    private static byte zzk(Object object0, long v) {
        return (byte)(zzma.zza(object0, -4L & v) >>> ((int)((~v & 3L) << 3)));
    }

    private static byte zzl(Object object0, long v) {
        return (byte)(zzma.zza(object0, -4L & v) >>> ((int)((v & 3L) << 3)));
    }

    private static boolean zzm(Object object0, long v) {
        return zzma.zzk(object0, v) != 0;
    }

    private static boolean zzn(Object object0, long v) {
        return zzma.zzl(object0, v) != 0;
    }
}

