package androidx.work.impl.workers;

import A3.o;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.core.util.Consumer;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerExceptionInfo;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.WorkerExceptionUtilsKt;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0.a;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.w0;
import y4.l;
import y4.m;

@RestrictTo({Scope.b})
@s0({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,168:1\n29#2:169\n19#2:170\n19#2:171\n19#2:172\n*S KotlinDebug\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n*L\n65#1:169\n75#1:170\n78#1:171\n87#1:172\n*E\n"})
public final class ConstraintTrackingWorker extends CoroutineWorker {
    static final class ConstraintUnsatisfiedException extends CancellationException {
        private final int a;

        public ConstraintUnsatisfiedException(int v) {
            this.a = v;
        }

        public final int a() {
            return this.a;
        }
    }

    @l
    private final WorkerParameters a;

    public ConstraintTrackingWorker(@l Context context0, @l WorkerParameters workerParameters0) {
        L.p(context0, "appContext");
        L.p(workerParameters0, "workerParameters");
        super(context0, workerParameters0);
        this.a = workerParameters0;
    }

    @Override  // androidx.work.CoroutineWorker
    @m
    public Object doWork(@l d d0) {
        Executor executor0 = this.getBackgroundExecutor();
        L.o(executor0, "backgroundExecutor");
        return i.h(w0.c(executor0), new o(null) {
            int k;
            final ConstraintTrackingWorker l;

            {
                this.l = constraintTrackingWorker0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                return new androidx.work.impl.workers.ConstraintTrackingWorker.doWork.2(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            public final Object invoke(O o0, d d0) {
                return ((androidx.work.impl.workers.ConstraintTrackingWorker.doWork.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        object0 = this.l.f(this);
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
        }, d0);
    }

    private final Object e(ListenableWorker listenableWorker0, WorkConstraintsTracker workConstraintsTracker0, WorkSpec workSpec0, d d0) {
        androidx.work.impl.workers.ConstraintTrackingWorker.runWorker.1 constraintTrackingWorker$runWorker$10;
        if(d0 instanceof androidx.work.impl.workers.ConstraintTrackingWorker.runWorker.1) {
            constraintTrackingWorker$runWorker$10 = (androidx.work.impl.workers.ConstraintTrackingWorker.runWorker.1)d0;
            int v = constraintTrackingWorker$runWorker$10.m;
            if((v & 0x80000000) == 0) {
                constraintTrackingWorker$runWorker$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.m |= 0x80000000;
                        return d0.e(null, null, null, this);
                    }
                };
            }
            else {
                constraintTrackingWorker$runWorker$10.m = v ^ 0x80000000;
            }
        }
        else {
            constraintTrackingWorker$runWorker$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                int m;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.k = object0;
                    this.m |= 0x80000000;
                    return d0.e(null, null, null, this);
                }
            };
        }
        Object object0 = constraintTrackingWorker$runWorker$10.k;
        Object object1 = b.l();
        switch(constraintTrackingWorker$runWorker$10.m) {
            case 0: {
                f0.n(object0);
                androidx.work.impl.workers.ConstraintTrackingWorker.runWorker.2 constraintTrackingWorker$runWorker$20 = new o(workConstraintsTracker0, workSpec0, null) {
                    Object k;
                    Object l;
                    int m;
                    private Object n;
                    final ListenableWorker o;
                    final WorkConstraintsTracker p;
                    final WorkSpec q;

                    {
                        this.o = listenableWorker0;
                        this.p = workConstraintsTracker0;
                        this.q = workSpec0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final d create(Object object0, d d0) {
                        d d1 = new androidx.work.impl.workers.ConstraintTrackingWorker.runWorker.2(this.o, this.p, this.q, d0);
                        d1.n = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    public final Object invoke(O o0, d d0) {
                        return ((androidx.work.impl.workers.ConstraintTrackingWorker.runWorker.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object object0) {
                        Result listenableWorker$Result0;
                        AtomicInteger atomicInteger2;
                        t0 t01;
                        I0 i01;
                        AtomicInteger atomicInteger1;
                        Object object2;
                        Object object1 = b.l();
                        switch(this.m) {
                            case 0: {
                                f0.n(object0);
                                O o0 = (O)this.n;
                                AtomicInteger atomicInteger0 = new AtomicInteger(0xFFFFFF00);
                                t0 t00 = this.o.startWork();
                                L.o(t00, "delegate.startWork()");
                                I0 i00 = k.f(o0, null, null, new o(this.q, atomicInteger0, t00, null) {
                                    int k;
                                    final WorkConstraintsTracker l;
                                    final WorkSpec m;
                                    final AtomicInteger n;
                                    final t0 o;

                                    {
                                        this.l = workConstraintsTracker0;
                                        this.m = workSpec0;
                                        this.n = atomicInteger0;
                                        this.o = t00;
                                        super(2, d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    public final d create(Object object0, d d0) {
                                        return new androidx.work.impl.workers.ConstraintTrackingWorker.runWorker.2.constraintTrackingJob.1(this.l, this.m, this.n, this.o, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    public final Object invoke(O o0, d d0) {
                                        return ((androidx.work.impl.workers.ConstraintTrackingWorker.runWorker.2.constraintTrackingJob.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    public final Object invokeSuspend(Object object0) {
                                        Object object1 = b.l();
                                        switch(this.k) {
                                            case 0: {
                                                f0.n(object0);
                                                this.k = 1;
                                                object0 = ConstraintTrackingWorkerKt.c(this.l, this.m, this);
                                                if(object0 == object1) {
                                                    return object1;
                                                }
                                                break;
                                            }
                                            case 1: {
                                                f0.n(object0);
                                                break;
                                            }
                                            default: {
                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                            }
                                        }
                                        this.n.set(((Number)object0).intValue());
                                        this.o.cancel(true);
                                        return S0.a;
                                    }
                                }, 3, null);
                                try {
                                    this.n = atomicInteger0;
                                    this.k = t00;
                                    this.l = i00;
                                    this.m = 1;
                                    object2 = ListenableFutureKt.a(t00, this);
                                }
                                catch(CancellationException cancellationException0) {
                                    atomicInteger1 = atomicInteger0;
                                    i01 = i00;
                                    t01 = t00;
                                    goto label_42;
                                }
                                catch(Throwable throwable0) {
                                    i01 = i00;
                                    goto label_48;
                                }
                                if(object2 == object1) {
                                    return object1;
                                }
                                atomicInteger2 = atomicInteger0;
                                i01 = i00;
                                t01 = t00;
                                break;
                            }
                            case 1: {
                                i01 = (I0)this.l;
                                t01 = (t0)this.k;
                                atomicInteger1 = (AtomicInteger)this.n;
                                try {
                                    f0.n(object0);
                                    atomicInteger2 = atomicInteger1;
                                    object2 = object0;
                                    break;
                                }
                                catch(CancellationException cancellationException0) {
                                }
                                catch(Throwable throwable0) {
                                    goto label_48;
                                }
                                goto label_42;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        try {
                            listenableWorker$Result0 = (Result)object2;
                            goto label_53;
                        }
                        catch(CancellationException cancellationException0) {
                        }
                        catch(Throwable throwable0) {
                            goto label_48;
                        }
                        atomicInteger1 = atomicInteger2;
                        try {
                        label_42:
                            Logger.e().b("WM-ConstraintTrkngWrkr", "Delegated worker " + this.o.getClass() + " was cancelled", cancellationException0);
                            boolean z = atomicInteger1.get() != 0xFFFFFF00;
                            if(!(t01.isCancelled() && z)) {
                                throw cancellationException0;
                            }
                            throw new ConstraintUnsatisfiedException(atomicInteger1.get());
                        label_48:
                            Logger.e().b("WM-ConstraintTrkngWrkr", "Delegated worker " + this.o.getClass() + " threw exception in startWork.", throwable0);
                            throw throwable0;
                        }
                        catch(Throwable throwable1) {
                        }
                        a.b(i01, null, 1, null);
                        throw throwable1;
                    label_53:
                        a.b(i01, null, 1, null);
                        return listenableWorker$Result0;
                    }
                };
                constraintTrackingWorker$runWorker$10.m = 1;
                object0 = P.g(constraintTrackingWorker$runWorker$20, constraintTrackingWorker$runWorker$10);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        L.o(object0, "delegate: ListenableWork….cancel()\n        }\n    }");
        return object0;
    }

    private final Object f(d d0) {
        ListenableWorker listenableWorker1;
        ConstraintTrackingWorker constraintTrackingWorker0;
        ListenableWorker listenableWorker0;
        androidx.work.impl.workers.ConstraintTrackingWorker.setupAndRunConstraintTrackingWork.1 constraintTrackingWorker$setupAndRunConstraintTrackingWork$10;
        if(d0 instanceof androidx.work.impl.workers.ConstraintTrackingWorker.setupAndRunConstraintTrackingWork.1) {
            constraintTrackingWorker$setupAndRunConstraintTrackingWork$10 = (androidx.work.impl.workers.ConstraintTrackingWorker.setupAndRunConstraintTrackingWork.1)d0;
            int v = constraintTrackingWorker$setupAndRunConstraintTrackingWork$10.o;
            if((v & 0x80000000) == 0) {
                constraintTrackingWorker$setupAndRunConstraintTrackingWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return d0.f(this);
                    }
                };
            }
            else {
                constraintTrackingWorker$setupAndRunConstraintTrackingWork$10.o = v ^ 0x80000000;
            }
        }
        else {
            constraintTrackingWorker$setupAndRunConstraintTrackingWork$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.o |= 0x80000000;
                    return d0.f(this);
                }
            };
        }
        Object object0 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$10.m;
        Object object1 = b.l();
        switch(constraintTrackingWorker$setupAndRunConstraintTrackingWork$10.o) {
            case 0: {
                f0.n(object0);
                String s = this.getInputData().q("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if(s != null && s.length() != 0) {
                    WorkManagerImpl workManagerImpl0 = WorkManagerImpl.O(this.getApplicationContext());
                    L.o(workManagerImpl0, "getInstance(applicationContext)");
                    WorkSpecDao workSpecDao0 = workManagerImpl0.U().Z();
                    String s1 = this.getId().toString();
                    L.o(s1, "id.toString()");
                    WorkSpec workSpec0 = workSpecDao0.G(s1);
                    if(workSpec0 == null) {
                        Result listenableWorker$Result0 = Result.a();
                        L.o(listenableWorker$Result0, "failure()");
                        return listenableWorker$Result0;
                    }
                    Trackers trackers0 = workManagerImpl0.T();
                    L.o(trackers0, "workManagerImpl.trackers");
                    WorkConstraintsTracker workConstraintsTracker0 = new WorkConstraintsTracker(trackers0);
                    if(!workConstraintsTracker0.a(workSpec0)) {
                        Logger.e().a("WM-ConstraintTrkngWrkr", "Constraints not met for delegate " + s + ". Requesting retry.");
                        Result listenableWorker$Result1 = Result.d();
                        L.o(listenableWorker$Result1, "retry()");
                        return listenableWorker$Result1;
                    }
                    Logger.e().a("WM-ConstraintTrkngWrkr", "Constraints met for delegate " + s);
                    try {
                        WorkerFactory workerFactory0 = this.getWorkerFactory();
                        Context context0 = this.getApplicationContext();
                        L.o(context0, "applicationContext");
                        listenableWorker0 = workerFactory0.b(context0, s, this.a);
                    }
                    catch(Throwable throwable0) {
                        Logger.e().a("WM-ConstraintTrkngWrkr", "No worker to delegate to.");
                        Consumer consumer0 = workManagerImpl0.o().r();
                        if(consumer0 != null) {
                            WorkerExceptionUtilsKt.a(consumer0, new WorkerExceptionInfo(s, this.a, throwable0), "WM-ConstraintTrkngWrkr");
                        }
                        Result listenableWorker$Result2 = Result.a();
                        L.o(listenableWorker$Result2, "failure()");
                        return listenableWorker$Result2;
                    }
                    Executor executor0 = this.a.k().c();
                    L.o(executor0, "workerParameters.taskExecutor.mainThreadExecutor");
                    try {
                        K k0 = w0.c(executor0);
                        androidx.work.impl.workers.ConstraintTrackingWorker.setupAndRunConstraintTrackingWork.5 constraintTrackingWorker$setupAndRunConstraintTrackingWork$50 = new o(listenableWorker0, workConstraintsTracker0, workSpec0, null) {
                            int k;
                            final ConstraintTrackingWorker l;
                            final ListenableWorker m;
                            final WorkConstraintsTracker n;
                            final WorkSpec o;

                            {
                                this.l = constraintTrackingWorker0;
                                this.m = listenableWorker0;
                                this.n = workConstraintsTracker0;
                                this.o = workSpec0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            public final d create(Object object0, d d0) {
                                return new androidx.work.impl.workers.ConstraintTrackingWorker.setupAndRunConstraintTrackingWork.5(this.l, this.m, this.n, this.o, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            public final Object invoke(O o0, d d0) {
                                return ((androidx.work.impl.workers.ConstraintTrackingWorker.setupAndRunConstraintTrackingWork.5)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object object0) {
                                Object object1 = b.l();
                                switch(this.k) {
                                    case 0: {
                                        f0.n(object0);
                                        this.k = 1;
                                        object0 = this.l.e(this.m, this.n, this.o, this);
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
                        constraintTrackingWorker$setupAndRunConstraintTrackingWork$10.k = this;
                        constraintTrackingWorker$setupAndRunConstraintTrackingWork$10.l = listenableWorker0;
                        constraintTrackingWorker$setupAndRunConstraintTrackingWork$10.o = 1;
                        object0 = i.h(k0, constraintTrackingWorker$setupAndRunConstraintTrackingWork$50, constraintTrackingWorker$setupAndRunConstraintTrackingWork$10);
                    }
                    catch(CancellationException cancellationException0) {
                        constraintTrackingWorker0 = this;
                        listenableWorker1 = listenableWorker0;
                        break;
                    }
                    if(object0 == object1) {
                        return object1;
                    }
                    constraintTrackingWorker0 = this;
                    listenableWorker1 = listenableWorker0;
                    return (Result)object0;
                }
                Logger.e().c("WM-ConstraintTrkngWrkr", "No worker to delegate to.");
                Result listenableWorker$Result3 = Result.a();
                L.o(listenableWorker$Result3, "failure()");
                return listenableWorker$Result3;
            }
            case 1: {
                listenableWorker1 = (ListenableWorker)constraintTrackingWorker$setupAndRunConstraintTrackingWork$10.l;
                constraintTrackingWorker0 = (ConstraintTrackingWorker)constraintTrackingWorker$setupAndRunConstraintTrackingWork$10.k;
                try {
                    f0.n(object0);
                    return (Result)object0;
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(constraintTrackingWorker0.isStopped() || cancellationException0 instanceof ConstraintUnsatisfiedException) {
            if(Build.VERSION.SDK_INT < 0x1F) {
                listenableWorker1.stop(0xFFFFFE00);
            }
            else if(constraintTrackingWorker0.isStopped()) {
                listenableWorker1.stop(constraintTrackingWorker0.getStopReason());
            }
            else {
                if(!(cancellationException0 instanceof ConstraintUnsatisfiedException)) {
                    throw new IllegalStateException("Unreachable");
                }
                listenableWorker1.stop(((ConstraintUnsatisfiedException)cancellationException0).a());
            }
        }
        if(!(cancellationException0 instanceof ConstraintUnsatisfiedException)) {
            throw cancellationException0;
        }
        Result listenableWorker$Result4 = Result.d();
        L.o(listenableWorker$Result4, "{\n            // there a…throw cancelled\n        }");
        return listenableWorker$Result4;
    }
}

