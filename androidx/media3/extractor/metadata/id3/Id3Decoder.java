package androidx.media3.extractor.metadata.id3;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.common.base.c;
import com.google.common.base.f;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

@UnstableApi
public final class Id3Decoder extends SimpleMetadataDecoder {
    public interface FramePredicate {
        boolean a(int arg1, int arg2, int arg3, int arg4, int arg5);
    }

    static final class Id3Header {
        private final int a;
        private final boolean b;
        private final int c;

        public Id3Header(int v, boolean z, int v1) {
            this.a = v;
            this.b = z;
            this.c = v1;
        }
    }

    @Nullable
    private final FramePredicate a;
    public static final FramePredicate b = null;
    private static final String c = "Id3Decoder";
    public static final int d = 4801587;
    public static final int e = 10;
    private static final int f = 0x80;
    private static final int g = 0x40;
    private static final int h = 0x20;
    private static final int i = 8;
    private static final int j = 4;
    private static final int k = 0x40;
    private static final int l = 2;
    private static final int m = 1;
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 3;

    static {
        Id3Decoder.b = (int v, int v1, int v2, int v3, int v4) -> false;
    }

    public Id3Decoder() {
        this(null);
    }

    public Id3Decoder(@Nullable FramePredicate id3Decoder$FramePredicate0) {
        this.a = id3Decoder$FramePredicate0;
    }

    private static boolean A(int v, int v1, int v2, int v3, int v4) [...] // Inlined contents

    private static int B(ParsableByteArray parsableByteArray0, int v) {
        byte[] arr_b = parsableByteArray0.e();
        int v1 = parsableByteArray0.f();
        for(int v2 = v1; v2 + 1 < v1 + v; ++v2) {
            if((arr_b[v2] & 0xFF) == 0xFF && arr_b[v2 + 1] == 0) {
                System.arraycopy(arr_b, v2 + 2, arr_b, v2 + 1, v - (v2 - v1) - 2);
                --v;
            }
        }
        return v;
    }

    // This method was un-flattened
    private static boolean C(ParsableByteArray parsableByteArray0, int v, int v1, boolean z) {
        int v6;
        int v5;
        long v4;
        int v3;
        int v2 = parsableByteArray0.f();
        while(parsableByteArray0.a() >= v1) {
            try {
                if(v >= 3) {
                    v3 = parsableByteArray0.s();
                    v4 = parsableByteArray0.N();
                    v5 = parsableByteArray0.R();
                }
                else {
                    v3 = parsableByteArray0.O();
                    v4 = (long)parsableByteArray0.O();
                    v5 = 0;
                }
            }
            catch(Throwable throwable0) {
                parsableByteArray0.Y(v2);
                throw throwable0;
            }
            if(v3 == 0 && v4 == 0L && v5 == 0) {
                parsableByteArray0.Y(v2);
                return true;
            }
            if(v == 4 && !z) {
                if((0x808080L & v4) != 0L) {
                    parsableByteArray0.Y(v2);
                    return false;
                }
                v4 = (v4 >> 24 & 0xFFL) << 21 | (v4 & 0xFFL | (v4 >> 8 & 0xFFL) << 7 | (v4 >> 16 & 0xFFL) << 14);
            }
            if(v == 4) {
                v6 = (v5 & 0x40) == 0 ? 0 : 1;
                if((v5 & 1) != 0) {
                    v6 += 4;
                }
            }
            else if(v == 3) {
                v6 = (v5 & 0x20) == 0 ? 0 : 1;
                if((v5 & 0x80) != 0) {
                    v6 += 4;
                }
            }
            else {
                v6 = 0;
            }
            if(v4 < ((long)v6)) {
                parsableByteArray0.Y(v2);
                return false;
            }
            if(((long)parsableByteArray0.a()) < v4) {
                parsableByteArray0.Y(v2);
                return false;
            }
            try {
                parsableByteArray0.Z(((int)v4));
                continue;
            }
            catch(Throwable throwable0) {
            }
            parsableByteArray0.Y(v2);
            throw throwable0;
        }
        parsableByteArray0.Y(v2);
        return true;
    }

    @Override  // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    @Nullable
    protected Metadata b(MetadataInputBuffer metadataInputBuffer0, ByteBuffer byteBuffer0) {
        return this.e(byteBuffer0.array(), byteBuffer0.limit());
    }

