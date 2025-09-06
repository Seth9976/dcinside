package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class DoubleArrayList extends AbstractProtobufList implements DoubleList, PrimitiveNonBoxingCollection, RandomAccess {
    private double[] c;
    private int d;
    private static final DoubleArrayList e;

    static {
        DoubleArrayList doubleArrayList0 = new DoubleArrayList(new double[0], 0);
        DoubleArrayList.e = doubleArrayList0;
        doubleArrayList0.makeImmutable();
    }

    DoubleArrayList() {
        this(new double[10], 0);
    }

    private DoubleArrayList(double[] arr_f, int v) {
        this.c = arr_f;
        this.d = v;
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public void add(int v, Object object0) {
        this.b(v, ((Double)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean add(Object object0) {
        return this.c(((Double)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean addAll(Collection collection0) {
        this.a();
        Internal.d(collection0);
        if(!(collection0 instanceof DoubleArrayList)) {
            return super.addAll(collection0);
        }
        int v = ((DoubleArrayList)collection0).d;
        if(v == 0) {
            return false;
        }
        int v1 = this.d;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        double[] arr_f = this.c;
        if(v2 > arr_f.length) {
            this.c = Arrays.copyOf(arr_f, v2);
        }
        System.arraycopy(((DoubleArrayList)collection0).c, 0, this.c, this.d, ((DoubleArrayList)collection0).d);
        this.d = v2;
        ++this.modCount;
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$DoubleList
    public void addDouble(double f) {
        this.a();
        int v = this.d;
        double[] arr_f = this.c;
        if(v == arr_f.length) {
            double[] arr_f1 = new double[v * 3 / 2 + 1];
            System.arraycopy(arr_f, 0, arr_f1, 0, v);
            this.c = arr_f1;
        }
        int v1 = this.d;
        this.d = v1 + 1;
        this.c[v1] = f;
    }

    public void b(int v, Double double0) {
        this.d(v, ((double)double0));
    }

    public boolean c(Double double0) {
        this.addDouble(((double)double0));
        return true;
    }

    private void d(int v, double f) {
        this.a();
        if(v >= 0) {
            int v1 = this.d;
            if(v <= v1) {
                double[] arr_f = this.c;
                if(v1 < arr_f.length) {
                    System.arraycopy(arr_f, v, arr_f, v + 1, v1 - v);
                }
                else {
                    double[] arr_f1 = new double[v1 * 3 / 2 + 1];
                    System.arraycopy(arr_f, 0, arr_f1, 0, v);
                    System.arraycopy(this.c, v, arr_f1, v + 1, this.d - v);
                    this.c = arr_f1;
                }
                this.c[v] = f;
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
        if(!(object0 instanceof DoubleArrayList)) {
            return super.equals(object0);
        }
        if(this.d != ((DoubleArrayList)object0).d) {
            return false;
        }
        double[] arr_f = ((DoubleArrayList)object0).c;
        for(int v = 0; v < this.d; ++v) {
            if(Double.doubleToLongBits(this.c[v]) != Double.doubleToLongBits(arr_f[v])) {
                return false;
            }
        }
        return true;
    }

    public static DoubleArrayList g() {
        return DoubleArrayList.e;
    }

    @Override
    public Object get(int v) {
        return this.i(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$DoubleList
    public double getDouble(int v) {
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
            v = v * 0x1F + Internal.s(Double.doubleToLongBits(this.c[v1]));
        }
        return v;
    }

    public Double i(int v) {
        return this.getDouble(v);
    }

    private String j(int v) {
        return "Index:" + v + ", Size:" + this.d;
    }

    public Double k(int v) {
        this.a();
        this.h(v);
        double[] arr_f = this.c;
        double f = arr_f[v];
        int v1 = this.d;
        if(v < v1 - 1) {
            System.arraycopy(arr_f, v + 1, arr_f, v, v1 - v - 1);
        }
        --this.d;
        ++this.modCount;
        return f;
    }

    public Double l(int v, Double double0) {
        return this.setDouble(v, ((double)double0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$DoubleList
    public DoubleList mutableCopyWithCapacity(int v) {
        if(v < this.d) {
            throw new IllegalArgumentException();
        }
        return new DoubleArrayList(Arrays.copyOf(this.c, v), this.d);
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
            if(object0.equals(((double)this.c[v]))) {
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
        return this.l(v, ((Double)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$DoubleList
    public double setDouble(int v, double f) {
        this.a();
        this.h(v);
        double[] arr_f = this.c;
        double f1 = arr_f[v];
        arr_f[v] = f;
        return f1;
    }

    @Override
    public int size() {
        return this.d;
    }
}

