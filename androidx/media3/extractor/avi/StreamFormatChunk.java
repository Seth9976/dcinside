package androidx.media3.extractor.avi;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import com.google.common.collect.O2;

final class StreamFormatChunk implements AviChunk {
    public final Format a;
    private static final String b = "StreamFormatChunk";

    public StreamFormatChunk(Format format0) {
        this.a = format0;
    }

    @Nullable
    private static String a(int v) {
        switch(v) {
            case 0x3234504D: {
                return "video/mp42";
            }
            case 0x3334504D: {
                return "video/mp43";
            }
            case 0x31435641: 
            case 828601953: 
            case 875967048: {
                return "video/avc";
            }
            case 0x47504A4D: 
            case 0x67706A6D: {
                return "video/mjpeg";
            }
            case 808802372: 
            case 0x34504D46: 
            case 0x44495633: 
            case 1145656920: 
            case 1482049860: 
            case 1684633208: 
            case 2021026148: {
                return "video/mp4v-es";
            }
            default: {
                return null;
            }
        }
    }

    @Nullable
    private static String b(int v) {
        switch(v) {
            case 1: {
                return "audio/raw";
            }
            case 85: {
                return "audio/mpeg";
            }
            case 0xFF: {
                return "audio/mp4a-latm";
            }
            case 0x2000: {
                return "audio/ac3";
            }
            case 0x2001: {
                return "audio/vnd.dts";
            }
            default: {
                return null;
            }
        }
    }

    @Nullable
    private static AviChunk c(ParsableByteArray parsableByteArray0) {
        parsableByteArray0.Z(4);
        int v = parsableByteArray0.w();
        int v1 = parsableByteArray0.w();
        parsableByteArray0.Z(4);
        int v2 = parsableByteArray0.w();
        String s = StreamFormatChunk.a(v2);
        if(s == null) {
            Log.n("StreamFormatChunk", "Ignoring track with unsupported compression " + v2);
            return null;
        }
        Builder format$Builder0 = new Builder();
        format$Builder0.v0(v).Y(v1).o0(s);
        return new StreamFormatChunk(format$Builder0.K());
    }

    @Nullable
    public static AviChunk d(int v, ParsableByteArray parsableByteArray0) {
        switch(v) {
            case 1: {
                return StreamFormatChunk.e(parsableByteArray0);
            }
            case 2: {
                return StreamFormatChunk.c(parsableByteArray0);
            }
            default: {
                Log.n("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + Util.M0(v));
                return null;
            }
        }
    }

    @Nullable
    private static AviChunk e(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.D();
        String s = StreamFormatChunk.b(v);
        if(s == null) {
            Log.n("StreamFormatChunk", "Ignoring track with unsupported format tag " + v);
            return null;
        }
        int v1 = parsableByteArray0.D();
        int v2 = parsableByteArray0.w();
        parsableByteArray0.Z(6);
        int v3 = Util.z0(parsableByteArray0.D());
        int v4 = parsableByteArray0.a() <= 0 ? 0 : parsableByteArray0.D();
        byte[] arr_b = new byte[v4];
        parsableByteArray0.n(arr_b, 0, v4);
        Builder format$Builder0 = new Builder();
        format$Builder0.o0(s).N(v1).p0(v2);
        if("audio/raw".equals(s) && v3 != 0) {
            format$Builder0.i0(v3);
        }
        if("audio/mp4a-latm".equals(s) && v4 > 0) {
            format$Builder0.b0(O2.B(arr_b));
        }
        return new StreamFormatChunk(format$Builder0.K());
    }

    @Override  // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return 0x66727473;
    }
}

