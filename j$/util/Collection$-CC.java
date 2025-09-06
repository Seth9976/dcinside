package j$.util;

import j..util.stream.Stream;
import j..util.stream.StreamSupport;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public final class Collection.-CC {
    public static Stream $default$parallelStream(Collection collection0) {
        return StreamSupport.stream(Collection.-EL.b(collection0), true);
    }

    public static boolean $default$removeIf(Collection collection0, Predicate predicate0) {
        Objects.requireNonNull(predicate0);
        boolean z = false;
        Iterator iterator0 = collection0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(predicate0.test(object0)) {
                iterator0.remove();
                z = true;
            }
        }
        return z;
    }

    public static Spliterator $default$spliterator(Collection collection0) {
        return Spliterators.spliterator(collection0, 0);
    }

    public static Stream $default$stream(Collection collection0) {
        return StreamSupport.stream(Collection.-EL.b(collection0), false);
    }

    public static Object[] $default$toArray(Collection collection0, IntFunction intFunction0) {
        return collection0.toArray(((Object[])intFunction0.apply(0)));
    }
}

