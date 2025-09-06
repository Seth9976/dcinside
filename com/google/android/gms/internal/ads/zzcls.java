package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzcls implements zzcla {
    private final zzfbn zza;

    public zzcls(zzfbn zzfbn0) {
        this.zza = zzfbn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map0) {
        String s = (String)map0.get("render_in_browser");
        if(!TextUtils.isEmpty(s)) {
            try {
                this.zza.zzb(Boolean.parseBoolean(s));
            }
            catch(Exception exception0) {
                throw new IllegalStateException("Invalid render_in_browser state", exception0);
            }
        }
    }
}

