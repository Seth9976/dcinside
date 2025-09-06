package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zzdp;
import com.google.android.gms.internal.measurement.zzdu;
import com.google.android.gms.internal.measurement.zzdw;
import h4.d;
import java.util.Map;

@DynamiteApi
public class AppMeasurementDynamiteService extends zzdm {
    final class zza implements zzjm {
        private zzdp zza;
        private final AppMeasurementDynamiteService zzb;

        zza(zzdp zzdp0) {
            this.zza = zzdp0;
        }

        @Override  // com.google.android.gms.measurement.internal.zzjm
        public final void interceptEvent(String s, String s1, Bundle bundle0, long v) {
            try {
                this.zza.zza(s, s1, bundle0, v);
            }
            catch(RemoteException remoteException0) {
                zzhy zzhy0 = AppMeasurementDynamiteService.this.zza;
                if(zzhy0 != null) {
                    zzhy0.zzj().zzu().zza("Event interceptor threw exception", remoteException0);
                }
            }
        }
    }

    final class zzb implements zzjl {
        private zzdp zza;
        private final AppMeasurementDynamiteService zzb;

        zzb(zzdp zzdp0) {
            this.zza = zzdp0;
        }

        @Override  // com.google.android.gms.measurement.internal.zzjl
        public final void onEvent(String s, String s1, Bundle bundle0, long v) {
            try {
                this.zza.zza(s, s1, bundle0, v);
            }
            catch(RemoteException remoteException0) {
                zzhy zzhy0 = AppMeasurementDynamiteService.this.zza;
                if(zzhy0 != null) {
                    zzhy0.zzj().zzu().zza("Event listener threw exception", remoteException0);
                }
            }
        }
    }

    @VisibleForTesting
    zzhy zza;
    @GuardedBy("listenerMap")
    private final Map zzb;

