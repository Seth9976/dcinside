package androidx.media3.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.d;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@UnstableApi
public final class TsExtractor implements Extractor {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Mode {
    }

    class PatReader implements SectionPayloadReader {
        private final ParsableBitArray a;
        final TsExtractor b;

        public PatReader() {
            this.a = new ParsableBitArray(new byte[4]);
        }

        @Override  // androidx.media3.extractor.ts.SectionPayloadReader
        public void a(ParsableByteArray parsableByteArray0) {
            if(parsableByteArray0.L() != 0) {
                return;
            }
            if((parsableByteArray0.L() & 0x80) == 0) {
                return;
            }
            parsableByteArray0.Z(6);
            int v = parsableByteArray0.a();
            for(int v1 = 0; v1 < v / 4; ++v1) {
                parsableByteArray0.l(this.a, 4);
                int v2 = this.a.h(16);
                this.a.s(3);
                if(v2 == 0) {
                    this.a.s(13);
                }
                else {
                    int v3 = this.a.h(13);
                    if(TsExtractor.this.l.get(v3) == null) {
                        TsExtractor.this.l.put(v3, new SectionReader(new PmtReader(TsExtractor.this, v3)));
                        TsExtractor.n(TsExtractor.this);
                    }
                }
            }
            if(TsExtractor.this.d != 2) {
                TsExtractor.this.l.remove(0);
            }
        }

        @Override  // androidx.media3.extractor.ts.SectionPayloadReader
        public void c(TimestampAdjuster timestampAdjuster0, ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        }
    }

    class PmtReader implements SectionPayloadReader {
        private final ParsableBitArray a;
        private final SparseArray b;
        private final SparseIntArray c;
        private final int d;
        final TsExtractor e;
        private static final int f = 5;
        private static final int g = 10;
        private static final int h = 106;
        private static final int i = 0x6F;
        private static final int j = 0x7A;
        private static final int k = 0x7B;
        private static final int l = 0x7F;
        private static final int m = 89;
        private static final int n = 21;
        private static final int o = 14;
        private static final int p = 33;

        public PmtReader(int v) {
            this.a = new ParsableBitArray(new byte[5]);
            this.b = new SparseArray();
            this.c = new SparseIntArray();
            this.d = v;
        }

