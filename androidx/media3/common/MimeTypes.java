package androidx.media3.common;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.c;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w4.d;

public final class MimeTypes {
    static final class CustomMimeType {
        public final String a;
        public final String b;
        public final int c;

        public CustomMimeType(String s, String s1, int v) {
            this.a = s;
            this.b = s1;
            this.c = v;
        }
    }

    @VisibleForTesting
    static final class Mp4aObjectType {
        public final int a;
        public final int b;

        public Mp4aObjectType(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        public int a() {
            switch(this.b) {
                case 2: {
                    return 10;
                }
                case 5: {
                    return 11;
                }
                case 22: {
                    return 0x40000000;
                }
                case 23: {
                    return 15;
                }
                case 29: {
                    return 12;
                }
                case 42: {
                    return 16;
                }
                default: {
                    return 0;
                }
            }
        }
    }

    public static final String A = "video/mp42";
    public static final String A0 = "application/x-quicktime-tx3g";
    public static final String B = "video/mp43";
    public static final String B0 = "application/x-mp4-vtt";
    @UnstableApi
    public static final String C = "video/raw";
    public static final String C0 = "application/x-mp4-cea-608";
    @UnstableApi
    public static final String D = "video/x-unknown";
    @Deprecated
    public static final String D0 = "application/x-rawcc";
    public static final String E = "audio/mp4";
    public static final String E0 = "application/vobsub";
    public static final String F = "audio/mp4a-latm";
    public static final String F0 = "application/pgs";
    @UnstableApi
    public static final String G = "audio/x-matroska";
    @UnstableApi
    public static final String G0 = "application/x-scte35";
    public static final String H = "audio/webm";
    @UnstableApi
    public static final String H0 = "application/x-camera-motion";
    public static final String I = "audio/mpeg";
    @UnstableApi
    public static final String I0 = "application/x-emsg";
    public static final String J = "audio/mpeg-L1";
    public static final String J0 = "application/dvbsubs";
    public static final String K = "audio/mpeg-L2";
    @UnstableApi
    public static final String K0 = "application/x-exif";
    public static final String L = "audio/mha1";
    @UnstableApi
    public static final String L0 = "application/x-icy";
    public static final String M = "audio/mhm1";
    public static final String M0 = "application/vnd.dvb.ait";
    public static final String N = "audio/raw";
    public static final String N0 = "application/x-rtsp";
    public static final String O = "audio/g711-alaw";
    @UnstableApi
    public static final String O0 = "application/x-media3-cues";
    public static final String P = "audio/g711-mlaw";
    @UnstableApi
    public static final String P0 = "application/x-image-uri";
    public static final String Q = "audio/ac3";
    public static final String Q0 = "image/jpeg";
    public static final String R = "audio/eac3";
    @UnstableApi
    public static final String R0 = "image/jpeg_r";
    public static final String S = "audio/eac3-joc";
    @UnstableApi
    public static final String S0 = "image/png";
    public static final String T = "audio/ac4";
    @UnstableApi
    public static final String T0 = "image/heif";
    public static final String U = "audio/true-hd";
    @UnstableApi
    public static final String U0 = "image/heic";
    public static final String V = "audio/vnd.dts";
    @UnstableApi
    public static final String V0 = "image/avif";
    public static final String W = "audio/vnd.dts.hd";
    @UnstableApi
    public static final String W0 = "image/bmp";
    public static final String X = "audio/vnd.dts.hd;profile=lbr";
    @UnstableApi
    public static final String X0 = "image/webp";
    @UnstableApi
    public static final String Y = "audio/vnd.dts.uhd;profile=p2";
    @UnstableApi
    public static final String Y0 = "image/raw";
    public static final String Z = "audio/vorbis";
    @UnstableApi
    public static final String Z0 = "ec+3";
    @UnstableApi
    public static final String a = "video";
    public static final String a0 = "audio/opus";
    private static final ArrayList a1 = null;
    @UnstableApi
    public static final String b = "audio";
    public static final String b0 = "audio/amr";
    private static final Pattern b1 = null;
    @UnstableApi
    public static final String c = "text";
    public static final String c0 = "audio/3gpp";
    @UnstableApi
    public static final String d = "image";
    public static final String d0 = "audio/amr-wb";
    @UnstableApi
    public static final String e = "application";
    public static final String e0 = "audio/flac";
    public static final String f = "video/mp4";
    public static final String f0 = "audio/alac";
    @UnstableApi
    public static final String g = "video/x-matroska";
    public static final String g0 = "audio/gsm";
    public static final String h = "video/webm";
    public static final String h0 = "audio/ogg";
    public static final String i = "video/3gpp";
    public static final String i0 = "audio/wav";
    public static final String j = "video/avc";
    public static final String j0 = "audio/midi";
    public static final String k = "video/hevc";
    @UnstableApi
    public static final String k0 = "audio/x-exoplayer-midi";
    @UnstableApi
    public static final String l = "video/x-vnd.on2.vp8";
    @UnstableApi
    public static final String l0 = "audio/x-unknown";
    @UnstableApi
    public static final String m = "video/x-vnd.on2.vp9";
    public static final String m0 = "text/vtt";
    public static final String n = "video/av01";
    public static final String n0 = "text/x-ssa";
    public static final String o = "video/mp2t";
    @UnstableApi
    public static final String o0 = "text/x-unknown";
    public static final String p = "video/mp4v-es";
    public static final String p0 = "application/mp4";
    public static final String q = "video/mpeg";
    public static final String q0 = "application/webm";
    public static final String r = "video/mp2p";
    public static final String r0 = "application/x-matroska";
    public static final String s = "video/mpeg2";
    public static final String s0 = "application/dash+xml";
    public static final String t = "video/wvc1";
    public static final String t0 = "application/x-mpegURL";
    public static final String u = "video/divx";
    public static final String u0 = "application/vnd.ms-sstr+xml";
    @UnstableApi
    public static final String v = "video/x-flv";
    public static final String v0 = "application/id3";
    public static final String w = "video/dolby-vision";
    public static final String w0 = "application/cea-608";
    public static final String x = "video/ogg";
    public static final String x0 = "application/cea-708";
    public static final String y = "video/x-msvideo";
    public static final String y0 = "application/x-subrip";
    public static final String z = "video/mjpeg";
    public static final String z0 = "application/ttml+xml";

