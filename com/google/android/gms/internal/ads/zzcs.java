package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzcs {
    public final String zza;
    public final int zzb;
    private static final String zzc;
    private static final String zzd;

    static {
        zzcs.zzc = "0";
        zzcs.zzd = "1";
    }

    public zzcs(String s, int v) {
        this.zza = s;
        this.zzb = v;
    }

    public final Bundle zza() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("0", this.zza);
        bundle0.putInt("1", this.zzb);
        return bundle0;
    }
}

