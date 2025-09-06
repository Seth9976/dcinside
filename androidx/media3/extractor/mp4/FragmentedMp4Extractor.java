package androidx.media3.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData.SchemeData;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.emsg.EventMessageEncoder;
import androidx.media3.extractor.text.SubtitleParser.Factory;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.common.collect.O2;
import j..util.DesugarCollections;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@UnstableApi
public class FragmentedMp4Extractor implements Extractor {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    static final class MetadataSampleInfo {
        public final long a;
        public final boolean b;
        public final int c;

        public MetadataSampleInfo(long v, boolean z, int v1) {
            this.a = v;
            this.b = z;
            this.c = v1;
        }
    }

    static final class TrackBundle {
        public final TrackOutput a;
        public final TrackFragment b;
        public final ParsableByteArray c;
        public TrackSampleTable d;
        public DefaultSampleValues e;
        public int f;
        public int g;
        public int h;
        public int i;
        private final ParsableByteArray j;
        private final ParsableByteArray k;
        private boolean l;
        private static final int m = 8;

        public TrackBundle(TrackOutput trackOutput0, TrackSampleTable trackSampleTable0, DefaultSampleValues defaultSampleValues0) {
            this.a = trackOutput0;
            this.d = trackSampleTable0;
            this.e = defaultSampleValues0;
            this.b = new TrackFragment();
            this.c = new ParsableByteArray();
            this.j = new ParsableByteArray(1);
            this.k = new ParsableByteArray();
            this.j(trackSampleTable0, defaultSampleValues0);
        }

        public int c() {
            int v;
            if(!this.l) {
                v = this.d.g[this.f];
                return this.g() == null ? v : v | 0x40000000;
            }
            v = this.b.k[this.f] ? 1 : 0;
            return this.g() == null ? v : v | 0x40000000;
        }

        public long d() {
            return this.l ? this.b.g[this.h] : this.d.c[this.f];
        }

        public long e() {
            return this.l ? this.b.c(this.f) : this.d.f[this.f];
        }

        public int f() {
            return this.l ? this.b.i[this.f] : this.d.d[this.f];
        }

        @Nullable
        public TrackEncryptionBox g() {
            if(!this.l) {
                return null;
            }
            TrackEncryptionBox trackEncryptionBox0 = this.b.n == null ? this.d.a.c(this.b.a.a) : this.b.n;
            return trackEncryptionBox0 == null || !trackEncryptionBox0.a ? null : trackEncryptionBox0;
        }

        public boolean h() {
            ++this.f;
            if(!this.l) {
                return false;
            }
            int v = this.g + 1;
            this.g = v;
            int v1 = this.h;
            if(v == this.b.h[v1]) {
                this.h = v1 + 1;
                this.g = 0;
                return false;
            }
            return true;
        }

        public int i(int v, int v1) {
            ParsableByteArray parsableByteArray0;
            TrackEncryptionBox trackEncryptionBox0 = this.g();
            if(trackEncryptionBox0 == null) {
                return 0;
            }
            int v2 = trackEncryptionBox0.d;
            if(v2 == 0) {
                this.k.W(trackEncryptionBox0.e, trackEncryptionBox0.e.length);
                v2 = trackEncryptionBox0.e.length;
                parsableByteArray0 = this.k;
            }
            else {
                parsableByteArray0 = this.b.o;
            }
            boolean z = this.b.g(this.f);
            boolean z1 = z || v1 != 0;
            this.j.e()[0] = (byte)((z1 ? 0x80 : 0) | v2);
            this.j.Y(0);
            this.a.a(this.j, 1, 1);
            this.a.a(parsableByteArray0, v2, 1);
            if(!z1) {
                return v2 + 1;
            }
            if(!z) {
                this.c.U(8);
                byte[] arr_b = this.c.e();
                arr_b[0] = 0;
                arr_b[1] = 1;
                arr_b[2] = (byte)(v1 >> 8 & 0xFF);
                arr_b[3] = (byte)(v1 & 0xFF);
                arr_b[4] = (byte)(v >> 24 & 0xFF);
                arr_b[5] = (byte)(v >> 16 & 0xFF);
                arr_b[6] = (byte)(v >> 8 & 0xFF);
                arr_b[7] = (byte)(v & 0xFF);
                this.a.a(this.c, 8, 1);
                return v2 + 9;
            }
            ParsableByteArray parsableByteArray1 = this.b.o;
            int v3 = parsableByteArray1.R();
            parsableByteArray1.Z(-2);
            int v4 = v3 * 6 + 2;
            if(v1 != 0) {
                this.c.U(v4);
                byte[] arr_b1 = this.c.e();
                parsableByteArray1.n(arr_b1, 0, v4);
                int v5 = ((arr_b1[2] & 0xFF) << 8 | arr_b1[3] & 0xFF) + v1;
                arr_b1[2] = (byte)(v5 >> 8 & 0xFF);
                arr_b1[3] = (byte)(v5 & 0xFF);
                parsableByteArray1 = this.c;
            }
            this.a.a(parsableByteArray1, v4, 1);
            return v2 + 1 + v4;
        }

        public void j(TrackSampleTable trackSampleTable0, DefaultSampleValues defaultSampleValues0) {
            this.d = trackSampleTable0;
            this.e = defaultSampleValues0;
            this.a.d(trackSampleTable0.a.f);
            this.k();
        }

        public void k() {
            this.b.f();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }

        public void l(long v) {
            for(int v1 = this.f; v1 < this.b.f && this.b.c(v1) <= v; ++v1) {
                if(this.b.k[v1]) {
                    this.i = v1;
                }
            }
        }

        public void m() {
            TrackEncryptionBox trackEncryptionBox0 = this.g();
            if(trackEncryptionBox0 == null) {
                return;
            }
            ParsableByteArray parsableByteArray0 = this.b.o;
            int v = trackEncryptionBox0.d;
            if(v != 0) {
                parsableByteArray0.Z(v);
            }
            if(this.b.g(this.f)) {
                parsableByteArray0.Z(parsableByteArray0.R() * 6);
            }
        }

        public void n(DrmInitData drmInitData0) {
            TrackEncryptionBox trackEncryptionBox0 = this.d.a.c(this.b.a.a);
            DrmInitData drmInitData1 = drmInitData0.o((trackEncryptionBox0 == null ? null : trackEncryptionBox0.b));
            Format format0 = this.d.a.f.a().U(drmInitData1).K();
            this.a.d(format0);
        }
    }

