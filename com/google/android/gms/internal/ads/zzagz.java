package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import java.util.List;

public final class zzagz implements zzax {
    public static final Parcelable.Creator CREATOR;
    public final List zza;

    static {
        zzagz.CREATOR = new zzagw();
    }

    public zzagz(List list0) {
        this.zza = list0;
        int v = 0;
        if(!list0.isEmpty()) {
            long v1 = ((zzagy)list0.get(0)).zzb;
            for(int v2 = 1; v2 < list0.size(); ++v2) {
                if(((zzagy)list0.get(v2)).zza < v1) {
                    v = 1;
                    break;
                }
                v1 = ((zzagy)list0.get(v2)).zzb;
            }
        }
        zzcw.zzd(((boolean)(v ^ 1)));
    }

    @Override  // android.os.Parcelable
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
            return zzagz.class == class0 ? this.zza.equals(((zzagz)object0).zza) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override
    public final String toString() {
        return "SlowMotion: segments=" + this.zza.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeList(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzat0) {
    }
}

