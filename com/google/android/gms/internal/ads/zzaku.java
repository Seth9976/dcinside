package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

final class zzaku {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzaku(int v, int v1, int v2, int v3, int v4) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = v4;
    }

    // This method was un-flattened
    @Nullable
    public static zzaku zza(String s) {
        zzcw.zzd(s.startsWith("Format:"));
        String[] arr_s = TextUtils.split(s.substring(7), ",");
        int v1 = -1;
        int v2 = -1;
        int v3 = -1;
        int v4 = -1;
        for(int v = 0; v < arr_s.length; ++v) {
            switch(zzftt.zza(arr_s[v].trim())) {
                case "end": {
                    v2 = v;
                    break;
                }
                case "start": {
                    v1 = v;
                    break;
                }
                case "style": {
                    v3 = v;
                    break;
                }
                case "text": {
                    v4 = v;
                }
            }
        }
        return v1 == -1 || v2 == -1 || v4 == -1 ? null : new zzaku(v1, v2, v3, v4, arr_s.length);
    }
}

