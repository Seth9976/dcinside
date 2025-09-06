package androidx.collection;

import androidx.annotation.IntRange;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 IntSet.kt\nandroidx/collection/IntSet\n+ 6 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,853:1\n832#1,2:997\n836#1,5:1005\n832#1,2:1036\n836#1,5:1044\n832#1,2:1061\n836#1,5:1069\n832#1,2:1075\n836#1,5:1083\n1#2:854\n1672#3,6:855\n1826#3:874\n1688#3:878\n1619#3:895\n1615#3:898\n1795#3,3:902\n1809#3,3:906\n1733#3:910\n1721#3:912\n1715#3:913\n1728#3:918\n1818#3:920\n1619#3:934\n1615#3:937\n1795#3,3:941\n1809#3,3:945\n1733#3:949\n1721#3:951\n1715#3:952\n1728#3:957\n1818#3:959\n1826#3:981\n1688#3:985\n1672#3,6:999\n1672#3,6:1010\n1615#3:1019\n1619#3:1020\n1795#3,3:1021\n1809#3,3:1024\n1733#3:1027\n1721#3:1028\n1715#3:1029\n1728#3:1030\n1818#3:1031\n1682#3:1032\n1661#3:1033\n1680#3:1034\n1661#3:1035\n1672#3,6:1038\n1795#3,3:1049\n1826#3:1052\n1715#3:1053\n1685#3:1054\n1661#3:1055\n1615#3:1059\n1619#3:1060\n1672#3,6:1063\n1661#3:1074\n1672#3,6:1077\n1672#3,6:1088\n1672#3,6:1094\n13600#4,2:861\n13600#4,2:968\n262#5,4:863\n232#5,7:867\n243#5,3:875\n246#5,2:879\n266#5,2:881\n249#5,6:883\n268#5:889\n442#5:890\n443#5:894\n445#5,2:896\n447#5,3:899\n450#5:905\n451#5:909\n452#5:911\n453#5,4:914\n459#5:919\n460#5,8:921\n442#5:929\n443#5:933\n445#5,2:935\n447#5,3:938\n450#5:944\n451#5:948\n452#5:950\n453#5,4:953\n459#5:958\n460#5,8:960\n262#5,4:970\n232#5,7:974\n243#5,3:982\n246#5,2:986\n266#5,2:988\n249#5,6:990\n268#5:996\n849#6,3:891\n849#6,3:930\n849#6,3:1016\n849#6,3:1056\n*S KotlinDebug\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n*L\n673#1:997,2\n673#1:1005,5\n731#1:1036,2\n731#1:1044,5\n803#1:1061,2\n803#1:1069,5\n818#1:1075,2\n818#1:1083,5\n526#1:855,6\n595#1:874\n595#1:878\n607#1:895\n607#1:898\n607#1:902,3\n607#1:906,3\n607#1:910\n607#1:912\n607#1:913\n607#1:918\n607#1:920\n620#1:934\n620#1:937\n620#1:941,3\n620#1:945,3\n620#1:949\n620#1:951\n620#1:952\n620#1:957\n620#1:959\n663#1:981\n663#1:985\n673#1:999,6\n683#1:1010,6\n697#1:1019\n698#1:1020\n705#1:1021,3\n706#1:1024,3\n707#1:1027\n708#1:1028\n708#1:1029\n712#1:1030\n715#1:1031\n724#1:1032\n724#1:1033\n730#1:1034\n730#1:1035\n731#1:1038,6\n745#1:1049,3\n746#1:1052\n748#1:1053\n798#1:1054\n798#1:1055\n801#1:1059\n803#1:1060\n803#1:1063,6\n816#1:1074\n818#1:1077,6\n833#1:1088,6\n839#1:1094,6\n573#1:861,2\n642#1:968,2\n595#1:863,4\n595#1:867,7\n595#1:875,3\n595#1:879,2\n595#1:881,2\n595#1:883,6\n595#1:889\n607#1:890\n607#1:894\n607#1:896,2\n607#1:899,3\n607#1:905\n607#1:909\n607#1:911\n607#1:914,4\n607#1:919\n607#1:921,8\n620#1:929\n620#1:933\n620#1:935,2\n620#1:938,3\n620#1:944\n620#1:948\n620#1:950\n620#1:953,4\n620#1:958\n620#1:960,8\n663#1:970,4\n663#1:974,7\n663#1:982,3\n663#1:986,2\n663#1:988,2\n663#1:990,6\n663#1:996\n607#1:891,3\n620#1:930,3\n696#1:1016,3\n800#1:1056,3\n*E\n"})
public final class MutableIntSet extends IntSet {
    private int e;

    public MutableIntSet() {
        this(0, 1, null);
    }

    public MutableIntSet(int v) {
        super(null);
        if(v < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        this.P(ScatterMapKt.z(v));
    }

    public MutableIntSet(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 6;
        }
        this(v);
    }

    public final boolean G(int v) {
        int v1 = this.d;
        this.b[this.L(v)] = v;
        return this.d != v1;
    }

    public final boolean H(@l IntSet intSet0) {
        L.p(intSet0, "elements");
        int v = this.d;
        this.U(intSet0);
        return v != this.d;
    }

    public final boolean I(@l int[] arr_v) {
        L.p(arr_v, "elements");
        int v = this.d;
        this.V(arr_v);
        return v != this.d;
    }

    private final void J() {
        if(this.c > 8 && b.a(((long)this.d) * 0x20L, ((long)this.c) * 25L) <= 0) {
            this.Z();
            return;
        }
        this.b0(ScatterMapKt.w(this.c));
    }

