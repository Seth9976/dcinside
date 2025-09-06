package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzees extends zzbpj implements zzcxd {
    private zzbpk zza;
    private zzcxc zzb;

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zza(zzcxc zzcxc0) {
        synchronized(this) {
            this.zzb = zzcxc0;
        }
    }

    public final void zzc(zzbpk zzbpk0) {
        synchronized(this) {
            this.zza = zzbpk0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zze() throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zze();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzf() throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzf();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzg(int v) throws RemoteException {
        synchronized(this) {
            zzcxc zzcxc0 = this.zzb;
            if(zzcxc0 != null) {
                zzcxc0.zza(v);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzh(zze zze0) throws RemoteException {
        synchronized(this) {
            zzcxc zzcxc0 = this.zzb;
            if(zzcxc0 != null) {
                zzcxc0.zzb(zze0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzi(int v, String s) throws RemoteException {
        synchronized(this) {
            zzcxc zzcxc0 = this.zzb;
            if(zzcxc0 != null) {
                zzcxc0.zzc(v, s);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzj(int v) throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzj(v);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzk(zze zze0) throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzk(zze0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzl(String s) throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzl(s);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzm() throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzm();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzn() throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzn();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzo() throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzo();
            }
            zzcxc zzcxc0 = this.zzb;
            if(zzcxc0 != null) {
                zzcxc0.zzd();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzp() throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzp();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzq(String s, String s1) throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzq(s, s1);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzr(zzbgq zzbgq0, String s) throws RemoteException {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzs(zzbwi zzbwi0) throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzs(zzbwi0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzt(zzbwm zzbwm0) throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzt(zzbwm0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzu() throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzu();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzv() throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzv();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzw() throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzw();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzx() throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzx();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzy() throws RemoteException {
        synchronized(this) {
            zzbpk zzbpk0 = this.zza;
            if(zzbpk0 != null) {
                zzbpk0.zzy();
            }
        }
    }
}

