package androidx.collection;

import A3.o;
import B3.a;
import androidx.annotation.IntRange;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.S0;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlin.sequences.p;
import y4.l;
import y4.m;
import z3.f;
import z3.j;

@s0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1100:1\n267#1,4:1101\n237#1,7:1105\n248#1,3:1113\n251#1,2:1117\n272#1,2:1119\n254#1,6:1121\n274#1:1127\n267#1,4:1128\n237#1,7:1132\n248#1,3:1140\n251#1,2:1144\n272#1,2:1146\n254#1,6:1148\n274#1:1154\n267#1,4:1155\n237#1,7:1159\n248#1,3:1167\n251#1,2:1171\n272#1,2:1173\n254#1,6:1175\n274#1:1181\n237#1,7:1184\n248#1,3:1192\n251#1,9:1196\n267#1,4:1205\n237#1,7:1209\n248#1,3:1217\n251#1,2:1221\n272#1,2:1223\n254#1,6:1225\n274#1:1231\n267#1,4:1232\n237#1,7:1236\n248#1,3:1244\n251#1,2:1248\n272#1,2:1250\n254#1,6:1252\n274#1:1258\n267#1,4:1259\n237#1,7:1263\n248#1,3:1271\n251#1,2:1275\n272#1,2:1277\n254#1,6:1279\n274#1:1285\n433#1:1286\n434#1:1290\n436#1,2:1292\n438#1,3:1295\n441#1:1301\n442#1:1305\n443#1:1307\n444#1,4:1310\n450#1:1315\n451#1,8:1317\n267#1,4:1325\n237#1,7:1329\n248#1,3:1337\n251#1,2:1341\n272#1,2:1343\n254#1,6:1345\n274#1:1351\n267#1,4:1352\n237#1,7:1356\n248#1,3:1364\n251#1,2:1368\n272#1,2:1370\n254#1,6:1372\n274#1:1378\n267#1,4:1379\n237#1,7:1383\n248#1,3:1391\n251#1,2:1395\n272#1,2:1397\n254#1,6:1399\n274#1:1405\n1826#2:1112\n1688#2:1116\n1826#2:1139\n1688#2:1143\n1826#2:1166\n1688#2:1170\n1826#2:1182\n1688#2:1183\n1826#2:1191\n1688#2:1195\n1826#2:1216\n1688#2:1220\n1826#2:1243\n1688#2:1247\n1826#2:1270\n1688#2:1274\n1605#2,3:1287\n1619#2:1291\n1615#2:1294\n1795#2,3:1298\n1809#2,3:1302\n1733#2:1306\n1721#2:1308\n1715#2:1309\n1728#2:1314\n1818#2:1316\n1826#2:1336\n1688#2:1340\n1826#2:1363\n1688#2:1367\n1826#2:1390\n1688#2:1394\n1605#2,3:1406\n1619#2:1409\n1615#2:1410\n1795#2,3:1411\n1809#2,3:1414\n1733#2:1417\n1721#2:1418\n1715#2:1419\n1728#2:1420\n1818#2:1421\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n201#1:1101,4\n201#1:1105,7\n201#1:1113,3\n201#1:1117,2\n201#1:1119,2\n201#1:1121,6\n201#1:1127\n214#1:1128,4\n214#1:1132,7\n214#1:1140,3\n214#1:1144,2\n214#1:1146,2\n214#1:1148,6\n214#1:1154\n227#1:1155,4\n227#1:1159,7\n227#1:1167,3\n227#1:1171,2\n227#1:1173,2\n227#1:1175,6\n227#1:1181\n270#1:1184,7\n270#1:1192,3\n270#1:1196,9\n284#1:1205,4\n284#1:1209,7\n284#1:1217,3\n284#1:1221,2\n284#1:1223,2\n284#1:1225,6\n284#1:1231\n297#1:1232,4\n297#1:1236,7\n297#1:1244,3\n297#1:1248,2\n297#1:1250,2\n297#1:1252,6\n297#1:1258\n318#1:1259,4\n318#1:1263,7\n318#1:1271,3\n318#1:1275,2\n318#1:1277,2\n318#1:1279,6\n318#1:1285\n329#1:1286\n329#1:1290\n329#1:1292,2\n329#1:1295,3\n329#1:1301\n329#1:1305\n329#1:1307\n329#1:1310,4\n329#1:1315\n329#1:1317,8\n352#1:1325,4\n352#1:1329,7\n352#1:1337,3\n352#1:1341,2\n352#1:1343,2\n352#1:1345,6\n352#1:1351\n378#1:1352,4\n378#1:1356,7\n378#1:1364,3\n378#1:1368,2\n378#1:1370,2\n378#1:1372,6\n378#1:1378\n407#1:1379,4\n407#1:1383,7\n407#1:1391,3\n407#1:1395,2\n407#1:1397,2\n407#1:1399,6\n407#1:1405\n201#1:1112\n201#1:1116\n214#1:1139\n214#1:1143\n227#1:1166\n227#1:1170\n243#1:1182\n250#1:1183\n270#1:1191\n270#1:1195\n284#1:1216\n284#1:1220\n297#1:1243\n297#1:1247\n318#1:1270\n318#1:1274\n329#1:1287,3\n329#1:1291\n329#1:1294\n329#1:1298,3\n329#1:1302,3\n329#1:1306\n329#1:1308\n329#1:1309\n329#1:1314\n329#1:1316\n352#1:1336\n352#1:1340\n378#1:1363\n378#1:1367\n407#1:1390\n407#1:1394\n433#1:1406,3\n434#1:1409\n437#1:1410\n440#1:1411,3\n441#1:1414,3\n442#1:1417\n443#1:1418\n443#1:1419\n447#1:1420\n450#1:1421\n*E\n"})
public abstract class ScatterSet {
    @s0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1100:1\n1855#2,2:1101\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n*L\n478#1:1101,2\n*E\n"})
    public class SetWrapper implements a, Set {
        final ScatterSet a;

