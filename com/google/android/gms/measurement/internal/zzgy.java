package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

class zzgy extends BroadcastReceiver {
    private final zznv zza;
    private boolean zzb;
    private boolean zzc;

    static {
    }

    zzgy(zznv zznv0) {
        Preconditions.checkNotNull(zznv0);
        this.zza = zznv0;
    }

    @Override  // android.content.BroadcastReceiver
    @MainThread
    public void onReceive(Context context0, Intent intent0) {
        this.zza.zzs();
        String s = intent0.getAction();
        this.zza.zzj().zzp().zza("NetworkBroadcastReceiver received action", s);
        if("android.net.conn.CONNECTIVITY_CHANGE".equals(s)) {
            boolean z = this.zza.zzh().zzu();
            if(this.zzc != z) {
                this.zzc = z;
                this.zza.zzl().zzb(new zzgx(this, z));
            }
            return;
        }
        this.zza.zzj().zzu().zza("NetworkBroadcastReceiver received unknown action", s);
    }

    @WorkerThread
    public final void zza() {
        this.zza.zzs();
        this.zza.zzl().zzt();
        if(this.zzb) {
            return;
        }
        this.zza.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzc = this.zza.zzh().zzu();
        this.zza.zzj().zzp().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzc));
        this.zzb = true;
    }

    @WorkerThread
    public final void zzb() {
        this.zza.zzs();
        this.zza.zzl().zzt();
        this.zza.zzl().zzt();
        if(!this.zzb) {
            return;
        }
        this.zza.zzj().zzp().zza("Unregistering connectivity change receiver");
        this.zzb = false;
        this.zzc = false;
        Context context0 = this.zza.zza();
        try {
            context0.unregisterReceiver(this);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            this.zza.zzj().zzg().zza("Failed to unregister the network broadcast receiver", illegalArgumentException0);
        }
    }
}

