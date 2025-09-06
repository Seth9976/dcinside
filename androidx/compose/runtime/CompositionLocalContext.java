package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import kotlin.jvm.internal.L;
import y4.l;

@Stable
public final class CompositionLocalContext {
    @l
    private final PersistentMap a;
    public static final int b;

    static {
    }

    public CompositionLocalContext(@l PersistentMap persistentMap0) {
        L.p(persistentMap0, "compositionLocals");
        super();
        this.a = persistentMap0;
    }

    @l
    public final PersistentMap a() {
        return this.a;
    }
}

