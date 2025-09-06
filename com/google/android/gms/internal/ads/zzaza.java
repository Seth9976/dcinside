package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o3.j;

@j
public final class zzaza {
    @VisibleForTesting
    int zza;
    private final Object zzb;
    private final List zzc;

    public zzaza() {
        this.zzb = new Object();
        this.zzc = new LinkedList();
    }

    public final void zza(zzayz zzayz0) {
        synchronized(this.zzb) {
            if(this.zzc.size() >= 10) {
                zzo.zze(("Queue is full, current size = " + this.zzc.size()));
                this.zzc.remove(0);
            }
            int v1 = this.zza;
            this.zza = v1 + 1;
            zzayz0.zzg(v1);
            zzayz0.zzk();
            this.zzc.add(zzayz0);
        }
    }

    public final boolean zzb(zzayz zzayz0) {
        synchronized(this.zzb) {
            Iterator iterator0 = this.zzc.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                zzayz zzayz1 = (zzayz)object1;
                if(!zzv.zzp().zzi().zzK()) {
                    if(zzayz0.equals(zzayz1) || !zzayz1.zzc().equals(zzayz0.zzc())) {
                        continue;
                    }
                    iterator0.remove();
                    return true;
                }
                if(!zzv.zzp().zzi().zzL() && !zzayz0.equals(zzayz1) && zzayz1.zzd().equals(zzayz0.zzd())) {
                    iterator0.remove();
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
    }

    public final boolean zzc(zzayz zzayz0) {
        synchronized(this.zzb) {
            return this.zzc.contains(zzayz0);
        }
    }
}

