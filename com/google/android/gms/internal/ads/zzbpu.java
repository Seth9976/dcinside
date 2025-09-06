package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzee;

public final class zzbpu extends zzea {
    private final Object zza;
    @Nullable
    private volatile zzee zzb;

    public zzbpu() {
        this.zza = new Object();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    @Nullable
    public final zzee zzi() throws RemoteException {
        synchronized(this.zza) {
        }
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(@Nullable zzee zzee0) throws RemoteException {
        synchronized(this.zza) {
            this.zzb = zzee0;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}

