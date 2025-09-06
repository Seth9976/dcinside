package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode.VmPolicy;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.util.zzc;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

final class zzp implements ServiceConnection, zzt {
    final zzs zza;
    private final Map zzb;
    private int zzc;
    private boolean zzd;
    @Nullable
    private IBinder zze;
    private final zzo zzf;
    private ComponentName zzg;

    public zzp(zzs zzs0, zzo zzo0) {
        this.zza = zzs0;
        super();
        this.zzf = zzo0;
        this.zzb = new HashMap();
        this.zzc = 2;
    }

    @Override  // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName0) {
        this.onServiceDisconnected(componentName0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        synchronized(this.zza.zzb) {
            this.zza.zzd.removeMessages(1, this.zzf);
            this.zze = iBinder0;
            this.zzg = componentName0;
            for(Object object0: this.zzb.values()) {
                ((ServiceConnection)object0).onServiceConnected(componentName0, iBinder0);
            }
            this.zzc = 1;
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        synchronized(this.zza.zzb) {
            this.zza.zzd.removeMessages(1, this.zzf);
            this.zze = null;
            this.zzg = componentName0;
            for(Object object0: this.zzb.values()) {
                ((ServiceConnection)object0).onServiceDisconnected(componentName0);
            }
            this.zzc = 2;
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final ComponentName zzb() {
        return this.zzg;
    }

    @Nullable
    public final IBinder zzc() {
        return this.zze;
    }

    static ConnectionResult zzd(zzp zzp0, String s, Executor executor0) {
        ConnectionResult connectionResult0;
        Intent intent0;
        try {
            intent0 = zzp0.zzf.zzb(zzp0.zza.zzc);
        }
        catch(zzaj zzaj0) {
            return zzaj0.zza;
        }
        zzp0.zzc = 3;
        StrictMode.VmPolicy strictMode$VmPolicy0 = zzc.zza();
        try {
            boolean z = zzp0.zza.zzf.zza(zzp0.zza.zzc, s, intent0, zzp0, 0x1081, executor0);
            zzp0.zzd = z;
            if(z) {
                Message message0 = zzp0.zza.zzd.obtainMessage(1, zzp0.zzf);
                zzp0.zza.zzd.sendMessageDelayed(message0, zzp0.zza.zzh);
                connectionResult0 = ConnectionResult.RESULT_SUCCESS;
            }
            else {
                try {
                    zzp0.zzc = 2;
                    zzp0.zza.zzf.unbindService(zzp0.zza.zzc, zzp0);
                }
                catch(IllegalArgumentException unused_ex) {
                }
                connectionResult0 = new ConnectionResult(16);
            }
            return connectionResult0;
        }
        finally {
            StrictMode.setVmPolicy(strictMode$VmPolicy0);
        }
    }

    public final void zze(ServiceConnection serviceConnection0, ServiceConnection serviceConnection1, String s) {
        this.zzb.put(serviceConnection0, serviceConnection1);
    }

    public final void zzf(ServiceConnection serviceConnection0, String s) {
        this.zzb.remove(serviceConnection0);
    }

    public final void zzg(String s) {
        this.zza.zzd.removeMessages(1, this.zzf);
        this.zza.zzf.unbindService(this.zza.zzc, this);
        this.zzd = false;
        this.zzc = 2;
    }

    public final boolean zzh(ServiceConnection serviceConnection0) {
        return this.zzb.containsKey(serviceConnection0);
    }

    public final boolean zzi() {
        return this.zzb.isEmpty();
    }

    public final boolean zzj() {
        return this.zzd;
    }
}

