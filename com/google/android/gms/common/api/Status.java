package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest.Builder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_CANCELED;
    @NonNull
    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT;
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_INTERNAL_ERROR;
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_INTERRUPTED;
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_SUCCESS;
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_SUCCESS_CACHE;
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_TIMEOUT;
    @NonNull
    @ShowFirstParty
    public static final Status zza;
    @Field(getter = "getStatusCode", id = 1)
    private final int zzb;
    @Nullable
    @Field(getter = "getStatusMessage", id = 2)
    private final String zzc;
    @Nullable
    @Field(getter = "getPendingIntent", id = 3)
    private final PendingIntent zzd;
    @Nullable
    @Field(getter = "getConnectionResult", id = 4)
    private final ConnectionResult zze;

    static {
        Status.RESULT_SUCCESS_CACHE = new Status(-1);
        Status.RESULT_SUCCESS = new Status(0);
        Status.RESULT_INTERRUPTED = new Status(14);
        Status.RESULT_INTERNAL_ERROR = new Status(8);
        Status.RESULT_TIMEOUT = new Status(15);
        Status.RESULT_CANCELED = new Status(16);
        Status.zza = new Status(17);
        Status.RESULT_DEAD_CLIENT = new Status(18);
        Status.CREATOR = new zze();
    }

    public Status(int v) {
        this(v, null);
    }

    public Status(int v, @Nullable String s) {
        this(v, s, null);
    }

    public Status(int v, @Nullable String s, @Nullable PendingIntent pendingIntent0) {
        this(v, s, pendingIntent0, null);
    }

    @Constructor
    Status(@Param(id = 1) int v, @Nullable @Param(id = 2) String s, @Nullable @Param(id = 3) PendingIntent pendingIntent0, @Nullable @Param(id = 4) ConnectionResult connectionResult0) {
        this.zzb = v;
        this.zzc = s;
        this.zzd = pendingIntent0;
        this.zze = connectionResult0;
    }

    public Status(@NonNull ConnectionResult connectionResult0, @NonNull String s) {
        this(connectionResult0, s, 17);
    }

    @KeepForSdk
    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult0, @NonNull String s, int v) {
        this(v, s, connectionResult0.getResolution(), connectionResult0);
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof Status ? this.zzb == ((Status)object0).zzb && Objects.equal(this.zzc, ((Status)object0).zzc) && Objects.equal(this.zzd, ((Status)object0).zzd) && Objects.equal(this.zze, ((Status)object0).zze) : false;
    }

    @Nullable
    public ConnectionResult getConnectionResult() {
        return this.zze;
    }

    @Nullable
    public PendingIntent getResolution() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.zzb;
    }

    @Nullable
    public String getStatusMessage() {
        return this.zzc;
    }

    public boolean hasResolution() {
        return this.zzd != null;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zzb, this.zzc, this.zzd, this.zze});
    }

    public boolean isCanceled() {
        return this.zzb == 16;
    }

    public boolean isInterrupted() {
        return this.zzb == 14;
    }

    public boolean isSuccess() {
        return this.zzb <= 0;
    }

    public void startResolutionForResult(@NonNull Activity activity0, int v) throws IntentSender.SendIntentException {
        if(!this.hasResolution()) {
            return;
        }
        Preconditions.checkNotNull(this.zzd);
        activity0.startIntentSenderForResult(this.zzd.getIntentSender(), v, null, 0, 0, 0, null);
    }

    public void startResolutionForResult(@NonNull ActivityResultLauncher activityResultLauncher0) {
        if(!this.hasResolution()) {
            return;
        }
        Preconditions.checkNotNull(this.zzd);
        activityResultLauncher0.b(new Builder(this.zzd.getIntentSender()).a());
    }

    @Override
    @NonNull
    public String toString() {
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(this);
        objects$ToStringHelper0.add("statusCode", this.zza());
        objects$ToStringHelper0.add("resolution", this.zzd);
        return objects$ToStringHelper0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.getStatusCode());
        SafeParcelWriter.writeString(parcel0, 2, this.getStatusMessage(), false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.zzd, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.getConnectionResult(), v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @NonNull
    public final String zza() {
        return this.zzc == null ? CommonStatusCodes.getStatusCodeString(this.zzb) : this.zzc;
    }
}

