package kotlinx.coroutines.channels;

import A3.o;
import A3.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.S0;
import kotlin.V;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import kotlin.r0;
import kotlinx.coroutines.Z0;
import kotlinx.coroutines.h0;
import y4.l;

@s0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,509:1\n24#1,5:510\n58#2,11:515\n58#2,11:526\n58#2,11:537\n58#2,11:548\n81#2:559\n58#2,6:560\n82#2:566\n68#2:567\n83#2:568\n64#2,3:569\n58#2,11:572\n81#2:583\n58#2,6:584\n82#2,2:590\n68#2:592\n64#2,3:593\n58#2,11:596\n58#2,11:607\n58#2,11:618\n81#2:629\n58#2,6:630\n82#2,2:636\n68#2:638\n64#2,3:639\n81#2:642\n58#2,6:643\n82#2,2:649\n68#2:651\n64#2,3:652\n81#2:655\n58#2,6:656\n82#2,2:662\n68#2:664\n64#2,3:665\n81#2:668\n58#2,6:669\n82#2,2:675\n68#2:677\n64#2,3:678\n81#2:681\n58#2,6:682\n82#2,2:688\n68#2:690\n64#2,3:691\n58#2,11:694\n81#2:705\n58#2,6:706\n82#2,2:712\n68#2:714\n64#2,3:715\n58#2,11:718\n58#2,11:729\n58#2,11:740\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n*L\n40#1:510,5\n64#1:515,11\n79#1:526,11\n93#1:537,11\n103#1:548,11\n114#1:559\n114#1:560,6\n114#1:566\n114#1:567\n114#1:568\n114#1:569,3\n125#1:572,11\n140#1:583\n140#1:584,6\n140#1:590,2\n140#1:592\n140#1:593,3\n151#1:596,11\n164#1:607,11\n177#1:618,11\n262#1:629\n262#1:630,6\n262#1:636,2\n262#1:638\n262#1:639,3\n271#1:642\n271#1:643,6\n271#1:649,2\n271#1:651\n271#1:652,3\n307#1:655\n307#1:656,6\n307#1:662,2\n307#1:664\n307#1:665,3\n315#1:668\n315#1:669,6\n315#1:675,2\n315#1:677\n315#1:678,3\n328#1:681\n328#1:682,6\n328#1:688,2\n328#1:690\n328#1:691,3\n433#1:694,11\n441#1:705\n441#1:706,6\n441#1:712,2\n441#1:714\n441#1:715,3\n448#1:718,11\n462#1:729,11\n476#1:740,11\n*E\n"})
final class u {
    @k(level = m.c, message = "Binary compatibility")
    public static final Object A(F f0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {105}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
        static final class s extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            int n;

            s(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.m = object0;
                this.n |= 0x80000000;
                return u.A(null, this);
            }
        }

