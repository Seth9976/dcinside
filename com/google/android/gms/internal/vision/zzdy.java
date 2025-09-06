package com.google.android.gms.internal.vision;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzdy extends zzdl {
    @NullableDecl
    private final Object zza;
    private int zzb;
    private final zzdp zzc;

    zzdy(zzdp zzdp0, int v) {
        this.zzc = zzdp0;
        super();
        this.zza = zzdp0.zzb[v];
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.vision.zzdl
    @NullableDecl
    public final Object getKey() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.vision.zzdl
    @NullableDecl
    public final Object getValue() {
        Map map0 = this.zzc.zzb();
        if(map0 != null) {
            return map0.get(this.zza);
        }
        this.zza();
        return this.zzb == -1 ? null : this.zzc.zzc[this.zzb];
    }

    @Override  // com.google.android.gms.internal.vision.zzdl
    public final Object setValue(Object object0) {
        Map map0 = this.zzc.zzb();
        if(map0 != null) {
            return map0.put(this.zza, object0);
        }
        this.zza();
        int v = this.zzb;
        if(v == -1) {
            this.zzc.put(this.zza, object0);
            return null;
        }
        Object[] arr_object = this.zzc.zzc;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        return object1;
    }

    private final void zza() {
        if(this.zzb == -1 || this.zzb >= this.zzc.size() || !zzcz.zza(this.zza, this.zzc.zzb[this.zzb])) {
            this.zzb = this.zzc.zza(this.zza);
        }
    }
}

