package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

public final class zzbot extends zzcgs {
    private final AppMeasurementSdk zza;

    zzbot(AppMeasurementSdk appMeasurementSdk0) {
        this.zza = appMeasurementSdk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final int zzb(String s) throws RemoteException {
        return this.zza.getMaxUserProperties(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final long zzc() throws RemoteException {
        return this.zza.generateEventId();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final Bundle zzd(Bundle bundle0) throws RemoteException {
        return this.zza.performActionWithResponse(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final String zze() throws RemoteException {
        return this.zza.getAppIdOrigin();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final String zzf() throws RemoteException {
        return this.zza.getAppInstanceId();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final String zzg() throws RemoteException {
        return this.zza.getCurrentScreenClass();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final String zzh() throws RemoteException {
        return this.zza.getCurrentScreenName();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final String zzi() throws RemoteException {
        return this.zza.getGmpAppId();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final List zzj(String s, String s1) throws RemoteException {
        return this.zza.getConditionalUserProperties(s, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final Map zzk(String s, String s1, boolean z) throws RemoteException {
        return this.zza.getUserProperties(s, s1, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final void zzl(String s) throws RemoteException {
        this.zza.beginAdUnitExposure(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final void zzm(String s, String s1, Bundle bundle0) throws RemoteException {
        this.zza.clearConditionalUserProperty(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final void zzn(String s) throws RemoteException {
        this.zza.endAdUnitExposure(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final void zzo(String s, String s1, Bundle bundle0) throws RemoteException {
        this.zza.logEvent(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final void zzp(Bundle bundle0) throws RemoteException {
        this.zza.performAction(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final void zzq(Bundle bundle0) throws RemoteException {
        this.zza.setConditionalUserProperty(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final void zzr(Bundle bundle0) throws RemoteException {
        this.zza.setConsent(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final void zzs(IObjectWrapper iObjectWrapper0, String s, String s1) throws RemoteException {
        Activity activity0 = iObjectWrapper0 == null ? null : ((Activity)ObjectWrapper.unwrap(iObjectWrapper0));
        this.zza.setCurrentScreen(activity0, s, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final void zzt(String s, String s1, IObjectWrapper iObjectWrapper0) throws RemoteException {
        Object object0 = iObjectWrapper0 == null ? null : ObjectWrapper.unwrap(iObjectWrapper0);
        this.zza.setUserProperty(s, s1, object0);
    }
}

