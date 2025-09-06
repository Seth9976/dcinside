package com.tiktok.appevents;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.tiktok.b.i;
import com.tiktok.util.f;
import com.tiktok.util.g;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class p {
    public static enum b {
        THRESHOLD,
        TIMER,
        START_UP,
        FORCE_FLUSH,
        IDENTIFY,
        LOGOUT;

    }

    int a;
    final boolean b;
    final List c;
    f d;
    Lifecycle e;
    int f;
    ScheduledFuture g;
    ScheduledFuture h;
    private final Runnable i;
    final t j;
    static final String k = "Skip flushing because global switch is turned off";
    static final String l = "Skip flushing because global config is not fetched";
    static final String m = "com.tiktok.appevents.p";
    private static int n = 0;
    static final int o = 100;
    public static final String p = "SDK can\'t send tracking events to server, it will be cached locally, and will be sent in batches only after startTracking";
    static int q = 0;
    public static boolean r = true;
    public static boolean s = true;
    static ScheduledExecutorService t;
    static ScheduledExecutorService u;
    static boolean v;

    static {
        p.t = Executors.newSingleThreadScheduledExecutor(new B());
        p.u = Executors.newSingleThreadScheduledExecutor(new B());
        p.v = true;
    }

    public p(boolean z, List list0, int v, boolean z1) {
        class a implements Runnable {
            final TTActivityLifecycleCallbacksListener a;
            final p b;

            a(TTActivityLifecycleCallbacksListener tTActivityLifecycleCallbacksListener0) {
                this.a = tTActivityLifecycleCallbacksListener0;
                super();
            }

            @Override
            public void run() {
                p.this.e.a(this.a);
            }
        }

        this.f = 0;
        this.g = null;
        this.h = null;
        this.i = () -> this.s(b.b);
        this.d = new f("com.tiktok.appevents.p", com.tiktok.b.o());
        this.b = z;
        this.c = list0;
        p.n = v;
        this.a = v;
        this.e = ProcessLifecycleOwner.l().getLifecycle();
        if(z1) {
            p.v = false;
        }
        TTActivityLifecycleCallbacksListener tTActivityLifecycleCallbacksListener0 = new TTActivityLifecycleCallbacksListener(this);
        try {
            if(Looper.myLooper() == Looper.getMainLooper()) {
                this.e.a(tTActivityLifecycleCallbacksListener0);
            }
            else {
                new Handler(Looper.getMainLooper()).post(new a(this, tTActivityLifecycleCallbacksListener0));
            }
        }
        catch(Throwable unused_ex) {
        }
        this.j = new t(this);
    }

    // 检测为 Lambda 实现
    private void A(b p$b0) [...]

    // 检测为 Lambda 实现
    private static void B(i b$i0, AtomicBoolean atomicBoolean0) [...]

    // 检测为 Lambda 实现
    private static void C(@NonNull String s, @Nullable JSONObject jSONObject0, @Nullable JSONObject jSONObject1) [...]

    // 检测为 Lambda 实现
    private void D() [...]

    // 检测为 Lambda 实现
    private static void E() [...]

    // 检测为 Lambda 实现
    private void F(String s, JSONObject jSONObject0, com.tiktok.appevents.a.a a$a0, String s1) [...]

    // 检测为 Lambda 实现
    private void G(List list0) [...]

    public void H() {
        C.c(com.tiktok.b.l(), true);
        this.t(b.f);
    }

    public void I(@NonNull String s, @Nullable JSONObject jSONObject0, @Nullable JSONObject jSONObject1) {
        if(!p.v) {
            return;
        }
        this.m(() -> {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2 = z.h();
            }
            catch(Exception unused_ex) {
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("type", "metric");
                jSONObject3.put("name", s);
                if(jSONObject0 != null) {
                    jSONObject3.put("meta", jSONObject0);
                }
                if(jSONObject1 != null) {
                    jSONObject3.put("extra", jSONObject1);
                }
                jSONObject2.put("monitor", jSONObject3);
            }
            catch(Exception unused_ex) {
            }
            u.j(jSONObject2);
        });
    }

    void J() {
        this.m(() -> r.d(null));
    }

    void K() {
        this.m(new n());
    }

    void L() {
        int v = p.n;
        if(v != 0) {
            this.q(v, true);
        }
    }

    void M() {
        int v = p.n;
        if(v != 0) {
            this.q(v, false);
        }
    }

    void N() {
        ScheduledFuture scheduledFuture0 = this.g;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
            this.g = null;
        }
        ScheduledFuture scheduledFuture1 = this.h;
        if(scheduledFuture1 != null) {
            scheduledFuture1.cancel(false);
            this.h = null;
        }
    }

    public void O(String s, @Nullable JSONObject jSONObject0) {
        this.Q(com.tiktok.appevents.a.a.a, s, jSONObject0, null);
    }

    public void P(String s, @Nullable JSONObject jSONObject0, String s1) {
        this.Q(com.tiktok.appevents.a.a.a, s, jSONObject0, s1);
    }

    private void Q(com.tiktok.appevents.a.a a$a0, String s, @Nullable JSONObject jSONObject0, String s1) {
        if(com.tiktok.b.D() && false) {
            if(jSONObject0 == null) {
                jSONObject0 = new JSONObject();
            }
            this.m(() -> {
                try {
                    this.d.a("track " + s + " : " + jSONObject0.toString(4), new Object[0]);
                }
                catch(JSONException unused_ex) {
                }
                s.a(new com.tiktok.appevents.a(a$a0, s, jSONObject0.toString(), s1, com.tiktok.b.t()));
                if(s.e() > 100) {
                    this.s(b.a);
                }
            });
        }
    }

    public void R(List list0) {
        if(!com.tiktok.b.D()) {
            this.d.c("Global switch is off, ignore track purchase", new Object[0]);
            return;
        }
        this.m(() -> {
            if(list0.isEmpty()) {
                return;
            }
            for(Object object0: list0) {
                x x0 = (x)object0;
                JSONObject jSONObject0 = w.b(x0);
                if(jSONObject0 != null) {
                    this.P("Purchase", jSONObject0, x0.a());
                }
            }
        });
    }

    private void k() {
        this.j.f();
        this.M();
        this.s(b.c);
    }

    private void l(Runnable runnable0, int v) {
        try {
            p.t.schedule(runnable0, ((long)v), TimeUnit.SECONDS);
        }
        catch(Exception exception0) {
            u.b("com.tiktok.appevents.p", exception0, 2);
        }
    }

    private void m(Runnable runnable0) {
        try {
            p.t.execute(runnable0);
        }
        catch(Exception exception0) {
            u.b("com.tiktok.appevents.p", exception0, 2);
        }
    }

    public void n() {
        this.m(() -> {
            s.b();
            r.a();
        });
    }

    // 检测为 Lambda 实现
    private void o() [...]

    public void p() {
        s.b();
        this.N();
    }

    private void q(int v, boolean z) {
        if(this.g == null) {
            this.g = p.t.scheduleAtFixedRate(this.i, (z ? 0L : ((long)v)), ((long)v), TimeUnit.SECONDS);
        }
        if(this.h == null && com.tiktok.b.w != null) {
            this.a = v;
            this.h = p.u.scheduleAtFixedRate(() -> {
                com.tiktok.b.w.a(this.a);
                if(this.a == 0) {
                    this.a = v;
                }
                --this.a;
            }, 0L, 1L, TimeUnit.SECONDS);
        }
    }

    public void r(int v) {
        this.l(() -> {
            try {
                this.d.c("Fetching global config....", new Object[0]);
                HashMap hashMap0 = new HashMap();
                hashMap0.put("disableInstallApp", Boolean.valueOf(!this.j.b(com.tiktok.util.d.b.b).booleanValue()));
                hashMap0.put("disableLaunchAPP", Boolean.valueOf(!this.j.b(com.tiktok.util.d.b.d).booleanValue()));
                hashMap0.put("disable2Dretention", Boolean.valueOf(!this.j.b(com.tiktok.util.d.b.c).booleanValue()));
                JSONObject jSONObject0 = y.b(hashMap0);
                if(jSONObject0 == null) {
                    goto label_25;
                }
                JSONObject jSONObject1 = (JSONObject)jSONObject0.get("business_sdk_config");
                boolean z = jSONObject1.getBoolean("enable_sdk");
                Boolean boolean0 = Boolean.valueOf(z);
                String s = jSONObject1.getString("available_version");
                String s1 = jSONObject1.getString("domain");
                com.tiktok.b.K(boolean0);
                this.d.a("enable_sdk=" + boolean0, new Object[0]);
                if(!z) {
                    this.d.c("Clear all events and stop timers because global switch is not turned on", new Object[0]);
                    this.o();
                }
                com.tiktok.b.G(s);
                com.tiktok.b.H(s1);
                this.d.a("available_version=" + s, new Object[0]);
                com.tiktok.b.I();
                p.r = jSONObject1.optBoolean("auto_track_Retention_enable");
                p.s = jSONObject1.optBoolean("auto_track_Payment_enable");
            }
            catch(JSONException jSONException0) {
                goto label_28;
            }
            catch(Exception exception0) {
                goto label_33;
            }
            catch(Throwable throwable0) {
                goto label_41;
            }
            if(com.tiktok.b.D() && !com.tiktok.b.c) {
                com.tiktok.b.c = true;
                this.k();
                return;
                try {
                    try {
                    label_25:
                        this.d.c("Opt out of initGlobalConfig because global config is null, api returns error", new Object[0]);
                        goto label_45;
                    }
                    catch(JSONException jSONException0) {
                    }
                    catch(Exception exception0) {
                        goto label_33;
                    }
                label_28:
                    jSONException0.printStackTrace();
                    this.d.f("Errors happened during initGlobalConfig because the structure of api result is not correct", new Object[0]);
                }
                catch(Throwable throwable0) {
                    goto label_41;
                }
                if(com.tiktok.b.D() && !com.tiktok.b.c) {
                    com.tiktok.b.c = true;
                    this.k();
                    return;
                }
                return;
                try {
                label_33:
                    this.d.f("Errors occurred during initGlobalConfig because of " + exception0.getMessage(), new Object[0]);
                    exception0.printStackTrace();
                }
                catch(Throwable throwable0) {
                    goto label_41;
                }
                if(com.tiktok.b.D() && !com.tiktok.b.c) {
                    com.tiktok.b.c = true;
                    this.k();
                    return;
                }
            }
            return;
        label_41:
            if(com.tiktok.b.D() && !com.tiktok.b.c) {
                com.tiktok.b.c = true;
                this.k();
            }
            throw throwable0;
        label_45:
            if(com.tiktok.b.D() && !com.tiktok.b.c) {
                com.tiktok.b.c = true;
                this.k();
            }
        }, v);
    }

    void s(b p$b0) {
        long v = System.currentTimeMillis();
        g.a("com.tiktok.appevents.p");
        int v1 = 0;
        if(!com.tiktok.b.z().booleanValue()) {
            this.d.c("Skip flushing because global config is not fetched", new Object[0]);
            return;
        }
        if(!com.tiktok.b.D()) {
            this.d.c("Skip flushing because global switch is turned off", new Object[0]);
            return;
        }
        try {
            if(com.tiktok.b.p()) {
                this.d.a("Start flush, version %d reason is %s", new Object[]{this.f, p$b0.name()});
                q q0 = r.e();
                q0.a(s.c());
                int v2 = q0.b().size();
                try {
                    List list0 = y.e(z.d(), q0.b());
                    if(!list0.isEmpty()) {
                        this.d.a("Failed to send %d events, will save to disk", new Object[]{list0.size()});
                        r.d(list0);
                    }
                    this.d.a("END flush, version %d reason is %s", new Object[]{this.f, p$b0.name()});
                    ++this.f;
                    v1 = v2;
                }
                catch(Exception exception0) {
                    v1 = v2;
                    goto label_29;
                }
            }
            else {
                this.d.c("SDK can\'t send tracking events to server, it will be cached locally, and will be sent in batches only after startTracking", new Object[0]);
                r.d(null);
            }
            goto label_30;
        }
        catch(Exception exception0) {
        }
    label_29:
        u.b("com.tiktok.appevents.p", exception0, 2);
    label_30:
        if(v1 != 0) {
            try {
                this.I("flush", g.c(v).put("latency", System.currentTimeMillis() - v).put("type", p$b0.name()).put("interval", p.n).put("size", v1), null);
            }
            catch(Exception unused_ex) {
            }
        }
        this.m(new c());
    }

    public void t(b p$b0) {
        this.d.a(p$b0.name() + " triggered flush", new Object[0]);
        this.m(() -> this.s(p$b0));
    }

    public void u() {
        this.t(b.d);
    }

    public static List v() {
        return y.c();
    }

    public boolean w(String s, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
        C c0 = C.h;
        if(c0.b()) {
            this.d.f("SDK is already identified, if you want to switch to anotheruser account, plz call TiktokBusinessSDK.logout() first and then identify", new Object[0]);
            return false;
        }
        c0.g();
        if(!TextUtils.isEmpty(s)) {
            c0.e(s);
        }
        if(!TextUtils.isEmpty(s1)) {
            c0.f(s1);
        }
        if(!TextUtils.isEmpty(s2)) {
            c0.h(s2);
        }
        if(!TextUtils.isEmpty(s3)) {
            c0.d(s3);
        }
        this.Q(com.tiktok.appevents.a.a.b, null, null, null);
        this.t(b.e);
        return true;
    }

    public void x(long v, i b$i0, AtomicBoolean atomicBoolean0) {
        this.m(new d());
        this.m(new e());
        this.m(() -> if(b$i0 != null) {
            try {
                b$i0.fail(-2, "Invalid appId or tiktokAppId");
                return;
            }
            catch(Throwable throwable0) {
            }
            throwable0.printStackTrace();
        });
        this.m(new c());
        this.r(0);
        this.I("init_start", g.c(v), null);
    }

    // 检测为 Lambda 实现
    private void y(int v) [...]

    // 检测为 Lambda 实现
    private void z() [...]
}

