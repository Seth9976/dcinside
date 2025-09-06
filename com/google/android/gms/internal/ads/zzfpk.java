package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzfpk {
    @VisibleForTesting
    final zzfpn zza;
    @VisibleForTesting
    final boolean zzb;

    private zzfpk(zzfpn zzfpn0) {
        this.zza = zzfpn0;
        this.zzb = zzfpn0 != null;
    }

    public final zzfpi zza(byte[] arr_b) {
        return new zzfpi(this, arr_b, null);
    }

    public static zzfpk zzb(Context context0, String s, String s1) {
        zzfpn zzfpn0;
        try {
            IBinder iBinder0 = DynamiteModule.load(context0, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite").instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            if(iBinder0 == null) {
                zzfpn0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                zzfpn0 = iInterface0 instanceof zzfpn ? ((zzfpn)iInterface0) : new zzfpl(iBinder0);
            }
        }
        catch(Exception unused_ex) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfpk(new zzfpo());
        }
        try {
            zzfpn0.zze(ObjectWrapper.wrap(context0), s, null);
            Log.i("GASS", "GassClearcutLogger Initialized.");
            return new zzfpk(zzfpn0);
        }
        catch(zzfom | RemoteException | NullPointerException | SecurityException unused_ex) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfpk(new zzfpo());
        }
    }

    public static zzfpk zzc() {
        zzfpo zzfpo0 = new zzfpo();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfpk(zzfpo0);
    }
}

