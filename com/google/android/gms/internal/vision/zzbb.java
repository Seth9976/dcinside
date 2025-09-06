package com.google.android.gms.internal.vision;

import android.os.Binder;

public final class zzbb {
    public static Object zza(zzba zzba0) {
        try {
            return zzba0.zza();
        }
        catch(SecurityException unused_ex) {
            long v = Binder.clearCallingIdentity();
            try {
                return zzba0.zza();
            }
            finally {
                Binder.restoreCallingIdentity(v);
            }
        }
    }
}

