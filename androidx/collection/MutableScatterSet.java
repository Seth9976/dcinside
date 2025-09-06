package androidx.collection;

import A3.o;
import B3.h;
import androidx.annotation.IntRange;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.S0;
import kotlin.b0;
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

@s0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1100:1\n1018#1,2:1285\n1022#1,5:1293\n1018#1,2:1324\n1022#1,5:1332\n1018#1,2:1349\n1022#1,5:1357\n1018#1,2:1363\n1022#1,5:1371\n1#2:1101\n1672#3,6:1102\n1826#3:1125\n1688#3:1129\n1605#3,3:1148\n1619#3:1152\n1615#3:1155\n1795#3,3:1159\n1809#3,3:1163\n1733#3:1167\n1721#3:1169\n1715#3:1170\n1728#3:1175\n1818#3:1177\n1605#3,3:1187\n1619#3:1191\n1615#3:1194\n1795#3,3:1198\n1809#3,3:1202\n1733#3:1206\n1721#3:1208\n1715#3:1209\n1728#3:1214\n1818#3:1216\n1826#3:1242\n1688#3:1246\n1826#3:1271\n1688#3:1275\n1672#3,6:1287\n1672#3,6:1298\n1605#3,3:1304\n1615#3:1307\n1619#3:1308\n1795#3,3:1309\n1809#3,3:1312\n1733#3:1315\n1721#3:1316\n1715#3:1317\n1728#3:1318\n1818#3:1319\n1682#3:1320\n1661#3:1321\n1680#3:1322\n1661#3:1323\n1672#3,6:1326\n1795#3,3:1337\n1826#3:1340\n1715#3:1341\n1685#3:1342\n1661#3:1343\n1605#3,3:1344\n1615#3:1347\n1619#3:1348\n1672#3,6:1351\n1661#3:1362\n1672#3,6:1365\n1672#3,6:1376\n1672#3,6:1382\n13579#4,2:1108\n13579#4,2:1225\n1855#5,2:1110\n1855#5,2:1229\n1295#6,2:1112\n1295#6,2:1227\n267#7,4:1114\n237#7,7:1118\n248#7,3:1126\n251#7,2:1130\n272#7,2:1132\n254#7,6:1134\n274#7:1140\n433#7:1147\n434#7:1151\n436#7,2:1153\n438#7,3:1156\n441#7:1162\n442#7:1166\n443#7:1168\n444#7,4:1171\n450#7:1176\n451#7,8:1178\n433#7:1186\n434#7:1190\n436#7,2:1192\n438#7,3:1195\n441#7:1201\n442#7:1205\n443#7:1207\n444#7,4:1210\n450#7:1215\n451#7,8:1217\n267#7,4:1231\n237#7,7:1235\n248#7,3:1243\n251#7,2:1247\n272#7,2:1249\n254#7,6:1251\n274#7:1257\n237#7,7:1264\n248#7,3:1272\n251#7,9:1276\n305#8,6:1141\n305#8,6:1258\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n857#1:1285,2\n857#1:1293,5\n917#1:1324,2\n917#1:1332,5\n989#1:1349,2\n989#1:1357,5\n1004#1:1363,2\n1004#1:1371,5\n567#1:1102,6\n692#1:1125\n692#1:1129\n714#1:1148,3\n714#1:1152\n714#1:1155\n714#1:1159,3\n714#1:1163,3\n714#1:1167\n714#1:1169\n714#1:1170\n714#1:1175\n714#1:1177\n727#1:1187,3\n727#1:1191\n727#1:1194\n727#1:1198,3\n727#1:1202,3\n727#1:1206\n727#1:1208\n727#1:1209\n727#1:1214\n727#1:1216\n823#1:1242\n823#1:1246\n843#1:1271\n843#1:1275\n857#1:1287,6\n868#1:1298,6\n882#1:1304,3\n883#1:1307\n884#1:1308\n891#1:1309,3\n892#1:1312,3\n893#1:1315\n894#1:1316\n894#1:1317\n898#1:1318\n901#1:1319\n910#1:1320\n910#1:1321\n916#1:1322\n916#1:1323\n917#1:1326,6\n931#1:1337,3\n932#1:1340\n934#1:1341\n984#1:1342\n984#1:1343\n986#1:1344,3\n987#1:1347\n989#1:1348\n989#1:1351,6\n1002#1:1362\n1004#1:1365,6\n1019#1:1376,6\n1025#1:1382,6\n662#1:1108,2\n793#1:1225,2\n672#1:1110,2\n813#1:1229,2\n682#1:1112,2\n803#1:1227,2\n692#1:1114,4\n692#1:1118,7\n692#1:1126,3\n692#1:1130,2\n692#1:1132,2\n692#1:1134,6\n692#1:1140\n714#1:1147\n714#1:1151\n714#1:1153,2\n714#1:1156,3\n714#1:1162\n714#1:1166\n714#1:1168\n714#1:1171,4\n714#1:1176\n714#1:1178,8\n727#1:1186\n727#1:1190\n727#1:1192,2\n727#1:1195,3\n727#1:1201\n727#1:1205\n727#1:1207\n727#1:1210,4\n727#1:1215\n727#1:1217,8\n823#1:1231,4\n823#1:1235,7\n823#1:1243,3\n823#1:1247,2\n823#1:1249,2\n823#1:1251,6\n823#1:1257\n843#1:1264,7\n843#1:1272,3\n843#1:1276,9\n702#1:1141,6\n833#1:1258,6\n*E\n"})
public final class MutableScatterSet extends ScatterSet {
    @s0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1100:1\n237#2,7:1101\n248#2,3:1109\n251#2,9:1113\n1826#3:1108\n1688#3:1112\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n*L\n1080#1:1101,7\n1080#1:1109,3\n1080#1:1113,9\n1080#1:1108\n1080#1:1112\n*E\n"})
    final class MutableSetWrapper extends SetWrapper implements h, Set {
        final MutableScatterSet b;

