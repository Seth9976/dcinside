package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class h0 extends c implements k1, f, RandomAccess {
    private float[] c;
    private int d;
    private static final h0 e;

    static {
        h0 h00 = new h0(new float[0], 0);
        h0.e = h00;
        h00.makeImmutable();
    }

    h0() {
        this(new float[10], 0);
    }

    private h0(float[] arr_f, int v) {
        this.c = arr_f;
        this.d = v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public void add(int v, Object object0) {
        this.b(v, ((Float)object0));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public boolean add(Object object0) {
        return this.c(((Float)object0));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public boolean addAll(Collection collection0) {
        this.a();
        t0.d(collection0);
        if(!(collection0 instanceof h0)) {
            return super.addAll(collection0);
        }
        int v = ((h0)collection0).d;
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
        System.arraycopy(((h0)collection0).c, 0, this.c, this.d, ((h0)collection0).d);
        this.d = v2;
        ++this.modCount;
        return true;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$f
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

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
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

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h0)) {
            return super.equals(object0);
        }
        if(this.d != ((h0)object0).d) {
            return false;
        }
        float[] arr_f = ((h0)object0).c;
        for(int v = 0; v < this.d; ++v) {
            if(Float.floatToIntBits(this.c[v]) != Float.floatToIntBits(arr_f[v])) {
                return false;
            }
        }
        return true;
    }

    public static h0 g() {
        return h0.e;
    }

    @Override
    public Object get(int v) {
        return this.i(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$f
    public float getFloat(int v) {
        this.h(v);
        return this.c[v];
    }

    private void h(int v) {
        if(v < 0 || v >= this.d) {
            throw new IndexOutOfBoundsException(this.j(v));
        }
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c
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

    @Override
    public int indexOf(Object object0) {
        if(!(object0 instanceof Float)) {
            return -1;
        }
        float f = (float)(((Float)object0));
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.c[v1] == f) {
                return v1;
            }
        }
        return -1;
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

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$f
    public f mutableCopyWithCapacity(int v) {
        if(v < this.d) {
            throw new IllegalArgumentException();
        }
        return new h0(Arrays.copyOf(this.c, v), this.d);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$f, com.google.crypto.tink.shaded.protobuf.t0$k
    public k mutableCopyWithCapacity(int v) {
        return this.mutableCopyWithCapacity(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public Object remove(int v) {
        return this.k(v);
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

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public Object set(int v, Object object0) {
        return this.l(v, ((Float)object0));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$f
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

