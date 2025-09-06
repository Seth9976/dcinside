package j$.util;

import j..util.stream.Stream;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

public final class Collection.-EL {
    public static void a(Collection collection0, Consumer consumer0) {
        if(collection0 instanceof j..util.Collection) {
            ((j..util.Collection)collection0).forEach(consumer0);
            return;
        }
        Objects.requireNonNull(consumer0);
        for(Object object0: collection0) {
            consumer0.accept(object0);
        }
    }

    public static Spliterator b(Collection collection0) {
        if(collection0 instanceof j..util.Collection) {
            return ((j..util.Collection)collection0).spliterator();
        }
        if(collection0 instanceof LinkedHashSet) {
            return Spliterators.spliterator(((LinkedHashSet)collection0), 17);
        }
        if(collection0 instanceof SortedSet) {
            return new O(((SortedSet)collection0), ((SortedSet)collection0));
        }
        if(collection0 instanceof Set) {
            return Set.-CC.$default$spliterator(((Set)collection0));
        }
        return collection0 instanceof List ? List.-CC.$default$spliterator(((List)collection0)) : Collection.-CC.$default$spliterator(collection0);
    }

    // 去混淆评级： 低(20)
    public static Stream parallelStream(Collection collection0) {
        return collection0 instanceof j..util.Collection ? ((j..util.Collection)collection0).parallelStream() : Collection.-CC.$default$parallelStream(collection0);
    }

    // 去混淆评级： 低(20)
    public static boolean removeIf(Collection collection0, Predicate predicate0) {
        return collection0 instanceof j..util.Collection ? ((j..util.Collection)collection0).removeIf(predicate0) : Collection.-CC.$default$removeIf(collection0, predicate0);
    }

    // 去混淆评级： 低(20)
    public static Stream stream(Collection collection0) {
        return collection0 instanceof j..util.Collection ? ((j..util.Collection)collection0).stream() : Collection.-CC.$default$stream(collection0);
    }
}

