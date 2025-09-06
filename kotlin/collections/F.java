package kotlin.collections;

import B3.e;
import java.util.AbstractList;
import java.util.List;
import kotlin.h0;

@h0(version = "1.1")
public abstract class f extends AbstractList implements e, List {
    public abstract int a();

    @Override
    public abstract void add(int arg1, Object arg2);

    public abstract Object b(int arg1);

    @Override
    public final Object remove(int v) {
        return this.b(v);
    }

    @Override
    public abstract Object set(int arg1, Object arg2);

    @Override
    public final int size() {
        return this.a();
    }
}

