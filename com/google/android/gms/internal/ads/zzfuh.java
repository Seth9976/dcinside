package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o3.a;

public final class zzfuh {
    private final String zza;
    private final zzfug zzb;
    private zzfug zzc;

    zzfuh(String s, zzfui zzfui0) {
        zzfug zzfug0 = new zzfug();
        this.zzb = zzfug0;
        this.zzc = zzfug0;
        s.getClass();
        this.zza = s;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x20);
        stringBuilder0.append(this.zza);
        stringBuilder0.append('{');
        zzfug zzfug0 = this.zzb.zzb;
        for(String s = ""; zzfug0 != null; s = ", ") {
            Object object0 = zzfug0.zza;
            stringBuilder0.append(s);
            if(object0 == null || !object0.getClass().isArray()) {
                stringBuilder0.append(object0);
            }
            else {
                String s1 = Arrays.deepToString(new Object[]{object0});
                stringBuilder0.append(s1, 1, s1.length() - 1);
            }
            zzfug0 = zzfug0.zzb;
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    public final zzfuh zza(@a Object object0) {
        zzfug zzfug0 = new zzfug();
        this.zzc.zzb = zzfug0;
        this.zzc = zzfug0;
        zzfug0.zza = object0;
        return this;
    }
}