        @Override  // androidx.media3.extractor.ts.SectionPayloadReader
        public void a(ParsableByteArray parsableByteArray0) {
            TimestampAdjuster timestampAdjuster0;
            if(parsableByteArray0.L() != 2) {
                return;
            }
            if(TsExtractor.this.d == 1 || TsExtractor.this.d == 2 || TsExtractor.this.r == 1) {
                timestampAdjuster0 = (TimestampAdjuster)TsExtractor.this.g.get(0);
            }
            else {
                timestampAdjuster0 = new TimestampAdjuster(((TimestampAdjuster)TsExtractor.this.g.get(0)).d());
                TsExtractor.this.g.add(timestampAdjuster0);
            }
            if((parsableByteArray0.L() & 0x80) == 0) {
                return;
            }
            parsableByteArray0.Z(1);
            int v = parsableByteArray0.R();
            parsableByteArray0.Z(3);
            parsableByteArray0.l(this.a, 2);
            this.a.s(3);
            int v1 = this.a.h(13);
            TsExtractor.this.x = v1;
            parsableByteArray0.l(this.a, 2);
            this.a.s(4);
            parsableByteArray0.Z(this.a.h(12));
            if(TsExtractor.this.d == 2 && TsExtractor.this.v == null) {
                EsInfo tsPayloadReader$EsInfo0 = new EsInfo(21, null, 0, null, Util.f);
                TsPayloadReader tsPayloadReader0 = TsExtractor.this.j.a(21, tsPayloadReader$EsInfo0);
                TsExtractor.this.v = tsPayloadReader0;
                if(TsExtractor.this.v != null) {
                    TsExtractor.this.v.c(timestampAdjuster0, TsExtractor.this.q, new TrackIdGenerator(v, 21, 0x2000));
                }
            }
            this.b.clear();
            this.c.clear();
            int v2 = parsableByteArray0.a();
            while(v2 > 0) {
                parsableByteArray0.l(this.a, 5);
                int v3 = this.a.h(8);
                this.a.s(3);
                int v4 = this.a.h(13);
                this.a.s(4);
                int v5 = this.a.h(12);
                EsInfo tsPayloadReader$EsInfo1 = this.b(parsableByteArray0, v5);
                if(v3 == 5 || v3 == 6) {
                    v3 = tsPayloadReader$EsInfo1.a;
                }
                v2 -= v5 + 5;
                int v6 = TsExtractor.this.d == 2 ? v3 : v4;
                if(!TsExtractor.this.m.get(v6)) {
                    TsPayloadReader tsPayloadReader1 = TsExtractor.this.d != 2 || v3 != 21 ? TsExtractor.this.j.a(v3, tsPayloadReader$EsInfo1) : TsExtractor.this.v;
                    if(TsExtractor.this.d != 2 || v4 < this.c.get(v6, 0x2000)) {
                        this.c.put(v6, v4);
                        this.b.put(v6, tsPayloadReader1);
                    }
                }
            }
            int v7 = this.c.size();
            for(int v8 = 0; v8 < v7; ++v8) {
                int v9 = this.c.keyAt(v8);
                int v10 = this.c.valueAt(v8);
                TsExtractor.this.m.put(v9, true);
                TsExtractor.this.n.put(v10, true);
                TsPayloadReader tsPayloadReader2 = (TsPayloadReader)this.b.valueAt(v8);
                if(tsPayloadReader2 != null) {
                    if(tsPayloadReader2 != TsExtractor.this.v) {
                        tsPayloadReader2.c(timestampAdjuster0, TsExtractor.this.q, new TrackIdGenerator(v, v9, 0x2000));
                    }
                    TsExtractor.this.l.put(v10, tsPayloadReader2);
                }
            }
            if(TsExtractor.this.d != 2) {
                TsExtractor.this.l.remove(this.d);
                TsExtractor.this.r = TsExtractor.this.d == 1 ? 0 : TsExtractor.this.r - 1;
                if(TsExtractor.this.r == 0) {
                    TsExtractor.this.q.m();
                    TsExtractor.this.s = true;
                }
            }
            else if(!TsExtractor.this.s) {
                TsExtractor.this.q.m();
                TsExtractor.this.r = 0;
                TsExtractor.this.s = true;
            }
        }

        private EsInfo b(ParsableByteArray parsableByteArray0, int v) {
            int v1 = parsableByteArray0.f();
            int v2 = v1 + v;
            String s = null;
            List list0 = null;
            int v3 = -1;
            int v4 = 0;
            while(parsableByteArray0.f() < v2) {
                int v5 = parsableByteArray0.L();
                int v6 = parsableByteArray0.f() + parsableByteArray0.L();
                if(v6 > v2) {
                    break;
                }
                switch(v5) {
                    case 5: {
                        long v7 = parsableByteArray0.N();
                        if(v7 == 1094921523L) {
                            v3 = 0x81;
                        }
                        else if(v7 == 1161904947L) {
                            v3 = 0x87;
                        }
                        else if(v7 == 1094921524L) {
                            v3 = 0xAC;
                        }
                        else if(v7 == 1212503619L) {
                            v3 = 36;
                        }
                        break;
                    }
                    case 10: {
                        String s1 = parsableByteArray0.I(3).trim();
                        v4 = parsableByteArray0.L();
                        s = s1;
                        break;
                    }
                    case 89: {
                        ArrayList arrayList0 = new ArrayList();
                        while(parsableByteArray0.f() < v6) {
                            String s2 = parsableByteArray0.I(3).trim();
                            int v8 = parsableByteArray0.L();
                            byte[] arr_b = new byte[4];
                            parsableByteArray0.n(arr_b, 0, 4);
                            arrayList0.add(new DvbSubtitleInfo(s2, v8, arr_b));
                        }
                        list0 = arrayList0;
                        v3 = 89;
                        break;
                    }
                    case 106: {
                        v3 = 0x81;
                        break;
                    }
                    case 0x6F: {
                        v3 = 0x101;
                        break;
                    }
                    case 0x7A: {
                        v3 = 0x87;
                        break;
                    }
                    case 0x7B: {
                        v3 = 0x8A;
                        break;
                    }
                    case 0x7F: {
                        switch(parsableByteArray0.L()) {
                            case 14: {
                                v3 = 0x88;
                                break;
                            }
                            case 21: {
                                v3 = 0xAC;
                                break;
                            }
                            case 33: {
                                v3 = 0x8B;
                            }
                        }
                    }
                }
                parsableByteArray0.Z(v6 - parsableByteArray0.f());
            }
            parsableByteArray0.Y(v2);
            return new EsInfo(v3, s, v4, list0, Arrays.copyOfRange(parsableByteArray0.e(), v1, v2));
        }