        public int a() {
            return ScatterSet.this.d;
        }

        @Override
        public boolean add(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean addAll(Collection collection0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean contains(Object object0) {
            return ScatterSet.this.e(object0);
        }

        @Override
        public boolean containsAll(@l Collection collection0) {
            L.p(collection0, "elements");
            ScatterSet scatterSet0 = ScatterSet.this;
            for(Object object0: collection0) {
                if(!scatterSet0.e(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override
        public boolean isEmpty() {
            return ScatterSet.this.r();
        }

        @Override
        @l
        public Iterator iterator() {
            return p.a(new o(null) {
                Object l;
                Object m;
                int n;
                int o;
                int p;
                int q;
                long r;
                int s;
                private Object t;
                final ScatterSet u;

                {
                    this.u = scatterSet0;
                    super(2, d0);
                }

                @m
                public final Object a(@l kotlin.sequences.o o0, @m d d0) {
                    return ((androidx.collection.ScatterSet.SetWrapper.iterator.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    d d1 = new androidx.collection.ScatterSet.SetWrapper.iterator.1(this.u, d0);
                    d1.t = object0;
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
                    Object[] arr_object;
                    kotlin.sequences.o o0;
                    Object object1 = b.l();
                    switch(this.s) {
                        case 0: {
                            f0.n(object0);
                            o0 = (kotlin.sequences.o)this.t;
                            arr_object = this.u.b;
                            arr_v = this.u.a;
                            v = arr_v.length - 2;
                            if(v >= 0) {
                                v1 = 0;
                                goto label_42;
                            }
                            break;
                        }
                        case 1: {
                            int v2 = this.q;
                            int v3 = this.p;
                            long v4 = this.r;
                            v1 = this.o;
                            int v5 = this.n;
                            long[] arr_v1 = (long[])this.m;
                            Object[] arr_object1 = (Object[])this.l;
                            kotlin.sequences.o o1 = (kotlin.sequences.o)this.t;
                            f0.n(object0);
                        alab1:
                            while(true) {
                                while(true) {
                                    v4 >>= 8;
                                    ++v2;
                                label_22:
                                    if(v2 >= v3) {
                                        break alab1;
                                    }
                                    if((0xFFL & v4) >= 0x80L) {
                                        break;
                                    }
                                    this.t = o1;
                                    this.l = arr_object1;
                                    this.m = arr_v1;
                                    this.n = v5;
                                    this.o = v1;
                                    this.r = v4;
                                    this.p = v3;
                                    this.q = v2;
                                    this.s = 1;
                                    if(o1.a(arr_object1[(v1 << 3) + v2], this) != object1) {
                                        break;
                                    }
                                    return object1;
                                }
                            }
                            if(v3 == 8) {
                                v = v5;
                                arr_v = arr_v1;
                                arr_object = arr_object1;
                                o0 = o1;
                                while(true) {
                                    if(v1 == v) {
                                        break;
                                    }
                                    ++v1;
                                label_42:
                                    long v6 = arr_v[v1];
                                    if((~v6 << 7 & v6 & 0x8080808080808080L) == 0x8080808080808080L) {
                                        continue;
                                    }
                                    o1 = o0;
                                    v2 = 0;
                                    arr_v1 = arr_v;
                                    v5 = v;
                                    v3 = 8 - (~(v1 - v) >>> 0x1F);
                                    arr_object1 = arr_object;
                                    v4 = v6;
                                    goto label_22;
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

        @Override
        public boolean remove(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean removeAll(Collection collection0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean retainAll(Collection collection0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public final int size() {
            return this.a();
        }

        @Override
        public Object[] toArray() {
            return v.a(this);
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            L.p(arr_object, "array");
            return v.b(this, arr_object);
        }
    }

    @l
    @f
    public long[] a;
    @l
    @f
    public Object[] b;
    @f
    public int c;
    @f
    public int d;

    private ScatterSet() {
        this.a = ScatterMapKt.e;
        this.b = ContainerHelpersKt.c;
    }

    public ScatterSet(w w0) {
    }

    public static String A(ScatterSet scatterSet0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return scatterSet0.z(charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    public final boolean B() {
        return this.d == 0;
    }

    public final boolean a(@l Function1 function10) {
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
                        if((0xFFL & v2) < 0x80L && !((Boolean)function10.invoke(arr_object[(v1 << 3) + v4])).booleanValue()) {
                            return false;
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
        return true;
    }

    public final boolean b() {
        return this.d != 0;
    }

    public final boolean c(@l Function1 function10) {
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
                        if((0xFFL & v2) < 0x80L && ((Boolean)function10.invoke(arr_object[(v1 << 3) + v4])).booleanValue()) {
                            return true;
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
        return false;
    }

    @l
    public final Set d() {
        return new SetWrapper(this);
    }

    public final boolean e(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this.c;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(L.g(this.b[v9], object0)) {
                    return v9 >= 0;
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return false;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    @Override
    public boolean equals(@m Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ScatterSet)) {
            return false;
        }
        if(((ScatterSet)object0).q() != this.q()) {
            return false;
        }
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
                        if((0xFFL & v2) < 0x80L && !((ScatterSet)object0).e(arr_object[(v1 << 3) + v4])) {
                            return false;
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_22;
                    }
                    break;
                }
            label_22:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    @IntRange(from = 0L)
    public final int f() {
        return this.q();
    }

    @IntRange(from = 0L)
    public final int g(@l Function1 function10) {
        L.p(function10, "predicate");
        Object[] arr_object = this.b;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L && ((Boolean)function10.invoke(arr_object[(v1 << 3) + v5])).booleanValue()) {
                            ++v2;
                        }
                        v3 >>= 8;
                    }
                    if(v4 != 8) {
                        return v2;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return v2;
        }
        return 0;
    }

    public final int h(Object object0) {
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this.c;
        for(int v4 = v2 >>> 7; true; v4 = v5 + v) {
            int v5 = v4 & v3;
            int v6 = (v5 & 7) << 3;
            long v7 = this.a[(v5 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v5 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v5 & v3;
                if(L.g(this.b[v10], object0)) {
                    return v10;
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return -1;
            }
            v += 8;
        }
    }

    @Override
    public int hashCode() {
        Object[] arr_object = this.b;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            Object object0 = arr_object[(v1 << 3) + v5];
                            v2 += (object0 == null ? 0 : object0.hashCode());
                        }
                        v3 >>= 8;
                    }
                    if(v4 != 8) {
                        return v2;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return v2;
        }
        return 0;
    }

    public final Object i() {
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
                            return arr_object[(v1 << 3) + v4];
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_16;
                    }
                    break;
                }
            label_16:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        throw new NoSuchElementException("The ScatterSet is empty");
    }

    public final Object j(@l Function1 function10) {
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
                            Object object0 = arr_object[(v1 << 3) + v4];
                            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                                return object0;
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
        throw new NoSuchElementException("Could not find a match");
    }

    @m
    public final Object k(@l Function1 function10) {
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
                            Object object0 = arr_object[(v1 << 3) + v4];
                            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                                return object0;
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
        return null;
    }

    public final void l(@l Function1 function10) {
        L.p(function10, "block");
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
                            function10.invoke(arr_object[(v1 << 3) + v4]);
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

    @b0
    public final void m(@l Function1 function10) {
        L.p(function10, "block");
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            function10.invoke(((int)((v1 << 3) + v4)));
                        }
                        v2 >>= 8;
                    }
                    if(v3 != 8) {
                        return;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
        }
    }

    @IntRange(from = 0L)
    public final int n() {
        return this.c;
    }

    @b0
    public static void o() {
    }

    @b0
    public static void p() {
    }

    @IntRange(from = 0L)
    public final int q() {
        return this.d;
    }

    public final boolean r() {
        return this.d == 0;
    }

    public final boolean s() {
        return this.d != 0;
    }

    @l
    @j
    public final String t() {
        return ScatterSet.A(this, null, null, null, 0, null, null, 0x3F, null);
    }

    @Override
    @l
    public String toString() {
        return ScatterSet.A(this, null, "[", "]", 0, null, new Function1() {
            final ScatterSet e;

            {
                this.e = scatterSet0;
                super(1);
            }

            @l
            public final CharSequence a(Object object0) {
                return object0 == this.e ? "(this)" : String.valueOf(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        }, 25, null);
    }

    @l
    @j
    public final String u(@l CharSequence charSequence0) {
        L.p(charSequence0, "separator");
        return ScatterSet.A(this, charSequence0, null, null, 0, null, null, 62, null);
    }

    @l
    @j
    public final String v(@l CharSequence charSequence0, @l CharSequence charSequence1) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        return ScatterSet.A(this, charSequence0, charSequence1, null, 0, null, null, 60, null);
    }

    @l
    @j
    public final String w(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        return ScatterSet.A(this, charSequence0, charSequence1, charSequence2, 0, null, null, 56, null);
    }

    @l
    @j
    public final String x(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        return ScatterSet.A(this, charSequence0, charSequence1, charSequence2, v, null, null, 0x30, null);
    }

    @l
    @j
    public final String y(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        return ScatterSet.A(this, charSequence0, charSequence1, charSequence2, v, charSequence3, null, 0x20, null);
    }

    @l
    @j
    public final String z(@l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        Object[] arr_object = this.b;
        long[] arr_v = this.a;
        int v1 = arr_v.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_35;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        Object object0 = arr_object[(v2 << 3) + v6];
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_41;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        if(function10 == null) {
                            stringBuilder0.append(object0);
                        }
                        else {
                            stringBuilder0.append(((CharSequence)function10.invoke(object0)));
                        }
                        ++v3;
                    }
                    v4 >>= 8;
                    ++v6;
                }
                if(v5 == 8) {
                label_35:
                    if(v2 != v1) {
                        ++v2;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_41;
            }
        }
        stringBuilder0.append(charSequence2);
    label_41:
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

