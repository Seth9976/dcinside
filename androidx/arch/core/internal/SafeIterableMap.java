package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@RestrictTo({Scope.c})
public class SafeIterableMap implements Iterable {
    static class AscendingIterator extends ListIterator {
        AscendingIterator(Entry safeIterableMap$Entry0, Entry safeIterableMap$Entry1) {
            super(safeIterableMap$Entry0, safeIterableMap$Entry1);
        }

        @Override  // androidx.arch.core.internal.SafeIterableMap$ListIterator
        Entry b(Entry safeIterableMap$Entry0) {
            return safeIterableMap$Entry0.d;
        }

        @Override  // androidx.arch.core.internal.SafeIterableMap$ListIterator
        Entry c(Entry safeIterableMap$Entry0) {
            return safeIterableMap$Entry0.c;
        }
    }

    static class DescendingIterator extends ListIterator {
        DescendingIterator(Entry safeIterableMap$Entry0, Entry safeIterableMap$Entry1) {
            super(safeIterableMap$Entry0, safeIterableMap$Entry1);
        }

        @Override  // androidx.arch.core.internal.SafeIterableMap$ListIterator
        Entry b(Entry safeIterableMap$Entry0) {
            return safeIterableMap$Entry0.c;
        }

        @Override  // androidx.arch.core.internal.SafeIterableMap$ListIterator
        Entry c(Entry safeIterableMap$Entry0) {
            return safeIterableMap$Entry0.d;
        }
    }

    static class Entry implements Map.Entry {
        @NonNull
        final Object a;
        @NonNull
        final Object b;
        Entry c;
        Entry d;

        Entry(@NonNull Object object0, @NonNull Object object1) {
            this.a = object0;
            this.b = object1;
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            return object0 instanceof Entry ? this.a.equals(((Entry)object0).a) && this.b.equals(((Entry)object0).b) : false;
        }

        @Override
        @NonNull
        public Object getKey() {
            return this.a;
        }

        @Override
        @NonNull
        public Object getValue() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        @Override
        public Object setValue(Object object0) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        @Override
        public String toString() {
            return this.a + "=" + this.b;
        }
    }

    @RestrictTo({Scope.c})
    public class IteratorWithAdditions extends SupportRemove implements Iterator {
        private Entry a;
        private boolean b;
        final SafeIterableMap c;

        IteratorWithAdditions() {
            this.b = true;
        }

        @Override  // androidx.arch.core.internal.SafeIterableMap$SupportRemove
        void a(@NonNull Entry safeIterableMap$Entry0) {
            Entry safeIterableMap$Entry1 = this.a;
            if(safeIterableMap$Entry0 == safeIterableMap$Entry1) {
                this.a = safeIterableMap$Entry1.d;
                this.b = safeIterableMap$Entry1.d == null;
            }
        }

        public Map.Entry b() {
            if(this.b) {
                this.b = false;
                this.a = SafeIterableMap.this.a;
                return this.a;
            }
            this.a = this.a == null ? null : this.a.c;
            return this.a;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean hasNext() {
            return this.b ? SafeIterableMap.this.a != null : this.a != null && this.a.c != null;
        }

        @Override
        public Object next() {
            return this.b();
        }
    }

    static abstract class ListIterator extends SupportRemove implements Iterator {
        Entry a;
        Entry b;

        ListIterator(Entry safeIterableMap$Entry0, Entry safeIterableMap$Entry1) {
            this.a = safeIterableMap$Entry1;
            this.b = safeIterableMap$Entry0;
        }

        @Override  // androidx.arch.core.internal.SafeIterableMap$SupportRemove
        public void a(@NonNull Entry safeIterableMap$Entry0) {
            if(this.a == safeIterableMap$Entry0 && safeIterableMap$Entry0 == this.b) {
                this.b = null;
                this.a = null;
            }
            Entry safeIterableMap$Entry1 = this.a;
            if(safeIterableMap$Entry1 == safeIterableMap$Entry0) {
                this.a = this.b(safeIterableMap$Entry1);
            }
            if(this.b == safeIterableMap$Entry0) {
                this.b = this.e();
            }
        }

        abstract Entry b(Entry arg1);

        abstract Entry c(Entry arg1);

        public Map.Entry d() {
            Map.Entry map$Entry0 = this.b;
            this.b = this.e();
            return map$Entry0;
        }

        private Entry e() {
            return this.b == this.a || this.a == null ? null : this.c(this.b);
        }

        @Override
        public boolean hasNext() {
            return this.b != null;
        }

        @Override
        public Object next() {
            return this.d();
        }
    }

