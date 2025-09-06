package rx.internal.schedulers;

import androidx.compose.animation.core.d;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.util.n;
import rx.internal.util.q;
import rx.j.a;
import rx.o;
import rx.plugins.c;
import rx.subscriptions.b;
import rx.subscriptions.f;

public class h extends a implements o {
    private final ScheduledExecutorService a;
    volatile boolean b;
    private static final String c = "rx.scheduler.jdk6.purge-frequency-millis";
    private static final String d = "rx.scheduler.jdk6.purge-force";
    private static final String e = "RxSchedulerPurge-";
    private static final boolean f;
    public static final int g;
    private static final ConcurrentHashMap h;
    private static final AtomicReference i;
    private static volatile Object j;
    private static final Object k;

    static {
        h.k = new Object();
        h.h = new ConcurrentHashMap();
        h.i = new AtomicReference();
        h.g = 1000;
        h.f = true;
    }

    public h(ThreadFactory threadFactory0) {
        ScheduledExecutorService scheduledExecutorService0 = Executors.newScheduledThreadPool(1, threadFactory0);
        if(!h.T(scheduledExecutorService0) && scheduledExecutorService0 instanceof ScheduledThreadPoolExecutor) {
            h.v(((ScheduledThreadPoolExecutor)scheduledExecutorService0));
        }
        this.a = scheduledExecutorService0;
    }

    public j Q(rx.functions.a a0, long v, TimeUnit timeUnit0, q q0) {
        j j0 = new j(c.P(a0), q0);
        q0.a(j0);
        Future future0 = v <= 0L ? this.a.submit(j0) : this.a.schedule(j0, v, timeUnit0);
        j0.a(future0);
        return j0;
    }

    public j R(rx.functions.a a0, long v, TimeUnit timeUnit0, b b0) {
        j j0 = new j(c.P(a0), b0);
        b0.a(j0);
        Future future0 = v <= 0L ? this.a.submit(j0) : this.a.schedule(j0, v, timeUnit0);
        j0.a(future0);
        return j0;
    }

    public static boolean T(ScheduledExecutorService scheduledExecutorService0) {
        Method method1;
        if(h.f) {
            if(scheduledExecutorService0 instanceof ScheduledThreadPoolExecutor) {
                Object object0 = h.j;
                Method method0 = h.k;
                if(object0 == method0) {
                    return false;
                }
                if(object0 == null) {
                    method1 = h.q(scheduledExecutorService0);
                    if(method1 != null) {
                        method0 = method1;
                    }
                    h.j = method0;
                }
                else {
                    method1 = (Method)object0;
                }
            }
            else {
                method1 = h.q(scheduledExecutorService0);
            }
            if(method1 != null) {
                try {
                    method1.invoke(scheduledExecutorService0, Boolean.TRUE);
                    return true;
                }
                catch(InvocationTargetException invocationTargetException0) {
                    c.I(invocationTargetException0);
                    return false;
                }
                catch(IllegalAccessException illegalAccessException0) {
                    c.I(illegalAccessException0);
                    return false;
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    c.I(illegalArgumentException0);
                    return false;
                }
            }
        }
        return false;
    }

    @Override  // rx.j$a
    public o c(rx.functions.a a0) {
        return this.d(a0, 0L, null);
    }

    @Override  // rx.j$a
    public o d(rx.functions.a a0, long v, TimeUnit timeUnit0) {
        return this.b ? f.e() : this.x(a0, v, timeUnit0);
    }

    @Override  // rx.o
    public boolean j() {
        return this.b;
    }

    @Override  // rx.o
    public void l() {
        this.b = true;
        this.a.shutdownNow();
        h.o(this.a);
    }

    public static void o(ScheduledExecutorService scheduledExecutorService0) {
        h.h.remove(scheduledExecutorService0);
    }

    static Method q(ScheduledExecutorService scheduledExecutorService0) {
        Method[] arr_method = scheduledExecutorService0.getClass().getMethods();
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            if(method0.getName().equals("setRemoveOnCancelPolicy")) {
                Class[] arr_class = method0.getParameterTypes();
                if(arr_class.length == 1 && arr_class[0] == Boolean.TYPE) {
                    return method0;
                }
            }
        }
        return null;
    }

    // 检测为 Lambda 实现
    static void t() [...]

    public static void v(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0) {
        static final class rx.internal.schedulers.h.a implements Runnable {
            @Override
            public void run() {
                h.t();
            }
        }

        while(true) {
            AtomicReference atomicReference0 = h.i;
            if(((ScheduledExecutorService)atomicReference0.get()) != null) {
                break;
            }
            ScheduledExecutorService scheduledExecutorService0 = Executors.newScheduledThreadPool(1, new n("RxSchedulerPurge-"));
            if(d.a(atomicReference0, null, scheduledExecutorService0)) {
                scheduledExecutorService0.scheduleAtFixedRate(() -> {
                    try {
                        Iterator iterator0 = h.h.keySet().iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                return;
                            }
                            Object object0 = iterator0.next();
                            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = (ScheduledThreadPoolExecutor)object0;
                            if(scheduledThreadPoolExecutor0.isShutdown()) {
                                iterator0.remove();
                            }
                            else {
                                scheduledThreadPoolExecutor0.purge();
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                    }
                    rx.exceptions.c.e(throwable0);
                    c.I(throwable0);
                }, ((long)h.g), ((long)h.g), TimeUnit.MILLISECONDS);
                break;
            }
            scheduledExecutorService0.shutdownNow();
        }
        h.h.putIfAbsent(scheduledThreadPoolExecutor0, scheduledThreadPoolExecutor0);
    }

    public j x(rx.functions.a a0, long v, TimeUnit timeUnit0) {
        j j0 = new j(c.P(a0));
        Future future0 = v <= 0L ? this.a.submit(j0) : this.a.schedule(j0, v, timeUnit0);
        j0.a(future0);
        return j0;
    }
}

