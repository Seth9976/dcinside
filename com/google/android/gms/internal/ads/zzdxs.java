package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public abstract class zzdxs implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    protected final zzcab zza;
    protected final Object zzb;
    protected boolean zzc;
    protected boolean zzd;
    protected zzbvk zze;
    @GuardedBy("lock")
    @VisibleForTesting(otherwise = 3)
    protected zzbup zzf;

    public zzdxs() {
        this.zza = new zzcab();
        this.zzb = new Object();
        this.zzc = false;
        this.zzd = false;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult0) {
        zzo.zze("Disconnected from remote ad request service.");
        zzdyh zzdyh0 = new zzdyh(1);
        this.zza.zzd(zzdyh0);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        zzo.zze("Cannot connect to remote service, fallback to local instance.");
    }

    protected final void zzb() {
        synchronized(this.zzb) {
            this.zzd = true;
            if(this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    static void zzc(Context context0, t0 t00, Executor executor0) {
        if(!((Boolean)zzbed.zzj.zze()).booleanValue() && !((Boolean)zzbed.zzh.zze()).booleanValue()) {
            return;
        }
        zzgch.zzr(t00, new zzdxp(context0), executor0);
    }
}

