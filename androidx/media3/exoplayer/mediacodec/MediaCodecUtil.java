package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.c;
import com.google.common.collect.O2;
import h4.d;
import h4.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@UnstableApi
public final class MediaCodecUtil {
    static final class CodecKey {
        public final String a;
        public final boolean b;
        public final boolean c;

        public CodecKey(String s, boolean z, boolean z1) {
            this.a = s;
            this.b = z;
            this.c = z1;
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 != null && object0.getClass() == CodecKey.class && (TextUtils.equals(this.a, ((CodecKey)object0).a) && this.b == ((CodecKey)object0).b && this.c == ((CodecKey)object0).c);
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            int v1 = 0x4D5;
            int v2 = this.b ? 0x4CF : 0x4D5;
            if(this.c) {
                v1 = 0x4CF;
            }
            return ((v + 0x1F) * 0x1F + v2) * 0x1F + v1;
        }
    }

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable throwable0) {
            super("Failed to query underlying media codecs", throwable0);
        }

        DecoderQueryException(Throwable throwable0, androidx.media3.exoplayer.mediacodec.MediaCodecUtil.1 mediaCodecUtil$10) {
            this(throwable0);
        }
    }

    interface MediaCodecListCompat {
        boolean a(String arg1, String arg2, MediaCodecInfo.CodecCapabilities arg3);

        MediaCodecInfo b(int arg1);

        boolean c(String arg1, String arg2, MediaCodecInfo.CodecCapabilities arg3);

        int d();

        boolean e();
    }

    static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        private MediaCodecListCompatV16() {
        }

        MediaCodecListCompatV16(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.1 mediaCodecUtil$10) {
        }

        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecUtil$MediaCodecListCompat
        public boolean a(String s, String s1, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
            return false;
        }

        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecUtil$MediaCodecListCompat
        public MediaCodecInfo b(int v) {
            return MediaCodecList.getCodecInfoAt(v);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecUtil$MediaCodecListCompat
        public boolean c(String s, String s1, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
            return "secure-playback".equals(s) && "video/avc".equals(s1);
        }

        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecUtil$MediaCodecListCompat
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecUtil$MediaCodecListCompat
        public boolean e() {
            return false;
        }
    }

    @RequiresApi(21)
    static final class MediaCodecListCompatV21 implements MediaCodecListCompat {
        private final int a;
        @Nullable
        private MediaCodecInfo[] b;

        public MediaCodecListCompatV21(boolean z, boolean z1) {
            this.a = z || z1 ? 1 : 0;
        }

        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecUtil$MediaCodecListCompat
        public boolean a(String s, String s1, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
            return mediaCodecInfo$CodecCapabilities0.isFeatureRequired(s);
        }

        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecUtil$MediaCodecListCompat
        public MediaCodecInfo b(int v) {
            this.f();
            return this.b[v];
        }

        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecUtil$MediaCodecListCompat
        public boolean c(String s, String s1, MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
            return mediaCodecInfo$CodecCapabilities0.isFeatureSupported(s);
        }

        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecUtil$MediaCodecListCompat
        public int d() {
            this.f();
            return this.b.length;
        }

        @Override  // androidx.media3.exoplayer.mediacodec.MediaCodecUtil$MediaCodecListCompat
        public boolean e() {
            return true;
        }

        @d({"mediaCodecInfos"})
        private void f() {
            if(this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }
    }

    interface ScoreProvider {
        int a(Object arg1);
    }

    private static final String a = "MediaCodecUtil";
    private static final Pattern b = null;
    @GuardedBy("MediaCodecUtil.class")
    private static final HashMap c = null;
    private static final String d = "avc1";
    private static final String e = "avc2";
    private static final String f = "vp09";
    private static final String g = "hev1";
    private static final String h = "hvc1";
    private static final String i = "av01";
    private static final String j = "mp4a";
    private static int k;

    static {
        MediaCodecUtil.b = Pattern.compile("^\\D?(\\d+)$");
        MediaCodecUtil.c = new HashMap();
        MediaCodecUtil.k = -1;
    }

    @Nullable
    private static Pair A(String s, String[] arr_s, @Nullable ColorInfo colorInfo0) {
        if(arr_s.length < 4) {
            Log.n("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + s);
            return null;
        }
        int v = 1;
        Matcher matcher0 = MediaCodecUtil.b.matcher(arr_s[1]);
        if(!matcher0.matches()) {
            Log.n("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + s);
            return null;
        }
        String s1 = matcher0.group(1);
        if(!"1".equals(s1)) {
            if("2".equals(s1)) {
                v = colorInfo0 == null || colorInfo0.c != 6 ? 2 : 0x1000;
                goto label_15;
            }
            Log.n("MediaCodecUtil", "Unknown HEVC profile string: " + s1);
            return null;
        }
    label_15:
        String s2 = arr_s[3];
        Integer integer0 = MediaCodecUtil.C(s2);
        if(integer0 == null) {
            Log.n("MediaCodecUtil", "Unknown HEVC level string: " + s2);
            return null;
        }
        return new Pair(v, integer0);
    }

    @Nullable
    private static Pair B(String s, String[] arr_s) {
        int v2;
        int v1;
        int v;
        if(arr_s.length < 3) {
            Log.n("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + s);
            return null;
        }
        try {
            v = Integer.parseInt(arr_s[1]);
            v1 = Integer.parseInt(arr_s[2]);
            v2 = MediaCodecUtil.U(v);
        }
        catch(NumberFormatException unused_ex) {
            Log.n("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + s);
            return null;
        }
        if(v2 == -1) {
            Log.n("MediaCodecUtil", "Unknown VP9 profile: " + v);
            return null;
        }
        int v3 = MediaCodecUtil.T(v1);
        if(v3 == -1) {
            Log.n("MediaCodecUtil", "Unknown VP9 level: " + v1);
            return null;
        }
        return new Pair(v2, v3);
    }

    @Nullable
    private static Integer C(@Nullable String s) {
        if(s == null) {
            return null;
        }
        switch(s) {
            case "H120": {
                return 0x800;
            }
            case "H123": {
                return 0x2000;
            }
            case "H150": {
                return 0x8000;
            }
            case "H153": {
                return 0x20000;
            }
            case "H156": {
                return 0x80000;
            }
            case "H180": {
                return 0x200000;
            }
            case "H183": {
                return 0x800000;
            }
            case "H186": {
                return 0x2000000;
            }
            case "H30": {
                return 2;
            }
            case "H60": {
                return 8;
            }
            case "H63": {
                return 0x20;
            }
            case "H90": {
                return 0x80;
            }
            case "H93": {
                return 0x200;
            }
            case "L120": {
                return 0x400;
            }
            case "L123": {
                return 0x1000;
            }
            case "L150": {
                return 0x4000;
            }
            case "L153": {
                return 0x10000;
            }
            case "L156": {
                return 0x40000;
            }
            case "L180": {
                return 0x100000;
            }
            case "L183": {
                return 0x400000;
            }
            case "L186": {
                return 0x1000000;
            }
            case "L30": {
                return 1;
            }
            case "L60": {
                return 4;
            }
            case "L63": {
                return 16;
            }
            case "L90": {
                return 0x40;
            }
            case "L93": {
                return 0x100;
            }
            default: {
                return null;
            }
        }
    }

    private static boolean D(MediaCodecInfo mediaCodecInfo0) {
        return Util.a >= 29 && MediaCodecUtil.E(mediaCodecInfo0);
    }

    @RequiresApi(29)
    private static boolean E(MediaCodecInfo mediaCodecInfo0) {
        return mediaCodecInfo0.isAlias();
    }

    // 去混淆评级： 低(31)
    private static boolean F(MediaCodecInfo mediaCodecInfo0, String s, boolean z, String s1) {
        if(!mediaCodecInfo0.isEncoder() && (z || !s.endsWith(".secure"))) {
            int v = Util.a;
            if(v < 21 && ("CIPAACDecoder".equals(s) || "CIPMP3Decoder".equals(s) || "CIPVorbisDecoder".equals(s) || "CIPAMRNBDecoder".equals(s) || "AACDecoder".equals(s) || "MP3Decoder".equals(s))) {
                return false;
            }
            if(v < 24 && ("OMX.SEC.aac.dec".equals(s) || "OMX.Exynos.AAC.Decoder".equals(s)) && "samsung".equals(Util.c) && (Util.b.startsWith("zeroflte") || Util.b.startsWith("zerolte") || Util.b.startsWith("zenlte") || "SC-05G".equals(Util.b) || "marinelteatt".equals(Util.b) || "404SC".equals(Util.b) || "SC-04G".equals(Util.b) || "SCV31".equals(Util.b))) {
                return false;
            }
            if(v == 19 && "OMX.SEC.vp8.dec".equals(s) && "samsung".equals(Util.c) && (Util.b.startsWith("d2") || Util.b.startsWith("serrano") || Util.b.startsWith("jflte") || Util.b.startsWith("santos") || Util.b.startsWith("t0"))) {
                return false;
            }
            return v != 19 || !Util.b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(s) ? v > 23 || !"audio/eac3-joc".equals(s1) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(s) : false;
        }
        return false;
    }

    private static boolean G(MediaCodecInfo mediaCodecInfo0, String s) {
        return Util.a < 29 ? !MediaCodecUtil.I(mediaCodecInfo0, s) : MediaCodecUtil.H(mediaCodecInfo0);
    }

    @RequiresApi(29)
    private static boolean H(MediaCodecInfo mediaCodecInfo0) {
        return mediaCodecInfo0.isHardwareAccelerated();
    }

    // 去混淆评级： 低(20)
    private static boolean I(MediaCodecInfo mediaCodecInfo0, String s) {
        if(Util.a >= 29) {
            return MediaCodecUtil.J(mediaCodecInfo0);
        }
        if(MimeTypes.q(s)) {
            return true;
        }
        String s1 = c.g(mediaCodecInfo0.getName());
        return s1.startsWith("arc.") ? false : s1.startsWith("omx.google.") || s1.startsWith("omx.ffmpeg.") || s1.startsWith("omx.sec.") && s1.contains(".sw.") || s1.equals("omx.qcom.video.decoder.hevcswvdec") || s1.startsWith("c2.android.") || s1.startsWith("c2.google.") || !s1.startsWith("omx.") && !s1.startsWith("c2.");
    }

    @RequiresApi(29)
    private static boolean J(MediaCodecInfo mediaCodecInfo0) {
        return mediaCodecInfo0.isSoftwareOnly();
    }

    private static boolean K(MediaCodecInfo mediaCodecInfo0) {
        if(Util.a >= 29) {
            return MediaCodecUtil.L(mediaCodecInfo0);
        }
        String s = c.g(mediaCodecInfo0.getName());
        return !s.startsWith("omx.google.") && !s.startsWith("c2.android.") && !s.startsWith("c2.google.");
    }

    @RequiresApi(29)
    private static boolean L(MediaCodecInfo mediaCodecInfo0) {
        return mediaCodecInfo0.isVendor();
    }

    // 检测为 Lambda 实现
    private static int M(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo0) [...]

    // 检测为 Lambda 实现
    private static int N(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo0) [...]

    // 检测为 Lambda 实现
    private static int O(Format format0, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo0) [...]

    // 检测为 Lambda 实现
    private static int P(ScoreProvider mediaCodecUtil$ScoreProvider0, Object object0, Object object1) [...]

    public static int Q() throws DecoderQueryException {
        if(MediaCodecUtil.k == -1) {
            int v = 0;
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo0 = MediaCodecUtil.t("video/avc", false, false);
            if(mediaCodecInfo0 != null) {
                MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = mediaCodecInfo0.i();
                int v1 = 0;
                while(v < arr_mediaCodecInfo$CodecProfileLevel.length) {
                    v1 = Math.max(MediaCodecUtil.h(arr_mediaCodecInfo$CodecProfileLevel[v].level), v1);
                    ++v;
                }
                v = Math.max(v1, (Util.a < 21 ? 0x2A300 : 0x54600));
            }
            MediaCodecUtil.k = v;
        }
        return MediaCodecUtil.k;
    }

    private static int R(int v) {
        if(v != 17 && v != 20 && (v != 23 && v != 29) && (v != 39 && v != 42)) {
            switch(v) {
                case 1: {
                    return 1;
                }
                case 2: {
                    return 2;
                }
                case 3: {
                    return 3;
                }
                case 4: {
                    return 4;
                }
                case 5: {
                    return 5;
                }
                case 6: {
                    return 6;
                }
                default: {
                    return -1;
                }
            }
        }
        return 17;
    }

    private static void S(List list0, ScoreProvider mediaCodecUtil$ScoreProvider0) {
        Collections.sort(list0, (Object object0, Object object1) -> mediaCodecUtil$ScoreProvider0.a(object1) - mediaCodecUtil$ScoreProvider0.a(object0));
    }

    private static int T(int v) {
        switch(v) {
            case 10: {
                return 1;
            }
            case 11: {
                return 2;
            }
            case 20: {
                return 4;
            }
            case 21: {
                return 8;
            }
            case 30: {
                return 16;
            }
            case 0x1F: {
                return 0x20;
            }
            case 40: {
                return 0x40;
            }
            case 41: {
                return 0x80;
            }
            case 50: {
                return 0x100;
            }
            case 51: {
                return 0x200;
            }
            case 60: {
                return 0x800;
            }
            case 61: {
                return 0x1000;
            }
            case 62: {
                return 0x2000;
            }
            default: {
                return -1;
            }
        }
    }

    private static int U(int v) {
        if(v != 0) {
            switch(v) {
                case 1: {
                    return 2;
                }
                case 2: {
                    return 4;
                }
                default: {
                    return v == 3 ? 8 : -1;
                }
            }
        }
        return 1;
    }

    public static void V(String s, boolean z, boolean z1) {
        try {
            MediaCodecUtil.u(s, z, z1);
        }
        catch(DecoderQueryException mediaCodecUtil$DecoderQueryException0) {
            Log.e("MediaCodecUtil", "Codec warming failed", mediaCodecUtil$DecoderQueryException0);
        }
    }

    private static void e(String s, List list0) {
        if("audio/raw".equals(s)) {
            if(Util.a < 26 && Util.b.equals("R9") && list0.size() == 1 && ((androidx.media3.exoplayer.mediacodec.MediaCodecInfo)list0.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list0.add(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.E("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            MediaCodecUtil.S(list0, (androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo0) -> {
                String s = mediaCodecInfo0.a;
                if(!s.startsWith("OMX.google") && !s.startsWith("c2.android")) {
                    return Util.a >= 26 || !s.equals("OMX.MTK.AUDIO.DECODER.RAW") ? 0 : -1;
                }
                return 1;
            });
        }
        int v = Util.a;
        if(v < 21 && list0.size() > 1) {
            String s1 = ((androidx.media3.exoplayer.mediacodec.MediaCodecInfo)list0.get(0)).a;
            if("OMX.SEC.mp3.dec".equals(s1) || "OMX.SEC.MP3.Decoder".equals(s1) || "OMX.brcm.audio.mp3.decoder".equals(s1)) {
                MediaCodecUtil.S(list0, (androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo0) -> mediaCodecInfo0.a.startsWith("OMX.google"));
            }
        }
        if(v < 0x20 && list0.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((androidx.media3.exoplayer.mediacodec.MediaCodecInfo)list0.get(0)).a)) {
            list0.add(((androidx.media3.exoplayer.mediacodec.MediaCodecInfo)list0.remove(0)));
        }
    }

    private static int f(int v) {
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                return 2;
            }
            case 2: {
                return 4;
            }
            case 3: {
                return 8;
            }
            case 4: {
                return 16;
            }
            case 5: {
                return 0x20;
            }
            case 6: {
                return 0x40;
            }
            case 7: {
                return 0x80;
            }
            case 8: {
                return 0x100;
            }
            case 9: {
                return 0x200;
            }
            case 10: {
                return 0x400;
            }
            case 11: {
                return 0x800;
            }
            case 12: {
                return 0x1000;
            }
            case 13: {
                return 0x2000;
            }
            case 14: {
                return 0x4000;
            }
            case 15: {
                return 0x8000;
            }
            case 16: {
                return 0x10000;
            }
            case 17: {
                return 0x20000;
            }
            case 18: {
                return 0x40000;
            }
            case 19: {
                return 0x80000;
            }
            case 20: {
                return 0x100000;
            }
            case 21: {
                return 0x200000;
            }
            case 22: {
                return 0x400000;
            }
            case 23: {
                return 0x800000;
            }
            default: {
                return -1;
            }
        }
    }

    private static int g(int v) {
        switch(v) {
            case 10: {
                return 1;
            }
            case 11: {
                return 4;
            }
            case 12: {
                return 8;
            }
            case 13: {
                return 16;
            }
            case 20: {
                return 0x20;
            }
            case 21: {
                return 0x40;
            }
            case 22: {
                return 0x80;
            }
            case 30: {
                return 0x100;
            }
            case 0x1F: {
                return 0x200;
            }
            case 0x20: {
                return 0x400;
            }
            case 40: {
                return 0x800;
            }
            case 41: {
                return 0x1000;
            }
            case 42: {
                return 0x2000;
            }
            case 50: {
                return 0x4000;
            }
            case 51: {
                return 0x8000;
            }
            case 52: {
                return 0x10000;
            }
            default: {
                return -1;
            }
        }
    }

    private static int h(int v) {
        if(v != 1 && v != 2) {
            switch(v) {
                case 8: 
                case 16: 
                case 0x20: {
                    return 0x18C00;
                }
                case 0x40: {
                    return 0x31800;
                }
                case 0x80: 
                case 0x100: {
                    return 0x65400;
                }
                case 0x200: {
                    return 0xE1000;
                }
                case 0x400: {
                    return 0x140000;
                }
                case 0x800: 
                case 0x1000: {
                    return 0x200000;
                }
                case 0x2000: {
                    return 0x220000;
                }
                case 0x4000: {
                    return 0x564000;
                }
                case 0x8000: 
                case 0x10000: {
                    return 0x900000;
                }
                case 0x20000: 
                case 0x40000: 
                case 0x80000: {
                    return 0x2200000;
                }
                default: {
                    return -1;
                }
            }
        }
        return 0x6300;
    }

    private static int i(int v) {
        switch(v) {
            case 66: {
                return 1;
            }
            case 77: {
                return 2;
            }
            case 88: {
                return 4;
            }
            case 100: {
                return 8;
            }
            case 110: {
                return 16;
            }
            case 0x7A: {
                return 0x20;
            }
            case 0xF4: {
                return 0x40;
            }
            default: {
                return -1;
            }
        }
    }

    @VisibleForTesting
    public static void j() {
        synchronized(MediaCodecUtil.class) {
            MediaCodecUtil.c.clear();
        }
    }

    @Nullable
    private static Integer k(@Nullable String s) {
        if(s == null) {
            return null;
        }
        switch(s) {
            case "01": {
                return 1;
            }
            case "02": {
                return 2;
            }
            case "03": {
                return 4;
            }
            case "04": {
                return 8;
            }
            case "05": {
                return 16;
            }
            case "06": {
                return 0x20;
            }
            case "07": {
                return 0x40;
            }
            case "08": {
                return 0x80;
            }
            case "09": {
                return 0x100;
            }
            case "10": {
                return 0x200;
            }
            case "11": {
                return 0x400;
            }
            case "12": {
                return 0x800;
            }
            case "13": {
                return 0x1000;
            }
            default: {
                return null;
            }
        }
    }

    @Nullable
    private static Integer l(@Nullable String s) {
        if(s == null) {
            return null;
        }
        switch(s) {
            case "00": {
                return 1;
            }
            case "01": {
                return 2;
            }
            case "02": {
                return 4;
            }
            case "03": {
                return 8;
            }
            case "04": {
                return 16;
            }
            case "05": {
                return 0x20;
            }
            case "06": {
                return 0x40;
            }
            case "07": {
                return 0x80;
            }
            case "08": {
                return 0x100;
            }
            case "09": {
                return 0x200;
            }
            case "10": {
                return 0x400;
            }
            default: {
                return null;
            }
        }
    }

    @Nullable
    private static Pair m(String s, String[] arr_s) {
        if(arr_s.length != 3) {
            Log.n("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + s);
            return null;
        }
        try {
            if("audio/mp4a-latm".equals(MimeTypes.h(Integer.parseInt(arr_s[1], 16)))) {
                int v = MediaCodecUtil.R(Integer.parseInt(arr_s[2]));
                if(v != -1) {
                    return new Pair(v, 0);
                }
            }
        }
        catch(NumberFormatException unused_ex) {
            Log.n("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + s);
        }
        return null;
    }

    @Nullable
    public static String n(Format format0) {
        if("audio/eac3-joc".equals(format0.n)) {
            return "audio/eac3";
        }
        if("video/dolby-vision".equals(format0.n)) {
            Pair pair0 = MediaCodecUtil.s(format0);
            if(pair0 != null) {
                switch(((int)(((Integer)pair0.first)))) {
                    case 16: 
                    case 0x100: {
                        return "video/hevc";
                    }
                    case 0x200: {
                        return "video/avc";
                    }
                    case 0x400: {
                        return "video/av01";
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public static List o(MediaCodecSelector mediaCodecSelector0, Format format0, boolean z, boolean z1) throws DecoderQueryException {
        String s = MediaCodecUtil.n(format0);
        return s == null ? O2.A() : mediaCodecSelector0.a(s, z, z1);
    }

    @Nullable
    private static Pair p(String s, String[] arr_s, @Nullable ColorInfo colorInfo0) {
        int v3;
        int v2;
        int v1;
        int v;
        if(arr_s.length < 4) {
            Log.n("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + s);
            return null;
        }
        try {
            v = 1;
            v1 = Integer.parseInt(arr_s[1]);
            v2 = Integer.parseInt(arr_s[2].substring(0, 2));
            v3 = Integer.parseInt(arr_s[3]);
        }
        catch(NumberFormatException unused_ex) {
            Log.n("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + s);
            return null;
        }
        if(v1 != 0) {
            Log.n("MediaCodecUtil", "Unknown AV1 profile: " + v1);
            return null;
        }
        if(v3 != 8 && v3 != 10) {
            Log.n("MediaCodecUtil", "Unknown AV1 bit depth: " + v3);
            return null;
        }
        if(v3 != 8) {
            v = colorInfo0 == null || colorInfo0.d == null && (colorInfo0.c != 6 && colorInfo0.c != 7) ? 2 : 0x1000;
        }
        int v4 = MediaCodecUtil.f(v2);
        if(v4 == -1) {
            Log.n("MediaCodecUtil", "Unknown AV1 level: " + v2);
            return null;
        }
        return new Pair(v, v4);
    }

    @Nullable
    private static Pair q(String s, String[] arr_s) {
        int v2;
        int v1;
        if(arr_s.length < 2) {
            Log.n("MediaCodecUtil", "Ignoring malformed AVC codec string: " + s);
            return null;
        }
        try {
            if(arr_s[1].length() == 6) {
                v2 = Integer.parseInt(arr_s[1].substring(0, 2), 16);
                v1 = Integer.parseInt(arr_s[1].substring(4), 16);
            }
            else {
                if(arr_s.length < 3) {
                    Log.n("MediaCodecUtil", "Ignoring malformed AVC codec string: " + s);
                    return null;
                }
                int v = Integer.parseInt(arr_s[1]);
                v1 = Integer.parseInt(arr_s[2]);
                v2 = v;
            }
        }
        catch(NumberFormatException unused_ex) {
            Log.n("MediaCodecUtil", "Ignoring malformed AVC codec string: " + s);
            return null;
        }
        int v3 = MediaCodecUtil.i(v2);
        if(v3 == -1) {
            Log.n("MediaCodecUtil", "Unknown AVC profile: " + v2);
            return null;
        }
        int v4 = MediaCodecUtil.g(v1);
        if(v4 == -1) {
            Log.n("MediaCodecUtil", "Unknown AVC level: " + v1);
            return null;
        }
        return new Pair(v3, v4);
    }

    @Nullable
    private static String r(MediaCodecInfo mediaCodecInfo0, String s, String s1) {
        String[] arr_s = mediaCodecInfo0.getSupportedTypes();
        for(int v = 0; v < arr_s.length; ++v) {
            String s2 = arr_s[v];
            if(s2.equalsIgnoreCase(s1)) {
                return s2;
            }
        }
        if(s1.equals("video/dolby-vision")) {
            if("OMX.MS.HEVCDV.Decoder".equals(s)) {
                return "video/hevcdv";
            }
            return !"OMX.RTK.video.decoder".equals(s) && !"OMX.realtek.video.decoder.tunneled".equals(s) ? null : "video/dv_hevc";
        }
        if(s1.equals("audio/alac") && "OMX.lge.alac.decoder".equals(s)) {
            return "audio/x-lg-alac";
        }
        if(s1.equals("audio/flac") && "OMX.lge.flac.decoder".equals(s)) {
            return "audio/x-lg-flac";
        }
        return !s1.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(s) ? null : "audio/lg-ac3";
    }

    @Nullable
    public static Pair s(Format format0) {
        String s = format0.j;
        if(s == null) {
            return null;
        }
        String[] arr_s = s.split("\\.");
        if("video/dolby-vision".equals(format0.n)) {
            return MediaCodecUtil.z(format0.j, arr_s);
        }
        String s1 = arr_s[0];
        s1.hashCode();
        switch(s1) {
            case "av01": {
                return MediaCodecUtil.p(format0.j, arr_s, format0.A);
            }
            case "avc1": {
                return MediaCodecUtil.q(format0.j, arr_s);
            }
            case "avc2": {
                return MediaCodecUtil.q(format0.j, arr_s);
            }
            case "hev1": {
                return MediaCodecUtil.A(format0.j, arr_s, format0.A);
            }
            case "hvc1": {
                return MediaCodecUtil.A(format0.j, arr_s, format0.A);
            }
            case "mp4a": {
                return MediaCodecUtil.m(format0.j, arr_s);
            }
            case "vp09": {
                return MediaCodecUtil.B(format0.j, arr_s);
            }
            default: {
                return null;
            }
        }
    }

    @Nullable
    public static androidx.media3.exoplayer.mediacodec.MediaCodecInfo t(String s, boolean z, boolean z1) throws DecoderQueryException {
        List list0 = MediaCodecUtil.u(s, z, z1);
        return list0.isEmpty() ? null : ((androidx.media3.exoplayer.mediacodec.MediaCodecInfo)list0.get(0));
    }

    public static List u(String s, boolean z, boolean z1) throws DecoderQueryException {
        synchronized(MediaCodecUtil.class) {
            CodecKey mediaCodecUtil$CodecKey0 = new CodecKey(s, z, z1);
            HashMap hashMap0 = MediaCodecUtil.c;
            List list0 = (List)hashMap0.get(mediaCodecUtil$CodecKey0);
            if(list0 != null) {
                return list0;
            }
            int v1 = Util.a;
            MediaCodecListCompatV21 mediaCodecUtil$MediaCodecListCompatV210 = v1 >= 21 ? new MediaCodecListCompatV21(z, z1) : new MediaCodecListCompatV16(null);
            ArrayList arrayList0 = MediaCodecUtil.v(mediaCodecUtil$CodecKey0, mediaCodecUtil$MediaCodecListCompatV210);
            if(z && arrayList0.isEmpty() && 21 <= v1 && v1 <= 23) {
                arrayList0 = MediaCodecUtil.v(mediaCodecUtil$CodecKey0, new MediaCodecListCompatV16(null));
                if(!arrayList0.isEmpty()) {
                    Log.n("MediaCodecUtil", "MediaCodecList API didn\'t list secure decoder for: " + s + ". Assuming: " + ((androidx.media3.exoplayer.mediacodec.MediaCodecInfo)arrayList0.get(0)).a);
                }
            }
            MediaCodecUtil.e(s, arrayList0);
            List list1 = O2.r(arrayList0);
            hashMap0.put(mediaCodecUtil$CodecKey0, list1);
            return list1;
        }
    }

    private static ArrayList v(CodecKey mediaCodecUtil$CodecKey0, MediaCodecListCompat mediaCodecUtil$MediaCodecListCompat0) throws DecoderQueryException {
        StringBuilder stringBuilder0;
        String s5;
        String s4;
        String s3;
        boolean z7;
        boolean z6;
        boolean z5;
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0;
        String s2;
        String s1;
        int v2;
        MediaCodecInfo mediaCodecInfo0;
        int v1;
        String s;
        ArrayList arrayList0;
        try {
            arrayList0 = new ArrayList();
            s = mediaCodecUtil$CodecKey0.a;
            int v = mediaCodecUtil$MediaCodecListCompat0.d();
            boolean z = mediaCodecUtil$MediaCodecListCompat0.e();
            v1 = 0;
            while(true) {
            label_5:
                if(v1 >= v) {
                    return arrayList0;
                }
                mediaCodecInfo0 = mediaCodecUtil$MediaCodecListCompat0.b(v1);
                if(MediaCodecUtil.D(mediaCodecInfo0)) {
                    v2 = v1;
                }
                else {
                    s1 = mediaCodecInfo0.getName();
                    if(MediaCodecUtil.F(mediaCodecInfo0, s1, z, s)) {
                        s2 = MediaCodecUtil.r(mediaCodecInfo0, s1, s);
                        if(s2 == null) {
                            v2 = v1;
                            v1 = v2 + 1;
                            continue;
                        }
                        break;
                    }
                    else {
                        v2 = v1;
                    }
                }
                v1 = v2 + 1;
            }
        }
        catch(Exception exception0) {
            throw new DecoderQueryException(exception0, null);
        }
        try {
            mediaCodecInfo$CodecCapabilities0 = mediaCodecInfo0.getCapabilitiesForType(s2);
            boolean z1 = mediaCodecUtil$MediaCodecListCompat0.c("tunneled-playback", s2, mediaCodecInfo$CodecCapabilities0);
            boolean z2 = mediaCodecUtil$MediaCodecListCompat0.a("tunneled-playback", s2, mediaCodecInfo$CodecCapabilities0);
            if(!mediaCodecUtil$CodecKey0.c && z2 || mediaCodecUtil$CodecKey0.c && !z1) {
                v2 = v1;
                v1 = v2 + 1;
                goto label_5;
            }
            else {
                boolean z3 = mediaCodecUtil$MediaCodecListCompat0.c("secure-playback", s2, mediaCodecInfo$CodecCapabilities0);
                boolean z4 = mediaCodecUtil$MediaCodecListCompat0.a("secure-playback", s2, mediaCodecInfo$CodecCapabilities0);
                if(!mediaCodecUtil$CodecKey0.b && z4 || mediaCodecUtil$CodecKey0.b && !z3) {
                    v2 = v1;
                    v1 = v2 + 1;
                    goto label_5;
                }
                else {
                    z5 = MediaCodecUtil.G(mediaCodecInfo0, s);
                    z6 = MediaCodecUtil.I(mediaCodecInfo0, s);
                    z7 = MediaCodecUtil.K(mediaCodecInfo0);
                    goto label_35;
                }
            }
            v1 = v2 + 1;
            goto label_5;
        }
        catch(Exception exception1) {
            s3 = s2;
            s4 = s1;
            v2 = v1;
            goto label_57;
        }
    label_35:
        if(z && mediaCodecUtil$CodecKey0.b == z3) {
            try {
            label_50:
                s3 = s2;
                s5 = s1;
                v2 = v1;
                arrayList0.add(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.E(s1, s, s2, mediaCodecInfo$CodecCapabilities0, z5, z6, z7, false, false));
                v1 = v2 + 1;
                goto label_5;
            }
            catch(Exception exception1) {
            label_56:
                s4 = s5;
            }
            try {
            label_57:
                if(Util.a > 23 || arrayList0.isEmpty()) {
                    Log.d("MediaCodecUtil", "Failed to query codec " + s4 + " (" + s3 + ")");
                    throw exception1;
                }
                Log.d("MediaCodecUtil", "Skipping codec " + s4 + " (failed to query capabilities)");
                v1 = v2 + 1;
                goto label_5;
            }
            catch(Exception exception0) {
            }
            throw new DecoderQueryException(exception0, null);
        }
        else {
            try {
                if(z || mediaCodecUtil$CodecKey0.b) {
                    s3 = s2;
                    s5 = s1;
                    v2 = v1;
                    if(!z && z3) {
                        stringBuilder0 = new StringBuilder();
                        goto label_42;
                    }
                }
                else {
                    goto label_50;
                }
                v1 = v2 + 1;
                goto label_5;
            }
            catch(Exception exception1) {
                goto label_56;
            }
            try {
            label_42:
                stringBuilder0.append(s5);
                s4 = s5;
                stringBuilder0.append(".secure");
                s4 = s5;
                arrayList0.add(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.E(stringBuilder0.toString(), s, s3, mediaCodecInfo$CodecCapabilities0, z5, z6, z7, false, true));
                return arrayList0;
            }
            catch(Exception exception1) {
                goto label_57;
            }
        }
        v1 = v2 + 1;
        goto label_5;
    }

    @m({"#2.sampleMimeType"})
    public static List w(MediaCodecSelector mediaCodecSelector0, Format format0, boolean z, boolean z1) throws DecoderQueryException {
        List list0 = mediaCodecSelector0.a(format0.n, z, z1);
        List list1 = MediaCodecUtil.o(mediaCodecSelector0, format0, z, z1);
        return O2.n().l(list0).l(list1).n();
    }

    @CheckResult
    public static List x(List list0, Format format0) {
        List list1 = new ArrayList(list0);
        MediaCodecUtil.S(list1, (androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo0) -> mediaCodecInfo0.n(format0));
        return list1;
    }

    @Nullable
    public static androidx.media3.exoplayer.mediacodec.MediaCodecInfo y() throws DecoderQueryException {
        return MediaCodecUtil.t("audio/raw", false, false);
    }

    @Nullable
    private static Pair z(String s, String[] arr_s) {
        if(arr_s.length < 3) {
            Log.n("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + s);
            return null;
        }
        Matcher matcher0 = MediaCodecUtil.b.matcher(arr_s[1]);
        if(!matcher0.matches()) {
            Log.n("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + s);
            return null;
        }
        String s1 = matcher0.group(1);
        Integer integer0 = MediaCodecUtil.l(s1);
        if(integer0 == null) {
            Log.n("MediaCodecUtil", "Unknown Dolby Vision profile string: " + s1);
            return null;
        }
        String s2 = arr_s[2];
        Integer integer1 = MediaCodecUtil.k(s2);
        if(integer1 == null) {
            Log.n("MediaCodecUtil", "Unknown Dolby Vision level string: " + s2);
            return null;
        }
        return new Pair(integer0, integer1);
    }

    class androidx.media3.exoplayer.mediacodec.MediaCodecUtil.1 {
    }

}

