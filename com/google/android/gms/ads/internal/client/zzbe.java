package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbcd;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcj;

public final class zzbe {
    private static final zzbe zza;
    private final zzbcd zzb;
    private final zzbce zzc;
    private final zzbcj zzd;

    static {
        zzbe.zza = new zzbe();
    }

    protected zzbe() {
        zzbcd zzbcd0 = new zzbcd();
        zzbce zzbce0 = new zzbce();
        zzbcj zzbcj0 = new zzbcj();
        super();
        this.zzb = zzbcd0;
        this.zzc = zzbce0;
        this.zzd = zzbcj0;
    }

    public static zzbcd zza() {
        return zzbe.zza.zzb;
    }

    public static zzbce zzb() {
        return zzbe.zza.zzc;
    }

    public static zzbcj zzc() {
        return zzbe.zza.zzd;
    }
}

