package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class AacUtil {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface AacAudioObjectType {
    }

    public static final class Config {
        public final int a;
        public final int b;
        public final String c;

        private Config(int v, int v1, String s) {
            this.a = v;
            this.b = v1;
            this.c = s;
        }

        Config(int v, int v1, String s, androidx.media3.extractor.AacUtil.1 aacUtil$10) {
            this(v, v1, s);
        }
    }

    private static final String a = "AacUtil";
    public static final int b = 0x400;
    public static final int c = 0x400;
    public static final int d = 0x800;
    public static final int e = 0x200;
    public static final int f = 100000;
    public static final int g = 16000;
    public static final int h = 7000;
    public static final int i = 256000;
    public static final int j = 8000;
    private static final int k = 15;
    private static final int[] l = null;
    private static final int m = -1;
    private static final int[] n = null;
    private static final String o = "mp4a.40.";
    public static final int p = 2;
    public static final int q = 5;
    public static final int r = 22;
    public static final int s = 23;
    public static final int t = 29;
    private static final int u = 0x1F;
    public static final int v = 42;

    static {
        AacUtil.l = new int[]{96000, 88200, 0xFA00, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        AacUtil.n = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static byte[] a(int v, int v1) {
        int v4 = -1;
        for(int v3 = 0; true; ++v3) {
            int[] arr_v = AacUtil.l;
            if(v3 >= arr_v.length) {
                break;
            }
            if(v == arr_v[v3]) {
                v4 = v3;
            }
        }
        int v5 = -1;
        for(int v2 = 0; true; ++v2) {
            int[] arr_v1 = AacUtil.n;
            if(v2 >= arr_v1.length) {
                break;
            }
            if(v1 == arr_v1[v2]) {
                v5 = v2;
            }
        }
        if(v == -1 || v5 == -1) {
            throw new IllegalArgumentException("Invalid sample rate or number of channels: " + v + ", " + v1);
        }
        return AacUtil.b(2, v4, v5);
    }

    public static byte[] b(int v, int v1, int v2) {
        return new byte[]{((byte)(v << 3 & 0xF8 | v1 >> 1 & 7)), ((byte)(v1 << 7 & 0x80 | v2 << 3 & 120))};
    }

    private static int c(ParsableBitArray parsableBitArray0) {
        int v = parsableBitArray0.h(5);
        return v == 0x1F ? parsableBitArray0.h(6) + 0x20 : v;
    }

    private static int d(ParsableBitArray parsableBitArray0) throws ParserException {
        int v = parsableBitArray0.h(4);
        if(v == 15) {
            if(parsableBitArray0.b() < 24) {
                throw ParserException.a("AAC header insufficient data", null);
            }
            return parsableBitArray0.h(24);
        }
        if(v >= 13) {
            throw ParserException.a("AAC header wrong Sampling Frequency Index", null);
        }
        return AacUtil.l[v];
    }

    public static Config e(ParsableBitArray parsableBitArray0, boolean z) throws ParserException {
        int v = AacUtil.c(parsableBitArray0);
        int v1 = AacUtil.d(parsableBitArray0);
        int v2 = parsableBitArray0.h(4);
        String s = "mp4a.40." + v;
        if(v == 5 || v == 29) {
            v1 = AacUtil.d(parsableBitArray0);
            v = AacUtil.c(parsableBitArray0);
            if(v == 22) {
                v2 = parsableBitArray0.h(4);
            }
        }
        if(z) {
            if(v != 1 && v != 2 && v != 3 && v != 4 && (v != 6 && v != 7 && v != 17) && (v != 19 && v != 20 && v != 21 && v != 22 && v != 23)) {
                throw ParserException.e(("Unsupported audio object type: " + v));
            }
            AacUtil.g(parsableBitArray0, v, v2);
            switch(v) {
                case 17: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: {
                    int v3 = parsableBitArray0.h(2);
                    if(v3 == 2 || v3 == 3) {
                        throw ParserException.e(("Unsupported epConfig: " + v3));
                    }
                }
            }
        }
        int v4 = AacUtil.n[v2];
        if(v4 == -1) {
            throw ParserException.a(null, null);
        }
        return new Config(v1, v4, s, null);
    }

    public static Config f(byte[] arr_b) throws ParserException {
        return AacUtil.e(new ParsableBitArray(arr_b), false);
    }

    private static void g(ParsableBitArray parsableBitArray0, int v, int v1) {
        if(parsableBitArray0.g()) {
            Log.n("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if(parsableBitArray0.g()) {
            parsableBitArray0.s(14);
        }
        boolean z = parsableBitArray0.g();
        if(v1 == 0) {
            throw new UnsupportedOperationException();
        }
        if(v == 6 || v == 20) {
            parsableBitArray0.s(3);
        }
        if(z) {
            if(v == 22) {
                parsableBitArray0.s(16);
            }
            if(v == 17 || (v == 19 || v == 20) || v == 23) {
                parsableBitArray0.s(3);
            }
            parsableBitArray0.s(1);
        }
    }

    class androidx.media3.extractor.AacUtil.1 {
    }

}