    @RestrictTo({Scope.c})
    public static abstract class SupportRemove {
        abstract void a(@NonNull Entry arg1);
    }

    Entry a;
    private Entry b;
    private final WeakHashMap c;
    private int d;

    public SafeIterableMap() {
        this.c = new WeakHashMap();
        this.d = 0;
    }

    @Nullable
    public Map.Entry a() {
        return this.a;
    }

    @Nullable
    protected Entry b(Object object0) {
        Entry safeIterableMap$Entry0;
        for(safeIterableMap$Entry0 = this.a; safeIterableMap$Entry0 != null && !safeIterableMap$Entry0.a.equals(object0); safeIterableMap$Entry0 = safeIterableMap$Entry0.c) {
        }
        return safeIterableMap$Entry0;
    }

    @NonNull
    public IteratorWithAdditions c() {
        IteratorWithAdditions safeIterableMap$IteratorWithAdditions0 = new IteratorWithAdditions(this);
        this.c.put(safeIterableMap$IteratorWithAdditions0, Boolean.FALSE);
        return safeIterableMap$IteratorWithAdditions0;
    }

    @Nullable
    public Map.Entry d() {
        return this.b;
    }

    @NonNull
    public Iterator descendingIterator() {
        Iterator iterator0 = new DescendingIterator(this.b, this.a);
        this.c.put(iterator0, Boolean.FALSE);
        return iterator0;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof SafeIterableMap)) {
            return false;
        }
        if(this.size() != ((SafeIterableMap)object0).size()) {
            return false;
        }
        Iterator iterator0 = this.iterator();
        Iterator iterator1 = ((SafeIterableMap)object0).iterator();
        while(iterator0.hasNext() && iterator1.hasNext()) {
            Object object1 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            Object object2 = iterator1.next();
            if(map$Entry0 == null && object2 != null || map$Entry0 != null && !map$Entry0.equals(object2)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return !iterator0.hasNext() && !iterator1.hasNext();
    }

    Entry g(@NonNull Object object0, @NonNull Object object1) {
        Entry safeIterableMap$Entry0 = new Entry(object0, object1);
        ++this.d;
        Entry safeIterableMap$Entry1 = this.b;
        if(safeIterableMap$Entry1 == null) {
            this.a = safeIterableMap$Entry0;
            this.b = safeIterableMap$Entry0;
            return safeIterableMap$Entry0;
        }
        safeIterableMap$Entry1.c = safeIterableMap$Entry0;
        safeIterableMap$Entry0.d = safeIterableMap$Entry1;
        this.b = safeIterableMap$Entry0;
        return safeIterableMap$Entry0;
    }

    public Object h(@NonNull Object object0, @NonNull Object object1) {
        Entry safeIterableMap$Entry0 = this.b(object0);
        if(safeIterableMap$Entry0 != null) {
            return safeIterableMap$Entry0.b;
        }
        this.g(object0, object1);
        return null;
    }

    @Override
    public int hashCode() {
        int v = 0;
        for(Object object0: this) {
            v += ((Map.Entry)object0).hashCode();
        }
        return v;
    }

    public Object i(@NonNull Object object0) {
        Entry safeIterableMap$Entry0 = this.b(object0);
        if(safeIterableMap$Entry0 == null) {
            return null;
        }
        --this.d;
        if(!this.c.isEmpty()) {
            for(Object object1: this.c.keySet()) {
                ((SupportRemove)object1).a(safeIterableMap$Entry0);
            }
        }
        Entry safeIterableMap$Entry1 = safeIterableMap$Entry0.d;
        if(safeIterableMap$Entry1 == null) {
            this.a = safeIterableMap$Entry0.c;
        }
        else {
            safeIterableMap$Entry1.c = safeIterableMap$Entry0.c;
        }
        Entry safeIterableMap$Entry2 = safeIterableMap$Entry0.c;
        if(safeIterableMap$Entry2 == null) {
            this.b = safeIterableMap$Entry1;
        }
        else {
            safeIterableMap$Entry2.d = safeIterableMap$Entry1;
        }
        safeIterableMap$Entry0.c = null;
        safeIterableMap$Entry0.d = null;
        return safeIterableMap$Entry0.b;
    }

    @Override
    @NonNull
    public Iterator iterator() {
        Iterator iterator0 = new AscendingIterator(this.a, this.b);
        this.c.put(iterator0, Boolean.FALSE);
        return iterator0;
    }

    public int size() {
        return this.d;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("[");
        Iterator iterator0 = this.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(((Map.Entry)object0).toString());
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

