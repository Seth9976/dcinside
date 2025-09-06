package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzgml {
    public static final zzgvo zza;

    static {
        zzgml.zza = zzgvo.zzb(new byte[0]);
    }

    public static final zzgvo zza(int v) {
        return zzgvo.zzb(ByteBuffer.allocate(5).put(0).putInt(v).array());
    }

    public static final zzgvo zzb(int v) {
        return zzgvo.zzb(ByteBuffer.allocate(5).put(1).putInt(v).array());
    }
}

