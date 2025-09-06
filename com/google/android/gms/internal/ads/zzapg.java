package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class zzapg extends Thread {
    private final BlockingQueue zza;
    private final zzapf zzb;
    private final zzaow zzc;
    private volatile boolean zzd;
    private final zzapd zze;

    public zzapg(BlockingQueue blockingQueue0, zzapf zzapf0, zzaow zzaow0, zzapd zzapd0) {
        this.zzd = false;
        this.zza = blockingQueue0;
        this.zzb = zzapf0;
        this.zzc = zzaow0;
        this.zze = zzapd0;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(10);
        while(true) {
            try {
            label_1:
                this.zzb();
                goto label_1;
            }
            catch(InterruptedException unused_ex) {
            }
            if(this.zzd) {
                break;
            }
            zzapy.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
        }
        Thread.currentThread().interrupt();
    }

    public final void zza() {
        this.zzd = true;
        this.interrupt();
    }

    private void zzb() throws InterruptedException {
        zzapm zzapm0 = (zzapm)this.zza.take();
        SystemClock.elapsedRealtime();
        zzapm0.zzt(3);
        try {
            zzapm0.zzm("network-queue-take");
            TrafficStats.setThreadStatsTag(zzapm0.zzc());
            zzapi zzapi0 = this.zzb.zza(zzapm0);
            zzapm0.zzm("network-http-complete");
            if(!zzapi0.zze || !zzapm0.zzv()) {
                zzaps zzaps0 = zzapm0.zzh(zzapi0);
                zzapm0.zzm("network-parse-complete");
                if(zzaps0.zzb != null) {
                    String s = zzapm0.zzj();
                    this.zzc.zzd(s, zzaps0.zzb);
                    zzapm0.zzm("network-cache-written");
                }
                zzapm0.zzq();
                this.zze.zzb(zzapm0, zzaps0, null);
                zzapm0.zzs(zzaps0);
            }
            else {
                zzapm0.zzp("not-modified");
                zzapm0.zzr();
                return;
            }
            return;
        }
        catch(zzapv zzapv0) {
        }
        catch(Exception exception0) {
            goto label_29;
        }
        finally {
            zzapm0.zzt(4);
        }
        SystemClock.elapsedRealtime();
        this.zze.zza(zzapm0, zzapv0);
        zzapm0.zzr();
        return;
    label_29:
        zzapy.zzc(exception0, "Unhandled exception %s", new Object[]{exception0.toString()});
        zzapv zzapv1 = new zzapv(exception0);
        SystemClock.elapsedRealtime();
        this.zze.zza(zzapm0, zzapv1);
        zzapm0.zzr();
    }
}

