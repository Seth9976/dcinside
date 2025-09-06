package androidx.work.impl.utils;

import androidx.core.util.Consumer;
import androidx.work.Logger;
import androidx.work.WorkerExceptionInfo;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nWorkerExceptionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerExceptionUtils.kt\nandroidx/work/impl/utils/WorkerExceptionUtilsKt\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,37:1\n32#2:38\n*S KotlinDebug\n*F\n+ 1 WorkerExceptionUtils.kt\nandroidx/work/impl/utils/WorkerExceptionUtilsKt\n*L\n34#1:38\n*E\n"})
public final class WorkerExceptionUtilsKt {
    public static final void a(@l Consumer consumer0, @l WorkerExceptionInfo workerExceptionInfo0, @l String s) {
        L.p(consumer0, "<this>");
        L.p(workerExceptionInfo0, "info");
        L.p(s, "tag");
        try {
            consumer0.accept(workerExceptionInfo0);
        }
        catch(Throwable throwable0) {
            Logger.e().d(s, "Exception handler threw an exception", throwable0);
        }
    }
}

