package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@h0(version = "1.1")
public abstract class i extends a implements B3.a, Set {
    public static final class kotlin.collections.i.a {
        private kotlin.collections.i.a() {
        }

        public kotlin.collections.i.a(w w0) {
        }

        public final boolean a(@l Set set0, @l Set set1) {
            L.p(set0, "c");
            L.p(set1, "other");
            return set0.size() == set1.size() ? set0.containsAll(set1) : false;
        }

        public final int b(@l Collection collection0) {
            L.p(collection0, "c");
            int v = 0;
            for(Object object0: collection0) {
                v += (object0 == null ? 0 : object0.hashCode());
            }
            return v;
        }
    }

    @l
    public static final kotlin.collections.i.a a;

    static {
        i.a = new kotlin.collections.i.a(null);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof Set ? i.a.a(this, ((Set)object0)) : false;
    }

    @Override
    public int hashCode() {
        return i.a.b(this);
    }

    @Override  // kotlin.collections.a
    public Iterator iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

