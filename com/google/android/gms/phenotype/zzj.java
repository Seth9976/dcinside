package com.google.android.gms.phenotype;

import java.util.Comparator;

final class zzj implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = ((zzi)object0).zzah;
        int v1 = ((zzi)object1).zzah;
        return v == v1 ? ((zzi)object0).name.compareTo(((zzi)object1).name) : v - v1;
    }
}

