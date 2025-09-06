package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class BooleanArrayList extends AbstractProtobufList implements BooleanList, PrimitiveNonBoxingCollection, RandomAccess {
    private boolean[] c;
    private int d;
    private static final BooleanArrayList e;

    static {
        BooleanArrayList booleanArrayList0 = new BooleanArrayList(new boolean[0], 0);
        BooleanArrayList.e = booleanArrayList0;
        booleanArrayList0.makeImmutable();
    }

    BooleanArrayList() {
        this(new boolean[10], 0);
    }

    private BooleanArrayList(boolean[] arr_z, int v) {
        this.c = arr_z;
        this.d = v;
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public void add(int v, Object object0) {
        this.b(v, ((Boolean)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean add(Object object0) {
        return this.c(((Boolean)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean addAll(Collection collection0) {
        this.a();
        Internal.d(collection0);
        if(!(collection0 instanceof BooleanArrayList)) {
            return super.addAll(collection0);
        }
        int v = ((BooleanArrayList)collection0).d;
        if(v == 0) {
            return false;
        }
        int v1 = this.d;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        boolean[] arr_z = this.c;
        if(v2 > arr_z.length) {
            this.c = Arrays.copyOf(arr_z, v2);
        }
        System.arraycopy(((BooleanArrayList)collection0).c, 0, this.c, this.d, ((BooleanArrayList)collection0).d);
        this.d = v2;
        ++this.modCount;
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$BooleanList
    public void addBoolean(boolean z) {
        this.a();
        int v = this.d;
        boolean[] arr_z = this.c;
        if(v == arr_z.length) {
            boolean[] arr_z1 = new boolean[v * 3 / 2 + 1];
            System.arraycopy(arr_z, 0, arr_z1, 0, v);
            this.c = arr_z1;
        }
        int v1 = this.d;
        this.d = v1 + 1;
        this.c[v1] = z;
    }

    public void b(int v, Boolean boolean0) {
        this.d(v, boolean0.booleanValue());
    }

    public boolean c(Boolean boolean0) {
        this.addBoolean(boolean0.booleanValue());
        return true;
    }

    private void d(int v, boolean z) {
        this.a();
        if(v >= 0) {
            int v1 = this.d;
            if(v <= v1) {
                boolean[] arr_z = this.c;
                if(v1 < arr_z.length) {
                    System.arraycopy(arr_z, v, arr_z, v + 1, v1 - v);
                }
                else {
                    boolean[] arr_z1 = new boolean[v1 * 3 / 2 + 1];
                    System.arraycopy(arr_z, 0, arr_z1, 0, v);
                    System.arraycopy(this.c, v, arr_z1, v + 1, this.d - v);
                    this.c = arr_z1;
                }
                this.c[v] = z;
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
        if(!(object0 instanceof BooleanArrayList)) {
            return super.equals(object0);
        }
        if(this.d != ((BooleanArrayList)object0).d) {
            return false;
        }
        boolean[] arr_z = ((BooleanArrayList)object0).c;
        for(int v = 0; v < this.d; ++v) {
            if(this.c[v] != arr_z[v]) {
                return false;
            }
        }
        return true;
    }

    public static BooleanArrayList g() {
        return BooleanArrayList.e;
    }

    @Override
    public Object get(int v) {
        return this.i(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$BooleanList
    public boolean getBoolean(int v) {
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
            v = v * 0x1F + Internal.k(this.c[v1]);
        }
        return v;
    }

    public Boolean i(int v) {
        return Boolean.valueOf(this.getBoolean(v));
    }

    private String j(int v) {
        return "Index:" + v + ", Size:" + this.d;
    }

    public Boolean k(int v) {
        this.a();
        this.h(v);
        boolean[] arr_z = this.c;
        boolean z = arr_z[v];
        int v1 = this.d;
        if(v < v1 - 1) {
            System.arraycopy(arr_z, v + 1, arr_z, v, v1 - v - 1);
        }
        --this.d;
        ++this.modCount;
        return Boolean.valueOf(z);
    }

    public Boolean l(int v, Boolean boolean0) {
        return Boolean.valueOf(this.setBoolean(v, boolean0.booleanValue()));
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$BooleanList
    public BooleanList mutableCopyWithCapacity(int v) {
        if(v < this.d) {
            throw new IllegalArgumentException();
        }
        return new BooleanArrayList(Arrays.copyOf(this.c, v), this.d);
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
            if(object0.equals(Boolean.valueOf(this.c[v]))) {
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
        return this.l(v, ((Boolean)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$BooleanList
    public boolean setBoolean(int v, boolean z) {
        this.a();
        this.h(v);
        boolean[] arr_z = this.c;
        boolean z1 = arr_z[v];
        arr_z[v] = z;
        return z1;
    }

    @Override
    public int size() {
        return this.d;
    }
}

