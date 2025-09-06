package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.a;
import com.google.common.util.concurrent.Z0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,251:1\n89#2:252\n89#2:253\n89#2:254\n89#2:257\n89#2:258\n1#3:255\n21#4:256\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n91#1:252\n158#1:253\n181#1:254\n201#1:257\n245#1:258\n201#1:256\n*E\n"})
public final class q {
    @l
    private final AtomicReferenceArray a;
    private static final AtomicReferenceFieldUpdater b;
    private volatile int blockingTasksInBuffer$volatile;
    private static final AtomicIntegerFieldUpdater c;
    private volatile int consumerIndex$volatile;
    private static final AtomicIntegerFieldUpdater d;
    private static final AtomicIntegerFieldUpdater e;
    private volatile Object lastScheduledTask$volatile;
    private volatile int producerIndex$volatile;

    static {
        q.b = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "lastScheduledTask$volatile");
        q.c = AtomicIntegerFieldUpdater.newUpdater(q.class, "producerIndex$volatile");
        q.d = AtomicIntegerFieldUpdater.newUpdater(q.class, "consumerIndex$volatile");
        q.e = AtomicIntegerFieldUpdater.newUpdater(q.class, "blockingTasksInBuffer$volatile");
    }

    public q() {
        this.a = new AtomicReferenceArray(0x80);
    }

    private final k A(int v, boolean z) {
        boolean z1 = true;
        k k0 = (k)this.a.get(v & 0x7F);
        if(k0 != null) {
            if(k0.b.d0() != 1) {
                z1 = false;
            }
            if(z1 == z && Z0.a(this.a, v & 0x7F, k0, null)) {
                if(z) {
                    q.e.decrementAndGet(this);
                }
                return k0;
            }
        }
        return null;
    }

    public final long B(int v, @l h l0$h0) {
        k k0 = v == 3 ? this.r() : this.z(v);
        if(k0 != null) {
            l0$h0.a = k0;
            return -1L;
        }
        return this.C(v, l0$h0);
    }

    private final long C(int v, h l0$h0) {
        k k0;
        do {
            int v1 = 1;
            k0 = (k)q.b.get(this);
            if(k0 == null) {
                return -2L;
            }
            if(k0.b.d0() != 1) {
                v1 = 2;
            }
            if((v1 & v) == 0) {
                return -2L;
            }
            long v2 = o.f.a() - k0.a;
            long v3 = o.b;
            if(v2 < v3) {
                return v3 - v2;
            }
        }
        while(!a.a(q.b, this, k0, null));
        l0$h0.a = k0;
        return -1L;
    }

    @m
    public final k a(@l k k0, boolean z) {
        if(z) {
            return this.c(k0);
        }
        k k1 = (k)q.b.getAndSet(this, k0);
        return k1 == null ? null : this.c(k1);
    }

    public static k b(q q0, k k0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return q0.a(k0, z);
    }

    private final k c(k k0) {
        if(this.g() == 0x7F) {
            return k0;
        }
        if(k0.b.d0() == 1) {
            q.e.incrementAndGet(this);
        }
        int v = q.c.get(this);
        while(this.a.get(v & 0x7F) != null) {
            Thread.yield();
        }
        this.a.lazySet(v & 0x7F, k0);
        q.c.incrementAndGet(this);
        return null;
    }

    private final void d(k k0) {
        if(k0 != null && k0.b.d0() == 1) {
            q.e.decrementAndGet(this);
        }
    }

    private final int e() {
        return this.blockingTasksInBuffer$volatile;
    }

    private final int g() {
        return q.c.get(this) - q.d.get(this);
    }

    private final int h() {
        return this.consumerIndex$volatile;
    }

    private final Object j() {
        return this.lastScheduledTask$volatile;
    }

    private final int l() {
        return this.producerIndex$volatile;
    }

    public final int n() {
        return q.b.get(this) == null ? this.g() : this.g() + 1;
    }

    public final void o(@l f f0) {
        k k0 = (k)q.b.getAndSet(this, null);
        if(k0 != null) {
            f0.a(k0);
        }
        while(this.t(f0)) {
        }
    }

    @m
    public final k p() {
        k k0 = (k)q.b.getAndSet(this, null);
        return k0 == null ? this.r() : k0;
    }

    @m
    public final k q() {
        return this.u(true);
    }

    private final k r() {
        k k0;
        int v;
        do {
            do {
                v = q.d.get(this);
                if(v - q.c.get(this) == 0) {
                    return null;
                }
            }
            while(!q.d.compareAndSet(this, v, v + 1));
            k0 = (k)this.a.getAndSet(v & 0x7F, null);
        }
        while(k0 == null);
        this.d(k0);
        return k0;
    }

    @m
    public final k s() {
        return this.u(false);
    }

    private final boolean t(f f0) {
        k k0 = this.r();
        if(k0 == null) {
            return false;
        }
        f0.a(k0);
        return true;
    }

    private final k u(boolean z) {
        k k1;
        while(true) {
            boolean z1 = true;
            k k0 = (k)q.b.get(this);
            if(k0 == null) {
                break;
            }
            if(k0.b.d0() != 1) {
                z1 = false;
            }
            if(z1 != z) {
                break;
            }
            if(a.a(q.b, this, k0, null)) {
                return k0;
            }
        }
        int v = q.d.get(this);
        int v1 = q.c.get(this);
        do {
            if(v == v1 || z && q.e.get(this) == 0) {
                return null;
            }
            --v1;
            k1 = this.A(v1, z);
        }
        while(k1 == null);
        return k1;
    }

    private final void v(int v) {
        this.blockingTasksInBuffer$volatile = v;
    }

    private final void w(int v) {
        this.consumerIndex$volatile = v;
    }

    private final void x(Object object0) {
        this.lastScheduledTask$volatile = object0;
    }

    private final void y(int v) {
        this.producerIndex$volatile = v;
    }

    private final k z(int v) {
        k k0;
        int v1 = q.d.get(this);
        int v2 = q.c.get(this);
        boolean z = true;
        if(v != 1) {
            z = false;
        }
        while(true) {
            if(v1 == v2 || z && q.e.get(this) == 0) {
                return null;
            }
            k0 = this.A(v1, z);
            if(k0 != null) {
                break;
            }
            ++v1;
        }
        return k0;
    }
}