    public final void K() {
        this.d = 0;
        long[] arr_v = this.a;
        if(arr_v != ScatterMapKt.e) {
            kotlin.collections.l.U1(arr_v, 0x8080808080808080L, 0, 0, 6, null);
            int v = this.c >> 3;
            this.a[v] |= 0xFFL << ((this.c & 7) << 3);
        }
        this.N();
    }

    private final int L(int v) {
        int v1 = 0xCC9E2D51 * v ^ 0xCC9E2D51 * v << 16;
        int v2 = this.c;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = v6 ^ ((long)(v1 & 0x7F)) * 0x101010101010101L;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = v3 + (Long.numberOfTrailingZeros(v8) >> 3) & v2;
                if(this.b[v9] == v) {
                    return v9;
                }
            }
            if((~v6 << 6 & v6 & 0x8080808080808080L) != 0L) {
                int v10 = this.M(v1 >>> 7);
                if(this.e == 0 && (this.a[v10 >> 3] >> ((v10 & 7) << 3) & 0xFFL) != 0xFEL) {
                    this.J();
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
        this.e = ScatterMapKt.o(this.l()) - this.d;
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
        this.b = new int[v1];
    }

    public final void Q(int v) {
        int v10;
        int v1 = 0xCC9E2D51 * v ^ 0xCC9E2D51 * v << 16;
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
                if(this.b[v9] == v) {
                    v10 = v9;
                    goto label_17;
                }
                v8 &= v8 - 1L;
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) == 0L) {
                goto label_20;
            }
            else {
                v10 = -1;
            }
        label_17:
            if(v10 >= 0) {
                this.a0(v10);
            }
            return;
        label_20:
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final void R(@l IntSet intSet0) {
        L.p(intSet0, "elements");
        int[] arr_v = intSet0.b;
        long[] arr_v1 = intSet0.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            this.Q(arr_v[(v1 << 3) + v4]);
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

    public final void S(@l int[] arr_v) {
        L.p(arr_v, "elements");
        for(int v = 0; v < arr_v.length; ++v) {
            this.Q(arr_v[v]);
        }
    }

    public final void T(int v) {
        this.b[this.L(v)] = v;
    }

    public final void U(@l IntSet intSet0) {
        L.p(intSet0, "elements");
        int[] arr_v = intSet0.b;
        long[] arr_v1 = intSet0.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            this.T(arr_v[(v1 << 3) + v4]);
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

    public final void V(@l int[] arr_v) {
        L.p(arr_v, "elements");
        for(int v = 0; v < arr_v.length; ++v) {
            this.T(arr_v[v]);
        }
    }

    public final boolean W(int v) {
        int v10;
        int v1 = 0xCC9E2D51 * v ^ 0xCC9E2D51 * v << 16;
        int v2 = this.c;
        int v3 = v1 >>> 7 & v2;
        boolean z = false;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L;
            while(v8 != 0L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.b[v9] == v) {
                    v10 = v9;
                    goto label_18;
                }
                v8 &= v8 - 1L;
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) == 0L) {
                goto label_22;
            }
            else {
                v10 = -1;
            }
        label_18:
            if(v10 >= 0) {
                z = true;
                this.a0(v10);
            }
            return z;
        label_22:
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final boolean X(@l IntSet intSet0) {
        L.p(intSet0, "elements");
        int v = this.d;
        this.R(intSet0);
        return v != this.d;
    }

    public final boolean Y(@l int[] arr_v) {
        L.p(arr_v, "elements");
        int v = this.d;
        this.S(arr_v);
        return v != this.d;
    }

    private final void Z() {
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

    private final void a0(int v) {
        --this.d;
        long[] arr_v = this.a;
        int v1 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v1) | 0xFEL << v1;
        int v2 = (v - 7 & this.c) + (this.c & 7);
        int v3 = (v2 & 7) << 3;
        arr_v[v2 >> 3] = arr_v[v2 >> 3] & ~(0xFFL << v3) | 0xFEL << v3;
    }

    private final void b0(int v) {
        long[] arr_v = this.a;
        int[] arr_v1 = this.b;
        int v1 = this.c;
        this.P(v);
        int[] arr_v2 = this.b;
        for(int v2 = 0; v2 < v1; ++v2) {
            if((arr_v[v2 >> 3] >> ((v2 & 7) << 3) & 0xFFL) < 0x80L) {
                int v3 = arr_v1[v2];
                int v4 = 0xCC9E2D51 * v3 ^ 0xCC9E2D51 * v3 << 16;
                int v5 = this.M(v4 >>> 7);
                long[] arr_v3 = this.a;
                int v6 = (v5 & 7) << 3;
                arr_v3[v5 >> 3] = ~(0xFFL << v6) & arr_v3[v5 >> 3] | ((long)(v4 & 0x7F)) << v6;
                int v7 = (v5 - 7 & this.c) + (this.c & 7);
                int v8 = (v7 & 7) << 3;
                arr_v3[v7 >> 3] = ~(0xFFL << v8) & arr_v3[v7 >> 3] | ((long)(v4 & 0x7F)) << v8;
                arr_v2[v5] = v3;
            }
        }
    }

    @IntRange(from = 0L)
    public final int c0() {
        int v = this.c;
        int v1 = ScatterMapKt.x(ScatterMapKt.z(this.d));
        if(v1 < v) {
            this.b0(v1);
            return v - this.c;
        }
        return 0;
    }

    private final void d0(int v, long v1) {
        long[] arr_v = this.a;
        int v2 = (v & 7) << 3;
        arr_v[v >> 3] = arr_v[v >> 3] & ~(0xFFL << v2) | v1 << v2;
        int v3 = (v - 7 & this.c) + (this.c & 7);
        int v4 = (v3 & 7) << 3;
        arr_v[v3 >> 3] = v1 << v4 | arr_v[v3 >> 3] & ~(0xFFL << v4);
    }
}

