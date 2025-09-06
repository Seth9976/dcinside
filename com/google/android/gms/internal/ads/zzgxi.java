package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzgxi extends zzgvv implements zzgxy, zzgzl, RandomAccess {
    private static final float[] zza;
    private static final zzgxi zzb;
    private float[] zzc;
    private int zzd;

    static {
        float[] arr_f = new float[0];
        zzgxi.zza = arr_f;
        zzgxi.zzb = new zzgxi(arr_f, 0, false);
    }

    zzgxi() {
        this(zzgxi.zza, 0, true);
    }

    private zzgxi(float[] arr_f, int v, boolean z) {
        super(z);
        this.zzc = arr_f;
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvv
    public final void add(int v, Object object0) {
        float f = (float)(((Float)object0));
        this.zzdG();
        if(v >= 0) {
            int v1 = this.zzd;
            if(v <= v1) {
                float[] arr_f = this.zzc;
                if(v1 < arr_f.length) {
                    System.arraycopy(arr_f, v, arr_f, v + 1, v1 - v);
                }
                else {
                    float[] arr_f1 = new float[zzgxi.zzj(arr_f.length)];
                    System.arraycopy(this.zzc, 0, arr_f1, 0, v);
                    System.arraycopy(this.zzc, v, arr_f1, v + 1, this.zzd - v);
                    this.zzc = arr_f1;
                }
                this.zzc[v] = f;
                ++this.zzd;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzk(v));
    }

    @Override  // com.google.android.gms.internal.ads.zzgvv
    public final boolean add(Object object0) {
        this.zzh(((float)(((Float)object0))));
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvv
    public final boolean addAll(Collection collection0) {
        this.zzdG();
        collection0.getClass();
        if(!(collection0 instanceof zzgxi)) {
            return super.addAll(collection0);
        }
        int v = ((zzgxi)collection0).zzd;
        if(v == 0) {
            return false;
        }
        int v1 = this.zzd;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        float[] arr_f = this.zzc;
        if(v2 > arr_f.length) {
            this.zzc = Arrays.copyOf(arr_f, v2);
        }
        System.arraycopy(((zzgxi)collection0).zzc, 0, this.zzc, this.zzd, ((zzgxi)collection0).zzd);
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
        if(!(object0 instanceof zzgxi)) {
            return super.equals(object0);
        }
        if(this.zzd != ((zzgxi)object0).zzd) {
            return false;
        }
        float[] arr_f = ((zzgxi)object0).zzc;
        for(int v = 0; v < this.zzd; ++v) {
            if(Float.floatToIntBits(this.zzc[v]) != Float.floatToIntBits(arr_f[v])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        this.zzl(v);
        return (float)this.zzc[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzgvv
    public final int hashCode() {
        int v1 = 1;
        for(int v = 0; v < this.zzd; ++v) {
            v1 = v1 * 0x1F + Float.floatToIntBits(this.zzc[v]);
        }
        return v1;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Float)) {
            return -1;
        }
        float f = (float)(((Float)object0));
        int v = this.zzd;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.zzc[v1] == f) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgvv
    public final Object remove(int v) {
        this.zzdG();
        this.zzl(v);
        float[] arr_f = this.zzc;
        float f = arr_f[v];
        int v1 = this.zzd;
        if(v < v1 - 1) {
            System.arraycopy(arr_f, v + 1, arr_f, v, v1 - v - 1);
        }
        --this.zzd;
        ++this.modCount;
        return f;
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
        this.zzl(v);
        float[] arr_f = this.zzc;
        float f = arr_f[v];
        arr_f[v] = (float)(((Float)object0));
        return f;
    }

    @Override
    public final int size() {
        return this.zzd;
    }

    public final float zzd(int v) {
        this.zzl(v);
        return this.zzc[v];
    }

    public static zzgxi zze() {
        return zzgxi.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgyd
    public final zzgyd zzf(int v) {
        return this.zzg(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxy
    public final zzgxy zzg(int v) {
        if(v < this.zzd) {
            throw new IllegalArgumentException();
        }
        return v == 0 ? new zzgxi(zzgxi.zza, this.zzd, true) : new zzgxi(Arrays.copyOf(this.zzc, v), this.zzd, true);
    }

    public final void zzh(float f) {
        this.zzdG();
        int v = this.zzc.length;
        if(this.zzd == v) {
            float[] arr_f = new float[zzgxi.zzj(v)];
            System.arraycopy(this.zzc, 0, arr_f, 0, this.zzd);
            this.zzc = arr_f;
        }
        int v1 = this.zzd;
        this.zzd = v1 + 1;
        this.zzc[v1] = f;
    }

    final void zzi(int v) {
        int v1 = this.zzc.length;
        if(v <= v1) {
            return;
        }
        if(v1 != 0) {
            while(v1 < v) {
                v1 = zzgxi.zzj(v1);
            }
            this.zzc = Arrays.copyOf(this.zzc, v1);
            return;
        }
        this.zzc = new float[Math.max(v, 10)];
    }

    private static int zzj(int v) {
        return Math.max(v * 3 / 2 + 1, 10);
    }

    private final String zzk(int v) {
        return "Index:" + v + ", Size:" + this.zzd;
    }

    private final void zzl(int v) {
        if(v < 0 || v >= this.zzd) {
            throw new IndexOutOfBoundsException(this.zzk(v));
        }
    }
}

