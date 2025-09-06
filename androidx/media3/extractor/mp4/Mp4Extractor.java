package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.SeekPoints;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.text.SubtitleParser.Factory;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.common.collect.O2;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public final class Mp4Extractor implements Extractor, SeekMap {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    static final class Mp4Track {
        public final Track a;
        public final TrackSampleTable b;
        public final TrackOutput c;
        @Nullable
        public final TrueHdSampleRechunker d;
        public int e;

        public Mp4Track(Track track0, TrackSampleTable trackSampleTable0, TrackOutput trackOutput0) {
            this.a = track0;
            this.b = trackSampleTable0;
            this.c = trackOutput0;
            this.d = "audio/true-hd".equals(track0.f.n) ? new TrueHdSampleRechunker() : null;
        }
    }

    private int A;
    private long B;
    private int C;
    @Nullable
    private MotionPhotoMetadata D;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 4;
    public static final int H = 8;
    public static final int I = 16;
    @Deprecated
    public static final ExtractorsFactory J = null;
    private static final int K = 0;
    private static final int L = 1;
    private static final int M = 2;
    private static final int N = 3;
    private static final int O = 0;
    private static final int P = 1;
    private static final int Q = 2;
    private static final long R = 0x40000L;
    private static final long S = 0xA00000L;
    private final Factory d;
    private final int e;
    private final ParsableByteArray f;
    private final ParsableByteArray g;
    private final ParsableByteArray h;
    private final ParsableByteArray i;
    private final ArrayDeque j;
    private final SefReader k;
    private final List l;
    private O2 m;
    private int n;
    private int o;
    private long p;
    private int q;
    @Nullable
    private ParsableByteArray r;
    private int s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private ExtractorOutput x;
    private Mp4Track[] y;
    private long[][] z;

    static {
        Mp4Extractor.J = new f();
    }

    @Deprecated
    public Mp4Extractor() {
        this(Factory.a, 16);
    }

    @Deprecated
    public Mp4Extractor(int v) {
        this(Factory.a, v);
    }

    public Mp4Extractor(Factory subtitleParser$Factory0) {
        this(subtitleParser$Factory0, 0);
    }

    public Mp4Extractor(Factory subtitleParser$Factory0, int v) {
        this.d = subtitleParser$Factory0;
        this.e = v;
        this.m = O2.A();
        this.n = (v & 4) == 0 ? 0 : 3;
        this.k = new SefReader();
        this.l = new ArrayList();
        this.i = new ParsableByteArray(16);
        this.j = new ArrayDeque();
        this.f = new ParsableByteArray(NalUnitUtil.j);
        this.g = new ParsableByteArray(4);
        this.h = new ParsableByteArray();
        this.s = -1;
        this.x = ExtractorOutput.p1;
        this.y = new Mp4Track[0];
    }

    private void A() {
        if(this.C == 2 && (this.e & 2) != 0) {
            TrackOutput trackOutput0 = this.x.b(0, 4);
            Metadata metadata0 = this.D == null ? null : new Metadata(new Entry[]{this.D});
            trackOutput0.d(new Builder().h0(metadata0).K());
            this.x.m();
            this.x.r(new Unseekable(0x8000000000000001L));
        }
    }

    private static int B(ParsableByteArray parsableByteArray0) {
        parsableByteArray0.Y(8);
        int v = Mp4Extractor.m(parsableByteArray0.s());
        if(v != 0) {
            return v;
        }
        parsableByteArray0.Z(4);
        while(parsableByteArray0.a() > 0) {
            int v1 = Mp4Extractor.m(parsableByteArray0.s());
            if(v1 != 0) {
                return v1;
            }
            if(false) {
                break;
            }
        }
        return 0;
    }

    private void C(ContainerAtom atom$ContainerAtom0) throws ParserException {
        int v4;
        List list1;
        Metadata metadata1;
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        boolean z = this.C == 1;
        GaplessInfoHolder gaplessInfoHolder0 = new GaplessInfoHolder();
        LeafAtom atom$LeafAtom0 = atom$ContainerAtom0.h(0x75647461);
        if(atom$LeafAtom0 == null) {
            metadata1 = null;
        }
        else {
            Metadata metadata0 = AtomParsers.C(atom$LeafAtom0);
            gaplessInfoHolder0.c(metadata0);
            metadata1 = metadata0;
        }
        ContainerAtom atom$ContainerAtom1 = atom$ContainerAtom0.g(0x6D657461);
        Metadata metadata2 = atom$ContainerAtom1 == null ? null : AtomParsers.p(atom$ContainerAtom1);
        Metadata metadata3 = new Metadata(new Entry[]{AtomParsers.r(((LeafAtom)Assertions.g(atom$ContainerAtom0.h(0x6D766864))).G1)});
        List list0 = AtomParsers.B(atom$ContainerAtom0, gaplessInfoHolder0, 0x8000000000000001L, null, (this.e & 1) != 0, z, (Track track0) -> track0);
        long v1 = 0x8000000000000001L;
        int v2 = 0;
        int v3 = -1;
        while(v2 < list0.size()) {
            TrackSampleTable trackSampleTable0 = (TrackSampleTable)list0.get(v2);
            if(trackSampleTable0.b == 0) {
                list1 = list0;
                v4 = v;
            }
            else {
                Track track0 = trackSampleTable0.a;
                long v5 = track0.e == 0x8000000000000001L ? trackSampleTable0.h : track0.e;
                v1 = Math.max(v1, v5);
                v4 = v + 1;
                list1 = list0;
                Mp4Track mp4Extractor$Mp4Track0 = new Mp4Track(track0, trackSampleTable0, this.x.b(v, track0.b));
                Builder format$Builder0 = track0.f.a();
                format$Builder0.f0(("audio/true-hd".equals(track0.f.n) ? trackSampleTable0.e * 16 : trackSampleTable0.e + 30));
                if(track0.b == 2) {
                    if((this.e & 8) != 0) {
                        format$Builder0.m0(track0.f.f | (v3 == -1 ? 1 : 2));
                    }
                    if(v5 > 0L) {
                        int v6 = trackSampleTable0.b;
                        if(v6 > 0) {
                            format$Builder0.X(((float)v6) / (((float)v5) / 1000000.0f));
                        }
                    }
                }
                MetadataUtil.k(track0.b, gaplessInfoHolder0, format$Builder0);
                Metadata metadata4 = this.l.isEmpty() ? null : new Metadata(this.l);
                MetadataUtil.l(track0.b, metadata2, format$Builder0, new Metadata[]{metadata4, metadata1, metadata3});
                Format format0 = format$Builder0.K();
                mp4Extractor$Mp4Track0.c.d(format0);
                if(track0.b == 2 && v3 == -1) {
                    v3 = arrayList0.size();
                }
                arrayList0.add(mp4Extractor$Mp4Track0);
            }
            ++v2;
            v = v4;
            list0 = list1;
        }
        this.A = v3;
        this.B = v1;
        Mp4Track[] arr_mp4Extractor$Mp4Track = (Mp4Track[])arrayList0.toArray(new Mp4Track[0]);
        this.y = arr_mp4Extractor$Mp4Track;
        this.z = Mp4Extractor.n(arr_mp4Extractor$Mp4Track);
        this.x.m();
        this.x.r(this);
    }

    private void D(long v) {
        if(this.o == 0x6D707664) {
            this.D = new MotionPhotoMetadata(0L, v, 0x8000000000000001L, v + ((long)this.q), this.p - ((long)this.q));
        }
    }

    private boolean E(ExtractorInput extractorInput0) throws IOException {
        if(this.q == 0) {
            if(!extractorInput0.e(this.i.e(), 0, 8, true)) {
                this.A();
                return false;
            }
            this.q = 8;
            this.i.Y(0);
            this.p = this.i.N();
            this.o = this.i.s();
        }
        long v = this.p;
        if(v == 1L) {
            extractorInput0.readFully(this.i.e(), 8, 8);
            this.q += 8;
            this.p = this.i.Q();
        }
        else if(v == 0L) {
            long v1 = extractorInput0.getLength();
            if(v1 == -1L) {
                ContainerAtom atom$ContainerAtom0 = (ContainerAtom)this.j.peek();
                if(atom$ContainerAtom0 != null) {
                    v1 = atom$ContainerAtom0.G1;
                }
            }
            if(v1 != -1L) {
                this.p = v1 - extractorInput0.getPosition() + ((long)this.q);
            }
        }
        if(this.p < ((long)this.q)) {
            throw ParserException.e("Atom size less than header length (unsupported).");
        }
        if(Mp4Extractor.I(this.o)) {
            long v2 = extractorInput0.getPosition() + this.p - ((long)this.q);
            if(this.p != ((long)this.q) && this.o == 0x6D657461) {
                this.x(extractorInput0);
            }
            ContainerAtom atom$ContainerAtom1 = new ContainerAtom(this.o, v2);
            this.j.push(atom$ContainerAtom1);
            if(this.p == ((long)this.q)) {
                this.z(v2);
                return true;
            }
            this.o();
            return true;
        }
        if(Mp4Extractor.J(this.o)) {
            Assertions.i(this.q == 8);
            Assertions.i(this.p <= 0x7FFFFFFFL);
            ParsableByteArray parsableByteArray0 = new ParsableByteArray(((int)this.p));
            System.arraycopy(this.i.e(), 0, parsableByteArray0.e(), 0, 8);
            this.r = parsableByteArray0;
            this.n = 1;
            return true;
        }
        this.D(extractorInput0.getPosition() - ((long)this.q));
        this.r = null;
        this.n = 1;
        return true;
    }

    private boolean F(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        boolean z;
        long v = this.p - ((long)this.q);
        long v1 = extractorInput0.getPosition();
        ParsableByteArray parsableByteArray0 = this.r;
        if(parsableByteArray0 == null) {
            if(!this.w && this.o == 1835295092) {
                this.C = 1;
            }
            if(v < 0x40000L) {
                extractorInput0.r(((int)v));
                z = false;
            }
            else {
                positionHolder0.a = extractorInput0.getPosition() + v;
                z = true;
            }
        }
        else {
            extractorInput0.readFully(parsableByteArray0.e(), this.q, ((int)v));
            if(this.o == 0x66747970) {
                this.w = true;
                this.C = Mp4Extractor.B(parsableByteArray0);
            }
            else if(!this.j.isEmpty()) {
                ((ContainerAtom)this.j.peek()).e(new LeafAtom(this.o, parsableByteArray0));
            }
            z = false;
        }
        this.z(v1 + v);
        return z && this.n != 2;
    }

    private int G(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        long v = extractorInput0.getPosition();
        if(this.s == -1) {
            int v1 = this.s(v);
            this.s = v1;
            if(v1 == -1) {
                return -1;
            }
        }
        Mp4Track mp4Extractor$Mp4Track0 = this.y[this.s];
        TrackOutput trackOutput0 = mp4Extractor$Mp4Track0.c;
        int v2 = mp4Extractor$Mp4Track0.e;
        long v3 = mp4Extractor$Mp4Track0.b.c[v2];
        int v4 = mp4Extractor$Mp4Track0.b.d[v2];
        TrueHdSampleRechunker trueHdSampleRechunker0 = mp4Extractor$Mp4Track0.d;
        long v5 = v3 - v + ((long)this.t);
        if(v5 >= 0L && v5 < 0x40000L) {
            if(mp4Extractor$Mp4Track0.a.g == 1) {
                v5 += 8L;
                v4 -= 8;
            }
            extractorInput0.r(((int)v5));
            Track track0 = mp4Extractor$Mp4Track0.a;
            if(track0.j == 0) {
                if("audio/ac4".equals(track0.f.n)) {
                    if(this.u == 0) {
                        Ac4Util.a(v4, this.h);
                        trackOutput0.b(this.h, 7);
                        this.u += 7;
                    }
                    v4 += 7;
                }
                else if(trueHdSampleRechunker0 != null) {
                    trueHdSampleRechunker0.d(extractorInput0);
                }
                int v10;
                while((v10 = this.u) < v4) {
                    int v11 = trackOutput0.e(extractorInput0, v4 - v10, false);
                    this.t += v11;
                    this.u += v11;
                    this.v -= v11;
                }
            }
            else {
                byte[] arr_b = this.g.e();
                arr_b[0] = 0;
                arr_b[1] = 0;
                arr_b[2] = 0;
                int v6 = mp4Extractor$Mp4Track0.a.j;
                while(this.u < v4) {
                    int v7 = this.v;
                    if(v7 == 0) {
                        extractorInput0.readFully(arr_b, 4 - v6, v6);
                        this.t += v6;
                        this.g.Y(0);
                        int v8 = this.g.s();
                        if(v8 < 0) {
                            throw ParserException.a("Invalid NAL length", null);
                        }
                        this.v = v8;
                        this.f.Y(0);
                        trackOutput0.b(this.f, 4);
                        this.u += 4;
                        v4 += 4 - v6;
                    }
                    else {
                        int v9 = trackOutput0.e(extractorInput0, v7, false);
                        this.t += v9;
                        this.u += v9;
                        this.v -= v9;
                    }
                }
            }
            long v12 = mp4Extractor$Mp4Track0.b.f[v2];
            int v13 = mp4Extractor$Mp4Track0.b.g[v2];
            if(trueHdSampleRechunker0 == null) {
                trackOutput0.f(v12, v13, v4, 0, null);
            }
            else {
                trueHdSampleRechunker0.c(trackOutput0, v12, v13, v4, 0, null);
                if(v2 + 1 == mp4Extractor$Mp4Track0.b.b) {
                    trueHdSampleRechunker0.a(trackOutput0, null);
                }
            }
            ++mp4Extractor$Mp4Track0.e;
            this.s = -1;
            this.t = 0;
            this.u = 0;
            this.v = 0;
            return 0;
        }
        positionHolder0.a = v3;
        return 1;
    }

    private int H(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        int v = this.k.c(extractorInput0, positionHolder0, this.l);
        if(v == 1 && positionHolder0.a == 0L) {
            this.o();
        }
        return v;
    }

    private static boolean I(int v) {
        switch(v) {
            case 1701082227: 
            case 0x6D646961: 
            case 0x6D657461: 
            case 1835626086: 
            case 0x6D6F6F76: 
            case 1937007212: 
            case 1953653099: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private static boolean J(int v) {
        switch(v) {
            case 0x636F3634: 
            case 0x63747473: 
            case 1701606260: 
            case 0x66747970: 
            case 0x68646C72: 
            case 0x696C7374: 
            case 1801812339: 
            case 0x6D646864: 
            case 0x6D766864: 
            case 1937007471: 
            case 1937011555: 
            case 1937011556: 
            case 1937011571: 
            case 1937011578: 
            case 1937011827: 
            case 1937013298: 
            case 0x746B6864: 
            case 0x75647461: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private void K(Mp4Track mp4Extractor$Mp4Track0, long v) {
        TrackSampleTable trackSampleTable0 = mp4Extractor$Mp4Track0.b;
        int v1 = trackSampleTable0.a(v);
        if(v1 == -1) {
            v1 = trackSampleTable0.b(v);
        }
        mp4Extractor$Mp4Track0.e = v1;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        this.j.clear();
        this.q = 0;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        if(v == 0L) {
            if(this.n != 3) {
                this.o();
                return;
            }
            this.k.g();
            this.l.clear();
            return;
        }
        Mp4Track[] arr_mp4Extractor$Mp4Track = this.y;
        for(int v2 = 0; v2 < arr_mp4Extractor$Mp4Track.length; ++v2) {
            Mp4Track mp4Extractor$Mp4Track0 = arr_mp4Extractor$Mp4Track[v2];
            this.K(mp4Extractor$Mp4Track0, v1);
            TrueHdSampleRechunker trueHdSampleRechunker0 = mp4Extractor$Mp4Track0.d;
            if(trueHdSampleRechunker0 != null) {
                trueHdSampleRechunker0.b();
            }
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    public Extractor c() {
        return this;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public long c1() {
        return this.B;
    }

    @Override  // androidx.media3.extractor.Extractor
    public List d() {
        return this.q();
    }

    @Override  // androidx.media3.extractor.SeekMap
    public SeekPoints d1(long v) {
        return this.p(v, -1);
    }

    @Override  // androidx.media3.extractor.Extractor
    public int e(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
    alab1:
        while(true) {
            switch(this.n) {
                case 0: {
                    if(this.E(extractorInput0)) {
                        break;
                    }
                    return -1;
                }
                case 1: {
                    if(!this.F(extractorInput0, positionHolder0)) {
                        break;
                    }
                    break alab1;
                }
                case 2: {
                    return this.G(extractorInput0, positionHolder0);
                }
                case 3: {
                    return this.H(extractorInput0, positionHolder0);
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        }
        return 1;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public boolean e1() {
        return true;
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        SniffFailure sniffFailure0 = Sniffer.d(extractorInput0, (this.e & 2) != 0);
        this.m = sniffFailure0 == null ? O2.A() : O2.B(sniffFailure0);
        return sniffFailure0 == null;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        if((this.e & 16) == 0) {
            extractorOutput0 = new SubtitleTranscodingExtractorOutput(extractorOutput0, this.d);
        }
        this.x = extractorOutput0;
    }

    // 检测为 Lambda 实现
    public static Track j(Track track0) [...]

    private static int m(int v) {
        switch(v) {
            case 0x68656963: {
                return 2;
            }
            case 0x71742020: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }

    private static long[][] n(Mp4Track[] arr_mp4Extractor$Mp4Track) {
        long[][] arr2_v = new long[arr_mp4Extractor$Mp4Track.length][];
        int[] arr_v = new int[arr_mp4Extractor$Mp4Track.length];
        long[] arr_v1 = new long[arr_mp4Extractor$Mp4Track.length];
        boolean[] arr_z = new boolean[arr_mp4Extractor$Mp4Track.length];
        for(int v = 0; v < arr_mp4Extractor$Mp4Track.length; ++v) {
            arr2_v[v] = new long[arr_mp4Extractor$Mp4Track[v].b.b];
            arr_v1[v] = arr_mp4Extractor$Mp4Track[v].b.f[0];
        }
        long v1 = 0L;
        int v2 = 0;
        while(v2 < arr_mp4Extractor$Mp4Track.length) {
            long v3 = 0x7FFFFFFFFFFFFFFFL;
            int v4 = -1;
            for(int v5 = 0; v5 < arr_mp4Extractor$Mp4Track.length; ++v5) {
                if(!arr_z[v5]) {
                    long v6 = arr_v1[v5];
                    if(v6 <= v3) {
                        v4 = v5;
                        v3 = v6;
                    }
                }
            }
            int v7 = arr_v[v4];
            long[] arr_v2 = arr2_v[v4];
            arr_v2[v7] = v1;
            TrackSampleTable trackSampleTable0 = arr_mp4Extractor$Mp4Track[v4].b;
            v1 += (long)trackSampleTable0.d[v7];
            int v8 = v7 + 1;
            arr_v[v4] = v8;
            if(v8 < arr_v2.length) {
                arr_v1[v4] = trackSampleTable0.f[v8];
            }
            else {
                arr_z[v4] = true;
                ++v2;
            }
        }
        return arr2_v;
    }

    private void o() {
        this.n = 0;
        this.q = 0;
    }

    public SeekPoints p(long v, int v1) {
        long v8;
        long v7;
        long v5;
        long v4;
        Mp4Track[] arr_mp4Extractor$Mp4Track = this.y;
        if(arr_mp4Extractor$Mp4Track.length == 0) {
            return new SeekPoints(SeekPoint.c);
        }
        int v2 = v1 == -1 ? this.A : v1;
        if(v2 == -1) {
            v5 = 0x7FFFFFFFFFFFFFFFL;
            v4 = v;
            v8 = -1L;
            v7 = 0x8000000000000001L;
        }
        else {
            TrackSampleTable trackSampleTable0 = arr_mp4Extractor$Mp4Track[v2].b;
            int v3 = Mp4Extractor.r(trackSampleTable0, v);
            if(v3 == -1) {
                return new SeekPoints(SeekPoint.c);
            }
            v4 = trackSampleTable0.f[v3];
            v5 = trackSampleTable0.c[v3];
            if(v4 >= v || v3 >= trackSampleTable0.b - 1) {
                v8 = -1L;
                v7 = 0x8000000000000001L;
            }
            else {
                int v6 = trackSampleTable0.b(v);
                if(v6 == -1 || v6 == v3) {
                    v8 = -1L;
                    v7 = 0x8000000000000001L;
                }
                else {
                    v7 = trackSampleTable0.f[v6];
                    v8 = trackSampleTable0.c[v6];
                }
            }
        }
        if(v1 == -1) {
            for(int v9 = 0; true; ++v9) {
                Mp4Track[] arr_mp4Extractor$Mp4Track1 = this.y;
                if(v9 >= arr_mp4Extractor$Mp4Track1.length) {
                    break;
                }
                if(v9 != this.A) {
                    TrackSampleTable trackSampleTable1 = arr_mp4Extractor$Mp4Track1[v9].b;
                    long v10 = Mp4Extractor.w(trackSampleTable1, v4, v5);
                    if(v7 != 0x8000000000000001L) {
                        v8 = Mp4Extractor.w(trackSampleTable1, v7, v8);
                    }
                    v5 = v10;
                }
            }
        }
        SeekPoint seekPoint0 = new SeekPoint(v4, v5);
        return v7 == 0x8000000000000001L ? new SeekPoints(seekPoint0) : new SeekPoints(seekPoint0, new SeekPoint(v7, v8));
    }

    public O2 q() {
        return this.m;
    }

    private static int r(TrackSampleTable trackSampleTable0, long v) {
        int v1 = trackSampleTable0.a(v);
        return v1 == -1 ? trackSampleTable0.b(v) : v1;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }

    private int s(long v) {
        int v1 = -1;
        int v2 = -1;
        long v4 = 0x7FFFFFFFFFFFFFFFL;
        int v5 = 1;
        long v6 = 0x7FFFFFFFFFFFFFFFL;
        int v7 = 1;
        long v8 = 0x7FFFFFFFFFFFFFFFL;
        for(int v3 = 0; true; ++v3) {
            Mp4Track[] arr_mp4Extractor$Mp4Track = this.y;
            if(v3 >= arr_mp4Extractor$Mp4Track.length) {
                break;
            }
            Mp4Track mp4Extractor$Mp4Track0 = arr_mp4Extractor$Mp4Track[v3];
            int v9 = mp4Extractor$Mp4Track0.e;
            TrackSampleTable trackSampleTable0 = mp4Extractor$Mp4Track0.b;
            if(v9 != trackSampleTable0.b) {
                long v10 = trackSampleTable0.c[v9];
                long v11 = this.z[v3][v9];
                long v12 = v10 - v;
                int v13 = v12 < 0L || v12 >= 0x40000L ? 1 : 0;
                if(v13 == 0 && v7 != 0 || v13 == v7 && v12 < v8) {
                    v7 = v13;
                    v8 = v12;
                    v2 = v3;
                    v6 = v11;
                }
                if(v11 < v4) {
                    v5 = v13;
                    v1 = v3;
                    v4 = v11;
                }
            }
        }
        return v4 != 0x7FFFFFFFFFFFFFFFL && v5 != 0 && v6 >= v4 + 0xA00000L ? v1 : v2;
    }

    private static Extractor[] t(Factory subtitleParser$Factory0) {
        return new Extractor[]{new Mp4Extractor(subtitleParser$Factory0)};
    }

    private static Track u(Track track0) [...] // Inlined contents

    private static Extractor[] v() {
        return new Extractor[]{new Mp4Extractor(Factory.a, 16)};
    }

    private static long w(TrackSampleTable trackSampleTable0, long v, long v1) {
        int v2 = Mp4Extractor.r(trackSampleTable0, v);
        return v2 == -1 ? v1 : Math.min(trackSampleTable0.c[v2], v1);
    }

    private void x(ExtractorInput extractorInput0) throws IOException {
        this.h.U(8);
        extractorInput0.k(this.h.e(), 0, 8);
        AtomParsers.f(this.h);
        extractorInput0.r(this.h.f());
        extractorInput0.o();
    }

    public static ExtractorsFactory y(Factory subtitleParser$Factory0) {
        return new e(subtitleParser$Factory0);
    }

    private void z(long v) throws ParserException {
        while(!this.j.isEmpty() && ((ContainerAtom)this.j.peek()).G1 == v) {
            ContainerAtom atom$ContainerAtom0 = (ContainerAtom)this.j.pop();
            if(atom$ContainerAtom0.a == 0x6D6F6F76) {
                this.C(atom$ContainerAtom0);
                this.j.clear();
                this.n = 2;
            }
            else if(!this.j.isEmpty()) {
                ((ContainerAtom)this.j.peek()).d(atom$ContainerAtom0);
            }
        }
        if(this.n != 2) {
            this.o();
        }
    }
}