        @Override  // androidx.media3.extractor.ts.SectionPayloadReader
        public void c(TimestampAdjuster timestampAdjuster0, ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        }
    }

    public static final int A = 2;
    public static final int B = 1;
    @Deprecated
    public static final ExtractorsFactory C = null;
    public static final int D = 0xBC;
    public static final int E = 112800;
    public static final int F = 3;
    public static final int G = 4;
    public static final int H = 15;
    public static final int I = 17;
    public static final int J = 0x81;
    public static final int K = 0x8A;
    public static final int L = 130;
    public static final int M = 0x87;
    public static final int N = 0xAC;
    public static final int O = 2;
    public static final int P = 16;
    public static final int Q = 27;
    public static final int R = 36;
    public static final int S = 45;
    public static final int T = 21;
    public static final int U = 0x86;
    public static final int V = 89;
    public static final int W = 0x88;
    public static final int X = 0x8B;
    public static final int Y = 0x80;
    public static final int Z = 0x101;
    public static final int a0 = 71;
    private static final int b0 = 0;
    private static final int c0 = 0x2000;
    private final int d;
    private static final long d0 = 1094921523L;
    private final int e;
    private static final long e0 = 1161904947L;
    private final int f;
    private static final long f0 = 1094921524L;
    private final List g;
    private static final long g0 = 1212503619L;
    private final ParsableByteArray h;
    private static final int h0 = 9400;
    private final SparseIntArray i;
    private static final int i0 = 5;
    private final Factory j;
    private final androidx.media3.extractor.text.SubtitleParser.Factory k;
    private final SparseArray l;
    private final SparseBooleanArray m;
    private final SparseBooleanArray n;
    private final TsDurationReader o;
    private TsBinarySearchSeeker p;
    private ExtractorOutput q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    @Nullable
    private TsPayloadReader v;
    private int w;
    private int x;
    public static final int y = 0;
    public static final int z = 1;

    static {
        TsExtractor.C = new f();
    }

    @Deprecated
    public TsExtractor() {
        TimestampAdjuster timestampAdjuster0 = new TimestampAdjuster(0L);
        DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory0 = new DefaultTsPayloadReaderFactory(0);
        this(1, 1, androidx.media3.extractor.text.SubtitleParser.Factory.a, timestampAdjuster0, defaultTsPayloadReaderFactory0, 112800);
    }

    @Deprecated
    public TsExtractor(int v) {
        TimestampAdjuster timestampAdjuster0 = new TimestampAdjuster(0L);
        DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory0 = new DefaultTsPayloadReaderFactory(v);
        this(1, 1, androidx.media3.extractor.text.SubtitleParser.Factory.a, timestampAdjuster0, defaultTsPayloadReaderFactory0, 112800);
    }

    @Deprecated
    public TsExtractor(int v, int v1, int v2) {
        TimestampAdjuster timestampAdjuster0 = new TimestampAdjuster(0L);
        DefaultTsPayloadReaderFactory defaultTsPayloadReaderFactory0 = new DefaultTsPayloadReaderFactory(v1);
        this(v, 1, androidx.media3.extractor.text.SubtitleParser.Factory.a, timestampAdjuster0, defaultTsPayloadReaderFactory0, v2);
    }

    public TsExtractor(int v, int v1, androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0, TimestampAdjuster timestampAdjuster0, Factory tsPayloadReader$Factory0, int v2) {
        this.j = (Factory)Assertions.g(tsPayloadReader$Factory0);
        this.f = v2;
        this.d = v;
        this.e = v1;
        this.k = subtitleParser$Factory0;
        if(v == 1 || v == 2) {
            this.g = Collections.singletonList(timestampAdjuster0);
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            this.g = arrayList0;
            arrayList0.add(timestampAdjuster0);
        }
        this.h = new ParsableByteArray(new byte[9400], 0);
        this.m = new SparseBooleanArray();
        this.n = new SparseBooleanArray();
        this.l = new SparseArray();
        this.i = new SparseIntArray();
        this.o = new TsDurationReader(v2);
        this.q = ExtractorOutput.p1;
        this.x = -1;
        this.D();
    }

