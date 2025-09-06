package com.google.android.gms.internal.flags;

import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import java.util.concurrent.Callable;

public final class zze {
    public static Object zza(Callable callable0) throws Exception {
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable0.call();
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }
}

