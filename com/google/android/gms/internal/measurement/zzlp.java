package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

final class zzlp extends zzie implements RandomAccess {
    private static final Object[] zza;
    private static final zzlp zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] arr_object = new Object[0];
        zzlp.zza = arr_object;
        zzlp.zzb = new zzlp(arr_object, 0, false);
    }

    zzlp() {
        this(zzlp.zza, 0, true);
    }

    private zzlp(Object[] arr_object, int v, boolean z) {
        super(z);
        this.zzc = arr_object;
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzie
    public final void add(int v, Object object0) {
        this.zza();
        if(v >= 0) {
            int v1 = this.zzd;
            if(v <= v1) {
                Object[] arr_object = this.zzc;
                if(v1 < arr_object.length) {
                    System.arraycopy(arr_object, v, arr_object, v + 1, v1 - v);
                }
                else {
                    Object[] arr_object1 = new Object[zzlp.zzc(arr_object.length)];
                    System.arraycopy(this.zzc, 0, arr_object1, 0, v);
                    System.arraycopy(this.zzc, v, arr_object1, v + 1, this.zzd - v);
                    this.zzc = arr_object1;
                }
                this.zzc[v] = object0;
                ++this.zzd;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzd(v));
    }

    @Override  // com.google.android.gms.internal.measurement.zzie
    public final boolean add(Object object0) {
        this.zza();
        Object[] arr_object = this.zzc;
        if(this.zzd == arr_object.length) {
            this.zzc = Arrays.copyOf(this.zzc, zzlp.zzc(arr_object.length));
        }
        int v = this.zzd;
        this.zzd = v + 1;
        this.zzc[v] = object0;
        ++this.modCount;
        return true;
    }

    @Override
    public final Object get(int v) {
        this.zze(v);
        return this.zzc[v];
    }

    @Override  // com.google.android.gms.internal.measurement.zzie
    public final Object remove(int v) {
        this.zza();
        this.zze(v);
        Object[] arr_object = this.zzc;
        Object object0 = arr_object[v];
        int v1 = this.zzd;
        if(v < v1 - 1) {
            System.arraycopy(arr_object, v + 1, arr_object, v, v1 - v - 1);
        }
        --this.zzd;
        ++this.modCount;
        return object0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzie
    public final Object set(int v, Object object0) {
        this.zza();
        this.zze(v);
        Object[] arr_object = this.zzc;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        ++this.modCount;
        return object1;
    }

    @Override
    public final int size() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkc
    public final zzkc zza(int v) {
        if(v < this.zzd) {
            throw new IllegalArgumentException();
        }
        return v == 0 ? new zzlp(zzlp.zza, this.zzd, true) : new zzlp(Arrays.copyOf(this.zzc, v), this.zzd, true);
    }

    final void zzb(int v) {
        Object[] arr_object = this.zzc;
        if(v <= arr_object.length) {
            return;
        }
        if(arr_object.length == 0) {
            this.zzc = new Object[Math.max(v, 10)];
            return;
        }
        int v1;
        for(v1 = arr_object.length; v1 < v; v1 = zzlp.zzc(v1)) {
        }
        this.zzc = Arrays.copyOf(this.zzc, v1);
    }

    private static int zzc(int v) {
        return Math.max(v * 3 / 2 + 1, 10);
    }

    public static zzlp zzd() {
        return zzlp.zzb;
    }

    private final String zzd(int v) {
        return "Index:" + v + ", Size:" + this.zzd;
    }

    private final void zze(int v) {
        if(v < 0 || v >= this.zzd) {
            throw new IndexOutOfBoundsException(this.zzd(v));
        }
    }
}

