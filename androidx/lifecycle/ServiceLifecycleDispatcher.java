package androidx.lifecycle;

import android.os.Handler;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class ServiceLifecycleDispatcher {
    public static final class DispatchRunnable implements Runnable {
        @l
        private final LifecycleRegistry a;
        @l
        private final Event b;
        private boolean c;

        public DispatchRunnable(@l LifecycleRegistry lifecycleRegistry0, @l Event lifecycle$Event0) {
            L.p(lifecycleRegistry0, "registry");
            L.p(lifecycle$Event0, "event");
            super();
            this.a = lifecycleRegistry0;
            this.b = lifecycle$Event0;
        }

        @l
        public final Event a() {
            return this.b;
        }

        @Override
        public void run() {
            if(!this.c) {
                this.a.l(this.b);
                this.c = true;
            }
        }
    }

    @l
    private final LifecycleRegistry a;
    @l
    private final Handler b;
    @m
    private DispatchRunnable c;

    public ServiceLifecycleDispatcher(@l LifecycleOwner lifecycleOwner0) {
        L.p(lifecycleOwner0, "provider");
        super();
        this.a = new LifecycleRegistry(lifecycleOwner0);
        this.b = new Handler();
    }

    @l
    public Lifecycle a() {
        return this.a;
    }

    public void b() {
        this.f(Event.ON_START);
    }

    public void c() {
        this.f(Event.ON_CREATE);
    }

    public void d() {
        this.f(Event.ON_STOP);
        this.f(Event.ON_DESTROY);
    }

    public void e() {
        this.f(Event.ON_START);
    }

    private final void f(Event lifecycle$Event0) {
        DispatchRunnable serviceLifecycleDispatcher$DispatchRunnable0 = this.c;
        if(serviceLifecycleDispatcher$DispatchRunnable0 != null) {
            serviceLifecycleDispatcher$DispatchRunnable0.run();
        }
        DispatchRunnable serviceLifecycleDispatcher$DispatchRunnable1 = new DispatchRunnable(this.a, lifecycle$Event0);
        this.c = serviceLifecycleDispatcher$DispatchRunnable1;
        L.m(serviceLifecycleDispatcher$DispatchRunnable1);
        this.b.postAtFrontOfQueue(serviceLifecycleDispatcher$DispatchRunnable1);
    }
}

