package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdOrientation;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzbal {
    private zzby zza;
    private final Context zzb;
    private final String zzc;
    private final zzei zzd;
    @AppOpenAdOrientation
    private final int zze;
    private final AppOpenAdLoadCallback zzf;
    private final zzbpa zzg;
    private final zzr zzh;

    public zzbal(Context context0, String s, zzei zzei0, @AppOpenAdOrientation int v, AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0) {
        this.zzg = new zzbpa();
        this.zzb = context0;
        this.zzc = s;
        this.zzd = zzei0;
        this.zze = v;
        this.zzf = appOpenAd$AppOpenAdLoadCallback0;
        this.zzh = zzr.zza;
    }

    public final void zza() {
        try {
            long v = System.currentTimeMillis();
            zzs zzs0 = zzs.zzb();
            zzby zzby0 = zzbc.zza().zze(this.zzb, zzs0, this.zzc, this.zzg);
            this.zza = zzby0;
            if(zzby0 != null) {
                if(this.zze != 3) {
                    zzy zzy0 = new zzy(this.zze);
                    this.zza.zzI(zzy0);
                }
                this.zzd.zzq(v);
                this.zza.zzH(new zzazy(this.zzf, this.zzc));
                this.zza.zzab(this.zzh.zza(this.zzb, this.zzd));
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzl("#007 Could not call remote method.", remoteException0);
    }
}

