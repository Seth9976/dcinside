package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import org.json.JSONArray;
import org.json.JSONException;

@Class(creator = "RewardItemParcelCreator")
@Reserved({1})
public final class zzbwi extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final String zza;
    @Field(id = 3)
    public final int zzb;

    static {
        zzbwi.CREATOR = new zzbwj();
    }

    @Constructor
    public zzbwi(@Param(id = 2) String s, @Param(id = 3) int v) {
        this.zza = s;
        this.zzb = v;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0 instanceof zzbwi && Objects.equal(this.zza, ((zzbwi)object0).zza) && Objects.equal(this.zzb, ((zzbwi)object0).zzb);
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, this.zzb});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Nullable
    public static zzbwi zza(JSONArray jSONArray0) throws JSONException {
        return jSONArray0 == null || jSONArray0.length() == 0 ? null : new zzbwi(jSONArray0.getJSONObject(0).optString("rb_type"), jSONArray0.getJSONObject(0).optInt("rb_amount"));
    }
}

