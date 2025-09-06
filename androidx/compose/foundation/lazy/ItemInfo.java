package androidx.compose.foundation.lazy;

import java.util.ArrayList;
import java.util.List;
import y4.l;

final class ItemInfo {
    private long a;
    @l
    private final List b;

    public ItemInfo() {
        this.a = 0L;
        this.b = new ArrayList();
    }

    public final long a() {
        return this.a;
    }

    @l
    public final List b() {
        return this.b;
    }

    public final void c(long v) {
        this.a = v;
    }
}

