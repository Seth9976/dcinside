package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class LongArrayList extends AbstractProtobufList implements LongList, PrimitiveNonBoxingCollection, RandomAccess {
    private long[] c;
    private int d;
    private static final LongArrayList e;

    static {
        LongArrayList longArrayList0 = new LongArrayList(new long[0], 0);
        LongArrayList.e = longArrayList0;
        longArrayList0.makeImmutable();
    }

    LongArrayList() {
        this(new long[10], 0);
    }

    private LongArrayList(long[] arr_v, int v) {
        this.c = arr_v;
        this.d = v;
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public void add(int v, Object object0) {
        this.b(v, ((Long)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean add(Object object0) {
        return this.c(((Long)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean addAll(Collection collection0) {
        this.a();
        Internal.d(collection0);
        if(!(collection0 instanceof LongArrayList)) {
            return super.addAll(collection0);
        }
        int v = ((LongArrayList)collection0).d;
        if(v == 0) {
            return false;
        }
        int v1 = this.d;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        long[] arr_v = this.c;
        if(v2 > arr_v.length) {
            this.c = Arrays.copyOf(arr_v, v2);
        }
        System.arraycopy(((LongArrayList)collection0).c, 0, this.c, this.d, ((LongArrayList)collection0).d);
        this.d = v2;
        ++this.modCount;
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$LongList
    public void addLong(long v) {
        this.a();
        int v1 = this.d;
        long[] arr_v = this.c;
        if(v1 == arr_v.length) {
            long[] arr_v1 = new long[v1 * 3 / 2 + 1];
            System.arraycopy(arr_v, 0, arr_v1, 0, v1);
            this.c = arr_v1;
        }
        int v2 = this.d;
        this.d = v2 + 1;
        this.c[v2] = v;
    }

    public void b(int v, Long long0) {
        this.d(v, ((long)long0));
    }

    public boolean c(Long long0) {
        this.addLong(((long)long0));
        return true;
    }

    private void d(int v, long v1) {
        this.a();
        if(v >= 0) {
            int v2 = this.d;
            if(v <= v2) {
                long[] arr_v = this.c;
                if(v2 < arr_v.length) {
                    System.arraycopy(arr_v, v, arr_v, v + 1, v2 - v);
                }
                else {
                    long[] arr_v1 = new long[v2 * 3 / 2 + 1];
                    System.arraycopy(arr_v, 0, arr_v1, 0, v);
                    System.arraycopy(this.c, v, arr_v1, v + 1, this.d - v);
                    this.c = arr_v1;
                }
                this.c[v] = v1;
                ++this.d;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.j(v));
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LongArrayList)) {
            return super.equals(object0);
        }
        if(this.d != ((LongArrayList)object0).d) {
            return false;
        }
        long[] arr_v = ((LongArrayList)object0).c;
        for(int v = 0; v < this.d; ++v) {
            if(this.c[v] != arr_v[v]) {
                return false;
            }
        }
        return true;
    }

    public static LongArrayList g() {
        return LongArrayList.e;
    }

    @Override
    public Object get(int v) {
        return this.i(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$LongList
    public long getLong(int v) {
        this.h(v);
        return this.c[v];
    }

    private void h(int v) {
        if(v < 0 || v >= this.d) {
            throw new IndexOutOfBoundsException(this.j(v));
        }
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.d; ++v1) {
            v = v * 0x1F + Internal.s(this.c[v1]);
        }
        return v;
    }

    public Long i(int v) {
        return this.getLong(v);
    }

    private String j(int v) {
        return "Index:" + v + ", Size:" + this.d;
    }

    public Long k(int v) {
        this.a();
        this.h(v);
        long[] arr_v = this.c;
        long v1 = arr_v[v];
        int v2 = this.d;
        if(v < v2 - 1) {
            System.arraycopy(arr_v, v + 1, arr_v, v, v2 - v - 1);
        }
        --this.d;
        ++this.modCount;
        return v1;
    }

    public Long l(int v, Long long0) {
        return this.setLong(v, ((long)long0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$LongList
    public LongList mutableCopyWithCapacity(int v) {
        if(v < this.d) {
            throw new IllegalArgumentException();
        }
        return new LongArrayList(Arrays.copyOf(this.c, v), this.d);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$ProtobufList
    public ProtobufList mutableCopyWithCapacity(int v) {
        return this.mutableCopyWithCapacity(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public Object remove(int v) {
        return this.k(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean remove(Object object0) {
        this.a();
        for(int v = 0; v < this.d; ++v) {
            if(object0.equals(((long)this.c[v]))) {
                System.arraycopy(this.c, v + 1, this.c, v, this.d - v - 1);
                --this.d;
                ++this.modCount;
                return true;
            }
        }
        return false;
    }

    @Override
    protected void removeRange(int v, int v1) {
        this.a();
        if(v1 < v) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.c, v1, this.c, v, this.d - v1);
        this.d -= v1 - v;
        ++this.modCount;
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public Object set(int v, Object object0) {
        return this.l(v, ((Long)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$LongList
    public long setLong(int v, long v1) {
        this.a();
        this.h(v);
        long[] arr_v = this.c;
        long v2 = arr_v[v];
        arr_v[v] = v1;
        return v2;
    }

    @Override
    public int size() {
        return this.d;
    }
}

