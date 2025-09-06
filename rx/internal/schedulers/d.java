package rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

public final class d implements k {
    private final AtomicReference a;
    private static final ScheduledExecutorService[] b;
    private static final ScheduledExecutorService c;
    public static final d d;
    private static int e;

    static {
        d.b = new ScheduledExecutorService[0];
        ScheduledExecutorService scheduledExecutorService0 = Executors.newScheduledThreadPool(0);
        d.c = scheduledExecutorService0;
        scheduledExecutorService0.shutdown();
        d.d = new d();
    }

    private d() {
        this.a = new AtomicReference(d.b);
        this.start();
    }

    public static ScheduledExecutorService a() {
        ScheduledExecutorService[] arr_scheduledExecutorService = (ScheduledExecutorService[])d.d.a.get();
        if(arr_scheduledExecutorService == d.b) {
            return d.c;
        }
        int v = d.e + 1 < arr_scheduledExecutorService.length ? d.e + 1 : 0;
        d.e = v;
        return arr_scheduledExecutorService[v];
    }

    @Override  // rx.internal.schedulers.k
    public void shutdown() {
        ScheduledExecutorService[] arr_scheduledExecutorService;
        do {
            arr_scheduledExecutorService = (ScheduledExecutorService[])this.a.get();
            ScheduledExecutorService[] arr_scheduledExecutorService1 = d.b;
            if(arr_scheduledExecutorService == arr_scheduledExecutorService1) {
                return;
            }
        }
        while(!androidx.compose.animation.core.d.a(this.a, arr_scheduledExecutorService, arr_scheduledExecutorService1));
        for(int v = 0; v < arr_scheduledExecutorService.length; ++v) {
            ScheduledExecutorService scheduledExecutorService0 = arr_scheduledExecutorService[v];
            h.o(scheduledExecutorService0);
            scheduledExecutorService0.shutdownNow();
        }
    }

    @Override  // rx.internal.schedulers.k
    public void start() {
        int v = Runtime.getRuntime().availableProcessors();
        if(v > 4) {
            v /= 2;
        }
        if(v > 8) {
            v = 8;
        }
        ScheduledExecutorService[] arr_scheduledExecutorService = new ScheduledExecutorService[v];
        int v1 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            arr_scheduledExecutorService[v2] = e.a();
        }
        if(androidx.compose.animation.core.d.a(this.a, d.b, arr_scheduledExecutorService)) {
            while(v1 < v) {
                ScheduledExecutorService scheduledExecutorService0 = arr_scheduledExecutorService[v1];
                if(!h.T(scheduledExecutorService0) && scheduledExecutorService0 instanceof ScheduledThreadPoolExecutor) {
                    h.v(((ScheduledThreadPoolExecutor)scheduledExecutorService0));
                }
                ++v1;
            }
            return;
        }
        while(v1 < v) {
            arr_scheduledExecutorService[v1].shutdownNow();
            ++v1;
        }
    }
}

