package com.google.android.gms.internal.clearcut;

public abstract class zzat implements zzdp {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.zzt();
    }

    protected abstract zzat zza(zzas arg1);

    @Override  // com.google.android.gms.internal.clearcut.zzdp
    public final zzdp zza(zzdo zzdo0) {
        if(!this.zzbe().getClass().isInstance(zzdo0)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return this.zza(((zzas)zzdo0));
    }

    public abstract zzat zzt();
}

