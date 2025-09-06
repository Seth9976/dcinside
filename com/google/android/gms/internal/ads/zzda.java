package com.google.android.gms.internal.ads;

import jeb.synthetic.FIN;

public final class zzda {
    private boolean zza;

    public zzda() {
        throw null;
    }

    public zzda(zzcx zzcx0) {
    }

    public final void zza() throws InterruptedException {
        synchronized(this) {
            while(!this.zza) {
                this.wait();
            }
        }
    }

    public final void zzb() {
        int v;
        __monitor_enter(this);
        boolean z = false;
    alab1:
        while(true) {
            v = FIN.finallyOpen$NT();
            while(true) {
                if(this.zza) {
                    break alab1;
                }
                try {
                    this.wait();
                }
                catch(InterruptedException unused_ex) {
                    z = true;
                    break;
                }
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
            FIN.finallyExec$NT(v);
            return;
        }
        FIN.finallyCodeBegin$NT(v);
        __monitor_exit(this);
        FIN.finallyCodeEnd$NT(v);
    }

    public final boolean zzc() {
        boolean z;
        synchronized(this) {
            z = this.zza;
            this.zza = false;
        }
        return z;
    }

    public final boolean zzd() {
        synchronized(this) {
        }
        return this.zza;
    }

    public final boolean zze() {
        synchronized(this) {
            if(this.zza) {
                return false;
            }
            this.zza = true;
            this.notifyAll();
            return true;
        }
    }
}

