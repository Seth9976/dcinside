package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.J0;
import kotlinx.coroutines.L;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.a;
import kotlinx.coroutines.selects.i;
import y4.l;
import y4.m;

@s0({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,200:1\n713#2,2:201\n713#2,2:203\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n*L\n149#1:201,2\n155#1:203,2\n*E\n"})
class g extends a implements D, d {
    @l
    private final d d;

    public g(@l kotlin.coroutines.g g0, @l d d0, boolean z) {
        super(g0, false, z);
        this.d = d0;
        this.S0(((I0)g0.get(I0.B8)));
    }

    @Override  // kotlinx.coroutines.channels.G
    public boolean A() {
        return this.d.A();
    }

    @Override  // kotlinx.coroutines.channels.G
    public boolean G(@m Throwable throwable0) {
        boolean z = this.d.G(throwable0);
        this.start();
        return z;
    }

    @Override  // kotlinx.coroutines.channels.G
    @m
    public Object I(Object object0, @l kotlin.coroutines.d d0) {
        return this.d.I(object0, d0);
    }

    @Override  // kotlinx.coroutines.a
    protected void N1(@l Throwable throwable0, boolean z) {
        if(!this.d.G(throwable0) && !z) {
            L.b(this.getContext(), throwable0);
        }
    }

    @Override  // kotlinx.coroutines.a
    public void O1(Object object0) {
        this.R1(((S0)object0));
    }

    @l
    protected final d Q1() {
        return this.d;
    }

    protected void R1(@l S0 s00) {
        kotlinx.coroutines.channels.G.a.a(this.d, null, 1, null);
    }

    @Override  // kotlinx.coroutines.channels.D
    @l
    public G b() {
        return this;
    }

    @Override  // kotlinx.coroutines.channels.d, kotlinx.coroutines.Q0, kotlinx.coroutines.I0
    @k(level = kotlin.m.c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final boolean c(Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new J0(Q0.M(this), null, this);
        }
        this.j0(throwable0);
        return true;
    }

    @Override  // kotlinx.coroutines.channels.G
    @l
    public i d() {
        return this.d.d();
    }

    @Override  // kotlinx.coroutines.channels.d, kotlinx.coroutines.Q0, kotlinx.coroutines.I0
    public final void e(@m CancellationException cancellationException0) {
        if(cancellationException0 == null) {
            cancellationException0 = new J0(Q0.M(this), null, this);
        }
        this.j0(cancellationException0);
    }

    @Override  // kotlinx.coroutines.channels.d
    @l
    public F g() {
        return this.d.g();
    }

    @Override  // kotlinx.coroutines.channels.G
    public void h(@l Function1 function10) {
        this.d.h(function10);
    }

    @Override  // kotlinx.coroutines.a
    public boolean isActive() {
        return super.isActive();
    }

    @Override  // kotlinx.coroutines.Q0
    public void j0(@l Throwable throwable0) {
        CancellationException cancellationException0 = Q0.E1(this, throwable0, null, 1, null);
        this.d.e(cancellationException0);
        this.h0(cancellationException0);
    }

    @Override  // kotlinx.coroutines.channels.G
    @l
    public Object l(Object object0) {
        return this.d.l(object0);
    }

    @Override  // kotlinx.coroutines.channels.G
    @k(level = kotlin.m.b, message = "Deprecated in the favour of \'trySend\' method", replaceWith = @c0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(Object object0) {
        return this.d.offer(object0);
    }
}

