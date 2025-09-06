package com.google.android.gms.flags;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Collection;

public class FlagRegistry {
    private final Collection zzg;
    private final Collection zzh;
    private final Collection zzi;

    public FlagRegistry() {
        this.zzg = new ArrayList();
        this.zzh = new ArrayList();
        this.zzi = new ArrayList();
    }

    @KeepForSdk
    public static void initialize(Context context0) {
        Singletons.zzd().initialize(context0);
    }

    public final void zza(Flag flag0) {
        this.zzg.add(flag0);
    }
}

