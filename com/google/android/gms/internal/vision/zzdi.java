package com.google.android.gms.internal.vision;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzdi {
    public static zzdf zza(zzdf zzdf0) {
        if(!(zzdf0 instanceof zzdk) && !(zzdf0 instanceof zzdh)) {
            return zzdf0 instanceof Serializable ? new zzdh(zzdf0) : new zzdk(zzdf0);
        }
        return zzdf0;
    }

    public static zzdf zza(@NullableDecl Object object0) {
        return new zzdj(object0);
    }
}

