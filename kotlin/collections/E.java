package kotlin.collections;

import B3.b;
import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.h0;

@h0(version = "1.1")
public abstract class e extends AbstractCollection implements b, Collection {
    public abstract int a();

    @Override
    public abstract boolean add(Object arg1);

    @Override
    public final int size() {
        return this.a();
    }
}

