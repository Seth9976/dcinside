package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class o extends a implements DoubleList, W, RandomAccess {
    private static final o EMPTY_LIST;
    private double[] array;
    private int size;

    static {
        o.EMPTY_LIST = new o(new double[0], 0, false);
    }

    o() {
        this(new double[10], 0, true);
    }

    private o(double[] arr_f, int v, boolean z) {
        super(z);
        this.array = arr_f;
        this.size = v;
    }

    public void add(int v, Double double0) {
        this.addDouble(v, ((double)double0));
    }

    @Override  // com.google.protobuf.a
    public void add(int v, Object object0) {
        this.add(v, ((Double)object0));
    }

    public boolean add(Double double0) {
        this.addDouble(((double)double0));
        return true;
    }

    @Override  // com.google.protobuf.a
    public boolean add(Object object0) {
        return this.add(((Double)object0));
    }

    @Override  // com.google.protobuf.a
    public boolean addAll(Collection collection0) {
        this.ensureIsMutable();
        Internal.checkNotNull(collection0);
        if(!(collection0 instanceof o)) {
            return super.addAll(collection0);
        }
        int v = ((o)collection0).size;
        if(v == 0) {
            return false;
        }
        int v1 = this.size;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        double[] arr_f = this.array;
        if(v2 > arr_f.length) {
            this.array = Arrays.copyOf(arr_f, v2);
        }
        System.arraycopy(((o)collection0).array, 0, this.array, this.size, ((o)collection0).size);
        this.size = v2;
        ++this.modCount;
        return true;
    }

    private void addDouble(int v, double f) {
        this.ensureIsMutable();
        if(v >= 0) {
            int v1 = this.size;
            if(v <= v1) {
                double[] arr_f = this.array;
                if(v1 < arr_f.length) {
                    System.arraycopy(arr_f, v, arr_f, v + 1, v1 - v);
                }
                else {
                    double[] arr_f1 = new double[v1 * 3 / 2 + 1];
                    System.arraycopy(arr_f, 0, arr_f1, 0, v);
                    System.arraycopy(this.array, v, arr_f1, v + 1, this.size - v);
                    this.array = arr_f1;
                }
                this.array[v] = f;
                ++this.size;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.makeOutOfBoundsExceptionMessage(v));
    }

    @Override  // com.google.protobuf.Internal$DoubleList
    public void addDouble(double f) {
        this.ensureIsMutable();
        int v = this.size;
        double[] arr_f = this.array;
        if(v == arr_f.length) {
            double[] arr_f1 = new double[v * 3 / 2 + 1];
            System.arraycopy(arr_f, 0, arr_f1, 0, v);
            this.array = arr_f1;
        }
        int v1 = this.size;
        this.size = v1 + 1;
        this.array[v1] = f;
    }

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    public static o emptyList() {
        return o.EMPTY_LIST;
    }

    private void ensureIndexInRange(int v) {
        if(v < 0 || v >= this.size) {
            throw new IndexOutOfBoundsException(this.makeOutOfBoundsExceptionMessage(v));
        }
    }

    @Override  // com.google.protobuf.a
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o)) {
            return super.equals(object0);
        }
        if(this.size != ((o)object0).size) {
            return false;
        }
        double[] arr_f = ((o)object0).array;
        for(int v = 0; v < this.size; ++v) {
            if(Double.doubleToLongBits(this.array[v]) != Double.doubleToLongBits(arr_f[v])) {
                return false;
            }
        }
        return true;
    }

    public Double get(int v) {
        return this.getDouble(v);
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    @Override  // com.google.protobuf.Internal$DoubleList
    public double getDouble(int v) {
        this.ensureIndexInRange(v);
        return this.array[v];
    }

    @Override  // com.google.protobuf.a
    public int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.size; ++v1) {
            v = v * 0x1F + Internal.hashLong(Double.doubleToLongBits(this.array[v1]));
        }
        return v;
    }

    @Override
    public int indexOf(Object object0) {
        if(!(object0 instanceof Double)) {
            return -1;
        }
        double f = (double)(((Double)object0));
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.array[v1] == f) {
                return v1;
            }
        }
        return -1;
    }

    private String makeOutOfBoundsExceptionMessage(int v) {
        return "Index:" + v + ", Size:" + this.size;
    }

    @Override  // com.google.protobuf.Internal$DoubleList
    public DoubleList mutableCopyWithCapacity(int v) {
        if(v < this.size) {
            throw new IllegalArgumentException();
        }
        return new o(Arrays.copyOf(this.array, v), this.size, true);
    }

    @Override  // com.google.protobuf.Internal$DoubleList, com.google.protobuf.Internal$ProtobufList
    public ProtobufList mutableCopyWithCapacity(int v) {
        return this.mutableCopyWithCapacity(v);
    }

    public Double remove(int v) {
        this.ensureIsMutable();
        this.ensureIndexInRange(v);
        double[] arr_f = this.array;
        double f = arr_f[v];
        int v1 = this.size;
        if(v < v1 - 1) {
            System.arraycopy(arr_f, v + 1, arr_f, v, v1 - v - 1);
        }
        --this.size;
        ++this.modCount;
        return f;
    }

    @Override  // com.google.protobuf.a
    public Object remove(int v) {
        return this.remove(v);
    }

    @Override
    protected void removeRange(int v, int v1) {
        this.ensureIsMutable();
        if(v1 < v) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.array, v1, this.array, v, this.size - v1);
        this.size -= v1 - v;
        ++this.modCount;
    }

    public Double set(int v, Double double0) {
        return this.setDouble(v, ((double)double0));
    }

    @Override  // com.google.protobuf.a
    public Object set(int v, Object object0) {
        return this.set(v, ((Double)object0));
    }

    @Override  // com.google.protobuf.Internal$DoubleList
    public double setDouble(int v, double f) {
        this.ensureIsMutable();
        this.ensureIndexInRange(v);
        double[] arr_f = this.array;
        double f1 = arr_f[v];
        arr_f[v] = f;
        return f1;
    }

    @Override
    public int size() {
        return this.size;
    }
}

