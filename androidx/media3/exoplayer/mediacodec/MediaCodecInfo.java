package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

@UnstableApi
public final class MediaCodecInfo {
    public final String a;
    public final String b;
    public final String c;
    @Nullable
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    private final boolean k;
    public static final String l = "MediaCodecInfo";
    public static final int m = -1;

    @VisibleForTesting
    MediaCodecInfo(String s, String s1, String s2, @Nullable MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = (String)Assertions.g(s);
        this.b = s1;
        this.c = s2;
        this.d = mediaCodecInfo$CodecCapabilities0;
        this.h = z;
        this.i = z1;
        this.j = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.k = MimeTypes.u(s1);
    }

    // 去混淆评级： 低(20)
    private static boolean A(String s) {
        return Util.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(s);
    }

    // 去混淆评级： 低(40)
    private static boolean B(String s) {
        return Util.a <= 22 && (("ODROID-XU3".equals(Util.d) || "Nexus 10".equals(Util.d)) && ("OMX.Exynos.AVC.Decoder".equals(s) || "OMX.Exynos.AVC.Decoder.secure".equals(s)));
    }

    // 去混淆评级： 低(30)
    private static boolean C(String s, int v) {
        return "video/hevc".equals(s) && 2 == v && ("sailfish".equals(Util.b) || "marlin".equals(Util.b));
    }

    // 去混淆评级： 低(20)
    private static boolean D(String s) {
        return !"OMX.MTK.VIDEO.DECODER.HEVC".equals(s) || !"mcv5a".equals(Util.b);
    }

    // 去混淆评级： 低(23)
    public static MediaCodecInfo E(String s, String s1, String s2, @Nullable MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4) {
        boolean z5 = !z3 && mediaCodecInfo$CodecCapabilities0 != null && MediaCodecInfo.j(mediaCodecInfo$CodecCapabilities0) && !MediaCodecInfo.B(s);
        boolean z6 = mediaCodecInfo$CodecCapabilities0 != null && MediaCodecInfo.u(mediaCodecInfo$CodecCapabilities0);
        return z4 || mediaCodecInfo$CodecCapabilities0 != null && MediaCodecInfo.s(mediaCodecInfo$CodecCapabilities0) ? new MediaCodecInfo(s, s1, s2, mediaCodecInfo$CodecCapabilities0, z, z1, z2, z5, z6, true) : new MediaCodecInfo(s, s1, s2, mediaCodecInfo$CodecCapabilities0, z, z1, z2, z5, z6, false);
    }

