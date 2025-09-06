package com.google.android.gms.internal.ads;

import java.util.Iterator;
import o3.a;

final class zzfzf extends zzfxs {
    static final zzfzf zza;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private static final Object[] zzd;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] arr_object = new Object[0];
        zzfzf.zzd = arr_object;
        zzfzf.zza = new zzfzf(arr_object, 0, arr_object, 0, 0);
    }

    zzfzf(Object[] arr_object, int v, Object[] arr_object1, int v1, int v2) {
        this.zzb = arr_object;
        this.zze = v;
        this.zzc = arr_object1;
        this.zzf = v1;
        this.zzg = v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    public final boolean contains(@a Object object0) {
        if(object0 != null) {
            Object[] arr_object = this.zzc;
            if(arr_object.length != 0) {
                for(int v = zzfxf.zzb(object0); true; v = v1 + 1) {
                    int v1 = v & this.zzf;
                    Object object1 = arr_object[v1];
                    if(object1 == null) {
                        return false;
                    }
                    if(object1.equals(object0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    public final int hashCode() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    public final Iterator iterator() {
        return this.zzd().zzu(0);
    }

    @Override
    public final int size() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final int zza(Object[] arr_object, int v) {
        System.arraycopy(this.zzb, 0, arr_object, v, this.zzg);
        return v + this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final int zzb() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final int zzc() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    public final zzfzt zze() {
        return this.zzd().zzu(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    final Object[] zzg() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    final zzfxn zzi() {
        return zzfxn.zzj(this.zzb, this.zzg);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxs
    final boolean zzu() {
        return true;
    }
}

