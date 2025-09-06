package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzeet extends zzbwg implements zzcxd {
    private zzbwh zza;
    private zzcxc zzb;
    private zzded zzc;

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zza(zzcxc zzcxc0) {
        synchronized(this) {
            this.zzb = zzcxc0;
        }
    }

    public final void zzc(zzbwh zzbwh0) {
        synchronized(this) {
            this.zza = zzbwh0;
        }
    }

    public final void zzd(zzded zzded0) {
        synchronized(this) {
            this.zzc = zzded0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zze(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzbwh zzbwh0 = this.zza;
            if(zzbwh0 != null) {
                ((zzehy)zzbwh0).zzb.onAdClicked();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzbwh zzbwh0 = this.zza;
            if(zzbwh0 != null) {
                zzbwh0.zzf(iObjectWrapper0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(IObjectWrapper iObjectWrapper0, int v) throws RemoteException {
        synchronized(this) {
            zzcxc zzcxc0 = this.zzb;
            if(zzcxc0 != null) {
                zzcxc0.zza(v);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzh(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzbwh zzbwh0 = this.zza;
            if(zzbwh0 != null) {
                ((zzehy)zzbwh0).zzc.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzi(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzcxc zzcxc0 = this.zzb;
            if(zzcxc0 != null) {
                zzcxc0.zzd();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzj(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzbwh zzbwh0 = this.zza;
            if(zzbwh0 != null) {
                ((zzehy)zzbwh0).zza.zzdp();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzk(IObjectWrapper iObjectWrapper0, int v) throws RemoteException {
        synchronized(this) {
            zzded zzded0 = this.zzc;
            if(zzded0 != null) {
                zzo.zzj(("Fail to initialize adapter " + ((zzehx)zzded0).zzc.zza));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzl(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzded zzded0 = this.zzc;
            if(zzded0 != null) {
                ((zzehx)zzded0).zzd.zzb.execute(new zzehw(((zzehx)zzded0), ((zzehx)zzded0).zza, ((zzehx)zzded0).zzb, ((zzehx)zzded0).zzc));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzm(IObjectWrapper iObjectWrapper0, zzbwi zzbwi0) throws RemoteException {
        synchronized(this) {
            zzbwh zzbwh0 = this.zza;
            if(zzbwh0 != null) {
                ((zzehy)zzbwh0).zzd.zza(zzbwi0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzn(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzbwh zzbwh0 = this.zza;
            if(zzbwh0 != null) {
                ((zzehy)zzbwh0).zzc.zze();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzo(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzbwh zzbwh0 = this.zza;
            if(zzbwh0 != null) {
                ((zzehy)zzbwh0).zzd.zzc();
            }
        }
    }
}

