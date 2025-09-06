package j$.util;

import java.util.ConcurrentModificationException;
import java.util.Map.Entry;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class Map.-CC {
    public static Object $default$compute(Map map0, Object object0, BiFunction biFunction0) {
        Objects.requireNonNull(biFunction0);
        Object object1 = map0.get(object0);
        Object object2 = biFunction0.apply(object0, object1);
        if(object2 == null) {
            if(object1 == null && !map0.containsKey(object0)) {
                return null;
            }
            map0.remove(object0);
            return null;
        }
        map0.put(object0, object2);
        return object2;
    }

    public static Object $default$computeIfAbsent(Map map0, Object object0, Function function0) {
        Objects.requireNonNull(function0);
        Object object1 = map0.get(object0);
        if(object1 == null) {
            Object object2 = function0.apply(object0);
            if(object2 != null) {
                map0.put(object0, object2);
                return object2;
            }
        }
        return object1;
    }

    public static Object $default$computeIfPresent(Map map0, Object object0, BiFunction biFunction0) {
        Objects.requireNonNull(biFunction0);
        Object object1 = map0.get(object0);
        if(object1 != null) {
            Object object2 = biFunction0.apply(object0, object1);
            if(object2 != null) {
                map0.put(object0, object2);
                return object2;
            }
            map0.remove(object0);
        }
        return null;
    }

    public static void $default$forEach(Map map0, BiConsumer biConsumer0) {
        Object object2;
        Object object1;
        Objects.requireNonNull(biConsumer0);
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            try {
                object1 = map$Entry0.getKey();
                object2 = map$Entry0.getValue();
            }
            catch(IllegalStateException illegalStateException0) {
                throw new ConcurrentModificationException(illegalStateException0);
            }
            biConsumer0.accept(object1, object2);
        }
    }

    public static Object $default$getOrDefault(Map map0, Object object0, Object object1) {
        Object object2 = map0.get(object0);
        return object2 == null && !map0.containsKey(object0) ? object1 : object2;
    }

    public static Object $default$merge(Map map0, Object object0, Object object1, BiFunction biFunction0) {
        Objects.requireNonNull(biFunction0);
        Objects.requireNonNull(object1);
        Object object2 = map0.get(object0);
        if(object2 != null) {
            object1 = biFunction0.apply(object2, object1);
        }
        if(object1 == null) {
            map0.remove(object0);
            return null;
        }
        map0.put(object0, object1);
        return object1;
    }

    public static Object $default$putIfAbsent(Map map0, Object object0, Object object1) {
        Object object2 = map0.get(object0);
        return object2 == null ? map0.put(object0, object1) : object2;
    }

    public static boolean $default$remove(Map map0, Object object0, Object object1) {
        Object object2 = map0.get(object0);
        if(Objects.equals(object2, object1) && (object2 != null || map0.containsKey(object0))) {
            map0.remove(object0);
            return true;
        }
        return false;
    }

    public static Object $default$replace(Map map0, Object object0, Object object1) {
        Object object2 = map0.get(object0);
        return object2 == null && !map0.containsKey(object0) ? object2 : map0.put(object0, object1);
    }

    public static boolean $default$replace(Map map0, Object object0, Object object1, Object object2) {
        Object object3 = map0.get(object0);
        if(Objects.equals(object3, object1) && (object3 != null || map0.containsKey(object0))) {
            map0.put(object0, object2);
            return true;
        }
        return false;
    }

    public static void $default$replaceAll(Map map0, BiFunction biFunction0) {
        Object object2;
        Object object1;
        Objects.requireNonNull(biFunction0);
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            try {
                object1 = map$Entry0.getKey();
                object2 = map$Entry0.getValue();
            }
            catch(IllegalStateException illegalStateException0) {
                throw new ConcurrentModificationException(illegalStateException0);
            }
            Object object3 = biFunction0.apply(object1, object2);
            try {
                map$Entry0.setValue(object3);
            }
            catch(IllegalStateException illegalStateException1) {
                throw new ConcurrentModificationException(illegalStateException1);
            }
        }
    }
}

