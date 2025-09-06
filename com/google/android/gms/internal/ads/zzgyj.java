package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

final class zzgyj implements Map.Entry {
    private final Map.Entry zza;

    zzgyj(Map.Entry map$Entry0, zzgyl zzgyl0) {
        this.zza = map$Entry0;
    }

    @Override
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override
    public final Object getValue() {
        if(((zzgym)this.zza.getValue()) != null) {
            throw null;
        }
        return null;
    }

    @Override
    public final Object setValue(Object object0) {
        if(!(object0 instanceof zzgzc)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return ((zzgym)this.zza.getValue()).zzc(((zzgzc)object0));
    }

    public final zzgym zza() {
        return (zzgym)this.zza.getValue();
    }
}

