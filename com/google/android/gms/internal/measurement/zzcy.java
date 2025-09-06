package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public abstract class zzcy {
    private static zzcy zza;

    static {
        zzcy.zza = new zzcx(null);
    }

    public static zzcy zza() {
        synchronized(zzcy.class) {
        }
        return zzcy.zza;
    }

    public abstract URLConnection zza(URL arg1, String arg2) throws IOException;
}

