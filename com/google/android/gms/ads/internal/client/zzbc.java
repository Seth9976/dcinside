package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbtb;
import com.google.android.gms.internal.ads.zzbxb;
import java.util.Random;

public final class zzbc {
    public static final int zza;
    private static final zzbc zzb;
    private final zzf zzc;
    private final zzba zzd;
    private final String zze;
    private final VersionInfoParcel zzf;
    private final Random zzg;

    static {
        zzbc.zzb = new zzbc();
    }

    protected zzbc() {
        zzf zzf0 = new zzf();
        zzba zzba0 = new zzba(new zzk(), new zzi(), new zzfe(), new zzbhv(), new zzbxb(), new zzbtb(), new zzbhw(), new zzl());
        VersionInfoParcel versionInfoParcel0 = new VersionInfoParcel(0, 244410000, true);
        Random random0 = new Random();
        super();
        this.zzc = zzf0;
        this.zzd = zzba0;
        this.zze = "11116511583032985042";
        this.zzf = versionInfoParcel0;
        this.zzg = random0;
    }

    public static zzba zza() {
        return zzbc.zzb.zzd;
    }

    public static zzf zzb() {
        return zzbc.zzb.zzc;
    }

    public static VersionInfoParcel zzc() {
        return zzbc.zzb.zzf;
    }

    public static String zzd() {
        return zzbc.zzb.zze;
    }

    public static Random zze() {
        return zzbc.zzb.zzg;
    }
}

