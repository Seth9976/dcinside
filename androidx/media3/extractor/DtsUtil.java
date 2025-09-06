package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

@UnstableApi
public final class DtsUtil {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface DtsAudioMimeType {
    }

    public static final class DtsHeader {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final long e;
        public final int f;

        private DtsHeader(String s, int v, int v1, int v2, long v3, int v4) {
            this.a = s;
            this.c = v;
            this.b = v1;
            this.d = v2;
            this.e = v3;
            this.f = v4;
        }

        DtsHeader(String s, int v, int v1, int v2, long v3, int v4, androidx.media3.extractor.DtsUtil.1 dtsUtil$10) {
            this(s, v, v1, v2, v3, v4);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface FrameType {
    }

    private static final byte A = 0x71;
    private static final byte B = -24;
    private static final int[] C = null;
    private static final int[] D = null;
    private static final int[] E = null;
    private static final int[] F = null;
    private static final int[] G = null;
    private static final int[] H = null;
    private static final int[] I = null;
    private static final int[] J = null;
    private static final int[] K = null;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 192000;
    public static final int g = 2250000;
    public static final int h = 768000;
    private static final int i = 0x7FFE8001;
    private static final int j = 0x1FFFE800;
    private static final int k = 0xFE7F0180;
    private static final int l = 0xFF1F00E8;
    private static final int m = 0x64582025;
    private static final int n = 0x25205864;
    private static final int o = 1078008818;
    private static final int p = 0xF21B4140;
    private static final int q = 1908687592;
    private static final int r = 0xE842C471;
    private static final byte s = 0x7F;
    private static final byte t = 0x1F;
    private static final byte u = -2;
    private static final byte v = -1;
    private static final byte w = 100;
    private static final byte x = 37;
    private static final byte y = 0x40;
    private static final byte z = -14;

    static {
        DtsUtil.C = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        DtsUtil.D = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        DtsUtil.E = new int[]{0x40, 0x70, 0x80, 0xC0, 0xE0, 0x100, 0x180, 0x1C0, 0x200, 640, 0x300, 0x380, 0x400, 0x480, 0x500, 0x600, 0x780, 0x800, 0x900, 0xA00, 0xA80, 0xB00, 0xB07, 0xB80, 0xC00, 0xF00, 0x1000, 0x1800, 0x1E00};
        DtsUtil.F = new int[]{8000, 16000, 32000, 0xFA00, 0x1F400, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
        DtsUtil.G = new int[]{5, 8, 10, 12};
        DtsUtil.H = new int[]{6, 9, 12, 15};
        DtsUtil.I = new int[]{2, 4, 6, 8};
        DtsUtil.J = new int[]{9, 11, 13, 16};
        DtsUtil.K = new int[]{5, 8, 10, 12};
    }

    private static void a(byte[] arr_b, int v) throws ParserException {
        if((arr_b[v - 1] & 0xFF | arr_b[v - 2] << 8 & 0xFFFF) != Util.C(arr_b, 0, v - 2, 0xFFFF)) {
            throw ParserException.a("CRC check failed", null);
        }
    }

    public static int b(byte[] arr_b) {
        switch(arr_b[0]) {
            case -2: {
                return ((arr_b[6] & 0xF0) >> 4 | ((arr_b[4] & 3) << 12 | (arr_b[7] & 0xFF) << 4)) + 1;
            }
            case -1: {
                return (((arr_b[9] & 60) >> 2 | ((arr_b[7] & 3) << 12 | (arr_b[6] & 0xFF) << 4)) + 1) * 16 / 14;
            }
            case 0x1F: {
                return (((arr_b[8] & 60) >> 2 | ((arr_b[6] & 3) << 12 | (arr_b[7] & 0xFF) << 4)) + 1) * 16 / 14;
            }
            default: {
                return ((arr_b[7] & 0xF0) >> 4 | ((arr_b[5] & 3) << 12 | (arr_b[6] & 0xFF) << 4)) + 1;
            }
        }
    }

    public static int c(int v) {
        switch(v) {
            case 0xF21B4140: 
            case 1078008818: {
                return 3;
            }
            case 0x25205864: 
            case 0x64582025: {
                return 2;
            }
            case 0xE842C471: 
            case 1908687592: {
                return 4;
            }
            case 0xFE7F0180: 
            case 0xFF1F00E8: 
            case 0x1FFFE800: 
            case 0x7FFE8001: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }

    private static ParsableBitArray d(byte[] arr_b) {
        switch(arr_b[0]) {
            case 0x40: 
            case 100: 
            case 0x71: 
            case 0x7F: {
                return new ParsableBitArray(arr_b);
            }
            default: {
                byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
                if(DtsUtil.e(arr_b1)) {
                    for(int v = 0; v < arr_b1.length - 1; v += 2) {
                        byte b = arr_b1[v];
                        arr_b1[v] = arr_b1[v + 1];
                        arr_b1[v + 1] = b;
                    }
                }
                ParsableBitArray parsableBitArray0 = new ParsableBitArray(arr_b1);
                if(arr_b1[0] == 0x1F) {
                    ParsableBitArray parsableBitArray1 = new ParsableBitArray(arr_b1);
                    while(parsableBitArray1.b() >= 16) {
                        parsableBitArray1.s(2);
                        parsableBitArray0.f(parsableBitArray1.h(14), 14);
                    }
                }
                parsableBitArray0.o(arr_b1);
                return parsableBitArray0;
            }
        }
    }

    private static boolean e(byte[] arr_b) {
        switch(arr_b[0]) {
            case -24: 
            case -14: 
            case -2: 
            case -1: 
            case 37: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static int f(ByteBuffer byteBuffer0) {
        int v1;
        switch(byteBuffer0.getInt(0)) {
            case 0xE842C471: 
            case 0xF21B4140: {
                return 0x400;
            }
            case 0x25205864: {
                return 0x1000;
            }
            default: {
                int v = byteBuffer0.position();
                switch(byteBuffer0.get(v)) {
                    case -2: {
                        v1 = (byteBuffer0.get(v + 5) & 1) << 6;
                        return (((byteBuffer0.get(v + 4) & 0xFC) >> 2 | v1) + 1) * 0x20;
                    }
                    case -1: {
                        v1 = (byteBuffer0.get(v + 4) & 7) << 4;
                        return (((byteBuffer0.get(v + 7) & 60) >> 2 | v1) + 1) * 0x20;
                    }
                    case 0x1F: {
                        v1 = (byteBuffer0.get(v + 5) & 7) << 4;
                        return (((byteBuffer0.get(v + 6) & 60) >> 2 | v1) + 1) * 0x20;
                    }
                    default: {
                        v1 = (byteBuffer0.get(v + 4) & 1) << 6;
                        return (((byteBuffer0.get(v + 5) & 0xFC) >> 2 | v1) + 1) * 0x20;
                    }
                }
            }
        }
    }

    public static int g(byte[] arr_b) {
        switch(arr_b[0]) {
            case -2: {
                return (((arr_b[4] & 0xFC) >> 2 | (arr_b[5] & 1) << 6) + 1) * 0x20;
            }
            case -1: {
                return (((arr_b[7] & 60) >> 2 | (arr_b[4] & 7) << 4) + 1) * 0x20;
            }
            case 0x1F: {
                return (((arr_b[6] & 60) >> 2 | (arr_b[5] & 7) << 4) + 1) * 0x20;
            }
            default: {
                return (((arr_b[5] & 0xFC) >> 2 | (arr_b[4] & 1) << 6) + 1) * 0x20;
            }
        }
    }

    public static Format h(byte[] arr_b, @Nullable String s, @Nullable String s1, int v, @Nullable DrmInitData drmInitData0) {
        ParsableBitArray parsableBitArray0 = DtsUtil.d(arr_b);
        parsableBitArray0.s(60);
        int v1 = DtsUtil.C[parsableBitArray0.h(6)];
        int v2 = DtsUtil.D[parsableBitArray0.h(4)];
        int v3 = parsableBitArray0.h(5);
        int v4 = v3 < DtsUtil.E.length ? DtsUtil.E[v3] * 1000 / 2 : -1;
        parsableBitArray0.s(10);
        return parsableBitArray0.h(2) <= 0 ? new Builder().a0(s).o0("audio/vnd.dts").M(v4).N(v1).p0(v2).U(drmInitData0).e0(s1).m0(v).K() : new Builder().a0(s).o0("audio/vnd.dts").M(v4).N(v1 + 1).p0(v2).U(drmInitData0).e0(s1).m0(v).K();
    }

    public static DtsHeader i(byte[] arr_b) throws ParserException {
        int v13;
        int v12;
        int v5;
        int v2;
        int v1;
        ParsableBitArray parsableBitArray0 = DtsUtil.d(arr_b);
        parsableBitArray0.s(40);
        int v = parsableBitArray0.h(2);
        if(parsableBitArray0.g()) {
            v1 = 20;
            v2 = 12;
        }
        else {
            v1 = 16;
            v2 = 8;
        }
        parsableBitArray0.s(v2);
        int v3 = parsableBitArray0.h(v1);
        boolean z = parsableBitArray0.g();
        int v4 = 0;
        if(z) {
            v5 = parsableBitArray0.h(2);
            int v6 = parsableBitArray0.h(3);
            if(parsableBitArray0.g()) {
                parsableBitArray0.s(36);
            }
            if(parsableBitArray0.h(3) + 1 != 1 || parsableBitArray0.h(3) + 1 != 1) {
                throw ParserException.e("Multiple audio presentations or assets not supported");
            }
            int v7 = parsableBitArray0.h(v + 1);
            for(int v8 = 0; v8 < v + 1; ++v8) {
                if((v7 >> v8 & 1) == 1) {
                    parsableBitArray0.s(8);
                }
            }
            if(parsableBitArray0.g()) {
                parsableBitArray0.s(2);
                int v9 = parsableBitArray0.h(2);
                int v10 = parsableBitArray0.h(2);
                while(v4 < v10 + 1) {
                    parsableBitArray0.s(v9 + 1 << 2);
                    ++v4;
                }
            }
            v4 = (v6 + 1) * 0x200;
        }
        else {
            v5 = -1;
        }
        parsableBitArray0.s(v1);
        parsableBitArray0.s(12);
        if(z) {
            if(parsableBitArray0.g()) {
                parsableBitArray0.s(4);
            }
            if(parsableBitArray0.g()) {
                parsableBitArray0.s(24);
            }
            if(parsableBitArray0.g()) {
                parsableBitArray0.t(parsableBitArray0.h(10) + 1);
            }
            parsableBitArray0.s(5);
            int v11 = DtsUtil.F[parsableBitArray0.h(4)];
            v12 = parsableBitArray0.h(8) + 1;
            v13 = v11;
        }
        else {
            v12 = -1;
            v13 = 0x80000001;
        }
        if(z) {
            switch(v5) {
                case 0: {
                    return new DtsHeader("audio/vnd.dts.hd;profile=lbr", v12, v13, v3 + 1, Util.Z1(v4, 1000000L, 32000L), 0, null);
                }
                case 1: {
                    return new DtsHeader("audio/vnd.dts.hd;profile=lbr", v12, v13, v3 + 1, Util.Z1(v4, 1000000L, 44100L), 0, null);
                }
                case 2: {
                    return new DtsHeader("audio/vnd.dts.hd;profile=lbr", v12, v13, v3 + 1, Util.Z1(v4, 1000000L, 48000L), 0, null);
                }
                default: {
                    throw ParserException.a(("Unsupported reference clock code in DTS HD header: " + v5), null);
                }
            }
        }
        return new DtsHeader("audio/vnd.dts.hd;profile=lbr", v12, v13, v3 + 1, 0x8000000000000001L, 0, null);
    }

    public static int j(byte[] arr_b) {
        ParsableBitArray parsableBitArray0 = DtsUtil.d(arr_b);
        parsableBitArray0.s(42);
        return parsableBitArray0.g() ? parsableBitArray0.h(12) + 1 : parsableBitArray0.h(8) + 1;
    }

    public static DtsHeader k(byte[] arr_b, AtomicInteger atomicInteger0) throws ParserException {
        long v9;
        int v8;
        int v7;
        int v4;
        ParsableBitArray parsableBitArray0 = DtsUtil.d(arr_b);
        int v = 0;
        int v1 = parsableBitArray0.h(0x20) == 1078008818 ? 1 : 0;
        int v2 = DtsUtil.m(parsableBitArray0, DtsUtil.G, true);
        if(v1 == 0) {
            v9 = 0x8000000000000001L;
            v8 = 0x80000001;
        }
        else {
            if(!parsableBitArray0.g()) {
                throw ParserException.e("Only supports full channel mask-based audio presentation");
            }
            DtsUtil.a(arr_b, v2 + 1);
            int v3 = parsableBitArray0.h(2);
            switch(v3) {
                case 0: {
                    v4 = 0x200;
                    break;
                }
                case 1: {
                    v4 = 480;
                    break;
                }
                case 2: {
                    v4 = 0x180;
                    break;
                }
                default: {
                    throw ParserException.a(("Unsupported base duration index in DTS UHD header: " + v3), null);
                }
            }
            int v5 = parsableBitArray0.h(3);
            int v6 = parsableBitArray0.h(2);
            switch(v6) {
                case 0: {
                    v7 = 32000;
                    break;
                }
                case 1: {
                    v7 = 44100;
                    break;
                }
                case 2: {
                    v7 = 48000;
                    break;
                }
                default: {
                    throw ParserException.a(("Unsupported clock rate index in DTS UHD header: " + v6), null);
                }
            }
            if(parsableBitArray0.g()) {
                parsableBitArray0.s(36);
            }
            v8 = (1 << parsableBitArray0.h(2)) * v7;
            v9 = Util.Z1(v4 * (v5 + 1), 1000000L, v7);
        }
        int v11 = 0;
        for(int v10 = 0; v10 < v1; ++v10) {
            v11 += DtsUtil.m(parsableBitArray0, DtsUtil.H, true);
        }
        if(v1 != 0) {
            atomicInteger0.set(DtsUtil.m(parsableBitArray0, DtsUtil.I, true));
        }
        if(atomicInteger0.get() != 0) {
            v = DtsUtil.m(parsableBitArray0, DtsUtil.J, true);
        }
        return new DtsHeader("audio/vnd.dts.uhd;profile=p2", 2, v8, v2 + 1 + (v11 + v), v9, 0, null);
    }

    public static int l(byte[] arr_b) {
        ParsableBitArray parsableBitArray0 = DtsUtil.d(arr_b);
        parsableBitArray0.s(0x20);
        return DtsUtil.m(parsableBitArray0, DtsUtil.K, true) + 1;
    }

    private static int m(ParsableBitArray parsableBitArray0, int[] arr_v, boolean z) {
        int v = 0;
        int v2 = 0;
        for(int v1 = 0; v1 < 3 && parsableBitArray0.g(); ++v1) {
            ++v2;
        }
        if(z) {
            int v3 = 0;
            while(v < v2) {
                v3 += 1 << arr_v[v];
                ++v;
            }
            v = v3;
        }
        return v + parsableBitArray0.h(arr_v[v2]);
    }

    class androidx.media3.extractor.DtsUtil.1 {
    }

}

