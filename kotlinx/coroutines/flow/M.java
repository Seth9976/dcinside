package kotlinx.coroutines.flow;

import kotlin.S0;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlinx.coroutines.O;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.channels.d;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.channels.r;
import y4.l;

@s0({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,172:1\n105#2:173\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n149#1:173\n*E\n"})
final class m {
    @k(level = kotlin.m.b, message = "\'BroadcastChannel\' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @l
    public static final i b(@l d d0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n1#1,111:1\n150#2,2:112\n*E\n"})
        public static final class a implements i {
            final d a;

            public a(d d0) {
                this.a = d0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @y4.m
            public Object collect(@l j j0, @l kotlin.coroutines.d d0) {
                Object object0 = kotlinx.coroutines.flow.k.l0(j0, this.a.g(), d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }

        return new a(d0);
    }

    @l
    public static final i c(@l F f0) {
        return new e(f0, true, null, 0, null, 28, null);
    }

    @y4.m
    public static final Object d(@l j j0, @l F f0, @l kotlin.coroutines.d d0) {
        Object object0 = m.e(j0, f0, true, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private static final Object e(j j0, F f0, boolean z, kotlin.coroutines.d d0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {0x20, 33}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
        static final class kotlinx.coroutines.flow.m.b extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            boolean n;
            Object o;
            int p;

            kotlinx.coroutines.flow.m.b(kotlin.coroutines.d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.o = object0;
                this.p |= 0x80000000;
                return m.e(null, null, false, this);
            }
        }

        j j1;
        n n1;
        n n0;
        kotlinx.coroutines.flow.m.b m$b0;
        if(d0 instanceof kotlinx.coroutines.flow.m.b) {
            m$b0 = (kotlinx.coroutines.flow.m.b)d0;
            int v = m$b0.p;
            if((v & 0x80000000) == 0) {
                m$b0 = new kotlinx.coroutines.flow.m.b(d0);
            }
            else {
                m$b0.p = v ^ 0x80000000;
            }
        }
        else {
            m$b0 = new kotlinx.coroutines.flow.m.b(d0);
        }
        Object object0 = m$b0.o;
        Object object1 = b.l();
        switch(m$b0.p) {
            case 0: {
                f0.n(object0);
                kotlinx.coroutines.flow.k.o0(j0);
                try {
                    n0 = f0.iterator();
                    goto label_30;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                z = m$b0.n;
                n1 = (n)m$b0.m;
                f0 = (F)m$b0.l;
                j1 = (j)m$b0.k;
                try {
                    f0.n(object0);
                    goto label_41;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 2: {
                z = m$b0.n;
                n1 = (n)m$b0.m;
                f0 = (F)m$b0.l;
                j1 = (j)m$b0.k;
                try {
                    f0.n(object0);
                    while(true) {
                        n0 = n1;
                        j0 = j1;
                    label_30:
                        m$b0.k = j0;
                        m$b0.l = f0;
                        m$b0.m = n0;
                        m$b0.n = z;
                        m$b0.p = 1;
                        Object object2 = n0.b(m$b0);
                        if(object2 == object1) {
                            return object1;
                        }
                        j1 = j0;
                        n1 = n0;
                        object0 = object2;
                    label_41:
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_55;
                        }
                        Object object3 = n1.next();
                        m$b0.k = j1;
                        m$b0.l = f0;
                        m$b0.m = n1;
                        m$b0.n = z;
                        m$b0.p = 2;
                        if(j1.emit(object3, m$b0) != object1) {
                            continue;
                        }
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(z) {
            r.b(f0, throwable0);
        }
        throw throwable0;
    label_55:
        if(z) {
            r.b(f0, null);
        }
        return S0.a;
    }

    @l
    public static final F f(@l i i0, @l O o0) {
        return kotlinx.coroutines.flow.internal.f.b(i0).m(o0);
    }

    @l
    public static final i g(@l F f0) {
        return new e(f0, false, null, 0, null, 28, null);
    }
}

