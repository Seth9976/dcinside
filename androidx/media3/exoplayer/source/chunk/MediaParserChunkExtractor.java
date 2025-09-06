package androidx.media3.exoplayer.source.chunk;

import android.annotation.SuppressLint;
import android.media.MediaParser.SeekMap;
import android.media.MediaParser.SeekPoint;
import android.media.MediaParser;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.m;
import androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30;
import androidx.media3.exoplayer.source.mediaparser.MediaParserUtil;
import androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(30)
@UnstableApi
public final class MediaParserChunkExtractor implements ChunkExtractor {
    class TrackOutputProviderAdapter implements ExtractorOutput {
        final MediaParserChunkExtractor a;

        private TrackOutputProviderAdapter() {
        }

        TrackOutputProviderAdapter(androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor.1 mediaParserChunkExtractor$10) {
        }

        @Override  // androidx.media3.extractor.ExtractorOutput
        public TrackOutput b(int v, int v1) {
            return MediaParserChunkExtractor.this.g != null ? MediaParserChunkExtractor.this.g.b(v, v1) : MediaParserChunkExtractor.this.e;
        }

        @Override  // androidx.media3.extractor.ExtractorOutput
        public void m() {
            Format[] arr_format = MediaParserChunkExtractor.this.a.h();
            MediaParserChunkExtractor.this.h = arr_format;
        }

        @Override  // androidx.media3.extractor.ExtractorOutput
        public void r(SeekMap seekMap0) {
        }
    }

    private final OutputConsumerAdapterV30 a;
    private final InputReaderAdapterV30 b;
    private final MediaParser c;
    private final TrackOutputProviderAdapter d;
    private final DiscardingTrackOutput e;
    private long f;
    @Nullable
    private TrackOutputProvider g;
    @Nullable
    private Format[] h;
    private static final String i = "MediaPrsrChunkExtractor";
    public static final Factory j;

    static {
        MediaParserChunkExtractor.j = new d();
    }

    @SuppressLint({"WrongConstant"})
    public MediaParserChunkExtractor(int v, Format format0, List list0, PlayerId playerId0) {
        OutputConsumerAdapterV30 outputConsumerAdapterV300 = new OutputConsumerAdapterV30(format0, v, true);
        this.a = outputConsumerAdapterV300;
        this.b = new InputReaderAdapterV30();
        String s = MimeTypes.s(((String)Assertions.g(format0.m))) ? "android.media.mediaparser.MatroskaParser" : "android.media.mediaparser.FragmentedMp4Parser";
        outputConsumerAdapterV300.p(s);
        MediaParser mediaParser0 = MediaParser.createByName(s, outputConsumerAdapterV300);
        this.c = mediaParser0;
        mediaParser0.setParameter("android.media.mediaparser.matroska.disableCuesSeeking", Boolean.TRUE);
        mediaParser0.setParameter("android.media.mediaparser.inBandCryptoInfo", Boolean.TRUE);
        mediaParser0.setParameter("android.media.mediaparser.includeSupplementalData", Boolean.TRUE);
        mediaParser0.setParameter("android.media.mediaparser.eagerlyExposeTrackType", Boolean.TRUE);
        mediaParser0.setParameter("android.media.mediaparser.exposeDummySeekMap", Boolean.TRUE);
        mediaParser0.setParameter("android.media.mediaParser.exposeChunkIndexAsMediaFormat", Boolean.TRUE);
        mediaParser0.setParameter("android.media.mediaParser.overrideInBandCaptionDeclarations", Boolean.TRUE);
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            arrayList0.add(MediaParserUtil.b(((Format)list0.get(v1))));
        }
        this.c.setParameter("android.media.mediaParser.exposeCaptionFormats", arrayList0);
        if(Util.a >= 0x1F) {
            MediaParserUtil.a(this.c, playerId0);
        }
        this.a.n(list0);
        this.d = new TrackOutputProviderAdapter(this, null);
        this.e = new DiscardingTrackOutput();
        this.f = 0x8000000000000001L;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public boolean a(ExtractorInput extractorInput0) throws IOException {
        this.k();
        long v = extractorInput0.getLength();
        this.b.c(extractorInput0, v);
        return this.c.advance(this.b);
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void c(@Nullable TrackOutputProvider chunkExtractor$TrackOutputProvider0, long v, long v1) {
        this.g = chunkExtractor$TrackOutputProvider0;
        this.a.o(v1);
        this.a.m(this.d);
        this.f = v;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public ChunkIndex d() {
        return this.a.c();
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public Format[] e() {
        return this.h;
    }

    private static ChunkExtractor j(int v, Format format0, boolean z, List list0, TrackOutput trackOutput0, PlayerId playerId0) {
        return !MimeTypes.t(format0.m) ? new MediaParserChunkExtractor(v, format0, list0, playerId0) : null;
    }

    private void k() {
        MediaParser.SeekMap mediaParser$SeekMap0 = this.a.d();
        long v = this.f;
        if(v != 0x8000000000000001L && mediaParser$SeekMap0 != null) {
            MediaParser.SeekPoint mediaParser$SeekPoint0 = m.a(mediaParser$SeekMap0.getSeekPoints(v).first);
            this.c.seek(mediaParser$SeekPoint0);
            this.f = 0x8000000000000001L;
        }
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void release() {
        this.c.release();
    }

    class androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor.1 {
    }

}

