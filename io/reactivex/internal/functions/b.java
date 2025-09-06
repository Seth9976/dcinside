package io.reactivex.internal.functions;

import e3.d;

public final class b {
    static final class a implements d {
        @Override  // e3.d
        public boolean a(Object object0, Object object1) {
            return b.c(object0, object1);
        }
    }

    static final d a;

    static {
        b.a = (Object object0, Object object1) -> // 去混淆评级： 低(20)
        object0 == object1 || object0 != null && object0.equals(object1);
    }

    private b() {
        throw new IllegalStateException("No instances!");
    }

    public static int a(int v, int v1) {
        if(v < v1) {
            return -1;
        }
        return v <= v1 ? 0 : 1;
    }

    public static int b(long v, long v1) {
        int v2 = Long.compare(v, v1);
        if(v2 < 0) {
            return -1;
        }
        return v2 <= 0 ? 0 : 1;
    }

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    public static boolean c(Object object0, Object object1) [...]

    public static d d() {
        return b.a;
    }

    public static int e(Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    @Deprecated
    public static long f(long v, String s) {
        throw new InternalError("Null check on a primitive: " + s);
    }

    public static Object g(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    public static int h(int v, String s) {
        if(v <= 0) {
            throw new IllegalArgumentException(s + " > 0 required but it was " + v);
        }
        return v;
    }

    public static long i(long v, String s) {
        if(v <= 0L) {
            throw new IllegalArgumentException(s + " > 0 required but it was " + v);
        }
        return v;
    }
}