    // 检测为 Lambda 实现
    public static boolean c(int v, int v1, int v2, int v3, int v4) [...]

    private static byte[] d(byte[] arr_b, int v, int v1) {
        return v1 > v ? Arrays.copyOfRange(arr_b, v, v1) : Util.f;
    }

    @Nullable
    public Metadata e(byte[] arr_b, int v) {
        ArrayList arrayList0 = new ArrayList();
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(arr_b, v);
        Id3Header id3Decoder$Id3Header0 = Id3Decoder.m(parsableByteArray0);
        if(id3Decoder$Id3Header0 == null) {
            return null;
        }
        int v1 = id3Decoder$Id3Header0.a == 2 ? 6 : 10;
        parsableByteArray0.X(parsableByteArray0.f() + (id3Decoder$Id3Header0.b ? Id3Decoder.B(parsableByteArray0, id3Decoder$Id3Header0.c) : id3Decoder$Id3Header0.c));
        boolean z = false;
        if(!Id3Decoder.C(parsableByteArray0, id3Decoder$Id3Header0.a, v1, false)) {
            if(id3Decoder$Id3Header0.a == 4 && Id3Decoder.C(parsableByteArray0, 4, v1, true)) {
                z = true;
                goto label_14;
            }
            Log.n("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + id3Decoder$Id3Header0.a);
            return null;
        }
    label_14:
        while(parsableByteArray0.a() >= v1) {
            Id3Frame id3Frame0 = Id3Decoder.k(id3Decoder$Id3Header0.a, parsableByteArray0, z, v1, this.a);
            if(id3Frame0 != null) {
                arrayList0.add(id3Frame0);
            }
        }
        return new Metadata(arrayList0);
    }

    private static ApicFrame f(ParsableByteArray parsableByteArray0, int v, int v1) {
        int v3;
        String s;
        int v2 = parsableByteArray0.L();
        Charset charset0 = Id3Decoder.w(v2);
        byte[] arr_b = new byte[v - 1];
        parsableByteArray0.n(arr_b, 0, v - 1);
        if(v1 == 2) {
            s = "image/" + c.g(new String(arr_b, 0, 3, f.b));
            if("image/jpg".equals(s)) {
                s = "image/jpeg";
            }
            v3 = 2;
        }
        else {
            v3 = Id3Decoder.z(arr_b, 0);
            String s1 = c.g(new String(arr_b, 0, v3, f.b));
            s = s1.indexOf(0x2F) == -1 ? "image/" + s1 : s1;
        }
        int v4 = arr_b[v3 + 1] & 0xFF;
        int v5 = Id3Decoder.y(arr_b, v3 + 2, v2);
        return new ApicFrame(s, new String(arr_b, v3 + 2, v5 - (v3 + 2), charset0), v4, Id3Decoder.d(arr_b, v5 + Id3Decoder.v(v2), v - 1));
    }

    private static BinaryFrame g(ParsableByteArray parsableByteArray0, int v, String s) {
        byte[] arr_b = new byte[v];
        parsableByteArray0.n(arr_b, 0, v);
        return new BinaryFrame(s, arr_b);
    }

    private static ChapterFrame h(ParsableByteArray parsableByteArray0, int v, int v1, boolean z, int v2, @Nullable FramePredicate id3Decoder$FramePredicate0) {
        int v3 = parsableByteArray0.f();
        int v4 = Id3Decoder.z(parsableByteArray0.e(), v3);
        String s = new String(parsableByteArray0.e(), v3, v4 - v3, f.b);
        parsableByteArray0.Y(v4 + 1);
        int v5 = parsableByteArray0.s();
        int v6 = parsableByteArray0.s();
        long v7 = parsableByteArray0.N();
        long v8 = parsableByteArray0.N();
        ArrayList arrayList0 = new ArrayList();
        while(parsableByteArray0.f() < v3 + v) {
            Id3Frame id3Frame0 = Id3Decoder.k(v1, parsableByteArray0, z, v2, id3Decoder$FramePredicate0);
            if(id3Frame0 != null) {
                arrayList0.add(id3Frame0);
            }
        }
        return new ChapterFrame(s, v5, v6, (v7 == 0xFFFFFFFFL ? -1L : v7), (v8 == 0xFFFFFFFFL ? -1L : v8), ((Id3Frame[])arrayList0.toArray(new Id3Frame[0])));
    }

    private static ChapterTocFrame i(ParsableByteArray parsableByteArray0, int v, int v1, boolean z, int v2, @Nullable FramePredicate id3Decoder$FramePredicate0) {
        int v3 = parsableByteArray0.f();
        int v4 = Id3Decoder.z(parsableByteArray0.e(), v3);
        String s = new String(parsableByteArray0.e(), v3, v4 - v3, f.b);
        parsableByteArray0.Y(v4 + 1);
        int v5 = parsableByteArray0.L();
        int v6 = parsableByteArray0.L();
        String[] arr_s = new String[v6];
        for(int v7 = 0; v7 < v6; ++v7) {
            int v8 = parsableByteArray0.f();
            int v9 = Id3Decoder.z(parsableByteArray0.e(), v8);
            arr_s[v7] = new String(parsableByteArray0.e(), v8, v9 - v8, f.b);
            parsableByteArray0.Y(v9 + 1);
        }
        ArrayList arrayList0 = new ArrayList();
        while(parsableByteArray0.f() < v3 + v) {
            Id3Frame id3Frame0 = Id3Decoder.k(v1, parsableByteArray0, z, v2, id3Decoder$FramePredicate0);
            if(id3Frame0 != null) {
                arrayList0.add(id3Frame0);
            }
        }
        return new ChapterTocFrame(s, (v5 & 2) != 0, (v5 & 1) != 0, arr_s, ((Id3Frame[])arrayList0.toArray(new Id3Frame[0])));
    }

    @Nullable
    private static CommentFrame j(ParsableByteArray parsableByteArray0, int v) {
        if(v < 4) {
            return null;
        }
        int v1 = parsableByteArray0.L();
        Charset charset0 = Id3Decoder.w(v1);
        byte[] arr_b = new byte[3];
        parsableByteArray0.n(arr_b, 0, 3);
        String s = new String(arr_b, 0, 3);
        byte[] arr_b1 = new byte[v - 4];
        parsableByteArray0.n(arr_b1, 0, v - 4);
        int v2 = Id3Decoder.y(arr_b1, 0, v1);
        int v3 = v2 + Id3Decoder.v(v1);
        return new CommentFrame(s, new String(arr_b1, 0, v2, charset0), Id3Decoder.p(arr_b1, v3, Id3Decoder.y(arr_b1, v3, v1), charset0));
    }

    @Nullable
    private static Id3Frame k(int v, ParsableByteArray parsableByteArray0, boolean z, int v1, @Nullable FramePredicate id3Decoder$FramePredicate0) {
        TextInformationFrame textInformationFrame0;
        int v15;
        boolean z1;
        int v14;
        int v13;
        int v12;
        int v11;
        int v10;
        int v6;
        int v2 = parsableByteArray0.L();
        int v3 = parsableByteArray0.L();
        int v4 = parsableByteArray0.L();
        int v5 = v < 3 ? 0 : parsableByteArray0.L();
        switch(v) {
            case 3: {
                v6 = parsableByteArray0.P();
                break;
            }
            case 4: {
                v6 = parsableByteArray0.P();
                if(!z) {
                    v6 = (v6 >> 24 & 0xFF) << 21 | (v6 & 0xFF | (v6 >> 8 & 0xFF) << 7 | (v6 >> 16 & 0xFF) << 14);
                }
                break;
            }
            default: {
                v6 = parsableByteArray0.O();
            }
        }
        int v7 = v6;
        int v8 = v < 3 ? 0 : parsableByteArray0.R();
        Id3Frame id3Frame0 = null;
        if(v2 == 0 && v3 == 0 && v4 == 0 && v5 == 0 && v7 == 0 && v8 == 0) {
            parsableByteArray0.Y(parsableByteArray0.g());
            return null;
        }
        int v9 = parsableByteArray0.f() + v7;
        if(v9 > parsableByteArray0.g()) {
            Log.n("Id3Decoder", "Frame size exceeds remaining tag data");
            parsableByteArray0.Y(parsableByteArray0.g());
            return null;
        }
        if(id3Decoder$FramePredicate0 == null) {
            v10 = v9;
            v11 = v8;
        }
        else {
            v10 = v9;
            v11 = v8;
            if(!id3Decoder$FramePredicate0.a(v, v2, v3, v4, v5)) {
                parsableByteArray0.Y(v10);
                return null;
            }
        }
        switch(v) {
            case 3: {
                v14 = (v11 & 0x40) == 0 ? 0 : 1;
                v15 = (v11 & 0x80) == 0 ? 0 : 1;
                z1 = false;
                v13 = (v11 & 0x20) == 0 ? 0 : 1;
                v12 = v15;
                break;
            }
            case 4: {
                v13 = (v11 & 0x40) == 0 ? 0 : 1;
                z1 = (v11 & 2) != 0;
                v15 = (v11 & 1) == 0 ? 0 : 1;
                v12 = (v11 & 8) == 0 ? 0 : 1;
                v14 = (v11 & 4) == 0 ? 0 : 1;
                break;
            }
            default: {
                v12 = 0;
                v13 = 0;
                v14 = 0;
                z1 = false;
                v15 = 0;
            }
        }
        if(v12 != 0 || v14 != 0) {
            Log.n("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            parsableByteArray0.Y(v10);
            return null;
        }
        if(v13 != 0) {
            --v7;
            parsableByteArray0.Z(1);
        }
        if(v15 != 0) {
            v7 -= 4;
            parsableByteArray0.Z(4);
        }
        if(z1) {
            v7 = Id3Decoder.B(parsableByteArray0, v7);
        }
        try {
            if(v2 == 84 && v3 == 88 && v4 == 88 && (v == 2 || v5 == 88)) {
                textInformationFrame0 = Id3Decoder.s(parsableByteArray0, v7);
            }
            else if(v2 == 84) {
                textInformationFrame0 = Id3Decoder.q(parsableByteArray0, v7, Id3Decoder.x(v, 84, v3, v4, v5));
            }
            else if(v2 == 87 && v3 == 88 && v4 == 88 && (v == 2 || v5 == 88)) {
                textInformationFrame0 = Id3Decoder.u(parsableByteArray0, v7);
            }
            else if(v2 == 87) {
                textInformationFrame0 = Id3Decoder.t(parsableByteArray0, v7, Id3Decoder.x(v, 87, v3, v4, v5));
            }
            else if(v2 == 80 && v3 == 82 && v4 == 73 && v5 == 86) {
                textInformationFrame0 = Id3Decoder.o(parsableByteArray0, v7);
            }
            else if(v2 == 71 && v3 == 69 && v4 == 0x4F && (v5 == 66 || v == 2)) {
                textInformationFrame0 = Id3Decoder.l(parsableByteArray0, v7);
            }
            else if(v != 2) {
                if(v2 == 65 && v3 == 80 && v4 == 73 && v5 == 67) {
                    textInformationFrame0 = Id3Decoder.f(parsableByteArray0, v7, v);
                }
                else {
                label_72:
                    if(v2 == 67 && v3 == 0x4F && v4 == 77 && (v5 == 77 || v == 2)) {
                        textInformationFrame0 = Id3Decoder.j(parsableByteArray0, v7);
                    }
                    else if(v2 == 67 && v3 == 72 && v4 == 65 && v5 == 80) {
                        textInformationFrame0 = Id3Decoder.h(parsableByteArray0, v7, v, z, v1, id3Decoder$FramePredicate0);
                    }
                    else if(v2 == 67 && v3 == 84 && v4 == 0x4F && v5 == 67) {
                        textInformationFrame0 = Id3Decoder.i(parsableByteArray0, v7, v, z, v1, id3Decoder$FramePredicate0);
                    }
                    else if(v2 == 77 && v3 == 76 && v4 == 76 && v5 == 84) {
                        textInformationFrame0 = Id3Decoder.n(parsableByteArray0, v7);
                    }
                    else {
                        textInformationFrame0 = Id3Decoder.g(parsableByteArray0, v7, Id3Decoder.x(v, v2, v3, v4, v5));
                    }
                }
            }
            else if(v2 == 80 && v3 == 73 && v4 == 67) {
                textInformationFrame0 = Id3Decoder.f(parsableByteArray0, v7, 2);
            }
            else {
                goto label_72;
            }
            goto label_107;
        }
        catch(OutOfMemoryError | Exception outOfMemoryError0) {
        }
        catch(Throwable throwable0) {
            parsableByteArray0.Y(v10);
            throw throwable0;
        }
        parsableByteArray0.Y(v10);
        goto label_110;
    label_107:
        parsableByteArray0.Y(v10);
        id3Frame0 = textInformationFrame0;
        outOfMemoryError0 = null;
    label_110:
        if(id3Frame0 == null) {
            Log.o("Id3Decoder", "Failed to decode frame: id=" + Id3Decoder.x(v, v2, v3, v4, v5) + ", frameSize=" + v7, outOfMemoryError0);
        }
        return id3Frame0;
    }

    private static GeobFrame l(ParsableByteArray parsableByteArray0, int v) {
        int v1 = parsableByteArray0.L();
        Charset charset0 = Id3Decoder.w(v1);
        byte[] arr_b = new byte[v - 1];
        parsableByteArray0.n(arr_b, 0, v - 1);
        int v2 = Id3Decoder.z(arr_b, 0);
        String s = MimeTypes.v(new String(arr_b, 0, v2, f.b));
        int v3 = Id3Decoder.y(arr_b, v2 + 1, v1);
        String s1 = Id3Decoder.p(arr_b, v2 + 1, v3, charset0);
        int v4 = v3 + Id3Decoder.v(v1);
        int v5 = Id3Decoder.y(arr_b, v4, v1);
        return new GeobFrame(s, s1, Id3Decoder.p(arr_b, v4, v5, charset0), Id3Decoder.d(arr_b, v5 + Id3Decoder.v(v1), v - 1));
    }

    @Nullable
    private static Id3Header m(ParsableByteArray parsableByteArray0) {
        boolean z = false;
        if(parsableByteArray0.a() < 10) {
            Log.n("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int v = parsableByteArray0.O();
        if(v != 4801587) {
            Log.n("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", v));
            return null;
        }
        int v1 = parsableByteArray0.L();
        parsableByteArray0.Z(1);
        int v2 = parsableByteArray0.L();
        int v3 = parsableByteArray0.K();
        if(v1 != 2) {
            switch(v1) {
                case 3: {
                    if((v2 & 0x40) != 0) {
                        int v4 = parsableByteArray0.s();
                        parsableByteArray0.Z(v4);
                        v3 -= v4 + 4;
                    }
                    break;
                }
                case 4: {
                    if((v2 & 0x40) != 0) {
                        int v5 = parsableByteArray0.K();
                        parsableByteArray0.Z(v5 - 4);
                        v3 -= v5;
                    }
                    if((v2 & 16) != 0) {
                        v3 -= 10;
                    }
                    break;
                }
                default: {
                    Log.n("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + v1);
                    return null;
                }
            }
        }
        else if((v2 & 0x40) != 0) {
            Log.n("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
            return null;
        }
        if(v1 < 4 && (v2 & 0x80) != 0) {
            z = true;
        }
        return new Id3Header(v1, z, v3);
    }

    private static MlltFrame n(ParsableByteArray parsableByteArray0, int v) {
        int v1 = parsableByteArray0.R();
        int v2 = parsableByteArray0.O();
        int v3 = parsableByteArray0.O();
        int v4 = parsableByteArray0.L();
        int v5 = parsableByteArray0.L();
        ParsableBitArray parsableBitArray0 = new ParsableBitArray();
        parsableBitArray0.n(parsableByteArray0);
        int v6 = (v - 10) * 8 / (v4 + v5);
        int[] arr_v = new int[v6];
        int[] arr_v1 = new int[v6];
        for(int v7 = 0; v7 < v6; ++v7) {
            int v8 = parsableBitArray0.h(v4);
            int v9 = parsableBitArray0.h(v5);
            arr_v[v7] = v8;
            arr_v1[v7] = v9;
        }
        return new MlltFrame(v1, v2, v3, arr_v, arr_v1);
    }

    private static PrivFrame o(ParsableByteArray parsableByteArray0, int v) {
        byte[] arr_b = new byte[v];
        parsableByteArray0.n(arr_b, 0, v);
        int v1 = Id3Decoder.z(arr_b, 0);
        return new PrivFrame(new String(arr_b, 0, v1, f.b), Id3Decoder.d(arr_b, v1 + 1, v));
    }

    private static String p(byte[] arr_b, int v, int v1, Charset charset0) {
        return v1 <= v || v1 > arr_b.length ? "" : new String(arr_b, v, v1 - v, charset0);
    }

    @Nullable
    private static TextInformationFrame q(ParsableByteArray parsableByteArray0, int v, String s) {
        if(v < 1) {
            return null;
        }
        int v1 = parsableByteArray0.L();
        byte[] arr_b = new byte[v - 1];
        parsableByteArray0.n(arr_b, 0, v - 1);
        return new TextInformationFrame(s, null, Id3Decoder.r(arr_b, v1, 0));
    }

    private static O2 r(byte[] arr_b, int v, int v1) {
        if(v1 >= arr_b.length) {
            return O2.B("");
        }
        a o2$a0 = O2.n();
        for(int v2 = Id3Decoder.y(arr_b, v1, v); v1 < v2; v2 = Id3Decoder.y(arr_b, v1, v)) {
            o2$a0.j(new String(arr_b, v1, v2 - v1, Id3Decoder.w(v)));
            v1 = Id3Decoder.v(v) + v2;
        }
        O2 o20 = o2$a0.n();
        return o20.isEmpty() ? O2.B("") : o20;
    }

    @Nullable
    private static TextInformationFrame s(ParsableByteArray parsableByteArray0, int v) {
        if(v < 1) {
            return null;
        }
        int v1 = parsableByteArray0.L();
        byte[] arr_b = new byte[v - 1];
        parsableByteArray0.n(arr_b, 0, v - 1);
        int v2 = Id3Decoder.y(arr_b, 0, v1);
        return new TextInformationFrame("TXXX", new String(arr_b, 0, v2, Id3Decoder.w(v1)), Id3Decoder.r(arr_b, v1, v2 + Id3Decoder.v(v1)));
    }

    private static UrlLinkFrame t(ParsableByteArray parsableByteArray0, int v, String s) {
        byte[] arr_b = new byte[v];
        parsableByteArray0.n(arr_b, 0, v);
        return new UrlLinkFrame(s, null, new String(arr_b, 0, Id3Decoder.z(arr_b, 0), f.b));
    }

    @Nullable
    private static UrlLinkFrame u(ParsableByteArray parsableByteArray0, int v) {
        if(v < 1) {
            return null;
        }
        int v1 = parsableByteArray0.L();
        byte[] arr_b = new byte[v - 1];
        parsableByteArray0.n(arr_b, 0, v - 1);
        int v2 = Id3Decoder.y(arr_b, 0, v1);
        int v3 = v2 + Id3Decoder.v(v1);
        return new UrlLinkFrame("WXXX", new String(arr_b, 0, v2, Id3Decoder.w(v1)), Id3Decoder.p(arr_b, v3, Id3Decoder.z(arr_b, v3), f.b));
    }

    private static int v(int v) {
        return v == 0 || v == 3 ? 1 : 2;
    }

    private static Charset w(int v) {
        switch(v) {
            case 1: {
                return f.f;
            }
            case 2: {
                return f.d;
            }
            case 3: {
                return f.c;
            }
            default: {
                return f.b;
            }
        }
    }

    private static String x(int v, int v1, int v2, int v3, int v4) {
        return v == 2 ? String.format(Locale.US, "%c%c%c", v1, v2, v3) : String.format(Locale.US, "%c%c%c%c", v1, v2, v3, v4);
    }

    private static int y(byte[] arr_b, int v, int v1) {
        int v2 = Id3Decoder.z(arr_b, v);
        if(v1 != 0 && v1 != 3) {
            while(v2 < arr_b.length - 1) {
                if((v2 - v) % 2 == 0 && arr_b[v2 + 1] == 0) {
                    return v2;
                }
                v2 = Id3Decoder.z(arr_b, v2 + 1);
            }
            return arr_b.length;
        }
        return v2;
    }

    private static int z(byte[] arr_b, int v) {
        while(v < arr_b.length) {
            if(arr_b[v] == 0) {
                return v;
            }
            ++v;
        }
        return arr_b.length;
    }
}

