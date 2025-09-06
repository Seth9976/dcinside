package androidx.media3.exoplayer.source.chunk;

import O1.a;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput.CryptoData;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.g;
import androidx.media3.extractor.jpeg.JpegExtractor;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.png.PngExtractor;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleExtractor;
import androidx.media3.extractor.text.SubtitleTranscodingExtractor;
import j..util.Objects;
import java.io.IOException;
import java.util.List;

@UnstableApi
public final class BundledChunkExtractor implements ChunkExtractor, ExtractorOutput {
    static final class BindingTrackOutput implements TrackOutput {
        private final int d;
        private final int e;
        @Nullable
        private final Format f;
        private final DiscardingTrackOutput g;
        public Format h;
        private TrackOutput i;
        private long j;

        public BindingTrackOutput(int v, int v1, @Nullable Format format0) {
            this.d = v;
            this.e = v1;
            this.f = format0;
            this.g = new DiscardingTrackOutput();
        }

        @Override  // androidx.media3.extractor.TrackOutput
        public void a(ParsableByteArray parsableByteArray0, int v, int v1) {
            this.i.b(parsableByteArray0, v);
        }

        @Override  // androidx.media3.extractor.TrackOutput
        public void b(ParsableByteArray parsableByteArray0, int v) {
            g.b(this, parsableByteArray0, v);
        }

        @Override  // androidx.media3.extractor.TrackOutput
        public int c(DataReader dataReader0, int v, boolean z, int v1) throws IOException {
            return this.i.e(dataReader0, v, z);
        }

        @Override  // androidx.media3.extractor.TrackOutput
        public void d(Format format0) {
            Format format1 = this.f;
            if(format1 != null) {
                format0 = format0.m(format1);
            }
            this.h = format0;
            this.i.d(this.h);
        }

        @Override  // androidx.media3.extractor.TrackOutput
        public int e(DataReader dataReader0, int v, boolean z) {
            return g.a(this, dataReader0, v, z);
        }

        @Override  // androidx.media3.extractor.TrackOutput
        public void f(long v, int v1, int v2, int v3, @Nullable CryptoData trackOutput$CryptoData0) {
            if(this.j != 0x8000000000000001L && v >= this.j) {
                this.i = this.g;
            }
            this.i.f(v, v1, v2, v3, trackOutput$CryptoData0);
        }

        public void g(@Nullable TrackOutputProvider chunkExtractor$TrackOutputProvider0, long v) {
            if(chunkExtractor$TrackOutputProvider0 == null) {
                this.i = this.g;
                return;
            }
            this.j = v;
            TrackOutput trackOutput0 = chunkExtractor$TrackOutputProvider0.b(this.d, this.e);
            this.i = trackOutput0;
            Format format0 = this.h;
            if(format0 != null) {
                trackOutput0.d(format0);
            }
        }
    }

    public static final class Factory implements androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory {
        private androidx.media3.extractor.text.SubtitleParser.Factory a;
        private boolean b;

        public Factory() {
            this.a = new DefaultSubtitleParserFactory();
        }

        @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor$Factory
        @a
        public androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory a(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
            return this.f(subtitleParser$Factory0);
        }