    private int A;
    private long B;
    private long C;
    private long D;
    @Nullable
    private TrackBundle E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private ExtractorOutput J;
    private TrackOutput[] K;
    private TrackOutput[] L;
    private boolean M;
    public static final int N = 1;
    public static final int O = 2;
    public static final int P = 4;
    public static final int Q = 16;
    public static final int R = 0x20;
    @Deprecated
    public static final ExtractorsFactory S = null;
    private static final String T = "FragmentedMp4Extractor";
    private static final int U = 1936025959;
    private static final byte[] V = null;
    private static final Format W = null;
    private static final int X = 100;
    private static final int Y = 0;
    private static final int Z = 1;
    private static final int a0 = 2;
    private static final int b0 = 3;
    private static final int c0 = 4;
    private final Factory d;
    private final int e;
    @Nullable
    private final Track f;
    private final List g;
    private final SparseArray h;
    private final ParsableByteArray i;
    private final ParsableByteArray j;
    private final ParsableByteArray k;
    private final byte[] l;
    private final ParsableByteArray m;
    @Nullable
    private final TimestampAdjuster n;
    private final EventMessageEncoder o;
    private final ParsableByteArray p;
    private final ArrayDeque q;
    private final ArrayDeque r;
    @Nullable
    private final TrackOutput s;
    private O2 t;
    private int u;
    private int v;
    private long w;
    private int x;
    @Nullable
    private ParsableByteArray y;
    private long z;

    static {
        FragmentedMp4Extractor.S = new a();
        FragmentedMp4Extractor.V = new byte[]{-94, 57, 0x4F, 82, 90, -101, 0x4F, 20, -94, 68, 108, 66, 0x7C, 100, (byte)0x8D, -12};
        FragmentedMp4Extractor.W = new Builder().o0("application/x-emsg").K();
    }

