package rx.exceptions;

import java.util.HashSet;
import java.util.List;
import rx.h;
import rx.m;

public final class c {
    private static final int a = 25;

    private c() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(Throwable throwable0, Throwable throwable1) {
        HashSet hashSet0 = new HashSet();
        for(int v = 0; throwable0.getCause() != null; ++v) {
            if(v >= 25) {
                return;
            }
            throwable0 = throwable0.getCause();
            if(hashSet0.contains(throwable0.getCause())) {
                break;
            }
            hashSet0.add(throwable0.getCause());
        }
        try {
            throwable0.initCause(throwable1);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static Throwable b(Throwable throwable0) {
        for(int v = 0; throwable0.getCause() != null; ++v) {
            if(v >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            throwable0 = throwable0.getCause();
        }
        return throwable0;
    }

    public static RuntimeException c(Throwable throwable0) {
        if(throwable0 instanceof RuntimeException) {
            throw (RuntimeException)throwable0;
        }
        if(!(throwable0 instanceof Error)) {
            throw new RuntimeException(throwable0);
        }
        throw (Error)throwable0;
    }

    public static void d(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            if(list0.size() != 1) {
                throw new b(list0);
            }
            Throwable throwable0 = (Throwable)list0.get(0);
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            if(throwable0 instanceof Error) {
                throw (Error)throwable0;
            }
            throw new RuntimeException(throwable0);
        }
        return;
    }

    public static void e(Throwable throwable0) {
        if(throwable0 instanceof g) {
            throw (g)throwable0;
        }
        if(throwable0 instanceof f) {
            throw (f)throwable0;
        }
        if(throwable0 instanceof e) {
            throw (e)throwable0;
        }
        if(throwable0 instanceof VirtualMachineError) {
            throw (VirtualMachineError)throwable0;
        }
        if(throwable0 instanceof ThreadDeath) {
            throw (ThreadDeath)throwable0;
        }
        if(throwable0 instanceof LinkageError) {
            throw (LinkageError)throwable0;
        }
    }

    public static void f(Throwable throwable0, h h0) {
        c.e(throwable0);
        h0.onError(throwable0);
    }

    public static void g(Throwable throwable0, h h0, Object object0) {
        c.e(throwable0);
        h0.onError(rx.exceptions.h.a(throwable0, object0));
    }

    public static void h(Throwable throwable0, m m0) {
        c.e(throwable0);
        m0.onError(throwable0);
    }

    public static void i(Throwable throwable0, m m0, Object object0) {
        c.e(throwable0);
        m0.onError(rx.exceptions.h.a(throwable0, object0));
    }
}

