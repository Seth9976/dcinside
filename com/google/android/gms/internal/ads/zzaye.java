package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzaye extends zzayb implements zzayf {
    public static zzayf zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterface0 instanceof zzayf ? ((zzayf)iInterface0) : new zzayd(iBinder0);
    }
}

