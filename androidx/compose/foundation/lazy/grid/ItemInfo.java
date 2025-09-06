package androidx.compose.foundation.lazy.grid;

import java.util.ArrayList;
import java.util.List;
import y4.l;

final class ItemInfo {
    private int a;
    private int b;
    private long c;
    @l
    private final List d;

    public ItemInfo(int v, int v1) {
        this.a = v;
        this.b = v1;
        this.c = 0L;
        this.d = new ArrayList();
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }

    @l
    public final List d() {
        return this.d;
    }

    public final void e(int v) {
        this.b = v;
    }

    public final void f(int v) {
        this.a = v;
    }

    public final void g(long v) {
        this.c = v;
    }
}

