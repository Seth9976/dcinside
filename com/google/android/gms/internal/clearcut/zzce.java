package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzce extends zzav implements zzcn, RandomAccess {
    private int size;
    private static final zzce zzjm;
    private float[] zzjn;

    static {
        zzce zzce0 = new zzce();
        zzce.zzjm = zzce0;
        zzce0.zzv();
    }

    zzce() {
        this(new float[10], 0);
    }

    private zzce(float[] arr_f, int v) {
        this.zzjn = arr_f;
        this.size = v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final void add(int v, Object object0) {
        this.zzc(v, ((float)(((Float)object0))));
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean addAll(Collection collection0) {
        this.zzw();
        zzci.checkNotNull(collection0);
        if(!(collection0 instanceof zzce)) {
            return super.addAll(collection0);
        }
        int v = ((zzce)collection0).size;
        if(v == 0) {
            return false;
        }
        int v1 = this.size;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        float[] arr_f = this.zzjn;
        if(v2 > arr_f.length) {
            this.zzjn = Arrays.copyOf(arr_f, v2);
        }
        System.arraycopy(((zzce)collection0).zzjn, 0, this.zzjn, this.size, ((zzce)collection0).size);
        this.size = v2;
        ++this.modCount;
        return true;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzce)) {
            return super.equals(object0);
        }
        if(this.size != ((zzce)object0).size) {
            return false;
        }
        float[] arr_f = ((zzce)object0).zzjn;
        for(int v = 0; v < this.size; ++v) {
            if(this.zzjn[v] != arr_f[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        this.zzg(v);
        return (float)this.zzjn[v];
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.size; ++v1) {
            v = v * 0x1F + Float.floatToIntBits(this.zzjn[v1]);
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final Object remove(int v) {
        this.zzw();
        this.zzg(v);
        float[] arr_f = this.zzjn;
        float f = arr_f[v];
        int v1 = this.size;
        if(v < v1 - 1) {
            System.arraycopy(arr_f, v + 1, arr_f, v, v1 - v);
        }
        --this.size;
        ++this.modCount;
        return f;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean remove(Object object0) {
        this.zzw();
        for(int v = 0; v < this.size; ++v) {
            if(object0.equals(((float)this.zzjn[v]))) {
                System.arraycopy(this.zzjn, v + 1, this.zzjn, v, this.size - v);
                --this.size;
                ++this.modCount;
                return true;
            }
        }
        return false;
    }

    @Override
    protected final void removeRange(int v, int v1) {
        this.zzw();
        if(v1 < v) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.zzjn, v1, this.zzjn, v, this.size - v1);
        this.size -= v1 - v;
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final Object set(int v, Object object0) {
        this.zzw();
        this.zzg(v);
        float[] arr_f = this.zzjn;
        float f = arr_f[v];
        arr_f[v] = (float)(((Float)object0));
        return f;
    }

    @Override
    public final int size() {
        return this.size;
    }

    private final void zzc(int v, float f) {
        this.zzw();
        if(v >= 0) {
            int v1 = this.size;
            if(v <= v1) {
                float[] arr_f = this.zzjn;
                if(v1 < arr_f.length) {
                    System.arraycopy(arr_f, v, arr_f, v + 1, v1 - v);
                }
                else {
                    float[] arr_f1 = new float[v1 * 3 / 2 + 1];
                    System.arraycopy(arr_f, 0, arr_f1, 0, v);
                    System.arraycopy(this.zzjn, v, arr_f1, v + 1, this.size - v);
                    this.zzjn = arr_f1;
                }
                this.zzjn[v] = f;
                ++this.size;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzh(v));
    }

    public final void zzc(float f) {
        this.zzc(this.size, f);
    }

    private final void zzg(int v) {
        if(v < 0 || v >= this.size) {
            throw new IndexOutOfBoundsException(this.zzh(v));
        }
    }

    private final String zzh(int v) {
        return "Index:" + v + ", Size:" + this.size;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcn
    public final zzcn zzi(int v) {
        if(v < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzce(Arrays.copyOf(this.zzjn, v), this.size);
    }
}