    @Deprecated
    public FragmentedMp4Extractor() {
        this(Factory.a, 0x20, null, null, O2.A(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int v) {
        this(Factory.a, v | 0x20, null, null, O2.A(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int v, @Nullable TimestampAdjuster timestampAdjuster0) {
        this(Factory.a, v | 0x20, timestampAdjuster0, null, O2.A(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int v, @Nullable TimestampAdjuster timestampAdjuster0, @Nullable Track track0) {
        this(Factory.a, v | 0x20, timestampAdjuster0, track0, O2.A(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int v, @Nullable TimestampAdjuster timestampAdjuster0, @Nullable Track track0, List list0) {
        this(Factory.a, v | 0x20, timestampAdjuster0, track0, list0, null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int v, @Nullable TimestampAdjuster timestampAdjuster0, @Nullable Track track0, List list0, @Nullable TrackOutput trackOutput0) {
        this(Factory.a, v | 0x20, timestampAdjuster0, track0, list0, trackOutput0);
    }

    public FragmentedMp4Extractor(Factory subtitleParser$Factory0) {
        this(subtitleParser$Factory0, 0, null, null, O2.A(), null);
    }

    public FragmentedMp4Extractor(Factory subtitleParser$Factory0, int v) {
        this(subtitleParser$Factory0, v, null, null, O2.A(), null);
    }

    public FragmentedMp4Extractor(Factory subtitleParser$Factory0, int v, @Nullable TimestampAdjuster timestampAdjuster0, @Nullable Track track0, List list0, @Nullable TrackOutput trackOutput0) {
        this.d = subtitleParser$Factory0;
        this.e = v;
        this.n = timestampAdjuster0;
        this.f = track0;
        this.g = DesugarCollections.unmodifiableList(list0);
        this.s = trackOutput0;
        this.o = new EventMessageEncoder();
        this.p = new ParsableByteArray(16);
        this.i = new ParsableByteArray(NalUnitUtil.j);
        this.j = new ParsableByteArray(5);
        this.k = new ParsableByteArray();
        byte[] arr_b = new byte[16];
        this.l = arr_b;
        this.m = new ParsableByteArray(arr_b);
        this.q = new ArrayDeque();
        this.r = new ArrayDeque();
        this.h = new SparseArray();
        this.t = O2.A();
        this.C = 0x8000000000000001L;
        this.B = 0x8000000000000001L;
        this.D = 0x8000000000000001L;
        this.J = ExtractorOutput.p1;
        this.K = new TrackOutput[0];
        this.L = new TrackOutput[0];
    }

    private static long A(ParsableByteArray parsableByteArray0) {
        parsableByteArray0.Y(8);
        return Atom.c(parsableByteArray0.s()) == 0 ? parsableByteArray0.N() : parsableByteArray0.Q();
    }

    private static void B(ContainerAtom atom$ContainerAtom0, SparseArray sparseArray0, boolean z, int v, byte[] arr_b) throws ParserException {
        int v1 = atom$ContainerAtom0.I1.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ContainerAtom atom$ContainerAtom1 = (ContainerAtom)atom$ContainerAtom0.I1.get(v2);
            if(atom$ContainerAtom1.a == 1953653094) {
                FragmentedMp4Extractor.K(atom$ContainerAtom1, sparseArray0, z, v, arr_b);
            }
        }
    }

    private static void C(ParsableByteArray parsableByteArray0, TrackFragment trackFragment0) throws ParserException {
        parsableByteArray0.Y(8);
        int v = parsableByteArray0.s();
        if((v & 1) == 1) {
            parsableByteArray0.Z(8);
        }
        int v1 = parsableByteArray0.P();
        if(v1 != 1) {
            throw ParserException.a(("Unexpected saio entry count: " + v1), null);
        }
        trackFragment0.d += ((v >> 24 & 0xFF) == 0 ? parsableByteArray0.N() : parsableByteArray0.Q());
    }

    private static void D(TrackEncryptionBox trackEncryptionBox0, ParsableByteArray parsableByteArray0, TrackFragment trackFragment0) throws ParserException {
        int v4;
        int v = trackEncryptionBox0.d;
        parsableByteArray0.Y(8);
        boolean z = true;
        if((Atom.b(parsableByteArray0.s()) & 1) == 1) {
            parsableByteArray0.Z(8);
        }
        int v1 = parsableByteArray0.L();
        int v2 = parsableByteArray0.P();
        if(v2 > trackFragment0.f) {
            throw ParserException.a(("Saiz sample count " + v2 + " is greater than fragment sample count" + trackFragment0.f), null);
        }
        if(v1 == 0) {
            boolean[] arr_z = trackFragment0.m;
            v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                int v5 = parsableByteArray0.L();
                v4 += v5;
                arr_z[v3] = v5 > v;
            }
        }
        else {
            if(v1 <= v) {
                z = false;
            }
            v4 = v1 * v2;
            Arrays.fill(trackFragment0.m, 0, v2, z);
        }
        Arrays.fill(trackFragment0.m, v2, trackFragment0.f, false);
        if(v4 > 0) {
            trackFragment0.d(v4);
        }
    }

    private static void E(ContainerAtom atom$ContainerAtom0, @Nullable String s, TrackFragment trackFragment0) throws ParserException {
        byte[] arr_b = null;
        ParsableByteArray parsableByteArray0 = null;
        ParsableByteArray parsableByteArray1 = null;
        for(int v = 0; v < atom$ContainerAtom0.H1.size(); ++v) {
            LeafAtom atom$LeafAtom0 = (LeafAtom)atom$ContainerAtom0.H1.get(v);
            ParsableByteArray parsableByteArray2 = atom$LeafAtom0.G1;
            int v1 = atom$LeafAtom0.a;
            if(v1 == 0x73626770) {
                parsableByteArray2.Y(12);
                if(parsableByteArray2.s() == 1936025959) {
                    parsableByteArray0 = parsableByteArray2;
                }
            }
            else if(v1 == 0x73677064) {
                parsableByteArray2.Y(12);
                if(parsableByteArray2.s() == 1936025959) {
                    parsableByteArray1 = parsableByteArray2;
                }
            }
        }
        if(parsableByteArray0 != null && parsableByteArray1 != null) {
            parsableByteArray0.Y(8);
            int v2 = Atom.c(parsableByteArray0.s());
            parsableByteArray0.Z(4);
            if(v2 == 1) {
                parsableByteArray0.Z(4);
            }
            if(parsableByteArray0.s() != 1) {
                throw ParserException.e("Entry count in sbgp != 1 (unsupported).");
            }
            parsableByteArray1.Y(8);
            int v3 = Atom.c(parsableByteArray1.s());
            parsableByteArray1.Z(4);
            if(v3 == 1) {
                if(parsableByteArray1.N() == 0L) {
                    throw ParserException.e("Variable length description in sgpd found (unsupported)");
                }
            }
            else if(v3 >= 2) {
                parsableByteArray1.Z(4);
            }
            if(parsableByteArray1.N() != 1L) {
                throw ParserException.e("Entry count in sgpd != 1 (unsupported).");
            }
            parsableByteArray1.Z(1);
            int v4 = parsableByteArray1.L();
            if(parsableByteArray1.L() != 1) {
                return;
            }
            int v5 = parsableByteArray1.L();
            byte[] arr_b1 = new byte[16];
            parsableByteArray1.n(arr_b1, 0, 16);
            if(v5 == 0) {
                int v6 = parsableByteArray1.L();
                arr_b = new byte[v6];
                parsableByteArray1.n(arr_b, 0, v6);
            }
            trackFragment0.l = true;
            trackFragment0.n = new TrackEncryptionBox(true, s, v5, arr_b1, (v4 & 0xF0) >> 4, v4 & 15, arr_b);
        }
    }

    private static void F(ParsableByteArray parsableByteArray0, int v, TrackFragment trackFragment0) throws ParserException {
        parsableByteArray0.Y(v + 8);
        int v1 = Atom.b(parsableByteArray0.s());
        if((v1 & 1) != 0) {
            throw ParserException.e("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        int v2 = parsableByteArray0.P();
        if(v2 == 0) {
            Arrays.fill(trackFragment0.m, 0, trackFragment0.f, false);
            return;
        }
        if(v2 != trackFragment0.f) {
            throw ParserException.a(("Senc sample count " + v2 + " is different from fragment sample count" + trackFragment0.f), null);
        }
        Arrays.fill(trackFragment0.m, 0, v2, (v1 & 2) != 0);
        trackFragment0.d(parsableByteArray0.a());
        trackFragment0.a(parsableByteArray0);
    }

    private static void G(ParsableByteArray parsableByteArray0, TrackFragment trackFragment0) throws ParserException {
        FragmentedMp4Extractor.F(parsableByteArray0, 0, trackFragment0);
    }

    private static Pair H(ParsableByteArray parsableByteArray0, long v) throws ParserException {
        long v4;
        long v3;
        parsableByteArray0.Y(8);
        int v1 = Atom.c(parsableByteArray0.s());
        parsableByteArray0.Z(4);
        long v2 = parsableByteArray0.N();
        if(v1 == 0) {
            v3 = parsableByteArray0.N();
            v4 = parsableByteArray0.N();
        }
        else {
            v3 = parsableByteArray0.Q();
            v4 = parsableByteArray0.Q();
        }
        long v5 = v + v4;
        long v6 = Util.Z1(v3, 1000000L, v2);
        parsableByteArray0.Z(2);
        int v7 = parsableByteArray0.R();
        int[] arr_v = new int[v7];
        long[] arr_v1 = new long[v7];
        long[] arr_v2 = new long[v7];
        long[] arr_v3 = new long[v7];
        long v8 = v3;
        long v9 = v6;
        int v10 = 0;
        while(v10 < v7) {
            int v11 = parsableByteArray0.s();
            if((v11 & 0x80000000) != 0) {
                throw ParserException.a("Unhandled indirect reference", null);
            }
            long v12 = parsableByteArray0.N();
            arr_v[v10] = v11 & 0x7FFFFFFF;
            arr_v1[v10] = v5;
            arr_v3[v10] = v9;
            long v13 = v8 + v12;
            long v14 = Util.Z1(v13, 1000000L, v2);
            arr_v2[v10] = v14 - arr_v3[v10];
            parsableByteArray0.Z(4);
            v5 += (long)arr_v[v10];
            ++v10;
            v8 = v13;
            v9 = v14;
        }
        return Pair.create(v6, new ChunkIndex(arr_v, arr_v1, arr_v2, arr_v3));
    }

    private static long I(ParsableByteArray parsableByteArray0) {
        parsableByteArray0.Y(8);
        return Atom.c(parsableByteArray0.s()) == 1 ? parsableByteArray0.Q() : parsableByteArray0.N();
    }

    @Nullable
    private static TrackBundle J(ParsableByteArray parsableByteArray0, SparseArray sparseArray0, boolean z) {
        parsableByteArray0.Y(8);
        int v = Atom.b(parsableByteArray0.s());
        Object object0 = z ? sparseArray0.valueAt(0) : sparseArray0.get(parsableByteArray0.s());
        if(((TrackBundle)object0) == null) {
            return null;
        }
        if((v & 1) != 0) {
            long v1 = parsableByteArray0.Q();
            ((TrackBundle)object0).b.c = v1;
            ((TrackBundle)object0).b.d = v1;
        }
        DefaultSampleValues defaultSampleValues0 = ((TrackBundle)object0).e;
        ((TrackBundle)object0).b.a = new DefaultSampleValues(((v & 2) == 0 ? defaultSampleValues0.a : parsableByteArray0.s() - 1), ((v & 8) == 0 ? defaultSampleValues0.b : parsableByteArray0.s()), ((v & 16) == 0 ? defaultSampleValues0.c : parsableByteArray0.s()), ((v & 0x20) == 0 ? defaultSampleValues0.d : parsableByteArray0.s()));
        return (TrackBundle)object0;
    }

    private static void K(ContainerAtom atom$ContainerAtom0, SparseArray sparseArray0, boolean z, int v, byte[] arr_b) throws ParserException {
        TrackBundle fragmentedMp4Extractor$TrackBundle0 = FragmentedMp4Extractor.J(((LeafAtom)Assertions.g(atom$ContainerAtom0.h(0x74666864))).G1, sparseArray0, z);
        if(fragmentedMp4Extractor$TrackBundle0 == null) {
            return;
        }
        TrackFragment trackFragment0 = fragmentedMp4Extractor$TrackBundle0.b;
        long v1 = trackFragment0.q;
        boolean z1 = trackFragment0.r;
        fragmentedMp4Extractor$TrackBundle0.k();
        fragmentedMp4Extractor$TrackBundle0.l = true;
        LeafAtom atom$LeafAtom0 = atom$ContainerAtom0.h(0x74666474);
        if(atom$LeafAtom0 == null || (v & 2) != 0) {
            trackFragment0.q = v1;
            trackFragment0.r = z1;
        }
        else {
            trackFragment0.q = FragmentedMp4Extractor.I(atom$LeafAtom0.G1);
            trackFragment0.r = true;
        }
        FragmentedMp4Extractor.N(atom$ContainerAtom0, fragmentedMp4Extractor$TrackBundle0, v);
        TrackEncryptionBox trackEncryptionBox0 = fragmentedMp4Extractor$TrackBundle0.d.a.c(((DefaultSampleValues)Assertions.g(trackFragment0.a)).a);
        LeafAtom atom$LeafAtom1 = atom$ContainerAtom0.h(0x7361697A);
        if(atom$LeafAtom1 != null) {
            FragmentedMp4Extractor.D(((TrackEncryptionBox)Assertions.g(trackEncryptionBox0)), atom$LeafAtom1.G1, trackFragment0);
        }
        LeafAtom atom$LeafAtom2 = atom$ContainerAtom0.h(0x7361696F);
        if(atom$LeafAtom2 != null) {
            FragmentedMp4Extractor.C(atom$LeafAtom2.G1, trackFragment0);
        }
        LeafAtom atom$LeafAtom3 = atom$ContainerAtom0.h(1936027235);
        if(atom$LeafAtom3 != null) {
            FragmentedMp4Extractor.G(atom$LeafAtom3.G1, trackFragment0);
        }
        FragmentedMp4Extractor.E(atom$ContainerAtom0, (trackEncryptionBox0 == null ? null : trackEncryptionBox0.b), trackFragment0);
        int v2 = atom$ContainerAtom0.H1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            LeafAtom atom$LeafAtom4 = (LeafAtom)atom$ContainerAtom0.H1.get(v3);
            if(atom$LeafAtom4.a == 1970628964) {
                FragmentedMp4Extractor.O(atom$LeafAtom4.G1, trackFragment0, arr_b);
            }
        }
    }

    private static Pair L(ParsableByteArray parsableByteArray0) {
        parsableByteArray0.Y(12);
        return Pair.create(parsableByteArray0.s(), new DefaultSampleValues(parsableByteArray0.s() - 1, parsableByteArray0.s(), parsableByteArray0.s(), parsableByteArray0.s()));
    }

    private static int M(TrackBundle fragmentedMp4Extractor$TrackBundle0, int v, int v1, ParsableByteArray parsableByteArray0, int v2) throws ParserException {
        int v25;
        int v24;
        int v23;
        int v22;
        int v21;
        int v20;
        int v18;
        int v17;
        parsableByteArray0.Y(8);
        int v3 = Atom.b(parsableByteArray0.s());
        Track track0 = fragmentedMp4Extractor$TrackBundle0.d.a;
        TrackFragment trackFragment0 = fragmentedMp4Extractor$TrackBundle0.b;
        DefaultSampleValues defaultSampleValues0 = trackFragment0.a;
        int[] arr_v = trackFragment0.h;
        arr_v[v] = parsableByteArray0.P();
        long[] arr_v1 = trackFragment0.g;
        long v4 = trackFragment0.c;
        arr_v1[v] = v4;
        if((v3 & 1) != 0) {
            arr_v1[v] = v4 + ((long)parsableByteArray0.s());
        }
        int v5 = (v3 & 4) == 0 ? 0 : 1;
        int v6 = v5 == 0 ? defaultSampleValues0.d : parsableByteArray0.s();
        int v7 = (v3 & 0x100) == 0 ? 0 : 1;
        int v8 = (v3 & 0x200) == 0 ? 0 : 1;
        int v9 = (v3 & 0x400) == 0 ? 0 : 1;
        int v10 = (v3 & 0x800) == 0 ? 0 : 1;
        long v11 = FragmentedMp4Extractor.p(track0) ? track0.i[0] : 0L;
        int[] arr_v2 = trackFragment0.i;
        long[] arr_v3 = trackFragment0.j;
        boolean[] arr_z = trackFragment0.k;
        boolean z = track0.b == 2 && (v1 & 1) != 0;
        int v12 = v2 + trackFragment0.h[v];
        long v13 = track0.c;
        long v14 = trackFragment0.q;
        int v15 = v2;
        while(v15 < v12) {
            int v16 = FragmentedMp4Extractor.i((v7 == 0 ? defaultSampleValues0.b : parsableByteArray0.s()));
            if(v8 == 0) {
                v18 = v7;
                v17 = defaultSampleValues0.c;
            }
            else {
                v17 = parsableByteArray0.s();
                v18 = v7;
            }
            int v19 = FragmentedMp4Extractor.i(v17);
            if(v9 != 0) {
                v20 = v5;
                v21 = parsableByteArray0.s();
            }
            else if(v15 != 0 || v5 == 0) {
                v20 = v5;
                v21 = defaultSampleValues0.d;
            }
            else {
                v20 = v5;
                v21 = v6;
            }
            if(v10 == 0) {
                v22 = 0;
                v23 = v8;
                v24 = v9;
                v25 = 0;
            }
            else {
                v22 = v10;
                v23 = v8;
                v24 = v9;
                v25 = parsableByteArray0.s();
            }
            long v26 = Util.Z1(((long)v25) + v14 - v11, 1000000L, v13);
            arr_v3[v15] = v26;
            if(!trackFragment0.r) {
                arr_v3[v15] = v26 + fragmentedMp4Extractor$TrackBundle0.d.h;
            }
            arr_v2[v15] = v19;
            arr_z[v15] = (v21 >> 16 & 1) == 0 && (!z || v15 == 0);
            v14 += (long)v16;
            ++v15;
            v7 = v18;
            v5 = v20;
            v10 = v22;
            v8 = v23;
            v9 = v24;
        }
        trackFragment0.q = v14;
        return v12;
    }

    private static void N(ContainerAtom atom$ContainerAtom0, TrackBundle fragmentedMp4Extractor$TrackBundle0, int v) throws ParserException {
        List list0 = atom$ContainerAtom0.H1;
        int v1 = list0.size();
        int v4 = 0;
        int v5 = 0;
        for(int v3 = 0; v3 < v1; ++v3) {
            LeafAtom atom$LeafAtom0 = (LeafAtom)list0.get(v3);
            if(atom$LeafAtom0.a == 0x7472756E) {
                atom$LeafAtom0.G1.Y(12);
                int v6 = atom$LeafAtom0.G1.P();
                if(v6 > 0) {
                    v5 += v6;
                    ++v4;
                }
            }
        }
        fragmentedMp4Extractor$TrackBundle0.h = 0;
        fragmentedMp4Extractor$TrackBundle0.g = 0;
        fragmentedMp4Extractor$TrackBundle0.f = 0;
        fragmentedMp4Extractor$TrackBundle0.b.e(v4, v5);
        int v7 = 0;
        int v8 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            LeafAtom atom$LeafAtom1 = (LeafAtom)list0.get(v2);
            if(atom$LeafAtom1.a == 0x7472756E) {
                v8 = FragmentedMp4Extractor.M(fragmentedMp4Extractor$TrackBundle0, v7, v, atom$LeafAtom1.G1, v8);
                ++v7;
            }
        }
    }

    private static void O(ParsableByteArray parsableByteArray0, TrackFragment trackFragment0, byte[] arr_b) throws ParserException {
        parsableByteArray0.Y(8);
        parsableByteArray0.n(arr_b, 0, 16);
        if(!Arrays.equals(arr_b, FragmentedMp4Extractor.V)) {
            return;
        }
        FragmentedMp4Extractor.F(parsableByteArray0, 16, trackFragment0);
    }

    private void P(long v) throws ParserException {
        while(!this.q.isEmpty() && ((ContainerAtom)this.q.peek()).G1 == v) {
            this.u(((ContainerAtom)this.q.pop()));
        }
        this.j();
    }

    private boolean Q(ExtractorInput extractorInput0) throws IOException {
        if(this.x == 0) {
            if(!extractorInput0.e(this.p.e(), 0, 8, true)) {
                return false;
            }
            this.x = 8;
            this.p.Y(0);
            this.w = this.p.N();
            this.v = this.p.s();
        }
        long v = this.w;
        if(v == 1L) {
            extractorInput0.readFully(this.p.e(), 8, 8);
            this.x += 8;
            this.w = this.p.Q();
        }
        else if(v == 0L) {
            long v1 = extractorInput0.getLength();
            if(v1 == -1L && !this.q.isEmpty()) {
                v1 = ((ContainerAtom)this.q.peek()).G1;
            }
            if(v1 != -1L) {
                this.w = v1 - extractorInput0.getPosition() + ((long)this.x);
            }
        }
        if(this.w < ((long)this.x)) {
            throw ParserException.e("Atom size less than header length (unsupported).");
        }
        long v2 = extractorInput0.getPosition() - ((long)this.x);
        if((this.v == 1835295092 || this.v == 0x6D6F6F66) && !this.M) {
            this.J.r(new Unseekable(this.C, v2));
            this.M = true;
        }
        if(this.v == 0x6D6F6F66) {
            int v3 = this.h.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                TrackFragment trackFragment0 = ((TrackBundle)this.h.valueAt(v4)).b;
                trackFragment0.b = v2;
                trackFragment0.d = v2;
                trackFragment0.c = v2;
            }
        }
        int v5 = this.v;
        if(v5 == 1835295092) {
            this.E = null;
            this.z = v2 + this.w;
            this.u = 2;
            return true;
        }
        if(FragmentedMp4Extractor.U(v5)) {
            long v6 = extractorInput0.getPosition() + this.w - 8L;
            ContainerAtom atom$ContainerAtom0 = new ContainerAtom(this.v, v6);
            this.q.push(atom$ContainerAtom0);
            if(this.w == ((long)this.x)) {
                this.P(v6);
                return true;
            }
            this.j();
            return true;
        }
        if(FragmentedMp4Extractor.V(this.v)) {
            if(this.x != 8) {
                throw ParserException.e("Leaf atom defines extended atom size (unsupported).");
            }
            if(this.w > 0x7FFFFFFFL) {
                throw ParserException.e("Leaf atom with length > 2147483647 (unsupported).");
            }
            ParsableByteArray parsableByteArray0 = new ParsableByteArray(((int)this.w));
            System.arraycopy(this.p.e(), 0, parsableByteArray0.e(), 0, 8);
            this.y = parsableByteArray0;
            this.u = 1;
            return true;
        }
        if(this.w > 0x7FFFFFFFL) {
            throw ParserException.e("Skipping atom with length > 2147483647 (unsupported).");
        }
        this.y = null;
        this.u = 1;
        return true;
    }

    private void R(ExtractorInput extractorInput0) throws IOException {
        int v = ((int)this.w) - this.x;
        ParsableByteArray parsableByteArray0 = this.y;
        if(parsableByteArray0 == null) {
            extractorInput0.r(v);
        }
        else {
            extractorInput0.readFully(parsableByteArray0.e(), 8, v);
            this.w(new LeafAtom(this.v, parsableByteArray0), extractorInput0.getPosition());
        }
        this.P(extractorInput0.getPosition());
    }

    private void S(ExtractorInput extractorInput0) throws IOException {
        int v = this.h.size();
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        TrackBundle fragmentedMp4Extractor$TrackBundle0 = null;
        for(int v2 = 0; v2 < v; ++v2) {
            TrackFragment trackFragment0 = ((TrackBundle)this.h.valueAt(v2)).b;
            if(trackFragment0.p) {
                long v3 = trackFragment0.d;
                if(v3 < v1) {
                    fragmentedMp4Extractor$TrackBundle0 = (TrackBundle)this.h.valueAt(v2);
                    v1 = v3;
                }
            }
        }
        if(fragmentedMp4Extractor$TrackBundle0 == null) {
            this.u = 3;
            return;
        }
        int v4 = (int)(v1 - extractorInput0.getPosition());
        if(v4 < 0) {
            throw ParserException.a("Offset to encryption data was negative.", null);
        }
        extractorInput0.r(v4);
        fragmentedMp4Extractor$TrackBundle0.b.b(extractorInput0);
    }

    private boolean T(ExtractorInput extractorInput0) throws IOException {
        int v8;
        TrackBundle fragmentedMp4Extractor$TrackBundle0 = this.E;
        if(fragmentedMp4Extractor$TrackBundle0 == null) {
            fragmentedMp4Extractor$TrackBundle0 = FragmentedMp4Extractor.m(this.h);
            if(fragmentedMp4Extractor$TrackBundle0 == null) {
                int v = (int)(this.z - extractorInput0.getPosition());
                if(v < 0) {
                    throw ParserException.a("Offset to end of mdat was negative.", null);
                }
                extractorInput0.r(v);
                this.j();
                return false;
            }
            int v1 = (int)(fragmentedMp4Extractor$TrackBundle0.d() - extractorInput0.getPosition());
            if(v1 < 0) {
                Log.n("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                v1 = 0;
            }
            extractorInput0.r(v1);
            this.E = fragmentedMp4Extractor$TrackBundle0;
        }
        if(this.u == 3) {
            int v2 = fragmentedMp4Extractor$TrackBundle0.f();
            this.F = v2;
            if(fragmentedMp4Extractor$TrackBundle0.f < fragmentedMp4Extractor$TrackBundle0.i) {
                extractorInput0.r(v2);
                fragmentedMp4Extractor$TrackBundle0.m();
                if(!fragmentedMp4Extractor$TrackBundle0.h()) {
                    this.E = null;
                }
                this.u = 3;
                return true;
            }
            if(fragmentedMp4Extractor$TrackBundle0.d.a.g == 1) {
                this.F = v2 - 8;
                extractorInput0.r(8);
            }
            if("audio/ac4".equals(fragmentedMp4Extractor$TrackBundle0.d.a.f.n)) {
                this.G = fragmentedMp4Extractor$TrackBundle0.i(this.F, 7);
                Ac4Util.a(this.F, this.m);
                fragmentedMp4Extractor$TrackBundle0.a.b(this.m, 7);
                this.G += 7;
            }
            else {
                this.G = fragmentedMp4Extractor$TrackBundle0.i(this.F, 0);
            }
            this.F += this.G;
            this.u = 4;
            this.H = 0;
        }
        Track track0 = fragmentedMp4Extractor$TrackBundle0.d.a;
        TrackOutput trackOutput0 = fragmentedMp4Extractor$TrackBundle0.a;
        long v3 = fragmentedMp4Extractor$TrackBundle0.e();
        TimestampAdjuster timestampAdjuster0 = this.n;
        if(timestampAdjuster0 != null) {
            v3 = timestampAdjuster0.a(v3);
        }
        if(track0.j == 0) {
            while(true) {
                int v10 = this.G;
                int v11 = this.F;
                if(v10 >= v11) {
                    break;
                }
                int v12 = trackOutput0.e(extractorInput0, v11 - v10, false);
                this.G += v12;
            }
        }
        else {
            byte[] arr_b = this.j.e();
            arr_b[0] = 0;
            arr_b[1] = 0;
            arr_b[2] = 0;
            int v4 = track0.j + 1;
            int v5 = 4 - track0.j;
            while(this.G < this.F) {
                int v6 = this.H;
                if(v6 == 0) {
                    extractorInput0.readFully(arr_b, v5, v4);
                    this.j.Y(0);
                    int v7 = this.j.s();
                    if(v7 < 1) {
                        throw ParserException.a("Invalid NAL length", null);
                    }
                    this.H = v7 - 1;
                    this.i.Y(0);
                    trackOutput0.b(this.i, 4);
                    trackOutput0.b(this.j, 1);
                    this.I = this.L.length > 0 && NalUnitUtil.g(track0.f.n, arr_b[4]);
                    this.G += 5;
                    this.F += v5;
                }
                else {
                    if(this.I) {
                        this.k.U(v6);
                        extractorInput0.readFully(this.k.e(), 0, this.H);
                        trackOutput0.b(this.k, this.H);
                        v8 = this.H;
                        int v9 = NalUnitUtil.r(this.k.e(), this.k.g());
                        this.k.Y(((int)"video/hevc".equals(track0.f.n)));
                        this.k.X(v9);
                        CeaUtil.a(v3, this.k, this.L);
                    }
                    else {
                        v8 = trackOutput0.e(extractorInput0, v6, false);
                    }
                    this.G += v8;
                    this.H -= v8;
                }
            }
        }
        int v13 = fragmentedMp4Extractor$TrackBundle0.c();
        TrackEncryptionBox trackEncryptionBox0 = fragmentedMp4Extractor$TrackBundle0.g();
        trackOutput0.f(v3, v13, this.F, 0, (trackEncryptionBox0 == null ? null : trackEncryptionBox0.c));
        this.z(v3);
        if(!fragmentedMp4Extractor$TrackBundle0.h()) {
            this.E = null;
        }
        this.u = 3;
        return true;
    }

    private static boolean U(int v) {
        switch(v) {
            case 1701082227: 
            case 0x6D646961: 
            case 1835626086: 
            case 0x6D6F6F66: 
            case 0x6D6F6F76: 
            case 0x6D766578: 
            case 1937007212: 
            case 1953653094: 
            case 1953653099: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private static boolean V(int v) {
        switch(v) {
            case 0x636F3634: 
            case 0x63747473: 
            case 1701606260: 
            case 1701671783: 
            case 0x68646C72: 
            case 0x6D646864: 
            case 1835362404: 
            case 0x6D766864: 
            case 0x70737368: 
            case 0x7361696F: 
            case 0x7361697A: 
            case 0x73626770: 
            case 1936027235: 
            case 0x73677064: 
            case 1936286840: 
            case 1937007471: 
            case 1937011555: 
            case 1937011556: 
            case 1937011571: 
            case 1937011578: 
            case 1937011827: 
            case 1937013298: 
            case 0x74666474: 
            case 0x74666864: 
            case 0x746B6864: 
            case 0x74726578: 
            case 0x7472756E: 
            case 1970628964: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        int v2 = this.h.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((TrackBundle)this.h.valueAt(v3)).k();
        }
        this.r.clear();
        this.A = 0;
        this.B = v1;
        this.q.clear();
        this.j();
    }

    @Override  // androidx.media3.extractor.Extractor
    public Extractor c() {
        return this;
    }

    @Override  // androidx.media3.extractor.Extractor
    public List d() {
        return this.n();
    }

    @Override  // androidx.media3.extractor.Extractor
    public int e(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        while(true) {
            switch(this.u) {
                case 0: {
                    if(this.Q(extractorInput0)) {
                        break;
                    }
                    return -1;
                }
                case 1: {
                    this.R(extractorInput0);
                    break;
                }
                case 2: {
                    this.S(extractorInput0);
                    break;
                }
                default: {
                    if(!this.T(extractorInput0)) {
                        break;
                    }
                    return 0;
                }
            }
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        SniffFailure sniffFailure0 = Sniffer.b(extractorInput0);
        this.t = sniffFailure0 == null ? O2.A() : O2.B(sniffFailure0);
        return sniffFailure0 == null;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        ExtractorOutput extractorOutput1 = (this.e & 0x20) == 0 ? new SubtitleTranscodingExtractorOutput(extractorOutput0, this.d) : extractorOutput0;
        this.J = extractorOutput1;
        this.j();
        this.o();
        Track track0 = this.f;
        if(track0 != null) {
            TrackBundle fragmentedMp4Extractor$TrackBundle0 = new TrackBundle(extractorOutput0.b(0, track0.b), new TrackSampleTable(this.f, new long[0], new int[0], 0, new long[0], new int[0], 0L), new DefaultSampleValues(0, 0, 0, 0));
            this.h.put(0, fragmentedMp4Extractor$TrackBundle0);
            this.J.m();
        }
    }

    private static int i(int v) throws ParserException {
        if(v < 0) {
            throw ParserException.a(("Unexpected negative value: " + v), null);
        }
        return v;
    }

    private void j() {
        this.u = 0;
        this.x = 0;
    }

    private DefaultSampleValues k(SparseArray sparseArray0, int v) {
        return sparseArray0.size() == 1 ? ((DefaultSampleValues)sparseArray0.valueAt(0)) : ((DefaultSampleValues)Assertions.g(((DefaultSampleValues)sparseArray0.get(v))));
    }

    @Nullable
    private static DrmInitData l(List list0) {
        int v = list0.size();
        List list1 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            LeafAtom atom$LeafAtom0 = (LeafAtom)list0.get(v1);
            if(atom$LeafAtom0.a == 0x70737368) {
                if(list1 == null) {
                    list1 = new ArrayList();
                }
                byte[] arr_b = atom$LeafAtom0.G1.e();
                UUID uUID0 = PsshAtomUtil.f(arr_b);
                if(uUID0 == null) {
                    Log.n("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                }
                else {
                    ((ArrayList)list1).add(new SchemeData(uUID0, "video/mp4", arr_b));
                }
            }
        }
        return list1 == null ? null : new DrmInitData(list1);
    }

    @Nullable
    private static TrackBundle m(SparseArray sparseArray0) {
        int v = sparseArray0.size();
        TrackBundle fragmentedMp4Extractor$TrackBundle0 = null;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        for(int v2 = 0; v2 < v; ++v2) {
            TrackBundle fragmentedMp4Extractor$TrackBundle1 = (TrackBundle)sparseArray0.valueAt(v2);
            if((fragmentedMp4Extractor$TrackBundle1.l || fragmentedMp4Extractor$TrackBundle1.f != fragmentedMp4Extractor$TrackBundle1.d.b) && (!fragmentedMp4Extractor$TrackBundle1.l || fragmentedMp4Extractor$TrackBundle1.h != fragmentedMp4Extractor$TrackBundle1.b.e)) {
                long v3 = fragmentedMp4Extractor$TrackBundle1.d();
                if(v3 < v1) {
                    fragmentedMp4Extractor$TrackBundle0 = fragmentedMp4Extractor$TrackBundle1;
                    v1 = v3;
                }
            }
        }
        return fragmentedMp4Extractor$TrackBundle0;
    }

    public O2 n() {
        return this.t;
    }

    private void o() {
        int v1;
        TrackOutput[] arr_trackOutput = new TrackOutput[2];
        this.K = arr_trackOutput;
        TrackOutput trackOutput0 = this.s;
        int v = 0;
        if(trackOutput0 == null) {
            v1 = 0;
        }
        else {
            arr_trackOutput[0] = trackOutput0;
            v1 = 1;
        }
        int v2 = 100;
        if((this.e & 4) != 0) {
            arr_trackOutput[v1] = this.J.b(100, 5);
            v2 = 101;
            ++v1;
        }
        TrackOutput[] arr_trackOutput1 = (TrackOutput[])Util.L1(this.K, v1);
        this.K = arr_trackOutput1;
        for(int v3 = 0; v3 < arr_trackOutput1.length; ++v3) {
            arr_trackOutput1[v3].d(FragmentedMp4Extractor.W);
        }
        this.L = new TrackOutput[this.g.size()];
        while(v < this.L.length) {
            TrackOutput trackOutput1 = this.J.b(v2, 3);
            trackOutput1.d(((Format)this.g.get(v)));
            this.L[v] = trackOutput1;
            ++v;
            ++v2;
        }
    }

    private static boolean p(Track track0) {
        long[] arr_v = track0.h;
        if(arr_v != null && arr_v.length == 1) {
            long[] arr_v1 = track0.i;
            if(arr_v1 != null) {
                long v = arr_v[0];
                return v == 0L ? true : Util.Z1(v + arr_v1[0], 1000000L, track0.d) >= track0.e;
            }
        }
        return false;
    }

    private static Extractor[] q(Factory subtitleParser$Factory0) {
        return new Extractor[]{new FragmentedMp4Extractor(subtitleParser$Factory0)};
    }

    private static Extractor[] r() {
        return new Extractor[]{new FragmentedMp4Extractor(Factory.a, 0x20)};
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }

    // 检测为 Lambda 实现
    @Nullable
    protected Track s(@Nullable Track track0) [...]

    public static ExtractorsFactory t(Factory subtitleParser$Factory0) {
        return new c(subtitleParser$Factory0);
    }

    private void u(ContainerAtom atom$ContainerAtom0) throws ParserException {
        int v = atom$ContainerAtom0.a;
        if(v == 0x6D6F6F76) {
            this.y(atom$ContainerAtom0);
            return;
        }
        if(v == 0x6D6F6F66) {
            this.x(atom$ContainerAtom0);
            return;
        }
        if(!this.q.isEmpty()) {
            ((ContainerAtom)this.q.peek()).d(atom$ContainerAtom0);
        }
    }

    private void v(ParsableByteArray parsableByteArray0) {
        long v8;
        long v7;
        String s2;
        long v6;
        String s1;
        long v2;
        if(this.K.length == 0) {
            return;
        }
        parsableByteArray0.Y(8);
        int v = Atom.c(parsableByteArray0.s());
        switch(v) {
            case 0: {
                String s = (String)Assertions.g(parsableByteArray0.F());
                Object object0 = Assertions.g(parsableByteArray0.F());
                long v1 = parsableByteArray0.N();
                v2 = Util.Z1(parsableByteArray0.N(), 1000000L, v1);
                long v3 = this.D == 0x8000000000000001L ? 0x8000000000000001L : this.D + v2;
                long v4 = Util.Z1(parsableByteArray0.N(), 1000L, v1);
                long v5 = parsableByteArray0.N();
                s1 = s;
                v6 = v4;
                s2 = (String)object0;
                v7 = v5;
                v8 = v3;
                break;
            }
            case 1: {
                long v9 = parsableByteArray0.N();
                v8 = Util.Z1(parsableByteArray0.Q(), 1000000L, v9);
                long v10 = Util.Z1(parsableByteArray0.N(), 1000L, v9);
                long v11 = parsableByteArray0.N();
                s1 = (String)Assertions.g(parsableByteArray0.F());
                v6 = v10;
                v7 = v11;
                s2 = (String)Assertions.g(parsableByteArray0.F());
                v2 = 0x8000000000000001L;
                break;
            }
            default: {
                Log.n("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + v);
                return;
            }
        }
        byte[] arr_b = new byte[parsableByteArray0.a()];
        parsableByteArray0.n(arr_b, 0, parsableByteArray0.a());
        EventMessage eventMessage0 = new EventMessage(s1, s2, v6, v7, arr_b);
        ParsableByteArray parsableByteArray1 = new ParsableByteArray(this.o.a(eventMessage0));
        int v13 = parsableByteArray1.a();
        TrackOutput[] arr_trackOutput = this.K;
        for(int v14 = 0; v14 < arr_trackOutput.length; ++v14) {
            TrackOutput trackOutput0 = arr_trackOutput[v14];
            parsableByteArray1.Y(0);
            trackOutput0.b(parsableByteArray1, v13);
        }
        if(v8 == 0x8000000000000001L) {
            MetadataSampleInfo fragmentedMp4Extractor$MetadataSampleInfo0 = new MetadataSampleInfo(v2, true, v13);
            this.r.addLast(fragmentedMp4Extractor$MetadataSampleInfo0);
            this.A += v13;
            return;
        }
        if(!this.r.isEmpty()) {
            MetadataSampleInfo fragmentedMp4Extractor$MetadataSampleInfo1 = new MetadataSampleInfo(v8, false, v13);
            this.r.addLast(fragmentedMp4Extractor$MetadataSampleInfo1);
            this.A += v13;
            return;
        }
        if(this.n != null && !this.n.g()) {
            MetadataSampleInfo fragmentedMp4Extractor$MetadataSampleInfo2 = new MetadataSampleInfo(v8, false, v13);
            this.r.addLast(fragmentedMp4Extractor$MetadataSampleInfo2);
            this.A += v13;
            return;
        }
        TimestampAdjuster timestampAdjuster0 = this.n;
        if(timestampAdjuster0 != null) {
            v8 = timestampAdjuster0.a(v8);
        }
        TrackOutput[] arr_trackOutput1 = this.K;
        for(int v12 = 0; v12 < arr_trackOutput1.length; ++v12) {
            arr_trackOutput1[v12].f(v8, 1, v13, 0, null);
        }
    }

    private void w(LeafAtom atom$LeafAtom0, long v) throws ParserException {
        if(!this.q.isEmpty()) {
            ((ContainerAtom)this.q.peek()).e(atom$LeafAtom0);
            return;
        }
        int v1 = atom$LeafAtom0.a;
        if(v1 == 1936286840) {
            Pair pair0 = FragmentedMp4Extractor.H(atom$LeafAtom0.G1, v);
            this.D = (long)(((Long)pair0.first));
            this.J.r(((SeekMap)pair0.second));
            this.M = true;
            return;
        }
        if(v1 == 1701671783) {
            this.v(atom$LeafAtom0.G1);
        }
    }

    private void x(ContainerAtom atom$ContainerAtom0) throws ParserException {
        FragmentedMp4Extractor.B(atom$ContainerAtom0, this.h, this.f != null, this.e, this.l);
        DrmInitData drmInitData0 = FragmentedMp4Extractor.l(atom$ContainerAtom0.H1);
        if(drmInitData0 != null) {
            int v1 = this.h.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((TrackBundle)this.h.valueAt(v2)).n(drmInitData0);
            }
        }
        if(this.B != 0x8000000000000001L) {
            int v3 = this.h.size();
            for(int v = 0; v < v3; ++v) {
                ((TrackBundle)this.h.valueAt(v)).l(this.B);
            }
            this.B = 0x8000000000000001L;
        }
    }

    private void y(ContainerAtom atom$ContainerAtom0) throws ParserException {
        int v = 0;
        boolean z = true;
        Assertions.j(this.f == null, "Unexpected moov box.");
        DrmInitData drmInitData0 = FragmentedMp4Extractor.l(atom$ContainerAtom0.H1);
        ContainerAtom atom$ContainerAtom1 = (ContainerAtom)Assertions.g(atom$ContainerAtom0.g(0x6D766578));
        SparseArray sparseArray0 = new SparseArray();
        int v1 = atom$ContainerAtom1.H1.size();
        long v2 = 0x8000000000000001L;
        for(int v3 = 0; v3 < v1; ++v3) {
            LeafAtom atom$LeafAtom0 = (LeafAtom)atom$ContainerAtom1.H1.get(v3);
            int v4 = atom$LeafAtom0.a;
            if(v4 == 0x74726578) {
                Pair pair0 = FragmentedMp4Extractor.L(atom$LeafAtom0.G1);
                sparseArray0.put(((int)(((Integer)pair0.first))), ((DefaultSampleValues)pair0.second));
            }
            else if(v4 == 1835362404) {
                v2 = FragmentedMp4Extractor.A(atom$LeafAtom0.G1);
            }
        }
        List list0 = AtomParsers.B(atom$ContainerAtom0, new GaplessInfoHolder(), v2, drmInitData0, (this.e & 16) != 0, false, (Track track0) -> track0);
        int v5 = list0.size();
        if(this.h.size() == 0) {
            while(v < v5) {
                TrackSampleTable trackSampleTable0 = (TrackSampleTable)list0.get(v);
                TrackBundle fragmentedMp4Extractor$TrackBundle0 = new TrackBundle(this.J.b(v, trackSampleTable0.a.b), trackSampleTable0, this.k(sparseArray0, trackSampleTable0.a.a));
                this.h.put(trackSampleTable0.a.a, fragmentedMp4Extractor$TrackBundle0);
                this.C = Math.max(this.C, trackSampleTable0.a.e);
                ++v;
            }
            this.J.m();
            return;
        }
        if(this.h.size() != v5) {
            z = false;
        }
        Assertions.i(z);
        while(v < v5) {
            TrackSampleTable trackSampleTable1 = (TrackSampleTable)list0.get(v);
            ((TrackBundle)this.h.get(trackSampleTable1.a.a)).j(trackSampleTable1, this.k(sparseArray0, trackSampleTable1.a.a));
            ++v;
        }
    }

    private void z(long v) {
        while(!this.r.isEmpty()) {
            MetadataSampleInfo fragmentedMp4Extractor$MetadataSampleInfo0 = (MetadataSampleInfo)this.r.removeFirst();
            this.A -= fragmentedMp4Extractor$MetadataSampleInfo0.c;
            long v1 = fragmentedMp4Extractor$MetadataSampleInfo0.b ? fragmentedMp4Extractor$MetadataSampleInfo0.a + v : fragmentedMp4Extractor$MetadataSampleInfo0.a;
            TimestampAdjuster timestampAdjuster0 = this.n;
            if(timestampAdjuster0 != null) {
                v1 = timestampAdjuster0.a(v1);
            }
            TrackOutput[] arr_trackOutput = this.K;
            for(int v2 = 0; v2 < arr_trackOutput.length; ++v2) {
                arr_trackOutput[v2].f(v1, 1, fragmentedMp4Extractor$MetadataSampleInfo0.c, this.A, null);
            }
        }
    }
}

