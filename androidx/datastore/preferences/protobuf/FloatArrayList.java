package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class FloatArrayList extends AbstractProtobufList implements FloatList, PrimitiveNonBoxingCollection, RandomAccess {
    private float[] c;
    private int d;
    private static final FloatArrayList e;

    static {
        FloatArrayList floatArrayList0 = new FloatArrayList(new float[0], 0);
        FloatArrayList.e = floatArrayList0;
        floatArrayList0.makeImmutable();
    }

    FloatArrayList() {
        this(new float[10], 0);
    }

    private FloatArrayList(float[] arr_f, int v) {
        this.c = arr_f;
        this.d = v;
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public void add(int v, Object object0) {
        this.b(v, ((Float)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean add(Object object0) {
        return this.c(((Float)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.AbstractProtobufList
    public boolean addAll(Collection collection0) {
        this.a();
        Internal.d(collection0);
        if(!(collection0 instanceof FloatArrayList)) {
            return super.addAll(collection0);
        }
        int v = ((FloatArrayList)collection0).d;
        if(v == 0) {
            return false;
        }
        int v1 = this.d;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        float[] arr_f = this.c;
        if(v2 > arr_f.length) {
            this.c = Arrays.copyOf(arr_f, v2);
        }
        System.arraycopy(((FloatArrayList)collection0).c, 0, this.c, this.d, ((FloatArrayList)collection0).d);
        this.d = v2;
        ++this.modCount;
        return true;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$FloatList
    public void addFloat(float f) {
        this.a();
        int v = this.d;
        float[] arr_f = this.c;
        if(v == arr_f.length) {
            float[] arr_f1 = new float[v * 3 / 2 + 1];
            System.arraycopy(arr_f, 0, arr_f1, 0, v);
            this.c = arr_f1;
        }
        int v1 = this.d;
        this.d = v1 + 1;
        this.c[v1] = f;
    }

    public void b(int v, Float float0) {
        this.d(v, ((float)float0));
    }

    public boolean c(Float float0) {
        this.addFloat(((float)float0));
        return true;
    }

    private void d(int v, float f) {
        this.a();
        if(v >= 0) {
            int v1 = this.d;
            if(v <= v1) {
                float[] arr_f = this.c;
                if(v1 < arr_f.length) {
                    System.arraycopy(arr_f, v, arr_f, v + 1, v1 - v);
                }
                else {
                    float[] arr_f1 = new float[v1 * 3 / 2 + 1];
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
        if(!(object0 instanceof FloatArrayList)) {
            return super.equals(object0);
        }
        if(this.d != ((FloatArrayList)object0).d) {
            return false;
        }
        float[] arr_f = ((FloatArrayList)object0).c;
        for(int v = 0; v < this.d; ++v) {
            if(Float.floatToIntBits(this.c[v]) != Float.floatToIntBits(arr_f[v])) {
                return false;
            }
        }
        return true;
    }

    public static FloatArrayList g() {
        return FloatArrayList.e;
    }

    @Override
    public Object get(int v) {
        return this.i(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$FloatList
    public float getFloat(int v) {
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
            v = v * 0x1F + Float.floatToIntBits(this.c[v1]);
        }
        return v;
    }

    public Float i(int v) {
        return this.getFloat(v);
    }

    private String j(int v) {
        return "Index:" + v + ", Size:" + this.d;
    }

    public Float k(int v) {
        this.a();
        this.h(v);
        float[] arr_f = this.c;
        float f = arr_f[v];
        int v1 = this.d;
        if(v < v1 - 1) {
            System.arraycopy(arr_f, v + 1, arr_f, v, v1 - v - 1);
        }
        --this.d;
        ++this.modCount;
        return f;
    }

    public Float l(int v, Float float0) {
        return this.setFloat(v, ((float)float0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$FloatList
    public FloatList mutableCopyWithCapacity(int v) {
        if(v < this.d) {
            throw new IllegalArgumentException();
        }
        return new FloatArrayList(Arrays.copyOf(this.c, v), this.d);
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
            if(object0.equals(((float)this.c[v]))) {
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
        return this.l(v, ((Float)object0));
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$FloatList
    public float setFloat(int v, float f) {
        this.a();
        this.h(v);
        float[] arr_f = this.c;
        float f1 = arr_f[v];
        arr_f[v] = f;
        return f1;
    }

    @Override
    public int size() {
        return this.d;
    }
}

