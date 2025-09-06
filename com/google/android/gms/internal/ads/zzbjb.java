package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.Map;

final class zzbjb implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzcex zzcex0 = (zzcex)object0;
        try {
            zzfre.zzj(zzcex0.getContext()).zzk();
            zzfrf.zzi(zzcex0.getContext()).zzj();
            zzfrg.zza(zzcex0.getContext()).zzb(null);
        }
        catch(IOException iOException0) {
            zzv.zzp().zzw(iOException0, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}