    @Deprecated
    public TsExtractor(int v, TimestampAdjuster timestampAdjuster0, Factory tsPayloadReader$Factory0) {
        this(v, 1, androidx.media3.extractor.text.SubtitleParser.Factory.a, timestampAdjuster0, tsPayloadReader$Factory0, 112800);
    }

    @Deprecated
    public TsExtractor(int v, TimestampAdjuster timestampAdjuster0, Factory tsPayloadReader$Factory0, int v1) {
        this(v, 1, androidx.media3.extractor.text.SubtitleParser.Factory.a, timestampAdjuster0, tsPayloadReader$Factory0, v1);
    }

    public TsExtractor(int v, androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
        this(1, v, subtitleParser$Factory0, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), 112800);
    }

    public TsExtractor(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
        this(1, 0, subtitleParser$Factory0, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(0), 112800);
    }

    private static Extractor[] A() {
        return new Extractor[]{new TsExtractor(1, androidx.media3.extractor.text.SubtitleParser.Factory.a)};
    }

    private void B(long v) {
        if(!this.t) {
            this.t = true;
            if(this.o.b() != 0x8000000000000001L) {
                TsBinarySearchSeeker tsBinarySearchSeeker0 = new TsBinarySearchSeeker(this.o.c(), this.o.b(), v, this.x, this.f);
                this.p = tsBinarySearchSeeker0;
                this.q.r(tsBinarySearchSeeker0.b());
                return;
            }
            this.q.r(new Unseekable(this.o.b()));
        }
    }

    public static ExtractorsFactory C(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
        return new e(subtitleParser$Factory0);
    }

    private void D() {
        this.m.clear();
        this.l.clear();
        SparseArray sparseArray0 = this.j.b();
        int v = sparseArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = sparseArray0.keyAt(v1);
            TsPayloadReader tsPayloadReader0 = (TsPayloadReader)sparseArray0.valueAt(v1);
            this.l.put(v2, tsPayloadReader0);
        }
        SectionReader sectionReader0 = new SectionReader(new PatReader(this));
        this.l.put(0, sectionReader0);
        this.v = null;
    }

    // 去混淆评级： 低(20)
    private boolean E(int v) {
        return this.d == 2 || this.s || !this.n.get(v, false);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        Assertions.i(this.d != 2);
        int v2 = this.g.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            TimestampAdjuster timestampAdjuster0 = (TimestampAdjuster)this.g.get(v3);
            boolean z = timestampAdjuster0.f() == 0x8000000000000001L;
            if(!z) {
                long v4 = timestampAdjuster0.d();
                z = v4 != 0x8000000000000001L && v4 != 0L && v4 != v1;
            }
            if(z) {
                timestampAdjuster0.i(v1);
            }
        }
        if(v1 != 0L) {
            TsBinarySearchSeeker tsBinarySearchSeeker0 = this.p;
            if(tsBinarySearchSeeker0 != null) {
                tsBinarySearchSeeker0.h(v1);
            }
        }
        this.h.U(0);
        this.i.clear();
        for(int v5 = 0; v5 < this.l.size(); ++v5) {
            ((TsPayloadReader)this.l.valueAt(v5)).b();
        }
        this.w = 0;
    }

    @Override  // androidx.media3.extractor.Extractor
    public Extractor c() {
        return this;
    }

    @Override  // androidx.media3.extractor.Extractor
    public List d() {
        return d.a(this);
    }

    @Override  // androidx.media3.extractor.Extractor
    public int e(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        long v = extractorInput0.getLength();
        boolean z = this.d == 2;
        if(this.s) {
            if(v != -1L && !z && !this.o.d()) {
                return this.o.e(extractorInput0, positionHolder0, this.x);
            }
            this.B(v);
            if(this.u) {
                this.u = false;
                this.a(0L, 0L);
                if(extractorInput0.getPosition() != 0L) {
                    positionHolder0.a = 0L;
                    return 1;
                }
            }
            if(this.p != null && this.p.d()) {
                return this.p.c(extractorInput0, positionHolder0);
            }
        }
        if(!this.x(extractorInput0)) {
            for(int v1 = 0; v1 < this.l.size(); ++v1) {
                TsPayloadReader tsPayloadReader0 = (TsPayloadReader)this.l.valueAt(v1);
                if(tsPayloadReader0 instanceof PesReader && ((PesReader)tsPayloadReader0).d(z)) {
                    ((PesReader)tsPayloadReader0).a(new ParsableByteArray(), 1);
                }
            }
            return -1;
        }
        int v2 = this.y();
        int v3 = this.h.g();
        if(v2 > v3) {
            return 0;
        }
        int v4 = this.h.s();
        if((0x800000 & v4) != 0) {
            this.h.Y(v2);
            return 0;
        }
        int v5 = (0x400000 & v4) == 0 ? 0 : 1;
        int v6 = (0x1FFF00 & v4) >> 8;
        TsPayloadReader tsPayloadReader1 = (v4 & 16) == 0 ? null : ((TsPayloadReader)this.l.get(v6));
        if(tsPayloadReader1 == null) {
            this.h.Y(v2);
            return 0;
        }
        if(this.d != 2) {
            int v7 = this.i.get(v6, (v4 & 15) - 1);
            this.i.put(v6, v4 & 15);
            if(v7 == (v4 & 15)) {
                this.h.Y(v2);
                return 0;
            }
            if((v4 & 15) != (v7 + 1 & 15)) {
                tsPayloadReader1.b();
            }
        }
        if((v4 & 0x20) != 0) {
            int v8 = this.h.L();
            v5 |= ((this.h.L() & 0x40) == 0 ? 0 : 2);
            this.h.Z(v8 - 1);
        }
        boolean z1 = this.s;
        if(this.E(v6)) {
            this.h.X(v2);
            tsPayloadReader1.a(this.h, v5);
            this.h.X(v3);
        }
        if(this.d != 2 && !z1 && this.s && v != -1L) {
            this.u = true;
        }
        this.h.Y(v2);
        return 0;
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        byte[] arr_b = this.h.e();
        extractorInput0.k(arr_b, 0, 940);
        int v = 0;
    label_3:
        while(v < 0xBC) {
            int v1 = 0;
            while(v1 < 5) {
                if(arr_b[v1 * 0xBC + v] == 71) {
                    ++v1;
                    continue;
                }
                ++v;
                continue label_3;
            }
            extractorInput0.r(v);
            return true;
        }
        return false;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        if((this.e & 1) == 0) {
            extractorOutput0 = new SubtitleTranscodingExtractorOutput(extractorOutput0, this.k);
        }
        this.q = extractorOutput0;
    }

    static int n(TsExtractor tsExtractor0) {
        int v = tsExtractor0.r;
        tsExtractor0.r = v + 1;
        return v;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }

    private boolean x(ExtractorInput extractorInput0) throws IOException {
        byte[] arr_b = this.h.e();
        if(9400 - this.h.f() < 0xBC) {
            int v = this.h.a();
            if(v > 0) {
                System.arraycopy(arr_b, this.h.f(), arr_b, 0, v);
            }
            this.h.W(arr_b, v);
        }
        while(this.h.a() < 0xBC) {
            int v1 = this.h.g();
            int v2 = extractorInput0.read(arr_b, v1, 9400 - v1);
            if(v2 == -1) {
                return false;
            }
            this.h.X(v1 + v2);
        }
        return true;
    }

    private int y() throws ParserException {
        int v = this.h.f();
        int v1 = this.h.g();
        int v2 = TsUtil.a(this.h.e(), v, v1);
        this.h.Y(v2);
        if(v2 + 0xBC > v1) {
            int v3 = this.w + (v2 - v);
            this.w = v3;
            if(this.d == 2 && v3 > 376) {
                throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        }
        else {
            this.w = 0;
        }
        return v2 + 0xBC;
    }

    private static Extractor[] z(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
        return new Extractor[]{new TsExtractor(subtitleParser$Factory0)};
    }
}

