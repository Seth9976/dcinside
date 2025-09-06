package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class UnmodifiableLazyStringList extends AbstractList implements LazyStringList, RandomAccess {
    private final LazyStringList a;

    public UnmodifiableLazyStringList(LazyStringList lazyStringList0) {
        this.a = lazyStringList0;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void L2(LazyStringList lazyStringList0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(byte[] arr_b) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteString(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public List asByteArrayList() {
        return DesugarCollections.unmodifiableList(this.a.asByteArrayList());
    }

    @Override  // androidx.datastore.preferences.protobuf.ProtocolStringList
    public List asByteStringList() {
        return DesugarCollections.unmodifiableList(this.a.asByteStringList());
    }

    public String b(int v) {
        return (String)this.a.get(v);
    }

    @Override
    public Object get(int v) {
        return this.b(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int v) {
        return this.a.getByteArray(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public ByteString getByteString(int v) {
        return this.a.getByteString(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public Object getRaw(int v) {
        return this.a.getRaw(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public List getUnderlyingElements() {
        return this.a.getUnderlyingElements();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void i1(ByteString byteString0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            Iterator a;
            final UnmodifiableLazyStringList b;

            {
                this.a = unmodifiableLazyStringList0.a.iterator();
            }

            public String a() {
                return this.a.next();
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                return this.a();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public ListIterator listIterator(int v) {
        return new ListIterator() {
            ListIterator a;
            final UnmodifiableLazyStringList c;

            {
                int v = v;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = unmodifiableLazyStringList0.a.listIterator(v);
            }

            public void a(String s) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void add(Object object0) {
                this.a(((String)object0));
            }

            public String b() {
                return (String)this.a.next();
            }

            public String c() {
                return (String)this.a.previous();
            }

            public void d(String s) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            public boolean hasPrevious() {
                return this.a.hasPrevious();
            }

            @Override
            public Object next() {
                return this.b();
            }

            @Override
            public int nextIndex() {
                return this.a.nextIndex();
            }

            @Override
            public Object previous() {
                return this.c();
            }

            @Override
            public int previousIndex() {
                return this.a.previousIndex();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void set(Object object0) {
                this.d(((String)object0));
            }
        };
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void p2(int v, ByteString byteString0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int v, byte[] arr_b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return this.a.size();
    }
}

