package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

public final class c implements Serializable, Comparator {
    public final int a;
    public final Comparator b;
    public final Object c;

    public c(Comparator comparator0, Object object0, int v) {
        this.a = v;
        this.b = comparator0;
        this.c = object0;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(this.a != 0) {
            Object object2 = ((Function)this.c).apply(object0);
            Object object3 = ((Function)this.c).apply(object1);
            return this.b.compare(object2, object3);
        }
        int v = this.b.compare(object0, object1);
        return v == 0 ? ((Comparator)this.c).compare(object0, object1) : v;
    }
}

