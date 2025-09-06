package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

@UnstableApi
public final class Ac3Util {
    public static final class SyncFrameInfo {
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @Target({ElementType.TYPE_USE})
        public @interface StreamType {
        }

        @Nullable
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public static final int h = -1;
        public static final int i = 0;
        public static final int j = 1;
        public static final int k = 2;

        private SyncFrameInfo(@Nullable String s, int v, int v1, int v2, int v3, int v4, int v5) {
            this.a = s;
            this.b = v;
            this.d = v1;
            this.c = v2;
            this.e = v3;
            this.f = v4;
            this.g = v5;
        }

        SyncFrameInfo(String s, int v, int v1, int v2, int v3, int v4, int v5, androidx.media3.extractor.Ac3Util.1 ac3Util$10) {
            this(s, v, v1, v2, v3, v4, v5);
        }
    }

    public static final int a = 80000;
    public static final int b = 768000;
    public static final int c = 3062500;
    public static final int d = 16;
    public static final int e = 10;
    private static final int f = 0x100;
    private static final int g = 0x600;
    private static final int[] h;
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;
    private static final int[] l;
    private static final int[] m;

    static {
        Ac3Util.h = new int[]{1, 2, 3, 6};
        Ac3Util.i = new int[]{48000, 44100, 32000};
        Ac3Util.j = new int[]{24000, 22050, 16000};
        Ac3Util.k = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        Ac3Util.l = new int[]{0x20, 40, 0x30, 56, 0x40, 80, 0x60, 0x70, 0x80, 0xA0, 0xC0, 0xE0, 0x100, 320, 0x180, 0x1C0, 0x200, 0x240, 640};
        Ac3Util.m = new int[]{69, 87, 104, 0x79, 0x8B, 0xAE, 0xD0, 0xF3, 278, 348, 417, 487, 557, 696, 835, 0x3CF, 0x45A, 0x4E5, 0x571};
    }

    private static int a(int v, int v1, int v2) [...] // Inlined contents

    public static int b(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.position();
        int v1 = byteBuffer0.limit();
        for(int v2 = v; v2 <= v1 - 10; ++v2) {
            if((Util.d0(byteBuffer0, v2 + 4) & -2) == 0xF8726FBA) {
                return v2 - v;
            }
        }
        return -1;
    }

    private static int c(int v, int v1) {
        if(v >= 0) {
            int[] arr_v = Ac3Util.i;
            if(v < arr_v.length && v1 >= 0) {
                int[] arr_v1 = Ac3Util.m;
                if(v1 / 2 < arr_v1.length) {
                    int v2 = arr_v[v];
                    if(v2 == 44100) {
                        return (arr_v1[v1 / 2] + v1 % 2) * 2;
                    }
                    int v3 = Ac3Util.l[v1 / 2];
                    return v2 == 32000 ? v3 * 6 : v3 * 4;
                }
            }
        }
        return -1;
    }

    public static Format d(ParsableByteArray parsableByteArray0, String s, String s1, @Nullable DrmInitData drmInitData0) {
        ParsableBitArray parsableBitArray0 = new ParsableBitArray();
        parsableBitArray0.n(parsableByteArray0);
        int v = Ac3Util.i[parsableBitArray0.h(2)];
        parsableBitArray0.s(8);
        int v1 = Ac3Util.k[parsableBitArray0.h(3)];
        if(parsableBitArray0.h(1) != 0) {
            ++v1;
        }
        int v2 = Ac3Util.l[parsableBitArray0.h(5)] * 1000;
        parsableBitArray0.c();
        parsableByteArray0.Y(parsableBitArray0.d());
        return new Builder().a0(s).o0("audio/ac3").N(v1).p0(v).U(drmInitData0).e0(s1).M(v2).j0(v2).K();
    }

    public static int e(ByteBuffer byteBuffer0) {
        int v = 3;
        if((byteBuffer0.get(byteBuffer0.position() + 5) & 0xF8) >> 3 > 10) {
            if((byteBuffer0.get(byteBuffer0.position() + 4) & 0xC0) >> 6 != 3) {
                v = (byteBuffer0.get(byteBuffer0.position() + 4) & 0x30) >> 4;
            }
            return Ac3Util.h[v] * 0x100;
        }
        return 0x600;
    }

