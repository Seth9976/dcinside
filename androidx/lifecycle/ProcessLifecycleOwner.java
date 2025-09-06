package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public final class ProcessLifecycleOwner implements LifecycleOwner {
    @RequiresApi(29)
    public static final class Api29Impl {
        @l
        public static final Api29Impl a;

        static {
            Api29Impl.a = new Api29Impl();
        }

        @DoNotInline
        @n
        public static final void a(@l Activity activity0, @l Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0) {
            L.p(activity0, "activity");
            L.p(application$ActivityLifecycleCallbacks0, "callback");
            activity0.registerActivityLifecycleCallbacks(application$ActivityLifecycleCallbacks0);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final LifecycleOwner a() {
            return ProcessLifecycleOwner.k;
        }

        @VisibleForTesting
        public static void b() {
        }

        @n
        public final void c(@l Context context0) {
            L.p(context0, "context");
            ProcessLifecycleOwner.k.h(context0);
        }
    }

    private int a;
    private int b;
    private boolean c;
    private boolean d;
    @m
    private Handler e;
    @l
    private final LifecycleRegistry f;
    @l
    private final Runnable g;
    @l
    private final ActivityInitializationListener h;
    @l
    public static final Companion i = null;
    public static final long j = 700L;
    @l
    private static final ProcessLifecycleOwner k;

    static {
        ProcessLifecycleOwner.i = new Companion(null);
        ProcessLifecycleOwner.k = new ProcessLifecycleOwner();
    }

    private ProcessLifecycleOwner() {
        this.c = true;
        this.d = true;
        this.f = new LifecycleRegistry(this);
        this.g = () -> {
            L.p(this, "this$0");
            this.j();
            this.k();
        };
        this.h = new ActivityInitializationListener() {
            @Override  // androidx.lifecycle.ReportFragment$ActivityInitializationListener
            public void onCreate() {
            }

            @Override  // androidx.lifecycle.ReportFragment$ActivityInitializationListener
            public void onResume() {
                this.a.e();
            }

            @Override  // androidx.lifecycle.ReportFragment$ActivityInitializationListener
            public void onStart() {
                this.a.f();
            }
        };
    }

    public final void d() {
        int v = this.b - 1;
        this.b = v;
        if(v == 0) {
            Handler handler0 = this.e;
            L.m(handler0);
            handler0.postDelayed(this.g, 700L);
        }
    }

    public final void e() {
        int v = this.b + 1;
        this.b = v;
        if(v == 1) {
            if(this.c) {
                this.f.l(Event.ON_RESUME);
                this.c = false;
                return;
            }
            Handler handler0 = this.e;
            L.m(handler0);
            handler0.removeCallbacks(this.g);
        }
    }

    public final void f() {
        int v = this.a + 1;
        this.a = v;
        if(v == 1 && this.d) {
            this.f.l(Event.ON_START);
            this.d = false;
        }
    }

    public final void g() {
        --this.a;
        this.k();
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @l
    public Lifecycle getLifecycle() {
        return this.f;
    }

    public final void h(@l Context context0) {
        L.p(context0, "context");
        this.e = new Handler();
        this.f.l(Event.ON_CREATE);
        Context context1 = context0.getApplicationContext();
        L.n(context1, "null cannot be cast to non-null type android.app.Application");
        ((Application)context1).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() {
            @Override  // androidx.lifecycle.EmptyActivityLifecycleCallbacks
            public void onActivityCreated(@l Activity activity0, @m Bundle bundle0) {
                L.p(activity0, "activity");
                if(Build.VERSION.SDK_INT < 29) {
                    ReportFragment.b.b(activity0).h(ProcessLifecycleOwner.this.h);
                }
            }

            @Override  // androidx.lifecycle.EmptyActivityLifecycleCallbacks
            public void onActivityPaused(@l Activity activity0) {
                L.p(activity0, "activity");
                ProcessLifecycleOwner.this.d();
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            @RequiresApi(29)
            public void onActivityPreCreated(@l Activity activity0, @m Bundle bundle0) {
                L.p(activity0, "activity");
                Api29Impl.a(activity0, new EmptyActivityLifecycleCallbacks() {
                    @Override  // android.app.Application$ActivityLifecycleCallbacks
                    public void onActivityPostResumed(@l Activity activity0) {
                        L.p(activity0, "activity");
                        ProcessLifecycleOwner.this.e();
                    }

                    @Override  // android.app.Application$ActivityLifecycleCallbacks
                    public void onActivityPostStarted(@l Activity activity0) {
                        L.p(activity0, "activity");
                        ProcessLifecycleOwner.this.f();
                    }
                });
            }

            @Override  // androidx.lifecycle.EmptyActivityLifecycleCallbacks
            public void onActivityStopped(@l Activity activity0) {
                L.p(activity0, "activity");
                ProcessLifecycleOwner.this.g();
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void i(ProcessLifecycleOwner processLifecycleOwner0) [...]

    public final void j() {
        if(this.b == 0) {
            this.c = true;
            this.f.l(Event.ON_PAUSE);
        }
    }

    public final void k() {
        if(this.a == 0 && this.c) {
            this.f.l(Event.ON_STOP);
            this.d = true;
        }
    }

    @l
    @n
    public static final LifecycleOwner l() {
        return ProcessLifecycleOwner.i.a();
    }

    @n
    public static final void m(@l Context context0) {
        ProcessLifecycleOwner.i.c(context0);
    }
}

