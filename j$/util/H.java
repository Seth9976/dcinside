package j$.util;

import j..util.concurrent.ConcurrentMap.-CC;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

final class h implements Map, Serializable, java.util.Map {
    private final java.util.Map a;
    final Object b;
    private transient Set c;
    private transient Set d;
    private transient Collection e;
    private static final long serialVersionUID = 0x1B73F9094B4B397BL;

    h(java.util.Map map0) {
        this.a = (java.util.Map)Objects.requireNonNull(map0);
        this.b = this;
    }

    @Override
    public final void clear() {
        synchronized(this.b) {
            this.a.clear();
        }
    }

    @Override  // j$.util.Map
    public final Object compute(Object object0, BiFunction biFunction0) {
        synchronized(this.b) {
        }
        return Map.-EL.compute(this.a, object0, biFunction0);
    }

    @Override  // j$.util.Map
    public final Object computeIfAbsent(Object object0, Function function0) {
        synchronized(this.b) {
        }
        return Map.-EL.computeIfAbsent(this.a, object0, function0);
    }

    @Override  // j$.util.Map
    public final Object computeIfPresent(Object object0, BiFunction biFunction0) {
        Object object2;
        synchronized(this.b) {
            java.util.Map map0 = this.a;
            if(map0 instanceof Map) {
                object2 = ((Map)map0).computeIfPresent(object0, biFunction0);
            }
            else {
                object2 = map0 instanceof ConcurrentMap ? ConcurrentMap.-CC.$default$computeIfPresent(((ConcurrentMap)map0), object0, biFunction0) : Map.-CC.$default$computeIfPresent(map0, object0, biFunction0);
            }
            return object2;
        }
    }

    @Override
    public final boolean containsKey(Object object0) {
        synchronized(this.b) {
        }
        return this.a.containsKey(object0);
    }

    @Override
    public final boolean containsValue(Object object0) {
        synchronized(this.b) {
        }
        return this.a.containsValue(object0);
    }

    @Override
    public final Set entrySet() {
        synchronized(this.b) {
            if(this.d == null) {
                this.d = new j(this.a.entrySet(), this.b);  // 初始化器: Lj$/util/f;-><init>(Ljava/util/Collection;Ljava/lang/Object;)V
            }
            return this.d;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        Object object1 = this.b;
        return this.a.equals(object0);
    }

    @Override  // j$.util.Map
    public final void forEach(BiConsumer biConsumer0) {
        synchronized(this.b) {
            Map.-EL.forEach(this.a, biConsumer0);
        }
    }

    @Override
    public final Object get(Object object0) {
        synchronized(this.b) {
        }
        return this.a.get(object0);
    }

    @Override  // j$.util.Map
    public final Object getOrDefault(Object object0, Object object1) {
        synchronized(this.b) {
        }
        return Map.-EL.getOrDefault(this.a, object0, object1);
    }

    @Override
    public final int hashCode() {
        synchronized(this.b) {
        }
        return this.a.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        synchronized(this.b) {
        }
        return this.a.isEmpty();
    }

    @Override
    public final Set keySet() {
        synchronized(this.b) {
            if(this.c == null) {
                this.c = new j(this.a.keySet(), this.b);  // 初始化器: Lj$/util/f;-><init>(Ljava/util/Collection;Ljava/lang/Object;)V
            }
            return this.c;
        }
    }

    @Override  // j$.util.Map
    public final Object merge(Object object0, Object object1, BiFunction biFunction0) {
        synchronized(this.b) {
        }
        return Map.-EL.merge(this.a, object0, object1, biFunction0);
    }

    @Override
    public final Object put(Object object0, Object object1) {
        synchronized(this.b) {
        }
        return this.a.put(object0, object1);
    }

    @Override
    public final void putAll(java.util.Map map0) {
        synchronized(this.b) {
            this.a.putAll(map0);
        }
    }

    @Override  // j$.util.Map
    public final Object putIfAbsent(Object object0, Object object1) {
        synchronized(this.b) {
        }
        return Map.-EL.putIfAbsent(this.a, object0, object1);
    }

    @Override
    public final Object remove(Object object0) {
        synchronized(this.b) {
        }
        return this.a.remove(object0);
    }

    @Override  // j$.util.Map
    public final boolean remove(Object object0, Object object1) {
        synchronized(this.b) {
        }
        return Map.-EL.remove(this.a, object0, object1);
    }

    @Override  // j$.util.Map
    public final Object replace(Object object0, Object object1) {
        synchronized(this.b) {
            return this.a instanceof Map ? ((Map)this.a).replace(object0, object1) : Map.-CC.$default$replace(this.a, object0, object1);
        }
    }

    @Override  // j$.util.Map
    public final boolean replace(Object object0, Object object1, Object object2) {
        synchronized(this.b) {
            return this.a instanceof Map ? ((Map)this.a).replace(object0, object1, object2) : Map.-CC.$default$replace(this.a, object0, object1, object2);
        }
    }

    @Override  // j$.util.Map
    public final void replaceAll(BiFunction biFunction0) {
        synchronized(this.b) {
            Map.-EL.a(this.a, biFunction0);
        }
    }

    @Override
    public final int size() {
        synchronized(this.b) {
        }
        return this.a.size();
    }

    @Override
    public final String toString() {
        synchronized(this.b) {
        }
        return this.a.toString();
    }

    @Override
    public final Collection values() {
        synchronized(this.b) {
            if(this.e == null) {
                this.e = new f(this.a.values(), this.b);
            }
            return this.e;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        synchronized(this.b) {
            objectOutputStream0.defaultWriteObject();
        }
    }
}

