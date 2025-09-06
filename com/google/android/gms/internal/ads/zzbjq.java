package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

public final class zzbjq implements zzbjp {
    private final zzduv zza;

    public zzbjq(zzduv zzduv0) {
        Preconditions.checkNotNull(zzduv0, "The Inspector Manager must not be null");
        this.zza = zzduv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        if(map0 != null && map0.containsKey("persistentData") && !TextUtils.isEmpty(((CharSequence)map0.get("persistentData")))) {
            String s = (String)map0.get("persistentData");
            this.zza.zzj(s);
        }
    }
}

