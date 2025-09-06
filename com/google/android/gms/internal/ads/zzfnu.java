package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import jeb.synthetic.FIN;

final class zzfnu implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    private final zzfop zza;
    private final zzfoj zzb;
    private final Object zzc;
    private boolean zzd;
    private boolean zze;

    zzfnu(@NonNull Context context0, @NonNull Looper looper0, @NonNull zzfoj zzfoj0) {
        this.zzc = new Object();
        this.zzd = false;
        this.zze = false;
        this.zzb = zzfoj0;
        this.zza = new zzfop(context0, looper0, this, this, 12800000);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle0) {
        Object object0 = this.zzc;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.zze) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        try {
            this.zze = true;
            this.zza.zzp().zzg(new zzfon(this.zzb.zzaV()));
        }
        catch(Exception unused_ex) {
        }
        finally {
            this.zzb();
            FIN.finallyExec$NT(v);
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult0) {
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
    }

    final void zza() {
        synchronized(this.zzc) {
            if(!this.zzd) {
                this.zzd = true;
                this.zza.checkAvailabilityAndConnect();
            }
        }
    }

    private final void zzb() {
        synchronized(this.zzc) {
            if(this.zza.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}

