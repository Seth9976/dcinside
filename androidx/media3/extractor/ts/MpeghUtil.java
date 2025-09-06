package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import com.google.common.math.f;
import com.google.common.math.h;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

final class MpeghUtil {
    public static class MhasPacketHeader {
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @Target({ElementType.TYPE_USE})
        public @interface Type {
        }

        public int a;
        public long b;
        public int c;
        public static final int d = 0;
        public static final int e = 1;
        public static final int f = 2;
        public static final int g = 3;
        public static final int h = 6;
        public static final int i = 7;
        public static final int j = 8;
        public static final int k = 9;
        public static final int l = 10;
        public static final int m = 11;
        public static final int n = 12;
        public static final int o = 13;
        public static final int p = 14;
        public static final int q = 15;
        public static final int r = 16;
        public static final int s = 17;
        public static final int t = 18;
        public static final int u = 19;
        public static final int v = 20;
        public static final int w = 21;
        public static final int x = 22;

    }

    public static class Mpegh3daConfig {
        public final int a;
        public final int b;
        public final int c;
        @Nullable
        public final byte[] d;

        private Mpegh3daConfig(int v, int v1, int v2, @Nullable byte[] arr_b) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = arr_b;
        }

        Mpegh3daConfig(int v, int v1, int v2, byte[] arr_b, androidx.media3.extractor.ts.MpeghUtil.1 mpeghUtil$10) {
            this(v, v1, v2, arr_b);
        }
    }

    private static final int a = 0xC001A5;

    private static int a(int v) throws ParserException {
        switch(v) {
            case 0: {
                return 0x300;
            }
            case 1: {
                return 0x400;
            }
            case 2: 
            case 3: {
                return 0x800;
            }
            case 4: {
                return 0x1000;
            }
            default: {
                throw ParserException.e(("Unsupported coreSbrFrameLengthIndex " + v));
            }
        }
    }

    private static double b(int v) throws ParserException {
        switch(v) {
            case 14700: 
            case 16000: {
                return 3.0;
            }
            case 22050: 
            case 24000: {
                return 2.0;
            }
            case 29400: 
            case 32000: 
            case 58800: 
            case 0xFA00: {
                return 1.5;
            }
            case 44100: 
            case 48000: 
            case 88200: 
            case 96000: {
                return 1.0;
            }
            default: {
                throw ParserException.e(("Unsupported sampling rate " + v));
            }
        }
    }

    private static int c(int v) throws ParserException {
        switch(v) {
            case 0: {
                return 96000;
            }
            case 1: {
                return 88200;
            }
            case 2: {
                return 0xFA00;
            }
            case 3: {
                return 48000;
            }
            case 4: {
                return 44100;
            }
            case 5: {
                return 32000;
            }
            case 6: {
                return 24000;
            }
            case 7: {
                return 22050;
            }
            case 8: {
                return 16000;
            }
            case 9: {
                return 12000;
            }
            case 10: {
                return 11025;
            }
            case 11: {
                return 8000;
            }
            case 12: {
                return 7350;
            }
            case 15: {
                return 0xE100;
            }
            case 16: {
                return 0xC800;
            }
            case 17: {
                return 40000;
            }
            case 18: {
                return 0x9600;
            }
            case 19: {
                return 34150;
            }
            case 20: {
                return 0x7080;
            }
            case 21: {
                return 0x6400;
            }
            case 22: {
                return 20000;
            }
            case 23: {
                return 0x4B00;
            }
            case 24: {
                return 17075;
            }
            case 25: {
                return 14400;
            }
            case 26: {
                return 0x3200;
            }
            case 27: {
                return 9600;
            }
            default: {
                throw ParserException.e(("Unsupported sampling rate index " + v));
            }
        }
    }

    private static int d(int v) throws ParserException {
        int v1 = 2;
        if(v != 0) {
            switch(v) {
                case 1: {
                    break;
                }
                case 2: {
                    return v1;
                }
                default: {
                    v1 = 3;
                    switch(v) {
                        case 3: {
                            return v1;
                        }
                        case 4: {
                            return 1;
                        }
                        default: {
                            throw ParserException.e(("Unsupported coreSbrFrameLengthIndex " + v));
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static boolean e(int v) {
        return (v & 0xFFFFFF) == 0xC001A5;
    }

    public static int f(ParsableBitArray parsableBitArray0) {
        if(parsableBitArray0.g()) {
            parsableBitArray0.s(2);
            return parsableBitArray0.h(13);
        }
        return 0;
    }

    public static boolean g(ParsableBitArray parsableBitArray0, MhasPacketHeader mpeghUtil$MhasPacketHeader0) throws ParserException {
        parsableBitArray0.d();
        int v = MpeghUtil.k(parsableBitArray0, 3, 8, 8);
        mpeghUtil$MhasPacketHeader0.a = v;
        if(v == -1) {
            return false;
        }
        long v1 = MpeghUtil.l(parsableBitArray0, 2, 8, 0x20);
        mpeghUtil$MhasPacketHeader0.b = v1;
        if(v1 == -1L) {
            return false;
        }
        if(v1 > 16L) {
            throw ParserException.e(("Contains sub-stream with an invalid packet label " + mpeghUtil$MhasPacketHeader0.b));
        }
        if(v1 == 0L) {
            int v2 = mpeghUtil$MhasPacketHeader0.a;
            switch(v2) {
                case 1: {
                    throw ParserException.a("Mpegh3daConfig packet with invalid packet label 0", null);
                }
                case 2: {
                    throw ParserException.a("Mpegh3daFrame packet with invalid packet label 0", null);
                label_16:
                    if(v2 == 17) {
                        throw ParserException.a("AudioTruncation packet with invalid packet label 0", null);
                    }
                    break;
                }
                default: {
                    goto label_16;
                }
            }
        }
        int v3 = MpeghUtil.k(parsableBitArray0, 11, 24, 24);
        mpeghUtil$MhasPacketHeader0.c = v3;
        return v3 != -1;
    }

    public static Mpegh3daConfig h(ParsableBitArray parsableBitArray0) throws ParserException {
        int v = parsableBitArray0.h(8);
        int v1 = parsableBitArray0.h(5);
        int v2 = v1 == 0x1F ? parsableBitArray0.h(24) : MpeghUtil.c(v1);
        int v3 = parsableBitArray0.h(3);
        int v4 = MpeghUtil.a(v3);
        int v5 = MpeghUtil.d(v3);
        parsableBitArray0.s(2);
        MpeghUtil.p(parsableBitArray0);
        MpeghUtil.m(parsableBitArray0, MpeghUtil.j(parsableBitArray0), v5);
        byte[] arr_b = null;
        if(parsableBitArray0.g()) {
            int v6 = MpeghUtil.k(parsableBitArray0, 2, 4, 8);
            for(int v7 = 0; v7 < v6 + 1; ++v7) {
                int v8 = MpeghUtil.k(parsableBitArray0, 4, 8, 16);
                int v9 = MpeghUtil.k(parsableBitArray0, 4, 8, 16);
                if(v8 == 7) {
                    int v10 = parsableBitArray0.h(4);
                    parsableBitArray0.s(4);
                    byte[] arr_b1 = new byte[v10 + 1];
                    for(int v11 = 0; v11 < v10 + 1; ++v11) {
                        arr_b1[v11] = (byte)parsableBitArray0.h(8);
                    }
                    arr_b = arr_b1;
                }
                else {
                    parsableBitArray0.s(v9 * 8);
                }
            }
        }
        double f = MpeghUtil.b(v2);
        return new Mpegh3daConfig(v, ((int)(((double)v2) * f)), ((int)(((double)v4) * f)), arr_b, null);
    }

    private static boolean i(ParsableBitArray parsableBitArray0) {
        parsableBitArray0.s(3);
        boolean z = parsableBitArray0.g();
        if(z) {
            parsableBitArray0.s(13);
        }
        return z;
    }

    private static int j(ParsableBitArray parsableBitArray0) {
        int v = parsableBitArray0.h(5);
        int v2 = 0;
        for(int v1 = 0; v1 < v + 1; ++v1) {
            int v3 = parsableBitArray0.h(3);
            v2 += MpeghUtil.k(parsableBitArray0, 5, 8, 16) + 1;
            if((v3 == 0 || v3 == 2) && parsableBitArray0.g()) {
                MpeghUtil.p(parsableBitArray0);
            }
        }
        return v2;
    }

    private static int k(ParsableBitArray parsableBitArray0, int v, int v1, int v2) {
        Assertions.a(Math.max(Math.max(v, v1), v2) <= 0x1F);
        int v3 = (1 << v) - 1;
        int v4 = (1 << v1) - 1;
        f.c(f.c(v3, v4), 1 << v2);
        if(parsableBitArray0.b() < v) {
            return -1;
        }
        int v5 = parsableBitArray0.h(v);
        if(v5 == v3) {
            if(parsableBitArray0.b() < v1) {
                return -1;
            }
            int v6 = parsableBitArray0.h(v1);
            v5 += v6;
            if(v6 == v4) {
                return parsableBitArray0.b() >= v2 ? v5 + parsableBitArray0.h(v2) : -1;
            }
        }
        return v5;
    }

    private static long l(ParsableBitArray parsableBitArray0, int v, int v1, int v2) {
        Assertions.a(Math.max(Math.max(v, v1), v2) <= 0x3F);
        long v3 = (1L << v) - 1L;
        long v4 = (1L << v1) - 1L;
        h.c(h.c(v3, v4), 1L << v2);
        if(parsableBitArray0.b() < v) {
            return -1L;
        }
        long v5 = parsableBitArray0.j(v);
        if(v5 == v3) {
            if(parsableBitArray0.b() < v1) {
                return -1L;
            }
            long v6 = parsableBitArray0.j(v1);
            v5 += v6;
            if(v6 == v4) {
                return parsableBitArray0.b() >= v2 ? v5 + parsableBitArray0.j(v2) : -1L;
            }
        }
        return v5;
    }

    private static void m(ParsableBitArray parsableBitArray0, int v, int v1) {
        int v5;
        int v2 = MpeghUtil.k(parsableBitArray0, 4, 8, 16);
        parsableBitArray0.r();
        for(int v3 = 0; v3 < v2 + 1; ++v3) {
            int v4 = parsableBitArray0.h(2);
            if(v4 == 0) {
                MpeghUtil.i(parsableBitArray0);
                if(v1 > 0) {
                    MpeghUtil.o(parsableBitArray0);
                }
            }
            else {
                switch(v4) {
                    case 1: {
                        if(MpeghUtil.i(parsableBitArray0)) {
                            parsableBitArray0.r();
                        }
                        if(v1 > 0) {
                            MpeghUtil.o(parsableBitArray0);
                            v5 = parsableBitArray0.h(2);
                        }
                        else {
                            v5 = 0;
                        }
                        if(v5 > 0) {
                            parsableBitArray0.s(6);
                            int v6 = parsableBitArray0.h(2);
                            parsableBitArray0.s(4);
                            if(parsableBitArray0.g()) {
                                parsableBitArray0.s(5);
                            }
                            if(v5 == 2 || v5 == 3) {
                                parsableBitArray0.s(6);
                            }
                            if(v6 == 2) {
                                parsableBitArray0.r();
                            }
                        }
                        int v7 = ((int)Math.floor(Math.log(v - 1) / 0.693147)) + 1;
                        int v8 = parsableBitArray0.h(2);
                        if(v8 > 0 && parsableBitArray0.g()) {
                            parsableBitArray0.s(v7);
                        }
                        if(parsableBitArray0.g()) {
                            parsableBitArray0.s(v7);
                        }
                        if(v1 == 0 && v8 == 0) {
                            parsableBitArray0.r();
                        }
                        break;
                    }
                    case 3: {
                        MpeghUtil.k(parsableBitArray0, 4, 8, 16);
                        int v9 = MpeghUtil.k(parsableBitArray0, 4, 8, 16);
                        if(parsableBitArray0.g()) {
                            MpeghUtil.k(parsableBitArray0, 8, 16, 0);
                        }
                        parsableBitArray0.r();
                        if(v9 > 0) {
                            parsableBitArray0.s(v9 * 8);
                        }
                    }
                }
            }
        }
    }

    private static void n(ParsableBitArray parsableBitArray0, int v) {
        int v2;
        boolean z = parsableBitArray0.g();
        for(int v1 = 0; v1 < v; ++v1) {
            if(parsableBitArray0.g()) {
                parsableBitArray0.s(7);
                v2 = 0;
            }
            else {
                if(parsableBitArray0.h(2) == 3 && parsableBitArray0.h((z ? 7 : 5)) * (z ? 1 : 5) != 0) {
                    parsableBitArray0.r();
                }
                v2 = parsableBitArray0.h((z ? 8 : 6)) * (z ? 1 : 5);
                if(v2 != 0 && v2 != 180) {
                    parsableBitArray0.r();
                }
                parsableBitArray0.r();
            }
            if(v2 != 0 && v2 != 180 && parsableBitArray0.g()) {
                ++v1;
            }
        }
    }

    private static void o(ParsableBitArray parsableBitArray0) {
        parsableBitArray0.s(3);
        parsableBitArray0.s(8);
        boolean z = parsableBitArray0.g();
        boolean z1 = parsableBitArray0.g();
        if(z) {
            parsableBitArray0.s(5);
        }
        if(z1) {
            parsableBitArray0.s(6);
        }
    }

    private static void p(ParsableBitArray parsableBitArray0) {
        int v = parsableBitArray0.h(2);
        if(v == 0) {
            parsableBitArray0.s(6);
            return;
        }
        int v1 = MpeghUtil.k(parsableBitArray0, 5, 8, 16);
        if(v == 1) {
            parsableBitArray0.s((v1 + 1) * 7);
            return;
        }
        if(v == 2) {
            MpeghUtil.n(parsableBitArray0, v1 + 1);
        }
    }

    class androidx.media3.extractor.ts.MpeghUtil.1 {
    }

}

