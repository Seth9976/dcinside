package androidx.work.impl;

import A3.o;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.ForegroundUpdater;
import androidx.work.InputMerger;
import androidx.work.ListenableFutureKt;
import androidx.work.ListenableWorker.Result.Failure;
import androidx.work.ListenableWorker.Result.Retry;
import androidx.work.ListenableWorker.Result.Success;
import androidx.work.ListenableWorker.Result;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.WorkerExceptionInfo;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.WorkForegroundKt;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.WorkerExceptionUtilsKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.t0;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.J;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.A;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import kotlinx.coroutines.w0;
import y4.l;
import y4.m;

@RestrictTo({Scope.b})
@s0({"SMAP\nWorkerWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerWrapper.kt\nandroidx/work/impl/WorkerWrapper\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,607:1\n29#2:608\n29#2:609\n27#2:610\n32#2:611\n19#2:612\n19#2:613\n24#2:614\n24#2:615\n24#2:616\n24#2:617\n19#2:618\n*S KotlinDebug\n*F\n+ 1 WorkerWrapper.kt\nandroidx/work/impl/WorkerWrapper\n*L\n206#1:608\n240#1:609\n315#1:610\n318#1:611\n354#1:612\n367#1:613\n374#1:614\n381#1:615\n384#1:616\n477#1:617\n151#1:618\n*E\n"})
public final class WorkerWrapper {
    @RestrictTo({Scope.b})
    public static final class Builder {
        @l
        private final Configuration a;
        @l
        private final TaskExecutor b;
        @l
        private final ForegroundProcessor c;
        @l
        private final WorkDatabase d;
        @l
        private final WorkSpec e;
        @l
        private final List f;
        @l
        private final Context g;
        @m
        private ListenableWorker h;
        @l
        private RuntimeExtras i;

        @SuppressLint({"LambdaLast"})
        public Builder(@l Context context0, @l Configuration configuration0, @l TaskExecutor taskExecutor0, @l ForegroundProcessor foregroundProcessor0, @l WorkDatabase workDatabase0, @l WorkSpec workSpec0, @l List list0) {
            L.p(context0, "context");
            L.p(configuration0, "configuration");
            L.p(taskExecutor0, "workTaskExecutor");
            L.p(foregroundProcessor0, "foregroundProcessor");
            L.p(workDatabase0, "workDatabase");
            L.p(workSpec0, "workSpec");
            L.p(list0, "tags");
            super();
            this.a = configuration0;
            this.b = taskExecutor0;
            this.c = foregroundProcessor0;
            this.d = workDatabase0;
            this.e = workSpec0;
            this.f = list0;
            Context context1 = context0.getApplicationContext();
            L.o(context1, "context.applicationContext");
            this.g = context1;
            this.i = new RuntimeExtras();
        }

        @l
        public final WorkerWrapper a() {
            return new WorkerWrapper(this);
        }

        @l
        public final Context b() {
            return this.g;
        }

        @l
        public final Configuration c() {
            return this.a;
        }

        @l
        public final ForegroundProcessor d() {
            return this.c;
        }

        @l
        public final RuntimeExtras e() {
            return this.i;
        }

        @l
        public final List f() {
            return this.f;
        }

        @l
        public final WorkDatabase g() {
            return this.d;
        }

        @l
        public final WorkSpec h() {
            return this.e;
        }

        @l
        public final TaskExecutor i() {
            return this.b;
        }

        @m
        public final ListenableWorker j() {
            return this.h;
        }

        public final void k(@l RuntimeExtras workerParameters$RuntimeExtras0) {
            L.p(workerParameters$RuntimeExtras0, "<set-?>");
            this.i = workerParameters$RuntimeExtras0;
        }

        public final void l(@m ListenableWorker listenableWorker0) {
            this.h = listenableWorker0;
        }

        @l
        public final Builder m(@m RuntimeExtras workerParameters$RuntimeExtras0) {
            if(workerParameters$RuntimeExtras0 != null) {
                this.i = workerParameters$RuntimeExtras0;
            }
            return this;
        }

