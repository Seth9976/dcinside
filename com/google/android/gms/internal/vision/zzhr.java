package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzhr extends zzhj implements zzjl, zzkw, RandomAccess {
    private static final zzhr zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzhr zzhr0 = new zzhr(new boolean[0], 0);
        zzhr.zza = zzhr0;
        zzhr0.zzb();
    }

    zzhr() {
        this(new boolean[10], 0);
    }

    private zzhr(boolean[] arr_z, int v) {
        this.zzb = arr_z;
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final void add(int v, Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        this.zzc();
        if(v >= 0) {
            int v1 = this.zzc;
            if(v <= v1) {
                boolean[] arr_z = this.zzb;
                if(v1 < arr_z.length) {
                    System.arraycopy(arr_z, v, arr_z, v + 1, v1 - v);
                }
                else {
                    boolean[] arr_z1 = new boolean[v1 * 3 / 2 + 1];
                    System.arraycopy(arr_z, 0, arr_z1, 0, v);
                    System.arraycopy(this.zzb, v, arr_z1, v + 1, this.zzc - v);
                    this.zzb = arr_z1;
                }
                this.zzb[v] = z;
                ++this.zzc;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzc(v));
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final boolean add(Object object0) {
        this.zza(((Boolean)object0).booleanValue());
        return true;
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final boolean addAll(Collection collection0) {
        this.zzc();
        zzjf.zza(collection0);
        if(!(collection0 instanceof zzhr)) {
            return super.addAll(collection0);
        }
        int v = ((zzhr)collection0).zzc;
        if(v == 0) {
            return false;
        }
        int v1 = this.zzc;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        boolean[] arr_z = this.zzb;
        if(v2 > arr_z.length) {
            this.zzb = Arrays.copyOf(arr_z, v2);
        }
        System.arraycopy(((zzhr)collection0).zzb, 0, this.zzb, this.zzc, ((zzhr)collection0).zzc);
        this.zzc = v2;
        ++this.modCount;
        return true;
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzhr)) {
            return super.equals(object0);
        }
        if(this.zzc != ((zzhr)object0).zzc) {
            return false;
        }
        boolean[] arr_z = ((zzhr)object0).zzb;
        for(int v = 0; v < this.zzc; ++v) {
            if(this.zzb[v] != arr_z[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        this.zzb(v);
        return Boolean.valueOf(this.zzb[v]);
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.zzc; ++v1) {
            v = v * 0x1F + zzjf.zza(this.zzb[v1]);
        }
        return v;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Boolean)) {
            return -1;
        }
        boolean z = ((Boolean)object0).booleanValue();
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.zzb[v1] == z) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final Object remove(int v) {
        this.zzc();
        this.zzb(v);
        boolean[] arr_z = this.zzb;
        boolean z = arr_z[v];
        int v1 = this.zzc;
        if(v < v1 - 1) {
            System.arraycopy(arr_z, v + 1, arr_z, v, v1 - v - 1);
        }
        --this.zzc;
        ++this.modCount;
        return Boolean.valueOf(z);
    }

    @Override
    protected final void removeRange(int v, int v1) {
        this.zzc();
        if(v1 < v) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.zzb, v1, this.zzb, v, this.zzc - v1);
        this.zzc -= v1 - v;
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final Object set(int v, Object object0) {
        this.zzc();
        this.zzb(v);
        boolean[] arr_z = this.zzb;
        boolean z = arr_z[v];
        arr_z[v] = ((Boolean)object0).booleanValue();
        return Boolean.valueOf(z);
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.vision.zzjl
    public final zzjl zza(int v) {
        if(v < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzhr(Arrays.copyOf(this.zzb, v), this.zzc);
    }

    public final void zza(boolean z) {
        this.zzc();
        int v = this.zzc;
        boolean[] arr_z = this.zzb;
        if(v == arr_z.length) {
            boolean[] arr_z1 = new boolean[v * 3 / 2 + 1];
            System.arraycopy(arr_z, 0, arr_z1, 0, v);
            this.zzb = arr_z1;
        }
        int v1 = this.zzc;
        this.zzc = v1 + 1;
        this.zzb[v1] = z;
    }

    private final void zzb(int v) {
        if(v < 0 || v >= this.zzc) {
            throw new IndexOutOfBoundsException(this.zzc(v));
        }
    }

    private final String zzc(int v) {
        return "Index:" + v + ", Size:" + this.zzc;
    }
}

