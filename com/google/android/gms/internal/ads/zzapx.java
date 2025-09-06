package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

final class zzapx {
    public static final boolean zza;
    private final List zzb;
    private boolean zzc;

    static {
        zzapx.zza = zzapy.zzb;
    }

    zzapx() {
        this.zzb = new ArrayList();
        this.zzc = false;
    }

    @Override
    protected final void finalize() throws Throwable {
        if(!this.zzc) {
            this.zzb("Request on the loose");
            zzapy.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public final void zza(String s, long v) {
        synchronized(this) {
            if(!this.zzc) {
                zzapw zzapw0 = new zzapw(s, v, SystemClock.elapsedRealtime());
                this.zzb.add(zzapw0);
                return;
            }
        }
        throw new IllegalStateException("Marker added to finished log");
    }

    public final void zzb(String s) {
        long v1;
        synchronized(this) {
            this.zzc = true;
            if(this.zzb.size() == 0) {
                v1 = 0L;
            }
            else {
                long v2 = ((zzapw)this.zzb.get(0)).zzc;
                v1 = ((zzapw)this.zzb.get(this.zzb.size() - 1)).zzc - v2;
            }
            if(v1 > 0L) {
                long v3 = ((zzapw)this.zzb.get(0)).zzc;
                zzapy.zza("(%-4d ms) %s", new Object[]{v1, s});
                for(Object object0: this.zzb) {
                    zzapy.zza("(+%-4d) [%2d] %s", new Object[]{((long)(((zzapw)object0).zzc - v3)), ((zzapw)object0).zzb, ((zzapw)object0).zza});
                    v3 = ((zzapw)object0).zzc;
                }
            }
        }
    }
}

