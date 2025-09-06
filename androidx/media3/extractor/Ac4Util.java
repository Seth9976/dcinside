package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

@UnstableApi
public final class Ac4Util {
    public static final class SyncFrameInfo {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private SyncFrameInfo(int v, int v1, int v2, int v3, int v4) {
            this.a = v;
            this.c = v1;
            this.b = v2;
            this.d = v3;
            this.e = v4;
        }

        SyncFrameInfo(int v, int v1, int v2, int v3, int v4, androidx.media3.extractor.Ac4Util.1 ac4Util$10) {
            this(v, v1, v2, v3, v4);
        }
    }

    public static final int a = 0xAC40;
    public static final int b = 44097;
    public static final int c = 336000;
    private static final int d = 2;
    public static final int e = 7;
    public static final int f = 16;
    private static final int[] g;

    static {
        Ac4Util.g = new int[]{2002, 2000, 0x780, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 0x800};
    }

    public static void a(int v, ParsableByteArray parsableByteArray0) {
        parsableByteArray0.U(7);
        byte[] arr_b = parsableByteArray0.e();
        arr_b[0] = -84;
        arr_b[1] = 0x40;
        arr_b[2] = -1;
        arr_b[3] = -1;
        arr_b[4] = (byte)(v >> 16 & 0xFF);
        arr_b[5] = (byte)(v >> 8 & 0xFF);
        arr_b[6] = (byte)(v & 0xFF);
    }

    public static Format b(ParsableByteArray parsableByteArray0, String s, String s1, @Nullable DrmInitData drmInitData0) {
        parsableByteArray0.Z(1);
        return (parsableByteArray0.L() & 0x20) >> 5 == 1 ? new Builder().a0(s).o0("audio/ac4").N(2).p0(48000).U(drmInitData0).e0(s1).K() : new Builder().a0(s).o0("audio/ac4").N(2).p0(44100).U(drmInitData0).e0(s1).K();
    }

    public static int c(ByteBuffer byteBuffer0) {
        byte[] arr_b = new byte[16];
        byteBuffer0.get(arr_b);
        byteBuffer0.position(byteBuffer0.position());
        return Ac4Util.d(new ParsableBitArray(arr_b)).e;
    }

    public static SyncFrameInfo d(ParsableBitArray parsableBitArray0) {
        int v2;
        int v = parsableBitArray0.h(16);
        int v1 = parsableBitArray0.h(16);
        if(v1 == 0xFFFF) {
            v1 = parsableBitArray0.h(24);
            v2 = 7;
        }
        else {
            v2 = 4;
        }
        int v3 = v == 44097 ? v1 + v2 + 2 : v1 + v2;
        int v4 = parsableBitArray0.h(2);
        if(v4 == 3) {
            v4 = Ac4Util.f(parsableBitArray0, 2) + 3;
        }
        int v5 = parsableBitArray0.h(10);
        if(parsableBitArray0.g() && parsableBitArray0.h(3) > 0) {
            parsableBitArray0.s(2);
        }
        int v6 = parsableBitArray0.g() ? 48000 : 44100;
        int v7 = parsableBitArray0.h(4);
        if(v6 == 44100 && v7 == 13) {
            return new SyncFrameInfo(v4, 2, v6, v3, Ac4Util.g[13], null);
        }
        if(v6 == 48000) {
            int[] arr_v = Ac4Util.g;
            if(v7 < arr_v.length) {
                int v8 = arr_v[v7];
                if(v5 % 5 != 1) {
                    switch(v5 % 5) {
                        case 2: {
                            return v7 != 8 && v7 != 11 ? new SyncFrameInfo(v4, 2, 48000, v3, v8, null) : new SyncFrameInfo(v4, 2, 48000, v3, v8 + 1, null);
                        }
                        case 3: {
                            break;
                        }
                        case 4: {
                            return v7 != 3 && v7 != 8 && v7 != 11 ? new SyncFrameInfo(v4, 2, 48000, v3, v8, null) : new SyncFrameInfo(v4, 2, 48000, v3, v8 + 1, null);
                        }
                        default: {
                            return new SyncFrameInfo(v4, 2, 48000, v3, v8, null);
                        }
                    }
                }
                if(v7 == 3 || v7 == 8) {
                    ++v8;
                }
                return new SyncFrameInfo(v4, 2, 48000, v3, v8, null);
            }
        }
        return new SyncFrameInfo(v4, 2, v6, v3, 0, null);
    }

    public static int e(byte[] arr_b, int v) {
        int v1 = 7;
        if(arr_b.length < 7) {
            return -1;
        }
        int v2 = (arr_b[2] & 0xFF) << 8 | arr_b[3] & 0xFF;
        if(v2 == 0xFFFF) {
            v2 = (arr_b[4] & 0xFF) << 16 | (arr_b[5] & 0xFF) << 8 | arr_b[6] & 0xFF;
        }
        else {
            v1 = 4;
        }
        if(v == 44097) {
            v1 += 2;
        }
        return v2 + v1;
    }

    private static int f(ParsableBitArray parsableBitArray0, int v) {
        int v2;
        for(int v1 = 0; true; v1 = v2 + 1 << v) {
            v2 = v1 + parsableBitArray0.h(v);
            if(!parsableBitArray0.g()) {
                break;
            }
        }
        return v2;
    }

    class androidx.media3.extractor.Ac4Util.1 {
    }

}

