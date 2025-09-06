package androidx.compose.runtime;

import A3.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

@s0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3443:1\n82#2,3:3444\n33#2,4:3447\n85#2,2:3451\n38#2:3453\n87#2:3454\n1#3:3455\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3246#1:3444,3\n3246#1:3447,4\n3246#1:3451,2\n3246#1:3453\n3246#1:3454\n*E\n"})
public final class SlotTableKt {
    private static final int a = -2;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 5;
    private static final int h = 0x40000000;
    private static final int i = 0x20000000;
    private static final int j = 29;
    private static final int k = 0x10000000;
    private static final int l = 28;
    private static final int m = 0x8000000;
    private static final int n = 0x4000000;
    private static final int o = 28;
    private static final int p = 0x3FFFFFF;
    private static final int q = 0x20;
    private static final int r = 0x20;

    private static final void G(int[] arr_v, int v) {
        int v1 = v * 5 + 1;
        arr_v[v1] |= 0x10000000;
    }

    private static final int H(int[] arr_v, int v) {
        return v * 5 < arr_v.length ? SlotTableKt.K(arr_v[v * 5 + 1] >> 29) + arr_v[v * 5 + 4] : arr_v.length;
    }

    private static final boolean I(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0xC000000) != 0;
    }

    private static final boolean J(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0x4000000) != 0;
    }

    private static final int K(int v) {
        switch(v) {
            case 0: {
                return 0;
            }
            case 1: 
            case 2: 
            case 4: {
                return 1;
            }
            case 3: 
            case 5: 
            case 6: {
                return 2;
            }
            default: {
                return 3;
            }
        }
    }

    private static final int L(int[] arr_v, int v) {
        return arr_v[v * 5 + 4];
    }

    private static final List M(int[] arr_v, int v) {
        return SlotTableKt.l0(arr_v, s.B1(s.W1(4, v), 5));
    }

    static List N(int[] arr_v, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = arr_v.length;
        }
        return SlotTableKt.M(arr_v, v);
    }

    private static final Anchor O(ArrayList arrayList0, int v, int v1, a a0) {
        int v2 = SlotTableKt.k0(arrayList0, v, v1);
        if(v2 < 0) {
            Anchor anchor0 = (Anchor)a0.invoke();
            arrayList0.add(-(v2 + 1), anchor0);
            return anchor0;
        }
        Object object0 = arrayList0.get(v2);
        L.o(object0, "get(location)");
        return (Anchor)object0;
    }

    private static final int P(int[] arr_v, int v) {
        return arr_v[v * 5 + 1];
    }

    private static final int Q(int[] arr_v, int v) {
        return arr_v[v * 5 + 3];
    }

    private static final List R(int[] arr_v, int v) {
        return SlotTableKt.l0(arr_v, s.B1(s.W1(3, v), 5));
    }

    static List S(int[] arr_v, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = arr_v.length;
        }
        return SlotTableKt.R(arr_v, v);
    }

    private static final boolean T(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0x10000000) != 0;
    }

    private static final boolean U(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0x8000000) != 0;
    }

    private static final boolean V(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0x20000000) != 0;
    }

    private static final void W(int[] arr_v, int v, int v1, boolean z, boolean z1, boolean z2, int v2, int v3) {
        arr_v[v * 5] = v1;
        arr_v[v * 5 + 1] = (z ? 0x40000000 : 0) | (z1 ? 0x20000000 : 0) | (z2 ? 0x10000000 : 0);
        arr_v[v * 5 + 2] = v2;
        arr_v[v * 5 + 3] = 0;
        arr_v[v * 5 + 4] = v3;
    }

    private static final boolean X(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0x40000000) != 0;
    }

    private static final int Y(int[] arr_v, int v) {
        return arr_v[v * 5];
    }

    private static final List Z(int[] arr_v, int v) {
        return SlotTableKt.l0(arr_v, s.B1(s.W1(0, v), 5));
    }

    static List a0(int[] arr_v, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = arr_v.length;
        }
        return SlotTableKt.Z(arr_v, v);
    }

    private static final int b0(ArrayList arrayList0, int v, int v1) {
        int v2 = SlotTableKt.k0(arrayList0, v, v1);
        return v2 >= 0 ? v2 : -(v2 + 1);
    }

    private static final int c0(int[] arr_v, int v) {
        return arr_v[v * 5 + 1] & 0x3FFFFFF;
    }

    private static final List d0(int[] arr_v, int v) {
        List list0 = SlotTableKt.l0(arr_v, s.B1(s.W1(1, v), 5));
        List list1 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            list1.add(((int)(((Number)list0.get(v2)).intValue() & 0x3FFFFFF)));
        }
        return list1;
    }

    static List e0(int[] arr_v, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = arr_v.length;
        }
        return SlotTableKt.d0(arr_v, v);
    }

    private static final int f0(int[] arr_v, int v) {
        return arr_v[v * 5 + 4];
    }

    private static final int g0(int[] arr_v, int v) {
        return arr_v[v * 5 + 4] + SlotTableKt.K(arr_v[v * 5 + 1] >> 30);
    }

    private static final int h0(int[] arr_v, int v) {
        return arr_v[v * 5 + 2];
    }

    private static final List i0(int[] arr_v, int v) {
        return SlotTableKt.l0(arr_v, s.B1(s.W1(2, v), 5));
    }

    static List j0(int[] arr_v, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = arr_v.length;
        }
        return SlotTableKt.i0(arr_v, v);
    }

    private static final int k0(ArrayList arrayList0, int v, int v1) {
        int v2 = arrayList0.size() - 1;
        int v3 = 0;
        while(v3 <= v2) {
            int v4 = v3 + v2 >>> 1;
            int v5 = ((Anchor)arrayList0.get(v4)).a();
            if(v5 < 0) {
                v5 += v1;
            }
            int v6 = L.t(v5, v);
            if(v6 < 0) {
                v3 = v4 + 1;
                continue;
            }
            if(v6 > 0) {
                v2 = v4 - 1;
                continue;
            }
            return v4;
        }
        return -(v3 + 1);
    }

    private static final List l0(int[] arr_v, Iterable iterable0) {
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            list0.add(((int)arr_v[((Number)object0).intValue()]));
        }
        return list0;
    }

    private static final int m0(int[] arr_v, int v) {
        return arr_v[v * 5 + 4] + SlotTableKt.K(arr_v[v * 5 + 1] >> 28);
    }

    private static final void n0(int[] arr_v, int v, boolean z) {
        int v1 = v * 5 + 1;
        if(z) {
            arr_v[v1] |= 0x4000000;
            return;
        }
        arr_v[v1] &= 0xFBFFFFFF;
    }

    private static final void o0(int[] arr_v, int v, int v1) {
        arr_v[v * 5 + 4] = v1;
    }

    private static final void p0(int[] arr_v, int v, int v1) {
        arr_v[v * 5] = v1;
    }

    private static final void q0(int[] arr_v, int v, int v1) {
        ComposerKt.q0(v1 >= 0);
        arr_v[v * 5 + 3] = v1;
    }

    private static final void r0(int[] arr_v, int v, boolean z) {
        int v1 = v * 5 + 1;
        if(z) {
            arr_v[v1] |= 0x8000000;
            return;
        }
        arr_v[v1] &= 0xF7FFFFFF;
    }

    private static final void s0(int[] arr_v, int v, int v1) {
        ComposerKt.q0(v1 >= 0 && v1 < 0x3FFFFFF);
        int v2 = v * 5 + 1;
        arr_v[v2] = v1 | arr_v[v2] & 0xFC000000;
    }

    private static final void t0(int[] arr_v, int v, int v1) {
        arr_v[v * 5 + 2] = v1;
    }
}

