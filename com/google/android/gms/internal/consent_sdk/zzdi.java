package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import o3.a;

final class zzdi extends zzde {
    final transient Object zza;

    zzdi(Object object0) {
        object0.getClass();
        this.zza = object0;
    }

    @Override
    public final boolean contains(@a Object object0) {
        return this.zza.equals(object0);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzde
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzde
    public final Iterator iterator() {
        return new zzdf(this.zza);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return "[" + this.zza.toString() + "]";
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzda
    final int zza(Object[] arr_object, int v) {
        arr_object[0] = this.zza;
        return 1;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzde
    public final zzdj zzd() {
        return new zzdf(this.zza);
    }
}

