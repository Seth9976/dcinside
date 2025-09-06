package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.R.string;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzah;

@KeepForSdk
@Deprecated
public final class GoogleServices {
    private static final Object zza;
    @Nullable
    private static GoogleServices zzb;
    @Nullable
    private final String zzc;
    private final Status zzd;
    private final boolean zze;
    private final boolean zzf;

    static {
        GoogleServices.zza = new Object();
    }

    @VisibleForTesting
    @KeepForSdk
    GoogleServices(Context context0) {
        Resources resources0 = context0.getResources();
        int v = resources0.getIdentifier("google_app_measurement_enable", "integer", resources0.getResourcePackageName(string.common_google_play_services_unknown_issue));
        boolean z = true;
        if(v == 0) {
            this.zzf = false;
        }
        else {
            int v1 = resources0.getInteger(v);
            if(v1 == 0) {
                z = false;
            }
            this.zzf = v1 == 0;
        }
        this.zze = z;
        String s = zzah.zzb(context0);
        if(s == null) {
            s = new StringResourceValueReader(context0).getString("google_app_id");
        }
        if(TextUtils.isEmpty(s)) {
            this.zzd = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzc = null;
            return;
        }
        this.zzc = s;
        this.zzd = Status.RESULT_SUCCESS;
    }

    @VisibleForTesting
    @KeepForSdk
    GoogleServices(String s, boolean z) {
        this.zzc = s;
        this.zzd = Status.RESULT_SUCCESS;
        this.zze = z;
        this.zzf = !z;
    }

    @VisibleForTesting
    @KeepForSdk
    Status checkGoogleAppId(String s) {
        return this.zzc == null || this.zzc.equals(s) ? Status.RESULT_SUCCESS : new Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: \'" + this.zzc + "\'.");
    }

    @KeepForSdk
    private static GoogleServices checkInitialized(String s) {
        synchronized(GoogleServices.zza) {
            GoogleServices googleServices0 = GoogleServices.zzb;
            if(googleServices0 != null) {
                return googleServices0;
            }
        }
        throw new IllegalStateException("Initialize must be called before " + s + ".");
    }

    @VisibleForTesting
    @KeepForSdk
    static void clearInstanceForTest() {
        synchronized(GoogleServices.zza) {
            GoogleServices.zzb = null;
        }
    }

    @Nullable
    @KeepForSdk
    public static String getGoogleAppId() {
        return GoogleServices.checkInitialized("getGoogleAppId").zzc;
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context0) {
        Preconditions.checkNotNull(context0, "Context must not be null.");
        synchronized(GoogleServices.zza) {
            if(GoogleServices.zzb == null) {
                GoogleServices.zzb = new GoogleServices(context0);
            }
            return GoogleServices.zzb.zzd;
        }
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context0, @NonNull String s, boolean z) {
        Preconditions.checkNotNull(context0, "Context must not be null.");
        Preconditions.checkNotEmpty(s, "App ID must be nonempty.");
        synchronized(GoogleServices.zza) {
            GoogleServices googleServices0 = GoogleServices.zzb;
            if(googleServices0 != null) {
                return googleServices0.checkGoogleAppId(s);
            }
            GoogleServices googleServices1 = new GoogleServices(s, z);
            GoogleServices.zzb = googleServices1;
            return googleServices1.zzd;
        }
    }

    @KeepForSdk
    public static boolean isMeasurementEnabled() {
        GoogleServices googleServices0 = GoogleServices.checkInitialized("isMeasurementEnabled");
        return googleServices0.zzd.isSuccess() && googleServices0.zze;
    }

    @KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
        return GoogleServices.checkInitialized("isMeasurementExplicitlyDisabled").zzf;
    }
}

