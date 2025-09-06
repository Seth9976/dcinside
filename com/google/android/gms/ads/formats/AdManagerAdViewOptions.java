package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.internal.ads.zzbhm;
import com.google.android.gms.internal.ads.zzbhn;

@Class(creator = "AdManagerAdViewOptionsCreator")
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    public static final class Builder {
        private boolean zza;

        public Builder() {
            this.zza = false;
        }

        @NonNull
        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, null);
        }

        @NonNull
        public Builder setManualImpressionsEnabled(boolean z) {
            this.zza = z;
            return this;
        }
    }

    @NonNull
    public static final Parcelable.Creator CREATOR;
    @Field(getter = "getManualImpressionsEnabled", id = 1)
    private final boolean zza;
    @Nullable
    @Field(getter = "getDelayedBannerAdListenerBinder", id = 2)
    private final IBinder zzb;

    static {
        AdManagerAdViewOptions.CREATOR = new zzc();
    }

    AdManagerAdViewOptions(Builder adManagerAdViewOptions$Builder0, zzb zzb0) {
        this.zza = adManagerAdViewOptions$Builder0.zza;
        this.zzb = null;
    }

    @Constructor
    AdManagerAdViewOptions(@Param(id = 1) boolean z, @Nullable @Param(id = 2) IBinder iBinder0) {
        this.zza = z;
        this.zzb = iBinder0;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.getManualImpressionsEnabled());
        SafeParcelWriter.writeIBinder(parcel0, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Nullable
    public final zzbhn zza() {
        return this.zzb == null ? null : zzbhm.zzb(this.zzb);
    }
}

