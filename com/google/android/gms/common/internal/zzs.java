package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zzh;
import java.util.HashMap;
import java.util.concurrent.Executor;

final class zzs extends GmsClientSupervisor {
    private final HashMap zzb;
    private final Context zzc;
    private volatile Handler zzd;
    private final zzq zze;
    private final ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;
    @Nullable
    private volatile Executor zzi;

    zzs(Context context0, Looper looper0, @Nullable Executor executor0) {
        this.zzb = new HashMap();
        zzq zzq0 = new zzq(this, null);
        this.zze = zzq0;
        this.zzc = context0.getApplicationContext();
        this.zzd = new zzh(looper0, zzq0);
        this.zzf = ConnectionTracker.getInstance();
        this.zzg = 5000L;
        this.zzh = 300000L;
        this.zzi = executor0;
    }

    @Override  // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final ConnectionResult zza(zzo zzo0, ServiceConnection serviceConnection0, String s, @Nullable Executor executor0) {
        ConnectionResult connectionResult0;
        Preconditions.checkNotNull(serviceConnection0, "ServiceConnection must not be null");
        synchronized(this.zzb) {
            zzp zzp0 = (zzp)this.zzb.get(zzo0);
            if(executor0 == null) {
                executor0 = this.zzi;
            }
            if(zzp0 == null) {
                zzp0 = new zzp(this, zzo0);
                zzp0.zze(serviceConnection0, serviceConnection0, s);
                connectionResult0 = zzp.zzd(zzp0, s, executor0);
                this.zzb.put(zzo0, zzp0);
                goto label_23;
            }
            this.zzd.removeMessages(0, zzo0);
            if(!zzp0.zzh(serviceConnection0)) {
                zzp0.zze(serviceConnection0, serviceConnection0, s);
                switch(zzp0.zza()) {
                    case 1: {
                        serviceConnection0.onServiceConnected(zzp0.zzb(), zzp0.zzc());
                        connectionResult0 = null;
                        break;
                    }
                    case 2: {
                        connectionResult0 = zzp.zzd(zzp0, s, executor0);
                        break;
                    }
                    default: {
                        connectionResult0 = null;
                    }
                }
            label_23:
                if(zzp0.zzj()) {
                    return ConnectionResult.RESULT_SUCCESS;
                }
                if(connectionResult0 == null) {
                    connectionResult0 = new ConnectionResult(-1);
                }
                return connectionResult0;
            }
        }
        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zzo0.toString());
    }

    @Override  // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zzb(zzo zzo0, ServiceConnection serviceConnection0, String s) {
        Preconditions.checkNotNull(serviceConnection0, "ServiceConnection must not be null");
        synchronized(this.zzb) {
            zzp zzp0 = (zzp)this.zzb.get(zzo0);
            if(zzp0 != null) {
                if(!zzp0.zzh(serviceConnection0)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zzo0.toString());
                }
                zzp0.zzf(serviceConnection0, s);
                if(zzp0.zzi()) {
                    Message message0 = this.zzd.obtainMessage(0, zzo0);
                    this.zzd.sendMessageDelayed(message0, this.zzg);
                }
                return;
            }
        }
        throw new IllegalStateException("Nonexistent connection status for service config: " + zzo0.toString());
    }

    final void zzi(@Nullable Executor executor0) {
        synchronized(this.zzb) {
            this.zzi = executor0;
        }
    }

    final void zzj(Looper looper0) {
        synchronized(this.zzb) {
            this.zzd = new zzh(looper0, this.zze);
        }
    }
}

