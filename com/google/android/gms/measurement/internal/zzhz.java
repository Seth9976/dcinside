package com.google.android.gms.measurement.internal;

import android.os.Process;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import jeb.synthetic.FIN;

final class zzhz extends Thread {
    private final Object zza;
    private final BlockingQueue zzb;
    @GuardedBy("threadLifeCycleLock")
    private boolean zzc;
    private final zzhv zzd;

    public zzhz(zzhv zzhv0, String s, BlockingQueue blockingQueue0) {
        this.zzd = zzhv0;
        super();
        this.zzc = false;
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(blockingQueue0);
        this.zza = new Object();
        this.zzb = blockingQueue0;
        this.setName(s);
    }

    @Override
    public final void run() {
        for(boolean z = false; !z; z = true) {
            try {
                this.zzd.zzi.acquire();
            }
            catch(InterruptedException interruptedException0) {
                this.zza(interruptedException0);
            }
        }
        int v = FIN.finallyOpen$NT();
        int v1 = Process.getThreadPriority(Process.myTid());
        while(true) {
            zzhw zzhw0 = (zzhw)this.zzb.poll();
            if(zzhw0 == null) {
                Object object0 = this.zza;
                __monitor_enter(object0);
                try {
                    if(this.zzb.peek() == null && !this.zzd.zzj) {
                        try {
                            this.zza.wait(30000L);
                        }
                        catch(InterruptedException interruptedException1) {
                            this.zza(interruptedException1);
                        }
                    }
                }
                catch(Throwable throwable0) {
                    __monitor_exit(object0);
                    FIN.finallyExec$NT(v);
                    throw throwable0;
                }
                __monitor_exit(object0);
                Object object1 = this.zzd.zzh;
                __monitor_enter(object1);
                try {
                    if(this.zzb.peek() == null) {
                        this.zzb();
                        goto label_38;
                    }
                    goto label_43;
                }
                catch(Throwable throwable1) {
                    __monitor_exit(object1);
                    FIN.finallyExec$NT(v);
                    throw throwable1;
                }
            label_38:
                __monitor_exit(object1);
                FIN.finallyCodeBegin$NT(v);
                this.zzb();
                FIN.finallyCodeEnd$NT(v);
                return;
            label_43:
                __monitor_exit(object1);
            }
            else {
                Process.setThreadPriority((zzhw0.zza ? v1 : 10));
                zzhw0.run();
            }
        }
    }

    private final void zza(InterruptedException interruptedException0) {
        this.zzd.zzj().zzu().zza(this.getName() + " was interrupted", interruptedException0);
    }

    public final void zza() {
        synchronized(this.zza) {
            this.zza.notifyAll();
        }
    }

    private final void zzb() {
        synchronized(this.zzd.zzh) {
            if(!this.zzc) {
                this.zzd.zzi.release();
                this.zzd.zzh.notifyAll();
                if(this == this.zzd.zzb) {
                    zzhv.zzb(this.zzd, null);
                }
                else if(this == this.zzd.zzc) {
                    zzhv.zza(this.zzd, null);
                }
                else {
                    this.zzd.zzj().zzg().zza("Current scheduler thread is neither worker nor network");
                }
                this.zzc = true;
            }
        }
    }
}

