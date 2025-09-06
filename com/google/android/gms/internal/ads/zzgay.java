package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class zzgay {
    public static boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, Object object0, Object object1, Object object2) {
        do {
            if(a.a(atomicReferenceFieldUpdater0, object0, object1, object2)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(object0) == object1);
        return false;
    }
}

