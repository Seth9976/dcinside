package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import com.google.common.collect.O2.a;
import java.nio.ByteBuffer;
import java.util.List;

@UnstableApi
public final class MediaFormatUtil {
    public static final String a = "exo-pixel-width-height-ratio-float";
    public static final String b = "exo-pcm-encoding-int";
    public static final String c = "max-bitrate";
    private static final int d = 0x40000000;

    @SuppressLint({"InlinedApi"})
    public static Format a(MediaFormat mediaFormat0) {
        Builder format$Builder0 = new Builder().o0(mediaFormat0.getString("mime")).e0(mediaFormat0.getString("language")).j0(MediaFormatUtil.h(mediaFormat0, "max-bitrate", -1)).M(MediaFormatUtil.h(mediaFormat0, "bitrate", -1)).O(mediaFormat0.getString("codecs-string")).X(MediaFormatUtil.g(mediaFormat0, -1.0f)).v0(MediaFormatUtil.h(mediaFormat0, "width", -1)).Y(MediaFormatUtil.h(mediaFormat0, "height", -1)).k0(MediaFormatUtil.i(mediaFormat0, 1.0f)).f0(MediaFormatUtil.h(mediaFormat0, "max-input-size", -1)).n0(MediaFormatUtil.h(mediaFormat0, "rotation-degrees", 0)).P(MediaFormatUtil.e(mediaFormat0, true)).p0(MediaFormatUtil.h(mediaFormat0, "sample-rate", -1)).N(MediaFormatUtil.h(mediaFormat0, "channel-count", -1)).i0(MediaFormatUtil.h(mediaFormat0, "pcm-encoding", -1));
        a o2$a0 = new a();
        ByteBuffer byteBuffer0;
        for(int v = 0; (byteBuffer0 = mediaFormat0.getByteBuffer("csd-" + v)) != null; ++v) {
            byte[] arr_b = new byte[byteBuffer0.remaining()];
            byteBuffer0.get(arr_b);
            byteBuffer0.rewind();
            o2$a0.j(arr_b);
        }
        format$Builder0.b0(o2$a0.n());
        return format$Builder0.K();
    }

    @SuppressLint({"InlinedApi"})
    public static MediaFormat b(Format format0) {
        MediaFormat mediaFormat0 = new MediaFormat();
        MediaFormatUtil.s(mediaFormat0, "bitrate", format0.i);
        MediaFormatUtil.s(mediaFormat0, "max-bitrate", format0.h);
        MediaFormatUtil.s(mediaFormat0, "channel-count", format0.B);
        MediaFormatUtil.q(mediaFormat0, format0.A);
        MediaFormatUtil.v(mediaFormat0, "mime", format0.n);
        MediaFormatUtil.v(mediaFormat0, "codecs-string", format0.j);
        MediaFormatUtil.r(mediaFormat0, "frame-rate", format0.v);
        MediaFormatUtil.s(mediaFormat0, "width", format0.t);
        MediaFormatUtil.s(mediaFormat0, "height", format0.u);
        MediaFormatUtil.x(mediaFormat0, format0.q);
        MediaFormatUtil.t(mediaFormat0, format0.D);
        MediaFormatUtil.v(mediaFormat0, "language", format0.d);
        MediaFormatUtil.s(mediaFormat0, "max-input-size", format0.o);
        MediaFormatUtil.s(mediaFormat0, "sample-rate", format0.C);
        MediaFormatUtil.s(mediaFormat0, "caption-service-number", format0.G);
        mediaFormat0.setInteger("rotation-degrees", format0.w);
        MediaFormatUtil.w(mediaFormat0, "is-autoselect", format0.e & 4);
        MediaFormatUtil.w(mediaFormat0, "is-default", format0.e & 1);
        MediaFormatUtil.w(mediaFormat0, "is-forced-subtitle", format0.e & 2);
        mediaFormat0.setInteger("encoder-delay", format0.E);
        mediaFormat0.setInteger("encoder-padding", format0.F);
        MediaFormatUtil.u(mediaFormat0, format0.x);
        return mediaFormat0;
    }

    public static byte[] c(ByteBuffer byteBuffer0) {
        byte[] arr_b = new byte[byteBuffer0.remaining()];
        byteBuffer0.get(arr_b);
        return arr_b;
    }

    @Nullable
    public static ColorInfo d(MediaFormat mediaFormat0) {
        return MediaFormatUtil.e(mediaFormat0, false);
    }

    @Nullable
    private static ColorInfo e(MediaFormat mediaFormat0, boolean z) {
        if(Util.a < 24) {
            return null;
        }
        int v = MediaFormatUtil.h(mediaFormat0, "color-standard", -1);
        int v1 = MediaFormatUtil.h(mediaFormat0, "color-range", -1);
        int v2 = MediaFormatUtil.h(mediaFormat0, "color-transfer", -1);
        ByteBuffer byteBuffer0 = mediaFormat0.getByteBuffer("hdr-static-info");
        byte[] arr_b = byteBuffer0 == null ? null : MediaFormatUtil.c(byteBuffer0);
        if(!z) {
            if(!MediaFormatUtil.m(v)) {
                v = -1;
            }
            if(!MediaFormatUtil.l(v1)) {
                v1 = -1;
            }
            if(!MediaFormatUtil.n(v2)) {
                v2 = -1;
            }
        }
        return v != -1 || v1 != -1 || v2 != -1 || arr_b != null ? new androidx.media3.common.ColorInfo.Builder().d(v).c(v1).e(v2).f(arr_b).a() : null;
    }

