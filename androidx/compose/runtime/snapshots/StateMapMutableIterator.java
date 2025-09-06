package androidx.compose.runtime.snapshots;

import A3.a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n305#1,4:361\n1#2:365\n1#2:366\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n*L\n286#1:361,4\n286#1:365\n*E\n"})
abstract class StateMapMutableIterator {
    @l
    private final SnapshotStateMap a;
    @l
    private final Iterator b;
    private int c;
    @m
    private Map.Entry d;
    @m
    private Map.Entry e;

    public StateMapMutableIterator(@l SnapshotStateMap snapshotStateMap0, @l Iterator iterator0) {
        L.p(snapshotStateMap0, "map");
        L.p(iterator0, "iterator");
        super();
        this.a = snapshotStateMap0;
        this.b = iterator0;
        this.c = snapshotStateMap0.l();
        this.c();
    }

    protected final void c() {
        Map.Entry map$Entry0;
        this.d = this.e;
        if(this.b.hasNext()) {
            Object object0 = this.b.next();
            map$Entry0 = (Map.Entry)object0;
        }
        else {
            map$Entry0 = null;
        }
        this.e = map$Entry0;
    }

    @m
    protected final Map.Entry d() {
        return this.d;
    }

    @l
    public final Iterator f() {
        return this.b;
    }

    @l
    public final SnapshotStateMap g() {
        return this.a;
    }

    protected final int h() {
        return this.c;
    }

    public final boolean hasNext() {
        return this.e != null;
    }

    @m
    protected final Map.Entry i() {
        return this.e;
    }

    protected final Object j(@l a a0) {
        L.p(a0, "block");
        if(this.g().l() != this.c) {
            throw new ConcurrentModificationException();
        }
        Object object0 = a0.invoke();
        this.c = this.g().l();
        return object0;
    }

    protected final void k(@m Map.Entry map$Entry0) {
        this.d = map$Entry0;
    }

    protected final void l(int v) {
        this.c = v;
    }

    protected final void m(@m Map.Entry map$Entry0) {
        this.e = map$Entry0;
    }

    public final void remove() {
        if(this.g().l() != this.c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry map$Entry0 = this.d;
        if(map$Entry0 == null) {
            throw new IllegalStateException();
        }
        Object object0 = map$Entry0.getKey();
        this.a.remove(object0);
        this.d = null;
        this.c = this.g().l();
    }
}

