package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

public final class zzacd implements zzacf {
    @Override  // com.google.android.gms.internal.ads.zzacf
    public final Constructor zza() {
        Object object0 = Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null);
        return Boolean.TRUE.equals(object0) ? Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzacn.class).getConstructor(Integer.TYPE) : null;
    }
}