    // 去混淆评级： 低(20)
    public static float f(MediaFormat mediaFormat0, String s, float f) {
        return mediaFormat0.containsKey(s) ? mediaFormat0.getFloat(s) : f;
    }

    private static float g(MediaFormat mediaFormat0, float f) {
        if(mediaFormat0.containsKey("frame-rate")) {
            try {
                return mediaFormat0.getFloat("frame-rate");
            }
            catch(ClassCastException unused_ex) {
                return (float)mediaFormat0.getInteger("frame-rate");
            }
        }
        return f;
    }

    // 去混淆评级： 低(20)
    public static int h(MediaFormat mediaFormat0, String s, int v) {
        return mediaFormat0.containsKey(s) ? mediaFormat0.getInteger(s) : v;
    }

    // 去混淆评级： 低(20)
    @SuppressLint({"InlinedApi"})
    private static float i(MediaFormat mediaFormat0, float f) {
        return !mediaFormat0.containsKey("sar-width") || !mediaFormat0.containsKey("sar-height") ? f : ((float)mediaFormat0.getInteger("sar-width")) / ((float)mediaFormat0.getInteger("sar-height"));
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static Integer j(MediaFormat mediaFormat0) {
        return !mediaFormat0.containsKey("time-lapse-enable") || mediaFormat0.getInteger("time-lapse-enable") <= 0 || !mediaFormat0.containsKey("time-lapse-fps") ? null : mediaFormat0.getInteger("time-lapse-fps");
    }

    public static boolean k(MediaFormat mediaFormat0) {
        return MimeTypes.q(mediaFormat0.getString("mime"));
    }

    private static boolean l(int v) {
        return v == 1 || v == 2 || v == -1;
    }

    private static boolean m(int v) {
        return v == 1 || v == 2 || (v == -1 || v == 6);
    }

    private static boolean n(int v) {
        return v == -1 || v == 1 || v == 3 || v == 6 || v == 7;
    }

    public static boolean o(MediaFormat mediaFormat0) {
        return MimeTypes.u(mediaFormat0.getString("mime"));
    }

    public static void p(MediaFormat mediaFormat0, String s, @Nullable byte[] arr_b) {
        if(arr_b != null) {
            mediaFormat0.setByteBuffer(s, ByteBuffer.wrap(arr_b));
        }
    }

    public static void q(MediaFormat mediaFormat0, @Nullable ColorInfo colorInfo0) {
        if(colorInfo0 != null) {
            MediaFormatUtil.s(mediaFormat0, "color-transfer", colorInfo0.c);
            MediaFormatUtil.s(mediaFormat0, "color-standard", colorInfo0.a);
            MediaFormatUtil.s(mediaFormat0, "color-range", colorInfo0.b);
            MediaFormatUtil.p(mediaFormat0, "hdr-static-info", colorInfo0.d);
        }
    }

    public static void r(MediaFormat mediaFormat0, String s, float f) {
        if(f != -1.0f) {
            mediaFormat0.setFloat(s, f);
        }
    }

    public static void s(MediaFormat mediaFormat0, String s, int v) {
        if(v != -1) {
            mediaFormat0.setInteger(s, v);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static void t(MediaFormat mediaFormat0, int v) {
        if(v == -1) {
            return;
        }
        int v1 = 2;
        MediaFormatUtil.s(mediaFormat0, "exo-pcm-encoding-int", v);
        if(v == 0) {
            v1 = 0;
        }
        else if(v != 2) {
            v1 = 3;
            if(v != 3 && v != 4 && (v != 21 && v != 22)) {
                return;
            }
        }
        mediaFormat0.setInteger("pcm-encoding", v1);
    }

    @SuppressLint({"InlinedApi"})
    private static void u(MediaFormat mediaFormat0, float f) {
        int v1;
        mediaFormat0.setFloat("exo-pixel-width-height-ratio-float", f);
        int v = 0x40000000;
        if(f < 1.0f) {
            v = (int)(f * 1073741824.0f);
            v1 = 0x40000000;
        }
        else if(f > 1.0f) {
            v1 = (int)(1073741824.0f / f);
        }
        else {
            v = 1;
            v1 = 1;
        }
        mediaFormat0.setInteger("sar-width", v);
        mediaFormat0.setInteger("sar-height", v1);
    }

    public static void v(MediaFormat mediaFormat0, String s, @Nullable String s1) {
        if(s1 != null) {
            mediaFormat0.setString(s, s1);
        }
    }

    private static void w(MediaFormat mediaFormat0, String s, int v) {
        mediaFormat0.setInteger(s, (v == 0 ? 0 : 1));
    }

    public static void x(MediaFormat mediaFormat0, List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            mediaFormat0.setByteBuffer("csd-" + v, ByteBuffer.wrap(((byte[])list0.get(v))));
        }
    }
}

