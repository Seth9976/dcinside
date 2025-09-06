package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.util.Arrays;

public final class zzafx extends zzagh {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzagh[] zzg;

    static {
        zzafx.CREATOR = new zzafw();
    }

    zzafx(Parcel parcel0) {
        super("CHAP");
        this.zza = parcel0.readString();
        this.zzb = parcel0.readInt();
        this.zzc = parcel0.readInt();
        this.zzd = parcel0.readLong();
        this.zze = parcel0.readLong();
        int v = parcel0.readInt();
        this.zzg = new zzagh[v];
        for(int v1 = 0; v1 < v; ++v1) {
            this.zzg[v1] = (zzagh)parcel0.readParcelable(zzagh.class.getClassLoader());
        }
    }

    public zzafx(String s, int v, int v1, long v2, long v3, zzagh[] arr_zzagh) {
        super("CHAP");
        this.zza = s;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
        this.zzg = arr_zzagh;
    }

    @Override  // com.google.android.gms.internal.ads.zzagh
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzafx.class == class0 && this.zzb == ((zzafx)object0).zzb && this.zzc == ((zzafx)object0).zzc && this.zzd == ((zzafx)object0).zzd && this.zze == ((zzafx)object0).zze && Objects.equals(this.zza, ((zzafx)object0).zza) && Arrays.equals(this.zzg, ((zzafx)object0).zzg);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza == null ? ((((this.zzb + 0x20F) * 0x1F + this.zzc) * 0x1F + ((int)this.zzd)) * 0x1F + ((int)this.zze)) * 0x1F : ((((this.zzb + 0x20F) * 0x1F + this.zzc) * 0x1F + ((int)this.zzd)) * 0x1F + ((int)this.zze)) * 0x1F + this.zza.hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeInt(this.zzb);
        parcel0.writeInt(this.zzc);
        parcel0.writeLong(this.zzd);
        parcel0.writeLong(this.zze);
        parcel0.writeInt(this.zzg.length);
        zzagh[] arr_zzagh = this.zzg;
        for(int v1 = 0; v1 < arr_zzagh.length; ++v1) {
            parcel0.writeParcelable(arr_zzagh[v1], 0);
        }
    }
}

