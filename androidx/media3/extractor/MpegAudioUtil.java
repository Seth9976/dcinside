package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class MpegAudioUtil {
    public static final class Header {
        public int a;
        @Nullable
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public Header() {
        }

        public Header(Header mpegAudioUtil$Header0) {
            this.a = mpegAudioUtil$Header0.a;
            this.b = mpegAudioUtil$Header0.b;
            this.c = mpegAudioUtil$Header0.c;
            this.d = mpegAudioUtil$Header0.d;
            this.e = mpegAudioUtil$Header0.e;
            this.f = mpegAudioUtil$Header0.f;
            this.g = mpegAudioUtil$Header0.g;
        }

        public boolean a(int v) {
            if(!MpegAudioUtil.l(v)) {
                return false;
            }
            int v1 = v >>> 19 & 3;
            if(v1 == 1) {
                return false;
            }
            int v2 = v >>> 17 & 3;
            if(v2 == 0) {
                return false;
            }
            int v3 = v >>> 12 & 15;
            if(v3 != 0 && v3 != 15) {
                int v4 = v >>> 10 & 3;
                if(v4 == 3) {
                    return false;
                }
                this.a = v1;
                this.b = MpegAudioUtil.c[3 - v2];
                int v5 = MpegAudioUtil.d[v4];
                this.d = v5;
                int v6 = 2;
                if(v1 == 2) {
                    this.d = v5 / 2;
                }
                else if(v1 == 0) {
                    this.d = v5 / 4;
                }
                int v7 = 0x90;
                int v8 = v >>> 9 & 1;
                this.g = MpegAudioUtil.k(v1, v2);
                if(v2 == 3) {
                    int v9 = v1 == 3 ? MpegAudioUtil.e[v3 - 1] : MpegAudioUtil.f[v3 - 1];
                    this.f = v9;
                    this.c = (v9 * 12 / this.d + v8) * 4;
                }
                else if(v1 == 3) {
                    int v10 = v2 == 2 ? MpegAudioUtil.g[v3 - 1] : MpegAudioUtil.h[v3 - 1];
                    this.f = v10;
                    this.c = v10 * 0x90 / this.d + v8;
                }
                else {
                    int v11 = MpegAudioUtil.i[v3 - 1];
                    this.f = v11;
                    if(v2 == 1) {
                        v7 = 72;
                    }
                    this.c = v7 * v11 / this.d + v8;
                }
                if((v >> 6 & 3) == 3) {
                    v6 = 1;
                }
                this.e = v6;
                return true;
            }
            return false;
        }
    }

    public static final int a = 0x1000;
    public static final int b = 40000;
    private static final String[] c = null;
    private static final int[] d = null;
    private static final int[] e = null;
    private static final int[] f = null;
    private static final int[] g = null;
    private static final int[] h = null;
    private static final int[] i = null;
    private static final int j = 0x180;
    private static final int k = 0x480;
    private static final int l = 0x480;
    private static final int m = 0x240;

    static {
        MpegAudioUtil.c = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
        MpegAudioUtil.d = new int[]{44100, 48000, 32000};
        MpegAudioUtil.e = new int[]{32000, 0xFA00, 96000, 0x1F400, 160000, 192000, 224000, 256000, 288000, 320000, 0x55F00, 384000, 416000, 448000};
        MpegAudioUtil.f = new int[]{32000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 144000, 160000, 176000, 192000, 224000, 256000};
        MpegAudioUtil.g = new int[]{32000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 160000, 192000, 224000, 256000, 320000, 384000};
        MpegAudioUtil.h = new int[]{32000, 40000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 160000, 192000, 224000, 256000, 320000};
        MpegAudioUtil.i = new int[]{8000, 16000, 24000, 32000, 40000, 48000, 56000, 0xFA00, 80000, 96000, 112000, 0x1F400, 144000, 160000};
    }

    public static int j(int v) {
        int v7;
        if(!MpegAudioUtil.l(v)) {
            return -1;
        }
        int v1 = v >>> 19 & 3;
        if(v1 == 1) {
            return -1;
        }
        int v2 = v >>> 17 & 3;
        if(v2 == 0) {
            return -1;
        }
        int v3 = v >>> 12 & 15;
        if(v3 != 0 && v3 != 15) {
            int v4 = v >>> 10 & 3;
            if(v4 == 3) {
                return -1;
            }
            int v5 = MpegAudioUtil.d[v4];
            if(v1 == 2) {
                v5 /= 2;
            }
            else if(v1 == 0) {
                v5 /= 4;
            }
            int v6 = v >>> 9 & 1;
            if(v2 == 3) {
                return v1 == 3 ? (MpegAudioUtil.e[v3 - 1] * 12 / v5 + v6) * 4 : (MpegAudioUtil.f[v3 - 1] * 12 / v5 + v6) * 4;
            }
            if(v1 != 3) {
                v7 = MpegAudioUtil.i[v3 - 1];
            }
            else if(v2 == 2) {
                v7 = MpegAudioUtil.g[v3 - 1];
            }
            else {
                v7 = MpegAudioUtil.h[v3 - 1];
            }
            int v8 = 0x90;
            if(v1 == 3) {
                return v7 * 0x90 / v5 + v6;
            }
            if(v2 == 1) {
                v8 = 72;
            }
            return v8 * v7 / v5 + v6;
        }
        return -1;
    }

    private static int k(int v, int v1) {
        if(v1 != 1) {
            switch(v1) {
                case 2: {
                    return 0x480;
                }
                case 3: {
                    return 0x180;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        return v == 3 ? 0x480 : 0x240;
    }

    private static boolean l(int v) {
        return (v & 0xFFE00000) == 0xFFE00000;
    }

    public static int m(int v) {
        if(!MpegAudioUtil.l(v)) {
            return -1;
        }
        int v1 = v >>> 19 & 3;
        if(v1 == 1) {
            return -1;
        }
        int v2 = v >>> 17 & 3;
        if(v2 == 0) {
            return -1;
        }
        return (v >>> 12 & 15) == 0 || (v >>> 12 & 15) == 15 || (v >>> 10 & 3) == 3 ? -1 : MpegAudioUtil.k(v1, v2);
    }
}

