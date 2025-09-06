package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import J1.e;
import com.google.common.base.H;
import com.google.common.collect.c4;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@c
@d
@N
final class l0 {
    @e
    interface a {
        void a(Class arg1);
    }

    @e
    static class b {
        static enum com.google.common.util.concurrent.l0.b.a implements a {
            INSTANCE;

            private static final Set b;

            static {
                com.google.common.util.concurrent.l0.b.a.b = new CopyOnWriteArraySet();
            }

            @Override  // com.google.common.util.concurrent.l0$a
            public void a(Class class0) {
                for(Object object0: com.google.common.util.concurrent.l0.b.a.b) {
                    if(class0.equals(((WeakReference)object0).get())) {
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
                l0.e(class0);
                Set set0 = com.google.common.util.concurrent.l0.b.a.b;
                if(set0.size() > 1000) {
                    set0.clear();
                }
                set0.add(new WeakReference(class0));
            }

            private static com.google.common.util.concurrent.l0.b.a[] b() [...] // Inlined contents
        }

        static final a a;

        static {
            b.a = b.a();
        }

        static a a() {
            return l0.q();
        }
    }

    private static final c4 a;
    private static final c4 b;

    static {
        c4 c40 = c4.K().O((List list0) -> Boolean.valueOf(list0.contains(String.class))).k(c4.K().O((List list0) -> Boolean.valueOf(list0.contains(Throwable.class)))).P();
        l0.a = c40;
        l0.b = c40.O((Constructor constructor0) -> Arrays.asList(constructor0.getParameterTypes()));
    }

    private static a d() {
        return b.a;
    }

    @e
    static void e(Class class0) {
        H.u(l0.j(class0), "Futures.getChecked exception type (%s) must not be a RuntimeException", class0);
        H.u(l0.i(class0), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", class0);
    }

    @e
    @O1.a
    @F0
    static Object f(a l0$a0, Future future0, Class class0) throws Exception {
        l0$a0.a(class0);
        try {
            return future0.get();
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            throw l0.o(class0, interruptedException0);
        }
        catch(ExecutionException executionException0) {
            l0.r(executionException0.getCause(), class0);
            throw new AssertionError();
        }
    }

    @O1.a
    @F0
    static Object g(Future future0, Class class0) throws Exception {
        return l0.f(l0.d(), future0, class0);
    }

    @O1.a
    @F0
    static Object h(Future future0, Class class0, long v, TimeUnit timeUnit0) throws Exception {
        l0.d().a(class0);
        try {
            return future0.get(v, timeUnit0);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            throw l0.o(class0, interruptedException0);
        }
        catch(TimeoutException timeoutException0) {
            throw l0.o(class0, timeoutException0);
        }
        catch(ExecutionException executionException0) {
            l0.r(executionException0.getCause(), class0);
            throw new AssertionError();
        }
    }

    private static boolean i(Class class0) {
        try {
            l0.o(class0, new Exception());
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    @e
    static boolean j(Class class0) {
        return !RuntimeException.class.isAssignableFrom(class0);
    }

    // 检测为 Lambda 实现
    private static Comparable k(List list0) [...]

    // 检测为 Lambda 实现
    private static Comparable l(List list0) [...]

    // 检测为 Lambda 实现
    private static List m(Constructor constructor0) [...]

    @o3.a
    private static Object n(Constructor constructor0, Throwable throwable0) {
        Class[] arr_class = constructor0.getParameterTypes();
        Object[] arr_object = new Object[arr_class.length];
        for(int v = 0; v < arr_class.length; ++v) {
            Class class0 = arr_class[v];
            if(class0.equals(String.class)) {
                arr_object[v] = throwable0.toString();
            }
            else {
                if(!class0.equals(Throwable.class)) {
                    return null;
                }
                arr_object[v] = throwable0;
            }
        }
        try {
            return constructor0.newInstance(arr_object);
        }
        catch(IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    private static Exception o(Class class0, Throwable throwable0) {
        for(Object object0: l0.p(Arrays.asList(class0.getConstructors()))) {
            Exception exception0 = (Exception)l0.n(((Constructor)object0), throwable0);
            if(exception0 != null) {
                if(exception0.getCause() == null) {
                    exception0.initCause(throwable0);
                }
                return exception0;
            }
            if(false) {
                break;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + class0 + " in response to chained exception", throwable0);
    }

    private static List p(List list0) {
        return l0.b.Q(list0);
    }

    @e
    static a q() {
        return com.google.common.util.concurrent.l0.b.a.a;
    }

    private static void r(Throwable throwable0, Class class0) throws Exception {
        if(throwable0 instanceof Error) {
            throw new O(((Error)throwable0));
        }
        if(!(throwable0 instanceof RuntimeException)) {
            throw l0.o(class0, throwable0);
        }
        throw new f1(throwable0);
    }
}

