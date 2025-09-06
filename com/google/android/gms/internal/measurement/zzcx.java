package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

final class zzcx extends zzcy {
    private zzcx() {
    }

    zzcx(zzda zzda0) {
    }

    @Override  // com.google.android.gms.internal.measurement.zzcy
    public final URLConnection zza(URL uRL0, String s) throws IOException {
        return uRL0.openConnection();
    }
}

