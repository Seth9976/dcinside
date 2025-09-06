package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzeky {
    private final zzeld zza;
    private final String zzb;
    @Nullable
    private zzdy zzc;

    public zzeky(zzeld zzeld0, String s) {
        this.zza = zzeld0;
        this.zzb = s;
    }

    @Nullable
    public final String zza() {
        synchronized(this) {
            String s = null;
            zzdy zzdy0 = this.zzc;
            if(zzdy0 != null) {
                try {
                    s = zzdy0.zzg();
                }
                catch(RemoteException remoteException0) {
                    zzo.zzl("#007 Could not call remote method.", remoteException0);
                    return null;
                }
            }
            return s;
        }
    }

    @Nullable
    public final String zzb() {
        synchronized(this) {
            String s = null;
            zzdy zzdy0 = this.zzc;
            if(zzdy0 != null) {
                try {
                    s = zzdy0.zzg();
                }
                catch(RemoteException remoteException0) {
                    zzo.zzl("#007 Could not call remote method.", remoteException0);
                    return null;
                }
            }
            return s;
        }
    }

    public final void zzd(zzm zzm0, int v) throws RemoteException {
        synchronized(this) {
            this.zzc = null;
            zzele zzele0 = new zzele(v);
            zzekx zzekx0 = new zzekx(this);
            this.zza.zzb(zzm0, this.zzb, zzele0, zzekx0);
        }
    }

    public final boolean zze() throws RemoteException {
        synchronized(this) {
            return this.zza.zza();
        }
    }
}

