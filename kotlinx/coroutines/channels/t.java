package kotlinx.coroutines.channels;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlinx.coroutines.selects.g;
import kotlinx.coroutines.t0;
import y4.l;
import y4.m;

@s0({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,104:1\n58#1,11:105\n81#1:116\n58#1,6:117\n82#1,2:123\n68#1:125\n64#1,3:126\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n81#1:105,11\n92#1:116\n92#1:117,6\n92#1:123,2\n92#1:125\n92#1:126,3\n*E\n"})
final class t {
    @b0
    public static final void a(@l F f0, @m Throwable throwable0) {
        CancellationException cancellationException0 = null;
        if(throwable0 != null) {
            if(throwable0 instanceof CancellationException) {
                cancellationException0 = (CancellationException)throwable0;
            }
            if(cancellationException0 == null) {
                cancellationException0 = t0.a("Channel was consumed, consumer had failed", throwable0);
            }
        }
        f0.e(cancellationException0);
    }

    public static final Object b(@l F f0, @l Function1 function10) {
        Object object0;
        try {
            object0 = function10.invoke(f0);
        }
        catch(Throwable throwable0) {
            r.b(f0, throwable0);
            throw throwable0;
        }
        r.b(f0, null);
        return object0;
    }

    @m
    public static final Object c(@l F f0, @l Function1 function10, @l d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {82}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
        @s0({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$consumeEach$1\n*L\n1#1,104:1\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;

            a(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return t.c(null, null, this);
            }
        }

        Throwable throwable1;
        Function1 function11;
        n n0;
        F f1;
        a t$a0;
        if(d0 instanceof a) {
            t$a0 = (a)d0;
            int v = t$a0.o;
            if((v & 0x80000000) == 0) {
                t$a0 = new a(d0);
            }
            else {
                t$a0.o = v ^ 0x80000000;
            }
        }
        else {
            t$a0 = new a(d0);
        }
        Object object0 = t$a0.n;
        Object object1 = b.l();
        switch(t$a0.o) {
            case 0: {
                f0.n(object0);
                try {
                    f1 = f0;
                    n0 = f0.iterator();
                    function11 = function10;
                    goto label_28;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                n0 = (n)t$a0.m;
                f1 = (F)t$a0.l;
                Function1 function12 = (Function1)t$a0.k;
                try {
                    f0.n(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_43;
                        }
                        function12.invoke(n0.next());
                        function11 = function12;
                    label_28:
                        t$a0.k = function11;
                        t$a0.l = f1;
                        t$a0.m = n0;
                        t$a0.o = 1;
                        Object object2 = n0.b(t$a0);
                        if(object2 == object1) {
                            return object1;
                        }
                        function12 = function11;
                        object0 = object2;
                    }
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            r.b(f1, throwable1);
            throw throwable2;
        }
    label_43:
        r.b(f1, null);
        return S0.a;
    }

    private static final Object d(F f0, Function1 function10, d d0) {
        try {
            n n0 = f0.iterator();
            while(true) {
                if(!((Boolean)n0.b(null)).booleanValue()) {
                    goto label_9;
                }
                function10.invoke(n0.next());
            }
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            r.b(f0, throwable0);
            throw throwable1;
        }
    label_9:
        r.b(f0, null);
        return S0.a;
    }

    @k(level = kotlin.m.c, message = "Deprecated in the favour of \'onReceiveCatching\'")
    public static final g e(F f0) {
        L.n(f0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return f0.r();
    }

    @k(level = kotlin.m.c, message = "Deprecated in the favour of \'receiveCatching\'", replaceWith = @c0(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final Object f(F f0, d d0) {
        L.n(f0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return f0.y(d0);
    }

    @m
    public static final Object g(@l F f0, @l d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {0x70}, m = "toList", n = {"$this$toList_u24lambda_u243", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
        static final class kotlinx.coroutines.channels.t.b extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            int p;

            kotlinx.coroutines.channels.t.b(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.o = object0;
                this.p |= 0x80000000;
                return r.g0(null, this);
            }
        }

        Object object2;
        F f2;
        Throwable throwable1;
        n n0;
        F f1;
        List list2;
        List list1;
        kotlinx.coroutines.channels.t.b t$b0;
        if(d0 instanceof kotlinx.coroutines.channels.t.b) {
            t$b0 = (kotlinx.coroutines.channels.t.b)d0;
            int v = t$b0.p;
            if((v & 0x80000000) == 0) {
                t$b0 = new kotlinx.coroutines.channels.t.b(d0);
            }
            else {
                t$b0.p = v ^ 0x80000000;
            }
        }
        else {
            t$b0 = new kotlinx.coroutines.channels.t.b(d0);
        }
        Object object0 = t$b0.o;
        Object object1 = b.l();
        switch(t$b0.p) {
            case 0: {
                f0.n(object0);
                List list0 = u.i();
                try {
                    list1 = list0;
                    list2 = list1;
                    f1 = f0;
                    n0 = f0.iterator();
                    goto label_31;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    throw throwable1;
                }
            }
            case 1: {
                n0 = (n)t$b0.n;
                f2 = (F)t$b0.m;
                list1 = (List)t$b0.l;
                list2 = (List)t$b0.k;
                try {
                    f0.n(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_51;
                        }
                        list1.add(n0.next());
                        f1 = f2;
                    label_31:
                        t$b0.k = list2;
                        t$b0.l = list1;
                        t$b0.m = f1;
                        t$b0.n = n0;
                        t$b0.p = 1;
                        object2 = n0.b(t$b0);
                        if(object2 == object1) {
                            return object1;
                        }
                        f2 = f1;
                        object0 = object2;
                    }
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f1 = f2;
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            r.b(f1, throwable1);
            throw throwable2;
        }
    label_51:
        r.b(f2, null);
        return u.a(list2);
    }
}

