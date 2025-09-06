package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Locale;

final class zzaky {
    public final String zza;
    public final int zzb;
    @ColorInt
    @Nullable
    public final Integer zzc;
    @ColorInt
    @Nullable
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzaky(String s, int v, @ColorInt @Nullable Integer integer0, @ColorInt @Nullable Integer integer1, float f, boolean z, boolean z1, boolean z2, boolean z3, int v1) {
        this.zza = s;
        this.zzb = v;
        this.zzc = integer0;
        this.zzd = integer1;
        this.zze = f;
        this.zzf = z;
        this.zzg = z1;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = v1;
    }

    @Nullable
    public static zzaky zzb(String s, zzakw zzakw0) {
        int v5;
        zzcw.zzd(s.startsWith("Style:"));
        String[] arr_s = TextUtils.split(s.substring(6), ",");
        int v = zzakw0.zzk;
        if(arr_s.length != v) {
            zzdo.zzf("SsaStyle", String.format(Locale.US, "Skipping malformed \'Style:\' line (expected %s values, found %s): \'%s\'", v, ((int)arr_s.length), s));
            return null;
        }
        try {
            String s1 = arr_s[zzakw0.zza].trim();
            int v1 = zzakw0.zzb == -1 ? -1 : zzaky.zzd(arr_s[zzakw0.zzb].trim());
            Integer integer0 = zzakw0.zzc == -1 ? null : zzaky.zzc(arr_s[zzakw0.zzc].trim());
            Integer integer1 = zzakw0.zzd == -1 ? null : zzaky.zzc(arr_s[zzakw0.zzd].trim());
            int v2 = zzakw0.zze;
            float f = -3.402823E+38f;
            if(v2 != -1) {
                String s2 = arr_s[v2].trim();
                try {
                    f = Float.parseFloat(s2);
                }
                catch(NumberFormatException numberFormatException0) {
                    zzdo.zzg("SsaStyle", "Failed to parse font size: \'" + s2 + "\'", numberFormatException0);
                }
            }
            boolean z = zzakw0.zzf != -1 && zzaky.zze(arr_s[zzakw0.zzf].trim());
            boolean z1 = zzakw0.zzg != -1 && zzaky.zze(arr_s[zzakw0.zzg].trim());
            boolean z2 = zzakw0.zzh != -1 && zzaky.zze(arr_s[zzakw0.zzh].trim());
            boolean z3 = zzakw0.zzi != -1 && zzaky.zze(arr_s[zzakw0.zzi].trim());
            int v3 = zzakw0.zzj;
            if(v3 == -1) {
                v5 = -1;
            }
            else {
                String s3 = arr_s[v3].trim();
                try {
                    int v4 = Integer.parseInt(s3.trim());
                    if(v4 == 1 || v4 == 3) {
                        v5 = v4;
                        return new zzaky(s1, v1, integer0, integer1, f, z, z1, z2, z3, v5);
                    }
                    goto label_29;
                }
                catch(NumberFormatException unused_ex) {
                label_29:
                    zzdo.zzf("SsaStyle", "Ignoring unknown BorderStyle: " + s3);
                    v5 = -1;
                    return new zzaky(s1, v1, integer0, integer1, f, z, z1, z2, z3, v5);
                }
            }
            return new zzaky(s1, v1, integer0, integer1, f, z, z1, z2, z3, v5);
        }
        catch(RuntimeException runtimeException0) {
        }
        zzdo.zzg("SsaStyle", "Skipping malformed \'Style:\' line: \'" + s + "\'", runtimeException0);
        return null;
    }

    @ColorInt
    @Nullable
    public static Integer zzc(String s) {
        long v;
        try {
            v = s.startsWith("&H") ? Long.parseLong(s.substring(2), 16) : Long.parseLong(s);
            zzcw.zzd(v <= 0xFFFFFFFFL);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            zzdo.zzg("SsaStyle", "Failed to parse color expression: \'" + s + "\'", illegalArgumentException0);
            return null;
        }
        int v1 = zzgaq.zzb(v >> 24 & 0xFFL ^ 0xFFL);
        int v2 = zzgaq.zzb(v >> 16 & 0xFFL);
        int v3 = zzgaq.zzb(v >> 8 & 0xFFL);
        return Color.argb(v1, zzgaq.zzb(v & 0xFFL), v3, v2);
    }

    private static int zzd(String s) {
        try {
            int v = Integer.parseInt(s.trim());
            switch(v) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: {
                    return v;
                }
            }
        }
        catch(NumberFormatException unused_ex) {
        }
        zzdo.zzf("SsaStyle", "Ignoring unknown alignment: " + s);
        return -1;
    }

    private static boolean zze(String s) {
        try {
            int v = Integer.parseInt(s);
            return v == -1 || v == 1;
        }
        catch(NumberFormatException numberFormatException0) {
            zzdo.zzg("SsaStyle", "Failed to parse boolean value: \'" + s + "\'", numberFormatException0);
            return false;
        }
    }
}

