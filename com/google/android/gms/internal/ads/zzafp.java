package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;

@Deprecated
public class zzafp implements zzax {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;

    static {
        zzafp.CREATOR = new zzafo();
    }

    protected zzafp(Parcel parcel0) {
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
    }

    public zzafp(String s, String s1) {
        this.zza = zzftt.zzb(s);
        this.zzb = s1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.zza.equals(((zzafp)object0).zza) && this.zzb.equals(((zzafp)object0).zzb);
    }

    @Override
    public final int hashCode() {
        return (this.zza.hashCode() + 0x20F) * 0x1F + this.zzb.hashCode();
    }

    @Override
    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzat0) {
        switch(this.zza) {
            case "ALBUM": {
                zzat0.zzd(this.zzb);
                return;
            }
            case "ALBUMARTIST": {
                zzat0.zzc(this.zzb);
                return;
            }
            case "ARTIST": {
                zzat0.zze(this.zzb);
                return;
            }
            case "DESCRIPTION": {
                zzat0.zzh(this.zzb);
                return;
            }
            case "TITLE": {
                zzat0.zzq(this.zzb);
            }
        }
    }
}

