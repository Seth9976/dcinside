package androidx.work;

import android.os.Build.VERSION;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.concurrent.Executor;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.w0;
import y4.l;
import y4.m;

public final class Configuration {
    public static final class Builder {
        @m
        private Executor a;
        @m
        private g b;
        @m
        private WorkerFactory c;
        @m
        private InputMergerFactory d;
        @m
        private Executor e;
        @m
        private Clock f;
        @m
        private RunnableScheduler g;
        @m
        private Consumer h;
        @m
        private Consumer i;
        @m
        private Consumer j;
        @m
        private Consumer k;
        @m
        private String l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        private boolean r;
        @m
        private Tracer s;

        public Builder() {
            this.m = 4;
            this.o = 0x7FFFFFFF;
            this.p = 20;
            this.q = 8;
            this.r = true;
        }

        @RestrictTo({Scope.b})
        public Builder(@l Configuration configuration0) {
            L.p(configuration0, "configuration");
            super();
            this.m = 4;
            this.o = 0x7FFFFFFF;
            this.p = 20;
            this.q = 8;
            this.r = true;
            this.a = configuration0.d();
            this.c = configuration0.q();
            this.d = configuration0.f();
            this.e = configuration0.m();
            this.f = configuration0.a();
            this.m = configuration0.j();
            this.n = configuration0.i();
            this.o = configuration0.g();
            this.p = configuration0.h();
            this.g = configuration0.k();
            this.h = configuration0.e();
            this.i = configuration0.l();
            this.j = configuration0.r();
            this.k = configuration0.p();
            this.l = configuration0.c();
            this.q = configuration0.b();
            this.r = configuration0.s();
            this.s = configuration0.n();
        }

        @l
        public final Builder A(@l Executor executor0) {
            L.p(executor0, "executor");
            this.a = executor0;
            return this;
        }

        public final void B(@m Executor executor0) {
            this.a = executor0;
        }

        @l
        public final Builder C(@l Consumer consumer0) {
            L.p(consumer0, "exceptionHandler");
            this.h = consumer0;
            return this;
        }

        public final void D(@m Consumer consumer0) {
            this.h = consumer0;
        }

        @l
        public final Builder E(@l InputMergerFactory inputMergerFactory0) {
            L.p(inputMergerFactory0, "inputMergerFactory");
            this.d = inputMergerFactory0;
            return this;
        }

        public final void F(@m InputMergerFactory inputMergerFactory0) {
            this.d = inputMergerFactory0;
        }

