package com.google.android.gms.internal.vision;

import android.os.Build.VERSION;
import java.io.PrintStream;

public final class zzfe {
    static final class zza extends zzfd {
        @Override  // com.google.android.gms.internal.vision.zzfd
        public final void zza(Throwable throwable0) {
            throwable0.printStackTrace();
        }

        @Override  // com.google.android.gms.internal.vision.zzfd
        public final void zza(Throwable throwable0, Throwable throwable1) {
        }
    }

    private static final zzfd zza;
    private static final int zzb;

    static {
        zza zzfe$zza0;
        Integer integer0 = null;
        try {
            integer0 = zzfe.zza();
            zzfe$zza0 = integer0 == null || ((int)integer0) < 19 ? new zzfh() : new zzfj();
        }
        catch(Throwable throwable0) {
            PrintStream printStream0 = System.err;
            printStream0.println("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy com.google.android.gms.internal.vision.zzfe$zzawill be used. The error is: ");
            throwable0.printStackTrace(printStream0);
            zzfe$zza0 = new zza();
        }
        zzfe.zza = zzfe$zza0;
        zzfe.zzb = integer0 == null ? 1 : ((int)integer0);
    }

    // 去混淆评级： 低(40)
    private static Integer zza() {
        return Build.VERSION.SDK_INT;
    }

    public static void zza(Throwable throwable0) {
        zzfe.zza.zza(throwable0);
    }

    public static void zza(Throwable throwable0, Throwable throwable1) {
        zzfe.zza.zza(throwable0, throwable1);
    }
}

