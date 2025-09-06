package androidx.lifecycle;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.U0;
import kotlinx.coroutines.h0;
import y4.l;

public final class DispatchQueue {
    private boolean a;
    private boolean b;
    private boolean c;
    @l
    private final Queue d;

    public DispatchQueue() {
        this.a = true;
        this.d = new ArrayDeque();
    }

    // 去混淆评级： 低(20)
    @MainThread
    public final boolean b() {
        return this.b || !this.a;
    }

    @AnyThread
    public final void c(@l g g0, @l Runnable runnable0) {
        L.p(g0, "context");
        L.p(runnable0, "runnable");
        U0 u00 = h0.e().u1();
        if(!u00.i1(g0) && !this.b()) {
            this.f(runnable0);
            return;
        }
        u00.b1(g0, () -> {
            L.p(this, "this$0");
            L.p(runnable0, "$runnable");
            this.f(runnable0);
        });
    }

    // 检测为 Lambda 实现
    private static final void d(DispatchQueue dispatchQueue0, Runnable runnable0) [...]

    @MainThread
    public final void e() {
        if(this.c) {
            return;
        }
        try {
            this.c = true;
            while(!this.d.isEmpty() && this.b()) {
                Runnable runnable0 = (Runnable)this.d.poll();
                if(runnable0 != null) {
                    runnable0.run();
                }
            }
        }
        finally {
            this.c = false;
        }
    }

    @MainThread
    private final void f(Runnable runnable0) {
        if(!this.d.offer(runnable0)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        this.e();
    }

    @MainThread
    public final void g() {
        this.b = true;
        this.e();
    }

    @MainThread
    public final void h() {
        this.a = true;
    }

    @MainThread
    public final void i() {
        if(!this.a) {
            return;
        }
        if(this.b) {
            throw new IllegalStateException("Cannot resume a finished dispatcher");
        }
        this.a = false;
        this.e();
    }
}