        @Override  // androidx.collection.ScatterSet$SetWrapper
        public boolean add(Object object0) {
            return MutableScatterSet.this.C(object0);
        }

        @Override  // androidx.collection.ScatterSet$SetWrapper
        public boolean addAll(@l Collection collection0) {
            L.p(collection0, "elements");
            return MutableScatterSet.this.F(collection0);
        }

        @Override  // androidx.collection.ScatterSet$SetWrapper
        public void clear() {
            MutableScatterSet.this.K();
        }

        @Override  // androidx.collection.ScatterSet$SetWrapper
        @l
        public Iterator iterator() {
            return new Object() {
                private int a;
                @l
                private final Iterator b;

                {
                    this.a = -1;
                    this.b = p.a(new o(this, null) {
                        Object l;
                        Object m;
                        Object n;
                        int o;
                        int p;
                        int q;
                        int r;
                        long s;
                        int t;
                        private Object u;
                        final MutableScatterSet v;
                        final androidx.collection.MutableScatterSet.MutableSetWrapper.iterator.1 w;

                        {
                            this.v = mutableScatterSet0;
                            this.w = mutableScatterSet$MutableSetWrapper$iterator$10;
                            super(2, d0);
                        }

                        @m
                        public final Object a(@l kotlin.sequences.o o0, @m d d0) {
                            return ((androidx.collection.MutableScatterSet.MutableSetWrapper.iterator.1.iterator.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            d d1 = new androidx.collection.MutableScatterSet.MutableSetWrapper.iterator.1.iterator.1(this.v, this.w, d0);
                            d1.u = object0;
                            return d1;
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.a(((kotlin.sequences.o)object0), ((d)object1));
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            int v1;
                            int v;
                            long[] arr_v;
                            androidx.collection.MutableScatterSet.MutableSetWrapper.iterator.1 mutableScatterSet$MutableSetWrapper$iterator$10;
                            MutableScatterSet mutableScatterSet0;
                            kotlin.sequences.o o0;
                            Object object1 = b.l();
                            switch(this.t) {
                                case 0: {
                                    f0.n(object0);
                                    o0 = (kotlin.sequences.o)this.u;
                                    mutableScatterSet0 = this.v;
                                    mutableScatterSet$MutableSetWrapper$iterator$10 = this.w;
                                    arr_v = mutableScatterSet0.a;
                                    v = arr_v.length - 2;
                                    if(v >= 0) {
                                        v1 = 0;
                                        goto label_49;
                                    }
                                    break;
                                }
                                case 1: {
                                    int v2 = this.r;
                                    int v3 = this.q;
                                    long v4 = this.s;
                                    int v5 = this.p;
                                    int v6 = this.o;
                                    long[] arr_v1 = (long[])this.n;
                                    MutableScatterSet mutableScatterSet1 = (MutableScatterSet)this.m;
                                    androidx.collection.MutableScatterSet.MutableSetWrapper.iterator.1 mutableScatterSet$MutableSetWrapper$iterator$11 = (androidx.collection.MutableScatterSet.MutableSetWrapper.iterator.1)this.l;
                                    kotlin.sequences.o o1 = (kotlin.sequences.o)this.u;
                                    f0.n(object0);
                                alab1:
                                    while(true) {
                                        while(true) {
                                            v4 >>= 8;
                                            ++v2;
                                        label_24:
                                            if(v2 >= v3) {
                                                break alab1;
                                            }
                                            if((0xFFL & v4) >= 0x80L) {
                                                break;
                                            }
                                            int v7 = (v5 << 3) + v2;
                                            mutableScatterSet$MutableSetWrapper$iterator$11.c(v7);
                                            this.u = o1;
                                            this.l = mutableScatterSet$MutableSetWrapper$iterator$11;
                                            this.m = mutableScatterSet1;
                                            this.n = arr_v1;
                                            this.o = v6;
                                            this.p = v5;
                                            this.s = v4;
                                            this.q = v3;
                                            this.r = v2;
                                            this.t = 1;
                                            if(o1.a(mutableScatterSet1.b[v7], this) != object1) {
                                                break;
                                            }
                                            return object1;
                                        }
                                    }
                                    if(v3 == 8) {
                                        arr_v = arr_v1;
                                        mutableScatterSet0 = mutableScatterSet1;
                                        mutableScatterSet$MutableSetWrapper$iterator$10 = mutableScatterSet$MutableSetWrapper$iterator$11;
                                        o0 = o1;
                                        v1 = v5;
                                        v = v6;
                                        while(true) {
                                            if(v1 == v) {
                                                break;
                                            }
                                            ++v1;
                                        label_49:
                                            long v8 = arr_v[v1];
                                            if((~v8 << 7 & v8 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                continue;
                                            }
                                            o1 = o0;
                                            v2 = 0;
                                            mutableScatterSet1 = mutableScatterSet0;
                                            arr_v1 = arr_v;
                                            v3 = 8 - (~(v1 - v) >>> 0x1F);
                                            mutableScatterSet$MutableSetWrapper$iterator$11 = mutableScatterSet$MutableSetWrapper$iterator$10;
                                            v4 = v8;
                                            v6 = v;
                                            v5 = v1;
                                            goto label_24;
                                        }
                                    }
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                            return S0.a;
                        }
                    });
                }

                public final int a() {
                    return this.a;
                }

                @l
                public final Iterator b() {
                    return this.b;
                }

                public final void c(int v) {
                    this.a = v;
                }

                @Override
                public boolean hasNext() {
                    return this.b.hasNext();
                }

                @Override
                public Object next() {
                    return this.b.next();
                }

                @Override
                public void remove() {
                    int v = this.a;
                    if(v != -1) {
                        this.c.j0(v);
                        this.a = -1;
                    }
                }
            };
        }

        @Override  // androidx.collection.ScatterSet$SetWrapper
        public boolean remove(Object object0) {
            return MutableScatterSet.this.c0(object0);
        }

        @Override  // androidx.collection.ScatterSet$SetWrapper
        public boolean removeAll(@l Collection collection0) {
            L.p(collection0, "elements");
            int v = MutableScatterSet.this.q();
            for(Object object0: collection0) {
                MutableScatterSet.this.T(object0);
            }
            return v != MutableScatterSet.this.q();
        }

        @Override  // androidx.collection.ScatterSet$SetWrapper
        public boolean retainAll(@l Collection collection0) {
            L.p(collection0, "elements");
            MutableScatterSet mutableScatterSet0 = MutableScatterSet.this;
            long[] arr_v = mutableScatterSet0.a;
            int v = arr_v.length - 2;
            if(v >= 0) {
                boolean z = false;
                for(int v1 = 0; true; ++v1) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                        int v3 = 8 - (~(v1 - v) >>> 0x1F);
                        for(int v4 = 0; v4 < v3; ++v4) {
                            if((0xFFL & v2) < 0x80L) {
                                int v5 = (v1 << 3) + v4;
                                if(!collection0.contains(mutableScatterSet0.b[v5])) {
                                    mutableScatterSet0.j0(v5);
                                    z = true;
                                }
                            }
                            v2 >>= 8;
                        }
                        if(v3 != 8) {
                            return z;
                        }
                    }
                    if(v1 == v) {
                        break;
                    }
                }
                return z;
            }
            return false;
        }
    }

    private int e;

    public MutableScatterSet() {
        this(0, 1, null);
    }

    public MutableScatterSet(int v) {
        super(null);
        if(v < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        this.P(ScatterMapKt.z(v));
    }

    public MutableScatterSet(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 6;
        }
        this(v);
    }

    public final boolean C(Object object0) {
        this.b[this.L(object0)] = object0;
        return false;
    }

    public final boolean D(@l ObjectList objectList0) {
        L.p(objectList0, "elements");
        this.W(objectList0);
        return false;
    }

    public final boolean E(@l ScatterSet scatterSet0) {
        L.p(scatterSet0, "elements");
        this.X(scatterSet0);
        return false;
    }

    public final boolean F(@l Iterable iterable0) {
        L.p(iterable0, "elements");
        this.Y(iterable0);
        return false;
    }

    public final boolean G(@l kotlin.sequences.m m0) {
        L.p(m0, "elements");
        this.a0(m0);
        return false;
    }

    public final boolean H(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        this.b0(arr_object);
        return false;
    }

    private final void I() {
        if(this.c > 8 && androidx.collection.b.a(((long)this.d) * 0x20L, ((long)this.c) * 25L) <= 0) {
            this.i0();
            return;
        }
        this.l0(ScatterMapKt.w(this.c));
    }

    @l
    public final Set J() {
        return new MutableSetWrapper(this);
    }

    public final void K() {
        this.d = 0;
        long[] arr_v = this.a;
        if(arr_v != ScatterMapKt.e) {
            kotlin.collections.l.U1(arr_v, 0x8080808080808080L, 0, 0, 6, null);
            int v = this.c >> 3;
            this.a[v] |= 0xFFL << ((this.c & 7) << 3);
        }
        kotlin.collections.l.M1(this.b, null, 0, this.c);
        this.N();
    }

    private final int L(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this.c;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = v6 ^ ((long)(v1 & 0x7F)) * 0x101010101010101L;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = v3 + (Long.numberOfTrailingZeros(v8) >> 3) & v2;
                if(L.g(this.b[v9], object0)) {
                    return v9;
                }
            }
            if((~v6 << 6 & v6 & 0x8080808080808080L) != 0L) {
                int v10 = this.M(v1 >>> 7);
                if(this.e == 0 && (this.a[v10 >> 3] >> ((v10 & 7) << 3) & 0xFFL) != 0xFEL) {
                    this.I();
                    v10 = this.M(v1 >>> 7);
                }
                ++this.d;
                int v11 = this.e;
                long[] arr_v = this.a;
                long v12 = arr_v[v10 >> 3];
                int v13 = (v10 & 7) << 3;
                this.e = v11 - ((v12 >> v13 & 0xFFL) == 0x80L ? 1 : 0);
                arr_v[v10 >> 3] = v12 & ~(0xFFL << v13) | ((long)(v1 & 0x7F)) << v13;
                int v14 = (v10 - 7 & this.c) + (this.c & 7);
                int v15 = (v14 & 7) << 3;
                arr_v[v14 >> 3] = ~(0xFFL << v15) & arr_v[v14 >> 3] | ((long)(v1 & 0x7F)) << v15;
                return v10;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    private final int M(int v) {
        long v6;
        int v1 = this.c;
        int v2 = v & v1;
        int v3 = 0;
        while(true) {
            int v4 = (v2 & 7) << 3;
            long v5 = this.a[(v2 >> 3) + 1] << 0x40 - v4 & -((long)v4) >> 0x3F | this.a[v2 >> 3] >>> v4;
            v6 = v5 & ~v5 << 7 & 0x8080808080808080L;
            if(v6 != 0L) {
                break;
            }
            v3 += 8;
            v2 = v2 + v3 & v1;
        }
        return v2 + (Long.numberOfTrailingZeros(v6) >> 3) & v1;
    }

    private final void N() {
        this.e = ScatterMapKt.o(this.n()) - this.d;
    }

    private final void O(int v) {
        long[] arr_v;
        if(v == 0) {
            arr_v = ScatterMapKt.e;
        }
        else {
            arr_v = new long[(v + 15 & -8) >> 3];
            kotlin.collections.l.U1(arr_v, 0x8080808080808080L, 0, 0, 6, null);
        }
        this.a = arr_v;
        arr_v[v >> 3] |= 0xFFL << ((v & 7) << 3);
        this.N();
    }

    private final void P(int v) {
        int v1 = v <= 0 ? 0 : Math.max(7, ScatterMapKt.x(v));
        this.c = v1;
        this.O(v1);
        this.b = new Object[v1];
    }

    public final void Q(@l ObjectList objectList0) {
        L.p(objectList0, "elements");
        Object[] arr_object = objectList0.a;
        int v = objectList0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            this.T(arr_object[v1]);
        }
    }

    public final void R(@l ScatterSet scatterSet0) {
        L.p(scatterSet0, "elements");
        Object[] arr_object = scatterSet0.b;
        long[] arr_v = scatterSet0.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            this.T(arr_object[(v1 << 3) + v4]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_17;
                    }
                    break;
                }
            label_17:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void S(@l Iterable iterable0) {
        L.p(iterable0, "elements");
        for(Object object0: iterable0) {
            this.T(object0);
        }
    }

    public final void T(Object object0) {
        int v11;
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this.c;
        int v4 = v2 >>> 7;
        while(true) {
            int v5 = v4 & v3;
            int v6 = (v5 & 7) << 3;
            long v7 = this.a[(v5 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v5 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L;
            while(v9 != 0L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v5 & v3;
                if(L.g(this.b[v10], object0)) {
                    v11 = v10;
                    goto label_19;
                }
                v9 &= v9 - 1L;
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) == 0L) {
                goto label_22;
            }
            else {
                v11 = -1;
            }
        label_19:
            if(v11 >= 0) {
                this.j0(v11);
            }
            return;
        label_22:
            v += 8;
            v4 = v5 + v;
        }
    }

    public final void U(@l kotlin.sequences.m m0) {
        L.p(m0, "elements");
        for(Object object0: m0) {
            this.T(object0);
        }
    }

    public final void V(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        for(int v = 0; v < arr_object.length; ++v) {
            this.T(arr_object[v]);
        }
    }

    public final void W(@l ObjectList objectList0) {
        L.p(objectList0, "elements");
        Object[] arr_object = objectList0.a;
        int v = objectList0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            this.Z(arr_object[v1]);
        }
    }

    public final void X(@l ScatterSet scatterSet0) {
        L.p(scatterSet0, "elements");
        Object[] arr_object = scatterSet0.b;
        long[] arr_v = scatterSet0.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            this.Z(arr_object[(v1 << 3) + v4]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_17;
                    }
                    break;
                }
            label_17:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void Y(@l Iterable iterable0) {
        L.p(iterable0, "elements");
        for(Object object0: iterable0) {
            this.Z(object0);
        }
    }

    public final void Z(Object object0) {
        this.b[this.L(object0)] = object0;
    }

    public final void a0(@l kotlin.sequences.m m0) {
        L.p(m0, "elements");
        for(Object object0: m0) {
            this.Z(object0);
        }
    }

    public final void b0(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        for(int v = 0; v < arr_object.length; ++v) {
            this.Z(arr_object[v]);
        }
    }

    public final boolean c0(Object object0) {
        int v10;
        boolean z = false;
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this.c;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L;
            while(v8 != 0L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(L.g(this.b[v9], object0)) {
                    v10 = v9;
                    goto label_19;
                }
                v8 &= v8 - 1L;
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) == 0L) {
                goto label_23;
            }
            else {
                v10 = -1;
            }
        label_19:
            if(v10 >= 0) {
                z = true;
                this.j0(v10);
            }
            return z;
        label_23:
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final boolean d0(@l ObjectList objectList0) {
        L.p(objectList0, "elements");
        this.Q(objectList0);
        return false;
    }

    public final boolean e0(@l ScatterSet scatterSet0) {
        L.p(scatterSet0, "elements");
        this.R(scatterSet0);
        return false;
    }

    public final boolean f0(@l Iterable iterable0) {
        L.p(iterable0, "elements");
        this.S(iterable0);
        return false;
    }

    public final boolean g0(@l kotlin.sequences.m m0) {
        L.p(m0, "elements");
        this.U(m0);
        return false;
    }

    public final boolean h0(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        this.V(arr_object);
        return false;
    }

    private final void i0() {
        long[] arr_v = this.a;
        int v = this.c;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = (v1 & 7) << 3;
            if((arr_v[v1 >> 3] >> v3 & 0xFFL) == 0xFEL) {
                long[] arr_v1 = this.a;
                arr_v1[v1 >> 3] = 0x80L << v3 | arr_v1[v1 >> 3] & ~(0xFFL << v3);
                int v4 = (v1 - 7 & this.c) + (this.c & 7);
                int v5 = (v4 & 7) << 3;
                arr_v1[v4 >> 3] = ~(0xFFL << v5) & arr_v1[v4 >> 3] | 0x80L << v5;
                ++v2;
            }
        }
        this.e += v2;
    }

    @b0
    public final void j0(int v) {
        --this.d;
        long[] arr_v = this.a;
        int v1 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v1) | 0xFEL << v1;
        int v2 = (v - 7 & this.c) + (this.c & 7);
        int v3 = (v2 & 7) << 3;
        arr_v[v2 >> 3] = arr_v[v2 >> 3] & ~(0xFFL << v3) | 0xFEL << v3;
        this.b[v] = null;
    }

