package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

final class zzalh {
    @Nullable
    public static zzali zza(@Nullable zzali zzali0, @Nullable String[] arr_s, Map map0) {
        int v = 0;
        if(zzali0 == null) {
            if(arr_s == null) {
                return null;
            }
            if(arr_s.length == 1) {
                return (zzali)map0.get(arr_s[0]);
            }
            if(arr_s.length > 1) {
                zzali zzali1 = new zzali();
                while(v < arr_s.length) {
                    zzali1.zzl(((zzali)map0.get(arr_s[v])));
                    ++v;
                }
                return zzali1;
            }
        }
        else {
            if(arr_s != null && arr_s.length == 1) {
                zzali0.zzl(((zzali)map0.get(arr_s[0])));
                return zzali0;
            }
            if(arr_s != null && arr_s.length > 1) {
                while(v < arr_s.length) {
                    zzali0.zzl(((zzali)map0.get(arr_s[v])));
                    ++v;
                }
            }
        }
        return zzali0;
    }
}

