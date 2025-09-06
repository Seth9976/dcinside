package androidx.compose.runtime.external.kotlinx.collections.immutable;

import B3.b;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import y4.l;

public interface PersistentCollection extends ImmutableCollection {
    public interface Builder extends b, Collection {
        @l
        PersistentCollection build();
    }

    @l
    PersistentCollection add(Object arg1);

    @l
    PersistentCollection addAll(@l Collection arg1);

    @l
    Builder builder();

    @l
    PersistentCollection clear();

    @l
    PersistentCollection e(@l Function1 arg1);

    @l
    PersistentCollection remove(Object arg1);

    @l
    PersistentCollection removeAll(@l Collection arg1);

    @l
    PersistentCollection retainAll(@l Collection arg1);
}

