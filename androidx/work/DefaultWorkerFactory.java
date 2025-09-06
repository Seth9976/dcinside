package androidx.work;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RestrictTo({Scope.b})
public final class DefaultWorkerFactory extends WorkerFactory {
    @l
    public static final DefaultWorkerFactory a;

    static {
        DefaultWorkerFactory.a = new DefaultWorkerFactory();
    }

    @Override  // androidx.work.WorkerFactory
    public ListenableWorker a(Context context0, String s, WorkerParameters workerParameters0) {
        return (ListenableWorker)this.e(context0, s, workerParameters0);
    }

    @m
    public Void e(@l Context context0, @l String s, @l WorkerParameters workerParameters0) {
        L.p(context0, "appContext");
        L.p(s, "workerClassName");
        L.p(workerParameters0, "workerParameters");
        return null;
    }
}

