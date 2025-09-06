package kotlin.sequences;

import A3.a;
import A3.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.k;
import kotlin.f0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;

class s extends r {
    @f
    private static final m d(a a0) {
        public static final class kotlin.sequences.s.a implements m {
            final a a;

            public kotlin.sequences.s.a(a a0) {
                this.a = a0;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return (Iterator)this.a.invoke();
            }
        }

        L.p(a0, "iterator");
        return new kotlin.sequences.s.a(a0);
    }

    @l
    public static m e(@l Iterator iterator0) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,22:1\n30#2:23\n*E\n"})
        public static final class b implements m {
            final Iterator a;

            public b(Iterator iterator0) {
                this.a = iterator0;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return this.a;
            }
        }

        L.p(iterator0, "<this>");
        return p.f(new b(iterator0));
    }

    @l
    public static m f(@l m m0) {
        L.p(m0, "<this>");
        return !(m0 instanceof kotlin.sequences.a) ? new kotlin.sequences.a(m0) : m0;
    }

    @l
    public static m g() {
        return g.a;
    }

    @l
    public static final m h(@l m m0, @l o o0, @l Function1 function10) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {350}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
        static final class c extends k implements o {
            Object l;
            int m;
            int n;
            private Object o;
            final m p;
            final o q;
            final Function1 r;

            c(m m0, o o0, Function1 function10, d d0) {
                this.p = m0;
                this.q = o0;
                this.r = function10;
                super(2, d0);
            }

            public final Object a(kotlin.sequences.o o0, d d0) {
                return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new c(this.p, this.q, this.r, d0);
                d1.o = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((kotlin.sequences.o)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                int v;
                Iterator iterator0;
                kotlin.sequences.o o0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.n) {
                    case 0: {
                        f0.n(object0);
                        o0 = (kotlin.sequences.o)this.o;
                        iterator0 = this.p.iterator();
                        v = 0;
                        break;
                    }
                    case 1: {
                        int v1 = this.m;
                        iterator0 = (Iterator)this.l;
                        o0 = (kotlin.sequences.o)this.o;
                        f0.n(object0);
                        v = v1;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    o o1 = this.q;
                    if(v < 0) {
                        u.Z();
                    }
                    Object object3 = o1.invoke(kotlin.coroutines.jvm.internal.b.f(v), object2);
                    Iterator iterator1 = (Iterator)this.r.invoke(object3);
                    this.o = o0;
                    this.l = iterator0;
                    this.m = v + 1;
                    this.n = 1;
                    if(o0.d(iterator1, this) == object1) {
                        return object1;
                    }
                    ++v;
                }
                return S0.a;
            }
        }

        L.p(m0, "source");
        L.p(o0, "transform");
        L.p(function10, "iterator");
        return p.b(new c(m0, o0, function10, null));
    }

    @l
    public static final m i(@l m m0) {
        static final class kotlin.sequences.s.d extends N implements Function1 {
            public static final kotlin.sequences.s.d e;

            static {
                kotlin.sequences.s.d.e = new kotlin.sequences.s.d();
            }

            kotlin.sequences.s.d() {
                super(1);
            }

            public final Iterator a(m m0) {
                L.p(m0, "it");
                return m0.iterator();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((m)object0));
            }
        }

        L.p(m0, "<this>");
        return s.j(m0, kotlin.sequences.s.d.e);
    }

    private static final m j(m m0, Function1 function10) {
        static final class kotlin.sequences.s.f extends N implements Function1 {
            public static final kotlin.sequences.s.f e;

            static {
                kotlin.sequences.s.f.e = new kotlin.sequences.s.f();
            }

            kotlin.sequences.s.f() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public final Object invoke(Object object0) {
                return object0;
            }
        }

        return m0 instanceof z ? ((z)m0).e(function10) : new i(m0, kotlin.sequences.s.f.e, function10);
    }

    @l
    @z3.i(name = "flattenSequenceOfIterable")
    public static final m k(@l m m0) {
        static final class e extends N implements Function1 {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
                super(1);
            }

            public final Iterator a(Iterable iterable0) {
                L.p(iterable0, "it");
                return iterable0.iterator();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Iterable)object0));
            }
        }

        L.p(m0, "<this>");
        return s.j(m0, e.e);
    }

    @l
    public static m l(@l a a0) {
        static final class kotlin.sequences.s.g extends N implements Function1 {
            final a e;

            kotlin.sequences.s.g(a a0) {
                this.e = a0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public final Object invoke(Object object0) {
                L.p(object0, "it");
                return this.e.invoke();
            }
        }

        L.p(a0, "nextFunction");
        return p.f(new j(a0, new kotlin.sequences.s.g(a0)));
    }

    @l
    public static m m(@l a a0, @l Function1 function10) {
        L.p(a0, "seedFunction");
        L.p(function10, "nextFunction");
        return new j(a0, function10);
    }

    @h
    @l
    public static m n(@y4.m Object object0, @l Function1 function10) {
        static final class kotlin.sequences.s.h extends N implements a {
            final Object e;

            kotlin.sequences.s.h(Object object0) {
                this.e = object0;
                super(0);
            }

            @Override  // A3.a
            public final Object invoke() {
                return this.e;
            }
        }

        L.p(function10, "nextFunction");
        return object0 == null ? g.a : new j(new kotlin.sequences.s.h(object0), function10);
    }

    @h0(version = "1.3")
    @l
    public static final m o(@l m m0, @l a a0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
        static final class kotlin.sequences.s.i extends k implements o {
            int l;
            private Object m;
            final m n;
            final a o;

            kotlin.sequences.s.i(m m0, a a0, d d0) {
                this.n = m0;
                this.o = a0;
                super(2, d0);
            }

            public final Object a(kotlin.sequences.o o0, d d0) {
                return ((kotlin.sequences.s.i)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new kotlin.sequences.s.i(this.n, this.o, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((kotlin.sequences.o)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        kotlin.sequences.o o0 = (kotlin.sequences.o)this.m;
                        Iterator iterator0 = this.n.iterator();
                        if(iterator0.hasNext()) {
                            this.l = 1;
                            if(o0.d(iterator0, this) == object1) {
                                return object1;
                            }
                        }
                        else {
                            m m0 = (m)this.o.invoke();
                            this.l = 2;
                            if(o0.f(m0, this) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
                    }
                    case 1: 
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(m0, "<this>");
        L.p(a0, "defaultValue");
        return p.b(new kotlin.sequences.s.i(m0, a0, null));
    }

    @h0(version = "1.3")
    @f
    private static final m p(m m0) {
        return m0 == null ? p.g() : m0;
    }

    @l
    public static m q(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        return kotlin.collections.l.K5(arr_object);
    }

    @h0(version = "1.4")
    @l
    public static final m r(@l m m0) {
        L.p(m0, "<this>");
        return s.s(m0, kotlin.random.f.a);
    }

    @h0(version = "1.4")
    @l
    public static final m s(@l m m0, @l kotlin.random.f f0) {
        @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {0x91}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
        static final class kotlin.sequences.s.j extends k implements o {
            Object l;
            int m;
            private Object n;
            final m o;
            final kotlin.random.f p;

            kotlin.sequences.s.j(m m0, kotlin.random.f f0, d d0) {
                this.o = m0;
                this.p = f0;
                super(2, d0);
            }

            public final Object a(kotlin.sequences.o o0, d d0) {
                return ((kotlin.sequences.s.j)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new kotlin.sequences.s.j(this.o, this.p, d0);
                d1.n = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((kotlin.sequences.o)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                kotlin.sequences.o o1;
                List list0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        kotlin.sequences.o o0 = (kotlin.sequences.o)this.n;
                        list0 = p.d3(this.o);
                        o1 = o0;
                        break;
                    }
                    case 1: {
                        list0 = (List)this.l;
                        o1 = (kotlin.sequences.o)this.n;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(!list0.isEmpty()) {
                    int v = this.p.m(list0.size());
                    Object object2 = u.O0(list0);
                    if(v < list0.size()) {
                        object2 = list0.set(v, object2);
                    }
                    this.n = o1;
                    this.l = list0;
                    this.m = 1;
                    if(o1.a(object2, this) == object1) {
                        return object1;
                    }
                    if(false) {
                        break;
                    }
                }
                return S0.a;
            }
        }

        L.p(m0, "<this>");
        L.p(f0, "random");
        return p.b(new kotlin.sequences.s.j(m0, f0, null));
    }

    @l
    public static final V t(@l m m0) {
        L.p(m0, "<this>");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: m0) {
            arrayList0.add(((V)object0).e());
            arrayList1.add(((V)object0).f());
        }
        return r0.a(arrayList0, arrayList1);
    }
}

