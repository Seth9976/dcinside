package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.Collections;
import java.util.concurrent.Callable;

public final class zzffx {
    public static final zzfgd zza(Callable callable0, Object object0, zzfgf zzfgf0) {
        return zzffx.zzb(callable0, zzfgf0.zzb, object0, zzfgf0);
    }

    public static final zzfgd zzb(Callable callable0, zzgcs zzgcs0, Object object0, zzfgf zzfgf0) {
        return new zzfgd(zzfgf0, object0, null, zzfgf.zza, Collections.emptyList(), zzgcs0.zzb(callable0), null);
    }

    public static final zzfgd zzc(t0 t00, Object object0, zzfgf zzfgf0) {
        return new zzfgd(zzfgf0, object0, null, zzfgf.zza, Collections.emptyList(), t00, null);
    }

    public static final zzfgd zzd(zzffs zzffs0, zzgcs zzgcs0, Object object0, zzfgf zzfgf0) {
        return zzffx.zzb(new zzffw(zzffs0), zzgcs0, object0, zzfgf0);
    }
}

