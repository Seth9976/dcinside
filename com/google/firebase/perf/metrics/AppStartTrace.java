package com.google.firebase.perf.metrics;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver.OnDrawListener;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.firebase.h;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.d;
import com.google.firebase.perf.util.g;
import com.google.firebase.perf.v1.x;
import com.google.firebase.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AppStartTrace implements Application.ActivityLifecycleCallbacks, LifecycleObserver {
    static class a {
    }

    final class b implements ViewTreeObserver.OnDrawListener {
        final AppStartTrace a;

        private b() {
        }

        b(a appStartTrace$a0) {
        }

        @Override  // android.view.ViewTreeObserver$OnDrawListener
        public void onDraw() {
            AppStartTrace.h(AppStartTrace.this);
        }
    }

    public static class c implements Runnable {
        private final AppStartTrace a;

        public c(AppStartTrace appStartTrace0) {
            this.a = appStartTrace0;
        }

        @Override
        public void run() {
            if(this.a.l == null) {
                this.a.u = true;
            }
        }
    }

    private static final int A = 0;
    private static final int B = 1;
    private static volatile AppStartTrace C;
    private static ExecutorService D;
    private boolean a;
    private final k b;
    private final com.google.firebase.perf.util.a c;
    private final com.google.firebase.perf.config.a d;
    private final com.google.firebase.perf.v1.x.b e;
    private Context f;
    private WeakReference g;
    private WeakReference h;
    private boolean i;
    @Nullable
    private final Timer j;
    @Nullable
    private final Timer k;
    private Timer l;
    private Timer m;
    private Timer n;
    private Timer o;
    @Nullable
    private Timer p;
    private Timer q;
    private Timer r;
    private Timer s;
    private PerfSession t;
    private boolean u;
    private int v;
    private final b w;
    private boolean x;
    @NonNull
    private static final Timer y;
    private static final long z;

    static {
        AppStartTrace.y = new com.google.firebase.perf.util.a().a();
        AppStartTrace.z = TimeUnit.MINUTES.toMicros(1L);
    }

    AppStartTrace(@NonNull k k0, @NonNull com.google.firebase.perf.util.a a0, @NonNull com.google.firebase.perf.config.a a1, @NonNull ExecutorService executorService0) {
        this.a = false;
        this.i = false;
        Timer timer0 = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.u = false;
        this.v = 0;
        this.w = () -> {
            int v = AppStartTrace.this.v;
            AppStartTrace.this.v = v + 1;
            return v;
        };
        this.x = false;
        this.b = k0;
        this.c = a0;
        this.d = a1;
        AppStartTrace.D = executorService0;
        this.e = x.Xb().Xb("_experiment_app_start_ttid");
        this.j = Build.VERSION.SDK_INT < 24 ? null : Timer.g(Process.getStartElapsedRealtime());
        u u0 = (u)h.p().l(u.class);
        if(u0 != null) {
            timer0 = Timer.g(u0.b());
        }
        this.k = timer0;
    }

    // 检测为 Lambda 实现
    private void A() [...]

    // 检测为 Lambda 实现
    private void B() [...]

    public void C(@NonNull Context context0) {
        synchronized(this) {
            if(this.a) {
                return;
            }
            ProcessLifecycleOwner.l().getLifecycle().a(this);
            Context context1 = context0.getApplicationContext();
            if(context1 instanceof Application) {
                ((Application)context1).registerActivityLifecycleCallbacks(this);
                this.x = this.x || AppStartTrace.u(context1);
                this.a = true;
                this.f = context1;
            }
        }
    }

    @VisibleForTesting
    void D() {
        this.u = true;
    }

    public void E() {
        synchronized(this) {
            if(!this.a) {
                return;
            }
            ProcessLifecycleOwner.l().getLifecycle().d(this);
            ((Application)this.f).unregisterActivityLifecycleCallbacks(this);
            this.a = false;
        }
    }

    // 检测为 Lambda 实现
    static int h(AppStartTrace appStartTrace0) [...]

    @Nullable
    @VisibleForTesting
    Activity i() {
        return (Activity)this.h.get();
    }

    @NonNull
    private Timer j() {
        return this.k == null ? AppStartTrace.y : this.k;
    }

    public static AppStartTrace k() {
        return AppStartTrace.C == null ? AppStartTrace.l(k.l(), new com.google.firebase.perf.util.a()) : AppStartTrace.C;
    }

    @SuppressLint({"ThreadPoolCreation"})
    static AppStartTrace l(k k0, com.google.firebase.perf.util.a a0) {
        if(AppStartTrace.C == null) {
            Class class0 = AppStartTrace.class;
            synchronized(class0) {
                if(AppStartTrace.C == null) {
                    com.google.firebase.perf.config.a a1 = com.google.firebase.perf.config.a.h();
                    TimeUnit timeUnit0 = TimeUnit.SECONDS;
                    LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
                    AppStartTrace.C = new AppStartTrace(k0, a0, a1, new ThreadPoolExecutor(0, 1, AppStartTrace.z + 10L, timeUnit0, linkedBlockingQueue0));
                }
            }
        }
        return AppStartTrace.C;
    }

    @Nullable
    @VisibleForTesting
    Activity o() {
        return (Activity)this.g.get();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity0, Bundle bundle0) {
        synchronized(this) {
            if(!this.u && this.l == null) {
                this.x = this.x || AppStartTrace.u(this.f);
                this.g = new WeakReference(activity0);
                this.l = this.c.a();
                if(this.t().e(this.l) > AppStartTrace.z) {
                    this.i = true;
                }
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity0) {
        if(!this.u && !this.i && this.d.i()) {
            activity0.findViewById(0x1020002).getViewTreeObserver().removeOnDrawListener(this.w);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity0) {
        synchronized(this) {
            if(!this.u && !this.i) {
                boolean z = this.d.i();
                if(z) {
                    View view0 = activity0.findViewById(0x1020002);
                    view0.getViewTreeObserver().addOnDrawListener(this.w);
                    d.e(view0, () -> {
                        if(this.s != null) {
                            return;
                        }
                        this.s = this.c.a();
                        x x0 = (x)x.Xb().Xb("_experiment_onDrawFoQ").Ub(this.t().f()).Vb(this.t().e(this.s)).build();
                        this.e.Db(x0);
                        if(this.j != null) {
                            x x1 = (x)x.Xb().Xb("_experiment_procStart_to_classLoad").Ub(this.t().f()).Vb(this.t().e(this.j())).build();
                            this.e.Db(x1);
                        }
                        this.e.Pb("systemDeterminedForeground", (this.x ? "true" : "false"));
                        this.e.Ob("onDrawCount", ((long)this.v));
                        com.google.firebase.perf.v1.u u0 = this.t.a();
                        this.e.zb(u0);
                        this.y(this.e);
                    });
                    g.a(view0, () -> {
                        if(this.q != null) {
                            return;
                        }
                        this.q = this.c.a();
                        long v = this.t().f();
                        this.e.Ub(v).Vb(this.t().e(this.q));
                        this.y(this.e);
                    }, () -> {
                        if(this.r != null) {
                            return;
                        }
                        this.r = this.c.a();
                        x x0 = (x)x.Xb().Xb("_experiment_preDrawFoQ").Ub(this.t().f()).Vb(this.t().e(this.r)).build();
                        this.e.Db(x0);
                        this.y(this.e);
                    });
                }
                if(this.n != null) {
                    return;
                }
                this.h = new WeakReference(activity0);
                this.n = this.c.a();
                this.t = SessionManager.getInstance().perfSession();
                com.google.firebase.perf.logging.a.e().a("onResume(): " + activity0.getClass().getName() + ": " + this.j().e(this.n) + " microseconds");
                AppStartTrace.D.execute(() -> {
                    com.google.firebase.perf.v1.x.b x$b0 = x.Xb().Xb("_as").Ub(this.j().f()).Vb(this.j().e(this.n));
                    ArrayList arrayList0 = new ArrayList(3);
                    arrayList0.add(((x)x.Xb().Xb("_astui").Ub(this.j().f()).Vb(this.j().e(this.l)).build()));
                    if(this.m != null) {
                        com.google.firebase.perf.v1.x.b x$b1 = x.Xb();
                        x$b1.Xb("_astfd").Ub(this.l.f()).Vb(this.l.e(this.m));
                        arrayList0.add(((x)x$b1.build()));
                        com.google.firebase.perf.v1.x.b x$b2 = x.Xb();
                        x$b2.Xb("_asti").Ub(this.m.f()).Vb(this.m.e(this.n));
                        arrayList0.add(((x)x$b2.build()));
                    }
                    x$b0.vb(arrayList0).zb(this.t.a());
                    x x0 = (x)x$b0.build();
                    this.b.I(x0, com.google.firebase.perf.v1.g.e);
                });
                if(!z) {
                    this.E();
                }
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity0) {
        synchronized(this) {
            if(!this.u && this.m == null && !this.i) {
                this.m = this.c.a();
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity0) {
    }

    @Keep
    @OnLifecycleEvent(Event.ON_STOP)
    public void onAppEnteredBackground() {
        if(!this.u && !this.i && this.p == null) {
            this.p = this.c.a();
            x x0 = (x)x.Xb().Xb("_experiment_firstBackgrounding").Ub(this.t().f()).Vb(this.t().e(this.p)).build();
            this.e.Db(x0);
        }
    }

    @Keep
    @OnLifecycleEvent(Event.ON_START)
    public void onAppEnteredForeground() {
        if(!this.u && !this.i && this.o == null) {
            this.o = this.c.a();
            x x0 = (x)x.Xb().Xb("_experiment_firstForegrounding").Ub(this.t().f()).Vb(this.t().e(this.o)).build();
            this.e.Db(x0);
        }
    }

    @VisibleForTesting
    Timer p() {
        return this.l;
    }

    @VisibleForTesting
    Timer q() {
        return this.n;
    }

    @VisibleForTesting
    Timer s() {
        return this.m;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String s) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String s) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String s) {
    }

    @NonNull
    private Timer t() {
        return this.j == null ? this.j() : this.j;
    }

    public static boolean u(Context context0) {
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        if(activityManager0 == null) {
            return true;
        }
        List list0 = activityManager0.getRunningAppProcesses();
        if(list0 != null) {
            for(Object object0: list0) {
                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                if(activityManager$RunningAppProcessInfo0.importance == 100 && (activityManager$RunningAppProcessInfo0.processName.equals("com.dcinside.app.android") || activityManager$RunningAppProcessInfo0.processName.startsWith("com.dcinside.app.android:")) && (Build.VERSION.SDK_INT >= 23 ? true : AppStartTrace.v(context0))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public static boolean v(Context context0) {
        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
        return powerManager0 == null ? true : powerManager0.isInteractive();
    }

    // 检测为 Lambda 实现
    private void w(com.google.firebase.perf.v1.x.b x$b0) [...]

    // 检测为 Lambda 实现
    private void x() [...]

    private void y(com.google.firebase.perf.v1.x.b x$b0) {
        if(this.q != null && this.r != null && this.s != null) {
            AppStartTrace.D.execute(() -> {
                x x0 = (x)x$b0.build();
                this.b.I(x0, com.google.firebase.perf.v1.g.e);
            });
            this.E();
        }
    }

    // 检测为 Lambda 实现
    private void z() [...]
}

