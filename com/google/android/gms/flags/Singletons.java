package com.google.android.gms.flags;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class Singletons {
    private static Singletons zzl;
    private final FlagRegistry zzm;
    private final zzb zzn;

    static {
        Singletons singletons0 = new Singletons();
        synchronized(Singletons.class) {
            Singletons.zzl = singletons0;
        }
    }

    private Singletons() {
        this.zzm = new FlagRegistry();
        this.zzn = new zzb();
    }

    @KeepForSdk
    public static FlagRegistry flagRegistry() {
        return Singletons.zzc().zzm;
    }

    private static Singletons zzc() {
        synchronized(Singletons.class) {
        }
        return Singletons.zzl;
    }

    public static zzb zzd() {
        return Singletons.zzc().zzn;
    }
}

