package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import j..util.Objects;

@KeepForSdk
@Class(creator = "ApiMetadataCreator")
public final class ApiMetadata extends AbstractSafeParcelable {
    @KeepForSdk
    public static final class Builder {
        @Nullable
        private ComplianceOptions zza;

        @NonNull
        @KeepForSdk
        public ApiMetadata build() {
            return new ApiMetadata(this.zza);
        }

        @NonNull
        @KeepForSdk
        public Builder setComplianceOptions(@Nullable ComplianceOptions complianceOptions0) {
            this.zza = complianceOptions0;
            return this;
        }
    }

    @NonNull
    public static final Parcelable.Creator CREATOR;
    private static final ApiMetadata zza;
    @Nullable
    @Field(getter = "getComplianceOptions", id = 1)
    private final ComplianceOptions zzb;

    static {
        ApiMetadata.CREATOR = zza.zza();
        ApiMetadata.zza = ApiMetadata.newBuilder().build();
    }

    @Constructor
    ApiMetadata(@Nullable @Param(id = 1) ComplianceOptions complianceOptions0) {
        this.zzb = complianceOptions0;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        return object0 instanceof ApiMetadata ? Objects.equals(this.zzb, ((ApiMetadata)object0).zzb) : false;
    }

    @NonNull
    @KeepForSdk
    public static final ApiMetadata fromComplianceOptions(@NonNull ComplianceOptions complianceOptions0) {
        Builder apiMetadata$Builder0 = ApiMetadata.newBuilder();
        apiMetadata$Builder0.setComplianceOptions(complianceOptions0);
        return apiMetadata$Builder0.build();
    }

    @NonNull
    @KeepForSdk
    public static final ApiMetadata getEmptyInstance() {
        return ApiMetadata.zza;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(this.zzb);
    }

    @NonNull
    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    @Override
    @NonNull
    public final String toString() {
        return "ApiMetadata(complianceOptions=" + this.zzb + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeInt(-204102970);
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.zzb, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

