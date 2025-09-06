package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
public final class zzcy {
    public static final int zza;
    private static final byte[] zzb;
    private static final String[] zzc;
    private static final Pattern zzd;

    static {
        zzcy.zzb = new byte[]{0, 0, 0, 1};
        zzcy.zzc = new String[]{"", "A", "B", "C"};
        zzcy.zzd = Pattern.compile("^\\D?(\\d+)$");
    }

    @Nullable
    public static Pair zza(zzab zzab0) {
        int v12;
        int v11;
        int v10;
        String s8;
        int v9;
        int v8;
        int v7;
        int v6;
        int v5;
        int v4;
        Integer integer1;
        Integer integer0;
        String s = zzab0.zzk;
        if(s == null) {
            return null;
        }
        else {
            String[] arr_s = s.split("\\.");
            int v = 3;
            int v1 = 2;
            int v2 = 1;
            if("video/dolby-vision".equals(zzab0.zzo)) {
                String s1 = zzab0.zzk;
                if(arr_s.length < 3) {
                    zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + s1);
                    return null;
                }
                Matcher matcher0 = zzcy.zzd.matcher(arr_s[1]);
                if(!matcher0.matches()) {
                    zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + s1);
                    return null;
                }
                String s2 = matcher0.group(1);
                if(s2 == null) {
                label_56:
                    integer0 = null;
                label_57:
                    if(integer0 == null) {
                        zzdo.zzf("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: " + s2);
                        return null;
                    }
                }
                else {
                    int v3 = s2.hashCode();
                    if(v3 == 0x61F) {
                        integer0 = s2.equals("10") ? 0x400 : null;
                        goto label_57;
                    }
                    else {
                        switch(v3) {
                            case 0x600: {
                                if(s2.equals("00")) {
                                    integer0 = 1;
                                }
                                else {
                                    goto label_56;
                                }
                                break;
                            }
                            case 0x601: {
                                if(s2.equals("01")) {
                                    integer0 = 2;
                                }
                                else {
                                    goto label_56;
                                }
                                break;
                            }
                            case 0x602: {
                                if(s2.equals("02")) {
                                    integer0 = 4;
                                }
                                else {
                                    goto label_56;
                                }
                                break;
                            }
                            case 0x603: {
                                if(s2.equals("03")) {
                                    integer0 = 8;
                                }
                                else {
                                    goto label_56;
                                }
                                break;
                            }
                            case 0x604: {
                                if(s2.equals("04")) {
                                    integer0 = 16;
                                }
                                else {
                                    goto label_56;
                                }
                                break;
                            }
                            case 0x605: {
                                if(s2.equals("05")) {
                                    integer0 = 0x20;
                                }
                                else {
                                    goto label_56;
                                }
                                break;
                            }
                            case 0x606: {
                                if(s2.equals("06")) {
                                    integer0 = 0x40;
                                }
                                else {
                                    goto label_56;
                                }
                                break;
                            }
                            case 0x607: {
                                if(s2.equals("07")) {
                                    integer0 = 0x80;
                                }
                                else {
                                    goto label_56;
                                }
                                break;
                            }
                            case 0x608: {
                                if(s2.equals("08")) {
                                    integer0 = 0x100;
                                }
                                else {
                                    goto label_56;
                                }
                                break;
                            }
                            case 0x609: {
                                if(s2.equals("09")) {
                                    integer0 = 0x200;
                                }
                                else {
                                    goto label_56;
                                }
                                break;
                            }
                            default: {
                                goto label_56;
                            }
                        }
                    }
                }
                String s3 = arr_s[2];
                if(s3 == null) {
                    integer1 = null;
                }
                else {
                    switch(s3) {
                        case "01": {
                            integer1 = 1;
                            break;
                        }
                        case "02": {
                            return new Pair(integer0, 2);
                        }
                        case "03": {
                            return new Pair(integer0, 4);
                        }
                        case "04": {
                            return new Pair(integer0, 8);
                        }
                        case "05": {
                            return new Pair(integer0, 16);
                        }
                        case "06": {
                            return new Pair(integer0, 0x20);
                        }
                        case "07": {
                            return new Pair(integer0, 0x40);
                        }
                        case "08": {
                            return new Pair(integer0, 0x80);
                        }
                        case "09": {
                            return new Pair(integer0, 0x100);
                        }
                        case "10": {
                            return new Pair(integer0, 0x200);
                        }
                        case "11": {
                            return new Pair(integer0, 0x400);
                        }
                        case "12": {
                            return new Pair(integer0, 0x800);
                        }
                        case "13": {
                            return new Pair(integer0, 0x1000);
                        }
                        default: {
                            integer1 = null;
                            break;
                        }
                    }
                }
                if(integer1 == null) {
                    zzdo.zzf("CodecSpecificDataUtil", "Unknown Dolby Vision level string: " + s3);
                    return null;
                }
                return new Pair(integer0, integer1);
            }
            switch(arr_s[0]) {
                case "av01": {
                    String s4 = zzab0.zzk;
                    zzk zzk0 = zzab0.zzC;
                    if(arr_s.length < 4) {
                        zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + s4);
                        return null;
                    }
                    try {
                        v4 = Integer.parseInt(arr_s[1]);
                        v5 = Integer.parseInt(arr_s[2].substring(0, 2));
                        v6 = Integer.parseInt(arr_s[3]);
                    }
                    catch(NumberFormatException unused_ex) {
                        zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + s4);
                        return null;
                    }
                    if(v4 != 0) {
                        zzdo.zzf("CodecSpecificDataUtil", "Unknown AV1 profile: " + v4);
                        return null;
                    }
                    switch(v6) {
                        case 8: {
                            v7 = 1;
                            break;
                        }
                        case 10: {
                            v7 = zzk0 == null || zzk0.zze == null && (zzk0.zzd != 6 && zzk0.zzd != 7) ? 2 : 0x1000;
                            break;
                        }
                        default: {
                            zzdo.zzf("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + v6);
                            return null;
                        }
                    }
                    switch(v5) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            v2 = 2;
                            break;
                        }
                        case 2: {
                            v2 = 4;
                            break;
                        }
                        case 3: {
                            v2 = 8;
                            break;
                        }
                        case 4: {
                            v2 = 16;
                            break;
                        }
                        case 5: {
                            v2 = 0x20;
                            break;
                        }
                        case 6: {
                            v2 = 0x40;
                            break;
                        }
                        case 7: {
                            v2 = 0x80;
                            break;
                        }
                        case 8: {
                            v2 = 0x100;
                            break;
                        }
                        case 9: {
                            v2 = 0x200;
                            break;
                        }
                        case 10: {
                            v2 = 0x400;
                            break;
                        }
                        case 11: {
                            v2 = 0x800;
                            break;
                        }
                        case 12: {
                            v2 = 0x1000;
                            break;
                        }
                        case 13: {
                            v2 = 0x2000;
                            break;
                        }
                        case 14: {
                            v2 = 0x4000;
                            break;
                        }
                        case 15: {
                            v2 = 0x8000;
                            break;
                        }
                        case 16: {
                            v2 = 0x10000;
                            break;
                        }
                        case 17: {
                            v2 = 0x20000;
                            break;
                        }
                        case 18: {
                            v2 = 0x40000;
                            break;
                        }
                        case 19: {
                            v2 = 0x80000;
                            break;
                        }
                        case 20: {
                            v2 = 0x100000;
                            break;
                        }
                        case 21: {
                            v2 = 0x200000;
                            break;
                        }
                        case 22: {
                            v2 = 0x400000;
                            break;
                        }
                        case 23: {
                            v2 = 0x800000;
                            break;
                        }
                        default: {
                            v2 = -1;
                        }
                    }
                    if(v2 == -1) {
                        zzdo.zzf("CodecSpecificDataUtil", "Unknown AV1 level: " + v5);
                        return null;
                    }
                    return new Pair(v7, v2);
                }
                case "avc1": 
                case "avc2": {
                    String s5 = zzab0.zzk;
                    if(arr_s.length < 2) {
                        zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + s5);
                        return null;
                    }
                    try {
                        if(arr_s[1].length() == 6) {
                            v8 = Integer.parseInt(arr_s[1].substring(0, 2), 16);
                            v9 = Integer.parseInt(arr_s[1].substring(4), 16);
                        }
                        else {
                            if(arr_s.length < 3) {
                                zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + s5);
                                return null;
                            }
                            v8 = Integer.parseInt(arr_s[1]);
                            v9 = Integer.parseInt(arr_s[2]);
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                        zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + s5);
                        return null;
                    }
                    switch(v8) {
                        case 66: {
                            v1 = 1;
                            break;
                        }
                        case 77: {
                            break;
                        }
                        case 88: {
                            v1 = 4;
                            break;
                        }
                        case 100: {
                            v1 = 8;
                            break;
                        }
                        case 110: {
                            v1 = 16;
                            break;
                        }
                        case 0x7A: {
                            v1 = 0x20;
                            break;
                        }
                        case 0xF4: {
                            v1 = 0x40;
                            break;
                        }
                        default: {
                            v1 = -1;
                        }
                    }
                    if(v1 == -1) {
                        zzdo.zzf("CodecSpecificDataUtil", "Unknown AVC profile: " + v8);
                        return null;
                    }
                    switch(v9) {
                        case 10: {
                            break;
                        }
                        case 11: {
                            v2 = 4;
                            break;
                        }
                        case 12: {
                            v2 = 8;
                            break;
                        }
                        case 13: {
                            v2 = 16;
                            break;
                        }
                        case 20: {
                            v2 = 0x20;
                            break;
                        }
                        case 21: {
                            v2 = 0x40;
                            break;
                        }
                        case 22: {
                            v2 = 0x80;
                            break;
                        }
                        case 30: {
                            v2 = 0x100;
                            break;
                        }
                        case 0x1F: {
                            v2 = 0x200;
                            break;
                        }
                        case 0x20: {
                            v2 = 0x400;
                            break;
                        }
                        case 40: {
                            v2 = 0x800;
                            break;
                        }
                        case 41: {
                            v2 = 0x1000;
                            break;
                        }
                        case 42: {
                            v2 = 0x2000;
                            break;
                        }
                        case 50: {
                            v2 = 0x4000;
                            break;
                        }
                        case 51: {
                            v2 = 0x8000;
                            break;
                        }
                        case 52: {
                            v2 = 0x10000;
                            break;
                        }
                        default: {
                            v2 = -1;
                        }
                    }
                    if(v2 == -1) {
                        zzdo.zzf("CodecSpecificDataUtil", "Unknown AVC level: " + v9);
                        return null;
                    }
                    return new Pair(v1, v2);
                }
                case "hev1": {
                    return zzcy.zzb(zzab0.zzk, arr_s, zzab0.zzC);
                }
                case "hvc1": {
                    return zzcy.zzb(zzab0.zzk, arr_s, zzab0.zzC);
                }
                case "mp4a": {
                    s8 = zzab0.zzk;
                    if(arr_s.length != 3) {
                        zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + s8);
                        return null;
                    }
                    try {
                        if("audio/mp4a-latm".equals(zzbb.zzd(Integer.parseInt(arr_s[1], 16)))) {
                            switch(Integer.parseInt(arr_s[2])) {
                                case 1: {
                                    v = 1;
                                    break;
                                }
                                case 2: {
                                    v = 2;
                                    break;
                                }
                                case 3: {
                                    break;
                                }
                                case 4: {
                                    v = 4;
                                    break;
                                }
                                case 5: {
                                    v = 5;
                                    break;
                                }
                                case 6: {
                                    v = 6;
                                    break;
                                }
                                case 17: {
                                    v = 17;
                                    break;
                                }
                                case 20: {
                                    v = 20;
                                    break;
                                }
                                case 23: {
                                    v = 23;
                                    break;
                                }
                                case 29: {
                                    v = 29;
                                    break;
                                }
                                case 39: {
                                    v = 39;
                                    break;
                                }
                                case 42: {
                                    v = 42;
                                    break;
                                }
                                default: {
                                    v = -1;
                                }
                            }
                            return v == -1 ? null : new Pair(v, 0);
                        }
                        return null;
                    }
                    catch(NumberFormatException unused_ex) {
                        break;
                    }
                }
                case "s263": {
                    String s6 = zzab0.zzk;
                    Pair pair0 = new Pair(1, 1);
                    if(arr_s.length < 3) {
                        zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + s6);
                        return pair0;
                    }
                    try {
                        return new Pair(Integer.parseInt(arr_s[1]), Integer.parseInt(arr_s[2]));
                    }
                    catch(NumberFormatException unused_ex) {
                        zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + s6);
                        return pair0;
                    }
                }
                case "vp09": {
                    String s7 = zzab0.zzk;
                    if(arr_s.length < 3) {
                        zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + s7);
                        return null;
                    }
                    try {
                        v10 = Integer.parseInt(arr_s[1]);
                        v11 = Integer.parseInt(arr_s[2]);
                        switch(v10) {
                            case 0: {
                                v12 = 1;
                                goto label_257;
                            }
                            case 1: {
                                v12 = 2;
                                goto label_257;
                            }
                            case 2: {
                                v12 = 4;
                                goto label_257;
                            }
                            case 3: {
                                goto label_256;
                            }
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                        zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + s7);
                        return null;
                    }
                    v12 = -1;
                    goto label_257;
                label_256:
                    v12 = 8;
                label_257:
                    if(v12 == -1) {
                        zzdo.zzf("CodecSpecificDataUtil", "Unknown VP9 profile: " + v10);
                        return null;
                    }
                    if(v11 != 10) {
                        switch(v11) {
                            case 11: {
                                v2 = 2;
                                break;
                            }
                            case 20: {
                                v2 = 4;
                                break;
                            }
                            case 21: {
                                v2 = 8;
                                break;
                            }
                            case 30: {
                                v2 = 16;
                                break;
                            }
                            case 0x1F: {
                                v2 = 0x20;
                                break;
                            }
                            case 40: {
                                v2 = 0x40;
                                break;
                            }
                            case 41: {
                                v2 = 0x80;
                                break;
                            }
                            case 50: {
                                v2 = 0x100;
                                break;
                            }
                            case 51: {
                                v2 = 0x200;
                                break;
                            }
                            case 60: {
                                v2 = 0x800;
                                break;
                            }
                            case 61: {
                                v2 = 0x1000;
                                break;
                            }
                            case 62: {
                                v2 = 0x2000;
                                break;
                            }
                            default: {
                                v2 = -1;
                            }
                        }
                    }
                    if(v2 == -1) {
                        zzdo.zzf("CodecSpecificDataUtil", "Unknown VP9 level: " + v11);
                        return null;
                    }
                    return new Pair(v12, v2);
                }
                default: {
                    return null;
                }
            }
        }
        zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + s8);
        return null;
    }

    @Nullable
    public static Pair zzb(String s, String[] arr_s, @Nullable zzk zzk0) {
        Integer integer0;
        int v;
        if(arr_s.length < 4) {
            zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + s);
            return null;
        }
        Matcher matcher0 = zzcy.zzd.matcher(arr_s[1]);
        if(!matcher0.matches()) {
            zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + s);
            return null;
        }
        String s1 = matcher0.group(1);
        if("1".equals(s1)) {
            v = 1;
            goto label_19;
        }
        boolean z = false;
        if("2".equals(s1)) {
            z = true;
            if(zzk0 != null && zzk0.zzd == 6) {
                v = 0x1000;
                goto label_19;
            }
            v = 2;
        }
        else if("6".equals(s1)) {
            z = true;
            v = 6;
        }
        if(z) {
        label_19:
            String s2 = arr_s[3];
            if(s2 == null) {
                integer0 = null;
            }
            else {
                switch(s2) {
                    case "H120": {
                        return new Pair(v, 0x800);
                    }
                    case "H123": {
                        return new Pair(v, 0x2000);
                    }
                    case "H150": {
                        return new Pair(v, 0x8000);
                    }
                    case "H153": {
                        return new Pair(v, 0x20000);
                    }
                    case "H156": {
                        return new Pair(v, 0x80000);
                    }
                    case "H180": {
                        return new Pair(v, 0x200000);
                    }
                    case "H183": {
                        return new Pair(v, 0x800000);
                    }
                    case "H186": {
                        return new Pair(v, 0x2000000);
                    }
                    case "H30": {
                        return new Pair(v, 2);
                    }
                    case "H60": {
                        return new Pair(v, 8);
                    }
                    case "H63": {
                        return new Pair(v, 0x20);
                    }
                    case "H90": {
                        return new Pair(v, 0x80);
                    }
                    case "H93": {
                        return new Pair(v, 0x200);
                    }
                    case "L120": {
                        return new Pair(v, 0x400);
                    }
                    case "L123": {
                        return new Pair(v, 0x1000);
                    }
                    case "L150": {
                        return new Pair(v, 0x4000);
                    }
                    case "L153": {
                        return new Pair(v, 0x10000);
                    }
                    case "L156": {
                        return new Pair(v, 0x40000);
                    }
                    case "L180": {
                        return new Pair(v, 0x100000);
                    }
                    case "L183": {
                        return new Pair(v, 0x400000);
                    }
                    case "L186": {
                        return new Pair(v, 0x1000000);
                    }
                    case "L30": {
                        integer0 = 1;
                        break;
                    }
                    case "L60": {
                        return new Pair(v, 4);
                    }
                    case "L63": {
                        return new Pair(v, 16);
                    }
                    case "L90": {
                        return new Pair(v, 0x40);
                    }
                    case "L93": {
                        return new Pair(v, 0x100);
                    }
                    default: {
                        integer0 = null;
                        break;
                    }
                }
            }
            if(integer0 == null) {
                zzdo.zzf("CodecSpecificDataUtil", "Unknown HEVC level string: " + s2);
                return null;
            }
            return new Pair(v, integer0);
        }
        zzdo.zzf("CodecSpecificDataUtil", "Unknown HEVC profile string: " + s1);
        return null;
    }

    public static String zzc(int v, int v1, int v2) {
        return String.format("avc1.%02X%02X%02X", v, v1, v2);
    }

    public static String zzd(int v, boolean z, int v1, int v2, int[] arr_v, int v3) {
        StringBuilder stringBuilder0 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", zzcy.zzc[v], v1, v2, Character.valueOf(((char)(z ? 72 : 76))), v3));
        int v4;
        for(v4 = 6; v4 > 0 && arr_v[v4 - 1] == 0; --v4) {
        }
        for(int v5 = 0; v5 < v4; ++v5) {
            stringBuilder0.append(String.format(".%02X", ((int)arr_v[v5])));
        }
        return stringBuilder0.toString();
    }

    public static byte[] zze(byte[] arr_b, int v, int v1) {
        byte[] arr_b1 = new byte[v1 + 4];
        System.arraycopy(zzcy.zzb, 0, arr_b1, 0, 4);
        System.arraycopy(arr_b, v, arr_b1, 4, v1);
        return arr_b1;
    }
}

