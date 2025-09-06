package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

public final class SingleElementListIterator extends AbstractListIterator {
    private final Object c;

    public SingleElementListIterator(Object object0, int v) {
        super(v, 1);
        this.c = object0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        this.a();
        this.f(this.c() + 1);
        return this.c;
    }

    @Override
    public Object previous() {
        this.b();
        this.f(this.c() - 1);
        return this.c;
    }
}

