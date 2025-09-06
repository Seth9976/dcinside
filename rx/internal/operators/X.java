package rx.internal.operators;

import java.io.Serializable;
import rx.h;

public final class x {
    static final class a implements Serializable {
        private static final long a = 1L;

        @Override
        public String toString() {
            return "Notification=>Completed";
        }
    }

    static final class b implements Serializable {
        private static final long a = 2L;

        @Override
        public String toString() {
            return "Notification=>NULL";
        }
    }

    static final class c implements Serializable {
        final Throwable a;
        private static final long b = 3L;

        public c(Throwable throwable0) {
            this.a = throwable0;
        }

        @Override
        public String toString() {
            return "Notification=>Error:" + this.a;
        }
    }

    private static final Object a;
    private static final Object b;

    static {
        x.a = new a();
        x.b = new b();
    }

    public static boolean a(h h0, Object object0) {
        if(object0 == x.a) {
            h0.d();
            return true;
        }
        if(object0 == x.b) {
            h0.onNext(null);
            return false;
        }
        if(object0 == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
        if(object0.getClass() == c.class) {
            h0.onError(((c)object0).a);
            return true;
        }
        h0.onNext(object0);
        return false;
    }

    public static Object b() {
        return x.a;
    }

    public static Object c(Throwable throwable0) {
        return new c(throwable0);
    }

    public static Throwable d(Object object0) {
        return ((c)object0).a;
    }

    public static Object e(Object object0) {
        return object0 == x.b ? null : object0;
    }

    public static boolean f(Object object0) {
        return object0 == x.a;
    }

    public static boolean g(Object object0) {
        return object0 instanceof c;
    }

    // 去混淆评级： 低(20)
    public static boolean h(Object object0) {
        return object0 != null && !x.g(object0) && !x.f(object0);
    }

    public static boolean i(Object object0) {
        return object0 == x.b;
    }

    public static Object j(Object object0) {
        return object0 == null ? x.b : object0;
    }
}

