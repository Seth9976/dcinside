package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzch extends zzav implements zzcn, RandomAccess {
    private int size;
    private static final zzch zzkr;
    private int[] zzks;

    static {
        zzch zzch0 = new zzch();
        zzch.zzkr = zzch0;
        zzch0.zzv();
    }

    zzch() {
        this(new int[10], 0);
    }

    private zzch(int[] arr_v, int v) {
        this.zzks = arr_v;
        this.size = v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final void add(int v, Object object0) {
        this.zzo(v, ((int)(((Integer)object0))));
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean addAll(Collection collection0) {
        this.zzw();
        zzci.checkNotNull(collection0);
        if(!(collection0 instanceof zzch)) {
            return super.addAll(collection0);
        }
        int v = ((zzch)collection0).size;
        if(v == 0) {
            return false;
        }
        int v1 = this.size;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        int[] arr_v = this.zzks;
        if(v2 > arr_v.length) {
            this.zzks = Arrays.copyOf(arr_v, v2);
        }
        System.arraycopy(((zzch)collection0).zzks, 0, this.zzks, this.size, ((zzch)collection0).size);
        this.size = v2;
        ++this.modCount;
        return true;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzch)) {
            return super.equals(object0);
        }
        if(this.size != ((zzch)object0).size) {
            return false;
        }
        int[] arr_v = ((zzch)object0).zzks;
        for(int v = 0; v < this.size; ++v) {
            if(this.zzks[v] != arr_v[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        return this.getInt(v);
    }

    public final int getInt(int v) {
        this.zzg(v);
        return this.zzks[v];
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.size; ++v1) {
            v = v * 0x1F + this.zzks[v1];
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final Object remove(int v) {
        this.zzw();
        this.zzg(v);
        int[] arr_v = this.zzks;
        int v1 = arr_v[v];
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
            if(object0.equals(((int)this.zzks[v]))) {
                System.arraycopy(this.zzks, v + 1, this.zzks, v, this.size - v);
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
        System.arraycopy(this.zzks, v1, this.zzks, v, this.size - v1);
        this.size -= v1 - v;
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final Object set(int v, Object object0) {
        this.zzw();
        this.zzg(v);
        int[] arr_v = this.zzks;
        int v1 = arr_v[v];
        arr_v[v] = (int)(((Integer)object0));
        return v1;
    }

    @Override
    public final int size() {
        return this.size;
    }

    public final void zzac(int v) {
        this.zzo(this.size, v);
    }

    public static zzch zzbk() {
        return zzch.zzkr;
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
        return new zzch(Arrays.copyOf(this.zzks, v), this.size);
    }

    private final void zzo(int v, int v1) {
        this.zzw();
        if(v >= 0) {
            int v2 = this.size;
            if(v <= v2) {
                int[] arr_v = this.zzks;
                if(v2 < arr_v.length) {
                    System.arraycopy(arr_v, v, arr_v, v + 1, v2 - v);
                }
                else {
                    int[] arr_v1 = new int[v2 * 3 / 2 + 1];
                    System.arraycopy(arr_v, 0, arr_v1, 0, v);
                    System.arraycopy(this.zzks, v, arr_v1, v + 1, this.size - v);
                    this.zzks = arr_v1;
                }
                this.zzks[v] = v1;
                ++this.size;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzh(v));
    }
}