    public static SyncFrameInfo f(ParsableBitArray parsableBitArray0) {
        int v5;
        int v4;
        int v3;
        parsableBitArray0.s(40);
        boolean z = parsableBitArray0.h(5) > 10;
        parsableBitArray0.q(parsableBitArray0.e());
        int v = -1;
        if(z) {
            parsableBitArray0.s(16);
            switch(parsableBitArray0.h(2)) {
                case 0: {
                    v = 0;
                    break;
                }
                case 1: {
                    v = 1;
                    break;
                }
                case 2: {
                    v = 2;
                }
            }
            parsableBitArray0.s(3);
            int v1 = (parsableBitArray0.h(11) + 1) * 2;
            int v2 = parsableBitArray0.h(2);
            if(v2 == 3) {
                v3 = Ac3Util.j[parsableBitArray0.h(2)];
                v4 = 3;
                v5 = 6;
            }
            else {
                int v6 = parsableBitArray0.h(2);
                int v7 = Ac3Util.h[v6];
                v4 = v6;
                v3 = Ac3Util.i[v2];
                v5 = v7;
            }
            int v8 = parsableBitArray0.h(3);
            int v9 = parsableBitArray0.g();
            int v10 = Ac3Util.k[v8] + v9;
            parsableBitArray0.s(10);
            if(parsableBitArray0.g()) {
                parsableBitArray0.s(8);
            }
            if(v8 == 0) {
                parsableBitArray0.s(5);
                if(parsableBitArray0.g()) {
                    parsableBitArray0.s(8);
                }
            }
            if(v == 1 && parsableBitArray0.g()) {
                parsableBitArray0.s(16);
            }
            if(parsableBitArray0.g()) {
                if(v8 > 2) {
                    parsableBitArray0.s(2);
                }
                if((v8 & 1) != 0 && v8 > 2) {
                    parsableBitArray0.s(6);
                }
                if((v8 & 4) != 0) {
                    parsableBitArray0.s(6);
                }
                if(v9 != 0 && parsableBitArray0.g()) {
                    parsableBitArray0.s(5);
                }
                if(v == 0) {
                    if(parsableBitArray0.g()) {
                        parsableBitArray0.s(6);
                    }
                    if(v8 == 0 && parsableBitArray0.g()) {
                        parsableBitArray0.s(6);
                    }
                    if(parsableBitArray0.g()) {
                        parsableBitArray0.s(6);
                    }
                    int v11 = parsableBitArray0.h(2);
                    if(v11 == 1) {
                        parsableBitArray0.s(5);
                    }
                    else if(v11 == 2) {
                        parsableBitArray0.s(12);
                    }
                    else if(v11 == 3) {
                        int v12 = parsableBitArray0.h(5);
                        if(parsableBitArray0.g()) {
                            parsableBitArray0.s(5);
                            if(parsableBitArray0.g()) {
                                parsableBitArray0.s(4);
                            }
                            if(parsableBitArray0.g()) {
                                parsableBitArray0.s(4);
                            }
                            if(parsableBitArray0.g()) {
                                parsableBitArray0.s(4);
                            }
                            if(parsableBitArray0.g()) {
                                parsableBitArray0.s(4);
                            }
                            if(parsableBitArray0.g()) {
                                parsableBitArray0.s(4);
                            }
                            if(parsableBitArray0.g()) {
                                parsableBitArray0.s(4);
                            }
                            if(parsableBitArray0.g()) {
                                parsableBitArray0.s(4);
                            }
                            if(parsableBitArray0.g()) {
                                if(parsableBitArray0.g()) {
                                    parsableBitArray0.s(4);
                                }
                                if(parsableBitArray0.g()) {
                                    parsableBitArray0.s(4);
                                }
                            }
                        }
                        if(parsableBitArray0.g()) {
                            parsableBitArray0.s(5);
                            if(parsableBitArray0.g()) {
                                parsableBitArray0.s(7);
                                if(parsableBitArray0.g()) {
                                    parsableBitArray0.s(8);
                                }
                            }
                        }
                        parsableBitArray0.s((v12 + 2) * 8);
                        parsableBitArray0.c();
                    }
                    if(v8 < 2) {
                        if(parsableBitArray0.g()) {
                            parsableBitArray0.s(14);
                        }
                        if(v8 == 0 && parsableBitArray0.g()) {
                            parsableBitArray0.s(14);
                        }
                    }
                    if(parsableBitArray0.g()) {
                        if(v4 == 0) {
                            parsableBitArray0.s(5);
                        }
                        else {
                            for(int v13 = 0; v13 < v5; ++v13) {
                                if(parsableBitArray0.g()) {
                                    parsableBitArray0.s(5);
                                }
                            }
                        }
                    }
                }
            }
            if(parsableBitArray0.g()) {
                parsableBitArray0.s(5);
                if(v8 == 2) {
                    parsableBitArray0.s(4);
                }
                if(v8 >= 6) {
                    parsableBitArray0.s(2);
                }
                if(parsableBitArray0.g()) {
                    parsableBitArray0.s(8);
                }
                if(v8 == 0 && parsableBitArray0.g()) {
                    parsableBitArray0.s(8);
                }
                if(v2 < 3) {
                    parsableBitArray0.r();
                }
            }
            if(v == 0 && v4 != 3) {
                parsableBitArray0.r();
            }
            if(v == 2 && (v4 == 3 || parsableBitArray0.g())) {
                parsableBitArray0.s(6);
            }
            return !parsableBitArray0.g() || parsableBitArray0.h(6) != 1 || parsableBitArray0.h(8) != 1 ? new SyncFrameInfo("audio/eac3", v, v10, v3, v1, v5 * 0x100, v1 * v3 / (v5 * 0x20), null) : new SyncFrameInfo("audio/eac3-joc", v, v10, v3, v1, v5 * 0x100, v1 * v3 / (v5 * 0x20), null);
        }
        parsableBitArray0.s(0x20);
        int v14 = parsableBitArray0.h(2);
        int v15 = parsableBitArray0.h(6);
        int v16 = Ac3Util.l[v15 / 2] * 1000;
        int v17 = Ac3Util.c(v14, v15);
        parsableBitArray0.s(8);
        int v18 = parsableBitArray0.h(3);
        if((v18 & 1) != 0 && v18 != 1) {
            parsableBitArray0.s(2);
        }
        if((v18 & 4) != 0) {
            parsableBitArray0.s(2);
        }
        if(v18 == 2) {
            parsableBitArray0.s(2);
        }
        int v19 = v14 >= Ac3Util.i.length ? -1 : Ac3Util.i[v14];
        int v20 = parsableBitArray0.g();
        return new SyncFrameInfo((v14 == 3 ? null : "audio/ac3"), -1, Ac3Util.k[v18] + v20, v19, v17, 0x600, v16, null);
    }

