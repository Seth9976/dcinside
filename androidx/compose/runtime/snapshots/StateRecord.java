package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public abstract class StateRecord {
    private int a;
    @m
    private StateRecord b;
    public static final int c = 8;

    static {
    }

    public StateRecord() {
        this.a = SnapshotKt.D().g();
    }

    public abstract void a(@l StateRecord arg1);

    @l
    public abstract StateRecord b();

    @m
    public final StateRecord c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final void e(@m StateRecord stateRecord0) {
        this.b = stateRecord0;
    }

    public final void f(int v) {
        this.a = v;
    }
}