        Object object3;
        n n1;
        Throwable throwable1;
        F f1;
        Object object2;
        n n0;
        s u$s0;
        if(d0 instanceof s) {
            u$s0 = (s)d0;
            int v = u$s0.n;
            if((v & 0x80000000) == 0) {
                u$s0 = new s(d0);
            }
            else {
                u$s0.n = v ^ 0x80000000;
            }
        }
        else {
            u$s0 = new s(d0);
        }
        Object object0 = u$s0.m;
        Object object1 = b.l();
        switch(u$s0.n) {
            case 0: {
                f0.n(object0);
                try {
                    n0 = f0.iterator();
                    u$s0.k = f0;
                    u$s0.l = n0;
                    u$s0.n = 1;
                    object2 = n0.b(u$s0);
                }
                catch(Throwable throwable0) {
                    f1 = f0;
                    throwable1 = throwable0;
                    break;
                }
                if(object2 == object1) {
                    return object1;
                }
                f1 = f0;
                n1 = n0;
                object0 = object2;
                goto label_33;
            }
            case 1: {
                n1 = (n)u$s0.l;
                f1 = (F)u$s0.k;
                try {
                    f0.n(object0);
                label_33:
                    if(((Boolean)object0).booleanValue()) {
                        object3 = n1.next();
                        goto label_41;
                    }
                    goto label_43;
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
    label_41:
        r.b(f1, null);
        return object3;
    label_43:
        r.b(f1, null);
        return null;
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F B(F f0, g g0, o o0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {0x15F, 0x160, 0x160}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
        static final class t extends kotlin.coroutines.jvm.internal.o implements o {
            Object k;
            int l;
            private Object m;
            final F n;
            final o o;

            t(F f0, o o0, d d0) {
                this.n = f0;
                this.o = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new t(this.n, this.o, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l D d0, @y4.m d d1) {
                return ((t)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                D d1;
                n n0;
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.m;
                        n0 = this.n.iterator();
                        d1 = d0;
                        break;
                    }
                    case 1: {
                        n0 = (n)this.k;
                        d1 = (D)this.m;
                        f0.n(object0);
                        goto label_25;
                    }
                    case 2: {
                        n0 = (n)this.k;
                        d1 = (D)this.m;
                        f0.n(object0);
                        goto label_33;
                    }
                    case 3: {
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
                    this.m = d1;
                    this.k = n0;
                    this.l = 1;
                    object0 = n0.b(this);
                    if(object0 == object1) {
                        return object1;
                    }
                label_25:
                    if(!((Boolean)object0).booleanValue()) {
                        break;
                    }
                    Object object2 = n0.next();
                    this.m = d1;
                    this.k = n0;
                    this.l = 2;
                    object0 = this.o.invoke(object2, this);
                    if(object0 == object1) {
                        return object1;
                    }
                label_33:
                    this.m = d1;
                    this.k = n0;
                    this.l = 3;
                    if(r.e0(((F)object0), d1, this) != object1) {
                        continue;
                    }
                    return object1;
                }
                return S0.a;
            }
        }

        Function1 function10 = r.g(f0);
        t u$t0 = new t(f0, o0, null);
        return B.g(() -> i.a, g0, 0, null, function10, u$t0, 6, null);
    }

    public static F C(F f0, g g0, o o0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.g();
        }
        return u.B(f0, g0, o0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object D(F f0, Object object0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {0x205}, m = "indexOf", n = {"element", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
        static final class kotlinx.coroutines.channels.u.u extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            int p;

            kotlinx.coroutines.channels.u.u(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.o = object0;
                this.p |= 0x80000000;
                return u.D(null, null, this);
            }
        }

        Integer integer0;
        Throwable throwable1;
        Object object3;
        kotlin.jvm.internal.l0.f l0$f1;
        n n0;
        F f1;
        kotlinx.coroutines.channels.u.u u$u0;
        if(d0 instanceof kotlinx.coroutines.channels.u.u) {
            u$u0 = (kotlinx.coroutines.channels.u.u)d0;
            int v = u$u0.p;
            if((v & 0x80000000) == 0) {
                u$u0 = new kotlinx.coroutines.channels.u.u(d0);
            }
            else {
                u$u0.p = v ^ 0x80000000;
            }
        }
        else {
            u$u0 = new kotlinx.coroutines.channels.u.u(d0);
        }
        Object object1 = u$u0.o;
        Object object2 = b.l();
        switch(u$u0.p) {
            case 0: {
                f0.n(object1);
                kotlin.jvm.internal.l0.f l0$f0 = new kotlin.jvm.internal.l0.f();
                try {
                    f1 = f0;
                    n0 = f0.iterator();
                    l0$f1 = l0$f0;
                    object3 = object0;
                    goto label_32;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                n0 = (n)u$u0.n;
                f1 = (F)u$u0.m;
                l0$f1 = (kotlin.jvm.internal.l0.f)u$u0.l;
                Object object4 = u$u0.k;
                try {
                    f0.n(object1);
                    while(true) {
                        if(!((Boolean)object1).booleanValue()) {
                            goto label_52;
                        }
                        if(!L.g(object4, n0.next())) {
                            ++l0$f1.a;
                            object3 = object4;
                        label_32:
                            u$u0.k = object3;
                            u$u0.l = l0$f1;
                            u$u0.m = f1;
                            u$u0.n = n0;
                            u$u0.p = 1;
                            Object object5 = n0.b(u$u0);
                            if(object5 == object2) {
                                return object2;
                            }
                            object4 = object3;
                            object1 = object5;
                            continue;
                        }
                        integer0 = kotlin.coroutines.jvm.internal.b.f(l0$f1.a);
                        goto label_50;
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
    label_50:
        r.b(f1, null);
        return integer0;
    label_52:
        r.b(f1, null);
        return kotlin.coroutines.jvm.internal.b.f(-1);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object E(F f0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {0x7F, 130}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
        static final class v extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;

            v(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return u.E(null, this);
            }
        }

        Object object5;
        F f2;
        Object object4;
        n n2;
        Object object3;
        n n1;
        F f1;
        Object object2;
        n n0;
        v u$v0;
        if(d0 instanceof v) {
            u$v0 = (v)d0;
            int v = u$v0.o;
            if((v & 0x80000000) == 0) {
                u$v0 = new v(d0);
            }
            else {
                u$v0.o = v ^ 0x80000000;
            }
        }
        else {
            u$v0 = new v(d0);
        }
        Object object0 = u$v0.n;
        Object object1 = b.l();
    alab1:
        switch(u$v0.o) {
            case 0: {
                f0.n(object0);
                try {
                    n0 = f0.iterator();
                    u$v0.k = f0;
                    u$v0.l = n0;
                    u$v0.o = 1;
                    object2 = n0.b(u$v0);
                    if(object2 == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    f1 = f0;
                    throwable1 = throwable0;
                    throw throwable1;
                }
                f1 = f0;
                n1 = n0;
                object0 = object2;
                goto label_28;
            }
            case 1: {
                n1 = (n)u$v0.l;
                f1 = (F)u$v0.k;
                f0.n(object0);
            label_28:
                if(!((Boolean)object0).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                object3 = n1.next();
                n2 = n1;
                f0 = f1;
                break;
            }
            case 2: {
                object4 = u$v0.m;
                n2 = (n)u$v0.l;
                f2 = (F)u$v0.k;
                try {
                    f0.n(object0);
                    while(true) {
                    label_40:
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_65;
                        }
                        object3 = n2.next();
                        f0 = f2;
                        break alab1;
                    }
                }
                catch(Throwable throwable1) {
                    goto label_60;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            u$v0.k = f0;
            u$v0.l = n2;
            u$v0.m = object3;
            u$v0.o = 2;
            object5 = n2.b(u$v0);
        }
        catch(Throwable throwable0) {
            f1 = f0;
            throwable1 = throwable0;
            throw throwable1;
        }
        if(object5 == object1) {
            return object1;
        }
        try {
            f2 = f0;
            object4 = object3;
            object0 = object5;
            goto label_40;
        }
        catch(Throwable throwable1) {
        label_60:
            f1 = f2;
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            r.b(f1, throwable1);
            throw throwable2;
        }
    label_65:
        r.b(f2, null);
        return object4;
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object F(F f0, Object object0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {0x205}, m = "lastIndexOf", n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
        static final class w extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            Object p;
            int q;

            w(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.p = object0;
                this.q |= 0x80000000;
                return u.F(null, null, this);
            }
        }

        Throwable throwable1;
        Object object3;
        kotlin.jvm.internal.l0.f l0$f2;
        n n0;
        F f1;
        kotlin.jvm.internal.l0.f l0$f1;
        w u$w0;
        if(d0 instanceof w) {
            u$w0 = (w)d0;
            int v = u$w0.q;
            if((v & 0x80000000) == 0) {
                u$w0 = new w(d0);
            }
            else {
                u$w0.q = v ^ 0x80000000;
            }
        }
        else {
            u$w0 = new w(d0);
        }
        Object object1 = u$w0.p;
        Object object2 = b.l();
        switch(u$w0.q) {
            case 0: {
                f0.n(object1);
                kotlin.jvm.internal.l0.f l0$f0 = new kotlin.jvm.internal.l0.f();
                l0$f0.a = -1;
                l0$f1 = new kotlin.jvm.internal.l0.f();
                try {
                    f1 = f0;
                    n0 = f0.iterator();
                    l0$f2 = l0$f0;
                    object3 = object0;
                    goto label_36;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                n0 = (n)u$w0.o;
                f1 = (F)u$w0.n;
                l0$f1 = (kotlin.jvm.internal.l0.f)u$w0.m;
                l0$f2 = (kotlin.jvm.internal.l0.f)u$w0.l;
                Object object4 = u$w0.k;
                try {
                    f0.n(object1);
                    while(true) {
                        if(!((Boolean)object1).booleanValue()) {
                            goto label_53;
                        }
                        if(L.g(object4, n0.next())) {
                            l0$f2.a = l0$f1.a;
                        }
                        ++l0$f1.a;
                        object3 = object4;
                    label_36:
                        u$w0.k = object3;
                        u$w0.l = l0$f2;
                        u$w0.m = l0$f1;
                        u$w0.n = f1;
                        u$w0.o = n0;
                        u$w0.q = 1;
                        Object object5 = n0.b(u$w0);
                        if(object5 == object2) {
                            return object2;
                        }
                        object4 = object3;
                        object1 = object5;
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
    label_53:
        r.b(f1, null);
        return kotlin.coroutines.jvm.internal.b.f(l0$f2.a);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object G(F f0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {0x99, 0x9C}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
        static final class x extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;

            x(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return u.G(null, this);
            }
        }

        Object object5;
        F f2;
        Object object4;
        n n2;
        Object object3;
        n n1;
        F f1;
        Object object2;
        n n0;
        x u$x0;
        if(d0 instanceof x) {
            u$x0 = (x)d0;
            int v = u$x0.o;
            if((v & 0x80000000) == 0) {
                u$x0 = new x(d0);
            }
            else {
                u$x0.o = v ^ 0x80000000;
            }
        }
        else {
            u$x0 = new x(d0);
        }
        Object object0 = u$x0.n;
        Object object1 = b.l();
    alab1:
        switch(u$x0.o) {
            case 0: {
                f0.n(object0);
                try {
                    n0 = f0.iterator();
                    u$x0.k = f0;
                    u$x0.l = n0;
                    u$x0.o = 1;
                    object2 = n0.b(u$x0);
                    if(object2 == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    f1 = f0;
                    throwable1 = throwable0;
                    throw throwable1;
                }
                f1 = f0;
                n1 = n0;
                object0 = object2;
                goto label_28;
            }
            case 1: {
                n1 = (n)u$x0.l;
                f1 = (F)u$x0.k;
                f0.n(object0);
            label_28:
                if(((Boolean)object0).booleanValue()) {
                    object3 = n1.next();
                    n2 = n1;
                    f0 = f1;
                    break;
                }
                r.b(f1, null);
                return null;
            }
            case 2: {
                object4 = u$x0.m;
                n2 = (n)u$x0.l;
                f2 = (F)u$x0.k;
                try {
                    f0.n(object0);
                    while(true) {
                    label_41:
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_66;
                        }
                        object3 = n2.next();
                        f0 = f2;
                        break alab1;
                    }
                }
                catch(Throwable throwable1) {
                    goto label_61;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            u$x0.k = f0;
            u$x0.l = n2;
            u$x0.m = object3;
            u$x0.o = 2;
            object5 = n2.b(u$x0);
        }
        catch(Throwable throwable0) {
            f1 = f0;
            throwable1 = throwable0;
            throw throwable1;
        }
        if(object5 == object1) {
            return object1;
        }
        try {
            f2 = f0;
            object4 = object3;
            object0 = object5;
            goto label_41;
        }
        catch(Throwable throwable1) {
        label_61:
            f1 = f2;
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            r.b(f1, throwable1);
            throw throwable2;
        }
    label_66:
        r.b(f2, null);
        return object4;
    }

    @b0
    @l
    public static final F H(@l F f0, @l g g0, @l o o0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {0x205, 363, 363}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
        @s0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,509:1\n81#2:510\n58#2,6:511\n82#2,2:517\n68#2:519\n64#2,3:520\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n*L\n362#1:510\n362#1:511,6\n362#1:517,2\n362#1:519\n362#1:520,3\n*E\n"})
        static final class y extends kotlin.coroutines.jvm.internal.o implements o {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;
            private Object p;
            final F q;
            final o r;

            y(F f0, o o0, d d0) {
                this.q = f0;
                this.r = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new y(this.q, this.r, d0);
                d1.p = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l D d0, @y4.m d d1) {
                return ((y)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                D d3;
                o o1;
                F f1;
                n n2;
                D d2;
                D d1;
                n n1;
                o o0;
                F f0;
                D d0;
                Object object1 = b.l();
            alab1:
                switch(this.o) {
                    case 0: {
                        f0.n(object0);
                        d0 = (D)this.p;
                        f0 = this.q;
                        n n0 = f0.iterator();
                        o0 = this.r;
                        n1 = n0;
                        goto label_29;
                    }
                    case 1: {
                        n1 = (n)this.m;
                        f0 = (F)this.l;
                        o0 = (o)this.k;
                        d1 = (D)this.p;
                        f0.n(object0);
                        goto label_39;
                    }
                    case 2: {
                        d2 = (D)this.n;
                        n2 = (n)this.m;
                        f1 = (F)this.l;
                        o1 = (o)this.k;
                        d3 = (D)this.p;
                        try {
                            f0.n(object0);
                            goto label_55;
                        }
                        catch(Throwable throwable0) {
                            f0 = f1;
                            throw throwable0;
                        }
                    }
                    case 3: {
                        n1 = (n)this.m;
                        f0 = (F)this.l;
                        o0 = (o)this.k;
                        D d4 = (D)this.p;
                        f0.n(object0);
                        d0 = d4;
                        while(true) {
                        label_29:
                            this.p = d0;
                            this.k = o0;
                            this.l = f0;
                            this.m = n1;
                            this.o = 1;
                            Object object2 = n1.b(this);
                            if(object2 == object1) {
                                return object1;
                            }
                            d1 = d0;
                            object0 = object2;
                        label_39:
                            if(!((Boolean)object0).booleanValue()) {
                                r.b(f0, null);
                                return S0.a;
                            }
                            Object object3 = n1.next();
                            this.p = d1;
                            this.k = o0;
                            this.l = f0;
                            this.m = n1;
                            this.n = d1;
                            this.o = 2;
                            object0 = o0.invoke(object3, this);
                            if(object0 == object1) {
                                break alab1;
                            }
                            goto label_50;
                        }
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return object1;
            label_50:
                d3 = d1;
                o1 = o0;
                f1 = f0;
                n2 = n1;
                d2 = d3;
                try {
                label_55:
                    this.p = d3;
                    this.k = o1;
                    this.l = f1;
                    this.m = n2;
                    this.n = null;
                    this.o = 3;
                    if(d2.I(object0, this) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    f0 = f1;
                    throw throwable0;
                }
                try {
                    n1 = n2;
                    f0 = f1;
                    o0 = o1;
                    d0 = d3;
                    goto label_29;
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
                r.b(f0, null);
                return S0.a;
            }
        }

        Function1 function10 = r.g(f0);
        y u$y0 = new y(f0, o0, null);
        return B.g(() -> i.a, g0, 0, null, function10, u$y0, 6, null);
    }

    public static F I(F f0, g g0, o o0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.g();
        }
        return r.J(f0, g0, o0);
    }

    @b0
    @l
    public static final F J(@l F f0, @l g g0, @l p p0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {374, 375, 375}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
        static final class z extends kotlin.coroutines.jvm.internal.o implements o {
            Object k;
            Object l;
            int m;
            int n;
            private Object o;
            final F p;
            final p q;

            z(F f0, p p0, d d0) {
                this.p = f0;
                this.q = p0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new z(this.p, this.q, d0);
                d1.o = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l D d0, @y4.m d d1) {
                return ((z)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                D d3;
                n n1;
                D d2;
                D d1;
                int v;
                n n0;
                D d0;
                Object object1 = b.l();
                switch(this.n) {
                    case 0: {
                        f0.n(object0);
                        d0 = (D)this.o;
                        n0 = this.p.iterator();
                        v = 0;
                        break;
                    }
                    case 1: {
                        v = this.m;
                        n0 = (n)this.k;
                        d1 = (D)this.o;
                        f0.n(object0);
                        goto label_33;
                    }
                    case 2: {
                        v = this.m;
                        d2 = (D)this.l;
                        n1 = (n)this.k;
                        d3 = (D)this.o;
                        f0.n(object0);
                        goto label_47;
                    }
                    case 3: {
                        v = this.m;
                        n0 = (n)this.k;
                        D d4 = (D)this.o;
                        f0.n(object0);
                        d0 = d4;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    this.o = d0;
                    this.k = n0;
                    this.m = v;
                    this.n = 1;
                    Object object2 = n0.b(this);
                    if(object2 == object1) {
                        return object1;
                    }
                    d1 = d0;
                    object0 = object2;
                label_33:
                    if(!((Boolean)object0).booleanValue()) {
                        break;
                    }
                    Object object3 = n0.next();
                    this.o = d1;
                    this.k = n0;
                    this.l = d1;
                    this.m = v + 1;
                    this.n = 2;
                    object0 = this.q.invoke(kotlin.coroutines.jvm.internal.b.f(v), object3, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    d3 = d1;
                    ++v;
                    n1 = n0;
                    d2 = d3;
                label_47:
                    this.o = d3;
                    this.k = n1;
                    this.l = null;
                    this.m = v;
                    this.n = 3;
                    if(d2.I(object0, this) == object1) {
                        return object1;
                    }
                    n0 = n1;
                    d0 = d3;
                }
                return S0.a;
            }
        }

        Function1 function10 = r.g(f0);
        z u$z0 = new z(f0, p0, null);
        return B.g(() -> i.a, g0, 0, null, function10, u$z0, 6, null);
    }

    public static F K(F f0, g g0, p p0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.g();
        }
        return r.L(f0, g0, p0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F L(F f0, g g0, p p0) {
        return r.y(r.L(f0, g0, p0));
    }

    public static F M(F f0, g g0, p p0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.g();
        }
        return u.L(f0, g0, p0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F N(F f0, g g0, o o0) {
        return r.y(r.J(f0, g0, o0));
    }

    public static F O(F f0, g g0, o o0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.g();
        }
        return u.N(f0, g0, o0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object P(F f0, Comparator comparator0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {450, 452}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
        static final class A extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            int p;

            A(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.o = object0;
                this.p |= 0x80000000;
                return u.P(null, null, this);
            }
        }

        Object object5;
        A u$A1;
        n n2;
        Comparator comparator2;
        Object object3;
        Comparator comparator1;
        n n1;
        F f1;
        Object object2;
        n n0;
        A u$A0;
        if(d0 instanceof A) {
            u$A0 = (A)d0;
            int v = u$A0.p;
            if((v & 0x80000000) == 0) {
                u$A0 = new A(d0);
            }
            else {
                u$A0.p = v ^ 0x80000000;
            }
        }
        else {
            u$A0 = new A(d0);
        }
        Object object0 = u$A0.o;
        Object object1 = b.l();
        switch(u$A0.p) {
            case 0: {
                f0.n(object0);
                try {
                    n0 = f0.iterator();
                    u$A0.k = comparator0;
                    u$A0.l = f0;
                    u$A0.m = n0;
                    u$A0.p = 1;
                    object2 = n0.b(u$A0);
                    if(object2 == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_71;
                }
                f1 = f0;
                n1 = n0;
                object0 = object2;
                comparator1 = comparator0;
                goto label_31;
            }
            case 1: {
                n1 = (n)u$A0.m;
                f1 = (F)u$A0.l;
                comparator1 = (Comparator)u$A0.k;
                f0.n(object0);
            label_31:
                if(((Boolean)object0).booleanValue()) {
                    object3 = n1.next();
                    comparator2 = comparator1;
                    n2 = n1;
                    f0 = f1;
                    goto label_58;
                }
                r.b(f1, null);
                return null;
            }
            case 2: {
                Object object4 = u$A0.n;
                n2 = (n)u$A0.m;
                F f2 = (F)u$A0.l;
                comparator2 = (Comparator)u$A0.k;
                try {
                    f0.n(object0);
                    u$A1 = u$A0;
                    object5 = object4;
                    f0 = f2;
                    break;
                }
                catch(Throwable throwable1) {
                    f1 = f2;
                    throw throwable1;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            while(true) {
                if(!((Boolean)object0).booleanValue()) {
                    goto label_77;
                }
                object3 = n2.next();
                if(comparator2.compare(object5, object3) >= 0) {
                    object3 = object5;
                }
                u$A0 = u$A1;
            label_58:
                u$A0.k = comparator2;
                u$A0.l = f0;
                u$A0.m = n2;
                u$A0.n = object3;
                u$A0.p = 2;
                Object object6 = n2.b(u$A0);
                if(object6 == object1) {
                    return object1;
                }
                u$A1 = u$A0;
                object5 = object3;
                object0 = object6;
            }
        }
        catch(Throwable throwable0) {
        label_71:
            f1 = f0;
            throwable1 = throwable0;
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            r.b(f1, throwable1);
            throw throwable2;
        }
    label_77:
        r.b(f0, null);
        return object5;
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object Q(F f0, Comparator comparator0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {0x1D0, 466}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
        static final class kotlinx.coroutines.channels.u.B extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            int p;

            kotlinx.coroutines.channels.u.B(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.o = object0;
                this.p |= 0x80000000;
                return u.Q(null, null, this);
            }
        }

        Object object5;
        kotlinx.coroutines.channels.u.B u$B1;
        n n2;
        Comparator comparator2;
        Object object3;
        Comparator comparator1;
        n n1;
        F f1;
        Object object2;
        n n0;
        kotlinx.coroutines.channels.u.B u$B0;
        if(d0 instanceof kotlinx.coroutines.channels.u.B) {
            u$B0 = (kotlinx.coroutines.channels.u.B)d0;
            int v = u$B0.p;
            if((v & 0x80000000) == 0) {
                u$B0 = new kotlinx.coroutines.channels.u.B(d0);
            }
            else {
                u$B0.p = v ^ 0x80000000;
            }
        }
        else {
            u$B0 = new kotlinx.coroutines.channels.u.B(d0);
        }
        Object object0 = u$B0.o;
        Object object1 = b.l();
        switch(u$B0.p) {
            case 0: {
                f0.n(object0);
                try {
                    n0 = f0.iterator();
                    u$B0.k = comparator0;
                    u$B0.l = f0;
                    u$B0.m = n0;
                    u$B0.p = 1;
                    object2 = n0.b(u$B0);
                    if(object2 == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_71;
                }
                f1 = f0;
                n1 = n0;
                object0 = object2;
                comparator1 = comparator0;
                goto label_31;
            }
            case 1: {
                n1 = (n)u$B0.m;
                f1 = (F)u$B0.l;
                comparator1 = (Comparator)u$B0.k;
                f0.n(object0);
            label_31:
                if(((Boolean)object0).booleanValue()) {
                    object3 = n1.next();
                    comparator2 = comparator1;
                    n2 = n1;
                    f0 = f1;
                    goto label_58;
                }
                r.b(f1, null);
                return null;
            }
            case 2: {
                Object object4 = u$B0.n;
                n2 = (n)u$B0.m;
                F f2 = (F)u$B0.l;
                comparator2 = (Comparator)u$B0.k;
                try {
                    f0.n(object0);
                    u$B1 = u$B0;
                    object5 = object4;
                    f0 = f2;
                    break;
                }
                catch(Throwable throwable1) {
                    f1 = f2;
                    throw throwable1;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            while(true) {
                if(!((Boolean)object0).booleanValue()) {
                    goto label_77;
                }
                object3 = n2.next();
                if(comparator2.compare(object5, object3) <= 0) {
                    object3 = object5;
                }
                u$B0 = u$B1;
            label_58:
                u$B0.k = comparator2;
                u$B0.l = f0;
                u$B0.m = n2;
                u$B0.n = object3;
                u$B0.p = 2;
                Object object6 = n2.b(u$B0);
                if(object6 == object1) {
                    return object1;
                }
                u$B1 = u$B0;
                object5 = object3;
                object0 = object6;
            }
        }
        catch(Throwable throwable0) {
        label_71:
            f1 = f0;
            throwable1 = throwable0;
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            r.b(f1, throwable1);
            throw throwable2;
        }
    label_77:
        r.b(f0, null);
        return object5;
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object R(F f0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {477}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
        static final class C extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            C(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return u.R(null, this);
            }
        }

        Boolean boolean0;
        C u$C0;
        if(d0 instanceof C) {
            u$C0 = (C)d0;
            int v = u$C0.m;
            if((v & 0x80000000) == 0) {
                u$C0 = new C(d0);
            }
            else {
                u$C0.m = v ^ 0x80000000;
            }
        }
        else {
            u$C0 = new C(d0);
        }
        Object object0 = u$C0.l;
        Object object1 = b.l();
        switch(u$C0.m) {
            case 0: {
                f0.n(object0);
                try {
                    n n0 = f0.iterator();
                    u$C0.k = f0;
                    u$C0.m = 1;
                    object0 = n0.b(u$C0);
                    if(object0 == object1) {
                        return object1;
                    }
                    boolean0 = kotlin.coroutines.jvm.internal.b.a(!((Boolean)object0).booleanValue());
                    goto label_27;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                f0 = (F)u$C0.k;
                try {
                    f0.n(object0);
                    boolean0 = kotlin.coroutines.jvm.internal.b.a(!((Boolean)object0).booleanValue());
                    goto label_27;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        r.b(f0, throwable0);
        throw throwable0;
    label_27:
        r.b(f0, null);
        return boolean0;
    }

    @k(level = m.c, message = "Left for binary compatibility")
    public static final F S(F f0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class kotlinx.coroutines.channels.u.D extends kotlin.coroutines.jvm.internal.o implements o {
            int k;
            Object l;
            final F m;

            kotlinx.coroutines.channels.u.D(F f0, d d0) {
                this.m = f0;
                super(2, d0);
            }

            @y4.m
            public final Object a(@y4.m Object object0, @y4.m d d0) {
                return ((kotlinx.coroutines.channels.u.D)this.create(object0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.channels.u.D(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(object0, ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                Object object1 = this.l;
                if(object1 == null) {
                    throw new IllegalArgumentException("null element found in " + this.m + '.');
                }
                return object1;
            }
        }

        return u.I(f0, null, new kotlinx.coroutines.channels.u.D(f0, null), 1, null);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object T(F f0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {0xA6, 0xA9}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
        static final class E extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            int n;

            E(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.m = object0;
                this.n |= 0x80000000;
                return u.T(null, this);
            }
        }

        Object object5;
        F f2;
        Object object4;
        Object object3;
        n n1;
        Throwable throwable1;
        F f1;
        Object object2;
        n n0;
        E u$E0;
        if(d0 instanceof E) {
            u$E0 = (E)d0;
            int v = u$E0.n;
            if((v & 0x80000000) == 0) {
                u$E0 = new E(d0);
            }
            else {
                u$E0.n = v ^ 0x80000000;
            }
        }
        else {
            u$E0 = new E(d0);
        }
        Object object0 = u$E0.m;
        Object object1 = b.l();
        switch(u$E0.n) {
            case 0: {
                f0.n(object0);
                try {
                    n0 = f0.iterator();
                    u$E0.k = f0;
                    u$E0.l = n0;
                    u$E0.n = 1;
                    object2 = n0.b(u$E0);
                }
                catch(Throwable throwable0) {
                    f1 = f0;
                    throwable1 = throwable0;
                    throw throwable1;
                }
                if(object2 == object1) {
                    return object1;
                }
                f1 = f0;
                n1 = n0;
                object0 = object2;
                goto label_33;
            }
            case 1: {
                n1 = (n)u$E0.l;
                f1 = (F)u$E0.k;
                f0.n(object0);
            label_33:
                if(!((Boolean)object0).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                object3 = n1.next();
                u$E0.k = f1;
                u$E0.l = object3;
                u$E0.n = 2;
                object4 = n1.b(u$E0);
                if(object4 == object1) {
                    return object1;
                }
                f2 = f1;
                object0 = object4;
                object5 = object3;
                goto label_52;
            }
            case 2: {
                object5 = u$E0.l;
                f2 = (F)u$E0.k;
                try {
                    f0.n(object0);
                label_52:
                    if(((Boolean)object0).booleanValue()) {
                        throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                    }
                    goto label_60;
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
    label_60:
        r.b(f2, null);
        return object5;
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object U(F f0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {0xB3, 0xB6}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
        static final class kotlinx.coroutines.channels.u.F extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            int n;

            kotlinx.coroutines.channels.u.F(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.m = object0;
                this.n |= 0x80000000;
                return u.U(null, this);
            }
        }

        Object object5;
        F f2;
        Object object4;
        Object object3;
        n n1;
        Throwable throwable1;
        F f1;
        Object object2;
        n n0;
        kotlinx.coroutines.channels.u.F u$F0;
        if(d0 instanceof kotlinx.coroutines.channels.u.F) {
            u$F0 = (kotlinx.coroutines.channels.u.F)d0;
            int v = u$F0.n;
            if((v & 0x80000000) == 0) {
                u$F0 = new kotlinx.coroutines.channels.u.F(d0);
            }
            else {
                u$F0.n = v ^ 0x80000000;
            }
        }
        else {
            u$F0 = new kotlinx.coroutines.channels.u.F(d0);
        }
        Object object0 = u$F0.m;
        Object object1 = b.l();
        switch(u$F0.n) {
            case 0: {
                f0.n(object0);
                try {
                    n0 = f0.iterator();
                    u$F0.k = f0;
                    u$F0.l = n0;
                    u$F0.n = 1;
                    object2 = n0.b(u$F0);
                }
                catch(Throwable throwable0) {
                    f1 = f0;
                    throwable1 = throwable0;
                    throw throwable1;
                }
                if(object2 == object1) {
                    return object1;
                }
                f1 = f0;
                n1 = n0;
                object0 = object2;
                goto label_33;
            }
            case 1: {
                n1 = (n)u$F0.l;
                f1 = (F)u$F0.k;
                f0.n(object0);
            label_33:
                if(((Boolean)object0).booleanValue()) {
                    object3 = n1.next();
                    u$F0.k = f1;
                    u$F0.l = object3;
                    u$F0.n = 2;
                    object4 = n1.b(u$F0);
                }
                else {
                    r.b(f1, null);
                    return null;
                }
                if(object4 == object1) {
                    return object1;
                }
                f2 = f1;
                object0 = object4;
                object5 = object3;
                goto label_53;
            }
            case 2: {
                object5 = u$F0.l;
                f2 = (F)u$F0.k;
                try {
                    f0.n(object0);
                label_53:
                    if(((Boolean)object0).booleanValue()) {
                        goto label_61;
                    }
                    goto label_63;
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
    label_61:
        r.b(f2, null);
        return null;
    label_63:
        r.b(f2, null);
        return object5;
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F V(F f0, int v, g g0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {284, 285}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
        @s0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$take$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
        static final class G extends kotlin.coroutines.jvm.internal.o implements o {
            Object k;
            int l;
            int m;
            private Object n;
            final int o;
            final F p;

            G(int v, F f0, d d0) {
                this.o = v;
                this.p = f0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new G(this.o, this.p, d0);
                d1.n = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l D d0, @y4.m d d1) {
                return ((G)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                D d1;
                n n0;
                int v;
                D d0;
                Object object1 = b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        d0 = (D)this.n;
                        v = this.o;
                        if(v == 0) {
                            return S0.a;
                        }
                        if(v < 0) {
                            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
                        }
                        n0 = this.p.iterator();
                        goto label_25;
                    }
                    case 1: {
                        v = this.l;
                        n0 = (n)this.k;
                        d1 = (D)this.n;
                        f0.n(object0);
                        goto label_34;
                    }
                    case 2: {
                        v = this.l;
                        n0 = (n)this.k;
                        d1 = (D)this.n;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    d0 = d1;
                    --v;
                    if(v == 0) {
                        return S0.a;
                    }
                label_25:
                    this.n = d0;
                    this.k = n0;
                    this.l = v;
                    this.m = 1;
                    Object object2 = n0.b(this);
                    if(object2 == object1) {
                        return object1;
                    }
                    d1 = d0;
                    object0 = object2;
                label_34:
                    if(!((Boolean)object0).booleanValue()) {
                        break;
                    }
                    Object object3 = n0.next();
                    this.n = d1;
                    this.k = n0;
                    this.l = v;
                    this.m = 2;
                    if(d1.I(object3, this) != object1) {
                        continue;
                    }
                    return object1;
                }
                return S0.a;
            }
        }

        Function1 function10 = r.g(f0);
        G u$G0 = new G(v, f0, null);
        return B.g(() -> i.a, g0, 0, null, function10, u$G0, 6, null);
    }

    public static F W(F f0, int v, g g0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            g0 = h0.g();
        }
        return u.V(f0, v, g0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F X(F f0, g g0, o o0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {299, 300, 301}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
        static final class H extends kotlin.coroutines.jvm.internal.o implements o {
            Object k;
            Object l;
            int m;
            private Object n;
            final F o;
            final o p;

            H(F f0, o o0, d d0) {
                this.o = f0;
                this.p = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new H(this.o, this.p, d0);
                d1.n = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l D d0, @y4.m d d1) {
                return ((H)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                D d2;
                n n1;
                Object object2;
                D d1;
                n n0;
                Object object1 = b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.n;
                        n0 = this.o.iterator();
                        d1 = d0;
                        break;
                    }
                    case 1: {
                        n0 = (n)this.k;
                        d1 = (D)this.n;
                        f0.n(object0);
                        goto label_26;
                    }
                    case 2: {
                        object2 = this.l;
                        n1 = (n)this.k;
                        d2 = (D)this.n;
                        f0.n(object0);
                        goto label_39;
                    }
                    case 3: {
                        n0 = (n)this.k;
                        d1 = (D)this.n;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    this.n = d1;
                    this.k = n0;
                    this.m = 1;
                    object0 = n0.b(this);
                    if(object0 == object1) {
                        return object1;
                    }
                label_26:
                    if(!((Boolean)object0).booleanValue()) {
                        break;
                    }
                    Object object3 = n0.next();
                    this.n = d1;
                    this.k = n0;
                    this.l = object3;
                    this.m = 2;
                    Object object4 = this.p.invoke(object3, this);
                    if(object4 == object1) {
                        return object1;
                    }
                    object2 = object3;
                    object0 = object4;
                    d2 = d1;
                    n1 = n0;
                label_39:
                    if(!((Boolean)object0).booleanValue()) {
                        return S0.a;
                    }
                    this.n = d2;
                    this.k = n1;
                    this.l = null;
                    this.m = 3;
                    if(d2.I(object2, this) == object1) {
                        return object1;
                    }
                    n0 = n1;
                    d1 = d2;
                }
                return S0.a;
            }
        }

        Function1 function10 = r.g(f0);
        H u$H0 = new H(f0, o0, null);
        return B.g(() -> i.a, g0, 0, null, function10, u$H0, 6, null);
    }

    public static F Y(F f0, g g0, o o0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.g();
        }
        return u.X(f0, g0, o0);
    }

    @b0
    @y4.m
    public static final Object Z(@l F f0, @l kotlinx.coroutines.channels.G g0, @l d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {0x205, 308}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
        static final class I extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;

            I(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return r.e0(null, null, this);
            }
        }

        Object object2;
        kotlinx.coroutines.channels.G g1;
        F f1;
        n n1;
        n n0;
        I u$I0;
        if(d0 instanceof I) {
            u$I0 = (I)d0;
            int v = u$I0.o;
            if((v & 0x80000000) == 0) {
                u$I0 = new I(d0);
            }
            else {
                u$I0.o = v ^ 0x80000000;
            }
        }
        else {
            u$I0 = new I(d0);
        }
        Object object0 = u$I0.n;
        Object object1 = b.l();
        switch(u$I0.o) {
            case 0: {
                f0.n(object0);
                try {
                    n0 = f0.iterator();
                    goto label_28;
                }
                catch(Throwable throwable0) {
                    goto label_35;
                }
            }
            case 1: {
                n1 = (n)u$I0.m;
                f1 = (F)u$I0.l;
                g1 = (kotlinx.coroutines.channels.G)u$I0.k;
                f0.n(object0);
                goto label_44;
            }
            case 2: {
                n1 = (n)u$I0.m;
                f1 = (F)u$I0.l;
                g1 = (kotlinx.coroutines.channels.G)u$I0.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            n0 = n1;
            f0 = f1;
            g0 = g1;
            try {
            label_28:
                u$I0.k = g0;
                u$I0.l = f0;
                u$I0.m = n0;
                u$I0.o = 1;
                object2 = n0.b(u$I0);
            }
            catch(Throwable throwable0) {
            label_35:
                f1 = f0;
                throwable1 = throwable0;
                break;
            }
            if(object2 == object1) {
                return object1;
            }
            f1 = f0;
            n1 = n0;
            object0 = object2;
            g1 = g0;
            try {
            label_44:
                if(!((Boolean)object0).booleanValue()) {
                    goto label_57;
                }
                Object object3 = n1.next();
                u$I0.k = g1;
                u$I0.l = f1;
                u$I0.m = n1;
                u$I0.o = 2;
                if(g1.I(object3, u$I0) != object1) {
                    continue;
                }
                return object1;
            }
            catch(Throwable throwable1) {
                break;
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            r.b(f1, throwable1);
            throw throwable2;
        }
    label_57:
        r.b(f1, null);
        return g1;
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object a(F f0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {434}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            a(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return u.a(null, this);
            }
        }

        a u$a0;
        if(d0 instanceof a) {
            u$a0 = (a)d0;
            int v = u$a0.m;
            if((v & 0x80000000) == 0) {
                u$a0 = new a(d0);
            }
            else {
                u$a0.m = v ^ 0x80000000;
            }
        }
        else {
            u$a0 = new a(d0);
        }
        Object object0 = u$a0.l;
        Object object1 = b.l();
        switch(u$a0.m) {
            case 0: {
                f0.n(object0);
                try {
                    n n0 = f0.iterator();
                    u$a0.k = f0;
                    u$a0.m = 1;
                    object0 = n0.b(u$a0);
                    if(object0 == object1) {
                        return object1;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    r.b(f0, throwable0);
                    throw throwable0;
                }
            }
            case 1: {
                f0 = (F)u$a0.k;
                try {
                    f0.n(object0);
                    break;
                }
                catch(Throwable throwable0) {
                    r.b(f0, throwable0);
                    throw throwable0;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        r.b(f0, null);
        return object0;
    }

    @b0
    @y4.m
    public static final Object a0(@l F f0, @l Collection collection0, @l d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {0x205}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
        static final class J extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;

            J(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return r.f0(null, null, this);
            }
        }

        Collection collection2;
        Throwable throwable1;
        Collection collection1;
        n n0;
        F f1;
        J u$J0;
        if(d0 instanceof J) {
            u$J0 = (J)d0;
            int v = u$J0.o;
            if((v & 0x80000000) == 0) {
                u$J0 = new J(d0);
            }
            else {
                u$J0.o = v ^ 0x80000000;
            }
        }
        else {
            u$J0 = new J(d0);
        }
        Object object0 = u$J0.n;
        Object object1 = b.l();
        switch(u$J0.o) {
            case 0: {
                f0.n(object0);
                try {
                    f1 = f0;
                    n0 = f0.iterator();
                    collection1 = collection0;
                    goto label_28;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                n0 = (n)u$J0.m;
                f1 = (F)u$J0.l;
                collection2 = (Collection)u$J0.k;
                try {
                    f0.n(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_43;
                        }
                        collection2.add(n0.next());
                        collection1 = collection2;
                    label_28:
                        u$J0.k = collection1;
                        u$J0.l = f1;
                        u$J0.m = n0;
                        u$J0.o = 1;
                        Object object2 = n0.b(u$J0);
                        if(object2 == object1) {
                            return object1;
                        }
                        collection2 = collection1;
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
        return collection2;
    }

    @k(level = m.b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @Z0
    public static final Object b(@l kotlinx.coroutines.channels.d d0, @l Function1 function10) {
        F f0 = d0.g();
        try {
            return function10.invoke(f0);
        }
        finally {
            kotlinx.coroutines.channels.F.a.b(f0, null, 1, null);
        }
    }

    @b0
    @y4.m
    public static final Object b0(@l F f0, @l Map map0, @l d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {0x205}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
        static final class K extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;

            K(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return r.h0(null, null, this);
            }
        }

        Map map2;
        Throwable throwable1;
        Map map1;
        n n0;
        F f1;
        K u$K0;
        if(d0 instanceof K) {
            u$K0 = (K)d0;
            int v = u$K0.o;
            if((v & 0x80000000) == 0) {
                u$K0 = new K(d0);
            }
            else {
                u$K0.o = v ^ 0x80000000;
            }
        }
        else {
            u$K0 = new K(d0);
        }
        Object object0 = u$K0.n;
        Object object1 = b.l();
        switch(u$K0.o) {
            case 0: {
                f0.n(object0);
                try {
                    f1 = f0;
                    n0 = f0.iterator();
                    map1 = map0;
                    goto label_29;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                n0 = (n)u$K0.m;
                f1 = (F)u$K0.l;
                map2 = (Map)u$K0.k;
                try {
                    f0.n(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_44;
                        }
                        V v1 = (V)n0.next();
                        map2.put(v1.e(), v1.f());
                        map1 = map2;
                    label_29:
                        u$K0.k = map1;
                        u$K0.l = f1;
                        u$K0.m = n0;
                        u$K0.o = 1;
                        Object object2 = n0.b(u$K0);
                        if(object2 == object1) {
                            return object1;
                        }
                        map2 = map1;
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
    label_44:
        r.b(f1, null);
        return map2;
    }

    @k(level = m.b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @y4.m
    public static final Object c(@l kotlinx.coroutines.channels.d d0, @l Function1 function10, @l d d1) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {41}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
        @s0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumeEach$1\n*L\n1#1,509:1\n*E\n"})
        static final class kotlinx.coroutines.channels.u.b extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;

            kotlinx.coroutines.channels.u.b(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return u.c(null, null, this);
            }
        }

        Object object2;
        F f3;
        kotlinx.coroutines.channels.u.b u$b1;
        Throwable throwable1;
        F f2;
        n n0;
        F f1;
        kotlinx.coroutines.channels.u.b u$b0;
        if(d1 instanceof kotlinx.coroutines.channels.u.b) {
            u$b0 = (kotlinx.coroutines.channels.u.b)d1;
            int v = u$b0.o;
            if((v & 0x80000000) == 0) {
                u$b0 = new kotlinx.coroutines.channels.u.b(d1);
            }
            else {
                u$b0.o = v ^ 0x80000000;
            }
        }
        else {
            u$b0 = new kotlinx.coroutines.channels.u.b(d1);
        }
        Object object0 = u$b0.n;
        Object object1 = b.l();
        switch(u$b0.o) {
            case 0: {
                f0.n(object0);
                F f0 = d0.g();
                try {
                    f1 = f0;
                    n0 = f0.iterator();
                    goto label_41;
                }
                catch(Throwable throwable0) {
                    f2 = f0;
                    throwable1 = throwable0;
                    kotlinx.coroutines.channels.F.a.b(f2, null, 1, null);
                    throw throwable1;
                }
            }
            case 1: {
                n0 = (n)u$b0.m;
                f2 = (F)u$b0.l;
                Function1 function11 = (Function1)u$b0.k;
                try {
                    f0.n(object0);
                    u$b1 = u$b0;
                    f3 = f2;
                    function10 = function11;
                    break;
                }
                catch(Throwable throwable1) {
                }
                kotlinx.coroutines.channels.F.a.b(f2, null, 1, null);
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            try {
                if(!((Boolean)object0).booleanValue()) {
                    break;
                }
                function10.invoke(n0.next());
                f1 = f3;
                u$b0 = u$b1;
            }
            catch(Throwable throwable1) {
                f2 = f3;
                kotlinx.coroutines.channels.F.a.b(f2, null, 1, null);
                throw throwable1;
            }
            try {
            label_41:
                u$b0.k = function10;
                u$b0.l = f1;
                u$b0.m = n0;
                u$b0.o = 1;
                object2 = n0.b(u$b0);
            }
            catch(Throwable throwable1) {
                f2 = f1;
                kotlinx.coroutines.channels.F.a.b(f2, null, 1, null);
                throw throwable1;
            }
            if(object2 == object1) {
                return object1;
            }
            u$b1 = u$b0;
            f3 = f1;
            object0 = object2;
        }
        kotlinx.coroutines.channels.F.a.b(f3, null, 1, null);
        return S0.a;
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object c0(F f0, d d0) {
        return r.h0(f0, new LinkedHashMap(), d0);
    }

    @k(level = m.b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    private static final Object d(kotlinx.coroutines.channels.d d0, Function1 function10, d d1) {
        F f0 = d0.g();
        try {
            n n0 = f0.iterator();
            while(((Boolean)n0.b(null)).booleanValue()) {
                function10.invoke(n0.next());
            }
            return S0.a;
        }
        finally {
            kotlinx.coroutines.channels.F.a.b(f0, null, 1, null);
        }
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object d0(F f0, d d0) {
        return r.f0(f0, new ArrayList(), d0);
    }

    @b0
    @l
    public static final Function1 e(@l F f0) {
        static final class c extends N implements Function1 {
            final F e;

            c(F f0) {
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

        return new c(f0);
    }

    @b0
    @y4.m
    public static final Object e0(@l F f0, @l d d0) {
        return r.f0(f0, new LinkedHashSet(), d0);
    }

    @b0
    @l
    public static final Function1 f(@l F[] arr_f) {
        @s0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumesAll$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
        static final class kotlinx.coroutines.channels.u.d extends N implements Function1 {
            final F[] e;

            kotlinx.coroutines.channels.u.d(F[] arr_f) {
                this.e = arr_f;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@y4.m Throwable throwable0) {
                F[] arr_f = this.e;
                Throwable throwable1 = null;
                for(int v = 0; v < arr_f.length; ++v) {
                    F f0 = arr_f[v];
                    try {
                        r.b(f0, throwable0);
                    }
                    catch(Throwable throwable2) {
                        if(throwable1 == null) {
                            throwable1 = throwable2;
                        }
                        else {
                            kotlin.o.a(throwable1, throwable2);
                        }
                    }
                }
                if(throwable1 != null) {
                    throw throwable1;
                }
            }
        }

        return new kotlinx.coroutines.channels.u.d(arr_f);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object g(F f0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {0x205}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
        static final class e extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;

            e(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return u.g(null, this);
            }
        }

        Object object2;
        Throwable throwable1;
        F f2;
        n n0;
        F f1;
        kotlin.jvm.internal.l0.f l0$f1;
        e u$e0;
        if(d0 instanceof e) {
            u$e0 = (e)d0;
            int v = u$e0.o;
            if((v & 0x80000000) == 0) {
                u$e0 = new e(d0);
            }
            else {
                u$e0.o = v ^ 0x80000000;
            }
        }
        else {
            u$e0 = new e(d0);
        }
        Object object0 = u$e0.n;
        Object object1 = b.l();
    alab1:
        switch(u$e0.o) {
            case 0: {
                f0.n(object0);
                kotlin.jvm.internal.l0.f l0$f0 = new kotlin.jvm.internal.l0.f();
                try {
                    l0$f1 = l0$f0;
                    f1 = f0;
                    n0 = f0.iterator();
                    goto label_31;
                }
                catch(Throwable throwable0) {
                    f2 = f0;
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                n0 = (n)u$e0.m;
                f2 = (F)u$e0.l;
                l0$f1 = (kotlin.jvm.internal.l0.f)u$e0.k;
                try {
                    f0.n(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_50;
                        }
                        n0.next();
                        ++l0$f1.a;
                        f1 = f2;
                        try {
                        label_31:
                            u$e0.k = l0$f1;
                            u$e0.l = f1;
                            u$e0.m = n0;
                            u$e0.o = 1;
                            object2 = n0.b(u$e0);
                        }
                        catch(Throwable throwable1) {
                            f2 = f1;
                            break alab1;
                        }
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
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            r.b(f2, throwable1);
            throw throwable2;
        }
    label_50:
        r.b(f2, null);
        return kotlin.coroutines.jvm.internal.b.f(l0$f1.a);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F g0(F f0, g g0) {
        Function1 function10 = r.g(f0);
        u.L u$L0 = new u.L(f0, null);
        return B.g(() -> i.a, g0, 0, null, function10, u$L0, 6, null);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F h(F f0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class kotlinx.coroutines.channels.u.f extends kotlin.coroutines.jvm.internal.o implements o {
            int k;
            Object l;

            kotlinx.coroutines.channels.u.f(d d0) {
                super(2, d0);
            }

            @y4.m
            public final Object a(Object object0, @y4.m d d0) {
                return ((kotlinx.coroutines.channels.u.f)this.create(object0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.channels.u.f(d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(object0, ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return this.l;
            }
        }

        return u.j(f0, null, new kotlinx.coroutines.channels.u.f(null), 1, null);
    }

    public static F h0(F f0, g g0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.g();
        }
        return u.g0(f0, g0);
    }

    @b0
    @l
    public static final F i(@l F f0, @l g g0, @l o o0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {417, 418, 420}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
        static final class kotlinx.coroutines.channels.u.g extends kotlin.coroutines.jvm.internal.o implements o {
            Object k;
            Object l;
            Object m;
            int n;
            private Object o;
            final F p;
            final o q;

            kotlinx.coroutines.channels.u.g(F f0, o o0, d d0) {
                this.p = f0;
                this.q = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.channels.u.g(this.p, this.q, d0);
                d1.o = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l D d0, @y4.m d d1) {
                return ((kotlinx.coroutines.channels.u.g)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                n n2;
                Object object4;
                Object object3;
                D d1;
                HashSet hashSet1;
                n n0;
                HashSet hashSet0;
                D d0;
                Object object1 = b.l();
                switch(this.n) {
                    case 0: {
                        f0.n(object0);
                        d0 = (D)this.o;
                        hashSet0 = new HashSet();
                        n0 = this.p.iterator();
                        goto label_30;
                    }
                    case 1: {
                        n0 = (n)this.l;
                        hashSet0 = (HashSet)this.k;
                        d0 = (D)this.o;
                        f0.n(object0);
                        goto label_38;
                    }
                    case 2: {
                        Object object2 = this.m;
                        n n1 = (n)this.l;
                        hashSet1 = (HashSet)this.k;
                        d1 = (D)this.o;
                        f0.n(object0);
                        object3 = object2;
                        n0 = n1;
                        goto label_52;
                    }
                    case 3: {
                        object4 = this.m;
                        n2 = (n)this.l;
                        hashSet1 = (HashSet)this.k;
                        d1 = (D)this.o;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            alab1:
                while(true) {
                    hashSet1.add(object4);
                    n0 = n2;
                    while(true) {
                        hashSet0 = hashSet1;
                        d0 = d1;
                    label_30:
                        this.o = d0;
                        this.k = hashSet0;
                        this.l = n0;
                        this.m = null;
                        this.n = 1;
                        object0 = n0.b(this);
                        if(object0 == object1) {
                            return object1;
                        }
                    label_38:
                        if(!((Boolean)object0).booleanValue()) {
                            break alab1;
                        }
                        Object object5 = n0.next();
                        this.o = d0;
                        this.k = hashSet0;
                        this.l = n0;
                        this.m = object5;
                        this.n = 2;
                        Object object6 = this.q.invoke(object5, this);
                        if(object6 == object1) {
                            return object1;
                        }
                        object3 = object5;
                        object0 = object6;
                        d1 = d0;
                        hashSet1 = hashSet0;
                    label_52:
                        if(!hashSet1.contains(object0)) {
                            this.o = d1;
                            this.k = hashSet1;
                            this.l = n0;
                            this.m = object0;
                            this.n = 3;
                            if(d1.I(object3, this) == object1) {
                                return object1;
                            }
                            n2 = n0;
                            object4 = object0;
                            break;
                        }
                    }
                }
                return S0.a;
            }
        }

        Function1 function10 = r.g(f0);
        kotlinx.coroutines.channels.u.g u$g0 = new kotlinx.coroutines.channels.u.g(f0, o0, null);
        return B.g(() -> i.a, g0, 0, null, function10, u$g0, 6, null);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F i0(F f0, F f1) {
        static final class M extends N implements o {
            public static final M e;

            static {
                M.e = new M();
            }

            M() {
                super(2);
            }

            @l
            public final V a(Object object0, Object object1) {
                return r0.a(object0, object1);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(object0, object1);
            }
        }

        return u.k0(f0, f1, null, M.e, 2, null);
    }

    public static F j(F f0, g g0, o o0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.g();
        }
        return r.k(f0, g0, o0);
    }

    @b0
    @l
    public static final F j0(@l F f0, @l F f1, @l g g0, @l o o0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {0x205, 0x1F3, 501}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
        @s0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,509:1\n81#2:510\n58#2,6:511\n82#2,2:517\n68#2:519\n64#2,3:520\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n*L\n498#1:510\n498#1:511,6\n498#1:517,2\n498#1:519\n498#1:520,3\n*E\n"})
        static final class kotlinx.coroutines.channels.u.N extends kotlin.coroutines.jvm.internal.o implements o {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            int p;
            private Object q;
            final F r;
            final F s;
            final o t;

            kotlinx.coroutines.channels.u.N(F f0, F f1, o o0, d d0) {
                this.r = f0;
                this.s = f1;
                this.t = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.channels.u.N(this.r, this.s, this.t, d0);
                d1.q = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l D d0, @y4.m d d1) {
                return ((kotlinx.coroutines.channels.u.N)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object5;
                Object object4;
                Object object3;
                D d2;
                n n4;
                o o1;
                F f1;
                n n2;
                n n1;
                D d1;
                o o0;
                F f0;
                Object object1 = b.l();
                switch(this.p) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.q;
                        n n0 = this.r.iterator();
                        f0 = this.s;
                        o0 = this.t;
                        try {
                            d1 = d0;
                            n1 = n0;
                            n2 = f0.iterator();
                            goto label_35;
                        }
                        catch(Throwable throwable0) {
                            break;
                        }
                    }
                    case 1: {
                        n2 = (n)this.n;
                        f0 = (F)this.m;
                        o0 = (o)this.l;
                        n1 = (n)this.k;
                        d1 = (D)this.q;
                        try {
                            f0.n(object0);
                            goto label_45;
                        }
                        catch(Throwable throwable0) {
                            break;
                        }
                    }
                    case 2: {
                        Object object2 = this.o;
                        n n3 = (n)this.n;
                        f1 = (F)this.m;
                        o1 = (o)this.l;
                        n4 = (n)this.k;
                        d2 = (D)this.q;
                        try {
                            f0.n(object0);
                            object3 = object2;
                            n2 = n3;
                            goto label_66;
                        }
                        catch(Throwable throwable0) {
                            goto label_83;
                        }
                    }
                    case 3: {
                        n2 = (n)this.n;
                        f0 = (F)this.m;
                        o0 = (o)this.l;
                        n1 = (n)this.k;
                        d1 = (D)this.q;
                        try {
                            f0.n(object0);
                            while(true) {
                            label_35:
                                this.q = d1;
                                this.k = n1;
                                this.l = o0;
                                this.m = f0;
                                this.n = n2;
                                this.o = null;
                                this.p = 1;
                                object0 = n2.b(this);
                                if(object0 == object1) {
                                    return object1;
                                }
                            label_45:
                                if(!((Boolean)object0).booleanValue()) {
                                    goto label_88;
                                }
                                object4 = n2.next();
                                this.q = d1;
                                this.k = n1;
                                this.l = o0;
                                this.m = f0;
                                this.n = n2;
                                this.o = object4;
                                this.p = 2;
                                object5 = n1.b(this);
                                goto label_58;
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
                throw throwable0;
            label_58:
                if(object5 == object1) {
                    return object1;
                }
                object3 = object4;
                object0 = object5;
                d2 = d1;
                n4 = n1;
                o1 = o0;
                f1 = f0;
                try {
                label_66:
                    if(((Boolean)object0).booleanValue()) {
                        Object object6 = o1.invoke(object3, n4.next());
                        this.q = d2;
                        this.k = n4;
                        this.l = o1;
                        this.m = f1;
                        this.n = n2;
                        this.o = null;
                        this.p = 3;
                        if(d2.I(object6, this) == object1) {
                            return object1;
                        }
                    }
                    f0 = f1;
                    o0 = o1;
                    n1 = n4;
                    d1 = d2;
                    goto label_35;
                }
                catch(Throwable throwable0) {
                label_83:
                    f0 = f1;
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable1) {
                    r.b(f0, throwable0);
                    throw throwable1;
                }
            label_88:
                r.b(f0, null);
                return S0.a;
            }
        }

        Function1 function10 = r.h(new F[]{f0, f1});
        kotlinx.coroutines.channels.u.N u$N0 = new kotlinx.coroutines.channels.u.N(f1, f0, o0, null);
        return B.g(() -> i.a, g0, 0, null, function10, u$N0, 6, null);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F k(F f0, int v, g g0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {0xC2, 0xC7, 200}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
        @s0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$drop$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
        static final class h extends kotlin.coroutines.jvm.internal.o implements o {
            Object k;
            int l;
            int m;
            private Object n;
            final int o;
            final F p;

            h(int v, F f0, d d0) {
                this.o = v;
                this.p = f0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new h(this.o, this.p, d0);
                d1.n = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l D d0, @y4.m d d1) {
                return ((h)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                D d2;
                n n1;
                D d1;
                n n0;
                int v;
                D d0;
                Object object1 = b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        d0 = (D)this.n;
                        v = this.o;
                        if(v < 0) {
                            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
                        }
                        if(v > 0) {
                            n0 = this.p.iterator();
                            d1 = d0;
                            goto label_20;
                        }
                        n1 = this.p.iterator();
                        goto label_38;
                    }
                    case 1: {
                        v = this.l;
                        n0 = (n)this.k;
                        d1 = (D)this.n;
                        f0.n(object0);
                        while(((Boolean)object0).booleanValue()) {
                            n0.next();
                            --v;
                            if(v == 0) {
                                break;
                            }
                        label_20:
                            this.n = d1;
                            this.k = n0;
                            this.l = v;
                            this.m = 1;
                            object0 = n0.b(this);
                            if(object0 != object1) {
                                continue;
                            }
                            return object1;
                        }
                        d0 = d1;
                        n1 = this.p.iterator();
                        goto label_38;
                    }
                    case 2: {
                        n1 = (n)this.k;
                        d2 = (D)this.n;
                        f0.n(object0);
                        goto label_46;
                    }
                    case 3: {
                        n1 = (n)this.k;
                        d2 = (D)this.n;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    d0 = d2;
                label_38:
                    this.n = d0;
                    this.k = n1;
                    this.m = 2;
                    Object object2 = n1.b(this);
                    if(object2 == object1) {
                        return object1;
                    }
                    d2 = d0;
                    object0 = object2;
                label_46:
                    if(!((Boolean)object0).booleanValue()) {
                        break;
                    }
                    Object object3 = n1.next();
                    this.n = d2;
                    this.k = n1;
                    this.m = 3;
                    if(d2.I(object3, this) != object1) {
                        continue;
                    }
                    return object1;
                }
                return S0.a;
            }
        }

        Function1 function10 = r.g(f0);
        h u$h0 = new h(v, f0, null);
        return B.g(() -> i.a, g0, 0, null, function10, u$h0, 6, null);
    }

    public static F k0(F f0, F f1, g g0, o o0, int v, Object object0) {
        if((v & 2) != 0) {
            g0 = h0.g();
        }
        return r.q0(f0, f1, g0, o0);
    }

    public static F l(F f0, int v, g g0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            g0 = h0.g();
        }
        return u.k(f0, v, g0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F m(F f0, g g0, o o0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {0xD3, 0xD4, 0xD5, 0xD9, 0xDA}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
        static final class kotlinx.coroutines.channels.u.i extends kotlin.coroutines.jvm.internal.o implements o {
            Object k;
            Object l;
            int m;
            private Object n;
            final F o;
            final o p;

            kotlinx.coroutines.channels.u.i(F f0, o o0, d d0) {
                this.o = f0;
                this.p = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.channels.u.i(this.o, this.p, d0);
                d1.n = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l D d0, @y4.m d d1) {
                return ((kotlinx.coroutines.channels.u.i)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                D d0;
                n n0;
                D d1;
                Object object3;
                n n2;
                D d2;
                D d3;
                n n3;
                n n4;
                Object object1 = b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        D d4 = (D)this.n;
                        n3 = this.o.iterator();
                        for(d3 = d4; true; d3 = d2) {
                            this.n = d3;
                            this.k = n3;
                            this.l = null;
                            this.m = 1;
                            object0 = n3.b(this);
                            if(object0 == object1) {
                                return object1;
                            }
                            d1 = d3;
                        label_38:
                            if(!((Boolean)object0).booleanValue()) {
                                break;
                            }
                            Object object4 = n3.next();
                            this.n = d1;
                            this.k = n3;
                            this.l = object4;
                            this.m = 2;
                            Object object5 = this.p.invoke(object4, this);
                            if(object5 == object1) {
                                return object1;
                            }
                            n2 = n3;
                            object3 = object4;
                            object0 = object5;
                            d2 = d1;
                        label_51:
                            n3 = n2;
                            if(!((Boolean)object0).booleanValue()) {
                                this.n = d2;
                                this.k = null;
                                this.l = null;
                                this.m = 3;
                                if(d2.I(object3, this) == object1) {
                                    return object1;
                                }
                                d1 = d2;
                                break;
                            }
                        }
                        n4 = this.o.iterator();
                        break;
                    }
                    case 1: {
                        n3 = (n)this.k;
                        d3 = (D)this.n;
                        f0.n(object0);
                        d1 = d3;
                        goto label_38;
                    }
                    case 2: {
                        Object object2 = this.l;
                        n n1 = (n)this.k;
                        d2 = (D)this.n;
                        f0.n(object0);
                        n2 = n1;
                        object3 = object2;
                        goto label_51;
                    }
                    case 3: {
                        d1 = (D)this.n;
                        f0.n(object0);
                        n4 = this.o.iterator();
                        break;
                    }
                    case 4: {
                        n0 = (n)this.k;
                        d0 = (D)this.n;
                        f0.n(object0);
                        goto label_73;
                    }
                    case 5: {
                        n0 = (n)this.k;
                        d0 = (D)this.n;
                        f0.n(object0);
                        goto label_80;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    this.n = d1;
                    this.k = n4;
                    this.m = 4;
                    Object object6 = n4.b(this);
                    if(object6 == object1) {
                        return object1;
                    }
                    n0 = n4;
                    object0 = object6;
                    d0 = d1;
                label_73:
                    if(!((Boolean)object0).booleanValue()) {
                        break;
                    }
                    Object object7 = n0.next();
                    this.n = d0;
                    this.k = n0;
                    this.m = 5;
                    if(d0.I(object7, this) == object1) {
                        return object1;
                    }
                label_80:
                    n4 = n0;
                    d1 = d0;
                }
                return S0.a;
            }
        }

        Function1 function10 = r.g(f0);
        kotlinx.coroutines.channels.u.i u$i0 = new kotlinx.coroutines.channels.u.i(f0, o0, null);
        return B.g(() -> i.a, g0, 0, null, function10, u$i0, 6, null);
    }

    public static F n(F f0, g g0, o o0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.g();
        }
        return u.m(f0, g0, o0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object o(F f0, int v, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {68}, m = "elementAt", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
        static final class j extends kotlin.coroutines.jvm.internal.d {
            int k;
            int l;
            Object m;
            Object n;
            Object o;
            int p;

            j(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.o = object0;
                this.p |= 0x80000000;
                return u.o(null, 0, this);
            }
        }

        Object object3;
        Object object2;
        F f1;
        n n1;
        int v3;
        int v2;
        n n0;
        j u$j0;
        if(d0 instanceof j) {
            u$j0 = (j)d0;
            int v1 = u$j0.p;
            if((v1 & 0x80000000) == 0) {
                u$j0 = new j(d0);
            }
            else {
                u$j0.p = v1 ^ 0x80000000;
            }
        }
        else {
            u$j0 = new j(d0);
        }
        Object object0 = u$j0.o;
        Object object1 = b.l();
    alab1:
        switch(u$j0.p) {
            case 0: {
                f0.n(object0);
                try {
                    if(v < 0) {
                        throw new IndexOutOfBoundsException("ReceiveChannel doesn\'t contain element at index " + v + '.');
                    }
                    n0 = f0.iterator();
                    v2 = 0;
                    goto label_33;
                }
                catch(Throwable throwable0) {
                    f1 = f0;
                    throwable1 = throwable0;
                    throw throwable1;
                }
            }
            case 1: {
                v3 = u$j0.l;
                v = u$j0.k;
                n1 = (n)u$j0.n;
                f1 = (F)u$j0.m;
                f0.n(object0);
                while(true) {
                label_24:
                    if(!((Boolean)object0).booleanValue()) {
                        throw new IndexOutOfBoundsException("ReceiveChannel doesn\'t contain element at index " + v + '.');
                    }
                    object2 = n1.next();
                    if(v == v3) {
                        break alab1;
                    }
                    goto label_30;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        r.b(f1, null);
        return object2;
    label_30:
        n0 = n1;
        f0 = f1;
        v2 = v3 + 1;
        try {
        label_33:
            u$j0.m = f0;
            u$j0.n = n0;
            u$j0.k = v;
            u$j0.l = v2;
            u$j0.p = 1;
            object3 = n0.b(u$j0);
        }
        catch(Throwable throwable0) {
            f1 = f0;
            throwable1 = throwable0;
            throw throwable1;
        }
        if(object3 == object1) {
            return object1;
        }
        try {
            f1 = f0;
            v3 = v2;
            n1 = n0;
            object0 = object3;
            goto label_24;
        }
        catch(Throwable throwable1) {
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            r.b(f1, throwable1);
            throw throwable2;
        }
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object p(F f0, int v, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {83}, m = "elementAtOrNull", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
        static final class kotlinx.coroutines.channels.u.k extends kotlin.coroutines.jvm.internal.d {
            int k;
            int l;
            Object m;
            Object n;
            Object o;
            int p;

            kotlinx.coroutines.channels.u.k(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.o = object0;
                this.p |= 0x80000000;
                return u.p(null, 0, this);
            }
        }

        Object object2;
        n n2;
        kotlinx.coroutines.channels.u.k u$k1;
        F f1;
        int v2;
        n n0;
        kotlinx.coroutines.channels.u.k u$k0;
        if(d0 instanceof kotlinx.coroutines.channels.u.k) {
            u$k0 = (kotlinx.coroutines.channels.u.k)d0;
            int v1 = u$k0.p;
            if((v1 & 0x80000000) == 0) {
                u$k0 = new kotlinx.coroutines.channels.u.k(d0);
            }
            else {
                u$k0.p = v1 ^ 0x80000000;
            }
        }
        else {
            u$k0 = new kotlinx.coroutines.channels.u.k(d0);
        }
        Object object0 = u$k0.o;
        Object object1 = b.l();
        switch(u$k0.p) {
            case 0: {
                f0.n(object0);
                if(v < 0) {
                    r.b(f0, null);
                    return null;
                }
                try {
                    n0 = f0.iterator();
                    v2 = 0;
                    goto label_40;
                }
                catch(Throwable throwable0) {
                    goto label_53;
                }
            }
            case 1: {
                int v3 = u$k0.l;
                v = u$k0.k;
                n n1 = (n)u$k0.n;
                f1 = (F)u$k0.m;
                f0.n(object0);
                v2 = v3;
                f0 = f1;
                u$k1 = u$k0;
                n2 = n1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            while(true) {
            label_32:
                if(!((Boolean)object0).booleanValue()) {
                    goto label_59;
                }
                object2 = n2.next();
                if(v == v2) {
                    break;
                }
                goto label_37;
            }
        }
        catch(Throwable throwable0) {
            goto label_53;
        }
        r.b(f0, null);
        return object2;
    label_37:
        n0 = n2;
        u$k0 = u$k1;
        ++v2;
        try {
        label_40:
            u$k0.m = f0;
            u$k0.n = n0;
            u$k0.k = v;
            u$k0.l = v2;
            u$k0.p = 1;
            Object object3 = n0.b(u$k0);
            if(object3 == object1) {
                return object1;
            }
            n2 = n0;
            object0 = object3;
            u$k1 = u$k0;
            goto label_32;
        }
        catch(Throwable throwable0) {
        label_53:
            f1 = f0;
            throwable1 = throwable0;
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            r.b(f1, throwable1);
            throw throwable2;
        }
    label_59:
        r.b(f0, null);
        return null;
    }

    @b0
    @l
    public static final F q(@l F f0, @l g g0, @l o o0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {0xE4, 0xE5, 0xE5}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
        static final class kotlinx.coroutines.channels.u.l extends kotlin.coroutines.jvm.internal.o implements o {
            Object k;
            Object l;
            int m;
            private Object n;
            final F o;
            final o p;

            kotlinx.coroutines.channels.u.l(F f0, o o0, d d0) {
                this.o = f0;
                this.p = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.channels.u.l(this.o, this.p, d0);
                d1.n = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l D d0, @y4.m d d1) {
                return ((kotlinx.coroutines.channels.u.l)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object3;
                D d2;
                D d1;
                n n0;
                Object object1 = b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        D d0 = (D)this.n;
                        n0 = this.o.iterator();
                        d1 = d0;
                        break;
                    }
                    case 1: {
                        n0 = (n)this.k;
                        d1 = (D)this.n;
                        f0.n(object0);
                        goto label_29;
                    }
                    case 2: {
                        Object object2 = this.l;
                        n n1 = (n)this.k;
                        d2 = (D)this.n;
                        f0.n(object0);
                        object3 = object2;
                        n0 = n1;
                        goto label_41;
                    }
                    case 3: {
                        n0 = (n)this.k;
                        d1 = (D)this.n;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    this.n = d1;
                    this.k = n0;
                    this.l = null;
                    this.m = 1;
                    object0 = n0.b(this);
                    if(object0 == object1) {
                        return object1;
                    }
                label_29:
                    if(!((Boolean)object0).booleanValue()) {
                        break;
                    }
                    Object object4 = n0.next();
                    this.n = d1;
                    this.k = n0;
                    this.l = object4;
                    this.m = 2;
                    Object object5 = this.p.invoke(object4, this);
                    if(object5 == object1) {
                        return object1;
                    }
                    object3 = object4;
                    object0 = object5;
                    d2 = d1;
                label_41:
                    if(((Boolean)object0).booleanValue()) {
                        this.n = d2;
                        this.k = n0;
                        this.l = null;
                        this.m = 3;
                        if(d2.I(object3, this) == object1) {
                            return object1;
                        }
                    }
                    d1 = d2;
                }
                return S0.a;
            }
        }

        Function1 function10 = r.g(f0);
        kotlinx.coroutines.channels.u.l u$l0 = new kotlinx.coroutines.channels.u.l(f0, o0, null);
        return B.g(() -> i.a, g0, 0, null, function10, u$l0, 6, null);
    }

    public static F r(F f0, g g0, o o0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.g();
        }
        return r.s(f0, g0, o0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F s(F f0, g g0, p p0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {0xF1, 0xF2, 0xF2}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
        static final class kotlinx.coroutines.channels.u.m extends kotlin.coroutines.jvm.internal.o implements o {
            Object k;
            Object l;
            int m;
            int n;
            private Object o;
            final F p;
            final p q;

            kotlinx.coroutines.channels.u.m(F f0, p p0, d d0) {
                this.p = f0;
                this.q = p0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.channels.u.m(this.p, this.q, d0);
                d1.o = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((D)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l D d0, @y4.m d d1) {
                return ((kotlinx.coroutines.channels.u.m)this.create(d0, d1)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object3;
                D d1;
                int v;
                n n0;
                D d0;
                Object object1 = b.l();
                switch(this.n) {
                    case 0: {
                        f0.n(object0);
                        d0 = (D)this.o;
                        n0 = this.p.iterator();
                        v = 0;
                        break;
                    }
                    case 1: {
                        v = this.m;
                        n0 = (n)this.k;
                        d0 = (D)this.o;
                        f0.n(object0);
                        goto label_33;
                    }
                    case 2: {
                        v = this.m;
                        Object object2 = this.l;
                        n n1 = (n)this.k;
                        d1 = (D)this.o;
                        f0.n(object0);
                        object3 = object2;
                        n0 = n1;
                        goto label_47;
                    }
                    case 3: {
                        v = this.m;
                        n0 = (n)this.k;
                        d0 = (D)this.o;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    this.o = d0;
                    this.k = n0;
                    this.l = null;
                    this.m = v;
                    this.n = 1;
                    object0 = n0.b(this);
                    if(object0 == object1) {
                        return object1;
                    }
                label_33:
                    if(!((Boolean)object0).booleanValue()) {
                        break;
                    }
                    Object object4 = n0.next();
                    this.o = d0;
                    this.k = n0;
                    this.l = object4;
                    this.m = v + 1;
                    this.n = 2;
                    Object object5 = this.q.invoke(kotlin.coroutines.jvm.internal.b.f(v), object4, this);
                    if(object5 == object1) {
                        return object1;
                    }
                    d1 = d0;
                    object3 = object4;
                    object0 = object5;
                    ++v;
                label_47:
                    if(((Boolean)object0).booleanValue()) {
                        this.o = d1;
                        this.k = n0;
                        this.l = null;
                        this.m = v;
                        this.n = 3;
                        if(d1.I(object3, this) == object1) {
                            return object1;
                        }
                    }
                    d0 = d1;
                }
                return S0.a;
            }
        }

        Function1 function10 = r.g(f0);
        kotlinx.coroutines.channels.u.m u$m0 = new kotlinx.coroutines.channels.u.m(f0, p0, null);
        return B.g(() -> i.a, g0, 0, null, function10, u$m0, 6, null);
    }

    public static F t(F f0, g g0, p p0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.g();
        }
        return u.s(f0, g0, p0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F u(F f0, g g0, o o0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {0xFC}, m = "invokeSuspend", n = {}, s = {})
        static final class kotlinx.coroutines.channels.u.n extends kotlin.coroutines.jvm.internal.o implements o {
            int k;
            Object l;
            final o m;

            kotlinx.coroutines.channels.u.n(o o0, d d0) {
                this.m = o0;
                super(2, d0);
            }

            @y4.m
            public final Object a(Object object0, @y4.m d d0) {
                return ((kotlinx.coroutines.channels.u.n)this.create(object0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.channels.u.n(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(object0, ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        object0 = this.m.invoke(this.l, this);
                        return object0 == object1 ? object1 : kotlin.coroutines.jvm.internal.b.a(!((Boolean)object0).booleanValue());
                    }
                    case 1: {
                        f0.n(object0);
                        return kotlin.coroutines.jvm.internal.b.a(!((Boolean)object0).booleanValue());
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        return r.s(f0, g0, new kotlinx.coroutines.channels.u.n(o0, null));
    }

    public static F v(F f0, g g0, o o0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.g();
        }
        return u.u(f0, g0, o0);
    }

    @b0
    @l
    public static final F w(@l F f0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class kotlinx.coroutines.channels.u.o extends kotlin.coroutines.jvm.internal.o implements o {
            int k;
            Object l;

            kotlinx.coroutines.channels.u.o(d d0) {
                super(2, d0);
            }

            @y4.m
            public final Object a(@y4.m Object object0, @y4.m d d0) {
                return ((kotlinx.coroutines.channels.u.o)this.create(object0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.channels.u.o(d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(object0, ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return this.l == null ? kotlin.coroutines.jvm.internal.b.a(false) : kotlin.coroutines.jvm.internal.b.a(true);
            }
        }

        F f1 = u.r(f0, null, new kotlinx.coroutines.channels.u.o(null), 1, null);
        L.n(f1, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return f1;
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object x(F f0, Collection collection0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {0x205}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
        static final class kotlinx.coroutines.channels.u.p extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;

            kotlinx.coroutines.channels.u.p(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return u.x(null, null, this);
            }
        }

        Collection collection2;
        Throwable throwable1;
        Collection collection1;
        n n0;
        F f1;
        kotlinx.coroutines.channels.u.p u$p0;
        if(d0 instanceof kotlinx.coroutines.channels.u.p) {
            u$p0 = (kotlinx.coroutines.channels.u.p)d0;
            int v = u$p0.o;
            if((v & 0x80000000) == 0) {
                u$p0 = new kotlinx.coroutines.channels.u.p(d0);
            }
            else {
                u$p0.o = v ^ 0x80000000;
            }
        }
        else {
            u$p0 = new kotlinx.coroutines.channels.u.p(d0);
        }
        Object object0 = u$p0.n;
        Object object1 = b.l();
        switch(u$p0.o) {
            case 0: {
                f0.n(object0);
                try {
                    f1 = f0;
                    n0 = f0.iterator();
                    collection1 = collection0;
                    goto label_30;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                n0 = (n)u$p0.m;
                f1 = (F)u$p0.l;
                collection2 = (Collection)u$p0.k;
                try {
                    f0.n(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_45;
                        }
                        Object object2 = n0.next();
                        if(object2 != null) {
                            collection2.add(object2);
                        }
                        collection1 = collection2;
                    label_30:
                        u$p0.k = collection1;
                        u$p0.l = f1;
                        u$p0.m = n0;
                        u$p0.o = 1;
                        Object object3 = n0.b(u$p0);
                        if(object3 == object1) {
                            return object1;
                        }
                        collection2 = collection1;
                        object0 = object3;
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
    label_45:
        r.b(f1, null);
        return collection2;
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object y(F f0, kotlinx.coroutines.channels.G g0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {0x205, 0x110}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
        static final class q extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;

            q(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return u.y(null, null, this);
            }
        }

        Object object2;
        kotlinx.coroutines.channels.G g1;
        F f1;
        n n1;
        n n0;
        q u$q0;
        if(d0 instanceof q) {
            u$q0 = (q)d0;
            int v = u$q0.o;
            if((v & 0x80000000) == 0) {
                u$q0 = new q(d0);
            }
            else {
                u$q0.o = v ^ 0x80000000;
            }
        }
        else {
            u$q0 = new q(d0);
        }
        Object object0 = u$q0.n;
        Object object1 = b.l();
    alab1:
        switch(u$q0.o) {
            case 0: {
                f0.n(object0);
                try {
                    n0 = f0.iterator();
                    break;
                }
                catch(Throwable throwable0) {
                    f1 = f0;
                    throwable1 = throwable0;
                    throw throwable1;
                }
            }
            case 1: {
                n1 = (n)u$q0.m;
                f1 = (F)u$q0.l;
                g1 = (kotlinx.coroutines.channels.G)u$q0.k;
                f0.n(object0);
                goto label_44;
            }
            case 2: {
                n1 = (n)u$q0.m;
                f1 = (F)u$q0.l;
                g1 = (kotlinx.coroutines.channels.G)u$q0.k;
                f0.n(object0);
                while(true) {
                    while(true) {
                        n0 = n1;
                        f0 = f1;
                        g0 = g1;
                        break alab1;
                    }
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            u$q0.k = g0;
            u$q0.l = f0;
            u$q0.m = n0;
            u$q0.o = 1;
            object2 = n0.b(u$q0);
        }
        catch(Throwable throwable0) {
            f1 = f0;
            throwable1 = throwable0;
            throw throwable1;
        }
        if(object2 == object1) {
            return object1;
        }
        f1 = f0;
        n1 = n0;
        object0 = object2;
        g1 = g0;
        try {
        label_44:
            if(!((Boolean)object0).booleanValue()) {
                goto label_58;
            }
            Object object3 = n1.next();
            if(object3 == null) {
                n0 = n1;
                f0 = f1;
                g0 = g1;
                break alab1;
            }
            u$q0.k = g1;
            u$q0.l = f1;
            u$q0.m = n1;
            u$q0.o = 2;
            if(g1.I(object3, u$q0) != object1) {
                n0 = n1;
                f0 = f1;
                g0 = g1;
                break alab1;
            }
            return object1;
        }
        catch(Throwable throwable1) {
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            r.b(f1, throwable1);
            throw throwable2;
        }
    label_58:
        r.b(f1, null);
        return g1;
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object z(F f0, d d0) {
        @f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {0x5F}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
        static final class kotlinx.coroutines.channels.u.r extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            int n;

            kotlinx.coroutines.channels.u.r(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                this.m = object0;
                this.n |= 0x80000000;
                return u.z(null, this);
            }
        }

        Object object3;
        n n1;
        Throwable throwable1;
        F f1;
        Object object2;
        n n0;
        kotlinx.coroutines.channels.u.r u$r0;
        if(d0 instanceof kotlinx.coroutines.channels.u.r) {
            u$r0 = (kotlinx.coroutines.channels.u.r)d0;
            int v = u$r0.n;
            if((v & 0x80000000) == 0) {
                u$r0 = new kotlinx.coroutines.channels.u.r(d0);
            }
            else {
                u$r0.n = v ^ 0x80000000;
            }
        }
        else {
            u$r0 = new kotlinx.coroutines.channels.u.r(d0);
        }
        Object object0 = u$r0.m;
        Object object1 = b.l();
        switch(u$r0.n) {
            case 0: {
                f0.n(object0);
                try {
                    n0 = f0.iterator();
                    u$r0.k = f0;
                    u$r0.l = n0;
                    u$r0.n = 1;
                    object2 = n0.b(u$r0);
                }
                catch(Throwable throwable0) {
                    f1 = f0;
                    throwable1 = throwable0;
                    break;
                }
                if(object2 == object1) {
                    return object1;
                }
                f1 = f0;
                n1 = n0;
                object0 = object2;
                goto label_33;
            }
            case 1: {
                n1 = (n)u$r0.l;
                f1 = (F)u$r0.k;
                try {
                    f0.n(object0);
                label_33:
                    if(!((Boolean)object0).booleanValue()) {
                        throw new NoSuchElementException("ReceiveChannel is empty.");
                    }
                    object3 = n1.next();
                    goto label_42;
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
    label_42:
        r.b(f1, null);
        return object3;
    }
}

