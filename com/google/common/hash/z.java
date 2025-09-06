package com.google.common.hash;

import com.google.common.primitives.n;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

@k
final class z {
    static class a {
    }

    static abstract enum b implements c {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.hash.z.b.a extends b {
            com.google.common.hash.z.b.a(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.hash.z$c
            public long a(byte[] arr_b, int v) {
                return n.k(arr_b[v + 7], arr_b[v + 6], arr_b[v + 5], arr_b[v + 4], arr_b[v + 3], arr_b[v + 2], arr_b[v + 1], arr_b[v]);
            }

            @Override  // com.google.common.hash.z$c
            public void b(byte[] arr_b, int v, long v1) {
                long v2 = 0xFFL;
                for(int v3 = 0; v3 < 8; ++v3) {
                    arr_b[v + v3] = (byte)(((int)((v1 & v2) >> v3 * 8)));
                    v2 <<= 8;
                }
            }
        }

        INSTANCE /* 警告！未生成枚举子类：com.google.common.hash.z$b$a */;

        private b() {
        }

        b(a z$a0) {
            this();
        }

        private static b[] c() [...] // Inlined contents
    }

    interface c {
        long a(byte[] arg1, int arg2);

        void b(byte[] arg1, int arg2, long arg3);
    }

    static abstract enum d implements c {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.hash.z.d.a extends d {
            com.google.common.hash.z.d.a(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.hash.z$c
            public long a(byte[] arr_b, int v) {
                return d.c.getLong(arr_b, ((long)v) + ((long)d.d));
            }

            @Override  // com.google.common.hash.z$c
            public void b(byte[] arr_b, int v, long v1) {
                d.c.putLong(arr_b, ((long)v) + ((long)d.d), v1);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.hash.z.d.b extends d {
            com.google.common.hash.z.d.b(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.hash.z$c
            public long a(byte[] arr_b, int v) {
                return Long.reverseBytes(d.c.getLong(arr_b, ((long)v) + ((long)d.d)));
            }

            @Override  // com.google.common.hash.z$c
            public void b(byte[] arr_b, int v, long v1) {
                d.c.putLong(arr_b, ((long)v) + ((long)d.d), Long.reverseBytes(v1));
            }
        }

        UNSAFE_LITTLE_ENDIAN /* 警告！未生成枚举子类：com.google.common.hash.z$d$a */,
        UNSAFE_BIG_ENDIAN /* 警告！未生成枚举子类：com.google.common.hash.z$d$b */;

        private static final Unsafe c;
        private static final int d;

        static {
            Unsafe unsafe0;
            try {
                unsafe0 = Unsafe.getUnsafe();
            }
            catch(SecurityException unused_ex) {
                try {
                    unsafe0 = (Unsafe)AccessController.doPrivileged(() -> {
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
                        throw new NoSuchFieldError("the Unsafe");
                    });
                }
                catch(PrivilegedActionException privilegedActionException0) {
                    throw new RuntimeException("Could not initialize intrinsics", privilegedActionException0.getCause());
                }
            }
            d.c = unsafe0;
            d.d = unsafe0.arrayBaseOffset(byte[].class);
            if(unsafe0.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        private d() {
        }

        d(a z$a0) {
            this();
        }

        private static d[] d() [...] // Inlined contents

        private static Unsafe g() [...] // Inlined contents

        // 检测为 Lambda 实现
        private static Unsafe h() throws Exception [...]
    }

    private static final c a;
    static final boolean b;

    // 去混淆评级： 低(25)
    static {
        z.a = b.a;
    }

    static int a(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    static long b(byte[] arr_b, int v) {
        return z.a.a(arr_b, v);
    }

    static long c(byte[] arr_b, int v, int v1) {
        int v2 = Math.min(v1, 8);
        long v3 = 0L;
        for(int v4 = 0; v4 < v2; ++v4) {
            v3 |= (((long)arr_b[v + v4]) & 0xFFL) << v4 * 8;
        }
        return v3;
    }

    static void d(byte[] arr_b, int v, long v1) {
        z.a.b(arr_b, v, v1);
    }

    static boolean e() {
        return z.a instanceof d;
    }
}

