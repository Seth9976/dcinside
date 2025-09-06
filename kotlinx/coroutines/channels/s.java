package kotlinx.coroutines.channels;

import kotlin.S0;
import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.O;
import kotlinx.coroutines.j;
import y4.l;

@s0({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,61:1\n522#2,6:62\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n*L\n37#1:62,6\n*E\n"})
final class s {
    @k(level = m.c, message = "Deprecated in the favour of \'trySendBlocking\'. Consider handling the result of \'trySendBlocking\' explicitly and rethrow exception if necessary", replaceWith = @c0(expression = "trySendBlocking(element)", imports = {}))
    public static final void a(G g0, Object object0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.o {
            int k;
            final G l;
            final Object m;

            a(G g0, Object object0, d d0) {
                this.l = g0;
                this.m = object0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new a(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.l.I(this.m, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        if(p.m(g0.l(object0))) {
            return;
        }
        j.b(null, new a(g0, object0, null), 1, null);
    }

    @l
    public static final Object b(@l G g0, Object object0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt$trySendBlocking$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
        static final class kotlinx.coroutines.channels.s.b extends o implements A3.o {
            int k;
            private Object l;
            final G m;
            final Object n;

            kotlinx.coroutines.channels.s.b(G g0, Object object0, d d0) {
                this.m = g0;
                this.n = object0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.channels.s.b(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((kotlinx.coroutines.channels.s.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                S0 s00;
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        try {
                            this.k = 1;
                            if(this.m.I(this.n, this) == object1) {
                                return object1;
                            label_8:
                                f0.n(object0);
                            }
                            s00 = S0.a;
                            goto label_13;
                        }
                        catch(Throwable throwable0) {
                        }
                        break;
                    }
                    case 1: {
                        goto label_8;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                s00 = e0.b(f0.a(throwable0));
            label_13:
                if(e0.j(s00)) {
                    return p.b(p.b.c(S0.a));
                }
                Throwable throwable1 = e0.e(s00);
                return p.b(p.b.a(throwable1));
            }
        }

        Object object1 = g0.l(object0);
        if(!(object1 instanceof c)) {
            S0 s00 = (S0)object1;
            return p.b.c(S0.a);
        }
        return ((p)j.b(null, new kotlinx.coroutines.channels.s.b(g0, object0, null), 1, null)).o();
    }
}

