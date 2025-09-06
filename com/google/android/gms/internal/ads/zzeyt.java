package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.atomic.AtomicReference;

public final class zzeyt {
    public static void zza(AtomicReference atomicReference0, zzeys zzeys0) {
        Object object0 = atomicReference0.get();
        if(object0 == null) {
            return;
        }
        try {
            zzeys0.zza(object0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
        catch(NullPointerException nullPointerException0) {
            zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", nullPointerException0);
        }
    }
}

