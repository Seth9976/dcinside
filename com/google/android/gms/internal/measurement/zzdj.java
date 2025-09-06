package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public interface zzdj extends IInterface {
    void beginAdUnitExposure(String arg1, long arg2) throws RemoteException;

    void clearConditionalUserProperty(String arg1, String arg2, Bundle arg3) throws RemoteException;

    void clearMeasurementEnabled(long arg1) throws RemoteException;

    void endAdUnitExposure(String arg1, long arg2) throws RemoteException;

    void generateEventId(zzdo arg1) throws RemoteException;

    void getAppInstanceId(zzdo arg1) throws RemoteException;

    void getCachedAppInstanceId(zzdo arg1) throws RemoteException;

    void getConditionalUserProperties(String arg1, String arg2, zzdo arg3) throws RemoteException;

    void getCurrentScreenClass(zzdo arg1) throws RemoteException;

    void getCurrentScreenName(zzdo arg1) throws RemoteException;

    void getGmpAppId(zzdo arg1) throws RemoteException;

    void getMaxUserProperties(String arg1, zzdo arg2) throws RemoteException;

    void getSessionId(zzdo arg1) throws RemoteException;

    void getTestFlag(zzdo arg1, int arg2) throws RemoteException;

    void getUserProperties(String arg1, String arg2, boolean arg3, zzdo arg4) throws RemoteException;

    void initForTests(Map arg1) throws RemoteException;

    void initialize(IObjectWrapper arg1, zzdw arg2, long arg3) throws RemoteException;

    void isDataCollectionEnabled(zzdo arg1) throws RemoteException;

    void logEvent(String arg1, String arg2, Bundle arg3, boolean arg4, boolean arg5, long arg6) throws RemoteException;

    void logEventAndBundle(String arg1, String arg2, Bundle arg3, zzdo arg4, long arg5) throws RemoteException;

    void logHealthData(int arg1, String arg2, IObjectWrapper arg3, IObjectWrapper arg4, IObjectWrapper arg5) throws RemoteException;

    void onActivityCreated(IObjectWrapper arg1, Bundle arg2, long arg3) throws RemoteException;

    void onActivityDestroyed(IObjectWrapper arg1, long arg2) throws RemoteException;

    void onActivityPaused(IObjectWrapper arg1, long arg2) throws RemoteException;

    void onActivityResumed(IObjectWrapper arg1, long arg2) throws RemoteException;

    void onActivitySaveInstanceState(IObjectWrapper arg1, zzdo arg2, long arg3) throws RemoteException;

    void onActivityStarted(IObjectWrapper arg1, long arg2) throws RemoteException;

    void onActivityStopped(IObjectWrapper arg1, long arg2) throws RemoteException;

    void performAction(Bundle arg1, zzdo arg2, long arg3) throws RemoteException;

    void registerOnMeasurementEventListener(zzdp arg1) throws RemoteException;

    void resetAnalyticsData(long arg1) throws RemoteException;

    void setConditionalUserProperty(Bundle arg1, long arg2) throws RemoteException;

    void setConsent(Bundle arg1, long arg2) throws RemoteException;

    void setConsentThirdParty(Bundle arg1, long arg2) throws RemoteException;

    void setCurrentScreen(IObjectWrapper arg1, String arg2, String arg3, long arg4) throws RemoteException;

    void setDataCollectionEnabled(boolean arg1) throws RemoteException;

    void setDefaultEventParameters(Bundle arg1) throws RemoteException;

    void setEventInterceptor(zzdp arg1) throws RemoteException;

    void setInstanceIdProvider(zzdu arg1) throws RemoteException;

    void setMeasurementEnabled(boolean arg1, long arg2) throws RemoteException;

    void setMinimumSessionDuration(long arg1) throws RemoteException;

    void setSessionTimeoutDuration(long arg1) throws RemoteException;

    void setSgtmDebugInfo(Intent arg1) throws RemoteException;

    void setUserId(String arg1, long arg2) throws RemoteException;

    void setUserProperty(String arg1, String arg2, IObjectWrapper arg3, boolean arg4, long arg5) throws RemoteException;

    void unregisterOnMeasurementEventListener(zzdp arg1) throws RemoteException;
}

