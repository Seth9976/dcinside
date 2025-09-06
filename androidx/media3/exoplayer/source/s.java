package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.analytics.PlayerId;

public final class s implements Factory {
    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaExtractor$Factory
    public final ProgressiveMediaExtractor a(PlayerId playerId0) {
        return MediaParserExtractorAdapter.g(playerId0);
    }
}

