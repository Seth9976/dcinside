package androidx.compose.runtime;

import B3.a;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.L;
import y4.l;

final class GroupIterator implements a, Iterator {
    @l
    private final SlotTable a;
    private final int b;
    private int c;
    private final int d;

    public GroupIterator(@l SlotTable slotTable0, int v, int v1) {
        L.p(slotTable0, "table");
        super();
        this.a = slotTable0;
        this.b = v1;
        this.c = v;
        this.d = slotTable0.u();
        if(slotTable0.v()) {
            throw new ConcurrentModificationException();
        }
    }

    public final int a() {
        return this.b;
    }

    @l
    public final SlotTable b() {
        return this.a;
    }

    @l
    public CompositionGroup c() {
        this.d();
        int v = this.c;
        this.c = SlotTableKt.Q(this.a.q(), v) + v;
        return new SlotTableGroup(this.a, v, this.d);
    }

    private final void d() {
        if(this.a.u() != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean hasNext() {
        return this.c < this.b;
    }

    @Override
    public Object next() {
        return this.c();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

