package com.google.android.gms.internal.measurement;

import android.os.Binder;

public final class zzha {
    public static Object zza(zzhd zzhd0) {
        try {
            return zzhd0.zza();
        }
        catch(SecurityException unused_ex) {
            long v = Binder.clearCallingIdentity();
            try {
                return zzhd0.zza();
            }
            finally {
                Binder.restoreCallingIdentity(v);
            }
        }
    }
}

