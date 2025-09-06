package j$.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

class s implements Map, Serializable, java.util.Map {
    private final java.util.Map a;
    private transient Set b;
    private transient Set c;
    private transient Collection d;
    private static final long serialVersionUID = 0xF1A5A8FE74F50742L;

    s(java.util.Map map0) {
        map0.getClass();
        this.a = map0;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Map
    public final Object compute(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Map
    public final Object computeIfAbsent(Object object0, Function function0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Map
    public final Object computeIfPresent(Object object0, BiFunction biFunction0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean containsKey(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public final boolean containsValue(Object object0) {
        return this.a.containsValue(object0);
    }

    @Override
    public final Set entrySet() {
        if(this.c == null) {
            this.c = new r(this.a.entrySet());  // 初始化器: Lj$/util/l;-><init>(Ljava/util/Collection;)V
        }
        return this.c;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this || this.a.equals(object0);
    }

    @Override  // j$.util.Map
    public final void forEach(BiConsumer biConsumer0) {
        Map.-EL.forEach(this.a, biConsumer0);
    }

    @Override
    public final Object get(Object object0) {
        return this.a.get(object0);
    }

    @Override  // j$.util.Map
    public final Object getOrDefault(Object object0, Object object1) {
        return Map.-EL.getOrDefault(this.a, object0, object1);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Set keySet() {
        if(this.b == null) {
            this.b = DesugarCollections.unmodifiableSet(this.a.keySet());
        }
        return this.b;
    }

    @Override  // j$.util.Map
    public final Object merge(Object object0, Object object1, BiFunction biFunction0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void putAll(java.util.Map map0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Map
    public final Object putIfAbsent(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object remove(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Map
    public final boolean remove(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Map
    public final Object replace(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Map
    public final boolean replace(Object object0, Object object1, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Map
    public final void replaceAll(BiFunction biFunction0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }

    @Override
    public final Collection values() {
        if(this.d == null) {
            this.d = DesugarCollections.unmodifiableCollection(this.a.values());
        }
        return this.d;
    }
}

