package kotlin.collections;

import A3.o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.sequences.m;
import kotlin.sequences.p;
import y4.l;

public final class p0 {
    public static final void a(int v, int v1) {
        if(v <= 0 || v1 <= 0) {
            throw new IllegalArgumentException((v == v1 ? "size " + v + " must be greater than zero." : "Both size " + v + " and step " + v1 + " must be greater than zero.").toString());
        }
    }

    @l
    public static final Iterator b(@l Iterator iterator0, int v, int v1, boolean z, boolean z1) {
        @f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
        static final class a extends k implements o {
            Object l;
            Object m;
            int n;
            int o;
            private Object p;
            final int q;
            final int r;
            final Iterator s;
            final boolean t;
            final boolean u;

            a(int v, int v1, Iterator iterator0, boolean z, boolean z1, d d0) {
                this.q = v;
                this.r = v1;
                this.s = iterator0;
                this.t = z;
                this.u = z1;
                super(2, d0);
            }

            public final Object a(kotlin.sequences.o o0, d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new a(this.q, this.r, this.s, this.t, this.u, d0);
                d1.p = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((kotlin.sequences.o)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                kotlin.sequences.o o0;
                j0 j00;
                kotlin.sequences.o o1;
                j0 j01;
                Iterator iterator0;
                int v1;
                kotlin.sequences.o o2;
                ArrayList arrayList0;
                Iterator iterator1;
                int v;
                Object object1 = b.l();
                switch(this.o) {
                    case 0: {
                        f0.n(object0);
                        kotlin.sequences.o o3 = (kotlin.sequences.o)this.p;
                        int v2 = s.B(this.q, 0x400);
                        int v3 = this.r - this.q;
                        if(v3 >= 0) {
                            o2 = o3;
                            arrayList0 = new ArrayList(v2);
                            v1 = 0;
                            v = v3;
                            iterator1 = this.s;
                            while(iterator1.hasNext()) {
                                Object object2 = iterator1.next();
                                if(v1 > 0) {
                                    --v1;
                                }
                                else {
                                    arrayList0.add(object2);
                                    if(arrayList0.size() == this.q) {
                                        this.p = o2;
                                        this.l = arrayList0;
                                        this.m = iterator1;
                                        this.n = v;
                                        this.o = 1;
                                        if(o2.a(arrayList0, this) == object1) {
                                            return object1;
                                        }
                                        v1 = v;
                                    label_48:
                                        if(this.t) {
                                            arrayList0.clear();
                                        }
                                        else {
                                            arrayList0 = new ArrayList(this.q);
                                        }
                                        v = v1;
                                    }
                                }
                            }
                            if(!arrayList0.isEmpty() && (this.u || arrayList0.size() == this.q)) {
                                this.p = null;
                                this.l = null;
                                this.m = null;
                                this.o = 2;
                                if(o2.a(arrayList0, this) == object1) {
                                    return object1;
                                }
                            }
                        }
                        else {
                            j01 = new j0(v2);
                            o1 = o3;
                            iterator0 = this.s;
                        label_64:
                            while(iterator0.hasNext()) {
                                Object object3 = iterator0.next();
                                j01.g(object3);
                                if(j01.j()) {
                                    int v4 = this.q;
                                    if(j01.size() < v4) {
                                        j01 = j01.h(v4);
                                    }
                                    else {
                                        j0 j02 = this.t ? j01 : new ArrayList(j01);
                                        this.p = o1;
                                        this.l = j01;
                                        this.m = iterator0;
                                        this.o = 3;
                                        if(o1.a(j02, this) == object1) {
                                            return object1;
                                        }
                                        j01.k(this.r);
                                    }
                                }
                            }
                            if(this.u) {
                                j00 = j01;
                                o0 = o1;
                            label_87:
                                while(j00.size() > this.r) {
                                    j0 j03 = this.t ? j00 : new ArrayList(j00);
                                    this.p = o0;
                                    this.l = j00;
                                    this.m = null;
                                    this.o = 4;
                                    if(o0.a(j03, this) == object1) {
                                        return object1;
                                    }
                                    j00.k(this.r);
                                }
                                if(!j00.isEmpty()) {
                                    this.p = null;
                                    this.l = null;
                                    this.m = null;
                                    this.o = 5;
                                    if(o0.a(j00, this) == object1) {
                                        return object1;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    case 1: {
                        v = this.n;
                        iterator1 = (Iterator)this.m;
                        arrayList0 = (ArrayList)this.l;
                        o2 = (kotlin.sequences.o)this.p;
                        f0.n(object0);
                        v1 = v;
                        goto label_48;
                    }
                    case 3: {
                        iterator0 = (Iterator)this.m;
                        j01 = (j0)this.l;
                        o1 = (kotlin.sequences.o)this.p;
                        f0.n(object0);
                        j01.k(this.r);
                        goto label_64;
                    }
                    case 4: {
                        j00 = (j0)this.l;
                        o0 = (kotlin.sequences.o)this.p;
                        f0.n(object0);
                        j00.k(this.r);
                        goto label_87;
                    }
                    case 2: 
                    case 5: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }
        }

        L.p(iterator0, "iterator");
        return !iterator0.hasNext() ? G.a : p.a(new a(v, v1, iterator0, z1, z, null));
    }

    @l
    public static final m c(@l m m0, int v, int v1, boolean z, boolean z1) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,22:1\n19#2:23\n*E\n"})
        public static final class kotlin.collections.p0.b implements m {
            final m a;
            final int b;
            final int c;
            final boolean d;
            final boolean e;

            public kotlin.collections.p0.b(m m0, int v, int v1, boolean z, boolean z1) {
                this.a = m0;
                this.b = v;
                this.c = v1;
                this.d = z;
                this.e = z1;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return p0.b(this.a.iterator(), this.b, this.c, this.d, this.e);
            }
        }

        L.p(m0, "<this>");
        p0.a(v, v1);
        return new kotlin.collections.p0.b(m0, v, v1, z, z1);
    }
}

