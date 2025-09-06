package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.measurement.internal.zzhy;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzlb;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@KeepForSdk
@ShowFirstParty
@Deprecated
public class AppMeasurement {
    @KeepForSdk
    @ShowFirstParty
    public static class ConditionalUserProperty {
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public boolean mActive;
        @Keep
        @NonNull
        @KeepForSdk
        @ShowFirstParty
        public String mAppId;
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public long mCreationTimestamp;
        @Keep
        @NonNull
        public String mExpiredEventName;
        @Keep
        @NonNull
        public Bundle mExpiredEventParams;
        @Keep
        @NonNull
        @KeepForSdk
        @ShowFirstParty
        public String mName;
        @Keep
        @NonNull
        @KeepForSdk
        @ShowFirstParty
        public String mOrigin;
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public long mTimeToLive;
        @Keep
        @NonNull
        public String mTimedOutEventName;
        @Keep
        @NonNull
        public Bundle mTimedOutEventParams;
        @Keep
        @NonNull
        @KeepForSdk
        @ShowFirstParty
        public String mTriggerEventName;
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public long mTriggerTimeout;
        @Keep
        @NonNull
        public String mTriggeredEventName;
        @Keep
        @NonNull
        public Bundle mTriggeredEventParams;
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public long mTriggeredTimestamp;
        @Keep
        @NonNull
        @KeepForSdk
        @ShowFirstParty
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        @VisibleForTesting
        ConditionalUserProperty(@NonNull Bundle bundle0) {
            Preconditions.checkNotNull(bundle0);
            this.mAppId = (String)zzjf.zza(bundle0, "app_id", String.class, null);
            this.mOrigin = (String)zzjf.zza(bundle0, "origin", String.class, null);
            this.mName = (String)zzjf.zza(bundle0, "name", String.class, null);
            this.mValue = zzjf.zza(bundle0, "value", Object.class, null);
            this.mTriggerEventName = (String)zzjf.zza(bundle0, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = (long)(((Long)zzjf.zza(bundle0, "trigger_timeout", Long.class, 0L)));
            this.mTimedOutEventName = (String)zzjf.zza(bundle0, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle)zzjf.zza(bundle0, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String)zzjf.zza(bundle0, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle)zzjf.zza(bundle0, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = (long)(((Long)zzjf.zza(bundle0, "time_to_live", Long.class, 0L)));
            this.mExpiredEventName = (String)zzjf.zza(bundle0, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle)zzjf.zza(bundle0, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean)zzjf.zza(bundle0, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = (long)(((Long)zzjf.zza(bundle0, "creation_timestamp", Long.class, 0L)));
            this.mTriggeredTimestamp = (long)(((Long)zzjf.zza(bundle0, "triggered_timestamp", Long.class, 0L)));
        }

        @KeepForSdk
        public ConditionalUserProperty(@NonNull ConditionalUserProperty appMeasurement$ConditionalUserProperty0) {
            Preconditions.checkNotNull(appMeasurement$ConditionalUserProperty0);
            this.mAppId = appMeasurement$ConditionalUserProperty0.mAppId;
            this.mOrigin = appMeasurement$ConditionalUserProperty0.mOrigin;
            this.mCreationTimestamp = appMeasurement$ConditionalUserProperty0.mCreationTimestamp;
            this.mName = appMeasurement$ConditionalUserProperty0.mName;
            Object object0 = appMeasurement$ConditionalUserProperty0.mValue;
            if(object0 != null) {
                Object object1 = zzlh.zza(object0);
                this.mValue = object1;
                if(object1 == null) {
                    this.mValue = appMeasurement$ConditionalUserProperty0.mValue;
                }
            }
            this.mActive = appMeasurement$ConditionalUserProperty0.mActive;
            this.mTriggerEventName = appMeasurement$ConditionalUserProperty0.mTriggerEventName;
            this.mTriggerTimeout = appMeasurement$ConditionalUserProperty0.mTriggerTimeout;
            this.mTimedOutEventName = appMeasurement$ConditionalUserProperty0.mTimedOutEventName;
            if(appMeasurement$ConditionalUserProperty0.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(appMeasurement$ConditionalUserProperty0.mTimedOutEventParams);
            }
            this.mTriggeredEventName = appMeasurement$ConditionalUserProperty0.mTriggeredEventName;
            if(appMeasurement$ConditionalUserProperty0.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(appMeasurement$ConditionalUserProperty0.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = appMeasurement$ConditionalUserProperty0.mTriggeredTimestamp;
            this.mTimeToLive = appMeasurement$ConditionalUserProperty0.mTimeToLive;
            this.mExpiredEventName = appMeasurement$ConditionalUserProperty0.mExpiredEventName;
            if(appMeasurement$ConditionalUserProperty0.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(appMeasurement$ConditionalUserProperty0.mExpiredEventParams);
            }
        }
    }

    @KeepForSdk
    @ShowFirstParty
    public interface EventInterceptor extends zzjm {
        @Override  // com.google.android.gms.measurement.internal.zzjm
        @WorkerThread
        @KeepForSdk
        @ShowFirstParty
        void interceptEvent(@NonNull String arg1, @NonNull String arg2, @NonNull Bundle arg3, long arg4);
    }

    @KeepForSdk
    @ShowFirstParty
    public interface OnEventListener extends zzjl {
        @Override  // com.google.android.gms.measurement.internal.zzjl
        @WorkerThread
        @KeepForSdk
        @ShowFirstParty
        void onEvent(@NonNull String arg1, @NonNull String arg2, @NonNull Bundle arg3, long arg4);
    }

    static abstract class zza implements zzlb {
        private zza() {
        }

        zza(zzc zzc0) {
        }

        abstract Boolean zza();

        abstract Map zza(boolean arg1);

        abstract Double zzb();

        abstract Integer zzc();

        abstract Long zzd();

        abstract String zze();
    }

    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final String CRASH_ORIGIN = "crash";
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final String FCM_ORIGIN = "fcm";
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final String FIAM_ORIGIN = "fiam";
    private static volatile AppMeasurement zza;
    private final zza zzb;

    private AppMeasurement(zzhy zzhy0) {
        this.zzb = new zzb(zzhy0);
    }

    private AppMeasurement(zzlb zzlb0) {
        this.zzb = new com.google.android.gms.measurement.zza(zzlb0);
    }

    @Keep
    public void beginAdUnitExposure(@NonNull @Size(min = 1L) String s) {
        this.zzb.zzb(s);
    }

    @Keep
    @KeepForSdk
    @ShowFirstParty
    public void clearConditionalUserProperty(@NonNull @Size(max = 24L, min = 1L) String s, @NonNull String s1, @NonNull Bundle bundle0) {
        this.zzb.zza(s, s1, bundle0);
    }

    @Keep
    public void endAdUnitExposure(@NonNull @Size(min = 1L) String s) {
        this.zzb.zzc(s);
    }

    @Keep
    public long generateEventId() {
        return this.zzb.zzf();
    }

    @Keep
    @NonNull
    public String getAppInstanceId() {
        return this.zzb.zzg();
    }

    @NonNull
    @KeepForSdk
    public Boolean getBoolean() {
        return this.zzb.zza();
    }

    @Keep
    @NonNull
    @WorkerThread
    @KeepForSdk
    @ShowFirstParty
    public List getConditionalUserProperties(@NonNull String s, @NonNull @Size(max = 23L, min = 1L) String s1) {
        List list0 = this.zzb.zza(s, s1);
        List list1 = new ArrayList((list0 == null ? 0 : list0.size()));
        for(Object object0: list0) {
            ((ArrayList)list1).add(new ConditionalUserProperty(((Bundle)object0)));
        }
        return list1;
    }

    @Keep
    @NonNull
    public String getCurrentScreenClass() {
        return this.zzb.zzh();
    }

    @Keep
    @NonNull
    public String getCurrentScreenName() {
        return this.zzb.zzi();
    }

    @NonNull
    @KeepForSdk
    public Double getDouble() {
        return this.zzb.zzb();
    }

    @Keep
    @NonNull
    public String getGmpAppId() {
        return this.zzb.zzj();
    }

    @Keep
    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    @ShowFirstParty
    @Deprecated
    public static AppMeasurement getInstance(@NonNull Context context0) {
        return AppMeasurement.zza(context0, null, null);
    }

    @NonNull
    @KeepForSdk
    public Integer getInteger() {
        return this.zzb.zzc();
    }

    @NonNull
    @KeepForSdk
    public Long getLong() {
        return this.zzb.zzd();
    }

    @Keep
    @WorkerThread
    @KeepForSdk
    @ShowFirstParty
    public int getMaxUserProperties(@NonNull @Size(min = 1L) String s) {
        return this.zzb.zza(s);
    }

    @NonNull
    @KeepForSdk
    public String getString() {
        return this.zzb.zze();
    }

    @Keep
    @NonNull
    @VisibleForTesting
    @WorkerThread
    protected Map getUserProperties(@NonNull String s, @NonNull @Size(max = 24L, min = 1L) String s1, boolean z) {
        return this.zzb.zza(s, s1, z);
    }

    @NonNull
    @WorkerThread
    @KeepForSdk
    @ShowFirstParty
    public Map getUserProperties(boolean z) {
        return this.zzb.zza(z);
    }

    @Keep
    @ShowFirstParty
    public void logEventInternal(@NonNull String s, @NonNull String s1, @NonNull Bundle bundle0) {
        this.zzb.zzb(s, s1, bundle0);
    }

    @KeepForSdk
    @ShowFirstParty
    public void logEventInternalNoInterceptor(@NonNull String s, @NonNull String s1, @NonNull Bundle bundle0, long v) {
        this.zzb.zza(s, s1, bundle0, v);
    }

    @KeepForSdk
    @ShowFirstParty
    public void registerOnMeasurementEventListener(@NonNull OnEventListener appMeasurement$OnEventListener0) {
        this.zzb.zza(appMeasurement$OnEventListener0);
    }

    @Keep
    @KeepForSdk
    @ShowFirstParty
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty appMeasurement$ConditionalUserProperty0) {
        Preconditions.checkNotNull(appMeasurement$ConditionalUserProperty0);
        zza appMeasurement$zza0 = this.zzb;
        Bundle bundle0 = new Bundle();
        String s = appMeasurement$ConditionalUserProperty0.mAppId;
        if(s != null) {
            bundle0.putString("app_id", s);
        }
        String s1 = appMeasurement$ConditionalUserProperty0.mOrigin;
        if(s1 != null) {
            bundle0.putString("origin", s1);
        }
        String s2 = appMeasurement$ConditionalUserProperty0.mName;
        if(s2 != null) {
            bundle0.putString("name", s2);
        }
        Object object0 = appMeasurement$ConditionalUserProperty0.mValue;
        if(object0 != null) {
            zzjf.zza(bundle0, object0);
        }
        String s3 = appMeasurement$ConditionalUserProperty0.mTriggerEventName;
        if(s3 != null) {
            bundle0.putString("trigger_event_name", s3);
        }
        bundle0.putLong("trigger_timeout", appMeasurement$ConditionalUserProperty0.mTriggerTimeout);
        String s4 = appMeasurement$ConditionalUserProperty0.mTimedOutEventName;
        if(s4 != null) {
            bundle0.putString("timed_out_event_name", s4);
        }
        Bundle bundle1 = appMeasurement$ConditionalUserProperty0.mTimedOutEventParams;
        if(bundle1 != null) {
            bundle0.putBundle("timed_out_event_params", bundle1);
        }
        String s5 = appMeasurement$ConditionalUserProperty0.mTriggeredEventName;
        if(s5 != null) {
            bundle0.putString("triggered_event_name", s5);
        }
        Bundle bundle2 = appMeasurement$ConditionalUserProperty0.mTriggeredEventParams;
        if(bundle2 != null) {
            bundle0.putBundle("triggered_event_params", bundle2);
        }
        bundle0.putLong("time_to_live", appMeasurement$ConditionalUserProperty0.mTimeToLive);
        String s6 = appMeasurement$ConditionalUserProperty0.mExpiredEventName;
        if(s6 != null) {
            bundle0.putString("expired_event_name", s6);
        }
        Bundle bundle3 = appMeasurement$ConditionalUserProperty0.mExpiredEventParams;
        if(bundle3 != null) {
            bundle0.putBundle("expired_event_params", bundle3);
        }
        bundle0.putLong("creation_timestamp", appMeasurement$ConditionalUserProperty0.mCreationTimestamp);
        bundle0.putBoolean("active", appMeasurement$ConditionalUserProperty0.mActive);
        bundle0.putLong("triggered_timestamp", appMeasurement$ConditionalUserProperty0.mTriggeredTimestamp);
        appMeasurement$zza0.zza(bundle0);
    }

    @WorkerThread
    @KeepForSdk
    @ShowFirstParty
    public void setEventInterceptor(@NonNull EventInterceptor appMeasurement$EventInterceptor0) {
        this.zzb.zza(appMeasurement$EventInterceptor0);
    }

    @KeepForSdk
    @ShowFirstParty
    public void unregisterOnMeasurementEventListener(@NonNull OnEventListener appMeasurement$OnEventListener0) {
        this.zzb.zzb(appMeasurement$OnEventListener0);
    }

    @VisibleForTesting
    private static AppMeasurement zza(Context context0, String s, String s1) {
        if(AppMeasurement.zza == null) {
            Class class0 = AppMeasurement.class;
            synchronized(class0) {
                if(AppMeasurement.zza == null) {
                    zzlb zzlb0 = AppMeasurement.zza(context0, null);
                    AppMeasurement.zza = zzlb0 == null ? new AppMeasurement(zzhy.zza(context0, new zzdw(0L, 0L, true, null, null, null, null, null), null)) : new AppMeasurement(zzlb0);
                }
            }
        }
        return AppMeasurement.zza;
    }

    private static zzlb zza(Context context0, Bundle bundle0) {
        try {
            return FirebaseAnalytics.getScionFrontendApiImplementation(context0, null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

