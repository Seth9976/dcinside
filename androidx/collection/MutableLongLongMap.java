package androidx.collection;

import A3.a;
import A3.o;
import kotlin.b0;
import kotlin.collections.l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;

@s0({"SMAP\nLongLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongLongMap.kt\nandroidx/collection/MutableLongLongMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 LongLongMap.kt\nandroidx/collection/LongLongMap\n+ 5 LongSet.kt\nandroidx/collection/LongSet\n+ 6 LongList.kt\nandroidx/collection/LongList\n+ 7 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,1047:1\n1037#1,2:1134\n1041#1,5:1142\n1037#1,2:1173\n1041#1,5:1181\n1037#1,2:1198\n1041#1,5:1206\n1037#1,2:1212\n1041#1,5:1220\n1#2:1048\n1672#3,6:1049\n1826#3:1065\n1688#3:1069\n1826#3:1087\n1688#3:1091\n1826#3:1112\n1688#3:1116\n1672#3,6:1136\n1672#3,6:1147\n1615#3:1156\n1619#3:1157\n1795#3,3:1158\n1809#3,3:1161\n1733#3:1164\n1721#3:1165\n1715#3:1166\n1728#3:1167\n1818#3:1168\n1682#3:1169\n1661#3:1170\n1680#3:1171\n1661#3:1172\n1672#3,6:1175\n1795#3,3:1186\n1826#3:1189\n1715#3:1190\n1685#3:1191\n1661#3:1192\n1615#3:1196\n1619#3:1197\n1672#3,6:1200\n1661#3:1211\n1672#3,6:1214\n1672#3,6:1225\n1672#3,6:1231\n385#4,4:1055\n357#4,6:1059\n367#4,3:1066\n370#4,2:1070\n389#4,2:1072\n373#4,6:1074\n391#4:1080\n357#4,6:1081\n367#4,3:1088\n370#4,9:1092\n262#5,4:1101\n232#5,7:1105\n243#5,3:1113\n246#5,2:1117\n266#5,2:1119\n249#5,6:1121\n268#5:1127\n253#6,6:1128\n849#7,3:1153\n849#7,3:1193\n*S KotlinDebug\n*F\n+ 1 LongLongMap.kt\nandroidx/collection/MutableLongLongMap\n*L\n875#1:1134,2\n875#1:1142,5\n933#1:1173,2\n933#1:1181,5\n1007#1:1198,2\n1007#1:1206,5\n1023#1:1212,2\n1023#1:1220,5\n711#1:1049,6\n789#1:1065\n789#1:1069\n828#1:1087\n828#1:1091\n855#1:1112\n855#1:1116\n875#1:1136,6\n885#1:1147,6\n899#1:1156\n900#1:1157\n907#1:1158,3\n908#1:1161,3\n909#1:1164\n910#1:1165\n910#1:1166\n914#1:1167\n917#1:1168\n926#1:1169\n926#1:1170\n932#1:1171\n932#1:1172\n933#1:1175,6\n948#1:1186,3\n949#1:1189\n951#1:1190\n1002#1:1191\n1002#1:1192\n1005#1:1196\n1007#1:1197\n1007#1:1200,6\n1021#1:1211\n1023#1:1214,6\n1038#1:1225,6\n1044#1:1231,6\n789#1:1055,4\n789#1:1059,6\n789#1:1066,3\n789#1:1070,2\n789#1:1072,2\n789#1:1074,6\n789#1:1080\n828#1:1081,6\n828#1:1088,3\n828#1:1092,9\n855#1:1101,4\n855#1:1105,7\n855#1:1113,3\n855#1:1117,2\n855#1:1119,2\n855#1:1121,6\n855#1:1127\n864#1:1128,6\n898#1:1153,3\n1004#1:1193,3\n*E\n"})
public final class MutableLongLongMap extends LongLongMap {
    private int f;

    public MutableLongLongMap() {
        this(0, 1, null);
    }

    public MutableLongLongMap(int v) {
        super(null);
        if(v < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        this.V(ScatterMapKt.z(v));
    }

    public MutableLongLongMap(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 6;
        }
        this(v);
    }

    private final void O() {
        if(this.d > 8 && b.a(((long)this.e) * 0x20L, ((long)this.d) * 25L) <= 0) {
            this.g0();
            return;
        }
        this.j0(ScatterMapKt.w(this.d));
    }

