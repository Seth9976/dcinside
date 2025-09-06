package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.CallSuper;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;

public class LifecycleService extends Service implements LifecycleOwner {
    @l
    private final ServiceLifecycleDispatcher a;

    public LifecycleService() {
        this.a = new ServiceLifecycleDispatcher(this);
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @l
    public Lifecycle getLifecycle() {
        return this.a.a();
    }

    @Override  // android.app.Service
    @CallSuper
    @m
    public IBinder onBind(@l Intent intent0) {
        L.p(intent0, "intent");
        this.a.b();
        return null;
    }

    @Override  // android.app.Service
    @CallSuper
    public void onCreate() {
        this.a.c();
        super.onCreate();
    }

    @Override  // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.a.d();
        super.onDestroy();
    }

    @Override  // android.app.Service
    @CallSuper
    @k(message = "Deprecated in Java")
    public void onStart(@m Intent intent0, int v) {
        this.a.e();
        super.onStart(intent0, v);
    }

    @Override  // android.app.Service
    @CallSuper
    public int onStartCommand(@m Intent intent0, int v, int v1) {
        return super.onStartCommand(intent0, v, v1);
    }
}

