package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

final class zzgaf {
    static final int[] zza;

    static {
        int[] arr_v = new int[RoundingMode.values().length];
        zzgaf.zza = arr_v;
        try {
            arr_v[RoundingMode.UNNECESSARY.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgaf.zza[RoundingMode.FLOOR.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgaf.zza[RoundingMode.CEILING.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgaf.zza[RoundingMode.DOWN.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgaf.zza[RoundingMode.UP.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgaf.zza[RoundingMode.HALF_EVEN.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgaf.zza[RoundingMode.HALF_UP.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgaf.zza[RoundingMode.HALF_DOWN.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