    public final void P() {
        this.e = 0;
        long[] arr_v = this.a;
        if(arr_v != ScatterMapKt.e) {
            l.U1(arr_v, 0x8080808080808080L, 0, 0, 6, null);
            int v = this.d >> 3;
            this.a[v] |= 0xFFL << ((this.d & 7) << 3);
        }
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

    private final int R(long v) {
        int v1 = (int)(v ^ v >>> 0x20);
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this.d;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = this.a[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v4 >> 3] >>> v6;
            long v8 = v7 ^ ((long)(v2 & 0x7F)) * 0x101010101010101L;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.b[v10] == v) {
                    return v10;
                }
            }
            if((~v7 << 6 & v7 & 0x8080808080808080L) != 0L) {
                int v11 = this.Q(v2 >>> 7);
                if(this.f == 0 && (this.a[v11 >> 3] >> ((v11 & 7) << 3) & 0xFFL) != 0xFEL) {
                    this.O();
                    v11 = this.Q(v2 >>> 7);
                }
                ++this.e;
                int v12 = this.f;
                long[] arr_v = this.a;
                long v13 = arr_v[v11 >> 3];
                int v14 = (v11 & 7) << 3;
                this.f = v12 - ((v13 >> v14 & 0xFFL) == 0x80L ? 1 : 0);
                arr_v[v11 >> 3] = v13 & ~(0xFFL << v14) | ((long)(v2 & 0x7F)) << v14;
                int v15 = (v11 - 7 & this.d) + (this.d & 7);
                int v16 = (v15 & 7) << 3;
                arr_v[v15 >> 3] = ~(0xFFL << v16) & arr_v[v15 >> 3] | ((long)(v2 & 0x7F)) << v16;
                return ~v11;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
        }
    }

    public final long S(long v, @y4.l a a0) {
        L.p(a0, "defaultValue");
        int v1 = this.i(v);
        if(v1 < 0) {
            long v2 = ((Number)a0.invoke()).longValue();
            this.c0(v, v2);
            return v2;
        }
        return this.c[v1];
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
        this.b = new long[v1];
        this.c = new long[v1];
    }

    public final void W(long v) {
        this.e0(v);
    }

    public final void X(@y4.l LongList longList0) {
        L.p(longList0, "keys");
        long[] arr_v = longList0.a;
        int v = longList0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            this.e0(arr_v[v1]);
        }
    }

    public final void Y(@y4.l LongSet longSet0) {
        L.p(longSet0, "keys");
        long[] arr_v = longSet0.b;
        long[] arr_v1 = longSet0.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            this.e0(arr_v[(v1 << 3) + v4]);
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

    public final void Z(@y4.l long[] arr_v) {
        L.p(arr_v, "keys");
        for(int v = 0; v < arr_v.length; ++v) {
            this.e0(arr_v[v]);
        }
    }

    public final void a0(@y4.l LongLongMap longLongMap0) {
        L.p(longLongMap0, "from");
        this.d0(longLongMap0);
    }

    public final long b0(long v, long v1, long v2) {
        int v3 = this.R(v);
        if(v3 < 0) {
            v3 = ~v3;
        }
        else {
            v2 = this.c[v3];
        }
        this.b[v3] = v;
        this.c[v3] = v1;
        return v2;
    }

    public final void c0(long v, long v1) {
        this.k0(v, v1);
    }

    public final void d0(@y4.l LongLongMap longLongMap0) {
        L.p(longLongMap0, "from");
        long[] arr_v = longLongMap0.b;
        long[] arr_v1 = longLongMap0.c;
        long[] arr_v2 = longLongMap0.a;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v2[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            this.k0(arr_v[v5], arr_v1[v5]);
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

    public final void e0(long v) {
        int v1 = this.i(v);
        if(v1 >= 0) {
            this.i0(v1);
        }
    }

    public final boolean f0(long v, long v1) {
        int v2 = this.i(v);
        if(v2 >= 0 && this.c[v2] == v1) {
            this.i0(v2);
            return true;
        }
        return false;
    }

    private final void g0() {
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

    public final void h0(@y4.l o o0) {
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
                            if(((Boolean)o0.invoke(((long)this.b[v5]), ((long)this.c[v5]))).booleanValue()) {
                                this.i0(v5);
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
    public final void i0(int v) {
        --this.e;
        long[] arr_v = this.a;
        int v1 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v1) | 0xFEL << v1;
        int v2 = (v - 7 & this.d) + (this.d & 7);
        int v3 = (v2 & 7) << 3;
        arr_v[v2 >> 3] = arr_v[v2 >> 3] & ~(0xFFL << v3) | 0xFEL << v3;
    }

    private final void j0(int v) {
        long[] arr_v = this.a;
        long[] arr_v1 = this.b;
        long[] arr_v2 = this.c;
        int v1 = this.d;
        this.V(v);
        long[] arr_v3 = this.b;
        long[] arr_v4 = this.c;
        for(int v2 = 0; v2 < v1; ++v2) {
            if((arr_v[v2 >> 3] >> ((v2 & 7) << 3) & 0xFFL) < 0x80L) {
                long v3 = arr_v1[v2];
                int v4 = (int)(v3 ^ v3 >>> 0x20);
                int v5 = v4 * 0xCC9E2D51 ^ v4 * 0xCC9E2D51 << 16;
                int v6 = this.Q(v5 >>> 7);
                long[] arr_v5 = this.a;
                int v7 = (v6 & 7) << 3;
                arr_v5[v6 >> 3] = arr_v5[v6 >> 3] & ~(0xFFL << v7) | ((long)(v5 & 0x7F)) << v7;
                int v8 = (v6 - 7 & this.d) + (this.d & 7);
                int v9 = (v8 & 7) << 3;
                arr_v5[v8 >> 3] = arr_v5[v8 >> 3] & ~(0xFFL << v9) | ((long)(v5 & 0x7F)) << v9;
                arr_v3[v6] = v3;
                arr_v4[v6] = arr_v2[v2];
            }
        }
    }

    public final void k0(long v, long v1) {
        int v2 = this.R(v);
        if(v2 < 0) {
            v2 = ~v2;
        }
        this.b[v2] = v;
        this.c[v2] = v1;
    }

    public final int l0() {
        int v = this.d;
        int v1 = ScatterMapKt.x(ScatterMapKt.z(this.e));
        if(v1 < v) {
            this.j0(v1);
            return v - this.d;
        }
        return 0;
    }

    private final void m0(int v, long v1) {
        long[] arr_v = this.a;
        int v2 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v2) | v1 << v2;
        int v3 = (v - 7 & this.d) + (this.d & 7);
        int v4 = (v3 & 7) << 3;
        arr_v[v3 >> 3] = v1 << v4 | arr_v[v3 >> 3] & ~(0xFFL << v4);
    }
}

