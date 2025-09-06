package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlinx.coroutines.J0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.a;
import kotlinx.coroutines.selects.i;

@s0({"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,39:1\n713#2,2:40\n713#2,2:42\n713#2,2:44\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n17#1:40,2\n23#1:42,2\n30#1:44,2\n*E\n"})
public class m extends a implements l {
    @y4.l
    private final l d;

    public m(@y4.l g g0, @y4.l l l0, boolean z, boolean z1) {
        super(g0, z, z1);
        this.d = l0;
    }

    @Override  // kotlinx.coroutines.channels.G
    public boolean A() {
        return this.d.A();
    }

    @Override  // kotlinx.coroutines.channels.F
    public boolean C() {
        return this.d.C();
    }

    @Override  // kotlinx.coroutines.channels.F
    @y4.l
    public kotlinx.coroutines.selects.g D() {
        return this.d.D();
    }

    @Override  // kotlinx.coroutines.channels.F
    @y4.m
    public Object F(@y4.l d d0) {
        return this.d.F(d0);
    }

    @Override  // kotlinx.coroutines.channels.G
    public boolean G(@y4.m Throwable throwable0) {
        return this.d.G(throwable0);
    }

    @Override  // kotlinx.coroutines.channels.G
    @y4.m
    public Object I(Object object0, @y4.l d d0) {
        return this.d.I(object0, d0);
    }

    @y4.l
    protected final l Q1() {
        return this.d;
    }

    @y4.l
    public final l b() {
        return this;
    }

    @Override  // kotlinx.coroutines.Q0, kotlinx.coroutines.I0, kotlinx.coroutines.channels.F
    @k(level = kotlin.m.c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final boolean c(Throwable throwable0) {
        this.j0(new J0(Q0.M(this), null, this));
        return true;
    }

    @Override  // kotlinx.coroutines.Q0, kotlinx.coroutines.I0, kotlinx.coroutines.channels.F
    @k(level = kotlin.m.c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public void cancel() {
        this.j0(new J0(Q0.M(this), null, this));
    }

    @Override  // kotlinx.coroutines.channels.G
    @y4.l
    public i d() {
        return this.d.d();
    }

    @Override  // kotlinx.coroutines.Q0, kotlinx.coroutines.I0, kotlinx.coroutines.channels.F
    public final void e(@y4.m CancellationException cancellationException0) {
        if(this.isCancelled()) {
            return;
        }
        if(cancellationException0 == null) {
            cancellationException0 = new J0(Q0.M(this), null, this);
        }
        this.j0(cancellationException0);
    }

    @Override  // kotlinx.coroutines.channels.G
    public void h(@y4.l Function1 function10) {
        this.d.h(function10);
    }

    @Override  // kotlinx.coroutines.channels.F
    public boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override  // kotlinx.coroutines.channels.F
    @y4.l
    public n iterator() {
        return this.d.iterator();
    }

    @Override  // kotlinx.coroutines.Q0
    public void j0(@y4.l Throwable throwable0) {
        CancellationException cancellationException0 = Q0.E1(this, throwable0, null, 1, null);
        this.d.e(cancellationException0);
        this.h0(cancellationException0);
    }

    @Override  // kotlinx.coroutines.channels.G
    @y4.l
    public Object l(Object object0) {
        return this.d.l(object0);
    }

    @Override  // kotlinx.coroutines.channels.F
    @y4.l
    public kotlinx.coroutines.selects.g m() {
        return this.d.m();
    }

    @Override  // kotlinx.coroutines.channels.G
    @k(level = kotlin.m.b, message = "Deprecated in the favour of \'trySend\' method", replaceWith = @c0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(Object object0) {
        return this.d.offer(object0);
    }

    @Override  // kotlinx.coroutines.channels.F
    @k(level = kotlin.m.b, message = "Deprecated in the favour of \'tryReceive\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'poll\' did, for the precise replacement please refer to the \'poll\' documentation", replaceWith = @c0(expression = "tryReceive().getOrNull()", imports = {}))
    @y4.m
    public Object poll() {
        return this.d.poll();
    }

    @Override  // kotlinx.coroutines.channels.F
    @y4.l
    public kotlinx.coroutines.selects.g r() {
        return this.d.r();
    }

    @Override  // kotlinx.coroutines.channels.F
    @y4.l
    public Object v() {
        return this.d.v();
    }

    @Override  // kotlinx.coroutines.channels.F
    @h
    @k(level = kotlin.m.b, message = "Deprecated in favor of \'receiveCatching\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'receiveOrNull\' did, for the detailed replacement please refer to the \'receiveOrNull\' documentation", replaceWith = @c0(expression = "receiveCatching().getOrNull()", imports = {}))
    @y4.m
    public Object y(@y4.l d d0) {
        return this.d.y(d0);
    }

    @Override  // kotlinx.coroutines.channels.F
    @y4.m
    public Object z(@y4.l d d0) {
        return this.d.z(d0);
    }
}

