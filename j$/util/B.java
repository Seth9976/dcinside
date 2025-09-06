package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public final class b implements Serializable, Comparator {
    public final int a;
    public final Object b;

    public b(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        switch(this.a) {
            case 0: {
                return Integer.compare(((ToIntFunction)this.b).applyAsInt(object0), ((ToIntFunction)this.b).applyAsInt(object1));
            }
            case 1: {
                return Double.compare(((ToDoubleFunction)this.b).applyAsDouble(object0), ((ToDoubleFunction)this.b).applyAsDouble(object1));
            }
            case 2: {
                return ((Comparable)((Function)this.b).apply(object0)).compareTo(((Function)this.b).apply(object1));
            }
            default: {
                return Long.compare(((ToLongFunction)this.b).applyAsLong(object0), ((ToLongFunction)this.b).applyAsLong(object1));
            }
        }
    }
}

