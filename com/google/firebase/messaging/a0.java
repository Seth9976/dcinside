package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class a0 implements Parcelable.Creator {
    public static final int a;

    @Nullable
    public RemoteMessage a(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = SafeParcelReader.readHeader(parcel0);
            if(((char)v1) == 2) {
                bundle0 = SafeParcelReader.createBundle(parcel0, v1);
            }
            else {
                SafeParcelReader.skipUnknownField(parcel0, v1);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new RemoteMessage(bundle0);
    }

    @Nullable
    public RemoteMessage[] b(int v) {
        return new RemoteMessage[v];
    }

    static void c(RemoteMessage remoteMessage0, Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBundle(parcel0, 2, remoteMessage0.a, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    @Nullable
    public Object createFromParcel(Parcel parcel0) {
        return this.a(parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    @Nullable
    public Object[] newArray(int v) {
        return this.b(v);
    }
}

