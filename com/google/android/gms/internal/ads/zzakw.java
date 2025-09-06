package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

final class zzakw {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzakw(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, int v10) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = v4;
        this.zzf = v5;
        this.zzg = v6;
        this.zzh = v7;
        this.zzi = v8;
        this.zzj = v9;
        this.zzk = v10;
    }

    // This method was un-flattened
    @Nullable
    public static zzakw zza(String s) {
        String[] arr_s = TextUtils.split(s.substring(7), ",");
        int v1 = -1;
        int v2 = -1;
        int v3 = -1;
        int v4 = -1;
        int v5 = -1;
        int v6 = -1;
        int v7 = -1;
        int v8 = -1;
        int v9 = -1;
        int v10 = -1;
        for(int v = 0; v < arr_s.length; ++v) {
            switch(zzftt.zza(arr_s[v].trim())) {
                case "alignment": {
                    v2 = v;
                    break;
                }
                case "bold": {
                    v6 = v;
                    break;
                }
                case "borderstyle": {
                    v10 = v;
                    break;
                }
                case "fontsize": {
                    v5 = v;
                    break;
                }
                case "italic": {
                    v7 = v;
                    break;
                }
                case "name": {
                    v1 = v;
                    break;
                }
                case "outlinecolour": {
                    v4 = v;
                    break;
                }
                case "primarycolour": {
                    v3 = v;
                    break;
                }
                case "strikeout": {
                    v9 = v;
                    break;
                }
                case "underline": {
                    v8 = v;
                }
            }
        }
        return v1 == -1 ? null : new zzakw(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, arr_s.length);
    }
}

