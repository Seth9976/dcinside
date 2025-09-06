package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.internal.ContainerHelpersKt;
import j..util.Map.-CC;
import j..util.Map;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ArrayMap extends SimpleArrayMap implements Map, java.util.Map {
    final class EntrySet extends AbstractSet {
        final ArrayMap a;

        @Override
        @NonNull
        public Iterator iterator() {
            return new MapIterator(ArrayMap.this);
        }

        @Override
        public int size() {
            return ArrayMap.this.size();
        }
    }

    final class KeyIterator extends IndexBasedArrayIterator {
        final ArrayMap d;

        KeyIterator() {
            super(arrayMap0.size());
        }

        @Override  // androidx.collection.IndexBasedArrayIterator
        protected Object a(int v) {
            return ArrayMap.this.g(v);
        }

        @Override  // androidx.collection.IndexBasedArrayIterator
        protected void b(int v) {
            ArrayMap.this.i(v);
        }
    }

    final class KeySet implements Set {
        final ArrayMap a;

        @Override
        public boolean add(Object object0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(@NonNull Collection collection0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            ArrayMap.this.clear();
        }

        @Override
        public boolean contains(Object object0) {
            return ArrayMap.this.containsKey(object0);
        }

        @Override
        public boolean containsAll(@NonNull Collection collection0) {
            return ArrayMap.this.m(collection0);
        }

        @Override
        public boolean equals(Object object0) {
            return ArrayMap.o(this, object0);
        }

        @Override
        public int hashCode() {
            int v = ArrayMap.this.size() - 1;
            int v1 = 0;
            while(v >= 0) {
                Object object0 = ArrayMap.this.g(v);
                v1 += (object0 == null ? 0 : object0.hashCode());
                --v;
            }
            return v1;
        }

        @Override
        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override
        @NonNull
        public Iterator iterator() {
            return new KeyIterator(ArrayMap.this);
        }

        @Override
        public boolean remove(Object object0) {
            int v = ArrayMap.this.e(object0);
            if(v >= 0) {
                ArrayMap.this.i(v);
                return true;
            }
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection collection0) {
            return ArrayMap.this.q(collection0);
        }

        @Override
        public boolean retainAll(@NonNull Collection collection0) {
            return ArrayMap.this.r(collection0);
        }

        @Override
        public int size() {
            return ArrayMap.this.size();
        }

        @Override
        @NonNull
        public Object[] toArray() {
            int v = ArrayMap.this.size();
            Object[] arr_object = new Object[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_object[v1] = ArrayMap.this.g(v1);
            }
            return arr_object;
        }

        @Override
        @NonNull
        public Object[] toArray(@NonNull Object[] arr_object) {
            int v = this.size();
            if(arr_object.length < v) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
            }
            for(int v1 = 0; v1 < v; ++v1) {
                arr_object[v1] = ArrayMap.this.g(v1);
            }
            if(arr_object.length > v) {
                arr_object[v] = null;
            }
            return arr_object;
        }
    }

    final class MapIterator implements Iterator, Map.Entry {
        int a;
        int b;
        boolean c;
        final ArrayMap d;

        MapIterator() {
            this.a = arrayMap0.size() - 1;
            this.b = -1;
        }

        public Map.Entry a() {
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            ++this.b;
            this.c = true;
            return this;
        }

        @Override
        public boolean equals(Object object0) {
            if(!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return object0 instanceof Map.Entry ? ContainerHelpersKt.c(((Map.Entry)object0).getKey(), ArrayMap.this.g(this.b)) && ContainerHelpersKt.c(((Map.Entry)object0).getValue(), ArrayMap.this.l(this.b)) : false;
        }

        @Override
        public Object getKey() {
            if(!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return ArrayMap.this.g(this.b);
        }

        @Override
        public Object getValue() {
            if(!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return ArrayMap.this.l(this.b);
        }

        @Override
        public boolean hasNext() {
            return this.b < this.a;
        }

        @Override
        public int hashCode() {
            if(!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object object0 = ArrayMap.this.g(this.b);
            Object object1 = ArrayMap.this.l(this.b);
            int v = 0;
            int v1 = object0 == null ? 0 : object0.hashCode();
            if(object1 != null) {
                v = object1.hashCode();
            }
            return v1 ^ v;
        }

        @Override
        public Object next() {
            return this.a();
        }

        @Override
        public void remove() {
            if(!this.c) {
                throw new IllegalStateException();
            }
            ArrayMap.this.i(this.b);
            --this.b;
            --this.a;
            this.c = false;
        }

        @Override
        public Object setValue(Object object0) {
            if(!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return ArrayMap.this.j(this.b, object0);
        }

        @Override
        public String toString() {
            return this.getKey() + "=" + this.getValue();
        }
    }

    final class ValueCollection implements Collection {
        final ArrayMap a;

        @Override
        public boolean add(Object object0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(@NonNull Collection collection0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            ArrayMap.this.clear();
        }

        @Override
        public boolean contains(Object object0) {
            return ArrayMap.this.a(object0) >= 0;
        }

        @Override
        public boolean containsAll(Collection collection0) {
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override
        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override
        @NonNull
        public Iterator iterator() {
            return new ValueIterator(ArrayMap.this);
        }

        @Override
        public boolean remove(Object object0) {
            int v = ArrayMap.this.a(object0);
            if(v >= 0) {
                ArrayMap.this.i(v);
                return true;
            }
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection collection0) {
            int v = ArrayMap.this.size();
            boolean z = false;
            for(int v1 = 0; v1 < v; ++v1) {
                if(collection0.contains(ArrayMap.this.l(v1))) {
                    ArrayMap.this.i(v1);
                    --v1;
                    --v;
                    z = true;
                }
            }
            return z;
        }

        @Override
        public boolean retainAll(@NonNull Collection collection0) {
            int v = ArrayMap.this.size();
            boolean z = false;
            for(int v1 = 0; v1 < v; ++v1) {
                if(!collection0.contains(ArrayMap.this.l(v1))) {
                    ArrayMap.this.i(v1);
                    --v1;
                    --v;
                    z = true;
                }
            }
            return z;
        }

        @Override
        public int size() {
            return ArrayMap.this.size();
        }

        @Override
        @NonNull
        public Object[] toArray() {
            int v = ArrayMap.this.size();
            Object[] arr_object = new Object[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_object[v1] = ArrayMap.this.l(v1);
            }
            return arr_object;
        }

        @Override
        @NonNull
        public Object[] toArray(@NonNull Object[] arr_object) {
            int v = this.size();
            if(arr_object.length < v) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
            }
            for(int v1 = 0; v1 < v; ++v1) {
                arr_object[v1] = ArrayMap.this.l(v1);
            }
            if(arr_object.length > v) {
                arr_object[v] = null;
            }
            return arr_object;
        }
    }

    final class ValueIterator extends IndexBasedArrayIterator {
        final ArrayMap d;

        ValueIterator() {
            super(arrayMap0.size());
        }

        @Override  // androidx.collection.IndexBasedArrayIterator
        protected Object a(int v) {
            return ArrayMap.this.l(v);
        }

        @Override  // androidx.collection.IndexBasedArrayIterator
        protected void b(int v) {
            ArrayMap.this.i(v);
        }
    }

    @Nullable
    EntrySet d;
    @Nullable
    KeySet e;
    @Nullable
    ValueCollection f;

    public ArrayMap() {
    }

    public ArrayMap(int v) {
        super(v);
    }

    public ArrayMap(@Nullable SimpleArrayMap simpleArrayMap0) {
        super(simpleArrayMap0);
    }

    @Override  // j$.util.Map
    public Object compute(Object object0, BiFunction biFunction0) {
        return Map.-CC.$default$compute(this, object0, biFunction0);
    }

    @Override  // j$.util.Map
    public Object computeIfAbsent(Object object0, Function function0) {
        return Map.-CC.$default$computeIfAbsent(this, object0, function0);
    }

    @Override  // j$.util.Map
    public Object computeIfPresent(Object object0, BiFunction biFunction0) {
        return Map.-CC.$default$computeIfPresent(this, object0, biFunction0);
    }

    @Override  // androidx.collection.SimpleArrayMap
    public boolean containsKey(@Nullable Object object0) {
        return super.containsKey(object0);
    }

    @Override  // androidx.collection.SimpleArrayMap
    public boolean containsValue(@Nullable Object object0) {
        return super.containsValue(object0);
    }

    @Override
    @NonNull
    public Set entrySet() {
        EntrySet arrayMap$EntrySet0 = this.d;
        if(arrayMap$EntrySet0 == null) {
            arrayMap$EntrySet0 = new EntrySet(this);
            this.d = arrayMap$EntrySet0;
        }
        return arrayMap$EntrySet0;
    }

    @Override  // j$.util.Map
    public void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    @Override  // androidx.collection.SimpleArrayMap
    public Object get(@Nullable Object object0) {
        return super.get(object0);
    }

    @Override
    @NonNull
    public Set keySet() {
        KeySet arrayMap$KeySet0 = this.e;
        if(arrayMap$KeySet0 == null) {
            arrayMap$KeySet0 = new KeySet(this);
            this.e = arrayMap$KeySet0;
        }
        return arrayMap$KeySet0;
    }

    public boolean m(@NonNull Collection collection0) {
        for(Object object0: collection0) {
            if(!this.containsKey(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // j$.util.Map
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        return Map.-CC.$default$merge(this, object0, object1, biFunction0);
    }

    static boolean o(Set set0, Object object0) {
        if(set0 == object0) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set1 = (Set)object0;
            try {
                return set0.size() != set1.size() || !set0.containsAll(set1) ? false : true;
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public void putAll(@NonNull java.util.Map map0) {
        this.b(this.size() + map0.size());
        for(Object object0: map0.entrySet()) {
            this.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    public boolean q(@NonNull Collection collection0) {
        int v = this.size();
        for(Object object0: collection0) {
            this.remove(object0);
        }
        return v != this.size();
    }

    public boolean r(@NonNull Collection collection0) {
        int v = this.size();
        for(int v1 = this.size() - 1; v1 >= 0; --v1) {
            if(!collection0.contains(this.g(v1))) {
                this.i(v1);
            }
        }
        return v != this.size();
    }

    @Override  // androidx.collection.SimpleArrayMap
    public Object remove(@Nullable Object object0) {
        return super.remove(object0);
    }

    @Override  // j$.util.Map
    public void replaceAll(BiFunction biFunction0) {
        Map.-CC.$default$replaceAll(this, biFunction0);
    }

    @Override
    @NonNull
    public Collection values() {
        ValueCollection arrayMap$ValueCollection0 = this.f;
        if(arrayMap$ValueCollection0 == null) {
            arrayMap$ValueCollection0 = new ValueCollection(this);
            this.f = arrayMap$ValueCollection0;
        }
        return arrayMap$ValueCollection0;
    }
}

