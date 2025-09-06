package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzee;
import o3.h;

public final class zzdie extends zzea {
    private final Object zza;
    @h
    private final zzeb zzb;
    @h
    private final zzbpt zzc;

    public zzdie(@h zzeb zzeb0, @h zzbpt zzbpt0) {
        this.zza = new Object();
        this.zzb = zzeb0;
        this.zzc = zzbpt0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() throws RemoteException {
        return this.zzc == null ? 0.0f : this.zzc.zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() throws RemoteException {
        return this.zzc == null ? 0.0f : this.zzc.zzh();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    @h
    public final zzee zzi() throws RemoteException {
        synchronized(this.zza) {
            zzeb zzeb0 = this.zzb;
            if(zzeb0 != null) {
                return zzeb0.zzi();
            }
        }
        return null;
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
    public final void zzm(@h zzee zzee0) throws RemoteException {
        synchronized(this.zza) {
            zzeb zzeb0 = this.zzb;
            if(zzeb0 != null) {
                zzeb0.zzm(zzee0);
            }
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

