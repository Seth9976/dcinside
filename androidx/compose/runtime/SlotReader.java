package androidx.compose.runtime;

import A3.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.y;
import y4.l;
import y4.m;

@s0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3443:1\n1#2:3444\n4492#3,5:3445\n4492#3,5:3450\n4492#3,5:3455\n4492#3,5:3460\n4492#3,5:3465\n3323#4,6:3470\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n949#1:3445,5\n959#1:3450,5\n967#1:3455,5\n986#1:3460,5\n1000#1:3465,5\n1051#1:3470,6\n*E\n"})
public final class SlotReader {
    @l
    private final SlotTable a;
    @l
    private final int[] b;
    private final int c;
    @l
    private final Object[] d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public SlotReader(@l SlotTable slotTable0) {
        L.p(slotTable0, "table");
        super();
        this.a = slotTable0;
        this.b = slotTable0.q();
        int v = slotTable0.r();
        this.c = v;
        this.d = slotTable0.t();
        this.e = slotTable0.W();
        this.h = v;
        this.i = -1;
    }

    public final int A() {
        return this.c;
    }

    public final int B() {
        return this.k - SlotTableKt.m0(this.b, this.i);
    }

    @l
    public final SlotTable C() {
        return this.a;
    }

    @m
    public final Object D(int v) {
        return this.c(this.b, v);
    }

    public final int E(int v) {
        return v + SlotTableKt.Q(this.b, v);
    }

    @m
    public final Object F(int v) {
        return this.G(this.g, v);
    }

    @m
    public final Object G(int v, int v1) {
        int v2 = SlotTableKt.m0(this.b, v) + v1;
        return v2 >= (v + 1 >= this.c ? this.e : SlotTableKt.L(this.b, v + 1)) ? Composer.a.a() : this.d[v2];
    }

    public final int H(int v) {
        return SlotTableKt.Y(this.b, v);
    }

    public final int I(@l Anchor anchor0) {
        L.p(anchor0, "anchor");
        if(anchor0.b()) {
            int v = this.a.d(anchor0);
            return SlotTableKt.Y(this.b, v);
        }
        return 0;
    }

    @m
    public final Object J(int v) {
        return this.U(this.b, v);
    }

    public final int K(int v) {
        return SlotTableKt.Q(this.b, v);
    }

    public final boolean L(int v) {
        return SlotTableKt.U(this.b, v);
    }

    public final boolean M(int v) {
        return SlotTableKt.V(this.b, v);
    }

    public final boolean N() {
        return this.w() || this.g == this.h;
    }

    public final boolean O() {
        return SlotTableKt.X(this.b, this.g);
    }

    public final boolean P(int v) {
        return SlotTableKt.X(this.b, v);
    }

    @m
    public final Object Q() {
        if(this.j <= 0) {
            int v = this.k;
            if(v < this.l) {
                this.k = v + 1;
                return this.d[v];
            }
        }
        return Composer.a.a();
    }

    // 去混淆评级： 低(20)
    @m
    public final Object R(int v) {
        return SlotTableKt.X(this.b, v) ? this.S(this.b, v) : null;
    }

    // 去混淆评级： 低(20)
    private final Object S(int[] arr_v, int v) {
        return SlotTableKt.X(arr_v, v) ? this.d[SlotTableKt.f0(arr_v, v)] : Composer.a.a();
    }

    public final int T(int v) {
        return SlotTableKt.c0(this.b, v);
    }

    // 去混淆评级： 低(20)
    private final Object U(int[] arr_v, int v) {
        return SlotTableKt.V(arr_v, v) ? this.d[SlotTableKt.g0(arr_v, v)] : null;
    }

    public final int V(int v) {
        return SlotTableKt.h0(this.b, v);
    }

    public final int W(int v) {
        if(v < 0 || v >= this.c) {
            throw new IllegalArgumentException(("Invalid group index " + v).toString());
        }
        return SlotTableKt.h0(this.b, v);
    }

    public final void X(int v) {
        if(this.j == 0) {
            this.g = v;
            int v1 = v >= this.c ? -1 : SlotTableKt.h0(this.b, v);
            this.i = v1;
            this.h = v1 < 0 ? this.c : v1 + SlotTableKt.Q(this.b, v1);
            this.k = 0;
            this.l = 0;
            return;
        }
        ComposerKt.A("Cannot reposition while in an empty region");
        throw new y();
    }

    public final void Y(int v) {
        int v1 = SlotTableKt.Q(this.b, v) + v;
        int v2 = this.g;
        if(v2 >= v && v2 <= v1) {
            this.i = v;
            this.h = v1;
            this.k = 0;
            this.l = 0;
            return;
        }
        ComposerKt.A(("Index " + v + " is not a parent of " + v2).toString());
        throw new y();
    }

    public final int Z() {
        int v = 1;
        if(this.j == 0) {
            if(!SlotTableKt.X(this.b, this.g)) {
                v = SlotTableKt.c0(this.b, this.g);
            }
            this.g += SlotTableKt.Q(this.b, this.g);
            return v;
        }
        ComposerKt.A("Cannot skip while in an empty region");
        throw new y();
    }