    public AppMeasurementDynamiteService() {
        this.zza = null;
        this.zzb = new ArrayMap();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void beginAdUnitExposure(@NonNull String s, long v) throws RemoteException {
        this.zza();
        this.zza.zze().zza(s, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void clearConditionalUserProperty(@NonNull String s, @NonNull String s1, @NonNull Bundle bundle0) throws RemoteException {
        this.zza();
        this.zza.zzp().zza(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void clearMeasurementEnabled(long v) throws RemoteException {
        this.zza();
        this.zza.zzp().zza(null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void endAdUnitExposure(@NonNull String s, long v) throws RemoteException {
        this.zza();
        this.zza.zze().zzb(s, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void generateEventId(zzdo zzdo0) throws RemoteException {
        this.zza();
        long v = this.zza.zzt().zzn();
        this.zza();
        this.zza.zzt().zza(zzdo0, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void getAppInstanceId(zzdo zzdo0) throws RemoteException {
        this.zza();
        this.zza.zzl().zzb(new zzi(this, zzdo0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void getCachedAppInstanceId(zzdo zzdo0) throws RemoteException {
        this.zza();
        this.zza(zzdo0, this.zza.zzp().zzag());
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void getConditionalUserProperties(String s, String s1, zzdo zzdo0) throws RemoteException {
        this.zza();
        this.zza.zzl().zzb(new zzl(this, zzdo0, s, s1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void getCurrentScreenClass(zzdo zzdo0) throws RemoteException {
        this.zza();
        this.zza(zzdo0, this.zza.zzp().zzah());
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void getCurrentScreenName(zzdo zzdo0) throws RemoteException {
        this.zza();
        this.zza(zzdo0, this.zza.zzp().zzai());
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void getGmpAppId(zzdo zzdo0) throws RemoteException {
        this.zza();
        this.zza(zzdo0, this.zza.zzp().zzaj());
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void getMaxUserProperties(String s, zzdo zzdo0) throws RemoteException {
        this.zza();
        this.zza.zzp();
        zzjq.zza(s);
        this.zza();
        this.zza.zzt().zza(zzdo0, 25);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void getSessionId(zzdo zzdo0) throws RemoteException {
        this.zza();
        this.zza.zzp().zza(zzdo0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void getTestFlag(zzdo zzdo0, int v) throws RemoteException {
        this.zza();
        switch(v) {
            case 0: {
                this.zza.zzt().zza(zzdo0, this.zza.zzp().zzak());
                return;
            }
            case 1: {
                this.zza.zzt().zza(zzdo0, ((long)this.zza.zzp().zzaf()));
                return;
            }
            case 2: {
                zzos zzos0 = this.zza.zzt();
                double f = (double)this.zza.zzp().zzad();
                Bundle bundle0 = new Bundle();
                bundle0.putDouble("r", f);
                try {
                    zzdo0.zza(bundle0);
                }
                catch(RemoteException remoteException0) {
                    zzos0.zzu.zzj().zzu().zza("Error returning double value to wrapper", remoteException0);
                }
                return;
            }
            case 3: {
                this.zza.zzt().zza(zzdo0, ((int)this.zza.zzp().zzae()));
                return;
            }
            case 4: {
                this.zza.zzt().zza(zzdo0, this.zza.zzp().zzac().booleanValue());
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void getUserProperties(String s, String s1, boolean z, zzdo zzdo0) throws RemoteException {
        this.zza();
        this.zza.zzl().zzb(new zzj(this, zzdo0, s, s1, z));
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void initForTests(@NonNull Map map0) throws RemoteException {
        this.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void initialize(IObjectWrapper iObjectWrapper0, zzdw zzdw0, long v) throws RemoteException {
        zzhy zzhy0 = this.zza;
        if(zzhy0 == null) {
            this.zza = zzhy.zza(((Context)Preconditions.checkNotNull(((Context)ObjectWrapper.unwrap(iObjectWrapper0)))), zzdw0, v);
            return;
        }
        zzhy0.zzj().zzu().zza("Attempting to initialize multiple times");
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void isDataCollectionEnabled(zzdo zzdo0) throws RemoteException {
        this.zza();
        this.zza.zzl().zzb(new zzn(this, zzdo0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void logEvent(@NonNull String s, @NonNull String s1, @NonNull Bundle bundle0, boolean z, boolean z1, long v) throws RemoteException {
        this.zza();
        this.zza.zzp().zza(s, s1, bundle0, z, z1, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void logEventAndBundle(String s, String s1, Bundle bundle0, zzdo zzdo0, long v) throws RemoteException {
        this.zza();
        Preconditions.checkNotEmpty(s1);
        (bundle0 == null ? new Bundle() : new Bundle(bundle0)).putString("_o", "app");
        zzbf zzbf0 = new zzbf(s1, new zzbe(bundle0), "app", v);
        this.zza.zzl().zzb(new zzk(this, zzdo0, zzbf0, s));
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void logHealthData(int v, @NonNull String s, @NonNull IObjectWrapper iObjectWrapper0, @NonNull IObjectWrapper iObjectWrapper1, @NonNull IObjectWrapper iObjectWrapper2) throws RemoteException {
        this.zza();
        Object object0 = null;
        Object object1 = iObjectWrapper0 == null ? null : ObjectWrapper.unwrap(iObjectWrapper0);
        Object object2 = iObjectWrapper1 == null ? null : ObjectWrapper.unwrap(iObjectWrapper1);
        if(iObjectWrapper2 != null) {
            object0 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        this.zza.zzj().zza(v, true, false, s, object1, object2, object0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper0, @NonNull Bundle bundle0, long v) throws RemoteException {
        this.zza();
        Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0 = this.zza.zzp().zzaa();
        if(application$ActivityLifecycleCallbacks0 != null) {
            this.zza.zzp().zzao();
            application$ActivityLifecycleCallbacks0.onActivityCreated(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)), bundle0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.zza();
        Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0 = this.zza.zzp().zzaa();
        if(application$ActivityLifecycleCallbacks0 != null) {
            this.zza.zzp().zzao();
            application$ActivityLifecycleCallbacks0.onActivityDestroyed(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.zza();
        Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0 = this.zza.zzp().zzaa();
        if(application$ActivityLifecycleCallbacks0 != null) {
            this.zza.zzp().zzao();
            application$ActivityLifecycleCallbacks0.onActivityPaused(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.zza();
        Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0 = this.zza.zzp().zzaa();
        if(application$ActivityLifecycleCallbacks0 != null) {
            this.zza.zzp().zzao();
            application$ActivityLifecycleCallbacks0.onActivityResumed(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper0, zzdo zzdo0, long v) throws RemoteException {
        this.zza();
        Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0 = this.zza.zzp().zzaa();
        Bundle bundle0 = new Bundle();
        if(application$ActivityLifecycleCallbacks0 != null) {
            this.zza.zzp().zzao();
            application$ActivityLifecycleCallbacks0.onActivitySaveInstanceState(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)), bundle0);
        }
        try {
            zzdo0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zza.zzj().zzu().zza("Error returning bundle value to wrapper", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.zza();
        Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0 = this.zza.zzp().zzaa();
        if(application$ActivityLifecycleCallbacks0 != null) {
            this.zza.zzp().zzao();
            application$ActivityLifecycleCallbacks0.onActivityStarted(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.zza();
        Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0 = this.zza.zzp().zzaa();
        if(application$ActivityLifecycleCallbacks0 != null) {
            this.zza.zzp().zzao();
            application$ActivityLifecycleCallbacks0.onActivityStopped(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void performAction(Bundle bundle0, zzdo zzdo0, long v) throws RemoteException {
        this.zza();
        zzdo0.zza(null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void registerOnMeasurementEventListener(zzdp zzdp0) throws RemoteException {
        zzjl zzjl0;
        this.zza();
        synchronized(this.zzb) {
            Integer integer0 = zzdp0.zza();
            zzjl0 = (zzjl)this.zzb.get(integer0);
            if(zzjl0 == null) {
                zzjl0 = new zzb(this, zzdp0);
                Integer integer1 = zzdp0.zza();
                this.zzb.put(integer1, zzjl0);
            }
        }
        this.zza.zzp().zza(zzjl0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void resetAnalyticsData(long v) throws RemoteException {
        this.zza();
        this.zza.zzp().zza(v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setConditionalUserProperty(@NonNull Bundle bundle0, long v) throws RemoteException {
        this.zza();
        if(bundle0 == null) {
            this.zza.zzj().zzg().zza("Conditional user property must not be null");
            return;
        }
        this.zza.zzp().zzb(bundle0, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setConsent(@NonNull Bundle bundle0, long v) throws RemoteException {
        this.zza();
        this.zza.zzp().zzc(bundle0, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setConsentThirdParty(@NonNull Bundle bundle0, long v) throws RemoteException {
        this.zza();
        this.zza.zzp().zzd(bundle0, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper0, @NonNull String s, @NonNull String s1, long v) throws RemoteException {
        this.zza();
        this.zza.zzq().zza(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)), s, s1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        this.zza();
        this.zza.zzp().zzc(z);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setDefaultEventParameters(@NonNull Bundle bundle0) {
        this.zza();
        this.zza.zzp().zzc(bundle0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setEventInterceptor(zzdp zzdp0) throws RemoteException {
        this.zza();
        zza appMeasurementDynamiteService$zza0 = new zza(this, zzdp0);
        if(this.zza.zzl().zzg()) {
            this.zza.zzp().zza(appMeasurementDynamiteService$zza0);
            return;
        }
        this.zza.zzl().zzb(new zzm(this, appMeasurementDynamiteService$zza0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setInstanceIdProvider(zzdu zzdu0) throws RemoteException {
        this.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setMeasurementEnabled(boolean z, long v) throws RemoteException {
        this.zza();
        this.zza.zzp().zza(Boolean.valueOf(z));
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setMinimumSessionDuration(long v) throws RemoteException {
        this.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setSessionTimeoutDuration(long v) throws RemoteException {
        this.zza();
        this.zza.zzp().zzc(v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setSgtmDebugInfo(@NonNull Intent intent0) throws RemoteException {
        this.zza();
        this.zza.zzp().zza(intent0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setUserId(@NonNull String s, long v) throws RemoteException {
        this.zza();
        this.zza.zzp().zza(s, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void setUserProperty(@NonNull String s, @NonNull String s1, @NonNull IObjectWrapper iObjectWrapper0, boolean z, long v) throws RemoteException {
        this.zza();
        Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
        this.zza.zzp().zza(s, s1, object0, z, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdj
    public void unregisterOnMeasurementEventListener(zzdp zzdp0) throws RemoteException {
        zzjl zzjl0;
        this.zza();
        synchronized(this.zzb) {
            Integer integer0 = zzdp0.zza();
            zzjl0 = (zzjl)this.zzb.remove(integer0);
        }
        if(zzjl0 == null) {
            zzjl0 = new zzb(this, zzdp0);
        }
        this.zza.zzp().zzb(zzjl0);
    }

    @d({"scion"})
    private final void zza() {
        if(this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zza(zzdo zzdo0, String s) {
        this.zza();
        this.zza.zzt().zza(zzdo0, s);
    }
}

