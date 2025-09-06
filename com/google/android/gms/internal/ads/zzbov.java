package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

public final class zzbov implements Runnable {
    public final Context zza;
    public final String zzb;

    public zzbov(zzbow zzbow0, Context context0, String s) {
        this.zza = context0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        Context context0 = this.zza;
        zzbcl.zza(context0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzaG)).booleanValue()) {
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("measurementEnabled", ((Boolean)zzbe.zzc().zza(zzbcl.zzav)).booleanValue());
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzaC)).booleanValue()) {
            bundle0.putString("ad_storage", "denied");
            bundle0.putString("analytics_storage", "denied");
        }
        AppMeasurementSdk appMeasurementSdk0 = AppMeasurementSdk.getInstance(context0, "FA-Ads", "am", this.zzb, bundle0);
        try {
            ((zzcgw)zzs.zzb(context0, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new zzbou())).zze(ObjectWrapper.wrap(context0), new zzbot(appMeasurementSdk0));
        }
        catch(zzr | NullPointerException | RemoteException zzr0) {
            zzo.zzl("#007 Could not call remote method.", zzr0);
        }
    }
}

