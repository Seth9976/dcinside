package com.google.android.gms.internal.vision;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzev extends zzej {
    static final zzev zza;
    private final transient Object[] zzb;
    private final transient Object[] zzc;
    private final transient int zzd;
    private final transient int zze;
    private final transient int zzf;

    static {
        zzev.zza = new zzev(new Object[0], 0, null, 0, 0);
    }

    zzev(Object[] arr_object, int v, Object[] arr_object1, int v1, int v2) {
        this.zzb = arr_object;
        this.zzc = arr_object1;
        this.zzd = v1;
        this.zze = v;
        this.zzf = v2;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    public final boolean contains(@NullableDecl Object object0) {
        Object[] arr_object = this.zzc;
        if(object0 != null && arr_object != null) {
            for(int v = zzec.zza(object0); true; v = v1 + 1) {
                int v1 = v & this.zzd;
                Object object1 = arr_object[v1];
                if(object1 == null) {
                    return false;
                }
                if(object1.equals(object0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.vision.zzej
    public final int hashCode() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.vision.zzej
    public final Iterator iterator() {
        return this.zza();
    }

    @Override
    public final int size() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final int zza(Object[] arr_object, int v) {
        System.arraycopy(this.zzb, 0, arr_object, v, this.zzf);
        return v + this.zzf;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    public final zzfa zza() {
        return (zzfa)this.zze().iterator();
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final Object[] zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final int zzc() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final int zzd() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final boolean zzf() {
        return false;
    }

    @Override  // com.google.android.gms.internal.vision.zzej
    final boolean zzg() {
        return true;
    }

    @Override  // com.google.android.gms.internal.vision.zzej
    final zzee zzh() {
        return zzee.zzb(this.zzb, this.zzf);
    }
}

