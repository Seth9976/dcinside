package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
final class zzfnp implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    @VisibleForTesting
    protected final zzfop zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfnp(Context context0, String s, String s1) {
        this.zzb = s;
        this.zzc = s1;
        HandlerThread handlerThread0 = new HandlerThread("GassClient");
        this.zze = handlerThread0;
        handlerThread0.start();
        zzfop zzfop0 = new zzfop(context0, handlerThread0.getLooper(), this, this, 9200000);
        this.zza = zzfop0;
        this.zzd = new LinkedBlockingQueue();
        zzfop0.checkAvailabilityAndConnect();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        zzfou zzfou0 = this.zzd();
        if(zzfou0 != null) {
            try {
                zzasy zzasy0 = zzfou0.zze(new zzfoq(this.zzb, this.zzc)).zza();
                this.zzd.put(zzasy0);
            }
            catch(Throwable unused_ex) {
                try {
                    zzasy zzasy1 = zzfnp.zza();
                    this.zzd.put(zzasy1);
                }
                catch(InterruptedException unused_ex) {
                }
            }
            finally {
                this.zzc();
                this.zze.quit();
            }
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        try {
            zzasy zzasy0 = zzfnp.zza();
            this.zzd.put(zzasy0);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        try {
            zzasy zzasy0 = zzfnp.zza();
            this.zzd.put(zzasy0);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    @VisibleForTesting
    static zzasy zza() {
        zzasc zzasc0 = zzasy.zza();
        zzasc0.zzD(0x8000L);
        return (zzasy)zzasc0.zzbn();
    }

    public final zzasy zzb(int v) {
        zzasy zzasy0 = null;
        try {
            zzasy0 = (zzasy)this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException unused_ex) {
        }
        return zzasy0 == null ? zzfnp.zza() : zzasy0;
    }

    public final void zzc() {
        if(this.zza != null && (this.zza.isConnected() || this.zza.isConnecting())) {
            this.zza.disconnect();
        }
    }

    protected final zzfou zzd() {
        try {
            return this.zza.zzp();
        }
        catch(IllegalStateException | DeadObjectException unused_ex) {
            return null;
        }
    }
}

