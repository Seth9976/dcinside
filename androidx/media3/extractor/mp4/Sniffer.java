package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SniffFailure;
import java.io.IOException;

final class Sniffer {
    public static final int a = 0x71742020;
    public static final int b = 0x68656963;
    private static final int c = 0x1000;
    private static final int[] d;

    static {
        Sniffer.d = new int[]{0x69736F6D, 0x69736F32, 0x69736F33, 0x69736F34, 0x69736F35, 0x69736F36, 0x69736F39, 0x61766331, 1752589105, 0x68657631, 0x61763031, 0x6D703431, 0x6D703432, 862401121, 862401122, 0x33677236, 0x33677336, 0x33676536, 0x33676736, 0x4D345620, 0x4D344120, 0x66347620, 1801741417, 1295275600, 0x71742020, 1297305174, 0x64627931, 0x69736D6C, 0x70696666};
    }

    private static boolean a(int v, boolean z) {
        if(v >>> 8 == 0x336770) {
            return true;
        }
        if(v == 0x68656963 && z) {
            return true;
        }
        int[] arr_v = Sniffer.d;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static SniffFailure b(ExtractorInput extractorInput0) throws IOException {
        return Sniffer.c(extractorInput0, true, false);
    }

    @Nullable
    private static SniffFailure c(ExtractorInput extractorInput0, boolean z, boolean z1) throws IOException {
        int[] arr_v;
        int v15;
        long v9;
        int v8;
        long v = extractorInput0.getLength();
        long v1 = 0x1000L;
        int v2 = Long.compare(v, -1L);
        if(v2 != 0 && v <= 0x1000L) {
            v1 = v;
        }
        boolean z2 = false;
        int v3 = (int)v1;
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(0x40);
        int v4 = 0;
        int v5 = 0;
    label_10:
        while(v4 < v3) {
            parsableByteArray0.U(8);
            if(!extractorInput0.n(parsableByteArray0.e(), 0, 8, true)) {
                break;
            }
            long v6 = parsableByteArray0.N();
            int v7 = parsableByteArray0.s();
            if(v6 == 1L) {
                extractorInput0.k(parsableByteArray0.e(), 8, 8);
                v8 = 16;
                parsableByteArray0.X(16);
                v9 = parsableByteArray0.E();
            }
            else {
                if(v6 == 0L) {
                    long v10 = extractorInput0.getLength();
                    if(v10 != -1L) {
                        v6 = v10 - extractorInput0.p() + 8L;
                    }
                }
                v9 = v6;
                v8 = 8;
            }
            if(v9 < ((long)v8)) {
                return new AtomSizeTooSmallSniffFailure(v7, v9, v8);
            }
            v4 += v8;
            if(v7 != 0x6D6F6F76) {
                switch(v7) {
                    case 1835295092: {
                        v5 = 1;
                    label_40:
                        if(((long)v4) + v9 - ((long)v8) >= ((long)v3)) {
                            break label_10;
                        }
                        int v12 = (int)(v9 - ((long)v8));
                        v4 += v12;
                        if(v7 == 0x66747970) {
                            if(v12 < 8) {
                                return new AtomSizeTooSmallSniffFailure(0x66747970, ((long)v12), 8);
                            }
                            parsableByteArray0.U(v12);
                            extractorInput0.k(parsableByteArray0.e(), 0, v12);
                            int v13 = parsableByteArray0.s();
                            if(Sniffer.a(v13, z1)) {
                                v5 = 1;
                            }
                            parsableByteArray0.Z(4);
                            int v14 = parsableByteArray0.a() / 4;
                            if(v5 != 0 || v14 <= 0) {
                                v15 = v5;
                                arr_v = null;
                            }
                            else {
                                v15 = 0;
                                arr_v = new int[v14];
                                for(int v16 = 0; v16 < v14; ++v16) {
                                    int v17 = parsableByteArray0.s();
                                    arr_v[v16] = v17;
                                    if(Sniffer.a(v17, z1)) {
                                        v15 = 1;
                                        break;
                                    }
                                }
                            }
                            if(v15 == 0) {
                                return new UnsupportedBrandsSniffFailure(v13, arr_v);
                            }
                            v5 = v15;
                            continue;
                        }
                        if(v12 == 0) {
                            continue;
                        }
                        extractorInput0.q(v12);
                        continue;
                    }
                    case 0x6D6F6F66: 
                    case 0x6D766578: {
                        break;
                    }
                    default: {
                        goto label_40;
                    }
                }
                z2 = true;
                break;
            }
            int v11 = v3 + ((int)v9);
            v3 = v2 != 0 && ((long)v11) > v ? ((int)v) : v11;
        }
        if(v5 == 0) {
            return NoDeclaredBrandSniffFailure.a;
        }
        if(z != z2) {
            return z2 ? IncorrectFragmentationSniffFailure.b : IncorrectFragmentationSniffFailure.c;
        }
        return null;
    }

    @Nullable
    public static SniffFailure d(ExtractorInput extractorInput0, boolean z) throws IOException {
        return Sniffer.c(extractorInput0, false, z);
    }
}

