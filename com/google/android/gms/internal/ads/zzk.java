package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import h4.e;
import java.util.Arrays;
import java.util.Locale;
import w4.d;

public final class zzk {
    public static final zzk zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    @Nullable
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzi zzi0 = new zzi();
        zzi0.zzc(1);
        zzi0.zzb(2);
        zzi0.zzd(3);
        zzk.zza = zzi0.zzg();
        zzi zzi1 = new zzi();
        zzi1.zzc(1);
        zzi1.zzb(1);
        zzi1.zzd(2);
        zzi1.zzg();
    }

    zzk(int v, int v1, int v2, byte[] arr_b, int v3, int v4, zzj zzj0) {
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = arr_b;
        this.zzf = v3;
        this.zzg = v4;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzk.class == class0 && this.zzb == ((zzk)object0).zzb && this.zzc == ((zzk)object0).zzc && this.zzd == ((zzk)object0).zzd && Arrays.equals(this.zze, ((zzk)object0).zze) && this.zzf == ((zzk)object0).zzf && this.zzg == ((zzk)object0).zzg;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzh;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.zze);
            v = (((((this.zzb + 0x20F) * 0x1F + this.zzc) * 0x1F + this.zzd) * 0x1F + v1) * 0x1F + this.zzf) * 0x1F + this.zzg;
            this.zzh = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        String s = zzk.zzi(this.zzb);
        String s1 = zzk.zzh(this.zzc);
        String s2 = zzk.zzj(this.zzd);
        String s3 = "NA";
        String s4 = this.zzf == -1 ? "NA" : this.zzf + "bit Luma";
        int v = this.zzg;
        if(v != -1) {
            s3 = v + "bit Chroma";
        }
        return this.zze == null ? "ColorInfo(" + s + ", " + s1 + ", " + s2 + ", " + false + ", " + s4 + ", " + s3 + ")" : "ColorInfo(" + s + ", " + s1 + ", " + s2 + ", " + true + ", " + s4 + ", " + s3 + ")";
    }

    @d
    public static int zza(int v) {
        switch(v) {
            case 1: {
                return 1;
            }
            case 4: {
                return 2;
            }
            case 9: {
                return 6;
            }
            default: {
                return v == 5 || v == 6 || v == 7 ? 2 : -1;
            }
        }
    }

    @d
    public static int zzb(int v) {
        switch(v) {
            case 4: {
                return 10;
            }
            case 1: 
            case 6: 
            case 7: {
                return 3;
            }
            case 13: {
                return 2;
            }
            case 16: {
                return 6;
            }
            case 18: {
                return 7;
            }
            default: {
                return -1;
            }
        }
    }

    public final zzi zzc() {
        return new zzi(this, null);
    }

    public final String zzd() {
        if(this.zzf()) {
            Object[] arr_object = {zzk.zzi(this.zzb), zzk.zzh(this.zzc), zzk.zzj(this.zzd)};
            String s = String.format(Locale.US, "%s/%s/%s", arr_object);
            return this.zze() ? s + "/" + (this.zzf + "/" + this.zzg) : s + "/" + "NA/NA";
        }
        return this.zze() ? "NA/NA/NA/" + (this.zzf + "/" + this.zzg) : "NA/NA/NA/NA/NA";
    }

    public final boolean zze() {
        return this.zzf != -1 && this.zzg != -1;
    }

    public final boolean zzf() {
        return this.zzb != -1 && this.zzc != -1 && this.zzd != -1;
    }

    @e(expression = {"#1"}, result = false)
    public static boolean zzg(@Nullable zzk zzk0) {
        if(zzk0 == null) {
            return true;
        }
        return zzk0.zzb == -1 || zzk0.zzb == 1 || zzk0.zzb == 2 ? (zzk0.zzc == -1 || zzk0.zzc == 2) && (zzk0.zzd == -1 || zzk0.zzd == 3) && zzk0.zze == null && (zzk0.zzg == -1 || zzk0.zzg == 8) && (zzk0.zzf == -1 || zzk0.zzf == 8) : false;
    }

    private static String zzh(int v) {
        switch(v) {
            case -1: {
                return "Unset color range";
            }
            case 1: {
                return "Full range";
            }
            case 2: {
                return "Limited range";
            }
            default: {
                return "Undefined color range " + v;
            }
        }
    }

    private static String zzi(int v) {
        switch(v) {
            case -1: {
                return "Unset color space";
            }
            case 1: {
                return "BT709";
            }
            case 2: {
                return "BT601";
            }
            case 6: {
                return "BT2020";
            }
            default: {
                return "Undefined color space " + v;
            }
        }
    }

    private static String zzj(int v) {
        switch(v) {
            case -1: {
                return "Unset color transfer";
            }
            case 1: {
                return "Linear";
            }
            case 2: {
                return "sRGB";
            }
            case 3: {
                return "SDR SMPTE 170M";
            }
            case 6: {
                return "ST2084 PQ";
            }
            case 7: {
                return "HLG";
            }
            case 10: {
                return "Gamma 2.2";
            }
            default: {
                return "Undefined color transfer " + v;
            }
        }
    }
}

