package kotlinx.coroutines.flow;

import A3.p;
import kotlin.S0;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlin.o;
import kotlinx.coroutines.flow.internal.v;
import y4.l;
import y4.m;

@s0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,218:1\n105#2:219\n105#2:220\n105#2:221\n105#2:222\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n46#1:219\n72#1:220\n142#1:221\n177#1:222\n*E\n"})
final class t {
    public static final void b(@l j j0) {
        if(j0 instanceof a0) {
            throw ((a0)j0).a;
        }
    }

    private static final Object c(j j0, p p0, Throwable throwable0, d d0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {0xD4}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
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
                return t.c(null, null, null, this);
            }
        }

        a t$a0;
        if(d0 instanceof a) {
            t$a0 = (a)d0;
            int v = t$a0.m;
            if((v & 0x80000000) == 0) {
                t$a0 = new a(d0);
            }
            else {
                t$a0.m = v ^ 0x80000000;
            }
        }
        else {
            t$a0 = new a(d0);
        }
        Object object0 = t$a0.l;
        Object object1 = b.l();
        switch(t$a0.m) {
            case 0: {
                f0.n(object0);
                try {
                    t$a0.k = throwable0;
                    t$a0.m = 1;
                    if(p0.invoke(j0, throwable0, t$a0) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable1) {
                    goto label_23;
                }
                return S0.a;
            }
            case 1: {
                throwable0 = (Throwable)t$a0.k;
                try {
                    f0.n(object0);
                    return S0.a;
                }
                catch(Throwable throwable1) {
                label_23:
                    if(throwable0 != null && throwable0 != throwable1) {
                        o.a(throwable1, throwable0);
                    }
                    throw throwable1;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @l
    public static final i d(@l i i0, @l p p0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,111:1\n143#2,13:112\n156#2,6:126\n326#3:125\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n155#1:125\n*E\n"})
        public static final class kotlinx.coroutines.flow.t.b implements i {
            final i a;
            final p b;

            public kotlinx.coroutines.flow.t.b(i i0, p p0) {
                this.a = i0;
                this.b = p0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {0x71, 120, 0x7F}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.t.b.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final kotlinx.coroutines.flow.t.b m;
                    Object n;
                    Object o;

                    public kotlinx.coroutines.flow.t.b.a(kotlinx.coroutines.flow.t.b t$b0, d d0) {
                        this.m = t$b0;
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

                v v2;
                Throwable throwable2;
                kotlinx.coroutines.flow.t.b t$b0;
                kotlinx.coroutines.flow.t.b.a t$b$a0;
                if(d0 instanceof kotlinx.coroutines.flow.t.b.a) {
                    t$b$a0 = (kotlinx.coroutines.flow.t.b.a)d0;
                    int v = t$b$a0.l;
                    if((v & 0x80000000) == 0) {
                        t$b$a0 = new kotlinx.coroutines.flow.t.b.a(this, d0);
                    }
                    else {
                        t$b$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    t$b$a0 = new kotlinx.coroutines.flow.t.b.a(this, d0);
                }
                Object object0 = t$b$a0.k;
                Object object1 = b.l();
                switch(t$b$a0.l) {
                    case 0: {
                        f0.n(object0);
                        try {
                            t$b$a0.n = this;
                            t$b$a0.o = j0;
                            t$b$a0.l = 1;
                            if(this.a.collect(j0, t$b$a0) == object1) {
                                return object1;
                            }
                        }
                        catch(Throwable throwable0) {
                            t$b0 = this;
                            goto label_30;
                        }
                        t$b0 = this;
                        goto label_36;
                    }
                    case 1: {
                        j0 = (j)t$b$a0.o;
                        t$b0 = (kotlinx.coroutines.flow.t.b)t$b$a0.n;
                        try {
                            f0.n(object0);
                            goto label_36;
                        }
                        catch(Throwable throwable0) {
                        }
                    label_30:
                        a0 a00 = new a0(throwable0);
                        t$b$a0.n = throwable0;
                        t$b$a0.o = null;
                        t$b$a0.l = 2;
                        if(t.c(a00, t$b0.b, throwable0, t$b$a0) != object1) {
                            throw throwable0;
                        }
                        return object1;
                    label_36:
                        v v1 = new v(j0, t$b$a0.getContext());
                        try {
                            t$b$a0.n = v1;
                            t$b$a0.o = null;
                            t$b$a0.l = 3;
                            if(t$b0.b.invoke(v1, null, t$b$a0) == object1) {
                                return object1;
                            }
                        }
                        catch(Throwable throwable1) {
                            throwable2 = throwable1;
                            v2 = v1;
                            v2.releaseIntercepted();
                            throw throwable2;
                        }
                        v2 = v1;
                        break;
                    }
                    case 2: {
                        throwable0 = (Throwable)t$b$a0.n;
                        f0.n(object0);
                        throw throwable0;
                    }
                    case 3: {
                        v2 = (v)t$b$a0.n;
                        try {
                            f0.n(object0);
                            break;
                        }
                        catch(Throwable throwable2) {
                        }
                        v2.releaseIntercepted();
                        throw throwable2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                v2.releaseIntercepted();
                return S0.a;
            }
        }

        return new kotlinx.coroutines.flow.t.b(i0, p0);
    }

    @l
    public static final i e(@l i i0, @l A3.o o0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,111:1\n178#2,7:112\n185#2,7:120\n326#3:119\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n184#1:119\n*E\n"})
        public static final class c implements i {
            final i a;
            final A3.o b;

            public c(i i0, A3.o o0) {
                this.a = i0;
                this.b = o0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {0x71, 0x79}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u243", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.t.c.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final c m;
                    Object n;
                    Object o;
                    Object p;

                    public kotlinx.coroutines.flow.t.c.a(c t$c0, d d0) {
                        this.m = t$c0;
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

                v v1;
                kotlin.jvm.internal.l0.a l0$a1;
                j j1;
                c t$c0;
                kotlinx.coroutines.flow.t.c.a t$c$a0;
                if(d0 instanceof kotlinx.coroutines.flow.t.c.a) {
                    t$c$a0 = (kotlinx.coroutines.flow.t.c.a)d0;
                    int v = t$c$a0.l;
                    if((v & 0x80000000) == 0) {
                        t$c$a0 = new kotlinx.coroutines.flow.t.c.a(this, d0);
                    }
                    else {
                        t$c$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    t$c$a0 = new kotlinx.coroutines.flow.t.c.a(this, d0);
                }
                Object object0 = t$c$a0.k;
                Object object1 = b.l();
                switch(t$c$a0.l) {
                    case 0: {
                        f0.n(object0);
                        kotlin.jvm.internal.l0.a l0$a0 = new kotlin.jvm.internal.l0.a();
                        l0$a0.a = true;
                        kotlinx.coroutines.flow.t.d t$d0 = new kotlinx.coroutines.flow.t.d(l0$a0, j0);
                        t$c$a0.n = this;
                        t$c$a0.o = j0;
                        t$c$a0.p = l0$a0;
                        t$c$a0.l = 1;
                        if(this.a.collect(t$d0, t$c$a0) == object1) {
                            return object1;
                        }
                        t$c0 = this;
                        j1 = j0;
                        l0$a1 = l0$a0;
                        goto label_31;
                    }
                    case 1: {
                        l0$a1 = (kotlin.jvm.internal.l0.a)t$c$a0.p;
                        j1 = (j)t$c$a0.o;
                        t$c0 = (c)t$c$a0.n;
                        f0.n(object0);
                    label_31:
                        if(l0$a1.a) {
                            v1 = new v(j1, t$c$a0.getContext());
                            try {
                                t$c$a0.n = v1;
                                t$c$a0.o = null;
                                t$c$a0.p = null;
                                t$c$a0.l = 2;
                                if(t$c0.b.invoke(v1, t$c$a0) == object1) {
                                    return object1;
                                }
                            }
                            catch(Throwable throwable0) {
                                v1.releaseIntercepted();
                                throw throwable0;
                            }
                            v1.releaseIntercepted();
                            return S0.a;
                        }
                        break;
                    }
                    case 2: {
                        v1 = (v)t$c$a0.n;
                        try {
                            f0.n(object0);
                        }
                        catch(Throwable throwable0) {
                            v1.releaseIntercepted();
                            throw throwable0;
                        }
                        v1.releaseIntercepted();
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }
        }


        static final class kotlinx.coroutines.flow.t.d implements j {
            final kotlin.jvm.internal.l0.a a;
            final j b;

            kotlinx.coroutines.flow.t.d(kotlin.jvm.internal.l0.a l0$a0, j j0) {
                this.a = l0$a0;
                this.b = j0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {0xB5}, m = "emit", n = {}, s = {})
                static final class kotlinx.coroutines.flow.t.d.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    final kotlinx.coroutines.flow.t.d l;
                    int m;

                    kotlinx.coroutines.flow.t.d.a(kotlinx.coroutines.flow.t.d t$d0, d d0) {
                        this.l = t$d0;
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

                kotlinx.coroutines.flow.t.d.a t$d$a0;
                if(d0 instanceof kotlinx.coroutines.flow.t.d.a) {
                    t$d$a0 = (kotlinx.coroutines.flow.t.d.a)d0;
                    int v = t$d$a0.m;
                    if((v & 0x80000000) == 0) {
                        t$d$a0 = new kotlinx.coroutines.flow.t.d.a(this, d0);
                    }
                    else {
                        t$d$a0.m = v ^ 0x80000000;
                    }
                }
                else {
                    t$d$a0 = new kotlinx.coroutines.flow.t.d.a(this, d0);
                }
                Object object1 = t$d$a0.k;
                Object object2 = b.l();
                switch(t$d$a0.m) {
                    case 0: {
                        f0.n(object1);
                        this.a.a = false;
                        t$d$a0.m = 1;
                        return this.b.emit(object0, t$d$a0) == object2 ? object2 : S0.a;
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

        return new c(i0, o0);
    }

    @l
    public static final i f(@l i i0, @l A3.o o0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,111:1\n73#2:112\n74#2,7:114\n326#3:113\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n73#1:113\n*E\n"})
        public static final class e implements i {
            final A3.o a;
            final i b;

            public e(A3.o o0, i i0) {
                this.a = o0;
                this.b = i0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {0x73, 0x77}, m = "collect", n = {"this", "$this$onStart_u24lambda_u241", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.t.e.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final e m;
                    Object n;
                    Object o;
                    Object p;

                    public kotlinx.coroutines.flow.t.e.a(e t$e0, d d0) {
                        this.m = t$e0;
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

                j j1;
                e t$e0;
                v v2;
                Throwable throwable1;
                kotlinx.coroutines.flow.t.e.a t$e$a0;
                if(d0 instanceof kotlinx.coroutines.flow.t.e.a) {
                    t$e$a0 = (kotlinx.coroutines.flow.t.e.a)d0;
                    int v = t$e$a0.l;
                    if((v & 0x80000000) == 0) {
                        t$e$a0 = new kotlinx.coroutines.flow.t.e.a(this, d0);
                    }
                    else {
                        t$e$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    t$e$a0 = new kotlinx.coroutines.flow.t.e.a(this, d0);
                }
                Object object0 = t$e$a0.k;
                Object object1 = b.l();
                switch(t$e$a0.l) {
                    case 0: {
                        f0.n(object0);
                        v v1 = new v(j0, t$e$a0.getContext());
                        try {
                            t$e$a0.n = this;
                            t$e$a0.o = j0;
                            t$e$a0.p = v1;
                            t$e$a0.l = 1;
                            if(this.a.invoke(v1, t$e$a0) == object1) {
                                return object1;
                            }
                        }
                        catch(Throwable throwable0) {
                            throwable1 = throwable0;
                            v2 = v1;
                            v2.releaseIntercepted();
                            throw throwable1;
                        }
                        t$e0 = this;
                        j1 = j0;
                        v2 = v1;
                        break;
                    }
                    case 1: {
                        v2 = (v)t$e$a0.p;
                        j1 = (j)t$e$a0.o;
                        t$e0 = (e)t$e$a0.n;
                        try {
                            f0.n(object0);
                            break;
                        }
                        catch(Throwable throwable1) {
                        }
                        v2.releaseIntercepted();
                        throw throwable1;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                v2.releaseIntercepted();
                t$e$a0.n = null;
                t$e$a0.o = null;
                t$e$a0.p = null;
                t$e$a0.l = 2;
                return t$e0.b.collect(j1, t$e$a0) == object1 ? object1 : S0.a;
            }
        }

        return new e(o0, i0);
    }

    @l
    public static final i g(@l i i0, @kotlin.b @l p p0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,218:1\n*E\n"})
        public static final class kotlinx.coroutines.flow.t.f extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            private Object l;
            final i m;
            final p n;

            public kotlinx.coroutines.flow.t.f(i i0, p p0, d d0) {
                this.m = i0;
                this.n = p0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new kotlinx.coroutines.flow.t.f(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((j)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l j j0, @m d d0) {
                return ((kotlinx.coroutines.flow.t.f)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @s0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n*L\n1#1,218:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.t.f.a implements j {
                    final p a;
                    final j b;

                    public kotlinx.coroutines.flow.t.f.a(p p0, j j0) {
                        this.a = p0;
                        this.b = j0;
                        super();
                    }

                    @m
                    public final Object a(Object object0, @l d d0) {
                        new kotlinx.coroutines.flow.t.f.a.a(this, d0);
                        this.a.invoke(this.b, object0, d0);
                        return S0.a;
                    }

                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", f = "Emitters.kt", i = {}, l = {38}, m = "emit", n = {}, s = {})
                        @s0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                        public static final class kotlinx.coroutines.flow.t.f.a.a extends kotlin.coroutines.jvm.internal.d {
                            Object k;
                            final kotlinx.coroutines.flow.t.f.a l;
                            int m;

                            public kotlinx.coroutines.flow.t.f.a.a(kotlinx.coroutines.flow.t.f.a t$f$a0, d d0) {
                                this.l = t$f$a0;
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

                        kotlinx.coroutines.flow.t.f.a.a t$f$a$a0;
                        if(d0 instanceof kotlinx.coroutines.flow.t.f.a.a) {
                            t$f$a$a0 = (kotlinx.coroutines.flow.t.f.a.a)d0;
                            int v = t$f$a$a0.m;
                            if((v & 0x80000000) == 0) {
                                t$f$a$a0 = new kotlinx.coroutines.flow.t.f.a.a(this, d0);
                            }
                            else {
                                t$f$a$a0.m = v ^ 0x80000000;
                            }
                        }
                        else {
                            t$f$a$a0 = new kotlinx.coroutines.flow.t.f.a.a(this, d0);
                        }
                        Object object1 = t$f$a$a0.k;
                        Object object2 = b.l();
                        switch(t$f$a$a0.m) {
                            case 0: {
                                f0.n(object1);
                                t$f$a$a0.m = 1;
                                return this.a.invoke(this.b, object0, t$f$a$a0) == object2 ? object2 : S0.a;
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

                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        kotlinx.coroutines.flow.t.f.a t$f$a0 = new kotlinx.coroutines.flow.t.f.a(this.n, ((j)this.l));
                        this.k = 1;
                        return this.m.collect(t$f$a0, this) == object1 ? object1 : S0.a;
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

            @m
            public final Object invokeSuspend$$forInline(@l Object object0) {
                kotlinx.coroutines.flow.t.f.a t$f$a0 = new kotlinx.coroutines.flow.t.f.a(this.n, ((j)this.l));
                this.m.collect(t$f$a0, this);
                return S0.a;
            }
        }

        return k.I0(new kotlinx.coroutines.flow.t.f(i0, p0, null));
    }

    @b0
    @l
    public static final i h(@l i i0, @kotlin.b @l p p0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"})
        public static final class g implements i {
            final i a;
            final p b;

            public g(i i0, p p0) {
                this.a = i0;
                this.b = p0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.t.g.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final g m;

                    public kotlinx.coroutines.flow.t.g.a(g t$g0, d d0) {
                        this.m = t$g0;
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

                h t$h0 = new h(this.b, j0);
                Object object0 = this.a.collect(t$h0, d0);
                return object0 == b.l() ? object0 : S0.a;
            }

            @m
            public Object f(@l j j0, @l d d0) {
                new kotlinx.coroutines.flow.t.g.a(this, d0);
                h t$h0 = new h(this.b, j0);
                this.a.collect(t$h0, d0);
                return S0.a;
            }
        }


        @s0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n*L\n1#1,218:1\n*E\n"})
        public static final class h implements j {
            final p a;
            final j b;

            public h(p p0, j j0) {
                this.a = p0;
                this.b = j0;
                super();
            }

            @m
            public final Object a(Object object0, @l d d0) {
                new kotlinx.coroutines.flow.t.h.a(this, d0);
                this.a.invoke(this.b, object0, d0);
                return S0.a;
            }

            @Override  // kotlinx.coroutines.flow.j
            @m
            public final Object emit(Object object0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", f = "Emitters.kt", i = {}, l = {49}, m = "emit", n = {}, s = {})
                @s0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.t.h.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    final h l;
                    int m;

                    public kotlinx.coroutines.flow.t.h.a(h t$h0, d d0) {
                        this.l = t$h0;
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

                kotlinx.coroutines.flow.t.h.a t$h$a0;
                if(d0 instanceof kotlinx.coroutines.flow.t.h.a) {
                    t$h$a0 = (kotlinx.coroutines.flow.t.h.a)d0;
                    int v = t$h$a0.m;
                    if((v & 0x80000000) == 0) {
                        t$h$a0 = new kotlinx.coroutines.flow.t.h.a(this, d0);
                    }
                    else {
                        t$h$a0.m = v ^ 0x80000000;
                    }
                }
                else {
                    t$h$a0 = new kotlinx.coroutines.flow.t.h.a(this, d0);
                }
                Object object1 = t$h$a0.k;
                Object object2 = b.l();
                switch(t$h$a0.m) {
                    case 0: {
                        f0.n(object1);
                        t$h$a0.m = 1;
                        return this.a.invoke(this.b, object0, t$h$a0) == object2 ? object2 : S0.a;
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

        return new g(i0, p0);
    }
}

