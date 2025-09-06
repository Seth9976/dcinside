package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class zzaoy extends Thread {
    private static final boolean zza;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaow zzd;
    private volatile boolean zze;
    private final zzapz zzf;
    private final zzapd zzg;

    static {
        zzaoy.zza = zzapy.zzb;
    }

    public zzaoy(BlockingQueue blockingQueue0, BlockingQueue blockingQueue1, zzaow zzaow0, zzapd zzapd0) {
        this.zze = false;
        this.zzb = blockingQueue0;
        this.zzc = blockingQueue1;
        this.zzd = zzaow0;
        this.zzg = zzapd0;
        this.zzf = new zzapz(this, blockingQueue1, zzapd0);
    }

    @Override
    public final void run() {
        if(zzaoy.zza) {
            zzapy.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while(true) {
            try {
            label_4:
                this.zzc();
                goto label_4;
            }
            catch(InterruptedException unused_ex) {
            }
            if(this.zze) {
                break;
            }
            zzapy.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
        }
        Thread.currentThread().interrupt();
    }

    public final void zzb() {
        this.zze = true;
        this.interrupt();
    }

    private void zzc() throws InterruptedException {
        zzapm zzapm0 = (zzapm)this.zzb.take();
        zzapm0.zzm("cache-queue-take");
        zzapm0.zzt(1);
        try {
            String s = zzapm0.zzj();
            zzaov zzaov0 = this.zzd.zza(s);
            if(zzaov0 == null) {
                zzapm0.zzm("cache-miss");
                if(!this.zzf.zzc(zzapm0)) {
                    this.zzc.put(zzapm0);
                }
            }
            else {
                long v1 = System.currentTimeMillis();
                if(zzaov0.zza(v1)) {
                    zzapm0.zzm("cache-hit-expired");
                    zzapm0.zze(zzaov0);
                    if(!this.zzf.zzc(zzapm0)) {
                        this.zzc.put(zzapm0);
                    }
                }
                else {
                    zzapm0.zzm("cache-hit");
                    zzaps zzaps0 = zzapm0.zzh(new zzapi(zzaov0.zza, zzaov0.zzg));
                    zzapm0.zzm("cache-hit-parsed");
                    if(!zzaps0.zzc()) {
                        zzapm0.zzm("cache-parsing-failed");
                        String s1 = zzapm0.zzj();
                        this.zzd.zzc(s1, true);
                        zzapm0.zze(null);
                        if(!this.zzf.zzc(zzapm0)) {
                            this.zzc.put(zzapm0);
                        }
                    }
                    else if(zzaov0.zzf < v1) {
                        zzapm0.zzm("cache-hit-refresh-needed");
                        zzapm0.zze(zzaov0);
                        zzaps0.zzd = true;
                        if(this.zzf.zzc(zzapm0)) {
                            this.zzg.zzb(zzapm0, zzaps0, null);
                        }
                        else {
                            zzaox zzaox0 = new zzaox(this, zzapm0);
                            this.zzg.zzb(zzapm0, zzaps0, zzaox0);
                        }
                    }
                    else {
                        this.zzg.zzb(zzapm0, zzaps0, null);
                    }
                }
            }
        }
        finally {
            zzapm0.zzt(2);
        }
    }
}

