package androidx.compose.runtime;

import B3.a;
import java.util.Iterator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/DataIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3443:1\n1#2:3444\n*E\n"})
final class DataIterator implements a, Iterable, Iterator {
    @l
    private final SlotTable a;
    private final int b;
    private final int c;
    private final int d;
    private int e;

    public DataIterator(@l SlotTable slotTable0, int v) {
        L.p(slotTable0, "table");
        super();
        this.a = slotTable0;
        this.b = v;
        int v1 = SlotTableKt.L(slotTable0.q(), v);
        this.c = v1;
        this.d = v + 1 >= slotTable0.r() ? slotTable0.W() : SlotTableKt.L(slotTable0.q(), v + 1);
        this.e = v1;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.e;
    }

    public final int d() {
        return this.c;
    }

    @l
    public final SlotTable g() {
        return this.a;
    }

    public final void h(int v) {
        this.e = v;
    }

    @Override
    public boolean hasNext() {
        return this.e < this.d;
    }

    @Override
    @l
    public Iterator iterator() {
        return this;
    }

    @Override
    @m
    public Object next() {
        Object object0 = this.e < 0 || this.e >= this.a.t().length ? null : this.a.t()[this.e];
        ++this.e;
        return object0;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

