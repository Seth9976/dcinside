package androidx.work;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class DelegatingWorkerFactory extends WorkerFactory {
    @l
    private final List a;

    public DelegatingWorkerFactory() {
        this.a = new CopyOnWriteArrayList();
    }

    @Override  // androidx.work.WorkerFactory
    @m
    public final ListenableWorker a(@l Context context0, @l String s, @l WorkerParameters workerParameters0) {
        L.p(context0, "appContext");
        L.p(s, "workerClassName");
        L.p(workerParameters0, "workerParameters");
        for(Object object0: this.a) {
            WorkerFactory workerFactory0 = (WorkerFactory)object0;
            try {
                ListenableWorker listenableWorker0 = workerFactory0.a(context0, s, workerParameters0);
                if(listenableWorker0 != null) {
                    return listenableWorker0;
                }
            }
            catch(Throwable throwable0) {
                Logger.e().d("WM-DelegatingWkrFctry", "Unable to instantiate a ListenableWorker (" + s + ')', throwable0);
                throw throwable0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void e(@l WorkerFactory workerFactory0) {
        L.p(workerFactory0, "workerFactory");
        this.a.add(workerFactory0);
    }
}

