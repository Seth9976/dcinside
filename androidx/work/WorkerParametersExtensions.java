package androidx.work;

import android.content.ComponentName;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nWorkerParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerParameters.kt\nandroidx/work/WorkerParametersExtensions\n+ 2 Data_.kt\nandroidx/work/Data\n*L\n1#1,100:1\n229#2:101\n229#2:102\n229#2:103\n*S KotlinDebug\n*F\n+ 1 WorkerParameters.kt\nandroidx/work/WorkerParametersExtensions\n*L\n96#1:101\n97#1:102\n98#1:103\n*E\n"})
@i(name = "WorkerParametersExtensions")
public final class WorkerParametersExtensions {
    @RestrictTo({Scope.b})
    @l
    public static final Data a(@l String s, @l ComponentName componentName0, @l Data data0) {
        L.p(s, "delegatedWorkerName");
        L.p(componentName0, "componentName");
        L.p(data0, "inputData");
        Builder data$Builder0 = new Builder();
        data$Builder0.c(data0).r("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", componentName0.getPackageName()).r("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", componentName0.getClassName()).r("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", s);
        return data$Builder0.a();
    }

    @RestrictTo({Scope.b})
    public static final boolean b(@l Data data0) {
        L.p(data0, "<this>");
        return data0.u("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class) && data0.u("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class) && data0.u("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
    }

    public static final boolean c(@l WorkerParameters workerParameters0) {
        L.p(workerParameters0, "<this>");
        Data data0 = workerParameters0.e();
        L.o(data0, "inputData");
        return WorkerParametersExtensions.b(data0);
    }

    public static final WorkerParameters d(WorkerParameters workerParameters0, ComponentName componentName0) {
        L.p(workerParameters0, "<this>");
        L.p(componentName0, "componentName");
        L.y(4, "T");
        L.o("androidx.work.ListenableWorker", "T::class.java.name");
        return WorkerParametersExtensions.e(workerParameters0, "androidx.work.ListenableWorker", componentName0);
    }

    @l
    public static final WorkerParameters e(@l WorkerParameters workerParameters0, @l String s, @l ComponentName componentName0) {
        L.p(workerParameters0, "<this>");
        L.p(s, "workerClassName");
        L.p(componentName0, "componentName");
        Data data0 = workerParameters0.e();
        L.o(data0, "inputData");
        return new WorkerParameters(workerParameters0.d(), WorkerParametersExtensions.a(s, componentName0, data0), workerParameters0.j(), workerParameters0.i(), workerParameters0.h(), workerParameters0.c(), workerParameters0.a(), workerParameters0.n(), workerParameters0.k(), workerParameters0.o(), workerParameters0.g(), workerParameters0.b());
    }
}

