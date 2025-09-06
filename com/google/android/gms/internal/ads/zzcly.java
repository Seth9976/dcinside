package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzcly implements zzcla {
    private final zzduv zza;

    zzcly(zzduv zzduv0) {
        this.zza = zzduv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map0) {
        String s = (String)map0.get("test_mode_enabled");
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.zza.zzo(s.equals("true"));
    }
}

