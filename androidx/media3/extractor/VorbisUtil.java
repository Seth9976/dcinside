package androidx.media3.extractor;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import com.google.common.collect.O2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@UnstableApi
public final class VorbisUtil {
    public static final class CommentHeader {
        public final String a;
        public final String[] b;
        public final int c;

        public CommentHeader(String s, String[] arr_s, int v) {
            this.a = s;
            this.b = arr_s;
            this.c = v;
        }
    }

    public static final class Mode {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;

        public Mode(boolean z, int v, int v1, int v2) {
            this.a = z;
            this.b = v;
            this.c = v1;
            this.d = v2;
        }
    }

    public static final class VorbisIdHeader {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public VorbisIdHeader(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, boolean z, byte[] arr_b) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
            this.e = v4;
            this.f = v5;
            this.g = v6;
            this.h = v7;
            this.i = z;
            this.j = arr_b;
        }
    }

    private static final String a = "VorbisUtil";

    @Nullable
    public static int[] a(int v) {
        switch(v) {
            case 3: {
                return new int[]{0, 2, 1};
            }
            case 5: {
                return new int[]{0, 2, 1, 3, 4};
            }
            case 6: {
                return new int[]{0, 2, 1, 5, 3, 4};
            }
            case 7: {
                return new int[]{0, 2, 1, 6, 5, 3, 4};
            }
            case 8: {
                return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
            }
            default: {
                return null;
            }
        }
    }

    public static int b(int v) {
        int v1 = 0;
        while(v > 0) {
            ++v1;
            v >>>= 1;
        }
        return v1;
    }

    private static long c(long v, long v1) {
        return (long)Math.floor(Math.pow(v, 1.0 / ((double)v1)));
    }

    @Nullable
    public static Metadata d(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < list0.size(); ++v) {
            String s = (String)list0.get(v);
            String[] arr_s = Util.n2(s, "=");
            if(arr_s.length != 2) {
                Log.n("VorbisUtil", "Failed to parse Vorbis comment: " + s);
            }
            else if(arr_s[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList0.add(PictureFrame.a(new ParsableByteArray(Base64.decode(arr_s[1], 0))));
                }
                catch(RuntimeException runtimeException0) {
                    Log.o("VorbisUtil", "Failed to parse vorbis picture", runtimeException0);
                }
            }
            else {
                arrayList0.add(new VorbisComment(arr_s[0], arr_s[1]));
            }
        }
        return arrayList0.isEmpty() ? null : new Metadata(arrayList0);
    }

    public static O2 e(byte[] arr_b) {
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(arr_b);
        parsableByteArray0.Z(1);
        int v = 0;
        while(parsableByteArray0.a() > 0 && parsableByteArray0.k() == 0xFF) {
            v += 0xFF;
            parsableByteArray0.Z(1);
        }
        int v1 = v + parsableByteArray0.L();
        int v2 = 0;
        while(parsableByteArray0.a() > 0 && parsableByteArray0.k() == 0xFF) {
            v2 += 0xFF;
            parsableByteArray0.Z(1);
        }
        int v3 = parsableByteArray0.L();
        byte[] arr_b1 = new byte[v1];
        int v4 = parsableByteArray0.f();
        System.arraycopy(arr_b, v4, arr_b1, 0, v1);
        int v5 = v4 + v1 + (v2 + v3);
        int v6 = arr_b.length - v5;
        byte[] arr_b2 = new byte[v6];
        System.arraycopy(arr_b, v5, arr_b2, 0, v6);
        return O2.C(arr_b1, arr_b2);
    }

    private static void f(VorbisBitArray vorbisBitArray0) throws ParserException {
        int v = vorbisBitArray0.e(6);
        for(int v1 = 0; v1 < v + 1; ++v1) {
            int v2 = vorbisBitArray0.e(16);
        alab1:
            switch(v2) {
                case 0: {
                    vorbisBitArray0.h(8);
                    vorbisBitArray0.h(16);
                    vorbisBitArray0.h(16);
                    vorbisBitArray0.h(6);
                    vorbisBitArray0.h(8);
                    int v3 = vorbisBitArray0.e(4);
                    for(int v4 = 0; v4 < v3 + 1; ++v4) {
                        vorbisBitArray0.h(8);
                    }
                    break;
                }
                case 1: {
                    int v5 = vorbisBitArray0.e(5);
                    int[] arr_v = new int[v5];
                    int v6 = -1;
                    for(int v7 = 0; v7 < v5; ++v7) {
                        int v8 = vorbisBitArray0.e(4);
                        arr_v[v7] = v8;
                        if(v8 > v6) {
                            v6 = v8;
                        }
                    }
                    int v9 = v6 + 1;
                    int[] arr_v1 = new int[v9];
                    for(int v10 = 0; v10 < v9; ++v10) {
                        arr_v1[v10] = vorbisBitArray0.e(3) + 1;
                        int v11 = vorbisBitArray0.e(2);
                        if(v11 > 0) {
                            vorbisBitArray0.h(8);
                        }
                        for(int v12 = 0; v12 < 1 << v11; ++v12) {
                            vorbisBitArray0.h(8);
                        }
                    }
                    vorbisBitArray0.h(2);
                    int v13 = vorbisBitArray0.e(4);
                    int v15 = 0;
                    for(int v14 = 0; true; ++v14) {
                        if(v14 >= v5) {
                            break alab1;
                        }
                        v15 += arr_v1[arr_v[v14]];
                        for(int v16 = 0; v16 < v15; ++v16) {
                            vorbisBitArray0.h(v13);
                        }
                    }
                }
                default: {
                    throw ParserException.a(("floor type greater than 1 not decodable: " + v2), null);
                }
            }
        }
    }

    private static void g(int v, VorbisBitArray vorbisBitArray0) throws ParserException {
        int v1 = vorbisBitArray0.e(6);
        for(int v2 = 0; v2 < v1 + 1; ++v2) {
            int v3 = vorbisBitArray0.e(16);
            if(v3 == 0) {
                int v4 = vorbisBitArray0.d() ? vorbisBitArray0.e(4) + 1 : 1;
                if(vorbisBitArray0.d()) {
                    int v5 = vorbisBitArray0.e(8);
                    for(int v6 = 0; v6 < v5 + 1; ++v6) {
                        vorbisBitArray0.h(VorbisUtil.b(v - 1));
                        vorbisBitArray0.h(VorbisUtil.b(v - 1));
                    }
                }
                if(vorbisBitArray0.e(2) != 0) {
                    throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if(v4 > 1) {
                    for(int v7 = 0; v7 < v; ++v7) {
                        vorbisBitArray0.h(4);
                    }
                }
                for(int v8 = 0; v8 < v4; ++v8) {
                    vorbisBitArray0.h(8);
                    vorbisBitArray0.h(8);
                    vorbisBitArray0.h(8);
                }
            }
            else {
                Log.d("VorbisUtil", "mapping type other than 0 not supported: " + v3);
            }
        }
    }

    private static Mode[] h(VorbisBitArray vorbisBitArray0) {
        int v = vorbisBitArray0.e(6);
        Mode[] arr_vorbisUtil$Mode = new Mode[v + 1];
        for(int v1 = 0; v1 < v + 1; ++v1) {
            arr_vorbisUtil$Mode[v1] = new Mode(vorbisBitArray0.d(), vorbisBitArray0.e(16), vorbisBitArray0.e(16), vorbisBitArray0.e(8));
        }
        return arr_vorbisUtil$Mode;
    }

    private static void i(VorbisBitArray vorbisBitArray0) throws ParserException {
        int v = vorbisBitArray0.e(6);
        for(int v1 = 0; v1 < v + 1; ++v1) {
            if(vorbisBitArray0.e(16) > 2) {
                throw ParserException.a("residueType greater than 2 is not decodable", null);
            }
            vorbisBitArray0.h(24);
            vorbisBitArray0.h(24);
            vorbisBitArray0.h(24);
            int v2 = vorbisBitArray0.e(6);
            vorbisBitArray0.h(8);
            int[] arr_v = new int[v2 + 1];
            for(int v3 = 0; v3 < v2 + 1; ++v3) {
                int v4 = vorbisBitArray0.e(3);
                arr_v[v3] = (vorbisBitArray0.d() ? vorbisBitArray0.e(5) : 0) * 8 + v4;
            }
            for(int v5 = 0; v5 < v2 + 1; ++v5) {
                for(int v6 = 0; v6 < 8; ++v6) {
                    if((arr_v[v5] & 1 << v6) != 0) {
                        vorbisBitArray0.h(8);
                    }
                }
            }
        }
    }

    public static CommentHeader j(ParsableByteArray parsableByteArray0) throws ParserException {
        return VorbisUtil.k(parsableByteArray0, true, true);
    }

    public static CommentHeader k(ParsableByteArray parsableByteArray0, boolean z, boolean z1) throws ParserException {
        if(z) {
            VorbisUtil.o(3, parsableByteArray0, false);
        }
        String s = parsableByteArray0.I(((int)parsableByteArray0.A()));
        long v1 = parsableByteArray0.A();
        String[] arr_s = new String[((int)v1)];
        int v2 = s.length() + 15;
        for(int v = 0; ((long)v) < v1; ++v) {
            String s1 = parsableByteArray0.I(((int)parsableByteArray0.A()));
            arr_s[v] = s1;
            v2 = v2 + 4 + s1.length();
        }
        if(z1 && (parsableByteArray0.L() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new CommentHeader(s, arr_s, v2 + 1);
    }

    public static VorbisIdHeader l(ParsableByteArray parsableByteArray0) throws ParserException {
        boolean z = true;
        VorbisUtil.o(1, parsableByteArray0, false);
        int v = parsableByteArray0.C();
        int v1 = parsableByteArray0.L();
        int v2 = parsableByteArray0.C();
        int v3 = parsableByteArray0.w();
        if(v3 <= 0) {
            v3 = -1;
        }
        int v4 = parsableByteArray0.w();
        if(v4 <= 0) {
            v4 = -1;
        }
        int v5 = parsableByteArray0.w();
        if(v5 <= 0) {
            v5 = -1;
        }
        int v6 = parsableByteArray0.L();
        int v7 = (int)Math.pow(2.0, v6 & 15);
        int v8 = (int)Math.pow(2.0, (v6 & 0xF0) >> 4);
        if((parsableByteArray0.L() & 1) <= 0) {
            z = false;
        }
        return new VorbisIdHeader(v, v1, v2, v3, v4, v5, v7, v8, z, Arrays.copyOf(parsableByteArray0.e(), parsableByteArray0.g()));
    }

    public static Mode[] m(ParsableByteArray parsableByteArray0, int v) throws ParserException {
        VorbisUtil.o(5, parsableByteArray0, false);
        int v2 = parsableByteArray0.L();
        VorbisBitArray vorbisBitArray0 = new VorbisBitArray(parsableByteArray0.e());
        vorbisBitArray0.h(parsableByteArray0.f() * 8);
        for(int v3 = 0; v3 < v2 + 1; ++v3) {
            VorbisUtil.n(vorbisBitArray0);
        }
        int v4 = vorbisBitArray0.e(6);
        for(int v1 = 0; v1 < v4 + 1; ++v1) {
            if(vorbisBitArray0.e(16) != 0) {
                throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        VorbisUtil.f(vorbisBitArray0);
        VorbisUtil.i(vorbisBitArray0);
        VorbisUtil.g(v, vorbisBitArray0);
        Mode[] arr_vorbisUtil$Mode = VorbisUtil.h(vorbisBitArray0);
        if(!vorbisBitArray0.d()) {
            throw ParserException.a("framing bit after modes not set as expected", null);
        }
        return arr_vorbisUtil$Mode;
    }

    private static void n(VorbisBitArray vorbisBitArray0) throws ParserException {
        long v5;
        if(vorbisBitArray0.e(24) != 0x564342) {
            throw ParserException.a(("expected code book to start with [0x56, 0x43, 0x42] at " + vorbisBitArray0.c()), null);
        }
        int v = vorbisBitArray0.e(16);
        int v1 = vorbisBitArray0.e(24);
        int v2 = 0;
        if(vorbisBitArray0.d()) {
            vorbisBitArray0.h(5);
            while(v2 < v1) {
                v2 += vorbisBitArray0.e(VorbisUtil.b(v1 - v2));
            }
        }
        else {
            boolean z = vorbisBitArray0.d();
            while(v2 < v1) {
                if(!z) {
                    vorbisBitArray0.h(5);
                }
                else if(vorbisBitArray0.d()) {
                    vorbisBitArray0.h(5);
                }
                ++v2;
            }
        }
        int v3 = vorbisBitArray0.e(4);
        if(v3 > 2) {
            throw ParserException.a(("lookup type greater than 2 not decodable: " + v3), null);
        }
        if(v3 == 1 || v3 == 2) {
            vorbisBitArray0.h(0x20);
            vorbisBitArray0.h(0x20);
            int v4 = vorbisBitArray0.e(4);
            vorbisBitArray0.h(1);
            if(v3 != 1) {
                v5 = ((long)v) * ((long)v1);
            }
            else if(v != 0) {
                v5 = VorbisUtil.c(v1, v);
            }
            else {
                v5 = 0L;
            }
            vorbisBitArray0.h(((int)(v5 * ((long)(v4 + 1)))));
        }
    }

    public static boolean o(int v, ParsableByteArray parsableByteArray0, boolean z) throws ParserException {
        if(parsableByteArray0.a() < 7) {
            if(!z) {
                throw ParserException.a(("too short header: " + parsableByteArray0.a()), null);
            }
            return false;
        }
        if(parsableByteArray0.L() != v) {
            if(!z) {
                throw ParserException.a(("expected header type " + Integer.toHexString(v)), null);
            }
            return false;
        }
        if(parsableByteArray0.L() == 0x76 && parsableByteArray0.L() == 0x6F && parsableByteArray0.L() == 0x72 && parsableByteArray0.L() == 98 && parsableByteArray0.L() == 105 && parsableByteArray0.L() == 0x73) {
            return true;
        }
        if(!z) {
            throw ParserException.a("expected characters \'vorbis\'", null);
        }
        return false;
    }
}

