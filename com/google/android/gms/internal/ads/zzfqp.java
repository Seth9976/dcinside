package com.google.android.gms.internal.ads;

import java.net.URL;
import java.net.URLConnection;

public final class zzfqp implements zzfqq {
    public final URL zza;

    public zzfqp(URL uRL0) {
        this.zza = uRL0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqq
    public final URLConnection zza() {
        return this.zza.openConnection();
    }
}

