package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

final class zzapz implements zzapl {
    private final Map zza;
    @Nullable
    private final zzaoy zzb;
    @Nullable
    private final BlockingQueue zzc;
    private final zzapd zzd;

    zzapz(@NonNull zzaoy zzaoy0, @NonNull BlockingQueue blockingQueue0, zzapd zzapd0) {
        this.zza = new HashMap();
        this.zzd = zzapd0;
        this.zzb = zzaoy0;
        this.zzc = blockingQueue0;
    }

    @Override  // com.google.android.gms.internal.ads.zzapl
    public final void zza(zzapm zzapm0) {
        synchronized(this) {
            String s = zzapm0.zzj();
            List list0 = (List)this.zza.remove(s);
            if(list0 != null && !list0.isEmpty()) {
                if(zzapy.zzb) {
                    zzapy.zzd("%d waiting requests for cacheKey=%s; resend to network", new Object[]{list0.size(), s});
                }
                zzapm zzapm1 = (zzapm)list0.remove(0);
                this.zza.put(s, list0);
                zzapm1.zzu(this);
                try {
                    this.zzc.put(zzapm1);
                }
                catch(InterruptedException interruptedException0) {
                    zzapy.zzb("Couldn\'t add request to queue. %s", new Object[]{interruptedException0.toString()});
                    Thread.currentThread().interrupt();
                    this.zzb.zzb();
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzapl
    public final void zzb(zzapm zzapm0, zzaps zzaps0) {
        List list0;
        if(zzaps0.zzb != null && !zzaps0.zzb.zza(System.currentTimeMillis())) {
            String s = zzapm0.zzj();
            synchronized(this) {
                list0 = (List)this.zza.remove(s);
            }
            if(list0 != null) {
                if(zzapy.zzb) {
                    zzapy.zzd("Releasing %d waiting requests for cacheKey=%s.", new Object[]{list0.size(), s});
                }
                for(Object object0: list0) {
                    this.zzd.zzb(((zzapm)object0), zzaps0, null);
                }
            }
            return;
        }
        this.zza(zzapm0);
    }

    final boolean zzc(zzapm zzapm0) {
        synchronized(this) {
            String s = zzapm0.zzj();
            if(this.zza.containsKey(s)) {
                List list0 = (List)this.zza.get(s);
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                zzapm0.zzm("waiting-for-response");
                list0.add(zzapm0);
                this.zza.put(s, list0);
                if(zzapy.zzb) {
                    zzapy.zza("Request for cacheKey=%s is in flight, putting on hold.", new Object[]{s});
                }
                return true;
            }
            this.zza.put(s, null);
            zzapm0.zzu(this);
            if(zzapy.zzb) {
                zzapy.zza("new request, sending to network %s", new Object[]{s});
            }
            return false;
        }
    }
}

