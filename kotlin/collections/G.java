package kotlin.collections;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.h0;
import y4.m;

@h0(version = "1.1")
public abstract class g extends AbstractMap implements B3.g, Map {
    public abstract Set a();

    public Set b() {
        return super.keySet();
    }

    public int c() {
        return super.size();
    }

    public Collection d() {
        return super.values();
    }

    @Override
    public final Set entrySet() {
        return this.a();
    }

    @Override
    public final Set keySet() {
        return this.b();
    }

    @Override
    @m
    public abstract Object put(Object arg1, Object arg2);

    @Override
    public final int size() {
        return this.c();
    }

    @Override
    public final Collection values() {
        return this.d();
    }
}

