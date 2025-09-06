package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.TrackOutput;
import java.util.List;

public final class d implements Factory {
    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor$Factory
    public Factory a(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
        return this;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor$Factory
    public Factory b(boolean z) {
        return this;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor$Factory
    public Format c(Format format0) {
        return format0;
    }

    @Override  // androidx.media3.exoplayer.source.chunk.ChunkExtractor$Factory
    public final ChunkExtractor d(int v, Format format0, boolean z, List list0, TrackOutput trackOutput0, PlayerId playerId0) {
        return MediaParserChunkExtractor.j(v, format0, z, list0, trackOutput0, playerId0);
    }
}

