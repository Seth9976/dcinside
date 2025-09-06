package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.flow.internal.y;
import y4.l;
import y4.m;

@s0({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/ChannelAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
final class e extends kotlinx.coroutines.flow.internal.e {
    private volatile int consumed$volatile;
    @l
    private final F d;
    private final boolean e;
    private static final AtomicIntegerFieldUpdater f;

    static {
        e.f = AtomicIntegerFieldUpdater.newUpdater(e.class, "consumed$volatile");
    }

    public e(@l F f0, boolean z, @l g g0, int v, @l i i0) {
        super(g0, v, i0);
        this.d = f0;
        this.e = z;
        this.consumed$volatile = 0;
    }

    public e(F f0, boolean z, g g0, int v, i i0, int v1, w w0) {
        if((v1 & 4) != 0) {
            g0 = kotlin.coroutines.i.a;
        }
        if((v1 & 16) != 0) {
            i0 = i.a;
        }
        this(f0, z, g0, ((v1 & 8) == 0 ? v : -3), i0);
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @m
    public Object collect(@l j j0, @l d d0) {
        if(this.b == -3) {
            this.p();
            Object object0 = kotlinx.coroutines.flow.m.e(j0, this.d, this.e, d0);
            return object0 == b.l() ? object0 : S0.a;
        }
        Object object1 = super.collect(j0, d0);
        return object1 == b.l() ? object1 : S0.a;
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    protected String f() {
        return "channel=" + this.d;
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @m
    protected Object h(@l D d0, @l d d1) {
        Object object0 = kotlinx.coroutines.flow.m.e(new y(d0), this.d, this.e, d1);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    protected kotlinx.coroutines.flow.internal.e i(@l g g0, int v, @l i i0) {
        return new e(this.d, this.e, g0, v, i0);
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    public kotlinx.coroutines.flow.i j() {
        return new e(this.d, this.e, null, 0, null, 28, null);
    }

    @Override  // kotlinx.coroutines.flow.internal.e
    @l
    public F m(@l O o0) {
        this.p();
        return this.b == -3 ? this.d : super.m(o0);
    }

    private final int n() {
        return this.consumed$volatile;
    }

    private final void p() {
        if(this.e && e.f.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    private final void q(int v) {
        this.consumed$volatile = v;
    }
}

