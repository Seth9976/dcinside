package androidx.compose.runtime.snapshots;

import B3.f;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n1#2:458\n*E\n"})
final class StateListIterator implements f, ListIterator {
    @l
    private final SnapshotStateList a;
    private int b;
    private int c;

    public StateListIterator(@l SnapshotStateList snapshotStateList0, int v) {
        L.p(snapshotStateList0, "list");
        super();
        this.a = snapshotStateList0;
        this.b = v - 1;
        this.c = snapshotStateList0.i();
    }

    @l
    public final SnapshotStateList a() {
        return this.a;
    }

    @Override
    public void add(Object object0) {
        this.b();
        this.a.add(this.b + 1, object0);
        ++this.b;
        this.c = this.a.i();
    }

    private final void b() {
        if(this.a.i() != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean hasNext() {
        return this.b < this.a.size() - 1;
    }

    @Override
    public boolean hasPrevious() {
        return this.b >= 0;
    }

    @Override
    public Object next() {
        this.b();
        int v = this.b + 1;
        SnapshotStateListKt.e(v, this.a.size());
        Object object0 = this.a.get(v);
        this.b = v;
        return object0;
    }

    @Override
    public int nextIndex() {
        return this.b + 1;
    }

    @Override
    public Object previous() {
        this.b();
        SnapshotStateListKt.e(this.b, this.a.size());
        Object object0 = this.a.get(this.b);
        --this.b;
        return object0;
    }

    @Override
    public int previousIndex() {
        return this.b;
    }

    @Override
    public void remove() {
        this.b();
        this.a.remove(this.b);
        --this.b;
        this.c = this.a.i();
    }

    @Override
    public void set(Object object0) {
        this.b();
        this.a.set(this.b, object0);
        this.c = this.a.i();
    }
}

