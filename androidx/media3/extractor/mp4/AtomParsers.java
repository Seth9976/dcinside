package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.extractor.AacUtil.Config;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import com.google.common.base.t;
import com.google.common.collect.O2;
import com.google.common.primitives.l;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class AtomParsers {
    static final class ChunkIterator {
        public final int a;
        public int b;
        public int c;
        public long d;
        private final boolean e;
        private final ParsableByteArray f;
        private final ParsableByteArray g;
        private int h;
        private int i;

        public ChunkIterator(ParsableByteArray parsableByteArray0, ParsableByteArray parsableByteArray1, boolean z) throws ParserException {
            this.g = parsableByteArray0;
            this.f = parsableByteArray1;
            this.e = z;
            parsableByteArray1.Y(12);
            this.a = parsableByteArray1.P();
            parsableByteArray0.Y(12);
            this.i = parsableByteArray0.P();
            ExtractorUtil.a(parsableByteArray0.s() == 1, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            int v = this.b + 1;
            this.b = v;
            if(v == this.a) {
                return false;
            }
            this.d = this.e ? this.f.Q() : this.f.N();
            if(this.b == this.h) {
                this.c = this.g.P();
                this.g.Z(4);
                int v1 = this.i - 1;
                this.i = v1;
                this.h = v1 <= 0 ? -1 : this.g.P() - 1;
            }
            return true;
        }
    }

    static final class EsdsData {
        private final String a;
        private final byte[] b;
        private final long c;
        private final long d;

        public EsdsData(String s, byte[] arr_b, long v, long v1) {
            this.a = s;
            this.b = arr_b;
            this.c = v;
            this.d = v1;
        }
    }

    interface SampleSizeBox {
        int a();

        int b();

        int c();
    }

    static final class StsdData {
        public final TrackEncryptionBox[] a;
        @Nullable
        public Format b;
        public int c;
        public int d;
        public static final int e = 8;

        public StsdData(int v) {
            this.a = new TrackEncryptionBox[v];
            this.d = 0;
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final int a;
        private final int b;
        private final ParsableByteArray c;

        public StszSampleSizeBox(LeafAtom atom$LeafAtom0, Format format0) {
            ParsableByteArray parsableByteArray0 = atom$LeafAtom0.G1;
            this.c = parsableByteArray0;
            parsableByteArray0.Y(12);
            int v = parsableByteArray0.P();
            if("audio/raw".equals(format0.n)) {
                int v1 = Util.C0(format0.D, format0.B);
                if(v == 0 || v % v1 != 0) {
                    Log.n("AtomParsers", "Audio sample size mismatch. stsd sample size: " + v1 + ", stsz sample size: " + v);
                    v = v1;
                }
            }
            if(v == 0) {
                v = -1;
            }
            this.a = v;
            this.b = parsableByteArray0.P();
        }

        @Override  // androidx.media3.extractor.mp4.AtomParsers$SampleSizeBox
        public int a() {
            return this.a == -1 ? this.c.P() : this.a;
        }

        @Override  // androidx.media3.extractor.mp4.AtomParsers$SampleSizeBox
        public int b() {
            return this.b;
        }

        @Override  // androidx.media3.extractor.mp4.AtomParsers$SampleSizeBox
        public int c() {
            return this.a;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray a;
        private final int b;
        private final int c;
        private int d;
        private int e;

        public Stz2SampleSizeBox(LeafAtom atom$LeafAtom0) {
            this.a = atom$LeafAtom0.G1;
            atom$LeafAtom0.G1.Y(12);
            this.c = atom$LeafAtom0.G1.P() & 0xFF;
            this.b = atom$LeafAtom0.G1.P();
        }

        @Override  // androidx.media3.extractor.mp4.AtomParsers$SampleSizeBox
        public int a() {
            int v = this.c;
            if(v == 8) {
                return this.a.L();
            }
            if(v == 16) {
                return this.a.R();
            }
            int v1 = this.d;
            this.d = v1 + 1;
            if(v1 % 2 == 0) {
                int v2 = this.a.L();
                this.e = v2;
                return (v2 & 0xF0) >> 4;
            }
            return this.e & 15;
        }

        @Override  // androidx.media3.extractor.mp4.AtomParsers$SampleSizeBox
        public int b() {
            return this.b;
        }

        @Override  // androidx.media3.extractor.mp4.AtomParsers$SampleSizeBox
        public int c() {
            return -1;
        }
    }

    static final class TkhdData {
        private final int a;
        private final long b;
        private final int c;

        public TkhdData(int v, long v1, int v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
        }
    }

    private static final String a = "AtomParsers";
    private static final int b = 0x636C6370;
    private static final int c = 0x6D647461;
    private static final int d = 0x6D657461;
    private static final int e = 1852009571;
    private static final int f = 1852009592;
    private static final int g = 0x7362746C;
    private static final int h = 0x736F756E;
    private static final int i = 1937072756;
    private static final int j = 1952807028;
    private static final int k = 0x76696465;
    private static final int l = 4;
    private static final byte[] m;

    static {
        AtomParsers.m = new byte[]{0x4F, 0x70, 0x75, 0x73, 72, 101, 97, 100};
    }

    @Nullable
    private static Track A(ContainerAtom atom$ContainerAtom0, LeafAtom atom$LeafAtom0, long v, @Nullable DrmInitData drmInitData0, boolean z, boolean z1) throws ParserException {
        ContainerAtom atom$ContainerAtom1 = (ContainerAtom)Assertions.g(atom$ContainerAtom0.g(0x6D646961));
        int v1 = AtomParsers.e(AtomParsers.m(((LeafAtom)Assertions.g(atom$ContainerAtom1.h(0x68646C72))).G1));
        if(v1 == -1) {
            return null;
        }
        TkhdData atomParsers$TkhdData0 = AtomParsers.z(((LeafAtom)Assertions.g(atom$ContainerAtom0.h(0x746B6864))).G1);
        long v2 = 0x8000000000000001L;
        long v3 = v == 0x8000000000000001L ? atomParsers$TkhdData0.b : v;
        long v4 = AtomParsers.r(atom$LeafAtom0.G1).c;
        if(v3 != 0x8000000000000001L) {
            v2 = Util.Z1(v3, 1000000L, v4);
        }
        ContainerAtom atom$ContainerAtom2 = (ContainerAtom)Assertions.g(((ContainerAtom)Assertions.g(atom$ContainerAtom1.g(1835626086))).g(1937007212));
        Pair pair0 = AtomParsers.o(((LeafAtom)Assertions.g(atom$ContainerAtom1.h(0x6D646864))).G1);
        LeafAtom atom$LeafAtom1 = atom$ContainerAtom2.h(1937011556);
        if(atom$LeafAtom1 == null) {
            throw ParserException.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData atomParsers$StsdData0 = AtomParsers.x(atom$LeafAtom1.G1, atomParsers$TkhdData0.a, atomParsers$TkhdData0.c, ((String)pair0.second), drmInitData0, z1);
        if(!z) {
            ContainerAtom atom$ContainerAtom3 = atom$ContainerAtom0.g(1701082227);
            if(atom$ContainerAtom3 != null) {
                Pair pair1 = AtomParsers.j(atom$ContainerAtom3);
                if(pair1 != null) {
                    return atomParsers$StsdData0.b == null ? null : new Track(atomParsers$TkhdData0.a, v1, ((long)(((Long)pair0.first))), v4, v2, atomParsers$StsdData0.b, atomParsers$StsdData0.d, atomParsers$StsdData0.a, atomParsers$StsdData0.c, ((long[])pair1.first), ((long[])pair1.second));
                }
            }
        }
        return atomParsers$StsdData0.b == null ? null : new Track(atomParsers$TkhdData0.a, v1, ((long)(((Long)pair0.first))), v4, v2, atomParsers$StsdData0.b, atomParsers$StsdData0.d, atomParsers$StsdData0.a, atomParsers$StsdData0.c, null, null);
    }

    public static List B(ContainerAtom atom$ContainerAtom0, GaplessInfoHolder gaplessInfoHolder0, long v, @Nullable DrmInitData drmInitData0, boolean z, boolean z1, t t0) throws ParserException {
        List list0 = new ArrayList();
        for(int v1 = 0; v1 < atom$ContainerAtom0.I1.size(); ++v1) {
            ContainerAtom atom$ContainerAtom1 = (ContainerAtom)atom$ContainerAtom0.I1.get(v1);
            if(atom$ContainerAtom1.a == 1953653099) {
                Track track0 = (Track)t0.apply(AtomParsers.A(atom$ContainerAtom1, ((LeafAtom)Assertions.g(atom$ContainerAtom0.h(0x6D766864))), v, drmInitData0, z, z1));
                if(track0 != null) {
                    list0.add(AtomParsers.w(track0, ((ContainerAtom)Assertions.g(((ContainerAtom)Assertions.g(((ContainerAtom)Assertions.g(atom$ContainerAtom1.g(0x6D646961))).g(1835626086))).g(1937007212))), gaplessInfoHolder0));
                }
            }
        }
        return list0;
    }

    public static Metadata C(LeafAtom atom$LeafAtom0) {
        ParsableByteArray parsableByteArray0 = atom$LeafAtom0.G1;
        parsableByteArray0.Y(8);
        Metadata metadata0 = new Metadata(new Entry[0]);
        while(parsableByteArray0.a() >= 8) {
            int v = parsableByteArray0.f();
            int v1 = parsableByteArray0.s();
            int v2 = parsableByteArray0.s();
            if(v2 == 0x6D657461) {
                parsableByteArray0.Y(v);
                metadata0 = metadata0.c(AtomParsers.D(parsableByteArray0, v + v1));
            }
            else {
                switch(v2) {
                    case 0xA978797A: {
                        metadata0 = metadata0.c(AtomParsers.F(parsableByteArray0));
                        break;
                    }
                    case 1936553057: {
                        parsableByteArray0.Y(v);
                        metadata0 = metadata0.c(SmtaAtomUtil.b(parsableByteArray0, v + v1));
                    }
                }
            }
            parsableByteArray0.Y(v + v1);
        }
        return metadata0;
    }

    @Nullable
    private static Metadata D(ParsableByteArray parsableByteArray0, int v) {
        parsableByteArray0.Z(8);
        AtomParsers.f(parsableByteArray0);
        while(parsableByteArray0.f() < v) {
            int v1 = parsableByteArray0.f();
            int v2 = parsableByteArray0.s();
            if(parsableByteArray0.s() == 0x696C7374) {
                parsableByteArray0.Y(v1);
                return AtomParsers.n(parsableByteArray0, v1 + v2);
            }
            parsableByteArray0.Y(v1 + v2);
        }
        return null;
    }

    private static void E(ParsableByteArray parsableByteArray0, int v, int v1, int v2, int v3, int v4, @Nullable DrmInitData drmInitData0, StsdData atomParsers$StsdData0, int v5) throws ParserException {
        int v20;
        DrmInitData drmInitData1;
        String s;
        parsableByteArray0.Y(v1 + 16);
        parsableByteArray0.Z(16);
        int v6 = parsableByteArray0.R();
        int v7 = parsableByteArray0.R();
        parsableByteArray0.Z(50);
        int v8 = parsableByteArray0.f();
        int v9 = v;
        if(v9 == 1701733238) {
            Pair pair0 = AtomParsers.u(parsableByteArray0, v1, v2);
            if(pair0 != null) {
                v9 = (int)(((Integer)pair0.first));
                drmInitData0 = drmInitData0 == null ? null : drmInitData0.o(((TrackEncryptionBox)pair0.second).b);
                atomParsers$StsdData0.a[v5] = (TrackEncryptionBox)pair0.second;
            }
            parsableByteArray0.Y(v8);
        }
        switch(v9) {
            case 1211250227: {
                s = "video/3gpp";
                break;
            }
            case 0x6D317620: {
                s = "video/mpeg";
                break;
            }
            default: {
                s = null;
            }
        }
        float f = 1.0f;
        int v10 = 8;
        int v11 = 8;
        List list0 = null;
        String s1 = null;
        byte[] arr_b = null;
        int v12 = -1;
        int v13 = -1;
        int v14 = -1;
        int v15 = -1;
        int v16 = -1;
        ByteBuffer byteBuffer0 = null;
        EsdsData atomParsers$EsdsData0 = null;
        boolean z = false;
        while(v8 - v1 < v2) {
            parsableByteArray0.Y(v8);
            int v17 = parsableByteArray0.f();
            int v18 = parsableByteArray0.s();
            if(v18 == 0 && parsableByteArray0.f() - v1 == v2) {
                break;
            }
            ExtractorUtil.a(v18 > 0, "childAtomSize must be positive");
            int v19 = parsableByteArray0.s();
            switch(v19) {
                case 0x61763143: {
                    byte[] arr_b2 = new byte[v18 - 8];
                    parsableByteArray0.n(arr_b2, 0, v18 - 8);
                    list0 = O2.B(arr_b2);
                    parsableByteArray0.Y(v17 + 8);
                    ColorInfo colorInfo0 = AtomParsers.h(parsableByteArray0);
                    v16 = colorInfo0.c;
                    drmInitData1 = drmInitData0;
                    v20 = v9;
                    v14 = colorInfo0.a;
                    v15 = colorInfo0.b;
                    s = "video/av01";
                    v10 = colorInfo0.e;
                    v11 = colorInfo0.f;
                    break;
                }
                case 1668050025: {
                    if(byteBuffer0 == null) {
                        byteBuffer0 = AtomParsers.a();
                    }
                    byteBuffer0.position(21);
                    byteBuffer0.putShort(parsableByteArray0.H());
                    byteBuffer0.putShort(parsableByteArray0.H());
                    drmInitData1 = drmInitData0;
                    v20 = v9;
                    break;
                }
                case 1685480259: 
                case 0x64767643: {
                    drmInitData1 = drmInitData0;
                    v20 = v9;
                    DolbyVisionConfig dolbyVisionConfig0 = DolbyVisionConfig.a(parsableByteArray0);
                    if(dolbyVisionConfig0 != null) {
                        s1 = dolbyVisionConfig0.c;
                        s = "video/dolby-vision";
                    }
                    break;
                }
                case 0x68766343: {
                    ExtractorUtil.a(s == null, null);
                    parsableByteArray0.Y(v17 + 8);
                    HevcConfig hevcConfig0 = HevcConfig.a(parsableByteArray0);
                    List list1 = hevcConfig0.a;
                    atomParsers$StsdData0.c = hevcConfig0.b;
                    if(!z) {
                        f = hevcConfig0.j;
                    }
                    drmInitData1 = drmInitData0;
                    v13 = hevcConfig0.k;
                    v20 = v9;
                    v14 = hevcConfig0.g;
                    v15 = hevcConfig0.h;
                    v16 = hevcConfig0.i;
                    s = "video/hevc";
                    v10 = hevcConfig0.e;
                    s1 = hevcConfig0.l;
                    list0 = list1;
                    v11 = hevcConfig0.f;
                    break;
                }
                case 1835295606: {
                    if(byteBuffer0 == null) {
                        byteBuffer0 = AtomParsers.a();
                    }
                    int v26 = parsableByteArray0.H();
                    int v27 = parsableByteArray0.H();
                    int v28 = parsableByteArray0.H();
                    v20 = v9;
                    int v29 = parsableByteArray0.H();
                    int v30 = parsableByteArray0.H();
                    int v31 = parsableByteArray0.H();
                    int v32 = parsableByteArray0.H();
                    drmInitData1 = drmInitData0;
                    int v33 = parsableByteArray0.H();
                    long v34 = parsableByteArray0.N();
                    long v35 = parsableByteArray0.N();
                    byteBuffer0.position(1);
                    byteBuffer0.putShort(((short)v30));
                    byteBuffer0.putShort(((short)v31));
                    byteBuffer0.putShort(((short)v26));
                    byteBuffer0.putShort(((short)v27));
                    byteBuffer0.putShort(((short)v28));
                    byteBuffer0.putShort(((short)v29));
                    byteBuffer0.putShort(((short)v32));
                    byteBuffer0.putShort(((short)v33));
                    byteBuffer0.putShort(((short)(((int)(v34 / 10000L)))));
                    byteBuffer0.putShort(((short)(((int)(v35 / 10000L)))));
                    break;
                }
                case 0x76706343: {
                    ExtractorUtil.a(s == null, null);
                    parsableByteArray0.Y(v17 + 12);
                    parsableByteArray0.Z(2);
                    int v36 = parsableByteArray0.L();
                    v14 = ColorInfo.l(parsableByteArray0.L());
                    v15 = (v36 & 1) == 0 ? 1 : 2;
                    v16 = ColorInfo.m(parsableByteArray0.L());
                    drmInitData1 = drmInitData0;
                    v10 = v36 >> 4;
                    v11 = v10;
                    v20 = v9;
                    s = v9 == 0x76703038 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    break;
                }
                default: {
                    drmInitData1 = drmInitData0;
                    v20 = v9;
                    switch(v19) {
                        case 0x636F6C72: {
                            if(v14 == -1 && v16 == -1) {
                                int v21 = parsableByteArray0.s();
                                if(v21 == 1852009571 || v21 == 1852009592) {
                                    int v22 = parsableByteArray0.R();
                                    int v23 = parsableByteArray0.R();
                                    parsableByteArray0.Z(2);
                                    v14 = ColorInfo.l(v22);
                                    v15 = v18 != 19 || (parsableByteArray0.L() & 0x80) == 0 ? 1 : 2;
                                    v16 = ColorInfo.m(v23);
                                }
                                else {
                                    Log.n("AtomParsers", "Unsupported color type: " + Atom.a(v21));
                                }
                            }
                            break;
                        }
                        case 1702061171: {
                            ExtractorUtil.a(s == null, null);
                            atomParsers$EsdsData0 = AtomParsers.k(parsableByteArray0, v17);
                            String s2 = atomParsers$EsdsData0.a;
                            byte[] arr_b1 = atomParsers$EsdsData0.b;
                            if(arr_b1 != null) {
                                list0 = O2.B(arr_b1);
                            }
                            s = s2;
                            break;
                        }
                        case 0x70617370: {
                            f = AtomParsers.s(parsableByteArray0, v17);
                            z = true;
                            break;
                        }
                        case 0x73743364: {
                            int v24 = parsableByteArray0.L();
                            parsableByteArray0.Z(3);
                            if(v24 == 0) {
                                int v25 = parsableByteArray0.L();
                                if(v25 == 0) {
                                    v12 = 0;
                                }
                                else {
                                    switch(v25) {
                                        case 1: {
                                            v12 = 1;
                                            break;
                                        }
                                        case 2: {
                                            v12 = 2;
                                            break;
                                        }
                                        case 3: {
                                            v12 = 3;
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        case 0x73763364: {
                            arr_b = AtomParsers.t(parsableByteArray0, v17, v18);
                        }
                    }
                }
            }
            v8 += v18;
            v9 = v20;
            drmInitData0 = drmInitData1;
        }
        if(s == null) {
            return;
        }
        Builder format$Builder0 = new Builder().Z(v3).o0(s).O(s1).v0(v6).Y(v7).k0(f).n0(v4).l0(arr_b).r0(v12).b0(list0).g0(v13).U(drmInitData0).P(new androidx.media3.common.ColorInfo.Builder().d(v14).c(v15).e(v16).f((byteBuffer0 == null ? null : byteBuffer0.array())).g(v10).b(v11).a());
        if(atomParsers$EsdsData0 != null) {
            format$Builder0.M(l.z(atomParsers$EsdsData0.c)).j0(l.z(atomParsers$EsdsData0.d));
        }
        atomParsers$StsdData0.b = format$Builder0.K();
    }

    @Nullable
    private static Metadata F(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.H();
        parsableByteArray0.Z(2);
        String s = parsableByteArray0.I(v);
        int v1 = Math.max(s.lastIndexOf(43), s.lastIndexOf(45));
        try {
            return new Metadata(new Entry[]{new Mp4LocationData(Float.parseFloat(s.substring(0, v1)), Float.parseFloat(s.substring(v1, s.length() - 1)))});
        }
        catch(IndexOutOfBoundsException | NumberFormatException unused_ex) {
            return null;
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] arr_v, long v, long v1, long v2) {
        return arr_v[0] <= v1 && v1 < arr_v[Util.w(4, 0, arr_v.length - 1)] && arr_v[Util.w(arr_v.length - 4, 0, arr_v.length - 1)] < v2 && v2 <= v;
    }

    private static boolean c(int v) {
        return v != 1;
    }

    private static int d(ParsableByteArray parsableByteArray0, int v, int v1, int v2) throws ParserException {
        int v3 = parsableByteArray0.f();
        ExtractorUtil.a(v3 >= v1, null);
        while(v3 - v1 < v2) {
            parsableByteArray0.Y(v3);
            int v4 = parsableByteArray0.s();
            ExtractorUtil.a(v4 > 0, "childAtomSize must be positive");
            if(parsableByteArray0.s() == v) {
                return v3;
            }
            v3 += v4;
        }
        return -1;
    }

    private static int e(int v) {
        switch(v) {
            case 0x6D657461: {
                return 5;
            }
            case 0x736F756E: {
                return 1;
            }
            case 0x636C6370: 
            case 0x7362746C: 
            case 1937072756: 
            case 1952807028: {
                return 3;
            }
            case 0x76696465: {
                return 2;
            }
            default: {
                return -1;
            }
        }
    }

    public static void f(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.f();
        parsableByteArray0.Z(4);
        if(parsableByteArray0.s() != 0x68646C72) {
            v += 4;
        }
        parsableByteArray0.Y(v);
    }

    private static void g(ParsableByteArray parsableByteArray0, int v, int v1, int v2, int v3, String s, boolean z, @Nullable DrmInitData drmInitData0, StsdData atomParsers$StsdData0, int v4) throws ParserException {
        String s1;
        int v11;
        int v10;
        int v7;
        int v6;
        int v5;
        parsableByteArray0.Y(v1 + 16);
        if(z) {
            v5 = parsableByteArray0.R();
            parsableByteArray0.Z(6);
        }
        else {
            parsableByteArray0.Z(8);
            v5 = 0;
        }
        if(v5 == 0 || v5 == 1) {
            v7 = parsableByteArray0.R();
            parsableByteArray0.Z(6);
            v6 = parsableByteArray0.M();
            parsableByteArray0.Y(parsableByteArray0.f() - 4);
            v11 = parsableByteArray0.s();
            if(v5 == 1) {
                parsableByteArray0.Z(16);
            }
            v10 = -1;
        }
        else {
            if(v5 == 2) {
                parsableByteArray0.Z(16);
                v6 = (int)Math.round(parsableByteArray0.q());
                v7 = parsableByteArray0.P();
                parsableByteArray0.Z(4);
                int v8 = parsableByteArray0.P();
                int v9 = parsableByteArray0.P();
                boolean z1 = (v9 & 2) != 0;
                if((v9 & 1) != 0) {
                    v10 = v8 == 0x20 ? 4 : -1;
                }
                else if(v8 == 8) {
                    v10 = 3;
                }
                else if(v8 != 16) {
                    switch(v8) {
                        case 24: {
                            v10 = z1 ? 0x50000000 : 21;
                            break;
                        }
                        case 0x20: {
                            v10 = z1 ? 0x60000000 : 22;
                            break;
                        }
                        default: {
                            v10 = -1;
                        }
                    }
                }
                else if(z1) {
                    v10 = 0x10000000;
                }
                else {
                    v10 = 2;
                }
                parsableByteArray0.Z(8);
                v11 = 0;
                goto label_52;
            }
            return;
        }
    label_52:
        int v12 = parsableByteArray0.f();
        int v13 = v;
        if(v13 == 1701733217) {
            Pair pair0 = AtomParsers.u(parsableByteArray0, v1, v2);
            if(pair0 != null) {
                v13 = (int)(((Integer)pair0.first));
                drmInitData0 = drmInitData0 == null ? null : drmInitData0.o(((TrackEncryptionBox)pair0.second).b);
                atomParsers$StsdData0.a[v4] = (TrackEncryptionBox)pair0.second;
            }
            parsableByteArray0.Y(v12);
        }
        switch(v13) {
            case 0x2E6D7032: 
            case 0x2E6D7033: {
                s1 = "audio/mpeg";
                break;
            }
            case 0x4F707573: {
                s1 = "audio/opus";
                break;
            }
            case 0x61632D33: {
                s1 = "audio/ac3";
                break;
            }
            case 0x61632D34: {
                s1 = "audio/ac4";
                break;
            }
            case 0x616C6163: {
                s1 = "audio/alac";
                break;
            }
            case 0x616C6177: {
                s1 = "audio/g711-alaw";
                break;
            }
            case 0x64747363: {
                s1 = "audio/vnd.dts";
                break;
            }
            case 0x64747365: {
                s1 = "audio/vnd.dts.hd;profile=lbr";
                break;
            }
            case 1685353320: 
            case 0x6474736C: {
                s1 = "audio/vnd.dts.hd";
                break;
            }
            case 0x64747378: {
                s1 = "audio/vnd.dts.uhd;profile=p2";
                break;
            }
            case 1700998451: {
                s1 = "audio/eac3";
                break;
            }
            case 0x664C6143: {
                s1 = "audio/flac";
                break;
            }
            case 0x6C70636D: {
                if(v10 == -1) {
                    s1 = "audio/raw";
                    v10 = 2;
                }
                else {
                    s1 = "audio/raw";
                }
                break;
            }
            case 0x6D686131: {
                s1 = "audio/mha1";
                break;
            }
            case 1835560241: {
                s1 = "audio/mhm1";
                break;
            }
            case 0x6D6C7061: {
                s1 = "audio/true-hd";
                break;
            }
            case 1935764850: {
                s1 = "audio/3gpp";
                break;
            }
            case 0x73617762: {
                s1 = "audio/amr-wb";
                break;
            }
            case 0x736F7774: {
                s1 = "audio/raw";
                v10 = 2;
                break;
            }
            case 0x74776F73: {
                s1 = "audio/raw";
                v10 = 0x10000000;
                break;
            }
            case 1970037111: {
                s1 = "audio/g711-mlaw";
                break;
            }
            default: {
                s1 = null;
            }
        }
        String s2 = null;
        List list0 = null;
        EsdsData atomParsers$EsdsData0 = null;
        while(v12 - v1 < v2) {
            parsableByteArray0.Y(v12);
            int v14 = parsableByteArray0.s();
            ExtractorUtil.a(v14 > 0, "childAtomSize must be positive");
            int v15 = parsableByteArray0.s();
            if(v15 == 0x6D686143) {
                parsableByteArray0.Y(v12 + 8);
                parsableByteArray0.Z(1);
                int v16 = parsableByteArray0.L();
                parsableByteArray0.Z(1);
                s2 = Objects.equals(s1, "audio/mhm1") ? String.format("mhm1.%02X", v16) : String.format("mha1.%02X", v16);
                int v17 = parsableByteArray0.R();
                byte[] arr_b = new byte[v17];
                parsableByteArray0.n(arr_b, 0, v17);
                list0 = list0 == null ? O2.B(arr_b) : O2.C(arr_b, ((byte[])list0.get(0)));
            }
            else {
            alab1:
                switch(v15) {
                    case 1702061171: {
                    label_176:
                        int v19 = v15 == 1702061171 ? v12 : AtomParsers.d(parsableByteArray0, 1702061171, v12, v14);
                        if(v19 != -1) {
                            atomParsers$EsdsData0 = AtomParsers.k(parsableByteArray0, v19);
                            s1 = atomParsers$EsdsData0.a;
                            byte[] arr_b4 = atomParsers$EsdsData0.b;
                            if(arr_b4 != null) {
                                if("audio/vorbis".equals(s1)) {
                                    list0 = VorbisUtil.e(arr_b4);
                                }
                                else {
                                    if("audio/mp4a-latm".equals(s1)) {
                                        Config aacUtil$Config0 = AacUtil.f(arr_b4);
                                        v7 = aacUtil$Config0.b;
                                        s2 = aacUtil$Config0.c;
                                        v6 = aacUtil$Config0.a;
                                    }
                                    list0 = O2.B(arr_b4);
                                }
                            }
                        }
                        break;
                    }
                    case 1835557200: {
                        parsableByteArray0.Y(v12 + 8);
                        int v20 = parsableByteArray0.L();
                        if(v20 > 0) {
                            byte[] arr_b5 = new byte[v20];
                            parsableByteArray0.n(arr_b5, 0, v20);
                            list0 = list0 == null ? O2.B(arr_b5) : O2.C(((byte[])list0.get(0)), arr_b5);
                        }
                        break;
                    }
                    default: {
                        if(!z || v15 != 2002876005) {
                            switch(v15) {
                                case 0x616C6163: {
                                    byte[] arr_b1 = new byte[v14 - 12];
                                    parsableByteArray0.Y(v12 + 12);
                                    parsableByteArray0.n(arr_b1, 0, v14 - 12);
                                    Pair pair1 = CodecSpecificDataUtil.h(arr_b1);
                                    int v18 = (int)(((Integer)pair1.first));
                                    v7 = (int)(((Integer)pair1.second));
                                    list0 = O2.B(arr_b1);
                                    v6 = v18;
                                    break alab1;
                                }
                                case 0x644F7073: {
                                    byte[] arr_b2 = Arrays.copyOf(AtomParsers.m, AtomParsers.m.length + (v14 - 8));
                                    parsableByteArray0.Y(v12 + 8);
                                    parsableByteArray0.n(arr_b2, AtomParsers.m.length, v14 - 8);
                                    list0 = OpusUtil.a(arr_b2);
                                    break alab1;
                                }
                                case 1684103987: {
                                    parsableByteArray0.Y(v12 + 8);
                                    atomParsers$StsdData0.b = Ac3Util.d(parsableByteArray0, Integer.toString(v3), s, drmInitData0);
                                    break alab1;
                                }
                                case 1684103988: {
                                    parsableByteArray0.Y(v12 + 8);
                                    atomParsers$StsdData0.b = Ac4Util.b(parsableByteArray0, Integer.toString(v3), s, drmInitData0);
                                    break alab1;
                                }
                                case 0x64656333: {
                                    parsableByteArray0.Y(v12 + 8);
                                    atomParsers$StsdData0.b = Ac3Util.h(parsableByteArray0, Integer.toString(v3), s, drmInitData0);
                                    break alab1;
                                }
                                case 0x64664C61: {
                                    byte[] arr_b3 = new byte[v14 - 8];
                                    arr_b3[0] = 102;
                                    arr_b3[1] = 76;
                                    arr_b3[2] = 97;
                                    arr_b3[3] = 67;
                                    parsableByteArray0.Y(v12 + 12);
                                    parsableByteArray0.n(arr_b3, 4, v14 - 12);
                                    list0 = O2.B(arr_b3);
                                    break alab1;
                                }
                                case 0x646D6C70: {
                                    if(v11 <= 0) {
                                        throw ParserException.a(("Invalid sample rate for Dolby TrueHD MLP stream: " + v11), null);
                                    }
                                    v6 = v11;
                                    v7 = 2;
                                    break alab1;
                                }
                                case 1684305011: 
                                case 0x75647473: {
                                    atomParsers$StsdData0.b = new Builder().Z(v3).o0(s1).N(v7).p0(v6).U(drmInitData0).e0(s).K();
                                    break alab1;
                                }
                                default: {
                                    break alab1;
                                }
                            }
                        }
                        goto label_176;
                    }
                }
            }
            v12 += v14;
        }
        if(atomParsers$StsdData0.b == null && s1 != null) {
            Builder format$Builder0 = new Builder().Z(v3).o0(s1).O(s2).N(v7).p0(v6).i0(v10).b0(list0).U(drmInitData0).e0(s);
            if(atomParsers$EsdsData0 != null) {
                format$Builder0.M(l.z(atomParsers$EsdsData0.c)).j0(l.z(atomParsers$EsdsData0.d));
            }
            atomParsers$StsdData0.b = format$Builder0.K();
        }
    }

    private static ColorInfo h(ParsableByteArray parsableByteArray0) {
        androidx.media3.common.ColorInfo.Builder colorInfo$Builder0 = new androidx.media3.common.ColorInfo.Builder();
        ParsableBitArray parsableBitArray0 = new ParsableBitArray(parsableByteArray0.e());
        parsableBitArray0.q(parsableByteArray0.f() * 8);
        int v = 1;
        parsableBitArray0.t(1);
        int v1 = parsableBitArray0.h(3);
        parsableBitArray0.s(6);
        boolean z = parsableBitArray0.g();
        boolean z1 = parsableBitArray0.g();
        int v2 = 10;
        if(v1 == 2 && z) {
            colorInfo$Builder0.g((z1 ? 12 : 10));
            if(z1) {
                v2 = 12;
            }
            colorInfo$Builder0.b(v2);
        }
        else if(v1 <= 2) {
            colorInfo$Builder0.g((z ? 10 : 8));
            if(!z) {
                v2 = 8;
            }
            colorInfo$Builder0.b(v2);
        }
        parsableBitArray0.s(13);
        parsableBitArray0.r();
        int v3 = parsableBitArray0.h(4);
        if(v3 != 1) {
            Log.h("AtomParsers", "Unsupported obu_type: " + v3);
            return colorInfo$Builder0.a();
        }
        if(parsableBitArray0.g()) {
            Log.h("AtomParsers", "Unsupported obu_extension_flag");
            return colorInfo$Builder0.a();
        }
        boolean z2 = parsableBitArray0.g();
        parsableBitArray0.r();
        if(z2 && parsableBitArray0.h(8) > 0x7F) {
            Log.h("AtomParsers", "Excessive obu_size");
            return colorInfo$Builder0.a();
        }
        int v4 = parsableBitArray0.h(3);
        parsableBitArray0.r();
        if(parsableBitArray0.g()) {
            Log.h("AtomParsers", "Unsupported reduced_still_picture_header");
            return colorInfo$Builder0.a();
        }
        if(parsableBitArray0.g()) {
            Log.h("AtomParsers", "Unsupported timing_info_present_flag");
            return colorInfo$Builder0.a();
        }
        if(parsableBitArray0.g()) {
            Log.h("AtomParsers", "Unsupported initial_display_delay_present_flag");
            return colorInfo$Builder0.a();
        }
        int v5 = parsableBitArray0.h(5);
        boolean z3 = false;
        for(int v6 = 0; v6 <= v5; ++v6) {
            parsableBitArray0.s(12);
            if(parsableBitArray0.h(5) > 7) {
                parsableBitArray0.r();
            }
        }
        int v7 = parsableBitArray0.h(4);
        int v8 = parsableBitArray0.h(4);
        parsableBitArray0.s(v7 + 1);
        parsableBitArray0.s(v8 + 1);
        if(parsableBitArray0.g()) {
            parsableBitArray0.s(7);
        }
        parsableBitArray0.s(7);
        boolean z4 = parsableBitArray0.g();
        if(z4) {
            parsableBitArray0.s(2);
        }
        if((parsableBitArray0.g() ? 2 : parsableBitArray0.h(1)) > 0 && !parsableBitArray0.g()) {
            parsableBitArray0.s(1);
        }
        if(z4) {
            parsableBitArray0.s(3);
        }
        parsableBitArray0.s(3);
        if(v4 == 2 && parsableBitArray0.g()) {
            parsableBitArray0.r();
        }
        if(v4 != 1 && parsableBitArray0.g()) {
            z3 = true;
        }
        if(parsableBitArray0.g()) {
            int v9 = parsableBitArray0.h(8);
            int v10 = parsableBitArray0.h(8);
            int v11 = z3 || v9 != 1 || v10 != 13 || parsableBitArray0.h(8) != 0 ? parsableBitArray0.h(1) : 1;
            androidx.media3.common.ColorInfo.Builder colorInfo$Builder1 = colorInfo$Builder0.d(ColorInfo.l(v9));
            if(v11 != 1) {
                v = 2;
            }
            colorInfo$Builder1.c(v).e(ColorInfo.m(v10));
        }
        return colorInfo$Builder0.a();
    }

    @Nullable
    static Pair i(ParsableByteArray parsableByteArray0, int v, int v1) throws ParserException {
        int v2 = v + 8;
        boolean z = false;
        String s = null;
        Integer integer0 = null;
        int v3 = -1;
        int v4 = 0;
        while(v2 - v < v1) {
            parsableByteArray0.Y(v2);
            int v5 = parsableByteArray0.s();
            int v6 = parsableByteArray0.s();
            if(v6 == 0x66726D61) {
                integer0 = parsableByteArray0.s();
            }
            else {
                switch(v6) {
                    case 0x73636869: {
                        v3 = v2;
                        v4 = v5;
                        break;
                    }
                    case 0x7363686D: {
                        parsableByteArray0.Z(4);
                        s = parsableByteArray0.I(4);
                    }
                }
            }
            v2 += v5;
        }
        if(!"cenc".equals(s) && !"cbc1".equals(s) && !"cens".equals(s) && !"cbcs".equals(s)) {
            return null;
        }
        ExtractorUtil.a(integer0 != null, "frma atom is mandatory");
        ExtractorUtil.a(v3 != -1, "schi atom is mandatory");
        TrackEncryptionBox trackEncryptionBox0 = AtomParsers.v(parsableByteArray0, v3, v4, s);
        if(trackEncryptionBox0 != null) {
            z = true;
        }
        ExtractorUtil.a(z, "tenc atom is mandatory");
        return Pair.create(integer0, trackEncryptionBox0);
    }

    @Nullable
    private static Pair j(ContainerAtom atom$ContainerAtom0) {
        LeafAtom atom$LeafAtom0 = atom$ContainerAtom0.h(1701606260);
        if(atom$LeafAtom0 == null) {
            return null;
        }
        ParsableByteArray parsableByteArray0 = atom$LeafAtom0.G1;
        parsableByteArray0.Y(8);
        int v = Atom.c(parsableByteArray0.s());
        int v1 = parsableByteArray0.P();
        long[] arr_v = new long[v1];
        long[] arr_v1 = new long[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_v[v2] = v == 1 ? parsableByteArray0.Q() : parsableByteArray0.N();
            arr_v1[v2] = v == 1 ? parsableByteArray0.E() : ((long)parsableByteArray0.s());
            if(parsableByteArray0.H() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray0.Z(2);
        }
        return Pair.create(arr_v, arr_v1);
    }

    private static EsdsData k(ParsableByteArray parsableByteArray0, int v) {
        parsableByteArray0.Y(v + 12);
        parsableByteArray0.Z(1);
        AtomParsers.l(parsableByteArray0);
        parsableByteArray0.Z(2);
        int v1 = parsableByteArray0.L();
        if((v1 & 0x80) != 0) {
            parsableByteArray0.Z(2);
        }
        if((v1 & 0x40) != 0) {
            parsableByteArray0.Z(parsableByteArray0.L());
        }
        if((v1 & 0x20) != 0) {
            parsableByteArray0.Z(2);
        }
        parsableByteArray0.Z(1);
        AtomParsers.l(parsableByteArray0);
        String s = MimeTypes.h(parsableByteArray0.L());
        if(!"audio/mpeg".equals(s) && !"audio/vnd.dts".equals(s) && !"audio/vnd.dts.hd".equals(s)) {
            parsableByteArray0.Z(4);
            long v2 = parsableByteArray0.N();
            long v3 = parsableByteArray0.N();
            parsableByteArray0.Z(1);
            int v4 = AtomParsers.l(parsableByteArray0);
            byte[] arr_b = new byte[v4];
            parsableByteArray0.n(arr_b, 0, v4);
            return new EsdsData(s, arr_b, (v3 <= 0L ? -1L : v3), (v2 <= 0L ? -1L : v2));
        }
        return new EsdsData(s, null, -1L, -1L);
    }

    private static int l(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.L();
        int v1;
        for(v1 = v & 0x7F; (v & 0x80) == 0x80; v1 = v1 << 7 | v & 0x7F) {
            v = parsableByteArray0.L();
        }
        return v1;
    }

    private static int m(ParsableByteArray parsableByteArray0) {
        parsableByteArray0.Y(16);
        return parsableByteArray0.s();
    }

    @Nullable
    private static Metadata n(ParsableByteArray parsableByteArray0, int v) {
        parsableByteArray0.Z(8);
        ArrayList arrayList0 = new ArrayList();
        while(parsableByteArray0.f() < v) {
            Entry metadata$Entry0 = MetadataUtil.c(parsableByteArray0);
            if(metadata$Entry0 != null) {
                arrayList0.add(metadata$Entry0);
            }
        }
        return arrayList0.isEmpty() ? null : new Metadata(arrayList0);
    }

    private static Pair o(ParsableByteArray parsableByteArray0) {
        int v = 8;
        parsableByteArray0.Y(8);
        int v1 = Atom.c(parsableByteArray0.s());
        parsableByteArray0.Z((v1 == 0 ? 8 : 16));
        long v2 = parsableByteArray0.N();
        if(v1 == 0) {
            v = 4;
        }
        parsableByteArray0.Z(v);
        int v3 = parsableByteArray0.R();
        return Pair.create(v2, "" + ((char)((v3 >> 10 & 0x1F) + 0x60)) + ((char)((v3 >> 5 & 0x1F) + 0x60)) + ((char)((v3 & 0x1F) + 0x60)));
    }

    @Nullable
    public static Metadata p(ContainerAtom atom$ContainerAtom0) {
        LeafAtom atom$LeafAtom0 = atom$ContainerAtom0.h(0x68646C72);
        LeafAtom atom$LeafAtom1 = atom$ContainerAtom0.h(1801812339);
        LeafAtom atom$LeafAtom2 = atom$ContainerAtom0.h(0x696C7374);
        if(atom$LeafAtom0 != null && atom$LeafAtom1 != null && atom$LeafAtom2 != null && AtomParsers.m(atom$LeafAtom0.G1) == 0x6D647461) {
            ParsableByteArray parsableByteArray0 = atom$LeafAtom1.G1;
            parsableByteArray0.Y(12);
            int v = parsableByteArray0.s();
            String[] arr_s = new String[v];
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = parsableByteArray0.s();
                parsableByteArray0.Z(4);
                arr_s[v1] = parsableByteArray0.I(v2 - 8);
            }
            ParsableByteArray parsableByteArray1 = atom$LeafAtom2.G1;
            parsableByteArray1.Y(8);
            ArrayList arrayList0 = new ArrayList();
            while(parsableByteArray1.a() > 8) {
                int v3 = parsableByteArray1.f();
                int v4 = parsableByteArray1.s();
                int v5 = parsableByteArray1.s() - 1;
                if(v5 < 0 || v5 >= v) {
                    Log.n("AtomParsers", "Skipped metadata with unknown key index: " + v5);
                }
                else {
                    MdtaMetadataEntry mdtaMetadataEntry0 = MetadataUtil.h(parsableByteArray1, v3 + v4, arr_s[v5]);
                    if(mdtaMetadataEntry0 != null) {
                        arrayList0.add(mdtaMetadataEntry0);
                    }
                }
                parsableByteArray1.Y(v3 + v4);
            }
            return arrayList0.isEmpty() ? null : new Metadata(arrayList0);
        }
        return null;
    }

    private static void q(ParsableByteArray parsableByteArray0, int v, int v1, int v2, StsdData atomParsers$StsdData0) {
        parsableByteArray0.Y(v1 + 16);
        if(v == 0x6D657474) {
            parsableByteArray0.F();
            String s = parsableByteArray0.F();
            if(s != null) {
                atomParsers$StsdData0.b = new Builder().Z(v2).o0(s).K();
            }
        }
    }

    public static Mp4TimestampData r(ParsableByteArray parsableByteArray0) {
        parsableByteArray0.Y(8);
        return Atom.c(parsableByteArray0.s()) == 0 ? new Mp4TimestampData(parsableByteArray0.N(), parsableByteArray0.N(), parsableByteArray0.N()) : new Mp4TimestampData(parsableByteArray0.E(), parsableByteArray0.E(), parsableByteArray0.N());
    }

    private static float s(ParsableByteArray parsableByteArray0, int v) {
        parsableByteArray0.Y(v + 8);
        return ((float)parsableByteArray0.P()) / ((float)parsableByteArray0.P());
    }

    @Nullable
    private static byte[] t(ParsableByteArray parsableByteArray0, int v, int v1) {
        for(int v2 = v + 8; v2 - v < v1; v2 += v3) {
            parsableByteArray0.Y(v2);
            int v3 = parsableByteArray0.s();
            if(parsableByteArray0.s() == 0x70726F6A) {
                return Arrays.copyOfRange(parsableByteArray0.e(), v2, v3 + v2);
            }
        }
        return null;
    }

    @Nullable
    private static Pair u(ParsableByteArray parsableByteArray0, int v, int v1) throws ParserException {
        for(int v2 = parsableByteArray0.f(); v2 - v < v1; v2 += v3) {
            parsableByteArray0.Y(v2);
            int v3 = parsableByteArray0.s();
            ExtractorUtil.a(v3 > 0, "childAtomSize must be positive");
            if(parsableByteArray0.s() == 0x73696E66) {
                Pair pair0 = AtomParsers.i(parsableByteArray0, v2, v3);
                if(pair0 != null) {
                    return pair0;
                }
            }
        }
        return null;
    }

    @Nullable
    private static TrackEncryptionBox v(ParsableByteArray parsableByteArray0, int v, int v1, String s) {
        int v6;
        int v5;
        for(int v2 = v + 8; true; v2 += v3) {
            byte[] arr_b = null;
            if(v2 - v >= v1) {
                break;
            }
            parsableByteArray0.Y(v2);
            int v3 = parsableByteArray0.s();
            if(parsableByteArray0.s() == 1952804451) {
                int v4 = Atom.c(parsableByteArray0.s());
                parsableByteArray0.Z(1);
                if(v4 == 0) {
                    parsableByteArray0.Z(1);
                    v5 = 0;
                    v6 = 0;
                }
                else {
                    int v7 = parsableByteArray0.L();
                    v6 = v7 & 15;
                    v5 = (v7 & 0xF0) >> 4;
                }
                boolean z = parsableByteArray0.L() == 1;
                int v8 = parsableByteArray0.L();
                byte[] arr_b1 = new byte[16];
                parsableByteArray0.n(arr_b1, 0, 16);
                if(z && v8 == 0) {
                    int v9 = parsableByteArray0.L();
                    arr_b = new byte[v9];
                    parsableByteArray0.n(arr_b, 0, v9);
                }
                return new TrackEncryptionBox(z, s, v8, arr_b1, v5, v6, arr_b);
            }
        }
        return null;
    }

    private static TrackSampleTable w(Track track0, ContainerAtom atom$ContainerAtom0, GaplessInfoHolder gaplessInfoHolder0) throws ParserException {
        int v66;
        int[] arr_v23;
        long[] arr_v22;
        int v53;
        int v52;
        int v51;
        int v41;
        int v39;
        int v30;
        int v29;
        int v34;
        int v33;
        int v28;
        long[] arr_v5;
        long v12;
        int[] arr_v4;
        int v11;
        int[] arr_v3;
        long[] arr_v2;
        int v10;
        boolean z1;
        int v8;
        int v6;
        int v5;
        int v4;
        boolean z;
        StszSampleSizeBox atomParsers$StszSampleSizeBox0;
        LeafAtom atom$LeafAtom0 = atom$ContainerAtom0.h(1937011578);
        if(atom$LeafAtom0 == null) {
            LeafAtom atom$LeafAtom1 = atom$ContainerAtom0.h(1937013298);
            if(atom$LeafAtom1 == null) {
                throw ParserException.a("Track has no sample table size information", null);
            }
            atomParsers$StszSampleSizeBox0 = new Stz2SampleSizeBox(atom$LeafAtom1);
        }
        else {
            atomParsers$StszSampleSizeBox0 = new StszSampleSizeBox(atom$LeafAtom0, track0.f);
        }
        int v = atomParsers$StszSampleSizeBox0.b();
        if(v == 0) {
            return new TrackSampleTable(track0, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        LeafAtom atom$LeafAtom2 = atom$ContainerAtom0.h(1937007471);
        if(atom$LeafAtom2 == null) {
            atom$LeafAtom2 = (LeafAtom)Assertions.g(atom$ContainerAtom0.h(0x636F3634));
            z = true;
        }
        else {
            z = false;
        }
        ParsableByteArray parsableByteArray0 = ((LeafAtom)Assertions.g(atom$ContainerAtom0.h(1937011555))).G1;
        ParsableByteArray parsableByteArray1 = ((LeafAtom)Assertions.g(atom$ContainerAtom0.h(1937011827))).G1;
        LeafAtom atom$LeafAtom3 = atom$ContainerAtom0.h(1937011571);
        ParsableByteArray parsableByteArray2 = atom$LeafAtom3 == null ? null : atom$LeafAtom3.G1;
        LeafAtom atom$LeafAtom4 = atom$ContainerAtom0.h(0x63747473);
        ParsableByteArray parsableByteArray3 = atom$LeafAtom4 == null ? null : atom$LeafAtom4.G1;
        ChunkIterator atomParsers$ChunkIterator0 = new ChunkIterator(parsableByteArray0, atom$LeafAtom2.G1, z);
        parsableByteArray1.Y(12);
        int v1 = parsableByteArray1.P();
        int v2 = parsableByteArray1.P();
        int v3 = parsableByteArray1.P();
        if(parsableByteArray3 == null) {
            v4 = 0;
        }
        else {
            parsableByteArray3.Y(12);
            v4 = parsableByteArray3.P();
        }
        if(parsableByteArray2 == null) {
            v5 = 0;
            v6 = -1;
        }
        else {
            parsableByteArray2.Y(12);
            v5 = parsableByteArray2.P();
            if(v5 > 0) {
                v6 = parsableByteArray2.P() - 1;
            }
            else {
                parsableByteArray2 = null;
                v6 = -1;
            }
        }
        int v7 = atomParsers$StszSampleSizeBox0.c();
        String s = track0.f.n;
        if(v7 == -1 || !"audio/raw".equals(s) && !"audio/g711-mlaw".equals(s) && !"audio/g711-alaw".equals(s) || v1 - 1 != 0 || v4 != 0 || v5 != 0) {
            v8 = v5;
            z1 = false;
        }
        else {
            v8 = 0;
            z1 = true;
        }
        if(z1) {
            long[] arr_v = new long[atomParsers$ChunkIterator0.a];
            int[] arr_v1 = new int[atomParsers$ChunkIterator0.a];
            while(atomParsers$ChunkIterator0.a()) {
                int v9 = atomParsers$ChunkIterator0.b;
                arr_v[v9] = atomParsers$ChunkIterator0.d;
                arr_v1[v9] = atomParsers$ChunkIterator0.c;
            }
            Results fixedSampleSizeRechunker$Results0 = FixedSampleSizeRechunker.a(v7, arr_v, arr_v1, ((long)v3));
            v10 = v;
            arr_v2 = fixedSampleSizeRechunker$Results0.a;
            arr_v3 = fixedSampleSizeRechunker$Results0.b;
            v11 = fixedSampleSizeRechunker$Results0.c;
            arr_v4 = fixedSampleSizeRechunker$Results0.e;
            v12 = fixedSampleSizeRechunker$Results0.f;
            arr_v5 = fixedSampleSizeRechunker$Results0.d;
        }
        else {
            long[] arr_v6 = new long[v];
            int[] arr_v7 = new int[v];
            long[] arr_v8 = new long[v];
            int[] arr_v9 = new int[v];
            int v13 = v6;
            int v14 = 0;
            int v15 = 0;
            int v16 = 0;
            int v17 = 0;
            int v18 = 0;
            long v19 = 0L;
            long v20 = 0L;
            int v21 = v4;
            int v22 = v3;
            int v23 = v2;
            int v24 = v1 - 1;
            int v25 = v8;
            while(true) {
                if(v14 >= v) {
                    goto label_142;
                }
                long v26 = v20;
                int v27 = v16;
                boolean z2 = true;
                while(v27 == 0) {
                    z2 = atomParsers$ChunkIterator0.a();
                    if(!z2) {
                        break;
                    }
                    v27 = atomParsers$ChunkIterator0.c;
                    v26 = atomParsers$ChunkIterator0.d;
                }
                v28 = v23;
                if(z2) {
                    if(parsableByteArray3 != null) {
                        while(v18 == 0 && v21 > 0) {
                            v18 = parsableByteArray3.P();
                            v17 = parsableByteArray3.s();
                            --v21;
                        }
                        --v18;
                    }
                    arr_v6[v14] = v26;
                    int v31 = atomParsers$StszSampleSizeBox0.a();
                    arr_v7[v14] = v31;
                    if(v31 > v15) {
                        v15 = v31;
                    }
                    arr_v8[v14] = v19 + ((long)v17);
                    arr_v9[v14] = parsableByteArray2 == null ? 1 : 0;
                    if(v14 == v13) {
                        arr_v9[v14] = 1;
                        --v25;
                        if(v25 > 0) {
                            v13 = ((ParsableByteArray)Assertions.g(parsableByteArray2)).P() - 1;
                        }
                    }
                    v19 += (long)v22;
                    int v32 = v28 - 1;
                    if(v32 != 0 || v24 <= 0) {
                        v33 = v22;
                        v34 = v24;
                    }
                    else {
                        v32 = parsableByteArray1.P();
                        v33 = parsableByteArray1.s();
                        v34 = v24 - 1;
                    }
                    long v35 = v26 + ((long)arr_v7[v14]);
                    ++v14;
                    v20 = v35;
                    v22 = v33;
                    v16 = v27 - 1;
                    v24 = v34;
                    v23 = v32;
                    continue;
                label_142:
                    v28 = v23;
                    v30 = v16;
                    v29 = v17;
                }
                else {
                    Log.n("AtomParsers", "Unexpected end of chunk data");
                    arr_v6 = Arrays.copyOf(arr_v6, v14);
                    arr_v7 = Arrays.copyOf(arr_v7, v14);
                    arr_v8 = Arrays.copyOf(arr_v8, v14);
                    arr_v9 = Arrays.copyOf(arr_v9, v14);
                    v = v14;
                    v29 = v17;
                    v30 = v27;
                }
                break;
            }
            boolean z3 = true;
            if(parsableByteArray3 != null) {
                while(v21 > 0) {
                    if(parsableByteArray3.P() != 0) {
                        z3 = false;
                        break;
                    }
                    parsableByteArray3.s();
                    --v21;
                }
            }
            if(v25 != 0 || v28 != 0 || v30 != 0 || v24 != 0) {
                Log.n("AtomParsers", "Inconsistent stbl box for track " + track0.a + ": remainingSynchronizationSamples " + v25 + ", remainingSamplesAtTimestampDelta " + v28 + ", remainingSamplesInChunk " + v30 + ", remainingTimestampDeltaChanges " + v24 + ", remainingSamplesAtTimestampOffset " + v18 + (z3 ? "" : ", ctts invalid"));
            }
            else if(v18 != 0 || !z3) {
                Log.n("AtomParsers", "Inconsistent stbl box for track " + track0.a + ": remainingSynchronizationSamples " + v25 + ", remainingSamplesAtTimestampDelta " + v28 + ", remainingSamplesInChunk " + v30 + ", remainingTimestampDeltaChanges " + v24 + ", remainingSamplesAtTimestampOffset " + v18 + (z3 ? "" : ", ctts invalid"));
            }
            v10 = v;
            arr_v2 = arr_v6;
            arr_v3 = arr_v7;
            v11 = v15;
            v12 = v19 + ((long)v29);
            arr_v5 = arr_v8;
            arr_v4 = arr_v9;
        }
        long v36 = Util.Z1(v12, 1000000L, track0.c);
        long[] arr_v10 = track0.h;
        if(arr_v10 == null) {
            Util.b2(arr_v5, 1000000L, track0.c);
            return new TrackSampleTable(track0, arr_v2, arr_v3, v11, arr_v5, arr_v4, v36);
        }
        if(arr_v10.length != 1 || track0.b != 1 || arr_v5.length < 2) {
            v39 = v10;
            v41 = v11;
        }
        else {
            long v37 = ((long[])Assertions.g(track0.i))[0];
            long v38 = v37 + Util.Z1(track0.h[0], track0.c, track0.d);
            v39 = v10;
            if(AtomParsers.b(arr_v5, v12, v37, v38)) {
                long v40 = Util.Z1(v37 - arr_v5[0], track0.f.C, track0.c);
                v41 = v11;
                long v42 = Util.Z1(v12 - v38, track0.f.C, track0.c);
                if((v40 != 0L || v42 != 0L) && v40 <= 0x7FFFFFFFL && v42 <= 0x7FFFFFFFL) {
                    gaplessInfoHolder0.a = (int)v40;
                    gaplessInfoHolder0.b = (int)v42;
                    Util.b2(arr_v5, 1000000L, track0.c);
                    return new TrackSampleTable(track0, arr_v2, arr_v3, v41, arr_v5, arr_v4, Util.Z1(track0.h[0], 1000000L, track0.d));
                }
            }
            else {
                v41 = v11;
            }
        }
        long[] arr_v11 = track0.h;
        if(arr_v11.length == 1 && arr_v11[0] == 0L) {
            long v43 = ((long[])Assertions.g(track0.i))[0];
            for(int v44 = 0; v44 < arr_v5.length; ++v44) {
                arr_v5[v44] = Util.Z1(arr_v5[v44] - v43, 1000000L, track0.c);
            }
            return new TrackSampleTable(track0, arr_v2, arr_v3, v41, arr_v5, arr_v4, Util.Z1(v12 - v43, 1000000L, track0.c));
        }
        boolean z4 = track0.b == 1;
        int[] arr_v12 = new int[arr_v11.length];
        int[] arr_v13 = new int[arr_v11.length];
        long[] arr_v14 = (long[])Assertions.g(track0.i);
        int v45 = 0;
        int v46 = 0;
        int v47 = 0;
        for(int v48 = 0; true; v48 = v52) {
            long[] arr_v15 = track0.h;
            if(v45 >= arr_v15.length) {
                break;
            }
            long v49 = arr_v14[v45];
            if(v49 == -1L) {
                v53 = v46;
                v52 = v48;
            }
            else {
                long v50 = Util.Z1(arr_v15[v45], track0.c, track0.d);
                arr_v12[v45] = Util.n(arr_v5, v49, true, true);
                arr_v13[v45] = Util.j(arr_v5, v49 + v50, z4, false);
                while(true) {
                    v51 = arr_v12[v45];
                    v52 = arr_v13[v45];
                    if(v51 >= v52 || (arr_v4[v51] & 1) != 0) {
                        break;
                    }
                    arr_v12[v45] = v51 + 1;
                }
                v47 += v52 - v51;
                v53 = v46 | (v48 == v51 ? 0 : 1);
            }
            ++v45;
            v46 = v53;
        }
        long[] arr_v16 = arr_v2;
        int v54 = 0;
        int v55 = v46 | (v47 == v39 ? 0 : 1);
        long[] arr_v17 = v55 == 0 ? arr_v16 : new long[v47];
        int[] arr_v18 = v55 == 0 ? arr_v3 : new int[v47];
        int[] arr_v19 = v55 == 0 ? arr_v4 : new int[v47];
        long[] arr_v20 = new long[v47];
        int v56 = v55 == 0 ? v41 : 0;
        int[] arr_v21 = arr_v3;
        long v57 = 0L;
        int v58 = 0;
        while(v54 < track0.h.length) {
            long v59 = track0.i[v54];
            int v60 = arr_v12[v54];
            int v61 = arr_v13[v54];
            if(v55 == 0) {
                arr_v22 = arr_v16;
                arr_v23 = arr_v21;
            }
            else {
                int v62 = v61 - v60;
                System.arraycopy(arr_v16, v60, arr_v17, v58, v62);
                arr_v22 = arr_v16;
                arr_v23 = arr_v21;
                System.arraycopy(arr_v23, v60, arr_v18, v58, v62);
                System.arraycopy(arr_v4, v60, arr_v19, v58, v62);
            }
            int v63 = v56;
            while(v60 < v61) {
                long v64 = Util.Z1(v57, 1000000L, track0.d);
                long v65 = Util.Z1(arr_v5[v60] - v59, 1000000L, track0.c);
                if(AtomParsers.c(track0.b)) {
                    v65 = Math.max(0L, v65);
                }
                arr_v20[v58] = v64 + v65;
                if(v55 == 0) {
                label_265:
                    v66 = v63;
                }
                else {
                    if(arr_v18[v58] <= v63) {
                        v66 = v63;
                        goto label_266;
                    }
                    else {
                        v63 = arr_v23[v60];
                        goto label_267;
                    }
                    goto label_265;
                }
            label_266:
                v63 = v66;
            label_267:
                ++v58;
                ++v60;
            }
            long v67 = v57 + track0.h[v54];
            ++v54;
            v56 = v63;
            arr_v21 = arr_v23;
            v57 = v67;
            arr_v16 = arr_v22;
        }
        return new TrackSampleTable(track0, arr_v17, arr_v18, v56, arr_v20, arr_v19, Util.Z1(v57, 1000000L, track0.d));
    }

    private static StsdData x(ParsableByteArray parsableByteArray0, int v, int v1, String s, @Nullable DrmInitData drmInitData0, boolean z) throws ParserException {
        int v7;
        parsableByteArray0.Y(12);
        int v2 = parsableByteArray0.s();
        StsdData atomParsers$StsdData0 = new StsdData(v2);
        for(int v3 = 0; v3 < v2; ++v3) {
            int v4 = parsableByteArray0.f();
            int v5 = parsableByteArray0.s();
            ExtractorUtil.a(v5 > 0, "childAtomSize must be positive");
            int v6 = parsableByteArray0.s();
            switch(v6) {
                case 0x63616D6D: {
                    atomParsers$StsdData0.b = new Builder().Z(v).o0("application/x-camera-motion").K();
                    v7 = v4;
                    break;
                }
                case 0x6D657474: {
                    AtomParsers.q(parsableByteArray0, 0x6D657474, v4, v, atomParsers$StsdData0);
                    v7 = v4;
                    break;
                }
                case 0x2E6D7032: 
                case 0x2E6D7033: 
                case 0x4F707573: 
                case 0x61632D33: 
                case 0x61632D34: 
                case 0x616C6163: 
                case 0x616C6177: 
                case 0x64747363: 
                case 0x64747365: 
                case 1685353320: 
                case 0x6474736C: 
                case 0x64747378: 
                case 1700998451: 
                case 1701733217: 
                case 0x664C6143: 
                case 0x6C70636D: 
                case 0x6D686131: 
                case 1835560241: 
                case 0x6D6C7061: 
                case 0x6D703461: 
                case 1935764850: 
                case 0x73617762: 
                case 0x736F7774: 
                case 0x74776F73: 
                case 1970037111: {
                    v7 = v4;
                    AtomParsers.g(parsableByteArray0, v6, v4, v5, v, s, z, drmInitData0, atomParsers$StsdData0, v3);
                    break;
                }
                case 1211250227: 
                case 0x61763031: 
                case 0x61766331: 
                case 0x61766333: 
                case 0x64766131: 
                case 0x64766176: 
                case 0x64766831: 
                case 0x64766865: 
                case 1701733238: 
                case 0x68657631: 
                case 1752589105: 
                case 0x6D317620: 
                case 1836070006: 
                case 1932670515: 
                case 0x76703038: 
                case 0x76703039: {
                    v7 = v4;
                    AtomParsers.E(parsableByteArray0, v6, v7, v5, v, v1, drmInitData0, atomParsers$StsdData0, v3);
                    break;
                }
                case 1414810956: 
                case 0x63363038: 
                case 1937010800: 
                case 1954034535: 
                case 2004251764: {
                    AtomParsers.y(parsableByteArray0, v6, v4, v5, v, s, atomParsers$StsdData0);
                    v7 = v4;
                    break;
                }
                default: {
                    v7 = v4;
                }
            }
            parsableByteArray0.Y(v7 + v5);
        }
        return atomParsers$StsdData0;
    }

    private static void y(ParsableByteArray parsableByteArray0, int v, int v1, int v2, int v3, String s, StsdData atomParsers$StsdData0) {
        parsableByteArray0.Y(v1 + 16);
        String s1 = "application/ttml+xml";
        List list0 = null;
        long v4 = 0x7FFFFFFFFFFFFFFFL;
        switch(v) {
            case 1414810956: {
                break;
            }
            case 0x63363038: {
                atomParsers$StsdData0.d = 1;
                s1 = "application/x-mp4-cea-608";
                break;
            }
            case 1937010800: {
                v4 = 0L;
                break;
            }
            case 1954034535: {
                byte[] arr_b = new byte[v2 - 16];
                parsableByteArray0.n(arr_b, 0, v2 - 16);
                list0 = O2.B(arr_b);
                s1 = "application/x-quicktime-tx3g";
                break;
            }
            case 2004251764: {
                s1 = "application/x-mp4-vtt";
                break;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        atomParsers$StsdData0.b = new Builder().Z(v3).o0(s1).e0(s).s0(v4).b0(list0).K();
    }

    private static TkhdData z(ParsableByteArray parsableByteArray0) {
        long v6;
        int v = 8;
        parsableByteArray0.Y(8);
        int v1 = Atom.c(parsableByteArray0.s());
        parsableByteArray0.Z((v1 == 0 ? 8 : 16));
        int v2 = parsableByteArray0.s();
        parsableByteArray0.Z(4);
        int v3 = parsableByteArray0.f();
        if(v1 == 0) {
            v = 4;
        }
        int v4 = 0;
        for(int v5 = 0; true; ++v5) {
            v6 = 0x8000000000000001L;
            if(v5 >= v) {
                parsableByteArray0.Z(v);
                break;
            }
            if(parsableByteArray0.e()[v3 + v5] != -1) {
                long v7 = v1 == 0 ? parsableByteArray0.N() : parsableByteArray0.Q();
                if(v7 == 0L) {
                    break;
                }
                v6 = v7;
                break;
            }
        }
        parsableByteArray0.Z(16);
        int v8 = parsableByteArray0.s();
        int v9 = parsableByteArray0.s();
        parsableByteArray0.Z(4);
        int v10 = parsableByteArray0.s();
        int v11 = parsableByteArray0.s();
        if(v8 == 0 && v9 == 0x10000 && v10 == 0xFFFF0000 && v11 == 0) {
            return new TkhdData(v2, v6, 90);
        }
        if(v8 == 0 && v9 == 0xFFFF0000 && v10 == 0x10000 && v11 == 0) {
            return new TkhdData(v2, v6, 270);
        }
        if(v8 == 0xFFFF0000 && v9 == 0 && v10 == 0 && v11 == 0xFFFF0000) {
            v4 = 180;
        }
        return new TkhdData(v2, v6, v4);
    }
}

