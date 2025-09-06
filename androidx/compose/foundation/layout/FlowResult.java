package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.L;
import y4.l;

public final class FlowResult {
    private final int a;
    private final int b;
    @l
    private final MutableVector c;

    public FlowResult(int v, int v1, @l MutableVector mutableVector0) {
        L.p(mutableVector0, "items");
        super();
        this.a = v;
        this.b = v1;
        this.c = mutableVector0;
    }

    public final int a() {
        return this.b;
    }

    @l
    public final MutableVector b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }
}

