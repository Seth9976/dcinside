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
final class zzfnr implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    @VisibleForTesting
    protected final zzfop zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfni zzf;
    private final long zzg;
    private final int zzh;

    public zzfnr(Context context0, int v, int v1, String s, String s1, String s2, zzfni zzfni0) {
        this.zzb = s;
        this.zzh = v1;
        this.zzc = s1;
        this.zzf = zzfni0;
        HandlerThread handlerThread0 = new HandlerThread("GassDGClient");
        this.zze = handlerThread0;
        handlerThread0.start();
        this.zzg = System.currentTimeMillis();
        zzfop zzfop0 = new zzfop(context0, handlerThread0.getLooper(), this, this, 19621000);
        this.zza = zzfop0;
        this.zzd = new LinkedBlockingQueue();
        zzfop0.checkAvailabilityAndConnect();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        zzfou zzfou0 = this.zzc();
        if(zzfou0 != null) {
            try {
                zzfpb zzfpb0 = zzfou0.zzf(new zzfoz(1, this.zzh, this.zzb, this.zzc));
                this.zzd(5011, this.zzg, null);
                this.zzd.put(zzfpb0);
            }
            catch(Throwable throwable0) {
                Exception exception0 = new Exception(throwable0);
                this.zzd(2010, this.zzg, exception0);
            }
            finally {
                this.zzb();
                this.zze.quit();
            }
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        try {
            this.zzd(0xFAC, this.zzg, null);
            zzfpb zzfpb0 = new zzfpb(null, 1);
            this.zzd.put(zzfpb0);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        try {
            this.zzd(0xFAB, this.zzg, null);
            zzfpb zzfpb0 = new zzfpb(null, 1);
            this.zzd.put(zzfpb0);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    public final zzfpb zza(int v) {
        zzfpb zzfpb0;
        try {
            zzfpb0 = (zzfpb)this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException interruptedException0) {
            this.zzd(2009, this.zzg, interruptedException0);
            zzfpb0 = null;
        }
        this.zzd(3004, this.zzg, null);
        if(zzfpb0 != null) {
            if(zzfpb0.zzc == 7) {
                zzfni.zzg(3);
                return zzfpb0 == null ? new zzfpb(null, 1) : zzfpb0;
            }
            zzfni.zzg(2);
        }
        return zzfpb0 == null ? new zzfpb(null, 1) : zzfpb0;
    }

    public final void zzb() {
        if(this.zza != null && (this.zza.isConnected() || this.zza.isConnecting())) {
            this.zza.disconnect();
        }
    }

    protected final zzfou zzc() {
        try {
            return this.zza.zzp();
        }
        catch(IllegalStateException | DeadObjectException unused_ex) {
            return null;
        }
    }

    private final void zzd(int v, long v1, Exception exception0) {
        this.zzf.zzc(v, System.currentTimeMillis() - v1, exception0);
    }
}

