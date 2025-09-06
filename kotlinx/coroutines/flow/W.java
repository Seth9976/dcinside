package kotlinx.coroutines.flow;

import A3.o;
import A3.p;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.internal.Y;
import kotlinx.coroutines.x0;
import kotlinx.coroutines.y0;
import y4.l;
import y4.m;

@s0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n49#2:215\n51#2:219\n49#2:220\n51#2:224\n46#3:216\n51#3:218\n46#3:221\n51#3:223\n105#4:217\n105#4:222\n105#4:225\n1#5:226\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n43#1:215\n43#1:219\n70#1:220\n70#1:224\n43#1:216\n43#1:218\n70#1:221\n70#1:223\n43#1:217\n70#1:222\n78#1:225\n*E\n"})
final class w {
    private static final int a;

    static {
        w.a = Y.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, 0x7FFFFFFF);
    }

    @x0
    @l
    public static final i a(@l i i0, @l o o0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"})
        public static final class a implements i {
            final i a;
            final o b;

            public a(i i0, o o0) {
                this.a = i0;
                this.b = o0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                @s0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n50#2:219\n*E\n"})
                public static final class kotlinx.coroutines.flow.w.a.a implements j {
                    final j a;
                    final o b;

                    public kotlinx.coroutines.flow.w.a.a(j j0, o o0) {
                        this.a = j0;
                        this.b = o0;
                        super();
                    }

                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        @f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {0xDB, 0xDB}, m = "emit", n = {}, s = {})
                        @s0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                        public static final class kotlinx.coroutines.flow.w.a.a.a extends kotlin.coroutines.jvm.internal.d {
                            Object k;
                            int l;
                            Object m;
                            final kotlinx.coroutines.flow.w.a.a n;

                            public kotlinx.coroutines.flow.w.a.a.a(kotlinx.coroutines.flow.w.a.a w$a$a0, d d0) {
                                this.n = w$a$a0;
                                super(d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                this.k = object0;
                                this.l |= 0x80000000;
                                return this.n.emit(null, this);
                            }
                        }

                        j j1;
                        kotlinx.coroutines.flow.w.a.a.a w$a$a$a0;
                        if(d0 instanceof kotlinx.coroutines.flow.w.a.a.a) {
                            w$a$a$a0 = (kotlinx.coroutines.flow.w.a.a.a)d0;
                            int v = w$a$a$a0.l;
                            if((v & 0x80000000) == 0) {
                                w$a$a$a0 = new kotlinx.coroutines.flow.w.a.a.a(this, d0);
                            }
                            else {
                                w$a$a$a0.l = v ^ 0x80000000;
                            }
                        }
                        else {
                            w$a$a$a0 = new kotlinx.coroutines.flow.w.a.a.a(this, d0);
                        }
                        Object object1 = w$a$a$a0.k;
                        Object object2 = b.l();
                        switch(w$a$a$a0.l) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.a;
                                w$a$a$a0.m = j0;
                                w$a$a$a0.l = 1;
                                Object object3 = this.b.invoke(object0, w$a$a$a0);
                                if(object3 == object2) {
                                    return object2;
                                }
                                object1 = object3;
                                j1 = j0;
                                break;
                            }
                            case 1: {
                                j1 = (j)w$a$a$a0.m;
                                f0.n(object1);
                                break;
                            }
                            case 2: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        w$a$a$a0.m = null;
                        w$a$a$a0.l = 2;
                        return j1.emit(object1, w$a$a$a0) == object2 ? object2 : S0.a;
                    }
                }

                kotlinx.coroutines.flow.w.a.a w$a$a0 = new kotlinx.coroutines.flow.w.a.a(j0, this.b);
                Object object0 = this.a.collect(w$a$a0, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }

        return k.F0(new a(i0, o0));
    }

    @x0
    @l
    public static final i b(@l i i0, @kotlin.b @l o o0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {0xBD, 0xBD}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n*L\n1#1,214:1\n*E\n"})
        public static final class kotlinx.coroutines.flow.w.b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            private Object l;
            Object m;
            final o n;

            public kotlinx.coroutines.flow.w.b(o o0, d d0) {
                this.n = o0;
                super(3, d0);
            }

            @m
            public final Object a(@l j j0, Object object0, @m d d0) {
                kotlinx.coroutines.flow.w.b w$b0 = new kotlinx.coroutines.flow.w.b(this.n, d0);
                w$b0.l = j0;
                w$b0.m = object0;
                return w$b0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((j)object0), object1, ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                j j0;
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        j0 = (j)this.l;
                        this.l = j0;
                        this.k = 1;
                        object0 = this.n.invoke(this.m, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        j0 = (j)this.l;
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                this.l = null;
                this.k = 2;
                return k.m0(j0, ((i)object0), this) == object1 ? object1 : S0.a;
            }

            @m
            public final Object invokeSuspend$$forInline(@l Object object0) {
                k.m0(((j)this.l), ((i)this.n.invoke(this.m, this)), this);
                return S0.a;
            }
        }

        return k.c2(i0, new kotlinx.coroutines.flow.w.b(o0, null));
    }

    @x0
    @l
    public static final i c(@l i i0, int v, @l o o0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n47#2,5:112\n*E\n"})
        public static final class c implements i {
            final i a;
            final o b;

            public c(i i0, o o0) {
                this.a = i0;
                this.b = o0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                @s0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n50#2:219\n*E\n"})
                public static final class kotlinx.coroutines.flow.w.c.a implements j {
                    final j a;
                    final o b;

                    public kotlinx.coroutines.flow.w.c.a(j j0, o o0) {
                        this.a = j0;
                        this.b = o0;
                        super();
                    }

                    @Override  // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(Object object0, @l d d0) {
                        @f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {0xDB, 0xDB}, m = "emit", n = {}, s = {})
                        @s0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                        public static final class kotlinx.coroutines.flow.w.c.a.a extends kotlin.coroutines.jvm.internal.d {
                            Object k;
                            int l;
                            Object m;
                            final kotlinx.coroutines.flow.w.c.a n;

                            public kotlinx.coroutines.flow.w.c.a.a(kotlinx.coroutines.flow.w.c.a w$c$a0, d d0) {
                                this.n = w$c$a0;
                                super(d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                this.k = object0;
                                this.l |= 0x80000000;
                                return this.n.emit(null, this);
                            }
                        }

                        j j1;
                        kotlinx.coroutines.flow.w.c.a.a w$c$a$a0;
                        if(d0 instanceof kotlinx.coroutines.flow.w.c.a.a) {
                            w$c$a$a0 = (kotlinx.coroutines.flow.w.c.a.a)d0;
                            int v = w$c$a$a0.l;
                            if((v & 0x80000000) == 0) {
                                w$c$a$a0 = new kotlinx.coroutines.flow.w.c.a.a(this, d0);
                            }
                            else {
                                w$c$a$a0.l = v ^ 0x80000000;
                            }
                        }
                        else {
                            w$c$a$a0 = new kotlinx.coroutines.flow.w.c.a.a(this, d0);
                        }
                        Object object1 = w$c$a$a0.k;
                        Object object2 = b.l();
                        switch(w$c$a$a0.l) {
                            case 0: {
                                f0.n(object1);
                                j j0 = this.a;
                                w$c$a$a0.m = j0;
                                w$c$a$a0.l = 1;
                                Object object3 = this.b.invoke(object0, w$c$a$a0);
                                if(object3 == object2) {
                                    return object2;
                                }
                                object1 = object3;
                                j1 = j0;
                                break;
                            }
                            case 1: {
                                j1 = (j)w$c$a$a0.m;
                                f0.n(object1);
                                break;
                            }
                            case 2: {
                                f0.n(object1);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        w$c$a$a0.m = null;
                        w$c$a$a0.l = 2;
                        return j1.emit(object1, w$c$a$a0) == object2 ? object2 : S0.a;
                    }
                }

                kotlinx.coroutines.flow.w.c.a w$c$a0 = new kotlinx.coroutines.flow.w.c.a(j0, this.b);
                Object object0 = this.a.collect(w$c$a0, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }

        return k.G0(new c(i0, o0), v);
    }

    public static i d(i i0, int v, o o0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = w.a;
        }
        return k.C0(i0, v, o0);
    }

    @x0
    @l
    public static final i e(@l i i0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,111:1\n79#2,2:112\n*E\n"})
        public static final class kotlinx.coroutines.flow.w.d implements i {
            final i a;

            public kotlinx.coroutines.flow.w.d(i i0) {
                this.a = i0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@l j j0, @l d d0) {
                e w$e0 = new e(j0);
                Object object0 = this.a.collect(w$e0, d0);
                return object0 == b.l() ? object0 : S0.a;
            }
        }


        static final class e implements j {
            final j a;

            e(j j0) {
                this.a = j0;
                super();
            }

            @m
            public final Object a(@l i i0, @l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {0x4F}, m = "emit", n = {}, s = {})
                static final class kotlinx.coroutines.flow.w.e.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    final e l;
                    int m;

                    kotlinx.coroutines.flow.w.e.a(e w$e0, d d0) {
                        this.l = w$e0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.m |= 0x80000000;
                        return this.l.a(null, this);
                    }
                }

                kotlinx.coroutines.flow.w.e.a w$e$a0;
                if(d0 instanceof kotlinx.coroutines.flow.w.e.a) {
                    w$e$a0 = (kotlinx.coroutines.flow.w.e.a)d0;
                    int v = w$e$a0.m;
                    if((v & 0x80000000) == 0) {
                        w$e$a0 = new kotlinx.coroutines.flow.w.e.a(this, d0);
                    }
                    else {
                        w$e$a0.m = v ^ 0x80000000;
                    }
                }
                else {
                    w$e$a0 = new kotlinx.coroutines.flow.w.e.a(this, d0);
                }
                Object object0 = w$e$a0.k;
                Object object1 = b.l();
                switch(w$e$a0.m) {
                    case 0: {
                        f0.n(object0);
                        w$e$a0.m = 1;
                        return k.m0(this.a, i0, w$e$a0) == object1 ? object1 : S0.a;
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

            @Override  // kotlinx.coroutines.flow.j
            public Object emit(Object object0, d d0) {
                return this.a(((i)object0), d0);
            }
        }

        return new kotlinx.coroutines.flow.w.d(i0);
    }

    @x0
    @l
    public static final i f(@l i i0, int v) {
        if(v <= 0) {
            throw new IllegalArgumentException(("Expected positive concurrency level, but had " + v).toString());
        }
        return v == 1 ? k.F0(i0) : new g(i0, v, null, 0, null, 28, null);
    }

    public static i g(i i0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = w.a;
        }
        return k.G0(i0, v);
    }

    public static final int h() [...] // 潜在的解密器

    @y0
    public static void i() {
    }

    @y0
    public static void j() {
    }

    @x0
    @l
    public static final i k(@l i i0, @kotlin.b @l o o0) {
        @f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {0xD5, 0xD5}, m = "invokeSuspend", n = {}, s = {})
        static final class kotlinx.coroutines.flow.w.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            private Object l;
            Object m;
            final o n;

            kotlinx.coroutines.flow.w.f(o o0, d d0) {
                this.n = o0;
                super(3, d0);
            }

            @m
            public final Object a(@l j j0, Object object0, @m d d0) {
                kotlinx.coroutines.flow.w.f w$f0 = new kotlinx.coroutines.flow.w.f(this.n, d0);
                w$f0.l = j0;
                w$f0.m = object0;
                return w$f0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((j)object0), object1, ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                j j0;
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        j0 = (j)this.l;
                        this.l = j0;
                        this.k = 1;
                        object0 = this.n.invoke(this.m, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        j0 = (j)this.l;
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                this.l = null;
                this.k = 2;
                return j0.emit(object0, this) == object1 ? object1 : S0.a;
            }
        }

        return k.c2(i0, new kotlinx.coroutines.flow.w.f(o0, null));
    }

    @l
    public static final i l(@l Iterable iterable0) {
        return new kotlinx.coroutines.flow.internal.k(iterable0, null, 0, null, 14, null);
    }

    @l
    public static final i m(@l i[] arr_i) {
        return k.Y0(kotlin.collections.l.B5(arr_i));
    }

    @x0
    @l
    public static final i n(@l i i0, @kotlin.b @l p p0) {
        return new kotlinx.coroutines.flow.internal.j(p0, i0, null, 0, null, 28, null);
    }
}

