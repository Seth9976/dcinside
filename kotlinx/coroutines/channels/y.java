package kotlinx.coroutines.channels;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.o;
import kotlinx.coroutines.internal.L;
import kotlinx.coroutines.internal.i0;
import y4.l;
import y4.m;

@s0({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,94:1\n556#2,5:95\n522#2,6:100\n522#2,6:106\n556#2,5:112\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n37#1:95,5\n49#1:100,6\n81#1:106,6\n84#1:112,5\n*E\n"})
public class y extends j {
    private final int m;
    @l
    private final i n;

    public y(int v, @l i i0, @m Function1 function10) {
        super(v, function10);
        this.m = v;
        this.n = i0;
        if(i0 == i.a) {
            throw new IllegalArgumentException("This implementation does not support suspension for senders, use j instead");
        }
        if(v < 1) {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + v + " was specified").toString());
        }
    }

    public y(int v, i i0, Function1 function10, int v1, w w0) {
        if((v1 & 4) != 0) {
            function10 = null;
        }
        this(v, i0, function10);
    }

    @Override  // kotlinx.coroutines.channels.j
    @m
    public Object F1(Object object0, @l d d0) {
        return y.l2(this, object0, d0);
    }

    @Override  // kotlinx.coroutines.channels.j
    @m
    public Object I(Object object0, @l d d0) {
        return y.k2(this, object0, d0);
    }

    @Override  // kotlinx.coroutines.channels.j
    protected boolean S0() {
        return this.n == i.b;
    }

    @Override  // kotlinx.coroutines.channels.j
    public boolean V1() {
        return false;
    }

    static Object k2(y y0, Object object0, d d0) {
        if(y0.n2(object0, true) instanceof a) {
            Function1 function10 = y0.b;
            if(function10 != null) {
                i0 i00 = L.d(function10, object0, null, 2, null);
                if(i00 != null) {
                    o.a(i00, y0.A0());
                    throw i00;
                }
            }
            throw y0.A0();
        }
        return S0.a;
    }

    @Override  // kotlinx.coroutines.channels.j
    @l
    public Object l(Object object0) {
        return this.n2(object0, false);
    }

    static Object l2(y y0, Object object0, d d0) {
        Object object1 = y0.n2(object0, true);
        if(!(object1 instanceof c)) {
            S0 s00 = (S0)object1;
            return b.a(true);
        }
        return b.a(false);
    }

    private final Object m2(Object object0, boolean z) {
        Object object1 = super.l(object0);
        if(!p.m(object1) && !p.k(object1)) {
            if(z) {
                Function1 function10 = this.b;
                if(function10 != null) {
                    i0 i00 = L.d(function10, object0, null, 2, null);
                    if(i00 != null) {
                        throw i00;
                    }
                }
            }
            return p.b.c(S0.a);
        }
        return object1;
    }

    private final Object n2(Object object0, boolean z) {
        return this.n == i.c ? this.m2(object0, z) : this.Z1(object0);
    }

    @Override  // kotlinx.coroutines.channels.j
    protected void z1(@l kotlinx.coroutines.selects.m m0, @m Object object0) {
        Object object1 = this.l(object0);
        if(!(object1 instanceof c)) {
            S0 s00 = (S0)object1;
            m0.g(S0.a);
            return;
        }
        if(!(object1 instanceof a)) {
            throw new IllegalStateException("unreachable");
        }
        m0.g(k.z());
    }
}

