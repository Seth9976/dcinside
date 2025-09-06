package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

public final class zzcco {
    private long zza;

    public final long zza(ByteBuffer byteBuffer0) {
        zzarc zzarc0;
        long v = this.zza;
        if(v > 0L) {
            return v;
        }
        try {
            zzarb zzarb0 = null;
            ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
            byteBuffer1.flip();
            Iterator iterator0 = new zzaqx(new zzccn(byteBuffer1), zzccr.zzb).zzd().iterator();
            while(true) {
                zzarc0 = null;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                zzaqz zzaqz0 = (zzaqz)object0;
                if(zzaqz0 instanceof zzarb) {
                    zzarb0 = (zzarb)zzaqz0;
                    break;
                }
            }
            for(Object object1: zzarb0.zzd()) {
                zzaqz zzaqz1 = (zzaqz)object1;
                if(zzaqz1 instanceof zzarc) {
                    zzarc0 = (zzarc)zzaqz1;
                    break;
                }
                if(false) {
                    break;
                }
            }
            long v1 = zzarc0.zzc() * 1000L / zzarc0.zzd();
            this.zza = v1;
            return v1;
        }
        catch(RuntimeException | IOException unused_ex) {
            return 0L;
        }
    }
}

