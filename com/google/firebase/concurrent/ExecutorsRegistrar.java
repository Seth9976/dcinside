package com.google.firebase.concurrent;

import U1.a;
import U1.b;
import U1.c;
import U1.d;
import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.ThreadPolicy;
import com.google.firebase.components.C;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.K;
import com.google.firebase.components.g;
import com.google.firebase.components.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final C a;
    static final C b;
    static final C c;
    static final C d;

    static {
        ExecutorsRegistrar.a = new C(() -> ExecutorsRegistrar.u(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i()))));
        ExecutorsRegistrar.b = new C(() -> ExecutorsRegistrar.u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.t()))));
        ExecutorsRegistrar.c = new C(() -> ExecutorsRegistrar.u(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11))));
        ExecutorsRegistrar.d = new C(() -> Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0)));
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(new g[]{g.g(K.a(a.class, ScheduledExecutorService.class), new K[]{K.a(a.class, ExecutorService.class), K.a(a.class, Executor.class)}).f((i i0) -> ((ScheduledExecutorService)ExecutorsRegistrar.a.get())).d(), g.g(K.a(b.class, ScheduledExecutorService.class), new K[]{K.a(b.class, ExecutorService.class), K.a(b.class, Executor.class)}).f((i i0) -> ((ScheduledExecutorService)ExecutorsRegistrar.c.get())).d(), g.g(K.a(c.class, ScheduledExecutorService.class), new K[]{K.a(c.class, ExecutorService.class), K.a(c.class, Executor.class)}).f((i i0) -> ((ScheduledExecutorService)ExecutorsRegistrar.b.get())).d(), g.f(K.a(d.class, Executor.class)).f((i i0) -> P.a).d()});
    }

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder strictMode$ThreadPolicy$Builder0 = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int v = Build.VERSION.SDK_INT;
        if(v >= 23) {
            strictMode$ThreadPolicy$Builder0.detectResourceMismatches();
            if(v >= 26) {
                strictMode$ThreadPolicy$Builder0.detectUnbufferedIo();
            }
        }
        return strictMode$ThreadPolicy$Builder0.penaltyLog().build();
    }

    private static ThreadFactory j(String s, int v) {
        return new com.google.firebase.concurrent.b(s, v, null);
    }

    private static ThreadFactory k(String s, int v, StrictMode.ThreadPolicy strictMode$ThreadPolicy0) {
        return new com.google.firebase.concurrent.b(s, v, strictMode$ThreadPolicy0);
    }

    // 检测为 Lambda 实现
    private static ScheduledExecutorService l(i i0) [...]

    // 检测为 Lambda 实现
    private static ScheduledExecutorService m(i i0) [...]

    // 检测为 Lambda 实现
    private static ScheduledExecutorService n(i i0) [...]

    // 检测为 Lambda 实现
    private static Executor o(i i0) [...]

    // 检测为 Lambda 实现
    private static ScheduledExecutorService p() [...]

    // 检测为 Lambda 实现
    private static ScheduledExecutorService q() [...]

    // 检测为 Lambda 实现
    private static ScheduledExecutorService r() [...]

    // 检测为 Lambda 实现
    private static ScheduledExecutorService s() [...]

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService0) {
        return new o(executorService0, ((ScheduledExecutorService)ExecutorsRegistrar.d.get()));
    }
}

