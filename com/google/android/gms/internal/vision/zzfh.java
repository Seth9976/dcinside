package com.google.android.gms.internal.vision;

import java.util.List;

final class zzfh extends zzfd {
    private final zzfg zza;

    zzfh() {
        this.zza = new zzfg();
    }

    @Override  // com.google.android.gms.internal.vision.zzfd
    public final void zza(Throwable throwable0) {
        throwable0.printStackTrace();
        List list0 = this.zza.zza(throwable0, false);
        if(list0 == null) {
            return;
        }
        synchronized(list0) {
            for(Object object0: list0) {
                System.err.print("Suppressed: ");
                ((Throwable)object0).printStackTrace();
            }
        }
    }

    @Override  // com.google.android.gms.internal.vision.zzfd
    public final void zza(Throwable throwable0, Throwable throwable1) {
        if(throwable1 == throwable0) {
            throw new IllegalArgumentException("Self suppression is not allowed.", throwable1);
        }
        if(throwable1 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.zza.zza(throwable0, true).add(throwable1);
    }
}