    static {
        MimeTypes.a1 = new ArrayList();
        MimeTypes.b1 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    }

    @UnstableApi
    public static boolean a(@Nullable String s, @Nullable String s1) {
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
                Mp4aObjectType mimeTypes$Mp4aObjectType0 = MimeTypes.j(s1);
                if(mimeTypes$Mp4aObjectType0 == null) {
                    return false;
                }
                switch(mimeTypes$Mp4aObjectType0.a()) {
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

    @UnstableApi
    public static boolean b(@Nullable String s, String s1) {
        return MimeTypes.d(s, s1) != null;
    }

    @Nullable
    @UnstableApi
    public static String c(@Nullable String s) {
        if(s == null) {
            return null;
        }
        String[] arr_s = Util.o2(s);
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = MimeTypes.g(arr_s[v]);
            if(s1 != null && MimeTypes.q(s1)) {
                return s1;
            }
        }
        return null;
    }

    @Nullable
    @UnstableApi
    public static String d(@Nullable String s, @Nullable String s1) {
        if(s != null && s1 != null) {
            String[] arr_s = Util.o2(s);
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v = 0; v < arr_s.length; ++v) {
                String s2 = arr_s[v];
                if(s1.equals(MimeTypes.g(s2))) {
                    if(stringBuilder0.length() > 0) {
                        stringBuilder0.append(",");
                    }
                    stringBuilder0.append(s2);
                }
            }
            return stringBuilder0.length() <= 0 ? null : stringBuilder0.toString();
        }
        return null;
    }

    @Nullable
    private static String e(String s) {
        int v = MimeTypes.a1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            CustomMimeType mimeTypes$CustomMimeType0 = (CustomMimeType)MimeTypes.a1.get(v1);
            if(s.startsWith(mimeTypes$CustomMimeType0.b)) {
                return mimeTypes$CustomMimeType0.a;
            }
        }
        return null;
    }

