package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzyh {
    private final CopyOnWriteArrayList zza;

    public zzyh() {
        this.zza = new CopyOnWriteArrayList();
    }

    public final void zza(Handler handler0, zzyi zzyi0) {
        this.zzc(zzyi0);
        zzyg zzyg0 = new zzyg(handler0, zzyi0);
        this.zza.add(zzyg0);
    }

    public final void zzb(int v, long v1, long v2) {
        for(Object object0: this.zza) {
            zzyg zzyg0 = (zzyg)object0;
            if(!zzyg0.zzc) {
                zzyg0.zza.post(new zzyf(zzyg0, v, v1, v2));
            }
        }
    }

    public final void zzc(zzyi zzyi0) {
        for(Object object0: this.zza) {
            zzyg zzyg0 = (zzyg)object0;
            if(zzyg0.zzb == zzyi0) {
                zzyg0.zzc();
                this.zza.remove(zzyg0);
            }
        }
    }
}