    @l
    public final Anchor a(int v) {
        ArrayList arrayList0 = this.a.p();
        int v1 = SlotTableKt.k0(arrayList0, v, this.c);
        if(v1 < 0) {
            Anchor anchor0 = new Anchor(v);
            arrayList0.add(-(v1 + 1), anchor0);
            return anchor0;
        }
        Object object0 = arrayList0.get(v1);
        L.o(object0, "get(location)");
        return (Anchor)object0;
    }

    public final void a0() {
        if(this.j == 0) {
            this.g = this.h;
            return;
        }
        ComposerKt.A("Cannot skip the enclosing group while in an empty region");
        throw new y();
    }

    public static Anchor b(SlotReader slotReader0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = slotReader0.g;
        }
        return slotReader0.a(v);
    }

    public final void b0() {
        if(this.j <= 0) {
            if(SlotTableKt.h0(this.b, this.g) != this.i) {
                throw new IllegalArgumentException("Invalid slot table detected");
            }
            this.i = this.g;
            this.h = this.g + SlotTableKt.Q(this.b, this.g);
            int v = this.g;
            this.g = v + 1;
            this.k = SlotTableKt.m0(this.b, v);
            this.l = v < this.c - 1 ? SlotTableKt.L(this.b, v + 1) : this.e;
        }
    }

    // 去混淆评级： 低(20)
    private final Object c(int[] arr_v, int v) {
        return SlotTableKt.T(arr_v, v) ? this.d[SlotTableKt.H(arr_v, v)] : Composer.a.a();
    }

    public final void c0() {
        if(this.j <= 0) {
            if(!SlotTableKt.X(this.b, this.g)) {
                throw new IllegalArgumentException("Expected a node group");
            }
            this.b0();
        }
    }

    public final void d() {
        ++this.j;
    }

    public final void e() {
        this.f = true;
        this.a.h(this);
    }

    public final boolean f(int v) {
        return SlotTableKt.J(this.b, v);
    }

    public final void g() {
        int v = this.j;
        if(v <= 0) {
            throw new IllegalArgumentException("Unbalanced begin/end empty");
        }
        this.j = v - 1;
    }

    public final void h() {
        if(this.j == 0) {
            if(this.g == this.h) {
                int v = SlotTableKt.h0(this.b, this.i);
                this.i = v;
                this.h = v >= 0 ? v + SlotTableKt.Q(this.b, v) : this.c;
                return;
            }
            ComposerKt.A("endGroup() not called at the end of a group");
            throw new y();
        }
    }

    @l
    public final List i() {
        List list0 = new ArrayList();
        if(this.j > 0) {
            return list0;
        }
        int v = this.g;
        for(int v1 = 0; v < this.h; ++v1) {
            list0.add(new KeyInfo(SlotTableKt.Y(this.b, v), this.U(this.b, v), v, (SlotTableKt.X(this.b, v) ? 1 : SlotTableKt.c0(this.b, v)), v1));
            v += SlotTableKt.Q(this.b, v);
        }
        return list0;
    }

    public final void j(int v, @l o o0) {
        L.p(o0, "block");
        int v1 = SlotTableKt.m0(this.b, v);
        int v2 = v + 1 >= this.a.r() ? this.a.W() : SlotTableKt.L(this.a.q(), v + 1);
        for(int v3 = v1; v3 < v2; ++v3) {
            o0.invoke(((int)(v3 - v1)), this.d[v3]);
        }
    }

    @m
    public final Object k(int v) {
        int v1 = this.k + v;
        return v1 >= this.l ? Composer.a.a() : this.d[v1];
    }

    public final boolean l() {
        return this.f;
    }

    public final int m() {
        return this.h;
    }

    public final int n() {
        return this.g;
    }

    @m
    public final Object o() {
        int v = this.g;
        return v < this.h ? this.c(this.b, v) : 0;
    }

    public final int p() {
        return this.h;
    }

    public final int q() {
        return this.g >= this.h ? 0 : SlotTableKt.Y(this.b, this.g);
    }

    @m
    public final Object r() {
        return this.g >= this.h ? null : this.S(this.b, this.g);
    }

    @m
    public final Object s() {
        return this.g >= this.h ? null : this.U(this.b, this.g);
    }

    public final int t() {
        return SlotTableKt.Q(this.b, this.g);
    }

    @Override
    @l
    public String toString() {
        return "SlotReader(current=" + this.g + ", key=" + this.q() + ", parent=" + this.i + ", end=" + this.h + ')';
    }

    public final int u() {
        int v = this.g;
        int v1 = SlotTableKt.m0(this.b, v);
        return v + 1 >= this.c ? this.e - v1 : SlotTableKt.L(this.b, v + 1) - v1;
    }

    public final int v() {
        return this.k - SlotTableKt.m0(this.b, this.i);
    }

    public final boolean w() {
        return this.j > 0;
    }

    public final int x() {
        return SlotTableKt.c0(this.b, this.g);
    }

    public final int y() {
        return this.i;
    }

    public final int z() {
        return this.i < 0 ? 0 : SlotTableKt.c0(this.b, this.i);
    }
}

