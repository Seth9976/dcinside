package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

public final class zzgaj {
    public static int zza(int v, int v1) {
        long v2 = ((long)v) + ((long)v1);
        if(v2 != ((long)(((int)v2)))) {
            throw new ArithmeticException("overflow: checkedAdd(" + v + ", " + v1 + ")");
        }
        return (int)v2;
    }

    public static int zzb(int v, int v1, RoundingMode roundingMode0) {
        int v6;
        roundingMode0.getClass();
        if(v1 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int v2 = v / v1;
        int v3 = v - v1 * v2;
        if(v3 != 0) {
            int v4 = 1;
            int v5 = (v ^ v1) >> 0x1F | 1;
            switch(zzgai.zza[roundingMode0.ordinal()]) {
                case 1: {
                    zzgam.zzb(false);
                    return v2;
                }
                case 2: {
                    break;
                }
                case 3: {
                    return v5 >= 0 ? v2 : v2 + v5;
                }
                case 4: {
                    return v2 + v5;
                }
                case 5: {
                    return v5 <= 0 ? v2 : v2 + v5;
                }
                case 6: 
                case 7: 
                case 8: {
                    v6 = Math.abs(v3) * 2 - Math.abs(v1);
                    if(v6 == 0) {
                        if(roundingMode0 != RoundingMode.HALF_UP) {
                            if(roundingMode0 != RoundingMode.HALF_EVEN) {
                                v4 = 0;
                            }
                            return (v2 & 1 & v4) == 0 ? v2 : v2 + v5;
                        }
                        return v2 + v5;
                    }
                    return v6 <= 0 ? v2 : v2 + v5;
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
        return v2;
    }

    public static int zzc(int v, RoundingMode roundingMode0) {
        if(v <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch(zzgai.zza[roundingMode0.ordinal()]) {
            case 1: {
                zzgam.zzb((v - 1 & v) == 0);
                break;
            }
            case 2: 
            case 3: {
                break;
            }
            case 4: 
            case 5: {
                return 0x20 - Integer.numberOfLeadingZeros(v - 1);
            }
            case 6: 
            case 7: 
            case 8: {
                int v1 = Integer.numberOfLeadingZeros(v);
                return 0x1F - v1 + ((0xB504F333 >>> v1) - v >>> 0x1F);
            }
            default: {
                throw new AssertionError();
            }
        }
        return 0x1F - Integer.numberOfLeadingZeros(v);
    }
}

