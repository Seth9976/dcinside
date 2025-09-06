package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;

public final class zzmq implements ServiceConnection, BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    final zzls zza;
    private volatile boolean zzb;
    private volatile zzgj zzc;

    protected zzmq(zzls zzls0) {
        this.zza = zzls0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    @MainThread
    public final void onConnected(Bundle bundle0) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized(this) {
            try {
                Preconditions.checkNotNull(this.zzc);
                zzgb zzgb0 = (zzgb)this.zzc.getService();
                this.zza.zzl().zzb(new zzmr(this, zzgb0));
            }
            catch(DeadObjectException | IllegalStateException unused_ex) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    @MainThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult0) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzgo zzgo0 = this.zza.zzu.zzm();
        if(zzgo0 != null) {
            zzgo0.zzu().zza("Service connection failed", connectionResult0);
        }
        synchronized(this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzl().zzb(new zzmt(this));
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    @MainThread
    public final void onConnectionSuspended(int v) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zza.zzj().zzc().zza("Service connection suspended");
        this.zza.zzl().zzb(new zzmu(this));
    }

    @Override  // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        zzgb zzgb0;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized(this) {
            if(iBinder0 == null) {
                this.zzb = false;
                this.zza.zzj().zzg().zza("Service connected with null binder");
                return;
            }
            try {
                zzgb0 = null;
                String s = iBinder0.getInterfaceDescriptor();
                if("com.google.android.gms.measurement.internal.IMeasurementService".equals(s)) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzgb zzgb1 = iInterface0 instanceof zzgb ? ((zzgb)iInterface0) : new zzgd(iBinder0);
                    zzgb0 = zzgb1;
                    this.zza.zzj().zzp().zza("Bound to IMeasurementService interface");
                }
                else {
                    this.zza.zzj().zzg().zza("Got binder with a wrong descriptor", s);
                }
            }
            catch(RemoteException unused_ex) {
                this.zza.zzj().zzg().zza("Service connect failed to get IMeasurementService");
            }
            if(zzgb0 == null) {
                try {
                    this.zzb = false;
                    ConnectionTracker.getInstance().unbindService(this.zza.zza(), this.zza.zza);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            else {
                this.zza.zzl().zzb(new zzmp(this, zzgb0));
            }
        }
    }

    @Override  // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName0) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zza.zzj().zzc().zza("Service disconnected");
        this.zza.zzl().zzb(new zzms(this, componentName0));
    }

    static void zza(zzmq zzmq0, boolean z) {
        zzmq0.zzb = false;
    }

    @WorkerThread
    public final void zza() {
        this.zza.zzt();
        Context context0 = this.zza.zza();
        synchronized(this) {
            if(this.zzb) {
                this.zza.zzj().zzp().zza("Connection attempt already in progress");
                return;
            }
            if(this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                this.zza.zzj().zzp().zza("Already awaiting connection attempt");
                return;
            }
            this.zzc = new zzgj(context0, Looper.getMainLooper(), this, this);
            this.zza.zzj().zzp().zza("Connecting to remote service");
            this.zzb = true;
            Preconditions.checkNotNull(this.zzc);
            this.zzc.checkAvailabilityAndConnect();
        }
    }

    @WorkerThread
    public final void zza(Intent intent0) {
        this.zza.zzt();
        Context context0 = this.zza.zza();
        ConnectionTracker connectionTracker0 = ConnectionTracker.getInstance();
        synchronized(this) {
            if(this.zzb) {
                this.zza.zzj().zzp().zza("Connection attempt already in progress");
                return;
            }
            this.zza.zzj().zzp().zza("Using local app measurement service");
            this.zzb = true;
            connectionTracker0.bindService(context0, intent0, this.zza.zza, 0x81);
        }
    }

    @WorkerThread
    public final void zzb() {
        if(this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }
}

