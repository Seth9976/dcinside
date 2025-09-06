package androidx.lifecycle;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.f;
import z3.j;

@RestrictTo({Scope.c})
public abstract class ComputableLiveData {
    @l
    private final Executor a;
    @l
    private final LiveData b;
    @l
    private final LiveData c;
    @l
    private final AtomicBoolean d;
    @l
    private final AtomicBoolean e;
    @l
    @f
    public final Runnable f;
    @l
    @f
    public final Runnable g;

    @j
    public ComputableLiveData() {
        this(null, 1, null);
    }

    @j
    public ComputableLiveData(@l Executor executor0) {
        L.p(executor0, "executor");
        super();
        this.a = executor0;
        androidx.lifecycle.ComputableLiveData._liveData.1 computableLiveData$_liveData$10 = new LiveData() {
            @Override  // androidx.lifecycle.LiveData
            protected void m() {
                this.m.e().execute(this.m.f);
            }
        };
        this.b = computableLiveData$_liveData$10;
        this.c = computableLiveData$_liveData$10;
        this.d = new AtomicBoolean(true);
        this.e = new AtomicBoolean(false);
        this.f = () -> {
            L.p(this, "this$0");
            do {
                int v = 0;
                if(this.e.compareAndSet(false, true)) {
                    Object object0 = null;
                    int v1 = 0;
                    try {
                        while(this.d.compareAndSet(true, false)) {
                            object0 = this.c();
                            v1 = 1;
                        }
                        if(v1 != 0) {
                            this.h().o(object0);
                        }
                    }
                    finally {
                        this.e.set(false);
                    }
                    v = v1;
                }
            }
            while(v != 0 && this.d.get());
        };
        this.g = () -> {
            L.p(this, "this$0");
            boolean z = this.h().h();
            if(this.d.compareAndSet(false, true) && z) {
                this.a.execute(this.f);
            }
        };
    }

    public ComputableLiveData(Executor executor0, int v, w w0) {
        if((v & 1) != 0) {
            executor0 = ArchTaskExecutor.g();
            L.o(executor0, "getIOThreadExecutor()");
        }
        this(executor0);
    }

    @WorkerThread
    protected abstract Object c();

    @l
    public final AtomicBoolean d() {
        return this.e;
    }

    @l
    public final Executor e() {
        return this.a;
    }

    @l
    public final AtomicBoolean f() {
        return this.d;
    }

    @VisibleForTesting
    public static void g() {
    }

    @l
    public LiveData h() {
        return this.c;
    }

    @VisibleForTesting
    public static void i() {
    }

    public void j() {
        ArchTaskExecutor.h().b(this.g);
    }

    // 检测为 Lambda 实现
    private static final void k(ComputableLiveData computableLiveData0) [...]

    // 检测为 Lambda 实现
    private static final void l(ComputableLiveData computableLiveData0) [...]
}

