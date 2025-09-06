package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzgvz extends zzgvv implements zzgxt, zzgzl, RandomAccess {
    private static final boolean[] zza;
    private static final zzgvz zzb;
    private boolean[] zzc;
    private int zzd;

    static {
        boolean[] arr_z = new boolean[0];
        zzgvz.zza = arr_z;
        zzgvz.zzb = new zzgvz(arr_z, 0, false);
    }

    zzgvz() {
        this(zzgvz.zza, 0, true);
    }

    private zzgvz(boolean[] arr_z, int v, boolean z) {
        super(z);
        this.zzc = arr_z;
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvv
    public final void add(int v, Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        this.zzdG();
        if(v >= 0) {
            int v1 = this.zzd;
            if(v <= v1) {
                boolean[] arr_z = this.zzc;
                if(v1 < arr_z.length) {
                    System.arraycopy(arr_z, v, arr_z, v + 1, v1 - v);
                }
                else {
                    boolean[] arr_z1 = new boolean[zzgvz.zzi(arr_z.length)];
                    System.arraycopy(this.zzc, 0, arr_z1, 0, v);
                    System.arraycopy(this.zzc, v, arr_z1, v + 1, this.zzd - v);
                    this.zzc = arr_z1;
                }
                this.zzc[v] = z;
                ++this.zzd;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzj(v));
    }

    @Override  // com.google.android.gms.internal.ads.zzgvv
    public final boolean add(Object object0) {
        this.zzg(((Boolean)object0).booleanValue());
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvv
    public final boolean addAll(Collection collection0) {
        this.zzdG();
        collection0.getClass();
        if(!(collection0 instanceof zzgvz)) {
            return super.addAll(collection0);
        }
        int v = ((zzgvz)collection0).zzd;
        if(v == 0) {
            return false;
        }
        int v1 = this.zzd;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        boolean[] arr_z = this.zzc;
        if(v2 > arr_z.length) {
            this.zzc = Arrays.copyOf(arr_z, v2);
        }
        System.arraycopy(((zzgvz)collection0).zzc, 0, this.zzc, this.zzd, ((zzgvz)collection0).zzd);
        this.zzd = v2;
        ++this.modCount;
        return true;
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvv
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzgvz)) {
            return super.equals(object0);
        }
        if(this.zzd != ((zzgvz)object0).zzd) {
            return false;
        }
        boolean[] arr_z = ((zzgvz)object0).zzc;
        for(int v = 0; v < this.zzd; ++v) {
            if(this.zzc[v] != arr_z[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        this.zzk(v);
        return Boolean.valueOf(this.zzc[v]);
    }

    @Override  // com.google.android.gms.internal.ads.zzgvv
    public final int hashCode() {
        int v1 = 1;
        for(int v = 0; v < this.zzd; ++v) {
            v1 = v1 * 0x1F + zzgye.zza(this.zzc[v]);
        }
        return v1;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Boolean)) {
            return -1;
        }
        boolean z = ((Boolean)object0).booleanValue();
        int v = this.zzd;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.zzc[v1] == z) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvv
    public final Object remove(int v) {
        this.zzdG();
        this.zzk(v);
        boolean[] arr_z = this.zzc;
        boolean z = arr_z[v];
        int v1 = this.zzd;
        if(v < v1 - 1) {
            System.arraycopy(arr_z, v + 1, arr_z, v, v1 - v - 1);
        }
        --this.zzd;
        ++this.modCount;
        return Boolean.valueOf(z);
    }

    @Override
    protected final void removeRange(int v, int v1) {
        this.zzdG();
        if(v1 < v) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.zzc, v1, this.zzc, v, this.zzd - v1);
        this.zzd -= v1 - v;
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvv
    public final Object set(int v, Object object0) {
        this.zzdG();
        this.zzk(v);
        boolean[] arr_z = this.zzc;
        boolean z = arr_z[v];
        arr_z[v] = ((Boolean)object0).booleanValue();
        return Boolean.valueOf(z);
    }

    @Override
    public final int size() {
        return this.zzd;
    }

    public static zzgvz zzd() {
        return zzgvz.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxt
    public final zzgxt zze(int v) {
        if(v < this.zzd) {
            throw new IllegalArgumentException();
        }
        return v == 0 ? new zzgvz(zzgvz.zza, this.zzd, true) : new zzgvz(Arrays.copyOf(this.zzc, v), this.zzd, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzgyd
    public final zzgyd zzf(int v) {
        return this.zze(v);
    }

    public final void zzg(boolean z) {
        this.zzdG();
        int v = this.zzc.length;
        if(this.zzd == v) {
            boolean[] arr_z = new boolean[zzgvz.zzi(v)];
            System.arraycopy(this.zzc, 0, arr_z, 0, this.zzd);
            this.zzc = arr_z;
        }
        int v1 = this.zzd;
        this.zzd = v1 + 1;
        this.zzc[v1] = z;
    }

    public final boolean zzh(int v) {
        this.zzk(v);
        return this.zzc[v];
    }

    private static int zzi(int v) {
        return Math.max(v * 3 / 2 + 1, 10);
    }

    private final String zzj(int v) {
        return "Index:" + v + ", Size:" + this.zzd;
    }

    private final void zzk(int v) {
        if(v < 0 || v >= this.zzd) {
            throw new IndexOutOfBoundsException(this.zzj(v));
        }
    }
}

