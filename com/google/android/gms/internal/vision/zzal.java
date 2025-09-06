package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "SymbolBoxParcelCreator")
@Reserved({1})
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        zzal.CREATOR = new zzak();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        SafeParcelWriter.finishObjectHeader(parcel0, SafeParcelWriter.beginObjectHeader(parcel0));
    }
}

