package kotlinx.coroutines.sync;

import com.google.common.util.concurrent.Z0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.S;
import y4.l;
import y4.m;

@s0({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,392:1\n366#1,2:393\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n379#1:393,2\n*E\n"})
final class g extends S {
    private final AtomicReferenceArray e;

    public g(long v, @m g g0, int v1) {
        super(v, g0, v1);
        this.e = new AtomicReferenceArray(16);
    }

    public final boolean D(int v, @m Object object0, @m Object object1) {
        return Z0.a(this.F(), v, object0, object1);
    }

    @m
    public final Object E(int v) {
        return this.F().get(v);
    }

    public final AtomicReferenceArray F() {
        return this.e;
    }

    @m
    public final Object G(int v, @m Object object0) {
        return this.F().getAndSet(v, object0);
    }

    public final void H(int v, @m Object object0) {
        this.F().set(v, object0);
    }

    @Override
    @l
    public String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + this.hashCode() + ']';
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.coroutines.internal.S
    public int y() {
        return 16;
    }

    @Override  // kotlinx.coroutines.internal.S
    public void z(int v, @m Throwable throwable0, @l kotlin.coroutines.g g0) {
        this.F().set(v, f.e);
        this.A();
    }
}

