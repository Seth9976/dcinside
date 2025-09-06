package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.util.Arrays;

public final class zzafz extends zzagh {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagh[] zze;

    static {
        zzafz.CREATOR = new zzafy();
    }

    zzafz(Parcel parcel0) {
        super("CTOC");
        this.zza = parcel0.readString();
        boolean z = true;
        this.zzb = parcel0.readByte() != 0;
        if(parcel0.readByte() == 0) {
            z = false;
        }
        this.zzc = z;
        this.zzd = parcel0.createStringArray();
        int v1 = parcel0.readInt();
        this.zze = new zzagh[v1];
        for(int v = 0; v < v1; ++v) {
            this.zze[v] = (zzagh)parcel0.readParcelable(zzagh.class.getClassLoader());
        }
    }

    public zzafz(String s, boolean z, boolean z1, String[] arr_s, zzagh[] arr_zzagh) {
        super("CTOC");
        this.zza = s;
        this.zzb = z;
        this.zzc = z1;
        this.zzd = arr_s;
        this.zze = arr_zzagh;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzafz.class == class0 && this.zzb == ((zzafz)object0).zzb && this.zzc == ((zzafz)object0).zzc && Objects.equals(this.zza, ((zzafz)object0).zza) && Arrays.equals(this.zzd, ((zzafz)object0).zzd) && Arrays.equals(this.zze, ((zzafz)object0).zze);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza == null ? ((this.zzb + 0x20F) * 0x1F + this.zzc) * 0x1F : ((this.zzb + 0x20F) * 0x1F + this.zzc) * 0x1F + this.zza.hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeByte(((byte)this.zzb));
        parcel0.writeByte(((byte)this.zzc));
        parcel0.writeStringArray(this.zzd);
        parcel0.writeInt(this.zze.length);
        zzagh[] arr_zzagh = this.zze;
        for(int v1 = 0; v1 < arr_zzagh.length; ++v1) {
            parcel0.writeParcelable(arr_zzagh[v1], 0);
        }
    }
}

