package com.google.protobuf.kotlin;

import B3.a;
import j..util.Set.-CC;
import j..util.Set;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import y4.l;

public final class UnmodifiableMapEntries extends UnmodifiableCollection implements a, Set, java.util.Set {
    @l
    private final java.util.Set delegate;

    public UnmodifiableMapEntries(@l java.util.Set set0) {
        L.p(set0, "delegate");
        super(set0);
        this.delegate = set0;
    }

    @Override  // com.google.protobuf.kotlin.UnmodifiableCollection
    public final boolean contains(Object object0) {
        return object0 instanceof Map.Entry ? this.contains(((Map.Entry)object0)) : false;
    }

    public boolean contains(Map.Entry map$Entry0) {
        return super.contains(map$Entry0);
    }

    @Override  // com.google.protobuf.kotlin.UnmodifiableCollection
    @l
    public Iterator iterator() {
        return new Object() {
            private final Iterator $$delegate_0;

            {
                this.$$delegate_0 = iterator0;
            }

            @Override
            public boolean hasNext() {
                return this.$$delegate_0.hasNext();
            }

            @Override
            public Object next() {
                return this.next();
            }

            @l
            public Map.Entry next() {
                Object object0 = this.$itr.next();
                return new UnmodifiableMapEntry(((Map.Entry)object0));
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
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

