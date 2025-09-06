package com.google.android.gms.internal.vision;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzdt extends AbstractSet {
    private final zzdp zza;

    zzdt(zzdp zzdp0) {
        this.zza = zzdp0;
        super();
    }

    @Override
    public final void clear() {
        this.zza.clear();
    }

    @Override
    public final boolean contains(@NullableDecl Object object0) {
        Map map0 = this.zza.zzb();
        if(map0 != null) {
            return map0.entrySet().contains(object0);
        }
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            int v = this.zza.zza(object1);
            return v != -1 && zzcz.zza(this.zza.zzc[v], ((Map.Entry)object0).getValue());
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return this.zza.zzf();
    }

    @Override
    public final boolean remove(@NullableDecl Object object0) {
        Map map0 = this.zza.zzb();
        if(map0 != null) {
            return map0.entrySet().remove(object0);
        }
        if(!(object0 instanceof Map.Entry) || this.zza.zza()) {
            return false;
        }
        int v = this.zza.zzi();
        int v1 = zzea.zza(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue(), v, this.zza.zze, this.zza.zza, this.zza.zzb, this.zza.zzc);
        if(v1 == -1) {
            return false;
        }
        this.zza.zza(v1, v);
        zzdp.zzd(this.zza);
        this.zza.zzc();
        return true;
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

