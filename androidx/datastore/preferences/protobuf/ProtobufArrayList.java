package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

final class ProtobufArrayList extends AbstractProtobufList implements RandomAccess {
    private Object[] c;
    private int d;
    private static final ProtobufArrayList e;

    static {
        ProtobufArrayList protobufArrayList0 = new ProtobufArrayList(new Object[0], 0);
        ProtobufArrayList.e = protobufArrayList0;
        protobufArrayList0.makeImmutable();
    }

    ProtobufArrayList() {
        this(new Object[10], 0);
    }

    private ProtobufArrayList(Object[] arr_object, int v) {
        this.c = arr_object;
        this.d = v;
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public void add(int v, Object object0) {
        this.a();
        if(v >= 0) {
            int v1 = this.d;
            if(v <= v1) {
                Object[] arr_object = this.c;
                if(v1 < arr_object.length) {
                    System.arraycopy(arr_object, v, arr_object, v + 1, v1 - v);
                }
                else {
                    Object[] arr_object1 = ProtobufArrayList.b(v1 * 3 / 2 + 1);
                    System.arraycopy(this.c, 0, arr_object1, 0, v);
                    System.arraycopy(this.c, v, arr_object1, v + 1, this.d - v);
                    this.c = arr_object1;
                }
                this.c[v] = object0;
                ++this.d;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.g(v));
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean add(Object object0) {
        this.a();
        int v = this.d;
        Object[] arr_object = this.c;
        if(v == arr_object.length) {
            this.c = Arrays.copyOf(arr_object, v * 3 / 2 + 1);
        }
        int v1 = this.d;
        this.d = v1 + 1;
        this.c[v1] = object0;
        ++this.modCount;
        return true;
    }

    private static Object[] b(int v) {
        return new Object[v];
    }

    public static ProtobufArrayList c() {
        return ProtobufArrayList.e;
    }

    private void d(int v) {
        if(v < 0 || v >= this.d) {
            throw new IndexOutOfBoundsException(this.g(v));
        }
    }

    private String g(int v) {
        return "Index:" + v + ", Size:" + this.d;
    }

    @Override
    public Object get(int v) {
        this.d(v);
        return this.c[v];
    }

    public ProtobufArrayList h(int v) {
        if(v < this.d) {
            throw new IllegalArgumentException();
        }
        return new ProtobufArrayList(Arrays.copyOf(this.c, v), this.d);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$ProtobufList
    public ProtobufList mutableCopyWithCapacity(int v) {
        return this.h(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public Object remove(int v) {
        this.a();
        this.d(v);
        Object[] arr_object = this.c;
        Object object0 = arr_object[v];
        int v1 = this.d;
        if(v < v1 - 1) {
            System.arraycopy(arr_object, v + 1, arr_object, v, v1 - v - 1);
        }
        --this.d;
        ++this.modCount;
        return object0;
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public Object set(int v, Object object0) {
        this.a();
        this.d(v);
        Object[] arr_object = this.c;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        ++this.modCount;
        return object1;
    }

    @Override
    public int size() {
        return this.d;
    }
}