        @VisibleForTesting
        @l
        public final Builder n(@l ListenableWorker listenableWorker0) {
            L.p(listenableWorker0, "worker");
            this.h = listenableWorker0;
            return this;
        }
    }

    static abstract class Resolution {
        public static final class Failed extends Resolution {
            @l
            private final Result a;

            public Failed() {
                this(null, 1, null);
            }

            public Failed(@l Result listenableWorker$Result0) {
                L.p(listenableWorker$Result0, "result");
                super(null);
                this.a = listenableWorker$Result0;
            }

            public Failed(Result listenableWorker$Result0, int v, w w0) {
                if((v & 1) != 0) {
                    listenableWorker$Result0 = new Failure();
                }
                this(listenableWorker$Result0);
            }

            @l
            public final Result a() {
                return this.a;
            }
        }

        public static final class Finished extends Resolution {
            @l
            private final Result a;

            public Finished(@l Result listenableWorker$Result0) {
                L.p(listenableWorker$Result0, "result");
                super(null);
                this.a = listenableWorker$Result0;
            }

            @l
            public final Result a() {
                return this.a;
            }
        }

        public static final class ResetWorkerStatus extends Resolution {
            private final int a;

            public ResetWorkerStatus() {
                this(0, 1, null);
            }

            public ResetWorkerStatus(int v) {
                super(null);
                this.a = v;
            }

            public ResetWorkerStatus(int v, int v1, w w0) {
                if((v1 & 1) != 0) {
                    v = 0xFFFFFF00;
                }
                this(v);
            }

            public final int a() {
                return this.a;
            }
        }

        private Resolution() {
        }

        public Resolution(w w0) {
        }
    }

    @l
    private final WorkSpec a;
    @l
    private final Context b;
    @l
    private final String c;
    @l
    private final RuntimeExtras d;
    @m
    private final ListenableWorker e;
    @l
    private final TaskExecutor f;
    @l
    private final Configuration g;
    @l
    private final Clock h;
    @l
    private final ForegroundProcessor i;
    @l
    private final WorkDatabase j;
    @l
    private final WorkSpecDao k;
    @l
    private final DependencyDao l;
    @l
    private final List m;
    @l
    private final String n;
    @l
    private final A o;

    public WorkerWrapper(@l Builder workerWrapper$Builder0) {
        L.p(workerWrapper$Builder0, "builder");
        super();
        WorkSpec workSpec0 = workerWrapper$Builder0.h();
        this.a = workSpec0;
        this.b = workerWrapper$Builder0.b();
        this.c = workSpec0.a;
        this.d = workerWrapper$Builder0.e();
        this.e = workerWrapper$Builder0.j();
        this.f = workerWrapper$Builder0.i();
        Configuration configuration0 = workerWrapper$Builder0.c();
        this.g = configuration0;
        this.h = configuration0.a();
        this.i = workerWrapper$Builder0.d();
        WorkDatabase workDatabase0 = workerWrapper$Builder0.g();
        this.j = workDatabase0;
        this.k = workDatabase0.Z();
        this.l = workDatabase0.T();
        List list0 = workerWrapper$Builder0.f();
        this.m = list0;
        this.n = this.k(list0);
        this.o = O0.c(null, 1, null);
    }

    // 检测为 Lambda 实现
    private static final Boolean A(WorkerWrapper workerWrapper0) [...]

    private final String k(List list0) {
        return "Work [ id=" + this.c + ", tags={ " + u.m3(list0, ",", null, null, 0, null, null, 62, null) + " } ]";
    }

    @l
    public final WorkGenerationalId l() {
        return WorkSpecKt.a(this.a);
    }

    @l
    public final WorkSpec m() {
        return this.a;
    }