    public final void k0(@l Function1 function10) {
        L.p(function10, "predicate");
        Object[] arr_object = this.b;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(((Boolean)function10.invoke(arr_object[v5])).booleanValue()) {
                                this.j0(v5);
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_19;
                    }
                    break;
                }
            label_19:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    private final void l0(int v) {
        int v7;
        long[] arr_v = this.a;
        Object[] arr_object = this.b;
        int v1 = this.c;
        this.P(v);
        Object[] arr_object1 = this.b;
        for(int v2 = 0; v2 < v1; v2 = v7 + 1) {
            if((arr_v[v2 >> 3] >> ((v2 & 7) << 3) & 0xFFL) < 0x80L) {
                Object object0 = arr_object[v2];
                int v3 = object0 == null ? 0 : object0.hashCode();
                int v4 = v3 * 0xCC9E2D51 ^ v3 * 0xCC9E2D51 << 16;
                int v5 = this.M(v4 >>> 7);
                long[] arr_v1 = this.a;
                int v6 = (v5 & 7) << 3;
                v7 = v2;
                arr_v1[v5 >> 3] = arr_v1[v5 >> 3] & ~(0xFFL << v6) | ((long)(v4 & 0x7F)) << v6;
                int v8 = (v5 - 7 & this.c) + (this.c & 7);
                int v9 = (v8 & 7) << 3;
                arr_v1[v8 >> 3] = ~(0xFFL << v9) & arr_v1[v8 >> 3] | ((long)(v4 & 0x7F)) << v9;
                arr_object1[v5] = object0;
            }
            else {
                v7 = v2;
            }
        }
    }

    @IntRange(from = 0L)
    public final int m0() {
        int v = this.c;
        int v1 = ScatterMapKt.x(ScatterMapKt.z(this.d));
        if(v1 < v) {
            this.l0(v1);
            return v - this.c;
        }
        return 0;
    }

    private final void n0(int v, long v1) {
        long[] arr_v = this.a;
        int v2 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v2) | v1 << v2;
        int v3 = (v - 7 & this.c) + (this.c & 7);
        int v4 = (v3 & 7) << 3;
        arr_v[v3 >> 3] = v1 << v4 | arr_v[v3 >> 3] & ~(0xFFL << v4);
    }
}

