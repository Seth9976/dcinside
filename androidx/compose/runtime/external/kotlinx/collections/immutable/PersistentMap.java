package androidx.compose.runtime.external.kotlinx.collections.immutable;

import B3.g;
import java.util.Map;
import y4.l;

public interface PersistentMap extends ImmutableMap {
    public interface Builder extends g, Map {
        @l
        PersistentMap build();
    }

    @l
    Builder builder();

    @l
    PersistentMap clear();

    @l
    PersistentMap put(Object arg1, Object arg2);

    @l
    PersistentMap putAll(@l Map arg1);

    @l
    PersistentMap remove(Object arg1);

    @l
    PersistentMap remove(Object arg1, Object arg2);
}

