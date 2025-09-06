package kotlinx.coroutines.channels;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.reflect.i;
import kotlinx.coroutines.internal.V;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.o;
import y4.l;
import z3.f;

public final class k {
    @l
    private static final V A = null;
    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 2;
    private static final int E = 3;
    private static final int F = 60;
    private static final long G = 0xFFFFFFFFFFFFFFFL;
    private static final long H = 0x4000000000000000L;
    private static final long I = 0x3FFFFFFFFFFFFFFFL;
    @l
    private static final q a = null;
    @f
    public static final int b = 0;
    private static final int c = 0;
    private static final long d = 0L;
    private static final long e = 0x7FFFFFFFFFFFFFFFL;
    @l
    @f
    public static final V f = null;
    @l
    private static final V g = null;
    @l
    private static final V h = null;
    @l
    private static final V i = null;
    @l
    private static final V j = null;
    @l
    private static final V k = null;
    @l
    private static final V l = null;
    @l
    private static final V m = null;
    @l
    private static final V n = null;
    @l
    private static final V o = null;
    @l
    private static final V p = null;
    @l
    private static final V q = null;
    private static final int r = 0;
    private static final int s = 1;
    private static final int t = 2;
    private static final int u = 3;
    private static final int v = 4;
    private static final int w = 5;
    @l
    private static final V x;
    @l
    private static final V y;
    @l
    private static final V z;

    static {
        k.a = new q(-1L, null, null, 0);
        k.b = a0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 0x20, 0, 0, 12, null);
        k.c = a0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        k.f = new V("BUFFERED");
        k.g = new V("SHOULD_BUFFER");
        k.h = new V("S_RESUMING_BY_RCV");
        k.i = new V("RESUMING_BY_EB");
        k.j = new V("POISONED");
        k.k = new V("DONE_RCV");
        k.l = new V("INTERRUPTED_SEND");
        k.m = new V("INTERRUPTED_RCV");
        k.n = new V("CHANNEL_CLOSED");
        k.o = new V("SUSPEND");
        k.p = new V("SUSPEND_NO_WAITER");
        k.q = new V("FAILED");
        k.x = new V("NO_RECEIVE_RESULT");
        k.y = new V("CLOSE_HANDLER_CLOSED");
        k.z = new V("CLOSE_HANDLER_INVOKED");
        k.A = new V("NO_CLOSE_CAUSE");
    }

    private static final long A(long v) {
        return v & 0x3FFFFFFFFFFFFFFFL;
    }

    private static final boolean B(long v) {
        return (v & 0x4000000000000000L) != 0L;
    }

    private static final int C(long v) {
        return (int)(v >> 60);
    }

    private static final long D(long v) {
        return v & 0xFFFFFFFFFFFFFFFL;
    }

    private static final long E(int v) {
        switch(v) {
            case 0: {
                return 0L;
            }
            case 0x7FFFFFFF: {
                return 0x7FFFFFFFFFFFFFFFL;
            }
            default: {
                return (long)v;
            }
        }
    }

    private static final boolean F(o o0, Object object0, Function1 function10) {
        Object object1 = o0.U(object0, null, function10);
        if(object1 != null) {
            o0.E(object1);
            return true;
        }
        return false;
    }

    static boolean G(o o0, Object object0, Function1 function10, int v, Object object1) {
        if((v & 2) != 0) {
            function10 = null;
        }
        return k.F(o0, object0, function10);
    }

    public static final long b(long v, int v1) {
        return (((long)v1) << 60) + v;
    }

    public static final int g() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    private static final long v(long v, boolean z) {
        return z ? v + 0x4000000000000000L : v;
    }

    private static final long w(long v, int v1) [...] // Inlined contents

    private static final q x(long v, q q0) {
        return new q(v, q0, q0.G(), 0);
    }

    @l
    public static final i y() {
        final class a extends H implements A3.o {
            public static final a a;

            static {
                a.a = new a();
            }

            a() {
                super(2, k.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
            }

            @l
            public final q a(long v, @l q q0) {
                return k.x(v, q0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).longValue(), ((q)object1));
            }
        }

        return a.a;
    }

    @l
    public static final V z() {
        return k.n;
    }
}

