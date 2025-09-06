package androidx.collection;

import A3.a;
import A3.o;
import kotlin.b0;
import kotlin.collections.l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.sequences.m;

@s0({"SMAP\nObjectIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1074:1\n1064#1,2:1155\n1068#1,5:1163\n1064#1,2:1194\n1068#1,5:1202\n1064#1,2:1219\n1068#1,5:1227\n1064#1,2:1233\n1068#1,5:1241\n1#2:1075\n1672#3,6:1076\n1826#3:1092\n1688#3:1096\n1826#3:1114\n1688#3:1118\n1826#3:1139\n1688#3:1143\n1672#3,6:1157\n1672#3,6:1168\n1605#3,3:1174\n1615#3:1177\n1619#3:1178\n1795#3,3:1179\n1809#3,3:1182\n1733#3:1185\n1721#3:1186\n1715#3:1187\n1728#3:1188\n1818#3:1189\n1682#3:1190\n1661#3:1191\n1680#3:1192\n1661#3:1193\n1672#3,6:1196\n1795#3,3:1207\n1826#3:1210\n1715#3:1211\n1685#3:1212\n1661#3:1213\n1605#3,3:1214\n1615#3:1217\n1619#3:1218\n1672#3,6:1221\n1661#3:1232\n1672#3,6:1235\n1672#3,6:1246\n1672#3,6:1252\n401#4,4:1082\n373#4,6:1086\n383#4,3:1093\n386#4,2:1097\n406#4,2:1099\n389#4,6:1101\n408#4:1107\n373#4,6:1108\n383#4,3:1115\n386#4,9:1119\n267#5,4:1128\n237#5,7:1132\n248#5,3:1140\n251#5,2:1144\n272#5,2:1146\n254#5,6:1148\n274#5:1154\n*S KotlinDebug\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n*L\n900#1:1155,2\n900#1:1163,5\n960#1:1194,2\n960#1:1202,5\n1034#1:1219,2\n1034#1:1227,5\n1050#1:1233,2\n1050#1:1241,5\n728#1:1076,6\n804#1:1092\n804#1:1096\n843#1:1114\n843#1:1118\n889#1:1139\n889#1:1143\n900#1:1157,6\n911#1:1168,6\n925#1:1174,3\n926#1:1177\n927#1:1178\n934#1:1179,3\n935#1:1182,3\n936#1:1185\n937#1:1186\n937#1:1187\n941#1:1188\n944#1:1189\n953#1:1190\n953#1:1191\n959#1:1192\n959#1:1193\n960#1:1196,6\n975#1:1207,3\n976#1:1210\n978#1:1211\n1029#1:1212\n1029#1:1213\n1031#1:1214,3\n1032#1:1217\n1034#1:1218\n1034#1:1221,6\n1048#1:1232\n1050#1:1235,6\n1065#1:1246,6\n1071#1:1252,6\n804#1:1082,4\n804#1:1086,6\n804#1:1093,3\n804#1:1097,2\n804#1:1099,2\n804#1:1101,6\n804#1:1107\n843#1:1108,6\n843#1:1115,3\n843#1:1119,9\n889#1:1128,4\n889#1:1132,7\n889#1:1140,3\n889#1:1144,2\n889#1:1146,2\n889#1:1148,6\n889#1:1154\n*E\n"})
public final class MutableObjectIntMap extends ObjectIntMap {
    private int f;

    public MutableObjectIntMap() {
        this(0, 1, null);
    }

    public MutableObjectIntMap(int v) {
        super(null);
        if(v < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        this.V(ScatterMapKt.z(v));
    }

    public MutableObjectIntMap(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 6;
        }
        this(v);
    }

    private final void O() {
        if(this.d > 8 && b.a(((long)this.e) * 0x20L, ((long)this.d) * 25L) <= 0) {
            this.h0();
            return;
        }
        this.k0(ScatterMapKt.w(this.d));
    }

