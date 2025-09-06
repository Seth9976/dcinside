package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import o3.a;

final class zzfwq extends AbstractSet {
    final zzfww zza;

    zzfwq(zzfww zzfww0) {
        this.zza = zzfww0;
        super();
    }

    @Override
    public final void clear() {
        this.zza.clear();
    }

    @Override
    public final boolean contains(@a Object object0) {
        Map map0 = this.zza.zzl();
        if(map0 != null) {
            return map0.entrySet().contains(object0);
        }
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            int v = this.zza.zzw(object1);
            return v != -1 && zzfuk.zza(zzfww.zzj(this.zza, v), ((Map.Entry)object0).getValue());
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        zzfww zzfww0 = this.zza;
        Map map0 = zzfww0.zzl();
        return map0 != null ? map0.entrySet().iterator() : new zzfwo(zzfww0);
    }

    @Override
    public final boolean remove(@a Object object0) {
        Map map0 = this.zza.zzl();
        if(map0 != null) {
            return map0.entrySet().remove(object0);
        }
        if(object0 instanceof Map.Entry) {
            zzfww zzfww0 = this.zza;
            if(!zzfww0.zzr()) {
                int v = zzfww0.zzv();
                int v1 = zzfwx.zzb(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue(), v, zzfww.zzi(this.zza), this.zza.zzA(), this.zza.zzB(), this.zza.zzC());
                if(v1 != -1) {
                    this.zza.zzq(v1, v);
                    --this.zza.zzg;
                    this.zza.zzo();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

