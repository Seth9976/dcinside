package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.io.InputStream;

@Class(creator = "CacheEntryParcelCreator")
@Reserved({1})
public final class zzbas extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Nullable
    @Field(getter = "getContentFileDescriptor", id = 2)
    private ParcelFileDescriptor zza;
    @Field(getter = "hasAdditionalMetadataFromReadV2", id = 3)
    private final boolean zzb;
    @Field(getter = "isDownloaded", id = 4)
    private final boolean zzc;
    @Field(getter = "getCachedBytes", id = 5)
    private final long zzd;
    @Field(getter = "isGcacheHit", id = 6)
    private final boolean zze;

    static {
        zzbas.CREATOR = new zzbat();
    }

    public zzbas() {
        this(null, false, false, 0L, false);
    }

    @Constructor
    public zzbas(@Nullable @Param(id = 2) ParcelFileDescriptor parcelFileDescriptor0, @Param(id = 3) boolean z, @Param(id = 4) boolean z1, @Param(id = 5) long v, @Param(id = 6) boolean z2) {
        this.zza = parcelFileDescriptor0;
        this.zzb = z;
        this.zzc = z1;
        this.zzd = v;
        this.zze = z2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.zzb(), v, false);
        SafeParcelWriter.writeBoolean(parcel0, 3, this.zzd());
        SafeParcelWriter.writeBoolean(parcel0, 4, this.zzf());
        SafeParcelWriter.writeLong(parcel0, 5, this.zza());
        SafeParcelWriter.writeBoolean(parcel0, 6, this.zzg());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final long zza() {
        synchronized(this) {
        }
        return this.zzd;
    }

    final ParcelFileDescriptor zzb() {
        synchronized(this) {
        }
        return this.zza;
    }

    @Nullable
    public final InputStream zzc() {
        synchronized(this) {
            if(this.zza == null) {
                return null;
            }
            InputStream inputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
            this.zza = null;
            return inputStream0;
        }
    }

    public final boolean zzd() {
        synchronized(this) {
        }
        return this.zzb;
    }

    public final boolean zze() {
        synchronized(this) {
        }
        return this.zza != null;
    }

    public final boolean zzf() {
        synchronized(this) {
        }
        return this.zzc;
    }

    public final boolean zzg() {
        synchronized(this) {
        }
        return this.zze;
    }
}

