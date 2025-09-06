package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzbb {
    public static final int zza;
    private static final ArrayList zzb;
    private static final Pattern zzc;

    static {
        zzbb.zzb = new ArrayList();
        zzbb.zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    }

    public static int zza(String s, @Nullable String s1) {
        switch(s) {
            case "audio/ac3": {
                return 5;
            }
            case "audio/ac4": {
                return 17;
            }
            case "audio/eac3": {
                return 6;
            }
            case "audio/eac3-joc": {
                return 18;
            }
            case "audio/mp4a-latm": {
                if(s1 == null) {
                    return 0;
                }
                zzba zzba0 = zzbb.zzc(s1);
                return zzba0 == null ? 0 : zzba0.zza();
            }
            case "audio/mpeg": {
                return 9;
            }
            case "audio/opus": {
                return 20;
            }
            case "audio/true-hd": {
                return 14;
            }
            case "audio/vnd.dts": {
                return 7;
            }
            case "audio/vnd.dts.hd": {
                return 8;
            }
            case "audio/vnd.dts.hd;profile=lbr": {
                return 8;
            }
            case "audio/vnd.dts.uhd;profile=p2": {
                return 30;
            }
            default: {
                return 0;
            }
        }
    }

    public static int zzb(@Nullable String s) {
        if(TextUtils.isEmpty(s)) {
            return -1;
        }
        if(zzbb.zzg(s)) {
            return 1;
        }
        if(!zzbb.zzi(s)) {
            if(!"text".equals(zzbb.zzj(s)) && !"application/x-media3-cues".equals(s) && !"application/cea-608".equals(s) && !"application/cea-708".equals(s) && !"application/x-mp4-cea-608".equals(s) && !"application/x-subrip".equals(s) && !"application/ttml+xml".equals(s) && !"application/x-quicktime-tx3g".equals(s) && !"application/x-mp4-vtt".equals(s) && !"application/x-rawcc".equals(s) && !"application/vobsub".equals(s) && !"application/pgs".equals(s) && !"application/dvbsubs".equals(s)) {
                if(zzbb.zzh(s)) {
                    return 4;
                }
                if(!"application/id3".equals(s) && !"application/x-emsg".equals(s) && !"application/x-scte35".equals(s) && !"application/x-icy".equals(s) && !"application/vnd.dvb.ait".equals(s)) {
                    if(!"application/x-camera-motion".equals(s)) {
                        int v = zzbb.zzb.size();
                        for(int v1 = 0; v1 < v; ++v1) {
                            zzaz zzaz0 = (zzaz)zzbb.zzb.get(v1);
                            if(s.equals(null)) {
                                return 0;
                            }
                        }
                        return -1;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 2;
    }

    @Nullable
    @VisibleForTesting
    static zzba zzc(String s) {
        int v1;
        int v;
        Matcher matcher0 = zzbb.zzc.matcher(s);
        if(matcher0.matches()) {
            String s1 = matcher0.group(1);
            s1.getClass();
            String s2 = matcher0.group(2);
            try {
                v = Integer.parseInt(s1, 16);
                if(s2 != null) {
                    v1 = Integer.parseInt(s2);
                    return new zzba(v, v1);
                }
                return new zzba(v, 0);
            }
            catch(NumberFormatException unused_ex) {
                return null;
            }
            return new zzba(v, v1);
        }
        return null;
    }

    @Nullable
    public static String zzd(int v) {
        switch(v) {
            case 0x20: {
                return "video/mp4v-es";
            }
            case 33: {
                return "video/avc";
            }
            case 35: {
                return "video/hevc";
            }
            case 0x60: 
            case 97: 
            case 98: 
            case 99: 
            case 100: 
            case 101: {
                return "video/mpeg2";
            }
            case 0x40: 
            case 102: 
            case 103: 
            case 104: {
                return "audio/mp4a-latm";
            }
            case 106: {
                return "video/mpeg";
            }
            case 105: 
            case 107: {
                return "audio/mpeg";
            }
            case 108: {
                return "image/jpeg";
            }
            case 0xA3: {
                return "video/wvc1";
            }
            case 0xA5: {
                return "audio/ac3";
            }
            case 0xA6: {
                return "audio/eac3";
            }
            case 170: 
            case 0xAB: {
                return "audio/vnd.dts.hd";
            }
            case 0xA9: 
            case 0xAC: {
                return "audio/vnd.dts";
            }
            case 0xAD: {
                return "audio/opus";
            }
            case 0xAE: {
                return "audio/ac4";
            }
            case 0xB1: {
                return "video/x-vnd.on2.vp9";
            }
            case 0xDD: {
                return "audio/vorbis";
            }
            default: {
                return null;
            }
        }
    }

    public static String zze(String s) [...] // 潜在的解密器

    public static boolean zzf(@Nullable String s, @Nullable String s1) {
        if(s == null) {
            return false;
        }
        switch(s) {
            case "audio/ac3": {
                return true;
            }
            case "audio/eac3": {
                return true;
            }
            case "audio/eac3-joc": {
                return true;
            }
            case "audio/flac": {
                return true;
            }
            case "audio/g711-alaw": {
                return true;
            }
            case "audio/g711-mlaw": {
                return true;
            }
            case "audio/mp4a-latm": {
                if(s1 == null) {
                    return false;
                }
                zzba zzba0 = zzbb.zzc(s1);
                if(zzba0 == null) {
                    return false;
                }
                switch(zzba0.zza()) {
                    case 0: 
                    case 16: {
                        return false;
                    }
                    default: {
                        return true;
                    }
                }
            }
            case "audio/mpeg": {
                return true;
            }
            case "audio/mpeg-L1": {
                return true;
            }
            case "audio/mpeg-L2": {
                return true;
            }
            case "audio/raw": {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean zzg(@Nullable String s) {
        return "audio".equals(zzbb.zzj(s));
    }

    // 去混淆评级： 低(20)
    public static boolean zzh(@Nullable String s) {
        return "image".equals(zzbb.zzj(s)) || "application/x-image-uri".equals(s);
    }

    public static boolean zzi(@Nullable String s) {
        return "video".equals(zzbb.zzj(s));
    }

    @Nullable
    private static String zzj(@Nullable String s) {
        if(s != null) {
            int v = s.indexOf(0x2F);
            return v == -1 ? null : s.substring(0, v);
        }
        return null;
    }
}

