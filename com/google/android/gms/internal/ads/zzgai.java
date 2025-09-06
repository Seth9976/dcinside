package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

final class zzgai {
    static final int[] zza;

    static {
        int[] arr_v = new int[RoundingMode.values().length];
        zzgai.zza = arr_v;
        try {
            arr_v[RoundingMode.UNNECESSARY.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgai.zza[RoundingMode.DOWN.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgai.zza[RoundingMode.FLOOR.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgai.zza[RoundingMode.UP.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgai.zza[RoundingMode.CEILING.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgai.zza[RoundingMode.HALF_DOWN.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgai.zza[RoundingMode.HALF_UP.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            zzgai.zza[RoundingMode.HALF_EVEN.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

