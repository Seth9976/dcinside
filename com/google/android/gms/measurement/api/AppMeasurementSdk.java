package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.List;
import java.util.Map;

@KeepForSdk
@ShowFirstParty
public class AppMeasurementSdk {
    @KeepForSdk
    public static final class ConditionalUserProperty {
        @NonNull
        @KeepForSdk
        public static final String ACTIVE = "active";
        @NonNull
        @KeepForSdk
        public static final String CREATION_TIMESTAMP = "creation_timestamp";
        @NonNull
        @KeepForSdk
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";
        @NonNull
        @KeepForSdk
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";
        @NonNull
        @KeepForSdk
        public static final String NAME = "name";
        @NonNull
        @KeepForSdk
        public static final String ORIGIN = "origin";
        @NonNull
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        @NonNull
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        @NonNull
        @KeepForSdk
        public static final String TIME_TO_LIVE = "time_to_live";
        @NonNull
        @KeepForSdk
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";
        @NonNull
        @KeepForSdk
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        @NonNull
        @KeepForSdk
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        @NonNull
        @KeepForSdk
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";
        @NonNull
        @KeepForSdk
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";
        @NonNull
        @KeepForSdk
        public static final String VALUE = "value";

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

    private final zzdy zza;

    public AppMeasurementSdk(zzdy zzdy0) {
        this.zza = zzdy0;
    }

    @KeepForSdk
    public void beginAdUnitExposure(@NonNull @Size(min = 1L) String s) {
        this.zza.zzb(s);
    }

    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull @Size(max = 24L, min = 1L) String s, @Nullable String s1, @Nullable Bundle bundle0) {
        this.zza.zza(s, s1, bundle0);
    }

    @KeepForSdk
    public void endAdUnitExposure(@NonNull @Size(min = 1L) String s) {
        this.zza.zzc(s);
    }

    @KeepForSdk
    public long generateEventId() {
        return this.zza.zza();
    }

    @Nullable
    @KeepForSdk
    public String getAppIdOrigin() {
        return this.zza.zzd();
    }

    @Nullable
    @KeepForSdk
    public String getAppInstanceId() {
        return this.zza.zzf();
    }

    @NonNull
    @WorkerThread
    @KeepForSdk
    public List getConditionalUserProperties(@Nullable String s, @Nullable @Size(max = 23L, min = 1L) String s1) {
        return this.zza.zza(s, s1);
    }

    @Nullable
    @KeepForSdk
    public String getCurrentScreenClass() {
        return this.zza.zzg();
    }

    @Nullable
    @KeepForSdk
    public String getCurrentScreenName() {
        return this.zza.zzh();
    }

    @Nullable
    @KeepForSdk
    public String getGmpAppId() {
        return this.zza.zzi();
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    @ShowFirstParty
    public static AppMeasurementSdk getInstance(@NonNull Context context0) {
        return zzdy.zza(context0).zzb();
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    public static AppMeasurementSdk getInstance(@NonNull Context context0, @NonNull String s, @NonNull String s1, @Nullable String s2, @NonNull Bundle bundle0) {
        return zzdy.zza(context0, s, s1, s2, bundle0).zzb();
    }

    @WorkerThread
    @KeepForSdk
    public int getMaxUserProperties(@NonNull @Size(min = 1L) String s) {
        return this.zza.zza(s);
    }

    @NonNull
    @WorkerThread
    @KeepForSdk
    public Map getUserProperties(@Nullable String s, @Nullable @Size(max = 24L, min = 1L) String s1, boolean z) {
        return this.zza.zza(s, s1, z);
    }

    @KeepForSdk
    public void logEvent(@NonNull String s, @NonNull String s1, @Nullable Bundle bundle0) {
        this.zza.zzb(s, s1, bundle0);
    }

    @KeepForSdk
    public void logEventNoInterceptor(@NonNull String s, @NonNull String s1, @Nullable Bundle bundle0, long v) {
        this.zza.zza(s, s1, bundle0, v);
    }

    @KeepForSdk
    public void performAction(@NonNull Bundle bundle0) {
        this.zza.zza(bundle0, false);
    }

    @Nullable
    @KeepForSdk
    public Bundle performActionWithResponse(@NonNull Bundle bundle0) {
        return this.zza.zza(bundle0, true);
    }

    @KeepForSdk
    @ShowFirstParty
    public void registerOnMeasurementEventListener(@NonNull OnEventListener appMeasurementSdk$OnEventListener0) {
        this.zza.zza(appMeasurementSdk$OnEventListener0);
    }

    @KeepForSdk
    public void setConditionalUserProperty(@NonNull Bundle bundle0) {
        this.zza.zza(bundle0);
    }

    @KeepForSdk
    public void setConsent(@NonNull Bundle bundle0) {
        this.zza.zzb(bundle0);
    }

    @KeepForSdk
    public void setCurrentScreen(@NonNull Activity activity0, @Nullable @Size(max = 36L, min = 1L) String s, @Nullable @Size(max = 36L, min = 1L) String s1) {
        this.zza.zza(activity0, s, s1);
    }

    @WorkerThread
    @KeepForSdk
    @ShowFirstParty
    public void setEventInterceptor(@NonNull EventInterceptor appMeasurementSdk$EventInterceptor0) {
        this.zza.zza(appMeasurementSdk$EventInterceptor0);
    }

    @KeepForSdk
    public void setMeasurementEnabled(@Nullable Boolean boolean0) {
        this.zza.zza(boolean0);
    }

    @KeepForSdk
    public void setMeasurementEnabled(boolean z) {
        this.zza.zza(Boolean.valueOf(z));
    }

    @KeepForSdk
    public void setUserProperty(@NonNull String s, @NonNull String s1, @NonNull Object object0) {
        this.zza.zza(s, s1, object0, true);
    }

    @KeepForSdk
    @ShowFirstParty
    public void unregisterOnMeasurementEventListener(@NonNull OnEventListener appMeasurementSdk$OnEventListener0) {
        this.zza.zzb(appMeasurementSdk$OnEventListener0);
    }

    public final void zza(boolean z) {
        this.zza.zza(z);
    }
}

