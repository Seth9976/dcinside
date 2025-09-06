package j$.util.concurrent;

import j..util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class ConcurrentMap.-CC {
    public static Object $default$compute(ConcurrentMap concurrentMap0, Object object0, BiFunction biFunction0) {
        Object object2;
        Object object1;
    alab1:
        do {
            do {
                object1 = concurrentMap0.get(object0);
            label_1:
                object2 = biFunction0.apply(object0, object1);
                if(object2 == null) {
                    continue alab1;
                }
                if(object1 == null) {
                    goto label_6;
                }
            }
            while(!concurrentMap0.replace(object0, object1, object2));
            return object2;
        label_6:
            object1 = concurrentMap0.putIfAbsent(object0, object2);
            if(object1 != null) {
                goto label_1;
            }
            return object2;
        }
        while(object1 != null && !concurrentMap0.remove(object0, object1));
        return null;
    }

    public static Object $default$computeIfAbsent(ConcurrentMap concurrentMap0, Object object0, Function function0) {
        Objects.requireNonNull(function0);
        Object object1 = concurrentMap0.get(object0);
        if(object1 == null) {
            Object object2 = function0.apply(object0);
            if(object2 != null) {
                object1 = concurrentMap0.putIfAbsent(object0, object2);
                return object1 == null ? object2 : object1;
            }
        }
        return object1;
    }

    public static Object $default$computeIfPresent(ConcurrentMap concurrentMap0, Object object0, BiFunction biFunction0) {
        Object object2;
        Objects.requireNonNull(biFunction0);
    alab1:
        while(true) {
            do {
                Object object1 = concurrentMap0.get(object0);
                if(object1 == null) {
                    break alab1;
                }
                object2 = biFunction0.apply(object0, object1);
                if(object2 != null) {
                    goto label_7;
                }
            }
            while(!concurrentMap0.remove(object0, object1));
            return null;
        label_7:
            if(concurrentMap0.replace(object0, object1, object2)) {
                return object2;
            }
        }
        return null;
    }

    public static void $default$forEach(ConcurrentMap concurrentMap0, BiConsumer biConsumer0) {
        Object object2;
        Object object1;
        Objects.requireNonNull(biConsumer0);
        for(Object object0: concurrentMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            try {
                object1 = map$Entry0.getKey();
                object2 = map$Entry0.getValue();
            }
            catch(IllegalStateException unused_ex) {
                continue;
            }
            biConsumer0.accept(object1, object2);
        }
    }

    public static Object $default$getOrDefault(ConcurrentMap concurrentMap0, Object object0, Object object1) {
        Object object2 = concurrentMap0.get(object0);
        return object2 == null ? object1 : object2;
    }

    public static Object $default$merge(ConcurrentMap concurrentMap0, Object object0, Object object1, BiFunction biFunction0) {
        Object object3;
        Object object2;
        Objects.requireNonNull(biFunction0);
        Objects.requireNonNull(object1);
    alab1:
        while(true) {
            do {
            label_2:
                object2 = concurrentMap0.get(object0);
            label_3:
                if(object2 == null) {
                    break alab1;
                }
                object3 = biFunction0.apply(object2, object1);
                if(object3 == null) {
                    goto label_8;
                }
            }
            while(!concurrentMap0.replace(object0, object2, object3));
            return object3;
        label_8:
            if(!concurrentMap0.remove(object0, object2)) {
                goto label_2;
            }
            return null;
        }
        object2 = concurrentMap0.putIfAbsent(object0, object1);
        if(object2 != null) {
            goto label_3;
        }
        return object1;
    }

    public static void $default$replaceAll(ConcurrentMap concurrentMap0, BiFunction biFunction0) {
        Objects.requireNonNull(biFunction0);
        t t0 = new t(0, concurrentMap0, biFunction0);
        if(concurrentMap0 instanceof j..util.concurrent.ConcurrentMap) {
            ((j..util.concurrent.ConcurrentMap)concurrentMap0).forEach(t0);
            return;
        }
        ConcurrentMap.-CC.$default$forEach(concurrentMap0, t0);
    }
}

