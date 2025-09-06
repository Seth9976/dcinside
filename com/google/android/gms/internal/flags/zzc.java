package com.google.android.gms.internal.flags;

import android.os.IInterface;
import android.os.Parcel;

public class zzc {
    private static final ClassLoader zzd;

    static {
        zzc.zzd = zzc.class.getClassLoader();
    }

    public static void writeBoolean(Parcel parcel0, boolean z) {
        parcel0.writeInt(((int)z));
    }

    public static void zza(Parcel parcel0, IInterface iInterface0) {
        if(iInterface0 == null) {
            parcel0.writeStrongBinder(null);
            return;
        }
        parcel0.writeStrongBinder(iInterface0.asBinder());
    }

    public static boolean zza(Parcel parcel0) {
        return parcel0.readInt() != 0;
    }
}

