package com.google.android.gms.internal.ads;

public final class zzsr implements zzsy {
    @Override  // com.google.android.gms.internal.ads.zzsy
    public final int zza(Object object0) {
        String s = ((zzsg)object0).zza;
        if(!s.startsWith("OMX.google") && !s.startsWith("c2.android")) {
            return zzei.zza >= 26 || !s.equals("OMX.MTK.AUDIO.DECODER.RAW") ? 0 : -1;
        }
        return 1;
    }
}

