package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;

@Class(creator = "GassResponseParcelCreator")
public final class zzfos extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @VersionField(id = 1)
    public final int zza;
    @Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private zzasy zzb;
    private byte[] zzc;

    static {
        zzfos.CREATOR = new zzfot();
    }

    @Constructor
    zzfos(@Param(id = 1) int v, @Param(id = 2) byte[] arr_b) {
        this.zza = v;
        this.zzb = null;
        this.zzc = arr_b;
        this.zzb();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zza);
        SafeParcelWriter.writeByteArray(parcel0, 2, (this.zzc == null ? this.zzb.zzaV() : this.zzc), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final zzasy zza() {
        if(this.zzb == null) {
            try {
                this.zzb = zzasy.zzd(this.zzc, zzgxb.zza());
                this.zzc = null;
            }
            catch(zzgyg | NullPointerException zzgyg0) {
                throw new IllegalStateException(zzgyg0);
            }
        }
        this.zzb();
        return this.zzb;
    }

    private final void zzb() {
        zzasy zzasy0 = this.zzb;
        if(zzasy0 == null && this.zzc != null || zzasy0 != null && this.zzc == null) {
            return;
        }
        if(zzasy0 == null || this.zzc == null) {
            throw zzasy0 != null || this.zzc != null ? new IllegalStateException("Impossible") : new IllegalStateException("Invalid internal representation - empty");
        }
        throw new IllegalStateException("Invalid internal representation - full");
    }
}

