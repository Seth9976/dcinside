package androidx.work.impl.utils;

import A3.o;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.WorkerWrapperKt;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.t0;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import kotlinx.coroutines.w0;
import y4.l;
import y4.m;

public final class WorkForegroundKt {
    @l
    private static final String a;

    // 去混淆评级： 低(20)
    static {
        L.o("WM-WorkForegroundRunnab", "tagWithPrefix(\"WorkForegroundRunnable\")");
        WorkForegroundKt.a = "WM-WorkForegroundRunnab";
    }

    // 去混淆评级： 低(20)
    public static final String a() [...] // 潜在的解密器

    @m
    public static final Object b(@l Context context0, @l WorkSpec workSpec0, @l ListenableWorker listenableWorker0, @l ForegroundUpdater foregroundUpdater0, @l TaskExecutor taskExecutor0, @l d d0) {
        if(workSpec0.q && Build.VERSION.SDK_INT < 0x1F) {
            Executor executor0 = taskExecutor0.c();
            L.o(executor0, "taskExecutor.mainThreadExecutor");
            Object object0 = i.h(w0.c(executor0), new o(listenableWorker0, workSpec0, foregroundUpdater0, context0, null) {
                int k;
                final ListenableWorker l;
                final WorkSpec m;
                final ForegroundUpdater n;
                final Context o;

                {
                    this.l = listenableWorker0;
                    this.m = workSpec0;
                    this.n = foregroundUpdater0;
                    this.o = context0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                public final d create(Object object0, d d0) {
                    return new androidx.work.impl.utils.WorkForegroundKt.workForeground.2(this.l, this.m, this.n, this.o, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                public final Object invoke(O o0, d d0) {
                    return ((androidx.work.impl.utils.WorkForegroundKt.workForeground.2)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            t0 t00 = this.l.getForegroundInfoAsync();
                            L.o(t00, "worker.getForegroundInfoAsync()");
                            this.k = 1;
                            object0 = WorkerWrapperKt.d(t00, this.l, this);
                            if(object0 == object1) {
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
                    if(((ForegroundInfo)object0) == null) {
                        throw new IllegalStateException("Worker was marked important (" + this.m.c + ") but did not provide ForegroundInfo");
                    }
                    Logger.e().a("WM-WorkForegroundRunnab", "Updating notification for " + this.m.c);
                    UUID uUID0 = this.l.getId();
                    t0 t01 = this.n.a(this.o, uUID0, ((ForegroundInfo)object0));
                    L.o(t01, "foregroundUpdater.setFor…orker.id, foregroundInfo)");
                    this.k = 2;
                    object0 = ListenableFutureKt.a(t01, this);
                    return object0 == object1 ? object1 : object0;
                }
            }, d0);
            return object0 == b.l() ? object0 : S0.a;
        }
        return S0.a;
    }
}

