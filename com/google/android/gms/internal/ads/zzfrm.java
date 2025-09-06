package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzfrm extends zzayb implements zzfrn {
    public static zzfrn zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return iInterface0 instanceof zzfrn ? ((zzfrn)iInterface0) : new zzfrl(iBinder0);
    }
}

