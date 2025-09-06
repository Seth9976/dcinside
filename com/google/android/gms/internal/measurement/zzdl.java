package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public final class zzdl extends zzbu implements zzdj {
    zzdl(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void beginAdUnitExposure(String s, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeLong(v);
        this.zzb(23, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void clearConditionalUserProperty(String s, String s1, Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, bundle0);
        this.zzb(9, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void clearMeasurementEnabled(long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeLong(v);
        this.zzb(43, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void endAdUnitExposure(String s, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeLong(v);
        this.zzb(24, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void generateEventId(zzdo zzdo0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdo0);
        this.zzb(22, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void getAppInstanceId(zzdo zzdo0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdo0);
        this.zzb(20, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void getCachedAppInstanceId(zzdo zzdo0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdo0);
        this.zzb(19, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void getConditionalUserProperties(String s, String s1, zzdo zzdo0) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, zzdo0);
        this.zzb(10, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void getCurrentScreenClass(zzdo zzdo0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdo0);
        this.zzb(17, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void getCurrentScreenName(zzdo zzdo0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdo0);
        this.zzb(16, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void getGmpAppId(zzdo zzdo0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdo0);
        this.zzb(21, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void getMaxUserProperties(String s, zzdo zzdo0) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        zzbw.zza(parcel0, zzdo0);
        this.zzb(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void getSessionId(zzdo zzdo0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdo0);
        this.zzb(46, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void getTestFlag(zzdo zzdo0, int v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdo0);
        parcel0.writeInt(v);
        this.zzb(38, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void getUserProperties(String s, String s1, boolean z, zzdo zzdo0) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, z);
        zzbw.zza(parcel0, zzdo0);
        this.zzb(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void initForTests(Map map0) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeMap(map0);
        this.zzb(37, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void initialize(IObjectWrapper iObjectWrapper0, zzdw zzdw0, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        zzbw.zza(parcel0, zzdw0);
        parcel0.writeLong(v);
        this.zzb(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void isDataCollectionEnabled(zzdo zzdo0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdo0);
        this.zzb(40, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void logEvent(String s, String s1, Bundle bundle0, boolean z, boolean z1, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, bundle0);
        zzbw.zza(parcel0, z);
        zzbw.zza(parcel0, z1);
        parcel0.writeLong(v);
        this.zzb(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void logEventAndBundle(String s, String s1, Bundle bundle0, zzdo zzdo0, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, bundle0);
        zzbw.zza(parcel0, zzdo0);
        parcel0.writeLong(v);
        this.zzb(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void logHealthData(int v, String s, IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeInt(v);
        parcel0.writeString(s);
        zzbw.zza(parcel0, iObjectWrapper0);
        zzbw.zza(parcel0, iObjectWrapper1);
        zzbw.zza(parcel0, iObjectWrapper2);
        this.zzb(33, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityCreated(IObjectWrapper iObjectWrapper0, Bundle bundle0, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        zzbw.zza(parcel0, bundle0);
        parcel0.writeLong(v);
        this.zzb(27, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.zzb(28, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityPaused(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.zzb(29, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityResumed(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.zzb(30, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper0, zzdo zzdo0, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        zzbw.zza(parcel0, zzdo0);
        parcel0.writeLong(v);
        this.zzb(0x1F, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityStarted(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.zzb(25, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityStopped(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.zzb(26, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void performAction(Bundle bundle0, zzdo zzdo0, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        zzbw.zza(parcel0, zzdo0);
        parcel0.writeLong(v);
        this.zzb(0x20, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void registerOnMeasurementEventListener(zzdp zzdp0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdp0);
        this.zzb(35, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void resetAnalyticsData(long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeLong(v);
        this.zzb(12, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setConditionalUserProperty(Bundle bundle0, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        parcel0.writeLong(v);
        this.zzb(8, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setConsent(Bundle bundle0, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        parcel0.writeLong(v);
        this.zzb(44, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setConsentThirdParty(Bundle bundle0, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        parcel0.writeLong(v);
        this.zzb(45, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper0, String s, String s1, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeLong(v);
        this.zzb(15, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, z);
        this.zzb(39, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setDefaultEventParameters(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        this.zzb(42, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setEventInterceptor(zzdp zzdp0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdp0);
        this.zzb(34, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setInstanceIdProvider(zzdu zzdu0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdu0);
        this.zzb(18, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setMeasurementEnabled(boolean z, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, z);
        parcel0.writeLong(v);
        this.zzb(11, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setMinimumSessionDuration(long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeLong(v);
        this.zzb(13, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setSessionTimeoutDuration(long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeLong(v);
        this.zzb(14, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setSgtmDebugInfo(Intent intent0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, intent0);
        this.zzb(0x30, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setUserId(String s, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeLong(v);
        this.zzb(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void setUserProperty(String s, String s1, IObjectWrapper iObjectWrapper0, boolean z, long v) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, iObjectWrapper0);
        zzbw.zza(parcel0, z);
        parcel0.writeLong(v);
        this.zzb(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public final void unregisterOnMeasurementEventListener(zzdp zzdp0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdp0);
        this.zzb(36, parcel0);
    }
}

