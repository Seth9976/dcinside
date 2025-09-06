package com.google.android.gms.internal.ads;

final class zzfmr implements Runnable {
    @Override
    public final void run() {
        if(zzfmu.zzc != null) {
            zzfmu.zzc.post(zzfmu.zzd);
            zzfmu.zzc.postDelayed(zzfmu.zze, 200L);
        }
    }
}

