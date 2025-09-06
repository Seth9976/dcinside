package androidx.compose.runtime;

import B3.a;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,3443:1\n146#2,8:3444\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3016#1:3444,8\n*E\n"})
final class SlotTableGroup implements a, CompositionGroup, Iterable {
    @l
    private final SlotTable a;
    private final int b;
    private final int c;

    public SlotTableGroup(@l SlotTable slotTable0, int v, int v1) {
        L.p(slotTable0, "table");
        super();
        this.a = slotTable0;
        this.b = v;
        this.c = v1;
    }

    public SlotTableGroup(SlotTable slotTable0, int v, int v1, int v2, w w0) {
        if((v2 & 4) != 0) {
            v1 = slotTable0.u();
        }
        this(slotTable0, v, v1);
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    @m
    public String S() {
        if(SlotTableKt.T(this.a.q(), this.b)) {
            Object object0 = this.a.t()[SlotTableKt.H(this.a.q(), this.b)];
            return object0 instanceof String ? ((String)object0) : null;
        }
        return null;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public int U() {
        return SlotTableKt.Q(this.a.q(), this.b);
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    @l
    public Object V() {
        this.h();
        SlotReader slotReader0 = this.a.E();
        try {
            return slotReader0.a(this.b);
        }
        finally {
            slotReader0.e();
        }
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    public int W() {
        int v = this.U();
        int v1 = this.b + v;
        return v1 >= this.a.r() ? this.a.W() - SlotTableKt.L(this.a.q(), this.b) : SlotTableKt.L(this.a.q(), v1) - SlotTableKt.L(this.a.q(), this.b);
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    @m
    public CompositionGroup a(@l Object object0) {
        L.p(object0, "identityToFind");
        Anchor anchor0 = object0 instanceof Anchor ? ((Anchor)object0) : null;
        if(anchor0 != null && this.a.G(anchor0)) {
            int v = this.a.d(anchor0);
            if(v >= this.b && v - this.b < SlotTableKt.Q(this.a.q(), this.b)) {
                return new SlotTableGroup(this.a, v, this.c);
            }
        }
        return null;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    @l
    public Iterable b() {
        return this;
    }

    public final int c() {
        return this.b;
    }

    @l
    public final SlotTable d() {
        return this.a;
    }

    public final int g() {
        return this.c;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    @l
    public Iterable getData() {
        return new DataIterator(this.a, this.b);
    }

    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    @l
    public Object getKey() {
        if(SlotTableKt.V(this.a.q(), this.b)) {
            Integer integer0 = this.a.t()[SlotTableKt.g0(this.a.q(), this.b)];
            L.m(integer0);
            return integer0;
        }
        return SlotTableKt.Y(this.a.q(), this.b);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.runtime.tooling.CompositionGroup
    @m
    public Object getNode() {
        return SlotTableKt.X(this.a.q(), this.b) ? this.a.t()[SlotTableKt.f0(this.a.q(), this.b)] : null;
    }

    private final void h() {
        if(this.a.u() != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return SlotTableKt.Q(this.a.q(), this.b) == 0;
    }

    @Override
    @l
    public Iterator iterator() {
        this.h();
        int v = SlotTableKt.Q(this.a.q(), this.b);
        return new GroupIterator(this.a, this.b + 1, this.b + v);
    }
}