        @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor$Factory
        @a
        public androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory b(boolean z) {
            return this.e(z);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor$Factory
        public Format c(Format format0) {
            return !this.b || !this.a.a(format0) ? format0 : format0.a().o0("application/x-media3-cues").S(this.a.b(format0)).O(format0.n + (format0.j == null ? "" : " " + format0.j)).s0(0x7FFFFFFFFFFFFFFFL).K();
        }

        @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor$Factory
        @Nullable
        public ChunkExtractor d(int v, Format format0, boolean z, List list0, @Nullable TrackOutput trackOutput0, PlayerId playerId0) {
            SubtitleExtractor subtitleExtractor0;
            int v1 = 1;
            String s = format0.m;
            if(MimeTypes.t(s)) {
                if(!this.b) {
                    return null;
                }
                subtitleExtractor0 = new SubtitleExtractor(this.a.c(format0), format0);
            }
            else if(MimeTypes.s(s)) {
                if(!this.b) {
                    v1 = 3;
                }
                subtitleExtractor0 = new MatroskaExtractor(this.a, v1);
            }
            else if(Objects.equals(s, "image/jpeg")) {
                subtitleExtractor0 = new JpegExtractor(1);
            }
            else if(Objects.equals(s, "image/png")) {
                subtitleExtractor0 = new PngExtractor();
            }
            else {
                int v2 = z ? 4 : 0;
                if(!this.b) {
                    v2 |= 0x20;
                }
                subtitleExtractor0 = new FragmentedMp4Extractor(this.a, v2, null, null, list0, trackOutput0);
            }
            if(this.b && !MimeTypes.t(s) && !(subtitleExtractor0.c() instanceof FragmentedMp4Extractor) && !(subtitleExtractor0.c() instanceof MatroskaExtractor)) {
                subtitleExtractor0 = new SubtitleTranscodingExtractor(subtitleExtractor0, this.a);
            }
            return new BundledChunkExtractor(subtitleExtractor0, v, format0);
        }

        @a
        public Factory e(boolean z) {
            this.b = z;
            return this;
        }

        @a
        public Factory f(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
            this.a = (androidx.media3.extractor.text.SubtitleParser.Factory)Assertions.g(subtitleParser$Factory0);
            return this;
        }
    }

    private final Extractor a;
    private final int b;
    private final Format c;
    private final SparseArray d;
    private boolean e;
    @Nullable
    private TrackOutputProvider f;
    private long g;
    private SeekMap h;
    private Format[] i;
    public static final Factory j;
    private static final PositionHolder k;

    static {
        BundledChunkExtractor.j = new Factory();
        BundledChunkExtractor.k = new PositionHolder();
    }

    public BundledChunkExtractor(Extractor extractor0, int v, Format format0) {
        this.a = extractor0;
        this.b = v;
        this.c = format0;
        this.d = new SparseArray();
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public boolean a(ExtractorInput extractorInput0) throws IOException {
        int v = this.a.e(extractorInput0, BundledChunkExtractor.k);
        Assertions.i(v != 1);
        return v == 0;
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public TrackOutput b(int v, int v1) {
        TrackOutput trackOutput0 = (BindingTrackOutput)this.d.get(v);
        if(trackOutput0 == null) {
            Assertions.i(this.i == null);
            trackOutput0 = new BindingTrackOutput(v, v1, (v1 == this.b ? this.c : null));
            ((BindingTrackOutput)trackOutput0).g(this.f, this.g);
            this.d.put(v, trackOutput0);
        }
        return trackOutput0;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void c(@Nullable TrackOutputProvider chunkExtractor$TrackOutputProvider0, long v, long v1) {
        this.f = chunkExtractor$TrackOutputProvider0;
        this.g = v1;
        if(!this.e) {
            this.a.h(this);
            if(v != 0x8000000000000001L) {
                this.a.a(0L, v);
            }
            this.e = true;
            return;
        }
        Extractor extractor0 = this.a;
        if(v == 0x8000000000000001L) {
            v = 0L;
        }
        extractor0.a(0L, v);
        for(int v2 = 0; v2 < this.d.size(); ++v2) {
            ((BindingTrackOutput)this.d.valueAt(v2)).g(chunkExtractor$TrackOutputProvider0, v1);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public ChunkIndex d() {
        return this.h instanceof ChunkIndex ? ((ChunkIndex)this.h) : null;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public Format[] e() {
        return this.i;
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public void m() {
        Format[] arr_format = new Format[this.d.size()];
        for(int v = 0; v < this.d.size(); ++v) {
            arr_format[v] = (Format)Assertions.k(((BindingTrackOutput)this.d.valueAt(v)).h);
        }
        this.i = arr_format;
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public void r(SeekMap seekMap0) {
        this.h = seekMap0;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void release() {
        this.a.release();
    }
}

