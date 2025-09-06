package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class t extends a implements FloatList, W, RandomAccess {
    private static final t EMPTY_LIST;
    private float[] array;
    private int size;

    static {
        t.EMPTY_LIST = new t(new float[0], 0, false);
    }

    t() {
        this(new float[10], 0, true);
    }

    private t(float[] arr_f, int v, boolean z) {
        super(z);
        this.array = arr_f;
        this.size = v;
    }

    public void add(int v, Float float0) {
        this.addFloat(v, ((float)float0));
    }

    @Override  // com.google.protobuf.a
    public void add(int v, Object object0) {
        this.add(v, ((Float)object0));
    }

    public boolean add(Float float0) {
        this.addFloat(((float)float0));
        return true;
    }

    @Override  // com.google.protobuf.a
    public boolean add(Object object0) {
        return this.add(((Float)object0));
    }

    @Override  // com.google.protobuf.a
    public boolean addAll(Collection collection0) {
        this.ensureIsMutable();
        Internal.checkNotNull(collection0);
        if(!(collection0 instanceof t)) {
            return super.addAll(collection0);
        }
        int v = ((t)collection0).size;
        if(v == 0) {
            return false;
        }
        int v1 = this.size;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        float[] arr_f = this.array;
        if(v2 > arr_f.length) {
            this.array = Arrays.copyOf(arr_f, v2);
        }
        System.arraycopy(((t)collection0).array, 0, this.array, this.size, ((t)collection0).size);
        this.size = v2;
        ++this.modCount;
        return true;
    }

    private void addFloat(int v, float f) {
        this.ensureIsMutable();
        if(v >= 0) {
            int v1 = this.size;
            if(v <= v1) {
                float[] arr_f = this.array;
                if(v1 < arr_f.length) {
                    System.arraycopy(arr_f, v, arr_f, v + 1, v1 - v);
                }
                else {
                    float[] arr_f1 = new float[v1 * 3 / 2 + 1];
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

    @Override  // com.google.protobuf.Internal$FloatList
    public void addFloat(float f) {
        this.ensureIsMutable();
        int v = this.size;
        float[] arr_f = this.array;
        if(v == arr_f.length) {
            float[] arr_f1 = new float[v * 3 / 2 + 1];
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

    public static t emptyList() {
        return t.EMPTY_LIST;
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
        if(!(object0 instanceof t)) {
            return super.equals(object0);
        }
        if(this.size != ((t)object0).size) {
            return false;
        }
        float[] arr_f = ((t)object0).array;
        for(int v = 0; v < this.size; ++v) {
            if(Float.floatToIntBits(this.array[v]) != Float.floatToIntBits(arr_f[v])) {
                return false;
            }
        }
        return true;
    }

    public Float get(int v) {
        return this.getFloat(v);
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    @Override  // com.google.protobuf.Internal$FloatList
    public float getFloat(int v) {
        this.ensureIndexInRange(v);
        return this.array[v];
    }

    @Override  // com.google.protobuf.a
    public int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.size; ++v1) {
            v = v * 0x1F + Float.floatToIntBits(this.array[v1]);
        }
        return v;
    }

    @Override
    public int indexOf(Object object0) {
        if(!(object0 instanceof Float)) {
            return -1;
        }
        float f = (float)(((Float)object0));
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

    @Override  // com.google.protobuf.Internal$FloatList
    public FloatList mutableCopyWithCapacity(int v) {
        if(v < this.size) {
            throw new IllegalArgumentException();
        }
        return new t(Arrays.copyOf(this.array, v), this.size, true);
    }

    @Override  // com.google.protobuf.Internal$FloatList, com.google.protobuf.Internal$ProtobufList
    public ProtobufList mutableCopyWithCapacity(int v) {
        return this.mutableCopyWithCapacity(v);
    }

    public Float remove(int v) {
        this.ensureIsMutable();
        this.ensureIndexInRange(v);
        float[] arr_f = this.array;
        float f = arr_f[v];
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

    public Float set(int v, Float float0) {
        return this.setFloat(v, ((float)float0));
    }

    @Override  // com.google.protobuf.a
    public Object set(int v, Object object0) {
        return this.set(v, ((Float)object0));
    }

    @Override  // com.google.protobuf.Internal$FloatList
    public float setFloat(int v, float f) {
        this.ensureIsMutable();
        this.ensureIndexInRange(v);
        float[] arr_f = this.array;
        float f1 = arr_f[v];
        arr_f[v] = f;
        return f1;
    }

    @Override
    public int size() {
        return this.size;
    }
}