        @l
        public final Builder G(int v, int v1) {
            if(v1 - v < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.n = v;
            this.o = v1;
            return this;
        }

        public final void H(int v) {
            this.m = v;
        }

        public final void I(boolean z) {
            this.r = z;
        }

        @ExperimentalConfigurationApi
        @l
        public final Builder J(boolean z) {
            this.r = z;
            return this;
        }

        public final void K(int v) {
            this.o = v;
        }

        @l
        public final Builder L(int v) {
            if(v < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.p = Math.min(v, 50);
            return this;
        }

        public final void M(int v) {
            this.p = v;
        }

        public final void N(int v) {
            this.n = v;
        }

        @l
        public final Builder O(int v) {
            this.m = v;
            return this;
        }

        @l
        public final Builder P(@l RunnableScheduler runnableScheduler0) {
            L.p(runnableScheduler0, "runnableScheduler");
            this.g = runnableScheduler0;
            return this;
        }

        public final void Q(@m RunnableScheduler runnableScheduler0) {
            this.g = runnableScheduler0;
        }

        @l
        public final Builder R(@l Consumer consumer0) {
            L.p(consumer0, "schedulingExceptionHandler");
            this.i = consumer0;
            return this;
        }

        public final void S(@m Consumer consumer0) {
            this.i = consumer0;
        }

        @l
        public final Builder T(@l Executor executor0) {
            L.p(executor0, "taskExecutor");
            this.e = executor0;
            return this;
        }

        public final void U(@m Executor executor0) {
            this.e = executor0;
        }

        @RestrictTo({Scope.b})
        @l
        public final Builder V(@l Tracer tracer0) {
            L.p(tracer0, "tracer");
            this.s = tracer0;
            return this;
        }

        public final void W(@m Tracer tracer0) {
            this.s = tracer0;
        }

        public final void X(@m g g0) {
            this.b = g0;
        }

        @l
        public final Builder Y(@l g g0) {
            L.p(g0, "context");
            this.b = g0;
            return this;
        }

        @l
        public final Builder Z(@l Consumer consumer0) {
            L.p(consumer0, "workerExceptionHandler");
            this.k = consumer0;
            return this;
        }

        @l
        public final Configuration a() {
            return new Configuration(this);
        }

        public final void a0(@m Consumer consumer0) {
            this.k = consumer0;
        }

        @m
        public final Clock b() {
            return this.f;
        }

        @l
        public final Builder b0(@l WorkerFactory workerFactory0) {
            L.p(workerFactory0, "workerFactory");
            this.c = workerFactory0;
            return this;
        }

        public final int c() {
            return this.q;
        }

        public final void c0(@m WorkerFactory workerFactory0) {
            this.c = workerFactory0;
        }

        @m
        public final String d() {
            return this.l;
        }

        @l
        public final Builder d0(@l Consumer consumer0) {
            L.p(consumer0, "workerExceptionHandler");
            this.j = consumer0;
            return this;
        }

        @m
        public final Executor e() {
            return this.a;
        }

        public final void e0(@m Consumer consumer0) {
            this.j = consumer0;
        }

        @m
        public final Consumer f() {
            return this.h;
        }

        @m
        public final InputMergerFactory g() {
            return this.d;
        }

        public final int h() {
            return this.m;
        }

        public final boolean i() {
            return this.r;
        }

        public final int j() {
            return this.o;
        }

        public final int k() {
            return this.p;
        }

        public final int l() {
            return this.n;
        }

        @m
        public final RunnableScheduler m() {
            return this.g;
        }

        @m
        public final Consumer n() {
            return this.i;
        }

        @m
        public final Executor o() {
            return this.e;
        }

        @m
        public final Tracer p() {
            return this.s;
        }

        @m
        public final g q() {
            return this.b;
        }

        @m
        public final Consumer r() {
            return this.k;
        }

        @m
        public final WorkerFactory s() {
            return this.c;
        }

        @m
        public final Consumer t() {
            return this.j;
        }

        @l
        public final Builder u(@l Clock clock0) {
            L.p(clock0, "clock");
            this.f = clock0;
            return this;
        }

        public final void v(@m Clock clock0) {
            this.f = clock0;
        }

        @l
        public final Builder w(int v) {
            this.q = Math.max(v, 0);
            return this;
        }

        public final void x(int v) {
            this.q = v;
        }

        @l
        public final Builder y(@l String s) {
            L.p(s, "processName");
            this.l = s;
            return this;
        }

        public final void z(@m String s) {
            this.l = s;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public interface Provider {
        @l
        Configuration a();
    }

    @l
    private final Executor a;
    @l
    private final g b;
    @l
    private final Executor c;
    @l
    private final Clock d;
    @l
    private final WorkerFactory e;
    @l
    private final InputMergerFactory f;
    @l
    private final RunnableScheduler g;
    @m
    private final Consumer h;
    @m
    private final Consumer i;
    @m
    private final Consumer j;
    @m
    private final Consumer k;
    @m
    private final String l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final boolean r;
    private final boolean s;
    @l
    private final Tracer t;
    @l
    public static final Companion u = null;
    public static final int v = 20;

    static {
        Configuration.u = new Companion(null);
    }

    public Configuration(@l Builder configuration$Builder0) {
        L.p(configuration$Builder0, "builder");
        super();
        g g0 = configuration$Builder0.q();
        Executor executor0 = configuration$Builder0.e();
        boolean z = false;
        if(executor0 == null) {
            executor0 = g0 == null ? null : ConfigurationKt.d(g0);
            if(executor0 == null) {
                executor0 = ConfigurationKt.e(false);
            }
        }
        this.a = executor0;
        if(g0 == null) {
            g0 = configuration$Builder0.e() == null ? h0.a() : w0.c(executor0);
        }
        this.b = g0;
        if(configuration$Builder0.o() == null) {
            z = true;
        }
        this.r = z;
        this.c = configuration$Builder0.o() == null ? ConfigurationKt.e(true) : configuration$Builder0.o();
        Clock clock0 = configuration$Builder0.b();
        if(clock0 == null) {
            clock0 = new SystemClock();
        }
        this.d = clock0;
        WorkerFactory workerFactory0 = configuration$Builder0.s();
        if(workerFactory0 == null) {
            workerFactory0 = DefaultWorkerFactory.a;
        }
        this.e = workerFactory0;
        InputMergerFactory inputMergerFactory0 = configuration$Builder0.g();
        if(inputMergerFactory0 == null) {
            inputMergerFactory0 = NoOpInputMergerFactory.a;
        }
        this.f = inputMergerFactory0;
        RunnableScheduler runnableScheduler0 = configuration$Builder0.m();
        if(runnableScheduler0 == null) {
            runnableScheduler0 = new DefaultRunnableScheduler();
        }
        this.g = runnableScheduler0;
        this.m = configuration$Builder0.h();
        this.n = configuration$Builder0.l();
        this.o = configuration$Builder0.j();
        this.q = Build.VERSION.SDK_INT == 23 ? configuration$Builder0.k() / 2 : configuration$Builder0.k();
        this.h = configuration$Builder0.f();
        this.i = configuration$Builder0.n();
        this.j = configuration$Builder0.t();
        this.k = configuration$Builder0.r();
        this.l = configuration$Builder0.d();
        this.p = configuration$Builder0.c();
        this.s = configuration$Builder0.i();
        this.t = configuration$Builder0.p() == null ? ConfigurationKt.f() : configuration$Builder0.p();
    }

    @l
    public final Clock a() {
        return this.d;
    }

    public final int b() {
        return this.p;
    }

    @m
    public final String c() {
        return this.l;
    }

    @l
    public final Executor d() {
        return this.a;
    }

    @m
    public final Consumer e() {
        return this.h;
    }

    @l
    public final InputMergerFactory f() {
        return this.f;
    }

    public final int g() {
        return this.o;
    }

    @IntRange(from = 20L, to = 50L)
    @RestrictTo({Scope.b})
    public final int h() {
        return this.q;
    }

    public final int i() {
        return this.n;
    }

    @RestrictTo({Scope.b})
    public final int j() {
        return this.m;
    }

    @l
    public final RunnableScheduler k() {
        return this.g;
    }

    @m
    public final Consumer l() {
        return this.i;
    }

    @l
    public final Executor m() {
        return this.c;
    }

    @RestrictTo({Scope.b})
    @l
    public final Tracer n() {
        return this.t;
    }

    @l
    public final g o() {
        return this.b;
    }

    @m
    public final Consumer p() {
        return this.k;
    }

    @l
    public final WorkerFactory q() {
        return this.e;
    }

    @m
    public final Consumer r() {
        return this.j;
    }

    @ExperimentalConfigurationApi
    public final boolean s() {
        return this.s;
    }

    @ExperimentalConfigurationApi
    public static void t() {
    }

    @RestrictTo({Scope.b})
    public final boolean u() {
        return this.r;
    }
}

