package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.L;
import y4.l;

public final class e0 extends c implements RandomAccess {
    @l
    private final List c;
    private int d;
    private int e;

    public e0(@l List list0) {
        L.p(list0, "list");
        super();
        this.c = list0;
    }

    @Override  // kotlin.collections.c
    public int a() {
        return this.e;
    }

    public final void b(int v, int v1) {
        c.a.d(v, v1, this.c.size());
        this.d = v;
        this.e = v1 - v;
    }

    @Override  // kotlin.collections.c
    public Object get(int v) {
        c.a.b(v, this.e);
        return this.c.get(this.d + v);
    }
}

