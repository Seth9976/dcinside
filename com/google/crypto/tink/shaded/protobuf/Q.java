package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class q extends c implements k1, a, RandomAccess {
    private boolean[] c;
    private int d;
    private static final q e;

    static {
        q q0 = new q(new boolean[0], 0);
        q.e = q0;
        q0.makeImmutable();
    }

    q() {
        this(new boolean[10], 0);
    }

    private q(boolean[] arr_z, int v) {
        this.c = arr_z;
        this.d = v;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public void add(int v, Object object0) {
        this.b(v, ((Boolean)object0));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public boolean add(Object object0) {
        return this.c(((Boolean)object0));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public boolean addAll(Collection collection0) {
        this.a();
        t0.d(collection0);
        if(!(collection0 instanceof q)) {
            return super.addAll(collection0);
        }
        int v = ((q)collection0).d;
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
        System.arraycopy(((q)collection0).c, 0, this.c, this.d, ((q)collection0).d);
        this.d = v2;
        ++this.modCount;
        return true;
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$a
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

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
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

    @Override  // com.google.crypto.tink.shaded.protobuf.c
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q)) {
            return super.equals(object0);
        }
        if(this.d != ((q)object0).d) {
            return false;
        }
        boolean[] arr_z = ((q)object0).c;
        for(int v = 0; v < this.d; ++v) {
            if(this.c[v] != arr_z[v]) {
                return false;
            }
        }
        return true;
    }

    public static q g() {
        return q.e;
    }

    @Override
    public Object get(int v) {
        return this.i(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$a
    public boolean getBoolean(int v) {
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
            v = v * 0x1F + t0.k(this.c[v1]);
        }
        return v;
    }

    public Boolean i(int v) {
        return Boolean.valueOf(this.getBoolean(v));
    }

    @Override
    public int indexOf(Object object0) {
        if(!(object0 instanceof Boolean)) {
            return -1;
        }
        boolean z = ((Boolean)object0).booleanValue();
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.c[v1] == z) {
                return v1;
            }
        }
        return -1;
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

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$a
    public a mutableCopyWithCapacity(int v) {
        if(v < this.d) {
            throw new IllegalArgumentException();
        }
        return new q(Arrays.copyOf(this.c, v), this.d);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$a, com.google.crypto.tink.shaded.protobuf.t0$k
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
        return this.l(v, ((Boolean)object0));
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$a
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