    public static int g(byte[] arr_b) {
        if(arr_b.length < 6) {
            return -1;
        }
        return (arr_b[5] & 0xF8) >> 3 <= 10 ? Ac3Util.c((arr_b[4] & 0xC0) >> 6, arr_b[4] & 0x3F) : ((arr_b[3] & 0xFF | (arr_b[2] & 7) << 8) + 1) * 2;
    }

    public static Format h(ParsableByteArray parsableByteArray0, String s, String s1, @Nullable DrmInitData drmInitData0) {
        String s2;
        ParsableBitArray parsableBitArray0 = new ParsableBitArray();
        parsableBitArray0.n(parsableByteArray0);
        int v = parsableBitArray0.h(13);
        parsableBitArray0.s(3);
        int v1 = Ac3Util.i[parsableBitArray0.h(2)];
        parsableBitArray0.s(10);
        int v2 = Ac3Util.k[parsableBitArray0.h(3)];
        if(parsableBitArray0.h(1) != 0) {
            ++v2;
        }
        parsableBitArray0.s(3);
        int v3 = parsableBitArray0.h(4);
        parsableBitArray0.s(1);
        if(v3 > 0) {
            parsableBitArray0.s(6);
            if(parsableBitArray0.h(1) != 0) {
                v2 += 2;
            }
            parsableBitArray0.s(1);
        }
        if(parsableBitArray0.b() > 7) {
            parsableBitArray0.s(7);
            s2 = parsableBitArray0.h(1) == 0 ? "audio/eac3" : "audio/eac3-joc";
        }
        else {
            s2 = "audio/eac3";
        }
        parsableBitArray0.c();
        parsableByteArray0.Y(parsableBitArray0.d());
        return new Builder().a0(s).o0(s2).N(v2).p0(v1).U(drmInitData0).e0(s1).j0(v * 1000).K();
    }

    public static int i(ByteBuffer byteBuffer0, int v) {
        int v1 = byteBuffer0.position();
        return (byteBuffer0.get(byteBuffer0.position() + v + 7) & 0xFF) == 0xBB ? 40 << (byteBuffer0.get(v1 + v + 8) >> 4 & 7) : 40 << (byteBuffer0.get(v1 + v + 9) >> 4 & 7);
    }

    public static int j(byte[] arr_b) {
        if(arr_b[4] == -8 && arr_b[5] == 0x72 && arr_b[6] == 0x6F) {
            int v = arr_b[7];
            if((v & 0xFE) == 0xBA) {
                return (v & 0xFF) == 0xBB ? 40 << (arr_b[9] >> 4 & 7) : 40 << (arr_b[8] >> 4 & 7);
            }
        }
        return 0;
    }

    class androidx.media3.extractor.Ac3Util.1 {
    }

}

