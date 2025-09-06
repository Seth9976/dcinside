package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzacj {
    public final String zza;

    private zzacj(int v, int v1, String s) {
        this.zza = s;
    }

    @Nullable
    public static zzacj zza(zzdy zzdy0) {
        String s;
        zzdy0.zzM(2);
        int v = zzdy0.zzm();
        int v1 = zzdy0.zzm();
        if(v >> 1 == 4 || v >> 1 == 5) {
            s = "dvhe";
        }
        else {
            switch(v >> 1) {
                case 7: {
                    s = "dvhe";
                    break;
                }
                case 8: {
                    s = "hev1";
                    break;
                }
                case 9: {
                    s = "avc3";
                    break;
                }
                default: {
                    return null;
                }
            }
        }
        int v2 = v1 >> 3 | (v & 1) << 5;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        String s1 = ".0";
        stringBuilder0.append(".0");
        stringBuilder0.append(v >> 1);
        if(v2 >= 10) {
            s1 = ".";
        }
        stringBuilder0.append(s1);
        stringBuilder0.append(v2);
        return new zzacj(v >> 1, v2, stringBuilder0.toString());
    }
}

