package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class UnsafeUtil {
    static final class Android32MemoryAccessor extends MemoryAccessor {
        private static final long b = -1L;

        Android32MemoryAccessor(Unsafe unsafe0) {
            super(unsafe0);
        }

        private static int A(long v) {
            return (int)v;
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void c(long v, byte[] arr_b, long v1, long v2) {
            throw new UnsupportedOperationException();
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void d(byte[] arr_b, long v, long v1, long v2) {
            throw new UnsupportedOperationException();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public boolean e(Object object0, long v) {
            return UnsafeUtil.z ? UnsafeUtil.w(object0, v) : UnsafeUtil.x(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public byte f(long v) {
            throw new UnsupportedOperationException();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public byte g(Object object0, long v) {
            return UnsafeUtil.z ? UnsafeUtil.B(object0, v) : UnsafeUtil.C(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public double h(Object object0, long v) {
            return Double.longBitsToDouble(this.m(object0, v));
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public float i(Object object0, long v) {
            return Float.intBitsToFloat(this.k(object0, v));
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public int j(long v) {
            throw new UnsupportedOperationException();
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public long l(long v) {
            throw new UnsupportedOperationException();
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public Object o(Field field0) {
            try {
                return field0.get(null);
            }
            catch(IllegalAccessException unused_ex) {
                return null;
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void q(Object object0, long v, boolean z) {
            if(UnsafeUtil.z) {
                UnsafeUtil.Z(object0, v, z);
                return;
            }
            UnsafeUtil.a0(object0, v, z);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void r(long v, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void s(Object object0, long v, byte b) {
            if(UnsafeUtil.z) {
                UnsafeUtil.e0(object0, v, b);
                return;
            }
            UnsafeUtil.f0(object0, v, b);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void t(Object object0, long v, double f) {
            this.y(object0, v, Double.doubleToLongBits(f));
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void u(Object object0, long v, float f) {
            this.w(object0, v, Float.floatToIntBits(f));
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void v(long v, int v1) {
            throw new UnsupportedOperationException();
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void x(long v, long v1) {
            throw new UnsupportedOperationException();
        }
    }

    static final class Android64MemoryAccessor extends MemoryAccessor {
        Android64MemoryAccessor(Unsafe unsafe0) {
            super(unsafe0);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void c(long v, byte[] arr_b, long v1, long v2) {
            throw new UnsupportedOperationException();
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void d(byte[] arr_b, long v, long v1, long v2) {
            throw new UnsupportedOperationException();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public boolean e(Object object0, long v) {
            return UnsafeUtil.z ? UnsafeUtil.w(object0, v) : UnsafeUtil.x(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public byte f(long v) {
            throw new UnsupportedOperationException();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public byte g(Object object0, long v) {
            return UnsafeUtil.z ? UnsafeUtil.B(object0, v) : UnsafeUtil.C(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public double h(Object object0, long v) {
            return Double.longBitsToDouble(this.m(object0, v));
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public float i(Object object0, long v) {
            return Float.intBitsToFloat(this.k(object0, v));
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public int j(long v) {
            throw new UnsupportedOperationException();
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public long l(long v) {
            throw new UnsupportedOperationException();
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public Object o(Field field0) {
            try {
                return field0.get(null);
            }
            catch(IllegalAccessException unused_ex) {
                return null;
            }
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void q(Object object0, long v, boolean z) {
            if(UnsafeUtil.z) {
                UnsafeUtil.Z(object0, v, z);
                return;
            }
            UnsafeUtil.a0(object0, v, z);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void r(long v, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void s(Object object0, long v, byte b) {
            if(UnsafeUtil.z) {
                UnsafeUtil.e0(object0, v, b);
                return;
            }
            UnsafeUtil.f0(object0, v, b);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void t(Object object0, long v, double f) {
            this.y(object0, v, Double.doubleToLongBits(f));
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void u(Object object0, long v, float f) {
            this.w(object0, v, Float.floatToIntBits(f));
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void v(long v, int v1) {
            throw new UnsupportedOperationException();
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void x(long v, long v1) {
            throw new UnsupportedOperationException();
        }
    }

    static final class JvmMemoryAccessor extends MemoryAccessor {
        JvmMemoryAccessor(Unsafe unsafe0) {
            super(unsafe0);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void c(long v, byte[] arr_b, long v1, long v2) {
            this.a.copyMemory(null, v, arr_b, UnsafeUtil.i + v1, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void d(byte[] arr_b, long v, long v1, long v2) {
            this.a.copyMemory(arr_b, UnsafeUtil.i + v, null, v1, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public boolean e(Object object0, long v) {
            return this.a.getBoolean(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public byte f(long v) {
            return this.a.getByte(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public byte g(Object object0, long v) {
            return this.a.getByte(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public double h(Object object0, long v) {
            return this.a.getDouble(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public float i(Object object0, long v) {
            return this.a.getFloat(object0, v);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public int j(long v) {
            return this.a.getInt(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public long l(long v) {
            return this.a.getLong(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public Object o(Field field0) {
            return this.n(this.a.staticFieldBase(field0), this.a.staticFieldOffset(field0));
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void q(Object object0, long v, boolean z) {
            this.a.putBoolean(object0, v, z);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void r(long v, byte b) {
            this.a.putByte(v, b);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void s(Object object0, long v, byte b) {
            this.a.putByte(object0, v, b);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void t(Object object0, long v, double f) {
            this.a.putDouble(object0, v, f);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void u(Object object0, long v, float f) {
            this.a.putFloat(object0, v, f);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void v(long v, int v1) {
            this.a.putInt(v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.UnsafeUtil$MemoryAccessor
        public void x(long v, long v1) {
            this.a.putLong(v, v1);
        }
    }

    static abstract class MemoryAccessor {
        Unsafe a;

        MemoryAccessor(Unsafe unsafe0) {
            this.a = unsafe0;
        }

        public final int a(Class class0) {
            return this.a.arrayBaseOffset(class0);
        }

        public final int b(Class class0) {
            return this.a.arrayIndexScale(class0);
        }

        public abstract void c(long arg1, byte[] arg2, long arg3, long arg4);

        public abstract void d(byte[] arg1, long arg2, long arg3, long arg4);

        public abstract boolean e(Object arg1, long arg2);

        public abstract byte f(long arg1);

        public abstract byte g(Object arg1, long arg2);

        public abstract double h(Object arg1, long arg2);

        public abstract float i(Object arg1, long arg2);

        public abstract int j(long arg1);

        public final int k(Object object0, long v) {
            return this.a.getInt(object0, v);
        }

        public abstract long l(long arg1);

        public final long m(Object object0, long v) {
            return this.a.getLong(object0, v);
        }

        public final Object n(Object object0, long v) {
            return this.a.getObject(object0, v);
        }

        public abstract Object o(Field arg1);

        public final long p(Field field0) {
            return this.a.objectFieldOffset(field0);
        }

        public abstract void q(Object arg1, long arg2, boolean arg3);

        public abstract void r(long arg1, byte arg2);

        public abstract void s(Object arg1, long arg2, byte arg3);

        public abstract void t(Object arg1, long arg2, double arg3);

        public abstract void u(Object arg1, long arg2, float arg3);

        public abstract void v(long arg1, int arg2);

        public final void w(Object object0, long v, int v1) {
            this.a.putInt(object0, v, v1);
        }

        public abstract void x(long arg1, long arg2);

        public final void y(Object object0, long v, long v1) {
            this.a.putLong(object0, v, v1);
        }

        public final void z(Object object0, long v, Object object1) {
            this.a.putObject(object0, v, object1);
        }
    }

    private static final Logger a = null;
    private static final Unsafe b = null;
    private static final Class c = null;
    private static final boolean d = false;
    private static final boolean e = false;
    private static final MemoryAccessor f = null;
    private static final boolean g = false;
    private static final boolean h = false;
    static final long i = 0L;
    private static final long j = 0L;
    private static final long k = 0L;
    private static final long l = 0L;
    private static final long m = 0L;
    private static final long n = 0L;
    private static final long o = 0L;
    private static final long p = 0L;
    private static final long q = 0L;
    private static final long r = 0L;
    private static final long s = 0L;
    private static final long t = 0L;
    private static final long u = 0L;
    private static final long v = 0L;
    private static final int w = 8;
    private static final int x = 7;
    private static final int y;
    static final boolean z;

    static {
        UnsafeUtil.a = Logger.getLogger("androidx.datastore.preferences.protobuf.UnsafeUtil");
        UnsafeUtil.b = UnsafeUtil.R();
        UnsafeUtil.c = Android.b();
        UnsafeUtil.d = UnsafeUtil.q(Long.TYPE);
        UnsafeUtil.e = UnsafeUtil.q(Integer.TYPE);
        UnsafeUtil.f = UnsafeUtil.N();
        UnsafeUtil.g = UnsafeUtil.t0();
        UnsafeUtil.h = UnsafeUtil.s0();
        long v = (long)UnsafeUtil.k(byte[].class);
        UnsafeUtil.i = v;
        UnsafeUtil.j = (long)UnsafeUtil.k(boolean[].class);
        UnsafeUtil.k = (long)UnsafeUtil.l(boolean[].class);
        UnsafeUtil.l = (long)UnsafeUtil.k(int[].class);
        UnsafeUtil.m = (long)UnsafeUtil.l(int[].class);
        UnsafeUtil.n = (long)UnsafeUtil.k(long[].class);
        UnsafeUtil.o = (long)UnsafeUtil.l(long[].class);
        UnsafeUtil.p = (long)UnsafeUtil.k(float[].class);
        UnsafeUtil.q = (long)UnsafeUtil.l(float[].class);
        UnsafeUtil.r = (long)UnsafeUtil.k(double[].class);
        UnsafeUtil.s = (long)UnsafeUtil.l(double[].class);
        UnsafeUtil.t = (long)UnsafeUtil.k(Object[].class);
        UnsafeUtil.u = (long)UnsafeUtil.l(Object[].class);
        UnsafeUtil.v = UnsafeUtil.s(UnsafeUtil.m());
        UnsafeUtil.y = (int)(v & 7L);
        UnsafeUtil.z = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static byte A(byte[] arr_b, long v) {
        return UnsafeUtil.f.g(arr_b, UnsafeUtil.i + v);
    }

    private static byte B(Object object0, long v) {
        return (byte)(UnsafeUtil.I(object0, -4L & v) >>> ((int)((~v & 3L) << 3)) & 0xFF);
    }

    private static byte C(Object object0, long v) {
        return (byte)(UnsafeUtil.I(object0, -4L & v) >>> ((int)((v & 3L) << 3)) & 0xFF);
    }

    static double D(Object object0, long v) {
        return UnsafeUtil.f.h(object0, v);
    }

    static double E(double[] arr_f, long v) {
        return UnsafeUtil.f.h(arr_f, UnsafeUtil.r + v * UnsafeUtil.s);
    }

    static float F(Object object0, long v) {
        return UnsafeUtil.f.i(object0, v);
    }

    static float G(float[] arr_f, long v) {
        return UnsafeUtil.f.i(arr_f, UnsafeUtil.p + v * UnsafeUtil.q);
    }

    static int H(long v) {
        return UnsafeUtil.f.j(v);
    }

    static int I(Object object0, long v) {
        return UnsafeUtil.f.k(object0, v);
    }

    static int J(int[] arr_v, long v) {
        return UnsafeUtil.f.k(arr_v, UnsafeUtil.l + v * UnsafeUtil.m);
    }

    static long K(long v) {
        return UnsafeUtil.f.l(v);
    }

    static long L(Object object0, long v) {
        return UnsafeUtil.f.m(object0, v);
    }

    static long M(long[] arr_v, long v) {
        return UnsafeUtil.f.m(arr_v, UnsafeUtil.n + v * UnsafeUtil.o);
    }

    private static MemoryAccessor N() {
        Unsafe unsafe0 = UnsafeUtil.b;
        return unsafe0 == null ? null : new JvmMemoryAccessor(unsafe0);
    }

    static Object O(Object object0, long v) {
        return UnsafeUtil.f.n(object0, v);
    }

    static Object P(Object[] arr_object, long v) {
        return UnsafeUtil.f.n(arr_object, UnsafeUtil.t + v * UnsafeUtil.u);
    }

    static Object Q(Field field0) {
        return UnsafeUtil.f.o(field0);
    }

    static Unsafe R() {
        try {
            return (Unsafe)AccessController.doPrivileged(new PrivilegedExceptionAction() {
                public Unsafe a() throws Exception {
                    Class class0 = Unsafe.class;
                    Field[] arr_field = class0.getDeclaredFields();
                    for(int v = 0; v < arr_field.length; ++v) {
                        Field field0 = arr_field[v];
                        field0.setAccessible(true);
                        Object object0 = field0.get(null);
                        if(class0.isInstance(object0)) {
                            return (Unsafe)class0.cast(object0);
                        }
                    }
                    return null;
                }

                @Override
                public Object run() throws Exception {
                    return this.a();
                }
            });
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static boolean S() [...] // 潜在的解密器

    static boolean T() [...] // 潜在的解密器

    static boolean U() {
        return UnsafeUtil.d;
    }

    static int V(byte[] arr_b, int v, byte[] arr_b1, int v1, int v2) {
        int v3 = 0;
        if(v < 0 || v1 < 0 || v2 < 0 || v + v2 > arr_b.length || v1 + v2 > arr_b1.length) {
            throw new IndexOutOfBoundsException();
        }
        if(UnsafeUtil.h) {
            for(int v4 = UnsafeUtil.y + v & 7; v3 < v2 && (v4 & 7) != 0; ++v4) {
                if(arr_b[v + v3] != arr_b1[v1 + v3]) {
                    return v3;
                }
                ++v3;
            }
            int v5 = (v2 - v3 & -8) + v3;
            while(v3 < v5) {
                long v6 = UnsafeUtil.L(arr_b, ((long)v) + UnsafeUtil.i + ((long)v3));
                long v7 = UnsafeUtil.L(arr_b1, UnsafeUtil.i + ((long)v1) + ((long)v3));
                if(v6 != v7) {
                    return v3 + UnsafeUtil.t(v6, v7);
                }
                v3 += 8;
            }
        }
        while(v3 < v2) {
            if(arr_b[v + v3] != arr_b1[v1 + v3]) {
                return v3;
            }
            ++v3;
        }
        return -1;
    }

    static long W(Field field0) {
        return UnsafeUtil.f.p(field0);
    }

    static void X(Object object0, long v, boolean z) {
        UnsafeUtil.f.q(object0, v, z);
    }

    static void Y(boolean[] arr_z, long v, boolean z) {
        UnsafeUtil.f.q(arr_z, UnsafeUtil.j + v * UnsafeUtil.k, z);
    }

    private static void Z(Object object0, long v, boolean z) {
        UnsafeUtil.e0(object0, v, ((byte)z));
    }

    private static void a0(Object object0, long v, boolean z) {
        UnsafeUtil.f0(object0, v, ((byte)z));
    }

    static void b0(long v, byte b) {
        UnsafeUtil.f.r(v, b);
    }

    static void c0(Object object0, long v, byte b) {
        UnsafeUtil.f.s(object0, v, b);
    }

    static void d0(byte[] arr_b, long v, byte b) {
        UnsafeUtil.f.s(arr_b, UnsafeUtil.i + v, b);
    }

    private static void e0(Object object0, long v, byte b) {
        int v1 = (~((int)v) & 3) << 3;
        UnsafeUtil.l0(object0, -4L & v, (0xFF & b) << v1 | UnsafeUtil.I(object0, -4L & v) & ~(0xFF << v1));
    }

    private static void f0(Object object0, long v, byte b) {
        int v1 = (((int)v) & 3) << 3;
        UnsafeUtil.l0(object0, -4L & v, (0xFF & b) << v1 | UnsafeUtil.I(object0, -4L & v) & ~(0xFF << v1));
    }

    static void g0(Object object0, long v, double f) {
        UnsafeUtil.f.t(object0, v, f);
    }

    static void h0(double[] arr_f, long v, double f) {
        UnsafeUtil.f.t(arr_f, UnsafeUtil.r + v * UnsafeUtil.s, f);
    }

    static long i(ByteBuffer byteBuffer0) {
        return UnsafeUtil.f.m(byteBuffer0, UnsafeUtil.v);
    }

    static void i0(Object object0, long v, float f) {
        UnsafeUtil.f.u(object0, v, f);
    }

    static Object j(Class class0) {
        try {
            return UnsafeUtil.b.allocateInstance(class0);
        }
        catch(InstantiationException instantiationException0) {
            throw new IllegalStateException(instantiationException0);
        }
    }

    static void j0(float[] arr_f, long v, float f) {
        UnsafeUtil.f.u(arr_f, UnsafeUtil.p + v * UnsafeUtil.q, f);
    }

    // 去混淆评级： 低(20)
    private static int k(Class class0) {
        return UnsafeUtil.h ? UnsafeUtil.f.a(class0) : -1;
    }

    static void k0(long v, int v1) {
        UnsafeUtil.f.v(v, v1);
    }

    // 去混淆评级： 低(20)
    private static int l(Class class0) {
        return UnsafeUtil.h ? UnsafeUtil.f.b(class0) : -1;
    }

    static void l0(Object object0, long v, int v1) {
        UnsafeUtil.f.w(object0, v, v1);
    }

    // 去混淆评级： 低(20)
    private static Field m() {
        Field field0 = UnsafeUtil.r(Buffer.class, "address");
        return field0 != null && field0.getType() == Long.TYPE ? field0 : null;
    }

    static void m0(int[] arr_v, long v, int v1) {
        UnsafeUtil.f.w(arr_v, UnsafeUtil.l + v * UnsafeUtil.m, v1);
    }

    static void n(long v, byte[] arr_b, long v1, long v2) {
        UnsafeUtil.f.c(v, arr_b, v1, v2);
    }

    static void n0(long v, long v1) {
        UnsafeUtil.f.x(v, v1);
    }

    static void o(byte[] arr_b, long v, long v1, long v2) {
        UnsafeUtil.f.d(arr_b, v, v1, v2);
    }

    static void o0(Object object0, long v, long v1) {
        UnsafeUtil.f.y(object0, v, v1);
    }

    static void p(byte[] arr_b, long v, byte[] arr_b1, long v1, long v2) {
        System.arraycopy(arr_b, ((int)v), arr_b1, ((int)v1), ((int)v2));
    }

    static void p0(long[] arr_v, long v, long v1) {
        UnsafeUtil.f.y(arr_v, UnsafeUtil.n + v * UnsafeUtil.o, v1);
    }

    // 去混淆评级： 低(30)
    private static boolean q(Class class0) {
        return false;
    }

    static void q0(Object object0, long v, Object object1) {
        UnsafeUtil.f.z(object0, v, object1);
    }

    private static Field r(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static void r0(Object[] arr_object, long v, Object object0) {
        UnsafeUtil.f.z(arr_object, UnsafeUtil.t + v * UnsafeUtil.u, object0);
    }

    private static long s(Field field0) {
        if(field0 != null) {
            return UnsafeUtil.f == null ? -1L : UnsafeUtil.f.p(field0);
        }
        return -1L;
    }

    private static boolean s0() {
        Class class0 = Class.class;
        Class class1 = Object.class;
        Unsafe unsafe0 = UnsafeUtil.b;
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
            UnsafeUtil.a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + throwable0);
            return false;
        }
    }

    // 去混淆评级： 低(20)
    private static int t(long v, long v1) {
        return UnsafeUtil.z ? Long.numberOfLeadingZeros(v ^ v1) >> 3 : Long.numberOfTrailingZeros(v ^ v1) >> 3;
    }

    private static boolean t0() {
        Class class0 = Object.class;
        Unsafe unsafe0 = UnsafeUtil.b;
        if(unsafe0 == null) {
            return false;
        }
        try {
            Class class1 = unsafe0.getClass();
            class1.getMethod("objectFieldOffset", Field.class);
            Class class2 = Long.TYPE;
            class1.getMethod("getLong", class0, class2);
            if(UnsafeUtil.m() == null) {
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
            UnsafeUtil.a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + throwable0);
            return false;
        }
    }

    static boolean u(Object object0, long v) {
        return UnsafeUtil.f.e(object0, v);
    }

    static boolean v(boolean[] arr_z, long v) {
        return UnsafeUtil.f.e(arr_z, UnsafeUtil.j + v * UnsafeUtil.k);
    }

    private static boolean w(Object object0, long v) {
        return UnsafeUtil.B(object0, v) != 0;
    }

    private static boolean x(Object object0, long v) {
        return UnsafeUtil.C(object0, v) != 0;
    }

    static byte y(long v) {
        return UnsafeUtil.f.f(v);
    }

    static byte z(Object object0, long v) {
        return UnsafeUtil.f.g(object0, v);
    }
}

