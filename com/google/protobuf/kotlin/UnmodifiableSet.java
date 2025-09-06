package com.google.protobuf.kotlin;

import B3.a;
import j..util.Set.-CC;
import j..util.Set;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import java.util.Collection;
import kotlin.jvm.internal.L;
import y4.l;

public final class UnmodifiableSet extends UnmodifiableCollection implements a, Set, java.util.Set {
    public UnmodifiableSet(@l Collection collection0) {
        L.p(collection0, "delegate");
        super(collection0);
    }

    @Override  // com.google.protobuf.kotlin.UnmodifiableCollection, j$.util.Set
    public Spliterator spliterator() {
        return Set.-CC.$default$spliterator(this);
    }

    @Override  // com.google.protobuf.kotlin.UnmodifiableCollection
    public java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.spliterator());
    }
}

