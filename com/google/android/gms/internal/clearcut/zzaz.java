package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzaz extends zzav implements zzcn, RandomAccess {
    private int size;
    private static final zzaz zzfg;
    private boolean[] zzfh;

    static {
        zzaz zzaz0 = new zzaz();
        zzaz.zzfg = zzaz0;
        zzaz0.zzv();
    }

    zzaz() {
        this(new boolean[10], 0);
    }

    private zzaz(boolean[] arr_z, int v) {
        this.zzfh = arr_z;
        this.size = v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final void add(int v, Object object0) {
        this.zza(v, ((Boolean)object0).booleanValue());
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean addAll(Collection collection0) {
        this.zzw();
        zzci.checkNotNull(collection0);
        if(!(collection0 instanceof zzaz)) {
            return super.addAll(collection0);
        }
        int v = ((zzaz)collection0).size;
        if(v == 0) {
            return false;
        }
        int v1 = this.size;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        boolean[] arr_z = this.zzfh;
        if(v2 > arr_z.length) {
            this.zzfh = Arrays.copyOf(arr_z, v2);
        }
        System.arraycopy(((zzaz)collection0).zzfh, 0, this.zzfh, this.size, ((zzaz)collection0).size);
        this.size = v2;
        ++this.modCount;
        return true;
    }

    public final void addBoolean(boolean z) {
        this.zza(this.size, z);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzaz)) {
            return super.equals(object0);
        }
        if(this.size != ((zzaz)object0).size) {
            return false;
        }
        boolean[] arr_z = ((zzaz)object0).zzfh;
        for(int v = 0; v < this.size; ++v) {
            if(this.zzfh[v] != arr_z[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        this.zzg(v);
        return Boolean.valueOf(this.zzfh[v]);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.size; ++v1) {
            v = v * 0x1F + zzci.zzc(this.zzfh[v1]);
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final Object remove(int v) {
        this.zzw();
        this.zzg(v);
        boolean[] arr_z = this.zzfh;
        boolean z = arr_z[v];
        int v1 = this.size;
        if(v < v1 - 1) {
            System.arraycopy(arr_z, v + 1, arr_z, v, v1 - v);
        }
        --this.size;
        ++this.modCount;
        return Boolean.valueOf(z);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean remove(Object object0) {
        this.zzw();
        for(int v = 0; v < this.size; ++v) {
            if(object0.equals(Boolean.valueOf(this.zzfh[v]))) {
                System.arraycopy(this.zzfh, v + 1, this.zzfh, v, this.size - v);
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
        System.arraycopy(this.zzfh, v1, this.zzfh, v, this.size - v1);
        this.size -= v1 - v;
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final Object set(int v, Object object0) {
        this.zzw();
        this.zzg(v);
        boolean[] arr_z = this.zzfh;
        boolean z = arr_z[v];
        arr_z[v] = ((Boolean)object0).booleanValue();
        return Boolean.valueOf(z);
    }

    @Override
    public final int size() {
        return this.size;
    }

    private final void zza(int v, boolean z) {
        this.zzw();
        if(v >= 0) {
            int v1 = this.size;
            if(v <= v1) {
                boolean[] arr_z = this.zzfh;
                if(v1 < arr_z.length) {
                    System.arraycopy(arr_z, v, arr_z, v + 1, v1 - v);
                }
                else {
                    boolean[] arr_z1 = new boolean[v1 * 3 / 2 + 1];
                    System.arraycopy(arr_z, 0, arr_z1, 0, v);
                    System.arraycopy(this.zzfh, v, arr_z1, v + 1, this.size - v);
                    this.zzfh = arr_z1;
                }
                this.zzfh[v] = z;
                ++this.size;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzh(v));
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
        return new zzaz(Arrays.copyOf(this.zzfh, v), this.size);
    }
}

