package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzcu {
    public final int zza;
    public final int zzb;
    public final int zzc;
    private static final String zzd;
    private static final String zze;
    private static final String zzf;

    static {
        zzcu.zzd = "0";
        zzcu.zze = "1";
        zzcu.zzf = "2";
    }

    public zzcu(int v, int v1, int v2) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
    }

    public final Bundle zza() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("0", this.zza);
        bundle0.putInt("1", this.zzb);
        bundle0.putInt("2", this.zzc);
        return bundle0;
    }
}