    private static int a(String s, String s1, int v) {
        int v1;
        if(v <= 1 && (Util.a < 26 || v <= 0) && !"audio/mpeg".equals(s1) && !"audio/3gpp".equals(s1) && !"audio/amr-wb".equals(s1) && !"audio/mp4a-latm".equals(s1) && !"audio/vorbis".equals(s1) && !"audio/opus".equals(s1) && !"audio/raw".equals(s1) && !"audio/flac".equals(s1) && !"audio/g711-alaw".equals(s1) && !"audio/g711-mlaw".equals(s1) && !"audio/gsm".equals(s1)) {
            if("audio/ac3".equals(s1)) {
                v1 = 6;
            }
            else {
                v1 = "audio/eac3".equals(s1) ? 16 : 30;
            }
            Log.n("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + s + ", [" + v + " to " + v1 + "]");
            return v1;
        }
        return v;
    }

    @Nullable
    @RequiresApi(21)
    public Point b(int v, int v1) {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.d;
        if(mediaCodecInfo$CodecCapabilities0 == null) {
            return null;
        }
        MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
        return mediaCodecInfo$VideoCapabilities0 == null ? null : MediaCodecInfo.c(mediaCodecInfo$VideoCapabilities0, v, v1);
    }

    @RequiresApi(21)
    private static Point c(MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0, int v, int v1) {
        int v2 = mediaCodecInfo$VideoCapabilities0.getWidthAlignment();
        int v3 = mediaCodecInfo$VideoCapabilities0.getHeightAlignment();
        return new Point((v + v2 - 1) / v2 * v2, (v1 + v3 - 1) / v3 * v3);
    }

    @RequiresApi(21)
    private static boolean d(MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0, int v, int v1, double f) {
        Point point0 = MediaCodecInfo.c(mediaCodecInfo$VideoCapabilities0, v, v1);
        int v2 = point0.x;
        int v3 = point0.y;
        return f == -1.0 || f < 1.0 ? mediaCodecInfo$VideoCapabilities0.isSizeSupported(v2, v3) : mediaCodecInfo$VideoCapabilities0.areSizeAndRateSupported(v2, v3, Math.floor(f));
    }

    public DecoderReuseEvaluation e(Format format0, Format format1) {
        int v = Util.g(format0.n, format1.n) ? 0 : 8;
        if(this.k) {
            if(format0.w != format1.w) {
                v |= 0x400;
            }
            if(!this.e && (format0.t != format1.t || format0.u != format1.u)) {
                v |= 0x200;
            }
            if((!ColorInfo.i(format0.A) || !ColorInfo.i(format1.A)) && !Util.g(format0.A, format1.A)) {
                v |= 0x800;
            }
            if(MediaCodecInfo.A(this.a) && !format0.g(format1)) {
                v |= 2;
            }
            if(v == 0) {
                return format0.g(format1) ? new DecoderReuseEvaluation(this.a, format0, format1, 3, 0) : new DecoderReuseEvaluation(this.a, format0, format1, 2, 0);
            }
            return new DecoderReuseEvaluation(this.a, format0, format1, 0, v);
        }
        if(format0.B != format1.B) {
            v |= 0x1000;
        }
        if(format0.C != format1.C) {
            v |= 0x2000;
        }
        if(format0.D != format1.D) {
            v |= 0x4000;
        }
        if(v == 0 && "audio/mp4a-latm".equals(this.b)) {
            Pair pair0 = MediaCodecUtil.s(format0);
            Pair pair1 = MediaCodecUtil.s(format1);
            if(pair0 != null && pair1 != null && (((int)(((Integer)pair0.first))) == 42 && ((int)(((Integer)pair1.first))) == 42)) {
                return new DecoderReuseEvaluation(this.a, format0, format1, 3, 0);
            }
        }
        if(!format0.g(format1)) {
            v |= 0x20;
        }
        if(MediaCodecInfo.z(this.b)) {
            v |= 2;
        }
        return v == 0 ? new DecoderReuseEvaluation(this.a, format0, format1, 1, 0) : new DecoderReuseEvaluation(this.a, format0, format1, 0, v);
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(@Nullable MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
        int v1;
        if(mediaCodecInfo$CodecCapabilities0 == null) {
            v1 = 1;
        }
        else {
            MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
            if(mediaCodecInfo$VideoCapabilities0 == null) {
                v1 = 1;
            }
            else {
                int v = (int)(((Integer)mediaCodecInfo$VideoCapabilities0.getBitrateRange().getUpper()));
                if(v >= 180000000) {
                    v1 = 0x400;
                }
                else if(v >= 120000000) {
                    v1 = 0x200;
                }
                else if(v >= 60000000) {
                    v1 = 0x100;
                }
                else if(v >= 30000000) {
                    v1 = 0x80;
                }
                else if(v >= 18000000) {
                    v1 = 0x40;
                }
                else if(v >= 12000000) {
                    v1 = 0x20;
                }
                else if(v >= 7200000) {
                    v1 = 16;
                }
                else if(v >= 3600000) {
                    v1 = 8;
                }
                else if(v >= 1800000) {
                    v1 = 4;
                }
                else if(v >= 800000) {
                    v1 = 2;
                }
                else {
                    v1 = 1;
                }
            }
        }
        MediaCodecInfo.CodecProfileLevel mediaCodecInfo$CodecProfileLevel0 = new MediaCodecInfo.CodecProfileLevel();
        mediaCodecInfo$CodecProfileLevel0.profile = 1;
        mediaCodecInfo$CodecProfileLevel0.level = v1;
        return new MediaCodecInfo.CodecProfileLevel[]{mediaCodecInfo$CodecProfileLevel0};
    }

    public int g() {
        if(Util.a >= 23) {
            return this.d == null ? -1 : MediaCodecInfo.h(this.d);
        }
        return -1;
    }

    @RequiresApi(23)
    private static int h(MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
        return mediaCodecInfo$CodecCapabilities0.getMaxSupportedInstances();
    }

    public MediaCodecInfo.CodecProfileLevel[] i() {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.d;
        if(mediaCodecInfo$CodecCapabilities0 != null) {
            return mediaCodecInfo$CodecCapabilities0.profileLevels == null ? new MediaCodecInfo.CodecProfileLevel[0] : mediaCodecInfo$CodecCapabilities0.profileLevels;
        }
        return new MediaCodecInfo.CodecProfileLevel[0];
    }

    private static boolean j(MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
        return mediaCodecInfo$CodecCapabilities0.isFeatureSupported("adaptive-playback");
    }

    @RequiresApi(21)
    public boolean k(int v) {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.d;
        if(mediaCodecInfo$CodecCapabilities0 == null) {
            this.y("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities mediaCodecInfo$AudioCapabilities0 = mediaCodecInfo$CodecCapabilities0.getAudioCapabilities();
        if(mediaCodecInfo$AudioCapabilities0 == null) {
            this.y("channelCount.aCaps");
            return false;
        }
        int v1 = mediaCodecInfo$AudioCapabilities0.getMaxInputChannelCount();
        if(MediaCodecInfo.a(this.a, this.b, v1) < v) {
            this.y("channelCount.support, " + v);
            return false;
        }
        return true;
    }

    @RequiresApi(21)
    public boolean l(int v) {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.d;
        if(mediaCodecInfo$CodecCapabilities0 == null) {
            this.y("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities mediaCodecInfo$AudioCapabilities0 = mediaCodecInfo$CodecCapabilities0.getAudioCapabilities();
        if(mediaCodecInfo$AudioCapabilities0 == null) {
            this.y("sampleRate.aCaps");
            return false;
        }
        if(!mediaCodecInfo$AudioCapabilities0.isSampleRateSupported(v)) {
            this.y("sampleRate.support, " + v);
            return false;
        }
        return true;
    }

    private boolean m(Format format0, boolean z) {
        Pair pair0 = MediaCodecUtil.s(format0);
        if(pair0 == null) {
            return true;
        }
        int v = (int)(((Integer)pair0.first));
        int v1 = (int)(((Integer)pair0.second));
        if("video/dolby-vision".equals(format0.n)) {
            if("video/avc".equals(this.b)) {
                v = 8;
                v1 = 0;
            }
            else if("video/hevc".equals(this.b)) {
                v = 2;
                v1 = 0;
            }
        }
        if(!this.k && v != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = this.i();
        if(Util.a <= 23 && "video/x-vnd.on2.vp9".equals(this.b) && arr_mediaCodecInfo$CodecProfileLevel.length == 0) {
            arr_mediaCodecInfo$CodecProfileLevel = MediaCodecInfo.f(this.d);
        }
        for(int v2 = 0; v2 < arr_mediaCodecInfo$CodecProfileLevel.length; ++v2) {
            MediaCodecInfo.CodecProfileLevel mediaCodecInfo$CodecProfileLevel0 = arr_mediaCodecInfo$CodecProfileLevel[v2];
            if(mediaCodecInfo$CodecProfileLevel0.profile == v && (mediaCodecInfo$CodecProfileLevel0.level >= v1 || !z) && !MediaCodecInfo.C(this.b, v)) {
                return true;
            }
        }
        this.y("codec.profileLevel, " + format0.j + ", " + this.c);
        return false;
    }

    // 去混淆评级： 低(20)
    public boolean n(Format format0) {
        return this.q(format0) && this.m(format0, false);
    }

    public boolean o(Format format0) throws DecoderQueryException {
        if(!this.q(format0)) {
            return false;
        }
        if(!this.m(format0, true)) {
            return false;
        }
        if(this.k) {
            int v = format0.t;
            if(v > 0) {
                int v1 = format0.u;
                if(v1 > 0) {
                    if(Util.a >= 21) {
                        return this.w(v, v1, ((double)format0.v));
                    }
                    if(v * v1 <= MediaCodecUtil.Q()) {
                        return true;
                    }
                    this.y("legacyFrameSize, " + format0.t + "x" + format0.u);
                    return false;
                }
            }
            return true;
        }
        return Util.a < 21 || (format0.C == -1 || this.l(format0.C)) && (format0.B == -1 || this.k(format0.B));
    }

    public boolean p() {
        if(Util.a >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = this.i();
            for(int v = 0; v < arr_mediaCodecInfo$CodecProfileLevel.length; ++v) {
                if(arr_mediaCodecInfo$CodecProfileLevel[v].profile == 0x4000) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean q(Format format0) {
        if(!this.b.equals(format0.n)) {
            String s = MediaCodecUtil.n(format0);
            return this.b.equals(s);
        }
        return true;
    }

    public boolean r(Format format0) {
        if(this.k) {
            return this.e;
        }
        Pair pair0 = MediaCodecUtil.s(format0);
        return pair0 != null && ((int)(((Integer)pair0.first))) == 42;
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
        return Util.a >= 21 && MediaCodecInfo.t(mediaCodecInfo$CodecCapabilities0);
    }

    @RequiresApi(21)
    private static boolean t(MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
        return mediaCodecInfo$CodecCapabilities0.isFeatureSupported("secure-playback");
    }

    @Override
    public String toString() {
        return this.a;
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
        return Util.a >= 21 && MediaCodecInfo.v(mediaCodecInfo$CodecCapabilities0);
    }

    @RequiresApi(21)
    private static boolean v(MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0) {
        return mediaCodecInfo$CodecCapabilities0.isFeatureSupported("tunneled-playback");
    }

    @RequiresApi(21)
    public boolean w(int v, int v1, double f) {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.d;
        if(mediaCodecInfo$CodecCapabilities0 == null) {
            this.y("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
        if(mediaCodecInfo$VideoCapabilities0 == null) {
            this.y("sizeAndRate.vCaps");
            return false;
        }
        if(Util.a >= 29) {
            int v2 = MediaCodecPerformancePointCoverageProvider.c(mediaCodecInfo$VideoCapabilities0, v, v1, f);
            if(v2 == 2) {
                return true;
            }
            if(v2 == 1) {
                this.y("sizeAndRate.cover, " + v + "x" + v1 + "@" + f);
                return false;
            }
        }
        if(!MediaCodecInfo.d(mediaCodecInfo$VideoCapabilities0, v, v1, f)) {
            if(v < v1 && MediaCodecInfo.D(this.a) && MediaCodecInfo.d(mediaCodecInfo$VideoCapabilities0, v1, v, f)) {
                this.x("sizeAndRate.rotated, " + v + "x" + v1 + "@" + f);
                return true;
            }
            this.y("sizeAndRate.support, " + v + "x" + v1 + "@" + f);
            return false;
        }
        return true;
    }

    private void x(String s) {
        Log.b("MediaCodecInfo", "AssumedSupport [" + s + "] [" + this.a + ", " + this.b + "] [" + Util.e + "]");
    }

    private void y(String s) {
        Log.b("MediaCodecInfo", "NoSupport [" + s + "] [" + this.a + ", " + this.b + "] [" + Util.e + "]");
    }

    private static boolean z(String s) {
        return "audio/opus".equals(s);
    }
}

