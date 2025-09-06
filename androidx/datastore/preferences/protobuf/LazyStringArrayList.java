package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public class LazyStringArrayList extends AbstractProtobufList implements LazyStringList, RandomAccess {
    static class ByteArrayListView extends AbstractList implements RandomAccess {
        private final LazyStringArrayList a;

        ByteArrayListView(LazyStringArrayList lazyStringArrayList0) {
            this.a = lazyStringArrayList0;
        }

        public void a(int v, byte[] arr_b) {
            this.a.l(v, arr_b);
            ++this.modCount;
        }

        @Override
        public void add(int v, Object object0) {
            this.a(v, ((byte[])object0));
        }

        public byte[] b(int v) {
            return this.a.getByteArray(v);
        }

        public byte[] c(int v) {
            String s = this.a.t(v);
            ++this.modCount;
            return LazyStringArrayList.m(s);
        }

        public byte[] d(int v, byte[] arr_b) {
            Object object0 = this.a.x(v, arr_b);
            ++this.modCount;
            return LazyStringArrayList.m(object0);
        }

        @Override
        public Object get(int v) {
            return this.b(v);
        }

        @Override
        public Object remove(int v) {
            return this.c(v);
        }

        @Override
        public Object set(int v, Object object0) {
            return this.d(v, ((byte[])object0));
        }

        @Override
        public int size() {
            return this.a.size();
        }
    }

    static class ByteStringListView extends AbstractList implements RandomAccess {
        private final LazyStringArrayList a;

        ByteStringListView(LazyStringArrayList lazyStringArrayList0) {
            this.a = lazyStringArrayList0;
        }

        public void a(int v, ByteString byteString0) {
            this.a.j(v, byteString0);
            ++this.modCount;
        }

        @Override
        public void add(int v, Object object0) {
            this.a(v, ((ByteString)object0));
        }

        public ByteString b(int v) {
            return this.a.getByteString(v);
        }

        public ByteString c(int v) {
            String s = this.a.t(v);
            ++this.modCount;
            return LazyStringArrayList.n(s);
        }

        public ByteString d(int v, ByteString byteString0) {
            Object object0 = this.a.v(v, byteString0);
            ++this.modCount;
            return LazyStringArrayList.n(object0);
        }

        @Override
        public Object get(int v) {
            return this.b(v);
        }

        @Override
        public Object remove(int v) {
            return this.c(v);
        }

        @Override
        public Object set(int v, Object object0) {
            return this.d(v, ((ByteString)object0));
        }

        @Override
        public int size() {
            return this.a.size();
        }
    }

    private final List c;
    private static final LazyStringArrayList d;
    public static final LazyStringList e;

    static {
        LazyStringArrayList lazyStringArrayList0 = new LazyStringArrayList();
        LazyStringArrayList.d = lazyStringArrayList0;
        lazyStringArrayList0.makeImmutable();
        LazyStringArrayList.e = lazyStringArrayList0;
    }

    public LazyStringArrayList() {
        this(10);
    }

    public LazyStringArrayList(int v) {
        this(new ArrayList(v));
    }

    public LazyStringArrayList(LazyStringList lazyStringList0) {
        this.c = new ArrayList(lazyStringList0.size());
        this.addAll(lazyStringList0);
    }

    private LazyStringArrayList(ArrayList arrayList0) {
        this.c = arrayList0;
    }

    public LazyStringArrayList(List list0) {
        this(new ArrayList(list0));
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void L2(LazyStringList lazyStringList0) {
        this.a();
        for(Object object0: lazyStringList0.getUnderlyingElements()) {
            if(object0 instanceof byte[]) {
                byte[] arr_b = Arrays.copyOf(((byte[])object0), ((byte[])object0).length);
                this.c.add(arr_b);
            }
            else {
                this.c.add(object0);
            }
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public void add(int v, Object object0) {
        this.k(v, ((String)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(byte[] arr_b) {
        this.a();
        this.c.add(arr_b);
        ++this.modCount;
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean addAll(int v, Collection collection0) {
        this.a();
        if(collection0 instanceof LazyStringList) {
            collection0 = ((LazyStringList)collection0).getUnderlyingElements();
        }
        boolean z = this.c.addAll(v, collection0);
        ++this.modCount;
        return z;
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean addAll(Collection collection0) {
        return this.addAll(this.size(), collection0);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(Collection collection0) {
        this.a();
        boolean z = this.c.addAll(collection0);
        ++this.modCount;
        return z;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteString(Collection collection0) {
        this.a();
        boolean z = this.c.addAll(collection0);
        ++this.modCount;
        return z;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public List asByteArrayList() {
        return new ByteArrayListView(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.ProtocolStringList
    public List asByteStringList() {
        return new ByteStringListView(this);
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public void clear() {
        this.a();
        this.c.clear();
        ++this.modCount;
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean equals(Object object0) {
        return super.equals(object0);
    }

    @Override
    public Object get(int v) {
        return this.q(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int v) {
        Object object0 = this.c.get(v);
        byte[] arr_b = LazyStringArrayList.m(object0);
        if(arr_b != object0) {
            this.c.set(v, arr_b);
        }
        return arr_b;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public ByteString getByteString(int v) {
        Object object0 = this.c.get(v);
        ByteString byteString0 = LazyStringArrayList.n(object0);
        if(byteString0 != object0) {
            this.c.set(v, byteString0);
        }
        return byteString0;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public Object getRaw(int v) {
        return this.c.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public List getUnderlyingElements() {
        return DesugarCollections.unmodifiableList(this.c);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this.isModifiable() ? new UnmodifiableLazyStringList(this) : this;
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public int hashCode() {
        return super.hashCode();
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void i1(ByteString byteString0) {
        this.a();
        this.c.add(byteString0);
        ++this.modCount;
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean isModifiable() {
        return super.isModifiable();
    }

    private void j(int v, ByteString byteString0) {
        this.a();
        this.c.add(v, byteString0);
        ++this.modCount;
    }

    public void k(int v, String s) {
        this.a();
        this.c.add(v, s);
        ++this.modCount;
    }

    private void l(int v, byte[] arr_b) {
        this.a();
        this.c.add(v, arr_b);
        ++this.modCount;
    }

    private static byte[] m(Object object0) {
        if(object0 instanceof byte[]) {
            return (byte[])object0;
        }
        return object0 instanceof String ? Internal.y(((String)object0)) : ((ByteString)object0).W();
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$ProtobufList
    public ProtobufList mutableCopyWithCapacity(int v) {
        return this.r(v);
    }

    private static ByteString n(Object object0) {
        if(object0 instanceof ByteString) {
            return (ByteString)object0;
        }
        return object0 instanceof String ? ByteString.r(((String)object0)) : ByteString.p(((byte[])object0));
    }

    private static String o(Object object0) {
        if(object0 instanceof String) {
            return (String)object0;
        }
        return object0 instanceof ByteString ? ((ByteString)object0).b0() : Internal.z(((byte[])object0));
    }

    static LazyStringArrayList p() {
        return LazyStringArrayList.d;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void p2(int v, ByteString byteString0) {
        this.v(v, byteString0);
    }

    public String q(int v) {
        Object object0 = this.c.get(v);
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof ByteString) {
            String s = ((ByteString)object0).b0();
            if(((ByteString)object0).E()) {
                this.c.set(v, s);
            }
            return s;
        }
        String s1 = Internal.z(((byte[])object0));
        if(Internal.u(((byte[])object0))) {
            this.c.set(v, s1);
        }
        return s1;
    }

    public LazyStringArrayList r(int v) {
        if(v < this.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList0 = new ArrayList(v);
        arrayList0.addAll(this.c);
        return new LazyStringArrayList(arrayList0);
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public Object remove(int v) {
        return this.t(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean remove(Object object0) {
        return super.remove(object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean removeAll(Collection collection0) {
        return super.removeAll(collection0);
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean retainAll(Collection collection0) {
        return super.retainAll(collection0);
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public Object set(int v, Object object0) {
        return this.u(v, ((String)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int v, byte[] arr_b) {
        this.x(v, arr_b);
    }

    @Override
    public int size() {
        return this.c.size();
    }

    public String t(int v) {
        this.a();
        Object object0 = this.c.remove(v);
        ++this.modCount;
        return LazyStringArrayList.o(object0);
    }

    public String u(int v, String s) {
        this.a();
        return LazyStringArrayList.o(this.c.set(v, s));
    }

    private Object v(int v, ByteString byteString0) {
        this.a();
        return this.c.set(v, byteString0);
    }

    private Object x(int v, byte[] arr_b) {
        this.a();
        return this.c.set(v, arr_b);
    }
}

