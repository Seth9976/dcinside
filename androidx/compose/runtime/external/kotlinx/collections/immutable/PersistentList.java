package androidx.compose.runtime.external.kotlinx.collections.immutable;

import B3.e;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import y4.l;

public interface PersistentList extends ImmutableList, PersistentCollection {
    public interface Builder extends e, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder, List {
        @l
        PersistentList build();
    }

    @l
    PersistentList add(int arg1, Object arg2);

    @l
    PersistentList add(Object arg1);

    @l
    PersistentList addAll(int arg1, @l Collection arg2);

    @l
    PersistentList addAll(@l Collection arg1);

    @l
    Builder builder();

    @l
    PersistentList clear();

    @l
    PersistentList e(@l Function1 arg1);

    @l
    PersistentList o2(int arg1);

    @l
    PersistentList remove(Object arg1);

    @l
    PersistentList removeAll(@l Collection arg1);

    @l
    PersistentList retainAll(@l Collection arg1);

    @l
    PersistentList set(int arg1, Object arg2);
}

