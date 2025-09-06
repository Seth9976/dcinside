package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzml {
    static final class zza extends zzb {
        zza(Unsafe unsafe0) {
            super(unsafe0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final double zza(Object object0, long v) {
            return Double.longBitsToDouble(this.zze(object0, v));
        }

        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final void zza(Object object0, long v, byte b) {
            if(zzml.zza) {
                zzml.zzc(object0, v, b);
                return;
            }
            zzml.zzd(object0, v, b);
        }

        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final void zza(Object object0, long v, double f) {
            this.zza(object0, v, Double.doubleToLongBits(f));
        }

        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final void zza(Object object0, long v, float f) {
            this.zza(object0, v, Float.floatToIntBits(f));
        }

        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final void zza(Object object0, long v, boolean z) {
            if(zzml.zza) {
                zzml.zza(object0, v, z);
                return;
            }
            zzml.zzb(object0, v, z);
        }

        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final float zzb(Object object0, long v) {
            return Float.intBitsToFloat(this.zzd(object0, v));
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final boolean zzc(Object object0, long v) {
            return zzml.zza ? zzml.zzf(object0, v) : zzml.zzg(object0, v);
        }
    }

    static abstract class zzb {
        Unsafe zza;

        zzb(Unsafe unsafe0) {
            this.zza = unsafe0;
        }

        public abstract double zza(Object arg1, long arg2);

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

        public final boolean zza() {
            Class class0 = Class.class;
            Class class1 = Object.class;
            Unsafe unsafe0 = this.zza;
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
                return true;
            }
            catch(Throwable throwable0) {
                zzml.zza(throwable0);
                return false;
            }
        }

        public abstract float zzb(Object arg1, long arg2);

        public final boolean zzb() {
            Unsafe unsafe0 = this.zza;
            if(unsafe0 == null) {
                return false;
            }
            try {
                Class class0 = unsafe0.getClass();
                class0.getMethod("objectFieldOffset", Field.class);
                class0.getMethod("getLong", Object.class, Long.TYPE);
                return zzml.zze() == null ? false : true;
            }
            catch(Throwable throwable0) {
                zzml.zza(throwable0);
                return false;
            }
        }

        public abstract boolean zzc(Object arg1, long arg2);

        public final int zzd(Object object0, long v) {
            return this.zza.getInt(object0, v);
        }

        public final long zze(Object object0, long v) {
            return this.zza.getLong(object0, v);
        }
    }

    static final class zzc extends zzb {
        zzc(Unsafe unsafe0) {
            super(unsafe0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final double zza(Object object0, long v) {
            return Double.longBitsToDouble(this.zze(object0, v));
        }

        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final void zza(Object object0, long v, byte b) {
            if(zzml.zza) {
                zzml.zzc(object0, v, b);
                return;
            }
            zzml.zzd(object0, v, b);
        }

        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final void zza(Object object0, long v, double f) {
            this.zza(object0, v, Double.doubleToLongBits(f));
        }

        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final void zza(Object object0, long v, float f) {
            this.zza(object0, v, Float.floatToIntBits(f));
        }

        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final void zza(Object object0, long v, boolean z) {
            if(zzml.zza) {
                zzml.zza(object0, v, z);
                return;
            }
            zzml.zzb(object0, v, z);
        }

        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final float zzb(Object object0, long v) {
            return Float.intBitsToFloat(this.zzd(object0, v));
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.android.gms.internal.measurement.zzml$zzb
        public final boolean zzc(Object object0, long v) {
            return zzml.zza ? zzml.zzf(object0, v) : zzml.zzg(object0, v);
        }
    }

    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    static {
        zzc zzml$zzc0;
        Unsafe unsafe0 = zzml.zzb();
        zzml.zzb = unsafe0;
        zzml.zzc = zzih.zza();
        boolean z = zzml.zzd(Long.TYPE);
        zzml.zzd = z;
        boolean z1 = zzml.zzd(Integer.TYPE);
        zzml.zze = z1;
        if(unsafe0 == null) {
            zzml$zzc0 = null;
        }
        else if(z) {
            zzml$zzc0 = new zzc(unsafe0);
        }
        else if(z1) {
            zzml$zzc0 = new zza(unsafe0);
        }
        else {
            zzml$zzc0 = null;
        }
        zzml.zzf = zzml$zzc0;
        boolean z2 = false;
        zzml.zzg = zzml$zzc0 == null ? false : zzml$zzc0.zzb();
        zzml.zzh = zzml$zzc0 == null ? false : zzml$zzc0.zza();
        zzml.zzi = (long)zzml.zzb(byte[].class);
        zzml.zzb(boolean[].class);
        zzml.zzc(boolean[].class);
        zzml.zzb(int[].class);
        zzml.zzc(int[].class);
        zzml.zzb(long[].class);
        zzml.zzc(long[].class);
        zzml.zzb(float[].class);
        zzml.zzc(float[].class);
        zzml.zzb(double[].class);
        zzml.zzc(double[].class);
        zzml.zzb(Object[].class);
        zzml.zzc(Object[].class);
        Field field0 = zzml.zze();
        if(field0 != null && zzml$zzc0 != null) {
            zzml$zzc0.zza.objectFieldOffset(field0);
        }
        if(ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z2 = true;
        }
        zzml.zza = z2;
    }

    static double zza(Object object0, long v) {
        return zzml.zzf.zza(object0, v);
    }

    static Object zza(Class class0) {
        try {
            return zzml.zzb.allocateInstance(class0);
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
        zzml.zzf.zza(object0, v, f);
    }

    static void zza(Object object0, long v, float f) {
        zzml.zzf.zza(object0, v, f);
    }

    static void zza(Object object0, long v, int v1) {
        zzml.zzf.zza(object0, v, v1);
    }

    static void zza(Object object0, long v, long v1) {
        zzml.zzf.zza(object0, v, v1);
    }

    static void zza(Object object0, long v, Object object1) {
        zzml.zzf.zza.putObject(object0, v, object1);
    }

    static void zza(Object object0, long v, boolean z) {
        zzml.zzc(object0, v, ((byte)z));
    }

    static void zza(Throwable throwable0) {
        Logger.getLogger("com.google.android.gms.internal.measurement.zzml").logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + throwable0);
    }

    static void zza(byte[] arr_b, long v, byte b) {
        zzml.zzf.zza(arr_b, zzml.zzi + v, b);
    }

    static float zzb(Object object0, long v) {
        return zzml.zzf.zzb(object0, v);
    }

    // 去混淆评级： 低(20)
    private static int zzb(Class class0) {
        return zzml.zzh ? zzml.zzf.zza.arrayBaseOffset(class0) : -1;
    }

    static Unsafe zzb() {
        try {
            return (Unsafe)AccessController.doPrivileged(new zzmn());
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static void zzb(Object object0, long v, boolean z) {
        zzml.zzd(object0, v, ((byte)z));
    }

    // 去混淆评级： 低(20)
    private static int zzc(Class class0) {
        return zzml.zzh ? zzml.zzf.zza.arrayIndexScale(class0) : -1;
    }

    static int zzc(Object object0, long v) {
        return zzml.zzf.zzd(object0, v);
    }

    private static void zzc(Object object0, long v, byte b) {
        int v1 = (~((int)v) & 3) << 3;
        zzml.zza(object0, -4L & v, (0xFF & b) << v1 | zzml.zzc(object0, -4L & v) & ~(0xFF << v1));
    }

    static void zzc(Object object0, long v, boolean z) {
        zzml.zzf.zza(object0, v, z);
    }

    static boolean zzc() [...] // 潜在的解密器

    static long zzd(Object object0, long v) {
        return zzml.zzf.zze(object0, v);
    }

    private static void zzd(Object object0, long v, byte b) {
        int v1 = (((int)v) & 3) << 3;
        zzml.zza(object0, -4L & v, (0xFF & b) << v1 | zzml.zzc(object0, -4L & v) & ~(0xFF << v1));
    }

    static boolean zzd() {
        return zzml.zzg;
    }

    private static boolean zzd(Class class0) {
        try {
            Class class1 = Boolean.TYPE;
            zzml.zzc.getMethod("peekLong", class0, class1);
            zzml.zzc.getMethod("pokeLong", class0, Long.TYPE, class1);
            Class class2 = Integer.TYPE;
            zzml.zzc.getMethod("pokeInt", class0, class2, class1);
            zzml.zzc.getMethod("peekInt", class0, class1);
            zzml.zzc.getMethod("pokeByte", class0, Byte.TYPE);
            zzml.zzc.getMethod("peekByte", class0);
            zzml.zzc.getMethod("pokeByteArray", class0, byte[].class, class2, class2);
            zzml.zzc.getMethod("peekByteArray", class0, byte[].class, class2, class2);
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    static Object zze(Object object0, long v) {
        return zzml.zzf.zza.getObject(object0, v);
    }

    private static Field zze() {
        Class class0 = Buffer.class;
        Field field0 = zzml.zza(class0, "effectiveDirectAddress");
        if(field0 != null) {
            return field0;
        }
        Field field1 = zzml.zza(class0, "address");
        return field1 == null || field1.getType() != Long.TYPE ? null : field1;
    }

    static boolean zzf(Object object0, long v) {
        return ((byte)(zzml.zzc(object0, -4L & v) >>> ((int)((~v & 3L) << 3)))) != 0;
    }

    static boolean zzg(Object object0, long v) {
        return ((byte)(zzml.zzc(object0, -4L & v) >>> ((int)((v & 3L) << 3)))) != 0;
    }

    static boolean zzh(Object object0, long v) {
        return zzml.zzf.zzc(object0, v);
    }
}

