package kotlinx.coroutines.flow;

import A3.o;
import A3.p;
import java.util.NoSuchElementException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.internal.q;
import kotlinx.coroutines.flow.internal.u;
import kotlinx.coroutines.internal.V;
import y4.l;
import y4.m;

@s0({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,168:1\n123#2,15:169\n123#2,15:184\n123#2,15:199\n123#2,15:214\n123#2,15:229\n*S KotlinDebug\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n68#1:169,15\n88#1:184,15\n102#1:199,15\n120#1:214,15\n133#1:229,15\n*E\n"})
final class y {
    @m
    public static final Object a(@l i i0, @l o o0, @l d d0) {
        @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,138:1\n103#2,5:139\n*E\n"})
        public static final class b implements j {
            final o a;
            final h b;

            public b(o o0, h l0$h0) {
                this.a = o0;
                this.b = l0$h0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public Object emit(Object object0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {0x8B}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
                @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,138:1\n*E\n"})
                public static final class a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    Object l;
                    int m;
                    final b n;
                    Object o;

                    public a(b y$b0, d d0) {
                        this.n = y$b0;
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

                b y$b0;
                a y$b$a0;
                if(d0 instanceof a) {
                    y$b$a0 = (a)d0;
                    int v = y$b$a0.m;
                    if((v & 0x80000000) == 0) {
                        y$b$a0 = new a(this, d0);
                    }
                    else {
                        y$b$a0.m = v ^ 0x80000000;
                    }
                }
                else {
                    y$b$a0 = new a(this, d0);
                }
                Object object1 = y$b$a0.l;
                Object object2 = kotlin.coroutines.intrinsics.b.l();
                switch(y$b$a0.m) {
                    case 0: {
                        f0.n(object1);
                        y$b$a0.k = this;
                        y$b$a0.o = object0;
                        y$b$a0.m = 1;
                        object1 = this.a.invoke(object0, y$b$a0);
                        if(object1 == object2) {
                            return object2;
                        }
                        y$b0 = this;
                        break;
                    }
                    case 1: {
                        object0 = y$b$a0.o;
                        y$b0 = (b)y$b$a0.k;
                        f0.n(object1);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(!((Boolean)object1).booleanValue()) {
                    return S0.a;
                }
                y$b0.b.a = object0;
                throw new kotlinx.coroutines.flow.internal.a(y$b0);
            }
        }


        @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {0xB3}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
        static final class kotlinx.coroutines.flow.y.d extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;

            kotlinx.coroutines.flow.y.d(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.n = object0;
                this.o |= 0x80000000;
                return k.u0(null, null, this);
            }
        }

        b y$b1;
        kotlinx.coroutines.flow.internal.a a1;
        h l0$h1;
        o o1;
        kotlinx.coroutines.flow.y.d y$d0;
        if(d0 instanceof kotlinx.coroutines.flow.y.d) {
            y$d0 = (kotlinx.coroutines.flow.y.d)d0;
            int v = y$d0.o;
            if((v & 0x80000000) == 0) {
                y$d0 = new kotlinx.coroutines.flow.y.d(d0);
            }
            else {
                y$d0.o = v ^ 0x80000000;
            }
        }
        else {
            y$d0 = new kotlinx.coroutines.flow.y.d(d0);
        }
        Object object0 = y$d0.n;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(y$d0.o) {
            case 0: {
                f0.n(object0);
                h l0$h0 = new h();
                l0$h0.a = u.a;
                b y$b0 = new b(o0, l0$h0);
                try {
                    y$d0.k = o0;
                    y$d0.l = l0$h0;
                    y$d0.m = y$b0;
                    y$d0.o = 1;
                    if(i0.collect(y$b0, y$d0) == object1) {
                        return object1;
                    }
                }
                catch(kotlinx.coroutines.flow.internal.a a0) {
                    o1 = o0;
                    l0$h1 = l0$h0;
                    a1 = a0;
                    y$b1 = y$b0;
                    q.b(a1, y$b1);
                    break;
                }
                o1 = o0;
                l0$h1 = l0$h0;
                break;
            }
            case 1: {
                y$b1 = (b)y$d0.m;
                l0$h1 = (h)y$d0.l;
                o1 = (o)y$d0.k;
                try {
                    f0.n(object0);
                    break;
                }
                catch(kotlinx.coroutines.flow.internal.a a1) {
                }
                q.b(a1, y$b1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object2 = l0$h1.a;
        if(object2 == u.a) {
            throw new NoSuchElementException("Expected at least one element matching the predicate " + o1);
        }
        return object2;
    }

    @m
    public static final Object b(@l i i0, @l d d0) {
        @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,138:1\n89#2,2:139\n*E\n"})
        public static final class kotlinx.coroutines.flow.y.a implements j {
            final h a;

            public kotlinx.coroutines.flow.y.a(h l0$h0) {
                this.a = l0$h0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public Object emit(Object object0, @l d d0) {
                this.a.a = object0;
                throw new kotlinx.coroutines.flow.internal.a(this);
            }
        }


        @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {0xB3}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
        static final class c extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            int n;

            c(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.m = object0;
                this.n |= 0x80000000;
                return k.v0(null, this);
            }
        }

        kotlinx.coroutines.flow.y.a y$a1;
        kotlinx.coroutines.flow.internal.a a1;
        h l0$h1;
        c y$c0;
        if(d0 instanceof c) {
            y$c0 = (c)d0;
            int v = y$c0.n;
            if((v & 0x80000000) == 0) {
                y$c0 = new c(d0);
            }
            else {
                y$c0.n = v ^ 0x80000000;
            }
        }
        else {
            y$c0 = new c(d0);
        }
        Object object0 = y$c0.m;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(y$c0.n) {
            case 0: {
                f0.n(object0);
                h l0$h0 = new h();
                l0$h0.a = u.a;
                kotlinx.coroutines.flow.y.a y$a0 = new kotlinx.coroutines.flow.y.a(l0$h0);
                try {
                    y$c0.k = l0$h0;
                    y$c0.l = y$a0;
                    y$c0.n = 1;
                    if(i0.collect(y$a0, y$c0) == object1) {
                        return object1;
                    }
                }
                catch(kotlinx.coroutines.flow.internal.a a0) {
                    l0$h1 = l0$h0;
                    a1 = a0;
                    y$a1 = y$a0;
                    q.b(a1, y$a1);
                    break;
                }
                l0$h1 = l0$h0;
                break;
            }
            case 1: {
                y$a1 = (kotlinx.coroutines.flow.y.a)y$c0.l;
                l0$h1 = (h)y$c0.k;
                try {
                    f0.n(object0);
                    break;
                }
                catch(kotlinx.coroutines.flow.internal.a a1) {
                }
                q.b(a1, y$a1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object2 = l0$h1.a;
        if(object2 == u.a) {
            throw new NoSuchElementException("Expected at least one element");
        }
        return object2;
    }

    @m
    public static final Object c(@l i i0, @l o o0, @l d d0) {
        @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,138:1\n134#2,5:139\n*E\n"})
        public static final class kotlinx.coroutines.flow.y.f implements j {
            final o a;
            final h b;

            public kotlinx.coroutines.flow.y.f(o o0, h l0$h0) {
                this.a = o0;
                this.b = l0$h0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public Object emit(Object object0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {0x8B}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
                @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,138:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.y.f.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    Object l;
                    int m;
                    final kotlinx.coroutines.flow.y.f n;
                    Object o;

                    public kotlinx.coroutines.flow.y.f.a(kotlinx.coroutines.flow.y.f y$f0, d d0) {
                        this.n = y$f0;
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

                kotlinx.coroutines.flow.y.f y$f0;
                kotlinx.coroutines.flow.y.f.a y$f$a0;
                if(d0 instanceof kotlinx.coroutines.flow.y.f.a) {
                    y$f$a0 = (kotlinx.coroutines.flow.y.f.a)d0;
                    int v = y$f$a0.m;
                    if((v & 0x80000000) == 0) {
                        y$f$a0 = new kotlinx.coroutines.flow.y.f.a(this, d0);
                    }
                    else {
                        y$f$a0.m = v ^ 0x80000000;
                    }
                }
                else {
                    y$f$a0 = new kotlinx.coroutines.flow.y.f.a(this, d0);
                }
                Object object1 = y$f$a0.l;
                Object object2 = kotlin.coroutines.intrinsics.b.l();
                switch(y$f$a0.m) {
                    case 0: {
                        f0.n(object1);
                        y$f$a0.k = this;
                        y$f$a0.o = object0;
                        y$f$a0.m = 1;
                        object1 = this.a.invoke(object0, y$f$a0);
                        if(object1 == object2) {
                            return object2;
                        }
                        y$f0 = this;
                        break;
                    }
                    case 1: {
                        object0 = y$f$a0.o;
                        y$f0 = (kotlinx.coroutines.flow.y.f)y$f$a0.k;
                        f0.n(object1);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(!((Boolean)object1).booleanValue()) {
                    return S0.a;
                }
                y$f0.b.a = object0;
                throw new kotlinx.coroutines.flow.internal.a(y$f0);
            }
        }


        @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {0xB3}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
        static final class kotlinx.coroutines.flow.y.h extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            int n;

            kotlinx.coroutines.flow.y.h(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.m = object0;
                this.n |= 0x80000000;
                return k.w0(null, null, this);
            }
        }

        kotlinx.coroutines.flow.y.f y$f1;
        kotlinx.coroutines.flow.internal.a a1;
        h l0$h1;
        kotlinx.coroutines.flow.y.h y$h0;
        if(d0 instanceof kotlinx.coroutines.flow.y.h) {
            y$h0 = (kotlinx.coroutines.flow.y.h)d0;
            int v = y$h0.n;
            if((v & 0x80000000) == 0) {
                y$h0 = new kotlinx.coroutines.flow.y.h(d0);
            }
            else {
                y$h0.n = v ^ 0x80000000;
            }
        }
        else {
            y$h0 = new kotlinx.coroutines.flow.y.h(d0);
        }
        Object object0 = y$h0.m;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(y$h0.n) {
            case 0: {
                f0.n(object0);
                h l0$h0 = new h();
                kotlinx.coroutines.flow.y.f y$f0 = new kotlinx.coroutines.flow.y.f(o0, l0$h0);
                try {
                    y$h0.k = l0$h0;
                    y$h0.l = y$f0;
                    y$h0.n = 1;
                    return i0.collect(y$f0, y$h0) == object1 ? object1 : l0$h0.a;
                }
                catch(kotlinx.coroutines.flow.internal.a a0) {
                    l0$h1 = l0$h0;
                    a1 = a0;
                    y$f1 = y$f0;
                    q.b(a1, y$f1);
                    return l0$h1.a;
                }
            }
            case 1: {
                y$f1 = (kotlinx.coroutines.flow.y.f)y$h0.l;
                l0$h1 = (h)y$h0.k;
                try {
                    f0.n(object0);
                    return l0$h1.a;
                }
                catch(kotlinx.coroutines.flow.internal.a a1) {
                }
                q.b(a1, y$f1);
                return l0$h1.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @m
    public static final Object d(@l i i0, @l d d0) {
        @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,138:1\n121#2,2:139\n*E\n"})
        public static final class e implements j {
            final h a;

            public e(h l0$h0) {
                this.a = l0$h0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public Object emit(Object object0, @l d d0) {
                this.a.a = object0;
                throw new kotlinx.coroutines.flow.internal.a(this);
            }
        }


        @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {0xB3}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
        static final class g extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            int n;

            g(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.m = object0;
                this.n |= 0x80000000;
                return k.x0(null, this);
            }
        }

        e y$e1;
        kotlinx.coroutines.flow.internal.a a1;
        h l0$h1;
        g y$g0;
        if(d0 instanceof g) {
            y$g0 = (g)d0;
            int v = y$g0.n;
            if((v & 0x80000000) == 0) {
                y$g0 = new g(d0);
            }
            else {
                y$g0.n = v ^ 0x80000000;
            }
        }
        else {
            y$g0 = new g(d0);
        }
        Object object0 = y$g0.m;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(y$g0.n) {
            case 0: {
                f0.n(object0);
                h l0$h0 = new h();
                e y$e0 = new e(l0$h0);
                try {
                    y$g0.k = l0$h0;
                    y$g0.l = y$e0;
                    y$g0.n = 1;
                    return i0.collect(y$e0, y$g0) == object1 ? object1 : l0$h0.a;
                }
                catch(kotlinx.coroutines.flow.internal.a a0) {
                    l0$h1 = l0$h0;
                    a1 = a0;
                    y$e1 = y$e0;
                    q.b(a1, y$e1);
                    return l0$h1.a;
                }
            }
            case 1: {
                y$e1 = (e)y$g0.l;
                l0$h1 = (h)y$g0.k;
                try {
                    f0.n(object0);
                    return l0$h1.a;
                }
                catch(kotlinx.coroutines.flow.internal.a a1) {
                }
                q.b(a1, y$e1);
                return l0$h1.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @m
    public static final Object e(@l i i0, Object object0, @l p p0, @l d d0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {40}, m = "fold", n = {"accumulator"}, s = {"L$0"})
        @s0({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$1\n*L\n1#1,168:1\n*E\n"})
        static final class kotlinx.coroutines.flow.y.i extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            kotlinx.coroutines.flow.y.i(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return y.e(null, null, null, this);
            }
        }


        @s0({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$2\n*L\n1#1,168:1\n*E\n"})
        public static final class kotlinx.coroutines.flow.y.j implements j {
            final h a;
            final p b;

            public kotlinx.coroutines.flow.y.j(h l0$h0, p p0) {
                this.a = l0$h0;
                this.b = p0;
                super();
            }

            @m
            public final Object a(Object object0, @l d d0) {
                new kotlinx.coroutines.flow.y.j.a(this, d0);
                this.a.a = this.b.invoke(this.a.a, object0, d0);
                return S0.a;
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", f = "Reduce.kt", i = {}, l = {41}, m = "emit", n = {}, s = {})
                @s0({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$2$emit$1\n*L\n1#1,168:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.y.j.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    Object l;
                    final kotlinx.coroutines.flow.y.j m;
                    int n;

                    public kotlinx.coroutines.flow.y.j.a(kotlinx.coroutines.flow.y.j y$j0, d d0) {
                        this.m = y$j0;
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

                h l0$h1;
                kotlinx.coroutines.flow.y.j.a y$j$a0;
                if(d0 instanceof kotlinx.coroutines.flow.y.j.a) {
                    y$j$a0 = (kotlinx.coroutines.flow.y.j.a)d0;
                    int v = y$j$a0.n;
                    if((v & 0x80000000) == 0) {
                        y$j$a0 = new kotlinx.coroutines.flow.y.j.a(this, d0);
                    }
                    else {
                        y$j$a0.n = v ^ 0x80000000;
                    }
                }
                else {
                    y$j$a0 = new kotlinx.coroutines.flow.y.j.a(this, d0);
                }
                Object object1 = y$j$a0.l;
                Object object2 = kotlin.coroutines.intrinsics.b.l();
                switch(y$j$a0.n) {
                    case 0: {
                        f0.n(object1);
                        h l0$h0 = this.a;
                        y$j$a0.k = l0$h0;
                        y$j$a0.n = 1;
                        Object object3 = this.b.invoke(l0$h0.a, object0, y$j$a0);
                        if(object3 == object2) {
                            return object2;
                        }
                        object1 = object3;
                        l0$h1 = l0$h0;
                        break;
                    }
                    case 1: {
                        l0$h1 = (h)y$j$a0.k;
                        f0.n(object1);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                l0$h1.a = object1;
                return S0.a;
            }
        }

        kotlinx.coroutines.flow.y.i y$i0;
        if(d0 instanceof kotlinx.coroutines.flow.y.i) {
            y$i0 = (kotlinx.coroutines.flow.y.i)d0;
            int v = y$i0.m;
            if((v & 0x80000000) == 0) {
                y$i0 = new kotlinx.coroutines.flow.y.i(d0);
            }
            else {
                y$i0.m = v ^ 0x80000000;
            }
        }
        else {
            y$i0 = new kotlinx.coroutines.flow.y.i(d0);
        }
        Object object1 = y$i0.l;
        Object object2 = kotlin.coroutines.intrinsics.b.l();
        switch(y$i0.m) {
            case 0: {
                f0.n(object1);
                h l0$h0 = new h();
                l0$h0.a = object0;
                kotlinx.coroutines.flow.y.j y$j0 = new kotlinx.coroutines.flow.y.j(l0$h0, p0);
                y$i0.k = l0$h0;
                y$i0.m = 1;
                return i0.collect(y$j0, y$i0) == object2 ? object2 : l0$h0.a;
            }
            case 1: {
                h l0$h1 = (h)y$i0.k;
                f0.n(object1);
                return l0$h1.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private static final Object f(i i0, Object object0, p p0, d d0) {
        h l0$h0 = new h();
        l0$h0.a = object0;
        i0.collect(new kotlinx.coroutines.flow.y.j(l0$h0, p0), d0);
        return l0$h0.a;
    }

    @m
    public static final Object g(@l i i0, @l d d0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {0x97}, m = "last", n = {"result"}, s = {"L$0"})
        static final class kotlinx.coroutines.flow.y.k extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            kotlinx.coroutines.flow.y.k(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return k.S0(null, this);
            }
        }


        static final class kotlinx.coroutines.flow.y.l implements j {
            final h a;

            kotlinx.coroutines.flow.y.l(h l0$h0) {
                this.a = l0$h0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                this.a.a = object0;
                return S0.a;
            }
        }

        h l0$h1;
        kotlinx.coroutines.flow.y.k y$k0;
        if(d0 instanceof kotlinx.coroutines.flow.y.k) {
            y$k0 = (kotlinx.coroutines.flow.y.k)d0;
            int v = y$k0.m;
            if((v & 0x80000000) == 0) {
                y$k0 = new kotlinx.coroutines.flow.y.k(d0);
            }
            else {
                y$k0.m = v ^ 0x80000000;
            }
        }
        else {
            y$k0 = new kotlinx.coroutines.flow.y.k(d0);
        }
        Object object0 = y$k0.l;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(y$k0.m) {
            case 0: {
                f0.n(object0);
                h l0$h0 = new h();
                l0$h0.a = u.a;
                kotlinx.coroutines.flow.y.l y$l0 = new kotlinx.coroutines.flow.y.l(l0$h0);
                y$k0.k = l0$h0;
                y$k0.m = 1;
                if(i0.collect(y$l0, y$k0) == object1) {
                    return object1;
                }
                l0$h1 = l0$h0;
                break;
            }
            case 1: {
                l0$h1 = (h)y$k0.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object2 = l0$h1.a;
        if(object2 == u.a) {
            throw new NoSuchElementException("Expected at least one element");
        }
        return object2;
    }

    @m
    public static final Object h(@l i i0, @l d d0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {0xA3}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
        static final class kotlinx.coroutines.flow.y.m extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            kotlinx.coroutines.flow.y.m(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return k.T0(null, this);
            }
        }


        static final class n implements j {
            final h a;

            n(h l0$h0) {
                this.a = l0$h0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                this.a.a = object0;
                return S0.a;
            }
        }

        kotlinx.coroutines.flow.y.m y$m0;
        if(d0 instanceof kotlinx.coroutines.flow.y.m) {
            y$m0 = (kotlinx.coroutines.flow.y.m)d0;
            int v = y$m0.m;
            if((v & 0x80000000) == 0) {
                y$m0 = new kotlinx.coroutines.flow.y.m(d0);
            }
            else {
                y$m0.m = v ^ 0x80000000;
            }
        }
        else {
            y$m0 = new kotlinx.coroutines.flow.y.m(d0);
        }
        Object object0 = y$m0.l;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(y$m0.m) {
            case 0: {
                f0.n(object0);
                h l0$h0 = new h();
                n y$n0 = new n(l0$h0);
                y$m0.k = l0$h0;
                y$m0.m = 1;
                return i0.collect(y$n0, y$m0) == object1 ? object1 : l0$h0.a;
            }
            case 1: {
                h l0$h1 = (h)y$m0.k;
                f0.n(object0);
                return l0$h1.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @m
    public static final Object i(@l i i0, @l p p0, @l d d0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {18}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
        static final class kotlinx.coroutines.flow.y.o extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            kotlinx.coroutines.flow.y.o(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return k.s1(null, null, this);
            }
        }


        static final class kotlinx.coroutines.flow.y.p implements j {
            final h a;
            final p b;

            kotlinx.coroutines.flow.y.p(h l0$h0, p p0) {
                this.a = l0$h0;
                this.b = p0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {21}, m = "emit", n = {}, s = {})
                static final class kotlinx.coroutines.flow.y.p.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    Object l;
                    final kotlinx.coroutines.flow.y.p m;
                    int n;

                    kotlinx.coroutines.flow.y.p.a(kotlinx.coroutines.flow.y.p y$p0, d d0) {
                        this.m = y$p0;
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

                h l0$h0;
                kotlinx.coroutines.flow.y.p.a y$p$a0;
                if(d0 instanceof kotlinx.coroutines.flow.y.p.a) {
                    y$p$a0 = (kotlinx.coroutines.flow.y.p.a)d0;
                    int v = y$p$a0.n;
                    if((v & 0x80000000) == 0) {
                        y$p$a0 = new kotlinx.coroutines.flow.y.p.a(this, d0);
                    }
                    else {
                        y$p$a0.n = v ^ 0x80000000;
                    }
                }
                else {
                    y$p$a0 = new kotlinx.coroutines.flow.y.p.a(this, d0);
                }
                Object object1 = y$p$a0.l;
                Object object2 = kotlin.coroutines.intrinsics.b.l();
                switch(y$p$a0.n) {
                    case 0: {
                        f0.n(object1);
                        l0$h0 = this.a;
                        Object object3 = l0$h0.a;
                        if(object3 != u.a) {
                            y$p$a0.k = l0$h0;
                            y$p$a0.n = 1;
                            Object object4 = this.b.invoke(object3, object0, y$p$a0);
                            if(object4 == object2) {
                                return object2;
                            }
                            object0 = object4;
                        }
                        break;
                    }
                    case 1: {
                        h l0$h1 = (h)y$p$a0.k;
                        f0.n(object1);
                        l0$h0 = l0$h1;
                        object0 = object1;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                l0$h0.a = object0;
                return S0.a;
            }
        }

        h l0$h1;
        kotlinx.coroutines.flow.y.o y$o0;
        if(d0 instanceof kotlinx.coroutines.flow.y.o) {
            y$o0 = (kotlinx.coroutines.flow.y.o)d0;
            int v = y$o0.m;
            if((v & 0x80000000) == 0) {
                y$o0 = new kotlinx.coroutines.flow.y.o(d0);
            }
            else {
                y$o0.m = v ^ 0x80000000;
            }
        }
        else {
            y$o0 = new kotlinx.coroutines.flow.y.o(d0);
        }
        Object object0 = y$o0.l;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(y$o0.m) {
            case 0: {
                f0.n(object0);
                h l0$h0 = new h();
                l0$h0.a = u.a;
                kotlinx.coroutines.flow.y.p y$p0 = new kotlinx.coroutines.flow.y.p(l0$h0, p0);
                y$o0.k = l0$h0;
                y$o0.m = 1;
                if(i0.collect(y$p0, y$o0) == object1) {
                    return object1;
                }
                l0$h1 = l0$h0;
                break;
            }
            case 1: {
                l0$h1 = (h)y$o0.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object2 = l0$h1.a;
        if(object2 == u.a) {
            throw new NoSuchElementException("Empty flow can\'t be reduced");
        }
        return object2;
    }

    @m
    public static final Object j(@l i i0, @l d d0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {53}, m = "single", n = {"result"}, s = {"L$0"})
        static final class kotlinx.coroutines.flow.y.q extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            int m;

            kotlinx.coroutines.flow.y.q(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.l = object0;
                this.m |= 0x80000000;
                return k.H1(null, this);
            }
        }


        @s0({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$single$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
        static final class r implements j {
            final h a;

            r(h l0$h0) {
                this.a = l0$h0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                h l0$h0 = this.a;
                if(l0$h0.a != u.a) {
                    throw new IllegalArgumentException("Flow has more than one element");
                }
                l0$h0.a = object0;
                return S0.a;
            }
        }

        h l0$h1;
        kotlinx.coroutines.flow.y.q y$q0;
        if(d0 instanceof kotlinx.coroutines.flow.y.q) {
            y$q0 = (kotlinx.coroutines.flow.y.q)d0;
            int v = y$q0.m;
            if((v & 0x80000000) == 0) {
                y$q0 = new kotlinx.coroutines.flow.y.q(d0);
            }
            else {
                y$q0.m = v ^ 0x80000000;
            }
        }
        else {
            y$q0 = new kotlinx.coroutines.flow.y.q(d0);
        }
        Object object0 = y$q0.l;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(y$q0.m) {
            case 0: {
                f0.n(object0);
                h l0$h0 = new h();
                l0$h0.a = u.a;
                r y$r0 = new r(l0$h0);
                y$q0.k = l0$h0;
                y$q0.m = 1;
                if(i0.collect(y$r0, y$q0) == object1) {
                    return object1;
                }
                l0$h1 = l0$h0;
                break;
            }
            case 1: {
                l0$h1 = (h)y$q0.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object2 = l0$h1.a;
        if(object2 == u.a) {
            throw new NoSuchElementException("Flow is empty");
        }
        return object2;
    }

    @m
    public static final Object k(@l i i0, @l d d0) {
        @s0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,138:1\n70#2,7:139\n*E\n"})
        public static final class s implements j {
            final h a;

            public s(h l0$h0) {
                this.a = l0$h0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public Object emit(Object object0, @l d d0) {
                h l0$h0 = this.a;
                V v0 = u.a;
                if(l0$h0.a == v0) {
                    l0$h0.a = object0;
                    return S0.a;
                }
                l0$h0.a = v0;
                throw new kotlinx.coroutines.flow.internal.a(this);
            }
        }


        @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {0xB3}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
        static final class t extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            int n;

            t(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.m = object0;
                this.n |= 0x80000000;
                return k.I1(null, this);
            }
        }

        s y$s1;
        kotlinx.coroutines.flow.internal.a a1;
        h l0$h1;
        t y$t0;
        if(d0 instanceof t) {
            y$t0 = (t)d0;
            int v = y$t0.n;
            if((v & 0x80000000) == 0) {
                y$t0 = new t(d0);
            }
            else {
                y$t0.n = v ^ 0x80000000;
            }
        }
        else {
            y$t0 = new t(d0);
        }
        Object object0 = y$t0.m;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(y$t0.n) {
            case 0: {
                f0.n(object0);
                h l0$h0 = new h();
                l0$h0.a = u.a;
                s y$s0 = new s(l0$h0);
                try {
                    y$t0.k = l0$h0;
                    y$t0.l = y$s0;
                    y$t0.n = 1;
                    if(i0.collect(y$s0, y$t0) == object1) {
                        return object1;
                    }
                    return l0$h0.a == u.a ? null : l0$h0.a;
                }
                catch(kotlinx.coroutines.flow.internal.a a0) {
                    l0$h1 = l0$h0;
                    a1 = a0;
                    y$s1 = y$s0;
                    q.b(a1, y$s1);
                    return l0$h1.a == u.a ? null : l0$h1.a;
                }
            }
            case 1: {
                y$s1 = (s)y$t0.l;
                l0$h1 = (h)y$t0.k;
                try {
                    f0.n(object0);
                    return l0$h1.a == u.a ? null : l0$h1.a;
                }
                catch(kotlinx.coroutines.flow.internal.a a1) {
                }
                q.b(a1, y$s1);
                return l0$h1.a == u.a ? null : l0$h1.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

