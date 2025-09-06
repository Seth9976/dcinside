package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

final class zzkf implements Map.Entry {
    private Map.Entry zza;

    private zzkf(Map.Entry map$Entry0) {
        this.zza = map$Entry0;
    }

    zzkf(Map.Entry map$Entry0, zzkh zzkh0) {
        this(map$Entry0);
    }

    @Override
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override
    public final Object getValue() {
        if(((zzkg)this.zza.getValue()) != null) {
            throw new NoSuchMethodError();
        }
        return null;
    }

    @Override
    public final Object setValue(Object object0) {
        if(!(object0 instanceof zzlc)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return ((zzkg)this.zza.getValue()).zza(((zzlc)object0));
    }

    public final zzkg zza() {
        return (zzkg)this.zza.getValue();
    }
}

