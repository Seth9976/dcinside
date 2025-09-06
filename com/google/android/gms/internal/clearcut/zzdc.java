package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzdc extends zzav implements zzcn, RandomAccess {
    private int size;
    private static final zzdc zzlw;
    private long[] zzlx;

    static {
        zzdc zzdc0 = new zzdc();
        zzdc.zzlw = zzdc0;
        zzdc0.zzv();
    }

    zzdc() {
        this(new long[10], 0);
    }

    private zzdc(long[] arr_v, int v) {
        this.zzlx = arr_v;
        this.size = v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final void add(int v, Object object0) {
        this.zzk(v, ((long)(((Long)object0))));
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean addAll(Collection collection0) {
        this.zzw();
        zzci.checkNotNull(collection0);
        if(!(collection0 instanceof zzdc)) {
            return super.addAll(collection0);
        }
        int v = ((zzdc)collection0).size;
        if(v == 0) {
            return false;
        }
        int v1 = this.size;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        long[] arr_v = this.zzlx;
        if(v2 > arr_v.length) {
            this.zzlx = Arrays.copyOf(arr_v, v2);
        }
        System.arraycopy(((zzdc)collection0).zzlx, 0, this.zzlx, this.size, ((zzdc)collection0).size);
        this.size = v2;
        ++this.modCount;
        return true;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzdc)) {
            return super.equals(object0);
        }
        if(this.size != ((zzdc)object0).size) {
            return false;
        }
        long[] arr_v = ((zzdc)object0).zzlx;
        for(int v = 0; v < this.size; ++v) {
            if(this.zzlx[v] != arr_v[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        return this.getLong(v);
    }

    public final long getLong(int v) {
        this.zzg(v);
        return this.zzlx[v];
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.size; ++v1) {
            v = v * 0x1F + zzci.zzl(this.zzlx[v1]);
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final Object remove(int v) {
        this.zzw();
        this.zzg(v);
        long[] arr_v = this.zzlx;
        long v1 = arr_v[v];
        int v2 = this.size;
        if(v < v2 - 1) {
            System.arraycopy(arr_v, v + 1, arr_v, v, v2 - v);
        }
        --this.size;
        ++this.modCount;
        return v1;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean remove(Object object0) {
        this.zzw();
        for(int v = 0; v < this.size; ++v) {
            if(object0.equals(((long)this.zzlx[v]))) {
                System.arraycopy(this.zzlx, v + 1, this.zzlx, v, this.size - v);
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
        System.arraycopy(this.zzlx, v1, this.zzlx, v, this.size - v1);
        this.size -= v1 - v;
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final Object set(int v, Object object0) {
        this.zzw();
        this.zzg(v);
        long[] arr_v = this.zzlx;
        long v1 = arr_v[v];
        arr_v[v] = (long)(((Long)object0));
        return v1;
    }

    @Override
    public final int size() {
        return this.size;
    }

    public static zzdc zzbx() {
        return zzdc.zzlw;
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
        return new zzdc(Arrays.copyOf(this.zzlx, v), this.size);
    }

    private final void zzk(int v, long v1) {
        this.zzw();
        if(v >= 0) {
            int v2 = this.size;
            if(v <= v2) {
                long[] arr_v = this.zzlx;
                if(v2 < arr_v.length) {
                    System.arraycopy(arr_v, v, arr_v, v + 1, v2 - v);
                }
                else {
                    long[] arr_v1 = new long[v2 * 3 / 2 + 1];
                    System.arraycopy(arr_v, 0, arr_v1, 0, v);
                    System.arraycopy(this.zzlx, v, arr_v1, v + 1, this.size - v);
                    this.zzlx = arr_v1;
                }
                this.zzlx[v] = v1;
                ++this.size;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzh(v));
    }

    public final void zzm(long v) {
        this.zzk(this.size, v);
    }
}

