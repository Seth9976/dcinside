package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.internal.w;
import y4.l;

public final class LazyListPlaceableWrapper {
    private final long a;
    @l
    private final Placeable b;

    private LazyListPlaceableWrapper(long v, Placeable placeable0) {
        this.a = v;
        this.b = placeable0;
    }

    public LazyListPlaceableWrapper(long v, Placeable placeable0, w w0) {
        this(v, placeable0);
    }

    public final long a() {
        return this.a;
    }

    @l
    public final Placeable b() {
        return this.b;
    }
}

