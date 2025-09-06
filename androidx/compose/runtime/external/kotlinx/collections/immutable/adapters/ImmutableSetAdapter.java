package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import j..util.Set.-CC;
import j..util.Set;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import kotlin.jvm.internal.L;
import y4.l;

public final class ImmutableSetAdapter extends ImmutableCollectionAdapter implements ImmutableSet, Set {
    public ImmutableSetAdapter(@l java.util.Set set0) {
        L.p(set0, "impl");
        super(set0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.ImmutableCollectionAdapter, j$.util.Set
    public Spliterator spliterator() {
        return Set.-CC.$default$spliterator(this);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.ImmutableCollectionAdapter
    public java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.spliterator());
    }
}

