package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.l;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlin.y;
import y4.m;

@s0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3443:1\n4492#2,5:3444\n4492#2,5:3449\n4492#2,5:3454\n4492#2,5:3459\n4492#2,5:3465\n4492#2,5:3470\n4492#2,5:3475\n4492#2,5:3480\n4492#2,5:3485\n4492#2,5:3490\n4492#2,5:3495\n4492#2,5:3500\n4492#2,5:3505\n4492#2,5:3510\n4492#2,5:3515\n4492#2,5:3520\n4492#2,5:3525\n4492#2,5:3530\n4492#2,5:3543\n4492#2,5:3562\n4492#2,5:3567\n4492#2,5:3572\n1#3:3464\n162#4,8:3535\n162#4,8:3548\n3323#5,6:3556\n33#6,6:3577\n82#6,3:3583\n33#6,4:3586\n85#6,2:3590\n38#6:3592\n87#6:3593\n231#6,3:3594\n64#6,4:3597\n234#6,2:3601\n69#6:3603\n236#6:3604\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1346#1:3444,5\n1370#1:3449,5\n1383#1:3454,5\n1386#1:3459,5\n1426#1:3465,5\n1441#1:3470,5\n1488#1:3475,5\n1493#1:3480,5\n1533#1:3485,5\n1544#1:3490,5\n1671#1:3495,5\n1747#1:3500,5\n1752#1:3505,5\n1784#1:3510,5\n1827#1:3515,5\n1828#1:3520,5\n1841#1:3525,5\n1935#1:3530,5\n2210#1:3543,5\n2500#1:3562,5\n2512#1:3567,5\n2703#1:3572,5\n2193#1:3535,8\n2282#1:3548,8\n2302#1:3556,6\n2799#1:3577,6\n2969#1:3583,3\n2969#1:3586,4\n2969#1:3590,2\n2969#1:3592\n2969#1:3593\n2972#1:3594,3\n2972#1:3597,4\n2972#1:3601,2\n2972#1:3603\n2972#1:3604\n*E\n"})
public final class SlotWriter {
    @s0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3443:1\n1#2:3444\n4492#3,5:3445\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2089#1:3445,5\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final List b(SlotWriter slotWriter0, int v, SlotWriter slotWriter1, boolean z, boolean z1) {
            boolean z4;
            List list0;
            int v18;
            int v17;
            int v15;
            boolean z3;
            int v1 = slotWriter0.i0(v);
            int v2 = v + v1;
            int v3 = slotWriter0.M(v);
            int v4 = slotWriter0.M(v2);
            int v5 = v4 - v3;
            boolean z2 = slotWriter0.J(v);
            slotWriter1.p0(v1);
            slotWriter1.r0(v5, slotWriter1.Y());
            if(slotWriter0.e < v2) {
                slotWriter0.B0(v2);
            }
            if(slotWriter0.j < v4) {
                slotWriter0.D0(v4, v2);
            }
            int[] arr_v = slotWriter1.b;
            int v6 = slotWriter1.Y();
            l.z0(slotWriter0.b, arr_v, v6 * 5, v * 5, v2 * 5);
            Object[] arr_object = slotWriter1.c;
            int v7 = slotWriter1.h;
            l.B0(slotWriter0.c, arr_object, v7, v3, v4);
            int v8 = slotWriter1.Z();
            SlotTableKt.t0(arr_v, v6, v8);
            int v9 = v6 - v;
            int v10 = v6 + v1;
            int v11 = v7 - slotWriter1.N(arr_v, v6);
            int v12 = slotWriter1.k;
            int v13 = slotWriter1.l;
            int v14 = v6;
            while(true) {
                z3 = false;
                if(v14 >= v10) {
                    break;
                }
                if(v14 == v6) {
                    v15 = v10;
                }
                else {
                    v15 = v10;
                    SlotTableKt.t0(arr_v, v14, SlotTableKt.h0(arr_v, v14) + v9);
                }
                int v16 = slotWriter1.N(arr_v, v14);
                if(v13 < v14) {
                    v17 = v11;
                    v18 = 0;
                }
                else {
                    v17 = v11;
                    v18 = slotWriter1.j;
                }
                SlotTableKt.o0(arr_v, v14, slotWriter1.P(v16 + v11, v18, v12, arr_object.length));
                if(v14 == v13) {
                    ++v13;
                }
                ++v14;
                v11 = v17;
                v10 = v15;
            }
            slotWriter1.l = v13;
            int v19 = SlotTableKt.b0(slotWriter0.d, v, slotWriter0.a0());
            int v20 = SlotTableKt.b0(slotWriter0.d, v2, slotWriter0.a0());
            if(v19 < v20) {
                ArrayList arrayList0 = slotWriter0.d;
                list0 = new ArrayList(v20 - v19);
                for(int v21 = v19; v21 < v20; ++v21) {
                    Object object0 = arrayList0.get(v21);
                    L.o(object0, "sourceAnchors[anchorIndex]");
                    ((Anchor)object0).c(((Anchor)object0).a() + v9);
                    ((ArrayList)list0).add(((Anchor)object0));
                }
                slotWriter1.d.addAll(SlotTableKt.b0(slotWriter1.d, slotWriter1.Y(), slotWriter1.a0()), list0);
                arrayList0.subList(v19, v20).clear();
            }
            else {
                list0 = u.H();
            }
            int v22 = slotWriter0.J0(v);
            int v23 = 1;
            if(z) {
                if(v22 >= 0) {
                    z3 = true;
                    slotWriter0.h1();
                    slotWriter0.A(v22 - slotWriter0.Y());
                    slotWriter0.h1();
                }
                slotWriter0.A(v - slotWriter0.Y());
                z4 = slotWriter0.Q0();
                if(z3) {
                    slotWriter0.b1();
                    slotWriter0.R();
                    slotWriter0.b1();
                    slotWriter0.R();
                }
            }
            else {
                boolean z5 = slotWriter0.R0(v, v1);
                slotWriter0.S0(v3, v5, v - 1);
                z4 = z5;
            }
            if(!z4) {
                int v24 = slotWriter1.n;
                if(!SlotTableKt.X(arr_v, v6)) {
                    v23 = SlotTableKt.c0(arr_v, v6);
                }
                slotWriter1.n = v24 + v23;
                if(z1) {
                    slotWriter1.r = v10;
                    slotWriter1.h = v7 + v5;
                }
                if(z2) {
                    slotWriter1.q1(v8);
                }
                return list0;
            }
            ComposerKt.A("Unexpectedly removed anchors");
            throw new y();
        }
    }

    @y4.l
    private final SlotTable a;
    @y4.l
    private int[] b;
    @y4.l
    private Object[] c;
    @y4.l
    private ArrayList d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    @y4.l
    private final IntStack o;
    @y4.l
    private final IntStack p;
    @y4.l
    private final IntStack q;
    private int r;
    private int s;
    private boolean t;
    @m
    private PrioritySet u;
    @y4.l
    public static final Companion v;

    static {
        SlotWriter.v = new Companion(null);
    }

    public SlotWriter(@y4.l SlotTable slotTable0) {
        L.p(slotTable0, "table");
        super();
        this.a = slotTable0;
        this.b = slotTable0.q();
        this.c = slotTable0.t();
        this.d = slotTable0.p();
        this.e = slotTable0.r();
        this.f = this.b.length / 5 - slotTable0.r();
        this.g = slotTable0.r();
        this.j = slotTable0.W();
        this.k = this.c.length - slotTable0.W();
        this.l = slotTable0.r();
        this.o = new IntStack();
        this.p = new IntStack();
        this.q = new IntStack();
        this.s = -1;
    }

    public final void A(int v) {
        if(v >= 0) {
            if(this.m > 0) {
                throw new IllegalStateException("Cannot call seek() while inserting");
            }
            if(v == 0) {
                return;
            }
            int v1 = this.r + v;
            if(v1 >= this.s && v1 <= this.g) {
                this.r = v1;
                int v2 = this.N(this.b, this.f0(v1));
                this.h = v2;
                this.i = v2;
                return;
            }
            ComposerKt.A(("Cannot seek outside the current group (" + this.s + '-' + this.g + ')').toString());
            throw new y();
        }
        ComposerKt.A("Cannot seek backwards");
        throw new y();
    }

    public final void A0(int v) {
        if(this.m == 0) {
            if(v >= 0) {
                if(v == 0) {
                    return;
                }
                int v1 = this.r;
                int v2 = this.s;
                int v3 = this.g;
                int v4 = v;
                int v5 = v1;
                while(v4 > 0) {
                    v5 += SlotTableKt.Q(this.b, this.f0(v5));
                    if(v5 <= v3) {
                        --v4;
                        continue;
                    }
                    ComposerKt.A("Parameter offset is out of bounds");
                    throw new y();
                }
                int v6 = SlotTableKt.Q(this.b, this.f0(v5));
                int v7 = this.h;
                int v8 = this.N(this.b, this.f0(v5));
                int v9 = v5 + v6;
                int v10 = this.N(this.b, this.f0(v9));
                int v11 = v10 - v8;
                this.r0(v11, Math.max(this.r - 1, 0));
                this.p0(v6);
                int[] arr_v = this.b;
                int v12 = this.f0(v9);
                l.z0(arr_v, arr_v, this.f0(v1) * 5, v12 * 5, v6 * 5 + v12 * 5);
                if(v11 > 0) {
                    l.B0(this.c, this.c, v7, this.O(v8 + v11), this.O(v10 + v11));
                }
                int v13 = v8 + v11;
                int v14 = this.j;
                int v15 = this.k;
                int v16 = this.l;
                for(int v17 = v1; v17 < v1 + v6; ++v17) {
                    int v18 = this.f0(v17);
                    this.s1(arr_v, v18, this.P(this.N(arr_v, v18) - (v13 - v7), (v16 >= v18 ? v14 : 0), v15, this.c.length));
                }
                this.y0(v9, v1, v6);
                if(!this.R0(v9, v6)) {
                    this.V(v2, this.g, v1);
                    if(v11 > 0) {
                        this.S0(v13, v11, v9 - 1);
                    }
                    return;
                }
                ComposerKt.A("Unexpectedly removed anchors");
                throw new y();
            }
            ComposerKt.A("Parameter offset is out of bounds");
            throw new y();
        }
        ComposerKt.A("Cannot move a group while inserting");
        throw new y();
    }

    @y4.l
    public final Anchor B(int v) {
        ArrayList arrayList0 = this.d;
        int v1 = SlotTableKt.k0(arrayList0, v, this.a0());
        if(v1 < 0) {
            if(v > this.e) {
                v = -(this.a0() - v);
            }
            Anchor anchor0 = new Anchor(v);
            arrayList0.add(-(v1 + 1), anchor0);
            return anchor0;
        }
        Object object0 = arrayList0.get(v1);
        L.o(object0, "get(location)");
        return (Anchor)object0;
    }

    private final void B0(int v) {
        int v1 = this.f;
        int v2 = this.e;
        if(v2 != v) {
            if(!this.d.isEmpty()) {
                this.o1(v2, v);
            }
            if(v1 > 0) {
                int[] arr_v = this.b;
                if(v < v2) {
                    l.z0(arr_v, arr_v, v1 * 5 + v * 5, v * 5, v2 * 5);
                }
                else {
                    l.z0(arr_v, arr_v, v2 * 5, v2 * 5 + v1 * 5, v * 5 + v1 * 5);
                }
            }
            if(v < v2) {
                v2 = v + v1;
            }
            int v3 = this.W();
            ComposerKt.q0(v2 < v3);
            while(v2 < v3) {
                int v4 = SlotTableKt.h0(this.b, v2);
                int v5 = this.N0(this.M0(v4), v);
                if(v5 != v4) {
                    SlotTableKt.t0(this.b, v2, v5);
                }
                ++v2;
                if(v2 == v) {
                    v2 += v1;
                }
            }
        }
        this.e = v;
    }

    public static Anchor C(SlotWriter slotWriter0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = slotWriter0.r;
        }
        return slotWriter0.B(v);
    }

    @y4.l
    public final List C0(int v, @y4.l SlotTable slotTable0, int v1) {
        List list0;
        boolean z = true;
        L.p(slotTable0, "table");
        if(this.m > 0 || this.i0(this.r + v) != 1) {
            z = false;
        }
        ComposerKt.q0(z);
        int v2 = this.r;
        int v3 = this.h;
        int v4 = this.i;
        this.A(v);
        this.h1();
        this.G();
        SlotWriter slotWriter0 = slotTable0.F();
        try {
            list0 = SlotWriter.v.b(slotWriter0, v1, this, false, true);
        }
        finally {
            slotWriter0.I();
        }
        this.S();
        this.R();
        this.r = v2;
        this.h = v3;
        this.i = v4;
        return list0;
    }

    public final int D(@y4.l Anchor anchor0) {
        L.p(anchor0, "anchor");
        int v = anchor0.a();
        return v >= 0 ? v : v + this.a0();
    }

    private final void D0(int v, int v1) {
        int v2 = this.k;
        int v3 = this.j;
        int v4 = this.l;
        if(v3 != v) {
            Object[] arr_object = this.c;
            if(v < v3) {
                l.B0(arr_object, arr_object, v + v2, v, v3);
            }
            else {
                l.B0(arr_object, arr_object, v3, v3 + v2, v + v2);
            }
            l.M1(arr_object, null, v, v + v2);
        }
        int v5 = Math.min(v1 + 1, this.a0());
        if(v4 != v5) {
            int v6 = this.c.length - v2;
            if(v5 < v4) {
                int v7 = this.f0(v5);
                int v8 = this.f0(v4);
                int v9 = this.e;
                while(v7 < v8) {
                    int v10 = SlotTableKt.L(this.b, v7);
                    if(v10 >= 0) {
                        SlotTableKt.o0(this.b, v7, -(v6 - v10 + 1));
                        ++v7;
                        if(v7 != v9) {
                            continue;
                        }
                        v7 += this.f;
                        continue;
                    }
                    ComposerKt.A("Unexpected anchor value, expected a positive anchor");
                    throw new y();
                }
            }
            else {
                int v11 = this.f0(v4);
                int v12 = this.f0(v5);
                while(v11 < v12) {
                    int v13 = SlotTableKt.L(this.b, v11);
                    if(v13 < 0) {
                        SlotTableKt.o0(this.b, v11, v13 + v6 + 1);
                        ++v11;
                        if(v11 != this.e) {
                            continue;
                        }
                        v11 += this.f;
                        continue;
                    }
                    ComposerKt.A("Unexpected anchor value, expected a negative anchor");
                    throw new y();
                }
            }
            this.l = v5;
        }
        this.j = v;
    }

    private final int E(int[] arr_v, int v) {
        return this.N(arr_v, v) + SlotTableKt.K(SlotTableKt.P(arr_v, v) >> 29);
    }

    @y4.l
    public final List E0(@y4.l Anchor anchor0, int v, @y4.l SlotWriter slotWriter0) {
        L.p(anchor0, "anchor");
        L.p(slotWriter0, "writer");
        boolean z = true;
        ComposerKt.q0(slotWriter0.m > 0);
        ComposerKt.q0(this.m == 0);
        ComposerKt.q0(anchor0.b());
        int v1 = this.D(anchor0) + v;
        int v2 = this.r;
        ComposerKt.q0(v2 <= v1 && v1 < this.g);
        int v3 = this.J0(v1);
        int v4 = this.i0(v1);
        int v5 = this.u0(v1) ? 1 : this.H0(v1);
        List list0 = SlotWriter.v.b(this, v1, slotWriter0, false, false);
        this.q1(v3);
        boolean z1 = v5 > 0;
        while(v3 >= v2) {
            int v6 = this.f0(v3);
            SlotTableKt.q0(this.b, v6, SlotTableKt.Q(this.b, v6) - v4);
            if(z1) {
                if(SlotTableKt.X(this.b, v6)) {
                    z1 = false;
                }
                else {
                    SlotTableKt.s0(this.b, v6, SlotTableKt.c0(this.b, v6) - v5);
                }
            }
            v3 = this.J0(v3);
        }
        if(z1) {
            if(this.n < v5) {
                z = false;
            }
            ComposerKt.q0(z);
            this.n -= v5;
        }
        return list0;
    }

    public final void F() {
        this.h1();
        while(!this.s0()) {
            this.q0(-3);
            this.a1();
        }
        this.R();
    }

    @m
    public final Object F0(int v) {
        int v1 = this.f0(v);
        if(SlotTableKt.X(this.b, v1)) {
            Object[] arr_object = this.c;
            return arr_object[this.O(this.I0(this.b, v1))];
        }
        return null;
    }

    public final void G() {
        int v = this.m;
        this.m = v + 1;
        if(v == 0) {
            this.V0();
        }
    }

    @m
    public final Object G0(@y4.l Anchor anchor0) {
        L.p(anchor0, "anchor");
        return this.F0(anchor0.e(this));
    }

    private final boolean H(int v) {
        int v1 = v + 1;
        int v2 = this.i0(v);
        while(v1 < v + v2) {
            if(SlotTableKt.I(this.b, this.f0(v1))) {
                return true;
            }
            v1 += this.i0(v1);
        }
        return false;
    }

    public final int H0(int v) {
        return SlotTableKt.c0(this.b, this.f0(v));
    }

    public final void I() {
        this.t = true;
        if(this.o.d()) {
            this.B0(this.a0());
            this.D0(this.c.length - this.k, this.e);
            this.O0();
        }
        this.a.i(this, this.b, this.e, this.c, this.j, this.d);
    }

    private final int I0(int[] arr_v, int v) {
        return this.N(arr_v, v);
    }

    private final boolean J(int v) {
        return v >= 0 && SlotTableKt.I(this.b, this.f0(v));
    }

    public final int J0(int v) {
        return this.L0(this.b, v);
    }

    private final boolean K(int v) {
        return v >= 0 && SlotTableKt.J(this.b, this.f0(v));
    }

    public final int K0(@y4.l Anchor anchor0) {
        L.p(anchor0, "anchor");
        return anchor0.b() ? this.L0(this.b, this.D(anchor0)) : -1;
    }

    private final int L(int v, int v1, int v2) {
        return v >= 0 ? v : v2 - v1 + v + 1;
    }

    private final int L0(int[] arr_v, int v) {
        return this.M0(SlotTableKt.h0(arr_v, this.f0(v)));
    }

    private final int M(int v) {
        return this.N(this.b, this.f0(v));
    }

    private final int M0(int v) {
        return v > -2 ? v : this.a0() + v + 2;
    }

    private final int N(int[] arr_v, int v) {
        return v < this.W() ? this.L(SlotTableKt.L(arr_v, v), this.k, this.c.length) : this.c.length - this.k;
    }

    private final int N0(int v, int v1) {
        return v < v1 ? v : -(this.a0() - v + 2);
    }

    private final int O(int v) {
        return v < this.j ? v : v + this.k;
    }

    private final void O0() {
        PrioritySet prioritySet0 = this.u;
        if(prioritySet0 != null) {
            while(prioritySet0.c()) {
                this.r1(prioritySet0.e(), prioritySet0);
            }
        }
    }

    private final int P(int v, int v1, int v2, int v3) {
        return v <= v1 ? v : -(v3 - v2 - v + 1);
    }

    private final boolean P0(int v, int v1) {
        int v2 = v1 + v;
        int v3 = SlotTableKt.b0(this.d, v2, this.W() - this.f);
        if(v3 >= this.d.size()) {
            --v3;
        }
        int v4 = v3 + 1;
        boolean z = false;
        int v5 = 0;
        while(v3 >= 0) {
            Object object0 = this.d.get(v3);
            L.o(object0, "anchors[index]");
            Anchor anchor0 = (Anchor)object0;
            int v6 = this.D(anchor0);
            if(v6 < v) {
                break;
            }
            if(v6 < v2) {
                anchor0.c(0x80000000);
                if(v5 == 0) {
                    v5 = v3 + 1;
                }
                v4 = v3;
            }
            --v3;
        }
        if(v4 < v5) {
            z = true;
            this.d.subList(v4, v5).clear();
        }
        return z;
    }

    private final List Q(int[] arr_v) {
        List list0 = SlotTableKt.N(this.b, 0, 1, null);
        List list1 = u.D4(u.m5(list0, s.W1(0, this.e)), u.m5(list0, s.W1(this.e + this.f, arr_v.length / 5)));
        List list2 = new ArrayList(list1.size());
        int v1 = list1.size();
        for(int v = 0; v < v1; ++v) {
            list2.add(this.L(((Number)list1.get(v)).intValue(), this.k, this.c.length));
        }
        return list2;
    }

    public final boolean Q0() {
        if(this.m == 0) {
            int v = this.r;
            int v1 = this.h;
            int v2 = this.a1();
            PrioritySet prioritySet0 = this.u;
            if(prioritySet0 != null) {
                while(prioritySet0.c() && prioritySet0.d() >= v) {
                    prioritySet0.e();
                }
            }
            boolean z = this.R0(v, this.r - v);
            this.S0(v1, this.h - v1, v - 1);
            this.r = v;
            this.h = v1;
            this.n -= v2;
            return z;
        }
        ComposerKt.A("Cannot remove group while inserting");
        throw new y();
    }

    public final int R() {
        int v = 1;
        int v1 = 0;
        boolean z = this.m > 0;
        int v2 = this.r;
        int v3 = this.g;
        int v4 = this.s;
        int v5 = this.f0(v4);
        int v6 = this.n;
        int v7 = v2 - v4;
        boolean z1 = SlotTableKt.X(this.b, v5);
        if(z) {
            SlotTableKt.q0(this.b, v5, v7);
            SlotTableKt.s0(this.b, v5, v6);
            int v8 = this.q.i();
            if(!z1) {
                v = v6;
            }
            this.n = v8 + v;
            this.s = this.L0(this.b, v4);
            return v6;
        }
        if(v2 == v3) {
            int v9 = SlotTableKt.Q(this.b, v5);
            int v10 = SlotTableKt.c0(this.b, v5);
            SlotTableKt.q0(this.b, v5, v7);
            SlotTableKt.s0(this.b, v5, v6);
            int v11 = this.o.i();
            this.U0();
            this.s = v11;
            int v12 = this.L0(this.b, v4);
            int v13 = this.q.i();
            this.n = v13;
            if(v12 == v11) {
                if(!z1) {
                    v1 = v6 - v10;
                }
                this.n = v13 + v1;
                return v6;
            }
            int v14 = v7 - v9;
            int v15 = z1 ? 0 : v6 - v10;
            if(v14 != 0 || v15 != 0) {
                while(v12 != 0 && v12 != v11 && (v15 != 0 || v14 != 0)) {
                    int v16 = this.f0(v12);
                    if(v14 != 0) {
                        int v17 = SlotTableKt.Q(this.b, v16);
                        SlotTableKt.q0(this.b, v16, v17 + v14);
                    }
                    if(v15 != 0) {
                        SlotTableKt.s0(this.b, v16, SlotTableKt.c0(this.b, v16) + v15);
                    }
                    if(SlotTableKt.X(this.b, v16)) {
                        v15 = 0;
                    }
                    v12 = this.L0(this.b, v12);
                }
            }
            this.n += v15;
            return v6;
        }
        ComposerKt.A("Expected to be at the end of a group");
        throw new y();
    }

    private final boolean R0(int v, int v1) {
        boolean z = false;
        if(v1 > 0) {
            ArrayList arrayList0 = this.d;
            this.B0(v);
            if(!arrayList0.isEmpty()) {
                z = this.P0(v, v1);
            }
            this.e = v;
            this.f += v1;
            int v2 = this.l;
            if(v2 > v) {
                this.l = Math.max(v, v2 - v1);
            }
            int v3 = this.g;
            if(v3 >= this.e) {
                this.g = v3 - v1;
            }
            if(this.K(this.s)) {
                this.q1(this.s);
            }
        }
        return z;
    }

    public final void S() {
        int v = this.m;
        if(v <= 0) {
            throw new IllegalStateException("Unbalanced begin/end insert");
        }
        this.m = v - 1;
        if(v - 1 == 0) {
            if(this.q.b() == this.o.b()) {
                this.U0();
                return;
            }
            ComposerKt.A("startGroup/endGroup mismatch while inserting");
            throw new y();
        }
    }

    private final void S0(int v, int v1, int v2) {
        if(v1 > 0) {
            int v3 = this.k;
            int v4 = v + v1;
            this.D0(v4, v2);
            this.j = v;
            this.k = v3 + v1;
            l.M1(this.c, null, v, v4);
            int v5 = this.i;
            if(v5 >= v) {
                this.i = v5 - v1;
            }
        }
    }

    public final void T(int v) {
        if(this.m <= 0) {
            int v1 = this.s;
            if(v1 != v) {
                if(v >= v1 && v < this.g) {
                    int v2 = this.r;
                    int v3 = this.h;
                    int v4 = this.i;
                    this.r = v;
                    this.h1();
                    this.r = v2;
                    this.h = v3;
                    this.i = v4;
                    return;
                }
                ComposerKt.A(("Started group at " + v + " must be a subgroup of the group at " + v1).toString());
                throw new y();
            }
            return;
        }
        ComposerKt.A("Cannot call ensureStarted() while inserting");
        throw new y();
    }

    public final void T0() {
        if(this.m == 0) {
            this.O0();
            this.r = 0;
            this.g = this.W() - this.f;
            this.h = 0;
            this.i = 0;
            this.n = 0;
            return;
        }
        ComposerKt.A("Cannot reset when inserting");
        throw new y();
    }

    public final void U(@y4.l Anchor anchor0) {
        L.p(anchor0, "anchor");
        this.T(anchor0.e(this));
    }

    private final int U0() {
        int v = this.W() - this.f - this.p.i();
        this.g = v;
        return v;
    }

    private final void V(int v, int v1, int v2) {
        int v3 = this.N0(v, this.e);
        while(v2 < v1) {
            SlotTableKt.t0(this.b, this.f0(v2), v3);
            int v4 = SlotTableKt.Q(this.b, this.f0(v2)) + v2;
            this.V(v2, v4, v2 + 1);
            v2 = v4;
        }
    }

    private final void V0() {
        this.p.j(this.W() - this.f - this.g);
    }

    private final int W() {
        return this.b.length / 5;
    }

    public final void W0(@y4.l Anchor anchor0) {
        L.p(anchor0, "anchor");
        this.A(anchor0.e(this) - this.r);
    }

    public final boolean X() {
        return this.t;
    }

    @m
    public final Object X0(int v, @m Object object0) {
        int v1 = this.f0(this.r);
        int v2 = this.e1(this.b, v1);
        int v3 = v2 + v;
        if(v3 >= v2 && v3 < this.N(this.b, this.f0(this.r + 1))) {
            int v4 = this.O(v3);
            Object[] arr_object = this.c;
            Object object1 = arr_object[v4];
            arr_object[v4] = object0;
            return object1;
        }
        ComposerKt.A(("Write to an invalid slot index " + v + " for group " + this.r).toString());
        throw new y();
    }

    public final int Y() {
        return this.r;
    }

    public final void Y0(@m Object object0) {
        int v = this.h;
        if(v <= this.i) {
            this.c[this.O(v - 1)] = object0;
            return;
        }
        ComposerKt.A("Writing to an invalid slot");
        throw new y();
    }

    public final int Z() {
        return this.s;
    }

    @m
    public final Object Z0() {
        if(this.m > 0) {
            this.r0(1, this.s);
        }
        int v = this.h;
        this.h = v + 1;
        return this.c[this.O(v)];
    }

    public final int a0() {
        return this.W() - this.f;
    }

    public final int a1() {
        int v = this.f0(this.r);
        int v1 = this.r + SlotTableKt.Q(this.b, v);
        this.r = v1;
        this.h = this.N(this.b, this.f0(v1));
        return SlotTableKt.X(this.b, v) ? 1 : SlotTableKt.c0(this.b, v);
    }

    @y4.l
    public final SlotTable b0() {
        return this.a;
    }

    public final void b1() {
        this.r = this.g;
        this.h = this.N(this.b, this.f0(this.g));
    }

    private final void c0(StringBuilder stringBuilder0, int v) {
        int v1 = this.f0(v);
        stringBuilder0.append("Group(");
        if(v < 10) {
            stringBuilder0.append(' ');
        }
        if(v < 100) {
            stringBuilder0.append(' ');
        }
        if(v < 1000) {
            stringBuilder0.append(' ');
        }
        stringBuilder0.append(v);
        if(v1 != v) {
            stringBuilder0.append("(");
            stringBuilder0.append(v1);
            stringBuilder0.append(")");
        }
        stringBuilder0.append('#');
        stringBuilder0.append(SlotTableKt.Q(this.b, v1));
        boolean z = SlotWriter.d0(this, v);
        if(z) {
            stringBuilder0.append('?');
        }
        stringBuilder0.append('^');
        stringBuilder0.append(this.M0(SlotTableKt.h0(this.b, v1)));
        stringBuilder0.append(": key=");
        stringBuilder0.append(SlotTableKt.Y(this.b, v1));
        stringBuilder0.append(", nodes=");
        stringBuilder0.append(SlotTableKt.c0(this.b, v1));
        if(z) {
            stringBuilder0.append('?');
        }
        stringBuilder0.append(", dataAnchor=");
        stringBuilder0.append(SlotTableKt.L(this.b, v1));
        stringBuilder0.append(", parentAnchor=");
        stringBuilder0.append(SlotTableKt.h0(this.b, v1));
        if(SlotTableKt.X(this.b, v1)) {
            Object[] arr_object = this.c;
            stringBuilder0.append(", node=" + arr_object[this.O(this.I0(this.b, v1))]);
        }
        int v2 = this.e1(this.b, v1);
        int v3 = this.N(this.b, v1 + 1);
        if(v3 > v2) {
            stringBuilder0.append(", [");
            for(int v4 = v2; v4 < v3; ++v4) {
                if(v4 != v2) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(String.valueOf(this.c[this.O(v4)]));
            }
            stringBuilder0.append(']');
        }
        stringBuilder0.append(")");
    }

    @m
    public final Object c1(int v, int v1) {
        int v2 = this.f0(v);
        int v3 = this.e1(this.b, v2);
        int v4 = v1 + v3;
        return v3 > v4 || v4 >= this.N(this.b, this.f0(v + 1)) ? Composer.a.a() : this.c[this.O(v4)];
    }

    // 去混淆评级： 低(20)
    private static final boolean d0(SlotWriter slotWriter0, int v) {
        return v < slotWriter0.r && (v == slotWriter0.s || slotWriter0.o.c(v) >= 0 || SlotWriter.d0(slotWriter0, slotWriter0.J0(v)));
    }

    @m
    public final Object d1(@y4.l Anchor anchor0, int v) {
        L.p(anchor0, "anchor");
        return this.c1(this.D(anchor0), v);
    }

    @m
    public final Object e0(int v) {
        int v1 = this.f0(v);
        if(SlotTableKt.T(this.b, v1)) {
            Object[] arr_object = this.c;
            return arr_object[this.E(this.b, v1)];
        }
        return Composer.a.a();
    }

    private final int e1(int[] arr_v, int v) {
        return v < this.W() ? this.L(SlotTableKt.m0(arr_v, v), this.k, this.c.length) : this.c.length - this.k;
    }

    private final int f0(int v) {
        return v < this.e ? v : v + this.f;
    }

    public final void f1(int v, @m Object object0) {
        this.k1(v, Composer.a.a(), false, object0);
    }

    public final int g0(int v) {
        return SlotTableKt.Y(this.b, this.f0(v));
    }

    public final void g1(int v, @m Object object0, @m Object object1) {
        this.k1(v, object0, false, object1);
    }

    @m
    public final Object h0(int v) {
        int v1 = this.f0(v);
        return SlotTableKt.V(this.b, v1) ? this.c[SlotTableKt.g0(this.b, v1)] : null;
    }

    public final void h1() {
        if(this.m == 0) {
            this.k1(0, Composer.a.a(), false, Composer.a.a());
            return;
        }
        ComposerKt.A("Key must be supplied when inserting");
        throw new y();
    }

    public final int i0(int v) {
        return SlotTableKt.Q(this.b, this.f0(v));
    }

    public final void i1(int v) {
        this.k1(v, Composer.a.a(), false, Composer.a.a());
    }

    @y4.l
    public final Iterator j0() {
        return new Object() {
            private int a;

            {
                int v = this.N(this.b, this.f0(this.r + this.i0(this.r)));  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                int v1 = this;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = v;
            }

            public final int a() {
                return this.a;
            }

            public final void b(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < this;
            }

            @Override
            @m
            public Object next() {
                if(this.hasNext()) {
                    int v = this.a;
                    this.a = v + 1;
                    return this.c.c[this.c.O(v)];
                }
                return null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }

    public final void j1(int v, @m Object object0) {
        this.k1(v, object0, false, Composer.a.a());
    }

    @y4.l
    public final String k0() {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = this.a0();
        for(int v1 = 0; v1 < v; ++v1) {
            this.c0(stringBuilder0, v1);
            stringBuilder0.append('\n');
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    private final void k1(int v, Object object0, boolean z, Object object1) {
        int v7;
        int v1 = 1;
        boolean z1 = this.m > 0;
        this.q.j(this.n);
        if(z1) {
            this.p0(1);
            int v2 = this.r;
            int v3 = this.f0(v2);
            int v4 = object0 == Composer.a.a() ? 0 : 1;
            if(((int)z) || object1 == Composer.a.a()) {
                v1 = 0;
            }
            SlotTableKt.W(this.b, v3, v, ((int)z), v4, v1, this.s, this.h);
            this.i = this.h;
            int v5 = ((int)z) + v4 + v1;
            if(v5 > 0) {
                this.r0(v5, v2);
                Object[] arr_object = this.c;
                int v6 = this.h;
                if(((int)z) != 0) {
                    arr_object[v6] = object1;
                    ++v6;
                }
                if(v4 != 0) {
                    arr_object[v6] = object0;
                    ++v6;
                }
                if(v1 != 0) {
                    arr_object[v6] = object1;
                    ++v6;
                }
                this.h = v6;
            }
            this.n = 0;
            v7 = v2 + 1;
            this.s = v2;
            this.r = v7;
        }
        else {
            this.o.j(this.s);
            this.V0();
            int v8 = this.r;
            int v9 = this.f0(v8);
            if(!L.g(object1, Composer.a.a())) {
                if(((int)z)) {
                    this.u1(object1);
                }
                else {
                    this.p1(object1);
                }
            }
            this.h = this.e1(this.b, v9);
            this.i = this.N(this.b, this.f0(this.r + 1));
            this.n = SlotTableKt.c0(this.b, v9);
            this.s = v8;
            this.r = v8 + 1;
            v7 = v8 + SlotTableKt.Q(this.b, v9);
        }
        this.g = v7;
    }

    public final boolean l0(int v) {
        return this.m0(v, this.r);
    }

    public final void l1(int v, @m Object object0) {
        this.k1(v, object0, true, Composer.a.a());
    }

    public final boolean m0(int v, int v1) {
        if(v1 == this.s) {
            return v > v1 && v < this.g;
        }
        if(v1 > this.o.h(0)) {
            return v > v1 && v < this.i0(v1) + v1;
        }
        int v2 = this.o.c(v1);
        return v2 >= 0 ? v > v1 && v < this.W() - this.f - this.p.g(v2) : v > v1 && v < this.i0(v1) + v1;
    }

    public final void m1(int v, @m Object object0, @m Object object1) {
        this.k1(v, object0, true, object1);
    }

    // 去混淆评级： 低(20)
    public final boolean n0(int v) {
        return v > this.s && v < this.g || this.s == 0 && v == 0;
    }

    @m
    public final Object n1(@m Object object0) {
        Object object1 = this.Z0();
        this.Y0(object0);
        return object1;
    }

    public final void o0(@m Object object0) {
        if(this.m >= 0) {
            int v = this.s;
            int v1 = this.f0(v);
            if(!SlotTableKt.T(this.b, v1)) {
                this.r0(1, v);
                int v2 = this.E(this.b, v1);
                int v3 = this.O(v2);
                int v4 = this.h;
                if(v4 > v2) {
                    int v5 = v4 - v2;
                    if(v5 >= 3) {
                        throw new IllegalStateException("Moving more than two slot not supported");
                    }
                    if(v5 > 1) {
                        this.c[v3 + 2] = this.c[v3 + 1];
                    }
                    this.c[v3 + 1] = this.c[v3];
                }
                SlotTableKt.G(this.b, v1);
                this.c[v3] = object0;
                ++this.h;
                return;
            }
            ComposerKt.A("Group already has auxiliary data");
            throw new y();
        }
        ComposerKt.A("Cannot insert auxiliary data when not inserting");
        throw new y();
    }

    private final void o1(int v, int v1) {
        int v2 = this.W() - this.f;
        if(v < v1) {
            for(int v3 = SlotTableKt.b0(this.d, v, v2); v3 < this.d.size(); ++v3) {
                Object object0 = this.d.get(v3);
                L.o(object0, "anchors[index]");
                int v4 = ((Anchor)object0).a();
                if(v4 >= 0) {
                    return;
                }
                int v5 = v4 + v2;
                if(v5 >= v1) {
                    return;
                }
                ((Anchor)object0).c(v5);
            }
        }
        else {
            for(int v6 = SlotTableKt.b0(this.d, v1, v2); v6 < this.d.size(); ++v6) {
                Object object1 = this.d.get(v6);
                L.o(object1, "anchors[index]");
                int v7 = ((Anchor)object1).a();
                if(v7 < 0) {
                    break;
                }
                ((Anchor)object1).c(-(v2 - v7));
            }
        }
    }

    private final void p0(int v) {
        if(v > 0) {
            int v1 = this.r;
            this.B0(v1);
            int v2 = this.e;
            int v3 = this.f;
            int[] arr_v = this.b;
            int v4 = arr_v.length / 5;
            int v5 = v4 - v3;
            int v6 = 0;
            if(v3 < v) {
                int v7 = Math.max(Math.max(v4 * 2, v5 + v), 0x20);
                int[] arr_v1 = new int[v7 * 5];
                int v8 = v7 - v5;
                l.z0(arr_v, arr_v1, 0, 0, v2 * 5);
                l.z0(arr_v, arr_v1, (v2 + v8) * 5, (v3 + v2) * 5, v4 * 5);
                this.b = arr_v1;
                v3 = v8;
            }
            int v9 = this.g;
            if(v9 >= v2) {
                this.g = v9 + v;
            }
            int v10 = v2 + v;
            this.e = v10;
            this.f = v3 - v;
            int v11 = v5 <= 0 ? 0 : this.M(v1 + v);
            if(this.l >= v2) {
                v6 = this.j;
            }
            int v12 = this.P(v11, v6, this.k, this.c.length);
            for(int v13 = v2; v13 < v10; ++v13) {
                SlotTableKt.o0(this.b, v13, v12);
            }
            int v14 = this.l;
            if(v14 >= v2) {
                this.l = v14 + v;
            }
        }
    }

    public final void p1(@m Object object0) {
        int v = this.f0(this.r);
        if(SlotTableKt.T(this.b, v)) {
            Object[] arr_object = this.c;
            arr_object[this.O(this.E(this.b, v))] = object0;
            return;
        }
        ComposerKt.A("Updating the data of a group that was not created with a data slot");
        throw new y();
    }

    public final void q0(int v) {
        int v1 = 0;
        if(this.m == 0) {
            if(this.s0()) {
                this.G();
                this.i1(v);
                this.R();
                this.S();
                return;
            }
            int v2 = this.r;
            int v3 = this.L0(this.b, v2);
            int v4 = v3 + this.i0(v3);
            for(int v5 = v2; v5 < v4; v5 += SlotTableKt.Q(this.b, v6)) {
                int v6 = this.f0(v5);
                v1 += SlotTableKt.c0(this.b, v6);
            }
            int v7 = SlotTableKt.L(this.b, this.f0(v2));
            this.G();
            this.p0(1);
            this.S();
            int v8 = this.f0(v2);
            SlotTableKt.W(this.b, v8, v, false, false, false, v3, v7);
            SlotTableKt.q0(this.b, v8, v4 - v2 + 1);
            SlotTableKt.s0(this.b, v8, v1);
            this.z(this.f0(v3), 1);
            this.V(v3, v4, v2);
            this.r = v4;
            return;
        }
        ComposerKt.A("Writer cannot be inserting");
        throw new y();
    }

    private final void q1(int v) {
        if(v >= 0) {
            PrioritySet prioritySet0 = this.u;
            if(prioritySet0 == null) {
                prioritySet0 = new PrioritySet(null, 1, null);
                this.u = prioritySet0;
            }
            prioritySet0.a(v);
        }
    }

    private final void r0(int v, int v1) {
        if(v > 0) {
            this.D0(this.h, v1);
            int v2 = this.j;
            int v3 = this.k;
            if(v3 < v) {
                Object[] arr_object = this.c;
                int v4 = arr_object.length - v3;
                int v5 = Math.max(Math.max(arr_object.length * 2, v4 + v), 0x20);
                Object[] arr_object1 = new Object[v5];
                for(int v6 = 0; v6 < v5; ++v6) {
                    arr_object1[v6] = null;
                }
                int v7 = v5 - v4;
                l.B0(arr_object, arr_object1, 0, 0, v2);
                l.B0(arr_object, arr_object1, v2 + v7, v3 + v2, arr_object.length);
                this.c = arr_object1;
                v3 = v7;
            }
            int v8 = this.i;
            if(v8 >= v2) {
                this.i = v8 + v;
            }
            this.j = v2 + v;
            this.k = v3 - v;
        }
    }

    private final void r1(int v, PrioritySet prioritySet0) {
        int v1 = this.f0(v);
        boolean z = this.H(v);
        if(SlotTableKt.J(this.b, v1) != z) {
            SlotTableKt.n0(this.b, v1, z);
            int v2 = this.J0(v);
            if(v2 >= 0) {
                prioritySet0.a(v2);
            }
        }
    }

    public final boolean s0() {
        return this.r == this.g;
    }

    private final void s1(int[] arr_v, int v, int v1) {
        SlotTableKt.o0(arr_v, v, this.P(v1, this.j, this.k, this.c.length));
    }

    public final boolean t0() {
        return this.r < this.g && SlotTableKt.X(this.b, this.f0(this.r));
    }

    public final void t1(@y4.l Anchor anchor0, @m Object object0) {
        L.p(anchor0, "anchor");
        this.v1(anchor0.e(this), object0);
    }

    @Override
    @y4.l
    public String toString() {
        return "SlotWriter(current = " + this.r + " end=" + this.g + " size = " + this.a0() + " gap=" + this.e + '-' + (this.e + this.f) + ')';
    }

    public final boolean u0(int v) {
        return SlotTableKt.X(this.b, this.f0(v));
    }

    public final void u1(@m Object object0) {
        this.v1(this.r, object0);
    }

    private final List v0() {
        List list0 = SlotTableKt.a0(this.b, 0, 1, null);
        List list1 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v = 0; v < v1; ++v) {
            Object object0 = list0.get(v);
            ((Number)object0).intValue();
            if(v < this.e || v >= this.e + this.f) {
                list1.add(object0);
            }
        }
        return list1;
    }

    private final void v1(int v, Object object0) {
        int v1 = this.f0(v);
        if(v1 < this.b.length && SlotTableKt.X(this.b, v1)) {
            Object[] arr_object = this.c;
            arr_object[this.O(this.I0(this.b, v1))] = object0;
            return;
        }
        ComposerKt.A(("Updating the node of a group at " + v + " that was not created with as a node group").toString());
        throw new y();
    }

    public final void w0(int v) {
        int v1 = this.f0(v);
        if(!SlotTableKt.U(this.b, v1)) {
            SlotTableKt.r0(this.b, v1, true);
            if(!SlotTableKt.J(this.b, v1)) {
                this.q1(this.J0(v));
            }
        }
    }

    public final void w1(@m Object object0) {
        this.v1(this.s, object0);
    }

    public static void x0(SlotWriter slotWriter0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = slotWriter0.s;
        }
        slotWriter0.w0(v);
    }

    public final void x1() {
        int v = this.l;
        int v1 = this.c.length - this.k;
        int v2 = this.a0();
        int v3 = 0;
        boolean z = false;
        for(int v4 = 0; v3 < v2; v4 = v7) {
            int v5 = this.f0(v3);
            int v6 = SlotTableKt.L(this.b, v5);
            int v7 = this.N(this.b, v5);
            if(v7 < v4) {
                throw new IllegalStateException(("Data index out of order at " + v3 + ", previous = " + v4 + ", current = " + v7).toString());
            }
            if(v7 > v1) {
                throw new IllegalStateException(("Data index, " + v7 + ", out of bound at " + v3).toString());
            }
            if(v6 < 0 && !z) {
                if(v != v3) {
                    throw new IllegalStateException(("Expected the slot gap owner to be " + v + " found gap at " + v3).toString());
                }
                z = true;
            }
            ++v3;
        }
    }

    private final void y0(int v, int v1, int v2) {
        int v3 = this.a0();
        int v4 = SlotTableKt.b0(this.d, v, v3);
        ArrayList arrayList0 = new ArrayList();
        if(v4 >= 0) {
            while(v4 < this.d.size()) {
                Object object0 = this.d.get(v4);
                L.o(object0, "anchors[index]");
                int v5 = this.D(((Anchor)object0));
                if(v5 < v || v5 >= v2 + v) {
                    break;
                }
                arrayList0.add(((Anchor)object0));
                this.d.remove(v4);
            }
        }
        int v6 = arrayList0.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            Anchor anchor0 = (Anchor)arrayList0.get(v7);
            int v8 = this.D(anchor0) + (v1 - v);
            if(v8 >= this.e) {
                anchor0.c(-(v3 - v8));
            }
            else {
                anchor0.c(v8);
            }
            int v9 = SlotTableKt.b0(this.d, v8, v3);
            this.d.add(v9, anchor0);
        }
    }

    public final void y1() {
        int v = this.e;
        int v1 = this.f;
        int v2 = this.W();
        for(int v3 = 0; v3 < v; ++v3) {
            if(SlotTableKt.h0(this.b, v3) <= -2) {
                throw new IllegalStateException(("Expected a start relative anchor at " + v3).toString());
            }
        }
        int v4 = v1 + v;
        while(v4 < v2) {
            int v5 = SlotTableKt.h0(this.b, v4);
            if(this.M0(v5) >= v) {
                if(v5 <= -2) {
                    ++v4;
                    continue;
                }
            }
            else if(v5 <= -2) {
                throw new IllegalStateException(("Expected a start relative anchor at " + v4).toString());
            }
            else {
                ++v4;
                continue;
            }
            throw new IllegalStateException(("Expected an end relative anchor at " + v4).toString());
        }
    }

    public final void z(int v, int v1) {
        while(v > 0) {
            SlotTableKt.q0(this.b, v, SlotTableKt.Q(this.b, v) + v1);
            v = this.f0(this.M0(SlotTableKt.h0(this.b, v)));
        }
    }

    @y4.l
    public final List z0(@y4.l SlotTable slotTable0, int v) {
        L.p(slotTable0, "table");
        ComposerKt.q0(this.m > 0);
        if(v == 0 && this.r == 0 && this.a.r() == 0) {
            int[] arr_v = this.b;
            Object[] arr_object = this.c;
            ArrayList arrayList0 = this.d;
            int[] arr_v1 = slotTable0.q();
            int v1 = slotTable0.r();
            Object[] arr_object1 = slotTable0.t();
            int v2 = slotTable0.W();
            this.b = arr_v1;
            this.c = arr_object1;
            this.d = slotTable0.p();
            this.e = v1;
            this.f = arr_v1.length / 5 - v1;
            this.j = v2;
            this.k = arr_object1.length - v2;
            this.l = v1;
            slotTable0.K(arr_v, 0, arr_object, 0, arrayList0);
            return this.d;
        }
        SlotWriter slotWriter0 = slotTable0.F();
        try {
            return SlotWriter.v.b(slotWriter0, v, this, true, true);
        }
        finally {
            slotWriter0.I();
        }
    }
}

