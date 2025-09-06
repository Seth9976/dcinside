package androidx.room;

import A3.p;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.S0;
import kotlin.collections.T;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

@RestrictTo({Scope.b})
@s0({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,253:1\n1#2:254\n13579#3,2:255\n13644#3,3:257\n13644#3,2:260\n11335#3:262\n11670#3,2:263\n11672#3:267\n13646#3:268\n1855#4,2:265\n1726#4,3:269\n1549#4:272\n1620#4,3:273\n1855#4,2:278\n37#5,2:276\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n*L\n85#1:255,2\n87#1:257,3\n96#1:260,2\n118#1:262\n118#1:263,2\n118#1:267\n96#1:268\n120#1:265,2\n141#1:269,3\n151#1:272\n151#1:273,3\n188#1:278,2\n151#1:276,2\n*E\n"})
public final class AmbiguousColumnResolver {
    static final class Match {
        @l
        private final kotlin.ranges.l a;
        @l
        private final List b;

        public Match(@l kotlin.ranges.l l0, @l List list0) {
            L.p(l0, "resultRange");
            L.p(list0, "resultIndices");
            super();
            this.a = l0;
            this.b = list0;
        }

        @l
        public final List a() {
            return this.b;
        }

        @l
        public final kotlin.ranges.l b() {
            return this.a;
        }
    }

    static final class ResultColumn {
        @l
        private final String a;
        private final int b;

        public ResultColumn(@l String s, int v) {
            L.p(s, "name");
            super();
            this.a = s;
            this.b = v;
        }

        @l
        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        @l
        public final ResultColumn c(@l String s, int v) {
            L.p(s, "name");
            return new ResultColumn(s, v);
        }

        public static ResultColumn d(ResultColumn ambiguousColumnResolver$ResultColumn0, String s, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = ambiguousColumnResolver$ResultColumn0.a;
            }
            if((v1 & 2) != 0) {
                v = ambiguousColumnResolver$ResultColumn0.b;
            }
            return ambiguousColumnResolver$ResultColumn0.c(s, v);
        }

        public final int e() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ResultColumn)) {
                return false;
            }
            return L.g(this.a, ((ResultColumn)object0).a) ? this.b == ((ResultColumn)object0).b : false;
        }

        @l
        public final String f() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + this.b;
        }

        @Override
        @l
        public String toString() {
            return "ResultColumn(name=" + this.a + ", index=" + this.b + ')';
        }
    }

    static final class Solution implements Comparable {
        @s0({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1#2:254\n1774#3,3:255\n1855#3,2:258\n1777#3:260\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n*L\n232#1:255,3\n234#1:258,2\n232#1:260\n*E\n"})
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @l
            public final Solution a(@l List list0) {
                L.p(list0, "matches");
                int v = 0;
                int v1 = 0;
                for(Object object0: list0) {
                    v1 += ((Match)object0).b().h() - ((Match)object0).b().g() + 1 - ((Match)object0).a().size();
                }
                Iterator iterator1 = list0.iterator();
                if(!iterator1.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object object1 = iterator1.next();
                int v2 = ((Match)object1).b().g();
                while(iterator1.hasNext()) {
                    Object object2 = iterator1.next();
                    int v3 = ((Match)object2).b().g();
                    if(v2 > v3) {
                        v2 = v3;
                    }
                }
                Iterator iterator2 = list0.iterator();
                if(!iterator2.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object object3 = iterator2.next();
                int v4 = ((Match)object3).b().h();
                while(iterator2.hasNext()) {
                    Object object4 = iterator2.next();
                    int v5 = ((Match)object4).b().h();
                    if(v4 < v5) {
                        v4 = v5;
                    }
                }
                kotlin.ranges.l l0 = new kotlin.ranges.l(v2, v4);
                if(!(l0 instanceof Collection) || !((Collection)l0).isEmpty()) {
                    int v6 = 0;
                    Iterator iterator3 = l0.iterator();
                label_32:
                    while(iterator3.hasNext()) {
                        int v7 = ((T)iterator3).b();
                        int v8 = 0;
                        Iterator iterator4 = list0.iterator();
                        do {
                            if(!iterator4.hasNext()) {
                                continue label_32;
                            }
                            Object object5 = iterator4.next();
                            if(((Match)object5).b().l(v7)) {
                                ++v8;
                            }
                        }
                        while(v8 <= 1);
                        ++v6;
                        if(v6 < 0) {
                            u.Y();
                        }
                    }
                    v = v6;
                }
                return new Solution(list0, v1, v);
            }

            @l
            public final Solution b() {
                return (Object object0) -> this.b(((Solution)object0));
            }
        }

        @l
        private final List a;
        private final int b;
        private final int c;
        @l
        public static final Companion d;
        @l
        private static final Solution e;

        static {
            Solution.d = new Companion(null);
            Solution.e = new Solution(u.H(), 0x7FFFFFFF, 0x7FFFFFFF);
        }

        public Solution(@l List list0, int v, int v1) {
            L.p(list0, "matches");
            super();
            this.a = list0;
            this.b = v;
            this.c = v1;
        }

        public int b(@l Solution ambiguousColumnResolver$Solution0) {
            L.p(ambiguousColumnResolver$Solution0, "other");
            int v = L.t(this.c, ambiguousColumnResolver$Solution0.c);
            return v == 0 ? L.t(this.b, ambiguousColumnResolver$Solution0.b) : v;
        }

        public final int c() {
            return this.b;
        }

        // 检测为 Lambda 实现
        @Override
        public int compareTo(Object object0) [...]

        @l
        public final List d() {
            return this.a;
        }

        public final int e() {
            return this.c;
        }
    }

    @l
    public static final AmbiguousColumnResolver a;

    static {
        AmbiguousColumnResolver.a = new AmbiguousColumnResolver();
    }

    private final void a(List list0, List list1, int v, Function1 function10) {
        if(v == list0.size()) {
            function10.invoke(u.V5(list1));
            return;
        }
        for(Object object0: ((Iterable)list0.get(v))) {
            list1.add(object0);
            AmbiguousColumnResolver.a.a(list0, list1, v + 1, function10);
            u.O0(list1);
        }
    }

    static void b(AmbiguousColumnResolver ambiguousColumnResolver0, List list0, List list1, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            list1 = new ArrayList();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        ambiguousColumnResolver0.a(list0, list1, v, function10);
    }

    private final void c(List list0, String[] arr_s, p p0) {
        int v = 0;
        int v2 = 0;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            v2 += arr_s[v1].hashCode();
        }
        int v3 = arr_s.length;
        int v4 = 0;
        for(Object object0: list0.subList(0, v3)) {
            v4 += ((ResultColumn)object0).f().hashCode();
        }
        while(true) {
            if(v2 == v4) {
                p0.invoke(v, v3, list0.subList(v, v3));
            }
            if(v3 + 1 > list0.size()) {
                break;
            }
            v4 = v4 - ((ResultColumn)list0.get(v)).f().hashCode() + ((ResultColumn)list0.get(v3)).f().hashCode();
            ++v;
            ++v3;
        }
    }

    @l
    @n
    public static final int[][] d(@l String[] arr_s, @l String[][] arr2_s) {
        L.p(arr_s, "resultColumns");
        L.p(arr2_s, "mappings");
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(s.charAt(0) == 0x60 && s.charAt(s.length() - 1) == 0x60) {
                s = s.substring(1, s.length() - 1);
                L.o(s, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale locale0 = Locale.US;
            L.o(locale0, "US");
            String s1 = s.toLowerCase(locale0);
            L.o(s1, "this as java.lang.String).toLowerCase(locale)");
            arr_s[v] = s1;
        }
        for(int v1 = 0; v1 < arr2_s.length; ++v1) {
            int v2 = arr2_s[v1].length;
            for(int v3 = 0; v3 < v2; ++v3) {
                String[] arr_s1 = arr2_s[v1];
                String s2 = arr_s1[v3];
                Locale locale1 = Locale.US;
                L.o(locale1, "US");
                String s3 = s2.toLowerCase(locale1);
                L.o(s3, "this as java.lang.String).toLowerCase(locale)");
                arr_s1[v3] = s3;
            }
        }
        Set set0 = k0.d();
        for(int v4 = 0; v4 < arr2_s.length; ++v4) {
            u.s0(set0, arr2_s[v4]);
        }
        Set set1 = k0.a(set0);
        List list0 = u.i();
        int v5 = 0;
        for(int v6 = 0; v5 < arr_s.length; ++v6) {
            String s4 = arr_s[v5];
            if(set1.contains(s4)) {
                list0.add(new ResultColumn(s4, v6));
            }
            ++v5;
        }
        List list1 = u.a(list0);
        ArrayList arrayList0 = new ArrayList(arr2_s.length);
        for(int v7 = 0; v7 < arr2_s.length; ++v7) {
            arrayList0.add(new ArrayList());
        }
        int v8 = 0;
        for(int v9 = 0; v8 < arr2_s.length; ++v9) {
            String[] arr_s2 = arr2_s[v8];
            androidx.room.AmbiguousColumnResolver.resolve.1.1 ambiguousColumnResolver$resolve$1$10 = new p(arr_s2, arrayList0, v9) {
                final String[] e;
                final List f;
                final int g;

                {
                    this.e = arr_s;
                    this.f = list0;
                    this.g = v;
                    super(3);
                }

                public final void a(int v, int v1, @l List list0) {
                    L.p(list0, "resultColumnsSublist");
                    String[] arr_s = this.e;
                    ArrayList arrayList0 = new ArrayList(arr_s.length);
                    int v2 = 0;
                    while(v2 < arr_s.length) {
                        String s = arr_s[v2];
                        for(Object object0: list0) {
                            if(!L.g(s, ((ResultColumn)object0).a())) {
                                continue;
                            }
                            goto label_12;
                        }
                        object0 = null;
                    label_12:
                        if(((ResultColumn)object0) != null) {
                            arrayList0.add(((ResultColumn)object0).e());
                            ++v2;
                            continue;
                        }
                        return;
                    }
                    ((List)this.f.get(this.g)).add(new Match(new kotlin.ranges.l(v, v1 - 1), arrayList0));
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.a(((Number)object0).intValue(), ((Number)object1).intValue(), ((List)object2));
                    return S0.a;
                }
            };
            AmbiguousColumnResolver.a.c(list1, arr_s2, ambiguousColumnResolver$resolve$1$10);
            if(((List)arrayList0.get(v9)).isEmpty()) {
                ArrayList arrayList1 = new ArrayList(arr_s2.length);
                int v10 = arr_s2.length;
                for(int v11 = 0; v11 < v10; ++v11) {
                    String s5 = arr_s2[v11];
                    List list2 = u.i();
                    for(Object object0: list1) {
                        ResultColumn ambiguousColumnResolver$ResultColumn0 = (ResultColumn)object0;
                        if(L.g(s5, ambiguousColumnResolver$ResultColumn0.f())) {
                            list2.add(ambiguousColumnResolver$ResultColumn0.e());
                        }
                    }
                    List list3 = u.a(list2);
                    if(list3.isEmpty()) {
                        throw new IllegalStateException(("Column " + s5 + " not found in result").toString());
                    }
                    arrayList1.add(list3);
                }
                androidx.room.AmbiguousColumnResolver.resolve.1.2 ambiguousColumnResolver$resolve$1$20 = new Function1(arrayList0, v9) {
                    final List e;
                    final int f;

                    {
                        this.e = list0;
                        this.f = v;
                        super(1);
                    }

                    public final void a(@l List list0) {
                        L.p(list0, "indices");
                        Iterator iterator0 = list0.iterator();
                        if(!iterator0.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object object0 = iterator0.next();
                        int v = ((Number)object0).intValue();
                        while(iterator0.hasNext()) {
                            Object object1 = iterator0.next();
                            int v1 = ((Number)object1).intValue();
                            if(v > v1) {
                                v = v1;
                            }
                        }
                        Iterator iterator1 = list0.iterator();
                        if(!iterator1.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object object2 = iterator1.next();
                        int v2 = ((Number)object2).intValue();
                        while(iterator1.hasNext()) {
                            Object object3 = iterator1.next();
                            int v3 = ((Number)object3).intValue();
                            if(v2 < v3) {
                                v2 = v3;
                            }
                        }
                        ((List)this.e.get(this.f)).add(new Match(new kotlin.ranges.l(v, v2), list0));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((List)object0));
                        return S0.a;
                    }
                };
                AmbiguousColumnResolver.b(AmbiguousColumnResolver.a, arrayList1, null, 0, ambiguousColumnResolver$resolve$1$20, 6, null);
            }
            ++v8;
        }
        if(!arrayList0.isEmpty()) {
            for(Object object1: arrayList0) {
                if(((List)object1).isEmpty()) {
                    throw new IllegalStateException("Failed to find matches for all mappings");
                }
                if(false) {
                    break;
                }
            }
        }
        h l0$h0 = new h();
        l0$h0.a = Solution.d.b();
        androidx.room.AmbiguousColumnResolver.resolve.4 ambiguousColumnResolver$resolve$40 = new Function1(l0$h0) {
            final h e;

            {
                this.e = l0$h0;
                super(1);
            }

            public final void a(@l List list0) {
                L.p(list0, "it");
                Solution ambiguousColumnResolver$Solution0 = Solution.d.a(list0);
                if(ambiguousColumnResolver$Solution0.b(((Solution)this.e.a)) < 0) {
                    this.e.a = ambiguousColumnResolver$Solution0;
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((List)object0));
                return S0.a;
            }
        };
        AmbiguousColumnResolver.b(AmbiguousColumnResolver.a, arrayList0, null, 0, ambiguousColumnResolver$resolve$40, 6, null);
        Iterable iterable0 = ((Solution)l0$h0.a).d();
        ArrayList arrayList2 = new ArrayList(u.b0(iterable0, 10));
        for(Object object2: iterable0) {
            arrayList2.add(u.U5(((Match)object2).a()));
        }
        return (int[][])arrayList2.toArray(new int[0][]);
    }
}

