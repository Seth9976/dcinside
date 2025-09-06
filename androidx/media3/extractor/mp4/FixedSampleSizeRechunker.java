package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Util;

final class FixedSampleSizeRechunker {
    public static final class Results {
        public final long[] a;
        public final int[] b;
        public final int c;
        public final long[] d;
        public final int[] e;
        public final long f;

        private Results(long[] arr_v, int[] arr_v1, int v, long[] arr_v2, int[] arr_v3, long v1) {
            this.a = arr_v;
            this.b = arr_v1;
            this.c = v;
            this.d = arr_v2;
            this.e = arr_v3;
            this.f = v1;
        }

        Results(long[] arr_v, int[] arr_v1, int v, long[] arr_v2, int[] arr_v3, long v1, androidx.media3.extractor.mp4.FixedSampleSizeRechunker.1 fixedSampleSizeRechunker$10) {
            this(arr_v, arr_v1, v, arr_v2, arr_v3, v1);
        }
    }

    private static final int a = 0x2000;

    public static Results a(int v, long[] arr_v, int[] arr_v1, long v1) {
        int v4 = 0;
        for(int v3 = 0; v3 < arr_v1.length; ++v3) {
            v4 += Util.q(arr_v1[v3], 0x2000 / v);
        }
        long[] arr_v2 = new long[v4];
        int[] arr_v3 = new int[v4];
        long[] arr_v4 = new long[v4];
        int[] arr_v5 = new int[v4];
        int v5 = 0;
        int v7 = 0;
        for(int v2 = 0; v2 < arr_v1.length; ++v2) {
            int v8 = arr_v1[v2];
            long v9 = arr_v[v2];
            for(int v6 = 0; v8 > 0; ++v6) {
                int v10 = Math.min(0x2000 / v, v8);
                arr_v2[v6] = v9;
                int v11 = v * v10;
                arr_v3[v6] = v11;
                v7 = Math.max(v7, v11);
                arr_v4[v6] = ((long)v5) * v1;
                arr_v5[v6] = 1;
                v9 += (long)arr_v3[v6];
                v5 += v10;
                v8 -= v10;
            }
        }
        return new Results(arr_v2, arr_v3, v7, arr_v4, arr_v5, v1 * ((long)v5), null);
    }

    class androidx.media3.extractor.mp4.FixedSampleSizeRechunker.1 {
    }

}

