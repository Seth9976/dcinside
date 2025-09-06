package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzbz;

public final class zzhi implements ServiceConnection {
    final zzhf zza;
    private final String zzb;

    zzhi(zzhf zzhf0, String s) {
        this.zza = zzhf0;
        super();
        this.zzb = s;
    }

    @Override  // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        if(iBinder0 == null) {
            this.zza.zza.zzj().zzu().zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbz zzbz0 = zzby.zza(iBinder0);
            if(zzbz0 == null) {
                this.zza.zza.zzj().zzu().zza("Install Referrer Service implementation was not found");
                return;
            }
            this.zza.zza.zzj().zzp().zza("Install Referrer Service connected");
            this.zza.zza.zzl().zzb(new zzhh(this, zzbz0, this));
            return;
        }
        catch(RuntimeException runtimeException0) {
        }
        this.zza.zza.zzj().zzu().zza("Exception occurred while calling Install Referrer API", runtimeException0);
    }

    @Override  // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.zza.zza.zzj().zzp().zza("Install Referrer Service disconnected");
    }
}