    public final void P() {
        this.e = 0;
        long[] arr_v = this.a;
        if(arr_v != ScatterMapKt.e) {
            l.U1(arr_v, 0x8080808080808080L, 0, 0, 6, null);
            int v = this.d >> 3;
            this.a[v] |= 0xFFL << ((this.d & 7) << 3);
        }
        l.M1(this.b, null, 0, this.d);
        this.T();
    }

    private final int Q(int v) {
        long v6;
        int v1 = this.d;
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

    private final int R(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this.d;
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
                int v10 = this.Q(v1 >>> 7);
                if(this.f == 0 && (this.a[v10 >> 3] >> ((v10 & 7) << 3) & 0xFFL) != 0xFEL) {
                    this.O();
                    v10 = this.Q(v1 >>> 7);
                }
                ++this.e;
                int v11 = this.f;
                long[] arr_v = this.a;
                long v12 = arr_v[v10 >> 3];
                int v13 = (v10 & 7) << 3;
                this.f = v11 - ((v12 >> v13 & 0xFFL) == 0x80L ? 1 : 0);
                arr_v[v10 >> 3] = v12 & ~(0xFFL << v13) | ((long)(v1 & 0x7F)) << v13;
                int v14 = (v10 - 7 & this.d) + (this.d & 7);
                int v15 = (v14 & 7) << 3;
                arr_v[v14 >> 3] = ~(0xFFL << v15) & arr_v[v14 >> 3] | ((long)(v1 & 0x7F)) << v15;
                return ~v10;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final int S(Object object0, @y4.l a a0) {
        L.p(a0, "defaultValue");
        int v = this.i(object0);
        if(v >= 0) {
            return this.c[v];
        }
        int v1 = ((Number)a0.invoke()).intValue();
        this.l0(object0, v1);
        return v1;
    }

    private final void T() {
        this.f = ScatterMapKt.o(this.o()) - this.e;
    }

    private final void U(int v) {
        long[] arr_v;
        if(v == 0) {
            arr_v = ScatterMapKt.e;
        }
        else {
            arr_v = new long[(v + 15 & -8) >> 3];
            l.U1(arr_v, 0x8080808080808080L, 0, 0, 6, null);
        }
        this.a = arr_v;
        arr_v[v >> 3] |= 0xFFL << ((v & 7) << 3);
        this.T();
    }

    private final void V(int v) {
        int v1 = v <= 0 ? 0 : Math.max(7, ScatterMapKt.x(v));
        this.d = v1;
        this.U(v1);
        this.b = new Object[v1];
        this.c = new int[v1];
    }

    public final void W(@y4.l ScatterSet scatterSet0) {
        L.p(scatterSet0, "keys");
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
                            this.f0(arr_object[(v1 << 3) + v4]);
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

    public final void X(@y4.l Iterable iterable0) {
        L.p(iterable0, "keys");
        for(Object object0: iterable0) {
            this.f0(object0);
        }
    }

    public final void Y(Object object0) {
        this.f0(object0);
    }

    public final void Z(@y4.l m m0) {
        L.p(m0, "keys");
        for(Object object0: m0) {
            this.f0(object0);
        }
    }

    public final void a0(@y4.l Object[] arr_object) {
        L.p(arr_object, "keys");
        for(int v = 0; v < arr_object.length; ++v) {
            this.f0(arr_object[v]);
        }
    }

    public final void b0(@y4.l ObjectIntMap objectIntMap0) {
        L.p(objectIntMap0, "from");
        this.e0(objectIntMap0);
    }

    public final int c0(Object object0, int v, int v1) {
        int v2 = this.R(object0);
        if(v2 < 0) {
            v2 = ~v2;
        }
        else {
            v1 = this.c[v2];
        }
        this.b[v2] = object0;
        this.c[v2] = v;
        return v1;
    }

    public final void d0(Object object0, int v) {
        this.l0(object0, v);
    }

    public final void e0(@y4.l ObjectIntMap objectIntMap0) {
        L.p(objectIntMap0, "from");
        Object[] arr_object = objectIntMap0.b;
        int[] arr_v = objectIntMap0.c;
        long[] arr_v1 = objectIntMap0.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            this.l0(arr_object[v5], arr_v[v5]);
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

    public final void f0(Object object0) {
        int v = this.i(object0);
        if(v >= 0) {
            this.j0(v);
        }
    }

    public final boolean g0(Object object0, int v) {
        int v1 = this.i(object0);
        if(v1 >= 0 && this.c[v1] == v) {
            this.j0(v1);
            return true;
        }
        return false;
    }

    private final void h0() {
        long[] arr_v = this.a;
        int v = this.d;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = (v1 & 7) << 3;
            if((arr_v[v1 >> 3] >> v3 & 0xFFL) == 0xFEL) {
                long[] arr_v1 = this.a;
                arr_v1[v1 >> 3] = 0x80L << v3 | arr_v1[v1 >> 3] & ~(0xFFL << v3);
                int v4 = (v1 - 7 & this.d) + (this.d & 7);
                int v5 = (v4 & 7) << 3;
                arr_v1[v4 >> 3] = ~(0xFFL << v5) & arr_v1[v4 >> 3] | 0x80L << v5;
                ++v2;
            }
        }
        this.f += v2;
    }

    public final void i0(@y4.l o o0) {
        L.p(o0, "predicate");
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
                            if(((Boolean)o0.invoke(this.b[v5], ((int)this.c[v5]))).booleanValue()) {
                                this.j0(v5);
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_18;
                    }
                    break;
                }
            label_18:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    @b0
    public final void j0(int v) {
        --this.e;
        long[] arr_v = this.a;
        int v1 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v1) | 0xFEL << v1;
        int v2 = (v - 7 & this.d) + (this.d & 7);
        int v3 = (v2 & 7) << 3;
        arr_v[v2 >> 3] = arr_v[v2 >> 3] & ~(0xFFL << v3) | 0xFEL << v3;
        this.b[v] = null;
    }

    private final void k0(int v) {
        int v7;
        long[] arr_v = this.a;
        Object[] arr_object = this.b;
        int[] arr_v1 = this.c;
        int v1 = this.d;
        this.V(v);
        Object[] arr_object1 = this.b;
        int[] arr_v2 = this.c;
        for(int v2 = 0; v2 < v1; v2 = v7 + 1) {
            if((arr_v[v2 >> 3] >> ((v2 & 7) << 3) & 0xFFL) < 0x80L) {
                Object object0 = arr_object[v2];
                int v3 = object0 == null ? 0 : object0.hashCode();
                int v4 = v3 * 0xCC9E2D51 ^ v3 * 0xCC9E2D51 << 16;
                int v5 = this.Q(v4 >>> 7);
                long[] arr_v3 = this.a;
                int v6 = (v5 & 7) << 3;
                v7 = v2;
                arr_v3[v5 >> 3] = arr_v3[v5 >> 3] & ~(0xFFL << v6) | ((long)(v4 & 0x7F)) << v6;
                int v8 = (v5 - 7 & this.d) + (this.d & 7);
                int v9 = (v8 & 7) << 3;
                arr_v3[v8 >> 3] = arr_v3[v8 >> 3] & ~(0xFFL << v9) | ((long)(v4 & 0x7F)) << v9;
                arr_object1[v5] = object0;
                arr_v2[v5] = arr_v1[v7];
            }
            else {
                v7 = v2;
            }
        }
    }

    public final void l0(Object object0, int v) {
        int v1 = this.R(object0);
        if(v1 < 0) {
            v1 = ~v1;
        }
        this.b[v1] = object0;
        this.c[v1] = v;
    }

    public final int m0() {
        int v = this.d;
        int v1 = ScatterMapKt.x(ScatterMapKt.z(this.e));
        if(v1 < v) {
            this.k0(v1);
            return v - this.d;
        }
        return 0;
    }

    private final void n0(int v, long v1) {
        long[] arr_v = this.a;
        int v2 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v2) | v1 << v2;
        int v3 = (v - 7 & this.d) + (this.d & 7);
        int v4 = (v3 & 7) << 3;
        arr_v[v3 >> 3] = v1 << v4 | arr_v[v3 >> 3] & ~(0xFFL << v4);
    }
}

