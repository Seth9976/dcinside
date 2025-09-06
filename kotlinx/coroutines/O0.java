package kotlinx.coroutines;

import kotlin.collections.k;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,540:1\n1#2:541\n*E\n"})
public abstract class o0 extends K {
    private long b;
    private boolean c;
    @m
    private k d;

    public final boolean A2() {
        k k0 = this.d;
        if(k0 == null) {
            return false;
        }
        e0 e00 = (e0)k0.y();
        if(e00 == null) {
            return false;
        }
        e00.run();
        return true;
    }

    public boolean C2() [...] // Inlined contents

    public static void J1(o0 o00, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if((v & 1) != 0) {
            z = false;
        }
        o00.u1(z);
    }

    // 去混淆评级： 低(20)
    private final long Q1(boolean z) [...] // 潜在的解密器

    public final void d2(@l e0 e00) {
        k k0 = this.d;
        if(k0 == null) {
            k0 = new k();
            this.d = k0;
        }
        k0.addLast(e00);
    }

    protected long e2() {
        k k0 = this.d;
        if(k0 == null) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        return k0.isEmpty() ? 0x7FFFFFFFFFFFFFFFL : 0L;
    }

    public final void g2(boolean z) {
        this.b += this.Q1(z);
        if(!z) {
            this.c = true;
        }
    }

    public static void i2(o0 o00, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if((v & 1) != 0) {
            z = false;
        }
        o00.g2(z);
    }

    public final boolean isActive() {
        return this.b > 0L;
    }

    @Override  // kotlinx.coroutines.K
    @l
    public final K j1(int v) {
        w.a(v);
        return this;
    }

    protected boolean j2() {
        return this.p2();
    }

    // 去混淆评级： 低(20)
    public final boolean o2() {
        return this.b >= 0x100000000L;
    }

    public final boolean p2() {
        return this.d == null ? true : this.d.isEmpty();
    }

    public void shutdown() {
    }

    public long t2() {
        return this.A2() ? 0L : 0x7FFFFFFFFFFFFFFFL;
    }

    public final void u1(boolean z) {
        long v = this.b - this.Q1(z);
        this.b = v;
        if(v > 0L) {
            return;
        }
        if(this.c) {
            this.shutdown();
        }
    }
}