    @UnstableApi
    public static int f(String s, @Nullable String s1) {
        s.hashCode();
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
                Mp4aObjectType mimeTypes$Mp4aObjectType0 = MimeTypes.j(s1);
                return mimeTypes$Mp4aObjectType0 == null ? 0 : mimeTypes$Mp4aObjectType0.a();
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

    @Nullable
    @UnstableApi
    public static String g(@Nullable String s) {
        String s1 = null;
        if(s == null) {
            return null;
        }
        String s2 = c.g(s.trim());
        if(!s2.startsWith("avc1") && !s2.startsWith("avc3")) {
            if(!s2.startsWith("hev1") && !s2.startsWith("hvc1")) {
                if(!s2.startsWith("dvav") && !s2.startsWith("dva1") && !s2.startsWith("dvhe") && !s2.startsWith("dvh1")) {
                    if(s2.startsWith("av01")) {
                        return "video/av01";
                    }
                    if(!s2.startsWith("vp9") && !s2.startsWith("vp09")) {
                        if(!s2.startsWith("vp8") && !s2.startsWith("vp08")) {
                            if(s2.startsWith("mp4a")) {
                                if(s2.startsWith("mp4a.")) {
                                    Mp4aObjectType mimeTypes$Mp4aObjectType0 = MimeTypes.j(s2);
                                    if(mimeTypes$Mp4aObjectType0 != null) {
                                        s1 = MimeTypes.h(mimeTypes$Mp4aObjectType0.a);
                                    }
                                }
                                return s1 == null ? "audio/mp4a-latm" : s1;
                            }
                            if(s2.startsWith("mha1")) {
                                return "audio/mha1";
                            }
                            if(s2.startsWith("mhm1")) {
                                return "audio/mhm1";
                            }
                            if(!s2.startsWith("ac-3") && !s2.startsWith("dac3")) {
                                if(!s2.startsWith("ec-3") && !s2.startsWith("dec3")) {
                                    if(s2.startsWith("ec+3")) {
                                        return "audio/eac3-joc";
                                    }
                                    if(!s2.startsWith("ac-4") && !s2.startsWith("dac4")) {
                                        if(s2.startsWith("dtsc")) {
                                            return "audio/vnd.dts";
                                        }
                                        if(s2.startsWith("dtse")) {
                                            return "audio/vnd.dts.hd;profile=lbr";
                                        }
                                        if(!s2.startsWith("dtsh") && !s2.startsWith("dtsl")) {
                                            if(s2.startsWith("dtsx")) {
                                                return "audio/vnd.dts.uhd;profile=p2";
                                            }
                                            if(s2.startsWith("opus")) {
                                                return "audio/opus";
                                            }
                                            if(s2.startsWith("vorbis")) {
                                                return "audio/vorbis";
                                            }
                                            if(s2.startsWith("flac")) {
                                                return "audio/flac";
                                            }
                                            if(s2.startsWith("stpp")) {
                                                return "application/ttml+xml";
                                            }
                                            if(s2.startsWith("wvtt")) {
                                                return "text/vtt";
                                            }
                                            if(s2.contains("cea708")) {
                                                return "application/cea-708";
                                            }
                                            return s2.contains("eia608") || s2.contains("cea608") ? "application/cea-608" : MimeTypes.e(s2);
                                        }
                                        return "audio/vnd.dts.hd";
                                    }
                                    return "audio/ac4";
                                }
                                return "audio/eac3";
                            }
                            return "audio/ac3";
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    @Nullable
    @UnstableApi
    public static String h(int v) {
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

    @Nullable
    @UnstableApi
    public static Byte i(String s) {
        s.hashCode();
        switch(s) {
            case "audio/mp4a-latm": {
                return (byte)0x40;
            }
            case "audio/vorbis": {
                return (byte)-35;
            }
            case "video/mp4v-es": {
                return (byte)0x20;
            }
            default: {
                return null;
            }
        }
    }

    @Nullable
    @VisibleForTesting
    static Mp4aObjectType j(String s) {
        int v;
        Matcher matcher0 = MimeTypes.b1.matcher(s);
        if(!matcher0.matches()) {
            return null;
        }
        String s1 = (String)Assertions.g(matcher0.group(1));
        String s2 = matcher0.group(2);
        try {
            v = Integer.parseInt(s1, 16);
            if(s2 != null) {
                return new Mp4aObjectType(v, Integer.parseInt(s2));
            }
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
        return new Mp4aObjectType(v, 0);
    }

    @Nullable
    @UnstableApi
    public static String k(@Nullable String s) {
        if(s == null) {
            return null;
        }
        String[] arr_s = Util.o2(s);
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = MimeTypes.g(arr_s[v]);
            if(s1 != null && MimeTypes.t(s1)) {
                return s1;
            }
        }
        return null;
    }

    @Nullable
    @UnstableApi
    private static String l(@Nullable String s) {
        if(s == null) {
            return null;
        }
        int v = s.indexOf(0x2F);
        return v == -1 ? null : s.substring(0, v);
    }

    @UnstableApi
    public static int m(@Nullable String s) {
        if(TextUtils.isEmpty(s)) {
            return -1;
        }
        if(MimeTypes.q(s)) {
            return 1;
        }
        if(MimeTypes.u(s)) {
            return 2;
        }
        if(MimeTypes.t(s)) {
            return 3;
        }
        if(MimeTypes.r(s)) {
            return 4;
        }
        if(!"application/id3".equals(s) && !"application/x-emsg".equals(s) && !"application/x-scte35".equals(s)) {
            return "application/x-camera-motion".equals(s) ? 6 : MimeTypes.n(s);
        }
        return 5;
    }

    private static int n(String s) {
        int v = MimeTypes.a1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            CustomMimeType mimeTypes$CustomMimeType0 = (CustomMimeType)MimeTypes.a1.get(v1);
            if(s.equals(mimeTypes$CustomMimeType0.a)) {
                return mimeTypes$CustomMimeType0.c;
            }
        }
        return -1;
    }

    @UnstableApi
    public static int o(String s) {
        return MimeTypes.m(MimeTypes.g(s));
    }

    @Nullable
    @UnstableApi
    public static String p(@Nullable String s) {
        if(s == null) {
            return null;
        }
        String[] arr_s = Util.o2(s);
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = MimeTypes.g(arr_s[v]);
            if(s1 != null && MimeTypes.u(s1)) {
                return s1;
            }
        }
        return null;
    }

    @UnstableApi
    public static boolean q(@Nullable String s) {
        return "audio".equals(MimeTypes.l(s));
    }

    // 去混淆评级： 低(20)
    @UnstableApi
    public static boolean r(@Nullable String s) {
        return "image".equals(MimeTypes.l(s)) || "application/x-image-uri".equals(s);
    }

    // 去混淆评级： 中等(70)
    @UnstableApi
    public static boolean s(@Nullable String s) {
        return s == null ? false : s.startsWith("video/webm") || s.startsWith("audio/webm") || s.startsWith("application/webm") || s.startsWith("video/x-matroska") || s.startsWith("audio/x-matroska") || s.startsWith("application/x-matroska");
    }

    // 去混淆评级： 中等(130)
    @UnstableApi
    @d
    public static boolean t(@Nullable String s) {
        return "text".equals(MimeTypes.l(s)) || "application/x-media3-cues".equals(s) || "application/cea-608".equals(s) || "application/cea-708".equals(s) || "application/x-mp4-cea-608".equals(s) || "application/x-subrip".equals(s) || "application/ttml+xml".equals(s) || "application/x-quicktime-tx3g".equals(s) || "application/x-mp4-vtt".equals(s) || "application/x-rawcc".equals(s) || "application/vobsub".equals(s) || "application/pgs".equals(s) || "application/dvbsubs".equals(s);
    }

    @UnstableApi
    public static boolean u(@Nullable String s) {
        return "video".equals(MimeTypes.l(s));
    }

    @UnstableApi
    public static String v(String s) {
        if(s == null) {
            return null;
        }
        String s1 = c.g(s);
        s1.hashCode();
        switch(s1) {
            case "application/x-mpegurl": {
                return "application/x-mpegURL";
            }
            case "audio/mp3": {
                return "audio/mpeg";
            }
            case "audio/mpeg-l1": {
                return "audio/mpeg-L1";
            }
            case "audio/mpeg-l2": {
                return "audio/mpeg-L2";
            }
            case "audio/x-flac": {
                return "audio/flac";
            }
            case "audio/x-wav": {
                return "audio/wav";
            }
            default: {
                return s1;
            }
        }
    }

    @UnstableApi
    public static void w(String s, String s1, int v) {
        CustomMimeType mimeTypes$CustomMimeType0 = new CustomMimeType(s, s1, v);
        int v1 = MimeTypes.a1.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ArrayList arrayList0 = MimeTypes.a1;
            if(s.equals(((CustomMimeType)arrayList0.get(v2)).a)) {
                arrayList0.remove(v2);
                break;
            }
        }
        MimeTypes.a1.add(mimeTypes$CustomMimeType0);
    }
}

