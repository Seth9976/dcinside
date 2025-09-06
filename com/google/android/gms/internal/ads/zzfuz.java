package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzfuz implements Iterable {
    final CharSequence zza;
    final zzfvc zzb;

    zzfuz(zzfvc zzfvc0, CharSequence charSequence0) {
        this.zza = charSequence0;
        this.zzb = zzfvc0;
        super();
    }

    @Override
    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('[');
        zzfuf.zzb(stringBuilder0, this, ", ");
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

