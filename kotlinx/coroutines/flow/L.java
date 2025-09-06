package kotlinx.coroutines.flow;

import A3.a;
import java.util.Iterator;
import kotlin.S0;
import kotlin.collections.T;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlin.ranges.o;
import y4.m;

@s0({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,350:1\n105#2:351\n105#2:352\n105#2:353\n105#2:354\n105#2:355\n105#2:356\n105#2:357\n105#2:358\n105#2:359\n105#2:360\n105#2:361\n105#2:362\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n64#1:351\n78#1:352\n85#1:353\n94#1:354\n103#1:355\n118#1:356\n127#1:357\n149#1:358\n160#1:359\n171#1:360\n180#1:361\n189#1:362\n*E\n"})
final class l {
    @y4.l
    public static final i a(@y4.l a a0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,111:1\n65#2,2:112\n*E\n"})
        public static final class b implements i {
            final a a;

            public b(a a0) {
                this.a = a0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@y4.l j j0, @y4.l d d0) {
                Object object0 = j0.emit(this.a.invoke(), d0);
                return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
            }
        }

        return new b(a0);
    }

    @y4.l
    public static final i b(@y4.l Iterable iterable0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n86#2:112\n87#2,2:114\n89#2:117\n1855#3:113\n1856#3:116\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n86#1:113\n86#1:116\n*E\n"})
        public static final class kotlinx.coroutines.flow.l.d implements i {
            final Iterable a;

            public kotlinx.coroutines.flow.l.d(Iterable iterable0) {
                this.a = iterable0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@y4.l j j0, @y4.l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", i = {0}, l = {0x72}, m = "collect", n = {"$this$asFlow_u24lambda_u243"}, s = {"L$0"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.l.d.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final kotlinx.coroutines.flow.l.d m;
                    Object n;
                    Object o;

                    public kotlinx.coroutines.flow.l.d.a(kotlinx.coroutines.flow.l.d l$d0, d d0) {
                        this.m = l$d0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                Iterator iterator0;
                j j1;
                kotlinx.coroutines.flow.l.d.a l$d$a0;
                if(d0 instanceof kotlinx.coroutines.flow.l.d.a) {
                    l$d$a0 = (kotlinx.coroutines.flow.l.d.a)d0;
                    int v = l$d$a0.l;
                    if((v & 0x80000000) == 0) {
                        l$d$a0 = new kotlinx.coroutines.flow.l.d.a(this, d0);
                    }
                    else {
                        l$d$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    l$d$a0 = new kotlinx.coroutines.flow.l.d.a(this, d0);
                }
                Object object0 = l$d$a0.k;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(l$d$a0.l) {
                    case 0: {
                        f0.n(object0);
                        j1 = j0;
                        iterator0 = this.a.iterator();
                        break;
                    }
                    case 1: {
                        iterator0 = (Iterator)l$d$a0.o;
                        j j2 = (j)l$d$a0.n;
                        f0.n(object0);
                        j1 = j2;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    l$d$a0.n = j1;
                    l$d$a0.o = iterator0;
                    l$d$a0.l = 1;
                    if(j1.emit(object2, l$d$a0) == object1) {
                        return object1;
                    }
                    if(false) {
                        break;
                    }
                }
                return S0.a;
            }
        }

        return new kotlinx.coroutines.flow.l.d(iterable0);
    }

    @y4.l
    public static final i c(@y4.l Iterator iterator0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,111:1\n95#2:112\n96#2,2:114\n98#2:117\n32#3:113\n33#3:116\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n95#1:113\n95#1:116\n*E\n"})
        public static final class e implements i {
            final Iterator a;

            public e(Iterator iterator0) {
                this.a = iterator0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@y4.l j j0, @y4.l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", f = "Builders.kt", i = {0}, l = {0x72}, m = "collect", n = {"$this$asFlow_u24lambda_u245"}, s = {"L$0"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.l.e.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final e m;
                    Object n;
                    Object o;

                    public kotlinx.coroutines.flow.l.e.a(e l$e0, d d0) {
                        this.m = l$e0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                Iterator iterator0;
                j j1;
                kotlinx.coroutines.flow.l.e.a l$e$a0;
                if(d0 instanceof kotlinx.coroutines.flow.l.e.a) {
                    l$e$a0 = (kotlinx.coroutines.flow.l.e.a)d0;
                    int v = l$e$a0.l;
                    if((v & 0x80000000) == 0) {
                        l$e$a0 = new kotlinx.coroutines.flow.l.e.a(this, d0);
                    }
                    else {
                        l$e$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    l$e$a0 = new kotlinx.coroutines.flow.l.e.a(this, d0);
                }
                Object object0 = l$e$a0.k;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(l$e$a0.l) {
                    case 0: {
                        f0.n(object0);
                        j1 = j0;
                        iterator0 = this.a;
                        break;
                    }
                    case 1: {
                        iterator0 = (Iterator)l$e$a0.o;
                        j j2 = (j)l$e$a0.n;
                        f0.n(object0);
                        j1 = j2;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    l$e$a0.n = j1;
                    l$e$a0.o = iterator0;
                    l$e$a0.l = 1;
                    if(j1.emit(object2, l$e$a0) == object1) {
                        return object1;
                    }
                    if(false) {
                        break;
                    }
                }
                return S0.a;
            }
        }

        return new e(iterator0);
    }

    @y4.l
    public static final i d(@y4.l Function1 function10) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,111:1\n79#2,2:112\n*E\n"})
        public static final class c implements i {
            final Function1 a;

            public c(Function1 function10) {
                this.a = function10;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@y4.l j j0, @y4.l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", f = "Builders.kt", i = {}, l = {0x70, 0x70}, m = "collect", n = {}, s = {})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.l.c.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final c m;
                    Object n;

                    public kotlinx.coroutines.flow.l.c.a(c l$c0, d d0) {
                        this.m = l$c0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                kotlinx.coroutines.flow.l.c.a l$c$a0;
                if(d0 instanceof kotlinx.coroutines.flow.l.c.a) {
                    l$c$a0 = (kotlinx.coroutines.flow.l.c.a)d0;
                    int v = l$c$a0.l;
                    if((v & 0x80000000) == 0) {
                        l$c$a0 = new kotlinx.coroutines.flow.l.c.a(this, d0);
                    }
                    else {
                        l$c$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    l$c$a0 = new kotlinx.coroutines.flow.l.c.a(this, d0);
                }
                Object object0 = l$c$a0.k;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(l$c$a0.l) {
                    case 0: {
                        f0.n(object0);
                        l$c$a0.n = j0;
                        l$c$a0.l = 1;
                        object0 = this.a.invoke(l$c$a0);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        j0 = (j)l$c$a0.n;
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
                l$c$a0.n = null;
                l$c$a0.l = 2;
                return j0.emit(object0, l$c$a0) == object1 ? object1 : S0.a;
            }
        }

        return new c(function10);
    }

    @y4.l
    public static final i e(@y4.l kotlin.ranges.l l0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n181#2:112\n182#2,2:114\n184#2:117\n1855#3:113\n1856#3:116\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n181#1:113\n181#1:116\n*E\n"})
        public static final class kotlinx.coroutines.flow.l.j implements i {
            final kotlin.ranges.l a;

            public kotlinx.coroutines.flow.l.j(kotlin.ranges.l l0) {
                this.a = l0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@y4.l j j0, @y4.l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {0x72}, m = "collect", n = {"$this$asFlow_u24lambda_u2417"}, s = {"L$0"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.l.j.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final kotlinx.coroutines.flow.l.j m;
                    Object n;
                    Object o;

                    public kotlinx.coroutines.flow.l.j.a(kotlinx.coroutines.flow.l.j l$j0, d d0) {
                        this.m = l$j0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                Iterator iterator0;
                j j1;
                kotlinx.coroutines.flow.l.j.a l$j$a0;
                if(d0 instanceof kotlinx.coroutines.flow.l.j.a) {
                    l$j$a0 = (kotlinx.coroutines.flow.l.j.a)d0;
                    int v = l$j$a0.l;
                    if((v & 0x80000000) == 0) {
                        l$j$a0 = new kotlinx.coroutines.flow.l.j.a(this, d0);
                    }
                    else {
                        l$j$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    l$j$a0 = new kotlinx.coroutines.flow.l.j.a(this, d0);
                }
                Object object0 = l$j$a0.k;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(l$j$a0.l) {
                    case 0: {
                        f0.n(object0);
                        j1 = j0;
                        iterator0 = this.a.iterator();
                        break;
                    }
                    case 1: {
                        iterator0 = (Iterator)l$j$a0.o;
                        j j2 = (j)l$j$a0.n;
                        f0.n(object0);
                        j1 = j2;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(iterator0.hasNext()) {
                    Integer integer0 = kotlin.coroutines.jvm.internal.b.f(((T)iterator0).b());
                    l$j$a0.n = j1;
                    l$j$a0.o = iterator0;
                    l$j$a0.l = 1;
                    if(j1.emit(integer0, l$j$a0) == object1) {
                        return object1;
                    }
                    if(false) {
                        break;
                    }
                }
                return S0.a;
            }
        }

        return new kotlinx.coroutines.flow.l.j(l0);
    }

    @y4.l
    public static final i f(@y4.l o o0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n190#2:112\n191#2,2:114\n193#2:117\n1855#3:113\n1856#3:116\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n190#1:113\n190#1:116\n*E\n"})
        public static final class kotlinx.coroutines.flow.l.a implements i {
            final o a;

            public kotlinx.coroutines.flow.l.a(o o0) {
                this.a = o0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@y4.l j j0, @y4.l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", f = "Builders.kt", i = {0}, l = {0x72}, m = "collect", n = {"$this$asFlow_u24lambda_u2419"}, s = {"L$0"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.l.a.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final kotlinx.coroutines.flow.l.a m;
                    Object n;
                    Object o;

                    public kotlinx.coroutines.flow.l.a.a(kotlinx.coroutines.flow.l.a l$a0, d d0) {
                        this.m = l$a0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                Iterator iterator0;
                j j1;
                kotlinx.coroutines.flow.l.a.a l$a$a0;
                if(d0 instanceof kotlinx.coroutines.flow.l.a.a) {
                    l$a$a0 = (kotlinx.coroutines.flow.l.a.a)d0;
                    int v = l$a$a0.l;
                    if((v & 0x80000000) == 0) {
                        l$a$a0 = new kotlinx.coroutines.flow.l.a.a(this, d0);
                    }
                    else {
                        l$a$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    l$a$a0 = new kotlinx.coroutines.flow.l.a.a(this, d0);
                }
                Object object0 = l$a$a0.k;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(l$a$a0.l) {
                    case 0: {
                        f0.n(object0);
                        j1 = j0;
                        iterator0 = this.a.iterator();
                        break;
                    }
                    case 1: {
                        iterator0 = (Iterator)l$a$a0.o;
                        j j2 = (j)l$a$a0.n;
                        f0.n(object0);
                        j1 = j2;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(iterator0.hasNext()) {
                    Long long0 = kotlin.coroutines.jvm.internal.b.g(((U)iterator0).b());
                    l$a$a0.n = j1;
                    l$a$a0.o = iterator0;
                    l$a$a0.l = 1;
                    if(j1.emit(long0, l$a$a0) == object1) {
                        return object1;
                    }
                    if(false) {
                        break;
                    }
                }
                return S0.a;
            }
        }

        return new kotlinx.coroutines.flow.l.a(o0);
    }

    @y4.l
    public static final i g(@y4.l kotlin.sequences.m m0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,111:1\n104#2:112\n105#2,2:114\n107#2:117\n1313#3:113\n1314#3:116\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n104#1:113\n104#1:116\n*E\n"})
        public static final class kotlinx.coroutines.flow.l.f implements i {
            final kotlin.sequences.m a;

            public kotlinx.coroutines.flow.l.f(kotlin.sequences.m m0) {
                this.a = m0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@y4.l j j0, @y4.l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", f = "Builders.kt", i = {0}, l = {0x72}, m = "collect", n = {"$this$asFlow_u24lambda_u247"}, s = {"L$0"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.l.f.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final kotlinx.coroutines.flow.l.f m;
                    Object n;
                    Object o;

                    public kotlinx.coroutines.flow.l.f.a(kotlinx.coroutines.flow.l.f l$f0, d d0) {
                        this.m = l$f0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                Iterator iterator0;
                j j1;
                kotlinx.coroutines.flow.l.f.a l$f$a0;
                if(d0 instanceof kotlinx.coroutines.flow.l.f.a) {
                    l$f$a0 = (kotlinx.coroutines.flow.l.f.a)d0;
                    int v = l$f$a0.l;
                    if((v & 0x80000000) == 0) {
                        l$f$a0 = new kotlinx.coroutines.flow.l.f.a(this, d0);
                    }
                    else {
                        l$f$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    l$f$a0 = new kotlinx.coroutines.flow.l.f.a(this, d0);
                }
                Object object0 = l$f$a0.k;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(l$f$a0.l) {
                    case 0: {
                        f0.n(object0);
                        j1 = j0;
                        iterator0 = this.a.iterator();
                        break;
                    }
                    case 1: {
                        iterator0 = (Iterator)l$f$a0.o;
                        j j2 = (j)l$f$a0.n;
                        f0.n(object0);
                        j1 = j2;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    l$f$a0.n = j1;
                    l$f$a0.o = iterator0;
                    l$f$a0.l = 1;
                    if(j1.emit(object2, l$f$a0) == object1) {
                        return object1;
                    }
                    if(false) {
                        break;
                    }
                }
                return S0.a;
            }
        }

        return new kotlinx.coroutines.flow.l.f(m0);
    }

    @y4.l
    public static final i h(@y4.l int[] arr_v) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,111:1\n161#2:112\n162#2,2:114\n164#2:117\n13330#3:113\n13331#3:116\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n161#1:113\n161#1:116\n*E\n"})
        public static final class h implements i {
            final int[] a;

            public h(int[] arr_v) {
                this.a = arr_v;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@y4.l j j0, @y4.l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {0x72}, m = "collect", n = {"$this$asFlow_u24lambda_u2413", "$this$forEach$iv"}, s = {"L$0", "L$1"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.l.h.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final h m;
                    Object n;
                    Object o;
                    int p;
                    int q;

                    public kotlinx.coroutines.flow.l.h.a(h l$h0, d d0) {
                        this.m = l$h0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                int v2;
                int v1;
                j j1;
                int[] arr_v;
                kotlinx.coroutines.flow.l.h.a l$h$a0;
                if(d0 instanceof kotlinx.coroutines.flow.l.h.a) {
                    l$h$a0 = (kotlinx.coroutines.flow.l.h.a)d0;
                    int v = l$h$a0.l;
                    if((v & 0x80000000) == 0) {
                        l$h$a0 = new kotlinx.coroutines.flow.l.h.a(this, d0);
                    }
                    else {
                        l$h$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    l$h$a0 = new kotlinx.coroutines.flow.l.h.a(this, d0);
                }
                Object object0 = l$h$a0.k;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(l$h$a0.l) {
                    case 0: {
                        f0.n(object0);
                        arr_v = this.a;
                        j1 = j0;
                        v1 = this.a.length;
                        v2 = 0;
                        goto label_26;
                    }
                    case 1: {
                        v1 = l$h$a0.q;
                        v2 = l$h$a0.p;
                        arr_v = (int[])l$h$a0.o;
                        j j2 = (j)l$h$a0.n;
                        f0.n(object0);
                        j1 = j2;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    ++v2;
                label_26:
                    if(v2 >= v1) {
                        break;
                    }
                    l$h$a0.n = j1;
                    l$h$a0.o = arr_v;
                    l$h$a0.p = v2;
                    l$h$a0.q = v1;
                    l$h$a0.l = 1;
                    if(j1.emit(kotlin.coroutines.jvm.internal.b.f(arr_v[v2]), l$h$a0) != object1) {
                        continue;
                    }
                    return object1;
                }
                return S0.a;
            }
        }

        return new h(arr_v);
    }

    @y4.l
    public static final i i(@y4.l long[] arr_v) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,111:1\n172#2:112\n173#2,2:114\n175#2:117\n13337#3:113\n13338#3:116\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n172#1:113\n172#1:116\n*E\n"})
        public static final class kotlinx.coroutines.flow.l.i implements i {
            final long[] a;

            public kotlinx.coroutines.flow.l.i(long[] arr_v) {
                this.a = arr_v;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@y4.l j j0, @y4.l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {0x72}, m = "collect", n = {"$this$asFlow_u24lambda_u2415", "$this$forEach$iv"}, s = {"L$0", "L$1"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.l.i.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final kotlinx.coroutines.flow.l.i m;
                    Object n;
                    Object o;
                    int p;
                    int q;

                    public kotlinx.coroutines.flow.l.i.a(kotlinx.coroutines.flow.l.i l$i0, d d0) {
                        this.m = l$i0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                int v2;
                int v1;
                j j1;
                long[] arr_v;
                kotlinx.coroutines.flow.l.i.a l$i$a0;
                if(d0 instanceof kotlinx.coroutines.flow.l.i.a) {
                    l$i$a0 = (kotlinx.coroutines.flow.l.i.a)d0;
                    int v = l$i$a0.l;
                    if((v & 0x80000000) == 0) {
                        l$i$a0 = new kotlinx.coroutines.flow.l.i.a(this, d0);
                    }
                    else {
                        l$i$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    l$i$a0 = new kotlinx.coroutines.flow.l.i.a(this, d0);
                }
                Object object0 = l$i$a0.k;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(l$i$a0.l) {
                    case 0: {
                        f0.n(object0);
                        arr_v = this.a;
                        j1 = j0;
                        v1 = this.a.length;
                        v2 = 0;
                        goto label_26;
                    }
                    case 1: {
                        v1 = l$i$a0.q;
                        v2 = l$i$a0.p;
                        arr_v = (long[])l$i$a0.o;
                        j j2 = (j)l$i$a0.n;
                        f0.n(object0);
                        j1 = j2;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    ++v2;
                label_26:
                    if(v2 >= v1) {
                        break;
                    }
                    l$i$a0.n = j1;
                    l$i$a0.o = arr_v;
                    l$i$a0.p = v2;
                    l$i$a0.q = v1;
                    l$i$a0.l = 1;
                    if(j1.emit(kotlin.coroutines.jvm.internal.b.g(arr_v[v2]), l$i$a0) != object1) {
                        continue;
                    }
                    return object1;
                }
                return S0.a;
            }
        }

        return new kotlinx.coroutines.flow.l.i(arr_v);
    }

    @y4.l
    public static final i j(@y4.l Object[] arr_object) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,111:1\n150#2:112\n151#2,2:114\n153#2:117\n13309#3:113\n13310#3:116\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n150#1:113\n150#1:116\n*E\n"})
        public static final class g implements i {
            final Object[] a;

            public g(Object[] arr_object) {
                this.a = arr_object;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@y4.l j j0, @y4.l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0, 0}, l = {0x72}, m = "collect", n = {"$this$asFlow_u24lambda_u2411", "$this$forEach$iv"}, s = {"L$0", "L$1"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.l.g.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final g m;
                    Object n;
                    Object o;
                    int p;
                    int q;

                    public kotlinx.coroutines.flow.l.g.a(g l$g0, d d0) {
                        this.m = l$g0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                int v2;
                int v1;
                j j1;
                Object[] arr_object;
                kotlinx.coroutines.flow.l.g.a l$g$a0;
                if(d0 instanceof kotlinx.coroutines.flow.l.g.a) {
                    l$g$a0 = (kotlinx.coroutines.flow.l.g.a)d0;
                    int v = l$g$a0.l;
                    if((v & 0x80000000) == 0) {
                        l$g$a0 = new kotlinx.coroutines.flow.l.g.a(this, d0);
                    }
                    else {
                        l$g$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    l$g$a0 = new kotlinx.coroutines.flow.l.g.a(this, d0);
                }
                Object object0 = l$g$a0.k;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(l$g$a0.l) {
                    case 0: {
                        f0.n(object0);
                        arr_object = this.a;
                        j1 = j0;
                        v1 = this.a.length;
                        v2 = 0;
                        goto label_26;
                    }
                    case 1: {
                        v1 = l$g$a0.q;
                        v2 = l$g$a0.p;
                        arr_object = (Object[])l$g$a0.o;
                        j j2 = (j)l$g$a0.n;
                        f0.n(object0);
                        j1 = j2;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    ++v2;
                label_26:
                    if(v2 >= v1) {
                        break;
                    }
                    l$g$a0.n = j1;
                    l$g$a0.o = arr_object;
                    l$g$a0.p = v2;
                    l$g$a0.q = v1;
                    l$g$a0.l = 1;
                    if(j1.emit(arr_object[v2], l$g$a0) != object1) {
                        continue;
                    }
                    return object1;
                }
                return S0.a;
            }
        }

        return new g(arr_object);
    }

    @y4.l
    public static final i k(@kotlin.b @y4.l A3.o o0) {
        return new kotlinx.coroutines.flow.b(o0, null, 0, null, 14, null);
    }

    @y4.l
    public static final i l(@kotlin.b @y4.l A3.o o0) {
        return new kotlinx.coroutines.flow.f(o0, null, 0, null, 14, null);
    }

    @y4.l
    public static final i m() {
        return (j j0, d d0) -> S0.a;
    }

    @y4.l
    public static final i n(@kotlin.b @y4.l A3.o o0) {
        return new H(o0);
    }

    @y4.l
    public static final i o(Object object0) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,111:1\n132#2,2:112\n*E\n"})
        public static final class kotlinx.coroutines.flow.l.l implements i {
            final Object a;

            public kotlinx.coroutines.flow.l.l(Object object0) {
                this.a = object0;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@y4.l j j0, @y4.l d d0) {
                Object object0 = j0.emit(this.a, d0);
                return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
            }
        }

        return new kotlinx.coroutines.flow.l.l(object0);
    }

    @y4.l
    public static final i p(@y4.l Object[] arr_object) {
        @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,111:1\n119#2,4:112\n*E\n"})
        public static final class k implements i {
            final Object[] a;

            public k(Object[] arr_object) {
                this.a = arr_object;
                super();
            }

            @Override  // kotlinx.coroutines.flow.i
            @m
            public Object collect(@y4.l j j0, @y4.l d d0) {
                @f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {0x71}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u248"}, s = {"L$0", "L$1"})
                @s0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,111:1\n*E\n"})
                public static final class kotlinx.coroutines.flow.l.k.a extends kotlin.coroutines.jvm.internal.d {
                    Object k;
                    int l;
                    final k m;
                    Object n;
                    Object o;
                    int p;
                    int q;

                    public kotlinx.coroutines.flow.l.k.a(k l$k0, d d0) {
                        this.m = l$k0;
                        super(d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@y4.l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return this.m.collect(null, this);
                    }
                }

                int v2;
                j j1;
                k l$k0;
                int v1;
                kotlinx.coroutines.flow.l.k.a l$k$a0;
                if(d0 instanceof kotlinx.coroutines.flow.l.k.a) {
                    l$k$a0 = (kotlinx.coroutines.flow.l.k.a)d0;
                    int v = l$k$a0.l;
                    if((v & 0x80000000) == 0) {
                        l$k$a0 = new kotlinx.coroutines.flow.l.k.a(this, d0);
                    }
                    else {
                        l$k$a0.l = v ^ 0x80000000;
                    }
                }
                else {
                    l$k$a0 = new kotlinx.coroutines.flow.l.k.a(this, d0);
                }
                Object object0 = l$k$a0.k;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(l$k$a0.l) {
                    case 0: {
                        f0.n(object0);
                        v1 = 0;
                        l$k0 = this;
                        j1 = j0;
                        v2 = this.a.length;
                        goto label_26;
                    }
                    case 1: {
                        v2 = l$k$a0.q;
                        v1 = l$k$a0.p;
                        j j2 = (j)l$k$a0.o;
                        l$k0 = (k)l$k$a0.n;
                        f0.n(object0);
                        j1 = j2;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(true) {
                    ++v1;
                label_26:
                    if(v1 >= v2) {
                        break;
                    }
                    l$k$a0.n = l$k0;
                    l$k$a0.o = j1;
                    l$k$a0.p = v1;
                    l$k$a0.q = v2;
                    l$k$a0.l = 1;
                    if(j1.emit(l$k0.a[v1], l$k$a0) != object1) {
                        continue;
                    }
                    return object1;
                }
                return S0.a;
            }
        }

        return new k(arr_object);
    }
}

