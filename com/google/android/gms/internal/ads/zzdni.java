package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzdni implements Callable {
    private final zza zza;
    private final Context zzb;
    private final zzdrw zzc;
    private final zzebk zzd;
    private final Executor zze;
    private final zzava zzf;
    private final VersionInfoParcel zzg;
    private final zzfja zzh;
    private final zzebv zzi;
    private final zzfcn zzj;

    public zzdni(Context context0, Executor executor0, zzava zzava0, VersionInfoParcel versionInfoParcel0, zza zza0, zzcfk zzcfk0, zzebk zzebk0, zzfja zzfja0, zzdrw zzdrw0, zzebv zzebv0, zzfcn zzfcn0) {
        this.zzb = context0;
        this.zze = executor0;
        this.zzf = zzava0;
        this.zzg = versionInfoParcel0;
        this.zza = zza0;
        this.zzd = zzebk0;
        this.zzh = zzfja0;
        this.zzc = zzdrw0;
        this.zzi = zzebv0;
        this.zzj = zzfcn0;
    }

    @Override
    public final Object call() throws Exception {
        zzdnl zzdnl0 = new zzdnl(this);
        zzdnl0.zzk();
        return zzdnl0;
    }
}

