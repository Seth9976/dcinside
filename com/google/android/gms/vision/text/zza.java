package com.google.android.gms.vision.text;

import java.util.Comparator;
import java.util.Map.Entry;

final class zza implements Comparator {
    zza(TextBlock textBlock0) {
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return ((Integer)((Map.Entry)object0).getValue()).compareTo(((Integer)((Map.Entry)object1).getValue()));
    }
}

