package com.google.android.gms.flags;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.flags.zza;

public final class zze extends zza implements zzc {
    zze(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.flags.IFlagProvider");
    }

    @Override  // com.google.android.gms.flags.zzc
    public final boolean getBooleanFlagValue(String s, boolean z, int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        com.google.android.gms.internal.flags.zzc.writeBoolean(parcel0, z);
        parcel0.writeInt(v);
        Parcel parcel1 = this.zza(2, parcel0);
        boolean z1 = com.google.android.gms.internal.flags.zzc.zza(parcel1);
        parcel1.recycle();
        return z1;
    }

    @Override  // com.google.android.gms.flags.zzc
    public final int getIntFlagValue(String s, int v, int v1) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeInt(v);
        parcel0.writeInt(v1);
        Parcel parcel1 = this.zza(3, parcel0);
        int v2 = parcel1.readInt();
        parcel1.recycle();
        return v2;
    }

    @Override  // com.google.android.gms.flags.zzc
    public final long getLongFlagValue(String s, long v, int v1) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeLong(v);
        parcel0.writeInt(v1);
        Parcel parcel1 = this.zza(4, parcel0);
        long v2 = parcel1.readLong();
        parcel1.recycle();
        return v2;
    }

    @Override  // com.google.android.gms.flags.zzc
    public final String getStringFlagValue(String s, String s1, int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeInt(v);
        Parcel parcel1 = this.zza(5, parcel0);
        String s2 = parcel1.readString();
        parcel1.recycle();
        return s2;
    }

    @Override  // com.google.android.gms.flags.zzc
    public final void init(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        com.google.android.gms.internal.flags.zzc.zza(parcel0, iObjectWrapper0);
        this.zzb(1, parcel0);
    }
}

