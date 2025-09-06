package j$.util;

import j..util.concurrent.ConcurrentMap.-CC;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class Map.-EL {
    public static void a(Map map0, BiFunction biFunction0) {
        if(map0 instanceof j..util.Map) {
            ((j..util.Map)map0).replaceAll(biFunction0);
            return;
        }
        if(map0 instanceof ConcurrentMap) {
            ConcurrentMap.-CC.$default$replaceAll(((ConcurrentMap)map0), biFunction0);
            return;
        }
        Map.-CC.$default$replaceAll(map0, biFunction0);
    }

    public static Object compute(Map map0, Object object0, BiFunction biFunction0) {
        if(map0 instanceof j..util.Map) {
            return ((j..util.Map)map0).compute(object0, biFunction0);
        }
        return map0 instanceof ConcurrentMap ? ConcurrentMap.-CC.$default$compute(((ConcurrentMap)map0), object0, biFunction0) : Map.-CC.$default$compute(map0, object0, biFunction0);
    }

    public static Object computeIfAbsent(Map map0, Object object0, Function function0) {
        if(map0 instanceof j..util.Map) {
            return ((j..util.Map)map0).computeIfAbsent(object0, function0);
        }
        return map0 instanceof ConcurrentMap ? ConcurrentMap.-CC.$default$computeIfAbsent(((ConcurrentMap)map0), object0, function0) : Map.-CC.$default$computeIfAbsent(map0, object0, function0);
    }

    public static void forEach(Map map0, BiConsumer biConsumer0) {
        if(map0 instanceof j..util.Map) {
            ((j..util.Map)map0).forEach(biConsumer0);
            return;
        }
        if(map0 instanceof ConcurrentMap) {
            ConcurrentMap.-CC.$default$forEach(((ConcurrentMap)map0), biConsumer0);
            return;
        }
        Map.-CC.$default$forEach(map0, biConsumer0);
    }

    public static Object getOrDefault(Map map0, Object object0, Object object1) {
        if(map0 instanceof j..util.Map) {
            return ((j..util.Map)map0).getOrDefault(object0, object1);
        }
        return map0 instanceof ConcurrentMap ? ConcurrentMap.-CC.$default$getOrDefault(((ConcurrentMap)map0), object0, object1) : Map.-CC.$default$getOrDefault(map0, object0, object1);
    }

    public static Object merge(Map map0, Object object0, Object object1, BiFunction biFunction0) {
        if(map0 instanceof j..util.Map) {
            return ((j..util.Map)map0).merge(object0, object1, biFunction0);
        }
        return map0 instanceof ConcurrentMap ? ConcurrentMap.-CC.$default$merge(((ConcurrentMap)map0), object0, object1, biFunction0) : Map.-CC.$default$merge(map0, object0, object1, biFunction0);
    }

    // 去混淆评级： 低(20)
    public static Object putIfAbsent(Map map0, Object object0, Object object1) {
        return map0 instanceof j..util.Map ? ((j..util.Map)map0).putIfAbsent(object0, object1) : Map.-CC.$default$putIfAbsent(map0, object0, object1);
    }

    // 去混淆评级： 低(20)
    public static boolean remove(Map map0, Object object0, Object object1) {
        return map0 instanceof j..util.Map ? ((j..util.Map)map0).remove(object0, object1) : Map.-CC.$default$remove(map0, object0, object1);
    }
}

