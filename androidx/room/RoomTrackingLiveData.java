package androidx.room;

import android.annotation.SuppressLint;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.L;
import y4.l;

@SuppressLint({"RestrictedApi"})
public final class RoomTrackingLiveData extends LiveData {
    @l
    private final RoomDatabase m;
    @l
    private final InvalidationLiveDataContainer n;
    private final boolean o;
    @l
    private final Callable p;
    @l
    private final Observer q;
    @l
    private final AtomicBoolean r;
    @l
    private final AtomicBoolean s;
    @l
    private final AtomicBoolean t;
    @l
    private final Runnable u;
    @l
    private final Runnable v;

    public RoomTrackingLiveData(@l RoomDatabase roomDatabase0, @l InvalidationLiveDataContainer invalidationLiveDataContainer0, boolean z, @l Callable callable0, @l String[] arr_s) {
        L.p(roomDatabase0, "database");
        L.p(invalidationLiveDataContainer0, "container");
        L.p(callable0, "computeFunction");
        L.p(arr_s, "tableNames");
        super();
        this.m = roomDatabase0;
        this.n = invalidationLiveDataContainer0;
        this.o = z;
        this.p = callable0;
        this.q = new Observer(this) {
            @Override  // androidx.room.InvalidationTracker$Observer
            public void c(@l Set set0) {
                L.p(set0, "tables");
                ArchTaskExecutor.h().b(this.b.z());
            }
        };
        this.r = new AtomicBoolean(true);
        this.s = new AtomicBoolean(false);
        this.t = new AtomicBoolean(false);
        this.u = () -> {
            boolean z;
            L.p(this, "this$0");
            if(this.t.compareAndSet(false, true)) {
                this.m.p().d(this.q);
            }
            do {
                if(this.s.compareAndSet(false, true)) {
                    Object object0 = null;
                    z = false;
                    try {
                        while(this.r.compareAndSet(true, false)) {
                            try {
                                object0 = this.p.call();
                                z = true;
                            }
                            catch(Exception exception0) {
                                throw new RuntimeException("Exception while computing database live data.", exception0);
                            }
                        }
                        if(z) {
                            this.o(object0);
                        }
                    }
                    finally {
                        this.s.set(false);
                    }
                }
                else {
                    z = false;
                }
            }
            while(z && this.r.get());
        };
        this.v = () -> {
            L.p(this, "this$0");
            boolean z = this.h();
            if(this.r.compareAndSet(false, true) && z) {
                this.B().execute(this.u);
            }
        };
    }

    @l
    public final Observer A() {
        return this.q;
    }

    // 去混淆评级： 低(20)
    @l
    public final Executor B() {
        return this.o ? this.m.x() : this.m.t();
    }

    @l
    public final Runnable C() {
        return this.u;
    }

    @l
    public final AtomicBoolean D() {
        return this.t;
    }

    // 检测为 Lambda 实现
    private static final void E(RoomTrackingLiveData roomTrackingLiveData0) [...]

    // 检测为 Lambda 实现
    private static final void F(RoomTrackingLiveData roomTrackingLiveData0) [...]

    @Override  // androidx.lifecycle.LiveData
    protected void m() {
        super.m();
        L.n(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        this.n.c(this);
        this.B().execute(this.u);
    }

    @Override  // androidx.lifecycle.LiveData
    protected void n() {
        super.n();
        L.n(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        this.n.d(this);
    }

    @l
    public final Callable u() {
        return this.p;
    }

    @l
    public final AtomicBoolean v() {
        return this.s;
    }

    @l
    public final RoomDatabase w() {
        return this.m;
    }

    public final boolean x() {
        return this.o;
    }

    @l
    public final AtomicBoolean y() {
        return this.r;
    }

    @l
    public final Runnable z() {
        return this.v;
    }
}