    private final boolean n(Result listenableWorker$Result0) {
        if(listenableWorker$Result0 instanceof Success) {
            Logger.e().f("WM-WorkerWrapper", "Worker result SUCCESS for " + this.n);
            return this.a.L() ? this.t() : this.y(listenableWorker$Result0);
        }
        if(listenableWorker$Result0 instanceof Retry) {
            Logger.e().f("WM-WorkerWrapper", "Worker result RETRY for " + this.n);
            return this.s(0xFFFFFF00);
        }
        Logger.e().f("WM-WorkerWrapper", "Worker result FAILURE for " + this.n);
        if(this.a.L()) {
            return this.t();
        }
        if(listenableWorker$Result0 == null) {
            listenableWorker$Result0 = new Failure();
        }
        return this.x(listenableWorker$Result0);
    }

    @RestrictTo({Scope.b})
    public final void o(int v) {
        WorkerStoppedException workerStoppedException0 = new WorkerStoppedException(v);
        this.o.e(workerStoppedException0);
    }

    private final void p(String s) {
        List list0 = u.S(new String[]{s});
        while(!list0.isEmpty()) {
            String s1 = (String)u.O0(list0);
            if(this.k.j(s1) != State.f) {
                this.k.q(State.d, s1);
            }
            list0.addAll(this.l.b(s1));
        }
    }

