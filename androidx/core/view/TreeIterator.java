package androidx.core.view;

import B3.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import y4.l;

public final class TreeIterator implements a, Iterator {
    @l
    private final Function1 a;
    @l
    private final List b;
    @l
    private Iterator c;

    public TreeIterator(@l Iterator iterator0, @l Function1 function10) {
        this.a = function10;
        this.b = new ArrayList();
        this.c = iterator0;
    }

    private final void a(Object object0) {
        Iterator iterator0 = (Iterator)this.a.invoke(object0);
        if(iterator0 != null && iterator0.hasNext()) {
            this.b.add(this.c);
            this.c = iterator0;
            return;
        }
        while(!this.c.hasNext() && !this.b.isEmpty()) {
            this.c = (Iterator)u.p3(this.b);
            u.O0(this.b);
        }
    }

    @Override
    public boolean hasNext() {
        return this.c.hasNext();
    }

    @Override
    public Object next() {
        Object object0 = this.c.next();
        this.a(object0);
        return object0;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

