package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.G;
import y4.l;

final class g implements e, m {
    @l
    public static final g a;

    static {
        g.a = new g();
    }

    @Override  // kotlin.sequences.e
    public m a(int v) {
        return this.c(v);
    }

    @Override  // kotlin.sequences.e
    public m b(int v) {
        return this.d(v);
    }

    @l
    public g c(int v) {
        return g.a;
    }

    @l
    public g d(int v) {
        return g.a;
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        return G.a;
    }
}

