package kotlinx.coroutines.flow;

import A3.o;
import A3.p;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.internal.q;
import y4.l;
import y4.m;

@s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,138:1\n1#2:139\n105#3:140\n105#3:141\n105#3:142\n105#3:143\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n18#1:140\n29#1:141\n48#1:142\n80#1:143\n*E\n"})
final class v {
    @m
    public static final Object b(@l i i0, @l o o0, @l d d0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {0x85}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
        @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1\n*L\n1#1,138:1\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            a(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return v.b(null, null, this);
            }
        }


        @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n*L\n1#1,138:1\n*E\n"})
        public static final class b implements j {
            final o a;

            public b(o o0) {
                this.a = o0;
                super();
            }

            @m
            public Object a(Object object0, @l d d0) {
                new kotlinx.coroutines.flow.v.b.a(this, d0);
                if(!((Boolean)this.a.invoke(object0, d0)).booleanValue()) {
                    throw new kotlinx.coroutines.flow.internal.a(this);
                }
                return S0.a;
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public Object emit(Object object0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {0x7F}, m = "emit", n = {"this"}, s = {"L$0"})
                @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,138:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.v.b.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    Object l;
                    final b m;
                    int n;

                    public kotlinx.coroutines.flow.v.b.a(b v$b0, d d0) {
                        this.m = v$b0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return this.m.emit(null, this);
                    }
                }

                b v$b0;
                kotlinx.coroutines.flow.v.b.a v$b$a0;
                if(d0 instanceof kotlinx.coroutines.flow.v.b.a) {
                    v$b$a0 = (kotlinx.coroutines.flow.v.b.a)d0;
                    int v = v$b$a0.n;
                    if((v & 0x80000000) == 0) {
                        v$b$a0 = new kotlinx.coroutines.flow.v.b.a(this, d0);
                    }
                    else {
                        v$b$a0.n = v ^ 0x80000000;
                    }
                }
                else {
                    v$b$a0 = new kotlinx.coroutines.flow.v.b.a(this, d0);
                }
                Object object1 = v$b$a0.l;
                Object object2 = kotlin.coroutines.intrinsics.b.l();
                switch(v$b$a0.n) {
                    case 0: {
                        f0.n(object1);
                        v$b$a0.k = this;
                        v$b$a0.n = 1;
                        object1 = this.a.invoke(object0, v$b$a0);
                        if(object1 == object2) {
                            return object2;
                        }
                        v$b0 = this;
                        break;
                    }
                    case 1: {
                        v$b0 = (b)v$b$a0.k;
                        f0.n(object1);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(!((Boolean)object1).booleanValue()) {
                    throw new kotlinx.coroutines.flow.internal.a(v$b0);
                }
                return S0.a;
            }
        }

        b v$b0;
        a v$a0;
        if(d0 instanceof a) {
            v$a0 = (a)d0;
            int v = v$a0.m;
            if((v & 0x80000000) == 0) {
                v$a0 = new a(d0);
            }
            else {
                v$a0.m = v ^ 0x80000000;
            }
        }
        else {
            v$a0 = new a(d0);
        }
        Object object0 = v$a0.l;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(v$a0.m) {
            case 0: {
                f0.n(object0);
                b v$b1 = new b(o0);
                try {
                    v$a0.k = v$b1;
                    v$a0.m = 1;
                    return i0.collect(v$b1, v$a0) == object1 ? object1 : S0.a;
                }
                catch(kotlinx.coroutines.flow.internal.a a0) {
                    v$b0 = v$b1;
                }
                q.b(a0, v$b0);
                return S0.a;
            }
            case 1: {
                v$b0 = (b)v$a0.k;
                try {
                    f0.n(object0);
                }
                catch(kotlinx.coroutines.flow.internal.a a0) {
                    q.b(a0, v$b0);
                }
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private static final Object c(i i0, o o0, d d0) {
        b v$b0 = new b(o0);
        try {
            i0.collect(v$b0, d0);
        }
        catch(kotlinx.coroutines.flow.internal.a a0) {
            q.b(a0, v$b0);
        }
        return S0.a;
    }

    @l
    public static final i d(@l i i0, int v) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,111:1\n19#2,5:112\n*E\n"})
        public static final class c implements i {
            final i a;
            final int b;

            public c(i i0, int v) {
                this.a = i0;
                this.b = v;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                kotlinx.coroutines.flow.v.d v$d0 = new kotlinx.coroutines.flow.v.d(new kotlin.jvm.internal.l0.f(), this.b, j0);
                Object object0 = this.a.collect(v$d0, d0);
                return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
            }
        }


        static final class kotlinx.coroutines.flow.v.d implements j {
            final kotlin.jvm.internal.l0.f a;
            final int b;
            final j c;

            kotlinx.coroutines.flow.v.d(kotlin.jvm.internal.l0.f l0$f0, int v, j j0) {
                this.a = l0$f0;
                this.b = v;
                this.c = j0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {21}, m = "emit", n = {}, s = {})
                static final class kotlinx.coroutines.flow.v.d.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    final kotlinx.coroutines.flow.v.d l;
                    int m;

                    kotlinx.coroutines.flow.v.d.a(kotlinx.coroutines.flow.v.d v$d0, d d0) {
                        this.l = v$d0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.m |= 0x80000000;
                        return this.l.emit(null, this);
                    }
                }

                kotlinx.coroutines.flow.v.d.a v$d$a0;
                if(d0 instanceof kotlinx.coroutines.flow.v.d.a) {
                    v$d$a0 = (kotlinx.coroutines.flow.v.d.a)d0;
                    int v = v$d$a0.m;
                    if((v & 0x80000000) == 0) {
                        v$d$a0 = new kotlinx.coroutines.flow.v.d.a(this, d0);
                    }
                    else {
                        v$d$a0.m = v ^ 0x80000000;
                    }
                }
                else {
                    v$d$a0 = new kotlinx.coroutines.flow.v.d.a(this, d0);
                }
                Object object1 = v$d$a0.k;
                Object object2 = kotlin.coroutines.intrinsics.b.l();
                switch(v$d$a0.m) {
                    case 0: {
                        f0.n(object1);
                        kotlin.jvm.internal.l0.f l0$f0 = this.a;
                        int v1 = l0$f0.a;
                        if(v1 >= this.b) {
                            v$d$a0.m = 1;
                            return this.c.emit(object0, v$d$a0) == object2 ? object2 : S0.a;
                        }
                        l0$f0.a = v1 + 1;
                        return S0.a;
                    }
                    case 1: {
                        f0.n(object1);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        if(v < 0) {
            throw new IllegalArgumentException(("Drop count should be non-negative, but had " + v).toString());
        }
        return new c(i0, v);
    }

    @l
    public static final i e(@l i i0, @l o o0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,111:1\n30#2,10:112\n*E\n"})
        public static final class e implements i {
            final i a;
            final o b;

            public e(i i0, o o0) {
                this.a = i0;
                this.b = o0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                kotlinx.coroutines.flow.v.f v$f0 = new kotlinx.coroutines.flow.v.f(new kotlin.jvm.internal.l0.a(), j0, this.b);
                Object object0 = this.a.collect(v$f0, d0);
                return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
            }
        }


        static final class kotlinx.coroutines.flow.v.f implements j {
            final kotlin.jvm.internal.l0.a a;
            final j b;
            final o c;

            kotlinx.coroutines.flow.v.f(kotlin.jvm.internal.l0.a l0$a0, j j0, o o0) {
                this.a = l0$a0;
                this.b = j0;
                this.c = o0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {33, 34, 36}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
                static final class kotlinx.coroutines.flow.v.f.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    Object l;
                    Object m;
                    final kotlinx.coroutines.flow.v.f n;
                    int o;

                    kotlinx.coroutines.flow.v.f.a(kotlinx.coroutines.flow.v.f v$f0, d d0) {
                        this.n = v$f0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return this.n.emit(null, this);
                    }
                }

                kotlinx.coroutines.flow.v.f v$f0;
                kotlinx.coroutines.flow.v.f.a v$f$a0;
                if(d0 instanceof kotlinx.coroutines.flow.v.f.a) {
                    v$f$a0 = (kotlinx.coroutines.flow.v.f.a)d0;
                    int v = v$f$a0.o;
                    if((v & 0x80000000) == 0) {
                        v$f$a0 = new kotlinx.coroutines.flow.v.f.a(this, d0);
                    }
                    else {
                        v$f$a0.o = v ^ 0x80000000;
                    }
                }
                else {
                    v$f$a0 = new kotlinx.coroutines.flow.v.f.a(this, d0);
                }
                Object object1 = v$f$a0.m;
                Object object2 = kotlin.coroutines.intrinsics.b.l();
                switch(v$f$a0.o) {
                    case 0: {
                        f0.n(object1);
                        if(this.a.a) {
                            v$f$a0.o = 1;
                            return this.b.emit(object0, v$f$a0) == object2 ? object2 : S0.a;
                        }
                        v$f$a0.k = this;
                        v$f$a0.l = object0;
                        v$f$a0.o = 2;
                        object1 = this.c.invoke(object0, v$f$a0);
                        if(object1 == object2) {
                            return object2;
                        }
                        v$f0 = this;
                        break;
                    }
                    case 1: {
                        f0.n(object1);
                        return S0.a;
                    }
                    case 2: {
                        object0 = v$f$a0.l;
                        v$f0 = (kotlinx.coroutines.flow.v.f)v$f$a0.k;
                        f0.n(object1);
                        break;
                    }
                    case 3: {
                        f0.n(object1);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(!((Boolean)object1).booleanValue()) {
                    v$f0.a.a = true;
                    v$f$a0.k = null;
                    v$f$a0.l = null;
                    v$f$a0.o = 3;
                    return v$f0.b.emit(object0, v$f$a0) == object2 ? object2 : S0.a;
                }
                return S0.a;
            }
        }

        return new e(i0, o0);
    }

    private static final Object f(j j0, Object object0, Object object1, d d0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {70}, m = "emitAbort$FlowKt__LimitKt", n = {"ownershipMarker"}, s = {"L$0"})
        static final class g extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            g(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return v.f(null, null, null, this);
            }
        }

        g v$g0;
        if(d0 instanceof g) {
            v$g0 = (g)d0;
            int v = v$g0.m;
            if((v & 0x80000000) == 0) {
                v$g0 = new g(d0);
            }
            else {
                v$g0.m = v ^ 0x80000000;
            }
        }
        else {
            v$g0 = new g(d0);
        }
        Object object2 = v$g0.l;
        Object object3 = kotlin.coroutines.intrinsics.b.l();
        switch(v$g0.m) {
            case 0: {
                f0.n(object2);
                v$g0.k = object1;
                v$g0.m = 1;
                if(j0.emit(object0, v$g0) == object3) {
                    return object3;
                }
                break;
            }
            case 1: {
                object1 = v$g0.k;
                f0.n(object2);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new kotlinx.coroutines.flow.internal.a(object1);
    }

    @l
    public static final i g(@l i i0, int v) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,111:1\n49#2,4:112\n63#2,4:116\n*E\n"})
        public static final class h implements i {
            final i a;
            final int b;

            public h(i i0, int v) {
                this.a = i0;
                this.b = v;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {0x73}, m = "collect", n = {"ownershipMarker"}, s = {"L$0"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.v.h.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final h m;
                    Object n;

                    public kotlinx.coroutines.flow.v.h.a(h v$h0, d d0) {
                        this.m = v$h0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                Object object2;
                kotlinx.coroutines.flow.v.h.a v$h$a0;
                if(d0 instanceof kotlinx.coroutines.flow.v.h.a) {
                    v$h$a0 = (kotlinx.coroutines.flow.v.h.a)d0;
                    int v = v$h$a0.l;
                    if((v & 0x80000000) == 0) {
                        v$h$a0 = new kotlinx.coroutines.flow.v.h.a(this, d0);
                    }
                    else {
                        v$h$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    v$h$a0 = new kotlinx.coroutines.flow.v.h.a(this, d0);
                }
                Object object0 = v$h$a0.k;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(v$h$a0.l) {
                    case 0: {
                        f0.n(object0);
                        Object object3 = new Object();
                        kotlin.jvm.internal.l0.f l0$f0 = new kotlin.jvm.internal.l0.f();
                        try {
                            kotlinx.coroutines.flow.v.i v$i0 = new kotlinx.coroutines.flow.v.i(l0$f0, this.b, j0, object3);
                            v$h$a0.n = object3;
                            v$h$a0.l = 1;
                            return this.a.collect(v$i0, v$h$a0) == object1 ? object1 : S0.a;
                        }
                        catch(kotlinx.coroutines.flow.internal.a a1) {
                            a0 = a1;
                            object2 = object3;
                        }
                        q.b(a0, object2);
                        return S0.a;
                    }
                    case 1: {
                        try {
                            object2 = v$h$a0.n;
                            f0.n(object0);
                        }
                        catch(kotlinx.coroutines.flow.internal.a a0) {
                            q.b(a0, object2);
                        }
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }


        static final class kotlinx.coroutines.flow.v.i implements j {
            final kotlin.jvm.internal.l0.f a;
            final int b;
            final j c;
            final Object d;

            kotlinx.coroutines.flow.v.i(kotlin.jvm.internal.l0.f l0$f0, int v, j j0, Object object0) {
                this.a = l0$f0;
                this.b = v;
                this.c = j0;
                this.d = object0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {58, 60}, m = "emit", n = {}, s = {})
                static final class kotlinx.coroutines.flow.v.i.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    final kotlinx.coroutines.flow.v.i l;
                    int m;

                    kotlinx.coroutines.flow.v.i.a(kotlinx.coroutines.flow.v.i v$i0, d d0) {
                        this.l = v$i0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.m |= 0x80000000;
                        return this.l.emit(null, this);
                    }
                }

                kotlinx.coroutines.flow.v.i.a v$i$a0;
                if(d0 instanceof kotlinx.coroutines.flow.v.i.a) {
                    v$i$a0 = (kotlinx.coroutines.flow.v.i.a)d0;
                    int v = v$i$a0.m;
                    if((v & 0x80000000) == 0) {
                        v$i$a0 = new kotlinx.coroutines.flow.v.i.a(this, d0);
                    }
                    else {
                        v$i$a0.m = v ^ 0x80000000;
                    }
                }
                else {
                    v$i$a0 = new kotlinx.coroutines.flow.v.i.a(this, d0);
                }
                Object object1 = v$i$a0.k;
                Object object2 = kotlin.coroutines.intrinsics.b.l();
                switch(v$i$a0.m) {
                    case 0: {
                        f0.n(object1);
                        int v1 = this.a.a + 1;
                        this.a.a = v1;
                        if(v1 < this.b) {
                            v$i$a0.m = 1;
                            return this.c.emit(object0, v$i$a0) == object2 ? object2 : S0.a;
                        }
                        v$i$a0.m = 2;
                        return v.f(this.c, object0, this.d, v$i$a0) == object2 ? object2 : S0.a;
                    }
                    case 1: {
                        f0.n(object1);
                        return S0.a;
                    }
                    case 2: {
                        f0.n(object1);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        if(v <= 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " should be positive").toString());
        }
        return new h(i0, v);
    }

    @l
    public static final i h(@l i i0, @l o o0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,111:1\n82#2:112\n123#2,15:113\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n82#1:113,15\n*E\n"})
        public static final class kotlinx.coroutines.flow.v.j implements i {
            final i a;
            final o b;

            public kotlinx.coroutines.flow.v.j(i i0, o o0) {
                this.a = i0;
                this.b = o0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {0x7B}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.v.j.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final kotlinx.coroutines.flow.v.j m;
                    Object n;

                    public kotlinx.coroutines.flow.v.j.a(kotlinx.coroutines.flow.v.j v$j0, d d0) {
                        this.m = v$j0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                k v$k0;
                kotlinx.coroutines.flow.v.j.a v$j$a0;
                if(d0 instanceof kotlinx.coroutines.flow.v.j.a) {
                    v$j$a0 = (kotlinx.coroutines.flow.v.j.a)d0;
                    int v = v$j$a0.l;
                    if((v & 0x80000000) == 0) {
                        v$j$a0 = new kotlinx.coroutines.flow.v.j.a(this, d0);
                    }
                    else {
                        v$j$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    v$j$a0 = new kotlinx.coroutines.flow.v.j.a(this, d0);
                }
                Object object0 = v$j$a0.k;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(v$j$a0.l) {
                    case 0: {
                        f0.n(object0);
                        k v$k1 = new k(this.b, j0);
                        try {
                            v$j$a0.n = v$k1;
                            v$j$a0.l = 1;
                            return this.a.collect(v$k1, v$j$a0) == object1 ? object1 : S0.a;
                        }
                        catch(kotlinx.coroutines.flow.internal.a a0) {
                            v$k0 = v$k1;
                        }
                        q.b(a0, v$k0);
                        return S0.a;
                    }
                    case 1: {
                        v$k0 = (k)v$j$a0.n;
                        try {
                            f0.n(object0);
                        }
                        catch(kotlinx.coroutines.flow.internal.a a0) {
                            q.b(a0, v$k0);
                        }
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }


        @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,138:1\n83#2,5:139\n*E\n"})
        public static final class k implements j {
            final o a;
            final j b;

            public k(o o0, j j0) {
                this.a = o0;
                this.b = j0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public Object emit(Object object0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {0x8B, 140}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
                @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,138:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.v.k.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    Object l;
                    int m;
                    final k n;
                    Object o;

                    public kotlinx.coroutines.flow.v.k.a(k v$k0, d d0) {
                        this.n = v$k0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.m |= 0x80000000;
                        return this.n.emit(null, this);
                    }
                }

                k v$k0;
                Object object5;
                Object object4;
                kotlinx.coroutines.flow.v.k.a v$k$a0;
                if(d0 instanceof kotlinx.coroutines.flow.v.k.a) {
                    v$k$a0 = (kotlinx.coroutines.flow.v.k.a)d0;
                    int v = v$k$a0.m;
                    if((v & 0x80000000) == 0) {
                        v$k$a0 = new kotlinx.coroutines.flow.v.k.a(this, d0);
                    }
                    else {
                        v$k$a0.m = v ^ 0x80000000;
                    }
                }
                else {
                    v$k$a0 = new kotlinx.coroutines.flow.v.k.a(this, d0);
                }
                Object object1 = v$k$a0.l;
                Object object2 = kotlin.coroutines.intrinsics.b.l();
                boolean z = true;
                switch(v$k$a0.m) {
                    case 0: {
                        f0.n(object1);
                        v$k$a0.k = this;
                        v$k$a0.o = object0;
                        v$k$a0.m = 1;
                        Object object3 = this.a.invoke(object0, v$k$a0);
                        if(object3 == object2) {
                            return object2;
                        }
                        object4 = object3;
                        object5 = object0;
                        v$k0 = this;
                        goto label_31;
                    }
                    case 1: {
                        Object object6 = v$k$a0.o;
                        k v$k1 = (k)v$k$a0.k;
                        f0.n(object1);
                        object5 = object6;
                        v$k0 = v$k1;
                        object4 = object1;
                    label_31:
                        if(((Boolean)object4).booleanValue()) {
                            v$k$a0.k = v$k0;
                            v$k$a0.o = null;
                            v$k$a0.m = 2;
                            if(v$k0.b.emit(object5, v$k$a0) == object2) {
                                return object2;
                            }
                        }
                        else {
                            z = false;
                        }
                        break;
                    }
                    case 2: {
                        v$k0 = (k)v$k$a0.k;
                        f0.n(object1);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(!z) {
                    throw new kotlinx.coroutines.flow.internal.a(v$k0);
                }
                return S0.a;
            }
        }

        return new kotlinx.coroutines.flow.v.j(i0, o0);
    }

    @l
    public static final i i(@l i i0, @kotlin.b @l p p0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {0x95}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
        @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,138:1\n123#2,15:139\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n116#1:139,15\n*E\n"})
        static final class kotlinx.coroutines.flow.v.l extends kotlin.coroutines.jvm.internal.o implements o {
            int k;
            private Object l;
            final i m;
            final p n;

            kotlinx.coroutines.flow.v.l(i i0, p p0, d d0) {
                this.m = i0;
                this.n = p0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.flow.v.l(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((j)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l j j0, @m d d0) {
                return ((kotlinx.coroutines.flow.v.l)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n1#1,138:1\n117#2:139\n*E\n"})
                public static final class kotlinx.coroutines.flow.v.l.a implements j {
                    final p a;
                    final j b;

                    public kotlinx.coroutines.flow.v.l.a(p p0, j j0) {
                        this.a = p0;
                        this.b = j0;
                        super();
                    }

                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public Object emit(Object object0, @l d d0) {
                        @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", i = {0}, l = {0x8B}, m = "emit", n = {"this"}, s = {"L$0"})
                        @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,138:1\n*E\n"})
                        public static final class kotlinx.coroutines.flow.v.l.a.a extends kotlin.coroutines.jvm.internal.d {
                            Object k;
                            Object l;
                            int m;
                            final kotlinx.coroutines.flow.v.l.a n;

                            public kotlinx.coroutines.flow.v.l.a.a(kotlinx.coroutines.flow.v.l.a v$l$a0, d d0) {
                                this.n = v$l$a0;
                                super(d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                this.l = object0;
                                this.m |= 0x80000000;
                                return this.n.emit(null, this);
                            }
                        }

                        kotlinx.coroutines.flow.v.l.a v$l$a0;
                        kotlinx.coroutines.flow.v.l.a.a v$l$a$a0;
                        if(d0 instanceof kotlinx.coroutines.flow.v.l.a.a) {
                            v$l$a$a0 = (kotlinx.coroutines.flow.v.l.a.a)d0;
                            int v = v$l$a$a0.m;
                            if((v & 0x80000000) == 0) {
                                v$l$a$a0 = new kotlinx.coroutines.flow.v.l.a.a(this, d0);
                            }
                            else {
                                v$l$a$a0.m = v ^ 0x80000000;
                            }
                        }
                        else {
                            v$l$a$a0 = new kotlinx.coroutines.flow.v.l.a.a(this, d0);
                        }
                        Object object1 = v$l$a$a0.l;
                        Object object2 = kotlin.coroutines.intrinsics.b.l();
                        switch(v$l$a$a0.m) {
                            case 0: {
                                f0.n(object1);
                                v$l$a$a0.k = this;
                                v$l$a$a0.m = 1;
                                object1 = this.a.invoke(this.b, object0, v$l$a$a0);
                                if(object1 == object2) {
                                    return object2;
                                }
                                v$l$a0 = this;
                                break;
                            }
                            case 1: {
                                v$l$a0 = (kotlinx.coroutines.flow.v.l.a)v$l$a$a0.k;
                                f0.n(object1);
                                break;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        if(!((Boolean)object1).booleanValue()) {
                            throw new kotlinx.coroutines.flow.internal.a(v$l$a0);
                        }
                        return S0.a;
                    }
                }

                kotlinx.coroutines.flow.v.l.a v$l$a0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        kotlinx.coroutines.flow.v.l.a v$l$a1 = new kotlinx.coroutines.flow.v.l.a(this.n, ((j)this.l));
                        try {
                            this.l = v$l$a1;
                            this.k = 1;
                            return this.m.collect(v$l$a1, this) == object1 ? object1 : S0.a;
                        }
                        catch(kotlinx.coroutines.flow.internal.a a0) {
                            v$l$a0 = v$l$a1;
                        }
                        q.b(a0, v$l$a0);
                        return S0.a;
                    }
                    case 1: {
                        v$l$a0 = (kotlinx.coroutines.flow.v.l.a)this.l;
                        try {
                            f0.n(object0);
                        }
                        catch(kotlinx.coroutines.flow.internal.a a0) {
                            q.b(a0, v$l$a0);
                        }
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        return kotlinx.coroutines.flow.k.I0(new kotlinx.coroutines.flow.v.l(i0, p0, null));
    }
}

