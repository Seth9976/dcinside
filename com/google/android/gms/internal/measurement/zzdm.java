package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;

public abstract class zzdm extends zzbx implements zzdj {
    public zzdm() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzdj asInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterface0 instanceof zzdj ? ((zzdj)iInterface0) : new zzdl(iBinder0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzbx
    protected final boolean zza(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzdo zzdo1;
        zzdo zzdo0 = null;
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzdw zzdw0 = (zzdw)zzbw.zza(parcel0, zzdw.CREATOR);
                long v2 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.initialize(iObjectWrapper0, zzdw0, v2);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                Bundle bundle0 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                boolean z = zzbw.zzc(parcel0);
                boolean z1 = zzbw.zzc(parcel0);
                long v3 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.logEvent(s, s1, bundle0, z, z1, v3);
                break;
            }
            case 3: {
                String s2 = parcel0.readString();
                String s3 = parcel0.readString();
                Bundle bundle1 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzdo1 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo zzdo2 = iInterface0 instanceof zzdo ? ((zzdo)iInterface0) : new zzdq(iBinder0);
                    zzdo1 = zzdo2;
                }
                long v4 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.logEventAndBundle(s2, s3, bundle1, zzdo1, v4);
                break;
            }
            case 4: {
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                boolean z2 = zzbw.zzc(parcel0);
                long v5 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.setUserProperty(s4, s5, iObjectWrapper1, z2, v5);
                break;
            }
            case 5: {
                String s6 = parcel0.readString();
                String s7 = parcel0.readString();
                boolean z3 = zzbw.zzc(parcel0);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface1 instanceof zzdo ? ((zzdo)iInterface1) : new zzdq(iBinder1);
                }
                zzbw.zzb(parcel0);
                this.getUserProperties(s6, s7, z3, zzdo0);
                break;
            }
            case 6: {
                String s8 = parcel0.readString();
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface2 instanceof zzdo ? ((zzdo)iInterface2) : new zzdq(iBinder2);
                }
                zzbw.zzb(parcel0);
                this.getMaxUserProperties(s8, zzdo0);
                break;
            }
            case 7: {
                String s9 = parcel0.readString();
                long v6 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.setUserId(s9, v6);
                break;
            }
            case 8: {
                Bundle bundle2 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                long v7 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.setConditionalUserProperty(bundle2, v7);
                break;
            }
            case 9: {
                String s10 = parcel0.readString();
                String s11 = parcel0.readString();
                Bundle bundle3 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                zzbw.zzb(parcel0);
                this.clearConditionalUserProperty(s10, s11, bundle3);
                break;
            }
            case 10: {
                String s12 = parcel0.readString();
                String s13 = parcel0.readString();
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface3 instanceof zzdo ? ((zzdo)iInterface3) : new zzdq(iBinder3);
                }
                zzbw.zzb(parcel0);
                this.getConditionalUserProperties(s12, s13, zzdo0);
                break;
            }
            case 11: {
                boolean z4 = zzbw.zzc(parcel0);
                long v8 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.setMeasurementEnabled(z4, v8);
                break;
            }
            case 12: {
                long v9 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.resetAnalyticsData(v9);
                break;
            }
            case 13: {
                long v10 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.setMinimumSessionDuration(v10);
                break;
            }
            case 14: {
                long v11 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.setSessionTimeoutDuration(v11);
                break;
            }
            case 15: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                String s14 = parcel0.readString();
                String s15 = parcel0.readString();
                long v12 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.setCurrentScreen(iObjectWrapper2, s14, s15, v12);
                break;
            }
            case 16: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface4 instanceof zzdo ? ((zzdo)iInterface4) : new zzdq(iBinder4);
                }
                zzbw.zzb(parcel0);
                this.getCurrentScreenName(zzdo0);
                break;
            }
            case 17: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface5 instanceof zzdo ? ((zzdo)iInterface5) : new zzdq(iBinder5);
                }
                zzbw.zzb(parcel0);
                this.getCurrentScreenClass(zzdo0);
                break;
            }
            case 18: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzdo0 = iInterface6 instanceof zzdu ? ((zzdu)iInterface6) : new zzdt(iBinder6);
                }
                zzbw.zzb(parcel0);
                this.setInstanceIdProvider(((zzdu)zzdo0));
                break;
            }
            case 19: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface7 instanceof zzdo ? ((zzdo)iInterface7) : new zzdq(iBinder7);
                }
                zzbw.zzb(parcel0);
                this.getCachedAppInstanceId(zzdo0);
                break;
            }
            case 20: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface8 instanceof zzdo ? ((zzdo)iInterface8) : new zzdq(iBinder8);
                }
                zzbw.zzb(parcel0);
                this.getAppInstanceId(zzdo0);
                break;
            }
            case 21: {
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface9 instanceof zzdo ? ((zzdo)iInterface9) : new zzdq(iBinder9);
                }
                zzbw.zzb(parcel0);
                this.getGmpAppId(zzdo0);
                break;
            }
            case 22: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 != null) {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface10 instanceof zzdo ? ((zzdo)iInterface10) : new zzdq(iBinder10);
                }
                zzbw.zzb(parcel0);
                this.generateEventId(zzdo0);
                break;
            }
            case 23: {
                String s16 = parcel0.readString();
                long v13 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.beginAdUnitExposure(s16, v13);
                break;
            }
            case 24: {
                String s17 = parcel0.readString();
                long v14 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.endAdUnitExposure(s17, v14);
                break;
            }
            case 25: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                long v15 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.onActivityStarted(iObjectWrapper3, v15);
                break;
            }
            case 26: {
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                long v16 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.onActivityStopped(iObjectWrapper4, v16);
                break;
            }
            case 27: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                Bundle bundle4 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                long v17 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.onActivityCreated(iObjectWrapper5, bundle4, v17);
                break;
            }
            case 28: {
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                long v18 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.onActivityDestroyed(iObjectWrapper6, v18);
                break;
            }
            case 29: {
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                long v19 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.onActivityPaused(iObjectWrapper7, v19);
                break;
            }
            case 30: {
                IObjectWrapper iObjectWrapper8 = Stub.asInterface(parcel0.readStrongBinder());
                long v20 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.onActivityResumed(iObjectWrapper8, v20);
                break;
            }
            case 0x1F: {
                IObjectWrapper iObjectWrapper9 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface11 instanceof zzdo ? ((zzdo)iInterface11) : new zzdq(iBinder11);
                }
                long v21 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.onActivitySaveInstanceState(iObjectWrapper9, zzdo0, v21);
                break;
            }
            case 0x20: {
                Bundle bundle5 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 != null) {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface12 instanceof zzdo ? ((zzdo)iInterface12) : new zzdq(iBinder12);
                }
                long v22 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.performAction(bundle5, zzdo0, v22);
                break;
            }
            case 33: {
                int v23 = parcel0.readInt();
                String s18 = parcel0.readString();
                IObjectWrapper iObjectWrapper10 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper11 = Stub.asInterface(parcel0.readStrongBinder());
                IObjectWrapper iObjectWrapper12 = Stub.asInterface(parcel0.readStrongBinder());
                zzbw.zzb(parcel0);
                this.logHealthData(v23, s18, iObjectWrapper10, iObjectWrapper11, iObjectWrapper12);
                break;
            }
            case 34: {
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdo0 = iInterface13 instanceof zzdp ? ((zzdp)iInterface13) : new zzdr(iBinder13);
                }
                zzbw.zzb(parcel0);
                this.setEventInterceptor(((zzdp)zzdo0));
                break;
            }
            case 35: {
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 != null) {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdo0 = iInterface14 instanceof zzdp ? ((zzdp)iInterface14) : new zzdr(iBinder14);
                }
                zzbw.zzb(parcel0);
                this.registerOnMeasurementEventListener(((zzdp)zzdo0));
                break;
            }
            case 36: {
                IBinder iBinder15 = parcel0.readStrongBinder();
                if(iBinder15 != null) {
                    IInterface iInterface15 = iBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdo0 = iInterface15 instanceof zzdp ? ((zzdp)iInterface15) : new zzdr(iBinder15);
                }
                zzbw.zzb(parcel0);
                this.unregisterOnMeasurementEventListener(((zzdp)zzdo0));
                break;
            }
            case 37: {
                HashMap hashMap0 = zzbw.zza(parcel0);
                zzbw.zzb(parcel0);
                this.initForTests(hashMap0);
                break;
            }
            case 38: {
                IBinder iBinder16 = parcel0.readStrongBinder();
                if(iBinder16 != null) {
                    IInterface iInterface16 = iBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface16 instanceof zzdo ? ((zzdo)iInterface16) : new zzdq(iBinder16);
                }
                int v24 = parcel0.readInt();
                zzbw.zzb(parcel0);
                this.getTestFlag(zzdo0, v24);
                break;
            }
            case 39: {
                boolean z5 = zzbw.zzc(parcel0);
                zzbw.zzb(parcel0);
                this.setDataCollectionEnabled(z5);
                break;
            }
            case 40: {
                IBinder iBinder17 = parcel0.readStrongBinder();
                if(iBinder17 != null) {
                    IInterface iInterface17 = iBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface17 instanceof zzdo ? ((zzdo)iInterface17) : new zzdq(iBinder17);
                }
                zzbw.zzb(parcel0);
                this.isDataCollectionEnabled(zzdo0);
                break;
            }
            case 42: {
                Bundle bundle6 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                zzbw.zzb(parcel0);
                this.setDefaultEventParameters(bundle6);
                break;
            }
            case 43: {
                long v25 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.clearMeasurementEnabled(v25);
                break;
            }
            case 44: {
                Bundle bundle7 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                long v26 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.setConsent(bundle7, v26);
                break;
            }
            case 45: {
                Bundle bundle8 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                long v27 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.setConsentThirdParty(bundle8, v27);
                break;
            }
            case 46: {
                IBinder iBinder18 = parcel0.readStrongBinder();
                if(iBinder18 != null) {
                    IInterface iInterface18 = iBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzdo0 = iInterface18 instanceof zzdo ? ((zzdo)iInterface18) : new zzdq(iBinder18);
                }
                zzbw.zzb(parcel0);
                this.getSessionId(zzdo0);
                break;
            }
            case 0x30: {
                Intent intent0 = (Intent)zzbw.zza(parcel0, Intent.CREATOR);
                zzbw.zzb(parcel0);
                this.setSgtmDebugInfo(intent0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

