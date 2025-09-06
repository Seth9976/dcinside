package androidx.work;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public abstract class WorkerFactory {
    @m
    public abstract ListenableWorker a(@l Context arg1, @l String arg2, @l WorkerParameters arg3);

    @RestrictTo({Scope.b})
    @l
    public final ListenableWorker b(@l Context context0, @l String s, @l WorkerParameters workerParameters0) {
        L.p(context0, "appContext");
        L.p(s, "workerClassName");
        L.p(workerParameters0, "workerParameters");
        ListenableWorker listenableWorker0 = this.a(context0, s, workerParameters0);
        if(listenableWorker0 == null) {
            listenableWorker0 = WorkerFactory.c(context0, s, workerParameters0);
        }
        if(listenableWorker0.isUsed()) {
            throw new IllegalStateException("WorkerFactory (" + this.getClass().getName() + ") returned an instance of a ListenableWorker (" + s + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        }
        return listenableWorker0;
    }

    private static final ListenableWorker c(Context context0, String s, WorkerParameters workerParameters0) {
        Class class0 = WorkerFactory.d(s);
        try {
            Object object0 = class0.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context0, workerParameters0);
            L.o(object0, "{\n                val co…Parameters)\n            }");
            return (ListenableWorker)object0;
        }
        catch(Throwable throwable0) {
            Logger.e().d("WM-WorkerFactory", "Could not instantiate " + s, throwable0);
            throw throwable0;
        }
    }

    private static final Class d(String s) {
        try {
            Class class0 = Class.forName(s).asSubclass(ListenableWorker.class);
            L.o(class0, "{\n                Class.…class.java)\n            }");
            return class0;
        }
        catch(Throwable throwable0) {
            Logger.e().d("WM-WorkerFactory", "Invalid class: " + s, throwable0);
            throw throwable0;
        }
    }
}

