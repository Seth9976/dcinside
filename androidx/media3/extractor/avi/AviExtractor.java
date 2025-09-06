package androidx.media3.extractor.avi;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.NoOpExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.SeekPoints;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.d;
import androidx.media3.extractor.text.SubtitleParser.Factory;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.common.collect.u5;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public final class AviExtractor implements Extractor {
    class AviSeekMap implements SeekMap {
        private final long d;
        final AviExtractor e;

        public AviSeekMap(long v) {
            this.d = v;
        }

        @Override  // androidx.media3.extractor.SeekMap
        public long c1() {
            return this.d;
        }

        @Override  // androidx.media3.extractor.SeekMap
        public SeekPoints d1(long v) {
            SeekPoints seekMap$SeekPoints0 = AviExtractor.this.l[0].i(v);
            for(int v1 = 1; v1 < AviExtractor.this.l.length; ++v1) {
                SeekPoints seekMap$SeekPoints1 = AviExtractor.this.l[v1].i(v);
                if(seekMap$SeekPoints1.a.b < seekMap$SeekPoints0.a.b) {
                    seekMap$SeekPoints0 = seekMap$SeekPoints1;
                }
            }
            return seekMap$SeekPoints0;
        }

        @Override  // androidx.media3.extractor.SeekMap
        public boolean e1() {
            return true;
        }
    }

    static class ChunkHeaderHolder {
        public int a;
        public int b;
        public int c;

        private ChunkHeaderHolder() {
        }

        ChunkHeaderHolder(androidx.media3.extractor.avi.AviExtractor.1 aviExtractor$10) {
        }

        public void a(ParsableByteArray parsableByteArray0) {
            this.a = parsableByteArray0.w();
            this.b = parsableByteArray0.w();
            this.c = 0;
        }

        public void b(ParsableByteArray parsableByteArray0) throws ParserException {
            this.a(parsableByteArray0);
            if(this.a != 0x5453494C) {
                throw ParserException.a(("LIST expected, found: " + this.a), null);
            }
            this.c = parsableByteArray0.w();
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    public static final int A = 0x69766F6D;
    public static final int B = 829973609;
    public static final int C = 0x4B4E554A;
    public static final int D = 0x66727473;
    public static final int E = 0x6E727473;
    public static final int F = 0x68727473;
    public static final int G = 0x73647561;
    public static final int H = 1937012852;
    public static final int I = 1935960438;
    private static final int J = 0;
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 3;
    private static final int N = 4;
    private static final int O = 5;
    private static final int P = 6;
    private static final int Q = 16;
    public static final int R = 1;
    private static final long S = 0x40000L;
    private final ParsableByteArray d;
    private final ChunkHeaderHolder e;
    private final boolean f;
    private final Factory g;
    private int h;
    private ExtractorOutput i;
    private AviMainHeaderChunk j;
    private long k;
    private ChunkReader[] l;
    private long m;
    @Nullable
    private ChunkReader n;
    private int o;
    private long p;
    private long q;
    private int r;
    private boolean s;
    private static final String t = "AviExtractor";
    public static final int u = 1179011410;
    public static final int v = 0x20495641;
    public static final int w = 0x5453494C;
    public static final int x = 1751742049;
    public static final int y = 0x6C726468;
    public static final int z = 1819440243;

    @Deprecated
    public AviExtractor() {
        this(1, Factory.a);
    }

    public AviExtractor(int v, Factory subtitleParser$Factory0) {
        this.g = subtitleParser$Factory0;
        this.f = (v & 1) == 0;
        this.d = new ParsableByteArray(12);
        this.e = new ChunkHeaderHolder(null);
        this.i = new NoOpExtractorOutput();
        this.l = new ChunkReader[0];
        this.p = -1L;
        this.q = -1L;
        this.o = -1;
        this.k = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        this.m = -1L;
        this.n = null;
        ChunkReader[] arr_chunkReader = this.l;
        for(int v2 = 0; v2 < arr_chunkReader.length; ++v2) {
            arr_chunkReader[v2].q(v);
        }
        if(v == 0L) {
            if(this.l.length == 0) {
                this.h = 0;
                return;
            }
            this.h = 3;
            return;
        }
        this.h = 6;
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
        if(this.o(extractorInput0, positionHolder0)) {
            return 1;
        }
        switch(this.h) {
            case 0: {
                if(!this.g(extractorInput0)) {
                    throw ParserException.a("AVI Header List not found", null);
                }
                extractorInput0.r(12);
                this.h = 1;
                return 0;
            }
            case 1: {
                extractorInput0.readFully(this.d.e(), 0, 12);
                this.d.Y(0);
                this.e.b(this.d);
                ChunkHeaderHolder aviExtractor$ChunkHeaderHolder0 = this.e;
                if(aviExtractor$ChunkHeaderHolder0.c != 0x6C726468) {
                    throw ParserException.a(("hdrl expected, found: " + this.e.c), null);
                }
                this.o = aviExtractor$ChunkHeaderHolder0.b;
                this.h = 2;
                return 0;
            }
            case 2: {
                int v = this.o - 4;
                ParsableByteArray parsableByteArray0 = new ParsableByteArray(v);
                extractorInput0.readFully(parsableByteArray0.e(), 0, v);
                this.j(parsableByteArray0);
                this.h = 3;
                return 0;
            }
            case 3: {
                if(this.p != -1L) {
                    long v1 = extractorInput0.getPosition();
                    long v2 = this.p;
                    if(v1 != v2) {
                        this.m = v2;
                        return 0;
                    }
                }
                extractorInput0.k(this.d.e(), 0, 12);
                extractorInput0.o();
                this.d.Y(0);
                this.e.a(this.d);
                int v3 = this.d.w();
                int v4 = this.e.a;
                if(v4 == 1179011410) {
                    extractorInput0.r(12);
                    return 0;
                }
                if(v4 == 0x5453494C && v3 == 0x69766F6D) {
                    long v5 = extractorInput0.getPosition();
                    this.p = v5;
                    this.q = v5 + ((long)this.e.b) + 8L;
                    if(!this.s) {
                        if(((AviMainHeaderChunk)Assertions.g(this.j)).a()) {
                            this.h = 4;
                            this.m = this.q;
                            return 0;
                        }
                        this.i.r(new Unseekable(this.k));
                        this.s = true;
                    }
                    this.m = extractorInput0.getPosition() + 12L;
                    this.h = 6;
                    return 0;
                }
                this.m = extractorInput0.getPosition() + ((long)this.e.b) + 8L;
                return 0;
            }
            case 4: {
                extractorInput0.readFully(this.d.e(), 0, 8);
                this.d.Y(0);
                int v6 = this.d.w();
                int v7 = this.d.w();
                if(v6 == 829973609) {
                    this.h = 5;
                    this.r = v7;
                    return 0;
                }
                this.m = extractorInput0.getPosition() + ((long)v7);
                return 0;
            }
            case 5: {
                ParsableByteArray parsableByteArray1 = new ParsableByteArray(this.r);
                extractorInput0.readFully(parsableByteArray1.e(), 0, this.r);
                this.k(parsableByteArray1);
                this.h = 6;
                this.m = this.p;
                return 0;
            }
            case 6: {
                return this.n(extractorInput0);
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    private static void f(ExtractorInput extractorInput0) throws IOException {
        if((extractorInput0.getPosition() & 1L) == 1L) {
            extractorInput0.r(1);
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        extractorInput0.k(this.d.e(), 0, 12);
        this.d.Y(0);
        if(this.d.w() != 1179011410) {
            return false;
        }
        this.d.Z(4);
        return this.d.w() == 0x20495641;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.h = 0;
        if(this.f) {
            extractorOutput0 = new SubtitleTranscodingExtractorOutput(extractorOutput0, this.g);
        }
        this.i = extractorOutput0;
        this.m = -1L;
    }

    @Nullable
    private ChunkReader i(int v) {
        ChunkReader[] arr_chunkReader = this.l;
        for(int v1 = 0; v1 < arr_chunkReader.length; ++v1) {
            ChunkReader chunkReader0 = arr_chunkReader[v1];
            if(chunkReader0.j(v)) {
                return chunkReader0;
            }
        }
        return null;
    }

    private void j(ParsableByteArray parsableByteArray0) throws IOException {
        ListChunk listChunk0 = ListChunk.c(0x6C726468, parsableByteArray0);
        if(listChunk0.getType() != 0x6C726468) {
            throw ParserException.a(("Unexpected header list type " + listChunk0.getType()), null);
        }
        AviMainHeaderChunk aviMainHeaderChunk0 = (AviMainHeaderChunk)listChunk0.b(AviMainHeaderChunk.class);
        if(aviMainHeaderChunk0 == null) {
            throw ParserException.a("AviHeader not found", null);
        }
        this.j = aviMainHeaderChunk0;
        this.k = ((long)aviMainHeaderChunk0.c) * ((long)aviMainHeaderChunk0.a);
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        u5 u50 = listChunk0.a.i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            AviChunk aviChunk0 = (AviChunk)object0;
            if(aviChunk0.getType() == 1819440243) {
                ChunkReader chunkReader0 = this.m(((ListChunk)aviChunk0), v);
                if(chunkReader0 != null) {
                    arrayList0.add(chunkReader0);
                }
                ++v;
            }
        }
        this.l = (ChunkReader[])arrayList0.toArray(new ChunkReader[0]);
        this.i.m();
    }

    private void k(ParsableByteArray parsableByteArray0) {
        long v = this.l(parsableByteArray0);
        while(parsableByteArray0.a() >= 16) {
            int v1 = parsableByteArray0.w();
            int v2 = parsableByteArray0.w();
            long v3 = ((long)parsableByteArray0.w()) + v;
            parsableByteArray0.w();
            ChunkReader chunkReader0 = this.i(v1);
            if(chunkReader0 != null) {
                if((v2 & 16) == 16) {
                    chunkReader0.b(v3);
                }
                chunkReader0.k();
            }
        }
        ChunkReader[] arr_chunkReader = this.l;
        for(int v4 = 0; v4 < arr_chunkReader.length; ++v4) {
            arr_chunkReader[v4].c();
        }
        this.s = true;
        this.i.r(new AviSeekMap(this, this.k));
    }

    private long l(ParsableByteArray parsableByteArray0) {
        long v = 0L;
        if(parsableByteArray0.a() < 16) {
            return 0L;
        }
        int v1 = parsableByteArray0.f();
        parsableByteArray0.Z(8);
        long v2 = (long)parsableByteArray0.w();
        long v3 = this.p;
        if(v2 <= v3) {
            v = v3 + 8L;
        }
        parsableByteArray0.Y(v1);
        return v;
    }

    @Nullable
    private ChunkReader m(ListChunk listChunk0, int v) {
        AviStreamHeaderChunk aviStreamHeaderChunk0 = (AviStreamHeaderChunk)listChunk0.b(AviStreamHeaderChunk.class);
        StreamFormatChunk streamFormatChunk0 = (StreamFormatChunk)listChunk0.b(StreamFormatChunk.class);
        if(aviStreamHeaderChunk0 == null) {
            Log.n("AviExtractor", "Missing Stream Header");
            return null;
        }
        if(streamFormatChunk0 == null) {
            Log.n("AviExtractor", "Missing Stream Format");
            return null;
        }
        long v1 = aviStreamHeaderChunk0.a();
        Format format0 = streamFormatChunk0.a;
        Builder format$Builder0 = format0.a();
        format$Builder0.Z(v);
        int v2 = aviStreamHeaderChunk0.f;
        if(v2 != 0) {
            format$Builder0.f0(v2);
        }
        StreamNameChunk streamNameChunk0 = (StreamNameChunk)listChunk0.b(StreamNameChunk.class);
        if(streamNameChunk0 != null) {
            format$Builder0.c0(streamNameChunk0.a);
        }
        int v3 = MimeTypes.m(format0.n);
        if(v3 != 1 && v3 != 2) {
            return null;
        }
        TrackOutput trackOutput0 = this.i.b(v, v3);
        trackOutput0.d(format$Builder0.K());
        ChunkReader chunkReader0 = new ChunkReader(v, v3, v1, aviStreamHeaderChunk0.e, trackOutput0);
        this.k = v1;
        return chunkReader0;
    }

    private int n(ExtractorInput extractorInput0) throws IOException {
        if(extractorInput0.getPosition() >= this.q) {
            return -1;
        }
        ChunkReader chunkReader0 = this.n;
        if(chunkReader0 == null) {
            AviExtractor.f(extractorInput0);
            int v = 12;
            extractorInput0.k(this.d.e(), 0, 12);
            this.d.Y(0);
            int v1 = this.d.w();
            if(v1 == 0x5453494C) {
                this.d.Y(8);
                if(this.d.w() != 0x69766F6D) {
                    v = 8;
                }
                extractorInput0.r(v);
                extractorInput0.o();
                return 0;
            }
            int v2 = this.d.w();
            if(v1 == 0x4B4E554A) {
                this.m = extractorInput0.getPosition() + ((long)v2) + 8L;
                return 0;
            }
            extractorInput0.r(8);
            extractorInput0.o();
            ChunkReader chunkReader1 = this.i(v1);
            if(chunkReader1 == null) {
                this.m = extractorInput0.getPosition() + ((long)v2);
                return 0;
            }
            chunkReader1.p(v2);
            this.n = chunkReader1;
        }
        else if(chunkReader0.o(extractorInput0)) {
            this.n = null;
            return 0;
        }
        return 0;
    }

    private boolean o(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        boolean z;
        if(this.m == -1L) {
            z = false;
        }
        else {
            long v = extractorInput0.getPosition();
            long v1 = this.m;
            if(v1 < v || v1 > v + 0x40000L) {
                positionHolder0.a = v1;
                z = true;
            }
            else {
                extractorInput0.r(((int)(v1 - v)));
                z = false;
            }
        }
        this.m = -1L;
        return z;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }

    class androidx.media3.extractor.avi.AviExtractor.1 {
    }

}

