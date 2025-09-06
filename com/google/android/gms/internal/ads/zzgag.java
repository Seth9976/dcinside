package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

public final class zzgag {
    static {
    }

    public static int zza(double f, RoundingMode roundingMode0) {
        int v = 0;
        zzfun.zzf(f > 0.0 && zzgah.zzb(f), "x must be positive and finite");
        int v1 = Math.getExponent(f);
        if(Math.getExponent(f) >= 0xFFFFFC02) {
            switch(zzgaf.zza[roundingMode0.ordinal()]) {
                case 1: {
                    zzgam.zzb(zzgag.zzd(f));
                    return v1;
                }
                case 2: {
                    return v1;
                }
                case 3: {
                    return !zzgag.zzd(f) == 0 ? v1 : v1 + 1;
                }
                case 4: {
                    if(v1 < 0) {
                        v = 1;
                    }
                    return (v & !zzgag.zzd(f)) == 0 ? v1 : v1 + 1;
                }
                case 5: {
                    if(v1 >= 0) {
                        v = 1;
                    }
                    return (v & !zzgag.zzd(f)) == 0 ? v1 : v1 + 1;
                }
                case 6: 
                case 7: 
                case 8: {
                    double f1 = Double.longBitsToDouble(Double.doubleToRawLongBits(f) & 0xFFFFFFFFFFFFFL | 0x3FF0000000000000L);
                    return f1 * f1 > 2.0 ? v1 + 1 : v1;
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
        return zzgag.zza(f * 4503599627370496.0, roundingMode0) - 52;
    }

    public static long zzb(double f, RoundingMode roundingMode0) {
        double f1;
        if(!zzgah.zzb(f)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        int v = 1;
        switch(zzgaf.zza[roundingMode0.ordinal()]) {
            case 1: {
                zzgam.zzb(zzgag.zzc(f));
                f1 = f;
                break;
            }
            case 2: {
                f1 = f >= 0.0 || zzgag.zzc(f) ? f : ((double)(((long)f) - 1L));
                break;
            }
            case 3: {
                f1 = f <= 0.0 || zzgag.zzc(f) ? f : ((double)(((long)f) + 1L));
                break;
            }
            case 4: {
                f1 = f;
                break;
            }
            case 5: {
                f1 = zzgag.zzc(f) ? f : ((double)(((long)f) + ((long)(f > 0.0 ? 1 : -1))));
                break;
            }
            case 6: {
                f1 = Math.rint(f);
                break;
            }
            case 7: {
                f1 = Math.rint(f);
                if(Math.abs(f - f1) == 0.5) {
                    f1 = Math.copySign(0.5, f) + f;
                }
                break;
            }
            case 8: {
                f1 = Math.rint(f);
                if(Math.abs(f - f1) == 0.5) {
                    f1 = f;
                }
                break;
            }
            default: {
                throw new AssertionError();
            }
        }
        if(f1 >= 9223372036854776000.0) {
            v = 0;
        }
        if(((-9223372036854776000.0 - f1 < 1.0 ? 1 : 0) & v) == 0) {
            throw new ArithmeticException("rounded value is out of range for input " + f + " and rounding mode " + roundingMode0);
        }
        return (long)f1;
    }

    public static boolean zzc(double f) {
        return zzgah.zzb(f) && (f == 0.0 || 52 - Long.numberOfTrailingZeros(zzgah.zza(f)) <= Math.getExponent(f));
    }

    public static boolean zzd(double f) {
        if(f > 0.0 && zzgah.zzb(f)) {
            long v = zzgah.zza(f);
            return (v & v - 1L) == 0L;
        }
        return false;
    }
}

