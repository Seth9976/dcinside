package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.Map;

final class zzbjc implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzcex zzcex0 = (zzcex)object0;
        try {
            String s = (String)map0.get("enabled");
            if(!zzftt.zzc("true", s) && !zzftt.zzc("false", s)) {
                return;
            }
            zzfrb.zza(zzcex0.getContext()).zzb(Boolean.parseBoolean(s));
            return;
        }
        catch(IOException iOException0) {
        }
        zzv.zzp().zzw(iOException0, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
    }
}

