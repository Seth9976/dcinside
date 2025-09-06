package androidx.compose.runtime.snapshots;

import A3.o;
import B3.a;
import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.sequences.p;
import y4.l;
import y4.m;

@Immutable
@s0({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n13600#2,2:398\n1789#3,3:400\n1789#3,3:403\n1789#3,3:406\n1789#3,3:409\n1789#3,3:412\n1549#3:415\n1620#3,3:416\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n107#1:398,2\n236#1:400,3\n257#1:403,3\n261#1:406,3\n283#1:409,3\n286#1:412,3\n343#1:415\n343#1:416,3\n*E\n"})
public final class SnapshotIdSet implements a, Iterable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final SnapshotIdSet a() {
            return SnapshotIdSet.f;
        }
    }

    private final long a;
    private final long b;
    private final int c;
    @m
    private final int[] d;
    @l
    public static final Companion e;
    @l
    private static final SnapshotIdSet f;

    static {
        SnapshotIdSet.e = new Companion(null);
        SnapshotIdSet.f = new SnapshotIdSet(0L, 0L, 0, null);
    }

    private SnapshotIdSet(long v, long v1, int v2, int[] arr_v) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = arr_v;
    }

    @l
    public final SnapshotIdSet h(@l SnapshotIdSet snapshotIdSet0) {
        L.p(snapshotIdSet0, "bits");
        SnapshotIdSet snapshotIdSet1 = SnapshotIdSet.f;
        if(L.g(snapshotIdSet0, snapshotIdSet1)) {
            return snapshotIdSet1;
        }
        if(L.g(this, snapshotIdSet1)) {
            return snapshotIdSet1;
        }
        int v = this.c;
        if(snapshotIdSet0.c == v) {
            int[] arr_v = this.d;
            if(snapshotIdSet0.d == arr_v) {
                return (this.a & snapshotIdSet0.a) == 0L && (this.b & snapshotIdSet0.b) == 0L && arr_v == null ? snapshotIdSet1 : new SnapshotIdSet(snapshotIdSet0.a & this.a, this.b & snapshotIdSet0.b, v, arr_v);
            }
        }
        if(this.d == null) {
            for(Object object0: this) {
                int v1 = ((Number)object0).intValue();
                if(snapshotIdSet0.l(v1)) {
                    snapshotIdSet1 = snapshotIdSet1.p(v1);
                }
            }
            return snapshotIdSet1;
        }
        for(Object object1: snapshotIdSet0) {
            int v2 = ((Number)object1).intValue();
            if(this.l(v2)) {
                snapshotIdSet1 = snapshotIdSet1.p(v2);
            }
        }
        return snapshotIdSet1;
    }

    @l
    public final SnapshotIdSet i(@l SnapshotIdSet snapshotIdSet0) {
        L.p(snapshotIdSet0, "bits");
        SnapshotIdSet snapshotIdSet1 = SnapshotIdSet.f;
        if(snapshotIdSet0 == snapshotIdSet1) {
            return this;
        }
        if(this == snapshotIdSet1) {
            return snapshotIdSet1;
        }
        int v = this.c;
        if(snapshotIdSet0.c == v) {
            int[] arr_v = this.d;
            if(snapshotIdSet0.d == arr_v) {
                return new SnapshotIdSet(this.a & ~snapshotIdSet0.a, this.b & ~snapshotIdSet0.b, v, arr_v);
            }
        }
        SnapshotIdSet snapshotIdSet2 = this;
        for(Object object0: snapshotIdSet0) {
            snapshotIdSet2 = snapshotIdSet2.j(((Number)object0).intValue());
        }
        return snapshotIdSet2;
    }

    @Override
    @l
    public Iterator iterator() {
        return p.b(new o(null) {
            Object l;
            int m;
            int n;
            int o;
            private Object p;
            final SnapshotIdSet q;

            {
                this.q = snapshotIdSet0;
                super(2, d0);
            }

            @m
            public final Object a(@l kotlin.sequences.o o0, @m d d0) {
                return ((androidx.compose.runtime.snapshots.SnapshotIdSet.iterator.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.runtime.snapshots.SnapshotIdSet.iterator.1(this.q, d0);
                d1.p = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((kotlin.sequences.o)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                int v3;
                kotlin.sequences.o o3;
                int v2;
                kotlin.sequences.o o2;
                int v1;
                int[] arr_v1;
                int v;
                kotlin.sequences.o o1;
                kotlin.sequences.o o0;
                Object object1 = b.l();
            alab2:
                switch(this.o) {
                    case 0: {
                        f0.n(object0);
                        o0 = (kotlin.sequences.o)this.p;
                        int[] arr_v = this.q.d;
                        if(arr_v != null) {
                            o1 = o0;
                            v = arr_v.length;
                            arr_v1 = arr_v;
                            v1 = 0;
                            goto label_18;
                        }
                        goto label_27;
                    }
                    case 1: {
                        v = this.n;
                        v1 = this.m;
                        arr_v1 = (int[])this.l;
                        o1 = (kotlin.sequences.o)this.p;
                        f0.n(object0);
                        while(true) {
                            ++v1;
                        label_18:
                            if(v1 >= v) {
                                break;
                            }
                            this.p = o1;
                            this.l = arr_v1;
                            this.m = v1;
                            this.n = v;
                            this.o = 1;
                            if(o1.a(kotlin.coroutines.jvm.internal.b.f(arr_v1[v1]), this) != object1) {
                                continue;
                            }
                            return object1;
                        }
                        o0 = o1;
                    label_27:
                        if(this.q.b != 0L) {
                            o2 = o0;
                            v2 = 0;
                            goto label_35;
                        }
                        goto label_44;
                    }
                    case 2: {
                        v2 = this.m;
                        o2 = (kotlin.sequences.o)this.p;
                        f0.n(object0);
                    alab1:
                        while(true) {
                            while(true) {
                                ++v2;
                            label_35:
                                if(v2 >= 0x40) {
                                    break alab1;
                                }
                                if((this.q.b & 1L << v2) == 0L) {
                                    break;
                                }
                                this.p = o2;
                                this.l = null;
                                this.m = v2;
                                this.o = 2;
                                if(o2.a(kotlin.coroutines.jvm.internal.b.f(this.q.c + v2), this) != object1) {
                                    break;
                                }
                                return object1;
                            }
                        }
                        o0 = o2;
                    label_44:
                        if(this.q.a != 0L) {
                            o3 = o0;
                            v3 = 0;
                            goto label_53;
                        }
                        break;
                    }
                    case 3: {
                        int v4 = this.m;
                        o3 = (kotlin.sequences.o)this.p;
                        f0.n(object0);
                        while(true) {
                            v3 = v4;
                            while(true) {
                                ++v3;
                            label_53:
                                if(v3 >= 0x40) {
                                    break alab2;
                                }
                                if((this.q.a & 1L << v3) != 0L) {
                                    this.p = o3;
                                    this.l = null;
                                    this.m = v3;
                                    this.o = 3;
                                    if(o3.a(kotlin.coroutines.jvm.internal.b.f(v3 + 0x40 + this.q.c), this) == object1) {
                                        return object1;
                                    }
                                    v4 = v3;
                                    break;
                                }
                            }
                        }
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }
        }).iterator();
    }

    @l
    public final SnapshotIdSet j(int v) {
        int v1 = this.c;
        int v2 = v - v1;
        if(v2 >= 0 && v2 < 0x40) {
            return (this.b & 1L << v2) == 0L ? this : new SnapshotIdSet(this.a, this.b & ~(1L << v2), v1, this.d);
        }
        if(v2 >= 0x40 && v2 < 0x80) {
            long v3 = 1L << v2 - 0x40;
            return (this.a & v3) == 0L ? this : new SnapshotIdSet(this.a & ~v3, this.b, v1, this.d);
        }
        if(v2 < 0) {
            int[] arr_v = this.d;
            if(arr_v != null) {
                int v4 = SnapshotIdSetKt.b(arr_v, v);
                if(v4 >= 0) {
                    int v5 = arr_v.length - 1;
                    if(v5 == 0) {
                        return new SnapshotIdSet(this.a, this.b, this.c, null);
                    }
                    int[] arr_v1 = new int[v5];
                    if(v4 > 0) {
                        kotlin.collections.l.z0(arr_v, arr_v1, 0, 0, v4);
                    }
                    if(v4 < v5) {
                        kotlin.collections.l.z0(arr_v, arr_v1, v4, v4 + 1, arr_v.length);
                    }
                    return new SnapshotIdSet(this.a, this.b, this.c, arr_v1);
                }
            }
        }
        return this;
    }

    public final void k(@l Function1 function10) {
        L.p(function10, "block");
        int[] arr_v = this.d;
        if(arr_v != null) {
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                function10.invoke(((int)arr_v[v1]));
            }
        }
        if(this.b != 0L) {
            for(int v2 = 0; v2 < 0x40; ++v2) {
                if((this.b & 1L << v2) != 0L) {
                    function10.invoke(((int)(this.c + v2)));
                }
            }
        }
        if(this.a != 0L) {
            for(int v = 0; v < 0x40; ++v) {
                if((this.a & 1L << v) != 0L) {
                    function10.invoke(((int)(v + 0x40 + this.c)));
                }
            }
        }
    }

    public final boolean l(int v) {
        int v1 = v - this.c;
        if(v1 >= 0 && v1 < 0x40) {
            return (1L << v1 & this.b) != 0L;
        }
        if(v1 >= 0x40 && v1 < 0x80) {
            return (1L << v1 - 0x40 & this.a) != 0L;
        }
        return v1 <= 0 ? this.d != null && SnapshotIdSetKt.b(this.d, v) >= 0 : false;
    }

    public final int m(int v) {
        int[] arr_v = this.d;
        if(arr_v != null) {
            return arr_v[0];
        }
        long v1 = this.b;
        if(v1 != 0L) {
            return this.c + SnapshotIdSetKt.c(v1);
        }
        return this.a == 0L ? v : this.c + 0x40 + SnapshotIdSetKt.c(this.a);
    }

    @l
    public final SnapshotIdSet o(@l SnapshotIdSet snapshotIdSet0) {
        L.p(snapshotIdSet0, "bits");
        SnapshotIdSet snapshotIdSet1 = SnapshotIdSet.f;
        if(snapshotIdSet0 == snapshotIdSet1) {
            return this;
        }
        if(this == snapshotIdSet1) {
            return snapshotIdSet0;
        }
        int v = this.c;
        if(snapshotIdSet0.c == v) {
            int[] arr_v = this.d;
            if(snapshotIdSet0.d == arr_v) {
                return new SnapshotIdSet(this.a | snapshotIdSet0.a, this.b | snapshotIdSet0.b, v, arr_v);
            }
        }
        if(this.d == null) {
            for(Object object0: this) {
                snapshotIdSet0 = snapshotIdSet0.p(((Number)object0).intValue());
            }
            return snapshotIdSet0;
        }
        SnapshotIdSet snapshotIdSet2 = this;
        for(Object object1: snapshotIdSet0) {
            snapshotIdSet2 = snapshotIdSet2.p(((Number)object1).intValue());
        }
        return snapshotIdSet2;
    }

    @l
    public final SnapshotIdSet p(int v) {
        int v11;
        int v1 = this.c;
        int v2 = v - v1;
        if(v2 >= 0 && v2 < 0x40) {
            return (this.b & 1L << v2) == 0L ? new SnapshotIdSet(this.a, this.b | 1L << v2, v1, this.d) : this;
        }
        if(v2 >= 0x40 && v2 < 0x80) {
            long v3 = 1L << v2 - 0x40;
            return (this.a & v3) == 0L ? new SnapshotIdSet(this.a | v3, this.b, v1, this.d) : this;
        }
        if(v2 < 0x80) {
            int[] arr_v2 = this.d;
            if(arr_v2 == null) {
                return new SnapshotIdSet(this.a, this.b, v1, new int[]{v});
            }
            int v12 = SnapshotIdSetKt.b(arr_v2, v);
            if(v12 < 0) {
                int[] arr_v3 = new int[arr_v2.length + 1];
                kotlin.collections.l.z0(arr_v2, arr_v3, 0, 0, -(v12 + 1));
                kotlin.collections.l.z0(arr_v2, arr_v3, -v12, -(v12 + 1), arr_v2.length);
                arr_v3[-(v12 + 1)] = v;
                return new SnapshotIdSet(this.a, this.b, this.c, arr_v3);
            }
        }
        else if(!this.l(v)) {
            int v4 = this.c;
            int v5 = (v + 1) / 0x40 * 0x40;
            ArrayList arrayList0 = null;
            long v6 = this.b;
            long v7;
            for(v7 = this.a; true; v7 = 0L) {
                if(v4 >= v5) {
                    v11 = v4;
                    break;
                }
                if(v6 != 0L) {
                    if(arrayList0 == null) {
                        arrayList0 = new ArrayList();
                        int[] arr_v = this.d;
                        if(arr_v != null) {
                            int v8 = arr_v.length;
                            for(int v9 = 0; v9 < v8; ++v9) {
                                arrayList0.add(((int)arr_v[v9]));
                            }
                        }
                    }
                    for(int v10 = 0; v10 < 0x40; ++v10) {
                        if((1L << v10 & v6) != 0L) {
                            arrayList0.add(((int)(v10 + v4)));
                        }
                    }
                }
                if(v7 == 0L) {
                    v11 = v5;
                    v6 = 0L;
                    break;
                }
                v4 += 0x40;
                v6 = v7;
            }
            if(arrayList0 != null) {
                int[] arr_v1 = u.U5(arrayList0);
                return arr_v1 == null ? new SnapshotIdSet(v7, v6, v11, this.d).p(v) : new SnapshotIdSet(v7, v6, v11, arr_v1).p(v);
            }
            return new SnapshotIdSet(v7, v6, v11, this.d).p(v);
        }
        return this;
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append(" [");
        ArrayList arrayList0 = new ArrayList(u.b0(this, 10));
        for(Object object0: this) {
            arrayList0.add(String.valueOf(((Number)object0).intValue()));
        }
        stringBuilder0.append(ListUtilsKt.k(arrayList0, null, null, null, 0, null, null, 0x3F, null));
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

