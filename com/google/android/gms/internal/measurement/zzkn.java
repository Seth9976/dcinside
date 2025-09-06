package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzkn extends zzie implements zzjz, zzlo, RandomAccess {
    private static final long[] zza;
    private static final zzkn zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] arr_v = new long[0];
        zzkn.zza = arr_v;
        zzkn.zzb = new zzkn(arr_v, 0, false);
    }

    zzkn() {
        this(zzkn.zza, 0, true);
    }

    private zzkn(long[] arr_v, int v, boolean z) {
        super(z);
        this.zzc = arr_v;
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzie
    public final void add(int v, Object object0) {
        long v1 = (long)(((Long)object0));
        this.zza();
        if(v >= 0) {
            int v2 = this.zzd;
            if(v <= v2) {
                long[] arr_v = this.zzc;
                if(v2 < arr_v.length) {
                    System.arraycopy(arr_v, v, arr_v, v + 1, v2 - v);
                }
                else {
                    long[] arr_v1 = new long[zzkn.zze(arr_v.length)];
                    System.arraycopy(this.zzc, 0, arr_v1, 0, v);
                    System.arraycopy(this.zzc, v, arr_v1, v + 1, this.zzd - v);
                    this.zzc = arr_v1;
                }
                this.zzc[v] = v1;
                ++this.zzd;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzf(v));
    }

    @Override  // com.google.android.gms.internal.measurement.zzie
    public final boolean add(Object object0) {
        this.zza(((long)(((Long)object0))));
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzie
    public final boolean addAll(Collection collection0) {
        this.zza();
        zzjv.zza(collection0);
        if(!(collection0 instanceof zzkn)) {
            return super.addAll(collection0);
        }
        int v = ((zzkn)collection0).zzd;
        if(v == 0) {
            return false;
        }
        int v1 = this.zzd;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        long[] arr_v = this.zzc;
        if(v2 > arr_v.length) {
            this.zzc = Arrays.copyOf(arr_v, v2);
        }
        System.arraycopy(((zzkn)collection0).zzc, 0, this.zzc, this.zzd, ((zzkn)collection0).zzd);
        this.zzd = v2;
        ++this.modCount;
        return true;
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzie
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzkn)) {
            return super.equals(object0);
        }
        if(this.zzd != ((zzkn)object0).zzd) {
            return false;
        }
        long[] arr_v = ((zzkn)object0).zzc;
        for(int v = 0; v < this.zzd; ++v) {
            if(this.zzc[v] != arr_v[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        return this.zzb(v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzie
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.zzd; ++v1) {
            v = v * 0x1F + zzjv.zza(this.zzc[v1]);
        }
        return v;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Long)) {
            return -1;
        }
        long v = (long)(((Long)object0));
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.zzc[v2] == v) {
                return v2;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzie
    public final Object remove(int v) {
        this.zza();
        this.zzg(v);
        long[] arr_v = this.zzc;
        long v1 = arr_v[v];
        int v2 = this.zzd;
        if(v < v2 - 1) {
            System.arraycopy(arr_v, v + 1, arr_v, v, v2 - v - 1);
        }
        --this.zzd;
        ++this.modCount;
        return v1;
    }

    @Override
    protected final void removeRange(int v, int v1) {
        this.zza();
        if(v1 < v) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.zzc, v1, this.zzc, v, this.zzd - v1);
        this.zzd -= v1 - v;
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.measurement.zzie
    public final Object set(int v, Object object0) {
        this.zza();
        this.zzg(v);
        long[] arr_v = this.zzc;
        long v1 = arr_v[v];
        arr_v[v] = (long)(((Long)object0));
        return v1;
    }

    @Override
    public final int size() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkc
    public final zzkc zza(int v) {
        return this.zzc(v);
    }

    public final void zza(long v) {
        this.zza();
        long[] arr_v = this.zzc;
        if(this.zzd == arr_v.length) {
            long[] arr_v1 = new long[zzkn.zze(arr_v.length)];
            System.arraycopy(this.zzc, 0, arr_v1, 0, this.zzd);
            this.zzc = arr_v1;
        }
        int v1 = this.zzd;
        this.zzd = v1 + 1;
        this.zzc[v1] = v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzjz
    public final long zzb(int v) {
        this.zzg(v);
        return this.zzc[v];
    }

    @Override  // com.google.android.gms.internal.measurement.zzjz
    public final zzjz zzc(int v) {
        if(v < this.zzd) {
            throw new IllegalArgumentException();
        }
        return v == 0 ? new zzkn(zzkn.zza, this.zzd, true) : new zzkn(Arrays.copyOf(this.zzc, v), this.zzd, true);
    }

    public static zzkn zzd() {
        return zzkn.zzb;
    }

    final void zzd(int v) {
        long[] arr_v = this.zzc;
        if(v <= arr_v.length) {
            return;
        }
        if(arr_v.length == 0) {
            this.zzc = new long[Math.max(v, 10)];
            return;
        }
        int v1;
        for(v1 = arr_v.length; v1 < v; v1 = zzkn.zze(v1)) {
        }
        this.zzc = Arrays.copyOf(this.zzc, v1);
    }

    private static int zze(int v) {
        return Math.max(v * 3 / 2 + 1, 10);
    }

    private final String zzf(int v) {
        return "Index:" + v + ", Size:" + this.zzd;
    }

    private final void zzg(int v) {
        if(v < 0 || v >= this.zzd) {
            throw new IndexOutOfBoundsException(this.zzf(v));
        }
    }
}

