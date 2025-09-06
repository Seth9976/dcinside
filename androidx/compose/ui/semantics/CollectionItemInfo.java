package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
public final class CollectionItemInfo {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    public static final int e;

    static {
    }

    public CollectionItemInfo(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }
}

