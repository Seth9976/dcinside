package com.google.android.gms.internal.ads;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

public final class zzawp extends zzaxr {
    public zzawp(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1) {
        super(zzawd0, "IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", zzasc0, v, 49);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int v = 1;
        this.zzd.zzaa(3);
        try {
            boolean z = ((Boolean)this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzasc zzasc0 = this.zzd;
            if(z) {
                v = 2;
            }
            zzasc0.zzaa(v);
        }
        catch(InvocationTargetException invocationTargetException0) {
            if(!(invocationTargetException0.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw invocationTargetException0;
            }
        }
    }
}

