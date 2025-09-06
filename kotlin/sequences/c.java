package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class c implements m {
    @l
    private final m a;
    @l
    private final Function1 b;

    public c(@l m m0, @l Function1 function10) {
        L.p(m0, "source");
        L.p(function10, "keySelector");
        super();
        this.a = m0;
        this.b = function10;
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        return new b(this.a.iterator(), this.b);
    }
}