    @l
    public final t0 q() {
        return ListenableFutureKt.k(this.f.a().plus(O0.c(null, 1, null)), null, new o(null) {
            int k;
            final WorkerWrapper l;

            {
                this.l = workerWrapper0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                return new androidx.work.impl.WorkerWrapper.launch.1(this.l, d0);
            }

            // 检测为 Lambda 实现
            private static final Boolean f(Resolution workerWrapper$Resolution0, WorkerWrapper workerWrapper0) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            public final Object invoke(O o0, d d0) {
                return ((androidx.work.impl.WorkerWrapper.launch.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Resolution workerWrapper$Resolution0;
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        try {
                            androidx.work.impl.WorkerWrapper.launch.1.resolution.1 workerWrapper$launch$1$resolution$10 = new o(null) {
                                int k;
                                final WorkerWrapper l;

                                {
                                    this.l = workerWrapper0;
                                    super(2, d0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                public final d create(Object object0, d d0) {
                                    return new androidx.work.impl.WorkerWrapper.launch.1.resolution.1(this.l, d0);
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((O)object0), ((d)object1));
                                }

                                public final Object invoke(O o0, d d0) {
                                    return ((androidx.work.impl.WorkerWrapper.launch.1.resolution.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                public final Object invokeSuspend(Object object0) {
                                    Object object1 = b.l();
                                    switch(this.k) {
                                        case 0: {
                                            f0.n(object0);
                                            this.k = 1;
                                            object0 = this.l.v(this);
                                            return object0 == object1 ? object1 : object0;
                                        }
                                        case 1: {
                                            f0.n(object0);
                                            return object0;
                                        }
                                        default: {
                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                        }
                                    }
                                }
                            };
                            this.k = 1;
                            object0 = i.h(this.l.o, workerWrapper$launch$1$resolution$10, this);
                            if(object0 == object1) {
                                return object1;
                            label_9:
                                f0.n(object0);
                            }
                            workerWrapper$Resolution0 = (Resolution)object0;
                            goto label_20;
                        }
                        catch(WorkerStoppedException workerStoppedException0) {
                            break;
                        }
                        catch(CancellationException unused_ex) {
                            workerWrapper$Resolution0 = new Failed(null, 1, null);
                            goto label_20;
                        }
                        catch(Throwable throwable0) {
                            goto label_18;
                        }
                    }
                    case 1: {
                        goto label_9;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                workerWrapper$Resolution0 = new ResetWorkerStatus(workerStoppedException0.a());
                goto label_20;
            label_18:
                Logger.e().d("WM-WorkerWrapper", "Unexpected error in WorkerWrapper", throwable0);
                workerWrapper$Resolution0 = new Failed(null, 1, null);
            label_20:
                Object object2 = this.l.j.N(() -> {
                    if(workerWrapper$Resolution0 instanceof Finished) {
                        return Boolean.valueOf(this.l.r(((Finished)workerWrapper$Resolution0).a()));
                    }
                    if(workerWrapper$Resolution0 instanceof Failed) {
                        this.l.x(((Failed)workerWrapper$Resolution0).a());
                        return false;
                    }
                    if(!(workerWrapper$Resolution0 instanceof ResetWorkerStatus)) {
                        throw new J();
                    }
                    return Boolean.valueOf(this.l.u(((ResetWorkerStatus)workerWrapper$Resolution0).a()));
                });
                L.o(object2, "workDatabase.runInTransa…          }\n            )");
                return object2;
            }
        }, 2, null);
    }

    private final boolean r(Result listenableWorker$Result0) {
        State workInfo$State0 = this.k.j(this.c);
        this.j.Y().b(this.c);
        if(workInfo$State0 != null) {
            return workInfo$State0 == State.b ? this.n(listenableWorker$Result0) : this.s(0xFFFFFE00);
        }
        return false;
    }

    private final boolean s(int v) {
        this.k.q(State.a, this.c);
        long v1 = this.h.currentTimeMillis();
        this.k.t(this.c, v1);
        this.k.A(this.c, this.a.F());
        this.k.J(this.c, -1L);
        this.k.a(this.c, v);
        return true;
    }

    private final boolean t() {
        long v = this.h.currentTimeMillis();
        this.k.t(this.c, v);
        this.k.q(State.a, this.c);
        this.k.x(this.c);
        this.k.A(this.c, this.a.F());
        this.k.C(this.c);
        this.k.J(this.c, -1L);
        return false;
    }

    private final boolean u(int v) {
        State workInfo$State0 = this.k.j(this.c);
        if(workInfo$State0 != null) {
            Logger.e().a("WM-WorkerWrapper", "Status for " + this.c + " is " + workInfo$State0 + "; not doing any work and rescheduling for later execution");
            this.k.q(State.a, this.c);
            this.k.a(this.c, v);
            this.k.J(this.c, -1L);
            return true;
        }
        Logger.e().a("WM-WorkerWrapper", "Status for " + this.c + " is " + null + " ; not doing any work");
        return false;
    }

    private final Object v(d d0) {
        WorkerParameters workerParameters1;
        WorkerWrapper workerWrapper0;
        Data data0;
        androidx.work.impl.WorkerWrapper.runWorker.1 workerWrapper$runWorker$10;
        if(d0 instanceof androidx.work.impl.WorkerWrapper.runWorker.1) {
            workerWrapper$runWorker$10 = (androidx.work.impl.WorkerWrapper.runWorker.1)d0;
            int v = workerWrapper$runWorker$10.o;
            if((v & 0x80000000) == 0) {
                workerWrapper$runWorker$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return d0.v(this);
                    }
                };
            }
            else {
                workerWrapper$runWorker$10.o = v ^ 0x80000000;
            }
        }
        else {
            workerWrapper$runWorker$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.o |= 0x80000000;
                    return d0.v(this);
                }
            };
        }
        Object object0 = workerWrapper$runWorker$10.m;
        Object object1 = b.l();
        switch(workerWrapper$runWorker$10.o) {
            case 0: {
                f0.n(object0);
                boolean z = this.g.n().isEnabled();
                String s = this.a.I();
                if(z && s != null) {
                    this.g.n().d(s, this.a.hashCode());
                }
                androidx.work.impl.o o0 = () -> {
                    WorkSpec workSpec0 = this.a;
                    if(workSpec0.b != State.a) {
                        Logger.e().a("WM-WorkerWrapper", this.a.c + " is not in ENQUEUED state. Nothing more to do");
                        return true;
                    }
                    if((workSpec0.L() || this.a.K()) && this.h.currentTimeMillis() < this.a.c()) {
                        Logger.e().a("WM-WorkerWrapper", "Delaying execution for " + this.a.c + " because it is being executed before schedule.");
                        return true;
                    }
                    return false;
                };
                Boolean boolean0 = (Boolean)this.j.N(o0);
                L.o(boolean0, "shouldExit");
                if(boolean0.booleanValue()) {
                    return new ResetWorkerStatus(0, 1, null);
                }
                if(this.a.L()) {
                    data0 = this.a.e;
                }
                else {
                    InputMerger inputMerger0 = this.g.f().b(this.a.d);
                    if(inputMerger0 == null) {
                        Logger.e().c("WM-WorkerWrapper", "Could not create Input Merger " + this.a.d);
                        return new Failed(null, 1, null);
                    }
                    data0 = inputMerger0.a(u.D4(u.k(this.a.e), this.k.m(this.c)));
                }
                UUID uUID0 = UUID.fromString(this.c);
                int v1 = this.a.k;
                WorkProgressUpdater workProgressUpdater0 = new WorkProgressUpdater(this.j, this.f);
                WorkForegroundUpdater workForegroundUpdater0 = new WorkForegroundUpdater(this.j, this.i, this.f);
                WorkerParameters workerParameters0 = new WorkerParameters(uUID0, data0, this.m, this.d, v1, this.a.D(), this.g.d(), this.g.o(), this.f, this.g.q(), workProgressUpdater0, workForegroundUpdater0);
                ListenableWorker listenableWorker0 = this.e;
                if(listenableWorker0 == null) {
                    try {
                        listenableWorker0 = this.g.q().b(this.b, this.a.c, workerParameters0);
                    }
                    catch(Throwable throwable0) {
                        Logger.e().c("WM-WorkerWrapper", "Could not create Worker " + this.a.c);
                        Consumer consumer0 = this.g.r();
                        if(consumer0 != null) {
                            WorkerExceptionUtilsKt.a(consumer0, new WorkerExceptionInfo(this.a.c, workerParameters0, throwable0), "WM-WorkerWrapper");
                        }
                        return new Failed(null, 1, null);
                    }
                }
                listenableWorker0.setUsed();
                kotlin.coroutines.g.b g$b0 = workerWrapper$runWorker$10.getContext().get(I0.B8);
                L.m(g$b0);
                ((I0)g$b0).w(new Function1(z, s, this) {
                    final ListenableWorker e;
                    final boolean f;
                    final String g;
                    final WorkerWrapper h;

                    {
                        this.e = listenableWorker0;
                        this.f = z;
                        this.g = s;
                        this.h = workerWrapper0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((Throwable)object0));
                        return S0.a;
                    }

                    public final void invoke(Throwable throwable0) {
                        if(throwable0 instanceof WorkerStoppedException) {
                            int v = ((WorkerStoppedException)throwable0).a();
                            this.e.stop(v);
                        }
                        if(this.f && this.g != null) {
                            this.h.g.n().c(this.g, this.h.m().hashCode());
                        }
                    }
                });
                if(!this.z()) {
                    return new ResetWorkerStatus(0, 1, null);
                }
                if(((I0)g$b0).isCancelled()) {
                    return new ResetWorkerStatus(0, 1, null);
                }
                ForegroundUpdater foregroundUpdater0 = workerParameters0.b();
                L.o(foregroundUpdater0, "params.foregroundUpdater");
                Executor executor0 = this.f.c();
                L.o(executor0, "workTaskExecutor.getMainThreadExecutor()");
                K k0 = w0.c(executor0);
                try {
                    androidx.work.impl.WorkerWrapper.runWorker.result.1 workerWrapper$runWorker$result$10 = new o(listenableWorker0, foregroundUpdater0, null) {
                        int k;
                        final WorkerWrapper l;
                        final ListenableWorker m;
                        final ForegroundUpdater n;

                        {
                            this.l = workerWrapper0;
                            this.m = listenableWorker0;
                            this.n = foregroundUpdater0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        public final d create(Object object0, d d0) {
                            return new androidx.work.impl.WorkerWrapper.runWorker.result.1(this.l, this.m, this.n, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        public final Object invoke(O o0, d d0) {
                            return ((androidx.work.impl.WorkerWrapper.runWorker.result.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object object0) {
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    this.k = 1;
                                    if(WorkForegroundKt.b(this.l.b, this.l.m(), this.m, this.n, this.l.f, this) == object1) {
                                        return object1;
                                    }
                                    break;
                                }
                                case 1: {
                                    f0.n(object0);
                                    break;
                                }
                                case 2: {
                                    f0.n(object0);
                                    return object0;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                            Logger.e().a("WM-WorkerWrapper", "Starting work for " + this.l.m().c);
                            t0 t00 = this.m.startWork();
                            L.o(t00, "worker.startWork()");
                            this.k = 2;
                            object0 = WorkerWrapperKt.d(t00, this.m, this);
                            return object0 == object1 ? object1 : object0;
                        }
                    };
                    workerWrapper$runWorker$10.k = this;
                    workerWrapper$runWorker$10.l = workerParameters0;
                    workerWrapper$runWorker$10.o = 1;
                    object0 = i.h(k0, workerWrapper$runWorker$result$10, workerWrapper$runWorker$10);
                }
                catch(CancellationException cancellationException0) {
                    workerWrapper0 = this;
                    break;
                }
                catch(Throwable throwable1) {
                    workerWrapper0 = this;
                    workerParameters1 = workerParameters0;
                    goto label_86;
                }
                if(object0 == object1) {
                    return object1;
                }
                workerWrapper0 = this;
                workerParameters1 = workerParameters0;
                goto label_80;
            }
            case 1: {
                workerParameters1 = (WorkerParameters)workerWrapper$runWorker$10.l;
                workerWrapper0 = (WorkerWrapper)workerWrapper$runWorker$10.k;
                try {
                    f0.n(object0);
                label_80:
                    L.o(((Result)object0), "result");
                    return new Finished(((Result)object0));
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
                catch(Throwable throwable1) {
                    goto label_86;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Logger.e().g("WM-WorkerWrapper", workerWrapper0.n + " was cancelled", cancellationException0);
        throw cancellationException0;
    label_86:
        Logger.e().d("WM-WorkerWrapper", workerWrapper0.n + " failed because it threw an exception/error", throwable1);
        Consumer consumer1 = workerWrapper0.g.p();
        if(consumer1 != null) {
            WorkerExceptionUtilsKt.a(consumer1, new WorkerExceptionInfo(workerWrapper0.a.c, workerParameters1, throwable1), "WM-WorkerWrapper");
        }
        return new Failed(null, 1, null);
    }

    // 检测为 Lambda 实现
    private static final Boolean w(WorkerWrapper workerWrapper0) [...]

    @VisibleForTesting
    public final boolean x(@l Result listenableWorker$Result0) {
        L.p(listenableWorker$Result0, "result");
        this.p(this.c);
        Data data0 = ((Failure)listenableWorker$Result0).c();
        L.o(data0, "failure.outputData");
        this.k.A(this.c, this.a.F());
        this.k.N(this.c, data0);
        return false;
    }

    private final boolean y(Result listenableWorker$Result0) {
        this.k.q(State.c, this.c);
        L.n(listenableWorker$Result0, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        Data data0 = ((Success)listenableWorker$Result0).c();
        L.o(data0, "success.outputData");
        this.k.N(this.c, data0);
        long v = this.h.currentTimeMillis();
        for(Object object0: this.l.b(this.c)) {
            String s = (String)object0;
            if(this.k.j(s) == State.e && this.l.c(s)) {
                Logger.e().f("WM-WorkerWrapper", "Setting status to enqueued for " + s);
                this.k.q(State.a, s);
                this.k.t(s, v);
            }
        }
        return false;
    }

    private final boolean z() {
        p p0 = () -> {
            if(this.k.j(this.c) == State.a) {
                this.k.q(State.b, this.c);
                this.k.R(this.c);
                this.k.a(this.c, 0xFFFFFF00);
                return true;
            }
            return false;
        };
        Object object0 = this.j.N(p0);
        L.o(object0, "workDatabase.runInTransa…e\n            }\n        )");
        return ((Boolean)object0).booleanValue();
    }
}

