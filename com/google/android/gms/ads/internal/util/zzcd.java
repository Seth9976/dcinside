package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbuh;
import java.util.concurrent.Callable;

public final class zzcd {
    @Deprecated
    public static Object zza(Context context0, Callable callable0) {
        try {
            StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(strictMode$ThreadPolicy0).permitDiskReads().permitDiskWrites().build());
                return callable0.call();
            }
            finally {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            }
        }
        catch(Throwable throwable0) {
        }
        zzo.zzh("Unexpected exception.", throwable0);
        zzbuh.zza(context0).zzh(throwable0, "StrictModeUtil.runWithLaxStrictMode");
        return null;
    }
}

