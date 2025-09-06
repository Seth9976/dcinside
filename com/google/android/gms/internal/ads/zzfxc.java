package com.google.android.gms.internal.ads;

import java.util.Comparator;

public abstract class zzfxc {
    private static final zzfxc zza;
    private static final zzfxc zzb;
    private static final zzfxc zzc;

    static {
        zzfxc.zza = new zzfwz();
        zzfxc.zzb = new zzfxa(-1);
        zzfxc.zzc = new zzfxa(1);
    }

    zzfxc(zzfxb zzfxb0) {
    }

    public abstract int zza();

    public abstract zzfxc zzb(int arg1, int arg2);

    public abstract zzfxc zzc(Object arg1, Object arg2, Comparator arg3);

    public abstract zzfxc zzd(boolean arg1, boolean arg2);

    public abstract zzfxc zze(boolean arg1, boolean arg2);

    public static zzfxc zzj() {
        return zzfxc.zza;
    }
}

