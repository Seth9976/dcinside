package com.google.android.gms.internal.clearcut;

import java.util.Map.Entry;

final class zzct implements Map.Entry {
    private Map.Entry zzll;

    private zzct(Map.Entry map$Entry0) {
        this.zzll = map$Entry0;
    }

    zzct(Map.Entry map$Entry0, zzcs zzcs0) {
        this(map$Entry0);
    }

    @Override
    public final Object getKey() {
        return this.zzll.getKey();
    }

    @Override
    public final Object getValue() {
        return ((zzcr)this.zzll.getValue()) == null ? null : zzcr.zzbr();
    }

    @Override
    public final Object setValue(Object object0) {
        if(!(object0 instanceof zzdo)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return ((zzcr)this.zzll.getValue()).zzi(((zzdo)object0));
    }

    public final zzcr zzbs() {
        return (zzcr)this.zzll.getValue();
    }
}

