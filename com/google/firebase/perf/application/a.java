package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.f;
import com.google.firebase.perf.util.i;
import com.google.firebase.perf.v1.g;
import com.google.firebase.perf.v1.x;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class a implements Application.ActivityLifecycleCallbacks {
    public interface com.google.firebase.perf.application.a.a {
        void a();
    }

    public interface b {
        void onUpdateAppState(g arg1);
    }

    private final WeakHashMap a;
    private final WeakHashMap b;
    private final WeakHashMap c;
    private final WeakHashMap d;
    private final Map e;
    private final Set f;
    private Set g;
    private final AtomicInteger h;
    private final k i;
    private final com.google.firebase.perf.config.a j;
    private final com.google.firebase.perf.util.a k;
    private final boolean l;
    private Timer m;
    private Timer n;
    private g o;
    private boolean p;
    private boolean q;
    private static final com.google.firebase.perf.logging.a r;
    private static volatile a s;

    static {
        a.r = com.google.firebase.perf.logging.a.e();
    }

    a(k k0, com.google.firebase.perf.util.a a0) {
        this(k0, a0, com.google.firebase.perf.config.a.h(), true);
    }

    @VisibleForTesting
    a(k k0, com.google.firebase.perf.util.a a0, com.google.firebase.perf.config.a a1, boolean z) {
        this.a = new WeakHashMap();
        this.b = new WeakHashMap();
        this.c = new WeakHashMap();
        this.d = new WeakHashMap();
        this.e = new HashMap();
        this.f = new HashSet();
        this.g = new HashSet();
        this.h = new AtomicInteger(0);
        this.o = g.d;
        this.p = false;
        this.q = true;
        this.i = k0;
        this.k = a0;
        this.j = a1;
        this.l = z;
    }

    @VisibleForTesting
    WeakHashMap a() {
        return this.d;
    }

    public g b() {
        return this.o;
    }

    public static a c() {
        if(a.s == null) {
            Class class0 = a.class;
            synchronized(class0) {
                if(a.s == null) {
                    a.s = new a(k.l(), new com.google.firebase.perf.util.a());
                }
            }
        }
        return a.s;
    }

    @VisibleForTesting
    Timer d() {
        return this.n;
    }

    @VisibleForTesting
    Timer e() {
        return this.m;
    }

    @VisibleForTesting
    WeakHashMap f() {
        return this.a;
    }

    public static String g(Activity activity0) {
        return "_st_" + activity0.getClass().getSimpleName();
    }

    public void h(@NonNull String s, long v) {
        synchronized(this.e) {
            Long long0 = (Long)this.e.get(s);
            if(long0 == null) {
                this.e.put(s, v);
            }
            else {
                this.e.put(s, ((long)(((long)long0) + v)));
            }
        }
    }

    public void i(int v) {
        this.h.addAndGet(v);
    }

    public boolean j() {
        return this.q;
    }

    public boolean k() {
        return this.o == g.c;
    }

    private static boolean l() [...] // 潜在的解密器

    protected boolean m() {
        return this.l;
    }

    public void n(Context context0) {
        synchronized(this) {
            if(this.p) {
                return;
            }
            Context context1 = context0.getApplicationContext();
            if(context1 instanceof Application) {
                ((Application)context1).registerActivityLifecycleCallbacks(this);
                this.p = true;
            }
        }
    }

    public void o(com.google.firebase.perf.application.a.a a$a0) {
        synchronized(this.g) {
            this.g.add(a$a0);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity0, Bundle bundle0) {
        this.v(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity0) {
        this.b.remove(activity0);
        if(this.c.containsKey(activity0)) {
            ((FragmentActivity)activity0).getSupportFragmentManager().f2(((FragmentLifecycleCallbacks)this.c.remove(activity0)));
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity0) {
        synchronized(this) {
            if(this.a.isEmpty()) {
                this.m = this.k.a();
                this.a.put(activity0, Boolean.TRUE);
                if(this.q) {
                    this.y(g.c);
                    this.q();
                    this.q = false;
                }
                else {
                    this.s("_bs", this.n, this.m);
                    this.y(g.c);
                }
            }
            else {
                this.a.put(activity0, Boolean.TRUE);
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity0) {
        synchronized(this) {
            if(this.m() && this.j.N()) {
                if(!this.b.containsKey(activity0)) {
                    this.v(activity0);
                }
                ((d)this.b.get(activity0)).c();
                Trace trace0 = new Trace(a.g(activity0), this.i, this.k, this);
                trace0.start();
                this.d.put(activity0, trace0);
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
        synchronized(this) {
            if(this.m()) {
                this.r(activity0);
            }
            if(this.a.containsKey(activity0)) {
                this.a.remove(activity0);
                if(this.a.isEmpty()) {
                    this.n = this.k.a();
                    this.s("_fs", this.m, this.n);
                    this.y(g.d);
                }
            }
        }
    }

    public void p(WeakReference weakReference0) {
        synchronized(this.f) {
            this.f.add(weakReference0);
        }
    }

    private void q() {
        synchronized(this.g) {
            for(Object object0: this.g) {
                com.google.firebase.perf.application.a.a a$a0 = (com.google.firebase.perf.application.a.a)object0;
                if(a$a0 != null) {
                    a$a0.a();
                }
            }
        }
    }

    private void r(Activity activity0) {
        Trace trace0 = (Trace)this.d.get(activity0);
        if(trace0 == null) {
            return;
        }
        this.d.remove(activity0);
        f f0 = ((d)this.b.get(activity0)).e();
        if(!f0.d()) {
            Object[] arr_object = {activity0.getClass().getSimpleName()};
            a.r.m("Failed to record frame data for %s.", arr_object);
            return;
        }
        i.a(trace0, ((com.google.firebase.perf.metrics.h.a)f0.c()));
        trace0.stop();
    }

    private void s(String s, Timer timer0, Timer timer1) {
        if(!this.j.N()) {
            return;
        }
        com.google.firebase.perf.v1.x.b x$b0 = x.Xb().Xb(s).Ub(timer0.f()).Vb(timer0.e(timer1)).zb(SessionManager.getInstance().perfSession().a());
        int v = this.h.getAndSet(0);
        synchronized(this.e) {
            x$b0.Mb(this.e);
            if(v != 0) {
                x$b0.Ob("_tsns", ((long)v));
            }
            this.e.clear();
        }
        x x0 = (x)x$b0.build();
        this.i.I(x0, g.e);
    }

    @VisibleForTesting
    public void t(boolean z) {
        this.q = z;
    }

    @VisibleForTesting
    void u(Timer timer0) {
        this.n = timer0;
    }

    private void v(Activity activity0) {
        if(this.m() && this.j.N()) {
            d d0 = new d(activity0);
            this.b.put(activity0, d0);
            if(activity0 instanceof FragmentActivity) {
                c c0 = new c(this.k, this.i, this, d0);
                this.c.put(activity0, c0);
                ((FragmentActivity)activity0).getSupportFragmentManager().B1(c0, true);
            }
        }
    }

    public void w(Context context0) {
        synchronized(this) {
            if(!this.p) {
                return;
            }
            Context context1 = context0.getApplicationContext();
            if(context1 instanceof Application) {
                ((Application)context1).unregisterActivityLifecycleCallbacks(this);
                this.p = false;
            }
        }
    }

    public void x(WeakReference weakReference0) {
        synchronized(this.f) {
            this.f.remove(weakReference0);
        }
    }

    private void y(g g0) {
        this.o = g0;
        synchronized(this.f) {
            Iterator iterator0 = this.f.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                b a$b0 = (b)((WeakReference)object0).get();
                if(a$b0 == null) {
                    iterator0.remove();
                }
                else {
                    a$b0.onUpdateAppState(this.o);
                }
            }
        }
    }
}

