package com.google.protobuf;

import j..util.DesugarCollections;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class f0 extends AbstractMap {
    class b implements Iterator {
        private Iterator lazyOverflowIterator;
        private int pos;

        private b() {
            this.pos = f00.entryList.size();
        }

        b(a f0$a0) {
        }

        private Iterator getOverflowIterator() {
            if(this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = f0.this.overflowEntriesDescending.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean hasNext() {
            return this.pos > 0 && this.pos <= f0.this.entryList.size() || this.getOverflowIterator().hasNext();
        }

        @Override
        public Object next() {
            return this.next();
        }

        public Map.Entry next() {
            if(this.getOverflowIterator().hasNext()) {
                return this.getOverflowIterator().next();
            }
            int v = this.pos - 1;
            this.pos = v;
            return (Map.Entry)f0.this.entryList.get(v);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class c extends g {
        private c() {
            super(null);
        }

        c(a f0$a0) {
        }

        @Override  // com.google.protobuf.f0$g
        public Iterator iterator() {
            return new b(f0.this, null);
        }
    }

    static class d {
        class com.google.protobuf.f0.d.a implements Iterator {
            com.google.protobuf.f0.d.a() {
                super();
            }

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        class com.google.protobuf.f0.d.b implements Iterable {
            com.google.protobuf.f0.d.b() {
                super();
            }

            @Override
            public Iterator iterator() {
                return d.ITERATOR;
            }
        }

        private static final Iterable ITERABLE;
        private static final Iterator ITERATOR;

        static {
            d.ITERATOR = new com.google.protobuf.f0.d.a();
            d.ITERABLE = new com.google.protobuf.f0.d.b();
        }

        static Iterable iterable() {
            return d.ITERABLE;
        }
    }

    class e implements Comparable, Map.Entry {
        private final Comparable key;
        private Object value;

        e(Comparable comparable0, Object object0) {
            this.key = comparable0;
            this.value = object0;
        }

        e(Map.Entry map$Entry0) {
            this(((Comparable)map$Entry0.getKey()), map$Entry0.getValue());
        }

        public int compareTo(e f0$e0) {
            return this.getKey().compareTo(f0$e0.getKey());
        }

        @Override
        public int compareTo(Object object0) {
            return this.compareTo(((e)object0));
        }

        private boolean equals(Object object0, Object object1) {
            return object0 == null ? object1 == null : object0.equals(object1);
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(!(object0 instanceof Map.Entry)) {
                return false;
            }
            Object object1 = ((Map.Entry)object0).getKey();
            return this.equals(this.key, object1) && this.equals(this.value, ((Map.Entry)object0).getValue());
        }

        public Comparable getKey() {
            return this.key;
        }

        @Override
        public Object getKey() {
            return this.getKey();
        }

        @Override
        public Object getValue() {
            return this.value;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.key == null ? 0 : this.key.hashCode();
            Object object0 = this.value;
            if(object0 != null) {
                v = object0.hashCode();
            }
            return v1 ^ v;
        }

        @Override
        public Object setValue(Object object0) {
            f0.this.checkMutable();
            Object object1 = this.value;
            this.value = object0;
            return object1;
        }

        @Override
        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    class f implements Iterator {
        private Iterator lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;

        private f() {
            this.pos = -1;
        }

        f(a f0$a0) {
        }

        private Iterator getOverflowIterator() {
            if(this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = f0.this.overflowEntries.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean hasNext() {
            return this.pos + 1 < f0.this.entryList.size() || !f0.this.overflowEntries.isEmpty() && this.getOverflowIterator().hasNext();
        }

        @Override
        public Object next() {
            return this.next();
        }

        public Map.Entry next() {
            this.nextCalledBeforeRemove = true;
            int v = this.pos + 1;
            this.pos = v;
            return v < f0.this.entryList.size() ? ((Map.Entry)f0.this.entryList.get(this.pos)) : this.getOverflowIterator().next();
        }

        @Override
        public void remove() {
            if(!this.nextCalledBeforeRemove) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.nextCalledBeforeRemove = false;
            f0.this.checkMutable();
            if(this.pos < f0.this.entryList.size()) {
                int v = this.pos;
                this.pos = v - 1;
                f0.this.removeArrayEntryAt(v);
                return;
            }
            this.getOverflowIterator().remove();
        }
    }

    class g extends AbstractSet {
        private g() {
        }

        g(a f0$a0) {
        }

        @Override
        public boolean add(Object object0) {
            return this.add(((Map.Entry)object0));
        }

        public boolean add(Map.Entry map$Entry0) {
            if(!this.contains(map$Entry0)) {
                Comparable comparable0 = (Comparable)map$Entry0.getKey();
                Object object0 = map$Entry0.getValue();
                f0.this.put(comparable0, object0);
                return true;
            }
            return false;
        }

        @Override
        public void clear() {
            f0.this.clear();
        }

        @Override
        public boolean contains(Object object0) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = f0.this.get(object1);
            Object object3 = ((Map.Entry)object0).getValue();
            return object2 == object3 || object2 != null && object2.equals(object3);
        }

        @Override
        public Iterator iterator() {
            return new f(f0.this, null);
        }

        @Override
        public boolean remove(Object object0) {
            if(this.contains(((Map.Entry)object0))) {
                Object object1 = ((Map.Entry)object0).getKey();
                f0.this.remove(object1);
                return true;
            }
            return false;
        }

        @Override
        public int size() {
            return f0.this.size();
        }
    }

    private List entryList;
    private boolean isImmutable;
    private volatile c lazyDescendingEntrySet;
    private volatile g lazyEntrySet;
    private final int maxArraySize;
    private Map overflowEntries;
    private Map overflowEntriesDescending;

    private f0(int v) {
        this.maxArraySize = v;
        this.entryList = Collections.emptyList();
        this.overflowEntries = Collections.emptyMap();
        this.overflowEntriesDescending = Collections.emptyMap();
    }

    f0(int v, a f0$a0) {
        this(v);
    }

    private int binarySearchInArray(Comparable comparable0) {
        int v = this.entryList.size();
        int v1 = v - 1;
        if(v1 >= 0) {
            int v2 = comparable0.compareTo(((e)this.entryList.get(v1)).getKey());
            if(v2 > 0) {
                return -(v + 1);
            }
            if(v2 == 0) {
                return v1;
            }
        }
        int v3 = 0;
        while(v3 <= v1) {
            int v4 = (v3 + v1) / 2;
            int v5 = comparable0.compareTo(((e)this.entryList.get(v4)).getKey());
            if(v5 < 0) {
                v1 = v4 - 1;
                continue;
            }
            if(v5 > 0) {
                v3 = v4 + 1;
                continue;
            }
            return v4;
        }
        return -(v3 + 1);
    }

    private void checkMutable() {
        if(this.isImmutable) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void clear() {
        this.checkMutable();
        if(!this.entryList.isEmpty()) {
            this.entryList.clear();
        }
        if(!this.overflowEntries.isEmpty()) {
            this.overflowEntries.clear();
        }
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.binarySearchInArray(((Comparable)object0)) >= 0 || this.overflowEntries.containsKey(((Comparable)object0));
    }

    Set descendingEntrySet() {
        if(this.lazyDescendingEntrySet == null) {
            this.lazyDescendingEntrySet = new c(this, null);
        }
        return this.lazyDescendingEntrySet;
    }

    private void ensureEntryArrayMutable() {
        this.checkMutable();
        if(this.entryList.isEmpty() && !(this.entryList instanceof ArrayList)) {
            this.entryList = new ArrayList(this.maxArraySize);
        }
    }

    @Override
    public Set entrySet() {
        if(this.lazyEntrySet == null) {
            this.lazyEntrySet = new g(this, null);
        }
        return this.lazyEntrySet;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f0)) {
            return super.equals(object0);
        }
        int v = this.size();
        if(v != ((f0)object0).size()) {
            return false;
        }
        int v1 = this.getNumArrayEntries();
        if(v1 != ((f0)object0).getNumArrayEntries()) {
            return this.entrySet().equals(((f0)object0).entrySet());
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            if(!this.getArrayEntryAt(v2).equals(((f0)object0).getArrayEntryAt(v2))) {
                return false;
            }
        }
        return v1 == v ? true : this.overflowEntries.equals(((f0)object0).overflowEntries);
    }

    @Override
    public Object get(Object object0) {
        int v = this.binarySearchInArray(((Comparable)object0));
        return v < 0 ? this.overflowEntries.get(((Comparable)object0)) : ((e)this.entryList.get(v)).getValue();
    }

    public Map.Entry getArrayEntryAt(int v) {
        return (Map.Entry)this.entryList.get(v);
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public Iterable getOverflowEntries() {
        return this.overflowEntries.isEmpty() ? d.iterable() : this.overflowEntries.entrySet();
    }

    Iterable getOverflowEntriesDescending() {
        return this.overflowEntriesDescending.isEmpty() ? d.iterable() : this.overflowEntriesDescending.entrySet();
    }

    private SortedMap getOverflowEntriesMutable() {
        this.checkMutable();
        if(this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            TreeMap treeMap0 = new TreeMap();
            this.overflowEntries = treeMap0;
            this.overflowEntriesDescending = treeMap0.descendingMap();
        }
        return (SortedMap)this.overflowEntries;
    }

    @Override
    public int hashCode() {
        int v = this.getNumArrayEntries();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((e)this.entryList.get(v1)).hashCode();
        }
        return this.getNumOverflowEntries() <= 0 ? v2 : v2 + this.overflowEntries.hashCode();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void makeImmutable() {
        if(!this.isImmutable) {
            this.overflowEntries = this.overflowEntries.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.overflowEntries);
            this.overflowEntriesDescending = this.overflowEntriesDescending.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.overflowEntriesDescending);
            this.isImmutable = true;
        }
    }

    static f0 newFieldMap(int v) {
        class a extends f0 {
            a(int v) {
                super(v, null);
            }

            @Override  // com.google.protobuf.f0
            public void makeImmutable() {
                if(!this.isImmutable()) {
                    for(int v = 0; v < this.getNumArrayEntries(); ++v) {
                        Map.Entry map$Entry0 = this.getArrayEntryAt(v);
                        if(((FieldDescriptorLite)map$Entry0.getKey()).isRepeated()) {
                            map$Entry0.setValue(DesugarCollections.unmodifiableList(((List)map$Entry0.getValue())));
                        }
                    }
                    for(Object object0: this.getOverflowEntries()) {
                        Map.Entry map$Entry1 = (Map.Entry)object0;
                        if(((FieldDescriptorLite)map$Entry1.getKey()).isRepeated()) {
                            map$Entry1.setValue(DesugarCollections.unmodifiableList(((List)map$Entry1.getValue())));
                        }
                    }
                }
                super.makeImmutable();
            }

            @Override  // com.google.protobuf.f0
            public Object put(Object object0, Object object1) {
                return super.put(((Comparable)object0), object1);
            }
        }

        return new a(v);
    }

    static f0 newInstanceForTest(int v) {
        return new f0(v);
    }

    public Object put(Comparable comparable0, Object object0) {
        this.checkMutable();
        int v = this.binarySearchInArray(comparable0);
        if(v >= 0) {
            return ((e)this.entryList.get(v)).setValue(object0);
        }
        this.ensureEntryArrayMutable();
        if(-(v + 1) >= this.maxArraySize) {
            return this.getOverflowEntriesMutable().put(comparable0, object0);
        }
        int v1 = this.maxArraySize;
        if(this.entryList.size() == v1) {
            e f0$e0 = (e)this.entryList.remove(v1 - 1);
            this.getOverflowEntriesMutable().put(f0$e0.getKey(), f0$e0.getValue());
        }
        this.entryList.add(-(v + 1), new e(this, comparable0, object0));
        return null;
    }

    @Override
    public Object put(Object object0, Object object1) {
        return this.put(((Comparable)object0), object1);
    }

    @Override
    public Object remove(Object object0) {
        this.checkMutable();
        int v = this.binarySearchInArray(((Comparable)object0));
        if(v >= 0) {
            return this.removeArrayEntryAt(v);
        }
        return this.overflowEntries.isEmpty() ? null : this.overflowEntries.remove(((Comparable)object0));
    }

    private Object removeArrayEntryAt(int v) {
        this.checkMutable();
        Object object0 = ((e)this.entryList.remove(v)).getValue();
        if(!this.overflowEntries.isEmpty()) {
            Iterator iterator0 = this.getOverflowEntriesMutable().entrySet().iterator();
            List list0 = this.entryList;
            Object object1 = iterator0.next();
            list0.add(new e(this, ((Map.Entry)object1)));
            iterator0.remove();
        }
        return object0;
    }

    @Override
    public int size() {
        return this.entryList.size() + this.overflowEntries.size();
    }
}

