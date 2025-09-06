package com.google.android.gms.internal.vision;

import java.util.Map.Entry;

final class zzjr implements Map.Entry {
    private Map.Entry zza;

    private zzjr(Map.Entry map$Entry0) {
        this.zza = map$Entry0;
    }

    zzjr(Map.Entry map$Entry0, zzjo zzjo0) {
        this(map$Entry0);
    }

    @Override
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override
    public final Object getValue() {
        return ((zzjp)this.zza.getValue()) == null ? null : zzjp.zza();
    }

    @Override
    public final Object setValue(Object object0) {
        if(!(object0 instanceof zzkk)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return ((zzjp)this.zza.getValue()).zza(((zzkk)object0));
    }

    public final zzjp zza() {
        return (zzjp)this.zza.getValue();
    }
}

