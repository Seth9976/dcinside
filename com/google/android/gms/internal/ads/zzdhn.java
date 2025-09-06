package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdhn extends zzbfs {
    private final zzdif zza;
    private IObjectWrapper zzb;

    public zzdhn(zzdif zzdif0) {
        this.zza = zzdif0;
    }

    private static float zzb(IObjectWrapper iObjectWrapper0) {
        if(iObjectWrapper0 != null) {
            Drawable drawable0 = (Drawable)ObjectWrapper.unwrap(iObjectWrapper0);
            return drawable0 == null || drawable0.getIntrinsicWidth() == -1 || drawable0.getIntrinsicHeight() == -1 ? 0.0f : ((float)drawable0.getIntrinsicWidth()) / ((float)drawable0.getIntrinsicHeight());
        }
        return 0.0f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final float zze() throws RemoteException {
        if(this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if(this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("Remote exception getting video controller aspect ratio.", remoteException0);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper0 = this.zzb;
        if(iObjectWrapper0 != null) {
            return zzdhn.zzb(iObjectWrapper0);
        }
        zzbfw zzbfw0 = this.zza.zzm();
        if(zzbfw0 != null) {
            float f = zzbfw0.zzd() == -1 || zzbfw0.zzc() == -1 ? 0.0f : ((float)zzbfw0.zzd()) / ((float)zzbfw0.zzc());
            return f == 0.0f ? zzdhn.zzb(zzbfw0.zzf()) : f;
        }
        return 0.0f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final float zzf() throws RemoteException {
        return this.zza.zzj() == null ? 0.0f : this.zza.zzj().zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final float zzg() throws RemoteException {
        return this.zza.zzj() == null ? 0.0f : this.zza.zzj().zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    @Nullable
    public final zzeb zzh() throws RemoteException {
        return this.zza.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    @Nullable
    public final IObjectWrapper zzi() throws RemoteException {
        IObjectWrapper iObjectWrapper0 = this.zzb;
        if(iObjectWrapper0 != null) {
            return iObjectWrapper0;
        }
        zzbfw zzbfw0 = this.zza.zzm();
        return zzbfw0 == null ? null : zzbfw0.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final void zzj(IObjectWrapper iObjectWrapper0) {
        this.zzb = iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final boolean zzk() throws RemoteException {
        return this.zza.zzaf();
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final boolean zzl() throws RemoteException {
        return this.zza.zzj() != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final void zzm(zzbhe zzbhe0) {
        if(this.zza.zzj() instanceof zzcfz) {
            ((zzcfz)this.zza.zzj()).zzv(zzbhe0);
        }
    }
}

