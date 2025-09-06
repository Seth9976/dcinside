package androidx.compose.runtime.external.kotlinx.collections.immutable;

import B3.h;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import y4.l;

public interface PersistentSet extends ImmutableSet, PersistentCollection {
    public interface Builder extends h, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder, Set {
        @l
        PersistentSet build();
    }

    @l
    PersistentSet add(Object arg1);

    @l
    PersistentSet addAll(@l Collection arg1);

    @l
    Builder builder();

    @l
    PersistentSet clear();

    @l
    PersistentSet e(@l Function1 arg1);

    @l
    PersistentSet remove(Object arg1);

    @l
    PersistentSet removeAll(@l Collection arg1);

    @l
    PersistentSet retainAll(@l Collection arg1);
}

