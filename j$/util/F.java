package j$.util;

import j..util.stream.Stream.Wrapper;
import j..util.stream.Stream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

class f implements Collection, Serializable, java.util.Collection {
    final java.util.Collection a;
    final Object b;
    private static final long serialVersionUID = 3053995032091335093L;

    f(java.util.Collection collection0) {
        this.a = (java.util.Collection)Objects.requireNonNull(collection0);
        this.b = this;
    }

    f(java.util.Collection collection0, Object object0) {
        this.a = (java.util.Collection)Objects.requireNonNull(collection0);
        this.b = Objects.requireNonNull(object0);
    }

    @Override
    public final boolean add(Object object0) {
        synchronized(this.b) {
        }
        return this.a.add(object0);
    }

    @Override
    public final boolean addAll(java.util.Collection collection0) {
        synchronized(this.b) {
        }
        return this.a.addAll(collection0);
    }

    @Override
    public final void clear() {
        synchronized(this.b) {
            this.a.clear();
        }
    }

    @Override
    public final boolean contains(Object object0) {
        synchronized(this.b) {
        }
        return this.a.contains(object0);
    }

    @Override
    public final boolean containsAll(java.util.Collection collection0) {
        synchronized(this.b) {
        }
        return this.a.containsAll(collection0);
    }

    @Override  // j$.util.Collection
    public final void forEach(Consumer consumer0) {
        synchronized(this.b) {
            Collection.-EL.a(this.a, consumer0);
        }
    }

    @Override
    public final boolean isEmpty() {
        synchronized(this.b) {
        }
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override  // j$.util.Collection
    public final Stream parallelStream() {
        return Collection.-EL.parallelStream(this.a);
    }

    @Override
    public final java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.-EL.parallelStream(this.a));
    }

    @Override
    public final boolean remove(Object object0) {
        synchronized(this.b) {
        }
        return this.a.remove(object0);
    }

    @Override
    public final boolean removeAll(java.util.Collection collection0) {
        synchronized(this.b) {
        }
        return this.a.removeAll(collection0);
    }

    @Override  // j$.util.Collection
    public final boolean removeIf(Predicate predicate0) {
        synchronized(this.b) {
        }
        return Collection.-EL.removeIf(this.a, predicate0);
    }

    @Override
    public final boolean retainAll(java.util.Collection collection0) {
        synchronized(this.b) {
        }
        return this.a.retainAll(collection0);
    }

    @Override
    public final int size() {
        synchronized(this.b) {
        }
        return this.a.size();
    }

    @Override  // j$.util.Collection
    public final Spliterator spliterator() {
        return Collection.-EL.b(this.a);
    }

    @Override
    public final java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(Collection.-EL.b(this.a));
    }

    @Override  // j$.util.Collection
    public final Stream stream() {
        return Collection.-EL.stream(this.a);
    }

    @Override
    public final java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.-EL.stream(this.a));
    }

    @Override
    public final Object[] toArray() {
        synchronized(this.b) {
        }
        return this.a.toArray();
    }

    @Override  // j$.util.Collection
    public final Object[] toArray(IntFunction intFunction0) {
        return Collection.-CC.$default$toArray(this, intFunction0);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        synchronized(this.b) {
        }
        return this.a.toArray(arr_object);
    }

    @Override
    public final String toString() {
        synchronized(this.b) {
        }
        return this.a.toString();
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        synchronized(this.b) {
            objectOutputStream0.defaultWriteObject();
        }
    }
}

