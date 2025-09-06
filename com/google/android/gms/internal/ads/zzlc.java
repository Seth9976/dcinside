package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public final class zzlc {
    private final Object zza;
    @GuardedBy("lock")
    private Looper zzb;
    @GuardedBy("lock")
    private HandlerThread zzc;
    @GuardedBy("lock")
    private int zzd;

    public zzlc() {
        throw null;
    }

    public zzlc(Looper looper0) {
        this.zza = new Object();
        this.zzb = null;
        this.zzc = null;
        this.zzd = 0;
    }

    public final Looper zza() {
        boolean z = false;
        synchronized(this.zza) {
            if(this.zzb == null) {
                if(this.zzd == 0 && this.zzc == null) {
                    z = true;
                }
                zzcw.zzf(z);
                HandlerThread handlerThread0 = new HandlerThread("ExoPlayer:Playback", -16);
                this.zzc = handlerThread0;
                handlerThread0.start();
                this.zzb = this.zzc.getLooper();
            }
            ++this.zzd;
            return this.zzb;
        }
    }

    public final void zzb() {
        synchronized(this.zza) {
            zzcw.zzf(this.zzd > 0);
            int v1 = this.zzd - 1;
            this.zzd = v1;
            if(v1 == 0) {
                HandlerThread handlerThread0 = this.zzc;
                if(handlerThread0 != null) {
                    handlerThread0.quit();
                    this.zzc = null;
                    this.zzb = null;
                }
            }
        }
    }
}

