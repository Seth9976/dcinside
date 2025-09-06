package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.List;

@Class(creator = "CacheOfferingCreator")
@Reserved({1})
public final class zzbav extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Nullable
    @Field(id = 2)
    public final String zza;
    @Field(id = 3)
    public final long zzb;
    @Field(id = 4)
    public final String zzc;
    @Field(id = 5)
    public final String zzd;
    @Field(id = 6)
    public final String zze;
    @Field(id = 7)
    public final Bundle zzf;
    @Field(id = 8)
    public final boolean zzg;
    @Field(id = 9)
    public long zzh;
    @Field(id = 10)
    public String zzi;
    @Field(id = 11)
    public int zzj;

    static {
        zzbav.CREATOR = new zzbaw();
    }

    @Constructor
    zzbav(@Nullable @Param(id = 2) String s, @Param(id = 3) long v, @Param(id = 4) String s1, @Param(id = 5) String s2, @Param(id = 6) String s3, @Param(id = 7) Bundle bundle0, @Param(id = 8) boolean z, @Param(id = 9) long v1, @Param(id = 10) String s4, @Param(id = 11) int v2) {
        this.zza = s;
        this.zzb = v;
        if(s1 == null) {
            s1 = "";
        }
        this.zzc = s1;
        if(s2 == null) {
            s2 = "";
        }
        this.zzd = s2;
        if(s3 == null) {
            s3 = "";
        }
        this.zze = s3;
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        this.zzf = bundle0;
        this.zzg = z;
        this.zzh = v1;
        this.zzi = s4;
        this.zzj = v2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeLong(parcel0, 3, this.zzb);
        SafeParcelWriter.writeString(parcel0, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel0, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel0, 6, this.zze, false);
        SafeParcelWriter.writeBundle(parcel0, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.zzg);
        SafeParcelWriter.writeLong(parcel0, 9, this.zzh);
        SafeParcelWriter.writeString(parcel0, 10, this.zzi, false);
        SafeParcelWriter.writeInt(parcel0, 11, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Nullable
    public static zzbav zza(Uri uri0) {
        try {
            if(!"gcache".equals(uri0.getScheme())) {
                return null;
            }
            List list0 = uri0.getPathSegments();
            if(list0.size() != 2) {
                zzo.zzj(("Expected 2 path parts for namespace and id, found :" + list0.size()));
                return null;
            }
            Object object0 = list0.get(0);
            Object object1 = list0.get(1);
            String s = uri0.getHost();
            String s1 = uri0.getQueryParameter("url");
            boolean z = "1".equals(uri0.getQueryParameter("read_only"));
            String s2 = uri0.getQueryParameter("expiration");
            long v = s2 == null ? 0L : Long.parseLong(s2);
            Bundle bundle0 = new Bundle();
            for(Object object2: uri0.getQueryParameterNames()) {
                String s3 = (String)object2;
                if(s3.startsWith("tag.")) {
                    bundle0.putString(s3.substring(4), uri0.getQueryParameter(s3));
                }
            }
            return new zzbav(s1, v, s, ((String)object0), ((String)object1), bundle0, z, 0L, "", 0);
        }
        catch(NullPointerException | NumberFormatException nullPointerException0) {
        }
        zzo.zzk("Unable to parse Uri into cache offering.", nullPointerException0);
        return null;
    }
}

