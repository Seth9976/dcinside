package com.google.android.gms.internal.vision;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzff extends WeakReference {
    private final int zza;

    public zzff(Throwable throwable0, ReferenceQueue referenceQueue0) {
        super(throwable0, referenceQueue0);
        if(throwable0 == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.zza = System.identityHashCode(throwable0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 != null && object0.getClass() == zzff.class) {
            return this == object0 ? true : this.zza == ((zzff)object0).zza && this.get() == ((zzff)object0).get();
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza;
    }
}

