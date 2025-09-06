package com.google.firebase.perf.transport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.h;
import com.google.firebase.perf.application.a.b;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.e;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.v1.g;
import com.google.firebase.perf.v1.m;
import com.google.firebase.perf.v1.q;
import com.google.firebase.perf.v1.s;
import com.google.firebase.perf.v1.t;
import com.google.firebase.perf.v1.x;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public class k implements b {
    private static final int A = 50;
    private final Map a;
    private final ConcurrentLinkedQueue b;
    private final AtomicBoolean c;
    private h d;
    @Nullable
    private e e;
    private com.google.firebase.installations.k f;
    private h2.b g;
    private com.google.firebase.perf.transport.b h;
    private ExecutorService i;
    private Context j;
    private a k;
    private d l;
    private com.google.firebase.perf.application.a m;
    private com.google.firebase.perf.v1.e.b n;
    private String o;
    private String p;
    private boolean q;
    private static final com.google.firebase.perf.logging.a r = null;
    private static final k s = null;
    private static final int t = 0;
    private static final int u = 1;
    private static final String v = "KEY_AVAILABLE_TRACES_FOR_CACHING";
    private static final String w = "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING";
    private static final String x = "KEY_AVAILABLE_GAUGES_FOR_CACHING";
    private static final int y = 50;
    private static final int z = 50;

    static {
        k.r = com.google.firebase.perf.logging.a.e();
        k.s = new k();
    }

    @SuppressLint({"ThreadPoolCreation"})
    private k() {
        this.b = new ConcurrentLinkedQueue();
        this.c = new AtomicBoolean(false);
        this.q = false;
        this.i = new ThreadPoolExecutor(0, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
        this.a = concurrentHashMap0;
        concurrentHashMap0.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap0.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap0.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    // 检测为 Lambda 实现
    private void A(q q0, g g0) [...]

    // 检测为 Lambda 实现
    private void B(m m0, g g0) [...]

    // 检测为 Lambda 实现
    private void C() [...]

    public void D(m m0) {
        this.E(m0, g.b);
    }

    public void E(m m0, g g0) {
        this.i.execute(() -> this.M(s.Cb().Hb(m0), g0));
    }

    public void F(q q0) {
        this.G(q0, g.b);
    }

    public void G(q q0, g g0) {
        this.i.execute(() -> this.M(s.Cb().Jb(q0), g0));
    }

    public void H(x x0) {
        this.I(x0, g.b);
    }

    public void I(x x0, g g0) {
        this.i.execute(() -> this.M(s.Cb().Lb(x0), g0));
    }

    private s J(com.google.firebase.perf.v1.s.b s$b0, g g0) {
        this.N();
        com.google.firebase.perf.v1.e.b e$b0 = this.n.Hb(g0);
        if(s$b0.t9() || s$b0.s7()) {
            e$b0 = ((com.google.firebase.perf.v1.e.b)e$b0.clone()).Ab(this.k());
        }
        return (s)s$b0.Eb(e$b0).build();
    }

    @VisibleForTesting
    protected void K(boolean z) {
        this.c.set(z);
    }

    // 检测为 Lambda 实现
    @WorkerThread
    private void L() [...]

    @WorkerThread
    private void M(com.google.firebase.perf.v1.s.b s$b0, g g0) {
        if(!this.x()) {
            if(this.v(s$b0)) {
                Object[] arr_object = {k.o(s$b0)};
                k.r.b("Transport is not initialized yet, %s will be queued for to be dispatched later", arr_object);
                c c0 = new c(s$b0, g0);
                this.b.add(c0);
            }
            return;
        }
        s s0 = this.J(s$b0, g0);
        if(this.w(s0)) {
            this.h(s0);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    @WorkerThread
    private void N() {
        String s;
        if(!this.k.N() || this.n.G5() && !this.q) {
            return;
        }
        try {
            s = (String)Tasks.await(this.f.getId(), 60000L, TimeUnit.MILLISECONDS);
            goto label_13;
        }
        catch(ExecutionException executionException0) {
            k.r.d("Unable to retrieve Installation Id: %s", new Object[]{executionException0.getMessage()});
        }
        catch(InterruptedException interruptedException0) {
            k.r.d("Task to retrieve Installation Id is interrupted: %s", new Object[]{interruptedException0.getMessage()});
        }
        catch(TimeoutException timeoutException0) {
            k.r.d("Task to retrieve Installation Id is timed out: %s", new Object[]{timeoutException0.getMessage()});
        }
        s = null;
    label_13:
        if(!TextUtils.isEmpty(s)) {
            this.n.Fb(s);
            return;
        }
        k.r.l("Firebase Installation Id is empty, contact Firebase Support for debugging.");
    }

    private void O() {
        if(this.e == null && this.x()) {
            this.e = e.c();
        }
    }

    @VisibleForTesting
    protected void g() {
        this.n.vb();
    }

    @WorkerThread
    private void h(s s0) {
        if(s0.t9()) {
            Object[] arr_object = {k.o(s0), this.j(s0.y9())};
            k.r.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", arr_object);
        }
        else {
            Object[] arr_object1 = {k.o(s0)};
            k.r.g("Logging %s", arr_object1);
        }
        this.h.b(s0);
    }

    private void i() {
        this.m.p(new WeakReference(k.s));
        com.google.firebase.perf.v1.e.b e$b0 = com.google.firebase.perf.v1.e.xb();
        this.n = e$b0;
        e$b0.Ib(this.d.s().j()).Db(com.google.firebase.perf.v1.a.v8().xb(this.o).zb("21.0.1").Bb(k.r(this.j)));
        this.c.set(true);
        while(!this.b.isEmpty()) {
            c c0 = (c)this.b.poll();
            if(c0 != null) {
                this.i.execute(() -> this.M(c0.a, c0.b));
            }
        }
    }

    // 去混淆评级： 中等(110)
    private String j(x x0) {
        return com.google.firebase.perf.logging.b.a(this.p, this.o, "");
    }

    private Map k() {
        this.O();
        e e0 = this.e;
        return e0 == null ? Collections.emptyMap() : e0.getAttributes();
    }

    public static k l() {
        return k.s;
    }

    private static String m(m m0) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(m0.Y9()), m0.j5(), m0.j1());
    }

    // 去混淆评级： 低(40)
    private static String n(q q0) {
        long v = q0.d5() ? q0.w1() : 0L;
        return q0.T6() ? String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", "", String.valueOf(q0.M7()), new DecimalFormat("#.####").format(((double)v) / 1000.0)) : String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", "", "UNKNOWN", new DecimalFormat("#.####").format(((double)v) / 1000.0));
    }

    private static String o(t t0) {
        if(t0.t9()) {
            return k.p(t0.y9());
        }
        if(t0.s7()) {
            return k.n(t0.s2());
        }
        return t0.e6() ? k.m(t0.e5()) : "log";
    }

    @Override  // com.google.firebase.perf.application.a$b
    public void onUpdateAppState(g g0) {
        this.q = g0 == g.c;
        if(this.x()) {
            this.i.execute(() -> this.l.a(this.q));
        }
    }

    private static String p(x x0) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", x0.getName(), new DecimalFormat("#.####").format(((double)x0.c1()) / 1000.0));
    }

    @VisibleForTesting
    protected ConcurrentLinkedQueue q() {
        return new ConcurrentLinkedQueue(this.b);
    }

    private static String r(Context context0) {
        try {
            String s = context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0).versionName;
            if(s != null) {
                return s;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return "";
    }

    private void s(s s0) {
        if(s0.t9()) {
            this.m.h("_fstec", 1L);
            return;
        }
        if(s0.s7()) {
            this.m.h("_fsntc", 1L);
        }
    }

    public void t(@NonNull h h0, @NonNull com.google.firebase.installations.k k0, @NonNull h2.b b0) {
        this.d = h0;
        this.p = h0.s().n();
        this.f = k0;
        this.g = b0;
        this.i.execute(() -> {
            this.j = this.d.n();
            this.o = "com.dcinside.app.android";
            this.k = a.h();
            this.l = new d(this.j, new com.google.firebase.perf.util.h(100L, 1L, TimeUnit.MINUTES), 500L);
            this.m = com.google.firebase.perf.application.a.c();
            this.h = new com.google.firebase.perf.transport.b(this.g, this.k.b());
            this.i();
        });
    }

    @VisibleForTesting(otherwise = 5)
    void u(h h0, e e0, com.google.firebase.installations.k k0, h2.b b0, a a0, d d0, com.google.firebase.perf.application.a a1, com.google.firebase.perf.transport.b b1, ExecutorService executorService0) {
        this.d = h0;
        this.p = h0.s().n();
        this.j = h0.n();
        this.e = e0;
        this.f = k0;
        this.g = b0;
        this.k = a0;
        this.l = d0;
        this.m = a1;
        this.h = b1;
        this.i = executorService0;
        this.a.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        this.a.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        this.a.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
        this.i();
    }

    @WorkerThread
    private boolean v(t t0) {
        Integer integer0 = (Integer)this.a.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int v = (int)integer0;
        Integer integer1 = (Integer)this.a.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int v1 = (int)integer1;
        Integer integer2 = (Integer)this.a.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int v2 = (int)integer2;
        if(t0.t9() && v > 0) {
            this.a.put("KEY_AVAILABLE_TRACES_FOR_CACHING", ((int)(v - 1)));
            return true;
        }
        if(t0.s7() && v1 > 0) {
            this.a.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", ((int)(v1 - 1)));
            return true;
        }
        if(t0.e6() && v2 > 0) {
            this.a.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", ((int)(v2 - 1)));
            return true;
        }
        Object[] arr_object = {k.o(t0), integer0, integer1, integer2};
        k.r.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", arr_object);
        return false;
    }

    @WorkerThread
    private boolean w(s s0) {
        if(!this.k.N()) {
            Object[] arr_object = {k.o(s0)};
            k.r.g("Performance collection is not enabled, dropping %s", arr_object);
            return false;
        }
        if(!s0.W1().G5()) {
            Object[] arr_object1 = {k.o(s0)};
            k.r.m("App Instance ID is null or empty, dropping %s", arr_object1);
            return false;
        }
        if(!com.google.firebase.perf.metrics.validator.e.b(s0, this.j)) {
            Object[] arr_object2 = {k.o(s0)};
            k.r.m("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", arr_object2);
            return false;
        }
        if(!this.l.k(s0)) {
            this.s(s0);
            Object[] arr_object3 = {k.o(s0)};
            k.r.g("Event dropped due to device sampling - %s", arr_object3);
            return false;
        }
        if(this.l.j(s0)) {
            this.s(s0);
            Object[] arr_object4 = {k.o(s0)};
            k.r.g("Rate limited (per device) - %s", arr_object4);
            return false;
        }
        return true;
    }

    public boolean x() {
        return this.c.get();
    }

    // 检测为 Lambda 实现
    private void y(c c0) [...]

    // 检测为 Lambda 实现
    private void z(x x0, g g0) [...]
}

