package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class zzbar {
    private ScheduledFuture zza;
    private final Runnable zzb;
    private final Object zzc;
    @Nullable
    private zzbau zzd;
    @Nullable
    private Context zze;
    @Nullable
    private zzbax zzf;

    public zzbar() {
        this.zza = null;
        this.zzb = new zzban(this);
        this.zzc = new Object();
    }

    public final long zza(zzbav zzbav0) {
        synchronized(this.zzc) {
            if(this.zzf == null) {
                return -2L;
            }
            if(this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzbav0);
                }
                catch(RemoteException remoteException0) {
                    zzo.zzh("Unable to call into cache service.", remoteException0);
                }
            }
            return -2L;
        }
    }

    public final zzbas zzb(zzbav zzbav0) {
        Object object0 = this.zzc;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.zzf == null) {
            zzbas zzbas0 = new zzbas();
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return zzbas0;
        }
        try {
            if(this.zzd.zzp()) {
                zzbas zzbas1 = this.zzf.zzg(zzbav0);
                FIN.finallyExec$NT(v);
                return zzbas1;
            }
            zzbas zzbas2 = this.zzf.zzf(zzbav0);
            FIN.finallyExec$NT(v);
            return zzbas2;
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Unable to call into cache service.", remoteException0);
            FIN.finallyExec$NT(v);
            return new zzbas();
        }
    }

    @VisibleForTesting
    protected final zzbau zzd(BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0, BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0) {
        synchronized(this) {
            return new zzbau(this.zze, zzv.zzu().zzb(), baseGmsClient$BaseConnectionCallbacks0, baseGmsClient$BaseOnConnectionFailedListener0);
        }
    }

    static void zzf(zzbar zzbar0, zzbau zzbau0) {
        zzbar0.zzd = null;
    }

    static void zzh(zzbar zzbar0) {
        synchronized(zzbar0.zzc) {
            zzbau zzbau0 = zzbar0.zzd;
            if(zzbau0 == null) {
                return;
            }
            if(zzbau0.isConnected() || zzbar0.zzd.isConnecting()) {
                zzbar0.zzd.disconnect();
            }
            zzbar0.zzd = null;
            zzbar0.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    public final void zzi(Context context0) {
        if(context0 == null) {
            return;
        }
        synchronized(this.zzc) {
            if(this.zze != null) {
                return;
            }
            this.zze = context0.getApplicationContext();
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzem)).booleanValue()) {
                this.zzl();
            }
            else if(((Boolean)zzbe.zzc().zza(zzbcl.zzel)).booleanValue()) {
                zzv.zzb().zzc(new zzbao(this));
            }
        }
    }

    public final void zzj() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzen)).booleanValue()) {
            Object object0 = this.zzc;
            synchronized(object0) {
                this.zzl();
                ScheduledFuture scheduledFuture0 = this.zza;
                if(scheduledFuture0 != null) {
                    scheduledFuture0.cancel(false);
                }
                long v1 = (long)(((Long)zzbe.zzc().zza(zzbcl.zzeo)));
                this.zza = zzbzw.zzd.schedule(this.zzb, v1, TimeUnit.MILLISECONDS);
            }
        }
    }

    private final void zzl() {
        synchronized(this.zzc) {
            if(this.zze != null && this.zzd == null) {
                zzbau zzbau0 = this.zzd(new zzbap(this), new zzbaq(this));
                this.zzd = zzbau0;
                zzbau0.checkAvailabilityAndConnect();
            }
        }
    }
}

