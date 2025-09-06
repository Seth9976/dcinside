package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class r0 extends c implements k1, g, RandomAccess {
    private int[] c;
    private int d;
    private static final r0 e;

    static {
        r0 r00 = new r0(new int[0], 0);
        r0.e = r00;
        r00.makeImmutable();
    }

    r0() {
        this(new int[10], 0);
    }

    private r0(int[] arr_v, int v) {
        this.c = arr_v;
        this.d = v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public void add(int v, Object object0) {
        this.b(v, ((Integer)object0));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public boolean add(Object object0) {
        return this.c(((Integer)object0));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public boolean addAll(Collection collection0) {
        this.a();
        t0.d(collection0);
        if(!(collection0 instanceof r0)) {
            return super.addAll(collection0);
        }
        int v = ((r0)collection0).d;
        if(v == 0) {
            return false;
        }
        int v1 = this.d;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        int[] arr_v = this.c;
        if(v2 > arr_v.length) {
            this.c = Arrays.copyOf(arr_v, v2);
        }
        System.arraycopy(((r0)collection0).c, 0, this.c, this.d, ((r0)collection0).d);
        this.d = v2;
        ++this.modCount;
        return true;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$g
    public void addInt(int v) {
        this.a();
        int v1 = this.d;
        int[] arr_v = this.c;
        if(v1 == arr_v.length) {
            int[] arr_v1 = new int[v1 * 3 / 2 + 1];
            System.arraycopy(arr_v, 0, arr_v1, 0, v1);
            this.c = arr_v1;
        }
        int v2 = this.d;
        this.d = v2 + 1;
        this.c[v2] = v;
    }

    public void b(int v, Integer integer0) {
        this.d(v, ((int)integer0));
    }

    public boolean c(Integer integer0) {
        this.addInt(((int)integer0));
        return true;
    }

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    private void d(int v, int v1) {
        this.a();
        if(v >= 0) {
            int v2 = this.d;
            if(v <= v2) {
                int[] arr_v = this.c;
                if(v2 < arr_v.length) {
                    System.arraycopy(arr_v, v, arr_v, v + 1, v2 - v);
                }
                else {
                    int[] arr_v1 = new int[v2 * 3 / 2 + 1];
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

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r0)) {
            return super.equals(object0);
        }
        if(this.d != ((r0)object0).d) {
            return false;
        }
        int[] arr_v = ((r0)object0).c;
        for(int v = 0; v < this.d; ++v) {
            if(this.c[v] != arr_v[v]) {
                return false;
            }
        }
        return true;
    }

    public static r0 g() {
        return r0.e;
    }

    @Override
    public Object get(int v) {
        return this.i(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$g
    public int getInt(int v) {
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
            v = v * 0x1F + this.c[v1];
        }
        return v;
    }

    public Integer i(int v) {
        return this.getInt(v);
    }

    @Override
    public int indexOf(Object object0) {
        if(!(object0 instanceof Integer)) {
            return -1;
        }
        int v = (int)(((Integer)object0));
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.c[v2] == v) {
                return v2;
            }
        }
        return -1;
    }

    private String j(int v) {
        return "Index:" + v + ", Size:" + this.d;
    }

    public Integer k(int v) {
        this.a();
        this.h(v);
        int[] arr_v = this.c;
        int v1 = arr_v[v];
        int v2 = this.d;
        if(v < v2 - 1) {
            System.arraycopy(arr_v, v + 1, arr_v, v, v2 - v - 1);
        }
        --this.d;
        ++this.modCount;
        return v1;
    }

    public Integer l(int v, Integer integer0) {
        return this.setInt(v, ((int)integer0));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$g
    public g mutableCopyWithCapacity(int v) {
        if(v < this.d) {
            throw new IllegalArgumentException();
        }
        return new r0(Arrays.copyOf(this.c, v), this.d);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$g, com.google.crypto.tink.shaded.protobuf.t0$k
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
        return this.l(v, ((Integer)object0));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$g
    public int setInt(int v, int v1) {
        this.a();
        this.h(v);
        int[] arr_v = this.c;
        int v2 = arr_v[v];
        arr_v[v] = v1;
        return v2;
    }

    @Override
    public int size() {
        return this.d;
    }
}

