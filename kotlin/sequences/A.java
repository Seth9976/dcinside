package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.L;
import y4.l;

public final class a implements m {
    @l
    private final AtomicReference a;

    public a(@l m m0) {
        L.p(m0, "sequence");
        super();
        this.a = new AtomicReference(m0);
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        m m0 = (m)this.a.getAndSet(null);
        if(m0 == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return m0.iterator();
    }
}

