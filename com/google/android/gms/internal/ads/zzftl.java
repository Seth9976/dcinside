package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class zzftl implements ServiceConnection {
    final zzftn zza;

    zzftl(zzftn zzftn0, zzftm zzftm0) {
        this.zza = zzftn0;
        super();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        this.zza.zzc.zzc("LmdServiceConnectionManager.onServiceConnected(%s)", new Object[]{componentName0});
        zzftj zzftj0 = new zzftj(this, iBinder0);
        this.zza.zzo(zzftj0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.zza.zzc.zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", new Object[]{componentName0});
        zzftk zzftk0 = new zzftk(this);
        this.zza.zzo(zzftk0);
    }
}

