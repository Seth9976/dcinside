package kotlinx.coroutines.channels;

import A3.o;
import kotlin.S0;
import kotlin.b;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.J;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.Z0;
import kotlinx.coroutines.a;
import kotlinx.coroutines.h0;
import y4.l;

@s0({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,200:1\n44#2,4:201\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n47#1:201,4\n*E\n"})
public final class h {
    @k(level = m.a, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @Z0
    @l
    public static final d a(@l O o0, @l g g0, int v, @l Q q0, @y4.m Function1 function10, @b @l o o1) {
        d d0 = new kotlinx.coroutines.channels.g(J.e(o0, g0), f.a(v), true);
        if(function10 != null) {
            ((Q0)d0).w(function10);
        }
        ((a)d0).P1(q0, d0, o1);
        return d0;
    }

    @k(level = m.a, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @Z0
    @l
    public static final d b(@l F f0, int v, @l Q q0) {
        @s0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n1#1,106:1\n47#2:107\n*E\n"})
        public static final class kotlinx.coroutines.channels.h.a extends kotlin.coroutines.a implements CoroutineExceptionHandler {
            public kotlinx.coroutines.channels.h.a(kotlinx.coroutines.CoroutineExceptionHandler.b coroutineExceptionHandler$b0) {
                super(coroutineExceptionHandler$b0);
            }

            @Override  // kotlinx.coroutines.CoroutineExceptionHandler
            public void handleException(@l g g0, @l Throwable throwable0) {
            }
        }


        static final class kotlinx.coroutines.channels.h.b extends N implements Function1 {
            final F e;

            kotlinx.coroutines.channels.h.b(F f0) {
                this.e = f0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@y4.m Throwable throwable0) {
                r.b(this.e, throwable0);
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {52, 53}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
        static final class c extends kotlin.coroutines.jvm.internal.o implements o {
            Object k;
            int l;
            private Object m;
            final F n;

            c(F f0, kotlin.coroutines.d d0) {
                this.n = f0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new c(this.n, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((kotlin.coroutines.d)object1));
            }

            @y4.m
            public final Object invoke(@l D d0, @y4.m kotlin.coroutines.d d1) {
                return ((c)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                D d1;
                n n0;
                D d0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        d0 = (D)this.m;
                        n0 = this.n.iterator();
                        goto label_15;
                    }
                    case 1: {
                        n0 = (n)this.k;
                        d1 = (D)this.m;
                        f0.n(object0);
                        goto label_23;
                    }
                    case 2: {
                        n0 = (n)this.k;
                        d1 = (D)this.m;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    d0 = d1;
                label_15:
                    this.m = d0;
                    this.k = n0;
                    this.l = 1;
                    Object object2 = n0.b(this);
                    if(object2 == object1) {
                        return object1;
                    }
                    d1 = d0;
                    object0 = object2;
                label_23:
                    if(!((Boolean)object0).booleanValue()) {
                        break;
                    }
                    Object object3 = n0.next();
                    this.m = d1;
                    this.k = n0;
                    this.l = 2;
                    if(d1.I(object3, this) != object1) {
                        continue;
                    }
                    return object1;
                }
                return S0.a;
            }
        }

        return h.c(P.m(P.m(() -> i.a, h0.g()), new kotlinx.coroutines.channels.h.a(CoroutineExceptionHandler.A8)), null, v, q0, new kotlinx.coroutines.channels.h.b(f0), new c(f0, null), 1, null);
    }

    public static d c(O o0, g g0, int v, Q q0, Function1 function10, o o1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            g0 = i.a;
        }
        if((v1 & 4) != 0) {
            q0 = Q.b;
        }
        if((v1 & 8) != 0) {
            function10 = null;
        }
        return h.a(o0, g0, ((v1 & 2) == 0 ? v : 1), q0, function10, o1);
    }

    public static d d(F f0, int v, Q q0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 1;
        }
        if((v1 & 2) != 0) {
            q0 = Q.b;
        }
        return h.b(f0, v, q0);
    }
}

