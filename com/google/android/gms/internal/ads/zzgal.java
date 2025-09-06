package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

public final class zzgal {
    public static long zza(long v, long v1) {
        int v2 = 0;
        long v3 = v + v1;
        if((v ^ v3) >= 0L) {
            v2 = 1;
        }
        if((((v ^ v1) >= 0L ? 0 : 1) | v2) == 0) {
            throw new ArithmeticException("overflow: checkedAdd(" + v + ", " + v1 + ")");
        }
        return v3;
    }

    public static long zzb(long v, long v1, RoundingMode roundingMode0) {
        roundingMode0.getClass();
        long v2 = v / v1;
        long v3 = v - v1 * v2;
        if(v3 != 0L) {
            int v4 = ((int)((v ^ v1) >> 0x3F)) | 1;
            switch(zzgak.zza[roundingMode0.ordinal()]) {
                case 1: {
                    zzgam.zzb(false);
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    return v4 >= 0 ? v2 : v2 + ((long)v4);
                }
                case 4: {
                    return v2 + ((long)v4);
                }
                case 5: {
                    return v4 <= 0 ? v2 : v2 + ((long)v4);
                }
                case 6: 
                case 7: 
                case 8: {
                    long v5 = Math.abs(v3);
                    int v6 = Long.compare(v5 - (Math.abs(v1) - v5), 0L);
                    if(v6 == 0) {
                        return roundingMode0 != RoundingMode.HALF_UP && (roundingMode0 != RoundingMode.HALF_EVEN || (1L & v2) == 0L) ? v2 : v2 + ((long)v4);
                    }
                    return v6 <= 0 ? v2 : v2 + ((long)v4);
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
        return v2;
    }

    public static long zzc(long v, long v1) {
        zzgam.zza("a", v);
        zzgam.zza("b", v1);
        if(v == 0L) {
            return v1;
        }
        if(v1 == 0L) {
            return v;
        }
        int v2 = Long.numberOfTrailingZeros(v);
        long v3 = v >> v2;
        int v4 = Long.numberOfTrailingZeros(v1);
        for(long v5 = v1 >> v4; v3 != v5; v5 += v7) {
            long v6 = v3 - v5;
            long v7 = v6 >> 0x3F & v6;
            long v8 = v6 - v7 - v7;
            v3 = v8 >> Long.numberOfTrailingZeros(v8);
        }
        return v3 << Math.min(v2, v4);
    }

    public static long zzd(long v, long v1) {
        int v2 = 0;
        int v3 = Long.numberOfLeadingZeros(v) + Long.numberOfLeadingZeros(~v) + Long.numberOfLeadingZeros(v1) + Long.numberOfLeadingZeros(~v1);
        if(v3 > 65) {
            return v * v1;
        }
        int v4 = Long.compare(v, 0L);
        if(v1 == 0x8000000000000000L) {
            v2 = 1;
        }
        long v5 = ((v ^ v1) >>> 0x3F) + 0x7FFFFFFFFFFFFFFFL;
        if(((v3 >= 0x40 ? 0 : 1) | v2 & (v4 >= 0 ? 0 : 1)) != 0) {
            return v5;
        }
        long v6 = v * v1;
        return v4 == 0 || v6 / v == v1 ? v6 : v5;
    }
}

