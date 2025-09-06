package io.reactivex.internal.util;

import io.reactivex.I;
import io.reactivex.disposables.c;
import java.io.Serializable;
import org.reactivestreams.d;
import org.reactivestreams.e;

public enum q {
    static final class a implements Serializable {
        final c a;
        private static final long b = 0x98287FF0AE920499L;

        a(c c0) {
            this.a = c0;
        }

        @Override
        public String toString() {
            return "NotificationLite.Disposable[" + this.a + "]";
        }
    }

    static final class b implements Serializable {
        final Throwable a;
        private static final long b = 0x866E4D1B357005EBL;

        b(Throwable throwable0) {
            this.a = throwable0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof b ? io.reactivex.internal.functions.b.c(this.a, ((b)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        public String toString() {
            return "NotificationLite.Error[" + this.a + "]";
        }
    }

    static final class io.reactivex.internal.util.q.c implements Serializable {
        final e a;
        private static final long b = 0xEDA665CD3096197CL;

        io.reactivex.internal.util.q.c(e e0) {
            this.a = e0;
        }

        @Override
        public String toString() {
            return "NotificationLite.Subscription[" + this.a + "]";
        }
    }

    COMPLETE;

    public static boolean a(Object object0, I i0) {
        if(object0 == q.a) {
            i0.onComplete();
            return true;
        }
        if(object0 instanceof b) {
            i0.onError(((b)object0).a);
            return true;
        }
        i0.onNext(object0);
        return false;
    }

    public static boolean b(Object object0, d d0) {
        if(object0 == q.a) {
            d0.onComplete();
            return true;
        }
        if(object0 instanceof b) {
            d0.onError(((b)object0).a);
            return true;
        }
        d0.onNext(object0);
        return false;
    }

    public static boolean c(Object object0, I i0) {
        if(object0 == q.a) {
            i0.onComplete();
            return true;
        }
        if(object0 instanceof b) {
            i0.onError(((b)object0).a);
            return true;
        }
        if(object0 instanceof a) {
            i0.b(((a)object0).a);
            return false;
        }
        i0.onNext(object0);
        return false;
    }

    public static boolean d(Object object0, d d0) {
        if(object0 == q.a) {
            d0.onComplete();
            return true;
        }
        if(object0 instanceof b) {
            d0.onError(((b)object0).a);
            return true;
        }
        if(object0 instanceof io.reactivex.internal.util.q.c) {
            d0.g(((io.reactivex.internal.util.q.c)object0).a);
            return false;
        }
        d0.onNext(object0);
        return false;
    }

    public static Object e() {
        return q.a;
    }

    public static Object f(c c0) {
        return new a(c0);
    }

    public static Object g(Throwable throwable0) {
        return new b(throwable0);
    }

    public static c h(Object object0) {
        return ((a)object0).a;
    }

    public static Throwable i(Object object0) {
        return ((b)object0).a;
    }

    public static e j(Object object0) {
        return ((io.reactivex.internal.util.q.c)object0).a;
    }

    public static Object k(Object object0) [...] // Inlined contents

    public static boolean l(Object object0) {
        return object0 == q.a;
    }

    public static boolean m(Object object0) {
        return object0 instanceof a;
    }

    public static boolean n(Object object0) {
        return object0 instanceof b;
    }

    public static boolean p(Object object0) {
        return object0 instanceof io.reactivex.internal.util.q.c;
    }

    public static Object r(Object object0) [...] // Inlined contents

    public static Object s(e e0) {
        return new io.reactivex.internal.util.q.c(e0);
    }

    @Override
    public String toString() {
        return "NotificationLite.Complete";
    }
}

