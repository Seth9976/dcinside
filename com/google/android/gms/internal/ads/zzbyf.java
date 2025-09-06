package com.google.android.gms.internal.ads;

import androidx.compose.animation.core.d;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbyf {
    public static boolean zza(AtomicReference atomicReference0, Object object0, Object object1) {
        do {
            if(d.a(atomicReference0, null, object1)) {
                return true;
            }
        }
        while(atomicReference0.get() == null);
        return false;
    }
}

