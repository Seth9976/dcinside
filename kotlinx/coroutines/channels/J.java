package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.S0;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.internal.L;
import kotlinx.coroutines.internal.S;
import kotlinx.coroutines.internal.T;
import kotlinx.coroutines.internal.U;
import kotlinx.coroutines.internal.V;
import kotlinx.coroutines.internal.i0;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import kotlinx.coroutines.r;
import kotlinx.coroutines.x0;
import kotlinx.coroutines.y1;
import y4.m;
import z3.f;
import z3.i;

@s0({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3086:1\n273#1,6:3089\n280#1,68:3096\n397#1,18:3187\n244#1:3205\n269#1,10:3206\n280#1,48:3217\n418#1:3265\n334#1,14:3266\n422#1,3:3281\n244#1:3294\n269#1,10:3295\n280#1,68:3306\n244#1:3384\n269#1,10:3385\n280#1,68:3396\n244#1:3468\n269#1,10:3469\n280#1,68:3480\n244#1:3549\n269#1,10:3550\n280#1,68:3561\n909#1,52:3631\n987#1,8:3687\n881#1:3695\n905#1,33:3696\n997#1:3729\n939#1,14:3730\n958#1,3:3745\n1002#1,6:3748\n909#1,52:3762\n987#1,8:3818\n881#1:3826\n905#1,33:3827\n997#1:3860\n939#1,14:3861\n958#1,3:3876\n1002#1,6:3879\n881#1:3894\n905#1,48:3895\n958#1,3:3944\n881#1:3947\n905#1,48:3948\n958#1,3:3997\n244#1:4009\n269#1,10:4010\n280#1,68:4021\n881#1:4090\n905#1,48:4091\n958#1,3:4140\n1#2:3087\n3069#3:3088\n3069#3:3095\n3069#3:3216\n3069#3:3305\n3069#3:3395\n3069#3:3467\n3069#3:3479\n3069#3:3560\n3069#3:3630\n3069#3:3893\n3069#3:4000\n3069#3:4001\n3083#3:4002\n3083#3:4003\n3082#3:4004\n3082#3:4005\n3082#3:4006\n3083#3:4007\n3082#3:4008\n3069#3:4020\n3070#3:4143\n3069#3:4144\n3069#3:4145\n3069#3:4146\n3070#3:4147\n3069#3:4148\n3070#3:4171\n3069#3:4172\n3069#3:4173\n3070#3:4174\n3069#3:4224\n3070#3:4225\n3070#3:4226\n3070#3:4244\n3070#3:4245\n318#4,9:3164\n327#4,2:3181\n336#4,4:3183\n340#4,8:3284\n318#4,9:3375\n327#4,2:3465\n336#4,4:3683\n340#4,8:3754\n336#4,4:3814\n340#4,8:3885\n216#5:3173\n217#5:3176\n216#5:3177\n217#5:3180\n57#6,2:3174\n57#6,2:3178\n57#6,2:3292\n269#7:3280\n269#7:3374\n269#7:3464\n269#7:3548\n269#7:3629\n269#7:4089\n905#8:3744\n905#8:3875\n905#8:3943\n905#8:3996\n905#8:4139\n33#9,11:4149\n33#9,11:4160\n68#10,3:4175\n42#10,8:4178\n68#10,3:4186\n42#10,8:4189\n42#10,8:4197\n68#10,3:4205\n42#10,8:4208\n42#10,8:4216\n766#11:4227\n857#11,2:4228\n2310#11,14:4230\n766#11:4246\n857#11,2:4247\n2310#11,14:4249\n766#11:4263\n857#11,2:4264\n2310#11,14:4266\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n113#1:3089,6\n113#1:3096,68\n154#1:3187,18\n154#1:3205\n154#1:3206,10\n154#1:3217,48\n154#1:3265\n154#1:3266,14\n154#1:3281,3\n194#1:3294\n194#1:3295,10\n194#1:3306,68\n225#1:3384\n225#1:3385,10\n225#1:3396,68\n356#1:3468\n356#1:3469,10\n356#1:3480,68\n414#1:3549\n414#1:3550,10\n414#1:3561,68\n690#1:3631,52\n719#1:3687,8\n719#1:3695\n719#1:3696,33\n719#1:3729\n719#1:3730,14\n719#1:3745,3\n719#1:3748,6\n755#1:3762,52\n771#1:3818,8\n771#1:3826\n771#1:3827,33\n771#1:3860\n771#1:3861,14\n771#1:3876,3\n771#1:3879,6\n804#1:3894\n804#1:3895,48\n804#1:3944,3\n994#1:3947\n994#1:3948,48\n994#1:3997,3\n1487#1:4009\n1487#1:4010,10\n1487#1:4021,68\n1535#1:4090\n1535#1:4091,48\n1535#1:4140,3\n70#1:3088\n113#1:3095\n154#1:3216\n194#1:3305\n225#1:3395\n278#1:3467\n356#1:3479\n414#1:3560\n629#1:3630\n794#1:3893\n1030#1:4000\n1079#1:4001\n1397#1:4002\n1399#1:4003\n1429#1:4004\n1439#1:4005\n1448#1:4006\n1449#1:4007\n1456#1:4008\n1487#1:4020\n1896#1:4143\n1898#1:4144\n1900#1:4145\n1913#1:4146\n1924#1:4147\n1925#1:4148\n2227#1:4171\n2240#1:4172\n2250#1:4173\n2253#1:4174\n2570#1:4224\n2572#1:4225\n2597#1:4226\n2659#1:4244\n2660#1:4245\n134#1:3164,9\n134#1:3181,2\n153#1:3183,4\n153#1:3284,8\n221#1:3375,9\n221#1:3465,2\n718#1:3683,4\n718#1:3754,8\n769#1:3814,4\n769#1:3885,8\n138#1:3173\n138#1:3176\n141#1:3177\n141#1:3180\n138#1:3174,2\n141#1:3178,2\n183#1:3292,2\n154#1:3280\n194#1:3374\n225#1:3464\n356#1:3548\n414#1:3629\n1487#1:4089\n719#1:3744\n771#1:3875\n804#1:3943\n994#1:3996\n1535#1:4139\n2129#1:4149,11\n2184#1:4160,11\n2392#1:4175,3\n2392#1:4178,8\n2447#1:4186,3\n2447#1:4189,8\n2466#1:4197,8\n2496#1:4205,3\n2496#1:4208,8\n2557#1:4216,8\n2606#1:4227\n2606#1:4228,2\n2607#1:4230,14\n2671#1:4246\n2671#1:4247,2\n2672#1:4249,14\n2712#1:4263\n2712#1:4264,2\n2713#1:4266,14\n*E\n"})
public class j implements l {
    @s0({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3086:1\n909#2,52:3087\n987#2,8:3143\n881#2:3151\n905#2,33:3152\n997#2:3185\n939#2,14:3186\n958#2,3:3201\n1002#2,6:3204\n336#3,4:3139\n340#3,8:3210\n905#4:3200\n57#5,2:3218\n57#5,2:3221\n1#6:3220\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1618#1:3087,52\n1655#1:3143,8\n1655#1:3151\n1655#1:3152,33\n1655#1:3185\n1655#1:3186,14\n1655#1:3201,3\n1655#1:3204,6\n1653#1:3139,4\n1653#1:3210,8\n1655#1:3200\n1691#1:3218,2\n1739#1:3221,2\n*E\n"})
    final class a implements n, y1 {
        @m
        private Object a;
        @m
        private p b;
        final j c;

        public a() {
            this.a = k.x;
        }

        @Override  // kotlinx.coroutines.channels.n
        @kotlin.k(level = kotlin.m.c, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @i(name = "next")
        public Object a(d d0) {
            return kotlinx.coroutines.channels.n.a.a(this, d0);
        }

        @Override  // kotlinx.coroutines.channels.n
        @m
        public Object b(@y4.l d d0) {
            q q2;
            j j0 = j.this;
            q q0 = (q)j.i.get(j0);
            while(true) {
                if(j0.C()) {
                    return b.a(this.i());
                }
                long v = j.e.getAndIncrement(j0);
                long v1 = v / ((long)k.b);
                int v2 = (int)(v % ((long)k.b));
                if(q0.c == v1) {
                    q2 = q0;
                }
                else {
                    q q1 = j0.c0(v1, q0);
                    if(q1 == null) {
                        continue;
                    }
                    q2 = q1;
                }
                Object object0 = j0.d2(q2, v2, v, null);
                if(object0 == k.o) {
                    break;
                }
                if(object0 == k.q) {
                    if(v < j0.F0()) {
                        q2.c();
                    }
                    q0 = q2;
                    continue;
                }
                if(object0 == k.p) {
                    return this.h(q2, v2, v, d0);
                }
                q2.c();
                this.a = object0;
                return b.a(true);
            }
            throw new IllegalStateException("unreachable");
        }

        public static final Object c(a j$a0, q q0, int v, long v1, d d0) {
            return j$a0.h(q0, v, v1, d0);
        }

        @Override  // kotlinx.coroutines.y1
        public void d(@y4.l S s0, int v) {
            p p0 = this.b;
            if(p0 != null) {
                p0.d(s0, v);
            }
        }

        private final Object h(q q0, int v, long v1, d d0) {
            Boolean boolean0;
            j j0 = j.this;
            p p0 = r.b(kotlin.coroutines.intrinsics.b.e(d0));
            try {
                Function1 function10 = null;
                this.b = p0;
                Object object0 = j0.d2(q0, v, v1, this);
                if(object0 == k.o) {
                    j0.l1(this, q0, v);
                }
                else {
                    if(object0 == k.q) {
                        if(v1 < j0.F0()) {
                            q0.c();
                        }
                        q q1 = (q)j.i.get(j0);
                        while(!j0.C()) {
                            long v2 = j.e.getAndIncrement(j0);
                            long v3 = v2 / ((long)k.b);
                            int v4 = (int)(v2 % ((long)k.b));
                            if(q1.c != v3) {
                                q q2 = j0.c0(v3, q1);
                                if(q2 == null) {
                                    continue;
                                }
                                q1 = q2;
                            }
                            Object object1 = j0.d2(q1, v4, v2, this);
                            if(object1 == k.o) {
                                j0.l1(this, q1, v4);
                                goto label_52;
                            }
                            if(object1 == k.q) {
                                if(v2 >= j0.F0()) {
                                    continue;
                                }
                                q1.c();
                                continue;
                            }
                            if(object1 == k.p) {
                                throw new IllegalStateException("unexpected");
                            }
                            q1.c();
                            this.a = object1;
                            this.b = null;
                            boolean0 = b.a(true);
                            Function1 function11 = j0.b;
                            if(function11 != null) {
                                function10 = L.a(function11, object1, p0.getContext());
                            }
                            goto label_45;
                        }
                        this.j();
                        goto label_52;
                    }
                    else {
                        q0.c();
                        this.a = object0;
                        this.b = null;
                        boolean0 = b.a(true);
                        Function1 function12 = j0.b;
                        if(function12 != null) {
                            function10 = L.a(function12, object0, p0.getContext());
                        }
                    }
                label_45:
                    p0.B(boolean0, function10);
                }
            }
            catch(Throwable throwable0) {
                p0.V();
                throw throwable0;
            }
        label_52:
            Object object2 = p0.x();
            if(object2 == kotlin.coroutines.intrinsics.b.l()) {
                h.c(d0);
            }
            return object2;
        }

        private final boolean i() {
            this.a = k.z();
            Throwable throwable0 = j.this.k0();
            if(throwable0 != null) {
                throw throwable0;
            }
            return false;
        }

        private final void j() {
            p p0 = this.b;
            kotlin.jvm.internal.L.m(p0);
            this.b = null;
            this.a = k.z();
            Throwable throwable0 = j.this.k0();
            if(throwable0 == null) {
                p0.resumeWith(Boolean.FALSE);
                return;
            }
            p0.resumeWith(e0.b(f0.a(throwable0)));
        }

        public final boolean k(Object object0) {
            p p0 = this.b;
            kotlin.jvm.internal.L.m(p0);
            Function1 function10 = null;
            this.b = null;
            this.a = object0;
            Function1 function11 = j.this.b;
            if(function11 != null) {
                function10 = L.a(function11, object0, p0.getContext());
            }
            return k.F(p0, Boolean.TRUE, function10);
        }

        public final void l() {
            p p0 = this.b;
            kotlin.jvm.internal.L.m(p0);
            this.b = null;
            this.a = k.z();
            Throwable throwable0 = j.this.k0();
            if(throwable0 == null) {
                p0.resumeWith(Boolean.FALSE);
                return;
            }
            p0.resumeWith(e0.b(f0.a(throwable0)));
        }

        @Override  // kotlinx.coroutines.channels.n
        public Object next() {
            Object object0 = this.a;
            if(object0 == k.x) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.a = k.x;
            if(object0 == k.z()) {
                throw U.o(j.this.u0());
            }
            return object0;
        }
    }

    static final class kotlinx.coroutines.channels.j.b implements y1 {
        @y4.l
        private final o a;
        private final p b;

        public kotlinx.coroutines.channels.j.b(@y4.l o o0) {
            this.a = o0;
            kotlin.jvm.internal.L.n(o0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.b = (p)o0;
        }

        @y4.l
        public final o a() {
            return this.a;
        }

        @Override  // kotlinx.coroutines.y1
        public void d(@y4.l S s0, int v) {
            this.b.d(s0, v);
        }
    }

    private volatile Object _closeCause$volatile;
    private final int a;
    @m
    @f
    public final Function1 b;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    @m
    private final A3.p c;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;
    private static final AtomicLongFieldUpdater d;
    private static final AtomicLongFieldUpdater e;
    private static final AtomicLongFieldUpdater f;
    private static final AtomicLongFieldUpdater g;
    private static final AtomicReferenceFieldUpdater h;
    private static final AtomicReferenceFieldUpdater i;
    private static final AtomicReferenceFieldUpdater j;
    private static final AtomicReferenceFieldUpdater k;
    private static final AtomicReferenceFieldUpdater l;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;

    static {
        j.d = AtomicLongFieldUpdater.newUpdater(j.class, "sendersAndCloseStatus$volatile");
        j.e = AtomicLongFieldUpdater.newUpdater(j.class, "receivers$volatile");
        j.f = AtomicLongFieldUpdater.newUpdater(j.class, "bufferEnd$volatile");
        j.g = AtomicLongFieldUpdater.newUpdater(j.class, "completedExpandBuffersAndPauseFlag$volatile");
        j.h = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "sendSegment$volatile");
        j.i = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "receiveSegment$volatile");
        j.j = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "bufferEndSegment$volatile");
        j.k = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_closeCause$volatile");
        j.l = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "closeHandler$volatile");
    }

    public j(int v, @m Function1 function10) {
        static final class kotlinx.coroutines.channels.j.k extends N implements A3.p {
            final j e;

            kotlinx.coroutines.channels.j.k(j j0) {
                this.e = j0;
                super(3);
            }

            @y4.l
            public final Function1 a(@y4.l kotlinx.coroutines.selects.m m0, @m Object object0, @m Object object1) {
                static final class kotlinx.coroutines.channels.j.k.a extends N implements Function1 {
                    final Object e;
                    final j f;
                    final kotlinx.coroutines.selects.m g;

                    kotlinx.coroutines.channels.j.k.a(Object object0, j j0, kotlinx.coroutines.selects.m m0) {
                        this.e = object0;
                        this.f = j0;
                        this.g = m0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((Throwable)object0));
                        return S0.a;
                    }

                    public final void invoke(@y4.l Throwable throwable0) {
                        V v0 = k.z();
                        if(this.e != v0) {
                            g g0 = this.g.getContext();
                            L.b(this.f.b, this.e, g0);
                        }
                    }
                }

                return new kotlinx.coroutines.channels.j.k.a(object1, this.e, m0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((kotlinx.coroutines.selects.m)object0), object1, object2);
            }
        }

        this.a = v;
        this.b = function10;
        if(v < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + v + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = k.E(v);
        this.completedExpandBuffersAndPauseFlag$volatile = this.h0();
        q q0 = new q(0L, null, this, 3);
        this.sendSegment$volatile = q0;
        this.receiveSegment$volatile = q0;
        if(this.U0()) {
            q0 = k.a;
            kotlin.jvm.internal.L.n(q0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = q0;
        this.c = function10 == null ? null : new kotlinx.coroutines.channels.j.k(this);
        this._closeCause$volatile = k.A;
    }

    public j(int v, Function1 function10, int v1, w w0) {
        if((v1 & 2) != 0) {
            function10 = null;
        }
        this(v, function10);
    }

    @Override  // kotlinx.coroutines.channels.G
    public boolean A() {
        return this.R0(j.d.get(this));
    }

    @y4.l
    protected final Throwable A0() {
        Throwable throwable0 = this.k0();
        return throwable0 == null ? new kotlinx.coroutines.channels.w("Channel was closed") : throwable0;
    }

    private final void A1(q q0) {
        y1 y10;
        Object object1;
        Function1 function10 = this.b;
        Throwable throwable0 = null;
        Object object0 = t.c(null, 1, null);
    alab1:
        do {
            int v = k.b - 1;
            while(-1 < v) {
                long v1 = q0.c * ((long)k.b) + ((long)v);
            alab2:
                do {
                    do {
                        do {
                            do {
                                object1 = q0.J(v);
                                if(object1 == k.k) {
                                    break alab1;
                                }
                                if(object1 != k.f) {
                                    goto label_16;
                                }
                                if(v1 < this.z0()) {
                                    break alab1;
                                }
                            }
                            while(!q0.D(v, object1, k.z()));
                            if(function10 != null) {
                                throwable0 = L.c(function10, q0.I(v), ((i0)throwable0));
                            }
                            q0.E(v);
                            q0.A();
                            break;
                        label_16:
                            if(object1 == k.g || object1 == null) {
                                continue alab2;
                            }
                            if(object1 instanceof y1 || object1 instanceof J) {
                                goto label_21;
                            }
                            if(object1 == k.i || object1 == k.h) {
                                break alab1;
                            }
                        }
                        while(object1 == k.i);
                        goto label_32;
                    label_21:
                        if(v1 < this.z0()) {
                            break alab1;
                        }
                        y10 = object1 instanceof J ? ((J)object1).a : ((y1)object1);
                    }
                    while(!q0.D(v, object1, k.z()));
                    if(function10 != null) {
                        throwable0 = L.c(function10, q0.I(v), ((i0)throwable0));
                    }
                    object0 = t.h(object0, y10);
                    q0.E(v);
                    q0.A();
                    goto label_32;
                }
                while(!q0.D(v, object1, k.z()));
                q0.A();
            label_32:
                --v;
            }
            q0 = (q)q0.h();
        }
        while(q0 != null);
        if(object0 != null) {
            if(object0 instanceof ArrayList) {
                kotlin.jvm.internal.L.n(object0, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                for(int v2 = ((ArrayList)object0).size() - 1; -1 < v2; --v2) {
                    this.C1(((y1)((ArrayList)object0).get(v2)));
                }
            }
            else {
                this.C1(((y1)object0));
            }
        }
        if(throwable0 != null) {
            throw throwable0;
        }
    }

    private final Object B0() {
        return this.sendSegment$volatile;
    }

    private final void B1(y1 y10) {
        this.D1(y10, true);
    }

    @Override  // kotlinx.coroutines.channels.F
    public boolean C() {
        return this.P0(j.d.get(this));
    }

    private final void C1(y1 y10) {
        this.D1(y10, false);
    }

    @Override  // kotlinx.coroutines.channels.F
    @y4.l
    public kotlinx.coroutines.selects.g D() {
        final class c extends H implements A3.p {
            public static final c a;

            static {
                c.a = new c();
            }

            c() {
                super(3, j.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
            }

            public final void a(@y4.l j j0, @y4.l kotlinx.coroutines.selects.m m0, @m Object object0) {
                j0.y1(m0, object0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((j)object0), ((kotlinx.coroutines.selects.m)object1), object2);
                return S0.a;
            }
        }


        final class kotlinx.coroutines.channels.j.d extends H implements A3.p {
            public static final kotlinx.coroutines.channels.j.d a;

            static {
                kotlinx.coroutines.channels.j.d.a = new kotlinx.coroutines.channels.j.d();
            }

            kotlinx.coroutines.channels.j.d() {
                super(3, j.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            }

            @m
            public final Object a(@y4.l j j0, @m Object object0, @m Object object1) {
                return j0.n1(object0, object1);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((j)object0), object1, object2);
            }
        }

        kotlin.jvm.internal.L.n(c.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        A3.p p0 = (A3.p)v0.q(c.a, 3);
        kotlin.jvm.internal.L.n(kotlinx.coroutines.channels.j.d.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'param\')] kotlin.Any?, @[ParameterName(name = \'clauseResult\')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.h(this, p0, ((A3.p)v0.q(kotlinx.coroutines.channels.j.d.a, 3)), this.c);
    }

    private final long D0() {
        return this.sendersAndCloseStatus$volatile;
    }

    private final void D1(y1 y10, boolean z) {
        if(y10 instanceof kotlinx.coroutines.channels.j.b) {
            ((kotlinx.coroutines.channels.j.b)y10).a().resumeWith(Boolean.FALSE);
            return;
        }
        if(y10 instanceof o) {
            ((d)y10).resumeWith(e0.b(f0.a((z ? this.u0() : this.A0()))));
            return;
        }
        if(y10 instanceof E) {
            Throwable throwable0 = this.k0();
            Object object0 = e0.b(kotlinx.coroutines.channels.p.b(kotlinx.coroutines.channels.p.b.a(throwable0)));
            ((E)y10).a.resumeWith(object0);
            return;
        }
        if(y10 instanceof a) {
            ((a)y10).l();
            return;
        }
        if(!(y10 instanceof kotlinx.coroutines.selects.m)) {
            throw new IllegalStateException(("Unexpected waiter: " + y10).toString());
        }
        ((kotlinx.coroutines.selects.m)y10).j(this, k.z());
    }

    static Object E1(j j0, Object object0, d d0) {
        int v3;
        long v1;
        q q0 = (q)j.h.get(j0);
    alab1:
        while(true) {
            long v = j.d.getAndIncrement(j0);
            v1 = 0xFFFFFFFFFFFFFFFL & v;
            boolean z = j0.R0(v);
            long v2 = v1 / ((long)k.b);
            v3 = (int)(v1 % ((long)k.b));
            if(q0.c != v2) {
                q q1 = j0.d0(v2, q0);
                if(q1 == null) {
                    if(!z) {
                        continue;
                    }
                    Object object1 = j0.h1(object0, d0);
                    return object1 != kotlin.coroutines.intrinsics.b.l() ? S0.a : object1;
                }
                else {
                    q0 = q1;
                }
            }
            switch(j0.f2(q0, v3, object0, v1, null, z)) {
                case 0: {
                    q0.c();
                    return S0.a;
                }
                case 1: {
                    return S0.a;
                }
                case 2: {
                    goto label_27;
                }
                case 3: {
                    goto label_24;
                }
                case 4: {
                    break alab1;
                }
                case 5: {
                    q0.c();
                }
            }
        }
        if(v1 < j0.z0()) {
            q0.c();
        }
        Object object2 = j0.h1(object0, d0);
        if(object2 == kotlin.coroutines.intrinsics.b.l()) {
            return object2;
        label_24:
            Object object3 = j0.K1(q0, v3, object0, v1, d0);
            if(object3 == kotlin.coroutines.intrinsics.b.l()) {
                return object3;
            label_27:
                if(z) {
                    q0.A();
                    Object object4 = j0.h1(object0, d0);
                    if(object4 == kotlin.coroutines.intrinsics.b.l()) {
                        return object4;
                    }
                }
            }
        }
        return S0.a;
    }

    @Override  // kotlinx.coroutines.channels.F
    @m
    public Object F(@y4.l d d0) {
        return j.r1(this, d0);
    }

    public final long F0() {
        return j.d.get(this) & 0xFFFFFFFFFFFFFFFL;
    }

    @m
    public Object F1(Object object0, @y4.l d d0) {
        return j.G1(this, object0, d0);
    }

    @Override  // kotlinx.coroutines.channels.G
    public boolean G(@m Throwable throwable0) {
        return this.V(throwable0, false);
    }

    private final Object G0() {
        return this._closeCause$volatile;
    }

    static Object G1(j j0, Object object0, d d0) {
        q q2;
        int v3;
        p p0 = new p(kotlin.coroutines.intrinsics.b.e(d0), 1);
        p0.c0();
        if(j0.b != null) {
            throw new IllegalStateException("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`");
        }
        kotlinx.coroutines.channels.j.b j$b0 = new kotlinx.coroutines.channels.j.b(p0);
        q q0 = (q)j.h.get(j0);
    alab1:
        while(true) {
            long v = j.d.getAndIncrement(j0);
            long v1 = v & 0xFFFFFFFFFFFFFFFL;
            boolean z = j0.R0(v);
            long v2 = v1 / ((long)k.b);
            v3 = (int)(v1 % ((long)k.b));
            if(q0.c == v2) {
            label_17:
                q2 = q0;
            }
            else {
                q q1 = j0.d0(v2, q0);
                if(q1 == null) {
                    if(!z) {
                        continue;
                    }
                    p0.resumeWith(b.a(false));
                    goto label_36;
                }
                else {
                    q2 = q1;
                    goto label_18;
                }
                goto label_17;
            }
        label_18:
            switch(j0.f2(q2, v3, object0, v1, j$b0, z)) {
                case 0: {
                    goto label_34;
                }
                case 1: {
                    goto label_35;
                }
                case 2: {
                    goto label_28;
                }
                case 3: {
                    throw new IllegalStateException("unexpected");
                }
                case 4: {
                    break alab1;
                }
                case 5: {
                    q2.c();
                    q0 = q2;
                    break;
                }
                default: {
                    q0 = q2;
                    break;
                }
            }
        }
        if(v1 < j0.z0()) {
            q2.c();
        }
        p0.resumeWith(b.a(false));
        goto label_36;
    label_28:
        if(z) {
            q2.A();
            p0.resumeWith(b.a(false));
        }
        else {
            j0.m1(j$b0, q2, v3);
            goto label_36;
        label_34:
            q2.c();
        label_35:
            p0.resumeWith(b.a(true));
        }
    label_36:
        Object object1 = p0.x();
        if(object1 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object1;
    }

    private final Object H1(Object object0, Object object1, A3.a a0, A3.o o0, A3.a a1, A3.q q0) {
        q q3;
        q q1 = (q)j.h.get(this);
        while(true) {
            long v = j.d.getAndIncrement(this);
            long v1 = v & 0xFFFFFFFFFFFFFFFL;
            boolean z = this.R0(v);
            long v2 = v1 / ((long)k.b);
            int v3 = (int)(v1 % ((long)k.b));
            if(q1.c == v2) {
            label_13:
                q3 = q1;
            }
            else {
                q q2 = this.d0(v2, q1);
                if(q2 == null) {
                    if(!z) {
                        continue;
                    }
                    return a1.invoke();
                }
                else {
                    q3 = q2;
                    goto label_14;
                }
                goto label_13;
            }
        label_14:
            switch(this.f2(q3, v3, object0, v1, object1, z)) {
                case 0: {
                    q3.c();
                    return a0.invoke();
                }
                case 1: {
                    return a0.invoke();
                }
                case 2: {
                    if(z) {
                        q3.A();
                        return a1.invoke();
                    }
                    y1 y10 = object1 instanceof y1 ? ((y1)object1) : null;
                    if(y10 != null) {
                        this.m1(y10, q3, v3);
                    }
                    return o0.invoke(q3, v3);
                }
                case 3: {
                    return q0.T0(q3, v3, object0, v1);
                }
                case 4: {
                    if(v1 < this.z0()) {
                        q3.c();
                    }
                    return a1.invoke();
                }
                case 5: {
                    q3.c();
                }
            }
            q1 = q3;
        }
    }

    @Override  // kotlinx.coroutines.channels.G
    @m
    public Object I(Object object0, @y4.l d d0) {
        return j.E1(this, object0, d0);
    }

    public final boolean I0() {
        while(true) {
            q q0 = (q)j.i.get(this);
            long v = this.z0();
            if(this.F0() <= v) {
                return false;
            }
            int v1 = k.b;
            long v2 = v / ((long)v1);
            if(q0.c != v2) {
                q q1 = this.c0(v2, q0);
                if(q1 == null) {
                    if(((q)j.i.get(this)).c >= v2) {
                        continue;
                    }
                    return false;
                }
                else {
                    q0 = q1;
                }
            }
            q0.c();
            if(this.M0(q0, ((int)(v % ((long)v1))), v)) {
                return true;
            }
            j.e.compareAndSet(this, v, v + 1L);
        }
    }

    static Object I1(j j0, Object object0, Object object1, A3.a a0, A3.o o0, A3.a a1, A3.q q0, int v, Object object2) {
        @s0({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n*L\n1#1,3086:1\n*E\n"})
        public static final class kotlinx.coroutines.channels.j.o extends N implements A3.q {
            public static final kotlinx.coroutines.channels.j.o e;

            static {
                kotlinx.coroutines.channels.j.o.e = new kotlinx.coroutines.channels.j.o();
            }

            public kotlinx.coroutines.channels.j.o() {
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((q)object0), ((Number)object1).intValue(), object2, ((Number)object3).longValue());
            }

            @y4.l
            public final Void a(@y4.l q q0, int v, Object object0, long v1) {
                throw new IllegalStateException("unexpected");
            }
        }

        q q4;
        if(object2 == null) {
            A3.q q1 = (v & 0x20) == 0 ? q0 : kotlinx.coroutines.channels.j.o.e;
            q q2 = (q)j.h.get(j0);
            while(true) {
                long v1 = j.d.getAndIncrement(j0);
                long v2 = v1 & 0xFFFFFFFFFFFFFFFL;
                boolean z = j0.R0(v1);
                long v3 = v2 / ((long)k.b);
                int v4 = (int)(v2 % ((long)k.b));
                if(q2.c == v3) {
                label_18:
                    q4 = q2;
                }
                else {
                    q q3 = j0.d0(v3, q2);
                    if(q3 == null) {
                        if(!z) {
                            continue;
                        }
                        return a1.invoke();
                    }
                    else {
                        q4 = q3;
                        goto label_19;
                    }
                    goto label_18;
                }
            label_19:
                switch(j0.f2(q4, v4, object0, v2, object1, z)) {
                    case 0: {
                        q4.c();
                        return a0.invoke();
                    }
                    case 1: {
                        return a0.invoke();
                    }
                    case 2: {
                        if(z) {
                            q4.A();
                            return a1.invoke();
                        }
                        y1 y10 = object1 instanceof y1 ? ((y1)object1) : null;
                        if(y10 != null) {
                            j0.m1(y10, q4, v4);
                        }
                        return o0.invoke(q4, v4);
                    }
                    case 3: {
                        return q1.T0(q4, v4, object0, v2);
                    }
                    case 4: {
                        if(v2 < j0.z0()) {
                            q4.c();
                        }
                        return a1.invoke();
                    }
                    case 5: {
                        q4.c();
                    }
                }
                q2 = q4;
            }
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
    }

    private final void J0(long v) {
        if((j.g.addAndGet(this, v) & 0x4000000000000000L) != 0L) {
            while((j.g.get(this) & 0x4000000000000000L) != 0L) {
            }
        }
    }

    private final void J1(q q0, int v, Object object0, long v1, y1 y10, A3.a a0, A3.a a1) {
        q q3;
        y1 y11 = y10;
    alab1:
        switch(this.f2(q0, v, object0, v1, y10, false)) {
            case 0: {
                q0.c();
                a0.invoke();
                break;
            }
            case 1: {
                a0.invoke();
                return;
            }
            case 2: {
                this.m1(y11, q0, v);
                return;
            }
            case 4: {
                if(v1 < this.z0()) {
                    q0.c();
                }
                a1.invoke();
                return;
            }
            case 5: {
                q0.c();
                q q1 = (q)j.h.get(this);
                while(true) {
                    long v2 = j.d.getAndIncrement(this);
                    long v3 = v2 & 0xFFFFFFFFFFFFFFFL;
                    boolean z = this.R0(v2);
                    long v4 = v3 / ((long)k.b);
                    int v5 = (int)(v3 % ((long)k.b));
                    if(q1.c == v4) {
                    label_26:
                        q3 = q1;
                    }
                    else {
                        q q2 = this.d0(v4, q1);
                        if(q2 == null) {
                            if(!z) {
                                continue;
                            }
                            a1.invoke();
                            return;
                        }
                        else {
                            q3 = q2;
                            goto label_27;
                        }
                        goto label_26;
                    }
                label_27:
                    switch(this.f2(q3, v5, object0, v3, y10, z)) {
                        case 0: {
                            q3.c();
                            a0.invoke();
                            return;
                        }
                        case 1: {
                            a0.invoke();
                            return;
                        }
                        case 2: {
                            if(z) {
                                q3.A();
                                a1.invoke();
                                return;
                            }
                            if(!(y11 instanceof y1)) {
                                y11 = null;
                            }
                            if(y11 == null) {
                                break alab1;
                            }
                            this.m1(y11, q3, v5);
                            return;
                        }
                        case 3: {
                            throw new IllegalStateException("unexpected");
                        }
                        case 4: {
                            if(v3 < this.z0()) {
                                q3.c();
                            }
                            a1.invoke();
                            return;
                        }
                        case 5: {
                            q3.c();
                        }
                    }
                    q1 = q3;
                }
            }
            default: {
                throw new IllegalStateException("unexpected");
            }
        }
    }

    static void K0(j j0, long v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if((v1 & 1) != 0) {
            v = 1L;
        }
        j0.J0(v);
    }

    private final Object K1(q q0, int v, Object object0, long v1, d d0) {
        S0 s00;
        q q3;
        p p0 = r.b(kotlin.coroutines.intrinsics.b.e(d0));
        try {
        alab1:
            switch(this.f2(q0, v, object0, v1, p0, false)) {
                case 0: {
                    q0.c();
                    s00 = S0.a;
                    break;
                }
                case 1: {
                    s00 = S0.a;
                    break;
                }
                case 2: {
                    this.m1(p0, q0, v);
                    goto label_55;
                }
                case 4: {
                    if(v1 < this.z0()) {
                        q0.c();
                    }
                    this.i1(object0, p0);
                    goto label_55;
                }
                case 5: {
                    q0.c();
                    q q1 = (q)j.h.get(this);
                    while(true) {
                        long v2 = j.d.getAndIncrement(this);
                        long v3 = v2 & 0xFFFFFFFFFFFFFFFL;
                        boolean z = this.R0(v2);
                        long v4 = v3 / ((long)k.b);
                        int v5 = (int)(v3 % ((long)k.b));
                        if(q1.c == v4) {
                        label_17:
                            q3 = q1;
                        }
                        else {
                            q q2 = this.d0(v4, q1);
                            if(q2 == null) {
                                if(!z) {
                                    continue;
                                }
                                this.i1(object0, p0);
                                goto label_55;
                            }
                            else {
                                q3 = q2;
                                goto label_18;
                            }
                            goto label_17;
                        }
                    label_18:
                        switch(this.f2(q3, v5, object0, v3, p0, z)) {
                            case 0: {
                                q3.c();
                                s00 = S0.a;
                                break alab1;
                            }
                            case 1: {
                                s00 = S0.a;
                                break alab1;
                            }
                            case 2: {
                                if(z) {
                                    q3.A();
                                    this.i1(object0, p0);
                                    goto label_55;
                                }
                                p p1 = p0 instanceof y1 ? p0 : null;
                                if(p1 == null) {
                                    goto label_55;
                                }
                                this.m1(p1, q3, v5);
                                goto label_55;
                            }
                            case 3: {
                                throw new IllegalStateException("unexpected");
                            }
                            case 4: {
                                if(v3 < this.z0()) {
                                    q3.c();
                                }
                                this.i1(object0, p0);
                                goto label_55;
                            }
                            case 5: {
                                q3.c();
                            }
                        }
                        q1 = q3;
                    }
                }
                default: {
                    throw new IllegalStateException("unexpected");
                }
            }
            p0.resumeWith(s00);
        }
        catch(Throwable throwable0) {
            p0.V();
            throw throwable0;
        }
    label_55:
        Object object1 = p0.x();
        if(object1 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object1 == kotlin.coroutines.intrinsics.b.l() ? object1 : S0.a;
    }

    public static final Object L(j j0, q q0, int v, long v1, d d0) {
        return j0.x1(q0, v, v1, d0);
    }

    private final void L0() {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = j.l;
        do {
            object0 = atomicReferenceFieldUpdater0.get(this);
        }
        while(!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater0, this, object0, (object0 == null ? k.y : k.z)));
        if(object0 == null) {
            return;
        }
        Function1 function10 = (Function1)v0.q(object0, 1);
        ((Function1)object0).invoke(this.k0());
    }

    private final void L1(long v) {
        this.bufferEnd$volatile = v;
    }

    private final boolean M0(q q0, int v, long v1) {
        do {
            Object object0 = q0.J(v);
            if(object0 != null && object0 != k.g) {
                if(object0 == k.f) {
                    return true;
                }
                if(object0 == k.l) {
                    return false;
                }
                if(object0 == k.z()) {
                    return false;
                }
                if(object0 == k.k) {
                    return false;
                }
                if(object0 == k.j) {
                    return false;
                }
                if(object0 == k.i) {
                    return true;
                }
                return object0 == k.h ? false : v1 == this.z0();
            }
        }
        while(!q0.D(v, object0, k.j));
        this.a0();
        return false;
    }

    private final void M1(Object object0) {
        this.bufferEndSegment$volatile = object0;
    }

    public static final Object N(j j0, q q0, int v, Object object0, long v1, d d0) {
        return j0.K1(q0, v, object0, v1, d0);
    }

    private final boolean N0(long v, boolean z) {
        switch(((int)(v >> 60))) {
            case 0: 
            case 1: {
                return false;
            }
            case 2: {
                this.X(v & 0xFFFFFFFFFFFFFFFL);
                return !z || !this.I0();
            }
            case 3: {
                this.W(v & 0xFFFFFFFFFFFFFFFL);
                return true;
            }
            default: {
                throw new IllegalStateException(("unexpected close status: " + ((int)(v >> 60))).toString());
            }
        }
    }

    private final void N1(Object object0) {
        this.closeHandler$volatile = object0;
    }

    @x0
    public static void O0() {
    }

    private final void O1(long v) {
        this.completedExpandBuffersAndPauseFlag$volatile = v;
    }

    private final boolean P0(long v) {
        return this.N0(v, true);
    }

    private final void P1(Object object0) {
        this.receiveSegment$volatile = object0;
    }

    private final boolean Q(long v) {
        return v < this.h0() || v < this.z0() + ((long)this.a);
    }

    @x0
    public static void Q0() {
    }

    private final void Q1(long v) {
        this.receivers$volatile = v;
    }

    public boolean R(@m Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new CancellationException("Channel was cancelled");
        }
        return this.V(throwable0, true);
    }

    private final boolean R0(long v) {
        return this.N0(v, false);
    }

    private final void R1(Object object0) {
        this.sendSegment$volatile = object0;
    }

    private final void S(q q0, long v) {
        Object object1;
        Object object0 = t.c(null, 1, null);
    alab1:
        while(q0 != null) {
            int v1 = k.b - 1;
            while(-1 < v1) {
                if(q0.c * ((long)k.b) + ((long)v1) < v) {
                    break alab1;
                }
            alab2:
                while(true) {
                    do {
                        do {
                            object1 = q0.J(v1);
                            if(object1 == null || object1 == k.g) {
                                goto label_17;
                            }
                            if(!(object1 instanceof J)) {
                                goto label_12;
                            }
                        }
                        while(!q0.D(v1, object1, k.z()));
                        object0 = t.h(object0, ((J)object1).a);
                        q0.K(v1, true);
                        break alab2;
                    label_12:
                        if(!(object1 instanceof y1)) {
                            break alab2;
                        }
                    }
                    while(!q0.D(v1, object1, k.z()));
                    object0 = t.h(object0, object1);
                    q0.K(v1, true);
                    break;
                label_17:
                    if(q0.D(v1, object1, k.z())) {
                        q0.A();
                        break;
                    }
                }
                --v1;
            }
            q0 = (q)q0.h();
        }
        if(object0 != null) {
            if(!(object0 instanceof ArrayList)) {
                this.B1(((y1)object0));
                return;
            }
            kotlin.jvm.internal.L.n(object0, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            for(int v2 = ((ArrayList)object0).size() - 1; -1 < v2; --v2) {
                this.B1(((y1)((ArrayList)object0).get(v2)));
            }
        }
    }

    protected boolean S0() {
        return false;
    }

    private final void S1(long v) {
        this.sendersAndCloseStatus$volatile = v;
    }

    public final void T() {
        if(this.U0()) {
            if(j.j.get(this) != k.a) {
                throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        }
        else if(((q)j.i.get(this)).c > ((q)j.j.get(this)).c) {
            throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        Iterable iterable0 = u.O(new q[]{j.i.get(this), j.h.get(this), j.j.get(this)});
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((q)object0) != k.a) {
                arrayList0.add(object0);
            }
        }
        Iterator iterator1 = arrayList0.iterator();
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = iterator1.next();
        if(iterator1.hasNext()) {
            long v = ((q)object1).c;
            while(true) {
                Object object2 = iterator1.next();
                long v1 = ((q)object2).c;
                if(v > v1) {
                    object1 = object2;
                    v = v1;
                }
                if(!iterator1.hasNext()) {
                    break;
                }
            }
        }
        q q0 = (q)object1;
        if(q0.h() != null) {
            throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
        }
        while(q0.f() != null) {
            kotlinx.coroutines.internal.g g0 = q0.f();
            kotlin.jvm.internal.L.m(g0);
            if(((q)g0).h() != null) {
                kotlinx.coroutines.internal.g g1 = q0.f();
                kotlin.jvm.internal.L.m(g1);
                if(((q)g1).h() != q0) {
                    throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                }
            }
            int v2 = k.b;
            int v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object3 = q0.J(v3);
                if(!kotlin.jvm.internal.L.g(object3, k.f) && !(object3 instanceof y1)) {
                    if(((kotlin.jvm.internal.L.g(object3, k.m) ? true : kotlin.jvm.internal.L.g(object3, k.l)) ? true : kotlin.jvm.internal.L.g(object3, k.z()))) {
                        if(q0.I(v3) != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        ++v4;
                        continue;
                    }
                    else {
                        if(!(kotlin.jvm.internal.L.g(object3, k.j) ? true : kotlin.jvm.internal.L.g(object3, k.k))) {
                            throw new IllegalStateException(("Unexpected segment cell state: " + object3 + ".\nChannel state: " + this).toString());
                        }
                        if(q0.I(v3) != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
            }
            if(v4 == k.b && (q0 != j.i.get(this) && q0 != j.h.get(this) && q0 != j.j.get(this))) {
                throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
            }
            kotlinx.coroutines.internal.g g2 = q0.f();
            kotlin.jvm.internal.L.m(g2);
            q0 = (q)g2;
        }
    }

    @x0
    public static void T0() {
    }

    private final void T1(Object object0) {
        this._closeCause$volatile = object0;
    }

    private final q U() {
        q q0 = j.j.get(this);
        q q1 = (q)j.h.get(this);
        if(q1.c > q0.c) {
            q0 = q1;
        }
        q q2 = (q)j.i.get(this);
        if(q2.c > q0.c) {
            q0 = q2;
        }
        return (q)kotlinx.coroutines.internal.f.d(q0);
    }

    private final boolean U0() {
        long v = this.h0();
        return v == 0L || v == 0x7FFFFFFFFFFFFFFFL;
    }

    // 去混淆评级： 低(20)
    private final boolean U1(long v) {
        return this.R0(v) ? false : !this.Q(v & 0xFFFFFFFFFFFFFFFL);
    }

    protected boolean V(@m Throwable throwable0, boolean z) {
        if(z) {
            this.Y0();
        }
        boolean z1 = androidx.concurrent.futures.a.a(j.k, this, k.A, throwable0);
        if(z) {
            this.Z0();
        }
        else {
            this.a1();
        }
        this.Y();
        if(z1) {
            this.L0();
        }
        return z1;
    }

    private final void V0(Object object0, AtomicLongFieldUpdater atomicLongFieldUpdater0, Function1 function10) {
        while(true) {
            function10.invoke(atomicLongFieldUpdater0.get(object0));
        }
    }

    public boolean V1() {
        return this.U1(j.d.get(this));
    }

    private final void W(long v) {
        this.A1(this.X(v));
    }

    private final void W0(Object object0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, Function1 function10) {
        while(true) {
            function10.invoke(atomicReferenceFieldUpdater0.get(object0));
        }
    }

    @y4.l
    public final String W1() {
        String s1;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("S=" + this.F0() + ",R=" + this.z0() + ",B=" + this.h0() + ",B\'=" + j.g.get(this) + ",C=" + ((int)(j.d.get(this) >> 60)) + ',');
        switch(((int)(j.d.get(this) >> 60))) {
            case 1: {
                stringBuilder0.append("CANCELLATION_STARTED,");
                break;
            }
            case 2: {
                stringBuilder0.append("CLOSED,");
                break;
            }
            case 3: {
                stringBuilder0.append("CANCELLED,");
            }
        }
        stringBuilder0.append("SEND_SEGM=" + kotlinx.coroutines.U.b(j.h.get(this)) + ",RCV_SEGM=" + kotlinx.coroutines.U.b(j.i.get(this)));
        if(!this.U0()) {
            stringBuilder0.append(",EB_SEGM=" + kotlinx.coroutines.U.b(j.j.get(this)));
        }
        stringBuilder0.append("  ");
        Iterable iterable0 = u.O(new q[]{j.i.get(this), j.h.get(this), j.j.get(this)});
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((q)object0) != k.a) {
                arrayList0.add(object0);
            }
        }
        Iterator iterator1 = arrayList0.iterator();
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = iterator1.next();
        if(iterator1.hasNext()) {
            long v = ((q)object1).c;
            while(true) {
                Object object2 = iterator1.next();
                long v1 = ((q)object2).c;
                if(v > v1) {
                    object1 = object2;
                    v = v1;
                }
                if(!iterator1.hasNext()) {
                    break;
                }
            }
        }
        q q0 = (q)object1;
        do {
            q q1 = (q)q0.h();
            String s = null;
            stringBuilder0.append(kotlinx.coroutines.U.b(q0) + "=[" + (q0.m() ? "*" : "") + q0.c + ",prev=" + (q1 == null ? null : kotlinx.coroutines.U.b(q1)) + ',');
            int v2 = k.b;
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object3 = q0.J(v3);
                Object object4 = q0.I(v3);
                if(object3 instanceof o) {
                    s1 = "cont";
                }
                else if(object3 instanceof kotlinx.coroutines.selects.m) {
                    s1 = "select";
                }
                else if(object3 instanceof E) {
                    s1 = "receiveCatching";
                }
                else if(object3 instanceof kotlinx.coroutines.channels.j.b) {
                    s1 = "send(broadcast)";
                }
                else {
                    s1 = object3 instanceof J ? "EB(" + object3 + ')' : String.valueOf(object3);
                }
                stringBuilder0.append('[' + v3 + "]=(" + s1 + ',' + object4 + "),");
            }
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("next=");
            q q2 = (q)q0.f();
            if(q2 != null) {
                s = kotlinx.coroutines.U.b(q2);
            }
            stringBuilder1.append(s);
            stringBuilder1.append("]  ");
            stringBuilder0.append(stringBuilder1.toString());
            q0 = (q)q0.f();
        }
        while(q0 != null);
        return stringBuilder0.toString();
    }

    private final q X(long v) {
        q q0 = this.U();
        if(this.S0()) {
            long v1 = this.X0(q0);
            if(v1 != -1L) {
                this.Z(v1);
            }
        }
        this.S(q0, v);
        return q0;
    }

    private final long X0(q q0) {
        do {
            for(int v = k.b - 1; -1 < v; --v) {
                long v1 = q0.c * ((long)k.b) + ((long)v);
                if(v1 < this.z0()) {
                    return -1L;
                }
                while(true) {
                    Object object0 = q0.J(v);
                    if(object0 != null && object0 != k.g) {
                        if(object0 != k.f) {
                            break;
                        }
                        return v1;
                    }
                    if(q0.D(v, object0, k.z())) {
                        q0.A();
                        break;
                    }
                }
            }
            q0 = (q)q0.h();
        }
        while(q0 != null);
        return -1L;
    }

    private final boolean X1(Object object0, Object object1) {
        Function1 function10 = null;
        if(object0 instanceof kotlinx.coroutines.selects.m) {
            return ((kotlinx.coroutines.selects.m)object0).j(this, object1);
        }
        if(object0 instanceof E) {
            kotlin.jvm.internal.L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            p p0 = ((E)object0).a;
            kotlinx.coroutines.channels.p p1 = kotlinx.coroutines.channels.p.b(kotlinx.coroutines.channels.p.b.c(object1));
            Function1 function11 = this.b;
            if(function11 != null) {
                function10 = L.a(function11, object1, ((E)object0).a.getContext());
            }
            return k.F(p0, p1, function10);
        }
        if(object0 instanceof a) {
            kotlin.jvm.internal.L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a)object0).k(object1);
        }
        if(!(object0 instanceof o)) {
            throw new IllegalStateException(("Unexpected receiver type: " + object0).toString());
        }
        kotlin.jvm.internal.L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        Function1 function12 = this.b;
        if(function12 != null) {
            function10 = L.a(function12, object1, ((o)object0).getContext());
        }
        return k.F(((o)object0), object1, function10);
    }

    private final void Y() {
        this.A();
    }

    private final void Y0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = j.d;
        do {
            long v = atomicLongFieldUpdater0.get(this);
        }
        while(((int)(v >> 60)) == 0 && !atomicLongFieldUpdater0.compareAndSet(this, v, k.b(0xFFFFFFFFFFFFFFFL & v, 1)));
    }

    private final boolean Y1(Object object0, q q0, int v) {
        if(object0 instanceof o) {
            kotlin.jvm.internal.L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return k.G(((o)object0), S0.a, null, 2, null);
        }
        if(object0 instanceof kotlinx.coroutines.selects.m) {
            kotlin.jvm.internal.L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            kotlinx.coroutines.selects.r r0 = ((kotlinx.coroutines.selects.l)object0).L(this, S0.a);
            if(r0 == kotlinx.coroutines.selects.r.b) {
                q0.E(v);
            }
            return r0 == kotlinx.coroutines.selects.r.a;
        }
        if(!(object0 instanceof kotlinx.coroutines.channels.j.b)) {
            throw new IllegalStateException(("Unexpected waiter: " + object0).toString());
        }
        return k.G(((kotlinx.coroutines.channels.j.b)object0).a(), Boolean.TRUE, null, 2, null);
    }

    protected final void Z(long v) {
        i0 i00;
        Function1 function10;
        Object object0;
        int v4;
        long v1;
        q q0 = (q)j.i.get(this);
        while(true) {
            while(true) {
                while(true) {
                    while(true) {
                        do {
                        label_1:
                            v1 = j.e.get(this);
                            long v2 = this.h0();
                            if(v < Math.max(((long)this.a) + v1, v2)) {
                                return;
                            }
                        }
                        while(!j.e.compareAndSet(this, v1, v1 + 1L));
                        long v3 = v1 / ((long)k.b);
                        v4 = (int)(v1 % ((long)k.b));
                        if(q0.c == v3) {
                            break;
                        }
                        q q1 = this.c0(v3, q0);
                        if(q1 != null) {
                            q0 = q1;
                            break;
                        }
                    }
                    object0 = this.d2(q0, v4, v1, null);
                    if(object0 != k.q) {
                        break;
                    }
                    if(v1 < this.F0()) {
                        q0.c();
                    }
                }
                q0.c();
                function10 = this.b;
                if(function10 == null) {
                    goto label_1;
                }
                break;
            }
            i00 = L.d(function10, object0, null, 2, null);
            if(i00 == null) {
                goto label_1;
            }
            break;
        }
        throw i00;
    }

    private final void Z0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = j.d;
        do {
            long v = atomicLongFieldUpdater0.get(this);
        }
        while(!atomicLongFieldUpdater0.compareAndSet(this, v, k.b(0xFFFFFFFFFFFFFFFL & v, 3)));
    }

    @y4.l
    protected final Object Z1(Object object0) {
        q q2;
        V v0 = k.f;
        q q0 = (q)j.h.get(this);
        while(true) {
            long v1 = j.d.getAndIncrement(this);
            long v2 = v1 & 0xFFFFFFFFFFFFFFFL;
            boolean z = this.R0(v1);
            int v3 = k.b;
            long v4 = v2 / ((long)v3);
            int v5 = (int)(v2 % ((long)v3));
            if(q0.c == v4) {
            label_16:
                q2 = q0;
            }
            else {
                q q1 = this.d0(v4, q0);
                if(q1 == null) {
                    if(!z) {
                        continue;
                    }
                    Throwable throwable0 = this.A0();
                    return kotlinx.coroutines.channels.p.b.a(throwable0);
                }
                else {
                    q2 = q1;
                    goto label_17;
                }
                goto label_16;
            }
        label_17:
            switch(this.f2(q2, v5, object0, v2, v0, z)) {
                case 0: {
                    q2.c();
                    return kotlinx.coroutines.channels.p.b.c(S0.a);
                }
                case 1: {
                    return kotlinx.coroutines.channels.p.b.c(S0.a);
                }
                case 2: {
                    if(z) {
                        q2.A();
                        Throwable throwable2 = this.A0();
                        return kotlinx.coroutines.channels.p.b.a(throwable2);
                    }
                    y1 y10 = v0 instanceof y1 ? ((y1)v0) : null;
                    if(y10 != null) {
                        this.m1(y10, q2, v5);
                    }
                    this.Z(q2.c * ((long)v3) + ((long)v5));
                    return kotlinx.coroutines.channels.p.b.c(S0.a);
                }
                case 3: {
                    throw new IllegalStateException("unexpected");
                }
                case 4: {
                    if(v2 < this.z0()) {
                        q2.c();
                    }
                    Throwable throwable1 = this.A0();
                    return kotlinx.coroutines.channels.p.b.a(throwable1);
                }
                case 5: {
                    q2.c();
                }
            }
            q0 = q2;
        }
    }

    private final void a0() {
        if(this.U0()) {
            return;
        }
        q q0 = (q)j.j.get(this);
        while(true) {
            long v = j.f.getAndIncrement(this);
            int v1 = k.b;
            long v2 = v / ((long)v1);
            if(this.F0() <= v) {
                if(q0.c < v2 && q0.f() != null) {
                    this.b1(v2, q0);
                }
                j.K0(this, 0L, 1, null);
                return;
            }
            if(q0.c != v2) {
                q q1 = this.b0(v2, q0, v);
                if(q1 == null) {
                    continue;
                }
                q0 = q1;
            }
            if(this.b2(q0, ((int)(v % ((long)v1))), v)) {
                j.K0(this, 0L, 1, null);
                return;
            }
            j.K0(this, 0L, 1, null);
        }
    }

    private final void a1() {
        long v1;
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = j.d;
        do {
            long v = atomicLongFieldUpdater0.get(this);
            switch(((int)(v >> 60))) {
                case 0: {
                    v1 = k.b(v & 0xFFFFFFFFFFFFFFFL, 2);
                    break;
                }
                case 1: {
                    v1 = k.b(v & 0xFFFFFFFFFFFFFFFL, 3);
                    break;
                }
                default: {
                    return;
                }
            }
        }
        while(!atomicLongFieldUpdater0.compareAndSet(this, v, v1));
    }

    private final void a2(Object object0, AtomicLongFieldUpdater atomicLongFieldUpdater0, Function1 function10) {
        do {
            long v = atomicLongFieldUpdater0.get(object0);
        }
        while(!atomicLongFieldUpdater0.compareAndSet(object0, v, ((Number)function10.invoke(v)).longValue()));
    }

    private final q b0(long v, q q0, long v1) {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = j.j;
        A3.o o0 = (A3.o)k.y();
    alab1:
        while(true) {
            object0 = kotlinx.coroutines.internal.f.g(q0, v, o0);
            if(T.h(object0)) {
                break;
            }
            S s0 = T.f(object0);
            while(true) {
                S s1 = (S)atomicReferenceFieldUpdater0.get(this);
                if(s1.c >= s0.c) {
                    break alab1;
                }
                if(!s0.C()) {
                    break;
                }
                if(androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater0, this, s1, s0)) {
                    if(!s1.v()) {
                        break alab1;
                    }
                    s1.q();
                    break alab1;
                }
                if(s0.v()) {
                    s0.q();
                }
            }
        }
        if(T.h(object0)) {
            this.Y();
            this.b1(v, q0);
            j.K0(this, 0L, 1, null);
            return null;
        }
        S s2 = T.f(object0);
        if(((q)s2).c > v) {
            int v2 = k.b;
            if(j.f.compareAndSet(this, v1 + 1L, ((q)s2).c * ((long)v2))) {
                this.J0(((q)s2).c * ((long)v2) - v1);
                return null;
            }
            j.K0(this, 0L, 1, null);
            return null;
        }
        return (q)s2;
    }

    private final void b1(long v, q q0) {
        while(q0.c < v) {
            q q1 = (q)q0.f();
            if(q1 == null) {
                break;
            }
            q0 = q1;
        }
    alab1:
        while(true) {
            if(q0.m()) {
                q q2 = (q)q0.f();
                if(q2 != null) {
                    q0 = q2;
                    continue;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = j.j;
            while(true) {
                S s0 = (S)atomicReferenceFieldUpdater0.get(this);
                if(s0.c >= q0.c) {
                    break alab1;
                }
                if(!q0.C()) {
                    break;
                }
                if(androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater0, this, s0, q0)) {
                    if(!s0.v()) {
                        break alab1;
                    }
                    s0.q();
                    return;
                }
                if(q0.v()) {
                    q0.q();
                }
            }
        }
    }

    private final boolean b2(q q0, int v, long v1) {
        Object object0 = q0.J(v);
        if(object0 instanceof y1 && v1 >= j.e.get(this) && q0.D(v, object0, k.i)) {
            if(this.Y1(object0, q0, v)) {
                q0.N(v, k.f);
                return true;
            }
            q0.N(v, k.l);
            q0.K(v, false);
            return false;
        }
        return this.c2(q0, v, v1);
    }

    @Override  // kotlinx.coroutines.channels.F
    public final boolean c(@m Throwable throwable0) {
        return this.R(throwable0);
    }

    private final q c0(long v, q q0) {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = j.i;
        A3.o o0 = (A3.o)k.y();
    alab1:
        while(true) {
            object0 = kotlinx.coroutines.internal.f.g(q0, v, o0);
            if(T.h(object0)) {
                break;
            }
            S s0 = T.f(object0);
            while(true) {
                S s1 = (S)atomicReferenceFieldUpdater0.get(this);
                if(s1.c >= s0.c) {
                    break alab1;
                }
                if(!s0.C()) {
                    break;
                }
                if(androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater0, this, s1, s0)) {
                    if(!s1.v()) {
                        break alab1;
                    }
                    s1.q();
                    break alab1;
                }
                if(s0.v()) {
                    s0.q();
                }
            }
        }
        if(T.h(object0)) {
            this.Y();
            long v1 = this.F0();
            if(q0.c * ((long)k.b) >= v1) {
                return null;
            }
            q0.c();
            return null;
        }
        q q1 = (q)T.f(object0);
        if(!this.U0() && v <= this.h0() / ((long)k.b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1 = j.j;
            while(true) {
                S s2 = (S)atomicReferenceFieldUpdater1.get(this);
                if(s2.c >= q1.c || !q1.C()) {
                    break;
                }
                if(androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater1, this, s2, q1)) {
                    if(!s2.v()) {
                        break;
                    }
                    s2.q();
                    break;
                }
                if(q1.v()) {
                    q1.q();
                }
            }
        }
        long v2 = q1.c;
        if(v2 > v) {
            this.h2(v2 * ((long)k.b));
            long v3 = this.F0();
            if(q1.c * ((long)k.b) < v3) {
                q1.c();
                return null;
            }
            return null;
        }
        return q1;
    }

    protected void c1() {
    }

    private final boolean c2(q q0, int v, long v1) {
        Object object0;
        do {
            while(true) {
            alab1:
                while(true) {
                    do {
                        object0 = q0.J(v);
                        if(!(object0 instanceof y1)) {
                            break alab1;
                        }
                        if(v1 >= j.e.get(this)) {
                            goto label_5;
                        }
                    }
                    while(!q0.D(v, object0, new J(((y1)object0))));
                    return true;
                label_5:
                    if(q0.D(v, object0, k.i)) {
                        if(this.Y1(object0, q0, v)) {
                            q0.N(v, k.f);
                            return true;
                        }
                        q0.N(v, k.l);
                        q0.K(v, false);
                        return false;
                    }
                }
                if(object0 == k.l) {
                    return false;
                }
                if(object0 != null) {
                    break;
                }
                if(q0.D(v, null, k.g)) {
                    return true;
                }
            }
            if(object0 == k.f) {
                return true;
            }
            if(object0 == k.j || object0 == k.k || object0 == k.m || object0 == k.z()) {
                return true;
            }
        }
        while(object0 == k.h);
        throw new IllegalStateException(("Unexpected cell state: " + object0).toString());
    }

    @Override  // kotlinx.coroutines.channels.F
    public final void cancel() {
        this.R(null);
    }

    @Override  // kotlinx.coroutines.channels.G
    @y4.l
    public kotlinx.coroutines.selects.i d() {
        final class kotlinx.coroutines.channels.j.i extends H implements A3.p {
            public static final kotlinx.coroutines.channels.j.i a;

            static {
                kotlinx.coroutines.channels.j.i.a = new kotlinx.coroutines.channels.j.i();
            }

            kotlinx.coroutines.channels.j.i() {
                super(3, j.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
            }

            public final void a(@y4.l j j0, @y4.l kotlinx.coroutines.selects.m m0, @m Object object0) {
                j0.z1(m0, object0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((j)object0), ((kotlinx.coroutines.selects.m)object1), object2);
                return S0.a;
            }
        }


        final class kotlinx.coroutines.channels.j.j extends H implements A3.p {
            public static final kotlinx.coroutines.channels.j.j a;

            static {
                kotlinx.coroutines.channels.j.j.a = new kotlinx.coroutines.channels.j.j();
            }

            kotlinx.coroutines.channels.j.j() {
                super(3, j.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            }

            @m
            public final Object a(@y4.l j j0, @m Object object0, @m Object object1) {
                return j0.q1(object0, object1);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((j)object0), object1, object2);
            }
        }

        kotlin.jvm.internal.L.n(kotlinx.coroutines.channels.j.i.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Object object0 = v0.q(kotlinx.coroutines.channels.j.i.a, 3);
        kotlin.jvm.internal.L.n(kotlinx.coroutines.channels.j.j.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'param\')] kotlin.Any?, @[ParameterName(name = \'clauseResult\')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.j(this, ((A3.p)object0), ((A3.p)v0.q(kotlinx.coroutines.channels.j.j.a, 3)), null, 8, null);
    }

    private final q d0(long v, q q0) {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = j.h;
        A3.o o0 = (A3.o)k.y();
    alab1:
        while(true) {
            object0 = kotlinx.coroutines.internal.f.g(q0, v, o0);
            if(T.h(object0)) {
                break;
            }
            S s0 = T.f(object0);
            while(true) {
                S s1 = (S)atomicReferenceFieldUpdater0.get(this);
                if(s1.c >= s0.c) {
                    break alab1;
                }
                if(!s0.C()) {
                    break;
                }
                if(androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater0, this, s1, s0)) {
                    if(!s1.v()) {
                        break alab1;
                    }
                    s1.q();
                    break alab1;
                }
                if(s0.v()) {
                    s0.q();
                }
            }
        }
        if(T.h(object0)) {
            this.Y();
            long v1 = this.z0();
            if(q0.c * ((long)k.b) >= v1) {
                return null;
            }
            q0.c();
            return null;
        }
        q q1 = (q)T.f(object0);
        long v2 = q1.c;
        if(v2 > v) {
            this.i2(v2 * ((long)k.b));
            long v3 = this.z0();
            if(q1.c * ((long)k.b) < v3) {
                q1.c();
                return null;
            }
            return null;
        }
        return q1;
    }

    private final void d1(o o0) {
        Throwable throwable0 = this.k0();
        o0.resumeWith(e0.b(kotlinx.coroutines.channels.p.b(kotlinx.coroutines.channels.p.b.a(throwable0))));
    }

    private final Object d2(q q0, int v, long v1, Object object0) {
        Object object1 = q0.J(v);
        if(object1 == null) {
            if(v1 >= (j.d.get(this) & 0xFFFFFFFFFFFFFFFL)) {
                if(object0 == null) {
                    return k.p;
                }
                if(q0.D(v, null, object0)) {
                    this.a0();
                    return k.o;
                }
            }
        }
        else if(object1 == k.f && q0.D(v, object1, k.k)) {
            this.a0();
            return q0.L(v);
        }
        return this.e2(q0, v, v1, object0);
    }

    @Override  // kotlinx.coroutines.channels.F
    public final void e(@m CancellationException cancellationException0) {
        this.R(cancellationException0);
    }

    private final Object e0(Object object0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, Function1 function10) {
        Object object1;
        do {
            object1 = atomicReferenceFieldUpdater0.get(object0);
        }
        while(!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater0, object0, object1, function10.invoke(object1)));
        return object1;
    }

    private final void e1(o o0) {
        o0.resumeWith(e0.b(f0.a(this.u0())));
    }

    private final Object e2(q q0, int v, long v1, Object object0) {
        y1 y10;
        do {
            while(true) {
            alab1:
                while(true) {
                    do {
                        y10 = q0.J(v);
                        if(y10 == null || y10 == k.g) {
                            break alab1;
                        }
                        if(y10 != k.f) {
                            goto label_6;
                        }
                    }
                    while(!q0.D(v, y10, k.k));
                    this.a0();
                    return q0.L(v);
                label_6:
                    if(y10 == k.l) {
                        return k.q;
                    }
                    if(y10 == k.j) {
                        return k.q;
                    }
                    if(y10 == k.z()) {
                        this.a0();
                        return k.q;
                    }
                    if(y10 != k.i && q0.D(v, y10, k.h)) {
                        boolean z = y10 instanceof J;
                        if(z) {
                            y10 = ((J)y10).a;
                        }
                        if(this.Y1(y10, q0, v)) {
                            q0.N(v, k.k);
                            this.a0();
                            return q0.L(v);
                        }
                        q0.N(v, k.l);
                        q0.K(v, false);
                        if(z) {
                            this.a0();
                        }
                        return k.q;
                    }
                }
                if(v1 >= (j.d.get(this) & 0xFFFFFFFFFFFFFFFL)) {
                    break;
                }
                if(q0.D(v, y10, k.j)) {
                    this.a0();
                    return k.q;
                }
            }
            if(object0 == null) {
                return k.p;
            }
        }
        while(!q0.D(v, y10, object0));
        this.a0();
        return k.o;
    }

    private final long f0() {
        return this.bufferEnd$volatile;
    }

    private final void f1(kotlinx.coroutines.selects.m m0) {
        m0.g(k.z());
    }

    private final int f2(q q0, int v, Object object0, long v1, Object object1, boolean z) {
        q0.O(v, object0);
        if(z) {
            return this.g2(q0, v, object0, v1, object1, true);
        }
        Object object2 = q0.J(v);
        if(object2 == null) {
            if(this.Q(v1)) {
                return q0.D(v, null, k.f) ? 1 : this.g2(q0, v, object0, v1, object1, false);
            }
            if(object1 == null) {
                return 3;
            }
            return q0.D(v, null, object1) ? 2 : this.g2(q0, v, object0, v1, object1, false);
        }
        if(object2 instanceof y1) {
            q0.E(v);
            if(this.X1(object2, object0)) {
                q0.N(v, k.k);
                return 0;
            }
            if(q0.F(v, k.m) != k.m) {
                q0.K(v, true);
            }
            return 5;
        }
        return this.g2(q0, v, object0, v1, object1, false);
    }

    private final void g1(Object object0, kotlinx.coroutines.selects.m m0) {
        Function1 function10 = this.b;
        if(function10 != null) {
            L.b(function10, object0, m0.getContext());
        }
        m0.g(k.z());
    }

    private final int g2(q q0, int v, Object object0, long v1, Object object1, boolean z) {
        y1 y10;
        while(true) {
        alab1:
            while(true) {
                do {
                    do {
                        y10 = q0.J(v);
                        if(y10 != null) {
                            break alab1;
                        }
                        if(!this.Q(v1) || z) {
                            goto label_5;
                        }
                    }
                    while(!q0.D(v, null, k.f));
                    return 1;
                label_5:
                    if(!z) {
                        goto label_9;
                    }
                }
                while(!q0.D(v, null, k.l));
                q0.K(v, false);
                return 4;
            label_9:
                if(object1 == null) {
                    return 3;
                }
                if(q0.D(v, null, object1)) {
                    return 2;
                }
            }
            if(y10 != k.g) {
                break;
            }
            if(q0.D(v, y10, k.f)) {
                return 1;
            }
        }
        if(y10 == k.m) {
            q0.E(v);
            return 5;
        }
        if(y10 == k.j) {
            q0.E(v);
            return 5;
        }
        if(y10 == k.z()) {
            q0.E(v);
            this.Y();
            return 4;
        }
        q0.E(v);
        if(y10 instanceof J) {
            y10 = ((J)y10).a;
        }
        if(this.X1(y10, object0)) {
            q0.N(v, k.k);
            return 0;
        }
        if(q0.F(v, k.m) != k.m) {
            q0.K(v, true);
        }
        return 5;
    }

    @Override  // kotlinx.coroutines.channels.G
    public void h(@y4.l Function1 function10) {
        Object object0;
        if(androidx.concurrent.futures.a.a(j.l, this, null, function10)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = j.l;
        while(true) {
            object0 = atomicReferenceFieldUpdater0.get(this);
            if(object0 != k.y) {
                break;
            }
            if(androidx.concurrent.futures.a.a(j.l, this, k.y, k.z)) {
                function10.invoke(this.k0());
                return;
            }
        }
        throw object0 == k.z ? new IllegalStateException("Another handler was already registered and successfully invoked") : new IllegalStateException(("Another handler is already registered: " + object0).toString());
    }

    private final long h0() {
        return j.f.get(this);
    }

    private final Object h1(Object object0, d d0) {
        p p0 = new p(kotlin.coroutines.intrinsics.b.e(d0), 1);
        p0.c0();
        Function1 function10 = this.b;
        if(function10 == null) {
            p0.resumeWith(e0.b(f0.a(this.A0())));
        }
        else {
            i0 i00 = L.d(function10, object0, null, 2, null);
            if(i00 == null) {
                p0.resumeWith(e0.b(f0.a(this.A0())));
            }
            else {
                kotlin.o.a(i00, this.A0());
                p0.resumeWith(e0.b(f0.a(i00)));
            }
        }
        Object object1 = p0.x();
        if(object1 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object1 == kotlin.coroutines.intrinsics.b.l() ? object1 : S0.a;
    }

    private final void h2(long v) {
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = j.e;
        do {
            long v1 = atomicLongFieldUpdater0.get(this);
            if(v1 >= v) {
                return;
            }
        }
        while(!j.e.compareAndSet(this, v1, v));
    }

    private final Object i0() {
        return this.bufferEndSegment$volatile;
    }

    private final void i1(Object object0, o o0) {
        Function1 function10 = this.b;
        if(function10 != null) {
            L.b(function10, object0, o0.getContext());
        }
        o0.resumeWith(e0.b(f0.a(this.A0())));
    }

    private final void i2(long v) {
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = j.d;
        do {
            long v1 = atomicLongFieldUpdater0.get(this);
            if((0xFFFFFFFFFFFFFFFL & v1) >= v) {
                return;
            }
        }
        while(!j.d.compareAndSet(this, v1, k.b(0xFFFFFFFFFFFFFFFL & v1, ((int)(v1 >> 60)))));
    }

    @Override  // kotlinx.coroutines.channels.F
    public boolean isEmpty() {
        if(this.C()) {
            return false;
        }
        return this.I0() ? false : !this.C();
    }

    @Override  // kotlinx.coroutines.channels.F
    @y4.l
    public n iterator() {
        return new a(this);
    }

    protected void j1() {
    }

    public final void j2(long v) {
        if(this.U0()) {
            return;
        }
        while(this.h0() <= v) {
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = j.g;
        do {
            long v1 = atomicLongFieldUpdater0.get(this);
        }
        while(!atomicLongFieldUpdater0.compareAndSet(this, v1, k.v(v1 & 0x3FFFFFFFFFFFFFFFL, true)));
        while(true) {
            long v2 = this.h0();
            long v3 = j.g.get(this);
            long v4 = v3 & 0x3FFFFFFFFFFFFFFFL;
            if(v2 == v4 && v2 == this.h0()) {
                break;
            }
            if((0x4000000000000000L & v3) == 0L) {
                j.g.compareAndSet(this, v3, k.v(v4, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater1 = j.g;
        do {
            long v5 = atomicLongFieldUpdater1.get(this);
        }
        while(!atomicLongFieldUpdater1.compareAndSet(this, v5, k.v(v5 & 0x3FFFFFFFFFFFFFFFL, false)));
    }

    @m
    protected final Throwable k0() {
        return (Throwable)j.k.get(this);
    }

    protected void k1() {
    }

    @Override  // kotlinx.coroutines.channels.G
    @y4.l
    public Object l(Object object0) {
        q q2;
        int v4;
        if(this.U1(j.d.get(this))) {
            return kotlinx.coroutines.channels.p.b.b();
        }
        V v0 = k.l;
        q q0 = (q)j.h.get(this);
    alab1:
        while(true) {
            long v1 = j.d.getAndIncrement(this);
            long v2 = v1 & 0xFFFFFFFFFFFFFFFL;
            boolean z = this.R0(v1);
            long v3 = v2 / ((long)k.b);
            v4 = (int)(v2 % ((long)k.b));
            if(q0.c == v3) {
            label_16:
                q2 = q0;
            }
            else {
                q q1 = this.d0(v3, q0);
                if(q1 == null) {
                    if(!z) {
                        continue;
                    }
                    goto label_31;
                }
                else {
                    q2 = q1;
                    goto label_17;
                }
                goto label_16;
            }
        label_17:
            switch(this.f2(q2, v4, object0, v2, v0, z)) {
                case 0: {
                    q2.c();
                    return kotlinx.coroutines.channels.p.b.c(S0.a);
                }
                case 1: {
                    return kotlinx.coroutines.channels.p.b.c(S0.a);
                }
                case 2: {
                    goto label_29;
                }
                case 3: {
                    throw new IllegalStateException("unexpected");
                }
                case 4: {
                    break alab1;
                }
                case 5: {
                    q2.c();
                    q0 = q2;
                    break;
                }
                default: {
                    q0 = q2;
                    break;
                }
            }
        }
        if(v2 >= this.z0()) {
            goto label_31;
        }
        q2.c();
        goto label_31;
    label_29:
        if(z) {
            q2.A();
        label_31:
            Throwable throwable0 = this.A0();
            return kotlinx.coroutines.channels.p.b.a(throwable0);
        }
        y1 y10 = v0 instanceof y1 ? ((y1)v0) : null;
        if(y10 != null) {
            this.m1(y10, q2, v4);
        }
        q2.A();
        return kotlinx.coroutines.channels.p.b.b();
    }

    private final Object l0() {
        return this.closeHandler$volatile;
    }

    private final void l1(y1 y10, q q0, int v) {
        y10.d(q0, v);
    }

    @Override  // kotlinx.coroutines.channels.F
    @y4.l
    public kotlinx.coroutines.selects.g m() {
        final class e extends H implements A3.p {
            public static final e a;

            static {
                e.a = new e();
            }

            e() {
                super(3, j.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
            }

            public final void a(@y4.l j j0, @y4.l kotlinx.coroutines.selects.m m0, @m Object object0) {
                j0.y1(m0, object0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((j)object0), ((kotlinx.coroutines.selects.m)object1), object2);
                return S0.a;
            }
        }


        final class kotlinx.coroutines.channels.j.f extends H implements A3.p {
            public static final kotlinx.coroutines.channels.j.f a;

            static {
                kotlinx.coroutines.channels.j.f.a = new kotlinx.coroutines.channels.j.f();
            }

            kotlinx.coroutines.channels.j.f() {
                super(3, j.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            }

            @m
            public final Object a(@y4.l j j0, @m Object object0, @m Object object1) {
                return j0.o1(object0, object1);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((j)object0), object1, object2);
            }
        }

        kotlin.jvm.internal.L.n(e.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        A3.p p0 = (A3.p)v0.q(e.a, 3);
        kotlin.jvm.internal.L.n(kotlinx.coroutines.channels.j.f.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'param\')] kotlin.Any?, @[ParameterName(name = \'clauseResult\')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.h(this, p0, ((A3.p)v0.q(kotlinx.coroutines.channels.j.f.a, 3)), this.c);
    }

    private final void m1(y1 y10, q q0, int v) {
        y10.d(q0, v + k.b);
    }

    private final long n0() {
        return this.completedExpandBuffersAndPauseFlag$volatile;
    }

    private final Object n1(Object object0, Object object1) {
        if(object1 == k.z()) {
            throw this.u0();
        }
        return object1;
    }

    private final Object o1(Object object0, Object object1) {
        if(object1 == k.z()) {
            Throwable throwable0 = this.k0();
            return kotlinx.coroutines.channels.p.b(kotlinx.coroutines.channels.p.b.a(throwable0));
        }
        return kotlinx.coroutines.channels.p.b(kotlinx.coroutines.channels.p.b.c(object1));
    }

    @Override  // kotlinx.coroutines.channels.G
    @kotlin.k(level = kotlin.m.b, message = "Deprecated in the favour of \'trySend\' method", replaceWith = @c0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(Object object0) {
        return kotlinx.coroutines.channels.l.a.c(this, object0);
    }

    public static void p0() {
    }

    private final Object p1(Object object0, Object object1) {
        if(object1 == k.z()) {
            if(this.k0() != null) {
                throw this.u0();
            }
            return null;
        }
        return object1;
    }

    @Override  // kotlinx.coroutines.channels.F
    @kotlin.k(level = kotlin.m.b, message = "Deprecated in the favour of \'tryReceive\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'poll\' did, for the precise replacement please refer to the \'poll\' documentation", replaceWith = @c0(expression = "tryReceive().getOrNull()", imports = {}))
    @m
    public Object poll() {
        return kotlinx.coroutines.channels.l.a.d(this);
    }

    public static void q0() {
    }

    private final Object q1(Object object0, Object object1) {
        if(object1 == k.z()) {
            throw this.A0();
        }
        return this;
    }

    @Override  // kotlinx.coroutines.channels.F
    @y4.l
    public kotlinx.coroutines.selects.g r() {
        final class kotlinx.coroutines.channels.j.g extends H implements A3.p {
            public static final kotlinx.coroutines.channels.j.g a;

            static {
                kotlinx.coroutines.channels.j.g.a = new kotlinx.coroutines.channels.j.g();
            }

            kotlinx.coroutines.channels.j.g() {
                super(3, j.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
            }

            public final void a(@y4.l j j0, @y4.l kotlinx.coroutines.selects.m m0, @m Object object0) {
                j0.y1(m0, object0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((j)object0), ((kotlinx.coroutines.selects.m)object1), object2);
                return S0.a;
            }
        }


        final class kotlinx.coroutines.channels.j.h extends H implements A3.p {
            public static final kotlinx.coroutines.channels.j.h a;

            static {
                kotlinx.coroutines.channels.j.h.a = new kotlinx.coroutines.channels.j.h();
            }

            kotlinx.coroutines.channels.j.h() {
                super(3, j.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            }

            @m
            public final Object a(@y4.l j j0, @m Object object0, @m Object object1) {
                return j0.p1(object0, object1);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((j)object0), object1, object2);
            }
        }

        kotlin.jvm.internal.L.n(kotlinx.coroutines.channels.j.g.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        A3.p p0 = (A3.p)v0.q(kotlinx.coroutines.channels.j.g.a, 3);
        kotlin.jvm.internal.L.n(kotlinx.coroutines.channels.j.h.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'param\')] kotlin.Any?, @[ParameterName(name = \'clauseResult\')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.h(this, p0, ((A3.p)v0.q(kotlinx.coroutines.channels.j.h.a, 3)), this.c);
    }

    public static void r0() {
    }

    static Object r1(j j0, d d0) {
        q q0 = (q)j.i.get(j0);
        while(!j0.C()) {
            long v = j.e.getAndIncrement(j0);
            long v1 = v / ((long)k.b);
            int v2 = (int)(v % ((long)k.b));
            if(q0.c != v1) {
                q q1 = j0.c0(v1, q0);
                if(q1 == null) {
                    continue;
                }
                q0 = q1;
            }
            Object object0 = j0.d2(q0, v2, v, null);
            if(object0 == k.o) {
                throw new IllegalStateException("unexpected");
            }
            if(object0 == k.q) {
                if(v >= j0.F0()) {
                    continue;
                }
                q0.c();
                continue;
            }
            if(object0 == k.p) {
                return j0.x1(q0, v2, v, d0);
            }
            q0.c();
            return object0;
        }
        throw U.o(j0.u0());
    }

    public static void s0() {
    }

    static Object s1(j j0, d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {0x2FA}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
        static final class kotlinx.coroutines.channels.j.l extends kotlin.coroutines.jvm.internal.d {
            Object k;
            final j l;
            int m;

            kotlinx.coroutines.channels.j.l(j j0, d d0) {
                this.l = j0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                this.k = object0;
                this.m |= 0x80000000;
                Object object1 = j.s1(this.l, this);
                return object1 == kotlin.coroutines.intrinsics.b.l() ? object1 : kotlinx.coroutines.channels.p.b(object1);
            }
        }

        kotlinx.coroutines.channels.j.l j$l0;
        if(d0 instanceof kotlinx.coroutines.channels.j.l) {
            j$l0 = (kotlinx.coroutines.channels.j.l)d0;
            int v = j$l0.m;
            if((v & 0x80000000) == 0) {
                j$l0 = new kotlinx.coroutines.channels.j.l(j0, d0);
            }
            else {
                j$l0.m = v ^ 0x80000000;
            }
        }
        else {
            j$l0 = new kotlinx.coroutines.channels.j.l(j0, d0);
        }
        Object object0 = j$l0.k;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(j$l0.m) {
            case 0: {
                f0.n(object0);
                q q0 = (q)j.i.get(j0);
                while(true) {
                    if(j0.C()) {
                        Throwable throwable0 = j0.k0();
                        return kotlinx.coroutines.channels.p.b.a(throwable0);
                    }
                    long v1 = j.e.getAndIncrement(j0);
                    long v2 = v1 / ((long)k.b);
                    int v3 = (int)(v1 % ((long)k.b));
                    if(q0.c != v2) {
                        q q1 = j0.c0(v2, q0);
                        if(q1 == null) {
                            continue;
                        }
                        q0 = q1;
                    }
                    Object object2 = j0.d2(q0, v3, v1, null);
                    if(object2 == k.o) {
                        break;
                    }
                    if(object2 == k.q) {
                        if(v1 >= j0.F0()) {
                            continue;
                        }
                        q0.c();
                        continue;
                    }
                    if(object2 == k.p) {
                        j$l0.m = 1;
                        Object object3 = j0.t1(q0, v3, v1, j$l0);
                        return object3 == object1 ? object1 : object3;
                    }
                    q0.c();
                    return kotlinx.coroutines.channels.p.b.c(object2);
                }
                throw new IllegalStateException("unexpected");
            }
            case 1: {
                f0.n(object0);
                return ((kotlinx.coroutines.channels.p)object0).o();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final Object t(j j0, Object object0, d d0) {
        return j0.h1(object0, d0);
    }

    private static void t0() {
    }

    private final Object t1(q q0, int v, long v1, d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {0xC0F}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
        static final class kotlinx.coroutines.channels.j.m extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;
            long n;
            Object o;
            final j p;
            int q;

            kotlinx.coroutines.channels.j.m(j j0, d d0) {
                this.p = j0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                this.o = object0;
                this.q |= 0x80000000;
                Object object1 = this.p.t1(null, 0, 0L, this);
                return object1 == kotlin.coroutines.intrinsics.b.l() ? object1 : kotlinx.coroutines.channels.p.b(object1);
            }
        }

        kotlinx.coroutines.channels.p p1;
        kotlinx.coroutines.channels.j.m j$m0;
        if(d0 instanceof kotlinx.coroutines.channels.j.m) {
            j$m0 = (kotlinx.coroutines.channels.j.m)d0;
            int v2 = j$m0.q;
            if((v2 & 0x80000000) == 0) {
                j$m0 = new kotlinx.coroutines.channels.j.m(this, d0);
            }
            else {
                j$m0.q = v2 ^ 0x80000000;
            }
        }
        else {
            j$m0 = new kotlinx.coroutines.channels.j.m(this, d0);
        }
        Object object0 = j$m0.o;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(j$m0.q) {
            case 0: {
                f0.n(object0);
                j$m0.k = this;
                j$m0.l = q0;
                j$m0.m = v;
                j$m0.n = v1;
                j$m0.q = 1;
                p p0 = r.b(kotlin.coroutines.intrinsics.b.e(j$m0));
                try {
                    Function1 function10 = null;
                    kotlin.jvm.internal.L.n(p0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>");
                    E e0 = new E(p0);
                    Object object2 = this.d2(q0, v, v1, e0);
                    if(object2 == k.o) {
                        this.l1(e0, q0, v);
                    }
                    else {
                        if(object2 == k.q) {
                            if(v1 < this.F0()) {
                                q0.c();
                            }
                            q q1 = (q)j.i.get(this);
                            while(!this.C()) {
                                long v3 = j.e.getAndIncrement(this);
                                long v4 = v3 / ((long)k.b);
                                int v5 = (int)(v3 % ((long)k.b));
                                if(q1.c != v4) {
                                    q q2 = this.c0(v4, q1);
                                    if(q2 == null) {
                                        continue;
                                    }
                                    q1 = q2;
                                }
                                Object object3 = this.d2(q1, v5, v3, e0);
                                if(object3 == k.o) {
                                    this.l1(e0, q1, v5);
                                    goto label_67;
                                }
                                if(object3 == k.q) {
                                    if(v3 >= this.F0()) {
                                        continue;
                                    }
                                    q1.c();
                                    continue;
                                }
                                if(object3 == k.p) {
                                    throw new IllegalStateException("unexpected");
                                }
                                q1.c();
                                p1 = kotlinx.coroutines.channels.p.b(kotlinx.coroutines.channels.p.b.c(object3));
                                Function1 function11 = this.b;
                                if(function11 != null) {
                                    function10 = L.a(function11, object3, p0.getContext());
                                }
                                goto label_60;
                            }
                            this.d1(p0);
                            goto label_67;
                        }
                        else {
                            q0.c();
                            p1 = kotlinx.coroutines.channels.p.b(kotlinx.coroutines.channels.p.b.c(object2));
                            Function1 function12 = this.b;
                            if(function12 != null) {
                                function10 = L.a(function12, object2, p0.getContext());
                            }
                        }
                    label_60:
                        p0.B(p1, function10);
                    }
                }
                catch(Throwable throwable0) {
                    p0.V();
                    throw throwable0;
                }
            label_67:
                object0 = p0.x();
                if(object0 == kotlin.coroutines.intrinsics.b.l()) {
                    h.c(j$m0);
                }
                return object0 == object1 ? object1 : ((kotlinx.coroutines.channels.p)object0).o();
            }
            case 1: {
                q q3 = (q)j$m0.l;
                j j0 = (j)j$m0.k;
                f0.n(object0);
                return ((kotlinx.coroutines.channels.p)object0).o();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override
    @y4.l
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        switch(((int)(j.d.get(this) >> 60))) {
            case 2: {
                stringBuilder0.append("closed,");
                break;
            }
            case 3: {
                stringBuilder0.append("cancelled,");
            }
        }
        stringBuilder0.append("capacity=" + this.a + ',');
        stringBuilder0.append("data=[");
        Iterable iterable0 = u.O(new q[]{j.i.get(this), j.h.get(this), j.j.get(this)});
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((q)object0) != k.a) {
                arrayList0.add(object0);
            }
        }
        Iterator iterator1 = arrayList0.iterator();
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = iterator1.next();
        if(iterator1.hasNext()) {
            long v = ((q)object1).c;
            while(true) {
                Object object2 = iterator1.next();
                long v1 = ((q)object2).c;
                if(v > v1) {
                    object1 = object2;
                    v = v1;
                }
                if(!iterator1.hasNext()) {
                    break;
                }
            }
        }
        q q0 = (q)object1;
        long v2 = this.z0();
        long v3 = this.F0();
    alab1:
        do {
            int v4 = k.b;
            int v5 = 0;
            while(v5 < v4) {
                long v6 = q0.c * ((long)k.b) + ((long)v5);
                int v7 = Long.compare(v6, v3);
                if(v7 >= 0 && v6 >= v2) {
                    break alab1;
                }
                Object object3 = q0.J(v5);
                Object object4 = q0.I(v5);
                if(object3 instanceof o) {
                    int v8 = Long.compare(v6, v2);
                    if(v8 < 0 && v7 >= 0) {
                        s = "receive";
                    }
                    else if(v7 >= 0 || v8 < 0) {
                        s = "cont";
                    }
                    else {
                        s = "send";
                    }
                    goto label_72;
                }
                else if(object3 instanceof kotlinx.coroutines.selects.m) {
                    int v9 = Long.compare(v6, v2);
                    if(v9 < 0 && v7 >= 0) {
                        s = "onReceive";
                    }
                    else if(v7 >= 0 || v9 < 0) {
                        s = "select";
                    }
                    else {
                        s = "onSend";
                    }
                    goto label_72;
                }
                else if(object3 instanceof E) {
                    s = "receiveCatching";
                    goto label_72;
                }
                else if(object3 instanceof kotlinx.coroutines.channels.j.b) {
                    s = "sendBroadcast";
                    goto label_72;
                }
                else if(object3 instanceof J) {
                    s = "EB(" + object3 + ')';
                    goto label_72;
                }
                else if((kotlin.jvm.internal.L.g(object3, k.h) ? true : kotlin.jvm.internal.L.g(object3, k.i))) {
                    s = "resuming_sender";
                    goto label_72;
                }
                else if(!((((((object3 == null ? true : kotlin.jvm.internal.L.g(object3, k.g)) ? true : kotlin.jvm.internal.L.g(object3, k.k)) ? true : kotlin.jvm.internal.L.g(object3, k.j)) ? true : kotlin.jvm.internal.L.g(object3, k.m)) ? true : kotlin.jvm.internal.L.g(object3, k.l)) ? true : kotlin.jvm.internal.L.g(object3, k.z()))) {
                    s = object3.toString();
                label_72:
                    if(object4 == null) {
                        stringBuilder0.append(s + ',');
                    }
                    else {
                        stringBuilder0.append('(' + s + ',' + object4 + "),");
                    }
                }
                ++v5;
            }
            q0 = (q)q0.f();
        }
        while(q0 != null);
        if(v.v7(stringBuilder0) == 44) {
            kotlin.jvm.internal.L.o(stringBuilder0.deleteCharAt(stringBuilder0.length() - 1), "deleteCharAt(...)");
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    private final Throwable u0() {
        Throwable throwable0 = this.k0();
        return throwable0 == null ? new kotlinx.coroutines.channels.v("Channel was closed") : throwable0;
    }

    private final Object u1(Object object0, Function1 function10, A3.p p0, A3.a a0, A3.p p1) {
        Object object1;
        int v2;
        long v;
        q q0 = (q)j.i.get(this);
        while(true) {
            if(this.C()) {
                return a0.invoke();
            }
            v = j.e.getAndIncrement(this);
            long v1 = v / ((long)k.b);
            v2 = (int)(v % ((long)k.b));
            if(q0.c != v1) {
                q q1 = this.c0(v1, q0);
                if(q1 == null) {
                    continue;
                }
                q0 = q1;
            }
            object1 = this.d2(q0, v2, v, object0);
            if(object1 == k.o) {
                y1 y10 = object0 instanceof y1 ? ((y1)object0) : null;
                if(y10 != null) {
                    this.l1(y10, q0, v2);
                }
                return p0.invoke(q0, v2, v);
            }
            if(object1 != k.q) {
                break;
            }
            if(v < this.F0()) {
                q0.c();
            }
        }
        if(object1 == k.p) {
            return p1.invoke(q0, v2, v);
        }
        q0.c();
        return function10.invoke(object1);
    }

    @Override  // kotlinx.coroutines.channels.F
    @y4.l
    public Object v() {
        Object object0;
        q q2;
        long v = j.e.get(this);
        long v1 = j.d.get(this);
        if(this.P0(v1)) {
            Throwable throwable0 = this.k0();
            return kotlinx.coroutines.channels.p.b.a(throwable0);
        }
        if(v >= (v1 & 0xFFFFFFFFFFFFFFFL)) {
            return kotlinx.coroutines.channels.p.b.b();
        }
        V v2 = k.m;
        q q0 = (q)j.i.get(this);
        while(true) {
            if(this.C()) {
                Throwable throwable1 = this.k0();
                return kotlinx.coroutines.channels.p.b.a(throwable1);
            }
            long v3 = j.e.getAndIncrement(this);
            long v4 = v3 / ((long)k.b);
            int v5 = (int)(v3 % ((long)k.b));
            if(q0.c == v4) {
                q2 = q0;
            }
            else {
                q q1 = this.c0(v4, q0);
                if(q1 == null) {
                    continue;
                }
                q2 = q1;
            }
            object0 = this.d2(q2, v5, v3, v2);
            if(object0 == k.o) {
                y1 y10 = v2 instanceof y1 ? ((y1)v2) : null;
                if(y10 != null) {
                    this.l1(y10, q2, v5);
                }
                this.j2(v3);
                q2.A();
                return kotlinx.coroutines.channels.p.b.b();
            }
            if(object0 != k.q) {
                break;
            }
            if(v3 < this.F0()) {
                q2.c();
            }
            q0 = q2;
        }
        if(object0 == k.p) {
            throw new IllegalStateException("unexpected");
        }
        q2.c();
        return kotlinx.coroutines.channels.p.b.c(object0);
    }

    private final Object v0() {
        return this.receiveSegment$volatile;
    }

    static Object v1(j j0, Object object0, Function1 function10, A3.p p0, A3.a a0, A3.p p1, int v, Object object1) {
        @s0({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n*L\n1#1,3086:1\n*E\n"})
        public static final class kotlinx.coroutines.channels.j.n extends N implements A3.p {
            public static final kotlinx.coroutines.channels.j.n e;

            static {
                kotlinx.coroutines.channels.j.n.e = new kotlinx.coroutines.channels.j.n();
            }

            public kotlinx.coroutines.channels.j.n() {
                super(3);
            }

            @y4.l
            public final Void a(@y4.l q q0, int v, long v1) {
                throw new IllegalStateException("unexpected");
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((q)object0), ((Number)object1).intValue(), ((Number)object2).longValue());
            }
        }

        Object object2;
        int v3;
        long v1;
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
        }
        if((v & 16) != 0) {
            p1 = kotlinx.coroutines.channels.j.n.e;
        }
        q q0 = (q)j.i.get(j0);
        while(true) {
            if(j0.C()) {
                return a0.invoke();
            }
            v1 = j.e.getAndIncrement(j0);
            long v2 = v1 / ((long)k.b);
            v3 = (int)(v1 % ((long)k.b));
            if(q0.c != v2) {
                q q1 = j0.c0(v2, q0);
                if(q1 == null) {
                    continue;
                }
                q0 = q1;
            }
            object2 = j0.d2(q0, v3, v1, object0);
            if(object2 == k.o) {
                y1 y10 = object0 instanceof y1 ? ((y1)object0) : null;
                if(y10 != null) {
                    j0.l1(y10, q0, v3);
                }
                return p0.invoke(q0, v3, v1);
            }
            if(object2 != k.q) {
                break;
            }
            if(v1 < j0.F0()) {
                q0.c();
            }
        }
        if(object2 == k.p) {
            return p1.invoke(q0, v3, v1);
        }
        q0.c();
        return function10.invoke(object2);
    }

    private final void w1(q q0, int v, long v1, y1 y10, Function1 function10, A3.a a0) {
        Object object1;
        Object object0 = this.d2(q0, v, v1, y10);
        if(object0 == k.o) {
            this.l1(y10, q0, v);
            return;
        }
        if(object0 == k.q) {
            if(v1 < this.F0()) {
                q0.c();
            }
            q q1 = (q)j.i.get(this);
            while(true) {
                if(this.C()) {
                    a0.invoke();
                    return;
                }
                long v2 = j.e.getAndIncrement(this);
                long v3 = v2 / ((long)k.b);
                int v4 = (int)(v2 % ((long)k.b));
                if(q1.c != v3) {
                    q q2 = this.c0(v3, q1);
                    if(q2 == null) {
                        continue;
                    }
                    q1 = q2;
                }
                object1 = this.d2(q1, v4, v2, y10);
                if(object1 == k.o) {
                    if(!(y10 instanceof y1)) {
                        y10 = null;
                    }
                    if(y10 == null) {
                        return;
                    }
                    this.l1(y10, q1, v4);
                    return;
                }
                if(object1 != k.q) {
                    break;
                }
                if(v2 < this.F0()) {
                    q1.c();
                }
            }
            if(object1 == k.p) {
                throw new IllegalStateException("unexpected");
            }
            q1.c();
            function10.invoke(object1);
        }
        else {
            q0.c();
            function10.invoke(object0);
        }
    }

    private final long x0() {
        return this.receivers$volatile;
    }

    private final Object x1(q q0, int v, long v1, d d0) {
        p p0 = r.b(kotlin.coroutines.intrinsics.b.e(d0));
        try {
            Function1 function10 = null;
            Object object0 = this.d2(q0, v, v1, p0);
            if(object0 == k.o) {
                this.l1(p0, q0, v);
            }
            else if(object0 == k.q) {
                if(v1 < this.F0()) {
                    q0.c();
                }
                q q1 = (q)j.i.get(this);
                while(!this.C()) {
                    long v2 = j.e.getAndIncrement(this);
                    long v3 = v2 / ((long)k.b);
                    int v4 = (int)(v2 % ((long)k.b));
                    if(q1.c != v3) {
                        q q2 = this.c0(v3, q1);
                        if(q2 == null) {
                            continue;
                        }
                        q1 = q2;
                    }
                    object0 = this.d2(q1, v4, v2, p0);
                    if(object0 == k.o) {
                        goto label_31;
                    }
                    if(object0 == k.q) {
                        if(v2 >= this.F0()) {
                            continue;
                        }
                        q1.c();
                        continue;
                    }
                    if(object0 == k.p) {
                        throw new IllegalStateException("unexpected");
                    }
                    q1.c();
                    Function1 function11 = this.b;
                    if(function11 == null) {
                        p0.B(object0, null);
                        goto label_49;
                    label_31:
                        if(p0 instanceof y1) {
                            function10 = p0;
                        }
                        if(function10 != null) {
                            this.l1(((y1)function10), q1, v4);
                        }
                    }
                    else {
                        p0.B(object0, L.a(function11, object0, p0.getContext()));
                    }
                    goto label_49;
                }
                this.e1(p0);
            }
            else {
                q0.c();
                Function1 function12 = this.b;
                if(function12 != null) {
                    function10 = L.a(function12, object0, p0.getContext());
                }
                p0.B(object0, function10);
            }
        }
        catch(Throwable throwable0) {
            p0.V();
            throw throwable0;
        }
    label_49:
        Object object1 = p0.x();
        if(object1 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object1;
    }

    @Override  // kotlinx.coroutines.channels.F
    @kotlin.internal.h
    @kotlin.k(level = kotlin.m.b, message = "Deprecated in favor of \'receiveCatching\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'receiveOrNull\' did, for the detailed replacement please refer to the \'receiveOrNull\' documentation", replaceWith = @c0(expression = "receiveCatching().getOrNull()", imports = {}))
    @m
    public Object y(@y4.l d d0) {
        return kotlinx.coroutines.channels.l.a.e(this, d0);
    }

    private final void y1(kotlinx.coroutines.selects.m m0, Object object0) {
        Object object1;
        q q0 = (q)j.i.get(this);
        while(true) {
            if(this.C()) {
                this.f1(m0);
                return;
            }
            long v = j.e.getAndIncrement(this);
            long v1 = v / ((long)k.b);
            int v2 = (int)(v % ((long)k.b));
            if(q0.c != v1) {
                q q1 = this.c0(v1, q0);
                if(q1 == null) {
                    continue;
                }
                q0 = q1;
            }
            object1 = this.d2(q0, v2, v, m0);
            if(object1 == k.o) {
                y1 y10 = m0 instanceof y1 ? ((y1)m0) : null;
                if(y10 == null) {
                    return;
                }
                this.l1(y10, q0, v2);
                return;
            }
            if(object1 != k.q) {
                break;
            }
            if(v < this.F0()) {
                q0.c();
            }
        }
        if(object1 == k.p) {
            throw new IllegalStateException("unexpected");
        }
        q0.c();
        m0.g(object1);
    }

    @Override  // kotlinx.coroutines.channels.F
    @m
    public Object z(@y4.l d d0) {
        return j.s1(this, d0);
    }

    public final long z0() {
        return j.e.get(this);
    }

    protected void z1(@y4.l kotlinx.coroutines.selects.m m0, @m Object object0) {
        int v3;
        q q0 = (q)j.h.get(this);
    alab1:
        while(true) {
            long v = j.d.getAndIncrement(this);
            long v1 = 0xFFFFFFFFFFFFFFFL & v;
            boolean z = this.R0(v);
            long v2 = v1 / ((long)k.b);
            v3 = (int)(v1 % ((long)k.b));
            if(q0.c != v2) {
                q q1 = this.d0(v2, q0);
                if(q1 == null) {
                    if(!z) {
                        continue;
                    }
                    this.g1(object0, m0);
                    return;
                }
                else {
                    q0 = q1;
                }
            }
            switch(this.f2(q0, v3, object0, v1, m0, z)) {
                case 0: {
                    q0.c();
                    m0.g(S0.a);
                    return;
                }
                case 1: {
                    m0.g(S0.a);
                    return;
                }
                case 2: {
                    goto label_22;
                }
                case 3: {
                    throw new IllegalStateException("unexpected");
                }
                case 4: {
                    break alab1;
                }
                case 5: {
                    q0.c();
                }
            }
        }
        if(v1 >= this.z0()) {
            this.g1(object0, m0);
            return;
        }
        q0.c();
        this.g1(object0, m0);
        return;
    label_22:
        if(z) {
            q0.A();
            this.g1(object0, m0);
            return;
        }
        y1 y10 = m0 instanceof y1 ? ((y1)m0) : null;
        if(y10 != null) {
            this.m1(y10, q0, v3);
        }
    }
}

