package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class zzazm implements Comparator {
    zzazm(zzazo zzazo0) {
    }

    @Override
    public final int compare(Object object0, Object object1) {
        int v = ((zzazs)object0).zzc - ((zzazs)object1).zzc;
        return v == 0 ? Long.compare(((zzazs)object0).zza, ((zzazs)object1).zza) : v;
    }
}

